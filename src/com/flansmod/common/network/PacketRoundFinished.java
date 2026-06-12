// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.FlansModClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketRoundFinished extends PacketBase
{
    public int showScoresFor;
    
    public PacketRoundFinished() {
    }
    
    public PacketRoundFinished(final int i) {
        this.showScoresFor = i;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.showScoresFor);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.showScoresFor = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansModClient.teamsScoreGUILock = this.showScoresFor;
    }
}
