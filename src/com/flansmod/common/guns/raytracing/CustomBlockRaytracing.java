// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class CustomBlockRaytracing
{
    public static MovingObjectPosition func_147447_a(final World w, final Vec3 p_147447_1_, final Vec3 p_147447_2_, final boolean p_147447_3_, final boolean p_147447_4_, final boolean p_147447_5_) {
        if (Double.isNaN(p_147447_1_.field_72450_a) || Double.isNaN(p_147447_1_.field_72448_b) || Double.isNaN(p_147447_1_.field_72449_c)) {
            return null;
        }
        if (!Double.isNaN(p_147447_2_.field_72450_a) && !Double.isNaN(p_147447_2_.field_72448_b) && !Double.isNaN(p_147447_2_.field_72449_c)) {
            final int i = MathHelper.func_76128_c(p_147447_2_.field_72450_a);
            final int j = MathHelper.func_76128_c(p_147447_2_.field_72448_b);
            final int k = MathHelper.func_76128_c(p_147447_2_.field_72449_c);
            int l = MathHelper.func_76128_c(p_147447_1_.field_72450_a);
            int i2 = MathHelper.func_76128_c(p_147447_1_.field_72448_b);
            int j2 = MathHelper.func_76128_c(p_147447_1_.field_72449_c);
            final Block block = w.func_147439_a(l, i2, j2);
            int k2 = w.func_72805_g(l, i2, j2);
            boolean doWeIgnoreThisBlock = false;
            if (block instanceof BlockLeaves || block instanceof BlockGlass || block instanceof BlockStainedGlass || block instanceof BlockStainedGlassPane || block instanceof BlockPane) {
                doWeIgnoreThisBlock = true;
            }
            if (!doWeIgnoreThisBlock && (!p_147447_4_ || block.func_149668_a(w, l, i2, j2) != null) && block.func_149678_a(k2, p_147447_3_)) {
                final MovingObjectPosition movingobjectposition = block.func_149731_a(w, l, i2, j2, p_147447_1_, p_147447_2_);
                if (movingobjectposition != null) {
                    return movingobjectposition;
                }
            }
            MovingObjectPosition movingobjectposition2 = null;
            k2 = 200;
            while (k2-- >= 0) {
                if (Double.isNaN(p_147447_1_.field_72450_a) || Double.isNaN(p_147447_1_.field_72448_b) || Double.isNaN(p_147447_1_.field_72449_c)) {
                    return null;
                }
                if (l == i && i2 == j && j2 == k) {
                    return p_147447_5_ ? movingobjectposition2 : null;
                }
                boolean flag6 = true;
                boolean flag7 = true;
                boolean flag8 = true;
                double d0 = 999.0;
                double d2 = 999.0;
                double d3 = 999.0;
                if (i > l) {
                    d0 = l + 1.0;
                }
                else if (i < l) {
                    d0 = l + 0.0;
                }
                else {
                    flag6 = false;
                }
                if (j > i2) {
                    d2 = i2 + 1.0;
                }
                else if (j < i2) {
                    d2 = i2 + 0.0;
                }
                else {
                    flag7 = false;
                }
                if (k > j2) {
                    d3 = j2 + 1.0;
                }
                else if (k < j2) {
                    d3 = j2 + 0.0;
                }
                else {
                    flag8 = false;
                }
                double d4 = 999.0;
                double d5 = 999.0;
                double d6 = 999.0;
                final double d7 = p_147447_2_.field_72450_a - p_147447_1_.field_72450_a;
                final double d8 = p_147447_2_.field_72448_b - p_147447_1_.field_72448_b;
                final double d9 = p_147447_2_.field_72449_c - p_147447_1_.field_72449_c;
                if (flag6) {
                    d4 = (d0 - p_147447_1_.field_72450_a) / d7;
                }
                if (flag7) {
                    d5 = (d2 - p_147447_1_.field_72448_b) / d8;
                }
                if (flag8) {
                    d6 = (d3 - p_147447_1_.field_72449_c) / d9;
                }
                final boolean flag9 = false;
                byte b0;
                if (d4 < d5 && d4 < d6) {
                    if (i > l) {
                        b0 = 4;
                    }
                    else {
                        b0 = 5;
                    }
                    p_147447_1_.field_72450_a = d0;
                    p_147447_1_.field_72448_b += d8 * d4;
                    p_147447_1_.field_72449_c += d9 * d4;
                }
                else if (d5 < d6) {
                    if (j > i2) {
                        b0 = 0;
                    }
                    else {
                        b0 = 1;
                    }
                    p_147447_1_.field_72450_a += d7 * d5;
                    p_147447_1_.field_72448_b = d2;
                    p_147447_1_.field_72449_c += d9 * d5;
                }
                else {
                    if (k > j2) {
                        b0 = 2;
                    }
                    else {
                        b0 = 3;
                    }
                    p_147447_1_.field_72450_a += d7 * d6;
                    p_147447_1_.field_72448_b += d8 * d6;
                    p_147447_1_.field_72449_c = d3;
                }
                final Vec3 func_72443_a;
                final Vec3 vec32 = func_72443_a = Vec3.func_72443_a(p_147447_1_.field_72450_a, p_147447_1_.field_72448_b, p_147447_1_.field_72449_c);
                final double field_72450_a = MathHelper.func_76128_c(p_147447_1_.field_72450_a);
                func_72443_a.field_72450_a = field_72450_a;
                l = (int)field_72450_a;
                if (b0 == 5) {
                    --l;
                    final Vec3 vec33 = vec32;
                    ++vec33.field_72450_a;
                }
                final Vec3 vec34 = vec32;
                final double field_72448_b = MathHelper.func_76128_c(p_147447_1_.field_72448_b);
                vec34.field_72448_b = field_72448_b;
                i2 = (int)field_72448_b;
                if (b0 == 1) {
                    --i2;
                    final Vec3 vec35 = vec32;
                    ++vec35.field_72448_b;
                }
                final Vec3 vec36 = vec32;
                final double field_72449_c = MathHelper.func_76128_c(p_147447_1_.field_72449_c);
                vec36.field_72449_c = field_72449_c;
                j2 = (int)field_72449_c;
                if (b0 == 3) {
                    --j2;
                    final Vec3 vec37 = vec32;
                    ++vec37.field_72449_c;
                }
                final Block block2 = w.func_147439_a(l, i2, j2);
                final int l2 = w.func_72805_g(l, i2, j2);
                doWeIgnoreThisBlock = false;
                if (block2 instanceof BlockLeaves || block2 instanceof BlockGlass || block2 instanceof BlockStainedGlass || block2 instanceof BlockStainedGlassPane || block2 instanceof BlockPane) {
                    doWeIgnoreThisBlock = true;
                }
                if (doWeIgnoreThisBlock || (p_147447_4_ && block2.func_149668_a(w, l, i2, j2) == null)) {
                    continue;
                }
                if (block2.func_149678_a(l2, p_147447_3_)) {
                    final MovingObjectPosition movingobjectposition3 = block2.func_149731_a(w, l, i2, j2, p_147447_1_, p_147447_2_);
                    if (movingobjectposition3 != null) {
                        return movingobjectposition3;
                    }
                    continue;
                }
                else {
                    movingobjectposition2 = new MovingObjectPosition(l, i2, j2, (int)b0, p_147447_1_, false);
                }
            }
            return p_147447_5_ ? movingobjectposition2 : null;
        }
        return null;
    }
}
