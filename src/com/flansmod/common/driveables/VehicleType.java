// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.model.ModelDriveable;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;

public class VehicleType extends DriveableType
{
    public float WeakspotCookTime;
    public float turnLeftModifier;
    public float boostLimit;
    public float decelModifier;
    public float accelModifier;
    public float brakeModifier;
    public float turnRightModifier;
    public float diveSpeed;
    public float surfaceSpeed;
    public boolean squashMobs;
    public boolean fourWheelDrive;
    public boolean rotateWheels;
    public boolean tank;
    public int vehicleShootDelay;
    public int vehicleShellDelay;
    public boolean hasDoor;
    public boolean canDabOnEntity;
    public boolean airship;
    public float maxAltitude;
    public int seaLevel;
    public Vector3f doorPos1;
    public Vector3f doorPos2;
    public Vector3f doorRot1;
    public Vector3f doorRot2;
    public Vector3f doorRate;
    public Vector3f doorRotRate;
    public Vector3f door2Pos1;
    public Vector3f door2Pos2;
    public Vector3f door2Rot1;
    public Vector3f door2Rot2;
    public Vector3f door2Rate;
    public Vector3f door2RotRate;
    public float animationMultiplier;
    public float driftMultiplier;
    public boolean shootWithOpenDoor;
    public int trackLinkFix;
    public boolean flipLinkFix;
    public String driftSound;
    public int driftSoundLength;
    public ArrayList<SmokePoint> smokers;
    public float Zoom;
    public boolean raceCar;
    public boolean unpunchable;
    public float terrainPenalty;
    public boolean needsTurret;
    public boolean thermalSight;
    public boolean canRepair;
    public boolean shiftSides;
    public boolean marioKart;
    public static ArrayList<VehicleType> types;
    
    public VehicleType(final TypeFile file) {
        super(file);
        this.WeakspotCookTime = 3.0f;
        this.turnLeftModifier = 1.0f;
        this.boostLimit = 3.0f;
        this.decelModifier = 1.0f;
        this.accelModifier = 1.0f;
        this.brakeModifier = 1.0f;
        this.turnRightModifier = 1.0f;
        this.diveSpeed = 1.0f;
        this.surfaceSpeed = 1.0f;
        this.squashMobs = false;
        this.fourWheelDrive = false;
        this.rotateWheels = false;
        this.tank = false;
        this.hasDoor = false;
        this.canDabOnEntity = false;
        this.airship = false;
        this.maxAltitude = 269.0f;
        this.seaLevel = 55;
        this.doorPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2RotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.animationMultiplier = 1.0f;
        this.driftMultiplier = 0.1f;
        this.shootWithOpenDoor = false;
        this.trackLinkFix = 5;
        this.flipLinkFix = false;
        this.driftSound = "";
        this.smokers = new ArrayList<SmokePoint>();
        this.unpunchable = false;
        this.terrainPenalty = 0.5f;
        this.needsTurret = true;
        this.thermalSight = false;
        this.canRepair = true;
        this.shiftSides = false;
        this.marioKart = true;
        VehicleType.types.add(this);
    }
    
    @Override
    public void preRead(final TypeFile file) {
        super.preRead(file);
        this.wheelPositions = new DriveablePosition[4];
    }
    
