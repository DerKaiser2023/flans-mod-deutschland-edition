// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import net.minecraft.util.MovingObjectPosition;

public class BlockHit extends BulletHit
{
    public MovingObjectPosition raytraceResult;
    
    public BlockHit(final MovingObjectPosition mop, final float f) {
        super(f);
        this.raytraceResult = mop;
    }
}
