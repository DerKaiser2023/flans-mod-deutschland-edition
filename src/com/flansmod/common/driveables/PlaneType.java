// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.model.ModelDriveable;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import net.minecraft.item.ItemStack;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;

public class PlaneType extends DriveableType
{
    public EnumPlaneMode mode;
    public float lookDownModifier;
    public float lookUpModifier;
    public float rollLeftModifier;
    public float rollRightModifier;
    public float turnLeftModifier;
    public float turnRightModifier;
    public float lift;
    public Vector3f bombPosition;
    public int planeShootDelay;
    public int planeBombDelay;
    public float ceiling;
    public float speedLimit;
    public float speedLimitHigh;
    public float speedLimitDry;
    public float speedLimitHighDry;
    public Vector3f wingPos1;
    public Vector3f wingPos2;
    public Vector3f wingRot1;
    public Vector3f wingRot2;
    public Vector3f wingRate;
    public Vector3f wingRotRate;
    public Vector3f wingWheelPos1;
    public Vector3f wingWheelPos2;
    public Vector3f wingWheelRot1;
    public Vector3f wingWheelRot2;
    public Vector3f wingWheelRate;
    public Vector3f wingWheelRotRate;
    public Vector3f bodyWheelPos1;
    public Vector3f bodyWheelPos2;
    public Vector3f bodyWheelRot1;
    public Vector3f bodyWheelRot2;
    public Vector3f bodyWheelRate;
    public Vector3f bodyWheelRotRate;
    public Vector3f tailWheelPos1;
    public Vector3f tailWheelPos2;
    public Vector3f tailWheelRot1;
    public Vector3f tailWheelRot2;
    public Vector3f tailWheelRate;
    public Vector3f tailWheelRotRate;
    public Vector3f doorPos1;
    public Vector3f doorPos2;
    public Vector3f doorRot1;
    public Vector3f doorRot2;
    public Vector3f doorRate;
    public Vector3f doorRotRate;
    public ArrayList<Propeller> propellers;
    public ArrayList<Propeller> heliPropellers;
    public ArrayList<Propeller> heliTailPropellers;
    public boolean hasGear;
    public boolean hasDoor;
    public boolean hasWing;
    public boolean foldWingForLand;
    public boolean flyWithOpenDoor;
    public float restingPitch;
    public boolean spinWithoutTail;
    public boolean valkyrie;
    public boolean carrierLandable;
    public boolean helipadLandable;
    public boolean parasitePlane;
    public float planeDiveFactor;
    public float deathDiveSpeedLimit;
    public float stallSpeedLimit;
    public boolean invInflight;
    public float yawBonus;
    public float pitchBonus;
    public float rollBonus;
    public float yawStall;
    public float pitchStall;
    public float rollStall;
    public float afterBurnFuelPenalty;
    public boolean gunRecoil;
    public boolean swapInitialWing;
    public boolean unpunchable;
    public float noStallAngle;
    public boolean missileVisible;
    public float missileWingSpan;
    public float missileForward;
    public float missileElevation;
    public float afterburnOffBonus;
    public float mass;
    public float area;
    public float cruiseSpeed;
    public float takeoffSpeed;
    public float climbRate;
    public float maxSpeed;
    public float turnTime;
    public float accelBonus;
    public float gravityMultiplier;
    public boolean carrierWingFlip;
    public boolean AfterburnWing;
    public boolean AfterburnWingFlipped;
    public boolean needsGear;
    public float yawBoost;
    public float rollBoost;
    public float pitchBoost;
    public static ArrayList<PlaneType> types;
    
