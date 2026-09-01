// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketRequestDebug extends PacketBase
{
    private boolean debug;
    
    public PacketRequestDebug() {
    }
    
    public PacketRequestDebug(final boolean debug) {
        this.debug = debug;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeByte((int)(this.debug ? 1 : 0));
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.debug = (data.readByte() != 0);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (MinecraftServer.getServer().getConfigurationManager().canSendCommands(playerEntity.getGameProfile())) {
            FlansMod.packetHandler.sendTo(new PacketRequestDebug(true), playerEntity);
        }
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.DEBUG = this.debug;
    }
}
