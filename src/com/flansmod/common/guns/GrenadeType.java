// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.client.model.ModelBase;
import java.util.Iterator;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import net.minecraft.potion.PotionEffect;
import java.util.ArrayList;

public class GrenadeType extends ShootableType
{
    public static ArrayList<GrenadeType> grenades;
    public int meleeDamage;
    public int throwDelay;
    public String throwSound;
    public String dropItemOnThrow;
    public boolean canThrow;
    public float bounciness;
    public boolean penetratesEntities;
    public boolean penetratesBlocks;
    public String bounceSound;
    public boolean sticky;
    public boolean stickToThrower;
    public boolean stickToEntity;
    public boolean stickToDriveable;
    public boolean stickToEntityAfter;
    public boolean allowStickSound;
    public int stickSoundRange;
    public String stickSound;
    public boolean flashBang;
    public boolean pumpkinRaid;
    public int flashTime;
    public int flashRange;
    public boolean flashSoundEnable;
    public int flashSoundRange;
    public String flashSound;
    public boolean flashDamageEnable;
    public float flashDamage;
    public boolean flashEffects;
    public int flashEffectsID;
    public int flashEffectsDuration;
    public int flashEffectsLevel;
    public boolean motionSensor;
    public float motionSensorRange;
    public float motionSoundRange;
    public String motionSound;
    public int motionTime;
    public float livingProximityTrigger;
    public float driveableProximityTrigger;
    public boolean detonateWhenShot;
    public boolean remote;
    public float damageToTriggerer;
    public int primeDelay;
    public int explodeParticles;
    public String explodeParticleType;
    public boolean spinWhenThrown;
    public int smokeTime;
    public String smokeParticleType;
    public ArrayList<PotionEffect> smokeEffects;
    public float smokeRadius;
    public boolean isDeployableBag;
    public int numUses;
    public float healAmount;
    public ArrayList<PotionEffect> potionEffects;
    public int numClips;
    public boolean smokerino;
    public boolean angel;
    public float angelDamage;
    public float angelSpeed;
    
    public GrenadeType(final TypeFile file) {
        super(file);
        this.meleeDamage = 1;
        this.throwDelay = 0;
        this.throwSound = "";
        this.dropItemOnThrow = null;
        this.canThrow = true;
        this.bounciness = 0.9f;
        this.penetratesEntities = false;
        this.penetratesBlocks = false;
        this.bounceSound = "";
        this.sticky = false;
        this.stickToThrower = false;
        this.stickToEntity = false;
        this.stickToDriveable = false;
        this.stickToEntityAfter = false;
        this.allowStickSound = false;
        this.stickSoundRange = 10;
        this.flashBang = false;
        this.pumpkinRaid = false;
        this.flashTime = 200;
        this.flashRange = 8;
        this.flashSoundEnable = false;
        this.flashSoundRange = 16;
        this.flashDamageEnable = false;
        this.flashEffects = false;
        this.motionSensor = false;
        this.motionSensorRange = 5.0f;
        this.motionSoundRange = 20.0f;
        this.motionTime = 20;
        this.livingProximityTrigger = -1.0f;
        this.driveableProximityTrigger = -1.0f;
        this.detonateWhenShot = false;
        this.remote = false;
        this.damageToTriggerer = 0.0f;
        this.primeDelay = 0;
        this.explodeParticles = 0;
        this.explodeParticleType = "largesmoke";
        this.spinWhenThrown = true;
        this.smokeTime = 0;
        this.smokeParticleType = "explode";
        this.smokeEffects = new ArrayList<PotionEffect>();
        this.smokeRadius = 5.0f;
        this.isDeployableBag = false;
        this.numUses = 1;
        this.healAmount = 0.0f;
        this.potionEffects = new ArrayList<PotionEffect>();
        this.numClips = 0;
        this.smokerino = false;
        this.angel = false;
        GrenadeType.grenades.add(this);
    }
    
    @Override
    protected void preRead(final TypeFile file) {
        super.preRead(file);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("MeleeDamage")) {
                this.meleeDamage = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("smokerino")) {
                this.smokerino = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ThrowDelay")) {
                this.throwDelay = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ThrowSound")) {
                this.throwSound = split[1];
            }
            else if (split[0].equals("DropItemOnThrow")) {
                this.dropItemOnThrow = split[1];
            }
            else if (split[0].equals("CanThrow")) {
                this.canThrow = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Bounciness")) {
                this.bounciness = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("PenetratesEntities")) {
                this.penetratesEntities = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("PenetratesBlocks")) {
                this.penetratesBlocks = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("PumpkinRaid")) {
                this.pumpkinRaid = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("BounceSound")) {
                this.bounceSound = split[1];
            }
            else if (split[0].equals("Sticky")) {
                this.sticky = Boolean.parseBoolean(split[1]);
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
            else if (split[0].equals("DetonateWhenShot")) {
                this.detonateWhenShot = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay")) {
                this.primeDelay = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("StickToThrower")) {
                this.stickToThrower = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("StickToEntity")) {
                this.stickToEntity = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("StickToDriveable")) {
                this.stickToDriveable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("StickToEntityAfter")) {
                this.stickToEntityAfter = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("AllowStickSound")) {
                this.allowStickSound = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("StickSoundRange")) {
                this.stickSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("StickSound")) {
                this.stickSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "sound", split[1]);
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
            else if (split[0].equals("SpinWhenThrown")) {
                this.spinWhenThrown = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Remote")) {
                this.remote = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("FlashBang")) {
                this.flashBang = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("FlashTime")) {
                this.flashTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlashRange")) {
                this.flashRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlashSoundEnable")) {
                this.flashSoundEnable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("FlashSoundRange")) {
                this.flashSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlashSound")) {
                this.flashSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "sound", split[1]);
            }
            else if (split[0].equals("FlashDamageEnable")) {
                this.flashDamageEnable = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("FlashDamage")) {
                this.flashDamage = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FlashEffects")) {
                this.flashEffects = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("FlashEffectsID")) {
                this.flashEffectsID = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlashEffectsDuration")) {
                this.flashEffectsDuration = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("FlashEffectsLevel")) {
                this.flashEffectsLevel = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MotionSensor")) {
                this.motionSensor = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MotionSensorRange")) {
                this.motionSensorRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MotionSoundRange")) {
                this.motionSoundRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MotionSound")) {
                this.motionSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "sound", split[1]);
            }
            else if (split[0].equals("MotionTime")) {
                this.motionTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DeployableBag")) {
                this.isDeployableBag = true;
            }
            else if (split[0].equals("NumUses")) {
                this.numUses = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("HealAmount")) {
                this.healAmount = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("AddPotionEffect") || split[0].equals("PotionEffect")) {
                this.potionEffects.add(InfoType.getPotionEffect(split));
            }
            else if (split[0].equals("NumClips")) {
                this.numClips = Integer.parseInt(split[1]);
            }
        }
        catch (final Exception e) {
            System.out.println("Reading grenade file failed.");
            e.printStackTrace();
        }
    }
    
    public static GrenadeType getGrenade(final String s) {
        for (final GrenadeType grenade : GrenadeType.grenades) {
            if (grenade.shortName.equals(s)) {
                return grenade;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelBase.class);
    }
    
    static {
        GrenadeType.grenades = new ArrayList<GrenadeType>();
    }
}
