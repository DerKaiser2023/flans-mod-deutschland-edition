// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.FlansMod;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityExplodeFX;

public class EntityBigSmoke extends EntityExplodeFX
{
    public int disTime;
    
    public EntityBigSmoke(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 300;
        this.particleGravity = 1.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
        this.particleScale = 0.0f;
        this.disTime = 10;
    }
    
    public int getFXLayer() {
        return 1;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public void renderParticle(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
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
        --this.disTime;
        final int NUM = 1;
        if (this.disTime < 0) {
            final double dx = (this.posX - this.prevPosX) / NUM;
            final double dy = (this.posY - this.prevPosY) / NUM;
            final double dz = (this.posZ - this.prevPosZ) / NUM;
            FlansMod.proxy.spawnParticle("flansmod.rocketexhaust", this.prevPosX + dx * 1.0 + 5.0 * Math.random(), this.prevPosY + dy * 1.0 + 7.0 * Math.random(), this.prevPosZ + dz * 1.0 + 5.0 * Math.random(), 0.0, 0.0, 0.0);
            this.disTime = 2;
        }
        else if (this.isInWater()) {
            this.motionY *= 0.89;
            this.motionY += 0.1;
        }
    }
}
