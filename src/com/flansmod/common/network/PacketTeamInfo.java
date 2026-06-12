// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.teams.PlayerClass;
import java.util.Iterator;
import com.flansmod.common.PlayerData;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import com.flansmod.common.teams.Team;
import java.util.Collection;
import java.util.ArrayList;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import com.flansmod.common.teams.TeamsManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.client.FlansModClient;

public class PacketTeamInfo extends PacketBase
{
    public static String mapShortName;
    public static String map;
    public static String gametype;
    public static boolean showZombieScore;
    public static int numTeams;
    public static TeamData[] teamData;
    public static boolean sortedByTeam;
    public static int timeLeft;
    public static int scoreLimit;
    public static int numLines;
    
    public static PlayerScoreData getPlayerScoreData(final String username) {
        final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
        if (PacketTeamInfo.teamData == null) {
            return null;
        }
        final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
        for (final TeamData team : PacketTeamInfo.teamData) {
            if (team == null || team.playerData == null) {
                return null;
            }
            for (final PlayerScoreData player : team.playerData) {
                if (player != null && player.username != null && player.username.equals(username)) {
                    return player;
                }
            }
        }
        return null;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(TeamsManager.canBreakGlass);
        data.writeBoolean(TeamsManager.vehiclesNeedFuel);
        data.writeBoolean(TeamsManager.driveablesBreakBlocks);
        if (TeamsManager.getInstance().currentRound == null) {
            this.writeUTF(data, "No Gametype");
            data.writeInt(0);
        }
        else {
            this.writeUTF(data, TeamsManager.getInstance().currentRound.gametype.name);
            data.writeBoolean(TeamsManager.getInstance().currentRound.gametype.showZombieScore());
            this.writeUTF(data, TeamsManager.getInstance().currentRound.map.name);
            this.writeUTF(data, TeamsManager.getInstance().currentRound.map.shortName);
            data.writeInt(TeamsManager.getInstance().roundTimeLeft);
            data.writeInt(TeamsManager.getInstance().currentRound.scoreLimit);
            if (TeamsManager.getInstance().currentRound.gametype.sortScoreboardByTeam()) {
                data.writeBoolean(true);
                if (TeamsManager.getInstance().currentRound.teams == null) {
                    data.writeInt(0);
                }
                else {
                    data.writeInt(TeamsManager.getInstance().currentRound.teams.length);
                    for (int i = 0; i < TeamsManager.getInstance().currentRound.teams.length; ++i) {
                        final Team team = TeamsManager.getInstance().currentRound.teams[i];
                        if (team == null) {
                            this.writeUTF(data, "none");
                        }
                        else {
                            this.writeUTF(data, team.shortName);
                            data.writeInt(team.score);
                            data.writeBoolean(TeamsManager.getInstance().currentRound.gametype.teamHasWon(team));
                            team.sortPlayers();
                            data.writeInt(team.members.size());
                            for (int j = 0; j < team.members.size(); ++j) {
                                final String username = team.members.get(j);
                                final PlayerData playerData = PlayerHandler.getPlayerData(username, Side.SERVER);
                                this.writeUTF(data, username);
                                if (playerData == null) {
                                    data.writeInt(0);
                                    data.writeInt(0);
                                    data.writeInt(0);
                                    this.writeUTF(data, "");
                                }
                                else {
                                    data.writeInt(playerData.score);
                                    data.writeInt(playerData.shekels);
                                    data.writeInt(playerData.zombieScore);
                                    data.writeInt(playerData.kills);
                                    data.writeInt(playerData.deaths);
                                    this.writeUTF(data, playerData.playerClass.shortName);
                                }
                            }
                        }
                    }
                }
            }
            else {
                data.writeBoolean(false);
                final ArrayList<String> playerNames = new ArrayList<String>();
                for (int k = 0; k < TeamsManager.getInstance().currentRound.teams.length; ++k) {
                    final Team team2 = TeamsManager.getInstance().currentRound.teams[k];
                    if (team2 != null) {
                        if (team2.members != null) {
                            playerNames.addAll(team2.members);
                        }
                    }
                }
                Collections.sort(playerNames, new Team.ComparatorScore());
                data.writeInt(playerNames.size());
                for (final String username2 : playerNames) {
                    final PlayerData playerData2 = PlayerHandler.getPlayerData(username2, Side.SERVER);
                    this.writeUTF(data, username2);
                    if (playerData2 == null) {
                        data.writeInt(0);
                        data.writeInt(0);
                        data.writeInt(0);
                        this.writeUTF(data, "");
                    }
                    else {
                        data.writeInt(playerData2.score);
                        data.writeInt(playerData2.shekels);
                        data.writeInt(playerData2.kills);
                        data.writeInt(playerData2.deaths);
                        this.writeUTF(data, playerData2.playerClass.shortName);
                    }
                }
            }
        }
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        TeamsManager.canBreakGlass = data.readBoolean();
        TeamsManager.vehiclesNeedFuel = data.readBoolean();
        TeamsManager.driveablesBreakBlocks = data.readBoolean();
        PacketTeamInfo.gametype = this.readUTF(data);
        if (PacketTeamInfo.gametype.equals("No Gametype")) {
            PacketTeamInfo.numTeams = 0;
            PacketTeamInfo.teamData = new TeamData[0];
        }
        else {
            PacketTeamInfo.showZombieScore = data.readBoolean();
            PacketTeamInfo.map = this.readUTF(data);
            PacketTeamInfo.mapShortName = this.readUTF(data);
            PacketTeamInfo.timeLeft = data.readInt();
            PacketTeamInfo.scoreLimit = data.readInt();
            PacketTeamInfo.sortedByTeam = data.readBoolean();
            if (PacketTeamInfo.sortedByTeam) {
                PacketTeamInfo.numLines = (PacketTeamInfo.numTeams = data.readInt());
                if (PacketTeamInfo.numTeams == 0) {
                    return;
                }
                PacketTeamInfo.teamData = new TeamData[PacketTeamInfo.numTeams];
                for (int i = 0; i < PacketTeamInfo.numTeams; ++i) {
                    PacketTeamInfo.teamData[i] = new TeamData();
                    final String teamName = this.readUTF(data);
                    if (!teamName.equals("none")) {
                        PacketTeamInfo.teamData[i].team = Team.getTeam(teamName);
                        PacketTeamInfo.teamData[i].score = data.readInt();
                        PacketTeamInfo.teamData[i].winner = data.readBoolean();
                        PacketTeamInfo.teamData[i].numPlayers = data.readInt();
                        PacketTeamInfo.teamData[i].playerData = new PlayerScoreData[PacketTeamInfo.teamData[i].numPlayers];
                        if (PacketTeamInfo.teamData[i].numPlayers > PacketTeamInfo.numLines) {
                            PacketTeamInfo.numLines = PacketTeamInfo.teamData[i].numPlayers;
                        }
                        for (int j = 0; j < PacketTeamInfo.teamData[i].numPlayers; ++j) {
                            PacketTeamInfo.teamData[i].playerData[j] = new PlayerScoreData();
                            PacketTeamInfo.teamData[i].playerData[j].team = PacketTeamInfo.teamData[i];
                            PacketTeamInfo.teamData[i].playerData[j].username = this.readUTF(data);
                            PacketTeamInfo.teamData[i].playerData[j].score = data.readInt();
                            PacketTeamInfo.teamData[i].playerData[j].shekels = data.readInt();
                            PacketTeamInfo.teamData[i].playerData[j].zombieScore = data.readInt();
                            PacketTeamInfo.teamData[i].playerData[j].kills = data.readInt();
                            PacketTeamInfo.teamData[i].playerData[j].deaths = data.readInt();
                            PacketTeamInfo.teamData[i].playerData[j].playerClass = PlayerClass.getClass(this.readUTF(data));
                        }
                    }
                }
            }
            else {
                PacketTeamInfo.numLines = 0;
                PacketTeamInfo.teamData = new TeamData[] { new TeamData() };
                PacketTeamInfo.teamData[0].team = null;
                PacketTeamInfo.teamData[0].score = 0;
                PacketTeamInfo.teamData[0].numPlayers = data.readInt();
                PacketTeamInfo.teamData[0].playerData = new PlayerScoreData[PacketTeamInfo.teamData[0].numPlayers];
                PacketTeamInfo.numLines += PacketTeamInfo.teamData[0].numPlayers;
                for (int k = 0; k < PacketTeamInfo.teamData[0].numPlayers; ++k) {
                    PacketTeamInfo.teamData[0].playerData[k] = new PlayerScoreData();
                    PacketTeamInfo.teamData[0].playerData[k].team = PacketTeamInfo.teamData[0];
                    PacketTeamInfo.teamData[0].playerData[k].username = this.readUTF(data);
                    PacketTeamInfo.teamData[0].playerData[k].score = data.readInt();
                    PacketTeamInfo.teamData[0].playerData[k].kills = data.readInt();
                    PacketTeamInfo.teamData[0].playerData[k].deaths = data.readInt();
                    PacketTeamInfo.teamData[0].playerData[k].playerClass = PlayerClass.getClass(this.readUTF(data));
                }
            }
        }
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansModClient.teamInfo = this;
    }
    
