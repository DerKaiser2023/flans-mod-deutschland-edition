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
    public static MovingObjectPosition rayTraceBlocks(final World w, final Vec3 p_147447_1_, final Vec3 p_147447_2_, final boolean p_147447_3_, final boolean p_147447_4_, final boolean p_147447_5_) {
        if (Double.isNaN(p_147447_1_.xCoord) || Double.isNaN(p_147447_1_.yCoord) || Double.isNaN(p_147447_1_.zCoord)) {
            return null;
        }
        if (!Double.isNaN(p_147447_2_.xCoord) && !Double.isNaN(p_147447_2_.yCoord) && !Double.isNaN(p_147447_2_.zCoord)) {
            final int i = MathHelper.floor_double(p_147447_2_.xCoord);
            final int j = MathHelper.floor_double(p_147447_2_.yCoord);
            final int k = MathHelper.floor_double(p_147447_2_.zCoord);
            int l = MathHelper.floor_double(p_147447_1_.xCoord);
            int i2 = MathHelper.floor_double(p_147447_1_.yCoord);
            int j2 = MathHelper.floor_double(p_147447_1_.zCoord);
            final Block block = w.getBlock(l, i2, j2);
            int k2 = w.getBlockMetadata(l, i2, j2);
            boolean doWeIgnoreThisBlock = false;
            if (block instanceof BlockLeaves || block instanceof BlockGlass || block instanceof BlockStainedGlass || block instanceof BlockStainedGlassPane || block instanceof BlockPane) {
                doWeIgnoreThisBlock = true;
            }
            if (!doWeIgnoreThisBlock && (!p_147447_4_ || block.getCollisionBoundingBoxFromPool(w, l, i2, j2) != null) && block.canStopRayTrace(k2, p_147447_3_)) {
                final MovingObjectPosition movingobjectposition = block.collisionRayTrace(w, l, i2, j2, p_147447_1_, p_147447_2_);
                if (movingobjectposition != null) {
                    return movingobjectposition;
                }
            }
            MovingObjectPosition movingobjectposition2 = null;
            k2 = 200;
            while (k2-- >= 0) {
                if (Double.isNaN(p_147447_1_.xCoord) || Double.isNaN(p_147447_1_.yCoord) || Double.isNaN(p_147447_1_.zCoord)) {
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
                final double d7 = p_147447_2_.xCoord - p_147447_1_.xCoord;
                final double d8 = p_147447_2_.yCoord - p_147447_1_.yCoord;
                final double d9 = p_147447_2_.zCoord - p_147447_1_.zCoord;
                if (flag6) {
                    d4 = (d0 - p_147447_1_.xCoord) / d7;
                }
                if (flag7) {
                    d5 = (d2 - p_147447_1_.yCoord) / d8;
                }
                if (flag8) {
                    d6 = (d3 - p_147447_1_.zCoord) / d9;
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
                    p_147447_1_.xCoord = d0;
                    p_147447_1_.yCoord += d8 * d4;
                    p_147447_1_.zCoord += d9 * d4;
                }
                else if (d5 < d6) {
                    if (j > i2) {
                        b0 = 0;
                    }
                    else {
                        b0 = 1;
                    }
                    p_147447_1_.xCoord += d7 * d5;
                    p_147447_1_.yCoord = d2;
                    p_147447_1_.zCoord += d9 * d5;
                }
                else {
                    if (k > j2) {
                        b0 = 2;
                    }
                    else {
                        b0 = 3;
                    }
                    p_147447_1_.xCoord += d7 * d6;
                    p_147447_1_.yCoord += d8 * d6;
                    p_147447_1_.zCoord = d3;
                }
                final Vec3 createVectorHelper;
                final Vec3 vec32 = createVectorHelper = Vec3.createVectorHelper(p_147447_1_.xCoord, p_147447_1_.yCoord, p_147447_1_.zCoord);
                final double xCoord = MathHelper.floor_double(p_147447_1_.xCoord);
                createVectorHelper.xCoord = xCoord;
                l = (int)xCoord;
                if (b0 == 5) {
                    --l;
                    final Vec3 vec33 = vec32;
                    ++vec33.xCoord;
                }
                final Vec3 vec34 = vec32;
                final double yCoord = MathHelper.floor_double(p_147447_1_.yCoord);
                vec34.yCoord = yCoord;
                i2 = (int)yCoord;
                if (b0 == 1) {
                    --i2;
                    final Vec3 vec35 = vec32;
                    ++vec35.yCoord;
                }
                final Vec3 vec36 = vec32;
                final double zCoord = MathHelper.floor_double(p_147447_1_.zCoord);
                vec36.zCoord = zCoord;
                j2 = (int)zCoord;
                if (b0 == 3) {
                    --j2;
                    final Vec3 vec37 = vec32;
                    ++vec37.zCoord;
                }
                final Block block2 = w.getBlock(l, i2, j2);
                final int l2 = w.getBlockMetadata(l, i2, j2);
                doWeIgnoreThisBlock = false;
                if (block2 instanceof BlockLeaves || block2 instanceof BlockGlass || block2 instanceof BlockStainedGlass || block2 instanceof BlockStainedGlassPane || block2 instanceof BlockPane) {
                    doWeIgnoreThisBlock = true;
                }
                if (doWeIgnoreThisBlock || (p_147447_4_ && block2.getCollisionBoundingBoxFromPool(w, l, i2, j2) == null)) {
                    continue;
                }
                if (block2.canStopRayTrace(l2, p_147447_3_)) {
                    final MovingObjectPosition movingobjectposition3 = block2.collisionRayTrace(w, l, i2, j2, p_147447_1_, p_147447_2_);
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
