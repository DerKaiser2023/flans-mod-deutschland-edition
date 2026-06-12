// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

public class Angle3D
{
    public float angleX;
    public float angleY;
    public float angleZ;
    
    public Angle3D(final float x, final float y, final float z) {
        this.angleX = x;
        this.angleY = y;
        this.angleZ = z;
    }
    
    public void addAngles(final float x, final float y, final float z) {
        this.angleX += x;
        this.angleY += y;
        this.angleZ += z;
    }
    
    public void addAngles(final Angle3D angles) {
        this.angleX += angles.angleX;
        this.angleY += angles.angleY;
        this.angleZ += angles.angleZ;
    }
    
    public void multiplyAngles(final float x, final float y, final float z) {
        this.angleX *= x;
        this.angleY *= y;
        this.angleZ *= z;
    }
    
    public void multiplyAngles(final Angle3D angles) {
        this.angleX *= angles.angleX;
        this.angleY *= angles.angleY;
        this.angleZ *= angles.angleZ;
    }
    
    public static Angle3D getCenter(final Angle3D angles1, final Angle3D angles2) {
        final Angle3D angles3 = new Angle3D(0.0f, 0.0f, 0.0f);
        angles3.addAngles(angles1);
        angles3.addAngles(angles2);
        angles3.multiplyAngles(0.5f, 0.5f, 0.5f);
        return angles3;
    }
    
    public Angle3D copy() {
        return new Angle3D(this.angleX, this.angleY, this.angleZ);
    }
}
