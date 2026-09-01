// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.vector.Vector3f;
import java.util.Random;
import net.minecraft.client.Minecraft;

public class GunAnimations
{
    public static GunAnimations defaults;
    public Minecraft mc;
    public static Random rand;
    public boolean isGunEmpty;
    public float gunRecoil;
    public float lastGunRecoil;
    public float recoilAmount;
    public float gunSlide;
    public float lastGunSlide;
    public int timeUntilPump;
    public int timeToPumpFor;
    public float pumped;
    public float lastPumped;
    public boolean pumping;
    public int timeUntilCharge;
    public int timeToChargeFor;
    public float charged;
    public float lastCharged;
    public boolean charging;
    public boolean reloading;
    public float reloadAnimationTime;
    public float reloadAnimationProgress;
    public float lastReloadAnimationProgress;
    public float minigunBarrelRotation;
    public float minigunBarrelRotationSpeed;
    public int muzzleFlashTime;
    public int flashInt;
    public int timeUntilCasing;
    public int casingStage;
    public int lastCasingStage;
    public float hammerRotation;
    public float althammerRotation;
    public int timeUntilPullback;
    public float gunPullback;
    public float lastGunPullback;
    public boolean isFired;
    public Vector3f casingRandom;
    public int meleeAnimationProgress;
    public int meleeAnimationLength;
    public int meleeLeftAnimationProgress;
    public int meleeLeftAnimationLength;
    public int meleeRightAnimationProgress;
    public int meleeRightAnimationLength;
    public int meleeDownAnimationProgress;
    public int meleeDownAnimationLength;
    public float reloadAmmoCount;
    public float switchAnimationProgress;
    public float switchAnimationLength;
    public static int lastInventorySlot;
    
    public GunAnimations() {
        this.gunRecoil = 0.0f;
        this.lastGunRecoil = 0.0f;
        this.recoilAmount = 0.33f;
        this.gunSlide = 0.0f;
        this.lastGunSlide = 0.0f;
        this.timeUntilPump = 0;
        this.timeToPumpFor = 0;
        this.pumped = -1.0f;
        this.lastPumped = -1.0f;
        this.pumping = false;
        this.timeUntilCharge = 0;
        this.timeToChargeFor = 0;
        this.charged = -1.0f;
        this.lastCharged = -1.0f;
        this.charging = false;
        this.reloading = false;
        this.reloadAnimationTime = 0.0f;
        this.reloadAnimationProgress = 0.0f;
        this.lastReloadAnimationProgress = 0.0f;
        this.minigunBarrelRotation = 0.0f;
        this.minigunBarrelRotationSpeed = 0.0f;
        this.muzzleFlashTime = 0;
        this.flashInt = 0;
        this.timeUntilCasing = 0;
        this.casingStage = 0;
        this.lastCasingStage = 0;
        this.hammerRotation = 0.0f;
        this.althammerRotation = 0.0f;
        this.timeUntilPullback = 0;
        this.gunPullback = -1.0f;
        this.lastGunPullback = -1.0f;
        this.isFired = false;
        this.casingRandom = new Vector3f(0.0f, 0.0f, 0.0f);
        this.meleeAnimationProgress = 0;
        this.meleeAnimationLength = 0;
        this.meleeLeftAnimationProgress = 0;
        this.meleeLeftAnimationLength = 0;
        this.meleeRightAnimationProgress = 0;
        this.meleeRightAnimationLength = 0;
        this.meleeDownAnimationProgress = 0;
        this.meleeDownAnimationLength = 0;
        this.switchAnimationProgress = 0.0f;
        this.switchAnimationLength = 0.0f;
    }
    
