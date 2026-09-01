// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.Minecraft;
import com.flansmod.client.gui.GuiVoting;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Iterator;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.teams.TeamsRound;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PacketVoting extends PacketBase
{
    @SideOnly(Side.CLIENT)
    public ClientTeamsRound[] clientOptions;
    public TeamsRound[] options;
    public int[] numVotes;
    public int timeLeft;
    
    public PacketVoting() {
    }
    
    public PacketVoting(final TeamsManager tm) {
        this.options = tm.voteOptions;
        this.numVotes = new int[this.options.length];
        for (final PlayerData data : PlayerHandler.serverSideData.values()) {
            if (data.vote > 0) {
                final int[] numVotes = this.numVotes;
                final int n = data.vote - 1;
                ++numVotes[n];
            }
        }
        this.timeLeft = tm.interRoundTimeLeft;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeByte(this.options.length);
        for (int i = 0; i < this.options.length; ++i) {
            this.writeUTF(data, this.options[i].gametype.shortName);
            this.writeUTF(data, this.options[i].map.name);
            this.writeUTF(data, this.options[i].teams[0].textColour + this.options[i].teams[0].name);
            this.writeUTF(data, this.options[i].teams[1].textColour + this.options[i].teams[1].name);
            data.writeByte(this.numVotes[i]);
        }
        data.writeInt(this.timeLeft);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        final int numOptions = data.readByte();
        this.clientOptions = new ClientTeamsRound[numOptions];
        this.numVotes = new int[numOptions];
        for (int i = 0; i < numOptions; ++i) {
            this.clientOptions[i] = new ClientTeamsRound(this.readUTF(data), this.readUTF(data), this.readUTF(data), this.readUTF(data));
            this.numVotes[i] = data.readByte();
        }
        this.timeLeft = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received vote info packet on server. Rejecting.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (!(Minecraft.func_71410_x().field_71462_r instanceof GuiVoting)) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiVoting(this));
        }
        else {
            GuiVoting.packet = this;
        }
    }
    
    public class ClientTeamsRound
    {
        public String mapName;
        public String gametype;
        public String[] teamNames;
        
        public ClientTeamsRound(final String s, final String s1, final String s2, final String s3) {
            this.gametype = s;
            this.mapName = s1;
            (this.teamNames = new String[2])[0] = s2;
            this.teamNames[1] = s3;
        }
    }
}
