// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import java.util.HashMap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import com.flansmod.common.types.InfoType;

public abstract class ShootableType extends InfoType
{
    @SideOnly(Side.CLIENT)
    public ModelBase model;
    public ModelBase launcherMesh;
    public boolean wingVisible;
    public boolean trailParticles;
    public String trailParticleType;
    public int maxStackSize;
    public String dropItemOnReload;
    public String dropItemOnShoot;
    public String dropItemOnHit;
    public int roundsPerItem;
    public float fallSpeed;
    public float throwSpeed;
    public float hitBoxSize;
    public float damageVsPlayer;
    public float damageVsEntity;
    public float damageVsLiving;
    public float damageVsVehicles;
    public float damageVsPlanes;
    public boolean readDamageVsPlayer;
    public boolean readDamageVsEntity;
    public boolean readDamageVsPlanes;
    public boolean missileRadarVisible;
    public boolean breaksGlass;
    public float ignoreArmorProbability;
    public float ignoreArmorDamageFactor;
    public float speedMultiplier;
    public float bleedMultiplier;
    public float bodyarmorPen;
    public float dynamicBodyarmorPen;
    public int fuse;
    public int despawnTime;
    public boolean explodeOnImpact;
    public float fireRadius;
    public float explosionRadius;
    public float classicExplosionRadius;
    public boolean explosionBreaksBlocks;
    public float explosionDamageVsLiving;
    public float explosionDamageVsPlayer;
    public float explosionDamageVsPlane;
    public float explosionDamageVsVehicle;
    public String dropItemOnDetonate;
    public String detonateSound;
    public boolean hasSubmunitions;
    public String submunition;
    public int numSubmunitions;
    public int subMunitionTimer;
    public float submunitionSpread;
    public boolean destroyOnDeploySubmunition;
    public int smokeParticleCount;
    public int debrisParticleCount;
    public static HashMap<String, ShootableType> shootables;
    
