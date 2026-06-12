// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.FlansMod;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityExplodeFX;

public class EntityBigSmoke extends EntityExplodeFX
{
    public int disTime;
    
    public EntityBigSmoke(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.field_70547_e = 300;
        this.field_70545_g = 1.0f;
        this.field_70159_w = mx;
        this.field_70181_x = my;
        this.field_70179_y = mz;
        this.field_70544_f = 0.0f;
        this.disTime = 10;
    }
    
    public int func_70537_b() {
        return 1;
    }
    
    public float getEntityBrightness(final float f) {
        return 1.0f;
    }
    
    public void func_70539_a(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
    }
    
    public void func_70071_h_() {
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
        if (this.field_70546_d++ >= this.field_70547_e) {
            this.func_70106_y();
        }
        this.field_70181_x -= 0.04 * this.field_70545_g;
        this.func_70091_d(this.field_70159_w, this.field_70181_x, this.field_70179_y);
        this.field_70159_w *= 0.99;
        this.field_70181_x *= 0.99;
        this.field_70179_y *= 0.99;
        --this.disTime;
        final int NUM = 1;
        if (this.disTime < 0) {
            final double dx = (this.field_70165_t - this.field_70169_q) / NUM;
            final double dy = (this.field_70163_u - this.field_70167_r) / NUM;
            final double dz = (this.field_70161_v - this.field_70166_s) / NUM;
            FlansMod.proxy.spawnParticle("flansmod.rocketexhaust", this.field_70169_q + dx * 1.0 + 5.0 * Math.random(), this.field_70167_r + dy * 1.0 + 7.0 * Math.random(), this.field_70166_s + dz * 1.0 + 5.0 * Math.random(), 0.0, 0.0, 0.0);
            this.disTime = 2;
        }
        else if (this.func_70090_H()) {
            this.field_70181_x *= 0.89;
            this.field_70181_x += 0.1;
        }
    }
}
