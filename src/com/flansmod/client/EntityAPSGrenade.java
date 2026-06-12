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

public class EntityAPSGrenade extends EntityFX
{
    public int dischargeTime;
    
    public EntityAPSGrenade(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.field_70547_e *= 20;
        this.field_70545_g = 3.0f;
        this.field_70159_w = mx;
        this.field_70181_x = my;
        this.field_70179_y = mz;
        this.dischargeTime = 4;
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
        FMLClientHandler.instance().getClient().field_71446_o.func_110577_a(new ResourceLocation("flansmod", "particle/case.png"));
        final float scale = 0.1f * this.field_70544_f;
        final float xPos = (float)(this.field_70169_q + (this.field_70165_t - this.field_70169_q) * par2 - EntityAPSGrenade.field_70556_an);
        final float yPos = (float)(this.field_70167_r + (this.field_70163_u - this.field_70167_r) * par2 - EntityAPSGrenade.field_70554_ao);
        final float zPos = (float)(this.field_70166_s + (this.field_70161_v - this.field_70166_s) * par2 - EntityAPSGrenade.field_70555_ap);
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
    
    public AxisAlignedBB func_70046_E() {
        this.field_70121_D.func_72314_b(1.0, 1.0, 1.0);
        return this.field_70121_D;
    }
    
    public void func_70071_h_() {
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_70106_y();
        }
        this.field_70181_x -= 0.08 * this.field_70545_g;
        this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        this.field_70159_w *= 1.29;
        this.field_70181_x *= 1.29;
        this.field_70179_y *= 1.29;
        if (this.field_70170_p.func_72953_d(this.field_70121_D)) {
            this.field_70181_x = 1.0;
        }
        --this.dischargeTime;
        if (this.dischargeTime < 0) {
            final double dx = this.field_70165_t - this.field_70169_q;
            final double dy = this.field_70163_u - this.field_70167_r;
            final double dz = this.field_70161_v - this.field_70166_s;
            FlansMod.proxy.spawnParticle("flansmod.smokeburst", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
            this.func_70106_y();
        }
        for (int NUM = 5, i = 0; i < NUM; ++i) {
            final double dx2 = (this.field_70165_t - this.field_70169_q) / NUM;
            final double dy2 = (this.field_70163_u - this.field_70167_r) / NUM;
            final double dz2 = (this.field_70161_v - this.field_70166_s) / NUM;
            FlansMod.proxy.spawnParticle("explode", this.field_70169_q + dx2 * i, this.field_70167_r + dy2 * i, this.field_70166_s + dz2 * i, 0.0, 0.0, 0.0);
        }
        if (this.field_70122_E) {
            this.func_70106_y();
        }
    }
}
