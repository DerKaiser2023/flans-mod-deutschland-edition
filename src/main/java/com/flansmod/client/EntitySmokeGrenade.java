// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.FlansMod;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityFX;

public class EntitySmokeGrenade extends EntityFX
{
    public int dischargeTime;
    
    public EntitySmokeGrenade(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge *= 20;
        this.particleGravity = 3.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
        this.dischargeTime = 3;
    }
    
    public int getFXLayer() {
        return 3;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public void renderParticle(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        GL11.glPushMatrix();
        par1Tessellator.startDrawingQuads();
        GL11.glAlphaFunc(516, 0.001f);
        GL11.glEnable(3042);
        final int srcBlend = GL11.glGetInteger(3041);
        final int dstBlend = GL11.glGetInteger(3040);
        GL11.glBlendFunc(1, 771);
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/case.png"));
        final float scale = 0.1f * this.particleScale;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntitySmokeGrenade.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntitySmokeGrenade.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntitySmokeGrenade.interpPosZ);
        final float colorIntensity = 1.0f;
        par1Tessellator.setColorOpaque_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity);
        par1Tessellator.addVertexWithUV((double)(xPos - par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos - par5 * scale - par7 * scale), 0.0, 1.0);
        par1Tessellator.addVertexWithUV((double)(xPos - par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos - par5 * scale + par7 * scale), 1.0, 1.0);
        par1Tessellator.addVertexWithUV((double)(xPos + par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos + par5 * scale + par7 * scale), 1.0, 0.0);
        par1Tessellator.addVertexWithUV((double)(xPos + par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos + par5 * scale - par7 * scale), 0.0, 0.0);
        par1Tessellator.draw();
        GL11.glBlendFunc(srcBlend, dstBlend);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public AxisAlignedBB getBoundingBox() {
        this.boundingBox.expand(1.0, 1.0, 1.0);
        return this.boundingBox;
    }
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.motionY -= 0.08 * this.particleGravity;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 1.29;
        this.motionY *= 1.29;
        this.motionZ *= 1.29;
        if (this.worldObj.isAnyLiquid(this.boundingBox)) {
            this.motionY = 1.0;
        }
        --this.dischargeTime;
        if (this.dischargeTime < 0) {
            final double dx = this.posX - this.prevPosX;
            final double dy = this.posY - this.prevPosY;
            final double dz = this.posZ - this.prevPosZ;
            FlansMod.proxy.spawnParticle("flansmod.smokeburst", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
            FlansMod.proxy.spawnParticle("flansmod.bigsmoke", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
            this.setDead();
        }
        for (int NUM = 5, i = 0; i < NUM; ++i) {
            final double dx2 = (this.posX - this.prevPosX) / NUM;
            final double dy2 = (this.posY - this.prevPosY) / NUM;
            final double dz2 = (this.posZ - this.prevPosZ) / NUM;
            FlansMod.proxy.spawnParticle("explode", this.prevPosX + dx2 * i, this.prevPosY + dy2 * i, this.prevPosZ + dz2 * i, 0.0, 0.0, 0.0);
        }
        if (this.onGround) {
            this.setDead();
        }
    }
}
