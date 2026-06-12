// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import com.flansmod.client.FlansModClient;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.driveables.collisions.CollisionPlane;
import net.minecraft.util.EntityDamageSourceIndirect;
import com.flansmod.common.guns.EntityDamageSourceFlans;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.Gametype;
import net.minecraft.entity.passive.EntityAnimal;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;
import com.flansmod.common.driveables.collisions.CollisionTest;
import net.minecraft.block.Block;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.parts.PartType;
import net.minecraft.item.Item;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.NetworkRegistry;
import java.util.HashSet;
import net.minecraft.init.Items;
import com.flansmod.common.parts.ItemPart;
import cofh.api.energy.IEnergyContainerItem;
import net.minecraft.block.material.Material;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import com.flansmod.common.network.PacketCurrentMissile;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import com.flansmod.common.vector.ReadableVector3f;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.GunType;
import net.minecraft.util.Vec3;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.ItemShootable;
import java.util.ArrayList;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.command.ICommandSender;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.client.EntityCamera;
import com.flansmod.common.FlansMod;
import java.util.Iterator;
import java.util.Map;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import com.hfr.faction.Factions;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import java.util.HashMap;
import com.hfr.faction.IFaction;
import com.flansmod.common.RotatedAxes;
import com.flansmod.api.IExplodeable;
import com.flansmod.api.IControllable;
import net.minecraft.entity.Entity;

public abstract class EntityDriveable extends Entity implements IControllable, IExplodeable, IEntityAdditionalSpawnData
{
    public boolean syncFromServer;
    public boolean crushed;
    public int crushTimer;
    public boolean isShip;
    public boolean atSea;
    public boolean aiming;
    public int serverPositionTransitionTicker;
    public double field_70118_ct;
    public double field_70117_cu;
    public double field_70116_cv;
    public double serverYaw;
    public double serverPitch;
    public double serverRoll;
    public DriveableData driveableData;
    public String driveableType;
    public float throttle;
    public float throttlePeepee;
    public float oxygenMeter;
    public float divingFactor;
    public float energy;
    public float maxEnergy;
    public float minEnergy;
    public int crewTotal;
    public float planeRecoil;
    public float pitchSignal;
    public float yawSignal;
    public String currentAmmo;
    public int warpTimer;
    public EntityWheel[] wheels;
    public boolean gtfo;
    public int toggleTimer;
    public boolean shootingTertiary;
    public int tertiaryTimer;
    public boolean fuelling;
    public float prevRotationRoll;
    public Vector3f angularVelocity;
    public boolean leftMouseHeld;
    public boolean rightMouseHeld;
    private boolean suicide;
    public int shootDelayPrimary;
    public int shootDelaySecondary;
    public float minigunSpeedPrimary;
    public float minigunSpeedSecondary;
    public int currentGunPrimary;
    public int currentGunSecondary;
    public float harvesterAngle;
    public RotatedAxes prevAxes;
    public RotatedAxes axes;
    public EntitySeat[] seats;
    private int foundFuel;
    public boolean couldNotFindFuel;
    public boolean isAmmoPlaced;
    public int lockOnSoundDelay;
    private int[] emitterTimers;
    public int animCountLeft;
    public int animFrameLeft;
    public int animCountRight;
    public int animFrameRight;
    public boolean leftTurnHeld;
    public boolean rightTurnHeld;
    public boolean isShowedPosition;
    public int tickCount;
    public int impactX;
    public int impactY;
    public int impactZ;
    public boolean neverLocked;
    private String lastKey;
    public boolean locked;
    public boolean stolen;
    public IFaction owner;
    public HashMap<String, Integer> unlocks;
    public int timeToUnlock;
    public String ownerName;
    public boolean isRecoil;
    public float recoilPos;
    public float lastRecoilPos;
    public int recoilTimer;
    public float primaryRecoilHeight;
    public float secondaryRecoilHeight;
    public int backwardsTimer;
    public float recoilEnergy;
    public Vector3f lastPos;
    public boolean hugeBoat;
    public boolean onDeck;
    public double deckHeight;
    public int deckCheck;
    public int prevDeckCheck;
    public boolean isMecha;
    public boolean disabled;
    public int accidentDelay;
    public float propAngle;
    public float prevPropAngle;
    public float rotorAngle;
    public float prevRotorAngle;
    public EntityPlayer humanTarget;
    public EntityPlayer softTarget;
    public EntityPlane airTarget;
    public static final float targetAcquireInterval = 10.0f;
    public float aimYawAA;
    public float aimPitchAA;
    public boolean shootingAA;
    public int AATimer;
    public Vector3f evilVector;
    public int flareDelay;
    public int ticksFlareUsing;
    public boolean varFlare;
    public int ticksRepairing;
    public int repairDelay;
    public boolean varRepair;
    public int ramDelay;
    public int nintendoSwitchLite;
    public int fuelTimer;
    public float labjacFuel;
    public int APSdelay;
    public int APSchecker;
    public int APSmax;
    public int shieldHitTimer;
    public float drakonDoorAngle;
    public float drakonArmAngle;
    public float drakonRailAngle;
    public float prevDrakonDoorAngle;
    public float prevDrakonArmAngle;
    public float prevDrakonRailAngle;
    public boolean reloadingDrakon;
    public boolean canFireIT1;
    public int stage;
    public int reloadAnimTime;
    public boolean toDeactivate;
    public int timeTillDeactivate;
    public long lastshellswitchedat;
    public boolean canFire;
    @SideOnly(Side.CLIENT)
    public EntityLivingBase camera;
    protected int invulnerableUnmountCount;
    private ItemStack[][] prevInventoryItems;
    public Entity lastAtkEntity;
    DriveableType type;
    public boolean epicShip;
    public int maximumCrew;
    public float damageVsCrew;
    public boolean afterBurning;
    public boolean thermalScoping;
    public boolean mounted;
    public boolean carrierTip;
    public boolean artilleryMode;
    public boolean activeRadar;
    
    public EntityDriveable(final World world) {
        super(world);
        this.syncFromServer = true;
        this.crushed = false;
        this.crushTimer = 40;
        this.isShip = false;
        this.atSea = true;
        this.aiming = false;
        this.divingFactor = 0.0f;
        this.energy = 0.0f;
        this.maxEnergy = 100.0f;
        this.minEnergy = -100.0f;
        this.crewTotal = 1;
        this.planeRecoil = 0.0f;
        this.pitchSignal = 0.0f;
        this.yawSignal = 0.0f;
        this.warpTimer = 3600;
        this.gtfo = false;
        this.toggleTimer = 0;
        this.shootingTertiary = false;
        this.tertiaryTimer = 0;
        this.angularVelocity = new Vector3f(0.0f, 0.0f, 0.0f);
        this.leftMouseHeld = false;
        this.rightMouseHeld = false;
        this.suicide = false;
        this.foundFuel = -1;
        this.couldNotFindFuel = false;
        this.isAmmoPlaced = false;
        this.animCountLeft = 0;
        this.animFrameLeft = 0;
        this.animCountRight = 0;
        this.animFrameRight = 0;
        this.leftTurnHeld = false;
        this.rightTurnHeld = false;
        this.isShowedPosition = false;
        this.tickCount = 0;
        this.neverLocked = true;
        this.locked = true;
        this.stolen = false;
        this.owner = null;
        this.unlocks = new HashMap<String, Integer>();
        this.timeToUnlock = 100;
        this.ownerName = "None";
        this.isRecoil = false;
        this.recoilPos = 0.0f;
        this.lastRecoilPos = 0.0f;
        this.recoilTimer = 0;
        this.primaryRecoilHeight = 0.0f;
        this.secondaryRecoilHeight = 0.0f;
        this.backwardsTimer = 0;
        this.recoilEnergy = 0.0f;
        this.lastPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.hugeBoat = false;
        this.onDeck = false;
        this.deckHeight = 0.0;
        this.deckCheck = 0;
        this.prevDeckCheck = 0;
        this.isMecha = false;
        this.disabled = false;
        this.accidentDelay = 0;
        this.propAngle = 0.0f;
        this.prevPropAngle = 0.0f;
        this.rotorAngle = 0.0f;
        this.prevRotorAngle = 0.0f;
        this.humanTarget = null;
        this.softTarget = null;
        this.airTarget = null;
        this.aimYawAA = 0.0f;
        this.aimPitchAA = 0.0f;
        this.shootingAA = false;
        this.AATimer = 0;
        this.evilVector = new Vector3f(0.0f, 0.0f, 0.0f);
        this.flareDelay = 0;
        this.ticksFlareUsing = 0;
        this.ticksRepairing = 0;
        this.repairDelay = 0;
        this.ramDelay = 0;
        this.nintendoSwitchLite = 10;
        this.fuelTimer = 300;
        this.labjacFuel = 10.0f;
        this.APSdelay = 0;
        this.APSchecker = 5;
        this.APSmax = 295;
        this.shieldHitTimer = 0;
        this.drakonDoorAngle = 0.0f;
        this.drakonArmAngle = 0.0f;
        this.drakonRailAngle = 0.0f;
        this.prevDrakonDoorAngle = 0.0f;
        this.prevDrakonArmAngle = 0.0f;
        this.prevDrakonRailAngle = 0.0f;
        this.reloadingDrakon = false;
        this.canFireIT1 = true;
        this.stage = 1;
        this.reloadAnimTime = 0;
        this.toDeactivate = false;
        this.timeTillDeactivate = 0;
        this.canFire = true;
        this.prevInventoryItems = new ItemStack[][] { null, null };
        this.lastAtkEntity = null;
        this.type = this.getDriveableType();
        this.damageVsCrew = 0.5f;
        this.thermalScoping = false;
        this.mounted = false;
        this.carrierTip = false;
        this.artilleryMode = false;
        this.activeRadar = true;
        this.axes = new RotatedAxes();
        this.prevAxes = new RotatedAxes();
        this.field_70156_m = true;
        this.func_70105_a(1.5f, 1.5f);
        this.field_70129_M = 0.375f;
        this.field_70158_ak = true;
        this.field_70155_l = 20000.0;
    }
    
    public EntityDriveable(final World world, final DriveableType t, final DriveableData d) {
        this(world);
        this.driveableType = t.shortName;
        this.driveableData = d;
    }
    
    protected void initType(final DriveableType type, final boolean clientSide) {
        this.seats = new EntitySeat[type.numPassengers + 1];
        for (int i = 0; i < type.numPassengers + 1; ++i) {
            if (!clientSide) {
                this.seats[i] = new EntitySeat(this.field_70170_p, this, i);
                this.field_70170_p.func_72838_d((Entity)this.seats[i]);
            }
        }
        this.wheels = new EntityWheel[type.wheelPositions.length];
        for (int i = 0; i < this.wheels.length; ++i) {
            if (!clientSide) {
                this.wheels[i] = new EntityWheel(this.field_70170_p, this, i);
                this.field_70170_p.func_72838_d((Entity)this.wheels[i]);
            }
        }
        this.field_70138_W = type.wheelStepHeight;
        this.field_70129_M = type.yOffset;
        this.emitterTimers = new int[type.emitters.size()];
        for (int i = 0; i < type.emitters.size(); ++i) {
            this.emitterTimers[i] = this.field_70146_Z.nextInt(type.emitters.get(i).emitRate);
        }
        this.getEntityData().func_74757_a("CanMountEntity", type.canMountEntity);
        this.isShip = type.epicShip;
        for (int ps = 0; ps < 2; ++ps) {
            EnumWeaponType weaponType = (ps == 0) ? type.primary : type.secondary;
            if (weaponType == EnumWeaponType.GUN) {
                weaponType = EnumWeaponType.NONE;
            }
            int istart = this.getInventoryStart(weaponType);
            if (istart == this.driveableData.getAmmoInventoryStart()) {
                istart += type.numPassengerGunners;
            }
            final int isize = this.getInventorySize(weaponType);
            if (istart >= 0 || isize > 0) {
                this.prevInventoryItems[ps] = new ItemStack[isize];
                for (int j = 0; j < isize; ++j) {
                    this.prevInventoryItems[ps][j] = this.driveableData.func_70301_a(istart + j);
                }
            }
        }
    }
    
    protected void func_70014_b(final NBTTagCompound tag) {
        this.driveableData.writeToNBT(tag);
        tag.func_74778_a("Type", this.driveableType);
        tag.func_74776_a("RotationYaw", this.axes.getYaw());
        tag.func_74776_a("RotationPitch", this.axes.getPitch());
        tag.func_74776_a("RotationRoll", this.axes.getRoll());
        tag.func_74757_a("locked", this.locked);
        tag.func_74757_a("stolen", this.stolen);
        if (this.owner != null) {
            tag.func_74778_a("owner", this.owner.getName());
        }
    }
    
    protected void func_70037_a(final NBTTagCompound tag) {
        this.driveableType = tag.func_74779_i("Type");
        this.driveableData = new DriveableData(tag);
        this.initType(DriveableType.getDriveable(this.driveableType), false);
        this.field_70126_B = tag.func_74760_g("RotationYaw");
        this.field_70127_C = tag.func_74760_g("RotationPitch");
        this.prevRotationRoll = tag.func_74760_g("RotationRoll");
        this.locked = tag.func_74767_n("locked");
        this.axes = new RotatedAxes(this.field_70126_B, this.field_70127_C, this.prevRotationRoll);
        this.stolen = tag.func_74767_n("stolen");
        if (tag.func_74764_b("owner")) {
            this.owner = Factions.getFactionFromName(tag.func_74779_i("owner"));
        }
    }
    
