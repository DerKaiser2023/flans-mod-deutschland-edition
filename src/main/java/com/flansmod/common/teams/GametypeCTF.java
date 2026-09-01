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
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayerMP;

public class GametypeCTF extends Gametype
{
    public boolean friendlyFire;
    public boolean autoBalance;
    public int time;
    public int autoBalanceInterval;
    public int flagReturnTime;
    
    public GametypeCTF() {
        super("Capture the Flag", "CTF", 2);
        this.friendlyFire = false;
        this.autoBalance = true;
        this.autoBalanceInterval = 1200;
        this.flagReturnTime = 60;
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
    public boolean playerCanAttack(final EntityPlayerMP attacker, final Team attackerTeam, final EntityPlayerMP victim, final Team victimTeam) {
        return attackerTeam != victimTeam || this.friendlyFire;
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
            }
        }
        else {
            final PlayerData playerData4 = Gametype.getPlayerData(player);
            --playerData4.score;
        }
        final PlayerData playerData5 = Gametype.getPlayerData(player);
        ++playerData5.deaths;
        if (player.field_70153_n instanceof EntityFlag) {
            final Team flagTeam = GametypeCTF.teamsManager.getTeam(((EntityFlag)player.field_70153_n).getBase().getOwnerID());
            player.field_70153_n.func_70078_a((Entity)null);
            TeamsManager.messageAll("§f" + player.func_70005_c_() + " dropped the §" + flagTeam.textColour + flagTeam.name + "§f flag");
        }
    }
    
    @Override
    public void baseAttacked(final ITeamBase base, final DamageSource source) {
    }
    
    @Override
    public void objectAttacked(final ITeamObject object, final DamageSource source) {
    }
    
    @Override
    public void baseClickedByPlayer(final ITeamBase base, final EntityPlayerMP player) {
        if (base instanceof EntityFlagpole && ((EntityFlag)base.getFlag()).isHome) {
            this.objectClickedByPlayer(base.getFlag(), player);
        }
    }
    
    @Override
    public void objectClickedByPlayer(final ITeamObject object, final EntityPlayerMP player) {
        if (GametypeCTF.teamsManager.currentRound == null) {
            return;
        }
        if (object instanceof EntityFlag) {
            final EntityFlag flag = (EntityFlag)object;
            if (flag.getBase().getOwnerID() > 1) {
                final Team playerTeam = Gametype.getPlayerData(player).team;
                final PlayerData playerData = Gametype.getPlayerData(player);
                final Team flagTeam = GametypeCTF.teamsManager.getTeam(flag.getBase().getOwnerID());
                if (playerTeam != null && playerTeam != Team.spectators && flag.getBase().getMap() == GametypeCTF.teamsManager.currentRound.map) {
                    if (playerTeam == flagTeam) {
                        if (flag.field_70154_o == null && !flag.isHome) {
                            flag.reset();
                            final PlayerData playerData2 = playerData;
                            playerData2.score += 2;
                            final PlayerData playerData3 = Gametype.getPlayerData(player);
                            ++playerData3.shekels;
                            final PlayerData playerData4 = Gametype.getPlayerData(player);
                            ++playerData4.shekels;
                            TeamsManager.messageAll("§f" + player.func_70005_c_() + " returned the §" + flagTeam.textColour + flagTeam.name + "§f flag");
                        }
                        else if (player.field_70153_n instanceof EntityFlag) {
                            final EntityFlag otherFlag = (EntityFlag)player.field_70153_n;
                            final Team otherFlagTeam = GametypeCTF.teamsManager.getTeam(otherFlag.getBase().getOwnerID());
                            if (otherFlagTeam != null && otherFlagTeam != Team.spectators && otherFlagTeam != flagTeam && flag.isHome) {
                                final Team team = playerTeam;
                                ++team.score;
                                final PlayerData playerData5 = playerData;
                                playerData5.score += 10;
                                final PlayerData playerData6 = Gametype.getPlayerData(player);
                                ++playerData6.shekels;
                                final PlayerData playerData7 = Gametype.getPlayerData(player);
                                ++playerData7.shekels;
                                final PlayerData playerData8 = Gametype.getPlayerData(player);
                                ++playerData8.shekels;
                                final PlayerData playerData9 = Gametype.getPlayerData(player);
                                ++playerData9.shekels;
                                final PlayerData playerData10 = Gametype.getPlayerData(player);
                                ++playerData10.shekels;
                                final PlayerData playerData11 = Gametype.getPlayerData(player);
                                ++playerData11.shekels;
                                otherFlag.reset();
                                TeamsManager.messageAll("§f" + player.func_70005_c_() + " captured the §" + otherFlagTeam.textColour + otherFlagTeam.name + "§f flag");
                            }
                        }
                    }
                    else if (flag.field_70154_o == player) {
                        flag.func_70078_a(null);
                        TeamsManager.messageAll("§f" + player.func_70005_c_() + " dropped the §" + flagTeam.textColour + flagTeam.name + "§f flag");
                    }
                    else if (flag.field_70154_o == null) {
                        if (flag.isHome) {
                            final PlayerData playerData12 = playerData;
                            playerData12.score += 3;
                        }
                        final PlayerData playerData13 = Gametype.getPlayerData(player);
                        ++playerData13.shekels;
                        final PlayerData playerData14 = Gametype.getPlayerData(player);
                        ++playerData14.shekels;
                        flag.func_70078_a((Entity)player);
                        TeamsManager.messageAll("§f" + player.func_70005_c_() + " picked up the §" + flagTeam.textColour + flagTeam.name + "§f flag");
                        flag.isHome = false;
                    }
                }
            }
        }
    }
    
    @Override
    public Vec3 getSpawnPoint(final EntityPlayerMP player) {
        if (GametypeCTF.teamsManager.currentRound == null) {
            return null;
        }
        final PlayerData data = Gametype.getPlayerData(player);
        final List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if (data.newTeam == null) {
            return null;
        }
        final ArrayList<ITeamBase> bases = GametypeCTF.teamsManager.currentRound.map.getBasesPerTeam(GametypeCTF.teamsManager.currentRound.getTeamID(data.newTeam));
        for (final ITeamBase base : bases) {
            if (base.getMap() != GametypeCTF.teamsManager.currentRound.map) {
                continue;
            }
            for (int i = 0; i < base.getObjects().size(); ++i) {
                if (base.getObjects().get(i).isSpawnPoint()) {
                    validSpawnPoints.add(base.getObjects().get(i));
                }
            }
        }
        if (validSpawnPoints.size() > 0) {
            final ITeamObject spawnPoint = validSpawnPoints.get(GametypeCTF.rand.nextInt(validSpawnPoints.size()));
            return Vec3.func_72443_a(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
        }
        return null;
    }
    
    @Override
    public void playerRespawned(final EntityPlayerMP player) {
    }
    
    @Override
    public boolean setVariable(final String variable, final String value) {
        if (variable.toLowerCase().equals("friendlyfire")) {
            this.friendlyFire = Boolean.parseBoolean(value);
            return true;
        }
        if (variable.toLowerCase().equals("autobalance")) {
            this.autoBalance = Boolean.parseBoolean(value);
            return true;
        }
        if (variable.toLowerCase().equals("flagtime")) {
            this.flagReturnTime = Integer.parseInt(value);
            return true;
        }
        return false;
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound tags) {
        this.friendlyFire = tags.func_74767_n("CTFFriendlyFire");
        this.autoBalance = tags.func_74767_n("CTFAutoBalance");
        this.flagReturnTime = tags.func_74762_e("CTFFlagTime");
    }
    
    @Override
    public void saveToNBT(final NBTTagCompound tags) {
        tags.func_74757_a("CTFFriendlyFire", this.friendlyFire);
        tags.func_74757_a("CTFAutoBalance", this.autoBalance);
        tags.func_74768_a("CTFFlagTime", this.flagReturnTime);
    }
    
    @Override
    public boolean sortScoreboardByTeam() {
        return true;
    }
    
    @Override
    public boolean teamHasWon(final Team team) {
        return GametypeCTF.teamsManager.currentRound != null && team.score == GametypeCTF.teamsManager.currentRound.scoreLimit;
    }
}
