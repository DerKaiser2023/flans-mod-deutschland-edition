// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.FlansMod;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;

public class EntityWheel extends Entity implements IEntityAdditionalSpawnData
{
    public EntityDriveable vehicle;
    public int ID;
    @SideOnly(Side.CLIENT)
    public boolean foundVehicle;
    private int vehicleID;
    public boolean onDeck;
    private int invulnerableUnmountCount;
    public int timeLimitDriveableNull;
    
    public EntityWheel(final World world) {
        super(world);
        this.onDeck = false;
        this.timeLimitDriveableNull = 0;
        this.setSize(1.0f, 1.0f);
        this.stepHeight = 1.5f;
        this.invulnerableUnmountCount = 0;
    }
    
    public EntityWheel(final World world, final EntityDriveable entity, final int i) {
        this(world);
        this.vehicle = entity;
        this.vehicleID = entity.getEntityId();
        this.ID = i;
        this.initPosition();
    }
    
    public void initPosition() {
        final Vector3f wheelVector = this.vehicle.axes.findLocalVectorGlobally(this.vehicle.getDriveableType().wheelPositions[this.ID].position);
        this.setPosition(this.vehicle.posX + wheelVector.x, this.vehicle.posY + wheelVector.y, this.vehicle.posZ + wheelVector.z);
        this.stepHeight = this.vehicle.getDriveableType().wheelStepHeight;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
    }
    
    protected void fall(final float k) {
    }
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
        this.setDead();
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
    }
    
    public void onUpdate() {
        if (this.ridingEntity != null) {
            this.invulnerableUnmountCount = 80;
        }
        else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }
        if (this.worldObj.isRemote && !this.foundVehicle) {
            if (this.worldObj.getEntityByID(this.vehicleID) instanceof EntityDriveable) {
                this.vehicle = (EntityDriveable)this.worldObj.getEntityByID(this.vehicleID);
            }
            if (this.vehicle == null) {
                return;
            }
            this.foundVehicle = true;
            this.vehicle.wheels[this.ID] = this;
        }
        if (this.vehicle == null) {
            return;
        }
        EntityDriveable entD;
        if (this.worldObj.getEntityByID(this.vehicleID) instanceof EntityDriveable) {
            entD = (EntityDriveable)this.worldObj.getEntityByID(this.vehicleID);
        }
        else {
            entD = null;
        }
        if (entD == null) {
            ++this.timeLimitDriveableNull;
        }
        else {
            this.timeLimitDriveableNull = 0;
        }
        if (this.timeLimitDriveableNull > 1200) {
            this.setDead();
        }
        if (!this.addedToChunk) {
            this.worldObj.spawnEntityInWorld((Entity)this);
        }
    }
    
    public double getSpeedXZ() {
        return Math.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
    }
    
    public double getSpeedXYZ() {
        return Math.cbrt(this.motionX * this.motionX + this.motionZ * this.motionZ + this.motionY * this.motionY);
    }
    
    public void setPositionAndRotation2(final double d, final double d1, final double d2, final float f, final float f1, final int i) {
    }
    
    public AxisAlignedBB getCollisionBox(final Entity entity) {
        if (this.vehicle.seats[0] != null && this.vehicle.getDriveableType().collisionDamageEnable && this.vehicle.seats[0].riddenByEntity != null && this.vehicle.throttle > this.vehicle.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving && !entity.isRiding() && !entity.isDead) {
                entity.attackEntityFrom(DamageSource.cactus, this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes);
                if (this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes > 23.0f && ((EntityLiving)entity).getHealth() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 15.0, entity.dimension, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.posX, entity.posY, entity.posZ, 150.0f, entity.dimension);
                }
            }
            else if (entity instanceof EntityPlayer && !entity.isRiding() && !entity.isDead) {
                entity.attackEntityFrom(DamageSource.cactus, this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes);
                if (this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes > 23.0f && ((EntityPlayer)entity).getHealth() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, 15.0, entity.dimension, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.posX, entity.posY - 4.0, entity.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.posX, entity.posY, entity.posZ, 150.0f, entity.dimension);
                }
            }
        }
        return this.boundingBox;
    }
    
    public void writeSpawnData(final ByteBuf data) {
        data.writeInt(this.vehicleID);
        data.writeInt(this.ID);
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.vehicleID = data.readInt();
        this.ID = data.readInt();
        if (this.vehicle instanceof EntityDriveable) {
            this.vehicle = (EntityDriveable)this.worldObj.getEntityByID(this.vehicleID);
        }
        if (this.vehicle != null) {
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }
}
