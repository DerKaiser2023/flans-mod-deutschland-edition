// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.client.FlansModClient;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketFlashBang extends PacketBase
{
    public int time;
    
    public PacketFlashBang() {
        this.time = 10;
    }
    
    public PacketFlashBang(final int flashTime) {
        this.time = 10;
        this.time = flashTime;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.time);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.time = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received flashBang packet on server. Disregarding.");
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (FlansMod.proxy.isThePlayer(clientPlayer)) {
            FlansModClient.isInFlash = true;
        }
        FlansModClient.flashTime = this.time;
    }
}