    public ShootableType(final TypeFile file) {
        super(file);
        this.wingVisible = false;
        this.trailParticles = false;
        this.trailParticleType = "smoke";
        this.maxStackSize = 1;
        this.dropItemOnReload = null;
        this.dropItemOnShoot = null;
        this.dropItemOnHit = null;
        this.roundsPerItem = 1;
        this.fallSpeed = 1.0f;
        this.throwSpeed = 1.0f;
        this.hitBoxSize = 0.5f;
        this.damageVsPlayer = 1.0f;
        this.damageVsEntity = 1.0f;
        this.damageVsLiving = 1.0f;
        this.damageVsVehicles = 1.0f;
        this.damageVsPlanes = 1.0f;
        this.readDamageVsPlayer = false;
        this.readDamageVsEntity = false;
        this.readDamageVsPlanes = false;
        this.missileRadarVisible = false;
        this.breaksGlass = false;
        this.ignoreArmorProbability = 0.0f;
        this.ignoreArmorDamageFactor = 0.0f;
        this.speedMultiplier = 1.0f;
        this.bleedMultiplier = 1.0f;
        this.bodyarmorPen = 500.0f;
        this.dynamicBodyarmorPen = 250.0f;
        this.fuse = 0;
        this.despawnTime = 0;
        this.explodeOnImpact = false;
        this.fireRadius = 0.0f;
        this.explosionRadius = 0.0f;
        this.classicExplosionRadius = 0.0f;
        this.explosionBreaksBlocks = true;
        this.explosionDamageVsLiving = 1.0f;
        this.explosionDamageVsPlayer = 1.0f;
        this.explosionDamageVsPlane = 1.0f;
        this.explosionDamageVsVehicle = 1.0f;
        this.dropItemOnDetonate = null;
        this.detonateSound = "";
        this.hasSubmunitions = false;
        this.submunition = "";
        this.numSubmunitions = 0;
        this.subMunitionTimer = 0;
        this.submunitionSpread = 1.0f;
        this.destroyOnDeploySubmunition = false;
        this.smokeParticleCount = 0;
        this.debrisParticleCount = 0;
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    public void postRead(final TypeFile file) {
        if (ShootableType.shootables.containsKey(this.shortName)) {
            FlansMod.log("Error : " + this.shortName + " reduplicated");
        }
        ShootableType.shootables.put(this.shortName, this);
        if (!this.readDamageVsPlayer) {
            this.damageVsPlayer = this.damageVsLiving;
        }
        if (!this.readDamageVsEntity) {
            this.damageVsEntity = this.damageVsVehicles;
        }
        if (!this.readDamageVsPlanes) {
            this.damageVsPlanes = this.damageVsVehicles;
        }
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelBase.class);
            }
            else if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("launcherMesh")) {
                this.launcherMesh = FlansMod.proxy.loadModel(split[1], this.shortName, ModelBase.class);
            }
            else if (split[0].equals("LauncherSkin")) {
                this.LauncherSkin = split[1];
            }
            else if (split[0].equals("StackSize") || split[0].equals("MaxStackSize")) {
                this.maxStackSize = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DropItemOnShoot")) {
                this.dropItemOnShoot = split[1];
            }
            else if (split[0].equals("DropItemOnReload")) {
                this.dropItemOnReload = split[1];
            }
            else if (split[0].equals("DropItemOnHit")) {
                this.dropItemOnHit = split[1];
            }
            else if (split[0].equals("RoundsPerItem")) {
                this.roundsPerItem = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("missileRadarVisible")) {
                this.missileRadarVisible = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("speedMultiplier")) {
                this.speedMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("armPen")) {
                this.bodyarmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("headPen")) {
                this.bodyarmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("bodyPen")) {
                this.bodyarmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("bodyArmorPen")) {
                this.bodyarmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("dynamicBodyArmorPen")) {
                this.dynamicBodyarmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("bleedMultiplier")) {
                this.bleedMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FallSpeed")) {
                this.fallSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ThrowSpeed") || split[0].equals("ShootSpeed")) {
                this.throwSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("HitBoxSize")) {
                this.hitBoxSize = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DamageVsLiving")) {
                this.damageVsLiving = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DamageVsPlayer")) {
                this.damageVsPlayer = Float.parseFloat(split[1]);
                this.readDamageVsPlayer = true;
            }
            else if (split[0].equals("DamageVsEntity")) {
                this.damageVsEntity = Float.parseFloat(split[1]);
                this.readDamageVsEntity = true;
            }
            else if (split[0].equals("DamageVsVehicles")) {
                this.damageVsVehicles = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DamageVsPlanes")) {
                this.damageVsPlanes = Float.parseFloat(split[1]);
                this.readDamageVsPlanes = true;
            }
            else if (split[0].equals("IgnoreArmorProbability")) {
                this.ignoreArmorProbability = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("IgnoreArmorDamageFactor")) {
                this.ignoreArmorDamageFactor = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("BreaksGlass")) {
                this.breaksGlass = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("wingVisible")) {
                this.wingVisible = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Fuse")) {
                this.fuse = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DespawnTime")) {
                this.despawnTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("CringeExplodeOnImpact") || split[0].equals("CringeDetonateOnImpact")) {
                this.explodeOnImpact = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("FireRadius") || split[0].equals("Fire")) {
                this.fireRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ExplosionRadius") || split[0].equals("Explosion")) {
                this.explosionRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("classicExplosionRadius") || split[0].equals("classicExplosion")) {
                this.classicExplosionRadius = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ExplosionBreaksBlocks")) {
                this.explosionBreaksBlocks = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("ExplosionDamageVsLiving")) {
                this.explosionDamageVsLiving = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ExplosionDamageVsPlayer")) {
                this.explosionDamageVsPlayer = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ExplosionDamageVsPlane")) {
                this.explosionDamageVsPlane = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ExplosionDamageVsVehicle")) {
                this.explosionDamageVsVehicle = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DropItemOnDetonate")) {
                this.dropItemOnDetonate = split[1];
            }
            else if (split[0].equals("DetonateSound")) {
                this.detonateSound = split[1];
            }
            else if (split[0].equals("HasSubmunitions")) {
                this.hasSubmunitions = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("Submunition")) {
                this.submunition = split[1];
            }
            else if (split[0].equals("NumSubmunitions")) {
                this.numSubmunitions = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SubmunitionDelay")) {
                this.subMunitionTimer = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SubmunitionSpread")) {
                this.submunitionSpread = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FlareParticleCount")) {
                this.smokeParticleCount = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DebrisParticleCount")) {
                this.debrisParticleCount = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("smokeParticleCount")) {
                this.smokeParticleCount = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("TrailParticles") || split[0].equals("SmokeTrail")) {
                this.trailParticles = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("TrailParticleType")) {
                this.trailParticleType = split[1];
            }
            else if (split[0].equals("SwordEnergy")) {
                this.fuse *= 4;
                this.hitBoxSize *= 0.7f;
            }
        }
        catch (final Exception e) {
            if (split != null) {
                String msg = " : ";
                for (final String s : split) {
                    msg = msg + " " + s;
                }
                System.out.println("Reading grenade file failed. " + file.name + msg);
            }
            else {
                System.out.println("Reading grenade file failed. " + file.name);
            }
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    public static ShootableType getShootableType(final String string) {
        return ShootableType.shootables.get(string);
    }
    
    @Override
    public float GetRecommendedScale() {
        return 0.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return this.model;
    }
    
    static {
        ShootableType.shootables = new HashMap<String, ShootableType>();
    }
}
