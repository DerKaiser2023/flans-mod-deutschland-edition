// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.particle.EntityFX;

public class EntitySmokeShellMustard extends EntityFX
{
    public int disTime;
    public static ResourceLocation icon;
    
    public EntitySmokeShellMustard(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 500;
        this.particleGravity = 1.0f;
        this.motionX = mx * 0.1;
        this.motionY = my;
        this.motionZ = mz * 0.1;
        this.particleScale = 0.0f;
        this.disTime = 10;
        EntitySmokeShellMustard.icon = new ResourceLocation("flansmod", "particle/FMSmoke.png");
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
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/FMSmokeMustard.png"));
        final float scale = 15.0f + this.particleAge * 0.01f;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntitySmokeShellMustard.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntitySmokeShellMustard.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntitySmokeShellMustard.interpPosZ);
        final float colorIntensity = 0.5f;
        par1Tessellator.setColorRGBA_F(this.particleRed * 8.0f * colorIntensity, this.particleGreen * 7.7f * colorIntensity, this.particleBlue * 6.0f * colorIntensity, 1.0f - this.particleAge * this.particleAge * this.particleAge * 8.1E-9f);
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
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.motionY += 1.0E-5;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.isInWater()) {
            this.motionY *= 9.0E-5;
            this.motionY += 1.0E-4;
        }
    }
    
    static {
        EntitySmokeShellMustard.icon = new ResourceLocation("flansmod", "particle/FMSmoke.png");
    }
}
