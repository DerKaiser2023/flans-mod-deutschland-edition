// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
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

public class ItemFlagpole extends Item
{
    public ItemFlagpole() {
        this.func_77637_a((CreativeTabs)FlansMod.tabFlanTeams);
    }
    
    public ItemStack func_77659_a(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        final float f = 1.0f;
        final float f2 = entityplayer.field_70127_C + (entityplayer.field_70125_A - entityplayer.field_70127_C) * f;
        final float f3 = entityplayer.field_70126_B + (entityplayer.field_70177_z - entityplayer.field_70126_B) * f;
        final double d = entityplayer.field_70169_q + (entityplayer.field_70165_t - entityplayer.field_70169_q) * f;
        final double d2 = entityplayer.field_70167_r + (entityplayer.field_70163_u - entityplayer.field_70167_r) * f + 1.62 - entityplayer.field_70129_M;
        final double d3 = entityplayer.field_70166_s + (entityplayer.field_70161_v - entityplayer.field_70166_s) * f;
        final Vec3 vec3d = Vec3.func_72443_a(d, d2, d3);
        final float f4 = MathHelper.func_76134_b(-f3 * 0.01745329f - 3.141593f);
        final float f5 = MathHelper.func_76126_a(-f3 * 0.01745329f - 3.141593f);
        final float f6 = -MathHelper.func_76134_b(-f2 * 0.01745329f);
        final float f7 = MathHelper.func_76126_a(-f2 * 0.01745329f);
        final float f8 = f5 * f6;
        final float f9 = f7;
        final float f10 = f4 * f6;
        final double d4 = 5.0;
        final Vec3 vec3d2 = vec3d.func_72441_c(f8 * d4, f9 * d4, f10 * d4);
        final MovingObjectPosition movingobjectposition = world.func_72901_a(vec3d, vec3d2, true);
        if (movingobjectposition == null) {
            return itemstack;
        }
        if (movingobjectposition.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
            final int i = movingobjectposition.field_72311_b;
            int j = movingobjectposition.field_72312_c;
            final int k = movingobjectposition.field_72309_d;
            if (!world.field_72995_K) {
                if (world.func_147439_a(i, j, k) == Blocks.field_150433_aE) {
                    --j;
                }
                if (isSolid(world, i, j, k)) {
                    world.func_72838_d((Entity)new EntityFlagpole(world, i, j + 1, k));
                }
            }
        }
        return itemstack;
    }
    
    private static boolean isSolid(final World world, final int i, final int j, final int k) {
        final Block block = world.func_147439_a(i, j, k);
        return block != null && block.func_149688_o().func_76220_a() && block.func_149662_c();
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:flagpole");
    }
}
