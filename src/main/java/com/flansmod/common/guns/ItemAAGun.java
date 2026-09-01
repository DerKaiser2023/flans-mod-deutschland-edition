// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import com.flansmod.common.types.InfoType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import java.util.ArrayList;
import com.flansmod.common.types.IFlanItem;
import net.minecraft.item.Item;

public class ItemAAGun extends Item implements IFlanItem
{
    public static final ArrayList<String> names;
    @SideOnly(Side.CLIENT)
    private ArrayList<IIcon> icons;
    public AAGunType type;
    
    public ItemAAGun(final AAGunType type1) {
        this.maxStackSize = 1;
        this.type = type1;
        ((ItemAAGun)(this.type.item = this)).setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
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
            if (!world.isRemote && world.isSideSolid(i, j, k, ForgeDirection.UP)) {
                world.spawnEntityInWorld((Entity)new EntityAAGun(world, this.type, i + 0.5, j + 1.0, k + 0.5, entityplayer));
            }
            if (!entityplayer.capabilities.isCreativeMode) {
                --itemstack.stackSize;
            }
        }
        return itemstack;
    }
    
    public Entity spawnAAGun(final World world, final double x, final double y, final double z, final ItemStack stack) {
        final Entity entity = new EntityAAGun(world, this.type, x, y, z, null);
        if (!world.isRemote) {
            world.spawnEntityInWorld(entity);
        }
        return entity;
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    static {
        names = new ArrayList<String>();
    }
}
