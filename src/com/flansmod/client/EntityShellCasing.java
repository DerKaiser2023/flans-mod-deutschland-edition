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
        this.field_70547_e = 100;
        this.field_70545_g = 5.0f;
        this.field_70159_w = mx;
        this.field_70181_x = my;
        this.field_70179_y = mz;
        EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
    }
    
    public int func_70537_b() {
        return 3;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public void func_70539_a(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        GL11.glPushMatrix();
        par1Tessellator.func_78382_b();
        GL11.glAlphaFunc(516, 0.001f);
        GL11.glEnable(3042);
        final int srcBlend = GL11.glGetInteger(3041);
        final int dstBlend = GL11.glGetInteger(3040);
        GL11.glBlendFunc(1, 771);
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().field_71446_o.func_110577_a(EntityShellCasing.icon);
        final float scale = 0.1f;
        final float xPos = (float)(this.field_70169_q + (this.field_70165_t - this.field_70169_q) * par2 - EntityShellCasing.field_70556_an);
        final float yPos = (float)(this.field_70167_r + (this.field_70163_u - this.field_70167_r) * par2 - EntityShellCasing.field_70554_ao);
        final float zPos = (float)(this.field_70166_s + (this.field_70161_v - this.field_70166_s) * par2 - EntityShellCasing.field_70555_ap);
        final float colorIntensity = 1.0f;
        par1Tessellator.func_78386_a(this.field_70552_h * colorIntensity, this.field_70553_i * colorIntensity, this.field_70551_j * colorIntensity);
        par1Tessellator.func_78374_a((double)(xPos - par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos - par5 * scale - par7 * scale), 0.0, 1.0);
        par1Tessellator.func_78374_a((double)(xPos - par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos - par5 * scale + par7 * scale), 1.0, 1.0);
        par1Tessellator.func_78374_a((double)(xPos + par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos + par5 * scale + par7 * scale), 1.0, 0.0);
        par1Tessellator.func_78374_a((double)(xPos + par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos + par5 * scale - par7 * scale), 0.0, 0.0);
        par1Tessellator.func_78381_a();
        GL11.glBlendFunc(srcBlend, dstBlend);
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public void func_70071_h_() {
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_70106_y();
        }
        if (this.field_70122_E) {
            this.func_70106_y();
        }
        if (this.field_70546_d == 1) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 2) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 3) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 4) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 5) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 6) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 7) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 8) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 9) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 10) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 11) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 12) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 13) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 14) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 15) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 16) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 17) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 18) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 19) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 20) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 21) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 22) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 23) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 24) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 25) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 20) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 26) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 27) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 28) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 29) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 30) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 31) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 32) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 33) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 34) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 35) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 36) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 37) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 38) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 39) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 40) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 41) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 42) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 43) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 44) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 45) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 46) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 47) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 48) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 49) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 50) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 51) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 52) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 53) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 54) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 55) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 56) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 57) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 58) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 59) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 60) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 61) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 62) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 63) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 64) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 65) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 66) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 67) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 68) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 69) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 70) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 71) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 72) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 73) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 74) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 75) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 76) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 77) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 78) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 79) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 80) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 81) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 82) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 83) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 84) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 85) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 86) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 87) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 88) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 89) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 90) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 91) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 92) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 93) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 94) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        if (this.field_70546_d == 95) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing3.png");
        }
        if (this.field_70546_d == 96) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing4.png");
        }
        if (this.field_70546_d == 97) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing5.png");
        }
        if (this.field_70546_d == 98) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing6.png");
        }
        if (this.field_70546_d == 99) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing1.png");
        }
        if (this.field_70546_d == 100) {
            EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Casing2.png");
        }
        FMLClientHandler.instance().getClient().field_71446_o.func_110577_a(EntityShellCasing.icon);
    }
    
    static {
        EntityShellCasing.icon = new ResourceLocation("flansmod", "particle/Boom1.png");
    }
}
