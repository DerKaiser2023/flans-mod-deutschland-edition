// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.FlansMod;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityFX;

public class EntityDebris1 extends EntityFX
{
    public EntityDebris1(final World w, final double px, final double py, final double pz, final double mx, final double my, final double mz) {
        super(w, px, py, pz, mx, my, mz);
        this.field_70547_e *= 5;
        this.field_70545_g = 1.0f;
        this.field_70159_w = mx;
        this.field_70181_x = my;
        this.field_70179_y = mz;
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
        if (this.field_70163_u < 0.0) {
            this.func_70106_y();
        }
        for (int NUM = 5, i = 0; i < NUM; ++i) {
            final double dx = (this.field_70165_t - this.field_70169_q) / NUM;
            final double dy = (this.field_70163_u - this.field_70167_r) / NUM;
            final double dz = (this.field_70161_v - this.field_70166_s) / NUM;
            if (this.field_70546_d < 10) {
                FlansMod.proxy.spawnParticle("flame", this.field_70169_q + dx * i, this.field_70167_r + dy * i, this.field_70166_s + dz * i, 0.0, 0.0, 0.0);
            }
            FlansMod.proxy.spawnParticle("largesmoke", this.field_70169_q + dx * i, this.field_70167_r + dy * i * 2.0, this.field_70166_s + dz * i, 0.0, 0.0, 0.0);
        }
        if (this.field_70122_E) {
            this.func_70106_y();
        }
    }
}
