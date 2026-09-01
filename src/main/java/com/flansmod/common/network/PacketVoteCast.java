// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketVoteCast extends PacketBase
{
    public int vote;
    
    public PacketVoteCast() {
    }
    
    public PacketVoteCast(final int vote) {
        this.vote = vote;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeByte(this.vote);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.vote = data.readByte();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (this.vote < 0 || this.vote > TeamsManager.getInstance().voteOptions.length) {
            FlansMod.log("Invalid vote " + this.vote + " from " + playerEntity.getCommandSenderName());
            return;
        }
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerEntity, Side.SERVER);
        data.vote = this.vote;
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received vote cast packet on client. Skipping.");
    }
}
