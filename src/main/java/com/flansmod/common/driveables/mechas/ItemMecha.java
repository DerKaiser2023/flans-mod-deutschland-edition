// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.flansmod.common.driveables.CollisionBox;
import com.flansmod.common.driveables.EnumDriveablePart;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.driveables.DriveableData;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import com.flansmod.common.types.EnumType;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.parts.PartType;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.util.IIcon;
import com.flansmod.common.paintjob.IPaintableItem;
import net.minecraft.item.Item;

public class ItemMecha extends Item implements IPaintableItem
{
    public MechaType type;
    public IIcon[] icons;
    
    public ItemMecha(final MechaType type1) {
        this.maxStackSize = 1;
        this.type = type1;
        ((ItemMecha)(this.type.item = this)).setCreativeTab((CreativeTabs)FlansMod.tabFlanMechas);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        final NBTTagCompound tags = this.getTagCompound(stack, player.worldObj);
        final String engineName = tags.getString("Engine");
        final PartType part = PartType.getPart(engineName);
        if (part != null) {
            lines.add(part.name);
        }
    }
    
    public boolean getShareTag() {
        return true;
    }
    
    private NBTTagCompound getTagCompound(final ItemStack stack, final World world) {
        if (stack.stackTagCompound == null) {
            (stack.stackTagCompound = new NBTTagCompound()).setString("Type", this.type.shortName);
            stack.stackTagCompound.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
        }
        return stack.stackTagCompound;
    }
    
    public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
        final float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329f - 3.141593f);
        final float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329f);
        final float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329f);
        final double length = 5.0;
        final Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62 - entityplayer.yOffset, entityplayer.posZ);
        final Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
        final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(posVec, lookVec, true);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.blockX;
            final int j = movingobjectposition.blockY;
            final int k = movingobjectposition.blockZ;
            if (!world.isRemote) {
                world.spawnEntityInWorld((Entity)new EntityMecha(world, i + 0.5, j + 1.5 + this.type.yOffset, k + 0.5, entityplayer, this.type, this.getData(itemstack, world), this.getTagCompound(itemstack, world)));
            }
            if (!entityplayer.capabilities.isCreativeMode) {
                --itemstack.stackSize;
            }
        }
        return itemstack;
    }
    
    public DriveableData getData(final ItemStack itemstack, final World world) {
        return new DriveableData(this.getTagCompound(itemstack, world), itemstack.getMetadata());
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    public void getSubItems(final Item item, final CreativeTabs tabs, final List list) {
        final ItemStack mechaStack = new ItemStack(item, 1, 0);
        final NBTTagCompound tags = new NBTTagCompound();
        tags.setString("Type", this.type.shortName);
        if (PartType.defaultEngines.containsKey(EnumType.mecha)) {
            tags.setString("Engine", PartType.defaultEngines.get(EnumType.mecha).shortName);
        }
        for (final EnumDriveablePart part : EnumDriveablePart.values()) {
            tags.setInteger(part.getShortName() + "_Health", (this.type.health.get(part) == null) ? 0 : this.type.health.get(part).health);
            tags.setBoolean(part.getShortName() + "_Fire", false);
        }
        mechaStack.stackTagCompound = tags;
        list.add(mechaStack);
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
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public PaintableType GetPaintableType() {
        return this.type;
    }
}