    public void update() {
        this.lastPumped = this.pumped;
        this.lastCharged = this.charged;
        this.lastGunPullback = this.gunPullback;
        this.lastCasingStage = this.casingStage;
        if (this.timeUntilPump > 0) {
            --this.timeUntilPump;
            if (this.timeUntilPump == 0) {
                this.pumping = true;
                final float n = -1.0f;
                this.pumped = n;
                this.lastPumped = n;
            }
        }
        if (this.timeUntilCharge > 0) {
            --this.timeUntilCharge;
            if (this.timeUntilCharge == 0) {
                this.charging = true;
                final float n2 = -1.0f;
                this.charged = n2;
                this.lastCharged = n2;
            }
        }
        if (this.timeUntilPullback > 0) {
            --this.timeUntilPullback;
            if (this.timeUntilPullback == 0) {
                this.isFired = true;
                final float n3 = -1.0f;
                this.gunPullback = n3;
                this.lastGunPullback = n3;
            }
        }
        else {
            this.hammerRotation *= 0.6f;
            this.althammerRotation *= 0.6f;
        }
        if (this.timeUntilCasing > 0) {
            --this.timeUntilCasing;
            if (this.timeUntilCasing == 0) {
                ++this.casingStage;
            }
        }
        else {
            ++this.casingStage;
        }
        if (this.muzzleFlashTime > 0) {
            --this.muzzleFlashTime;
        }
        if (this.pumping) {
            this.pumped += 2.0f / this.timeToPumpFor;
            if (this.pumped >= 0.999f) {
                this.pumping = false;
            }
        }
        if (this.charging) {
            this.charged += 2.0f / this.timeToChargeFor;
            if (this.charged >= 0.999f) {
                this.charging = false;
            }
        }
        if (this.isFired) {
            this.gunPullback += 0.5f;
            if (this.gunPullback >= 0.999f) {
                this.isFired = false;
            }
        }
        this.lastGunRecoil = this.gunRecoil;
        if (this.gunRecoil > 0.0f) {
            this.gunRecoil *= 0.7f;
        }
        this.lastGunSlide = this.gunSlide;
        if (this.isGunEmpty) {
            final float n4 = 0.5f;
            this.gunSlide = n4;
            this.lastGunSlide = n4;
        }
        if (!this.isGunEmpty && this.gunSlide > 0.9) {
            this.gunSlide -= 0.1f;
        }
        else if (this.gunSlide > 0.0f && !this.isGunEmpty) {
            this.gunSlide *= 0.5f;
        }
        this.lastReloadAnimationProgress = this.reloadAnimationProgress;
        if (this.reloading) {
            this.reloadAnimationProgress += 1.0f / this.reloadAnimationTime;
        }
        if (this.reloading && this.reloadAnimationProgress >= 0.9f) {
            this.isGunEmpty = false;
        }
        if (this.reloading && this.reloadAnimationProgress >= 1.0f) {
            this.reloading = false;
        }
        this.minigunBarrelRotation += this.minigunBarrelRotationSpeed;
        this.minigunBarrelRotationSpeed *= 0.9f;
        if (this.meleeAnimationLength > 0) {
            ++this.meleeAnimationProgress;
            if (this.meleeAnimationProgress == this.meleeAnimationLength) {
                final int n5 = 0;
                this.meleeAnimationLength = n5;
                this.meleeAnimationProgress = n5;
            }
        }
        if (this.switchAnimationProgress > 0.0f) {
            ++this.switchAnimationProgress;
            if (this.switchAnimationProgress == this.switchAnimationLength) {
                this.switchAnimationLength = 0.0f;
            }
        }
        if (this.meleeLeftAnimationLength > 0) {
            ++this.meleeLeftAnimationProgress;
            if (this.meleeLeftAnimationProgress == this.meleeLeftAnimationLength) {
                final int n6 = 0;
                this.meleeLeftAnimationLength = n6;
                this.meleeLeftAnimationProgress = n6;
            }
        }
        if (this.meleeRightAnimationLength > 0) {
            ++this.meleeRightAnimationProgress;
            if (this.meleeRightAnimationProgress == this.meleeRightAnimationLength) {
                final int n7 = 0;
                this.meleeRightAnimationLength = n7;
                this.meleeRightAnimationProgress = n7;
            }
        }
        if (this.meleeDownAnimationLength > 0) {
            ++this.meleeDownAnimationProgress;
            if (this.meleeDownAnimationProgress == this.meleeDownAnimationLength) {
                final int n8 = 0;
                this.meleeDownAnimationLength = n8;
                this.meleeDownAnimationProgress = n8;
            }
        }
    }
    
