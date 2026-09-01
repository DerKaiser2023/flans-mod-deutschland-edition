// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import com.flansmod.common.parts.PartType;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import java.util.Iterator;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.block.material.Material;
import com.flansmod.common.guns.BulletType;
import java.util.List;
import java.util.ArrayList;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.paintjob.PaintableType;

public class DriveableType extends PaintableType
{
    public ModelDriveable model;
    public String overlay;
    public String heliGUI;
    public boolean hasScope;
    public String afterBurnName;
    public boolean hasAfterBurner;
    public boolean evilGolem;
    public int evilRange;
    public int evilGravity;
    public float evilSpread;
    public boolean autoSmoke;
    public boolean vanillaDamage;
    public boolean canStab;
    public float labjacFuel;
    public boolean Stabilizer;
    public boolean transport;
    public HashMap<EnumDriveablePart, CollisionBox> health;
    public HashMap<EnumDriveablePart, CollisionBox> crew;
    public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe;
    public ArrayList<ItemStack> driveableRecipe;
    public boolean acceptAllAmmo;
    public List<BulletType> ammo;
    public boolean harvestBlocks;
    public ArrayList<Material> materialsHarvested;
    public boolean collectHarvest;
    public boolean dropHarvest;
    public boolean needsThrottle;
    public Vector3f harvestBoxSize;
    public Vector3f harvestBoxPos;
    public int reloadSoundTick;
    public float fallDamageFactor;
    public String Gunsight;
    public String passengerGUI;
    public float gunsightZoom;
    public boolean nightScope;
    public boolean unlimitedOxygen;
    public boolean epicShip;
    public int weightLimit;
    public boolean radarVisible;
    public boolean hasRadar;
    public boolean hasPlaneRadar;
    public float radarRange;
    public int radarPositionOffset;
    public int radarRefreshDelay;
    public int slbmFlightType;
    public int slbmDelay;
    public int slbmRange;
    public int slbmStrength;
    public int slbmWarheadType;
    public float energyRate;
    public float energyLossRate;
    public float muzzleVelocity;
    public float projectileMass;
    public boolean showReload;
    public boolean solid;
    public EnumWeaponType primary;
    public EnumWeaponType secondary;
    public boolean alternatePrimary;
    public boolean alternateSecondary;
    public int shootDelayPrimary;
    public int shootDelaySecondary;
    public EnumFireMode modePrimary;
    public EnumFireMode modeSecondary;
    public String shootSoundPrimary;
    public String shootSoundSecondary;
    public String shootReloadSound;
    public ArrayList<ShootPoint> shootPointsPrimary;
    public ArrayList<ShootPoint> shootPointsSecondary;
    public ArrayList<PilotGun> pilotGuns;
    public int reloadTimePrimary;
    public int reloadTimeSecondary;
    public String reloadSoundPrimary;
    public String reloadSoundSecondary;
    public int placeTimePrimary;
    public int placeTimeSecondary;
    public String placeSoundPrimary;
    public String placeSoundSecondary;
    public int numPassengers;
    public Seat[] seats;
    public int numPassengerGunners;
    public float vehicleGunModelScale;
    public ArrayList<ShootParticle> shootParticlesPrimary;
    public ArrayList<ShootParticle> shootParticlesSecondary;
    public int numCargoSlots;
    public int numBombSlots;
    public int numMissileSlots;
    public int fuelTankSize;
    public float yOffset;
    public float cameraDistance;
    public ArrayList<ParticleEmitter> emitters;
    public ArrayList<AfterBurnEmitter> afterBurns;
    public float maxThrottle;
    public float maxNegativeThrottle;
    public float ClutchBrake;
    public Vector3f turretOrigin;
    public Vector3f turretOriginOffset;
    public DriveablePosition[] wheelPositions;
    public float wheelSpringStrength;
    public float wheelStepHeight;
    public boolean canRoll;
    public ArrayList<DriveablePosition> collisionPoints;
    public float drag;
    public boolean floatOnWater;
    public boolean placeableOnLand;
    public boolean placeableOnWater;
    public boolean placeableOnSponge;
    public boolean placeableOnPumpkin;
    public float buoyancy;
    public float floatOffset;
    public float bulletDetectionRadius;
    public boolean onRadar;
    public int animFrames;
    public int startSoundRange;
    public String startSound;
    public int startSoundLength;
    public int engineSoundRange;
    public String engineSound;
    public int engineSoundLength;
    public int backSoundRange;
    public String idleSound;
    public int idleSoundLength;
    public String backSound;
    public int backSoundLength;
    public String sonicBoomSound;
    public int stukaSoundLength;
    public int stukaSoundRange;
    public String stukaSound;
    public int stukaSpeed;
    public boolean collisionDamageEnable;
    public boolean pushOnCollision;
    public float collisionDamageThrottle;
    public float collisionDamageTimes;
    public boolean enableReloadTime;
    public boolean canMountEntity;
    public boolean inshallah;
    public boolean centralControl;
    public float bulletSpread;
    public float bulletSpeed;
    public boolean rangingGun;
    public boolean isExplosionWhenDestroyed;
    public boolean nuclearDeath;
    public boolean bigDeath;
    public boolean Death;
    public float isExplosionWhenDestroyedRadius;
    public String lockedOnSound;
    public int soundTime;
    public int canLockOnAngle;
    public int lockOnSoundTime;
    public String lockOnSound;
    public int maxRangeLockOn;
    public int lockedOnSoundRange;
    public String lockingOnSound;
    public boolean lockOnToPlanes;
    public boolean lockOnToVehicles;
    public boolean lockOnToMechas;
    public boolean lockOnToPlayers;
    public boolean lockOnToLivings;
    public boolean hasFlare;
    public int flareDelay;
    public String flareSound;
    public int timeFlareUsing;
    public int ticksRepairing;
    public int repairDelay;
    public int APSdelayMax;
    public boolean hasAPS;
    public int radarDetectableAltitude;
    public boolean stealth;
    public float recoilDist;
    public float recoilTime;
    public boolean fixedPrimaryFire;
    public Vector3f primaryFireAngle;
    public boolean fixedSecondaryFire;
    public Vector3f secondaryFireAngle;
    public float gunLength;
    public boolean setPlayerInvisible;
    public boolean invinciblePilotType;
    public float maxThrottleInWater;
    public ArrayList<Vector3f> leftTrackPoints;
    public ArrayList<Vector3f> rightTrackPoints;
    public float trackLinkLength;
    public boolean IT1;
    public static ArrayList<DriveableType> types;
    public ArrayList<CollisionShapeBox> collisionBox;
    public boolean fancyCollision;
    public CollisionShapeBox colbox;
    public float maxDepth;
    public float maxOxygen;
    public float oxygen;
    public boolean canDive;
    public boolean fancyShip;
    public boolean panic;
    public boolean mechStomp;
    public float damageVsCrew;
    public boolean crewEngine;
    public boolean autisticHitDetection;
    public int exitTimer;
    public boolean rocketThrottle;
    public int fuelTimer;
    public boolean primaryRecoil;
    public boolean secondaryRecoil;
    public boolean bigRecoil;
    public float primaryRecoilHeight;
    public float secondaryRecoilHeight;
    public boolean digitalRadar;
    public float radarDetectionRangeMultiplier;
    public boolean gunRange;
    public boolean walterGunRange;
    public boolean walterMortar;
    public boolean filterAmmunition;
    public String farSound;
    public boolean showTurretIndicator;
    public boolean alwaysShowTurret;
    public float explosionResistance;
    public boolean hasMagicArtilleryMode;
    public boolean lessOverpen;
    public float explosionPush;
    public String overheatSound;
    public int overheatLimit;
    public int overheatPenalty;
    public int coolingBonus;
    public boolean hijackablePilot;
    public int kamikazeBonus;
    public boolean loudCannon;
    public boolean earRape;
    public float farSoundRange;
    public boolean planeCoaxPrimary;
    public boolean planeCoaxSecondary;
    
