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

public class GametypeDM extends Gametype
{
    public int scoreLimit;
    public int newRoundTimer;
    public int time;
    
    public GametypeDM() {
        super("Free For All", "DM", 2);
        this.scoreLimit = 25;
        this.newRoundTimer = 0;
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
            if (Gametype.getPlayerData(attacker).team == Team.spectators) {
                return false;
            }
        }
        return Gametype.getPlayerData(player).team != Team.spectators;
    }
    
    @Override
    public void playerKilled(final EntityPlayerMP player, final DamageSource source) {
        final EntityPlayerMP attacker = Gametype.getPlayerFromDamageSource(source);
        if (attacker != null) {
            if (attacker == player) {
                final PlayerData playerData = Gametype.getPlayerData(player);
                --playerData.score;
            }
            else {
                final PlayerData playerData2 = Gametype.getPlayerData(attacker);
                ++playerData2.score;
                final PlayerData playerData3 = Gametype.getPlayerData(attacker);
                ++playerData3.kills;
                final PlayerData playerData4 = Gametype.getPlayerData(player);
                ++playerData4.shekels;
                final PlayerData playerData5 = Gametype.getPlayerData(player);
                ++playerData5.shekels;
                final PlayerData playerData6 = Gametype.getPlayerData(player);
                ++playerData6.shekels;
                final PlayerData playerData7 = Gametype.getPlayerData(player);
                ++playerData7.totalScore;
            }
        }
        else {
            final PlayerData playerData8 = Gametype.getPlayerData(player);
            --playerData8.score;
            if (Gametype.getPlayerData(player).shekels > 0) {
                final PlayerData playerData9 = Gametype.getPlayerData(player);
                --playerData9.shekels;
            }
        }
        final PlayerData playerData10 = Gametype.getPlayerData(player);
        ++playerData10.deaths;
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
        if (GametypeDM.teamsManager.currentRound == null) {
            return null;
        }
        final PlayerData data = Gametype.getPlayerData(player);
        final List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if (data.newTeam == null) {
            return null;
        }
        if (data.newTeam == Team.spectators) {
            final ArrayList<ITeamBase> bases = GametypeDM.teamsManager.currentRound.map.getBasesPerTeam(GametypeDM.teamsManager.currentRound.getTeamID(data.newTeam));
            for (final ITeamBase base : bases) {
                if (base.getMap() != GametypeDM.teamsManager.currentRound.map) {
                    continue;
                }
                for (int i = 0; i < base.getObjects().size(); ++i) {
                    if (base.getObjects().get(i).isSpawnPoint()) {
                        validSpawnPoints.add(base.getObjects().get(i));
                    }
                }
            }
        }
        else {
            for (int k = 2; k < 4; ++k) {
                final ArrayList<ITeamBase> bases2 = GametypeDM.teamsManager.currentRound.map.getBasesPerTeam(k);
                for (final ITeamBase base2 : bases2) {
                    if (base2.getMap() != GametypeDM.teamsManager.currentRound.map) {
                        continue;
                    }
                    for (int j = 0; j < base2.getObjects().size(); ++j) {
                        if (base2.getObjects().get(j).isSpawnPoint()) {
                            validSpawnPoints.add(base2.getObjects().get(j));
                        }
                    }
                }
            }
        }
        if (validSpawnPoints.size() > 0) {
            final ITeamObject spawnPoint = validSpawnPoints.get(GametypeDM.rand.nextInt(validSpawnPoints.size()));
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
        return false;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound tags) {
        this.scoreLimit = tags.func_74762_e("DMScoreLimit");
    }
    
    @Override
    public void saveToNBT(final NBTTagCompound tags) {
        tags.func_74768_a("DMScoreLimit", this.scoreLimit);
    }
    
    @Override
    public boolean sortScoreboardByTeam() {
        return false;
    }
    
    @Override
    public boolean shouldAutobalance() {
        return false;
    }
    
    @Override
    public boolean teamHasWon(final Team team) {
        return false;
    }
}
