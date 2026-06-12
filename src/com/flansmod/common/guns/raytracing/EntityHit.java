// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import net.minecraft.entity.Entity;

public class EntityHit extends BulletHit
{
    public Entity entity;
    
    public EntityHit(final Entity e, final float f) {
        super(f);
        this.entity = e;
    }
}
