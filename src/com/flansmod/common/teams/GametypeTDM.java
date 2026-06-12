// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import net.minecraft.util.Vec3;
import com.flansmod.common.PlayerData;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayerMP;

public class GametypeTDM extends Gametype
{
    public boolean friendlyFire;
    public boolean autoBalance;
    public int scoreLimit;
    public int newRoundTimer;
    public int time;
    public int autoBalanceInterval;
    
    public GametypeTDM() {
        super("Team Deathmatch", "TDM", 2);
        this.friendlyFire = false;
        this.autoBalance = true;
        this.scoreLimit = 25;
        this.newRoundTimer = 0;
        this.autoBalanceInterval = 1200;
    }
    
    @Override
    public void roundStart() {
    }
    
    @Override
    public void roundEnd() {
    }
    
    @Override
    public void roundCleanup() {
    }
    
    @Override
    public void tick() {
    }
    
    public boolean needAutobalance() {
        return false;
    }
    
    public void autobalance() {
    }
    
    @Override
    public void playerJoined(final EntityPlayerMP player) {
    }
    
    @Override
    public void playerQuit(final EntityPlayerMP player) {
    }
    
    @Override
    public boolean playerAttacked(final EntityPlayerMP player, final DamageSource source) {
        if (Gametype.getPlayerData(player) == null || Gametype.getPlayerData(player).team == null) {
            return false;
        }
        final EntityPlayerMP attacker = Gametype.getPlayerFromDamageSource(source);
        if (attacker != null) {
            if (Gametype.getPlayerData(attacker) == null || Gametype.getPlayerData(attacker).team == null) {
                return false;
            }
            if (Gametype.getPlayerData(player).team == Gametype.getPlayerData(attacker).team) {
                return this.friendlyFire;
            }
        }
        return Gametype.getPlayerData(player).team != Team.spectators;
    }
    
    @Override
    public boolean playerCanAttack(final EntityPlayerMP attacker, final Team attackerTeam, final EntityPlayerMP victim, final Team victimTeam) {
        return attackerTeam != victimTeam || this.friendlyFire;
    }
    
    @Override
    public void playerKilled(final EntityPlayerMP player, final DamageSource source) {
        final EntityPlayerMP attacker = Gametype.getPlayerFromDamageSource(source);
        if (attacker != null) {
            if (attacker == player) {
                final PlayerData playerData = Gametype.getPlayerData(player);
                --playerData.score;
                final PlayerData playerData2 = Gametype.getPlayerData(player);
                --playerData2.shekels;
            }
            else if (Gametype.getPlayerData(attacker).team == Gametype.getPlayerData(player).team) {
                final PlayerData playerData3 = Gametype.getPlayerData(attacker);
                --playerData3.score;
            }
            else {
                Gametype.givePoints(attacker, 1);
                final PlayerData playerData4 = Gametype.getPlayerData(attacker);
                ++playerData4.kills;
                final PlayerData playerData5 = Gametype.getPlayerData(player);
                ++playerData5.shekels;
                final PlayerData playerData6 = Gametype.getPlayerData(player);
                ++playerData6.shekels;
                final PlayerData playerData7 = Gametype.getPlayerData(player);
                ++playerData7.shekels;
                final PlayerData playerData8 = Gametype.getPlayerData(player);
                ++playerData8.totalScore;
            }
        }
        else {
            final PlayerData playerData9 = Gametype.getPlayerData(player);
            --playerData9.score;
            if (Gametype.getPlayerData(player).shekels > 0) {
                final PlayerData playerData10 = Gametype.getPlayerData(player);
                --playerData10.shekels;
            }
        }
        final PlayerData playerData11 = Gametype.getPlayerData(player);
        ++playerData11.deaths;
    }
    
    @Override
    public void baseAttacked(final ITeamBase base, final DamageSource source) {
    }
    
    @Override
    public void objectAttacked(final ITeamObject object, final DamageSource source) {
    }
    
    @Override
    public void baseClickedByPlayer(final ITeamBase base, final EntityPlayerMP player) {
    }
    
    @Override
    public void objectClickedByPlayer(final ITeamObject object, final EntityPlayerMP player) {
    }
    
    @Override
    public Vec3 getSpawnPoint(final EntityPlayerMP player) {
        if (GametypeTDM.teamsManager.currentRound == null) {
            return null;
        }
        final PlayerData data = Gametype.getPlayerData(player);
        final List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if (data.newTeam == null) {
            return null;
        }
        final ArrayList<ITeamBase> bases = GametypeTDM.teamsManager.currentRound.map.getBasesPerTeam(GametypeTDM.teamsManager.currentRound.getTeamID(data.newTeam));
        for (final ITeamBase base : bases) {
            if (base.getMap() != GametypeTDM.teamsManager.currentRound.map) {
                continue;
            }
            for (int i = 0; i < base.getObjects().size(); ++i) {
                if (base.getObjects().get(i).isSpawnPoint()) {
                    validSpawnPoints.add(base.getObjects().get(i));
                }
            }
        }
        if (validSpawnPoints.size() > 0) {
            final ITeamObject spawnPoint = validSpawnPoints.get(GametypeTDM.rand.nextInt(validSpawnPoints.size()));
            return Vec3.func_72443_a(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
        }
        return null;
    }
    
    @Override
    public void playerRespawned(final EntityPlayerMP player) {
    }
    
    @Override
    public boolean setVariable(final String variable, final String value) {
        if (variable.toLowerCase().equals("scorelimit")) {
            this.scoreLimit = Integer.parseInt(value);
            return true;
        }
        if (variable.toLowerCase().equals("friendlyfire")) {
            this.friendlyFire = Boolean.parseBoolean(value);
            return true;
        }
        if (variable.toLowerCase().equals("autobalance")) {
            this.autoBalance = Boolean.parseBoolean(value);
            return true;
        }
        return false;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound tags) {
        this.scoreLimit = tags.func_74762_e("TDMScoreLimit");
        this.friendlyFire = tags.func_74767_n("TDMFriendlyFire");
        this.autoBalance = tags.func_74767_n("TDMAutoBalance");
    }
    
    @Override
    public void saveToNBT(final NBTTagCompound tags) {
        tags.func_74768_a("TDMScoreLimit", this.scoreLimit);
        tags.func_74757_a("TDMFriendlyFire", this.friendlyFire);
        tags.func_74757_a("TDMAutoBalance", this.autoBalance);
    }
    
    @Override
    public boolean sortScoreboardByTeam() {
        return true;
    }
    
    @Override
    public boolean teamHasWon(final Team team) {
        return GametypeTDM.teamsManager.currentRound != null && team.score == GametypeTDM.teamsManager.currentRound.scoreLimit;
    }
}
