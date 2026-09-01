// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.guns.GunType;

public class PilotGun extends DriveablePosition
{
    public GunType type;
    
    public PilotGun(final String[] split) {
        super(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.getPart(split[4]));
        this.type = GunType.getGun(split[5]);
    }
}
