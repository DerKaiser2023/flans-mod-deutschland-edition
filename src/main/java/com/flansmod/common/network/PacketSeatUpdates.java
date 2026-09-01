// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.Entity;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntitySeat;

public class PacketSeatUpdates extends PacketBase
{
    public int entityId;
    public int seatId;
    public float yaw;
    public float pitch;
    public float playerYaw;
    public float playerPitch;
    public boolean playYawSound;
    public boolean playPitchSound;
    public int yawSoundDelay;
    public int pitchSoundDelay;
    
    public PacketSeatUpdates() {
    }
    
    public PacketSeatUpdates(final EntitySeat seat) {
        this.entityId = seat.driveable.getEntityId();
        this.seatId = seat.seatInfo.id;
        this.yaw = seat.looking.getYaw();
        this.pitch = seat.looking.getPitch();
        this.playerYaw = seat.playerLooking.getYaw();
        this.playerPitch = seat.playerLooking.getPitch();
        this.playYawSound = seat.playYawSound;
        this.playPitchSound = seat.playPitchSound;
        this.yawSoundDelay = seat.yawSoundDelay;
        this.pitchSoundDelay = seat.pitchSoundDelay;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityId);
        data.writeInt(this.seatId);
        data.writeFloat(this.yaw);
        data.writeFloat(this.pitch);
        data.writeFloat(this.playerYaw);
        data.writeFloat(this.playerPitch);
        data.writeBoolean(this.playYawSound);
        data.writeBoolean(this.playPitchSound);
        data.writeInt(this.yawSoundDelay);
        data.writeInt(this.pitchSoundDelay);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityId = data.readInt();
        this.seatId = data.readInt();
        this.yaw = data.readFloat();
        this.pitch = data.readFloat();
        this.playerYaw = data.readFloat();
        this.playerPitch = data.readFloat();
        this.playYawSound = data.readBoolean();
        this.playPitchSound = data.readBoolean();
        this.yawSoundDelay = data.readInt();
        this.pitchSoundDelay = data.readInt();
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
            driveable.seats[this.seatId].prevLooking = driveable.seats[this.seatId].looking.clone();
            driveable.seats[this.seatId].looking.setAngles(this.yaw, this.pitch, 0.0f);
            driveable.seats[this.seatId].prevPlayerLooking = driveable.seats[this.seatId].playerLooking.clone();
            driveable.seats[this.seatId].playerLooking.setAngles(this.playerYaw, this.playerPitch, 0.0f);
            driveable.seats[this.seatId].playYawSound = this.playYawSound;
            driveable.seats[this.seatId].playPitchSound = this.playPitchSound;
            driveable.seats[this.seatId].yawSoundDelay = this.yawSoundDelay;
            driveable.seats[this.seatId].pitchSoundDelay = this.pitchSoundDelay;
            FlansMod.getPacketHandler().sendToAllAround(this, driveable.posX, driveable.posY, driveable.posZ, FlansMod.driveableUpdateRange, driveable.dimension);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        EntityDriveable driveable = null;
        final EntitySeat seat = null;
        for (final Object obj : clientPlayer.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable)obj;
                break;
            }
        }
        if (driveable != null) {
            if (driveable.seats[this.seatId] == null || driveable.seats[this.seatId].riddenByEntity == clientPlayer) {
                return;
            }
            driveable.seats[this.seatId].prevLooking = driveable.seats[this.seatId].looking.clone();
            driveable.seats[this.seatId].looking.setAngles(this.yaw, this.pitch, 0.0f);
            driveable.seats[this.seatId].prevPlayerLooking = driveable.seats[this.seatId].playerLooking.clone();
            driveable.seats[this.seatId].playerLooking.setAngles(this.playerYaw, this.playerPitch, 0.0f);
            driveable.seats[this.seatId].playYawSound = this.playYawSound;
            driveable.seats[this.seatId].playPitchSound = this.playPitchSound;
            driveable.seats[this.seatId].yawSoundDelay = this.yawSoundDelay;
            driveable.seats[this.seatId].pitchSoundDelay = this.pitchSoundDelay;
        }
    }
}
