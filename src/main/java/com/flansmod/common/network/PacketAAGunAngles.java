// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.guns.EntityAAGun;

public class PacketAAGunAngles extends PacketBase
{
    public int entityID;
    public float gunYaw;
    public float gunPitch;
    
    public PacketAAGunAngles() {
    }
    
    public PacketAAGunAngles(final EntityAAGun entity) {
        this.entityID = entity.getEntityId();
        this.gunYaw = entity.gunYaw;
        this.gunPitch = entity.gunPitch;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityID);
        data.writeFloat(this.gunYaw);
        data.writeFloat(this.gunPitch);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityID = data.readInt();
        this.gunYaw = data.readFloat();
        this.gunPitch = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final Entity entity = clientPlayer.worldObj.getEntityByID(this.entityID);
        if (entity instanceof EntityAAGun) {
            final EntityAAGun aa = (EntityAAGun)entity;
            aa.prevGunYaw = aa.gunYaw;
            aa.prevGunPitch = aa.gunPitch;
            aa.gunYaw = this.gunYaw;
            aa.gunPitch = this.gunPitch;
        }
    }
}
