// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.client.model.ModelBase;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import java.util.HashMap;
import com.flansmod.client.model.ModelFlash;
import com.flansmod.client.model.ModelCasing;
import com.flansmod.client.model.ModelGun;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.model.ModelMG;
import net.minecraft.item.EnumAction;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.flansmod.common.paintjob.PaintableType;

public class GunType extends PaintableType implements IScope
{
    public static final Random rand;
    public List<ShootableType> ammo;
    public boolean canForceReload;
    public boolean canBlock;
    public boolean matchlock;
    public boolean RepeatingGun;
    public boolean OldGun;
    public boolean Heavy;
    public boolean Bow;
    public boolean shootMelee;
    public boolean spear;
    public int drawTime;
    public String actionSound;
    public int reloadTime;
    public float recoilPitch;
    public float recoilYaw;
    public float rndRecoilPitchRange;
    public float rndRecoilYawRange;
    public float decreaseRecoilPitch;
    public float decreaseRecoilYaw;
    public float bulletSpread;
    public float sneakSpreadMultiplier;
    public float sprintSpreadMultiplier;
    public boolean allowSpreadByBullet;
    public float damage;
    public float meleeDamage;
    public float bulletSpeed;
    public int numBullets;
    public boolean allowNumBulletsByBulletType;
    public float shootDelay;
    public int numPrimaryAmmoItems;
    public EnumFireMode mode;
    public EnumFireMode[] submode;
    public EnumFireMode defaultmode;
    public int numBurstRounds;
    public int minigunStartSpeed;
    public boolean canShootUnderwater;
    public float knockback;
    public EnumSecondaryFunction secondaryFunction;
    public EnumSecondaryFunction secondaryFunctionWhenShoot;
    public boolean oneHanded;
    public int labigunLimit;
    public boolean labigunDelay;
    public boolean consumeGunUponUse;
    public boolean showCrosshair;
    public String dropItemOnShoot;
    public int meleeTime;
    public ArrayList<Vector3f> meleePath;
    public ArrayList<Vector3f> meleePathAngles;
    public ArrayList<Vector3f> meleeDamagePoints;
    public int meleeLeftTime;
    public float swordArmorPen;
    public float Xoffset;
    public float Yoffset;
    public float Zoffset;
    public ArrayList<Vector3f> meleeLeftPath;
    public ArrayList<Vector3f> meleeLeftPathAngles;
    public ArrayList<Vector3f> meleeLeftDamagePoints;
    public boolean meleeLeft;
    public int meleeRightTime;
    public ArrayList<Vector3f> meleeRightPath;
    public ArrayList<Vector3f> meleeRightPathAngles;
    public ArrayList<Vector3f> meleeRightDamagePoints;
    public boolean meleeRight;
    public String bulletInsert;
    public int meleeDownTime;
    public ArrayList<Vector3f> meleeDownPath;
    public ArrayList<Vector3f> meleeDownPathAngles;
    public ArrayList<Vector3f> meleeDownDamagePoints;
    public boolean meleeDown;
    public boolean usableByPlayers;
    public boolean usableByMechas;
    public EnumAction itemUseAction;
    public int canLockOnAngle;
    public int lockOnSoundTime;
    public String lockOnSound;
    public int maxRangeLockOn;
    public boolean canSetPosition;
    public boolean lance;
    public boolean lockOnToPlanes;
    public boolean lockOnToVehicles;
    public boolean lockOnToMechas;
    public boolean lockOnToPlayers;
    public boolean lockOnToLivings;
    public boolean showAttachments;
    public boolean showDamage;
    public boolean showRecoil;
    public boolean showSpread;
    public boolean showReloadTime;
    public boolean shield;
    public Vector3f shieldOrigin;
    public Vector3f shieldDimensions;
    public float shieldDamageAbsorption;
    public String shootSound;
    public String distantShootSound;
    public String lastShootSound;
    public String suppressedShootSound;
    public int shootSoundLength;
    public boolean distortSound;
    public String reloadSound;
    public String reloadSoundOnEmpty;
    public String clickSoundOnEmpty;
    public int idleSoundRange;
    public int meleeSoundRange;
    public int reloadSoundRange;
    public int gunSoundRange;
    public int distantSoundRange;
    public boolean useLoopingSounds;
    public String warmupSound;
    public int warmupSoundLength;
    public String loopedSound;
    public int loopedSoundLength;
    public String cooldownSound;
    public String meleeSound;
    public String meleeHitSound;
    public String ShieldHitSound;
    public String idleSound;
    public int idleSoundLength;
    public boolean deployable;
    @SideOnly(Side.CLIENT)
    public ModelMG deployableModel;
    public String deployableTexture;
    public float standBackDist;
    public float topViewLimit;
    public float bottomViewLimit;
    public float sideViewLimit;
    public float pivotHeight;
    public String defaultScopeTexture;
    public boolean hasScopeOverlay;
    public float zoomLevel;
    public float FOVFactor;
    public boolean allowNightVision;
    @SideOnly(Side.CLIENT)
    public ModelGun model;
    public float modelScale;
    public ModelCasing casingModel;
    public ModelFlash flashModel;
    public String casingTexture;
    public String flashTexture;
    public String hitTexture;
    public boolean allowAllAttachments;
    public ArrayList<AttachmentType> allowedAttachments;
    public boolean allowBarrelAttachments;
    public boolean allowScopeAttachments;
    public boolean allowStockAttachments;
    public boolean allowGripAttachments;
    public boolean allowGadgetAttachments;
    public boolean allowSlideAttachments;
    public boolean allowPumpAttachments;
    public boolean allowAccessoryAttachments;
    public int numGenericAttachmentSlots;
    public static HashMap<String, GunType> guns;
    public static ArrayList<GunType> gunList;
    public float moveSpeedModifier;
    public float knockbackModifier;
    private float defaultSpread;
    public boolean sidearm;
    public int blockTime;
    public float dillZoomModifier;
    public float dillElevator;
    public float recoilElevator;
    public float sustainedelevator;
    public float firstShotRecoil;
    public float sustainedRecoilPitch;
    public float sustainedRecoilYaw;
    public float muzzleOffset;
    public String muzzleParticle;
    public int muzzleParticleCount;
    public boolean muzzleParticleHave;
    