    public void onGunEmpty(final boolean atLastBullet) {
        this.isGunEmpty = atLastBullet;
    }
    
    public void doShoot(final int pumpDelay, final int pumpTime, final int hammerDelay, final float hammerAngle, final float althammerAngle, final int casingDelay) {
        final Random r = new Random();
        final float n = this.gunRecoil + this.recoilAmount;
        this.gunRecoil = n;
        this.lastGunRecoil = n;
        this.minigunBarrelRotationSpeed += 2.0f;
        final float n2 = 1.0f;
        this.gunSlide = n2;
        this.lastGunSlide = n2;
        this.timeUntilPump = pumpDelay;
        this.timeToPumpFor = pumpTime;
        this.timeUntilPullback = hammerDelay;
        this.timeUntilCasing = casingDelay;
        this.hammerRotation = hammerAngle;
        this.althammerRotation = althammerAngle;
        this.muzzleFlashTime = 2;
        final int Low = -1;
        final int High = 3;
        int result = r.nextInt(High - Low) + Low;
        if (result == -1) {
            result = 0;
        }
        if (result == 3) {
            result = 2;
        }
        this.flashInt = result;
        this.casingRandom.x = r.nextFloat() * 2.0f - 1.0f;
        this.casingRandom.y = r.nextFloat() * 2.0f - 1.0f;
        this.casingRandom.z = r.nextFloat() * 2.0f - 1.0f;
        this.casingStage = 0;
    }
    
    public void doReload(final int reloadTime, final int pumpDelay, final int pumpTime, final int chargeDelay, final int chargeTime) {
        this.reloading = true;
        final float n = 0.0f;
        this.reloadAnimationProgress = n;
        this.lastReloadAnimationProgress = n;
        this.reloadAnimationTime = (float)reloadTime;
        this.timeUntilPump = pumpDelay;
        this.timeToPumpFor = pumpTime;
        this.timeUntilCharge = chargeDelay;
        this.timeToChargeFor = chargeTime;
    }
    
    public void doMelee(final int meleeTime) {
        if (this.meleeRightAnimationLength != 0 || this.meleeLeftAnimationLength != 0 || this.meleeDownAnimationLength == 0) {}
        this.meleeAnimationLength = meleeTime;
    }
    
    public void doBayonet(final int meleeTime) {
        if (this.meleeAnimationLength != 0 || this.meleeAnimationLength != 0 || this.meleeAnimationLength == 0) {}
        this.meleeAnimationLength = meleeTime;
    }
    
    public void doMeleeLeft(final int meleeLeftTime) {
        if (this.meleeAnimationLength != 0 || this.meleeRightAnimationLength != 0 || this.meleeDownAnimationLength == 0) {}
        this.meleeLeftAnimationLength = meleeLeftTime;
    }
    
    public void doMeleeRight(final int meleeRightTime) {
        if (this.meleeAnimationLength != 0 || this.meleeLeftAnimationLength != 0 || this.meleeDownAnimationLength == 0) {}
        this.meleeRightAnimationLength = meleeRightTime;
    }
    
    public void doMeleeDown(final int meleeDownTime) {
        if (this.meleeAnimationLength != 0 || this.meleeLeftAnimationLength != 0 || this.meleeRightAnimationLength == 0) {}
        this.meleeDownAnimationLength = meleeDownTime;
    }
    
    static {
        GunAnimations.defaults = new GunAnimations();
        GunAnimations.rand = new Random();
        GunAnimations.lastInventorySlot = -1;
    }
}
