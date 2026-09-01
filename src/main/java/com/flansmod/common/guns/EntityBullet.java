// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EntityDamageSourceIndirect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.PlayerData;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.potion.PotionEffect;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.guns.raytracing.DriveableHit;
import java.util.List;
import java.util.Collections;
import com.flansmod.common.guns.raytracing.BlockHit;
import com.flansmod.common.guns.raytracing.CustomBlockRaytracing;
import com.flansmod.common.guns.raytracing.EntityHit;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.teams.Team;
import com.flansmod.common.PlayerHandler;
import java.util.Collection;
import com.flansmod.common.guns.raytracing.BulletHit;
import java.util.ArrayList;
import net.minecraft.util.DamageSource;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.FlansMod;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.Entity;
import com.flansmod.api.IEntityBullet;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData, IEntityBullet
{
    private static int bulletLife;
    public Entity owner;
    private int ticksInAir;
    public BulletType type;
    public InfoType firedFrom;
    public float damage;
    public boolean shotgun;
    public int pingOfShooter;
    public boolean detonated;
    public Entity lockedOnTo;
    public double prevDistanceToEntity;
    public int cnt;
    public boolean toggleLock;
    public double lockedOnToSpeed;
    public double thisSpeed;
    public int closeCount;
    public int soundTime;
    public float speedA;
    public float truePen;
    public boolean isHEAT;
    public boolean isSword;
    public String missNoise;
    public boolean radarVisible;
    public boolean entityMissileRadarVisible;
    public boolean evilBullet;
    public int impactX;
    public int impactY;
    public int impactZ;
    public boolean isFirstPositionSetting;
    public boolean isPositionUpper;
    public boolean lockAttempted;
    public static boolean hitCrossHair;
    public static float penAmount;
    public static boolean headshot;
    public float penetratingPower;
    public int submunitionDelay;
    public boolean hasSetSubDelay;
    public boolean hasSetVLSDelay;
    public int VLSDelay;
    public Vector3f lookVector;
    public Vector3f initialPos;
    public boolean hasSetLook;
    public float maxspeed;
    public float initialX;
    public float initialY;
    public float initialZ;
    
    public ShootableType getType() {
        return this.type;
    }
    
    public EntityBullet(final World world) {
        super(world);
        this.shotgun = false;
        this.pingOfShooter = 0;
        this.detonated = false;
        this.prevDistanceToEntity = 0.0;
        this.toggleLock = false;
        this.lockedOnToSpeed = 0.0;
        this.thisSpeed = 0.0;
        this.closeCount = 0;
        this.soundTime = 0;
        this.isSword = false;
        this.missNoise = "bulletFlyby";
        this.radarVisible = false;
        this.entityMissileRadarVisible = false;
        this.evilBullet = false;
        this.isFirstPositionSetting = false;
        this.isPositionUpper = true;
        this.lockAttempted = false;
        this.submunitionDelay = 20;
        this.hasSetSubDelay = false;
        this.hasSetVLSDelay = false;
        this.VLSDelay = 0;
        this.hasSetLook = false;
        this.ticksInAir = 0;
        this.setSize(0.5f, 0.5f);
    }
    
    private EntityBullet(final World world, final EntityLivingBase shooter, final float gunDamage, final BulletType bulletType, final InfoType shotFrom) {
        this(world);
        this.owner = (Entity)shooter;
        if (shooter instanceof EntityPlayerMP) {
            this.pingOfShooter = ((EntityPlayerMP)shooter).ping;
        }
        this.type = bulletType;
        this.firedFrom = shotFrom;
        this.damage = gunDamage;
        this.penetratingPower = this.type.penetratingPower;
        this.setSize(bulletType.hitBoxSize, bulletType.hitBoxSize);
    }
    
    public EntityBullet(final World world, final EntityLivingBase shooter, final float spread, final float gunDamage, final BulletType type1, final float speed, final boolean shot, final InfoType shotFrom, final float Xoffset, final float Yoffset, final float Zoffset) {
        this(world, Vec3.createVectorHelper(shooter.posX - MathHelper.cos(shooter.rotationYaw / 180.0f * 3.1415927f) * Zoffset - MathHelper.cos(shooter.rotationPitch / 180.0f * 3.1415927f) * MathHelper.sin(shooter.rotationYaw / 180.0f * 3.1415927f) * Xoffset, shooter.posY + Yoffset + shooter.getEyeHeight() - MathHelper.sin(shooter.rotationPitch / 180.0f * 3.1415927f) * Xoffset, shooter.posZ + MathHelper.cos(shooter.rotationPitch / 180.0f * 3.1415927f) * MathHelper.cos(shooter.rotationYaw / 180.0f * 3.1415927f) * Xoffset - MathHelper.sin(shooter.rotationYaw / 180.0f * 3.1415927f) * Zoffset), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
        this.shotgun = shot;
    }
    
    public EntityBullet(final World world, final Vec3 origin, final float yaw, final float pitch, final EntityLivingBase shooter, final float spread, final float gunDamage, final BulletType type1, final InfoType shotFrom) {
        this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0f, shotFrom);
    }
    
    public EntityBullet(final World world, final Vec3 origin, final float yaw, final float pitch, final EntityLivingBase shooter, final float spread, final float gunDamage, final BulletType type1, final float speed, final InfoType shotFrom) {
        this(world, shooter, gunDamage, type1, shotFrom);
        this.setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0f;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
        this.motionY = -MathHelper.sin(this.rotationPitch / 180.0f * 3.141593f);
        this.setArrowHeading(this.motionX, this.motionY, this.motionZ, spread / 2.0f, speed);
    }
    
    public EntityBullet(final World world, final Vector3f origin, final Vector3f direction, final EntityLivingBase shooter, final float spread, final float gunDamage, final BulletType type1, final float speed, final InfoType shotFrom) {
        this(world, shooter, gunDamage, type1, shotFrom);
        this.damage = gunDamage;
        this.setPosition((double)origin.x, (double)origin.y, (double)origin.z);
        this.motionX = direction.x;
        this.motionY = direction.y;
        this.motionZ = direction.z;
        this.setArrowHeading(this.motionX, this.motionY, this.motionZ, spread, speed);
    }
    
    public EntityBullet(final World world, final Vector3f origin, final Vector3f direction, final EntityLivingBase shooter, final float spread, final float gunDamage, final BulletType type1, final float speed, final InfoType shotFrom, final Boolean ai) {
        this(world, shooter, gunDamage, type1, shotFrom);
        this.damage = gunDamage;
        this.evilBullet = ai;
        this.setPosition((double)origin.x, (double)origin.y, (double)origin.z);
        this.motionX = direction.x;
        this.motionY = direction.y;
        this.motionZ = direction.z;
        this.setArrowHeading(this.motionX, this.motionY, this.motionZ, spread, speed);
    }
    
    public EntityBullet(final World world, final Vec3 origin, final float yaw, final float pitch, final double motX, final double motY, final double motZ, final EntityLivingBase shooter, final float gunDamage, final BulletType type1, final InfoType shotFrom) {
        this(world, shooter, gunDamage, type1, shotFrom);
        this.setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.yOffset = 0.0f;
        this.motionX = motX;
        this.motionY = motY;
        this.motionZ = motZ;
    }
    
    protected void entityInit() {
    }
    
    public void setArrowHeading(double d, double d1, double d2, final float spread, final float speed) {
        final float f2 = MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2);
        d /= f2;
        d1 /= f2;
        d2 /= f2;
        d *= speed;
        d1 *= speed;
        d2 *= speed;
        d += this.rand.nextGaussian() * 0.005 * spread * speed;
        d1 += this.rand.nextGaussian() * 0.005 * spread * speed;
        d2 += this.rand.nextGaussian() * 0.005 * spread * speed;
        this.motionX = d;
        this.motionY = d1;
        this.motionZ = d2;
        final float f3 = MathHelper.sqrt_double(d * d + d2 * d2);
        final float n = (float)(Math.atan2(d, d2) * 180.0 / 3.1415927410125732);
        this.rotationYaw = n;
        this.prevRotationYaw = n;
        final float n2 = (float)(Math.atan2(d1, f3) * 180.0 / 3.1415927410125732);
        this.rotationPitch = n2;
        this.prevRotationPitch = n2;
    }
    
    private void getLockOnTarget() {
        if (this.type.lockOnToPlanes || this.type.lockOnToVehicles || this.type.lockOnToMechas || this.type.lockOnToLivings || this.type.lockOnToPlayers) {
            final Vector3f motionVec = new Vector3f(this.motionX, this.motionY, this.motionZ);
            Entity closestEntity = null;
            float closestAngle = this.type.maxLockOnAngle * 3.1415927f / 180.0f;
            for (final Object obj : this.worldObj.loadedEntityList) {
                final Entity entity = (Entity)obj;
                final String etype = entity.getEntityData().getString("EntityType");
                if ((this.type.lockOnToMechas && entity instanceof EntityMecha) || (this.type.lockOnToVehicles && entity instanceof EntityVehicle) || (this.type.lockOnToVehicles && etype.equals("Vehicle")) || (this.type.lockOnToPlanes && entity instanceof EntityPlane) || (this.type.lockOnToPlanes && etype.equals("Plane")) || (this.type.lockOnToPlayers && entity instanceof EntityPlayer) || (this.type.lockOnToLivings && entity instanceof EntityLivingBase)) {
                    final Vector3f relPosVec = new Vector3f(entity.posX - this.posX, entity.posY - this.posY, entity.posZ - this.posZ);
                    final float angle = Math.abs(Vector3f.angle(motionVec, relPosVec));
                    final Vector3f missileDirection = (Vector3f)motionVec.normalise();
                    final Vector3f targetDirection = (Vector3f)new Vector3f(entity.motionX, entity.motionY, entity.motionZ).normalise();
                    boolean rearLock = false;
                    if (Math.abs(missileDirection.x - targetDirection.x) < 0.5f && Math.abs(missileDirection.y - targetDirection.y) < 0.5f && Math.abs(missileDirection.z - targetDirection.z) < 0.5f) {
                        rearLock = true;
                    }
                    if ((angle < closestAngle && !this.type.earlyInfrared) || this.type.infiniteAngle || (angle < closestAngle && this.type.earlyInfrared && rearLock)) {
                        closestEntity = entity;
                        closestAngle = angle;
                    }
                    if (!(entity instanceof EntityDriveable)) {
                        continue;
                    }
                    final EntityDriveable victim = (EntityDriveable)entity;
                    float noisiness = 0.0f;
                    if (victim.throttle > 0.0f) {
                        noisiness = victim.throttle;
                    }
                    if (victim.throttle < 0.0f) {
                        noisiness = Math.abs(victim.throttle) / 2.0f;
                    }
                    if (victim.getDriveableType().hasRadar && victim.activeRadar && this.type.antiRadiation) {
                        closestEntity = entity;
                        closestAngle = angle;
                    }
                    if (((this.owner.ridingEntity == null || victim == this.owner.ridingEntity) && this.owner.isRiding()) || !this.type.modernTorpedo || !this.isInWater() || this.type.ASWminRange + this.type.seekerRange * noisiness <= relPosVec.length()) {
                        continue;
                    }
                    closestEntity = entity;
                    closestAngle = angle;
                }
            }
            if (closestEntity != null) {
                this.lockedOnTo = closestEntity;
                if (this.owner != null && this.owner instanceof EntityPlayer && this.lockedOnTo instanceof EntityDriveable && !this.worldObj.isRemote) {
                    final EntityDriveable target = (EntityDriveable)this.lockedOnTo;
                    final EntityPlayer human = (EntityPlayer)this.owner;
                    human.addChatMessage((IChatComponent)new ChatComponentText(this.type.name + " has successfully locked onto " + target.getDriveableType().name));
                }
            }
        }
    }
    
    public void setVelocity(final double d, final double d1, final double d2) {
        this.motionX = d;
        this.motionY = d1;
        this.motionZ = d2;
        if (this.prevRotationPitch == 0.0f && this.prevRotationYaw == 0.0f) {
            final float f = MathHelper.sqrt_double(d * d + d2 * d2);
            final float n = (float)(Math.atan2(d, d2) * 180.0 / 3.1415927410125732);
            this.rotationYaw = n;
            this.prevRotationYaw = n;
            final float n2 = (float)(Math.atan2(d1, f) * 180.0 / 3.1415927410125732);
            this.rotationPitch = n2;
            this.prevRotationPitch = n2;
            this.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.type == null) {
            FlansMod.log("EntityBullet.onUpdate() Error: BulletType is null (" + this + ")");
            this.setDead();
            return;
        }
        if (this.ticksExisted == this.type.lockonDelay && !this.type.modernTorpedo) {
            this.getLockOnTarget();
        }
        if (this.type.modernTorpedo && this.isInWater() && !this.lockAttempted) {
            this.getLockOnTarget();
            this.lockAttempted = true;
        }
        if (this.type.despawnTime > 0 && this.ticksExisted > this.type.despawnTime) {
            this.detonated = true;
            this.setDead();
            return;
        }
        if (this.ticksExisted < 10) {
            this.truePen = (float)this.type.armorPen;
            this.isHEAT = this.type.HEAT;
            this.isSword = this.type.swordEnergy;
            this.missNoise = this.type.missNoise;
        }
        if (this.truePen > 2.0f && this.truePen > 0.5 * this.type.armorPen) {
            this.truePen -= this.ticksExisted * this.type.penDecay;
        }
        if (this.type.armorPen > 2 && this.truePen < 2.0f) {
            this.truePen = 2.0f;
        }
        if (!this.hasSetSubDelay && this.type.hasSubmunitions) {
            this.setSubmunitionDelay();
        }
        else if (this.type.hasSubmunitions) {
            --this.submunitionDelay;
        }
        if (!this.hasSetVLSDelay && this.type.VLS) {
            this.VLSDelay = this.type.VLSTime;
            this.hasSetVLSDelay = true;
        }
        if (this.VLSDelay > 0) {
            --this.VLSDelay;
        }
        if (!this.hasSetLook && this.owner != null) {
            this.lookVector = new Vector3f((float)this.owner.getLookVec().xCoord, (float)this.owner.getLookVec().yCoord, (float)this.owner.getLookVec().zCoord);
            this.initialPos = new Vector3f(this.owner.posX, this.owner.posY, this.owner.posZ);
            this.hasSetLook = true;
        }
        if (this.soundTime > 0) {
            --this.soundTime;
        }
        if (this.owner != null) {
            final double rangeX = this.owner.posX - this.posX;
            final double rangeY = this.owner.posY - this.posY;
            final double rangeZ = this.owner.posZ - this.posZ;
            final double range = Math.sqrt(rangeX * rangeX + rangeY * rangeY + rangeZ * rangeZ);
            if (this.type.maxRange != -1 && this.type.maxRange < range) {
                if (this.ticksExisted > this.type.fuse && this.type.fuse > 0) {
                    this.detonate();
                }
                this.setDead();
            }
        }
        else {
            this.setDead();
        }
        ++this.ticksInAir;
        if (this.ticksInAir > this.type.fuse && this.type.fuse > 0 && !this.isDead) {
            this.setDead();
        }
        if (this.ticksExisted > EntityBullet.bulletLife) {
            this.setDead();
        }
        if (this.isDead) {
            return;
        }
        if (!this.worldObj.isRemote) {
            if (this.ticksExisted > this.type.fuse && this.type.fuse > 0) {
                this.detonate();
            }
            if (this.type.livingProximityTrigger > 0.0f || this.type.driveableProximityTrigger > 0.0f) {
                final float checkRadius = Math.max(this.type.livingProximityTrigger, this.type.driveableProximityTrigger);
                final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand((double)checkRadius, (double)checkRadius, (double)checkRadius));
                for (final Object obj : list) {
                    if (obj == this.owner && this.ticksExisted < 10) {
                        continue;
                    }
                    if (obj instanceof EntityLivingBase && this.getDistanceToEntity((Entity)obj) < this.type.livingProximityTrigger) {
                        if (TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && this.owner instanceof EntityPlayer && !TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, (DamageSource)new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.owner, this.type, false, false))) {
                            continue;
                        }
                        if (this.type.damageToTriggerer > 0.0f) {
                            ((EntityLivingBase)obj).attackEntityFrom(this.getBulletDamage(false), this.type.damageToTriggerer);
                        }
                        FlansMod.proxy.spawnParticle("redstone", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0);
                        this.detonate();
                        break;
                    }
                    else {
                        if (obj instanceof EntityDriveable && this.getDistanceToEntity((Entity)obj) < this.type.driveableProximityTrigger) {
                            if (this.type.damageToTriggerer > 0.0f) {
                                ((EntityDriveable)obj).attackEntityFrom(this.getBulletDamage(false), this.type.damageToTriggerer);
                            }
                            this.detonate();
                            break;
                        }
                        continue;
                    }
                }
            }
        }
        final ArrayList<BulletHit> hits = new ArrayList<BulletHit>();
        final Vector3f origin = new Vector3f(this.posX, this.posY, this.posZ);
        final Vector3f motion = new Vector3f(this.motionX, this.motionY, this.motionZ);
        final float hitBoxSize = (this.type.hitBoxSize >= 0.0f) ? this.type.hitBoxSize : 0.0f;
        final float speed = motion.length();
        this.speedA = speed;
        if (this.type.hasSubmunitions && this.submunitionDelay < 0) {
            this.DeploySubmunitions();
            this.submunitionDelay = 9001;
        }
        for (int i = 0; i < this.worldObj.loadedEntityList.size(); ++i) {
            final Object obj2 = this.worldObj.loadedEntityList.get(i);
            if (obj2 instanceof EntityDriveable) {
                final EntityDriveable driveable = (EntityDriveable)obj2;
                if (!driveable.isDead() && (!driveable.isPartOfThis(this.owner) || this.evilBullet || (driveable.getDriveableType().evilGolem && !this.evilBullet))) {
                    if (driveable.hitboxPartOfThis(this.owner) && !this.evilBullet) {
                        if (!driveable.getDriveableType().evilGolem) {
                            continue;
                        }
                        if (this.evilBullet) {
                            continue;
                        }
                    }
                    if (this.getDistanceToEntity((Entity)driveable) <= driveable.getDriveableType().bulletDetectionRadius + speed) {
                        if (driveable.getDriveableType().autisticHitDetection && (!driveable.getDriveableType().evilGolem || !this.evilBullet)) {
                            final ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion, this.evilBullet);
                            hits.addAll(driveableHits);
                        }
                        else if (!driveable.getDriveableType().evilGolem || !this.evilBullet) {
                            final ArrayList<BulletHit> driveableHiterinos = driveable.attackFromBulletClassic(origin, motion, this.evilBullet);
                            hits.addAll(driveableHiterinos);
                        }
                    }
                }
            }
            else if (obj2 instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)obj2;
                final PlayerData data = PlayerHandler.getPlayerData(player);
                boolean shouldDoNormalHitDetect = false;
                if (data != null) {
                    if (player.isDead) {
                        continue;
                    }
                    if (data.team == Team.spectators) {
                        continue;
                    }
                    if (player == this.owner && this.ticksInAir < 20 && !this.evilBullet) {
                        continue;
                    }
                    int snapshotToTry = TeamsManager.bulletSnapshotMin;
                    if (TeamsManager.bulletSnapshotDivisor > 0) {
                        snapshotToTry += this.pingOfShooter / TeamsManager.bulletSnapshotDivisor;
                    }
                    if (snapshotToTry >= data.snapshots.length) {
                        snapshotToTry = data.snapshots.length - 1;
                    }
                    PlayerSnapshot snapshot;
                    if (data.snapshots[snapshotToTry] != null) {
                        snapshot = data.snapshots[snapshotToTry];
                    }
                    else {
                        snapshot = data.snapshots[0];
                    }
                    if (snapshot == null) {
                        shouldDoNormalHitDetect = true;
                    }
                    else {
                        final ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);
                        hits.addAll(playerHits);
                    }
                }
                if (data == null || shouldDoNormalHitDetect) {
                    final MovingObjectPosition mop = player.boundingBox.expand((double)hitBoxSize, (double)hitBoxSize, (double)hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ));
                    if (mop != null) {
                        final Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - this.posX, mop.hitVec.yCoord - this.posY, mop.hitVec.zCoord - this.posZ);
                        float hitLambda = 1.0f;
                        if (motion.x != 0.0f) {
                            hitLambda = hitPoint.x / motion.x;
                        }
                        else if (motion.y != 0.0f) {
                            hitLambda = hitPoint.y / motion.y;
                        }
                        else if (motion.z != 0.0f) {
                            hitLambda = hitPoint.z / motion.z;
                        }
                        if (hitLambda < 0.0f) {
                            hitLambda = -hitLambda;
                        }
                        hits.add(new PlayerBulletHit(new PlayerHitbox(player, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                    }
                }
            }
            else {
                final Entity entity = (Entity)obj2;
                if (entity != this && entity != this.owner && !this.evilBullet && !entity.isDead && !(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb) && !(entity instanceof EntityArrow) && (entity.getClass().toString().indexOf("flansmod.") < 0 || entity instanceof EntityAAGun || entity instanceof EntityGrenade) && entity.getClass().toString().indexOf("holographicdisplays") < 0) {
                    final AxisAlignedBB bb = entity.boundingBox.addCoord(-(entity.posX - entity.prevPosX) * 2.0, -(entity.posY - entity.prevPosY) * 2.0, -(entity.posZ - entity.prevPosZ) * 2.0);
                    final MovingObjectPosition mop2 = bb.expand((double)hitBoxSize, (double)hitBoxSize, (double)hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ));
                    if (mop2 != null) {
                        final Vector3f hitPoint2 = new Vector3f(mop2.hitVec.xCoord - this.posX, mop2.hitVec.yCoord - this.posY, mop2.hitVec.zCoord - this.posZ);
                        float hitLambda2 = 1.0f;
                        if (motion.x != 0.0f) {
                            hitLambda2 = hitPoint2.x / motion.x;
                        }
                        else if (motion.y != 0.0f) {
                            hitLambda2 = hitPoint2.y / motion.y;
                        }
                        else if (motion.z != 0.0f) {
                            hitLambda2 = hitPoint2.z / motion.z;
                        }
                        if (hitLambda2 < 0.0f) {
                            hitLambda2 = -hitLambda2;
                        }
                        hits.add(new EntityHit(entity, hitLambda2));
                    }
                }
            }
        }
        Vec3 posVec = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        final Vec3 nextPosVec = Vec3.createVectorHelper(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        final MovingObjectPosition hit = CustomBlockRaytracing.rayTraceBlocks(this.worldObj, posVec, nextPosVec, false, true, true);
        posVec = Vec3.createVectorHelper(this.posX, this.posY, this.posZ);
        if (hit != null) {
            final Vec3 hitVec = posVec.subtract(hit.hitVec);
            float lambda = 1.0f;
            if (this.motionX != 0.0) {
                lambda = (float)(hitVec.xCoord / this.motionX);
            }
            else if (this.motionY != 0.0) {
                lambda = (float)(hitVec.yCoord / this.motionY);
            }
            else if (this.motionZ != 0.0) {
                lambda = (float)(hitVec.zCoord / this.motionZ);
            }
            if (lambda < 0.0f) {
                lambda = -lambda;
            }
            hits.add(new BlockHit(hit, lambda));
        }
        if (!hits.isEmpty()) {
            Collections.sort(hits);
            for (final BulletHit bulletHit : hits) {
                if (bulletHit instanceof DriveableHit) {
                    if (this.type.entityHitSoundEnable) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.hitSoundRange, this.dimension, this.type.hitSound, true);
                    }
                    if (this.worldObj.isRemote && this.owner instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.owner)) {
                        EntityBullet.hitCrossHair = true;
                    }
                    final DriveableHit driveableHit = (DriveableHit)bulletHit;
                    driveableHit.driveable.lastAtkEntity = this.owner;
                    if ((this.type != null && this.type.swordEnergy && this.driveable != null && this.driveable.getDriveableType() != null && this.driveable.getDriveableType().canStab) || (!this.type.swordEnergy && (!(this.driveable instanceof EntityVehicle) || !((EntityVehicle)this.driveable).getVehicleType().evilGolem || !this.evilBullet))) {
                        this.penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, this.penetratingPower);
                    }
                    if (this.type.canSpotEntityDriveable) {
                        driveableHit.driveable.setEntityMarker(200);
                    }
                    if (FlansMod.DEBUG) {
                        this.worldObj.spawnEntityInWorld((Entity)new EntityDebugDot(this.worldObj, new Vector3f(this.posX + this.motionX * driveableHit.intersectTime, this.posY + this.motionY * driveableHit.intersectTime, this.posZ + this.motionZ * driveableHit.intersectTime), 1000, 0.0f, 0.0f, 1.0f));
                    }
                }
                else if (bulletHit instanceof PlayerBulletHit) {
                    if (this.type.entityHitSoundEnable) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.hitSoundRange, this.dimension, this.type.hitSound, true);
                    }
                    if (this.worldObj.isRemote && this.owner instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.owner) && !this.evilBullet) {
                        EntityBullet.hitCrossHair = true;
                    }
                    final PlayerBulletHit playerHit = (PlayerBulletHit)bulletHit;
                    this.penetratingPower = playerHit.hitbox.hitByBullet(this, this.penetratingPower);
                    if (FlansMod.DEBUG) {
                        this.worldObj.spawnEntityInWorld((Entity)new EntityDebugDot(this.worldObj, new Vector3f(this.posX + this.motionX * playerHit.intersectTime, this.posY + this.motionY * playerHit.intersectTime, this.posZ + this.motionZ * playerHit.intersectTime), 1000, 1.0f, 0.0f, 0.0f));
                    }
                }
                else if (bulletHit instanceof EntityHit) {
                    if (this.type.entityHitSoundEnable) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.hitSoundRange, this.dimension, this.type.hitSound, true);
                    }
                    if (this.worldObj.isRemote && this.owner instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.owner) && !this.evilBullet) {
                        EntityBullet.hitCrossHair = true;
                        EntityBullet.penAmount = 1.0f;
                        EntityBullet.headshot = false;
                    }
                    final EntityHit entityHit = (EntityHit)bulletHit;
                    float d = this.damage;
                    if (entityHit.entity instanceof EntityLivingBase) {
                        if (this.ticksExisted > this.type.dynamicBulletDelay) {
                            d *= this.type.dynamicDamage;
                        }
                        else {
                            d *= this.type.damageVsLiving;
                        }
                        if (entityHit.entity != this.owner || !this.evilBullet || entityHit.entity != this.owner) {
                            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", entityHit.entity.posX, entityHit.entity.posY + 1.0, entityHit.entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150.0f, this.dimension);
                        }
                        if (d > 40.0f) {
                            PacketPlaySound.sendSoundPacket(entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 15.0, this.dimension, "goreDeath", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entityHit.entity.posX, entityHit.entity.posY - 4.0, entityHit.entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150.0f, this.dimension);
                        }
                    }
                    else {
                        if (this.ticksExisted > this.type.dynamicBulletDelay) {
                            d *= this.type.dynamicDamage;
                        }
                        else {
                            d *= this.type.damageVsEntity;
                        }
                        if (d > 40.0f) {
                            PacketPlaySound.sendSoundPacket(entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 15.0, this.dimension, "goreDeath", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entityHit.entity.posX, entityHit.entity.posY - 4.0, entityHit.entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150.0f, this.dimension);
                        }
                    }
                    if (entityHit.entity.attackEntityFrom(this.getBulletDamage(false), d) && entityHit.entity instanceof EntityLivingBase) {
                        final EntityLivingBase living = (EntityLivingBase)entityHit.entity;
                        for (final PotionEffect effect : this.type.hitEffects) {
                            living.addPotionEffect(new PotionEffect(effect));
                        }
                        final EntityLivingBase entityLivingBase = living;
                        ++entityLivingBase.arrowHitTimer;
                        living.hurtResistantTime = living.maxHurtResistantTime / 2;
                    }
                    if (this.type.setEntitiesOnFire) {
                        entityHit.entity.setFire(20);
                    }
                    --this.penetratingPower;
                    if (FlansMod.DEBUG) {
                        this.worldObj.spawnEntityInWorld((Entity)new EntityDebugDot(this.worldObj, new Vector3f(this.posX + this.motionX * entityHit.intersectTime, this.posY + this.motionY * entityHit.intersectTime, this.posZ + this.motionZ * entityHit.intersectTime), 1000, 1.0f, 1.0f, 0.0f));
                        FlansMod.log(entityHit.entity.toString() + ": d=" + d + ": damage=" + this.damage + ": type.damageVsEntity=" + this.type.damageVsEntity);
                    }
                }
                else if (bulletHit instanceof BlockHit) {
                    final BlockHit blockHit = (BlockHit)bulletHit;
                    final MovingObjectPosition raytraceResult = blockHit.raytraceResult;
                    final int xTile = raytraceResult.blockX;
                    final int yTile = raytraceResult.blockY;
                    final int zTile = raytraceResult.blockZ;
                    if (FlansMod.DEBUG) {
                        this.worldObj.spawnEntityInWorld((Entity)new EntityDebugDot(this.worldObj, new Vector3f(raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord), 1000, 0.0f, 1.0f, 0.0f));
                    }
                    final Block block = this.worldObj.getBlock(xTile, yTile, zTile);
                    final Material mat = block.getMaterial();
                    if (this.type.breaksGlass && mat == Material.glass && TeamsManager.canBreakGlass) {
                        this.worldObj.setBlockToAir(xTile, yTile, zTile);
                        FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block, this.dimension);
                    }
                    if (this.worldObj.isRemote && block.getMaterial() != Material.air && this.type.explosionRadius <= 0.0f) {
                        for (int num = 2 + this.rand.nextInt(3), j = 0; j < num; ++j) {
                            FlansMod.proxy.spawnParticle("blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(xTile, yTile, zTile), raytraceResult.hitVec.xCoord + (this.rand.nextFloat() - 0.5) * this.width, raytraceResult.hitVec.yCoord + 0.1, raytraceResult.hitVec.zCoord + (this.rand.nextFloat() - 0.5) * this.width, -this.motionX * 4.0, 1.5, -this.motionZ * 4.0);
                            FlansMod.proxy.spawnParticle("explode", raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord, 0.0, 0.0, 0.0);
                        }
                    }
                    if (hit != null) {
                        this.setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
                    }
                    if (this.type.hitSoundEnable) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.hitSoundRange, this.dimension, this.type.hitSound, true);
                    }
                    this.setDead();
                    break;
                }
                if (this.penetratingPower <= 0.0f || (this.type.explodeOnImpact && this.ticksInAir > 1 && !(bulletHit instanceof PlayerBulletHit))) {
                    this.setPosition(this.posX + this.motionX * bulletHit.intersectTime, this.posY + this.motionY * bulletHit.intersectTime, this.posZ + this.motionZ * bulletHit.intersectTime);
                    this.setDead();
                    break;
                }
            }
        }
        float drag = this.type.dragInAir;
        final float gravity = 0.02f;
        if (this.isInWater()) {
            for (int k = 0; k < 4; ++k) {
                final float bubbleMotion = 0.25f;
                this.worldObj.spawnParticle("bubble", this.posX - this.motionX * bubbleMotion, this.posY - this.motionY * bubbleMotion, this.posZ - this.motionZ * bubbleMotion, this.motionX, this.motionY + 0.10000000149011612, this.motionZ);
            }
            drag = this.type.dragInWater;
        }
        if (!this.type.torpedo && !this.type.modernTorpedo) {
            this.motionX *= drag;
            this.motionY *= drag;
            this.motionZ *= drag;
            this.motionY -= gravity * this.type.fallSpeed;
            if (this.type.jamiogravity) {
                this.motionY *= 0.9800000190734863;
            }
        }
        if (this.lockedOnTo != null) {
            if (this.lockedOnTo instanceof EntityDriveable) {
                final EntityDriveable entDriveable = (EntityDriveable)this.lockedOnTo;
                if (entDriveable.getDriveableType().lockedOnSound != null && this.soundTime <= 0 && !this.worldObj.isRemote) {
                    PacketPlaySound.sendSoundPacket(this.lockedOnTo.posX, this.lockedOnTo.posY, this.lockedOnTo.posZ, entDriveable.getDriveableType().lockedOnSoundRange, this.dimension, entDriveable.getDriveableType().lockedOnSound, false);
                    this.soundTime = entDriveable.getDriveableType().soundTime;
                }
            }
            else {
                this.lockedOnTo.getEntityData().setBoolean("Tracking", true);
            }
            if (this.ticksExisted > this.type.tickStartHoming) {
                final double dX = this.lockedOnTo.posX - this.posX;
                double dY;
                if (this.type.isDoTopAttack && Math.abs(this.lockedOnTo.posX - this.posX) > 2.0 && Math.abs(this.lockedOnTo.posZ - this.posZ) > 2.0) {
                    dY = this.lockedOnTo.posY + 30.0 - this.posY;
                }
                else {
                    dY = this.lockedOnTo.posY - this.posY;
                }
                final double dZ = this.lockedOnTo.posZ - this.posZ;
                double dXYZ;
                if (!this.type.isDoTopAttack) {
                    dXYZ = this.getDistanceToEntity(this.lockedOnTo);
                }
                else {
                    dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
                }
                if (this.owner != null && this.type.enableSACLOS) {
                    final double dXp = this.lockedOnTo.posX - this.owner.posX;
                    final double dYp = this.lockedOnTo.posY - this.owner.posY;
                    final double dZp = this.lockedOnTo.posZ - this.owner.posZ;
                    final Vec3 playerVec = this.owner.getLookVec();
                    final Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
                    final double angles = Math.abs(Vector3f.angle(playerVec3f, new Vector3f(dXp, dYp, dZp)));
                    if (angles > Math.toRadians(this.type.maxDegreeOfSACLOS)) {
                        this.lockedOnTo = null;
                    }
                }
                if (this.toggleLock) {
                    if (dXYZ > this.type.maxRangeOfMissile) {
                        this.lockedOnTo = null;
                    }
                    this.toggleLock = false;
                }
                final double dmotion = Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                final Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);
                final double angle = Math.abs(Vector3f.angle(motion, motionVector));
                if (angle > Math.toRadians(this.type.maxDegreeOfMissile) && !this.type.infiniteAngle && !this.type.antiRadiation && !this.type.modernTorpedo) {
                    this.lockedOnTo = null;
                }
                else {
                    this.motionX = motionVector.x;
                    this.motionY = motionVector.y;
                    this.motionZ = motionVector.z;
                }
                if (this.ticksExisted > 4 && dXYZ > this.prevDistanceToEntity) {
                    ++this.closeCount;
                    if (this.closeCount > 15) {
                        this.lockedOnTo = null;
                    }
                }
                else if (this.closeCount > 0) {
                    --this.closeCount;
                }
                this.prevDistanceToEntity = dXYZ;
            }
            if (this.lockedOnTo instanceof EntityDriveable) {
                final EntityDriveable plane = (EntityDriveable)this.lockedOnTo;
                if (plane.varFlare || plane.ticksFlareUsing > 0) {
                    this.lockedOnTo = null;
                    if (this.owner != null && this.owner instanceof EntityPlayer && !this.worldObj.isRemote) {
                        final EntityDriveable target = (EntityDriveable)this.lockedOnTo;
                        final EntityPlayer human = (EntityPlayer)this.owner;
                        human.addChatMessage((IChatComponent)new ChatComponentText("Enemy flares have broken " + this.type.name + "'s lock!"));
                    }
                }
            }
            else if (this.lockedOnTo != null && this.lockedOnTo.getEntityData().getBoolean("FlareUsing")) {
                this.lockedOnTo = null;
            }
        }
        if (this.owner != null && this.type.shootForSettingPos && !this.isFirstPositionSetting) {
            if (this.owner instanceof EntityPlayer) {
                final EntityPlayer entP = (EntityPlayer)this.owner;
                if (entP.getCurrentEquippedItem() != null && entP.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                    final ItemGun itemGun = (ItemGun)entP.getCurrentEquippedItem().getItem();
                    this.impactX = itemGun.impactX;
                    this.impactY = itemGun.impactY;
                    this.impactZ = itemGun.impactZ;
                }
            }
            this.isFirstPositionSetting = true;
        }
        if (this.type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper) {
            final double motionXa = this.motionX;
            final double motionYa = this.motionY;
            final double motionZa = this.motionZ;
            final double motiona = Math.sqrt(motionXa * motionXa + motionYa * motionYa + motionZa * motionZa);
            this.motionX = 0.0;
            this.motionY = motiona;
            this.motionZ = 0.0;
            if (this.posY - this.type.shootForSettingPosHeight > this.owner.posY) {
                this.isPositionUpper = false;
            }
        }
        if (this.type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper) {
            final double rootx = this.impactX - this.posX;
            final double rootz = this.impactZ - this.posZ;
            final double roota = Math.sqrt(rootx * rootx + rootz * rootz);
            final double motionXa2 = this.motionX;
            final double motionYa2 = this.motionY;
            final double motionZa2 = this.motionZ;
            final double motiona2 = Math.sqrt(motionXa2 * motionXa2 + motionYa2 * motionYa2 + motionZa2 * motionZa2);
            this.motionX = rootx * motiona2 / roota;
            this.motionZ = rootz * motiona2 / roota;
            if (Math.abs(this.impactX - this.posX) < 1.0 && Math.abs(this.impactZ - this.posZ) < 1.0) {
                final double motionXab = this.motionX;
                final double motionYab = this.motionY;
                final double motionZab = this.motionZ;
                final double motionab = Math.sqrt(motionXa2 * motionXa2 + motionYa2 * motionYa2 + motionZa2 * motionZa2);
                this.motionX = 0.0;
                this.motionY = -motionab;
                this.motionZ = 0.0;
            }
        }
        this.renderDistanceWeight = 256.0;
        if (this.owner != null && this.type.manualGuidance && this.VLSDelay <= 0 && this.lockedOnTo == null) {
            this.renderDistanceWeight = 256.0;
            Vector3f lookVec = new Vector3f((float)this.owner.getLookVec().xCoord, (float)this.owner.getLookVec().yCoord, (float)this.owner.getLookVec().zCoord);
            Vector3f origin2 = new Vector3f(this.owner.posX, this.owner.posY, this.owner.posZ);
            if (this.type.fixedDirection) {
                lookVec = this.lookVector;
                origin2 = this.initialPos;
            }
            final float x = (float)(this.posX - origin2.x);
            final float y = (float)(this.posY - origin2.y);
            final float z = (float)(this.posZ - origin2.z);
            float d2 = (float)Math.sqrt(x * x + y * y + z * z);
            d2 += this.type.turnRadius;
            lookVec.normalise();
            final Vector3f targetPoint = new Vector3f(origin2.x + lookVec.x * d2, origin2.y + lookVec.y * d2, origin2.z + lookVec.z * d2);
            final Vector3f diff = Vector3f.sub(targetPoint, new Vector3f(this.posX, this.posY, this.posZ), null);
            final float speed2 = this.type.trackPhaseSpeed;
            float turnSpeed = this.type.trackPhaseTurn;
            diff.normalise();
            turnSpeed = 0.1f;
            final Vector3f targetSpeed = new Vector3f(diff.x * speed2, diff.y * speed2, diff.z * speed2);
            this.motionX += (targetSpeed.x - this.motionX) * turnSpeed;
            this.motionY += (targetSpeed.y - this.motionY) * turnSpeed;
            this.motionZ += (targetSpeed.z - this.motionZ) * turnSpeed;
        }
        if (this.type.torpedo || (this.type.modernTorpedo && this.lockedOnTo == null)) {
            if (this.isInWater()) {
                final Vector3f motion2 = new Vector3f(this.motionX, this.motionY, this.motionZ);
                final float length = motion.length();
                motion.normalise();
                this.motionX = motion.x * 1.0f;
                this.motionZ = motion.z * 1.0f;
                if (!this.type.modernTorpedo) {
                    this.motionY += 1.5f * gravity * this.type.fallSpeed;
                    this.motionY *= 0.30000001192092896;
                }
            }
            else {
                this.motionY -= gravity * this.type.fallSpeed * 2.5f;
            }
        }
        if (this.type.depthCharge) {
            if (!this.isInWater()) {
                this.motionY -= gravity * this.type.fallSpeed;
                if (this.motionY > 0.10000000149011612) {
                    this.motionY *= 0.8999999761581421;
                }
            }
            if (TeamsManager.seaLevel - this.posY <= this.type.activationDepth && this.isInWater()) {
                this.motionY -= gravity * this.type.fallSpeed;
                this.motionX = 0.0;
                this.motionZ = 0.0;
            }
            if (TeamsManager.seaLevel - this.posY > this.type.activationDepth && this.isInWater()) {
                this.detonate();
            }
        }
        this.setPosition(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        final float motionXZ = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0 / 3.1415927410125732);
        this.rotationPitch = (float)(Math.atan2(this.motionY, motionXZ) * 180.0 / 3.1415927410125732);
        while (this.rotationPitch - this.prevRotationPitch < -180.0f) {
            this.prevRotationPitch -= 360.0f;
        }
        while (this.rotationPitch - this.prevRotationPitch >= 180.0f) {
            this.prevRotationPitch += 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
            this.prevRotationYaw -= 360.0f;
        }
        while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
            this.prevRotationYaw += 360.0f;
        }
        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2f;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2f;
        if (this.type.trailParticles && this.worldObj.isRemote && this.ticksInAir > 1) {
            this.spawnParticles();
        }
        if (this.ticksExisted == 3) {
            this.maxspeed = (float)Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
            this.initialX = (float)this.motionX;
            this.initialY = (float)this.motionY;
            this.initialZ = (float)this.motionZ;
        }
        if (this.type.trueManual && this.owner != null && this.owner.isRiding() && (this.owner.ridingEntity instanceof EntitySeat || this.owner.ridingEntity instanceof EntityDriveable)) {
            EntityDriveable driverino = null;
            if (this.owner.ridingEntity instanceof EntitySeat) {
                final EntitySeat seaterino = (EntitySeat)this.owner.ridingEntity;
                driverino = seaterino.driveable;
            }
            else if (this.owner.ridingEntity instanceof EntityDriveable) {
                driverino = (EntityDriveable)this.owner.ridingEntity;
            }
            if (driverino != null) {
                final float cancerZ = -MathHelper.sin(this.rotationYaw / 180.0f * 3.1415927f) * this.type.joystickSensitivity * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
                final float cancerX = MathHelper.cos(this.rotationYaw / 180.0f * 3.1415927f) * this.type.joystickSensitivity * MathHelper.cos(this.rotationPitch / 180.0f * 3.1415927f);
                final float fakeY = this.initialY - gravity * this.type.fallSpeed * this.ticksExisted;
                final Vector3f direction = new Vector3f(this.motionX, this.motionY, this.motionZ);
                direction.normalise();
                if ((this.initialX > 0.5f && this.initialX > 0.0f) || (this.initialX < 0.0f && this.initialX > -0.5f && this.initialZ < 0.5f) || (this.initialX > 0.0f && this.initialZ < 0.5f)) {
                    this.motionZ -= driverino.yawSignal / 100.0f * this.type.joystickSensitivity * (1.0f - Math.abs(direction.z));
                    this.motionX -= driverino.yawSignal / 100.0f * this.type.joystickSensitivity * (1.0f - Math.abs(direction.x));
                }
                else {
                    this.motionZ += driverino.yawSignal / 100.0f * this.type.joystickSensitivity * (1.0f - Math.abs(direction.z));
                    this.motionX += driverino.yawSignal / 100.0f * this.type.joystickSensitivity * (1.0f - Math.abs(direction.x));
                }
                this.motionY += driverino.pitchSignal / 120.0f * this.type.joystickSensitivity * (1.0f - Math.abs(direction.y));
            }
        }
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    @SideOnly(Side.CLIENT)
    private void spawnParticles() {
        final double dX = (this.posX - this.prevPosX) / 10.0;
        final double dY = (this.posY - this.prevPosY) / 10.0;
        final double dZ = (this.posZ - this.prevPosZ) / 10.0;
        final float spread = 0.1f;
        if (this.VLSDelay > 0 && this.type.boostPhaseParticle != null) {
            for (int i = 0; i < 10; ++i) {
                FlansMod.proxy.spawnParticle(this.type.boostPhaseParticle, this.prevPosX + dX * i + this.rand.nextGaussian() * spread, this.prevPosY + dY * i + this.rand.nextGaussian() * spread, this.prevPosZ + dZ * i + this.rand.nextGaussian() * spread, 0.0, 0.0, 0.0);
            }
        }
        else if (!this.type.VLS || this.VLSDelay <= 0) {
            for (int i = 0; i < 10; ++i) {
                FlansMod.proxy.spawnParticle(this.type.trailParticleType, this.prevPosX + dX * i + this.rand.nextGaussian() * spread, this.prevPosY + dY * i + this.rand.nextGaussian() * spread, this.prevPosZ + dZ * i + this.rand.nextGaussian() * spread, 0.0, 0.0, 0.0);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    private static void spawnHitParticles(final double x, final double y, final double z) {
        FlansMod.proxy.spawnParticle("explode", x, y, z, 0.0, 0.0, 0.0);
    }
    
    public DamageSource getBulletDamage(final boolean headshot) {
        if (this.owner instanceof EntityPlayer) {
            return new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.owner, this.firedFrom, headshot, false).setProjectile();
        }
        return new EntityDamageSourceIndirect(this.type.shortName, (Entity)this, this.owner).setProjectile();
    }
    
    private boolean isPartOfOwner(final Entity entity) {
        if (this.owner == null) {
            return false;
        }
        if ((entity == this.owner && !this.evilBullet) || (entity == this.owner.riddenByEntity && !this.evilBullet) || (entity == this.owner.ridingEntity && !this.evilBullet)) {
            return true;
        }
        if (this.owner instanceof EntityPlayer) {
            if (PlayerHandler.getPlayerData((EntityPlayer)this.owner, this.worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null) {
                return false;
            }
            final EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer)this.owner, this.worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
            if (mg != null && mg == entity) {
                return true;
            }
        }
        return this.owner.ridingEntity instanceof EntitySeat && (((EntitySeat)this.owner.ridingEntity).driveable == null || ((EntitySeat)this.owner.ridingEntity).driveable.isPartOfThis(entity));
    }
    
    public void setDead() {
        try {
            if (this.owner != null && this.owner instanceof EntityPlayer && this.type.scoutBullet && !this.worldObj.isRemote) {
                final float xd = (float)this.owner.posX - (float)this.posX;
                final float yd = (float)this.owner.posY - (float)this.posY;
                final float zd = (float)this.owner.posZ - (float)this.posZ;
                final float distance = (float)Math.sqrt(xd * xd + yd * yd + zd * zd);
                final EntityDriveable target = (EntityDriveable)this.lockedOnTo;
                final EntityPlayer human = (EntityPlayer)this.owner;
                human.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW.toString() + "Target coordinates are: "));
                human.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN.toString() + "X: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posX)));
                human.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN.toString() + "Y: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posY)));
                human.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN.toString() + "Z: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posZ)));
                human.addChatMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW.toString() + "Distance from Target to your CURRENT Location: " + EnumChatFormatting.GOLD.toString() + distance));
            }
            if (this.isDead) {
                return;
            }
            super.setDead();
            if (this.worldObj.isRemote) {
                return;
            }
            if (this.type.explosionRadius > 0.0f) {
                if (this.owner instanceof EntityPlayer) {
                    final FlansModExplosion flansModExplosion = new FlansModExplosion(this.worldObj, this, (EntityPlayer)this.owner, this.type, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks, this.type.explosionDamageVsLiving, this.type.explosionDamageVsPlayer, this.type.explosionDamageVsPlane, this.type.explosionDamageVsVehicle, this.type.smokeParticleCount, this.type.debrisParticleCount);
                }
                else {
                    this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions);
                }
            }
            if (this.type.fireRadius > 0.0f) {
                for (float i = -this.type.fireRadius; i < this.type.fireRadius; ++i) {
                    for (float k = -this.type.fireRadius; k < this.type.fireRadius; ++k) {
                        for (int j = -1; j < 1; ++j) {
                            if (this.worldObj.getBlock((int)(this.posX + i), (int)(this.posY + j), (int)(this.posZ + k)).getMaterial() == Material.air) {
                                this.worldObj.setBlock((int)(this.posX + i), (int)(this.posY + j), (int)(this.posZ + k), (Block)Blocks.fire);
                            }
                        }
                    }
                }
            }
            if (this.type.flak > 0) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, this.type.flak, this.type.flakParticles), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
            }
            if (this.type.dropItemOnHit != null) {
                String itemName = this.type.dropItemOnHit;
                int damage = 0;
                if (itemName.contains(".")) {
                    damage = Integer.parseInt(itemName.split("\\.")[1]);
                    itemName = itemName.split("\\.")[0];
                }
                final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
                this.entityDropItem(dropStack, 1.0f);
            }
        }
        catch (final Exception e) {
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
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
    
    public void detonate() {
        if (this.ticksExisted < this.type.primeDelay) {
            return;
        }
        if (this.detonated) {
            return;
        }
        this.detonated = true;
        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.detonateSound, true);
        if (!this.worldObj.isRemote && this.type.explosionRadius > 0.1f) {
            if (this.owner instanceof EntityPlayer) {
                new FlansModExplosion(this.worldObj, this, (EntityPlayer)this.owner, this.type, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks, this.type.explosionDamageVsLiving, this.type.explosionDamageVsPlayer, this.type.explosionDamageVsPlane, this.type.explosionDamageVsVehicle, this.type.smokeParticleCount, this.type.debrisParticleCount);
                this.isDead = true;
            }
            else {
                this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks);
                this.isDead = true;
            }
        }
        if (!this.worldObj.isRemote && this.type.fireRadius > 0.1f) {
            for (float i = -this.type.fireRadius; i < this.type.fireRadius; ++i) {
                for (float j = -this.type.fireRadius; j < this.type.fireRadius; ++j) {
                    for (float k = -this.type.fireRadius; k < this.type.fireRadius; ++k) {
                        final int x = MathHelper.floor_double(i + this.posX);
                        final int y = MathHelper.floor_double(j + this.posY);
                        final int z = MathHelper.floor_double(k + this.posZ);
                        if (i * i + j * j + k * k <= this.type.fireRadius * this.type.fireRadius && this.worldObj.getBlock(x, y, z) == Blocks.air && this.rand.nextBoolean()) {
                            this.worldObj.setBlock(x, y, z, (Block)Blocks.fire, 0, 3);
                        }
                    }
                }
            }
        }
        for (int l = 0; l < this.type.explodeParticles; ++l) {
            this.worldObj.spawnParticle(this.type.explodeParticleType, this.posX, this.posY, this.posZ, this.rand.nextGaussian(), this.rand.nextGaussian(), this.rand.nextGaussian());
        }
        if (!this.worldObj.isRemote && this.type.dropItemOnDetonate != null) {
            String itemName = this.type.dropItemOnDetonate;
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            this.entityDropItem(dropStack, 1.0f);
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound tag) {
        if (this.type == null) {
            FlansMod.log("EntityBullet.writeEntityToNBT() Error: BulletType is null (" + this + ")");
            this.setDead();
            return;
        }
        tag.setString("type", this.type.shortName);
        if (this.owner == null) {
            tag.setString("owner", "null");
        }
        else {
            tag.setString("owner", this.owner.getCommandSenderName());
        }
    }
    
    public void readEntityFromNBT(final NBTTagCompound tag) {
        final String typeString = tag.getString("type");
        final String ownerName = tag.getString("owner");
        if (typeString != null) {
            this.type = BulletType.getBullet(typeString);
        }
        if (this.type == null) {
            this.isDead = true;
            return;
        }
        if (this.type.despawnTime <= 0) {
            this.isDead = true;
        }
        if (ownerName != null && !ownerName.equals("null")) {
            this.owner = (Entity)FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().getPlayerByUsername(ownerName);
        }
    }
    
    public float getShadowSize() {
        return this.type.hitBoxSize;
    }
    
    public void setSubmunitionDelay() {
        this.submunitionDelay = this.type.subMunitionTimer;
        this.hasSetSubDelay = true;
    }
    
    public void DeploySubmunitions() {
        final ItemShootable itemShootable = (ItemShootable)GameRegistry.findItem("flansmod", this.type.submunition);
        final ShootableType shootType = itemShootable.type;
        final World world = this.worldObj;
        final EntityLivingBase entityplayer = (EntityLivingBase)this.owner;
        for (int sm = 0; sm < this.type.numSubmunitions; ++sm) {
            world.spawnEntityInWorld((Entity)itemShootable.getEntity(world, new Vector3f(this.posX, this.posY, this.posZ), new Vector3f(this.motionX, this.motionY, this.motionZ), entityplayer, this.type.submunitionSpread, this.damage, this.speedA, 0, this.firedFrom));
        }
        if (this.type.destroyOnDeploySubmunition) {
            this.detonate();
        }
    }
    
    public int getBrightnessForRender(final float par1) {
        if (this.type.hasLight) {
            return 15728880;
        }
        final int i = MathHelper.floor_double(this.posX);
        final int j = MathHelper.floor_double(this.posZ);
        if (this.worldObj.blockExists(i, 0, j)) {
            final double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66;
            final int k = MathHelper.floor_double(this.posY - this.yOffset + d0);
            return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
        }
        return 0;
    }
    
    public void writeSpawnData(final ByteBuf data) {
        data.writeDouble(this.motionX);
        data.writeDouble(this.motionY);
        data.writeDouble(this.motionZ);
        data.writeInt(this.impactX);
        data.writeInt(this.impactY);
        data.writeInt(this.impactZ);
        data.writeInt((this.lockedOnTo == null) ? -1 : this.lockedOnTo.getEntityId());
        ByteBufUtils.writeUTF8String(data, this.type.shortName);
        if (this.owner == null) {
            ByteBufUtils.writeUTF8String(data, "null");
        }
        else {
            ByteBufUtils.writeUTF8String(data, this.owner.getCommandSenderName());
        }
    }
    
    public void readSpawnData(final ByteBuf data) {
        try {
            this.motionX = data.readDouble();
            this.motionY = data.readDouble();
            this.motionZ = data.readDouble();
            this.impactX = data.readInt();
            this.impactY = data.readInt();
            this.impactZ = data.readInt();
            final int lockedOnToID = data.readInt();
            if (lockedOnToID != -1) {
                this.lockedOnTo = this.worldObj.getEntityByID(lockedOnToID);
            }
            this.type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
            this.penetratingPower = this.type.penetratingPower;
            final String name = ByteBufUtils.readUTF8String(data);
            for (final Object obj : this.worldObj.loadedEntityList) {
                if (((Entity)obj).getCommandSenderName().equals(name)) {
                    this.owner = (Entity)obj;
                }
            }
        }
        catch (final Exception e) {
            FlansMod.log("Failed to read bullet owner from server.");
            super.setDead();
            e.printStackTrace();
        }
    }
    
    public boolean isBurning() {
        return false;
    }
    
    static {
        EntityBullet.bulletLife = 600;
    }
}
