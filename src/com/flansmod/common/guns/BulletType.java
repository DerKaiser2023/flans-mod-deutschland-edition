// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import java.util.List;
import net.minecraft.potion.PotionEffect;
import java.util.ArrayList;
import com.flansmod.common.driveables.EnumWeaponType;

public class BulletType extends ShootableType
{
    public boolean Parachute;
    public boolean Bouncerino;
    public boolean Ghost;
    public boolean Hesh;
    public boolean depthCharge;
    public boolean navalMine;
    public int activationDepth;
    public int seaLevel;
    public int flak;
    public String flakParticles;
    public boolean setEntitiesOnFire;
    public float livingProximityTrigger;
    public float driveableProximityTrigger;
    public float damageToTriggerer;
    public int primeDelay;
    public int explodeParticles;
    public String explodeParticleType;
    public int lockonDelay;
    public EnumWeaponType weaponType;
    public String hitSound;
    public float hitSoundRange;
    public boolean hitSoundEnable;
    public boolean entityHitSoundEnable;
    public boolean hasLight;
    public float penetratingPower;
    public int armorPen;
    public float penDecay;
    public boolean HEAT;
    public boolean radarGuided;
    public boolean swordEnergy;
    public boolean lockOnToPlanes;
    public boolean lockOnToVehicles;
    public boolean lockOnToMechas;
    public boolean lockOnToPlayers;
    public boolean lockOnToLivings;
    public float maxLockOnAngle;
    public float lockOnForce;
    public int maxDegreeOfMissile;
    public int tickStartHoming;
    public boolean enableSACLOS;
    public int maxDegreeOfSACLOS;
    public int maxRangeOfMissile;
    public boolean manualGuidance;
    public int lockOnFuse;
    public boolean TVguided;
    public String ricochetSound;
    public String minorPenSound;
    public String penetrateSound;
    public String overPenSound;
    public String APSsound;
    public ArrayList<PotionEffect> hitEffects;
    public int numBullets;
    public float bulletSpread;
    public float dragInAir;
    public float dragInWater;
    public boolean canSpotEntityDriveable;
    public int maxRange;
    public boolean shootForSettingPos;
    public int shootForSettingPosHeight;
    public boolean isDoTopAttack;
    public int smokeTime;
    public String smokeParticleType;
    public ArrayList<PotionEffect> smokeEffects;
    public ArrayList<PotionEffect> stolenSmokeEffects;
    public boolean stolenSmoke;
    public float smokeRadius;
    public boolean TVguide;
    public boolean VLS;
    public int VLSTime;
    public boolean fixedDirection;
    public float turnRadius;
    public String boostPhaseParticle;
    public float trackPhaseSpeed;
    public float trackPhaseTurn;
    public boolean CIWSable;
    public boolean torpedo;
    public float seekerRange;
    public float nonpenPenalty;
    public float barelypenPenalty;
    public float overPenPenalty;
    public boolean bigWater;
    public boolean smallWater;
    public boolean modernTorpedo;
    public int aftermathFuse;
    public boolean angel;
    public float angelSpeed;
    public boolean antiRadiation;
    public String missNoise;
    public boolean grenadeBounce;
    public boolean sticky;
    public boolean smokeProtectable;
    public boolean hasLauncherModel;
    public boolean CIWSer;
    public boolean gasmaskable;
    public boolean angelOfDeath;
    public int bulletSmokeTime;
    public int smokeDelay;
    public boolean jamiogravity;
    public int dynamicBulletDelay;
    public float dynamicDamage;
    public int suppression;
    public boolean starShell;
    public boolean ciwsBullet;
    public float ASWminRange;
    public boolean infiniteAngle;
    public boolean trueManual;
    public float joystickSensitivity;
    public boolean earlyInfrared;
    public boolean scoutBullet;
    public static List<BulletType> bullets;
    
