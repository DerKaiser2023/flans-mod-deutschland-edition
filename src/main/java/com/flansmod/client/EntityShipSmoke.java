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

public class EntityShipSmoke extends EntityFX
{
    public int disTime;
    public static ResourceLocation icon;
    
    public EntityShipSmoke(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 150;
        this.particleGravity = 1.0f;
        this.motionX = mx * 5.0;
        this.motionY = my * 1.0E-5;
        this.motionZ = mz * 5.0;
        this.particleScale = 0.0f;
        this.disTime = 10;
        EntityShipSmoke.icon = new ResourceLocation("flansmod", "particle/FMSmoke.png");
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
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation("flansmod", "particle/FMSmokeElite.png"));
        final float scale = 1.0f + this.particleAge * 0.1f;
        final float xPos = (float)(this.prevPosX + 0.1 * (this.posX - this.prevPosX) * par2 - EntityShipSmoke.interpPosX);
        final float yPos = (float)(this.prevPosY + this.particleAge * 0.3f / (1.0f + 0.01f * this.particleAge) + 0.1 * (this.posY - this.prevPosY) * par2 - EntityShipSmoke.interpPosY);
        final float zPos = (float)(this.prevPosZ - this.particleAge * 0.01f * (Math.random() - 0.5) + (this.posZ - this.prevPosZ) * par2 - EntityShipSmoke.interpPosZ);
        final float colorIntensity = 0.1f;
        par1Tessellator.setColorRGBA_F(this.particleRed * colorIntensity, this.particleGreen * colorIntensity, this.particleBlue * colorIntensity, 1.0f - this.particleAge * this.particleAge * this.particleAge * 1.0E-6f);
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
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.motionY += 1.0E-9;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.isInWater()) {
            this.motionY *= 9.0E-9;
            this.motionY += 1.0E-8;
        }
    }
    
    static {
        EntityShipSmoke.icon = new ResourceLocation("flansmod", "particle/FMSmoke.png");
    }
}
