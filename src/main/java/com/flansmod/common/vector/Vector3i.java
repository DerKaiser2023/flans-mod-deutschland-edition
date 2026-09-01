// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.vector;

import java.nio.FloatBuffer;
import net.minecraft.util.Vec3;

public class Vector3i extends Vector
{
    private static final long serialVersionUID = 1L;
    public int x;
    public int y;
    public int z;
    
    public Vector3i() {
    }
    
    public Vector3i(final int x, final int y, final int z) {
        this.set(x, y, z);
    }
    
    public Vector3i(final Vec3 vec) {
        this((int)vec.xCoord, (int)vec.yCoord, (int)vec.zCoord);
    }
    
    public Vector3i(final double x, final double y, final double z) {
        this((int)x, (int)y, (int)z);
    }
    
    public Vector3i(final Vector3i v) {
        this(v.x, v.y, v.z);
    }
    
    public Vec3 toVec3() {
        return Vec3.createVectorHelper((double)this.x, (double)this.y, (double)this.z);
    }
    
    public void set(final int x, final int y, final int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public float lengthSquared() {
        return (float)(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    public Vector3i translate(final int x, final int y, final int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }
    
    public static Vector3i add(final Vector3i left, final Vector3i right, final Vector3i dest) {
        if (dest == null) {
            return new Vector3i(left.x + right.x, left.y + right.y, left.z + right.z);
        }
        dest.set(left.x + right.x, left.y + right.y, left.z + right.z);
        return dest;
    }
    
    public static Vector3i sub(final Vector3i left, final Vector3i right, final Vector3i dest) {
        if (dest == null) {
            return new Vector3i(left.x - right.x, left.y - right.y, left.z - right.z);
        }
        dest.set(left.x - right.x, left.y - right.y, left.z - right.z);
        return dest;
    }
    
    public static Vector3i cross(final Vector3i left, final Vector3i right, Vector3i dest) {
        if (dest == null) {
            dest = new Vector3i();
        }
        dest.set(left.y * right.z - left.z * right.y, right.x * left.z - right.z * left.x, left.x * right.y - left.y * right.x);
        return dest;
    }
    
    @Override
    public Vector negate() {
        this.x = -this.x;
        this.y = -this.y;
        this.z = -this.z;
        return this;
    }
    
    public Vector3i negate(Vector3i dest) {
        if (dest == null) {
            dest = new Vector3i();
        }
        dest.x = -this.x;
        dest.y = -this.y;
        dest.z = -this.z;
        return dest;
    }
    
    public Vector3i normalise(Vector3i dest) {
        final float l = this.length();
        if (dest == null) {
            dest = new Vector3i(this.x / l, this.y / l, this.z / l);
        }
        else {
            dest.set((int)(this.x / l), (int)(this.y / l), (int)(this.z / l));
        }
        return dest;
    }
    
    public static float dot(final Vector3i left, final Vector3i right) {
        return (float)(left.x * right.x + left.y * right.y + left.z * right.z);
    }
    
    public static float angle(final Vector3i a, final Vector3i b) {
        float dls = dot(a, b) / (a.length() * b.length());
        if (dls < -1.0f) {
            dls = -1.0f;
        }
        else if (dls > 1.0f) {
            dls = 1.0f;
        }
        return (float)Math.acos(dls);
    }
    
    @Override
    public Vector load(final FloatBuffer buf) {
        this.x = (int)buf.get();
        this.y = (int)buf.get();
        this.z = (int)buf.get();
        return this;
    }
    
    @Override
    public Vector scale(final float scale) {
        this.x *= (int)scale;
        this.y *= (int)scale;
        this.z *= (int)scale;
        return this;
    }
    
    @Override
    public Vector store(final FloatBuffer buf) {
        buf.put((float)this.x);
        buf.put((float)this.y);
        buf.put((float)this.z);
        return this;
    }
    
    @Override
    public String toString() {
        return "Vector3i[" + this.x + ", " + this.y + ", " + this.z + ']';
    }
    
    public final int getX() {
        return this.x;
    }
    
    public final int getY() {
        return this.y;
    }
    
    public final void setX(final int x) {
        this.x = x;
    }
    
    public final void setY(final int y) {
        this.y = y;
    }
    
    public void setZ(final int z) {
        this.z = z;
    }
    
    public int getZ() {
        return this.z;
    }
}
