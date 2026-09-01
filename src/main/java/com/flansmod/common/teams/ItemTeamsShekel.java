// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.item.Item;

public class ItemTeamsShekel extends Item
{
    public ItemTeamsShekel() {
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanTeams);
    }
    
    public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float f = 1.0f;
        final float f2 = entityplayer.prevRotationPitch + (entityplayer.rotationPitch - entityplayer.prevRotationPitch) * f;
        final float f3 = entityplayer.prevRotationYaw + (entityplayer.rotationYaw - entityplayer.prevRotationYaw) * f;
        final double d = entityplayer.prevPosX + (entityplayer.posX - entityplayer.prevPosX) * f;
        final double d2 = entityplayer.prevPosY + (entityplayer.posY - entityplayer.prevPosY) * f + 1.62 - entityplayer.yOffset;
        final double d3 = entityplayer.prevPosZ + (entityplayer.posZ - entityplayer.prevPosZ) * f;
        final Vec3 vec3d = Vec3.createVectorHelper(d, d2, d3);
        final float f4 = MathHelper.cos(-f3 * 0.01745329f - 3.141593f);
        final float f5 = MathHelper.sin(-f3 * 0.01745329f - 3.141593f);
        final float f6 = -MathHelper.cos(-f2 * 0.01745329f);
        final float f7 = MathHelper.sin(-f2 * 0.01745329f);
        final float f8 = f5 * f6;
        final float f9 = f7;
        final float f10 = f4 * f6;
        final double d4 = 5.0;
        final Vec3 vec3d2 = vec3d.addVector(f8 * d4, f9 * d4, f10 * d4);
        final MovingObjectPosition movingobjectposition = world.rayTraceBlocks(vec3d, vec3d2, true);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            final int k = movingobjectposition.blockZ;
            if (!world.isRemote && world.getBlock(i, j, k) == Blocks.snow) {
                --j;
            }
        }
        return itemstack;
    }
    
    private static boolean isSolid(final World world, final int i, final int j, final int k) {
        final Block block = world.getBlock(i, j, k);
        return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:shekel");
    }
}
