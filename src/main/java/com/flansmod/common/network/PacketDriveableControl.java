// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityDriveable;

public class PacketDriveableControl extends PacketBase
{
    public int entityId;
    public double posX;
    public double posY;
    public double posZ;
    public double prevPosX;
    public double prevPosY;
    public double prevPosZ;
    public float yaw;
    public float pitch;
    public float roll;
    public double motX;
    public double motY;
    public double motZ;
    public float avelx;
    public float avely;
    public float avelz;
    public float throttle;
    public float throttlePeepee;
    public float pitchSignal;
    public float yawSignal;
    public int bouyancy;
    public int morale;
    public int landBrake;
    public int catapult;
    public int thermalTimer;
    public int scopeTimer;
    public float fuelInTank;
    public int sinkLimit;
    public int sinkingTimer;
    public int repairLimit;
    public int repairingTimer;
    public float steeringYaw;
    public float recoilPos;
    public float lastRecoilPos;
    public float propAngle;
    public float prevPropAngle;
    public float rotorAngle;
    public float prevRotorAngle;
    public boolean flare;
    public boolean activeRadar;
    public boolean repairerino;
    public boolean afterBurning;
    public boolean mounted;
    public boolean canFire;
    public boolean reload;
    public int stage;
    public int stageDelay;
    
    public PacketDriveableControl() {
    }
    
