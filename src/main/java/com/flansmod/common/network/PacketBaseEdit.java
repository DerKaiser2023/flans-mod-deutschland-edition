// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiBaseEditor;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.teams.ITeamBase;
import com.flansmod.common.FlansMod;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketBaseEdit extends PacketBase
{
    public int baseID;
    public String baseName;
    public String[] maps;
    public int mapID;
    public int teamID;
    public boolean destroy;
    
    public PacketBaseEdit() {
    }
    
    public PacketBaseEdit(final int baseID, final String baseName, final String[] maps, final int mapID, final int teamID) {
        this(baseID, baseName, maps, mapID, teamID, false);
    }
    
    public PacketBaseEdit(final int baseID, final String baseName, final String[] maps, final int mapID, final int teamID, final boolean destroy) {
        this.baseID = baseID;
        this.baseName = baseName;
        this.maps = maps;
        this.mapID = mapID;
        this.teamID = teamID;
        this.destroy = destroy;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.baseID);
        this.writeUTF(data, this.baseName);
        data.writeInt(this.maps.length);
        for (final String map : this.maps) {
            this.writeUTF(data, map);
        }
        data.writeInt(this.mapID);
        data.writeByte((int)(byte)this.teamID);
        data.writeBoolean(this.destroy);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.baseID = data.readInt();
        this.baseName = this.readUTF(data);
        final int mapsLength = data.readInt();
        this.maps = new String[mapsLength];
        for (int i = 0; i < mapsLength; ++i) {
            this.maps[i] = this.readUTF(data);
        }
        this.mapID = data.readInt();
        this.teamID = data.readByte();
        this.destroy = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (!MinecraftServer.getServer().getConfigurationManager().canSendCommands(playerEntity.getGameProfile())) {
            return;
        }
        final ITeamBase base = TeamsManager.getInstance().getBase(this.baseID);
        if (this.destroy) {
            base.destroy();
            return;
        }
        base.setDefaultOwnerID(this.teamID);
        base.setOwnerID(this.teamID);
        if (this.mapID != -1) {
            base.setMapFirstTime(TeamsManager.getInstance().getMapFromFullName(this.maps[this.mapID]));
        }
        base.setName(this.baseName);
        FlansMod.log(playerEntity.getCommandSenderName() + " modified attributes of base " + this.baseID);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)new GuiBaseEditor(this));
    }
}
