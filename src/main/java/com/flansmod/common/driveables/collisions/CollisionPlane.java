// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.collisions;

import com.flansmod.common.vector.Vector3f;

public class CollisionPlane
{
    public float[] equation;
    public Vector3f normal;
    public Vector3f origin;
    
    public CollisionPlane(final Vector3f origin, final Vector3f normal) {
        this.origin = origin;
        this.normal = normal;
        (this.equation = new float[4])[0] = normal.x;
        this.equation[1] = normal.y;
        this.equation[2] = normal.z;
        this.equation[3] = -(normal.x * origin.x + normal.y * origin.y + normal.z * origin.z);
    }
    
    public CollisionPlane(final Vector3f p1, final Vector3f p2, final Vector3f p3) {
        final Vector3f edge1 = Vector3f.sub(p2, p1, null);
        final Vector3f edge2 = Vector3f.sub(p3, p1, null);
        (this.normal = Vector3f.cross(edge1, edge2, null)).normalise();
        this.origin = p1;
        (this.equation = new float[4])[0] = this.normal.x;
        this.equation[1] = this.normal.y;
        this.equation[2] = this.normal.z;
        this.equation[3] = -(this.normal.x * this.origin.x + this.normal.y * this.origin.y + this.normal.z * this.origin.z);
    }
    
    public boolean isFrontFacingTo(final Vector3f direction) {
        final double dot = Vector3f.dot(this.normal, direction);
        return dot <= 0.0;
    }
    
    public double signedDistanceTo(final Vector3f point) {
        return Vector3f.dot(point, this.normal) + this.equation[3];
    }
}
