// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.guns.GunType;

public class Seat
{
    public int x;
    public int y;
    public int z;
    public int id;
    public float minYaw;
    public float maxYaw;
    public float minPitch;
    public float maxPitch;
    public GunType gunType;
    public String gunName;
    public EnumDriveablePart part;
    public int gunnerID;
    public Vector3f rotatedOffset;
    public Vector3f gunOrigin;
    public Vector3f aimingSpeed;
    public boolean legacyAiming;
    public boolean carrier;
    public boolean helipad;
    public boolean hardpoint;
    public boolean invisiblePassenger;
    public boolean parkingSpot;
    public boolean invincible;
    public boolean enterable;
    public boolean canSmallArms;
    public boolean heliGuiSeat;
    public float passengerZoom;
    public boolean yawBeforePitch;
    public boolean traverseSounds;
    public boolean latePitch;
    public String yawSound;
    public int yawSoundLength;
    public String pitchSound;
    public int pitchSoundLength;
    public Vector3f aimingSpeedBackup;
    public int barrels;
    public float barrelSpread;
    public boolean hasHUD;
    public int hudColorR;
    public int hudColorG;
    public int hudColorB;
    public static ArrayList<VehicleType> types;
    
    public Seat(final String[] split) {
        this.minYaw = -360.0f;
        this.maxYaw = 360.0f;
        this.minPitch = -89.0f;
        this.maxPitch = 89.0f;
        this.rotatedOffset = new Vector3f();
        this.gunOrigin = new Vector3f();
        this.aimingSpeed = new Vector3f(2.0f, 2.0f, 0.0f);
        this.legacyAiming = false;
        this.carrier = false;
        this.helipad = false;
        this.hardpoint = false;
        this.invisiblePassenger = false;
        this.parkingSpot = false;
        this.invincible = true;
        this.enterable = true;
        this.canSmallArms = false;
        this.heliGuiSeat = false;
        this.passengerZoom = 1.0f;
        this.yawBeforePitch = false;
        this.traverseSounds = false;
        this.latePitch = true;
        this.aimingSpeedBackup = new Vector3f(2.0f, 2.0f, 0.0f);
        this.barrels = 1;
        this.barrelSpread = 2.0f;
        this.hasHUD = false;
        this.hudColorR = 0;
        this.hudColorG = 255;
        this.hudColorB = 0;
        this.id = Integer.parseInt(split[1]);
        this.x = Integer.parseInt(split[2]);
        this.y = Integer.parseInt(split[3]);
        this.z = Integer.parseInt(split[4]);
        this.gunOrigin = new Vector3f((float)this.x, (float)this.y, (float)this.z);
        this.part = EnumDriveablePart.getPart(split[5]);
        if (this.id > 0) {
            this.gunType = GunType.getGun("coinMinerVirusTrojan");
            this.gunName = "Crash Preventer";
        }
        if (split.length > 6) {
            this.minYaw = Float.parseFloat(split[6]);
            this.maxYaw = Float.parseFloat(split[7]);
            this.minPitch = Float.parseFloat(split[8]);
            this.maxPitch = Float.parseFloat(split[9]);
            if (split.length > 10) {
                this.gunType = GunType.getGun(split[10]);
                this.gunName = split[11];
            }
            if (split.length <= 10) {
                this.gunType = GunType.getGun("coinMinerVirusTrojan");
                this.gunName = "Crash Preventer";
            }
        }
    }
    
    public Seat(final int dx, final int dy, final int dz) {
        this.minYaw = -360.0f;
        this.maxYaw = 360.0f;
        this.minPitch = -89.0f;
        this.maxPitch = 89.0f;
        this.rotatedOffset = new Vector3f();
        this.gunOrigin = new Vector3f();
        this.aimingSpeed = new Vector3f(2.0f, 2.0f, 0.0f);
        this.legacyAiming = false;
        this.carrier = false;
        this.helipad = false;
        this.hardpoint = false;
        this.invisiblePassenger = false;
        this.parkingSpot = false;
        this.invincible = true;
        this.enterable = true;
        this.canSmallArms = false;
        this.heliGuiSeat = false;
        this.passengerZoom = 1.0f;
        this.yawBeforePitch = false;
        this.traverseSounds = false;
        this.latePitch = true;
        this.aimingSpeedBackup = new Vector3f(2.0f, 2.0f, 0.0f);
        this.barrels = 1;
        this.barrelSpread = 2.0f;
        this.hasHUD = false;
        this.hudColorR = 0;
        this.hudColorG = 255;
        this.hudColorB = 0;
        this.id = 0;
        this.x = dx;
        this.y = dy;
        this.z = dz;
        this.part = EnumDriveablePart.core;
    }
    
    public Seat(final int dx, final int dy, final int dz, final float y1, final float y2, final float p1, final float p2) {
        this.minYaw = -360.0f;
        this.maxYaw = 360.0f;
        this.minPitch = -89.0f;
        this.maxPitch = 89.0f;
        this.rotatedOffset = new Vector3f();
        this.gunOrigin = new Vector3f();
        this.aimingSpeed = new Vector3f(2.0f, 2.0f, 0.0f);
        this.legacyAiming = false;
        this.carrier = false;
        this.helipad = false;
        this.hardpoint = false;
        this.invisiblePassenger = false;
        this.parkingSpot = false;
        this.invincible = true;
        this.enterable = true;
        this.canSmallArms = false;
        this.heliGuiSeat = false;
        this.passengerZoom = 1.0f;
        this.yawBeforePitch = false;
        this.traverseSounds = false;
        this.latePitch = true;
        this.aimingSpeedBackup = new Vector3f(2.0f, 2.0f, 0.0f);
        this.barrels = 1;
        this.barrelSpread = 2.0f;
        this.hasHUD = false;
        this.hudColorR = 0;
        this.hudColorG = 255;
        this.hudColorB = 0;
        this.id = 0;
        this.x = dx;
        this.y = dy;
        this.z = dz;
        this.part = EnumDriveablePart.core;
        this.minYaw = y1;
        this.maxYaw = y2;
        this.minPitch = p1;
        this.maxPitch = p2;
    }
    
    static {
        Seat.types = new ArrayList<VehicleType>();
    }
}
