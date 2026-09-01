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
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public abstract class EntityDriveable extends Entity implements IControllable, IExplodeable, IEntityAdditionalSpawnData
{
    public boolean syncFromServer;
    public boolean crushed;
    public int crushTimer;
    public boolean isShip;
    public boolean atSea;
    public boolean aiming;
    public int serverPositionTransitionTicker;
    public double serverPosX;
    public double serverPosY;
    public double serverPosZ;
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
        this.preventEntitySpawning = true;
        this.setSize(1.5f, 1.5f);
        this.yOffset = 0.375f;
        this.ignoreFrustumCheck = true;
        this.renderDistanceWeight = 20000.0;
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
                this.seats[i] = new EntitySeat(this.worldObj, this, i);
                this.worldObj.spawnEntityInWorld((Entity)this.seats[i]);
            }
        }
        this.wheels = new EntityWheel[type.wheelPositions.length];
        for (int i = 0; i < this.wheels.length; ++i) {
            if (!clientSide) {
                this.wheels[i] = new EntityWheel(this.worldObj, this, i);
                this.worldObj.spawnEntityInWorld((Entity)this.wheels[i]);
            }
        }
        this.stepHeight = type.wheelStepHeight;
        this.yOffset = type.yOffset;
        this.emitterTimers = new int[type.emitters.size()];
        for (int i = 0; i < type.emitters.size(); ++i) {
            this.emitterTimers[i] = this.rand.nextInt(type.emitters.get(i).emitRate);
        }
        this.getEntityData().setBoolean("CanMountEntity", type.canMountEntity);
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
                    this.prevInventoryItems[ps][j] = this.driveableData.getStackInSlot(istart + j);
                }
            }
        }
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tag) {
        this.driveableData.writeToNBT(tag);
        tag.setString("Type", this.driveableType);
        tag.setFloat("RotationYaw", this.axes.getYaw());
        tag.setFloat("RotationPitch", this.axes.getPitch());
        tag.setFloat("RotationRoll", this.axes.getRoll());
        tag.setBoolean("locked", this.locked);
        tag.setBoolean("stolen", this.stolen);
        if (this.owner != null) {
            tag.setString("owner", this.owner.getName());
        }
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tag) {
        this.driveableType = tag.getString("Type");
        this.driveableData = new DriveableData(tag);
        this.initType(DriveableType.getDriveable(this.driveableType), false);
        this.prevRotationYaw = tag.getFloat("RotationYaw");
        this.prevRotationPitch = tag.getFloat("RotationPitch");
        this.prevRotationRoll = tag.getFloat("RotationRoll");
        this.locked = tag.getBoolean("locked");
        this.axes = new RotatedAxes(this.prevRotationYaw, this.prevRotationPitch, this.prevRotationRoll);
        this.stolen = tag.getBoolean("stolen");
        if (tag.hasKey("owner")) {
            this.owner = Factions.getFactionFromName(tag.getString("owner"));
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
            this.prevRotationYaw = this.axes.getYaw();
            this.prevRotationPitch = this.axes.getPitch();
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
            super.setDead();
            e.printStackTrace();
        }
        this.camera = new EntityCamera(this.worldObj, this);
        this.worldObj.spawnEntityInWorld((Entity)this.camera);
    }
    
    public abstract void onMouseMoved(final int p0, final int p1);
    
    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return this.camera;
    }
    
    protected boolean canSit(final int seat) {
        return this.getDriveableType().numPassengers >= seat && this.seats[seat].riddenByEntity == null;
    }
    
    protected boolean canTriggerWalking() {
        return false;
    }
    
    protected void entityInit() {
    }
    
    public AxisAlignedBB getCollisionBox(final Entity entity) {
        if (this.seats[0] != null && this.getDriveableType().collisionDamageEnable && this.seats[0].riddenByEntity != null && this.throttle > this.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving && !entity.isRiding() && !entity.isDead) {
                entity.attackEntityFrom(DamageSource.cactus, this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes);
                if (this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes > 23.0f && ((EntityLiving)entity).getHealth() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 15.0, entity.dimension, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.posX, entity.posY, entity.posZ, 150.0f, entity.dimension);
                }
            }
            else if (entity instanceof EntityPlayer && !entity.isRiding() && !entity.isDead) {
                entity.attackEntityFrom(DamageSource.cactus, this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes);
                if (this.throttle * this.throttle * this.getDriveableType().collisionDamageTimes > 23.0f && ((EntityPlayer)entity).getHealth() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 15.0, entity.dimension, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.posX, entity.posY, entity.posZ, 150.0f, entity.dimension);
                }
            }
        }
        return this.boundingBox;
    }
    
    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    public double getMountedYOffset() {
        return -0.3;
    }
    
    public boolean attackEntityFrom(final DamageSource damagesource, final float i) {
        if (this.worldObj.isRemote || this.isDead) {
            return true;
        }
        if (this.isMountedEntity(damagesource.getEntity())) {
            return false;
        }
        final boolean broken = this.attackPart(EnumDriveablePart.core, damagesource, i);
        if (i > 0.0f) {
            this.checkPartsWhenAttacked();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
        return true;
    }
    
    public boolean isMountedEntity(final Entity entity) {
        if (entity != null) {
            final Entity entity2 = this.worldObj.getEntityByID(entity.getEntityId());
            for (final Entity seat : this.seats) {
                if (seat.riddenByEntity != null && (seat.riddenByEntity == entity || seat.riddenByEntity == entity2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void setDead() {
        super.setDead();
        if (this.worldObj.isRemote) {
            this.camera.setDead();
        }
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                seat.setDead();
            }
        }
    }
    
    public void onCollideWithPlayer(final EntityPlayer par1EntityPlayer) {
    }
    
    public boolean canBeCollidedWith() {
        return true;
    }
    
    public void applyEntityCollision(final Entity entity) {
    }
    
    public void setPositionAndRotation2(final double d, final double d1, final double d2, final float f, final float f1, final int i) {
        if (this.ticksExisted > 1) {
            return;
        }
        if (!(this.riddenByEntity instanceof EntityPlayer) || !FlansMod.proxy.isThePlayer((EntityPlayer)this.riddenByEntity)) {
            if (this.syncFromServer) {
                this.serverPositionTransitionTicker = i + 5;
            }
            else {
                final double var10 = d - this.posX;
                final double var11 = d1 - this.posY;
                final double var12 = d2 - this.posZ;
                final double var13 = var10 * var10 + var11 * var11 + var12 * var12;
                if (var13 <= 1.0) {
                    return;
                }
                this.serverPositionTransitionTicker = 3;
            }
            this.serverPosX = d;
            this.serverPosY = d1;
            this.serverPosZ = d2;
            this.serverYaw = f;
            this.serverPitch = f1;
        }
    }
    
    public void setIT1(final boolean canFire, final boolean reloading, final int stag, final int stageTime) {
        if (this.worldObj.isRemote && this.ticksExisted % 5 == 0) {
            this.canFireIT1 = canFire;
            this.reloadingDrakon = reloading;
            this.stage = stag;
            this.reloadAnimTime = stageTime;
        }
    }
    
    public void setPositionRotationAndMotion(final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final double motX, final double motY, final double motZ, final float velYaw, final float velPitch, final float velRoll, final float throt, final float steeringYaw, final float throtPP) {
        if (this.worldObj.isRemote) {
            this.serverPosX = x;
            this.serverPosY = y;
            this.serverPosZ = z;
            this.serverYaw = yaw;
            this.serverPitch = pitch;
            this.serverRoll = roll;
            this.serverPositionTransitionTicker = 5;
        }
        else {
            this.setPosition(x, y, z);
            this.setRotation(this.prevRotationYaw = yaw, this.prevRotationPitch = pitch, this.prevRotationRoll = roll);
        }
        this.motionX = motX;
        this.motionY = motY;
        this.motionZ = motZ;
        this.angularVelocity = new Vector3f(velYaw, velPitch, velRoll);
        this.throttle = throt;
        this.throttlePeepee = throtPP;
    }
    
    public void setVelocity(final double d, final double d1, final double d2) {
        this.motionX = d;
        this.motionY = d1;
        this.motionZ = d2;
    }
    
    public boolean pressKey(final int key, final EntityPlayer player) {
        if (this.type.epicShip && !this.atSea) {
            return false;
        }
        if (!this.worldObj.isRemote && key == 9 && this.getDriveableType().modePrimary == EnumFireMode.SEMIAUTO) {
            this.shoot(false, false);
            return true;
        }
        if (!this.worldObj.isRemote && key == 8 && this.getDriveableType().modeSecondary == EnumFireMode.SEMIAUTO) {
            this.shoot(true, false);
            return true;
        }
        return false;
    }
    
    public void updateKeyHeldState(final int key, final boolean held) {
        if (this.worldObj.isRemote) {
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
                    ((ICommandSender)this.seats[0].riddenByEntity).addChatMessage((IChatComponent)new ChatComponentText("Passengers are now " + (this.gtfo ? "banned" : "allowed")));
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
        return this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)this.seats[0].riddenByEntity).capabilities.isCreativeMode;
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
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(s.name, this.posX + v.x, this.posY + v.y, this.posZ + v.z, velocity.x, velocity.y, velocity.z), this.posX + v.x, this.posY + v.y, this.posZ + v.z, 150.0f, this.dimension);
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
        if ((type.planeCoaxPrimary || type.planeCoaxSecondary) && this.seats[0] != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayer) {
            EntityPlayer owner = (EntityPlayer)this.seats[0].riddenByEntity;
            if (evil) {
                owner = fakePlayer;
            }
            if (owner != null) {
                freeLookVec = new Vector3f((float)owner.getLookVec().xCoord, (float)owner.getLookVec().yCoord, (float)owner.getLookVec().zCoord);
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
                if (bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && TeamsManager.bulletsEnabled && this.driveableData.overheatSuffer < 1) {
                    final ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
                    if ((gunType.isAmmo(bullet) && !type.epicShip && this.ticksRepairing == 0) || (type.epicShip && gunType.isAmmo(bullet) && this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health > 3 && this.ticksFlareUsing <= 0)) {
                        this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                        final DriveableData driveableData = this.driveableData;
                        driveableData.overheat += 5;
                        EntityLivingBase human = null;
                        if (evil) {
                            human = (EntityLivingBase)this.humanTarget;
                        }
                        else if (this.seats != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityLivingBase) {
                            human = (EntityLivingBase)this.seats[0].riddenByEntity;
                        }
                        this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(new Vector3f(this.posX, this.posY, this.posZ), gunVec, null), lookVector, human, gunType.bulletSpread / 2.0f, gunType.damage, gunType.bulletSpeed, bulletItemStack.getMetadata(), type, type.evilGolem));
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                        if ((evil || this.driverIsCreative()) && bulletItemStack.getMetadata() >= bulletItemStack.getMaxDurability()) {
                            bulletItemStack.setMetadata(0);
                            if (!type.evilGolem || !this.driverIsCreative() || !evil) {
                                final ItemStack itemStack = bulletItemStack;
                                --itemStack.stackSize;
                                if (bulletItemStack.stackSize <= 0) {
                                    this.onWeaponInventoryChanged(secondary);
                                    bulletItemStack = null;
                                }
                                this.driveableData.setInventorySlotContents(this.getDriveableType().numPassengerGunners + currentGun, bulletItemStack);
                            }
                            else {
                                bulletItemStack.setMetadata(bulletItemStack.getMetadata() + 1);
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
                            final ItemStack bomb = this.driveableData.getStackInSlot(i);
                            if (bomb != null && bomb.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)bomb.getItem()).type, weaponType)) {
                                slot = i;
                            }
                        }
                        if (slot != -1) {
                            final int spread = 0;
                            final int damageMultiplier = 1;
                            final float shellSpeed = 0.0f;
                            ItemStack bulletStack = this.driveableData.getStackInSlot(slot);
                            final ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
                            if (shootPoint.rootPos instanceof PilotGun) {
                                final PilotGun pilotGun2 = (PilotGun)shootPoint.rootPos;
                                final GunType type2 = pilotGun2.type;
                            }
                            final EntityShootable bulletEntity = bulletItem.getEntity(this.worldObj, Vec3.createVectorHelper(gunVec.x + this.posX, gunVec.y + this.posY, gunVec.z + this.posZ), this.axes.getYaw(), this.axes.getPitch(), this.motionX, this.motionY, this.motionZ, (EntityLivingBase)this.seats[0].riddenByEntity, (float)damageMultiplier, this.driveableData.getStackInSlot(slot).getMetadata(), type);
                            this.worldObj.spawnEntityInWorld((Entity)bulletEntity);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                            }
                            if (!type.evilGolem && !this.driverIsCreative() && !evil) {
                                bulletStack.setMetadata(bulletStack.getMetadata() + 1);
                                if (bulletStack.getMetadata() == bulletStack.getMaxDurability()) {
                                    bulletStack.setMetadata(0);
                                    final ItemStack itemStack2 = bulletStack;
                                    --itemStack2.stackSize;
                                    if (bulletStack.stackSize == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }
                                this.driveableData.setInventorySlotContents(slot, bulletStack);
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
                            final ItemStack shell = this.driveableData.getStackInSlot(i);
                            if (shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.getItem()).type, weaponType)) {
                                slot = i;
                            }
                        }
                        if (slot != -1) {
                            final int damageMultiplier2 = 1;
                            final float spread2 = type.bulletSpread;
                            final float shellSpeed = type.bulletSpeed;
                            ItemStack bulletStack = this.driveableData.getStackInSlot(slot);
                            final ItemBullet bulletItem = (ItemBullet)bulletStack.getItem();
                            float pupperinoSpeed = 1.0f;
                            if (this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 5) {
                                pupperinoSpeed = 1.3f;
                            }
                            EntityLivingBase human2 = null;
                            if (evil) {
                                human2 = (EntityLivingBase)this.humanTarget;
                            }
                            else if (this.seats != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityLivingBase) {
                                human2 = (EntityLivingBase)this.seats[0].riddenByEntity;
                            }
                            final EntityShootable bulletEntity2 = bulletItem.getEntity(this.worldObj, Vector3f.add(gunVecFake, new Vector3f(this.posX, this.posY, this.posZ), null), lookVector, human2, spread2, (float)damageMultiplier2, pupperinoSpeed * shellSpeed * bulletItem.type.speedMultiplier, this.driveableData.getStackInSlot(slot).getMetadata(), type, type.evilGolem);
                            this.worldObj.spawnEntityInWorld((Entity)bulletEntity2);
                            this.spawnParticle(type.shootParticle(secondary), shootPoint, gunVec);
                            this.isRecoil = true;
                            if (type.shootSound(secondary) != null) {
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootSound(secondary), false);
                                if (this.getDriveableType().shootDelayPrimary > 60 || this.getDriveableType().loudCannon || this.getDriveableType().earRape) {
                                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 55.0, this.dimension, type.shootSound(secondary), false);
                                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 60.0, this.dimension, type.shootSound(secondary), false);
                                }
                                if (this.getDriveableType().earRape) {
                                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 65.0, this.dimension, type.shootSound(secondary), false);
                                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 70.0, this.dimension, type.shootSound(secondary), false);
                                }
                            }
                            final DriveableData driveableData2 = this.driveableData;
                            driveableData2.overheat += 5;
                            if (type.farSound != null) {
                                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(this.posX, this.posY, this.posZ, type.farSound), this.posX, this.posY, this.posZ, 50.0f, type.farSoundRange, this.dimension);
                            }
                            if (!type.evilGolem && !this.driverIsCreative() && !evil) {
                                bulletStack.setMetadata(bulletStack.getMetadata() + 1);
                                if (bulletStack.getMetadata() == bulletStack.getMaxDurability()) {
                                    bulletStack.setMetadata(0);
                                    final ItemStack itemStack3 = bulletStack;
                                    --itemStack3.stackSize;
                                    if (bulletStack.stackSize == 0) {
                                        this.onWeaponInventoryChanged(secondary);
                                        bulletStack = null;
                                    }
                                }
                                this.driveableData.setInventorySlotContents(slot, bulletStack);
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
        if (this.ticksExisted % 200 == 0) {
            for (final EntityWheel wheel : this.wheels) {
                if (wheel != null) {
                    final Vector3f localVectorGlobally;
                    final Vector3f target = localVectorGlobally = this.axes.findLocalVectorGlobally(this.getDriveableType().wheelPositions[wheel.ID].position);
                    localVectorGlobally.x += (float)this.posX;
                    final Vector3f vector3f = target;
                    vector3f.y += (float)this.posY;
                    final Vector3f vector3f2 = target;
                    vector3f2.z += (float)this.posZ;
                    final int tf = 1;
                    final int cf = 1;
                    final int range = 5;
                    if (MathHelper.abs(target.x - (float)wheel.posX) > range) {
                        wheel.posX = (target.x * tf + (float)wheel.posX * cf) / (tf + cf);
                    }
                    if (MathHelper.abs(target.y - (float)wheel.posY) > range) {
                        wheel.posY = (target.y * tf + (float)wheel.posY * cf) / (tf + cf);
                    }
                    if (MathHelper.abs(target.z - (float)wheel.posZ) > range) {
                        wheel.posZ = (target.z * tf + (float)wheel.posZ * cf) / (tf + cf);
                    }
                }
            }
        }
    }
    
    public void onUpdate() {
        this.epicShip = this.getDriveableType().epicShip;
        super.onUpdate();
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
        this.mounted = this.isRiding();
        if (this.driveableData.overheat > 0) {
            final DriveableData driveableData = this.driveableData;
            --driveableData.overheat;
        }
        if (this.driveableData.overheat < 0) {
            this.driveableData.overheat = 0;
        }
        if (this.driveableData.overheat > type.overheatLimit) {
            this.driveableData.overheatSuffer = type.overheatPenalty;
            PacketPlaySound.sendSoundPacket(this.seats[0].posX, this.seats[0].posY, this.seats[0].posZ, 15.0, this.dimension, type.overheatSound, false);
        }
        if (this.driveableData.overheat > 0) {
            final DriveableData driveableData2 = this.driveableData;
            driveableData2.overheat -= type.coolingBonus;
        }
        if (this.driveableData.overheatSuffer > 0) {
            final DriveableData driveableData3 = this.driveableData;
            --driveableData3.overheatSuffer;
        }
        if (!this.worldObj.isRemote && type.numMissileSlots > 0 && this.ticksExisted % 5 == 0) {
            int slot = -1;
            for (int i = type.numMissileSlots; i > -1; --i) {
                final ItemStack shellCurrent = this.driveableData.getStackInSlot(i);
                if (shellCurrent != null && shellCurrent.getItem() instanceof ItemBullet && this.getDriveableType().ammo.contains(((ItemBullet)shellCurrent.getItem()).type)) {
                    slot = i;
                    break;
                }
            }
            if (slot != -1 && this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayerMP) {
                FlansMod.getPacketHandler().sendTo(new PacketCurrentMissile(this.getEntityId(), this.driveableData.getStackInSlot(slot)), (EntityPlayerMP)this.seats[0].riddenByEntity);
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
            for (int j = 0; j < this.worldObj.loadedEntityList.size(); ++j) {
                final Object obj = this.worldObj.loadedEntityList.get(j);
                if (obj instanceof EntityPlayer && !this.isPartOfThis((Entity)obj)) {
                    this.moveRiders((Entity)obj);
                }
                if (!(obj instanceof EntityWheel) || this.isPartOfThis((Entity)obj) || this.getDistanceToEntity((Entity)obj) <= this.getDriveableType().bulletDetectionRadius) {}
                if (!(obj instanceof EntityDriveable) || this.isPartOfThis((Entity)obj) || this.getDistanceToEntity((Entity)obj) <= this.getDriveableType().bulletDetectionRadius) {}
            }
        }
        if (this.seats[0] != null && this.seats[0].riddenByEntity != null && type.nightScope && this.aiming && !this.worldObj.isRemote) {
            ((EntityLivingBase)this.seats[0].riddenByEntity).addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
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
        if (this.worldObj.isAnyLiquid(this.boundingBox) && !this.hugeBoat) {
            if (this.throttle >= type.maxThrottleInWater) {
                this.throttle = type.maxThrottleInWater;
            }
            if (this.throttle <= -type.maxThrottleInWater) {
                this.throttle = -type.maxThrottleInWater;
            }
            if (this.worldObj.isAnyLiquid(this.boundingBox.copy().offset(0.0, (double)type.maxDepth, 0.0))) {
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
            for (final Object obj2 : this.worldObj.loadedEntityList) {
                final Entity entityy = (Entity)obj2;
                if (entityy instanceof EntityPlayer) {
                    ((EntityPlayer)entityy).addChatMessage((IChatComponent)new ChatComponentText("Position is " + this.posX + this.posZ + " Distance is " + this.getDistanceToEntity(entityy)));
                }
            }
        }
        if ((type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) && !this.worldObj.isRemote && this.seats.length > 0 && this.lockOnSoundDelay <= 0 && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer) {
            final Vector3f playerVecRelToVehicle = this.seats[0].playerLooking.findGlobalVectorLocally(new Vector3f(-1.0f, 0.0f, 0.0f));
            final Vector3f playerVec = this.axes.findGlobalVectorLocally(playerVecRelToVehicle);
            for (final Object obj3 : this.worldObj.loadedEntityList) {
                final Entity entity = (Entity)obj3;
                if (((type.lockOnToMechas && entity instanceof EntityMecha) || (type.lockOnToVehicles && entity instanceof EntityVehicle) || (type.lockOnToPlanes && entity instanceof EntityPlane) || (type.lockOnToPlayers && entity instanceof EntityPlayer) || (type.lockOnToLivings && entity instanceof EntityLivingBase)) && this.getDistanceSqToEntity(entity) < type.maxRangeLockOn * type.maxRangeLockOn) {
                    FlansMod.log(entity.toString());
                    final Vector3f relPosVec = new Vector3f(-entity.posX + this.seats[0].posX, -entity.posY + this.seats[0].posY, entity.posZ - this.seats[0].posZ);
                    final float angle = Math.abs(Vector3f.angle(playerVec, relPosVec));
                    if (angle < Math.toRadians(type.canLockOnAngle)) {
                        PacketPlaySound.sendSoundPacket(this.seats[0].posX, this.seats[0].posY, this.seats[0].posZ, 10.0, this.dimension, type.lockOnSound, false);
                        if (entity instanceof EntityDriveable) {
                            PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, ((EntityDriveable)entity).getDriveableType().lockedOnSoundRange, entity.dimension, ((EntityDriveable)entity).getDriveableType().lockingOnSound, false);
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
        if (this.ridingEntity != null) {
            this.invulnerableUnmountCount = 80;
        }
        else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }
        if (!this.worldObj.isRemote) {
            for (int k = 0; k < this.getDriveableType().numPassengers + 1; ++k) {
                if (this.seats[k] == null || !this.seats[k].addedToChunk) {
                    this.seats[k] = new EntitySeat(this.worldObj, this, k);
                    this.worldObj.spawnEntityInWorld((Entity)this.seats[k]);
                }
            }
            for (int k = 0; k < type.wheelPositions.length; ++k) {
                if (this.wheels[k] == null || !this.wheels[k].addedToChunk) {
                    this.wheels[k] = new EntityWheel(this.worldObj, this, k);
                    this.worldObj.spawnEntityInWorld((Entity)this.wheels[k]);
                }
            }
        }
        if (this.hasEnoughFuel()) {
            this.harvesterAngle += this.throttle / 5.0f;
        }
        for (final DriveablePart part : this.getDriveableData().parts.values()) {
            if (part.box != null) {
                part.update(this);
                if (this.worldObj.isRemote) {
                    if (part.onFire) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w, part.box.y + this.rand.nextFloat() * part.box.h, part.box.z + this.rand.nextFloat() * part.box.d));
                        this.worldObj.spawnParticle("flame", this.posX + pos.x, this.posY + pos.y, this.posZ + pos.z, 0.0, 0.0, 0.0);
                    }
                    if (part.health > 0 && part.health < part.maxHealth / 2) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * part.box.w, part.box.y + this.rand.nextFloat() * part.box.h, part.box.z + this.rand.nextFloat() * part.box.d));
                        this.worldObj.spawnParticle((part.health < part.maxHealth / 4) ? "largesmoke" : "smoke", this.posX + pos.x, this.posY + pos.y, this.posZ + pos.z, 0.0, 0.0, 0.0);
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).box.d));
                        this.worldObj.spawnParticle("flame", this.posX + pos.x, this.posY + pos.y, this.posZ + pos.z, 0.0, 0.0, 0.0);
                        final Vector3f posturret = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                        this.worldObj.spawnParticle("flame", this.posX + posturret.x, this.posY + posturret.y, this.posZ + posturret.z, 0.0, 0.0, 0.0);
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0) {
                        final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).box.d));
                        this.worldObj.spawnParticle("flame", this.posX + pos.x, this.posY + pos.y, this.posZ + pos.z, 0.0, 0.0, 0.0);
                        final Vector3f posturret = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                        this.worldObj.spawnParticle("flame", this.posX + posturret.x, this.posY + posturret.y, this.posZ + posturret.z, 0.0, 0.0, 0.0);
                    }
                    if ((type.epicShip && this.ticksFlareUsing > 0) || this.ticksRepairing > 0) {
                        if (this.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.left).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.w, this.getDriveableData().parts.get(EnumDriveablePart.left).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.h, this.getDriveableData().parts.get(EnumDriveablePart.left).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.left).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 1, "heart"), this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.core).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.w, this.getDriveableData().parts.get(EnumDriveablePart.core).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.h, this.getDriveableData().parts.get(EnumDriveablePart.core).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.core).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 1, "heart"), this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0) {
                            final Vector3f posleft = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.turret).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.w, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.h, this.getDriveableData().parts.get(EnumDriveablePart.turret).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.turret).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 1, "heart"), this.posX + posleft.x, this.posY + posleft.y, this.posZ + posleft.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0) {
                            final Vector3f posright = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.right).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.w, this.getDriveableData().parts.get(EnumDriveablePart.right).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.h, this.getDriveableData().parts.get(EnumDriveablePart.right).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.right).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posright.x, this.posY + posright.y, this.posZ + posright.z, 1, "heart"), this.posX + posright.x, this.posY + posright.y, this.posZ + posright.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0) {
                            final Vector3f posbow = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.bow).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.w, this.getDriveableData().parts.get(EnumDriveablePart.bow).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.h, this.getDriveableData().parts.get(EnumDriveablePart.bow).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.bow).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posbow.x, this.posY + posbow.y, this.posZ + posbow.z, 1, "heart"), this.posX + posbow.x, this.posY + posbow.y, this.posZ + posbow.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0) {
                            final Vector3f posstern = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.stern).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.w, this.getDriveableData().parts.get(EnumDriveablePart.stern).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.h, this.getDriveableData().parts.get(EnumDriveablePart.stern).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.stern).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posstern.x, this.posY + posstern.y, this.posZ + posstern.z, 1, "heart"), this.posX + posstern.x, this.posY + posstern.y, this.posZ + posstern.z, 200.0f, this.dimension);
                        }
                        if (this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxHealth > 0) {
                            final Vector3f posmid = this.axes.findLocalVectorGlobally(new Vector3f(this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.x + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.w, this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.y + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.h, this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.z + this.rand.nextFloat() * this.getDriveableData().parts.get(EnumDriveablePart.midsection).box.d));
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX + posmid.x, this.posY + posmid.y, this.posZ + posmid.z, 1, "heart"), this.posX + posmid.x, this.posY + posmid.y, this.posZ + posmid.z, 200.0f, this.dimension);
                        }
                    }
                }
                if (part.onFire) {
                    if (this.worldObj.isRaining() && this.rand.nextInt(40) == 0) {
                        part.onFire = false;
                    }
                    final Vector3f pos = this.axes.findLocalVectorGlobally(new Vector3f(part.box.x + part.box.w / 2.0f, part.box.y + part.box.h / 2.0f, part.box.z + part.box.d / 2.0f));
                    if (this.worldObj.getBlock(MathHelper.floor_double(this.posX + pos.x), MathHelper.floor_double(this.posY + pos.y), MathHelper.floor_double(this.posZ + pos.z)).getMaterial() != Material.water) {
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
                            final Vector3f localPosition = new Vector3f(emitter.origin.x + this.rand.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.rand.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.rand.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.axes.findLocalVectorGlobally(localPosition);
                            velocity = this.axes.findLocalVectorGlobally(emitter.velocity);
                        }
                        else if (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.turret || (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.head && emitter.part != "barrel")) {
                            final Vector3f localPosition2 = new Vector3f(emitter.origin.x + this.rand.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.rand.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.rand.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.getPositionOnTurret(localPosition2, false);
                            velocity = this.getPositionOnTurret(emitter.velocity, false);
                        }
                        else if (EnumDriveablePart.getPart(emitter.part) == EnumDriveablePart.barrel) {
                            final Vector3f localPosition2 = new Vector3f(emitter.origin.x + this.rand.nextFloat() * emitter.extents.x - emitter.extents.x * 0.5f, emitter.origin.y + this.rand.nextFloat() * emitter.extents.y - emitter.extents.y * 0.5f, emitter.origin.z + this.rand.nextFloat() * emitter.extents.z - emitter.extents.z * 0.5f);
                            pos2 = this.getPositionOnTurret(localPosition2, true);
                            velocity = this.getPositionOnTurret(emitter.velocity, true);
                        }
                        FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(emitter.effectType, this.posX + pos2.x, this.posY + pos2.y, this.posZ + pos2.z, velocity.x, velocity.y, velocity.z), this.posX + pos2.x, this.posY + pos2.y, this.posZ + pos2.z, 150.0f, this.dimension);
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
                        final Vector3f localPosition3 = new Vector3f(emitter2.origin.x + this.rand.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.rand.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.rand.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.axes.findLocalVectorGlobally(localPosition3);
                        velocity2 = this.axes.findLocalVectorGlobally(emitter2.velocity);
                    }
                    else if (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.turret || (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.head && emitter2.part != "barrel")) {
                        final Vector3f localPosition4 = new Vector3f(emitter2.origin.x + this.rand.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.rand.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.rand.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.getPositionOnTurret(localPosition4, false);
                        velocity2 = this.getPositionOnTurret(emitter2.velocity, false);
                    }
                    else if (EnumDriveablePart.getPart(emitter2.part) == EnumDriveablePart.barrel) {
                        final Vector3f localPosition4 = new Vector3f(emitter2.origin.x + this.rand.nextFloat() * emitter2.extents.x - emitter2.extents.x * 0.5f, emitter2.origin.y + this.rand.nextFloat() * emitter2.extents.y - emitter2.extents.y * 0.5f, emitter2.origin.z + this.rand.nextFloat() * emitter2.extents.z - emitter2.extents.z * 0.5f);
                        pos3 = this.getPositionOnTurret(localPosition4, true);
                        velocity2 = this.getPositionOnTurret(emitter2.velocity, true);
                    }
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle(emitter2.effectType, this.posX + pos3.x, this.posY + pos3.y, this.posZ + pos3.z, velocity2.x, velocity2.y, velocity2.z), this.posX + pos3.x, this.posY + pos3.y, this.posZ + pos3.z, 150.0f, this.dimension);
                }
            }
        }
        this.checkParts();
        this.prevRotationYaw = this.axes.getYaw();
        this.prevRotationPitch = this.axes.getPitch();
        this.prevRotationRoll = this.axes.getRoll();
        this.prevAxes = this.axes.clone();
        if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
            this.riddenByEntity = null;
        }
        if (this.riddenByEntity != null && this.isDead) {
            this.riddenByEntity.mountEntity((Entity)null);
        }
        if (this.riddenByEntity != null) {
            this.riddenByEntity.fallDistance = 0.0f;
        }
        final boolean canThrust = this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f;
        if ((this.seats[0] != null && this.seats[0].riddenByEntity == null) || (!canThrust && this.getDriveableType().maxThrottle != 0.0f && this.getDriveableType().maxNegativeThrottle != 0.0f)) {
            this.throttle *= 0.9995f;
        }
        if (this.seats[0] != null && this.seats[0].riddenByEntity == null) {
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
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.shootReloadSound, false);
        }
        if (this.ticksExisted == 40) {
            this.driveableData.originX = (int)this.posX;
            this.driveableData.originY = (int)this.posY + 1;
            this.driveableData.originZ = (int)this.posZ;
        }
        if (this.ticksExisted == 1) {
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
            if (!this.worldObj.isRemote) {
                if (!this.getDriveableType().placeSoundPrimary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().placeSoundPrimary, false);
                }
                if (!this.getDriveableType().placeSoundSecondary.isEmpty()) {
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().placeSoundSecondary, false);
                }
            }
        }
        if (type.evilGolem) {
            if (this.softTarget != null && (this.softTarget.isDead || (this.softTarget.isRiding() && this.softTarget.ridingEntity != null && this.softTarget.ridingEntity instanceof EntitySeat && ((EntitySeat)this.softTarget.ridingEntity).driveable != null && ((EntitySeat)this.softTarget.ridingEntity).driveable instanceof EntityVehicle))) {
                this.softTarget = null;
            }
            if (this.airTarget != null && this.airTarget.isDead) {
                this.airTarget = null;
            }
            if (this.softTarget == null && this.airTarget == null && this.ticksExisted % 10.0f == 0.0f && !this.worldObj.isRemote) {
                if (this.worldObj.isRemote) {
                    this.softTarget = null;
                    this.airTarget = null;
                }
                for (final Object obj4 : this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand((double)type.evilRange, (double)type.evilRange, (double)type.evilRange))) {
                    final Entity candidateEntity = (Entity)obj4;
                    if (candidateEntity != null && candidateEntity != this && (candidateEntity instanceof EntityPlayer || candidateEntity instanceof EntityPlane) && candidateEntity.getDistanceToEntity((Entity)this) < type.evilRange) {
                        if (candidateEntity instanceof EntityPlayer && (!candidateEntity.isRiding() || candidateEntity.ridingEntity == null || !(candidateEntity.ridingEntity instanceof EntitySeat) || ((EntitySeat)candidateEntity.ridingEntity).driveable == null || !(((EntitySeat)candidateEntity.ridingEntity).driveable instanceof EntityVehicle))) {
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
                    dX = this.softTarget.posX - this.seats[0].posX;
                    dY = this.softTarget.posY - (this.seats[0].posY + 0.5);
                    dZ = this.softTarget.posZ - this.seats[0].posZ;
                }
                if (this.airTarget != null && this.seats != null && this.seats[0] != null) {
                    dX = this.airTarget.posX - this.seats[0].posX;
                    dY = this.airTarget.posY - (this.seats[0].posY + 1.5);
                    dZ = this.airTarget.posZ - this.seats[0].posZ;
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
        if (!this.worldObj.isRemote) {
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
        for (int l = 0; l < data.getSizeInventory(); ++l) {
            final ItemStack stack = data.getStackInSlot(l);
            if (stack != null) {
                if (stack.stackSize > 0) {
                    final Item item = stack.getItem();
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
                                final int damage = stack.getMetadata();
                                stack.setMetadata(damage + 1);
                                if (damage < stack.getMaxDurability()) {
                                    break;
                                }
                                stack.setMetadata(0);
                                final ItemStack itemStack = stack;
                                --itemStack.stackSize;
                                if (stack.stackSize <= 0) {
                                    data.setInventorySlotContents(l, null);
                                    break;
                                }
                                break;
                            }
                        }
                        else if (FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftOilBucket) && data.fuelInTank + 1000 * fuelMultiplier <= type.fuelTankSize) {
                            final DriveableData driveableData9 = data;
                            driveableData9.fuelInTank += 1000 * fuelMultiplier;
                            data.setInventorySlotContents(l, new ItemStack(Items.bucket));
                        }
                        else if (FlansMod.hooks.BuildCraftLoaded && stack.isItemEqual(FlansMod.hooks.BuildCraftFuelBucket) && data.fuelInTank + 2000 * fuelMultiplier <= type.fuelTankSize) {
                            final DriveableData driveableData10 = data;
                            driveableData10.fuelInTank += 2000 * fuelMultiplier;
                            data.setInventorySlotContents(l, new ItemStack(Items.bucket));
                        }
                        this.prevPosX = this.posX;
                        this.prevPosY = this.posY;
                        this.prevPosZ = this.posZ;
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
        if (this.worldObj.isRemote) {
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
                        final ItemStack itemStack = this.driveableData.getStackInSlot(istart + i);
                        if (itemStack != null && itemStack.getItem() instanceof ItemBullet && (this.prevInventoryItems[ps][i] == null || !ItemStack.areItemStacksEqual(itemStack, this.prevInventoryItems[ps][i])) && type.isValidAmmo(((ItemBullet)itemStack.getItem()).type, weaponType)) {
                            this.onWeaponInventoryChanged(ps == 1);
                            break;
                        }
                    }
                    for (int i = 0; i < isize; ++i) {
                        this.prevInventoryItems[ps][i] = this.driveableData.getStackInSlot(istart + i);
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
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().reloadSoundPrimary, false);
            }
        }
        else if (type.reloadTimeSecondary > 0 && this.getShootDelay(secondary) <= 0) {
            FlansMod.log("EntityDriveable Reload Secondary " + type.reloadTimeSecondary + " tick");
            this.setShootDelay(type.reloadTimeSecondary, secondary);
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.getDriveableType().reloadSoundSecondary, false);
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
            final Vec3 lastPos = Vec3.createVectorHelper(this.prevPosX + lastRelPos.x, this.prevPosY + lastRelPos.y, this.prevPosZ + lastRelPos.z);
            final Vector3f currentRelPos = this.axes.findLocalVectorGlobally(p.position);
            final Vec3 currentPos = Vec3.createVectorHelper(this.posX + currentRelPos.x, this.posY + currentRelPos.y, this.posZ + currentRelPos.z);
            if (FlansMod.DEBUG && this.worldObj.isRemote) {
                this.worldObj.spawnEntityInWorld((Entity)new EntityDebugVector(this.worldObj, new Vector3f(lastPos), Vector3f.sub(currentRelPos, lastRelPos, null), 10, 1.0f, 0.0f, 0.0f));
            }
            final MovingObjectPosition hit = this.worldObj.rayTraceBlocks(lastPos, currentPos, crashInWater);
            if (hit == null || hit.typeOfHit != MovingObjectPosition.MovingObjectType.BLOCK) {
                continue;
            }
            final int x = hit.blockX;
            final int y = hit.blockY;
            final int z = hit.blockZ;
            final Block blockHit = this.worldObj.getBlock(x, y, z);
            final int meta = this.worldObj.getBlockMetadata(x, y, z);
            final float blockHardness = blockHit.getBlockHardness(this.worldObj, x, y, z);
            float damage = 1.0f + blockHardness * blockHardness * (float)speed;
            if (null == blockHit.getCollisionBoundingBoxFromPool(this.worldObj, x, y, z)) {
                damage = 0.0f;
            }
            if (damage > 0.0f) {
                damagePart = true;
                this.getDriveableData().parts.get(p.part).health -= (int)damage;
            }
            if (!this.attackPart(p.part, DamageSource.inWall, damage) && TeamsManager.driveablesBreakBlocks) {
                this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 2001, x, y, z, Block.getIdFromBlock(blockHit) + (meta << 12));
                this.getDriveableData().parts.get(p.part).health -= (int)damage + 1;
                if (this.worldObj.isRemote) {
                    continue;
                }
                blockHit.dropBlockAsItem(this.worldObj, x, y, z, meta, 1);
                this.worldObj.setBlockToAir(x, y, z);
            }
            else {
                this.getDriveableData().parts.get(p.part).health -= (int)damage;
                this.worldObj.createExplosion((Entity)this, currentPos.xCoord, currentPos.yCoord, currentPos.zCoord, 1.0f, false);
            }
        }
        if (damagePart && !this.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
    }
    
    protected void fall(final float k) {
        final double fallDist = (this.posY - this.prevPosY + this.motionY) / 2.0;
        float damage = (float)((fallDist < -0.3) ? (-fallDist * 50.0) : 0.0);
        boolean no_damage = true;
        if (damage > 0.0f && this.invulnerableUnmountCount == 0 && this.ticksExisted > 20 && !no_damage) {
            final DriveableType type = this.getDriveableType();
            damage = (int)(damage * type.fallDamageFactor) * 0.5f;
            this.getDriveableData().parts.get(EnumDriveablePart.core).health -= (int)damage + 1;
            if (type.wheelPositions.length > 0) {
                this.attackPart(type.wheelPositions[0].part, DamageSource.fall, damage / 5.0f);
            }
            no_damage = false;
        }
    }
    
    public boolean isInRangeToRenderDist(final double d) {
        final double d2 = this.renderDistanceWeight;
        return d < d2 * d2;
    }
    
    public boolean attackPart(final EnumDriveablePart ep, final DamageSource source, final float damage) {
        if (ep == EnumDriveablePart.core) {
            if (source.getSourceOfDamage() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.getSourceOfDamage();
            }
            else if (source.getEntity() instanceof EntityLivingBase) {
                this.lastAtkEntity = source.getEntity();
            }
            else {
                this.lastAtkEntity = null;
            }
        }
        final DriveablePart part = this.driveableData.parts.get(ep);
        return part.attack(damage, source.isFireDamage());
    }
    
    public Vector3f rotate(final Vector3f inVec) {
        return this.axes.findLocalVectorGlobally(inVec);
    }
    
    public Vector3f rotate(final Vec3 inVec) {
        return this.rotate(inVec.xCoord, inVec.yCoord, inVec.zCoord);
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
        final double dYaw = this.axes.getYaw() - this.prevRotationYaw;
        if (dYaw > 180.0) {
            this.prevRotationYaw += 360.0f;
        }
        if (dYaw < -180.0) {
            this.prevRotationYaw -= 360.0f;
        }
        final double dPitch = this.axes.getPitch() - this.prevRotationPitch;
        if (dPitch > 180.0) {
            this.prevRotationPitch += 360.0f;
        }
        if (dPitch < -180.0) {
            this.prevRotationPitch -= 360.0f;
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
                if (seat.riddenByEntity == ent) {
                    return true;
                }
            }
        }
        return ent == this;
    }
    
    public boolean hitboxPartOfThis(final Entity ent) {
        return this.seats[0] != null && this.seats[0].riddenByEntity != null && ent != null && ent instanceof EntityPlayer && this.seats[0].riddenByEntity instanceof EntityPlayer && ent == this.seats[0].riddenByEntity;
    }
    
    public float getShadowSize() {
        return 0.0f;
    }
    
    public DriveableType getDriveableType() {
        return DriveableType.getDriveable(this.driveableType);
    }
    
    public DriveableData getDriveableData() {
        return this.driveableData;
    }
    
    public boolean isDead() {
        return this.isDead;
    }
    
    public Entity getControllingEntity() {
        return this.seats[0].getControllingEntity();
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack(this.getDriveableType().item, 1, 0);
        stack.stackTagCompound = new NBTTagCompound();
        this.driveableData.writeToNBT(stack.stackTagCompound);
        return stack;
    }
    
    public boolean hasFuel() {
        return this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity != null && (this.driverIsCreative() || this.driveableData.fuelInTank > 0.0f);
    }
    
    public boolean hasEnoughFuel() {
        return this.driverIsCreative() || this.driveableData.fuelInTank > this.driveableData.engine.fuelConsumption * this.throttle;
    }
    
    public double getSpeedXYZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
    }
    
    public double getMPH() {
        final float advancedSpeed = (float)Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
        if (advancedSpeed >= 1.05 && (Math.abs(this.motionX) > 0.2 || Math.abs(this.motionZ) > 0.2)) {
            return 1572.6646f * (float)Math.log(advancedSpeed);
        }
        if (Math.abs(this.motionX) > 0.2 || Math.abs(this.motionZ) > 0.2) {
            return 0.0f + advancedSpeed * 74.0f;
        }
        return 0.0;
    }
    
    public double getSpeedXZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    }
    
    public boolean landVehicle() {
        return false;
    }
    
    public boolean gearDown() {
        return true;
    }
    
    public boolean onGround() {
        return this.onGround;
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
        final Vector3f riderPos = new Vector3f(rider.posX, rider.posY, rider.posZ);
        final Vector3f riderMotion = new Vector3f(rider.motionX, rider.motionY, rider.motionY);
        Vector3f vehicleMotion = new Vector3f(this.posX - this.lastPos.x, this.posY - this.lastPos.y, this.posZ - this.lastPos.z);
        if (rider instanceof EntityVehicle) {
            vehicleMotion = ((EntityVehicle)rider).lastPos;
        }
        final Vector3f vehiclePos = new Vector3f(this.posX, this.posY, this.posZ);
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
        final Vector3f ellipsoid = new Vector3f(rider.width / 2.0f, rider.height, rider.width / 2.0f);
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
            if (!rider.onGround || this.posY + finalPos.y + 0.625 < riderPos.y) {}
            final boolean stationary = this.throttle == 0.0f;
            test.ConvertESpaceToR3(finalPos);
            final boolean onTop = test.collisionPlaneNormal.y >= 0.5f;
            if (this.posY + finalPos.y + 0.625 < riderPos.y) {
                finalPos.y = riderPos.y - (float)this.posY - 0.625f;
            }
            if (!this.hugeBoat) {
                rider.setPosition(onTop ? ((double)riderPos.x) : ((double)(riderPos.x + finalPos.x / (48.0f * Math.abs(relativePos.x)))), onTop ? (this.posY + finalPos.y + 0.625) : ((double)riderPos.y), onTop ? ((double)riderPos.z) : ((double)(riderPos.z + finalPos.z / (48.0f * Math.abs(relativePos.z)))));
            }
            if (this.hugeBoat && !stationary) {
                rider.setPosition((double)riderPos.x, this.posY + finalPos.y + 0.59375, (double)riderPos.z);
            }
            else if (this.hugeBoat && stationary) {
                rider.setPosition((double)riderPos.x, this.posY + finalPos.y + 0.625, (double)riderPos.z);
            }
            finalPos = Vector3f.sub(finalPos, riderPos, null);
            finalPos.normalise();
            rider.motionY = 0.0;
            this.updateRiderPos(rider, test, finalPos, riderMotion);
            for (final EntitySeat seat : this.seats) {
                if (this.getDriveableType().collisionDamageEnable && !test.isOnTop && (this.throttle > this.getDriveableType().collisionDamageThrottle || (type.mechStomp && this.throttle > this.getDriveableType().collisionDamageThrottle))) {
                    boolean canDamage = true;
                    if (seat != null && TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && rider instanceof EntityPlayerMP && this.seats[0].riddenByEntity instanceof EntityPlayer) {
                        final EntityPlayerMP attacker = (EntityPlayerMP)this.seats[0].riddenByEntity;
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
                    if (this.seats[0].riddenByEntity != null && ((canDamage && rider != this.seats[0].riddenByEntity) || (this.ticksFlareUsing > 0 && rider != this.seats[0].riddenByEntity))) {
                        if (rider instanceof EntityLiving) {
                            ((EntityLivingBase)rider).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                            if (type.panic) {
                                ((EntityLivingBase)rider).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                            }
                        }
                        else if (rider instanceof EntityPlayer) {
                            ((EntityLivingBase)rider).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                            if (type.panic) {
                                ((EntityLivingBase)rider).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                            }
                        }
                    }
                }
            }
            if (rider instanceof EntityPlayer) {
                final EntityPlayer player2 = (EntityPlayer)rider;
                player2.onGround = true;
                player2.isAirBorne = false;
                player2.fallDistance = 0.0f;
            }
        }
        else if (rider instanceof EntityDriveable) {
            ((EntityDriveable)rider).deckHeight = 0.0;
        }
    }
    
    public DamageSource getBulletDamage(final boolean headshot) {
        final DriveableType type = this.getDriveableType();
        final EntityLivingBase owner = (EntityLivingBase)this.seats[0].riddenByEntity;
        if (owner instanceof EntityPlayer) {
            return new EntityDamageSourceFlans(this.getDriveableType().shortName, this, (EntityPlayer)owner, type, headshot, false).setProjectile();
        }
        return new EntityDamageSourceIndirect(type.shortName, (Entity)this, (Entity)owner).setProjectile();
    }
    
    public void checkCollision(final CollisionTest tester, final CollisionShapeBox box) {
        double distance = tester.nearestDistance;
        Vector3f collisionPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        int surface = 0;
        final Vector3f pos = new Vector3f(this.posX, this.posY, this.posZ);
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
        final Vector3f pos = new Vector3f(this.posX, this.posY, this.posZ);
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
        final Vector3f riderMountPoint = new Vector3f(rider.posX - this.posX, rider.posY - this.posY, rider.posZ - this.posZ);
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
        rider.setPosition(nextGlobalPos.x + this.posX + (this.hugeBoat ? (diff.x / 1.5) : 0.0), isDriveable ? ((EntityDriveable)rider).deckHeight : rider.posY, nextGlobalPos.z + this.posZ + (this.hugeBoat ? (diff.z / 1.5) : 0.0));
        if (this.hugeBoat) {
            if (this.lastPos.x == 0.0f && this.lastPos.y == 0.0f && this.lastPos.z == 0.0f) {
                rider.motionX = rider.motionX;
                rider.motionY = rider.motionY;
                rider.motionZ = rider.motionZ;
                if (rider.motionY < 0.0) {
                    rider.motionY = 0.0;
                }
            }
        }
        else if (this.lastPos.x == 0.0f && this.lastPos.y == 0.0f && this.lastPos.z == 0.0f) {
            rider.motionX = rider.motionX;
            rider.motionY = rider.motionY;
            rider.motionZ = rider.motionZ;
        }
        else {
            rider.motionX = diff.x;
            rider.motionY = diff.y;
            rider.motionZ = diff.z;
        }
    }
    
    public void handleVehicleCollision(final EntityDriveable collided, final CollisionTest test, final Vector3f finalPos, final boolean hugeBoat) {
    }
    
    public ArrayList<BulletHit> attackFromBulletClassic(final Vector3f origin, final Vector3f motion, final boolean evilBullet) {
        final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        final Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.posX, (float)this.posY, (float)this.posZ), null);
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
        final Vector3f vehicleMotion = new Vector3f(this.posX - this.lastPos.x, this.posY - this.lastPos.y, this.posZ - this.lastPos.z);
        final Vector3f vehiclePos = new Vector3f(this.posX, this.posY, this.posZ);
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
        if (!this.worldObj.isRemote) {
            this.checkParts();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.posX, this.posY, this.posZ, 100.0f, this.dimension);
        }
        EntitySeat parkingSeat = null;
        EntitySeat shooterSeat = null;
        if (bullet != null && bullet.owner != null && bullet.owner.isRiding() && bullet.owner.ridingEntity != null && bullet.owner.ridingEntity instanceof EntitySeat) {
            shooterSeat = (EntitySeat)bullet.owner.ridingEntity;
        }
        if (this.isRiding() && this.ridingEntity != null && this.ridingEntity instanceof EntitySeat) {
            parkingSeat = (EntitySeat)this.ridingEntity;
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
        final Vector3f relativePosVector = Vector3f.sub(origin, new Vector3f((float)this.posX, (float)this.posY, (float)this.posZ), null);
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
        if (!this.worldObj.isRemote) {
            for (int i = 0; i < this.seats.length; ++i) {
                if (this.seats[i].riddenByEntity != null && this.seats[i].riddenByEntity instanceof EntityPlayer) {
                    final Entity entity = this.seats[i].riddenByEntity;
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret1).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret1).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret1) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret2).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret2).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret2) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret3).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret3).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret3) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret4).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret4).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret4) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret5).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret5).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret5) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret6).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret6).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret6) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret7).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret7).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret7) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret8).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret8).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret8) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.turret9).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.turret9).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.turret9) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.airframe).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.airframe) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.superstructure).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.superstructure).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.superstructure) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.deck).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.deck).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.deck) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.citadel).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.citadel).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.citadel) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.bow).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.bow) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.midsection).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.midsection).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.midsection) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.stern).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.stern) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.tail).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.tail).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.tail) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.bay).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.bay).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.bay) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.left).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.left) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                    if (this.getDriveableData().parts.get(EnumDriveablePart.right).health <= 0.0f && this.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0.0f && this.seats[i].seatInfo.part == EnumDriveablePart.right) {
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
                        }
                    }
                }
            }
        }
        if (this.getDriveableData().parts.get(EnumDriveablePart.core).dead && !type.inshallah) {
            for (final EntitySeat seat : this.seats) {
                if (seat != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayer && this.getDriveableData().parts.get(EnumDriveablePart.core).health == 0 && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                    ((EntityPlayer)this.seats[0].riddenByEntity).addPotionEffect(new PotionEffect(Potion.harm.id, 100, 50));
                    if (this.lastAtkEntity != null && this.lastAtkEntity instanceof EntityPlayer && this.seats[0] != null && this.seats[0].riddenByEntity != null) {
                        this.seats[0].riddenByEntity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                    }
                }
            }
            if (!this.worldObj.isRemote) {
                for (int i = 0; i < seatNum; ++i) {
                    if (this.seats[i].riddenByEntity != null && this.seats[i].riddenByEntity instanceof EntityPlayer) {
                        final Entity entity = this.seats[i].riddenByEntity;
                        this.seats[i].riddenByEntity.mountEntity((Entity)null);
                        if (this.lastAtkEntity instanceof EntityPlayer) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 100, 50));
                            entity.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                        }
                        else if (this.lastAtkEntity instanceof EntityLivingBase) {
                            ((EntityLivingBase)entity).addPotionEffect(new PotionEffect(Potion.harm.id, 100, 50));
                            entity.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this.lastAtkEntity), 1.0E7f);
                        }
                    }
                }
                if (type.isExplosionWhenDestroyed && type.isExplosionWhenDestroyedRadius == 0.0f) {
                    this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, 4.0f, false);
                }
                else if (type.isExplosionWhenDestroyedRadius > 0.0f) {
                    this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, type.isExplosionWhenDestroyedRadius, false);
                }
                if (type.nuclearDeath) {
                    FlansMod.proxy.spawnParticle("flansmod.FMNuke", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "YamatoGun", false);
                }
                if (type.bigDeath) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "shippuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "BattleshipGun", false);
                }
                if (type.Death) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                }
                for (final DriveablePart part2 : this.driveableData.parts.values()) {
                    if (part2.health > 0 && !part2.dead) {
                        this.killPart(part2);
                    }
                }
            }
            data2.depth = -9000.0f;
            this.setDead();
        }
        for (final EntitySeat seat : this.seats) {
            if ((this.getDriveableData().parts.get(EnumDriveablePart.core).dead && seat != null && type.inshallah) || (this.getDriveableData().parts.get(EnumDriveablePart.core).dead && seat != null && type.canDive) || (this.suicide && seat != null && type.inshallah)) {
                if (seat == null || (this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayer && type.inshallah) || this.seats[0].riddenByEntity == null || !(this.seats[0].riddenByEntity instanceof EntityPlayer) || type.canDive) {}
                if (!this.worldObj.isRemote) {
                    for (int j = 0; j < seatNum; ++j) {
                        if (this.seats[j].riddenByEntity != null && this.seats[j].riddenByEntity instanceof EntityPlayer) {
                            final Entity entity2 = this.seats[j].riddenByEntity;
                            this.seats[j].riddenByEntity.mountEntity((Entity)null);
                            if (this.lastAtkEntity instanceof EntityPlayer) {
                                entity2.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)this.lastAtkEntity), 1.0E7f);
                            }
                            else if (this.lastAtkEntity instanceof EntityLivingBase) {
                                entity2.attackEntityFrom(DamageSource.causeMobDamage((EntityLivingBase)this.lastAtkEntity), 1.0E7f);
                            }
                        }
                    }
                    if (type.isExplosionWhenDestroyed && type.isExplosionWhenDestroyedRadius == 0.0f) {
                        this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, 4.0f, false);
                    }
                    else if (type.isExplosionWhenDestroyedRadius > 0.0f) {
                        this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, type.isExplosionWhenDestroyedRadius, false);
                    }
                    if (type.nuclearDeath) {
                        FlansMod.proxy.spawnParticle("flansmod.FMNuke", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "YamatoGun", false);
                    }
                    if (type.bigDeath) {
                        FlansMod.proxy.spawnParticle("flansmod.shipDeath", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "BattleshipGun", false);
                    }
                    if (type.Death) {
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                    }
                    for (final DriveablePart part3 : this.driveableData.parts.values()) {
                        if (part3.health > 0 && !part3.dead) {
                            this.killPart(part3);
                        }
                    }
                }
                data2.depth = -9000.0f;
                if (seat != null) {
                    this.setDead();
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
        FlansMod.proxy.spawnParticle("largeexplode", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
        final DriveableType type = this.getDriveableType();
        if (!this.worldObj.isRemote) {
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
                for (int i = 0; i < this.getDriveableData().getSizeInventory(); ++i) {
                    final ItemStack stack = this.getDriveableData().getStackInSlot(i);
                    if (stack != null) {
                        this.worldObj.spawnEntityInWorld((Entity)new EntityItem(this.worldObj, this.posX + this.rand.nextGaussian(), this.posY + this.rand.nextGaussian(), this.posZ + this.rand.nextGaussian(), stack));
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
        final EntityPlayer driver = (EntityPlayer)this.seats[0].riddenByEntity;
        return Minecraft.getMinecraft().gameSettings.thirdPersonView == 0 && driver != null;
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
    
    public String getCommandSenderName() {
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
        player.addChatMessage((IChatComponent)new ChatComponentText("Locked"));
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
            if (this.worldObj.isRemote && this.ticksExisted > 2) {
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
            final ItemStack shell = this.driveableData.getStackInSlot(i);
            if (shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.getItem()).type, EnumWeaponType.MISSILE)) {
                loaded = true;
            }
        }
        return loaded;
    }
    
    public void tryRecoil() {
        int slot = -1;
        final DriveableType type = this.getDriveableType();
        for (int i = this.driveableData.getMissileInventoryStart(); i < this.driveableData.getMissileInventoryStart() + type.numMissileSlots; ++i) {
            final ItemStack shell = this.driveableData.getStackInSlot(i);
            if (shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.getItem()).type, EnumWeaponType.SHELL)) {
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
            final ItemStack shell = this.driveableData.getStackInSlot(i);
            if (shell != null && shell.getItem() instanceof ItemBullet && type.isValidAmmo(((ItemBullet)shell.getItem()).type, EnumWeaponType.SHELL)) {
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
        player.addChatMessage((IChatComponent)new ChatComponentText("Unlocked"));
    }
    
    public NBTTagCompound extractDataToUpdate() {
        final NBTTagCompound data = new NBTTagCompound();
        data.setBoolean("l", this.locked);
        data.setBoolean("s", this.stolen);
        data.setString("o", (this.owner == null) ? "None" : this.owner.getName());
        final NBTTagList unlocks = new NBTTagList();
        for (final Map.Entry<String, Integer> entry : this.unlocks.entrySet()) {
            final NBTTagCompound tag = new NBTTagCompound();
            tag.setString("k", (String)entry.getKey());
            tag.setInteger("v", (int)entry.getValue());
            unlocks.appendTag((NBTBase)tag);
        }
        data.setTag("u", (NBTBase)unlocks);
        return data;
    }
    
    public void updateDataWithNBT(final NBTTagCompound data) {
        this.locked = data.getBoolean("l");
        this.stolen = data.getBoolean("s");
        this.ownerName = data.getString("o");
        final NBTTagList unlocks = data.getTagList("u", 10);
        for (int i = 0; i < unlocks.tagCount(); ++i) {
            final NBTTagCompound tag = unlocks.getCompoundTagAt(i);
            this.unlocks.put(tag.getString("k"), tag.getInteger("v"));
        }
    }
    
    public int getID() {
        return this.getEntityId();
    }
}
