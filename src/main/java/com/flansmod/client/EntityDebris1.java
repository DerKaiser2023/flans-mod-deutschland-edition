// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.FlansMod;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityFX;

public class EntityDebris1 extends EntityFX
{
    public EntityDebris1(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge *= 5;
        this.particleGravity = 1.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
    }
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.motionY -= 0.04 * this.particleGravity;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.99;
        this.motionY *= 0.99;
        this.motionZ *= 0.99;
        if (this.posY < 0.0) {
            this.setDead();
        }
        for (int NUM = 5, i = 0; i < NUM; ++i) {
            final double dx = (this.posX - this.prevPosX) / NUM;
            final double dy = (this.posY - this.prevPosY) / NUM;
            final double dz = (this.posZ - this.prevPosZ) / NUM;
            if (this.particleAge < 10) {
                FlansMod.proxy.spawnParticle("flame", this.prevPosX + dx * i, this.prevPosY + dy * i, this.prevPosZ + dz * i, 0.0, 0.0, 0.0);
            }
            FlansMod.proxy.spawnParticle("largesmoke", this.prevPosX + dx * i, this.prevPosY + dy * i * 2.0, this.prevPosZ + dz * i, 0.0, 0.0, 0.0);
        }
        if (this.onGround) {
            this.setDead();
        }
    }
}
