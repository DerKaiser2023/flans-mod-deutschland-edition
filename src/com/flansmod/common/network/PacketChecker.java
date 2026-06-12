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
        if (playerEntity.field_70154_o != null) {
            final Entity last = playerEntity.field_70154_o;
            playerEntity.func_70078_a((Entity)null);
            last.field_70153_n = null;
            ServerTickEvent.remount.add(new Object[] { playerEntity, last });
            last.field_70159_w = 0.0;
            last.field_70181_x = 0.0;
            last.field_70179_y = 0.0;
            if (last instanceof EntitySeat) {
                final EntitySeat seat = (EntitySeat)last;
                final EntityDriveable plane = seat.driveable;
                plane.field_70159_w = 0.0;
                plane.field_70181_x = 0.1;
                plane.field_70179_y = 0.0;
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
