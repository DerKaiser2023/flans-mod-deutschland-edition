// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Iterator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;

public class PacketDriveableDamage extends PacketBase
{
    public int entityId;
    public short[] health;
    public short[] crew;
    public boolean[] onFire;
    
    public PacketDriveableDamage() {
        this.health = new short[EnumDriveablePart.values().length];
        this.crew = new short[EnumDriveablePart.values().length];
        this.onFire = new boolean[EnumDriveablePart.values().length];
    }
    
    public PacketDriveableDamage(final EntityDriveable driveable) {
        this.entityId = driveable.getEntityId();
        this.health = new short[EnumDriveablePart.values().length];
        this.crew = new short[EnumDriveablePart.values().length];
        this.onFire = new boolean[EnumDriveablePart.values().length];
        for (int i = 0; i < EnumDriveablePart.values().length; ++i) {
            final EnumDriveablePart ep = EnumDriveablePart.values()[i];
            final DriveablePart part = driveable.getDriveableData().parts.get(ep);
            this.health[i] = (short)part.health;
            this.crew[i] = (short)part.crew;
            this.onFire[i] = part.onFire;
        }
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityId);
        for (int i = 0; i < EnumDriveablePart.values().length; ++i) {
            data.writeShort((int)this.health[i]);
            data.writeShort((int)this.crew[i]);
            data.writeBoolean(this.onFire[i]);
        }
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityId = data.readInt();
        for (int i = 0; i < EnumDriveablePart.values().length; ++i) {
            this.health[i] = data.readShort();
            this.crew[i] = data.readShort();
            this.onFire[i] = data.readBoolean();
        }
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Driveable damage packet received on server. Skipping.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        EntityDriveable driveable = null;
        for (final Object obj : clientPlayer.worldObj.loadedEntityList) {
            if (obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == this.entityId) {
                driveable = (EntityDriveable)obj;
                break;
            }
        }
        if (driveable != null) {
            for (int i = 0; i < EnumDriveablePart.values().length; ++i) {
                final EnumDriveablePart ep = EnumDriveablePart.values()[i];
                final DriveablePart part = driveable.getDriveableData().parts.get(ep);
                part.health = this.health[i];
                part.crew = this.crew[i];
                part.onFire = this.onFire[i];
            }
        }
    }
}
