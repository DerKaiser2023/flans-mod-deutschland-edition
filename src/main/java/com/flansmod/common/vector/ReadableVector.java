// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.vector;

import java.nio.FloatBuffer;

public interface ReadableVector
{
    float length();
    
    float lengthSquared();
    
    Vector store(final FloatBuffer p0);
}
