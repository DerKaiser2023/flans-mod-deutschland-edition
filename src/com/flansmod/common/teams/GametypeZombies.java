// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.types.InfoType;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import net.minecraft.util.Vec3;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class GametypeZombies extends Gametype
{
    public boolean friendlyFire;
    public int humanPrepTime;
    
    public GametypeZombies() {
        super("Zombies", "ZOM", 2);
        this.friendlyFire = false;
        this.humanPrepTime = 600;
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
        if (GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime - 200 == GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60) {
            final TeamsManager teamsManager = GametypeZombies.teamsManager;
            TeamsManager.messageAll("§cThe §4zombies §care upon us! 10 seconds to §4infection§c!");
        }
        if (GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime == GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60) {
            final TeamsManager teamsManager2 = GametypeZombies.teamsManager;
            TeamsManager.messageAll("§cThe §4zombie plague §cis here!");
            this.zombifySomeone();
        }
        if (GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime < GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60 && GametypeZombies.teamsManager.roundTimeLeft % 200 == 0 && GametypeZombies.teamsManager.currentRound.teams[1].members.size() == 0) {
            this.zombifySomeone();
        }
    }
    
    public void zombifySomeone() {
        if (GametypeZombies.teamsManager.currentRound.teams[0].members.size() > 0) {
            final EntityPlayer zombifiedPlayer = (EntityPlayer)GametypeZombies.teamsManager.getPlayer(GametypeZombies.teamsManager.currentRound.teams[0].members.get(GametypeZombies.rand.nextInt(GametypeZombies.teamsManager.currentRound.teams[0].members.size())));
            final TeamsManager teamsManager = GametypeZombies.teamsManager;
            TeamsManager.messageAll("§4" + zombifiedPlayer.func_70005_c_() + "§c was infected with the §4zombie plague§c!");
            zombifiedPlayer.func_70097_a(DamageSource.field_76377_j, 1.0E9f);
        }
    }
    
    @Override
    public Team[] getTeamsCanSpawnAs(final TeamsRound currentRound, final EntityPlayer player) {
        if (GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime > GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60) {
            return new Team[] { currentRound.teams[0] };
        }
        return new Team[] { currentRound.teams[1] };
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
        final PlayerData playerData = Gametype.getPlayerData(player);
        final EntityPlayerMP attacker = Gametype.getPlayerFromDamageSource(source);
        if (attacker != null) {
            final PlayerData attackerData = Gametype.getPlayerData(attacker);
            if (attacker != player) {
                if (attackerData.team == playerData.team) {
                    if (this.isHuman(attackerData.team)) {
                        final PlayerData playerData2 = attackerData;
                        ++playerData2.score;
                    }
                    else {
                        final PlayerData playerData3 = attackerData;
                        --playerData3.zombieScore;
                    }
                }
                else {
                    if (this.isHuman(attackerData.team)) {
                        final PlayerData playerData4 = attackerData;
                        ++playerData4.score;
                    }
                    else if (this.isZombie(attackerData.team)) {
                        final PlayerData playerData5 = attackerData;
                        ++playerData5.zombieScore;
                    }
                    final PlayerData playerData6 = attackerData;
                    ++playerData6.kills;
                }
            }
        }
        final PlayerData playerData7 = playerData;
        ++playerData7.deaths;
        if (GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime <= GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60) {
            if (playerData.team != null) {
                playerData.team.removePlayer((EntityPlayer)player);
            }
            final PlayerData playerData8 = playerData;
            final PlayerData playerData9 = playerData;
            final Team team = GametypeZombies.teamsManager.currentRound.teams[1];
            playerData9.newTeam = team;
            playerData8.team = team;
            playerData.team.addPlayer((EntityPlayer)player);
            GametypeZombies.teamsManager.sendClassMenuToPlayer(player);
        }
    }
    
    @Override
    public boolean teamHasWon(final Team team) {
        if (this.isHuman(team)) {
            return GametypeZombies.teamsManager.roundTimeLeft == 1 && team.members.size() > 0;
        }
        return this.isZombie(team) && GametypeZombies.teamsManager.roundTimeLeft + this.humanPrepTime <= GametypeZombies.teamsManager.currentRound.timeLimit * 20 * 60 && GametypeZombies.teamsManager.currentRound.teams[0].members.size() == 0;
    }
    
    public boolean isHuman(final Team team) {
        return team == GametypeZombies.teamsManager.currentRound.teams[0];
    }
    
    public boolean isZombie(final Team team) {
        return team == GametypeZombies.teamsManager.currentRound.teams[1];
    }
    
    @Override
    public Vec3 getSpawnPoint(final EntityPlayerMP player) {
        if (GametypeZombies.teamsManager.currentRound == null) {
            return null;
        }
        final PlayerData data = Gametype.getPlayerData(player);
        final List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if (data.newTeam == null) {
            return null;
        }
        if (data.newTeam == Team.spectators) {
            final ArrayList<ITeamBase> bases = GametypeZombies.teamsManager.currentRound.map.getBasesPerTeam(1);
            for (final ITeamBase base : bases) {
                if (base.getMap() != GametypeZombies.teamsManager.currentRound.map) {
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
                final ArrayList<ITeamBase> bases2 = GametypeZombies.teamsManager.currentRound.map.getBasesPerTeam(k);
                for (final ITeamBase base2 : bases2) {
                    if (base2.getMap() != GametypeZombies.teamsManager.currentRound.map) {
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
            final ITeamObject spawnPoint = validSpawnPoints.get(GametypeZombies.rand.nextInt(validSpawnPoints.size()));
            return Vec3.func_72443_a(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
        }
        return null;
    }
    
    @Override
    public boolean showZombieScore() {
        return true;
    }
    
    @Override
    public boolean playerCanLoot(final ItemStack stack, final InfoType infoType, final EntityPlayer player, final Team playerTeam) {
        return playerTeam != GametypeZombies.teamsManager.currentRound.teams[1];
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound tags) {
        this.humanPrepTime = tags.func_74762_e("ZOMPrepTime");
    }
    
    @Override
    public void saveToNBT(final NBTTagCompound tags) {
        tags.func_74768_a("ZOMPrepTime", this.humanPrepTime);
    }
    
    @Override
    public boolean setVariable(final String variable, final String value) {
        if (variable.toLowerCase().equals("humanpreptime")) {
            this.humanPrepTime = Integer.parseInt(value) * 20;
            return true;
        }
        return false;
    }
}
