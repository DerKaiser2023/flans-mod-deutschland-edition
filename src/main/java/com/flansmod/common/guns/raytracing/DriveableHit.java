// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EntityDriveable;

public class DriveableHit extends BulletHit
{
    public EntityDriveable driveable;
    public EnumDriveablePart part;
    
    public DriveableHit(final EntityDriveable d, final EnumDriveablePart p, final float f) {
        super(f);
        this.part = p;
        this.driveable = d;
    }
}
