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

public class EntityShellCasing extends EntityFX
{
    public static ResourceLocation icon;
    
    public EntityShellCasing(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.particleMaxAge = 100;
        this.particleGravity = 5.0f;
        this.motionX = mx;
        this.motionY = my;
        this.motionZ = mz;
        EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
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
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(EntityShellCasing.icon);
        final float scale = 0.1f;
        final float xPos = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntityShellCasing.interpPosX);
        final float yPos = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntityShellCasing.interpPosY);
        final float zPos = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntityShellCasing.interpPosZ);
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
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 2) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 3) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 4) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 5) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 6) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 7) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 8) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 9) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 10) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 11) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 12) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 13) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 14) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 15) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 16) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 17) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 18) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 19) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 20) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 21) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 22) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 23) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 24) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 25) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 20) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 26) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 27) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 28) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 29) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 30) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 31) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 32) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 33) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 34) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 35) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 36) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 37) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 38) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 39) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 40) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 41) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 42) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 43) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 44) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 45) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 46) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 47) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 48) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 49) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 50) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 51) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 52) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 53) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 54) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 55) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 56) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 57) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 58) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 59) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 60) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 61) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 62) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 63) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 64) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 65) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 66) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 67) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 68) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 69) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 70) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 71) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 72) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 73) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 74) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 75) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 76) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 77) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 78) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 79) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 80) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 81) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 82) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 83) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 84) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 85) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 86) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 87) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 88) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 89) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 90) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 91) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 92) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 93) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 94) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.particleAge == 95) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.particleAge == 96) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.particleAge == 97) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.particleAge == 98) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.particleAge == 99) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.particleAge == 100) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        FMLClientHandler.instance().getClient().renderEngine.bindTexture(EntityShellCasing.icon);
    }
    
    static {
        EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Boom1.png");
    }
}