    public GunType(final TypeFile file) {
        super(file);
        this.ammo = new ArrayList<ShootableType>();
        this.canForceReload = true;
        this.canBlock = false;
        this.matchlock = false;
        this.RepeatingGun = false;
        this.OldGun = false;
        this.Heavy = false;
        this.Bow = false;
        this.shootMelee = false;
        this.spear = false;
        this.drawTime = 30;
        this.recoilPitch = 0.0f;
        this.recoilYaw = 0.0f;
        this.rndRecoilPitchRange = 1.0f;
        this.rndRecoilYawRange = 1.0f;
        this.decreaseRecoilPitch = 1.0f;
        this.decreaseRecoilYaw = 1.0f;
        this.sneakSpreadMultiplier = 0.63f;
        this.sprintSpreadMultiplier = 1.75f;
        this.allowSpreadByBullet = false;
        this.damage = 0.0f;
        this.meleeDamage = 1.0f;
        this.bulletSpeed = 5.0f;
        this.numBullets = 1;
        this.allowNumBulletsByBulletType = false;
        this.shootDelay = 0.0f;
        this.numPrimaryAmmoItems = 1;
        this.mode = EnumFireMode.FULLAUTO;
        this.submode = new EnumFireMode[] { EnumFireMode.FULLAUTO };
        this.defaultmode = this.mode;
        this.numBurstRounds = 3;
        this.minigunStartSpeed = 15;
        this.canShootUnderwater = true;
        this.knockback = 0.0f;
        this.secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
        this.secondaryFunctionWhenShoot = null;
        this.oneHanded = false;
        this.labigunLimit = 0;
        this.labigunDelay = false;
        this.consumeGunUponUse = false;
        this.showCrosshair = true;
        this.dropItemOnShoot = null;
        this.meleeTime = 1;
        this.meleePath = new ArrayList<Vector3f>();
        this.meleePathAngles = new ArrayList<Vector3f>();
        this.meleeDamagePoints = new ArrayList<Vector3f>();
        this.meleeLeftTime = 1;
        this.swordArmorPen = 10.0f;
        this.Xoffset = -0.05f;
        this.Yoffset = -0.015f;
        this.Zoffset = 0.05f;
        this.meleeLeftPath = new ArrayList<Vector3f>();
        this.meleeLeftPathAngles = new ArrayList<Vector3f>();
        this.meleeLeftDamagePoints = new ArrayList<Vector3f>();
        this.meleeLeft = false;
        this.meleeRightTime = 1;
        this.meleeRightPath = new ArrayList<Vector3f>();
        this.meleeRightPathAngles = new ArrayList<Vector3f>();
        this.meleeRightDamagePoints = new ArrayList<Vector3f>();
        this.meleeRight = false;
        this.bulletInsert = "defaultshellinsert";
        this.meleeDownTime = 1;
        this.meleeDownPath = new ArrayList<Vector3f>();
        this.meleeDownPathAngles = new ArrayList<Vector3f>();
        this.meleeDownDamagePoints = new ArrayList<Vector3f>();
        this.meleeDown = false;
        this.usableByPlayers = true;
        this.usableByMechas = true;
        this.itemUseAction = EnumAction.bow;
        this.canLockOnAngle = 5;
        this.lockOnSoundTime = 0;
        this.lockOnSound = "";
        this.maxRangeLockOn = 80;
        this.canSetPosition = false;
        this.lance = false;
        this.lockOnToPlanes = false;
        this.lockOnToVehicles = false;
        this.lockOnToMechas = false;
        this.lockOnToPlayers = false;
        this.lockOnToLivings = false;
        this.showAttachments = true;
        this.showDamage = false;
        this.showRecoil = false;
        this.showSpread = false;
        this.showReloadTime = false;
        this.shield = false;
        this.shieldDamageAbsorption = 0.1f;
        this.distortSound = true;
        this.idleSoundRange = 50;
        this.meleeSoundRange = 50;
        this.reloadSoundRange = 50;
        this.gunSoundRange = 50;
        this.distantSoundRange = 200;
        this.useLoopingSounds = false;
        this.warmupSoundLength = 20;
        this.loopedSoundLength = 20;
        this.deployable = false;
        this.standBackDist = 1.5f;
        this.topViewLimit = -60.0f;
        this.bottomViewLimit = 30.0f;
        this.sideViewLimit = 45.0f;
        this.pivotHeight = 0.375f;
        this.hasScopeOverlay = false;
        this.zoomLevel = 1.0f;
        this.FOVFactor = 1.5f;
        this.allowNightVision = false;
        this.modelScale = 1.0f;
        this.allowAllAttachments = false;
        this.allowedAttachments = new ArrayList<AttachmentType>();
        this.allowBarrelAttachments = false;
        this.allowScopeAttachments = false;
        this.allowStockAttachments = false;
        this.allowGripAttachments = false;
        this.allowGadgetAttachments = false;
        this.allowSlideAttachments = false;
        this.allowPumpAttachments = false;
        this.allowAccessoryAttachments = false;
        this.numGenericAttachmentSlots = 0;
        this.moveSpeedModifier = 1.0f;
        this.knockbackModifier = 0.0f;
        this.defaultSpread = 0.0f;
        this.sidearm = false;
        this.blockTime = 100;
        this.dillZoomModifier = 1.0f;
        this.dillElevator = 1.0f;
        this.recoilElevator = 0.0f;
        this.sustainedelevator = 0.25f;
        this.firstShotRecoil = 0.1f;
        this.sustainedRecoilPitch = 1.0f;
        this.sustainedRecoilYaw = 1.0f;
        this.muzzleOffset = 5.0f;
        this.muzzleParticle = "smallSmoke";
        this.muzzleParticleCount = 7;
        this.muzzleParticleHave = false;
    }
    
