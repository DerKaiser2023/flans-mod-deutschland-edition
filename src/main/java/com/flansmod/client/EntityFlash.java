// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import cpw.mods.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.particle.EntityFX;

public class EntityFlash extends EntityFX
{
    public static ResourceLocation icon;
    
    public EntityFlash(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 6;
        this.particleGravity = 1.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
        EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom1.png");
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
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(EntityFlash.icon);
        final float scale = 1.0f;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntityFlash.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntityFlash.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntityFlash.interpPosZ);
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
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        if (this.onGround) {
            this.setDead();
        }
        if (this.particleAge == 1) {
            EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom2.png");
        }
        if (this.particleAge == 2) {
            EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom3.png");
        }
        if (this.particleAge == 3) {
            EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom4.png");
        }
        if (this.particleAge == 4) {
            EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom5.png");
        }
        if (this.particleAge == 5) {
            EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom6.png");
        }
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(EntityFlash.icon);
    }
    
    static {
        EntityFlash.icon = new ResourceLocation("flansmod", "particle/Boom1.png");
    }
}
