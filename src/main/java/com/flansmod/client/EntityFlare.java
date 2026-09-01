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

public class EntityFlare extends EntityFX
{
    public float damage;
    
    public EntityFlare(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.damage = 5.0f;
        this.particleMaxAge *= 100;
        this.particleGravity = 1.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
    }
    
    public int getFXLayer() {
        return 3;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public int getBrightnessForRender(final float par1) {
        return 15728880;
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
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/flare.png"));
        final float scale = 0.3f * this.particleScale;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntityFlare.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntityFlare.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntityFlare.interpPosZ);
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
            FlansMod.proxy.spawnParticle("flansmod.fmflame", this.prevPosX + dx * i, this.prevPosY + dy * i, this.prevPosZ + dz * i, 0.0, 0.0, 0.0);
        }
        if (this.onGround) {
            this.setDead();
        }
    }
}