    public DriveableType(final TypeFile file) {
        super(file);
        this.overlay = null;
        this.heliGUI = null;
        this.hasScope = false;
        this.afterBurnName = "Afterburner";
        this.hasAfterBurner = false;
        this.evilGolem = false;
        this.evilRange = 188;
        this.evilGravity = 0;
        this.evilSpread = 1.0f;
        this.autoSmoke = false;
        this.vanillaDamage = false;
        this.canStab = false;
        this.labjacFuel = 10.0f;
        this.Stabilizer = true;
        this.transport = false;
        this.health = new HashMap<EnumDriveablePart, CollisionBox>();
        this.crew = new HashMap<EnumDriveablePart, CollisionBox>();
        this.partwiseRecipe = new HashMap<EnumDriveablePart, ItemStack[]>();
        this.driveableRecipe = new ArrayList<ItemStack>();
        this.acceptAllAmmo = true;
        this.ammo = new ArrayList<BulletType>();
        this.harvestBlocks = false;
        this.materialsHarvested = new ArrayList<Material>();
        this.collectHarvest = false;
        this.dropHarvest = false;
        this.needsThrottle = false;
        this.harvestBoxSize = new Vector3f(0.0f, 0.0f, 0.0f);
        this.harvestBoxPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.reloadSoundTick = 15214541;
        this.fallDamageFactor = 1.0f;
        this.Gunsight = null;
        this.passengerGUI = null;
        this.gunsightZoom = 1.0f;
        this.nightScope = false;
        this.unlimitedOxygen = false;
        this.epicShip = false;
        this.weightLimit = 5000;
        this.radarVisible = true;
        this.hasRadar = false;
        this.hasPlaneRadar = false;
        this.radarRange = 69.0f;
        this.radarPositionOffset = 0;
        this.radarRefreshDelay = 0;
        this.slbmFlightType = 0;
        this.slbmDelay = 80;
        this.slbmRange = 300;
        this.slbmStrength = 10;
        this.slbmWarheadType = 0;
        this.energyRate = 1.0f;
        this.energyLossRate = 1.0f;
        this.muzzleVelocity = 1000.0f;
        this.projectileMass = 0.1f;
        this.showReload = true;
        this.solid = false;
        this.primary = EnumWeaponType.NONE;
        this.secondary = EnumWeaponType.NONE;
        this.alternatePrimary = false;
        this.alternateSecondary = false;
        this.shootDelayPrimary = 1;
        this.shootDelaySecondary = 1;
        this.modePrimary = EnumFireMode.FULLAUTO;
        this.modeSecondary = EnumFireMode.FULLAUTO;
        this.shootPointsPrimary = new ArrayList<ShootPoint>();
        this.shootPointsSecondary = new ArrayList<ShootPoint>();
        this.pilotGuns = new ArrayList<PilotGun>();
        this.reloadTimePrimary = 0;
        this.reloadTimeSecondary = 0;
        this.reloadSoundPrimary = "";
        this.reloadSoundSecondary = "";
        this.placeTimePrimary = 5;
        this.placeTimeSecondary = 5;
        this.placeSoundPrimary = "";
        this.placeSoundSecondary = "";
        this.numPassengers = 0;
        this.numPassengerGunners = 0;
        this.vehicleGunModelScale = 1.0f;
        this.shootParticlesPrimary = new ArrayList<ShootParticle>();
        this.shootParticlesSecondary = new ArrayList<ShootParticle>();
        this.fuelTankSize = 100;
        this.yOffset = 0.625f;
        this.cameraDistance = 5.0f;
        this.emitters = new ArrayList<ParticleEmitter>();
        this.afterBurns = new ArrayList<AfterBurnEmitter>();
        this.maxThrottle = 1.0f;
        this.maxNegativeThrottle = 0.0f;
        this.ClutchBrake = 0.0f;
        this.turretOrigin = new Vector3f();
        this.turretOriginOffset = new Vector3f();
        this.wheelPositions = new DriveablePosition[0];
        this.wheelSpringStrength = 0.5f;
        this.wheelStepHeight = 1.5f;
        this.canRoll = true;
        this.collisionPoints = new ArrayList<DriveablePosition>();
        this.drag = 1.0f;
        this.floatOnWater = false;
        this.placeableOnLand = true;
        this.placeableOnWater = false;
        this.placeableOnSponge = false;
        this.placeableOnPumpkin = false;
        this.buoyancy = 0.0165f;
        this.floatOffset = 0.0f;
        this.bulletDetectionRadius = 5.0f;
        this.onRadar = false;
        this.animFrames = 2;
        this.startSoundRange = 50;
        this.startSound = "";
        this.engineSoundRange = 50;
        this.engineSound = "";
        this.backSoundRange = 50;
        this.idleSound = "";
        this.idleSoundLength = 50;
        this.backSound = "";
        this.sonicBoomSound = "sonicBoom";
        this.stukaSoundRange = 50;
        this.stukaSound = "";
        this.stukaSpeed = 9000;
        this.collisionDamageEnable = true;
        this.pushOnCollision = true;
        this.collisionDamageThrottle = 0.3f;
        this.collisionDamageTimes = 25.0f;
        this.enableReloadTime = false;
        this.canMountEntity = false;
        this.inshallah = false;
        this.centralControl = false;
        this.bulletSpread = 0.0f;
        this.bulletSpeed = 3.0f;
        this.rangingGun = false;
        this.isExplosionWhenDestroyed = false;
        this.nuclearDeath = false;
        this.bigDeath = false;
        this.Death = false;
        this.isExplosionWhenDestroyedRadius = 0.0f;
        this.lockedOnSound = "";
        this.soundTime = 0;
        this.canLockOnAngle = 10;
        this.lockOnSoundTime = 60;
        this.lockOnSound = "";
        this.maxRangeLockOn = 500;
        this.lockedOnSoundRange = 5;
        this.lockingOnSound = "";
        this.lockOnToPlanes = false;
        this.lockOnToVehicles = false;
        this.lockOnToMechas = false;
        this.lockOnToPlayers = false;
        this.lockOnToLivings = false;
        this.hasFlare = false;
        this.flareDelay = 500;
        this.flareSound = "";
        this.timeFlareUsing = 10;
        this.ticksRepairing = 200;
        this.repairDelay = 200;
        this.APSdelayMax = 295;
        this.hasAPS = false;
        this.radarDetectableAltitude = -1;
        this.stealth = false;
        this.recoilDist = 7.0f;
        this.recoilTime = 7.0f;
        this.fixedPrimaryFire = false;
        this.primaryFireAngle = new Vector3f(0.0f, 0.0f, 0.0f);
        this.fixedSecondaryFire = false;
        this.secondaryFireAngle = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunLength = 0.0f;
        this.setPlayerInvisible = false;
        this.invinciblePilotType = true;
        this.maxThrottleInWater = 0.5f;
        this.leftTrackPoints = new ArrayList<Vector3f>();
        this.rightTrackPoints = new ArrayList<Vector3f>();
        this.trackLinkLength = 0.0f;
        this.IT1 = false;
        this.collisionBox = new ArrayList<CollisionShapeBox>();
        this.fancyCollision = false;
        this.maxDepth = 40.0f;
        this.maxOxygen = 9001.0f;
        this.oxygen = 9001.0f;
        this.canDive = false;
        this.fancyShip = false;
        this.panic = false;
        this.mechStomp = false;
        this.damageVsCrew = 0.5f;
        this.crewEngine = false;
        this.autisticHitDetection = false;
        this.exitTimer = 20;
        this.rocketThrottle = false;
        this.fuelTimer = 300;
        this.primaryRecoil = false;
        this.secondaryRecoil = false;
        this.bigRecoil = false;
        this.primaryRecoilHeight = 2.0f;
        this.secondaryRecoilHeight = 2.0f;
        this.digitalRadar = false;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.gunRange = false;
        this.walterGunRange = false;
        this.walterMortar = false;
        this.filterAmmunition = false;
        this.showTurretIndicator = true;
        this.alwaysShowTurret = false;
        this.explosionResistance = 1.0f;
        this.hasMagicArtilleryMode = false;
        this.lessOverpen = true;
        this.explosionPush = 0.25f;
        this.overheatSound = "overheatSound";
        this.overheatLimit = 250;
        this.overheatPenalty = 75;
        this.coolingBonus = 1;
        this.hijackablePilot = false;
        this.kamikazeBonus = 0;
        this.loudCannon = false;
        this.earRape = false;
        this.farSoundRange = 300.0f;
        this.planeCoaxPrimary = false;
        this.planeCoaxSecondary = false;
    }
    
