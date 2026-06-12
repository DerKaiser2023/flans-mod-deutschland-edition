// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.util.EntityDamageSource;
import java.util.List;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.PlayerData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Vec3;
import com.flansmod.common.types.InfoType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Random;
import java.util.HashMap;

public abstract class Gametype
{
    public static HashMap<String, Gametype> gametypes;
    public static TeamsManager teamsManager;
    public static Random rand;
    public String name;
    public String shortName;
    public int numTeamsRequired;
    
    public static Gametype getGametype(final String type) {
        return Gametype.gametypes.get(type);
    }
    
    public Gametype(final String s, final String s1, final int numTeams) {
        this.name = s;
        this.shortName = s1;
        this.numTeamsRequired = numTeams;
        Gametype.gametypes.put(this.shortName, this);
    }
    
    public abstract void roundStart();
    
    public abstract void roundEnd();
    
    public abstract void roundCleanup();
    
    public abstract boolean teamHasWon(final Team p0);
    
    public void tick() {
    }
    
    public Team[] getTeamsCanSpawnAs(final TeamsRound currentRound, final EntityPlayer player) {
        return currentRound.teams;
    }
    
    public void playerJoined(final EntityPlayerMP player) {
    }
    
    public void playerRespawned(final EntityPlayerMP player) {
    }
    
    public void playerQuit(final EntityPlayerMP player) {
    }
    
    public boolean playerAttacked(final EntityPlayerMP player, final DamageSource source) {
        return true;
    }
    
    public void playerKilled(final EntityPlayerMP player, final DamageSource source) {
    }
    
    public void baseAttacked(final ITeamBase base, final DamageSource source) {
    }
    
    public void objectAttacked(final ITeamObject object, final DamageSource source) {
    }
    
    public void baseClickedByPlayer(final ITeamBase base, final EntityPlayerMP player) {
    }
    
    public void objectClickedByPlayer(final ITeamObject object, final EntityPlayerMP player) {
    }
    
    public boolean playerCanLoot(final ItemStack stack, final InfoType infoType, final EntityPlayer player, final Team playerTeam) {
        return true;
    }
    
    public abstract Vec3 getSpawnPoint(final EntityPlayerMP p0);
    
    public boolean setVariable(final String variable, final String value) {
        return false;
    }
    
    public abstract void readFromNBT(final NBTTagCompound p0);
    
    public abstract void saveToNBT(final NBTTagCompound p0);
    
    public boolean sortScoreboardByTeam() {
        return true;
    }
    
    public boolean showZombieScore() {
        return false;
    }
    
    public boolean playerCanAttack(final EntityPlayerMP attacker, final Team attackerTeam, final EntityPlayerMP victim, final Team victimTeam) {
        return true;
    }
    
    public void entityKilled(final Entity entity, final DamageSource source) {
    }
    
    public void playerChoseTeam(final EntityPlayerMP player, final Team team, final Team newTeam) {
    }
    
    public void playerChoseNewClass(final EntityPlayerMP player, final PlayerClass playerClass) {
    }
    
    public void playerDefected(final EntityPlayerMP player, final Team team, final Team newTeam) {
    }
    
    public void playerEnteredTheGame(final EntityPlayerMP player, final Team team, final PlayerClass playerClass) {
    }
    
    public EntityPlayerMP getPlayer(final String username) {
        return MinecraftServer.func_71276_C().func_71203_ab().func_152612_a(username);
    }
    
    public static PlayerData getPlayerData(final EntityPlayerMP player) {
        return PlayerHandler.getPlayerData((EntityPlayer)player);
    }
    
    public static void sendPacketToPlayer(final PacketBase packet, final EntityPlayerMP player) {
        FlansMod.getPacketHandler().sendTo(packet, player);
    }
    
    public static String[] getPlayerNames() {
        return MinecraftServer.func_71276_C().func_71213_z();
    }
    
    public static List<EntityPlayer> getPlayers() {
        return MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;
    }
    
    public static void givePoints(final EntityPlayerMP player, final int points) {
        final PlayerData playerData;
        final PlayerData data = playerData = getPlayerData(player);
        playerData.score += points;
        if (data.team != null) {
            final Team team = data.team;
            team.score += points;
        }
    }
    
    public static EntityPlayerMP getPlayerFromDamageSource(final DamageSource source) {
        EntityPlayerMP attacker = null;
        if (source instanceof EntityDamageSource && source.func_76346_g() instanceof EntityPlayerMP) {
            attacker = (EntityPlayerMP)source.func_76346_g();
        }
        return attacker;
    }
    
    public boolean shouldAutobalance() {
        return true;
    }
    
    static {
        Gametype.gametypes = new HashMap<String, Gametype>();
        Gametype.teamsManager = TeamsManager.getInstance();
        Gametype.rand = new Random();
    }
}
