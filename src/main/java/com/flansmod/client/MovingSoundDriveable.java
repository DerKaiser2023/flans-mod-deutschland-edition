// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.client.audio.MovingSound;

public class MovingSoundDriveable extends MovingSound
{
    private final EntityDriveable driveable;
    private float field_147669_l;
    
    public MovingSoundDriveable(final ResourceLocation sound, final EntityDriveable driveable) {
        super(sound);
        this.field_147669_l = 0.0f;
        this.driveable = driveable;
        this.repeat = true;
        this.repeatDelay = 0;
    }
    
    public void update() {
        if (this.driveable.isDead) {
            this.donePlaying = true;
        }
        else {
            this.xPosF = (float)this.driveable.posX;
            this.yPosF = (float)this.driveable.posY;
            this.zPosF = (float)this.driveable.posZ;
            final float f = MathHelper.sqrt_double(this.driveable.motionX * this.driveable.motionX + this.driveable.motionZ * this.driveable.motionZ);
            if (f >= 0.01) {
                this.field_147669_l = MathHelper.clamp_float(this.field_147669_l + 0.0025f, 0.0f, 1.0f);
                this.volume = 0.0f + MathHelper.clamp_float(f, 0.0f, 0.5f) * 0.7f;
            }
            else {
                this.field_147669_l = 0.0f;
                this.volume = 0.0f;
            }
        }
    }
}