    @Override
    public void postRead(final TypeFile file) {
        super.postRead(file);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("canRepair")) {
                this.canRepair = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("SquashMobs")) {
                this.squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("nuDrivingModel")) {
                this.marioKart = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("epicShip")) {
                this.epicShip = Boolean.parseBoolean(split[1]);
                this.explosionPush = 0.0f;
                this.overheatLimit = 3000;
                this.overheatPenalty = 100;
                this.coolingBonus = 20;
                this.animationMultiplier = 0.25f;
                this.driftMultiplier = 1.25f;
                this.centralControl = true;
            }
            if (split[0].equals("animationMultiplier")) {
                this.animationMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("driftMultiplier")) {
                this.driftMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("overheatLimit")) {
                this.overheatLimit = Integer.parseInt(split[1]);
            }
            else {
                this.overheatLimit = 500;
            }
            if (split[0].equals("overheatPenalty")) {
                this.overheatPenalty = Integer.parseInt(split[1]);
            }
            else {
                this.overheatPenalty = 100;
            }
            if (split[0].equals("coolingBonus")) {
                this.coolingBonus = Integer.parseInt(split[1]);
            }
            else {
                this.coolingBonus = 4;
            }
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
                if (this.epicShip) {
                    this.turnLeftModifier = 1.75f * Float.parseFloat(split[1]);
                }
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
                if (this.epicShip) {
                    this.turnRightModifier = 1.75f * Float.parseFloat(split[1]);
                }
            }
            if (split[0].equals("maxAltitude")) {
                this.maxAltitude = Float.parseFloat(split[1]);
            }
            if (split[0].equals("seaLevel")) {
                this.seaLevel = Integer.parseInt(split[1]);
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SquashMobs")) {
                this.squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("switchSides")) {
                this.shiftSides = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("FourWheelDrive")) {
                this.fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("Tank") || split[0].equals("TankMode")) {
                this.tank = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("AccelerationSpeed")) {
                this.accelModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("DiveSpeed")) {
                this.diveSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SurfaceSpeed")) {
                this.surfaceSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("BrakeMultiplier")) {
                this.brakeModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("BoostLimit")) {
                this.boostLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("DecelerationSpeed")) {
                this.decelModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("terrainPenalty")) {
                this.terrainPenalty = Float.parseFloat(split[1]);
            }
            if (split[0].equals("WeakspotCookTime")) {
                this.WeakspotCookTime = Float.parseFloat(split[1]);
            }
            if (split[0].equals("unpunchable")) {
                this.unpunchable = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("thermalSight")) {
                this.thermalSight = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("canDabOnEntity")) {
                this.canDabOnEntity = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("HasDoor")) {
                this.hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("ShootWithOpenDoor")) {
                this.shootWithOpenDoor = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("canDive")) {
                this.canDive = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("airship")) {
                this.airship = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("raceCar")) {
                this.raceCar = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("fancyShip")) {
                this.fancyShip = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("RotateWheels")) {
                this.rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("FixTrackLink")) {
                this.trackLinkFix = Integer.parseInt(split[1].toLowerCase());
            }
            if (split[0].equals("FlipLinkFix")) {
                this.flipLinkFix = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("needsTurret")) {
                this.needsTurret = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("DoorPosition1")) {
                this.doorPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorPosition2")) {
                this.doorPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotation1")) {
                this.doorRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotation2")) {
                this.doorRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRate")) {
                this.doorRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("DoorRotRate")) {
                this.doorRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2Position1")) {
                this.door2Pos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2Position2")) {
                this.door2Pos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2Rotation1")) {
                this.door2Rot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2Rotation2")) {
                this.door2Rot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2Rate")) {
                this.door2Rate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("Door2RotRate")) {
                this.door2RotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("ShootDelay")) {
                this.vehicleShootDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ShellDelay")) {
                this.vehicleShellDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ShootSound")) {
                this.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("ShellSound")) {
                this.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("DriftSoundLength")) {
                this.driftSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DriftSound")) {
                this.driftSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equalsIgnoreCase("AddSmokePoint") || split[0].equalsIgnoreCase("AddSmokeDispenser")) {
                final SmokePoint smoke = new SmokePoint();
                smoke.position = new Vector3f(split[1], this.shortName);
                smoke.direction = new Vector3f(split[2], this.shortName);
                smoke.detTime = Integer.parseInt(split[3]);
                smoke.part = split[4];
                this.smokers.add(smoke);
            }
        }
        catch (final Exception ex) {}
    }
    
    public static VehicleType getVehicle(final String find) {
        for (final VehicleType type : VehicleType.types) {
            if (type.shortName.equals(find)) {
                return type;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelVehicle.class);
    }
    
    static {
        VehicleType.types = new ArrayList<VehicleType>();
    }
    
    public class SmokePoint
    {
        public Vector3f position;
        public Vector3f direction;
        public int detTime;
        public String part;
    }
}