    public Team getTeam(final int spawnerTeamID) {
        switch (spawnerTeamID) {
            case 0: {
                return null;
            }
            case 1: {
                return Team.spectators;
            }
            default: {
                return (PacketTeamInfo.teamData.length > spawnerTeamID - 2) ? PacketTeamInfo.teamData[spawnerTeamID - 2].team : null;
            }
        }
    }
    
    public boolean roundOver() {
        if (PacketTeamInfo.timeLeft == 0) {
            return true;
        }
        for (final TeamData aTeamData : PacketTeamInfo.teamData) {
            if (aTeamData.score == PacketTeamInfo.scoreLimit) {
                return true;
            }
        }
        return false;
    }
    
    public Team getWinner() {
        for (final TeamData aTeamData : PacketTeamInfo.teamData) {
            if (aTeamData.winner) {
                return aTeamData.team;
            }
        }
        return null;
    }
    
    public static class TeamData
    {
        public Team team;
        public int score;
        public int numPlayers;
        public PlayerScoreData[] playerData;
        public boolean winner;
    }
    
    public static class PlayerScoreData
    {
        public String username;
        public int score;
        public int kills;
        public int deaths;
        public int shekels;
        public float blood;
        public int totalScore;
        public TeamData team;
        public PlayerClass playerClass;
        public int zombieScore;
    }
}
