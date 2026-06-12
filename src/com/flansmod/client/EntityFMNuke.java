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

public class EntityFMNuke extends EntityFX
{
    public static ResourceLocation icon;
    
    public EntityFMNuke(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.field_70547_e = 400;
        this.field_70546_d = 0;
        this.field_70545_g = -1.0f;
        this.field_70159_w = mx;
        this.field_70181_x = my;
        this.field_70179_y = mz;
        FlansMod.proxy.spawnParticle("flansmod.fmsmoke", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
        EntityFMNuke.icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
    }
    
    public int func_70537_b() {
        return 3;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public int func_70070_b(final float par1) {
        return 15728880;
    }
    
    public void func_70539_a(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        GL11.glPushMatrix();
        par1Tessellator.func_78382_b();
        GL11.glAlphaFunc(516, 0.001f);
        GL11.glEnable(3042);
        final int srcBlend = GL11.glGetInteger(3041);
        final int dstBlend = GL11.glGetInteger(3040);
        GL11.glDepthMask(false);
        FMLClientHandler.instance().getClient().field_71446_o.func_110577_a(new ResourceLocation("flansmod", "particle/FMFlame.png"));
        final float scale = 40.6f - this.field_70546_d * 15.0f;
        final float xPos = (float)(this.field_70169_q + (this.field_70165_t - this.field_70169_q) * par2 - EntityFMNuke.field_70556_an);
        final float yPos = (float)(this.field_70167_r + (this.field_70163_u - this.field_70167_r) * par2 - EntityFMNuke.field_70554_ao);
        final float zPos = (float)(this.field_70166_s + (this.field_70161_v - this.field_70166_s) * par2 - EntityFMNuke.field_70555_ap);
        final float colorIntensity = 1.0f;
        par1Tessellator.func_78369_a(this.field_70552_h * colorIntensity, this.field_70553_i * (colorIntensity - this.field_70546_d * 0.05f), this.field_70551_j * (colorIntensity - this.field_70546_d * 0.05f), 1.0f - this.field_70546_d * 0.005f);
        par1Tessellator.func_78374_a((double)(xPos - par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos - par5 * scale - par7 * scale), 0.0, 1.0);
        par1Tessellator.func_78374_a((double)(xPos - par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos - par5 * scale + par7 * scale), 1.0, 1.0);
        par1Tessellator.func_78374_a((double)(xPos + par3 * scale + par6 * scale), (double)(yPos + par4 * scale), (double)(zPos + par5 * scale + par7 * scale), 1.0, 0.0);
        par1Tessellator.func_78374_a((double)(xPos + par3 * scale - par6 * scale), (double)(yPos - par4 * scale), (double)(zPos + par5 * scale - par7 * scale), 0.0, 0.0);
        par1Tessellator.func_78381_a();
        GL11.glDisable(3042);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public void func_70071_h_() {
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
        this.field_70155_l = 2000.0;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_70106_y();
        }
        this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
    }
    
    static {
        EntityFMNuke.icon = new ResourceLocation("flansmod", "particle/FMFlame.png");
    }
}
