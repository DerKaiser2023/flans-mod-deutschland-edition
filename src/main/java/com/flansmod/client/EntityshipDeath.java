// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import cpw.mods.fml.client.FMLClientHandler;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import com.flansmod.common.FlansMod;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.particle.EntityFX;

public class EntityshipDeath extends EntityFX
{
    public static ResourceLocation icon;
    
    public EntityshipDeath(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 20;
        this.particleAge = 0;
        this.particleGravity = -1.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
        FlansMod.proxy.spawnParticle("flansmod.fmsmoke", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
        EntityshipDeath.icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
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
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/FMFlame.png"));
        final float scale = 0.1f + this.particleAge * 25.0f - this.particleAge * this.particleAge * 2.0f;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntityshipDeath.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntityshipDeath.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntityshipDeath.interpPosZ);
        final float colorIntensity = 1.0f;
        par1Tessellator.setColorRGBA_F(this.particleRed * colorIntensity, this.particleGreen * (colorIntensity - this.particleAge * 0.005f), this.particleBlue * (colorIntensity - this.particleAge * 0.5f), 1.0f - this.particleAge * this.particleAge * this.particleAge * 0.0025f);
        par1Tessellator.addVertexWithUV((double)(xPos - par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos - par5 * scale - par7 * scale), 0.0, 1.0);
        par1Tessellator.addVertexWithUV((double)(xPos - par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos - par5 * scale + par7 * scale), 1.0, 1.0);
        par1Tessellator.addVertexWithUV((double)(xPos + par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos + par5 * scale + par7 * scale), 1.0, 0.0);
        par1Tessellator.addVertexWithUV((double)(xPos + par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos + par5 * scale - par7 * scale), 0.0, 0.0);
        par1Tessellator.draw();
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.renderDistanceWeight = 2000.0;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
    }
    
    static {
        EntityshipDeath.icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
    }
}
