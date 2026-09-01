// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.world.World;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.Entity;

public abstract class EntityShootable extends Entity
{
    public EntityDriveable driveable;
    
    public EntityShootable(final World w) {
        super(w);
    }
}