    @Override
    public void preRead(final TypeFile file) {
        super.preRead(file);
        for (final String line : file.lines) {
            if (line == null) {
                break;
            }
            if (line.startsWith("//")) {
                continue;
            }
            final String[] split = line.split(" ");
            if (split.length < 2) {
                continue;
            }
            if (split[0].equals("Passengers")) {
                this.numPassengers = Integer.parseInt(split[1]);
                this.seats = new Seat[this.numPassengers + 1];
                break;
            }
        }
        for (final String line : file.lines) {
            if (line == null) {
                break;
            }
            if (line.startsWith("//")) {
                continue;
            }
            final String[] split = line.split(" ");
            if (split.length < 2) {
                continue;
            }
            if (split[0].equals("NumWheels")) {
                this.wheelPositions = new DriveablePosition[Integer.parseInt(split[1])];
                break;
            }
        }
        DriveableType.types.add(this);
    }
    
    @Override
    public void postRead(final TypeFile file) {
        super.postRead(file);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("VehicleGunModelScale")) {
                this.vehicleGunModelScale = Float.parseFloat(split[1]);
            }
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelDriveable.class);
            }
            else if (split[0].equals("VehicleGunReloadTick")) {
                this.reloadSoundTick = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            else if (split[0].equals("IsExplosionWhenDestroyed")) {
                this.isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("isExplosionWhenDestroyedRadius")) {
                this.isExplosionWhenDestroyedRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FallDamageFactor")) {
                this.fallDamageFactor = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("lessOverpen")) {
                this.lessOverpen = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("evilGolem")) {
                this.evilGolem = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("evilRange")) {
                this.evilRange = Integer.parseInt(split[1]);
            }
            if (split[0].equals("evilSpread")) {
                this.evilSpread = Float.parseFloat(split[1]);
            }
            if (split[0].equals("evilGravity")) {
                this.evilGravity = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("loudCannon")) {
                this.loudCannon = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("earRape")) {
                this.earRape = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("primaryRecoilStrength")) {
                this.primaryRecoilHeight = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("farSoundRange")) {
                this.farSoundRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("alwaysShowTurret")) {
                this.alwaysShowTurret = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("kamikazeBonus")) {
                this.kamikazeBonus = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("hasMagicArtilleryMode")) {
                this.hasMagicArtilleryMode = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("planeCoaxPrimary")) {
                this.planeCoaxPrimary = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("planeCoaxSecondary")) {
                this.planeCoaxSecondary = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("explosionResistance")) {
                this.explosionResistance = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("canStab")) {
                this.canStab = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("canPanic")) {
                this.panic = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MechStomp")) {
                this.mechStomp = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("artilleryCalculator")) {
                this.gunRange = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("walterCalculator")) {
                this.walterGunRange = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("walterMortar")) {
                this.walterMortar = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("showTurretIndicator")) {
                this.showTurretIndicator = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("fuelTimer")) {
                this.fuelTimer = Integer.parseInt(split[1]);
            }
            if (split[0].equals("rocketThrottle")) {
                this.rocketThrottle = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("labjacFuel")) {
                this.labjacFuel = 200.0f * Float.parseFloat(split[1]);
            }
            else if (split[0].equals("explosionPush")) {
                this.explosionPush = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("muzzleVelocity")) {
                this.muzzleVelocity = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("projectileMass")) {
                this.projectileMass = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("vanillaDamage")) {
                this.vanillaDamage = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("hijackablePilot")) {
                this.hijackablePilot = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MaxThrottle")) {
                this.maxThrottle = Float.parseFloat(split[1]) * 0.8f;
            }
            else if (split[0].equals("MaxNegativeThrottle")) {
                this.maxNegativeThrottle = Float.parseFloat(split[1]) * 0.8f;
            }
            else if (split[0].equals("ClutchBrake")) {
                this.ClutchBrake = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MaxThrottleInWater")) {
                this.maxThrottleInWater = Float.parseFloat(split[1]) * 0.8f;
            }
            else if (split[0].equals("MaxDepth")) {
                this.maxDepth = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("oxygen")) {
                this.oxygen = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("maxOxygen")) {
                this.maxOxygen = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("exitTimer")) {
                this.exitTimer = Integer.parseInt(split[1]);
            }
            if (split[0].equals("primaryRecoil")) {
                this.bigRecoil = true;
                this.primaryRecoil = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("secondaryRecoil")) {
                this.bigRecoil = true;
                this.secondaryRecoil = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("Gunsight")) {
                this.overlay = split[1];
            }
            if (split[0].equals("heliGUI")) {
                this.heliGUI = split[1];
            }
            else if (split[0].equals("hasScope")) {
                this.hasScope = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("nightScope")) {
                this.nightScope = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("gunsightZoom")) {
                this.gunsightZoom = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Drag")) {
                this.drag = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("TurretOrigin")) {
                this.turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
            }
            else if (split[0].equals("TurretOriginOffset")) {
                this.turretOriginOffset = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
            }
            else if (split[0].equals("CollisionPoint") || split[0].equals("AddCollisionPoint")) {
                this.collisionPoints.add(new DriveablePosition(split));
            }
            else if (split[0].equals("CollisionDamageEnable")) {
                this.collisionDamageEnable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("unlimitedOxygen")) {
                this.unlimitedOxygen = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("damageVsCrew")) {
                this.damageVsCrew = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("crewEngine")) {
                this.crewEngine = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("autisticHitDetection")) {
                this.autisticHitDetection = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("weightLimit")) {
                this.weightLimit = Integer.parseInt(split[1]);
            }
            if (split[0].equals("hasAfterBurner")) {
                this.hasAfterBurner = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("afterBurnName")) {
                this.afterBurnName = split[1];
            }
            else if (split[0].equals("CollisionDamageThrottle")) {
                this.collisionDamageThrottle = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CollisionDamageTimes")) {
                this.collisionDamageTimes = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CanLockAngle")) {
                this.canLockOnAngle = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("LockOnSoundTime")) {
                this.lockOnSoundTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("LockOnToDriveables")) {
                final boolean boolean1 = Boolean.parseBoolean(split[1].toLowerCase());
                this.lockOnToMechas = boolean1;
                this.lockOnToVehicles = boolean1;
                this.lockOnToPlanes = boolean1;
            }
            else if (split[0].equals("LockOnToVehicles")) {
                this.lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockOnToPlanes")) {
                this.lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockOnToMechas")) {
                this.lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockOnToPlayers")) {
                this.lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockOnToLivings")) {
                this.lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockedOnSoundRange")) {
                this.lockedOnSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("CanRoll")) {
                this.canRoll = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("HasFlare")) {
                this.hasFlare = Boolean.parseBoolean(split[1]);
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
            if (split[0].equals("APSdelayMax")) {
                this.APSdelayMax = Integer.parseInt(split[1]);
                if (this.APSdelayMax <= 0) {
                    this.APSdelayMax = 1;
                }
            }
            else if (split[0].equals("hasAPS")) {
                this.hasAPS = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("nuclearDeath")) {
                this.nuclearDeath = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("bigDeath")) {
                this.bigDeath = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Death")) {
                this.Death = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("radarVisible")) {
                this.radarVisible = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasRadar")) {
                this.hasRadar = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasPlaneRadar")) {
                this.hasPlaneRadar = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("radarRange")) {
                this.radarRange = Float.parseFloat(split[1]);
            }
            if (split[0].equals("radarPositionOffset")) {
                this.radarPositionOffset = Integer.parseInt(split[1]);
            }
            if (split[0].equals("radarRefreshDelay")) {
                this.radarRefreshDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("digitalRadar")) {
                this.digitalRadar = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("radarDetectionRangeMultiplier")) {
                this.radarDetectionRangeMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("solid")) {
                this.solid = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("slbmFlightType")) {
                this.slbmFlightType = Integer.parseInt(split[1]);
            }
            if (split[0].equals("slbmDelay")) {
                this.slbmDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("slbmRange")) {
                this.slbmRange = Integer.parseInt(split[1]);
            }
            if (split[0].equals("slbmStrength")) {
                this.slbmStrength = Integer.parseInt(split[1]);
            }
            if (split[0].equals("slbmWarheadType")) {
                this.slbmWarheadType = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("showReload")) {
                this.showReload = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("transport")) {
                this.transport = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PlaceableOnLand")) {
                this.placeableOnLand = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PlaceableOnWater")) {
                this.placeableOnWater = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PlaceableOnSponge")) {
                this.placeableOnSponge = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("placeableOnPumpkin")) {
                this.placeableOnPumpkin = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("FloatOnWater")) {
                this.floatOnWater = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Boat")) {
                this.placeableOnLand = false;
                this.placeableOnWater = true;
                this.floatOnWater = true;
                this.wheelStepHeight = 0.0f;
            }
            else if (split[0].equals("Buoyancy")) {
                this.buoyancy = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FloatOffset")) {
                this.floatOffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CanMountEntity")) {
                this.canMountEntity = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("centralControl")) {
                this.centralControl = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("InshaAllah")) {
                this.inshallah = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("needsThrottle")) {
                this.needsThrottle = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("Gunsight")) {
                this.Gunsight = split[1];
            }
            else if (split[0].equals("Wheel") || split[0].equals("WheelPosition")) {
                this.wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(new Vector3f(Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f, Float.parseFloat(split[4]) / 16.0f), (split.length > 5) ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
            }
            else if (split[0].equals("WheelRadius") || split[0].equals("WheelStepHeight")) {
                this.wheelStepHeight = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("WheelSpringStrength") || split[0].equals("SpringStrength")) {
                this.wheelSpringStrength = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("TrackFrames")) {
                this.animFrames = Integer.parseInt(split[1]) - 1;
            }
            else if (split[0].equals("Harvester")) {
                this.harvestBlocks = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("CollectHarvest")) {
                this.collectHarvest = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("DropHarvest")) {
                this.dropHarvest = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("HarvestBox")) {
                this.harvestBoxSize = new Vector3f(split[1], this.shortName);
                this.harvestBoxPos = new Vector3f(split[2], this.shortName);
            }
            else if (split[0].equals("HarvestMaterial")) {
                this.materialsHarvested.add(InfoType.getMaterial(split[1]));
            }
            else if (split[0].equals("HarvestToolType")) {
                if (split[1].equals("Axe")) {
                    this.materialsHarvested.add(Material.wood);
                    this.materialsHarvested.add(Material.plants);
                    this.materialsHarvested.add(Material.vine);
                }
                else if (split[1].equals("Pickaxe") || split[1].equals("Drill")) {
                    this.materialsHarvested.add(Material.iron);
                    this.materialsHarvested.add(Material.anvil);
                    this.materialsHarvested.add(Material.rock);
                }
                else if (split[1].equals("Spade") || split[1].equals("Shovel") || split[1].equals("Excavator")) {
                    this.materialsHarvested.add(Material.ground);
                    this.materialsHarvested.add(Material.grass);
                    this.materialsHarvested.add(Material.sand);
                    this.materialsHarvested.add(Material.snow);
                    this.materialsHarvested.add(Material.clay);
                }
                else if (split[1].equals("Hoe") || split[1].equals("Combine")) {
                    this.materialsHarvested.add(Material.plants);
                    this.materialsHarvested.add(Material.leaves);
                    this.materialsHarvested.add(Material.vine);
                    this.materialsHarvested.add(Material.cactus);
                    this.materialsHarvested.add(Material.gourd);
                }
                else if (split[1].equals("Tank")) {
                    this.materialsHarvested.add(Material.leaves);
                    this.materialsHarvested.add(Material.cactus);
                    this.materialsHarvested.add(Material.wood);
                    this.materialsHarvested.add(Material.plants);
                }
            }
            else if (split[0].equals("CargoSlots")) {
                this.numCargoSlots = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("BombSlots") || split[0].equals("MineSlots")) {
                this.numBombSlots = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MissileSlots") || split[0].equals("ShellSlots")) {
                this.numMissileSlots = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FuelTankSize")) {
                this.fuelTankSize = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("BulletDetection")) {
                this.bulletDetectionRadius = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AddAmmo")) {
                this.ammo.add(BulletType.getBullet(split[1]));
            }
            else if (split[0].equals("AllowAllAmmo") || split[0].equals("AcceptAllAmmo")) {
                this.acceptAllAmmo = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Primary")) {
                this.primary = EnumWeaponType.valueOf(split[1].toUpperCase());
            }
            else if (split[0].equals("Secondary")) {
                this.secondary = EnumWeaponType.valueOf(split[1].toUpperCase());
            }
            else if (split[0].equals("ShootDelayPrimary")) {
                this.shootDelayPrimary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ShootDelaySecondary")) {
                this.shootDelaySecondary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("PlaceTimePrimary")) {
                this.placeTimePrimary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("PlaceTimeSecondary")) {
                this.placeTimeSecondary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ReloadTimePrimary")) {
                this.reloadTimePrimary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ReloadTimeSecondary")) {
                this.reloadTimeSecondary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AlternatePrimary")) {
                this.alternatePrimary = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("AlternateSecondary")) {
                this.alternateSecondary = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ModePrimary")) {
                this.modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
            }
            else if (split[0].equals("ModeSecondary")) {
                this.modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
            }
            else if (split[0].equals("BulletSpeed")) {
                this.bulletSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("BulletSpread")) {
                this.bulletSpread = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RangingGun")) {
                this.rangingGun = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("GunLength")) {
                this.gunLength = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RecoilDistance")) {
                this.recoilDist = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RecoilTime")) {
                this.recoilTime = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ShootPointPrimary")) {
                Float diverge = 0.0f;
                Boolean musik = false;
                String[] gun;
                Vector3f offPos;
                if (split.length == 9) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                }
                else if (split.length == 10) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                    diverge = Float.parseFloat(split[9]);
                }
                else if (split.length == 11) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                    diverge = Float.parseFloat(split[9]);
                    musik = Boolean.parseBoolean(split[10]);
                }
                else if (split.length == 8) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4] };
                    offPos = new Vector3f(Float.parseFloat(split[5]) / 16.0f, Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f);
                }
                else {
                    gun = split;
                    offPos = new Vector3f(0.0f, 0.0f, 0.0f);
                }
                final DriveablePosition rootPos = getShootPoint(gun);
                final ShootPoint sPoint = new ShootPoint(rootPos, offPos, diverge, musik);
                this.shootPointsPrimary.add(sPoint);
                if (rootPos instanceof PilotGun) {
                    this.pilotGuns.add((PilotGun)sPoint.rootPos);
                }
            }
            else if (split[0].equals("ShootPointSecondary")) {
                Float diverge = 0.0f;
                Boolean musik = false;
                String[] gun;
                Vector3f offPos;
                if (split.length == 9) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                }
                else if (split.length == 10) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                    diverge = Float.parseFloat(split[9]);
                }
                else if (split.length == 11) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4], split[5] };
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                    diverge = Float.parseFloat(split[9]);
                    musik = Boolean.parseBoolean(split[10]);
                }
                else if (split.length == 8) {
                    gun = new String[] { split[0], split[1], split[2], split[3], split[4] };
                    offPos = new Vector3f(Float.parseFloat(split[5]) / 16.0f, Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f);
                }
                else {
                    gun = split;
                    offPos = new Vector3f(0.0f, 0.0f, 0.0f);
                }
                final DriveablePosition rootPos = getShootPoint(gun);
                final ShootPoint sPoint = new ShootPoint(rootPos, offPos, diverge, musik);
                this.shootPointsSecondary.add(sPoint);
                if (rootPos instanceof PilotGun) {
                    this.pilotGuns.add((PilotGun)sPoint.rootPos);
                }
            }
            else if (split[0].equals("EnableReloadTime")) {
                this.enableReloadTime = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShootParticlesPrimary")) {
                this.shootParticlesPrimary.add(new ShootParticle(split[1], Float.valueOf(split[2]), Float.valueOf(split[3]), Float.valueOf(split[4])));
            }
            else if (split[0].equals("ShootParticlesSecondary")) {
                this.shootParticlesSecondary.add(new ShootParticle(split[1], Float.valueOf(split[2]), Float.valueOf(split[3]), Float.valueOf(split[4])));
            }
            if (split[0].equals("SetPlayerInvisible")) {
                this.setPlayerInvisible = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("IT1")) {
                this.IT1 = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("FixedPrimary")) {
                this.fixedPrimaryFire = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("PrimaryAngle")) {
                this.primaryFireAngle = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
            }
            if (split[0].equals("FixedSecondary")) {
                this.fixedSecondaryFire = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("SecondaryAngle")) {
                this.secondaryFireAngle = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
            }
            else if (split[0].equals("AddGun")) {
                this.secondary = EnumWeaponType.GUN;
                Vector3f offPos;
                DriveablePosition rootPos;
                PilotGun pilotGun;
                if (split.length == 6) {
                    rootPos = getShootPoint(split);
                    offPos = new Vector3f(0.0f, 0.0f, 0.0f);
                    pilotGun = (PilotGun)getShootPoint(split);
                }
                else {
                    final String[] gun2 = { split[0], split[1], split[2], split[3], split[4], split[5] };
                    rootPos = getShootPoint(gun2);
                    pilotGun = (PilotGun)getShootPoint(gun2);
                    offPos = new Vector3f(Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f, Float.parseFloat(split[8]) / 16.0f);
                }
                final ShootPoint sPoint2 = new ShootPoint(rootPos, offPos, 0.0f, false);
                this.shootPointsSecondary.add(sPoint2);
                this.pilotGuns.add(pilotGun);
                this.driveableRecipe.add(new ItemStack(pilotGun.type.item));
            }
            else if (split[0].equals("BombPosition")) {
                this.primary = EnumWeaponType.BOMB;
                if (split.length == 4) {
                    this.shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.core), new Vector3f(0.0f, 0.0f, 0.0f), 0.0f, false));
                }
                else if (split.length == 7) {
                    this.shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.core), new Vector3f(Float.parseFloat(split[4]) / 16.0f, Float.parseFloat(split[5]) / 16.0f, Float.parseFloat(split[6]) / 16.0f), 0.0f, false));
                }
            }
            else if (split[0].equals("BarrelPosition")) {
                this.primary = EnumWeaponType.SHELL;
                if (split.length == 4) {
                    this.shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.turret), new Vector3f(0.0f, 0.0f, 0.0f), 0.0f, false));
                }
                else if (split.length == 7) {
                    this.shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f), EnumDriveablePart.turret), new Vector3f(Float.parseFloat(split[4]) / 16.0f, Float.parseFloat(split[5]) / 16.0f, Float.parseFloat(split[6]) / 16.0f), 0.0f, false));
                }
            }
            else if (split[0].equals("ShootDelay")) {
                this.shootDelaySecondary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ShellDelay") || split[0].equals("BombDelay")) {
                this.shootDelayPrimary = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AddRecipeParts")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
                for (int i = 0; i < (split.length - 2) / 2; ++i) {
                    final int amount = Integer.parseInt(split[2 * i + 2]);
                    final boolean damaged = split[2 * i + 3].contains(".");
                    final String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
                    final int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
                    stacks[i] = InfoType.getRecipeElement(itemName, amount, damage, this.shortName);
                    this.driveableRecipe.add(stacks[i]);
                }
                this.partwiseRecipe.put(part, stacks);
            }
            else if (split[0].equals("AddDye")) {
                final int amount2 = Integer.parseInt(split[1]);
                int damage2 = -1;
                for (int i = 0; i < ItemDye.dyeColorNames.length; ++i) {
                    if (ItemDye.dyeColorNames[i].equals(split[2])) {
                        damage2 = i;
                    }
                }
                if (damage2 == -1) {
                    FlansMod.log("Failed to find dye colour : " + split[2] + " while adding " + file.name);
                    return;
                }
                this.driveableRecipe.add(new ItemStack(Items.dye, amount2, damage2));
            }
            else if (split[0].equals("SetupPart")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), 1, 1, 1, 1);
                this.health.put(part, box);
                this.crew.put(part, box);
            }
            else if (split[0].equals("SetupArmoredPart")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[9]), 1, 1);
                this.health.put(part, box);
                this.crew.put(part, box);
            }
            else if (split[0].equals("SetupCrewedPart")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[9]), 1, Integer.parseInt(split[10]));
                this.health.put(part, box);
                this.crew.put(part, box);
            }
            else if (split[0].equals("SetupCompositeArmoredPart")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[10]), 1, 1);
                this.health.put(part, box);
                this.crew.put(part, box);
            }
            else if (split[0].equals("SetupAnimalPart")) {
                final EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
                final CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[10]), 2, 1);
                this.health.put(part, box);
                this.crew.put(part, box);
            }
            else if (split[0].equals("Driver") || split[0].equals("Pilot")) {
                if (split.length > 4) {
                    this.seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]));
                }
                else {
                    this.seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
                }
            }
            else if (split[0].equals("DriverPart")) {
                this.seats[0].part = EnumDriveablePart.getPart(split[1]);
            }
            else if (split[0].equals("DriverGun") || split[0].equals("PilotGun")) {
                this.seats[0].gunName = split[2];
            }
            else if (split[0].equals("DriverGunOrigin")) {
                this.seats[0].gunOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
            }
            else if (split[0].equals("RotatedDriverOffset")) {
                this.seats[0].rotatedOffset = new Vector3f(Integer.parseInt(split[1]) / 16.0f, Integer.parseInt(split[2]) / 16.0f, Integer.parseInt(split[3]) / 16.0f);
            }
            else if (split[0].equals("RotatedPassengerOffset")) {
                this.seats[Integer.parseInt(split[1])].rotatedOffset = new Vector3f(Integer.parseInt(split[2]) / 16.0f, Integer.parseInt(split[3]) / 16.0f, Integer.parseInt(split[4]) / 16.0f);
            }
            else if (split[0].equals("DriverAimSpeed")) {
                this.seats[0].aimingSpeed = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                this.seats[0].aimingSpeedBackup = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
            }
            else if (split[0].equals("PassengerAimSpeed")) {
                this.seats[Integer.parseInt(split[1])].aimingSpeed = new Vector3f(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]));
            }
            else if (split[0].equals("carrier")) {
                this.seats[Integer.parseInt(split[1])].carrier = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("parkingSpot")) {
                this.seats[Integer.parseInt(split[1])].parkingSpot = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("helipad")) {
                this.seats[Integer.parseInt(split[1])].helipad = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("hardpoint")) {
                this.seats[Integer.parseInt(split[1])].hardpoint = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("invisiblePassenger")) {
                this.seats[Integer.parseInt(split[1])].invisiblePassenger = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("heliGuiSeat")) {
                this.seats[Integer.parseInt(split[1])].heliGuiSeat = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("passengerZoom")) {
                this.seats[Integer.parseInt(split[1])].passengerZoom = Float.parseFloat(split[2]);
            }
            else if (split[0].equals("canSmallArms")) {
                this.seats[Integer.parseInt(split[1])].canSmallArms = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("invincible")) {
                this.seats[Integer.parseInt(split[1])].invincible = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("enterable")) {
                this.seats[Integer.parseInt(split[1])].enterable = Boolean.parseBoolean(split[2]);
            }
            if (split[0].equals("SetDriverInvincible")) {
                this.invinciblePilotType = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("barrels")) {
                this.seats[Integer.parseInt(split[1])].barrels = Integer.parseInt(split[2]);
            }
            else if (split[0].equals("barrelSpread")) {
                this.seats[Integer.parseInt(split[1])].barrelSpread = Float.parseFloat(split[2]);
            }
            else if (split[0].equals("hasHUD")) {
                this.seats[Integer.parseInt(split[1])].hasHUD = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("hudColorR")) {
                this.seats[Integer.parseInt(split[1])].hudColorR = Integer.parseInt(split[2]);
            }
            else if (split[0].equals("hudColorG")) {
                this.seats[Integer.parseInt(split[1])].hudColorG = Integer.parseInt(split[2]);
            }
            else if (split[0].equals("hudColorB")) {
                this.seats[Integer.parseInt(split[1])].hudColorB = Integer.parseInt(split[2]);
            }
            if (split[0].equals("autoSmoke")) {
                this.autoSmoke = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("energyGainRate")) {
                this.energyRate = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("energyLossRate")) {
                this.energyLossRate = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DriverLegacyAiming")) {
                this.seats[0].legacyAiming = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PassengerLegacyAiming")) {
                this.seats[Integer.parseInt(split[1])].legacyAiming = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("DriverYawBeforePitch")) {
                this.seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PassengerYawBeforePitch")) {
                this.seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("DriverLatePitch")) {
                this.seats[0].latePitch = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PassengerLatePitch")) {
                this.seats[Integer.parseInt(split[1])].latePitch = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("DriverTraverseSounds")) {
                this.seats[0].traverseSounds = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("PassengerTraverseSounds")) {
                this.seats[Integer.parseInt(split[1])].traverseSounds = Boolean.parseBoolean(split[2]);
            }
            else if (split[0].equals("Passenger")) {
                final Seat seat = new Seat(split);
                this.seats[seat.id] = seat;
                if (seat.gunType != null) {
                    seat.gunnerID = this.numPassengerGunners++;
                    this.driveableRecipe.add(new ItemStack(seat.gunType.item));
                }
            }
            else if (split[0].equals("GunOrigin")) {
                this.seats[Integer.parseInt(split[1])].gunOrigin = new Vector3f(Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f, Float.parseFloat(split[4]) / 16.0f);
            }
            else if (split[0].equals("YOffset")) {
                this.yOffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CameraDistance")) {
                this.cameraDistance = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("StartSoundRange")) {
                this.startSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("StartSoundLength")) {
                this.startSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("EngineSoundRange")) {
                this.engineSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("EngineSoundLength")) {
                this.engineSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("IdleSoundLength")) {
                this.idleSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("BackSoundRange")) {
                this.backSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("BackSoundLength")) {
                this.backSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SoundTime")) {
                this.soundTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("YawSoundLength")) {
                this.seats[0].yawSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("PitchSoundLength")) {
                this.seats[0].pitchSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("PassengerYawSoundLength")) {
                this.seats[Integer.parseInt(split[1])].yawSoundLength = Integer.parseInt(split[2]);
            }
            else if (split[0].equals("PassengerPitchSoundLength")) {
                this.seats[Integer.parseInt(split[1])].pitchSoundLength = Integer.parseInt(split[2]);
            }
            else if (split[0].equals("StartSound")) {
                this.startSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("sonicBoomSound")) {
                this.sonicBoomSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("EngineSound")) {
                this.engineSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("overheatSound")) {
                this.overheatSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "overheatSound", split[1]);
            }
            else if (split[0].equals("StukaSound")) {
                this.stukaSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("StukaSoundLength")) {
                this.stukaSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("StukaSpeed")) {
                this.stukaSpeed = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Stabilizer")) {
                this.Stabilizer = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("IdleSound")) {
                this.idleSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("BackSound")) {
                this.backSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("YawSound")) {
                this.seats[0].yawSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("PitchSound")) {
                this.seats[0].pitchSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("PassengerYawSound")) {
                this.seats[Integer.parseInt(split[1])].yawSound = split[2];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("PassengerPitchSound")) {
                this.seats[Integer.parseInt(split[1])].pitchSound = split[2];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("ShootMainSound") || split[0].equals("ShootSoundPrimary") || split[0].equals("ShellSound") || split[0].equals("BombSound")) {
                this.shootSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("ShootReloadSound")) {
                this.shootReloadSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("farSound")) {
                this.farSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("ShootSecondarySound") || split[0].equals("ShootSoundSecondary")) {
                this.shootSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("PlaceSoundPrimary")) {
                this.placeSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("PlaceSoundSecondary")) {
                this.placeSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("ReloadSoundPrimary")) {
                this.reloadSoundPrimary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("ReloadSoundSecondary")) {
                this.reloadSoundSecondary = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("LockedOnSound")) {
                this.lockedOnSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("LockOnSound")) {
                this.lockOnSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("FilterAmmunitionInput")) {
                this.filterAmmunition = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("LockingOnSound")) {
                this.lockingOnSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            if (split[0].equals("FlareSound")) {
                this.flareSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            if (split[0].equals("FancyCollision")) {
                this.fancyCollision = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("fancyShip")) {
                this.fancyShip = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("AddCollisionMesh")) {
                final CollisionShapeBox box2 = new CollisionShapeBox(new Vector3f(split[1], this.shortName), new Vector3f(split[2], this.shortName), new Vector3f(split[3], this.shortName), new Vector3f(split[4], this.shortName), new Vector3f(split[5], this.shortName), new Vector3f(split[6], this.shortName), new Vector3f(split[7], this.shortName), new Vector3f(split[8], this.shortName), new Vector3f(split[9], this.shortName), new Vector3f(split[10], this.shortName), "core");
                this.collisionBox.add(box2);
            }
            if (split[0].equals("AddCollisionMeshRaw")) {
                final Vector3f pos = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                final Vector3f size = new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]));
                final Vector3f p1 = new Vector3f(Float.parseFloat(split[8]), Float.parseFloat(split[9]), Float.parseFloat(split[10]));
                final Vector3f p2 = new Vector3f(Float.parseFloat(split[11]), Float.parseFloat(split[12]), Float.parseFloat(split[13]));
                final Vector3f p3 = new Vector3f(Float.parseFloat(split[14]), Float.parseFloat(split[15]), Float.parseFloat(split[16]));
                final Vector3f p4 = new Vector3f(Float.parseFloat(split[17]), Float.parseFloat(split[18]), Float.parseFloat(split[19]));
                final Vector3f p5 = new Vector3f(Float.parseFloat(split[20]), Float.parseFloat(split[21]), Float.parseFloat(split[22]));
                final Vector3f p6 = new Vector3f(Float.parseFloat(split[23]), Float.parseFloat(split[24]), Float.parseFloat(split[25]));
                final Vector3f p7 = new Vector3f(Float.parseFloat(split[26]), Float.parseFloat(split[27]), Float.parseFloat(split[28]));
                final Vector3f p8 = new Vector3f(Float.parseFloat(split[29]), Float.parseFloat(split[30]), Float.parseFloat(split[31]));
                final CollisionShapeBox box3 = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "core");
                this.collisionBox.add(box3);
            }
            if (split[0].equals("AddTurretCollisionMesh")) {
                final CollisionShapeBox box2 = new CollisionShapeBox(new Vector3f(split[1], this.shortName), new Vector3f(split[2], this.shortName), new Vector3f(split[3], this.shortName), new Vector3f(split[4], this.shortName), new Vector3f(split[5], this.shortName), new Vector3f(split[6], this.shortName), new Vector3f(split[7], this.shortName), new Vector3f(split[8], this.shortName), new Vector3f(split[9], this.shortName), new Vector3f(split[10], this.shortName), "turret");
                this.collisionBox.add(box2);
            }
            if (split[0].equals("AddTurretCollisionMeshRaw")) {
                final Vector3f pos = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
                final Vector3f size = new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]));
                final Vector3f p1 = new Vector3f(Float.parseFloat(split[8]), Float.parseFloat(split[9]), Float.parseFloat(split[10]));
                final Vector3f p2 = new Vector3f(Float.parseFloat(split[11]), Float.parseFloat(split[12]), Float.parseFloat(split[13]));
                final Vector3f p3 = new Vector3f(Float.parseFloat(split[14]), Float.parseFloat(split[15]), Float.parseFloat(split[16]));
                final Vector3f p4 = new Vector3f(Float.parseFloat(split[17]), Float.parseFloat(split[18]), Float.parseFloat(split[19]));
                final Vector3f p5 = new Vector3f(Float.parseFloat(split[20]), Float.parseFloat(split[21]), Float.parseFloat(split[22]));
                final Vector3f p6 = new Vector3f(Float.parseFloat(split[23]), Float.parseFloat(split[24]), Float.parseFloat(split[25]));
                final Vector3f p7 = new Vector3f(Float.parseFloat(split[26]), Float.parseFloat(split[27]), Float.parseFloat(split[28]));
                final Vector3f p8 = new Vector3f(Float.parseFloat(split[29]), Float.parseFloat(split[30]), Float.parseFloat(split[31]));
                final CollisionShapeBox box3 = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "turret");
                this.collisionBox.add(box3);
            }
            if (split[0].equals("LeftLinkPoint")) {
                this.leftTrackPoints.add(new Vector3f(split[1], this.shortName));
            }
            if (split[0].equals("RightLinkPoint")) {
                this.rightTrackPoints.add(new Vector3f(split[1], this.shortName));
            }
            if (split[0].equals("TrackLinkLength")) {
                this.trackLinkLength = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("OnRadar")) {
                this.onRadar = split[1].equals("True");
            }
            else if (split[0].equalsIgnoreCase("AddParticle") || split[0].equalsIgnoreCase("AddEmitter")) {
                final ParticleEmitter emitter = new ParticleEmitter();
                emitter.effectType = split[1];
                emitter.emitRate = Integer.parseInt(split[2]);
                emitter.origin = new Vector3f(split[3], this.shortName);
                emitter.extents = new Vector3f(split[4], this.shortName);
                emitter.velocity = new Vector3f(split[5], this.shortName);
                emitter.minThrottle = Float.parseFloat(split[6]);
                emitter.maxThrottle = Float.parseFloat(split[7]);
                emitter.minHealth = Float.parseFloat(split[8]);
                emitter.maxHealth = Float.parseFloat(split[9]);
                emitter.part = split[10];
                emitter.origin.scale(0.0625f);
                emitter.extents.scale(0.0625f);
                emitter.velocity.scale(0.0625f);
                this.emitters.add(emitter);
            }
            else if (split[0].equalsIgnoreCase("particleAfterBurn") || split[0].equalsIgnoreCase("particleTrailBurner")) {
                final AfterBurnEmitter emitter2 = new AfterBurnEmitter();
                emitter2.effectType = split[1];
                emitter2.emitRate = Integer.parseInt(split[2]);
                emitter2.origin = new Vector3f(split[3], this.shortName);
                emitter2.extents = new Vector3f(split[4], this.shortName);
                emitter2.velocity = new Vector3f(split[5], this.shortName);
                emitter2.part = split[6];
                emitter2.origin.scale(0.0625f);
                emitter2.extents.scale(0.0625f);
                emitter2.velocity.scale(0.0625f);
                this.afterBurns.add(emitter2);
            }
            else if (split[0].equals("RadarDetectableAltitude")) {
                this.radarDetectableAltitude = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Stealth")) {
                this.stealth = split[1].equals("True");
            }
        }
        catch (final Exception e) {
            if (split != null) {
                String msg = " : ";
                for (final String s : split) {
                    msg = msg + " " + s;
                }
                FlansMod.log("Errored reading " + file.name + "");
            }
            else {
                FlansMod.log("Errored reading " + file.name);
            }
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    private static DriveablePosition getShootPoint(final String[] split) {
        if (split.length == 6) {
            return new PilotGun(split);
        }
        if (split.length == 5) {
            return new DriveablePosition(split);
        }
        return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
    }
    
    public ArrayList<ShootPoint> shootPoints(final boolean s) {
        return s ? this.shootPointsSecondary : this.shootPointsPrimary;
    }
    
    public boolean alternate(final boolean s) {
        return s ? this.alternateSecondary : this.alternatePrimary;
    }
    
    public EnumWeaponType weaponType(final boolean s) {
        return s ? this.secondary : this.primary;
    }
    
    public int shootDelay(final boolean s) {
        return s ? this.shootDelaySecondary : this.shootDelayPrimary;
    }
    
    public String shootSound(final boolean s) {
        return s ? this.shootSoundSecondary : this.shootSoundPrimary;
    }
    
    public ArrayList<ShootParticle> shootParticle(final boolean s) {
        return s ? this.shootParticlesSecondary : this.shootParticlesPrimary;
    }
    
    public int numEngines() {
        return 1;
    }
    
    public int ammoSlots() {
        return this.numPassengerGunners + this.pilotGuns.size();
    }
    
    public boolean isValidAmmo(final BulletType bulletType, final EnumWeaponType weaponType) {
        return (this.acceptAllAmmo || this.ammo.contains(bulletType)) && bulletType.weaponType == weaponType;
    }
    
    public ArrayList<ItemStack> getItemsRequired(final DriveablePart part, final PartType engine) {
        final ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
        if (this.partwiseRecipe.get(part.type) != null) {
            for (final ItemStack stack : this.partwiseRecipe.get(part.type)) {
                stacks.add(stack.copy());
            }
        }
        for (final PilotGun gun : this.pilotGuns) {
            if (gun.part == part.type && gun.type != null && gun.type.item != null) {
                stacks.add(new ItemStack(gun.type.item));
            }
        }
        for (final Seat seat : this.seats) {
            if (seat != null && seat.part == part.type && seat.gunType != null) {
                stacks.add(new ItemStack(seat.gunType.item));
            }
        }
        return stacks;
    }
    
    public static DriveableType getDriveable(final String find) {
        for (final DriveableType type : DriveableType.types) {
            if (type.shortName.equals(find)) {
                return type;
            }
        }
        return null;
    }
    
    @Override
    public float GetRecommendedScale() {
        return 100.0f / this.cameraDistance;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return this.model;
    }
    
    static {
        DriveableType.types = new ArrayList<DriveableType>();
    }
    
    public class ShootParticle
    {
        float x;
        float y;
        float z;
        String name;
        
        public ShootParticle(final String s, final float x1, final float y1, final float z1) {
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
            this.x = x1;
            this.y = y1;
            this.z = z1;
            this.name = s;
        }
    }
    
    public class ParticleEmitter
    {
        public String effectType;
        public int emitRate;
        public Vector3f origin;
        public Vector3f extents;
        public Vector3f velocity;
        public float minThrottle;
        public float maxThrottle;
        public String part;
        public float minHealth;
        public float maxHealth;
    }
    
    public class AfterBurnEmitter
    {
        public String effectType;
        public int emitRate;
        public Vector3f origin;
        public Vector3f extents;
        public Vector3f velocity;
        public String part;
    }
}
