// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiTeamSelect;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;

public class PacketTeamSelect extends PacketBase
{
    public boolean selectionPacket;
    public String selection;
    public boolean classChoicesPacket;
    public Team[] teams;
    public PlayerClass[] playerClasses;
    public boolean info;
    
    public PacketTeamSelect() {
        this.selectionPacket = false;
        this.classChoicesPacket = false;
        this.info = false;
    }
    
    public PacketTeamSelect(final Team[] t, final boolean i) {
        this.selectionPacket = false;
        this.classChoicesPacket = false;
        this.info = false;
        this.selectionPacket = false;
        this.classChoicesPacket = false;
        this.teams = t;
        this.info = i;
    }
    
    public PacketTeamSelect(final Team[] t) {
        this(t, false);
    }
    
    public PacketTeamSelect(final PlayerClass[] c) {
        this.selectionPacket = false;
        this.classChoicesPacket = false;
        this.info = false;
        this.selectionPacket = false;
        this.classChoicesPacket = true;
        this.playerClasses = c;
    }
    
    public PacketTeamSelect(final String shortName, final boolean classPacket) {
        this.selectionPacket = false;
        this.classChoicesPacket = false;
        this.info = false;
        this.selectionPacket = true;
        this.classChoicesPacket = classPacket;
        this.selection = shortName;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.selectionPacket);
        data.writeBoolean(this.classChoicesPacket);
        data.writeBoolean(this.info);
        if (this.selectionPacket) {
            this.writeUTF(data, this.selection);
        }
        else if (this.classChoicesPacket) {
            data.writeByte(this.playerClasses.length);
            for (final PlayerClass playerClass : this.playerClasses) {
                this.writeUTF(data, playerClass.shortName);
            }
        }
        else {
            data.writeByte(this.teams.length);
            for (final Team team : this.teams) {
                this.writeUTF(data, (team == null) ? "null" : team.shortName);
            }
        }
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.selectionPacket = data.readBoolean();
        this.classChoicesPacket = data.readBoolean();
        this.info = data.readBoolean();
        if (this.selectionPacket) {
            this.selection = this.readUTF(data);
        }
        else if (this.classChoicesPacket) {
            final byte numClasses = data.readByte();
            this.playerClasses = new PlayerClass[numClasses];
            for (int i = 0; i < numClasses; ++i) {
                this.playerClasses[i] = PlayerClass.getClass(this.readUTF(data));
            }
        }
        else {
            final byte numTeams = data.readByte();
            this.teams = new Team[numTeams];
            for (int i = 0; i < numTeams; ++i) {
                this.teams[i] = Team.getTeam(this.readUTF(data));
            }
        }
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (!this.selectionPacket) {
            FlansMod.log("Class / Team listing packet received on server. Rejecting.");
            return;
        }
        if (this.classChoicesPacket) {
            TeamsManager.getInstance().playerSelectedClass(playerEntity, this.selection);
        }
        else {
            TeamsManager.getInstance().playerSelectedTeam(playerEntity, this.selection);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (this.selectionPacket) {
            FlansMod.log("Class / Team selection packet received on client. Rejecting.");
            return;
        }
        if (this.classChoicesPacket) {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiTeamSelect(this.playerClasses));
        }
        else if (this.info) {
            GuiTeamSelect.teamChoices = this.teams;
        }
        else {
            Minecraft.func_71410_x().func_147108_a((GuiScreen)new GuiTeamSelect(this.teams));
        }
    }
}
