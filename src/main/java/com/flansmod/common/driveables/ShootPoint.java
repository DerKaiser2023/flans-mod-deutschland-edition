// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class ShootPoint
{
    public DriveablePosition rootPos;
    public Vector3f offPos;
    public float convergentAngle;
    public boolean musik;
    
    public ShootPoint(final DriveablePosition driverPos, final Vector3f offsetPos, final Float convergent, final Boolean scrageMusik) {
        this.convergentAngle = 0.0f;
        this.musik = false;
        this.rootPos = driverPos;
        this.offPos = offsetPos;
        this.convergentAngle = convergent;
        this.musik = scrageMusik;
    }
}