    public PlaneType(final TypeFile file) {
        super(file);
        this.mode = EnumPlaneMode.PLANE;
        this.lookDownModifier = 1.0f;
        this.lookUpModifier = 1.0f;
        this.rollLeftModifier = 1.0f;
        this.rollRightModifier = 1.0f;
        this.turnLeftModifier = 1.0f;
        this.turnRightModifier = 1.0f;
        this.lift = 1.0f;
        this.ceiling = 800.0f;
        this.speedLimit = 2.0f;
        this.speedLimitHigh = 4.0f;
        this.speedLimitDry = 1.0f;
        this.speedLimitHighDry = 1.5f;
        this.wingPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.bodyWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot1 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot2 = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRotRate = new Vector3f(0.0f, 0.0f, 0.0f);
        this.propellers = new ArrayList<Propeller>();
        this.heliPropellers = new ArrayList<Propeller>();
        this.heliTailPropellers = new ArrayList<Propeller>();
        this.hasGear = false;
        this.hasDoor = false;
        this.hasWing = false;
        this.foldWingForLand = false;
        this.flyWithOpenDoor = false;
        this.restingPitch = 0.0f;
        this.spinWithoutTail = false;
        this.valkyrie = false;
        this.carrierLandable = false;
        this.helipadLandable = false;
        this.parasitePlane = false;
        this.planeDiveFactor = 0.5f;
        this.deathDiveSpeedLimit = 1.2f;
        this.stallSpeedLimit = 1.9f;
        this.invInflight = true;
        this.yawBonus = 1.2f;
        this.pitchBonus = 1.2f;
        this.rollBonus = 1.2f;
        this.yawStall = 0.5f;
        this.pitchStall = 0.5f;
        this.rollStall = 0.5f;
        this.afterBurnFuelPenalty = 3.0f;
        this.gunRecoil = true;
        this.swapInitialWing = false;
        this.unpunchable = false;
        this.noStallAngle = 15.0f;
        this.missileVisible = false;
        this.missileWingSpan = 4.0f;
        this.missileForward = -1.0f;
        this.missileElevation = -1.0f;
        this.afterburnOffBonus = 1.5f;
        this.mass = 4000.0f;
        this.area = 22.0f;
        this.cruiseSpeed = 362.0f;
        this.takeoffSpeed = 100.0f;
        this.climbRate = 5.0f;
        this.maxSpeed = 440.0f;
        this.turnTime = 0.0f;
        this.accelBonus = 1.0f;
        this.gravityMultiplier = 1.0f;
        this.carrierWingFlip = false;
        this.AfterburnWing = false;
        this.AfterburnWingFlipped = false;
        this.needsGear = true;
        this.yawBoost = 1.0f;
        this.rollBoost = 1.0f;
        this.pitchBoost = 1.0f;
        PlaneType.types.add(this);
    }
    