    public BulletType(final TypeFile file) {
        super(file);
        this.Parachute = false;
        this.Bouncerino = false;
        this.Ghost = false;
        this.Hesh = false;
        this.depthCharge = false;
        this.navalMine = false;
        this.activationDepth = 20;
        this.seaLevel = 55;
        this.flak = 0;
        this.flakParticles = "largesmoke";
        this.setEntitiesOnFire = false;
        this.livingProximityTrigger = -1.0f;
        this.driveableProximityTrigger = -1.0f;
        this.damageToTriggerer = 0.0f;
        this.primeDelay = 0;
        this.explodeParticles = 0;
        this.explodeParticleType = "largesmoke";
        this.lockonDelay = 10;
        this.weaponType = EnumWeaponType.NONE;
        this.hitSoundEnable = false;
        this.entityHitSoundEnable = false;
        this.hasLight = false;
        this.penetratingPower = 1.0f;
        this.armorPen = 2;
        this.penDecay = 0.0f;
        this.HEAT = false;
        this.radarGuided = false;
        this.swordEnergy = false;
        this.lockOnToPlanes = false;
        this.lockOnToVehicles = false;
        this.lockOnToMechas = false;
        this.lockOnToPlayers = false;
        this.lockOnToLivings = false;
        this.maxLockOnAngle = 45.0f;
        this.lockOnForce = 1.0f;
        this.maxDegreeOfMissile = 70;
        this.tickStartHoming = 5;
        this.enableSACLOS = false;
        this.maxDegreeOfSACLOS = 5;
        this.maxRangeOfMissile = 300;
        this.manualGuidance = false;
        this.lockOnFuse = 10;
        this.TVguided = false;
        this.ricochetSound = "bounceMG";
        this.minorPenSound = "";
        this.penetrateSound = "";
        this.overPenSound = "";
        this.APSsound = "";
        this.hitEffects = new ArrayList<PotionEffect>();
        this.numBullets = -1;
        this.bulletSpread = -1.0f;
        this.dragInAir = 1.0f;
        this.dragInWater = 0.8f;
        this.canSpotEntityDriveable = false;
        this.maxRange = -1;
        this.shootForSettingPos = false;
        this.shootForSettingPosHeight = 100;
        this.isDoTopAttack = false;
        this.smokeTime = 0;
        this.smokeParticleType = "explode";
        this.smokeEffects = new ArrayList<PotionEffect>();
        this.stolenSmokeEffects = new ArrayList<PotionEffect>();
        this.stolenSmoke = false;
        this.smokeRadius = 5.0f;
        this.TVguide = true;
        this.VLS = false;
        this.VLSTime = 0;
        this.fixedDirection = false;
        this.turnRadius = 3.0f;
        this.trackPhaseSpeed = 2.0f;
        this.trackPhaseTurn = 0.2f;
        this.CIWSable = false;
        this.torpedo = false;
        this.seekerRange = 250.0f;
        this.nonpenPenalty = 0.0f;
        this.barelypenPenalty = 0.01f;
        this.overPenPenalty = 0.5f;
        this.bigWater = false;
        this.smallWater = true;
        this.modernTorpedo = false;
        this.aftermathFuse = 3;
        this.angel = false;
        this.angelSpeed = 2.5f;
        this.antiRadiation = false;
        this.missNoise = "Passby";
        this.grenadeBounce = false;
        this.smokeProtectable = false;
        this.hasLauncherModel = false;
        this.CIWSer = false;
        this.gasmaskable = true;
        this.angelOfDeath = false;
        this.bulletSmokeTime = 5;
        this.smokeDelay = 30;
        this.jamiogravity = false;
        this.dynamicBulletDelay = 9000;
        this.dynamicDamage = 1.0f;
        this.suppression = 16;
        this.starShell = false;
        this.ciwsBullet = false;
        this.ASWminRange = 5.0f;
        this.infiniteAngle = false;
        this.trueManual = false;
        this.joystickSensitivity = 1.0f;
        this.earlyInfrared = false;
        this.scoutBullet = false;
        this.texture = "defaultBullet";
        BulletType.bullets.add(this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("FlakParticles")) {
                this.flak = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlakParticleType")) {
                this.flakParticles = split[1];
            }
            else if (split[0].equals("SetEntitiesOnFire")) {
                this.setEntitiesOnFire = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("suppression")) {
                this.suppression = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Parachute")) {
                this.Parachute = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("scoutBullet")) {
                this.scoutBullet = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("infiniteAngle")) {
                this.infiniteAngle = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("earlyInfrared")) {
                this.earlyInfrared = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("starShell")) {
                this.starShell = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ciwsBullet")) {
                this.ciwsBullet = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("joystick")) {
                this.trueManual = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("manualSensitivity")) {
                this.joystickSensitivity = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("TVguided")) {
                this.TVguided = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("dynamicBulletDelay")) {
                this.dynamicBulletDelay = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("dynamicDamage")) {
                this.dynamicDamage = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("hasLauncherModel")) {
                this.hasLauncherModel = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("smokeProtectable")) {
                this.smokeProtectable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("grenadeBounce")) {
                this.grenadeBounce = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("gasmaskable")) {
                this.gasmaskable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("stolenSmokeEffect")) {
                this.stolenSmokeEffects.add(InfoType.getPotionEffect(split));
            }
            else if (split[0].equals("stolenSmoke")) {
                this.stolenSmoke = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("angelOfDeath")) {
                this.angelOfDeath = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("smokeParticleType")) {
                this.smokeParticleType = split[1];
            }
            else if (split[0].equals("bulletSmokeTime")) {
                this.bulletSmokeTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("smokeDelay")) {
                this.smokeDelay = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("shrapnelAngel")) {
                this.angel = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("angelSpeed")) {
                this.barelypenPenalty = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("nonPenPenalty")) {
                this.nonpenPenalty = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("overPenPenalty")) {
                this.overPenPenalty = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("barelyPenPenalty")) {
                this.barelypenPenalty = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CIWSable")) {
                this.CIWSable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("CIWSer")) {
                this.CIWSer = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("armorPen")) {
                this.armorPen = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("penDecay")) {
                this.penDecay = (float)(Float.parseFloat(split[1]) * 0.5);
            }
            else if (split[0].equals("ricochetSound")) {
                this.ricochetSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("minorPenSound")) {
                this.minorPenSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("penetrateSound")) {
                this.penetrateSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("overPenSound")) {
                this.overPenSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("APSsound")) {
                this.APSsound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("missNoise")) {
                this.missNoise = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("HEAT")) {
                this.HEAT = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("radarGuided")) {
                this.radarGuided = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Bouncy")) {
                this.Bouncerino = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Hesh")) {
                this.Hesh = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Ghost")) {
                this.Ghost = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("bigWater")) {
                this.bigWater = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("smallWater")) {
                this.smallWater = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("navalMine")) {
                this.navalMine = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("depthCharge")) {
                this.depthCharge = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("activationDepth")) {
                this.activationDepth = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("aftermathFuse")) {
                this.aftermathFuse = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("HitSoundEnable")) {
                this.hitSoundEnable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("EntityHitSoundEnable")) {
                this.entityHitSoundEnable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("HitSound")) {
                this.hitSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "sound", split[1]);
            }
            else if (split[0].equals("HitSoundRange")) {
                this.hitSoundRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Penetrates")) {
                this.penetratingPower = (Boolean.parseBoolean(split[1].toLowerCase()) ? 1.0f : 0.25f);
            }
            else if (split[0].equals("Penetration") || split[0].equals("PenetratingPower")) {
                this.penetratingPower = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DragInAir")) {
                this.dragInAir = Float.parseFloat(split[1]);
                this.dragInAir = ((this.dragInAir < 0.0f) ? 0.0f : ((this.dragInAir > 1.0f) ? 1.0f : this.dragInAir));
            }
            else if (split[0].equals("DragInWater")) {
                this.dragInWater = Float.parseFloat(split[1]);
                this.dragInWater = ((this.dragInWater < 0.0f) ? 0.0f : ((this.dragInWater > 1.0f) ? 1.0f : this.dragInWater));
            }
            else if (split[0].equals("ASWminRange")) {
                this.ASWminRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("seekerRange")) {
                this.seekerRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("NumBullets")) {
                this.numBullets = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Accuracy") || split[0].equals("Spread")) {
                this.bulletSpread = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("LivingProximityTrigger")) {
                this.livingProximityTrigger = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("VehicleProximityTrigger")) {
                this.driveableProximityTrigger = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DamageToTriggerer")) {
                this.damageToTriggerer = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay")) {
                this.primeDelay = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("NumExplodeParticles")) {
                this.explodeParticles = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ExplodeParticles")) {
                this.explodeParticleType = split[1];
            }
            else if (split[0].equals("SmokeTime")) {
                this.smokeTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SmokeParticles")) {
                this.smokeParticleType = split[1];
            }
            else if (split[0].equals("SmokeEffect")) {
                this.smokeEffects.add(InfoType.getPotionEffect(split));
            }
            else if (split[0].equals("SmokeRadius")) {
                this.smokeRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("VLS") || split[0].equals("HasDeadZone")) {
                this.VLS = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("VLSTime") || split[0].equals("DeadZoneTime")) {
                this.VLSTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FixedTrackDirection")) {
                this.fixedDirection = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("GuidedTurnRadius")) {
                this.turnRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("GuidedPhaseSpeed")) {
                this.trackPhaseSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("GuidedPhaseTurnSpeed")) {
                this.trackPhaseTurn = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("BoostParticle")) {
                this.boostPhaseParticle = split[1];
            }
            else if (split[0].equals("Torpedo")) {
                this.torpedo = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("modernTorpedo")) {
                this.modernTorpedo = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("antiRadiation")) {
                this.antiRadiation = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Bomb")) {
                this.weaponType = EnumWeaponType.BOMB;
            }
            else if (split[0].equals("Shell")) {
                this.weaponType = EnumWeaponType.SHELL;
            }
            else if (split[0].equals("jamiogravity")) {
                this.jamiogravity = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Missile")) {
                this.weaponType = EnumWeaponType.MISSILE;
            }
            else if (split[0].equals("WeaponType")) {
                this.weaponType = EnumWeaponType.valueOf(split[1].toUpperCase());
            }
            else if (split[0].equals("HasLight")) {
                this.hasLight = Boolean.parseBoolean(split[1].toLowerCase());
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
            else if (split[0].equals("MaxLockOnAngle")) {
                this.maxLockOnAngle = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("LockOnForce") || split[0].equals("TurningForce")) {
                this.lockOnForce = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MaxDegreeOfLockOnMissile")) {
                this.maxDegreeOfMissile = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("TickStartHoming")) {
                this.tickStartHoming = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("EnableSACLOS")) {
                this.enableSACLOS = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MaxDegreeOFSACLOS")) {
                this.maxDegreeOfSACLOS = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MaxRangeOfMissile")) {
                this.maxRangeOfMissile = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("CanSpotEntityDriveable")) {
                this.canSpotEntityDriveable = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("ShootForSettingPos")) {
                this.shootForSettingPos = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("ShootForSettingPosHeight")) {
                this.shootForSettingPosHeight = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("IsDoTopAttack")) {
                this.isDoTopAttack = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("PotionEffect")) {
                this.hitEffects.add(InfoType.getPotionEffect(split));
            }
            else if (split[0].equals("ManualGuidance")) {
                this.manualGuidance = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("LockOnFuse")) {
                this.lockOnFuse = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MaxRange")) {
                this.maxRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SwordEnergy")) {
                this.swordEnergy = Boolean.parseBoolean(split[1].toLowerCase());
                this.penetratingPower = 9000.0f;
                this.tickStartHoming = 1;
                this.lockOnForce = 300.0f;
                this.maxLockOnAngle = 90.0f;
                this.lockOnToPlayers = true;
                this.lockOnToLivings = true;
                this.seekerRange = 3.0f;
                this.barelypenPenalty = 0.5f;
                this.nonpenPenalty = 0.25f;
            }
            else if (split[0].equals("nonpenPenalty")) {
                this.nonpenPenalty = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("barelypenPenalty")) {
                this.barelypenPenalty = Float.parseFloat(split[1]);
            }
        }
        catch (final Exception e) {
            System.out.println("Reading bullet file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    public static BulletType getBullet(final String s) {
        for (final BulletType bullet : BulletType.bullets) {
            if (bullet.shortName.equals(s)) {
                return bullet;
            }
        }
        return null;
    }
    
    public static BulletType getBullet(final Item item) {
        for (final BulletType bullet : BulletType.bullets) {
            if (bullet.item == item) {
                return bullet;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelBase.class);
    }
    
    static {
        BulletType.bullets = new ArrayList<BulletType>();
    }
}
