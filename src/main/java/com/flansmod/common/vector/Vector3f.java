// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.vector;

import java.nio.FloatBuffer;
import net.minecraft.util.Vec3;
import java.io.Serializable;

public class Vector3f extends Vector implements Serializable, ReadableVector3f, WritableVector3f
{
    private static final long serialVersionUID = 1L;
    public float x;
    public float y;
    public float z;
    
    public Vector3f() {
    }
    
    public Vector3f(final String input, final String typeName) {
        final String noBrackets = input.substring(1, input.length() - 1);
        final String[] split = noBrackets.split(",");
        if (split.length == 3) {
            this.x = Float.parseFloat(split[0]);
            this.y = Float.parseFloat(split[1]);
            this.z = Float.parseFloat(split[2]);
        }
    }
    
    public Vector3f(final ReadableVector3f src) {
        this.set(src);
    }
    
    public Vector3f(final float x, final float y, final float z) {
        this.set(x, y, z);
    }
    
    public Vector3f(final Vec3 vec) {
        this((float)vec.xCoord, (float)vec.yCoord, (float)vec.zCoord);
    }
    
    public Vector3f(final double x, final double y, final double z) {
        this((float)x, (float)y, (float)z);
    }
    
    public Vec3 toVec3() {
        return Vec3.createVectorHelper((double)this.x, (double)this.y, (double)this.z);
    }
    
    @Override
    public void set(final float x, final float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void set(final float x, final float y, final float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector3f set(final ReadableVector3f src) {
        this.x = src.getX();
        this.y = src.getY();
        this.z = src.getZ();
        return this;
    }
    
    @Override
    public float lengthSquared() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }
    
    public Vector3f translate(final float x, final float y, final float z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }
    
    public static Vector3f add(final Vector3f left, final Vector3f right, final Vector3f dest) {
        if (dest == null) {
            return new Vector3f(left.x + right.x, left.y + right.y, left.z + right.z);
        }
        dest.set(left.x + right.x, left.y + right.y, left.z + right.z);
        return dest;
    }
    
    public static Vector3f sub(final Vector3f left, final Vector3f right, final Vector3f dest) {
        if (dest == null) {
            return new Vector3f(left.x - right.x, left.y - right.y, left.z - right.z);
        }
        dest.set(left.x - right.x, left.y - right.y, left.z - right.z);
        return dest;
    }
    
    public static Vector3f cross(final Vector3f left, final Vector3f right, Vector3f dest) {
        if (dest == null) {
            dest = new Vector3f();
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
    
    public Vector3f negate(Vector3f dest) {
        if (dest == null) {
            dest = new Vector3f();
        }
        dest.x = -this.x;
        dest.y = -this.y;
        dest.z = -this.z;
        return dest;
    }
    
    public Vector3f normalise(Vector3f dest) {
        final float l = this.length();
        if (dest == null) {
            dest = new Vector3f(this.x / l, this.y / l, this.z / l);
        }
        else {
            dest.set(this.x / l, this.y / l, this.z / l);
        }
        return dest;
    }
    
    public static float dot(final Vector3f left, final Vector3f right) {
        return left.x * right.x + left.y * right.y + left.z * right.z;
    }
    
    public static float angle(final Vector3f a, final Vector3f b) {
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
        this.x = buf.get();
        this.y = buf.get();
        this.z = buf.get();
        return this;
    }
    
    @Override
    public Vector scale(final float scale) {
        this.x *= scale;
        this.y *= scale;
        this.z *= scale;
        return this;
    }
    
    @Override
    public Vector store(final FloatBuffer buf) {
        buf.put(this.x);
        buf.put(this.y);
        buf.put(this.z);
        return this;
    }
    
    @Override
    public String toString() {
        return "Vector3f[" + this.x + ", " + this.y + ", " + this.z + ']';
    }
    
    @Override
    public final float getX() {
        return this.x;
    }
    
    @Override
    public final float getY() {
        return this.y;
    }
    
    @Override
    public final void setX(final float x) {
        this.x = x;
    }
    
    @Override
    public final void setY(final float y) {
        this.y = y;
    }
    
    @Override
    public void setZ(final float z) {
        this.z = z;
    }
    
    @Override
    public float getZ() {
        return this.z;
    }
}
