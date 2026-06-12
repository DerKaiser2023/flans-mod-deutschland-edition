// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

public class PlayerBulletHit extends BulletHit
{
    public PlayerHitbox hitbox;
    
    public PlayerBulletHit(final PlayerHitbox box, final float f) {
        super(f);
        this.hitbox = box;
    }
}
