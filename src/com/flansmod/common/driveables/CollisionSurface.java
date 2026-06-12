// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class CollisionSurface
{
    public Vector3f localisedOrigin;
    public Vector3f u;
    public Vector3f v;
    
    public CollisionSurface(final Vector3f o, final Vector3f u1, final Vector3f v1) {
        this.localisedOrigin = o;
        this.u = u1;
        this.v = v1;
    }
}
