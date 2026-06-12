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
        this.field_77777_bU = 1;
        this.type = type1;
        ((ItemPlane)(this.type.item = this)).func_77637_a((CreativeTabs)FlansMod.tabFlanDriveables);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public boolean func_77651_p() {
        return true;
    }
    
    private NBTTagCompound getTagCompound(final ItemStack stack, final World world) {
        if (stack.field_77990_d == null) {
            if (!world.field_72995_K && stack.func_77960_j() != 0) {
                stack.field_77990_d = this.getOldTagCompound(stack, world);
            }
            if (stack.field_77990_d == null) {
                (stack.field_77990_d = new NBTTagCompound()).func_74778_a("Type", this.type.shortName);
                stack.field_77990_d.func_74778_a("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
            }
        }
        return stack.field_77990_d;
    }
    
    private NBTTagCompound getOldTagCompound(final ItemStack stack, final World world) {
        try {
            final File file1 = world.func_72860_G().func_75758_b("plane_" + stack.func_77960_j());
            if (file1 != null && file1.exists()) {
                try (final FileInputStream fileinputstream = new FileInputStream(file1)) {
                    final NBTTagCompound tags = CompressedStreamTools.func_74796_a((InputStream)fileinputstream).func_74775_l("data");
                    for (final EnumDriveablePart part : EnumDriveablePart.values()) {
                        tags.func_74768_a(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
                        tags.func_74768_a(part.getShortName() + "Crew", (this.type.crew.get(part) == null) ? 0 : this.type.crew.get(part).crew);
                        tags.func_74757_a(part.getShortName() + "_Fire", false);
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
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List lines, final boolean advancedTooltips) {
        if (!this.type.getPaintjob(stack.func_77960_j()).displayName.equals("default")) {
            lines.add("§b§o" + this.type.getPaintjob(stack.func_77960_j()).displayName);
        }
        if (!this.type.packName.isEmpty()) {
            lines.add("§o" + this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        lines.add("");
        final NBTTagCompound tags = this.getTagCompound(stack, player.field_70170_p);
        final PartType engine = PartType.getPart(tags.func_74779_i("Engine"));
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
    
    public ItemStack func_77659_a(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float cosYaw = MathHelper.func_76134_b(-entityplayer.field_70177_z * 0.01745329f - 3.141593f);
        final float sinYaw = MathHelper.func_76126_a(-entityplayer.field_70177_z * 0.01745329f - 3.141593f);
        final float cosPitch = -MathHelper.func_76134_b(-entityplayer.field_70125_A * 0.01745329f);
        final float sinPitch = MathHelper.func_76126_a(-entityplayer.field_70125_A * 0.01745329f);
        final double length = 5.0;
        final Vec3 posVec = Vec3.func_72443_a(entityplayer.field_70165_t, entityplayer.field_70163_u + 1.62 - entityplayer.field_70129_M, entityplayer.field_70161_v);
        final Vec3 lookVec = posVec.func_72441_c(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        final MovingObjectPosition movingobjectposition = world.func_72901_a(posVec, lookVec, this.type.placeableOnWater);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.field_72311_b;
            final int j = movingobjectposition.field_72312_c;
            final int k = movingobjectposition.field_72309_d;
            final Block block = world.func_147439_a(i, j, k);
            final IFaction owner = Factions.getFactionFromPlayer(entityplayer);
            if (this.type.placeableOnLand || block instanceof BlockLiquid) {
                if (!world.field_72995_K) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.func_72838_d(e);
                    }
                }
                if (!entityplayer.field_71075_bZ.field_75098_d) {
                    --itemstack.field_77994_a;
                }
            }
            if (!this.type.placeableOnLand && this.type.placeableOnSponge && block instanceof BlockSponge) {
                if (!world.field_72995_K) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.func_72838_d(e);
                    }
                }
                if (!entityplayer.field_71075_bZ.field_75098_d) {
                    --itemstack.field_77994_a;
                }
            }
            if (!this.type.placeableOnLand && this.type.placeableOnPumpkin && block instanceof BlockPumpkin) {
                if (!world.field_72995_K) {
                    final DriveableData data = this.getPlaneData(itemstack, world);
                    if (data != null) {
                        final Entity e = new EntityPlane(world, i + 0.5, j + 2.5, k + 0.5, entityplayer, this.type, data).setOwner(owner);
                        if (owner != null && this.type.transport) {
                            owner.addTransportVehicle(e, entityplayer.getDisplayName());
                        }
                        world.func_72838_d(e);
                    }
                }
                if (!entityplayer.field_71075_bZ.field_75098_d) {
                    --itemstack.field_77994_a;
                }
            }
        }
        return itemstack;
    }
    
    public Entity spawnPlane(final World world, final double x, final double y, final double z, final ItemStack stack) {
        final DriveableData data = this.getPlaneData(stack, world);
        if (data != null) {
            final Entity entity = new EntityPlane(world, x, y, z, this.type, data);
            if (!world.field_72995_K) {
                world.func_72838_d(entity);
            }
            return entity;
        }
        return null;
    }
    
    public Entity spawnPlaneAngled(final World world, final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final ItemStack stack) {
        final DriveableData data = this.getPlaneData(stack, world);
        if (data != null) {
            final Entity entity = new EntityPlane(world, x, y, z, yaw, pitch, roll, this.type, data);
            if (!world.field_72995_K) {
                world.func_72838_d(entity);
            }
            return entity;
        }
        return null;
    }
    
    public DriveableData getPlaneData(final ItemStack itemstack, final World world) {
        return new DriveableData(this.getTagCompound(itemstack, world), itemstack.func_77960_j());
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.icons = new IIcon[this.type.paintjobs.size()];
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
        for (int i = 0; i < this.type.paintjobs.size(); ++i) {
            this.icons[i] = icon.func_94245_a("FlansMod:" + this.type.paintjobs.get(i).iconName);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon func_77650_f(final ItemStack stack) {
        return this.icons[stack.func_77960_j()];
    }
    
    public void func_150895_a(final Item item, final CreativeTabs tabs, final List list) {
        final ItemStack planeStack = new ItemStack(item, 1, 0);
        final NBTTagCompound tags = new NBTTagCompound();
        tags.func_74778_a("Type", this.type.shortName);
        if (PartType.defaultEngines.containsKey(EnumType.plane)) {
            tags.func_74778_a("Engine", PartType.defaultEngines.get(EnumType.plane).shortName);
        }
        for (final EnumDriveablePart part : EnumDriveablePart.values()) {
            tags.func_74768_a(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
            tags.func_74768_a(part.getShortName() + "_Crew", (this.type.crew.get(part) == null) ? 0 : this.type.crew.get(part).crew);
            tags.func_74757_a(part.getShortName() + "_Fire", false);
        }
        planeStack.field_77990_d = tags;
        list.add(planeStack);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
}
