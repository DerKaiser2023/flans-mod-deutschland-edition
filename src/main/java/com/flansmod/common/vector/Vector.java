// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.vector;

import java.nio.FloatBuffer;
import java.io.Serializable;

public abstract class Vector implements Serializable, ReadableVector
{
    protected Vector() {
    }
    
    @Override
    public final float length() {
        return (float)Math.sqrt(this.lengthSquared());
    }
    
    @Override
    public abstract float lengthSquared();
    
    public abstract Vector load(final FloatBuffer p0);
    
    public abstract Vector negate();
    
    public final Vector normalise() {
        final float len = this.length();
        if (len != 0.0f) {
            final float l = 1.0f / len;
            return this.scale(l);
        }
        return this.scale(0.0f);
    }
    
    @Override
    public abstract Vector store(final FloatBuffer p0);
    
    public abstract Vector scale(final float p0);
}
