// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.entity.Entity;
import net.minecraft.util.EntityDamageSource;

public class EntityDamageSourceCollision extends EntityDamageSource
{
    public EntityDriveable source;
    
    public EntityDamageSourceCollision(final EntityDriveable driveable) {
        super(driveable.getDriveableType().shortName, (Entity)driveable);
        this.source = driveable;
    }
}