    @Override
    public void preRead(final TypeFile file) {
        super.preRead(file);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("Mode")) {
                this.mode = EnumPlaneMode.getMode(split[1]);
            }
            if (split[0].equals("yawBoost")) {
                this.yawBoost = Float.parseFloat(split[1]);
            }
            if (split[0].equals("rollBoost")) {
                this.rollBoost = Float.parseFloat(split[1]);
            }
            if (split[0].equals("pitchBoost")) {
                this.pitchBoost = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("yawBonus")) {
                this.yawBonus = Float.parseFloat(split[1]);
            }
            if (split[0].equals("yawStall")) {
                this.yawStall = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookUpSpeed")) {
                this.lookUpModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LookDownSpeed")) {
                this.lookDownModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("pitchBonus")) {
                this.pitchBonus = Float.parseFloat(split[1]);
            }
            if (split[0].equals("pitchStall")) {
                this.pitchStall = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollLeftSpeed")) {
                this.rollLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RollRightSpeed")) {
                this.rollRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("rollBonus")) {
                this.rollBonus = Float.parseFloat(split[1]);
            }
            if (split[0].equals("rollStall")) {
                this.rollStall = Float.parseFloat(split[1]);
            }
            if (split[0].equals("afterBurnFuelPenalty")) {
                this.afterBurnFuelPenalty = Float.parseFloat(split[1]);
            }
            if (split[0].equals("afterburnOffBonus")) {
                this.afterburnOffBonus = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Lift")) {
                this.lift = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ShootDelay")) {
                this.planeShootDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("BombDelay")) {
                this.planeBombDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("flightCeiling")) {
                this.ceiling = Float.parseFloat(split[1]);
            }
            if (split[0].equals("diveBonus")) {
                this.deathDiveSpeedLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("stallSuffering")) {
                this.stallSpeedLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("maxSpeed")) {
                this.speedLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("accelBonus")) {
                this.accelBonus = Float.parseFloat(split[1]);
            }
            if (split[0].equals("gravityMultiplier")) {
                this.gravityMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("highAltMax")) {
                this.speedLimitHigh = Float.parseFloat(split[1]);
            }
            if (split[0].equals("maxSpeedDry")) {
                this.speedLimitDry = Float.parseFloat(split[1]);
            }
            if (split[0].equals("highAltMaxDry")) {
                this.speedLimitHighDry = Float.parseFloat(split[1]);
            }
            if (split[0].equals("planeDiveFactor")) {
                this.planeDiveFactor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("carrierLandable")) {
                this.carrierLandable = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("helipadLandable")) {
                this.helipadLandable = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("gunRecoil")) {
                this.gunRecoil = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("unpunchable")) {
                this.unpunchable = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("parasitePlane")) {
                this.parasitePlane = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("mass")) {
                this.mass = Float.parseFloat(split[1]);
            }
            if (split[0].equals("area")) {
                this.area = Float.parseFloat(split[1]);
            }
            if (split[0].equals("cruiseSpeed")) {
                this.cruiseSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("takeoffSpeed")) {
                this.takeoffSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("climbRate")) {
                this.climbRate = 0.17f * Float.parseFloat(split[1]);
            }
            if (split[0].equals("maximumSpeed")) {
                this.maxSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("turnTime")) {
                this.turnTime = 0.5f * Float.parseFloat(split[1]);
            }
            if (split[0].equals("swapInitialWing")) {
                this.swapInitialWing = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("missileVisible")) {
                this.missileVisible = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("missileWingSpan")) {
                this.missileWingSpan = Float.parseFloat(split[1]);
            }
            if (split[0].equals("missileForward")) {
                this.missileForward = Float.parseFloat(split[1]);
            }
            if (split[0].equals("missileElevation")) {
                this.missileElevation = Float.parseFloat(split[1]);
            }
            if (split[0].equals("heliSpeedLimit")) {
                this.speedLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Propeller")) {
                final Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.propellers.add(propeller);
                this.driveableRecipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliPropeller")) {
                final Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliPropellers.add(propeller);
                this.driveableRecipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HeliTailPropeller")) {
                final Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
                this.heliTailPropellers.add(propeller);
                this.driveableRecipe.add(new ItemStack(propeller.itemType.item));
            }
            if (split[0].equals("HasFlare")) {
                this.hasFlare = split[1].equals("True");
            }
            if (split[0].equals("FlareDelay")) {
                this.flareDelay = Integer.parseInt(split[1]);
                if (this.flareDelay <= 0) {
                    this.flareDelay = 1;
                }
            }
            if (split[0].equals("TimeFlareUsing")) {
                this.timeFlareUsing = Integer.parseInt(split[1]);
                if (this.timeFlareUsing <= 0) {
                    this.timeFlareUsing = 1;
                }
            }
            if (split[0].equals("PropSoundLength")) {
                this.engineSoundLength = Integer.parseInt(split[1]);
            }
            if (split[0].equals("PropSound")) {
                this.engineSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("ShootSound")) {
                this.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("BombSound")) {
                this.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("StukaSoundLength")) {
                this.stukaSoundLength = Integer.parseInt(split[1]);
            }
            if (split[0].equals("StukaSoundRange")) {
                this.stukaSoundRange = Integer.parseInt(split[1]);
            }
            if (split[0].equals("StukaSpeed")) {
                this.stukaSpeed = Integer.parseInt(split[1]);
            }
            if (split[0].equals("StukaSound")) {
                this.stukaSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("HasGear")) {
                this.hasGear = split[1].equals("True");
            }
            if (split[0].equals("HasDoor")) {
                this.hasDoor = split[1].equals("True");
            }
            if (split[0].equals("HasWing")) {
                this.hasWing = split[1].equals("True");
            }
            if (split[0].equals("FoldWingForLand")) {
                this.foldWingForLand = split[1].equals("True");
            }
            if (split[0].equals("FlyWithOpenDoor")) {
                this.flyWithOpenDoor = split[1].equals("True");
            }
            if (split[0].equals("RestingPitch")) {
                this.restingPitch = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SpinWithoutTail")) {
                this.spinWithoutTail = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Valkyrie")) {
                this.valkyrie = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("AfterburnWing")) {
                this.AfterburnWing = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("AfterburnWingFlipped")) {
                this.AfterburnWingFlipped = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("carrierWingFlip")) {
                this.carrierWingFlip = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("needsGear")) {
                this.needsGear = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("WingPosition1")) {
                this.wingPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingPosition2")) {
                this.wingPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotation1")) {
                this.wingRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotation2")) {
                this.wingRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRate")) {
                this.wingRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingRotRate")) {
                this.wingRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelPosition1")) {
                this.wingWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelPosition2")) {
                this.wingWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotation1")) {
                this.wingWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotation2")) {
                this.wingWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRate")) {
                this.wingWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("WingWheelRotRate")) {
                this.wingWheelRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelPosition1")) {
                this.bodyWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelPosition2")) {
                this.bodyWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotation1")) {
                this.bodyWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotation2")) {
                this.bodyWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRate")) {
                this.bodyWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("BodyWheelRotRate")) {
                this.bodyWheelRotRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("overheatLimit")) {
                this.overheatLimit = Integer.parseInt(split[1]);
            }
            else {
                this.overheatLimit = 750;
            }
            if (split[0].equals("overheatPenalty")) {
                this.overheatPenalty = Integer.parseInt(split[1]);
            }
            else {
                this.overheatPenalty = 240;
            }
            if (split[0].equals("coolingBonus")) {
                this.coolingBonus = Integer.parseInt(split[1]);
            }
            else {
                this.coolingBonus = 4;
            }
            if (split[0].equals("TailWheelPosition1")) {
                this.tailWheelPos1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelPosition2")) {
                this.tailWheelPos2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotation1")) {
                this.tailWheelRot1 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotation2")) {
                this.tailWheelRot2 = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRate")) {
                this.tailWheelRate = new Vector3f(split[1], this.shortName);
            }
            if (split[0].equals("TailWheelRotRate")) {
                this.tailWheelRotRate = new Vector3f(split[1], this.shortName);
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
            if (split[0].equals("InflightInventory")) {
                this.invInflight = split[1].equals("False");
            }
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public int numEngines() {
        switch (this.mode) {
            case VTOL: {
                return Math.max(this.propellers.size(), this.heliPropellers.size());
            }
            case PLANE: {
                return this.propellers.size();
            }
            case HELI: {
                return this.heliPropellers.size();
            }
            default: {
                return 1;
            }
        }
    }
    
    @Override
    public ArrayList<ItemStack> getItemsRequired(final DriveablePart part, final PartType engine) {
        final ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
        for (final Propeller propeller : this.propellers) {
            if (propeller.planePart == part.type) {
                stacks.add(new ItemStack(propeller.itemType.item));
                stacks.add(new ItemStack(engine.item));
            }
        }
        return stacks;
    }
    
    public static PlaneType getPlane(final String find) {
        for (final PlaneType type : PlaneType.types) {
            if (type.shortName.equals(find)) {
                return type;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelPlane.class);
    }
    
    static {
        PlaneType.types = new ArrayList<PlaneType>();
    }
}
