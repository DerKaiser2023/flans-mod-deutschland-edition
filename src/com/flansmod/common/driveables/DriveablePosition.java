// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class DriveablePosition
{
    public Vector3f position;
    public EnumDriveablePart part;
    
    public DriveablePosition(final Vector3f v, final EnumDriveablePart p) {
        this.position = v;
        this.part = p;
    }
    
    public DriveablePosition(final String[] split) {
        this(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.getPart(split[4]));
    }
}