    public PacketDriveableControl(final EntityDriveable driveable) {
        this.entityId = driveable.getEntityId();
        this.posX = driveable.posX;
        this.posY = driveable.posY;
        this.posZ = driveable.posZ;
        this.prevPosX = driveable.prevPosX;
        this.prevPosY = driveable.prevPosY;
        this.prevPosZ = driveable.prevPosZ;
        this.yaw = driveable.axes.getYaw();
        this.pitch = driveable.axes.getPitch();
        this.roll = driveable.axes.getRoll();
        this.motX = driveable.motionX;
        this.motY = driveable.motionY;
        this.motZ = driveable.motionZ;
        this.avelx = driveable.angularVelocity.x;
        this.avely = driveable.angularVelocity.y;
        this.avelz = driveable.angularVelocity.z;
        this.throttle = driveable.throttle;
        this.throttlePeepee = driveable.throttlePeepee;
        this.pitchSignal = driveable.pitchSignal;
        this.yawSignal = driveable.yawSignal;
        this.morale = driveable.driveableData.morale;
        this.landBrake = driveable.driveableData.landBrake;
        this.catapult = driveable.driveableData.catapult;
        this.thermalTimer = driveable.driveableData.thermalTimer;
        this.scopeTimer = driveable.driveableData.scopeTimer;
        this.fuelInTank = driveable.driveableData.fuelInTank;
        this.sinkingTimer = driveable.driveableData.sinkingTimer;
        this.sinkLimit = driveable.driveableData.sinkLimit;
        this.repairingTimer = driveable.driveableData.repairingTimer;
        this.repairLimit = driveable.driveableData.repairLimit;
        this.recoilPos = driveable.recoilPos;
        this.lastRecoilPos = driveable.lastRecoilPos;
        this.flare = (driveable.ticksFlareUsing > 0);
        this.activeRadar = driveable.activeRadar;
        this.repairerino = (driveable.ticksRepairing > 0);
        this.afterBurning = driveable.afterBurning;
        this.mounted = driveable.mounted;
        if (driveable instanceof EntityVehicle) {
            final EntityVehicle veh = (EntityVehicle)driveable;
            this.steeringYaw = veh.wheelsYaw;
        }
        else if (driveable instanceof EntityPlane) {
            final EntityPlane plane = (EntityPlane)driveable;
            this.steeringYaw = plane.flapsYaw;
        }
        this.propAngle = driveable.propAngle;
        this.prevPropAngle = driveable.prevPropAngle;
        this.rotorAngle = driveable.rotorAngle;
        this.prevRotorAngle = driveable.prevRotorAngle;
        this.stage = driveable.stage;
        this.stageDelay = driveable.reloadAnimTime;
        this.canFire = driveable.canFireIT1;
        this.reload = driveable.reloadingDrakon;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityId);
        data.writeDouble(this.posX);
        data.writeDouble(this.posY);
        data.writeDouble(this.posZ);
        data.writeDouble(this.prevPosX);
        data.writeDouble(this.prevPosY);
        data.writeDouble(this.prevPosZ);
        data.writeFloat(this.yaw);
        data.writeFloat(this.pitch);
        data.writeFloat(this.roll);
        data.writeDouble(this.motX);
        data.writeDouble(this.motY);
        data.writeDouble(this.motZ);
        data.writeFloat(this.avelx);
        data.writeFloat(this.avely);
        data.writeFloat(this.avelz);
        data.writeFloat(this.throttle);
        data.writeFloat(this.throttlePeepee);
        data.writeFloat(this.pitchSignal);
        data.writeFloat(this.yawSignal);
        data.writeInt(this.morale);
        data.writeInt(this.landBrake);
        data.writeInt(this.catapult);
        data.writeInt(this.thermalTimer);
        data.writeInt(this.scopeTimer);
        data.writeInt(this.bouyancy);
        data.writeFloat(this.fuelInTank);
        data.writeInt(this.sinkingTimer);
        data.writeInt(this.sinkLimit);
        data.writeInt(this.repairingTimer);
        data.writeInt(this.repairLimit);
        data.writeFloat(this.steeringYaw);
        data.writeFloat(this.recoilPos);
        data.writeFloat(this.lastRecoilPos);
        data.writeFloat(this.propAngle);
        data.writeFloat(this.prevPropAngle);
        data.writeFloat(this.rotorAngle);
        data.writeFloat(this.prevRotorAngle);
        data.writeBoolean(this.flare);
        data.writeBoolean(this.activeRadar);
        data.writeBoolean(this.repairerino);
        data.writeBoolean(this.afterBurning);
        data.writeBoolean(this.mounted);
        data.writeInt(this.stage);
        data.writeInt(this.stageDelay);
        data.writeBoolean(this.canFire);
        data.writeBoolean(this.reload);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityId = data.readInt();
        this.posX = data.readDouble();
        this.posY = data.readDouble();
        this.posZ = data.readDouble();
        this.prevPosX = data.readDouble();
        this.prevPosY = data.readDouble();
        this.prevPosZ = data.readDouble();
        this.yaw = data.readFloat();
        this.pitch = data.readFloat();
        this.roll = data.readFloat();
        this.motX = data.readDouble();
        this.motY = data.readDouble();
        this.motZ = data.readDouble();
        this.avelx = data.readFloat();
        this.avely = data.readFloat();
        this.avelz = data.readFloat();
        this.throttle = data.readFloat();
        this.throttlePeepee = data.readFloat();
        this.pitchSignal = data.readFloat();
        this.yawSignal = data.readFloat();
        this.morale = data.readInt();
        this.landBrake = data.readInt();
        this.catapult = data.readInt();
        this.thermalTimer = data.readInt();
        this.scopeTimer = data.readInt();
        this.bouyancy = data.readInt();
        this.fuelInTank = data.readFloat();
        this.sinkingTimer = data.readInt();
        this.sinkLimit = data.readInt();
        this.repairingTimer = data.readInt();
        this.repairLimit = data.readInt();
        this.steeringYaw = data.readFloat();
        this.recoilPos = data.readFloat();
        this.lastRecoilPos = data.readFloat();
        this.propAngle = data.readFloat();
        this.prevPropAngle = data.readFloat();
        this.rotorAngle = data.readFloat();
        this.prevRotorAngle = data.readFloat();
        this.flare = data.readBoolean();
        this.activeRadar = data.readBoolean();
        this.repairerino = data.readBoolean();
        this.afterBurning = data.readBoolean();
        this.mounted = data.readBoolean();
        this.stage = data.readInt();
        this.stageDelay = data.readInt();
        this.canFire = data.readBoolean();
        this.reload = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        EntityDriveable driveable = null;
        for (final Object obj : playerEntity.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable)obj;
                break;
            }
        }
        if (driveable != null) {
            this.updateDriveable(driveable, false);
        }
    }
    
    protected void updateDriveable(final EntityDriveable driveable, final boolean clientSide) {
        driveable.setPositionRotationAndMotion(this.posX, this.posY, this.posZ, this.yaw, this.pitch, this.roll, this.motX, this.motY, this.motZ, this.avelx, this.avely, this.avelz, this.throttle, this.steeringYaw, this.throttlePeepee);
        driveable.pitchSignal = this.pitchSignal;
        driveable.yawSignal = this.yawSignal;
        driveable.prevPosX = this.prevPosX;
        driveable.prevPosY = this.prevPosY;
        driveable.prevPosZ = this.prevPosZ;
        driveable.driveableData.fuelInTank = this.fuelInTank;
        driveable.driveableData.sinkingTimer = this.sinkingTimer;
        driveable.driveableData.repairingTimer = this.repairingTimer;
        driveable.recoilPos = this.recoilPos;
        driveable.lastRecoilPos = this.lastRecoilPos;
        driveable.propAngle = this.propAngle;
        driveable.prevPropAngle = this.propAngle;
        driveable.rotorAngle = this.rotorAngle;
        driveable.prevRotorAngle = this.prevRotorAngle;
        driveable.varFlare = this.flare;
        driveable.activeRadar = this.activeRadar;
        driveable.varRepair = this.repairerino;
        driveable.afterBurning = this.afterBurning;
        driveable.mounted = this.mounted;
        driveable.driveableData.morale = this.morale;
        driveable.driveableData.landBrake = this.landBrake;
        driveable.driveableData.catapult = this.catapult;
        driveable.driveableData.sinkLimit = this.sinkLimit;
        driveable.driveableData.repairLimit = this.repairLimit;
        driveable.driveableData.thermalTimer = this.thermalTimer;
        driveable.driveableData.scopeTimer = this.scopeTimer;
        if (driveable.getDriveableType().IT1) {
            driveable.setIT1(this.canFire, this.reload, this.stage, this.stageDelay);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (clientPlayer == null || clientPlayer.worldObj == null) {
            return;
        }
        EntityDriveable driveable = null;
        for (final Object obj : clientPlayer.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable)obj;
                driveable.driveableData.fuelInTank = this.fuelInTank;
                driveable.driveableData.sinkLimit = this.sinkLimit;
                driveable.driveableData.sinkingTimer = this.sinkingTimer;
                driveable.driveableData.repairLimit = this.repairLimit;
                driveable.driveableData.repairingTimer = this.repairingTimer;
                if (driveable.seats[0] != null && driveable.seats[0].riddenByEntity == clientPlayer) {
                    return;
                }
                break;
            }
        }
        if (driveable != null) {
            this.updateDriveable(driveable, true);
        }
    }
}
