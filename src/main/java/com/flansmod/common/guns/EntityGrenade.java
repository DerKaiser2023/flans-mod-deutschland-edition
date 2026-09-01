// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EntityDamageSourceIndirect;
import com.flansmod.common.network.PacketFlashBang;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.util.DamageSource;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.potion.PotionEffect;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.client.Minecraft;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.teams.Team;
import net.minecraft.entity.EntityLivingBase;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;

public class EntityGrenade extends EntityShootable implements IEntityAdditionalSpawnData
{
    public GrenadeType type;
    public EntityLivingBase thrower;
    public Team teamOfThrower;
    public RotatedAxes axes;
    public Vector3f angularVelocity;
    public float prevRotationRoll;
    public int smokeTime;
    public boolean smoking;
    public boolean stuck;
    public int stuckToX;
    public int stuckToY;
    public int stuckToZ;
    public boolean detonated;
    public int numUsesRemaining;
    public boolean isThisStick;
    public Entity stickedEntity;
    public int motionTime;
    
    public EntityGrenade(final World w) {
        super(w);
        this.axes = new RotatedAxes();
        this.angularVelocity = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevRotationRoll = 0.0f;
        this.smokeTime = 0;
        this.smoking = false;
        this.stuck = false;
        this.detonated = false;
        this.numUsesRemaining = 0;
        this.isThisStick = false;
        this.motionTime = 0;
    }
    
