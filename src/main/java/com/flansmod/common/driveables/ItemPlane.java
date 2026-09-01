// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import com.hfr.faction.IFaction;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.block.BlockSponge;
import net.minecraft.block.BlockLiquid;
import com.hfr.faction.Factions;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.parts.PartType;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.util.IIcon;
import com.flansmod.common.paintjob.IPaintableItem;
import net.minecraft.item.Item;

public class ItemPlane extends Item implements IPaintableItem
{
    public PlaneType type;
    public IIcon[] icons;
    
    public ItemPlane(final PlaneType type1) {
        this.maxStackSize = 1;
        this.type = type1;
        ((ItemPlane)(this.type.item = this)).setCreativeTab((CreativeTabs)FlansMod.tabFlanDriveables);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public boolean getShareTag() {
        return true;
    }
    
    private NBTTagCompound getTagCompound(final ItemStack stack, final World world) {
        if (stack.stackTagCompound == null) {
            if (!world.isRemote && stack.getMetadata() != 0) {
                stack.stackTagCompound = this.getOldTagCompound(stack, world);
            }
            if (stack.stackTagCompound == null) {
                (stack.stackTagCompound = new NBTTagCompound()).setString("Type", this.type.shortName);
                stack.stackTagCompound.setString("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
            }
        }
        return stack.stackTagCompound;
    }
    
    private NBTTagCompound getOldTagCompound(final ItemStack stack, final World world) {
        try {
            final File file1 = world.getSaveHandler().getMapFileFromName("plane_" + stack.getMetadata());
            if (file1 != null && file1.exists()) {
                try (final FileInputStream fileinputstream = new FileInputStream(file1)) {
                    final NBTTagCompound tags = CompressedStreamTools.readCompressed((InputStream)fileinputstream).getCompoundTag("data");
                    for (final EnumDriveablePart part : EnumDriveablePart.values()) {
                        tags.setInteger(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
                        tags.setInteger(part.getShortName() + "Crew", (this.type.crew.get(part) == null) ? 0 : this.type.crew.get(part).crew);
                        tags.setBoolean(part.getShortName() + "_Fire", false);
                    }
                    return tags;
                }
            }
        }
        catch (final IOException e) {
            FlansMod.log("Failed to read old vehicle file");
            e.printStackTrace();
        }
        return null;
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List lines, final boolean advancedTooltips) {
        if (!this.type.getPaintjob(stack.getMetadata()).displayName.equals("default")) {
            lines.add("§b§o" + this.type.getPaintjob(stack.getMetadata()).displayName);
        }
        if (!this.type.packName.isEmpty()) {
            lines.add("§o" + this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        lines.add("");
        final NBTTagCompound tags = this.getTagCompound(stack, player.worldObj);
        final PartType engine = PartType.getPart(tags.getString("Engine"));
        if (engine != null) {
            lines.add("§9Engine§7: " + engine.name);
        }
        if (this.type != null) {
            lines.add("§6Mass§6: " + this.type.mass + " kg");
            lines.add("§2Takeoff Speed§2: " + this.type.takeoffSpeed + " mph");
            if (this.type.hasAfterBurner) {
                lines.add("§2Cruise Speed§2: " + this.type.cruiseSpeed + " mph");
            }
            lines.add("§2Maximum Speed§2: " + this.type.maxSpeed + " mph");
        }
    }
    
    public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
        final float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
        final float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329f);
        final float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329f);
        final double length = 5.0;
        final Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62 - entityplayer.yOffset, entityplayer.posZ);
        final Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, this.type.placeableOnWater);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.blockX;
            final int j = movingobjectposition.blockY;
            final int k = movingobjectposition.blockZ;
            final Block block = world.getBlock(i, j, k);
            final IFaction owner = Factions.getFactionFromPlayer(entityplayer);
            if (this.type.placeableOnLand || block instanceof BlockLiquid) {
                if (!world.isRemote) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.spawnEntityInWorld(e);
                    }
                }
                if (!entityplayer.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
            }
            if (!this.type.placeableOnLand && this.type.placeableOnSponge && block instanceof BlockSponge) {
                if (!world.isRemote) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.spawnEntityInWorld(e);
                    }
                }
                if (!entityplayer.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
            }
            if (!this.type.placeableOnLand && this.type.placeableOnPumpkin && block instanceof BlockPumpkin) {
                if (!world.isRemote) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.spawnEntityInWorld(e);
                    }
                }
                if (!entityplayer.capabilities.isCreativeMode) {
                    --itemstack.stackSize;
                }
            }
        }
        return itemstack;
    }
    
    public Entity spawnPlane(final World world, final double x, final double y, final double z, final ItemStack stack) {
        final DriveableData data = this.getPlaneData(stack, world);
        if (data != null) {
            final Entity entity = new EntityPlane(world, x, y, z, this.type, data);
            if (!world.isRemote) {
                world.spawnEntityInWorld(entity);
            }
            return entity;
        }
        return null;
    }
    
    public Entity spawnPlaneAngled(final World world, final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final ItemStack stack) {
        final DriveableData data = this.getPlaneData(stack, world);
        if (data != null) {
            final Entity entity = new EntityPlane(world, x, y, z, yaw, pitch, roll, this.type, data);
            if (!world.isRemote) {
                world.spawnEntityInWorld(entity);
            }
            return entity;
        }
        return null;
    }
    
    public DriveableData getPlaneData(final ItemStack itemstack, final World world) {
        return new DriveableData(this.getTagCompound(itemstack, world), itemstack.getMetadata());
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.icons = new IIcon[this.type.paintjobs.size()];
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
        for (int i = 0; i < this.type.paintjobs.size(); ++i) {
            this.icons[i] = icon.registerIcon("FlansMod:" + this.type.paintjobs.get(i).iconName);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(final ItemStack stack) {
        return this.icons[stack.getMetadata()];
    }
    
    public void getSubItems(final Item item, final CreativeTabs tabs, final List list) {
        final ItemStack planeStack = new ItemStack(item, 1, 0);
        final NBTTagCompound tags = new NBTTagCompound();
        tags.setString("Type", this.type.shortName);
        if (PartType.defaultEngines.containsKey(EnumType.plane)) {
            tags.setString("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
        }
        for (final EnumDriveablePart part : EnumDriveablePart.values()) {
            tags.setInteger(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
            tags.setInteger(part.getShortName() + "_Crew", (this.type.crew.get(part) == null) ? 0 : this.type.crew.get(part).crew);
            tags.setBoolean(part.getShortName() + "_Fire", false);
        }
        planeStack.stackTagCompound = tags;
        list.add(planeStack);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
}