    @Override
    public void preRead(final TypeFile file) {
        super.preRead(file);
    }
    
    @Override
    public void postRead(final TypeFile file) {
        super.postRead(file);
        GunType.gunList.add(this);
        GunType.guns.put(this.shortName, this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("Damage")) {
                this.damage = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MeleeDamaged")) {
                this.meleeDamage = Float.parseFloat(split[1]);
                if (this.meleeDamage > 0.5f) {
                    this.secondaryFunction = EnumSecondaryFunction.MELEE;
                }
            }
            else if (split[0].equals("dillZoomModifier")) {
                this.dillZoomModifier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("dillElevator")) {
                this.dillElevator = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("muzzleParticleHave")) {
                this.muzzleParticleHave = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("muzzleOffset")) {
                this.muzzleOffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("muzzleParticleCount")) {
                this.muzzleParticleCount = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("muzzleParticle")) {
                this.muzzleParticle = split[1];
            }
            else if (split[0].equals("Xoffset")) {
                this.Xoffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Yoffset")) {
                this.Yoffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Zoffset")) {
                this.Zoffset = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("recoilElevator")) {
                this.recoilElevator = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("sustainedelevator")) {
                this.sustainedelevator = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("firstShotRecoil")) {
                this.firstShotRecoil = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("sustainedRecoilPitch")) {
                this.sustainedRecoilPitch = 0.3f * Float.parseFloat(split[1]);
            }
            else if (split[0].equals("sustainedRecoilYaw")) {
                this.sustainedRecoilYaw = 0.3f * Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CanForceReload")) {
                this.canForceReload = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("ReloadTime")) {
                this.reloadTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("Recoil")) {
                this.recoilPitch = 0.3f * Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RecoilYaw")) {
                this.recoilYaw = 0.3f * Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RandomRecoilRange")) {
                this.rndRecoilPitchRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RandomRecoilYawRange")) {
                this.rndRecoilYawRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DecreaseRecoil")) {
                this.decreaseRecoilPitch = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DecreaseRecoilYaw")) {
                this.decreaseRecoilYaw = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Knockback")) {
                this.knockback = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Accuracy") || split[0].equals("Spread")) {
                final float float1 = Float.parseFloat(split[1]);
                this.bulletSpread = float1;
                this.defaultSpread = float1;
            }
            else if (split[0].equals("SneakSpreadModifier")) {
                this.sneakSpreadMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("SprintSpreadModifier")) {
                this.sprintSpreadMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("NumBullets")) {
                this.numBullets = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AllowNumBulletsByBulletType")) {
                this.allowNumBulletsByBulletType = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("AllowSpreadByBullet")) {
                this.allowSpreadByBullet = Boolean.parseBoolean(split[1]);
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
            else if (split[0].equals("sidearm")) {
                this.sidearm = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("ConsumeGunOnUse")) {
                this.consumeGunUponUse = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShowCrosshair")) {
                this.showCrosshair = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("DropItemOnShoot")) {
                this.dropItemOnShoot = split[1];
            }
            else if (split[0].equals("NumBurstRounds")) {
                this.numBurstRounds = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MinigunStartSpeed")) {
                this.minigunStartSpeed = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ItemUseAction")) {
                this.itemUseAction = EnumAction.valueOf(split[1].toLowerCase());
            }
            else if (split[0].equals("MaxRangeLockOn")) {
                this.maxRangeLockOn = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ShowAttachments")) {
                this.showAttachments = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShowDamage")) {
                this.showDamage = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShowRecoil")) {
                this.showRecoil = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShowAccuracy")) {
                this.showSpread = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShowReloadTime")) {
                this.showReloadTime = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ShootDelay")) {
                this.shootDelay = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RPM")) {
                this.shootDelay = 20.0f / (Float.parseFloat(split[1]) / 60.0f);
            }
            else if (split[0].equals("SoundLength")) {
                this.shootSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("DistortSound")) {
                this.distortSound = split[1].equals("True");
            }
            else if (split[0].equals("IdleSoundRange")) {
                this.idleSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MeleeSoundRange")) {
                this.meleeSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ReloadSoundRange")) {
                this.reloadSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("GunSoundRange")) {
                this.gunSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("distantSoundRange")) {
                this.distantSoundRange = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ShootSound")) {
                this.shootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("distantShootSound")) {
                this.distantShootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("LastShootSound")) {
                this.lastShootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("SuppressedShootSound")) {
                this.suppressedShootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("ReloadSound")) {
                this.reloadSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("EmptyReloadSound")) {
                this.reloadSoundOnEmpty = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("EmptyClickSound")) {
                this.clickSoundOnEmpty = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("IdleSound")) {
                this.idleSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("IdleSoundLength")) {
                this.idleSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("MeleeSound")) {
                this.meleeSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("MeleeHitSound")) {
                this.meleeHitSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("ShieldHitSound")) {
                this.ShieldHitSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("WarmupSound")) {
                this.warmupSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("WarmupSoundLength")) {
                this.warmupSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("LoopedSound") || split[0].equals("SpinSound")) {
                this.loopedSound = split[1];
                this.useLoopingSounds = true;
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("LoopedSoundLength") || split[0].equals("SpinSoundLength")) {
                this.loopedSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("CooldownSound")) {
                this.cooldownSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("LockOnSound")) {
                this.lockOnSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("Mode")) {
                this.mode = EnumFireMode.getFireMode(split[1]);
                this.defaultmode = this.mode;
                this.submode = new EnumFireMode[split.length - 1];
                for (int i = 0; i < this.submode.length; ++i) {
                    this.submode[i] = EnumFireMode.getFireMode(split[1 + i]);
                }
            }
            else if (split[0].equals("Scope")) {
                this.hasScopeOverlay = true;
                if (split[1].equals("None")) {
                    this.hasScopeOverlay = false;
                }
                else {
                    this.defaultScopeTexture = split[1];
                }
            }
            else if (split[0].equals("AllowNightVision")) {
                this.allowNightVision = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("ZoomLevel")) {
                this.zoomLevel = Float.parseFloat(split[1]);
                if (this.zoomLevel > 1.0f) {
                    this.secondaryFunction = EnumSecondaryFunction.ZOOM;
                }
            }
            else if (split[0].equals("FOVZoomLevel")) {
                this.FOVFactor = Float.parseFloat(split[1]);
                if (this.FOVFactor > 1.0f) {
                    this.secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
                }
            }
            else if (split[0].equals("Deployable")) {
                this.deployable = split[1].equals("True");
            }
            else if (FMLCommonHandler.instance().getSide().isClient() && this.deployable && split[0].equals("DeployedModel")) {
                this.deployableModel = FlansMod.proxy.loadModel(split[1], this.shortName, ModelMG.class);
            }
            else if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelGun.class);
            }
            else if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("CasingModel")) {
                this.casingModel = FlansMod.proxy.loadModel(split[1], this.shortName, ModelCasing.class);
            }
            else if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("FlashModel")) {
                this.flashModel = FlansMod.proxy.loadModel(split[1], this.shortName, ModelFlash.class);
            }
            else if (split[0].equals("CasingTexture")) {
                this.casingTexture = split[1];
            }
            else if (split[0].equals("FlashTexture")) {
                this.flashTexture = split[1];
            }
            else if (split[0].equals("ModelScale")) {
                this.modelScale = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            else if (split[0].equals("HitTexture")) {
                this.hitTexture = split[1];
            }
            else if (split[0].equals("DeployedTexture")) {
                this.deployableTexture = split[1];
            }
            else if (split[0].equals("StandBackDistance")) {
                this.standBackDist = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("TopViewLimit")) {
                this.topViewLimit = -Float.parseFloat(split[1]);
            }
            else if (split[0].equals("BottomViewLimit")) {
                this.bottomViewLimit = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("SideViewLimit")) {
                this.sideViewLimit = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("PivotHeight")) {
                this.pivotHeight = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Ammo")) {
                final ShootableType type = ShootableType.getShootableType(split[1]);
                if (type != null) {
                    this.ammo.add(type);
                }
            }
            else if (split[0].equals("NumAmmoSlots") || split[0].equals("NumAmmoItemsInGun") || split[0].equals("LoadIntoGun")) {
                this.numPrimaryAmmoItems = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("BulletSpeed")) {
                this.bulletSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("CanShootUnderwater")) {
                this.canShootUnderwater = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("CanSetPosition")) {
                this.canSetPosition = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("OneHanded")) {
                this.oneHanded = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("SecondaryFunction")) {
                this.secondaryFunction = EnumSecondaryFunction.get(split[1]);
            }
            else if (split[0].equals("UsableByPlayers")) {
                this.usableByPlayers = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("UsableByMechas")) {
                this.usableByMechas = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("UseCustomMelee") && Boolean.parseBoolean(split[1])) {
                this.secondaryFunction = EnumSecondaryFunction.CUSTOM_MELEE;
            }
            else if (split[0].equals("UseCustomMeleeWhenShoot") && Boolean.parseBoolean(split[1])) {
                this.secondaryFunctionWhenShoot = EnumSecondaryFunction.CUSTOM_MELEE;
            }
            else if (split[0].equals("MeleeTime")) {
                this.meleeTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("swordArmorPen") || split[0].equals("swordArmorPen")) {
                this.swordArmorPen = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MeleeLeftTime")) {
                this.meleeLeftTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AddLeftNode")) {
                this.meleeLeftPath.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
                this.meleeLeftPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            }
            else if (split[0].equals("meleeLeft")) {
                this.meleeLeft = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("spear")) {
                this.spear = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MeleeLeftDamagePoint") || split[0].equals("MeleeLeftDamageOffset")) {
                this.meleeLeftDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
            }
            else if (split[0].equals("MeleeRightTime")) {
                this.meleeRightTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AddRightNode")) {
                this.meleeRightPath.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
                this.meleeRightPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            }
            else if (split[0].equals("meleeRight")) {
                this.meleeRight = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MeleeRightDamagePoint") || split[0].equals("MeleeRightDamageOffset")) {
                this.meleeRightDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
            }
            else if (split[0].equals("MeleeUpTime")) {
                this.meleeDownTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("AddUpNode")) {
                this.meleeDownPath.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
                this.meleeDownPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            }
            else if (split[0].equals("meleeUp")) {
                this.meleeDown = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("MeleeUpDamagePoint") || split[0].equals("MeleeUpDamageOffset")) {
                this.meleeDownDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
            }
            else if (split[0].equals("lance")) {
                this.lance = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("match")) {
                this.matchlock = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AddNode")) {
                this.meleePath.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
                this.meleePathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            }
            else if (split[0].equals("MeleeDamagePoint") || split[0].equals("MeleeDamageOffset")) {
                this.meleeDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
            }
            else if (split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness")) {
                this.moveSpeedModifier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier")) {
                this.knockbackModifier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("AllowAllAttachments")) {
                this.allowAllAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowAttachments")) {
                for (int i = 1; i < split.length; ++i) {
                    this.allowedAttachments.add(AttachmentType.getAttachment(split[i]));
                }
            }
            else if (split[0].equals("AllowBarrelAttachments")) {
                this.allowBarrelAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowScopeAttachments")) {
                this.allowScopeAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowStockAttachments")) {
                this.allowStockAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowGripAttachments")) {
                this.allowGripAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowGadgetAttachments")) {
                this.allowGadgetAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowSlideAttachments")) {
                this.allowSlideAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowPumpAttachments")) {
                this.allowPumpAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AllowAccessoryAttachments")) {
                this.allowAccessoryAttachments = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("NumGenericAttachmentSlots")) {
                this.numGenericAttachmentSlots = Integer.parseInt(split[1]);
            }
            else if (split[0].toLowerCase().equals("shield")) {
                this.shield = true;
                this.shieldOrigin = new Vector3f(Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f, Float.parseFloat(split[4]) / 16.0f);
                this.shieldDimensions = new Vector3f(Float.parseFloat(split[5]) / 16.0f, Float.parseFloat(split[6]) / 16.0f, Float.parseFloat(split[7]) / 16.0f);
                this.shieldDamageAbsorption = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("labigunLimit")) {
                this.labigunLimit = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("hasLabigunDelay")) {
                this.labigunDelay = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("shootMelee")) {
                this.shootMelee = Boolean.parseBoolean(split[1]);
                final float n = 10.0f * this.defaultSpread;
                this.bulletSpread = n;
                this.defaultSpread = n;
                this.bulletSpeed *= 0.8f;
                this.consumeGunUponUse = Boolean.parseBoolean(split[1]);
                this.canBlock = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("canBlock")) {
                this.canBlock = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("OldGun")) {
                this.OldGun = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Bow")) {
                this.Bow = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("Heavy")) {
                this.Heavy = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("RepeatingGun")) {
                this.RepeatingGun = Boolean.parseBoolean(split[1]);
            }
        }
        catch (final Exception e) {
            if (split != null) {
                String msg = " : ";
                for (final String s : split) {
                    msg = msg + " " + s;
                }
                System.out.println("Reading gun file failed. " + file.name + msg);
            }
            else {
                System.out.println("Reading gun file failed. " + file.name);
            }
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    public boolean isAmmo(final ShootableType type) {
        return this.ammo.contains(type);
    }
    
    public boolean isAmmo(final ShootableType type, final ItemStack stack) {
        boolean result = this.ammo.contains(type);
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            final List<ShootableType> t = new ArrayList<ShootableType>();
            for (final String s : this.getGrip(stack).secondaryAmmo) {
                final ShootableType shoot = ShootableType.getShootableType(s);
                if (type != null) {
                    t.add(shoot);
                }
            }
            result = t.contains(type);
        }
        return result;
    }
    
    public boolean isAmmo(final ItemStack stack) {
        if (stack == null) {
            return false;
        }
        if (stack.func_77973_b() instanceof ItemBullet) {
            return this.isAmmo(((ItemBullet)stack.func_77973_b()).type, stack);
        }
        return stack.func_77973_b() instanceof ItemGrenade && this.isAmmo(((ItemGrenade)stack.func_77973_b()).type, stack);
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelGun.class);
    }
    
    @Override
    public float getZoomFactor() {
        return this.zoomLevel;
    }
    
    @Override
    public boolean hasZoomOverlay() {
        return this.hasScopeOverlay;
    }
    
    @Override
    public String getZoomOverlay() {
        return this.defaultScopeTexture;
    }
    
    @Override
    public float getFOVFactor() {
        return this.FOVFactor;
    }
    
    public IScope getCurrentScope(final ItemStack gunStack) {
        final IScope attachedScope = this.getScope(gunStack);
        return (attachedScope == null) ? this : attachedScope;
    }
    
    public ArrayList<AttachmentType> getCurrentAttachments(final ItemStack gun) {
        this.checkForTags(gun);
        final ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
        final NBTTagCompound attachmentTags = gun.field_77990_d.func_74775_l("attachments");
        final NBTTagList genericsList = attachmentTags.func_150295_c("generics", 10);
        for (int i = 0; i < this.numGenericAttachmentSlots; ++i) {
            this.appendToList(gun, "generic_" + i, attachments);
        }
        this.appendToList(gun, "barrel", attachments);
        this.appendToList(gun, "scope", attachments);
        this.appendToList(gun, "stock", attachments);
        this.appendToList(gun, "grip", attachments);
        this.appendToList(gun, "gadget", attachments);
        this.appendToList(gun, "slide", attachments);
        this.appendToList(gun, "pump", attachments);
        this.appendToList(gun, "accessory", attachments);
        return attachments;
    }
    
    private void appendToList(final ItemStack gun, final String name, final ArrayList<AttachmentType> attachments) {
        final AttachmentType type = this.getAttachment(gun, name);
        if (type != null) {
            attachments.add(type);
        }
    }
    
    public AttachmentType getBarrel(final ItemStack gun) {
        return this.getAttachment(gun, "barrel");
    }
    
    public AttachmentType getScope(final ItemStack gun) {
        return this.getAttachment(gun, "scope");
    }
    
    public AttachmentType getStock(final ItemStack gun) {
        return this.getAttachment(gun, "stock");
    }
    
    public AttachmentType getGrip(final ItemStack gun) {
        return this.getAttachment(gun, "grip");
    }
    
    public AttachmentType getGadget(final ItemStack gun) {
        return this.getAttachment(gun, "gadget");
    }
    
    public AttachmentType getSlide(final ItemStack gun) {
        return this.getAttachment(gun, "slide");
    }
    
    public AttachmentType getPump(final ItemStack gun) {
        return this.getAttachment(gun, "pump");
    }
    
    public AttachmentType getAccessory(final ItemStack gun) {
        return this.getAttachment(gun, "accessory");
    }
    
    public AttachmentType getGeneric(final ItemStack gun, final int i) {
        return this.getAttachment(gun, "generic_" + i);
    }
    
    public ItemStack getBarrelItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "barrel");
    }
    
    public ItemStack getScopeItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "scope");
    }
    
    public ItemStack getStockItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "stock");
    }
    
    public ItemStack getGripItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "grip");
    }
    
    public ItemStack getGadgetItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "gadget");
    }
    
    public ItemStack getSlideItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "slide");
    }
    
    public ItemStack getPumpItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "pump");
    }
    
    public ItemStack getAccessoryItemStack(final ItemStack gun) {
        return this.getAttachmentItemStack(gun, "accessory");
    }
    
    public ItemStack getGenericItemStack(final ItemStack gun, final int i) {
        return this.getAttachmentItemStack(gun, "generic_" + i);
    }
    
    public AttachmentType getAttachment(final ItemStack gun, final String name) {
        this.checkForTags(gun);
        return AttachmentType.getFromNBT(gun.field_77990_d.func_74775_l("attachments").func_74775_l(name));
    }
    
    public ItemStack getAttachmentItemStack(final ItemStack gun, final String name) {
        this.checkForTags(gun);
        try {
            return ItemStack.loadItemStackFromNBT(gun.field_77990_d.func_74775_l("attachments").func_74775_l(name));
        }
        catch (final Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    private void checkForTags(final ItemStack gun) {
        if (!gun.func_77942_o()) {
            gun.field_77990_d = new NBTTagCompound();
        }
        if (!gun.field_77990_d.func_74764_b("attachments")) {
            final NBTTagCompound attachmentTags = new NBTTagCompound();
            for (int i = 0; i < this.numGenericAttachmentSlots; ++i) {
                attachmentTags.func_74782_a("generic_" + i, (NBTBase)new NBTTagCompound());
            }
            attachmentTags.func_74782_a("barrel", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("scope", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("stock", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("grip", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("gadget", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("slide", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("pump", (NBTBase)new NBTTagCompound());
            attachmentTags.func_74782_a("accessory", (NBTBase)new NBTTagCompound());
            gun.field_77990_d.func_74782_a("attachments", (NBTBase)attachmentTags);
        }
    }
    
    public float getMeleeDamage(final ItemStack stack) {
        float stackMeleeDamage = this.meleeDamage;
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackMeleeDamage *= attachment.meleeDamageMultiplier;
        }
        return stackMeleeDamage;
    }
    
    public float getDamage(final ItemStack stack) {
        float stackDamage = this.damage;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            stackDamage = this.getGrip(stack).secondaryDamage;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackDamage *= attachment.damageMultiplier;
        }
        return stackDamage;
    }
    
    public float getSpread(final ItemStack stack, final boolean sneaking, final boolean sprinting) {
        float stackSpread = this.bulletSpread;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            stackSpread = this.getGrip(stack).secondarySpread;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackSpread *= attachment.spreadMultiplier;
        }
        if (sprinting) {
            stackSpread *= this.sprintSpreadMultiplier;
        }
        else if (sneaking) {
            stackSpread *= this.sneakSpreadMultiplier;
        }
        return stackSpread;
    }
    
    public float getDefaultSpread(final ItemStack stack) {
        float stackSpread = this.defaultSpread;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            stackSpread = this.getGrip(stack).secondaryDefaultSpread;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackSpread *= attachment.spreadMultiplier;
        }
        return stackSpread;
    }
    
    public float getRecoilPitch(final ItemStack stack) {
        float stackRecoil = this.recoilPitch;
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackRecoil *= attachment.recoilMultiplier;
        }
        return stackRecoil;
    }
    
    public float getRecoilYaw(final ItemStack stack) {
        float stackRecoilYaw = this.recoilYaw * (GunType.rand.nextFloat() - 0.5f);
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackRecoilYaw *= attachment.recoilMultiplier;
        }
        return stackRecoilYaw;
    }
    
    public float getSustainedRecoilPitch(final ItemStack stack) {
        float stackSustainedRecoil = this.sustainedRecoilPitch;
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackSustainedRecoil *= attachment.recoilMultiplier;
        }
        return stackSustainedRecoil;
    }
    
    public float getSustainedRecoilYaw(final ItemStack stack) {
        float stackSustainedRecoilYaw = this.sustainedRecoilYaw * (GunType.rand.nextFloat() - 0.5f);
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackSustainedRecoilYaw *= attachment.recoilMultiplier;
        }
        return stackSustainedRecoilYaw;
    }
    
    public float getBulletSpeed(final ItemStack stack) {
        float stackBulletSpeed = this.bulletSpeed;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            stackBulletSpeed = this.getGrip(stack).secondarySpeed;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackBulletSpeed *= attachment.bulletSpeedMultiplier;
        }
        return stackBulletSpeed;
    }
    
    public float getReloadTime(final ItemStack stack) {
        float stackReloadTime = (float)this.reloadTime;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            stackReloadTime = (float)this.getGrip(stack).secondaryReloadTime;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackReloadTime *= attachment.reloadTimeMultiplier;
        }
        return stackReloadTime;
    }
    
    public float getShootDelay(final ItemStack stack) {
        float fireRate = this.shootDelay;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            fireRate = this.getGrip(stack).secondaryShootDelay;
        }
        return fireRate;
    }
    
    public int getNumBullets(final ItemStack stack) {
        int amount = this.numBullets;
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            amount = this.getGrip(stack).secondaryNumBullets;
        }
        return amount;
    }
    
    public float getMovementSpeed(final ItemStack stack) {
        float stackMovement = this.moveSpeedModifier;
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            stackMovement *= attachment.moveSpeedMultiplier;
        }
        return stackMovement;
    }
    
    public void setFireMode(final ItemStack stack, final int fireMode) {
        if (!stack.func_77942_o()) {
            stack.func_77982_d(new NBTTagCompound());
        }
        if (fireMode < EnumFireMode.values().length) {
            stack.func_77978_p().func_74774_a("GunMode", (byte)fireMode);
        }
        else {
            stack.func_77978_p().func_74774_a("GunMode", (byte)this.mode.ordinal());
        }
    }
    
    public EnumFireMode getFireMode(final ItemStack stack) {
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            return this.getGrip(stack).secondaryFireMode;
        }
        for (final AttachmentType attachment : this.getCurrentAttachments(stack)) {
            if (attachment.modeOverride != null) {
                return attachment.modeOverride;
            }
        }
        if (stack.func_77942_o() && stack.func_77978_p().func_74764_b("GunMode")) {
            final int gm = stack.func_77978_p().func_74771_c("GunMode");
            if (gm < EnumFireMode.values().length) {
                for (int i = 0; i < this.submode.length; ++i) {
                    if (gm == this.submode[i].ordinal()) {
                        return EnumFireMode.values()[gm];
                    }
                }
            }
        }
        this.setFireMode(stack, this.mode.ordinal());
        return this.mode;
    }
    
    public void setSecondaryFire(final ItemStack stack, final boolean mode) {
        if (!stack.func_77942_o()) {
            stack.func_77982_d(new NBTTagCompound());
        }
        stack.field_77990_d.func_74757_a("secondaryFire", mode);
    }
    
    public boolean getSecondaryFire(final ItemStack stack) {
        if (!stack.func_77942_o()) {
            stack.func_77982_d(new NBTTagCompound());
        }
        if (!stack.func_77978_p().func_74764_b("secondaryFire")) {
            stack.field_77990_d.func_74757_a("secondaryFire", false);
            return stack.func_77978_p().func_74767_n("secondaryFire");
        }
        return stack.func_77978_p().func_74767_n("secondaryFire");
    }
    
    public int getNumAmmoItemsInGun(final ItemStack stack) {
        if (this.getGrip(stack) != null && this.getSecondaryFire(stack)) {
            return this.getGrip(stack).numSecAmmoItems;
        }
        return this.numPrimaryAmmoItems;
    }
    
    public static GunType getGun(final String s) {
        return GunType.guns.get(s);
    }
    
    public static GunType getGunForMech(final String s) {
        for (final GunType gun : GunType.gunList) {
            if (gun.shortName.equals(s)) {
                return gun;
            }
        }
        return null;
    }
    
    public Paintjob getPaintjob(final String s) {
        for (final Paintjob paintjob : this.paintjobs) {
            if (paintjob.iconName.equals(s)) {
                return paintjob;
            }
        }
        return this.defaultPaintjob;
    }
    
    @Override
    public float GetRecommendedScale() {
        return 60.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return this.model;
    }
    
    static {
        rand = new Random();
        GunType.guns = new HashMap<String, GunType>();
        GunType.gunList = new ArrayList<GunType>();
    }
}