    public void writeSpawnData(final ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.driveableType);
        final NBTTagCompound tag = new NBTTagCompound();
        this.driveableData.writeToNBT(tag);
        ByteBufUtils.writeTag(data, tag);
        data.writeFloat(this.axes.getYaw());
        data.writeFloat(this.axes.getPitch());
        data.writeFloat(this.axes.getRoll());
        for (final EnumDriveablePart ep : EnumDriveablePart.values()) {
            final DriveablePart part = this.getDriveableData().parts.get(ep);
            data.writeShort((int)(short)part.health);
            data.writeShort((int)(short)part.crew);
            data.writeBoolean(part.onFire);
        }
        data.writeBoolean(this.locked);
        data.writeBoolean(this.stolen);
        ByteBufUtils.writeUTF8String(data, (this.owner == null) ? "" : this.owner.getName());
        data.writeInt(this.unlocks.size());
        for (final Map.Entry<String, Integer> entry : this.unlocks.entrySet()) {
            ByteBufUtils.writeUTF8String(data, (String)entry.getKey());
            data.writeInt((int)entry.getValue());
        }
    }
    
    public void readSpawnData(final ByteBuf data) {
        try {
            this.driveableType = ByteBufUtils.readUTF8String(data);
            this.driveableData = new DriveableData(ByteBufUtils.readTag(data));
            this.initType(this.getDriveableType(), true);
            this.axes.setAngles(data.readFloat(), data.readFloat(), data.readFloat());
            this.field_70126_B = this.axes.getYaw();
            this.field_70127_C = this.axes.getPitch();
            this.prevRotationRoll = this.axes.getRoll();
            for (final EnumDriveablePart ep : EnumDriveablePart.values()) {
                final DriveablePart part = this.getDriveableData().parts.get(ep);
                part.health = data.readShort();
                part.crew = data.readShort();
                part.onFire = data.readBoolean();
            }
            this.locked = data.readBoolean();
            this.stolen = data.readBoolean();
            this.ownerName = ByteBufUtils.readUTF8String(data);
            final int count = data.readInt();
            this.unlocks.clear();
            for (int i = 0; i < count; ++i) {
                final String key = ByteBufUtils.readUTF8String(data);
                final int value = data.readInt();
                this.unlocks.put(key, value);
            }
        }
        catch (final Exception e) {
            FlansMod.log("Failed to retreive plane type from server.");
            super.func_70106_y();
            e.printStackTrace();
        }
        this.camera = new EntityCamera(this.field_70170_p, this);
        this.field_70170_p.func_72838_d((Entity)this.camera);
    }
    
    public abstract void onMouseMoved(final int p0, final int p1);
    
    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return this.camera;
    }
    
    protected boolean canSit(final int seat) {
        return this.getDriveableType().numPassengers >= seat && this.seats[seat].field_70153_n == null;
    }
    
    protected boolean func_70041_e_() {
        return false;
    }
    
    protected void func_70088_a() {
    }
    
    public AxisAlignedBB func_70114_g(final Entity entity) {
        if (this.seats[0] != null && this.getDriveableType().collisionDamageEnable && this.seats[0].field_70153_n != null && this.throttle > this.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes);
                if (this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes > 23.0f && ((EntityLiving)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
            else if (entity instanceof EntityPlayer && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes);
                if (this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes > 23.0f && ((EntityPlayer)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
        }
        return this.field_70121_D;
    }
    
    public AxisAlignedBB func_70046_E() {
        return this.field_70121_D;
    }
    
    public boolean func_70104_M() {
        return false;
    }
    
    public double func_70042_X() {
        return -0.3;
    }
    
    public boolean func_70097_a(final DamageSource damagesource, final float i) {
        if (this.field_70170_p.field_72995_K || this.field_70128_L) {
            return true;
        }
        if (this.isMountedEntity(damagesource.func_76346_g())) {
            return false;
        }
        final boolean broken = this.attackPart(EnumDriveablePart.core, damagesource, i);
        if (i > 0.0f) {
            this.checkPartsWhenAttacked();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, 100.0f, this.field_71093_bK);
        }
        return true;
    }
    
    public boolean isMountedEntity(final Entity entity) {
        if (entity != null) {
            final Entity entity2 = this.field_70170_p.func_73045_a(entity.func_145782_y());
            for (final Entity seat : this.seats) {
                if (seat.field_70153_n != null && (seat.field_70153_n == entity || seat.field_70153_n == entity2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void func_70106_y() {
        super.func_70106_y();
        if (this.field_70170_p.field_72995_K) {
            this.camera.func_70106_y();
        }
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                seat.func_70106_y();
            }
        }
    }
    
    public void func_70100_b_(final EntityPlayer par1EntityPlayer) {
    }
    
    public boolean func_70067_L() {
        return true;
    }
    
    public void func_70108_f(final Entity entity) {
    }
    
    public void func_70056_a(final double d, final double d1, final double d2, final float f, final float f1, final int i) {
        if (this.field_70173_aa > 1) {
            return;
        }
        if (!(this.field_70153_n instanceof EntityPlayer) || !FlansMod.proxy.isThePlayer((EntityPlayer)this.field_70153_n)) {
            if (this.syncFromServer) {
                this.serverPositionTransitionTicker = i + 5;
            }
            else {
                final double var10 = d - this.field_70165_t;
                final double var11 = d1 - this.field_70163_u;
                final double var12 = d2 - this.field_70161_v;
                final double var13 = var10 * var10 + var11 * var11 + var12 * var12;
                if (var13 <= 1.0) {
                    return;
                }
                this.serverPositionTransitionTicker = 3;
            }
            this.field_70118_ct = d;
            this.field_70117_cu = d1;
            this.field_70116_cv = d2;
            this.serverYaw = f;
            this.serverPitch = f1;
        }
    }
    
    public void setIT1(final boolean canFire, final boolean reloading, final int stag, final int stageTime) {
        if (this.field_70170_p.field_72995_K && this.field_70173_aa % 5 == 0) {
            this.canFireIT1 = canFire;
            this.reloadingDrakon = reloading;
            this.stage = stag;
            this.reloadAnimTime = stageTime;
        }
    }
    
    public void setPositionRotationAndMotion(final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final double motX, final double motY, final double motZ, final float velYaw, final float velPitch, final float velRoll, final float throt, final float steeringYaw, final float throtPP) {
        if (this.field_70170_p.field_72995_K) {
            this.field_70118_ct = x;
            this.field_70117_cu = y;
            this.field_70116_cv = z;
            this.serverYaw = yaw;
            this.serverPitch = pitch;
            this.serverRoll = roll;
            this.serverPositionTransitionTicker = 5;
        }
        else {
            this.func_70107_b(x, y, z);
            this.setRotation(this.field_70126_B = yaw, this.field_70127_C = pitch, this.prevRotationRoll = roll);
        }
        this.field_70159_w = motX;
        this.field_70181_x = motY;
        this.field_70179_y = motZ;
        this.angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
        this.throttle = throt;
        this.throttlePeepee = throtPP;
    }
    
    public void func_70016_h(final double d, final double d1, final double d2) {
        this.field_70159_w = d;
        this.field_70181_x = d1;
        this.field_70179_y = d2;
    }
    
    public boolean pressKey(final int key, final EntityPlayer player) {
        if (this.type.epicShip && !this.atSea) {
            return false;
        }
        if (!this.field_70170_p.field_72995_K && key == 9 && this.getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) {
            this.shoot(false, false);
            return true;
        }
        if (!this.field_70170_p.field_72995_K && key == 8 && this.getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) {
            this.shoot(true, false);
            return true;
        }
        return false;
    }
    
    public void updateKeyHeldState(final int key, final boolean held) {
        if (this.field_70170_p.field_72995_K) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
            if (key == 2) {
                this.leftTurnHeld = true;
                this.rightTurnHeld = false;
            }
            else if (key == 3) {
                this.rightTurnHeld = true;
                this.leftTurnHeld = false;
            }
            else {
                this.leftTurnHeld = false;
                this.rightTurnHeld = false;
            }
        }
        switch (key) {
            case 9: {
                if (!TeamsManager.violence) {
                    this.leftMouseHeld = held;
                    break;
                }
                break;
            }
            case 8: {
                if (!TeamsManager.violence) {
                    this.rightMouseHeld = held;
                }
                this.suicide = true;
                break;
            }
            case 30: {
                if (this.seats != null && this.tertiaryTimer < 4) {
                    this.tertiaryTimer += 2;
                    break;
                }
                break;
            }
            case 31: {
                if (this.seats != null && this.toggleTimer <= 0) {
                    this.gtfo = !this.gtfo;
                    ((ICommandSender)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText("Passengers are now " + (this.gtfo ? "banned" : "allowed")));
                    this.toggleTimer = 20;
                    break;
                }
                break;
            }
        }
    }
    
    public void shoot(final boolean secondary, final boolean evil) {
        final DriveableType type = this.getDriveableType();
        if (this.seats[0] == null) {
            return;
        }
        if (type.IT1 && !this.canFireIT1 && type.weaponType(secondary) == EnumWeaponType.MISSILE) {
            return;
        }
        if (!this.canFire) {
            return;
        }
        if (this.getShootDelay(secondary) <= 0 && (!type.epicShip || this.atSea)) {
            if (type.secondaryRecoil && this.rightMouseHeld) {
                this.ramDelay = 30;
            }
            if (type.primaryRecoil && this.leftMouseHeld) {
                this.ramDelay = 30;
            }
            final ArrayList<ShootPoint> shootPoints = type.shootPoints(secondary);
            final EnumWeaponType weaponType = type.weaponType(secondary);
            if (shootPoints.size() == 0) {
                return;
            }
            int currentGun = this.getCurrentGun(secondary);
            if (type.alternate(secondary)) {
                currentGun = (currentGun + 1) % shootPoints.size();
                this.setCurrentGun(currentGun, secondary);
                this.shootEach(type, shootPoints.get(currentGun), currentGun, secondary, weaponType, evil);
            }
            else {
                for (int i = 0; i < shootPoints.size(); ++i) {
                    this.shootEach(type, shootPoints.get(i), i, secondary, weaponType, evil);
                }
            }
        }
    }
    
    private boolean driverIsCreative() {
        return this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
    }
    
    public void spawnParticle(final ArrayList<DriveableType.ShootParticle> list, final ShootPoint shootPoint, final Vector3f v) {
        for (final DriveableType.ShootParticle s : list) {
            final float bkx = shootPoint.rootPos.position.x;
            final float bky = shootPoint.rootPos.position.y;
            final float bkz = shootPoint.rootPos.position.z;
            Vector3f velocity = new Vector3f(s.x, s.y, s.z);
            final Vector3f vv = this.lastPos;
            velocity = this.getDirection(shootPoint, velocity);
            if (shootPoint.rootPos.part == EnumDriveablePart.core) {
                final Vector3f v2 = this.axes.findLocalVectorGlobally(shootPoint.rootPos.position);
                final Vector3f v3 = this.rotate(this.seats[0].looking.findLocalVectorGlobally(shootPoint.offPos));
                Vector3f.add(v2, v3, v);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(s.name, this.field_70165_t + v.x, this.field_70163_u + v.y, this.field_70161_v + v.z, velocity.x, velocity.y, velocity.z), this.field_70165_t + v.x, this.field_70163_u + v.y, this.field_70161_v + v.z, 150.0f, this.field_71093_bK);
            shootPoint.rootPos.position.x = bkx;
            shootPoint.rootPos.position.y = bky;
            shootPoint.rootPos.position.z = bkz;
        }
    }
    
    public void shootEach(final DriveableType type, final ShootPoint shootPoint, final int currentGun, final boolean secondary, final EnumWeaponType weaponType, final boolean evil) {
        final Vector3f gunVec = this.getFiringPosition(shootPoint);
        final Vector3f lookVectorClassic = this.getLookVector(shootPoint);
        Vector3f lookVector = this.axes.findLocalVectorGlobally(new Vector3f(1.0f, 0.0f, shootPoint.convergentAngle));
        EntityPlayer fakePlayer = null;
        if (evil && this.humanTarget != null) {
            fakePlayer = this.humanTarget;
        }
        if (shootPoint.musik) {
            lookVector = this.axes.findLocalVectorGlobally(new Vector3f(1.0f, shootPoint.convergentAngle, 0.0f));
        }
        if (shootPoint.convergentAngle == 0.0f) {
            lookVector = lookVectorClassic;
        }
        final Vector3f evilTarget = new Vector3f(this.aimYawAA, this.aimPitchAA, 0.0f);
        if (evil && this.seats != null && this.seats[1] != null) {
            final float evilX = (float)Math.cos(this.seats[1].looking.getYaw());
            final float evilY = (float)Math.sin(this.seats[1].looking.getPitch());
            final float evilZ = (float)(-Math.sin(this.seats[1].looking.getYaw()));
            final Vector3f evilTargetAdvanced = lookVector = new Vector3f(evilX + type.evilSpread * 0.1f * (1.0 - Math.random()), evilY + type.evilSpread * 0.1f * (1.0 - Math.random()), evilZ + type.evilSpread * 0.1f * (1.0 - Math.random()));
        }
        if (evil) {
            final Vector3f evilTargetConverted = lookVector = new Vector3f(this.evilVector.x + type.evilSpread * 0.1f * (1.0 - Math.random()), this.evilVector.y + type.evilSpread * 0.1f * (1.0 - Math.random()), this.evilVector.z + type.evilSpread * 0.1f * (1.0 - Math.random()));
        }
        Vector3f freeLookVec = lookVector;
        if ((type.planeCoaxPrimary || type.planeCoaxSecondary) && this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer) {
            EntityPlayer owner = (EntityPlayer)this.seats[0].field_70153_n;
            if (evil) {
                owner = fakePlayer;
            }
            if (owner != null) {
                freeLookVec = new Vector3f((float)owner.func_70040_Z().field_72450_a, (float)owner.func_70040_Z().field_72448_b, (float)owner.func_70040_Z().field_72449_c);
            }
            if ((!secondary && type.planeCoaxPrimary) || (secondary && type.planeCoaxSecondary)) {
                lookVector = freeLookVec;
            }
        }
        final Vector3f gunVecFake = this.getFakeFiringPosition(shootPoint);
        if (!secondary && type.fixedPrimaryFire) {
            lookVector = this.axes.findLocalVectorGlobally(type.primaryFireAngle);
            if (shootPoint.rootPos.part == EnumDriveablePart.turret) {
                lookVector = this.getPositionOnTurret(type.primaryFireAngle, false);
            }
            if (shootPoint.rootPos.part == EnumDriveablePart.barrel) {
                lookVector = this.getPositionOnTurret(type.primaryFireAngle, true);
            }
        }
        if (secondary && type.fixedSecondaryFire) {
            lookVector = this.axes.findLocalVectorGlobally(type.secondaryFireAngle);
            if (shootPoint.rootPos.part == EnumDriveablePart.turret) {
                lookVector = this.getPositionOnTurret(type.secondaryFireAngle, false);
            }
            if (shootPoint.rootPos.part == EnumDriveablePart.barrel) {
                lookVector = this.getPositionOnTurret(type.secondaryFireAngle, true);
            }
        }
        if (weaponType == EnumWeaponType.SHELL) {
            this.isRecoil = true;
        }
        if (shootPoint.rootPos.part == null) {
            return;
        }
        if (!this.isPartIntact(shootPoint.rootPos.part)) {
            return;
        }
        if (shootPoint.rootPos instanceof PilotGun) {
            ItemStack bulletItemStack = this.driveableData.ammo[this.getDriveableType().numPassengerGunners + currentGun];
            final PilotGun pilotGun = (PilotGun)shootPoint.rootPos;
            final GunType gunType = pilotGun.type;
            if (gunType != null) {
                float shellSpeed = gunType.bulletSpeed;
                if (type.rangingGun) {
                    shellSpeed = type.bulletSpeed;
                }
                if (bulletItemStack != null && bulletItemStack.func_77973_b() instanceof ItemShootable && TeamsManager.bulletsEnabled && this.driveableData.overheatSuffer < 1) {
                    final ShootableType bullet = ((ItemShootable)bulletItemStack.func_77973_b()).type;
                    if ((gunType.isAmmo(bullet) && !type.epicShip && this.ticksRepairing == 0) || (type.epicShip && gunType.isAmmo(bullet) && this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health > 3 && this.ticksFlareUsing <= 0)) {
                        this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                        final DriveableData driveableData = this.driveableData;
                        driveableData.overheat += 5;
                        EntityLivingBase human = null;
                        if (evil) {
                            human = (EntityLivingBase)this.humanTarget;
                        }
                        else if (this.seats != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityLivingBase) {
                            human = (EntityLivingBase)this.seats[0].field_70153_n;
                        }
                        this.field_70170_p.func_72838_d((Entity)((ItemShootable)bulletItemStack.func_77973_b()).getEntity(this.field_70170_p, Vector3f.add(new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v), gunVec, null), lookVector, human, gunType.bulletSpread / 2.0f, gunType.damage, gunType.bulletSpeed, bulletItemStack.func_77960_j(), type, type.evilGolem));
                        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.shootSound(secondary), false);
                        if ((evil || this.driverIsCreative()) && bulletItemStack.func_77960_j() >= bulletItemStack.func_77958_k()) {
                            bulletItemStack.func_77964_b(0);
                            if (!type.evilGolem || !this.driverIsCreative() || !evil) {
                                final ItemStack itemStack = bulletItemStack;
                                --itemStack.field_77994_a;
                                if (bulletItemStack.field_77994_a <= 0) {
                                    this.onWeaponInventoryChanged(secondary);
                                    bulletItemStack = null;
                                }
                                this.driveableData.func_70299_a(this.getDriveableType().numPassengerGunners + currentGun, bulletItemStack);
                            }
                            else {
                                bulletItemStack.func_77964_b(bulletItemStack.func_77960_j() + 1);
                            }
                        }
                        if (this.epicShip) {
                            this.setShootDelay((int)(type.shootDelay(secondary) / ((this.driveableData.totalCrew * this.driveableData.totalCrew + this.driveableData.maximumCrew * 0.1) / (this.driveableData.maximumCrew * this.driveableData.maximumCrew * 0.9))), secondary);
                        }
                        if (!this.epicShip) {
                            this.setShootDelay(type.shootDelay(secondary), secondary);
                        }
                        if (type.secondaryRecoil && this.rightMouseHeld) {
                            this.ramDelay = 30;
                        }
                        if (type.primaryRecoil && this.leftMouseHeld) {
                            this.ramDelay = 30;
                        }
                    }
                }
            }
        }
        else {
            switch (weaponType) {
                case BOMB: {
                    if (TeamsManager.bombsEnabled) {
                        int slot = -1;
                        for (int i = this.driveableData.getBombInventoryStart(); i < this.driveableData.getBombInventoryStart() + type.numBombSlots; ++i) {
                            final ItemStack bomb = this.driveableData.func_70301_a(i);
                            if (bomb != null && bomb.func_77973_b() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)bomb.func_77973_b()).type, weaponType)) {
                                slot = i;
                            }
                        }
                        if (slot != -1) {
                            final int spread = 0;
                            final int damageMultiplier = 1;
                            final float shellSpeed = 0.0f;
                            ItemStack bulletStack = this.driveableData.func_70301_a(slot);
                            final ItemBullet bulletItem = (ItemBullet)bulletStack.func_77973_b();
                            if (shootPoint.rootPos instanceof PilotGun) {
                                final PilotGun pilotGun2 = (PilotGun)shootPoint.rootPos;
                                final GunType type2 = pilotGun2.type;
                            }
                            final EntityShootable bulletEntity = bulletItem.getEntity(this.field_70170_p, Vec3.func_72443_a(gunVec.x + this.field_70165_t, gunVec.y + this.field_70163_u, gunVec.z + this.field_70161_v), this.axes.getYaw(), this.axes.getPitch(), this.field_70159_w, this.field_70181_x, this.field_70179_y, (EntityLivingBase)this.seats[0].field_70153_n, (float)damageMultiplier, this.driveableData.func_70301_a(slot).func_77960_j(), type);
                            this.field_70170_p.func_72838_d((Entity)bulletEntity);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.shootSound(secondary), false);
                            }
                            if (!type.evilGolem && !this.driverIsCreative() && !evil) {
                                bulletStack.func_77964_b(bulletStack.func_77960_j() + 1);
                                if (bulletStack.func_77960_j() == bulletStack.func_77958_k()) {
                                    bulletStack.func_77964_b(0);
                                    final ItemStack itemStack2 = bulletStack;
                                    --itemStack2.field_77994_a;
                                    if (bulletStack.field_77994_a == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }
                                this.driveableData.func_70299_a(slot, bulletStack);
                            }
                            if (this.epicShip) {
                                this.setShootDelay((int)(type.shootDelay(secondary) / ((this.driveableData.totalCrew * this.driveableData.totalCrew + this.driveableData.maximumCrew * 0.1) / (this.driveableData.maximumCrew * this.driveableData.maximumCrew * 0.9))), secondary);
                            }
                            if (!this.epicShip) {
                                this.setShootDelay(type.shootDelay(secondary), secondary);
                            }
                            if (type.secondaryRecoil && this.rightMouseHeld) {
                                this.ramDelay = 30;
                            }
                            if (type.primaryRecoil && this.leftMouseHeld) {
                                this.ramDelay = 30;
                            }
                        }
                        break;
                    }
                    break;
                }
                case MISSILE:
                case SHELL: {
                    this.tryRecoil();
                    if ((TeamsManager.shellsEnabled && !type.epicShip && this.ticksRepairing == 0 && this.driveableData.overheatSuffer < 1) || (type.epicShip && this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health > 3 && this.ticksFlareUsing <= 0)) {
                        int slot = -1;
                        for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
                            final ItemStack shell = this.driveableData.func_70301_a(i);
                            if (shell != null && shell.func_77973_b() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.func_77973_b()).type, weaponType)) {
                                slot = i;
                            }
                        }
                        if (slot != -1) {
                            final int damageMultiplier2 = 1;
                            final float spread2 = type.bulletSpread;
                            final float shellSpeed = type.bulletSpeed;
                            ItemStack bulletStack = this.driveableData.func_70301_a(slot);
                            final ItemBullet bulletItem = (ItemBullet)bulletStack.func_77973_b();
                            float pupperinoSpeed = 1.0f;
                            if (this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 5) {
                                pupperinoSpeed = 1.3f;
                            }
                            EntityLivingBase human2 = null;
                            if (evil) {
                                human2 = (EntityLivingBase)this.humanTarget;
                            }
                            else if (this.seats != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityLivingBase) {
                                human2 = (EntityLivingBase)this.seats[0].field_70153_n;
                            }
                            final EntityShootable bulletEntity2 = bulletItem.getEntity(this.field_70170_p, Vector3f.add(gunVecFake, new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v), null), lookVector, human2, spread2, (float)damageMultiplier2, pupperinoSpeed * shellSpeed * bulletItem.type.speedMultiplier, this.driveableData.func_70301_a(slot).func_77960_j(), type, type.evilGolem);
                            this.field_70170_p.func_72838_d((Entity)bulletEntity2);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                            this.isRecoil = true;
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.shootSound(secondary), false);
                                if (this.getDriveableType().shootDelayPrimary > 60 || this.getDriveableType().loudCannon || this.getDriveableType().earRape) {
                                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 55.0, this.field_71093_bK, type.shootSound(secondary), false);
                                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 60.0, this.field_71093_bK, type.shootSound(secondary), false);
                                }
                                if (this.getDriveableType().earRape) {
                                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 65.0, this.field_71093_bK, type.shootSound(secondary), false);
                                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 70.0, this.field_71093_bK, type.shootSound(secondary), false);
                                }
                            }
                            final DriveableData driveableData2 = this.driveableData;
                            driveableData2.overheat += 5;
                            if (type.farSound != null) {
                                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.farSound), this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0f, type.farSoundRange, this.field_71093_bK);
                            }
                            if (!type.evilGolem && !this.driverIsCreative() && !evil) {
                                bulletStack.func_77964_b(bulletStack.func_77960_j() + 1);
                                if (bulletStack.func_77960_j() == bulletStack.func_77958_k()) {
                                    bulletStack.func_77964_b(0);
                                    final ItemStack itemStack3 = bulletStack;
                                    --itemStack3.field_77994_a;
                                    if (bulletStack.field_77994_a == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }
                                this.driveableData.func_70299_a(slot, bulletStack);
                            }
                            if (this.epicShip) {
                                this.setShootDelay((int)(type.shootDelay(secondary) / ((this.driveableData.totalCrew * this.driveableData.totalCrew + this.driveableData.maximumCrew * 0.1) / (this.driveableData.maximumCrew * this.driveableData.maximumCrew * 0.9))), secondary);
                            }
                            if (!this.epicShip) {
                                this.setShootDelay(type.shootDelay(secondary), secondary);
                            }
                            if (type.secondaryRecoil && this.rightMouseHeld) {
                                this.ramDelay = 30;
                            }
                            if (type.primaryRecoil && this.leftMouseHeld) {
                                this.ramDelay = 30;
                            }
                            this.canFireIT1 = false;
                        }
                        break;
                    }
                    break;
                }
                case GUN: {}
            }
        }
    }
    
    public Vector3f getOrigin(final ShootPoint dp) {
        Vector3f localGunVec = new Vector3f(dp.rootPos.position);
        if (dp.rootPos.part == EnumDriveablePart.turret) {
            Vector3f.sub(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
            Vector3f.add(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
        }
        return this.rotate(localGunVec);
    }
    
    public Vector3f getPositionOnTurret(final Vector3f vecIn, final boolean barrel) {
        Vector3f transform = vecIn;
        RotatedAxes yawOnlyLooking = new RotatedAxes(this.seats[0].looking.getYaw(), 0.0f, 0.0f);
        if (barrel) {
            yawOnlyLooking = this.seats[0].looking;
        }
        Vector3f.sub(transform, this.getDriveableType().turretOrigin, transform);
        transform = yawOnlyLooking.findLocalVectorGlobally(transform);
        Vector3f.add(transform, this.getDriveableType().turretOrigin, transform);
        Vector3f turretOriginOffset = new Vector3f(this.getDriveableType().turretOriginOffset);
        turretOriginOffset = yawOnlyLooking.findLocalVectorGloballyYaw(turretOriginOffset);
        Vector3f.add(transform, turretOriginOffset, transform);
        return this.rotate(transform);
    }
    
    public Vector3f getDirection(final ShootPoint dp, final Vector3f vIn) {
        Vector3f localGunVec = new Vector3f(vIn);
        localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
        return this.rotate(localGunVec);
    }
    
    public Vector3f getLookVector(final ShootPoint dp) {
        return this.axes.getXAxis();
    }
    
    public Vector3f getFiringPosition(final ShootPoint dp) {
        Vector3f rootVector = new Vector3f(dp.rootPos.position);
        Vector3f offsetVector = new Vector3f(dp.offPos);
        Vector3f localGunVec = new Vector3f(dp.rootPos.position);
        if (dp.rootPos.part == EnumDriveablePart.turret) {
            if (offsetVector.x == 0.0f && offsetVector.y == 0.0f && offsetVector.z == 0.0f) {
                Vector3f.sub(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
                localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
                Vector3f.add(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            }
            else {
                final RotatedAxes yawOnlyLooking = new RotatedAxes(this.seats[0].looking.getYaw(), 0.0f, 0.0f);
                Vector3f.sub(rootVector, this.getDriveableType().turretOrigin, rootVector);
                rootVector = yawOnlyLooking.findLocalVectorGlobally(rootVector);
                Vector3f.add(rootVector, this.getDriveableType().turretOrigin, rootVector);
                Vector3f.sub(offsetVector, this.getDriveableType().turretOrigin, offsetVector);
                offsetVector = this.seats[0].looking.findLocalVectorGlobally(offsetVector);
                Vector3f.add(rootVector, offsetVector, localGunVec);
            }
        }
        return this.rotate(localGunVec);
    }
    
    public Vector3f getFakeFiringPosition(final ShootPoint dp) {
        Vector3f rootVector = new Vector3f(dp.rootPos.position);
        Vector3f offsetVector = new Vector3f(dp.offPos);
        Vector3f localGunVec = new Vector3f(dp.rootPos.position);
        final Vector3f dumbOffset = new Vector3f(0.0f, offsetVector.y, offsetVector.z);
        final Vector3f Xoffset = new Vector3f(offsetVector.x, 0.0f, 0.0f);
        if (dp.rootPos.part == EnumDriveablePart.turret) {
            if (offsetVector.x == 0.0f && offsetVector.y == 0.0f && offsetVector.z == 0.0f) {
                Vector3f.sub(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
                localGunVec = this.seats[0].looking.findLocalVectorGlobally(localGunVec);
                Vector3f.add(localGunVec, this.getDriveableType().turretOrigin, localGunVec);
            }
            else {
                final RotatedAxes yawOnlyLooking = new RotatedAxes(this.seats[0].looking.getYaw(), 0.0f, 0.0f);
                Vector3f.sub(rootVector, this.getDriveableType().turretOrigin, rootVector);
                rootVector = yawOnlyLooking.findLocalVectorGlobally(rootVector);
                Vector3f.add(rootVector, this.getDriveableType().turretOrigin, rootVector);
                Vector3f.sub(offsetVector, this.getDriveableType().turretOrigin, offsetVector);
                offsetVector = this.seats[0].looking.findLocalVectorGlobally(offsetVector);
                Vector3f.add(rootVector, dumbOffset, localGunVec);
            }
        }
        return this.rotate(localGunVec);
    }
    
    public void correctWheelPos() {
        if (this.field_70173_aa % 200 == 0) {
            for (final EntityWheel wheel : this.wheels) {
                if (wheel != null) {
                    final Vector3f localVectorGlobally;
                    final Vector3f target = localVectorGlobally = this.axes.findLocalVectorGlobally(this.getDriveableType().wheelPositions[wheel.ID].position);
                    localVectorGlobally.x += (float)this.field_70165_t;
                    final Vector3f vector3f = target;
                    vector3f.y += (float)this.field_70163_u;
                    final Vector3f vector3f2 = target;
                    vector3f2.z += (float)this.field_70161_v;
                    final int tf = 1;
                    final int cf = 1;
                    final int range = 5;
                    if (MathHelper.func_76135_e(target.x - (float)wheel.field_70165_t) > range) {
                        wheel.field_70165_t = (target.x * tf + (float)wheel.field_70165_t * cf) / (tf + cf);
                    }
                    if (MathHelper.func_76135_e(target.y - (float)wheel.field_70163_u) > range) {
                        wheel.field_70163_u = (target.y * tf + (float)wheel.field_70163_u * cf) / (tf + cf);
                    }
                    if (MathHelper.func_76135_e(target.z - (float)wheel.field_70161_v) > range) {
                        wheel.field_70161_v = (target.z * tf + (float)wheel.field_70161_v * cf) / (tf + cf);
                    }
                }
            }
        }
    }
    
    public void func_70071_h_() {
        this.epicShip = this.getDriveableType().epicShip;
        super.func_70071_h_();
        final DriveableType type = this.getDriveableType();
        final DriveableData data = this.getDriveableData();
        this.hugeBoat = ((this.getDriveableType().floatOnWater && this.getDriveableType().wheelStepHeight == 0.0f) || this.getDriveableType().solid);
        if (this.toggleTimer > 0) {
            --this.toggleTimer;
        }
        if (this.tertiaryTimer > 0) {
            --this.tertiaryTimer;
            this.shootingTertiary = true;
        }
        else {
            this.shootingTertiary = false;
        }
        if (this.AATimer > 0) {
            --this.AATimer;
            this.shootingAA = true;
        }
        else {
            this.shootingAA = false;
        }
        this.mounted = this.func_70115_ae();
        if (this.driveableData.overheat > 0) {
            final DriveableData driveableData = this.driveableData;
            --driveableData.overheat;
        }
        if (this.driveableData.overheat < 0) {
            this.driveableData.overheat = 0;
        }
        if (this.driveableData.overheat > type.overheatLimit) {
            this.driveableData.overheatSuffer = type.overheatPenalty;
            PacketPlaySound.sendSoundPacket(this.seats[0].field_70165_t, this.seats[0].field_70163_u, this.seats[0].field_70161_v, 15.0, this.field_71093_bK, type.overheatSound, false);
        }
        if (this.driveableData.overheat > 0) {
            final DriveableData driveableData2 = this.driveableData;
            driveableData2.overheat -= type.coolingBonus;
        }
        if (this.driveableData.overheatSuffer > 0) {
            final DriveableData driveableData3 = this.driveableData;
            --driveableData3.overheatSuffer;
        }
        if (!this.field_70170_p.field_72995_K && type.numMissileSlots > 0 && this.field_70173_aa % 5 == 0) {
            int slot = -1;
            for (int i = type.numMissileSlots; i > -1; --i) {
                final ItemStack shellCurrent = this.driveableData.func_70301_a(i);
                if (shellCurrent != null && shellCurrent.func_77973_b() instanceof ItemBullet && this.getDriveableType().ammo.contains(((ItemBullet)shellCurrent.func_77973_b()).type)) {
                    slot = i;
                    break;
                }
            }
            if (slot != -1 && this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayerMP) {
                FlansMod.getPacketHandler().sendTo(new PacketCurrentMissile(this.func_145782_y(), this.driveableData.func_70301_a(slot)), (EntityPlayerMP)this.seats[0].field_70153_n);
            }
        }
        if (this.driveableData.WarpLimit < type.numPassengers) {
            --this.warpTimer;
            if (this.warpTimer == 1) {
                final DriveableData driveableData4 = this.driveableData;
                ++driveableData4.WarpLimit;
            }
            if (this.warpTimer <= 0) {
                this.warpTimer = 1200;
            }
        }
        else {
            this.warpTimer = 1200;
        }
        if (this.hugeBoat) {
            for (int j = 0; j < this.field_70170_p.field_72996_f.size(); ++j) {
                final Object obj = this.field_70170_p.field_72996_f.get(j);
                if (obj instanceof EntityPlayer && !this.isPartOfThis((Entity)obj)) {
                    this.moveRiders((Entity)obj);
                }
                if (!(obj instanceof EntityWheel) || this.isPartOfThis((Entity)obj) || this.func_70032_d((Entity)obj) <= this.getDriveableType().bulletDetectionRadius) {}
                if (!(obj instanceof EntityDriveable) || this.isPartOfThis((Entity)obj) || this.func_70032_d((Entity)obj) <= this.getDriveableType().bulletDetectionRadius) {}
            }
        }
        if (this.seats[0] != null && this.seats[0].field_70153_n != null && type.nightScope && this.aiming && !this.field_70170_p.field_72995_K) {
            ((EntityLivingBase)this.seats[0].field_70153_n).func_70690_d(new PotionEffect(Potion.field_76439_r.field_76415_H, 60));
        }
        if (this.deckCheck != this.prevDeckCheck) {
            this.onDeck = true;
        }
        else {
            this.onDeck = false;
        }
        final float e = 2.7182817f;
        final float power = (float)(-0.5 * this.backwardsTimer);
        if (this.backwardsTimer > 0) {
            this.recoilEnergy = (float)((this.getDriveableType().primaryRecoilHeight - this.getDriveableType().primaryRecoilHeight * Math.pow(e, power)) * Math.pow(0.8999999761581421, this.backwardsTimer));
        }
        else {
            this.recoilEnergy = 0.0f;
        }
        float engineSum = 0.0f;
        float engineTotal = 0.0f;
        final float engine1 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine).health;
        final float engine2 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine2).health;
        final float engine3 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine3).health;
        final float engine4 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine4).health;
        final float engine5 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine5).health;
        final float engine6 = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine6).health;
        final float engine1m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth;
        final float engine2m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine2).maxHealth;
        final float engine3m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine3).maxHealth;
        final float engine4m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine4).maxHealth;
        final float engine5m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine5).maxHealth;
        final float engine6m = (float)this.getDriveableData().parts.get(EnumDriveablePart.engine6).maxHealth;
        engineSum = engine1 + engine2 + engine3 + engine4 + engine5 + engine6;
        engineTotal = engine1m + engine2m + engine3m + engine4m + engine5m + engine6m;
        final float engineRatio = (engineSum + 1.0f) / engineTotal;
        if (this.throttle > engineRatio) {
            this.throttle = engineRatio;
        }
        if (type.IT1 && !this.disabled) {
            boolean fireButtonheld = false;
            if (type.weaponType(false) == EnumWeaponType.MISSILE) {
                fireButtonheld = this.leftMouseHeld;
            }
            if (type.weaponType(true) == EnumWeaponType.MISSILE) {
                fireButtonheld = this.rightMouseHeld;
            }
            this.prevDrakonDoorAngle = this.drakonDoorAngle;
            this.prevDrakonArmAngle = this.drakonArmAngle;
            this.prevDrakonRailAngle = this.drakonRailAngle;
            if (this.canFireIT1) {
                this.reloadingDrakon = false;
            }
            if (this.stage == 0) {
                this.stage = 1;
            }
            if (this.stage == 8 && fireButtonheld) {
                this.stage = 1;
                this.timeTillDeactivate = 5;
                this.toDeactivate = true;
            }
            if (this.timeTillDeactivate <= 0 && this.toDeactivate) {
                this.canFireIT1 = false;
                this.toDeactivate = false;
            }
            if (this.reloadAnimTime <= 0) {
                this.IT1Reload();
            }
            --this.reloadAnimTime;
            --this.timeTillDeactivate;
        }
        if (this.shieldHitTimer > 0) {
            --this.shieldHitTimer;
        }
        this.prevPropAngle = this.propAngle;
        this.prevRotorAngle = this.rotorAngle;
        if (this.throttle != 0.0f) {
            this.propAngle += (float)(Math.pow(this.throttle, 0.4) * 1.5);
            this.rotorAngle += this.throttle / 7.0f;
        }
        if ((this.leftMouseHeld && !this.disabled) || this.ticksRepairing > 1) {
            this.tryRecoil();
            this.setRecoilTimer();
        }
        this.lastRecoilPos = this.recoilPos;
        if (this.recoilPos > 180.0f - 180.0f / type.recoilTime) {
            this.recoilPos = 0.0f;
        }
        if (this.recoilTimer <= 0) {
            this.isRecoil = false;
        }
        if (this.isRecoil) {
            this.recoilPos += 180.0f / type.recoilTime;
        }
        if (this.recoilTimer >= 0) {
            --this.recoilTimer;
            ++this.backwardsTimer;
        }
        else {
            this.backwardsTimer = 0;
        }
        if (this.recoilTimer < 0.1f * this.getDriveableType().shootDelayPrimary) {
            this.backwardsTimer = 0;
        }
        this.checkInventoryChanged();
        if (this.field_70170_p.func_72953_d(this.field_70121_D) && !this.hugeBoat) {
            if (this.throttle >= type.maxThrottleInWater) {
                this.throttle = type.maxThrottleInWater;
            }
            if (this.throttle <= -type.maxThrottleInWater) {
                this.throttle = -type.maxThrottleInWater;
            }
            if (this.field_70170_p.func_72953_d(this.field_70121_D.func_72329_c().func_72317_d(0.0, (double)type.maxDepth, 0.0))) {
                this.throttle = 0.0f;
                this.disabled = true;
            }
        }
        else {
            this.disabled = false;
        }
        if (TeamsManager.violence) {
            this.throttle = 0.0f;
        }
        if (this.isShowedPosition) {
            for (final Object obj2 : this.field_70170_p.field_72996_f) {
                final Entity entityy = (Entity)obj2;
                if (entityy instanceof EntityPlayer) {
                    ((EntityPlayer)entityy).func_145747_a((IChatComponent)new ChatComponentText("Position is " + this.field_70165_t + this.field_70161_v + " Distance is " + this.func_70032_d(entityy)));
                }
            }
        }
        if ((type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) && !this.field_70170_p.field_72995_K && this.seats.length > 0 && this.lockOnSoundDelay <= 0 && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer) {
            final Vector3f playerVecRelToVehicle = this.seats[0].playerLooking.findGlobalVectorLocally(new Vector3f(-1.0f, 0.0f, 0.0f));
            final Vector3f playerVec = this.axes.findGlobalVectorLocally(playerVecRelToVehicle);
            for (final Object obj3 : this.field_70170_p.field_72996_f) {
                final Entity entity = (Entity)obj3;
                if (((type.lockOnToMechas && entity instanceof EntityMecha) || (type.lockOnToVehicles && entity instanceof EntityVehicle) || (type.lockOnToPlanes && entity instanceof EntityPlane) || (type.lockOnToPlayers && entity instanceof EntityPlayer) || (type.lockOnToLivings && entity instanceof EntityLivingBase)) && this.func_70068_e(entity) < type.maxRangeLockOn * type.maxRangeLockOn) {
                    FlansMod.log(entity.toString());
                    final Vector3f relPosVec = new Vector3f(-entity.field_70165_t + this.seats[0].field_70165_t, -entity.field_70163_u + this.seats[0].field_70163_u, entity.field_70161_v - this.seats[0].field_70161_v);
                    final float angle = Math.abs(Vector3f.angle(playerVec, relPosVec));
                    if (angle < Math.toRadians(type.canLockOnAngle)) {
                        PacketPlaySound.sendSoundPacket(this.seats[0].field_70165_t, this.seats[0].field_70163_u, this.seats[0].field_70161_v, 10.0, this.field_71093_bK, type.lockOnSound, false);
                        if (entity instanceof EntityDriveable) {
                            PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, ((EntityDriveable)entity).getDriveableType().lockedOnSoundRange, entity.field_71093_bK, ((EntityDriveable)entity).getDriveableType().lockingOnSound, false);
                        }
                        this.lockOnSoundDelay = type.lockOnSoundTime;
                        break;
                    }
                    continue;
                }
            }
        }
        if (this.lockOnSoundDelay > 0) {
            --this.lockOnSoundDelay;
        }
        final DriveablePart bow = this.getDriveableData().parts.get(EnumDriveablePart.bow);
        final DriveablePart stern = this.getDriveableData().parts.get(EnumDriveablePart.stern);
        final DriveablePart leftShip = this.getDriveableData().parts.get(EnumDriveablePart.left);
        final DriveablePart right = this.getDriveableData().parts.get(EnumDriveablePart.right);
        final DriveablePart midsection = this.getDriveableData().parts.get(EnumDriveablePart.midsection);
        if ((type.epicShip && (this.ticksFlareUsing > 0 || (bow.health <= 0 && bow.maxHealth > 0) || (stern.health <= 0 && stern.maxHealth > 0) || (leftShip.health <= 0 && leftShip.maxHealth > 0) || (right.health <= 0 && right.maxHealth > 0) || (midsection.health <= 0 && midsection.maxHealth > 0))) || this.ticksRepairing > 0) {
            this.throttle = 0.0f;
        }
        if (type.crewEngine && this.throttle > 0.01 && this.throttle > this.driveableData.totalCrew / (float)this.driveableData.maximumCrew) {
            this.throttle = this.driveableData.totalCrew / (float)this.driveableData.maximumCrew;
        }
        if (type.crewEngine && this.throttle < -0.01 && this.throttle < -1.0f * this.driveableData.totalCrew / this.driveableData.maximumCrew) {
            this.throttle = -1.0f * this.driveableData.totalCrew / this.driveableData.maximumCrew;
        }
        if (this.field_70154_o != null) {
            this.invulnerableUnmountCount = 80;
        }
        else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }
        if (!this.field_70170_p.field_72995_K) {
            for (int k = 0; k < this.getDriveableType().numPassengers + 1; ++k) {
                if (this.seats[k] == null || !this.seats[k].field_70175_ag) {
                    this.seats[k] = new EntitySeat(this.field_70170_p, this, k);
                    this.field_70170_p.func_72838_d((Entity)this.seats[k]);
                }
            }
            for (int k = 0; k < type.wheelPositions.length; ++k) {
                if (this.wheels[k] == null || !this.wheels[k].field_70175_ag) {
                    this.wheels[k] = new EntityWheel(this.field_70170_p, this, k);
                    this.field_70170_p.func_72838_d((Entity)this.wheels[k]);
                }
            }
        }
        if (this.hasEnoughFuel()) {
            this.harvesterAngle += this.throttle / 5.0f;
        }
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            if (part.box != null) {
                part.update(this);
                if (this.field_70170_p.field_72995_K) {
                    if (part.onFire) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.field_70146_Z.nextFloat() * part.box.w, part.box.y + this.field_70146_Z.nextFloat() * part.box.h, part.box.z + this.field_70146_Z.nextFloat() * part.box.d));
                        this.field_70170_p.func_72869_a("flame", this.field_70165_t + pos.x, this.field_70163_u + pos.y, this.field_70161_v + pos.z, 0.0, 0.0, 0.0);
                    }
                    if (part.health > 0 && part.health < part.maxHealth / 2) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.field_70146_Z.nextFloat() * part.box.w, part.box.y + this.field_70146_Z.nextFloat() * part.box.h, part.box.z + this.field_70146_Z.nextFloat() * part.box.d));
                        this.field_70170_p.func_72869_a((part.health < part.maxHealth / 4) ? "largesmoke" : "smoke", this.field_70165_t + pos.x, this.field_70163_u + pos.y, this.field_70161_v + pos.z, 0.0, 0.0, 0.0);
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.d));
                        this.field_70170_p.func_72869_a("flame", this.field_70165_t + pos.x, this.field_70163_u + pos.y, this.field_70161_v + pos.z, 0.0, 0.0, 0.0);
                        final Vector3f posturret = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                        this.field_70170_p.func_72869_a("flame", this.field_70165_t + posturret.x, this.field_70163_u + posturret.y, this.field_70161_v + posturret.z, 0.0, 0.0, 0.0);
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.d));
                        this.field_70170_p.func_72869_a("flame", this.field_70165_t + pos.x, this.field_70163_u + pos.y, this.field_70161_v + pos.z, 0.0, 0.0, 0.0);
                        final Vector3f posturret = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                        this.field_70170_p.func_72869_a("flame", this.field_70165_t + posturret.x, this.field_70163_u + posturret.y, this.field_70161_v + posturret.z, 0.0, 0.0, 0.0);
                    }
                    if ((type.epicShip && this.ticksFlareUsing > 0) || this.ticksRepairing > 0) {
                        if (this.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.left).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.w, this.getDriveableData().parts.get(EnumDriveablePart.left).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.h, this.getDriveableData().parts.get(EnumDriveablePart.left).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 1, "heart"), this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.core).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.w, this.getDriveableData().parts.get(EnumDriveablePart.core).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.h, this.getDriveableData().parts.get(EnumDriveablePart.core).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 1, "heart"), this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 1, "heart"), this.field_70165_t + posleft.x, this.field_70163_u + posleft.y, this.field_70161_v + posleft.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0) {
                            final Vector3f posright = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.right).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.w, this.getDriveableData().parts.get(EnumDriveablePart.right).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.h, this.getDriveableData().parts.get(EnumDriveablePart.right).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posright.x, this.field_70163_u + posright.y, this.field_70161_v + posright.z, 1, "heart"), this.field_70165_t + posright.x, this.field_70163_u + posright.y, this.field_70161_v + posright.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0) {
                            final Vector3f posbow = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.bow).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.w, this.getDriveableData().parts.get(EnumDriveablePart.bow).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.h, this.getDriveableData().parts.get(EnumDriveablePart.bow).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posbow.x, this.field_70163_u + posbow.y, this.field_70161_v + posbow.z, 1, "heart"), this.field_70165_t + posbow.x, this.field_70163_u + posbow.y, this.field_70161_v + posbow.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0) {
                            final Vector3f posstern = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.stern).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.w, this.getDriveableData().parts.get(EnumDriveablePart.stern).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.h, this.getDriveableData().parts.get(EnumDriveablePart.stern).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posstern.x, this.field_70163_u + posstern.y, this.field_70161_v + posstern.z, 1, "heart"), this.field_70165_t + posstern.x, this.field_70163_u + posstern.y, this.field_70161_v + posstern.z, 200.0f, this.field_71093_bK);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxHealth > 0) {
                            final Vector3f posmid = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.x + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.w, this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.y + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.h, this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.z + this.field_70146_Z.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t + posmid.x, this.field_70163_u + posmid.y, this.field_70161_v + posmid.z, 1, "heart"), this.field_70165_t + posmid.x, this.field_70163_u + posmid.y, this.field_70161_v + posmid.z, 200.0f, this.field_71093_bK);
                        }
                    }
                }
                if (part.onFire) {
                    if (this.field_70170_p.func_72896_J() && this.field_70146_Z.nextInt(40) == 0) {
                        part.onFire = false;
                    }
                    final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + part.box.w / 2.0f, part.box.y + part.box.h / 2.0f, part.box.z + part.box.d / 2.0f));
                    if (this.field_70170_p.func_147439_a(MathHelper.func_76128_c(this.field_70165_t + pos.x), MathHelper.func_76128_c(this.field_70163_u + pos.y), MathHelper.func_76128_c(this.field_70161_v + pos.z)).func_149688_o() != Material.field_151586_h) {
                        continue;
                    }
                    part.onFire = false;
                }
                else {
                    this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0f + part.box.w / 32.0f, part.box.y / 16.0f + part.box.h / 32.0f, part.box.z / 16.0f + part.box.d / 32.0f));
                }
            }
        }
        for (int k = 0; k < type.emitters.size(); ++k) {
            final DriveableType.ParticleEmitter emitter = type.emitters.get(k);
            final int[] emitterTimers = this.emitterTimers;
            final int n = k;
            --emitterTimers[n];
            boolean canEmit = false;
            boolean inThrottle = false;
            final DriveablePart part2 = this.getDriveableData().parts.get(EnumDriveablePart.getPart(emitter.part));
            final float healthPercentage = part2.health / (float)part2.maxHealth;
            canEmit = (this.isPartIntact(EnumDriveablePart.getPart(emitter.part)) && healthPercentage >= emitter.minHealth && healthPercentage <= emitter.maxHealth);
            if (this.throttle >= emitter.minThrottle && this.throttle <= emitter.maxThrottle) {
                inThrottle = true;
            }
            if (this.isMecha) {
                inThrottle = true;
            }
            if (this.emitterTimers[k] <= 0) {
                if (inThrottle && canEmit) {
                    Vector3f velocity = new Vector3f(0.0f, 0.0f, 0.0f);
                    Vector3f pos2 = new Vector3f(0.0f, 0.0f, 0.0f);
                    if (this.seats != null && this.seats[0] != null) {
                        if (EnumDriveablePart.getPart(emitter.part) != EnumDriveablePart.turret && EnumDriveablePart.getPart(emitter.part) != EnumDriveablePart.barrel) {
                            final Vector3f localPosition = new Vector3f(emitter.origin.x + this.field_70146_Z.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.field_70146_Z.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.field_70146_Z.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.axes.findLocalVectorGlobally(localPosition);
                            velocity = this.axes.findLocalVectorGlobally(emitter.velocity);
                        }
                        else if (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.turret || (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.head && emitter.part != "barrel")) {
                            final Vector3f localPosition2 = new Vector3f(emitter.origin.x + this.field_70146_Z.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.field_70146_Z.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.field_70146_Z.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.getPositionOnTurret(localPosition2, false);
                            velocity = this.getPositionOnTurret(emitter.velocity, false);
                        }
                        else if (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.barrel) {
                            final Vector3f localPosition2 = new Vector3f(emitter.origin.x + this.field_70146_Z.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.field_70146_Z.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.field_70146_Z.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.getPositionOnTurret(localPosition2, true);
                            velocity = this.getPositionOnTurret(emitter.velocity, true);
                        }
                        FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(emitter.effectType, this.field_70165_t + pos2.x, this.field_70163_u + pos2.y, this.field_70161_v + pos2.z, velocity.x, velocity.y, velocity.z), this.field_70165_t + pos2.x, this.field_70163_u + pos2.y, this.field_70161_v + pos2.z, 150.0f, this.field_71093_bK);
                    }
                }
                this.emitterTimers[k] = emitter.emitRate;
            }
        }
        for (int k = 0; k < type.afterBurns.size(); ++k) {
            final DriveableType.AfterBurnEmitter emitter2 = type.afterBurns.get(k);
            boolean canEmit = false;
            final boolean inThrottle = false;
            final DriveablePart part2 = this.getDriveableData().parts.get(EnumDriveablePart.getPart(emitter2.part));
            canEmit = this.afterBurning;
            if (canEmit) {
                Vector3f velocity2 = new Vector3f(0.0f, 0.0f, 0.0f);
                Vector3f pos3 = new Vector3f(0.0f, 0.0f, 0.0f);
                if (this.seats != null && this.seats[0] != null) {
                    if (EnumDriveablePart.getPart(emitter2.part) != EnumDriveablePart.turret && EnumDriveablePart.getPart(emitter2.part) != EnumDriveablePart.barrel) {
                        final Vector3f localPosition3 = new Vector3f(emitter2.origin.x + this.field_70146_Z.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.field_70146_Z.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.field_70146_Z.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.axes.findLocalVectorGlobally(localPosition3);
                        velocity2 = this.axes.findLocalVectorGlobally(emitter2.velocity);
                    }
                    else if (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.turret || (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.head && emitter2.part != "barrel")) {
                        final Vector3f localPosition4 = new Vector3f(emitter2.origin.x + this.field_70146_Z.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.field_70146_Z.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.field_70146_Z.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.getPositionOnTurret(localPosition4, false);
                        velocity2 = this.getPositionOnTurret(emitter2.velocity, false);
                    }
                    else if (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.barrel) {
                        final Vector3f localPosition4 = new Vector3f(emitter2.origin.x + this.field_70146_Z.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.field_70146_Z.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.field_70146_Z.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.getPositionOnTurret(localPosition4, true);
                        velocity2 = this.getPositionOnTurret(emitter2.velocity, true);
                    }
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(emitter2.effectType, this.field_70165_t + pos3.x, this.field_70163_u + pos3.y, this.field_70161_v + pos3.z, velocity2.x, velocity2.y, velocity2.z), this.field_70165_t + pos3.x, this.field_70163_u + pos3.y, this.field_70161_v + pos3.z, 150.0f, this.field_71093_bK);
                }
            }
        }
        this.checkParts();
        this.field_70126_B = this.axes.getYaw();
        this.field_70127_C = this.axes.getPitch();
        this.prevRotationRoll = this.axes.getRoll();
        this.prevAxes = this.axes.clone();
        if (this.field_70153_n != null && this.field_70153_n.field_70128_L) {
            this.field_70153_n = null;
        }
        if (this.field_70153_n != null && this.field_70128_L) {
            this.field_70153_n.func_70078_a((Entity)null);
        }
        if (this.field_70153_n != null) {
            this.field_70153_n.field_70143_R = 0.0f;
        }
        final boolean canThrust = this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f;
        if ((this.seats[0] != null && this.seats[0].field_70153_n == null) || (!canThrust && this.getDriveableType().maxThrottle != 0.0f && this.getDriveableType().maxNegativeThrottle != 0.0f)) {
            this.throttle *= 0.9995f;
        }
        if (this.seats[0] != null && this.seats[0].field_70153_n == null) {
            final boolean b = false;
            this.leftMouseHeld = b;
            this.rightMouseHeld = b;
        }
        if (this.shootDelayPrimary > 0) {
            --this.shootDelayPrimary;
        }
        if (this.shootDelaySecondary > 0) {
            --this.shootDelaySecondary;
        }
        if (data.fakeReloadShell > 0.0f) {}
        final DriveableData driveableData5 = data;
        --driveableData5.fakeReloadShell;
        if (data.fakeReloadMissile > 0.0f) {}
        final DriveableData driveableData6 = data;
        --driveableData6.fakeReloadMissile;
        if (this.getDriveableType().reloadSoundTick != 15214541 && this.shootDelayPrimary == this.getDriveableType().reloadSoundTick) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.shootReloadSound, false);
        }
        if (this.field_70173_aa == 40) {
            this.driveableData.originX = (int)this.field_70165_t;
            this.driveableData.originY = (int)this.field_70163_u + 1;
            this.driveableData.originZ = (int)this.field_70161_v;
        }
        if (this.field_70173_aa == 1) {
            if (type.hasAPS) {
                this.APSchecker = 1;
            }
            this.APSmax = type.APSdelayMax;
            this.damageVsCrew = type.damageVsCrew;
            if (!this.driveableData.emergencyMode) {
                this.setShootDelay(this.getDriveableType().placeTimePrimary, false);
                this.setShootDelay(this.getDriveableType().placeTimeSecondary, true);
                data.fakeReloadShell = (float)this.getDriveableType().placeTimePrimary;
                data.fakeReloadMissile = (float)this.getDriveableType().placeTimeSecondary;
            }
            if (!this.field_70170_p.field_72995_K) {
                if (!this.getDriveableType().placeSoundPrimary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getDriveableType().placeSoundPrimary, false);
                }
                if (!this.getDriveableType().placeSoundSecondary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getDriveableType().placeSoundSecondary, false);
                }
            }
        }
        if (type.evilGolem) {
            if (this.softTarget != null && (this.softTarget.field_70128_L || (this.softTarget.func_70115_ae() && this.softTarget.field_70154_o != null && this.softTarget.field_70154_o instanceof EntitySeat && ((EntitySeat)this.softTarget.field_70154_o).driveable != null && ((EntitySeat)this.softTarget.field_70154_o).driveable instanceof EntityVehicle))) {
                this.softTarget = null;
            }
            if (this.airTarget != null && this.airTarget.field_70128_L) {
                this.airTarget = null;
            }
            if (this.softTarget == null && this.airTarget == null && this.field_70173_aa % 10.0f == 0.0f && !this.field_70170_p.field_72995_K) {
                if (this.field_70170_p.field_72995_K) {
                    this.softTarget = null;
                    this.airTarget = null;
                }
                for (final Object obj4 : this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b((double)type.evilRange, (double)type.evilRange, (double)type.evilRange))) {
                    final Entity candidateEntity = (Entity)obj4;
                    if (candidateEntity != null && candidateEntity != this && (candidateEntity instanceof EntityPlayer || candidateEntity instanceof EntityPlane) && candidateEntity.func_70032_d((Entity)this) < type.evilRange) {
                        if (candidateEntity instanceof EntityPlayer && (!candidateEntity.func_70115_ae() || candidateEntity.field_70154_o == null || !(candidateEntity.field_70154_o instanceof EntitySeat) || ((EntitySeat)candidateEntity.field_70154_o).driveable == null || !(((EntitySeat)candidateEntity.field_70154_o).driveable instanceof EntityVehicle))) {
                            this.softTarget = (EntityPlayer)candidateEntity;
                        }
                        else {
                            if (!(candidateEntity instanceof EntityPlane) || ((EntityPlane)candidateEntity).type == null || ((EntityPlane)candidateEntity).type.evilGolem) {
                                continue;
                            }
                            this.airTarget = (EntityPlane)candidateEntity;
                        }
                    }
                }
            }
            if (this.softTarget != null || this.airTarget != null) {
                double dX = 0.0;
                double dY = 0.0;
                double dZ = 0.0;
                float dx2 = 0.0f;
                float dy2 = 0.0f;
                float dz2 = 0.0f;
                if (this.softTarget != null && this.seats != null && this.seats[0] != null) {
                    dX = this.softTarget.field_70165_t - this.seats[0].field_70165_t;
                    dY = this.softTarget.field_70163_u - (this.seats[0].field_70163_u + 0.5);
                    dZ = this.softTarget.field_70161_v - this.seats[0].field_70161_v;
                }
                if (this.airTarget != null && this.seats != null && this.seats[0] != null) {
                    dX = this.airTarget.field_70165_t - this.seats[0].field_70165_t;
                    dY = this.airTarget.field_70163_u - (this.seats[0].field_70163_u + 1.5);
                    dZ = this.airTarget.field_70161_v - this.seats[0].field_70161_v;
                }
                final double distanceToSoftTarget = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
                dx2 = (float)(dX / distanceToSoftTarget);
                dy2 = (float)(dY / distanceToSoftTarget);
                dz2 = (float)(dZ / distanceToSoftTarget);
                this.evilVector = new Vector3f(dx2, dy2, dz2);
                if (distanceToSoftTarget > type.evilRange) {
                    this.softTarget = null;
                    this.humanTarget = null;
                }
                this.aimYawAA = 360.0f + (float)Math.atan2(dZ, dX) * 180.0f / 3.14159f - this.axes.getYaw();
                this.aimPitchAA = -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180.0f / 3.14159f;
                if (this.seats != null && this.AATimer < 4 && this.driveableData.overheatSuffer < 1) {
                    this.AATimer += 2;
                }
            }
        }
        if (!this.field_70170_p.field_72995_K) {
            if (type.evilGolem && this.getDriveableType().modePrimary == EnumFireMode.FULLAUTO && this.shootingAA) {
                this.shoot(false, true);
                this.shoot(true, true);
            }
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.FULLAUTO && !this.getDriveableType().needsThrottle) {
                this.shoot(false, false);
            }
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.FULLAUTO && this.getDriveableType().needsThrottle && this.throttle > 0.7) {
                this.shoot(false, false);
            }
            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.FULLAUTO) {
                this.shoot(true, false);
                if (type.secondaryRecoil && this.rightMouseHeld) {
                    this.ramDelay = 20;
                }
            }
            this.minigunSpeedPrimary *= 0.9f;
            this.minigunSpeedSecondary *= 0.9f;
            if (this.leftMouseHeld && this.getDriveableType().modePrimary == EnumFireMode.MINIGUN) {
                this.minigunSpeedPrimary += 0.1f;
                if (this.minigunSpeedPrimary > 1.0f) {
                    this.shoot(false, false);
                }
            }
            if (this.rightMouseHeld && this.getDriveableType().modeSecondary == EnumFireMode.MINIGUN) {
                this.minigunSpeedSecondary += 0.1f;
                if (this.minigunSpeedSecondary > 1.0f) {
                    this.shoot(true, false);
                }
            }
        }
        this.prevDeckCheck = this.deckCheck;
        final int fuelMultiplier = 2;
        if (data.fuelInTank >= type.fuelTankSize) {
            return;
        }
        for (int l = 0; l < data.func_70302_i_(); ++l) {
            final ItemStack stack = data.func_70301_a(l);
            if (stack != null) {
                if (stack.field_77994_a > 0) {
                    final Item item = stack.func_77973_b();
                    if (data.engine.useRFPower) {
                        if (item instanceof IEnergyContainerItem) {
                            final IEnergyContainerItem energy = (IEnergyContainerItem)item;
                            final DriveableData driveableData7 = data;
                            driveableData7.fuelInTank += fuelMultiplier * energy.extractEnergy(stack, data.engine.RFDrawRate, false) / data.engine.RFDrawRate;
                        }
                    }
                    else {
                        if (item instanceof ItemPart) {
                            final PartType part3 = ((ItemPart)item).type;
                            if (part3.category == 9) {
                                final DriveableData driveableData8 = data;
                                driveableData8.fuelInTank += fuelMultiplier;
                                final int damage = stack.func_77960_j();
                                stack.func_77964_b(damage + 1);
                                if (damage < stack.func_77958_k()) {
                                    break;
                                }
                                stack.func_77964_b(0);
                                final ItemStack itemStack = stack;
                                --itemStack.field_77994_a;
                                if (stack.field_77994_a <= 0) {
                                    data.func_70299_a(l, null);
                                    break;
                                }
                                break;
                            }
                        }
                        else if (FlansMod.hooks.BuildCraftLoaded && stack.func_77969_a(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 1000 * fuelMultiplier <= type.fuelTankSize) {
                            final DriveableData driveableData9 = data;
                            driveableData9.fuelInTank += 1000 * fuelMultiplier;
                            data.func_70299_a(l, new ItemStack(Items.field_151133_ar));
                        }
                        else if (FlansMod.hooks.BuildCraftLoaded && stack.func_77969_a(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 2000 * fuelMultiplier <= type.fuelTankSize) {
                            final DriveableData driveableData10 = data;
                            driveableData10.fuelInTank += 2000 * fuelMultiplier;
                            data.func_70299_a(l, new ItemStack(Items.field_151133_ar));
                        }
                        this.field_70169_q = this.field_70165_t;
                        this.field_70167_r = this.field_70163_u;
                        this.field_70166_s = this.field_70161_v;
                    }
                }
            }
        }
        final HashSet<String> remove = new HashSet<String>();
        for (final Map.Entry<String, Integer> entry : this.unlocks.entrySet()) {
            entry.setValue(entry.getValue() - 1);
            if (entry.getValue() <= 0) {
                remove.add(entry.getKey());
            }
        }
        for (final String a : remove) {
            this.unlocks.remove(a);
        }
    }
    
    public void checkInventoryChanged() {
        final DriveableType type = this.getDriveableType();
        if (type == null) {
            return;
        }
        if (this.field_70170_p.field_72995_K) {
            return;
        }
        if (!this.driveableData.inventoryChanged) {
            return;
        }
        this.driveableData.inventoryChanged = false;
        try {
            for (int ps = 0; ps < 2; ++ps) {
                EnumWeaponType weaponType = (ps == 0) ? type.primary : type.secondary;
                if (weaponType == EnumWeaponType.GUN) {
                    weaponType = EnumWeaponType.NONE;
                }
                int istart = this.getInventoryStart(weaponType);
                if (istart == this.driveableData.getAmmoInventoryStart()) {
                    istart += type.numPassengerGunners;
                }
                final int isize = this.getInventorySize(weaponType);
                if (istart >= 0 || isize > 0) {
                    if (this.prevInventoryItems[ps] == null) {
                        this.prevInventoryItems[ps] = new ItemStack[isize];
                    }
                    for (int i = 0; i < isize; ++i) {
                        final ItemStack itemStack = this.driveableData.func_70301_a(istart + i);
                        if (itemStack != null && itemStack.func_77973_b() instanceof ItemBullet && (this.prevInventoryItems[ps][i] == null || !ItemStack.func_77989_b(itemStack, this.prevInventoryItems[ps][i])) && type.isValidAmmo(((ItemBullet)itemStack.func_77973_b()).type, weaponType)) {
                            this.onWeaponInventoryChanged(ps == 1);
                            break;
                        }
                    }
                    for (int i = 0; i < isize; ++i) {
                        this.prevInventoryItems[ps][i] = this.driveableData.func_70301_a(istart + i);
                    }
                }
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
    public void onWeaponInventoryChanged(final boolean secondary) {
        final DriveableType type = this.getDriveableType();
        if (!secondary) {
            if (type.reloadTimePrimary > 0 && this.getShootDelay(secondary) <= 0) {
                FlansMod.log("EntityDriveable Reload Primary " + type.reloadTimePrimary + " tick");
                this.setShootDelay(type.reloadTimePrimary, secondary);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getDriveableType().reloadSoundPrimary, false);
            }
        }
        else if (type.reloadTimeSecondary > 0 && this.getShootDelay(secondary) <= 0) {
            FlansMod.log("EntityDriveable Reload Secondary " + type.reloadTimeSecondary + " tick");
            this.setShootDelay(type.reloadTimeSecondary, secondary);
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getDriveableType().reloadSoundSecondary, false);
        }
    }
    
    public int getInventoryStart(final EnumWeaponType wt) {
        switch (wt) {
            case GUN:
            case NONE: {
                return this.driveableData.getAmmoInventoryStart();
            }
            case MISSILE:
            case SHELL: {
                return this.driveableData.getMissileInventoryStart();
            }
            case BOMB:
            case MINE: {
                return this.driveableData.getBombInventoryStart();
            }
            default: {
                return -1;
            }
        }
    }
    
    public int getInventorySize(final EnumWeaponType wt) {
        switch (wt) {
            case GUN:
            case NONE: {
                return this.driveableData.ammo.length;
            }
            case MISSILE:
            case SHELL: {
                return this.driveableData.missiles.length;
            }
            case BOMB:
            case MINE: {
                return this.driveableData.bombs.length;
            }
            default: {
                return -1;
            }
        }
    }
    
    public void checkForCollisions() {
        boolean damagePart = false;
        final boolean crashInWater = false;
        final double speed = this.getSpeedXYZ();
        for (final DriveablePosition p : this.getDriveableType().collisionPoints) {
            if (this.driveableData.parts.get(p.part).dead) {
                continue;
            }
            final Vector3f lastRelPos = this.prevAxes.findLocalVectorGlobally(p.position);
            final Vec3 lastPos = Vec3.func_72443_a(this.field_70169_q + lastRelPos.x, this.field_70167_r + lastRelPos.y, this.field_70166_s + lastRelPos.z);
            final Vector3f currentRelPos = this.axes.findLocalVectorGlobally(p.position);
            final Vec3 currentPos = Vec3.func_72443_a(this.field_70165_t + currentRelPos.x, this.field_70163_u + currentRelPos.y, this.field_70161_v + currentRelPos.z);
            if (FlansMod.DEBUG && this.field_70170_p.field_72995_K) {
                this.field_70170_p.func_72838_d((Entity)new EntityDebugVector(this.field_70170_p, new Vector3f(lastPos), Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1.0f, 0.0f, 0.0f));
            }
            final MovingObjectPosition hit = this.field_70170_p.func_72901_a(lastPos, currentPos, crashInWater);
            if (hit == null || hit.field_72313_a != MovingObjectPosition.MovingObjectType.BLOCK) {
                continue;
            }
            final int x = hit.field_72311_b;
            final int y = hit.field_72312_c;
            final int z = hit.field_72309_d;
            final Block blockHit = this.field_70170_p.func_147439_a(x, y, z);
            final int meta = this.field_70170_p.func_72805_g(x, y, z);
            final float blockHardness = blockHit.func_149712_f(this.field_70170_p, x, y, z);
            float damage = 1.0f + blockHardness * blockHardness * (float)speed;
            if (null == blockHit.func_149668_a(this.field_70170_p, x, y, z)) {
                damage = 0.0f;
            }
            if (damage > 0.0f) {
                damagePart = true;
                this.getDriveableData().parts.get(p.part).health -= (int)damage;
            }
            if (!this.attackPart(p.part, DamageSource.field_76368_d, damage) && TeamsManager.driveablesBreakBlocks) {
                this.field_70170_p.func_72889_a((EntityPlayer)null, 2001, x, y, z, Block.func_149682_b(blockHit) + (meta << 12));
                this.getDriveableData().parts.get(p.part).health -= (int)damage + 1;
                if (this.field_70170_p.field_72995_K) {
                    continue;
                }
                blockHit.func_149697_b(this.field_70170_p, x, y, z, meta, 1);
                this.field_70170_p.func_147468_f(x, y, z);
            }
            else {
                this.getDriveableData().parts.get(p.part).health -= (int)damage;
                this.field_70170_p.func_72876_a((Entity)this, currentPos.field_72450_a, currentPos.field_72448_b, currentPos.field_72449_c, 1.0f, false);
            }
        }
        if (damagePart && !this.field_70170_p.field_72995_K) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, 100.0f, this.field_71093_bK);
        }
    }
    
    protected void func_70069_a(final float k) {
        final double fallDist = (this.field_70163_u - this.field_70167_r + this.field_70181_x) / 2.0;
        float damage = (float)((fallDist < -0.3) ? (-fallDist * 50.0) : 0.0);
        boolean no_damage = true;
        if (damage > 0.0f && this.invulnerableUnmountCount == 0 && this.field_70173_aa > 20 && !no_damage) {
            final DriveableType type = this.getDriveableType();
            damage = (int)(damage * type.fallDamageFactor) * 0.5f;
            this.getDriveableData().parts.get(EnumDriveablePart.core).health -= (int)damage + 1;
            if (type.wheelPositions.length > 0) {
                this.attackPart(type.wheelPositions[0].part, DamageSource.field_76379_h, damage / 5.0f);
            }
            no_damage = false;
        }
    }
    
    public boolean func_70112_a(final double d) {
        final double d2 = this.field_70155_l;
        return d < d2 * d2;
    }
    
    public boolean attackPart(final EnumDriveablePart ep, final DamageSource source, final float damage) {
        if (ep == EnumDriveablePart.core) {
            if (source.func_76364_f() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.func_76364_f();
            }
            else if (source.func_76346_g() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.func_76346_g();
            }
            else {
                this.lastAtkEntity = null;
            }
        }
        final DriveablePart part = this.driveableData.parts.get(ep);
        return part.attack(damage, source.func_76347_k());
    }
    
    public Vector3f rotate(final Vector3f inVec) {
        return this.axes.findLocalVectorGlobally(inVec);
    }
    
    public Vector3f rotate(final Vec3 inVec) {
        return this.rotate(inVec.field_72450_a, inVec.field_72448_b, inVec.field_72449_c);
    }
    
    public Vector3f rotate(final double x, final double y, final double z) {
        return this.rotate(new Vector3f((float)x, (float)y, (float)z));
    }
    
    public void rotateYaw(final float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalYaw(rotateBy);
        this.updatePrevAngles();
    }
    
    public void rotatePitch(final float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalPitch(rotateBy);
        this.updatePrevAngles();
    }
    
    public void rotateRoll(final float rotateBy) {
        if (Math.abs(rotateBy) < 0.01f) {
            return;
        }
        this.axes.rotateLocalRoll(rotateBy);
        this.updatePrevAngles();
    }
    
    public void updatePrevAngles() {
        final double dYaw = this.axes.getYaw() - this.field_70126_B;
        if (dYaw > 180.0) {
            this.field_70126_B += 360.0f;
        }
        if (dYaw < -180.0) {
            this.field_70126_B -= 360.0f;
        }
        final double dPitch = this.axes.getPitch() - this.field_70127_C;
        if (dPitch > 180.0) {
            this.field_70127_C += 360.0f;
        }
        if (dPitch < -180.0) {
            this.field_70127_C -= 360.0f;
        }
        final double dRoll = this.axes.getRoll() - this.prevRotationRoll;
        if (dRoll > 180.0) {
            this.prevRotationRoll += 360.0f;
        }
        if (dRoll < -180.0) {
            this.prevRotationRoll -= 360.0f;
        }
    }
    
    public void setRotation(final float rotYaw, final float rotPitch, final float rotRoll) {
        this.axes.setAngles(rotYaw, rotPitch, rotRoll);
    }
    
    public boolean isPartOfThis(final Entity ent) {
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                if (ent == seat) {
                    return true;
                }
                if (seat.field_70153_n == ent) {
                    return true;
                }
            }
        }
        return ent == this;
    }
    
    public boolean hitboxPartOfThis(final Entity ent) {
        return this.seats[0] != null && this.seats[0].field_70153_n != null && ent != null && ent instanceof EntityPlayer && this.seats[0].field_70153_n instanceof EntityPlayer && ent == this.seats[0].field_70153_n;
    }
    
    public float func_70053_R() {
        return 0.0f;
    }
    
    public DriveableType getDriveableType() {
        return DriveableType.getDriveable(this.driveableType);
    }
    
    public DriveableData getDriveableData() {
        return this.driveableData;
    }
    
    public boolean isDead() {
        return this.field_70128_L;
    }
    
    public Entity getControllingEntity() {
        return this.seats[0].getControllingEntity();
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack(this.getDriveableType().item, 1, 0);
        stack.field_77990_d = new NBTTagCompound();
        this.driveableData.writeToNBT(stack.field_77990_d);
        return stack;
    }
    
    public boolean hasFuel() {
        return this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null && (this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f);
    }
    
    public boolean hasEnoughFuel() {
        return this.driverIsCreative() || this.driveableData.fuelInTank > this.driveableData.engine.fuelConsumption * this.throttle;
    }
    
    public double getSpeedXYZ() {
        return Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y);
    }
    
    public double getMPH() {
        final float advancedSpeed = (float)Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70181_x * this.field_70181_x + this.field_70179_y * this.field_70179_y);
        if (advancedSpeed >= 1.05 && (Math.abs(this.field_70159_w) > 0.2 || Math.abs(this.field_70179_y) > 0.2)) {
            return 1572.6646f * (float)Math.log(advancedSpeed);
        }
        if (Math.abs(this.field_70159_w) > 0.2 || Math.abs(this.field_70179_y) > 0.2) {
            return 0.0f + advancedSpeed * 74.0f;
        }
        return 0.0;
    }
    
    public double getSpeedXZ() {
        return Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
    }
    
    public boolean landVehicle() {
        return false;
    }
    
    public boolean gearDown() {
        return true;
    }
    
    public boolean onGround() {
        return this.field_70122_E;
    }
    
    public void moveRiders(final Entity rider) {
        if (this.isPartOfThis(rider)) {
            return;
        }
        boolean isHuman = false;
        boolean isDriveable = false;
        if (!(rider instanceof EntityPlayer)) {
            return;
        }
        final Vector3f riderPos = new Vector3f(rider.field_70165_t, rider.field_70163_u, rider.field_70161_v);
        final Vector3f riderMotion = new Vector3f(rider.field_70159_w, rider.field_70181_x, rider.field_70181_x);
        Vector3f vehicleMotion = new Vector3f(this.field_70165_t - this.lastPos.x, this.field_70163_u - this.lastPos.y, this.field_70161_v - this.lastPos.z);
        if (rider instanceof EntityVehicle) {
            vehicleMotion = ((EntityVehicle)rider).lastPos;
        }
        final Vector3f vehiclePos = new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        Vector3f relativePos = Vector3f.sub(riderPos, vehiclePos, null);
        if (rider instanceof EntityPlayer) {
            isHuman = true;
        }
        if (rider instanceof EntityDriveable) {
            isDriveable = true;
        }
        relativePos = new Vector3f(relativePos.x, relativePos.y - (isHuman ? 0.55f : 0.0f), relativePos.z);
        final Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePos);
        final Vector3f rotatedMotionVector = this.axes.findGlobalVectorLocally(riderMotion);
        final Vector3f ellipsoid = new Vector3f(rider.field_70130_N / 2.0f, rider.field_70131_O, rider.field_70130_N / 2.0f);
        final CollisionTest test = new CollisionTest(ellipsoid, new Vector3f(relativePos.x, relativePos.y, relativePos.z), riderMotion);
        test.collisionRecursiveDepth = 0;
        final Vector3f eSpacePosition = test.ConvertR3ToESpace(test.R3Position);
        final Vector3f eSpaceVelocity = test.velocity;
        final DriveableType type = this.getDriveableType();
        if (type.fancyCollision) {
            for (final CollisionShapeBox sbox : type.collisionBox) {
                this.checkCollision(test, sbox);
            }
        }
        else {
            for (final DriveablePart part : this.getDriveableData().parts.values()) {
                part.rayTraceRider(this, test, false);
            }
        }
        if (test.didCollide) {
            Vector3f finalPos = this.collideWithDriveable(test, eSpacePosition, eSpaceVelocity);
            if (finalPos == null) {
                finalPos = new Vector3f(0.0f, 0.0f, 0.0f);
                if (FlansMod.debugMode) {
                    FlansMod.log("EntityDriveable.java moveRiders> finalPos is null [1]");
                }
            }
            if (rider instanceof EntityAnimal) {
                return;
            }
            final Vector3f velocity = Vector3f.sub(finalPos, test.basePoint, null);
            test.ConvertESpaceToR3(velocity);
            finalPos = new Vector3f(finalPos.x * test.eRad.x, finalPos.y * test.eRad.y, finalPos.z * test.eRad.z);
            final Vector3f diff = Vector3f.sub(finalPos, vehiclePos, null);
            if (!rider.field_70122_E || this.field_70163_u + finalPos.y + 0.625 < riderPos.y) {}
            final boolean stationary = this.throttle == 0.0f;
            test.ConvertESpaceToR3(finalPos);
            final boolean onTop = test.collisionPlaneNormal.y >= 0.5f;
            if (this.field_70163_u + finalPos.y + 0.625 < riderPos.y) {
                finalPos.y = riderPos.y - (float)this.field_70163_u - 0.625f;
            }
            if (!this.hugeBoat) {
                rider.func_70107_b(onTop ? ((double)riderPos.x) : ((double)(riderPos.x + finalPos.x / (48.0f * Math.abs(relativePos.x)))), onTop ? (this.field_70163_u + finalPos.y + 0.625) : ((double)riderPos.y), onTop ? ((double)riderPos.z) : ((double)(riderPos.z + finalPos.z / (48.0f * Math.abs(relativePos.z)))));
            }
            if (this.hugeBoat && !stationary) {
                rider.func_70107_b((double)riderPos.x, this.field_70163_u + finalPos.y + 0.59375, (double)riderPos.z);
            }
            else if (this.hugeBoat && stationary) {
                rider.func_70107_b((double)riderPos.x, this.field_70163_u + finalPos.y + 0.625, (double)riderPos.z);
            }
            finalPos = Vector3f.sub(finalPos, riderPos, null);
            finalPos.normalise();
            rider.field_70181_x = 0.0;
            this.updateRiderPos(rider, test, finalPos, riderMotion);
            for (final EntitySeat seat : this.seats) {
                if (this.getDriveableType().collisionDamageEnable && !test.isOnTop && (this.throttle > this.getDriveableType().collisionDamageThrottle || (type.mechStomp && this.throttle > this.getDriveableType().collisionDamageThrottle))) {
                    boolean canDamage = true;
                    if (seat != null && TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && rider instanceof EntityPlayerMP && this.seats[0].field_70153_n instanceof EntityPlayer) {
                        final EntityPlayerMP attacker = (EntityPlayerMP)this.seats[0].field_70153_n;
                        final EntityPlayerMP player = (EntityPlayerMP)rider;
                        final Gametype gametype = TeamsManager.getInstance().currentRound.gametype;
                        if (Gametype.getPlayerData(attacker) != null) {
                            final Gametype gametype2 = TeamsManager.getInstance().currentRound.gametype;
                            if (Gametype.getPlayerData(attacker).team != null) {
                                final Gametype gametype3 = TeamsManager.getInstance().currentRound.gametype;
                                if (Gametype.getPlayerData(player) != null) {
                                    final Gametype gametype4 = TeamsManager.getInstance().currentRound.gametype;
                                    if (Gametype.getPlayerData(player).team != null) {
                                        final Gametype gametype5 = TeamsManager.getInstance().currentRound.gametype;
                                        final Team team = Gametype.getPlayerData(player).team;
                                        final Gametype gametype6 = TeamsManager.getInstance().currentRound.gametype;
                                        if (team == Gametype.getPlayerData(attacker).team) {
                                            canDamage = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.seats[0].field_70153_n != null && ((canDamage && rider != this.seats[0].field_70153_n) || (this.ticksFlareUsing > 0 && rider != this.seats[0].field_70153_n))) {
                        if (rider instanceof EntityLiving) {
                            ((EntityLivingBase)rider).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                            if (type.panic) {
                                ((EntityLivingBase)rider).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                            }
                        }
                        else if (rider instanceof EntityPlayer) {
                            ((EntityLivingBase)rider).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                            if (type.panic) {
                                ((EntityLivingBase)rider).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                            }
                        }
                    }
                }
            }
            if (rider instanceof EntityPlayer) {
                final EntityPlayer player2 = (EntityPlayer)rider;
                player2.field_70122_E = true;
                player2.field_70160_al = false;
                player2.field_70143_R = 0.0f;
            }
        }
        else if (rider instanceof EntityDriveable) {
            ((EntityDriveable)rider).deckHeight = 0.0;
        }
    }
    
    public DamageSource getBulletDamage(final boolean headshot) {
        final DriveableType type = this.getDriveableType();
        final EntityLivingBase owner = (EntityLivingBase)this.seats[0].field_70153_n;
        if (owner instanceof EntityPlayer) {
            return new EntityDamageSourceFlans(this.getDriveableType().shortName, this, (EntityPlayer)owner, type, headshot, false).func_76349_b();
        }
        return new EntityDamageSourceIndirect(type.shortName, (Entity)this, (Entity)owner).func_76349_b();
    }
    
    public void checkCollision(final CollisionTest tester, final CollisionShapeBox box) {
        double distance = tester.nearestDistance;
        Vector3f collisionPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        int surface = 0;
        final Vector3f pos = new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        final RotatedAxes shift = this.axes;
        final float f4 = box.pos.x + box.size.x;
        final float f5 = -box.pos.y + box.size.y;
        final float f6 = box.pos.z + box.size.z;
        box.pos = new Vector3f(box.pos.x, box.pos.y, box.pos.z);
        Vector3f p1 = new Vector3f(box.pos.x - box.p1.x, box.pos.y + box.size.y + box.p1.y - box.size.y + 0.625f, box.pos.z - box.p1.z);
        Vector3f p2 = new Vector3f(box.pos.x + box.size.x + box.p2.x, box.pos.y + box.size.y + box.p2.y - box.size.y + 0.625f, box.pos.z - box.p2.z);
        Vector3f p3 = new Vector3f(box.pos.x + box.size.x + box.p3.x, box.pos.y + box.size.y + box.p3.y - box.size.y + 0.625f, box.pos.z + box.size.z + box.p3.z);
        Vector3f p4 = new Vector3f(box.pos.x - box.p4.x, box.pos.y + box.size.y + box.p4.y - box.size.y + 0.625f, box.pos.z + box.size.z + box.p4.z);
        Vector3f p5 = new Vector3f(box.pos.x - box.p5.x, box.pos.y - box.p5.y - box.size.y + 0.625f, box.pos.z - box.p5.z);
        Vector3f p6 = new Vector3f(box.pos.x + box.size.x + box.p6.x, box.pos.y - box.p6.y - box.size.y + 0.625f, box.pos.z - box.p6.z);
        Vector3f p7 = new Vector3f(box.pos.x + box.size.x + box.p7.x, box.pos.y - box.p7.y - box.size.y + 0.625f, box.pos.z + box.size.z + box.p7.z);
        Vector3f p8 = new Vector3f(box.pos.x - box.p8.x, box.pos.y - box.p8.y - box.size.y + 0.625f, box.pos.z + box.size.z + box.p8.z);
        if (EnumDriveablePart.getPart(box.part) == EnumDriveablePart.turret && this.seats[0] != null) {
            p1 = this.getPositionOnTurret(p1, false);
            p2 = this.getPositionOnTurret(p2, false);
            p3 = this.getPositionOnTurret(p3, false);
            p4 = this.getPositionOnTurret(p4, false);
            p5 = this.getPositionOnTurret(p5, false);
            p6 = this.getPositionOnTurret(p6, false);
            p7 = this.getPositionOnTurret(p7, false);
            p8 = this.getPositionOnTurret(p8, false);
        }
        else {
            p1 = shift.findLocalVectorGlobally(p1);
            p2 = shift.findLocalVectorGlobally(p2);
            p3 = shift.findLocalVectorGlobally(p3);
            p4 = shift.findLocalVectorGlobally(p4);
            p5 = shift.findLocalVectorGlobally(p5);
            p6 = shift.findLocalVectorGlobally(p6);
            p7 = shift.findLocalVectorGlobally(p7);
            p8 = shift.findLocalVectorGlobally(p8);
        }
        double topFaceDist = 100.0;
        tester.checkTriangle(tester, p3, p2, p1);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p4, p3, p1);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        if (tester.didCollide) {
            tester.isOnTop = true;
            topFaceDist = tester.nearestDistance;
        }
        tester.checkTriangle(tester, p6, p7, p3);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 2;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p3, p2, p6);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 2;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p4, p1, p5);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 3;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p5, p8, p4);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 3;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p6, p5, p1);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 4;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p1, p2, p6);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 4;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p8, p7, p3);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 5;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p3, p4, p8);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 5;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p5, p6, p7);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        tester.checkTriangle(tester, p8, p7, p5);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = EnumDriveablePart.getPart(box.part);
        }
        if (tester.didCollide) {
            tester.isOnTop = true;
            topFaceDist = tester.nearestDistance;
        }
        Vector3f.add(p1, pos, p1);
        Vector3f.add(p2, pos, p2);
        Vector3f.add(p3, pos, p3);
        Vector3f.add(p4, pos, p4);
        Vector3f.add(p5, pos, p5);
        Vector3f.add(p6, pos, p6);
        Vector3f.add(p7, pos, p7);
        Vector3f.add(p8, pos, p8);
        final boolean muff = true;
        final String wank = "crit";
        if (tester.nearestDistance < topFaceDist) {
            tester.isOnTop = false;
        }
        if (surface == 1) {
            tester.isOnTop = true;
        }
    }
    
    public void renderTri(final Vector3f p1, final Vector3f p2, final Vector3f p3) {
        final Vector3f pos = new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        final Vector3f p1a = Vector3f.add(p1, pos, null);
        final Vector3f p2a = Vector3f.add(p2, pos, null);
        final Vector3f p3a = Vector3f.add(p3, pos, null);
        this.renderLine(p1a, p2a);
        this.renderLine(p2a, p3a);
        this.renderLine(p3a, p1a);
    }
    
    public void renderLine(final Vector3f in, final Vector3f out) {
        final float dx = out.x - in.x;
        final float dy = out.y - in.y;
        final float dz = out.z - in.z;
        final Vector3f diff = Vector3f.sub(out, in, null);
        diff.normalise();
        final float distance = (float)Math.sqrt(dx * dx + dy * dy + dz * dz);
        for (int i = 0; i < 10; ++i) {
            final float dist2 = distance / 10.0f * i;
            final Vector3f newVec = new Vector3f(in.x + dist2 * diff.x, in.y + dist2 * diff.y, in.z + dist2 * diff.z);
            FlansMod.proxy.spawnParticle("reddust", newVec.x, newVec.y, newVec.z, 0.0, 0.0, 0.0);
        }
    }
    
    public Vector3f collideWithDriveable(final CollisionTest tester, final Vector3f Pos, final Vector3f vel) {
        final float unitScale = 0.0625f;
        final float veryCloseDistance = 0.005f * unitScale;
        if (tester.collisionRecursiveDepth > 2) {
            return Pos;
        }
        tester.basePoint = Pos;
        tester.didCollide = false;
        if (this.getDriveableType().fancyCollision) {
            for (final CollisionShapeBox sbox : this.getDriveableType().collisionBox) {
                this.checkCollision(tester, sbox);
            }
        }
        else {
            for (final DriveablePart ppart : this.getDriveableData().parts.values()) {
                ppart.rayTraceRider(this, tester, false);
            }
        }
        final boolean didCollide = false;
        tester.didCollide = didCollide;
        if (didCollide) {
            return Vector3f.add(Pos, vel, null);
        }
        final Vector3f destinationPoint = Vector3f.add(Pos, vel, null);
        Vector3f newBasePoint = Pos;
        if (tester.nearestDistance >= veryCloseDistance) {
            final Vector3f V = vel;
            V.normalise();
            V.scale((float)(tester.nearestDistance - veryCloseDistance));
            newBasePoint = Vector3f.add(tester.basePoint, V, null);
            if (V.normalise() == new Vector3f(0.0f, 0.0f, 0.0f)) {
                return Vector3f.add(Pos, vel, null);
            }
            V.normalise();
            Vector3f.sub(tester.intersectionPoint, new Vector3f(V.x * veryCloseDistance, V.y * veryCloseDistance, V.z * veryCloseDistance), tester.intersectionPoint);
        }
        final Vector3f slidePlaneOrigin = tester.intersectionPoint;
        if (tester.intersectionPoint == null) {
            return Vector3f.add(Pos, vel, null);
        }
        final Vector3f slidePlaneNormal = Vector3f.sub(newBasePoint, tester.intersectionPoint, null);
        slidePlaneNormal.normalise();
        tester.collisionPlaneNormal = slidePlaneNormal;
        final CollisionPlane plane = new CollisionPlane(slidePlaneOrigin, slidePlaneNormal);
        final double sDV = plane.signedDistanceTo(destinationPoint);
        final Vector3f scaledNormal = new Vector3f(slidePlaneNormal.x * sDV, slidePlaneNormal.y * sDV, slidePlaneNormal.z * sDV);
        final Vector3f newDestPoint = Vector3f.sub(destinationPoint, scaledNormal, null);
        final Vector3f newVelocityVector = Vector3f.sub(newDestPoint, tester.intersectionPoint, null);
        if (newVelocityVector.length() < veryCloseDistance) {
            return newBasePoint;
        }
        ++tester.collisionRecursiveDepth;
        return this.collideWithDriveable(tester, newBasePoint, newVelocityVector);
    }
    
    public void updateRiderPos(final Entity rider, final CollisionTest test, final Vector3f pos, final Vector3f motion) {
        boolean isDriveable = false;
        if (rider instanceof EntityDriveable) {
            isDriveable = true;
        }
        final Vector3f vehicleMotion = this.lastPos;
        final Vector3f riderMountPoint = new Vector3f(rider.field_70165_t - this.field_70165_t, rider.field_70163_u - this.field_70163_u, rider.field_70161_v - this.field_70161_v);
        final float yawDiff = this.axes.getYaw() - this.prevAxes.getYaw();
        final float pitchDiff = this.axes.getPitch() - this.prevAxes.getPitch();
        final float rollDiff = this.axes.getRoll() - this.prevAxes.getRoll();
        final RotatedAxes velAxes = new RotatedAxes(this.axes.getYaw() + yawDiff, this.axes.getPitch() + pitchDiff, this.axes.getRoll() + rollDiff);
        final Vector3f currentLocalPos = this.axes.findGlobalVectorLocally(riderMountPoint);
        Vector3f nextGlobalPos = velAxes.findLocalVectorGlobally(currentLocalPos);
        final Vector3f diff = new Vector3f(0.0f, 0.0f, 0.0f);
        if (nextGlobalPos == null) {
            nextGlobalPos = new Vector3f(0.0f, 0.0f, 0.0f);
        }
        Vector3f.add(vehicleMotion, diff, diff);
        rider.func_70107_b(nextGlobalPos.x + this.field_70165_t + (this.hugeBoat ? (diff.x / 1.5) : 0.0), isDriveable ? ((EntityDriveable)rider).deckHeight : rider.field_70163_u, nextGlobalPos.z + this.field_70161_v + (this.hugeBoat ? (diff.z / 1.5) : 0.0));
        if (this.hugeBoat) {
            if (this.lastPos.x == 0.0f && this.lastPos.y == 0.0f && this.lastPos.z == 0.0f) {
                rider.field_70159_w = rider.field_70159_w;
                rider.field_70181_x = rider.field_70181_x;
                rider.field_70179_y = rider.field_70179_y;
                if (rider.field_70181_x < 0.0) {
                    rider.field_70181_x = 0.0;
                }
            }
        }
        else if (this.lastPos.x == 0.0f && this.lastPos.y == 0.0f && this.lastPos.z == 0.0f) {
            rider.field_70159_w = rider.field_70159_w;
            rider.field_70181_x = rider.field_70181_x;
            rider.field_70179_y = rider.field_70179_y;
        }
        else {
            rider.field_70159_w = diff.x;
            rider.field_70181_x = diff.y;
            rider.field_70179_y = diff.z;
        }
    }
    
    public void handleVehicleCollision(final EntityDriveable collided, final CollisionTest test, final Vector3f finalPos, final boolean hugeBoat) {
    }
    
    public ArrayList<BulletHit> attackFromBulletClassic(final Vector3f origin, final Vector3f motion, final boolean evilBullet) {
        final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        final Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.field_70165_t, (float)this.field_70163_u, (float)this.field_70161_v), null);
        final Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        final Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            final DriveableHit hit = part.rayTrace(this, rotatedPosVector, rotatedMotVector, evilBullet);
            if (hit != null) {
                hits.add(hit);
            }
        }
        return hits;
    }
    
    public ArrayList<BulletHit> attackFromBullet(final Vector3f origin, final Vector3f motion, final boolean evil) {
        final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        final Vector3f vehicleMotion = new Vector3f(this.field_70165_t - this.lastPos.x, this.field_70163_u - this.lastPos.y, this.field_70161_v - this.lastPos.z);
        final Vector3f vehiclePos = new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        final Vector3f relativePos = Vector3f.sub(origin, vehiclePos, null);
        final Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePos);
        final Vector3f rotatedMotionVector = this.axes.findGlobalVectorLocally(motion);
        final Vector3f ellipsoid = new Vector3f(50.0f, 50.0f, 50.0f);
        final CollisionTest testudo = new CollisionTest(ellipsoid, new Vector3f(relativePos.x, relativePos.y, relativePos.z), motion);
        testudo.collisionRecursiveDepth = 0;
        final Vector3f eSpacePosition = testudo.ConvertR3ToESpace(testudo.R3Position);
        final Vector3f eSpaceVelocity = testudo.velocity;
        for (final DriveablePart ppart : this.getDriveableData().parts.values()) {
            ppart.rayTraceRider(this, testudo, evil);
        }
        if (testudo.didCollide) {
            final Vector3f hitPos = new Vector3f(0.0f, 0.0f, 0.0f);
            final Vector3f intersect2 = new Vector3f(testudo.ConvertESpaceToR3(testudo.intersectionPoint));
            Vector3f.sub(origin, intersect2, hitPos);
            final float f = hitPos.length() / motion.length();
            final DriveableHit hit = new DriveableHit(this, testudo.part, f);
            hits.add(hit);
        }
        return hits;
    }
    
    public float bulletHit(final EntityBullet bullet, final DriveableHit hit, final float penetratingPower) {
        final DriveablePart part = this.getDriveableData().parts.get(hit.part);
        if (bullet != null) {
            part.hitByBullet(bullet, hit);
        }
        if (!this.field_70170_p.field_72995_K) {
            this.checkParts();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, 100.0f, this.field_71093_bK);
        }
        EntitySeat parkingSeat = null;
        EntitySeat shooterSeat = null;
        if (bullet != null && bullet.owner != null && bullet.owner.func_70115_ae() && bullet.owner.field_70154_o != null && bullet.owner.field_70154_o instanceof EntitySeat) {
            shooterSeat = (EntitySeat)bullet.owner.field_70154_o;
        }
        if (this.func_70115_ae() && this.field_70154_o != null && this.field_70154_o instanceof EntitySeat) {
            parkingSeat = (EntitySeat)this.field_70154_o;
        }
        if (shooterSeat != null && parkingSeat != null && shooterSeat.driveable != null && parkingSeat.driveable != null && (parkingSeat.driveable == shooterSeat.driveable || this == shooterSeat.driveable)) {
            return penetratingPower - 0.0f;
        }
        if (this.type != null && this.type.evilGolem && bullet != null && bullet.evilBullet) {
            return penetratingPower - 0.0f;
        }
        if (part.type == EnumDriveablePart.rightsideArmor || part.type == EnumDriveablePart.frontalArmor || part.type == EnumDriveablePart.leftsideArmor || part.type == EnumDriveablePart.additionalArmor || part.type == EnumDriveablePart.composite || part.type == EnumDriveablePart.composite2 || part.type == EnumDriveablePart.compositeL || part.type == EnumDriveablePart.compositeR || part.type == EnumDriveablePart.beltl || part.type == EnumDriveablePart.beltr || part.type == EnumDriveablePart.turretarmor || part.type == EnumDriveablePart.moreturretarmor || part.type == EnumDriveablePart.turretside) {
            if (bullet != null && bullet.truePen > part.armor) {
                if (hit.driveable.getDriveableType().lessOverpen) {
                    bullet.truePen -= part.armor * 0.9f;
                }
                return penetratingPower - 0.0f;
            }
            return penetratingPower - 5.0f;
        }
        else {
            if (part.type != EnumDriveablePart.ERA && part.type != EnumDriveablePart.ERA2 && part.type != EnumDriveablePart.ERA3 && part.type != EnumDriveablePart.spaced && part.type != EnumDriveablePart.superstructure && part.type != EnumDriveablePart.leftTrack && part.type != EnumDriveablePart.rightTrack) {
                return penetratingPower - 5.0f;
            }
            if (bullet != null && bullet.truePen > part.armor && !bullet.type.HEAT && !bullet.type.Hesh) {
                bullet.truePen -= part.armor;
                return penetratingPower - 0.0f;
            }
            return penetratingPower - 5.0f;
        }
    }
    
    public DriveablePart raytraceParts(final Vector3f origin, final Vector3f motion) {
        final Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.field_70165_t, (float)this.field_70163_u, (float)this.field_70161_v), null);
        final Vector3f rotatedPosVector = this.axes.findGlobalVectorLocally(relativePosVector);
        final Vector3f rotatedMotVector = this.axes.findGlobalVectorLocally(motion);
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            if (part.rayTrace(this, rotatedPosVector, rotatedMotVector, false) != null) {
                return part;
            }
        }
        return null;
    }
    
    public boolean canHitPart(final EnumDriveablePart part) {
        return true;
    }
    
    public void checkParts() {
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            final DriveableData data = this.getDriveableData();
            if (part != null && !part.dead && part.crew > 1) {
                data.totalCrew = this.getDriveableData().parts.get(EnumDriveablePart.bow).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret).crew + this.getDriveableData().parts.get(EnumDriveablePart.midsection).crew + this.getDriveableData().parts.get(EnumDriveablePart.infantry).crew + this.getDriveableData().parts.get(EnumDriveablePart.steering).crew + this.getDriveableData().parts.get(EnumDriveablePart.airframe).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret).crew + this.getDriveableData().parts.get(EnumDriveablePart.deck).crew + this.getDriveableData().parts.get(EnumDriveablePart.right).crew + this.getDriveableData().parts.get(EnumDriveablePart.left).crew + this.getDriveableData().parts.get(EnumDriveablePart.superstructure).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret1).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret2).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret3).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret4).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret5).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret6).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret7).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret8).crew + this.getDriveableData().parts.get(EnumDriveablePart.turret9).crew + this.getDriveableData().parts.get(EnumDriveablePart.citadel).crew + this.getDriveableData().parts.get(EnumDriveablePart.stern).crew;
            }
            if (part != null && !part.dead) {
                data.notFlooding = this.getDriveableData().parts.get(EnumDriveablePart.bow).health + this.getDriveableData().parts.get(EnumDriveablePart.midsection).health + this.getDriveableData().parts.get(EnumDriveablePart.steering).health + this.getDriveableData().parts.get(EnumDriveablePart.right).health + this.getDriveableData().parts.get(EnumDriveablePart.left).health + this.getDriveableData().parts.get(EnumDriveablePart.stern).health;
                data.notFloodingMax = this.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth + this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxHealth + this.getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth + this.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth + this.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth + this.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth;
            }
            if (part != null && !part.dead && part.health <= 0 && part.maxHealth > 0) {
                this.killPart(part);
                part.crew = 0;
            }
        }
        final DriveableData data2 = this.getDriveableData();
        data2.maximumCrew = this.getDriveableData().parts.get(EnumDriveablePart.bow).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret1).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret2).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret3).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret4).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret5).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret6).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret7).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret8).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret9).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.infantry).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.steering).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.turret).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.deck).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.right).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.left).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.superstructure).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.citadel).maxCrew + this.getDriveableData().parts.get(EnumDriveablePart.stern).maxCrew;
        for (final EntitySeat entitySeat : this.seats) {}
        final DriveablePart buoyancy = this.getDriveableData().parts.get(EnumDriveablePart.buoyancy);
        if (data2.notFloodingMax > 0 && data2.notFlooding < data2.notFloodingMax) {
            final DriveableData driveableData = this.driveableData;
            ++driveableData.sinkingTimer;
            this.driveableData.sinkLimit = (int)(40.0f + 360.0f * (data2.notFlooding * (float)data2.notFlooding * data2.notFlooding / (data2.notFloodingMax * (float)data2.notFloodingMax * data2.notFloodingMax)));
            if (this.driveableData.sinkingTimer >= this.driveableData.sinkLimit) {
                this.driveableData.sinkingTimer = 0;
            }
            if (this.driveableData.sinkingTimer == 15 && buoyancy.health > 0) {
                final DriveablePart driveablePart = buoyancy;
                --driveablePart.health;
                final DriveablePart driveablePart2 = buoyancy;
                --driveablePart2.health;
                final DriveablePart driveablePart3 = buoyancy;
                --driveablePart3.health;
                final DriveablePart driveablePart4 = buoyancy;
                --driveablePart4.health;
                final DriveablePart driveablePart5 = buoyancy;
                --driveablePart5.health;
            }
        }
        if (buoyancy.health < buoyancy.maxHealth) {
            final DriveableData driveableData2 = this.driveableData;
            ++driveableData2.repairingTimer;
            if (this.driveableData.repairingTimer >= this.driveableData.repairLimit) {
                this.driveableData.repairingTimer = 0;
            }
            data2.repairLimit = (int)(400.0f - 380.0f * (this.getDriveableData().totalCrew / (float)this.getDriveableData().maximumCrew));
            if (this.driveableData.repairingTimer == 10) {
                final DriveablePart driveablePart6 = buoyancy;
                ++driveablePart6.health;
            }
        }
        final DriveableType type = this.getDriveableType();
        if (data2.depth / -type.maxDepth > 1.0f) {
            this.crushed = true;
        }
        final int seatNum = this.seats.length;
        if (!this.field_70170_p.field_72995_K) {
            for (int i = 0; i < this.seats.length; ++i) {
                if (this.seats[i].field_70153_n != null && this.seats[i].field_70153_n instanceof EntityPlayer) {
                    final Entity entity = this.seats[i].field_70153_n;
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret1).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret1).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret1) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret2).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret2).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret2) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret3).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret3).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret3) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret4).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret4).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret4) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret5).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret5).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret5) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret6).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret6).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret6) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret7).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret7).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret7) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret8).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret8).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret8) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret9).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret9).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret9) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.airframe).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.airframe) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.superstructure).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.superstructure).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.superstructure) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.deck).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.deck).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.deck) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.citadel).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.citadel).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.citadel) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.bow).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.bow) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.midsection).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.midsection) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.stern).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.stern) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.tail).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.tail).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.tail) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.bay).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.bay).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.bay) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.left).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.left) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.right).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.right) {
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 10, 5));
                        }
                    }
                }
            }
        }
        if (this.getDriveableData().parts.get(EnumDriveablePart.core).dead && !type.inshallah) {
            for (final EntitySeat seat : this.seats) {
                if (seat != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer && this.getDriveableData().parts.get(EnumDriveablePart.core).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                    ((EntityPlayer)this.seats[0].field_70153_n).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 100, 50));
                    if (this.lastAtkEntity != null && this.lastAtkEntity instanceof EntityPlayer && this.seats[0] != null && this.seats[0].field_70153_n != null) {
                        this.seats[0].field_70153_n.func_70097_a(DamageSource.func_76365_a((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                    }
                }
            }
            if (!this.field_70170_p.field_72995_K) {
                for (int i = 0; i < seatNum; ++i) {
                    if (this.seats[i].field_70153_n != null && this.seats[i].field_70153_n instanceof EntityPlayer) {
                        final Entity entity = this.seats[i].field_70153_n;
                        this.seats[i].field_70153_n.func_70078_a((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 100, 50));
                            entity.func_70097_a(DamageSource.func_76365_a((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                        }
                        else if (this.lastAtkEntity instanceof EntityLivingBase) {
                            ((EntityLivingBase)entity).func_70690_d(new PotionEffect(Potion.field_76433_i.field_76415_H, 100, 50));
                            entity.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this.lastAtkEntity), 1.0E7f);
                        }
                    }
                }
                if (type.isExplosionWhenDestroyed && type.isExplosionWhenDestroyedRadius == 0.0f) {
                    this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 4.0f, false);
                }
                else if (type.isExplosionWhenDestroyedRadius > 0.0f) {
                    this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, type.isExplosionWhenDestroyedRadius, false);
                }
                if (type.nuclearDeath) {
                    FlansMod.proxy.spawnParticle("flansmod.FMNuke", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "YamatoGun", false);
                }
                if (type.bigDeath) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "shippuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "BattleshipGun", false);
                }
                if (type.Death) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "tankkuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "explcls6", false);
                }
                for (final DriveablePart part2 : this.driveableData.parts.values()) {
                    if (part2.health > 0 && !part2.dead) {
                        this.killPart(part2);
                    }
                }
            }
            data2.depth = -9000.0f;
            this.func_70106_y();
        }
        for (final EntitySeat seat : this.seats) {
            if ((this.getDriveableData().parts.get(EnumDriveablePart.core).dead && seat != null && type.inshallah) || (this.getDriveableData().parts.get(EnumDriveablePart.core).dead && seat != null && type.canDive) || (this.suicide && seat != null && type.inshallah)) {
                if (seat == null || (this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer && type.inshallah) || this.seats[0].field_70153_n == null || !(this.seats[0].field_70153_n instanceof EntityPlayer) || type.canDive) {}
                if (!this.field_70170_p.field_72995_K) {
                    for (int j = 0; j < seatNum; ++j) {
                        if (this.seats[j].field_70153_n != null && this.seats[j].field_70153_n instanceof EntityPlayer) {
                            final Entity entity2 = this.seats[j].field_70153_n;
                            this.seats[j].field_70153_n.func_70078_a((Entity)null);
                            if (this.lastAtkEntity instanceof EntityPlayer) {
                                entity2.func_70097_a(DamageSource.func_76365_a((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                            }
                            else if (this.lastAtkEntity instanceof EntityLivingBase) {
                                entity2.func_70097_a(DamageSource.func_76358_a((EntityLivingBase)this.lastAtkEntity), 1.0E7f);
                            }
                        }
                    }
                    if (type.isExplosionWhenDestroyed && type.isExplosionWhenDestroyedRadius == 0.0f) {
                        this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, 4.0f, false);
                    }
                    else if (type.isExplosionWhenDestroyedRadius > 0.0f) {
                        this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, type.isExplosionWhenDestroyedRadius, false);
                    }
                    if (type.nuclearDeath) {
                        FlansMod.proxy.spawnParticle("flansmod.FMNuke", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "YamatoGun", false);
                    }
                    if (type.bigDeath) {
                        FlansMod.proxy.spawnParticle("flansmod.shipDeath", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "BattleshipGun", false);
                    }
                    if (type.Death) {
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "explcls6", false);
                    }
                    for (final DriveablePart part3 : this.driveableData.parts.values()) {
                        if (part3.health > 0 && !part3.dead) {
                            this.killPart(part3);
                        }
                    }
                }
                data2.depth = -9000.0f;
                if (seat != null) {
                    this.func_70106_y();
                }
            }
        }
    }
    
    public void checkPartsWhenAttacked() {
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            if (part != null && !part.dead && part.health <= 0 && part.maxHealth > 0) {
                this.killPart(part);
            }
        }
    }
    
    private void killPart(final DriveablePart part) {
        if (part.dead) {
            return;
        }
        part.health = 0;
        part.crew = 0;
        part.dead = true;
        FlansMod.proxy.spawnParticle("largeexplode", this.field_70165_t, this.field_70163_u, this.field_70161_v, 0.0, 0.0, 0.0);
        final DriveableType type = this.getDriveableType();
        if (!this.field_70170_p.field_72995_K) {
            Vector3f pos = new Vector3f(0.0f, 0.0f, 0.0f);
            if (part.box != null) {
                pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x / 16.0f + part.box.w / 32.0f, part.box.y / 16.0f + part.box.h / 32.0f, part.box.z / 16.0f + part.box.d / 32.0f));
            }
            final ArrayList<ItemStack> drops = type.getItemsRequired(part, this.getDriveableData().engine);
            if (drops != null) {
                for (ItemStack itemStack : drops) {}
            }
            this.dropItemsOnPartDeath(pos, part);
            if (part.type == EnumDriveablePart.core) {
                for (int i = 0; i < this.getDriveableData().func_70302_i_(); ++i) {
                    final ItemStack stack = this.getDriveableData().func_70301_a(i);
                    if (stack != null) {
                        this.field_70170_p.func_72838_d((Entity)new EntityItem(this.field_70170_p, this.field_70165_t + this.field_70146_Z.nextGaussian(), this.field_70163_u + this.field_70146_Z.nextGaussian(), this.field_70161_v + this.field_70146_Z.nextGaussian(), stack));
                    }
                }
            }
        }
        for (final EnumDriveablePart child : part.type.getChildren()) {
            this.killPart(this.getDriveableData().parts.get(child));
        }
    }
    
    protected abstract void dropItemsOnPartDeath(final Vector3f p0, final DriveablePart p1);
    
    public float getPlayerRoll() {
        return this.axes.getRoll();
    }
    
    public void explode() {
    }
    
    public float getCameraDistance() {
        return this.getDriveableType().cameraDistance;
    }
    
    public boolean isPartIntact(final EnumDriveablePart part) {
        final DriveablePart thisPart = this.getDriveableData().parts.get(part);
        return thisPart.maxHealth == 0 || thisPart.health > 0;
    }
    
    public boolean isPartHealthy(final EnumDriveablePart part) {
        final DriveablePart thisPart = this.getDriveableData().parts.get(part);
        return thisPart.maxHealth == 0 || thisPart.health > 0.25f * thisPart.maxHealth;
    }
    
    public boolean hudMode() {
        final EntityPlayer driver = (EntityPlayer)this.seats[0].field_70153_n;
        return Minecraft.func_71410_x().field_71474_y.field_74320_O == 0 && driver != null;
    }
    
    public float healthPercent(final EnumDriveablePart part) {
        final DriveablePart thisPart = this.getDriveableData().parts.get(part);
        if (thisPart.maxHealth == 0) {
            return 1.0f;
        }
        return (float)(thisPart.health / thisPart.maxHealth);
    }
    
    public abstract boolean hasMouseControlMode();
    
    public abstract String getBombInventoryName();
    
    public abstract String getMissileInventoryName();
    
    public boolean rotateWithTurret(final Seat seat) {
        return seat.part == EnumDriveablePart.turret;
    }
    
    public String func_70005_c_() {
        return this.getDriveableType().name;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean showInventory(final int seat) {
        return seat != 0 || !FlansModClient.controlModeMouse;
    }
    
    public int getShootDelay(final boolean secondary) {
        return secondary ? this.shootDelaySecondary : this.shootDelayPrimary;
    }
    
    public boolean canLaunchIT1() {
        return this.canFireIT1;
    }
    
    public float getMinigunSpeed(final boolean secondary) {
        return secondary ? this.minigunSpeedSecondary : this.minigunSpeedPrimary;
    }
    
    public int getCurrentGun(final boolean secondary) {
        return secondary ? this.currentGunSecondary : this.currentGunPrimary;
    }
    
    public void setShootDelay(final int i, final boolean secondary) {
        this.setRecoilTimer();
        if (secondary) {
            this.setRecoilHeightSecondary();
        }
        else {
            this.setRecoilHeightPrimary();
        }
        if (secondary) {
            this.shootDelaySecondary = ((i > this.shootDelaySecondary) ? i : this.shootDelaySecondary);
        }
        else {
            this.shootDelayPrimary = ((i > this.shootDelayPrimary) ? i : this.shootDelayPrimary);
        }
    }
    
    public void setMinigunSpeed(final float f, final boolean secondary) {
        if (secondary) {
            this.minigunSpeedSecondary = f;
        }
        else {
            this.minigunSpeedPrimary = f;
        }
    }
    
    public void setCurrentGun(final int i, final boolean secondary) {
        if (secondary) {
            this.currentGunSecondary = i;
        }
        else {
            this.currentGunPrimary = i;
        }
    }
    
    public void setEntityMarker(final int tick) {
        this.isShowedPosition = true;
        this.tickCount = tick;
    }
    
    public void lock(final String tool, final EntityPlayer player) {
        this.locked = true;
        player.func_145747_a((IChatComponent)new ChatComponentText("Locked"));
    }
    
    public void IT1Reload() {
        final DriveableType type = this.getDriveableType();
        if (this.stage == 1) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, 0.0f, 5.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 0.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 5.0f);
            if (this.drakonRailAngle == -10.0f) {
                ++this.stage;
            }
        }
        if (this.stage == 2) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, -90.0f, 5.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 0.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 1.0f);
            if (this.drakonDoorAngle == -90.0f) {
                ++this.stage;
            }
        }
        if (this.stage == 3) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, -90.0f, 5.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 179.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 1.0f);
            if (this.drakonArmAngle == 179.0f) {
                ++this.stage;
            }
        }
        if (this.stage == 4) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, 0.0f, 10.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 180.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 1.0f);
            if (this.drakonDoorAngle == 0.0f && this.IT1Loaded()) {
                ++this.stage;
                this.reloadAnimTime = 60;
            }
        }
        if (this.stage == 5) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, -90.0f, 10.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 180.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 1.0f);
            this.reloadingDrakon = true;
            if (this.drakonDoorAngle == -90.0f) {
                ++this.stage;
            }
        }
        if (this.stage == 6) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, -90.0f, 5.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 0.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -10.0f, 1.0f);
            if (this.drakonArmAngle == 0.0f) {
                ++this.stage;
            }
        }
        if (this.stage == 7) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, 0.0f, 10.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 0.0f, 3.0f);
            this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, 0.0f, 1.0f);
            if (this.drakonRailAngle == 0.0f && this.drakonDoorAngle == 0.0f) {
                ++this.stage;
                this.canFireIT1 = true;
                this.reloadingDrakon = false;
            }
        }
        if (this.stage == 8) {
            this.drakonDoorAngle = this.moveToTarget(this.drakonDoorAngle, 0.0f, 10.0f);
            this.drakonArmAngle = this.moveToTarget(this.drakonArmAngle, 0.0f, 3.0f);
            if (this.field_70170_p.field_72995_K && this.field_70173_aa > 2) {
                this.drakonRailAngle = this.moveToTarget(this.drakonRailAngle, -this.seats[0].looking.getPitch(), this.seats[0].seatInfo.aimingSpeed.y);
            }
            if (!this.IT1Loaded()) {
                this.stage = 1;
                this.canFireIT1 = false;
            }
        }
    }
    
    public float moveToTarget(float current, final float target, final float speed) {
        float pitchToMove;
        for (pitchToMove = (float)(Math.sqrt(target * target) - Math.sqrt(current * current)); pitchToMove > 180.0f; pitchToMove -= 360.0f) {}
        while (pitchToMove <= -180.0f) {
            pitchToMove += 360.0f;
        }
        float signDeltaY = 0.0f;
        if (pitchToMove > speed) {
            signDeltaY = 1.0f;
        }
        else {
            if (pitchToMove >= -speed) {
                signDeltaY = 0.0f;
                return target;
            }
            signDeltaY = -1.0f;
        }
        if (current > target) {
            current -= speed;
        }
        else if (current < target) {
            current += speed;
        }
        return current;
    }
    
    public boolean IT1Loaded() {
        final DriveableType type = this.getDriveableType();
        boolean loaded = false;
        for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
            final ItemStack shell = this.driveableData.func_70301_a(i);
            if (shell != null && shell.func_77973_b() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.func_77973_b()).type, EnumWeaponType.MISSILE)) {
                loaded = true;
            }
        }
        return loaded;
    }
    
    public void tryRecoil() {
        int slot = -1;
        final DriveableType type = this.getDriveableType();
        for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
            final ItemStack shell = this.driveableData.func_70301_a(i);
            if (shell != null && shell.func_77973_b() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.func_77973_b()).type, EnumWeaponType.SHELL)) {
                slot = i;
            }
        }
        if (this.recoilTimer <= 0 && slot != -1) {
            this.isRecoil = true;
        }
    }
    
    public void setRecoilTimer() {
        int slot = -1;
        final DriveableType type = this.getDriveableType();
        for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
            final ItemStack shell = this.driveableData.func_70301_a(i);
            if (shell != null && shell.func_77973_b() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.func_77973_b()).type, EnumWeaponType.SHELL)) {
                slot = i;
            }
        }
        if (this.recoilTimer <= 0 && slot != -1) {
            this.recoilTimer = this.getDriveableType().shootDelayPrimary;
            this.planeRecoil += type.projectileMass * type.muzzleVelocity;
        }
    }
    
    public void setRecoilHeightPrimary() {
        this.primaryRecoilHeight = this.getDriveableType().primaryRecoilHeight;
    }
    
    public void setRecoilHeightSecondary() {
        this.secondaryRecoilHeight = this.getDriveableType().secondaryRecoilHeight;
    }
    
    public void unlock(final EntityPlayer player) {
        this.locked = false;
        player.func_145747_a((IChatComponent)new ChatComponentText("Unlocked"));
    }
    
    public NBTTagCompound extractDataToUpdate() {
        final NBTTagCompound data = new NBTTagCompound();
        data.func_74757_a("l", this.locked);
        data.func_74757_a("s", this.stolen);
        data.func_74778_a("o", (this.owner == null) ? "None" : this.owner.getName());
        final NBTTagList unlocks = new NBTTagList();
        for (final Map.Entry<String, Integer> entry : this.unlocks.entrySet()) {
            final NBTTagCompound tag = new NBTTagCompound();
            tag.func_74778_a("k", (String)entry.getKey());
            tag.func_74768_a("v", (int)entry.getValue());
            unlocks.func_74742_a((NBTBase)tag);
        }
        data.func_74782_a("u", (NBTBase)unlocks);
        return data;
    }
    
    public void updateDataWithNBT(final NBTTagCompound data) {
        this.locked = data.func_74767_n("l");
        this.stolen = data.func_74767_n("s");
        this.ownerName = data.func_74779_i("o");
        final NBTTagList unlocks = data.func_150295_c("u", 10);
        for (int i = 0; i < unlocks.func_74745_c(); ++i) {
            final NBTTagCompound tag = unlocks.func_150305_b(i);
            this.unlocks.put(tag.func_74779_i("k"), tag.func_74762_e("v"));
        }
    }
    
    public int getID() {
        return this.func_145782_y();
    }
}
