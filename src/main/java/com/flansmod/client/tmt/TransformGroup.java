// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.Vec3;

public abstract class TransformGroup
{
    public abstract double getWeight();
    
    public abstract Vec3 doTransformation(final PositionTransformVertex p0);
}
