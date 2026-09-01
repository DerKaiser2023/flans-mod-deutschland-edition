// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import net.minecraft.entity.player.EntityPlayer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketChecker extends PacketBase
{
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.ridingEntity != null) {
            final Entity last = playerEntity.ridingEntity;
            playerEntity.mountEntity((Entity)null);
            last.riddenByEntity = null;
            ServerTickEvent.remount.add(new Object[] { playerEntity, last });
            last.motionX = 0.0;
            last.motionY = 0.0;
            last.motionZ = 0.0;
            if (last instanceof EntitySeat) {
                final EntitySeat seat = (EntitySeat)last;
                final EntityDriveable plane = seat.driveable;
                plane.motionX = 0.0;
                plane.motionY = 0.1;
                plane.motionZ = 0.0;
            }
        }
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
    }
}