    public EntityGrenade(final World w, final GrenadeType g, final EntityLivingBase t) {
        this(w);
        this.setPosition(t.posX, t.posY + t.getEyeHeight(), t.posZ);
        this.type = g;
        this.numUsesRemaining = this.type.numUses;
        this.thrower = t;
        if (this.thrower instanceof EntityPlayer && PlayerHandler.getPlayerData((EntityPlayer)this.thrower) != null) {
            this.teamOfThrower = PlayerHandler.getPlayerData((EntityPlayer)this.thrower).team;
        }
        this.setSize(g.hitBoxSize, g.hitBoxSize);
        this.axes.setAngles(t.rotationYaw + 90.0f, g.spinWhenThrown ? t.rotationPitch : 0.0f, 0.0f);
        final float n = g.spinWhenThrown ? (t.rotationYaw + 90.0f) : 0.0f;
        this.prevRotationYaw = n;
        this.rotationYaw = n;
        final float rotationPitch = t.rotationPitch;
        this.prevRotationPitch = rotationPitch;
        this.rotationPitch = rotationPitch;
        final float speed = 0.5f * this.type.throwSpeed;
        this.motionX = this.axes.getXAxis().x * speed;
        this.motionY = this.axes.getXAxis().y * speed;
        this.motionZ = this.axes.getXAxis().z * speed;
        if (this.type.spinWhenThrown) {
            this.angularVelocity = new Vector3f(0.0f, 0.0f, 10.0f);
        }
        if (this.type.throwSound != null) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.throwSound, true);
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.type == null) {
            FlansMod.log("EntityGrenade.onUpdate() Error: GrenadeType is null (" + this + ")");
            this.setDead();
            return;
        }
        if (this.motionTime > 0) {
            --this.motionTime;
        }
        if (this.type.despawnTime > 0 && this.ticksExisted > this.type.despawnTime) {
            this.detonated = true;
            this.setDead();
            return;
        }
        if (this.worldObj.isRemote && this.type.trailParticles) {
            final double dX = (this.posX - this.prevPosX) / 10.0;
            final double dY = (this.posY - this.prevPosY) / 10.0;
            final double dZ = (this.posZ - this.prevPosZ) / 10.0;
            for (int i = 0; i < 10; ++i) {
                final EntityFX particle = FlansModClient.getParticle(this.type.trailParticleType, this.worldObj, this.prevPosX + dX * i, this.prevPosY + dY * i, this.prevPosZ + dZ * i);
                if (particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics) {
                    particle.renderDistanceWeight = 100.0;
                }
            }
        }
        if (this.smoking) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 50, this.type.smokeParticleType), this.posX, this.posY, this.posZ, 30.0f, this.dimension);
            final List list = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand((double)this.type.smokeRadius, (double)this.type.smokeRadius, (double)this.type.smokeRadius));
            for (final Object obj : list) {
                final EntityLivingBase entity = (EntityLivingBase)obj;
                if (entity.getDistanceToEntity((Entity)this) < this.type.smokeRadius) {
                    boolean smokeThem = true;
                    for (int j = 0; j < 5; ++j) {
                        final ItemStack stack = entity.getEquipmentInSlot(j);
                        if (stack != null && stack.getItem() instanceof ItemTeamArmour && ((ItemTeamArmour)stack.getItem()).type.smokeProtection) {
                            smokeThem = false;
                        }
                    }
                    if (!smokeThem) {
                        continue;
                    }
                    for (final PotionEffect effect : this.type.smokeEffects) {
                        entity.addPotionEffect(new PotionEffect(effect));
                    }
                }
            }
            --this.smokeTime;
            if (this.smokeTime == 0) {
                this.setDead();
            }
        }
        if (!this.worldObj.isRemote) {
            if (this.ticksExisted > this.type.fuse && this.type.fuse > 0) {
                this.detonate();
            }
            if (this.type.livingProximityTrigger > 0.0f || this.type.driveableProximityTrigger > 0.0f) {
                final float checkRadius = Math.max(this.type.livingProximityTrigger, this.type.driveableProximityTrigger);
                final List list2 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand((double)checkRadius, (double)checkRadius, (double)checkRadius));
                for (final Object obj2 : list2) {
                    if (obj2 == this.thrower && this.ticksExisted < 10) {
                        continue;
                    }
                    if (obj2 instanceof EntityLivingBase && this.getDistanceToEntity((Entity)obj2) < this.type.livingProximityTrigger) {
                        if (TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj2 instanceof EntityPlayerMP && this.thrower instanceof EntityPlayer && !TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj2, (DamageSource)new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.thrower, this.type, false, false))) {
                            continue;
                        }
                        if (this.type.damageToTriggerer > 0.0f) {
                            ((EntityLivingBase)obj2).attackEntityFrom(this.getGrenadeDamage(), this.type.damageToTriggerer);
                        }
                        this.detonate();
                        break;
                    }
                    else {
                        if (obj2 instanceof EntityDriveable && this.getDistanceToEntity((Entity)obj2) < this.type.driveableProximityTrigger) {
                            if (this.type.damageToTriggerer > 0.0f) {
                                ((EntityDriveable)obj2).attackEntityFrom(this.getGrenadeDamage(), this.type.damageToTriggerer);
                            }
                            this.detonate();
                            break;
                        }
                        continue;
                    }
                }
            }
        }
        if (this.stuck && this.worldObj.isAirBlock(this.stuckToX, this.stuckToY, this.stuckToZ)) {
            this.stuck = false;
        }
        if (!this.stuck && !this.type.stickToThrower) {
            this.prevRotationYaw = this.axes.getYaw();
            this.prevRotationPitch = this.axes.getPitch();
            this.prevRotationRoll = this.axes.getRoll();
            if (this.angularVelocity.lengthSquared() > 1.0E-8f) {
                this.axes.rotateLocal(this.angularVelocity.length(), this.angularVelocity.normalise(null));
            }
            final Vector3f posVec = new Vector3f(this.posX, this.posY, this.posZ);
            Vector3f motVec = new Vector3f(this.motionX, this.motionY, this.motionZ);
            final Vector3f nextPosVec = Vector3f.add(posVec, motVec, null);
            final MovingObjectPosition hit = this.worldObj.rayTraceBlocks(posVec.toVec3(), nextPosVec.toVec3());
            if (hit != null && hit.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK) {
                final Block block = this.worldObj.getBlock(hit.blockX, hit.blockY, hit.blockZ);
                final Material mat = block.getMaterial();
                if (this.type.explodeOnImpact) {
                    this.detonate();
                }
                else if (this.type.breaksGlass && mat == Material.glass && TeamsManager.canBreakGlass) {
                    this.worldObj.setBlockToAir(hit.blockX, hit.blockY, hit.blockZ);
                    FlansMod.proxy.playBlockBreakSound(hit.blockX, hit.blockY, hit.blockZ, block, this.dimension);
                }
                else if (!this.type.penetratesBlocks) {
                    final Vector3f hitVec = new Vector3f(hit.hitVec);
                    final Vector3f preHitMotVec = Vector3f.sub(hitVec, posVec, null);
                    final Vector3f postHitMotVec = Vector3f.sub(motVec, preHitMotVec, null);
                    final int sideHit = hit.sideHit;
                    switch (sideHit) {
                        case 0:
                        case 1: {
                            postHitMotVec.setY(-postHitMotVec.getY());
                            break;
                        }
                        case 4:
                        case 5: {
                            postHitMotVec.setX(-postHitMotVec.getX());
                            break;
                        }
                        case 2:
                        case 3: {
                            postHitMotVec.setZ(-postHitMotVec.getZ());
                            break;
                        }
                    }
                    final float lambda = (Math.abs(motVec.lengthSquared()) < 1.0E-8f) ? 1.0f : (postHitMotVec.length() / motVec.length());
                    postHitMotVec.scale(this.type.bounciness / 2.0f);
                    this.posX += preHitMotVec.x + postHitMotVec.x;
                    this.posY += preHitMotVec.y + postHitMotVec.y;
                    this.posZ += preHitMotVec.z + postHitMotVec.z;
                    this.motionX = postHitMotVec.x / lambda;
                    this.motionY = postHitMotVec.y / lambda;
                    this.motionZ = postHitMotVec.z / lambda;
                    motVec = new Vector3f(this.motionX, this.motionY, this.motionZ);
                    final float randomSpinner = 90.0f;
                    Vector3f.add(this.angularVelocity, new Vector3f(this.rand.nextGaussian() * randomSpinner, this.rand.nextGaussian() * randomSpinner, this.rand.nextGaussian() * randomSpinner), this.angularVelocity);
                    this.angularVelocity.scale(motVec.lengthSquared());
                    if (motVec.lengthSquared() > 0.01) {
                        this.playSound(this.type.bounceSound, 1.0f, 1.2f / (this.rand.nextFloat() * 0.2f + 0.9f));
                    }
                    if (this.type.sticky) {
                        this.posX = hitVec.x;
                        this.posY = hitVec.y;
                        this.posZ = hitVec.z;
                        final double motionX = 0.0;
                        this.motionZ = motionX;
                        this.motionY = motionX;
                        this.motionX = motionX;
                        this.angularVelocity.set(0.0f, 0.0f, 0.0f);
                        final float yaw = this.axes.getYaw();
                        switch (hit.sideHit) {
                            case 0: {
                                this.axes.setAngles(yaw, 180.0f, 0.0f);
                                break;
                            }
                            case 1: {
                                this.axes.setAngles(yaw, 0.0f, 0.0f);
                                break;
                            }
                            case 2: {
                                this.axes.setAngles(270.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 3: {
                                this.axes.setAngles(90.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 4: {
                                this.axes.setAngles(180.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                            case 5: {
                                this.axes.setAngles(0.0f, 90.0f, 0.0f);
                                this.axes.rotateLocalYaw(yaw);
                                break;
                            }
                        }
                        this.stuck = true;
                        this.stuckToX = hit.blockX;
                        this.stuckToY = hit.blockY;
                        this.stuckToZ = hit.blockZ;
                    }
                }
            }
            else {
                this.posX += this.motionX;
                this.posY += this.motionY;
                this.posZ += this.motionZ;
            }
            this.setPosition(this.posX, this.posY, this.posZ);
        }
        if (this.type.stickToThrower) {
            if (this.thrower == null || this.thrower.isDead) {
                this.setDead();
            }
            else {
                this.setPosition(this.thrower.posX, this.thrower.posY, this.thrower.posZ);
            }
        }
        if (this.type.stickToEntity) {
            final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null && !this.stuck) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && obj2 != this.thrower && !(obj2 instanceof EntityGrenade)) {
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.setPosition(this.stickedEntity.posX, this.stickedEntity.posY, this.stickedEntity.posZ);
                if (this.stickedEntity.isDead) {
                    this.setDead();
                }
            }
        }
        if (this.type.stickToDriveable) {
            final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null && !this.stuck) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && obj2 != this.thrower && !(obj2 instanceof EntityGrenade) && obj2 instanceof EntityDriveable) {
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.setPosition(this.stickedEntity.posX, this.stickedEntity.posY, this.stickedEntity.posZ);
                if (this.stickedEntity.isDead) {
                    this.setDead();
                }
            }
        }
        if (this.type.stickToEntityAfter) {
            final List list = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox);
            final float yaw2 = this.axes.getYaw();
            if (this.stickedEntity == null) {
                for (final Object obj2 : list) {
                    if (obj2 instanceof Entity && !(obj2 instanceof EntityGrenade) && obj2 != this.thrower) {
                        if (this.type.allowStickSound) {
                            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.stickSoundRange, this.dimension, this.type.stickSound, true);
                        }
                        this.stickedEntity = (Entity)obj2;
                        break;
                    }
                }
            }
            if (this.stickedEntity != null) {
                this.setPosition(this.stickedEntity.posX, this.stickedEntity.posY, this.stickedEntity.posZ);
                if (this.stickedEntity.isDead) {
                    this.setDead();
                }
            }
        }
        if ((this.type.damageVsLiving > 0.0f || this.type.damageVsPlayer > 0.0f) && !this.stuck) {
            final Vector3f motVec2 = new Vector3f(this.motionX, this.motionY, this.motionZ);
            final List list2 = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox);
            for (final Object obj2 : list2) {
                if (obj2 != this.thrower || this.ticksExisted >= 10) {
                    if (motVec2.lengthSquared() < 0.01) {
                        continue;
                    }
                    if (obj2 instanceof EntityPlayer) {
                        ((EntityPlayer)obj2).attackEntityFrom(this.getGrenadeDamage(), this.type.damageVsPlayer * motVec2.lengthSquared() * 3.0f);
                    }
                    else {
                        if (!(obj2 instanceof EntityLivingBase)) {
                            continue;
                        }
                        ((EntityLivingBase)obj2).attackEntityFrom(this.getGrenadeDamage(), this.type.damageVsLiving * motVec2.lengthSquared() * 3.0f);
                    }
                }
            }
        }
        this.motionY -= 0.024525 * this.type.fallSpeed;
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    public boolean attackEntityFrom(final DamageSource source, final float f) {
        if (this.type.detonateWhenShot) {
            this.detonate();
        }
        return this.type.detonateWhenShot;
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
        if (!this.worldObj.isRemote && this.type.explosionRadius > 0.1f && !this.type.pumpkinRaid) {
            if (this.thrower instanceof EntityPlayer) {
                new FlansModExplosion(this.worldObj, this, (EntityPlayer)this.thrower, this.type, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks, this.type.explosionDamageVsLiving, this.type.explosionDamageVsPlayer, this.type.explosionDamageVsPlane, this.type.explosionDamageVsVehicle, this.type.smokeParticleCount, this.type.debrisParticleCount);
            }
            else {
                this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, this.type.explosionRadius, TeamsManager.explosions && this.type.explosionBreaksBlocks);
            }
        }
        if (!this.worldObj.isRemote && this.type.explosionRadius > 0.1f && this.type.pumpkinRaid) {
            this.worldObj.createExplosion((Entity)this, this.posX, this.posY, this.posZ, this.type.explosionRadius, true);
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
        if (this.type.smokeTime > 0) {
            this.smoking = true;
            this.smokeTime = this.type.smokeTime;
        }
        else if (!this.worldObj.isRemote) {
            this.setDead();
        }
        if (this.type.smokerino) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 5, "smokeShell"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
        }
        if (this.type.flashBang && !this.worldObj.isRemote) {
            final List list = this.worldObj.getEntitiesWithinAABB((Class)EntityLivingBase.class, this.boundingBox.expand((double)this.type.smokeRadius, (double)this.type.smokeRadius, (double)this.type.smokeRadius));
            for (final Object obj : list) {
                final EntityLivingBase entity = (EntityLivingBase)obj;
                if (entity.getDistanceToEntity((Entity)this) < this.type.flashRange && this.type.flashDamageEnable) {
                    if (this.type.flashEffects) {
                        entity.addPotionEffect(new PotionEffect(this.type.flashEffectsID, this.type.flashEffectsDuration, this.type.flashEffectsLevel));
                    }
                    entity.attackEntityFrom(this.getGrenadeDamage(), this.type.flashDamage);
                }
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 50, this.type.smokeParticleType), this.posX, this.posY, this.posZ, 30.0f, this.dimension);
            if (this.type.flashSoundEnable) {
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.type.flashSoundRange, this.dimension, this.type.flashSound, true);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlashBang(this.type.flashTime), this.posX, this.posY, this.posZ, (float)this.type.flashRange, this.dimension);
            this.setDead();
        }
    }
    
    public void setPositionAndRotation2(final double x, final double y, final double z, final float yaw, final float pitch, final int i) {
    }
    
    private DamageSource getGrenadeDamage() {
        if (this.thrower instanceof EntityPlayer) {
            return new EntityDamageSourceFlans(this.type.shortName, this, (EntityPlayer)this.thrower, this.type, false, false).setProjectile();
        }
        return new EntityDamageSourceIndirect(this.type.shortName, (Entity)this, (Entity)this.thrower).setProjectile();
    }
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
        this.type = GrenadeType.getGrenade(tags.getString("Type"));
        if (this.type == null) {
            FlansMod.log("EntityGrenade.readEntityFromNBT() Error: GrenadeType is null (" + this + ")");
            this.setDead();
            return;
        }
        this.thrower = (EntityLivingBase)this.worldObj.getPlayerEntityByName(tags.getString("Thrower"));
        this.rotationYaw = tags.getFloat("RotationYaw");
        this.rotationPitch = tags.getFloat("RotationPitch");
        this.axes.setAngles(this.rotationYaw, this.rotationPitch, 0.0f);
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
        if (this.type == null) {
            FlansMod.log("EntityGrenade.writeEntityToNBT() Error: GrenadeType is null (" + this + ")");
            this.setDead();
            return;
        }
        tags.setString("Type", this.type.shortName);
        if (this.thrower != null) {
            tags.setString("Thrower", this.thrower.getCommandSenderName());
        }
        tags.setFloat("RotationYaw", this.axes.getYaw());
        tags.setFloat("RotationPitch", this.axes.getPitch());
    }
    
    public void writeSpawnData(final ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.type.shortName);
        data.writeInt((this.thrower == null) ? 0 : this.thrower.getEntityId());
        data.writeFloat(this.axes.getYaw());
        data.writeFloat(this.axes.getPitch());
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.type = GrenadeType.getGrenade(ByteBufUtils.readUTF8String(data));
        this.thrower = (EntityLivingBase)this.worldObj.getEntityByID(data.readInt());
        this.setRotation(data.readFloat(), data.readFloat());
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.axes.setAngles(this.rotationYaw, this.rotationPitch, 0.0f);
        if (this.type.spinWhenThrown) {
            this.angularVelocity = new Vector3f(0.0f, 0.0f, 10.0f);
        }
    }
    
    public boolean isBurning() {
        return false;
    }
    
    public boolean canBeCollidedWith() {
        return !this.isDead && this.type.isDeployableBag;
    }
    
    public boolean interactFirst(final EntityPlayer player) {
        if (this.type.isDeployableBag && !this.worldObj.isRemote) {
            boolean used = false;
            if (this.type.healAmount > 0.0f && player.getHealth() < player.getMaxHealth()) {
                player.heal(this.type.healAmount);
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(player.dimension, player.posX, player.posY, player.posZ, 50.0));
                used = true;
            }
            for (final PotionEffect effect : this.type.potionEffects) {
                player.addPotionEffect(new PotionEffect(effect));
                used = true;
            }
            if (this.type.numClips > 0 && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                final GunType gun = ((ItemGun)player.getCurrentEquippedItem().getItem()).type;
                if (gun.ammo.size() > 0) {
                    final ShootableType bulletToGive = gun.ammo.get(0);
                    final int numToGive = Math.min(bulletToGive.maxStackSize, this.type.numClips * gun.getNumAmmoItemsInGun(player.getCurrentEquippedItem()));
                    if (player.inventory.addItemStackToInventory(new ItemStack(bulletToGive.item, numToGive))) {
                        used = true;
                    }
                }
            }
            if (used) {
                --this.numUsesRemaining;
                if (this.numUsesRemaining <= 0) {
                    this.setDead();
                }
            }
        }
        return true;
    }
}
