// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.Mod;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketKillMessage;
import net.minecraft.entity.Entity;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.common.MinecraftForge;

public class PlayerDeathEventListener
{
    public PlayerDeathEventListener() {
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @Mod.EventHandler
    @SubscribeEvent
    public void PlayerDied(final LivingDeathEvent DamageEvent) {
        final Entity souceEntity = DamageEvent.source.getSourceOfDamage();
        if (DamageEvent.source.getDamageType().equalsIgnoreCase("explosion") && (souceEntity instanceof EntityGrenade || souceEntity instanceof EntityBullet) && DamageEvent.entityLiving instanceof EntityPlayer) {
            EntityPlayer killer = null;
            final EntityPlayer killed = (EntityPlayer)DamageEvent.entityLiving;
            InfoType info;
            if (souceEntity instanceof EntityGrenade) {
                killer = (EntityPlayer)((EntityGrenade)souceEntity).thrower;
                info = ((EntityGrenade)souceEntity).type;
            }
            else {
                killer = (EntityPlayer)((EntityBullet)souceEntity).owner;
                info = ((EntityBullet)souceEntity).type;
            }
            Team killerTeam = null;
            Team killedTeam = null;
            killerTeam = PlayerHandler.getPlayerData(killer).team;
            killedTeam = PlayerHandler.getPlayerData(killed).team;
            PlayerHandler.getPlayerData(killed).blood = 100.0f;
            PlayerHandler.getPlayerData(killed).minorBleed = 0;
            PlayerHandler.getPlayerData(killed).Bleed = 0;
            PlayerHandler.getPlayerData(killed).hemorrhaging = 0;
            FlansMod.getPacketHandler().sendToDimension(new PacketKillMessage(false, info, killer.getHeldItem().getMetadata(), ((killedTeam == null) ? "f" : Character.valueOf(killedTeam.textColour)) + killed.getDisplayName(), ((killedTeam == null) ? "f" : Character.valueOf(killedTeam.textColour)) + killer.getDisplayName(), killed.getDistanceToEntity((Entity)killer)), DamageEvent.entityLiving.dimension);
            System.out.println(killer.getDisplayName() + " has killed " + killed.getDisplayName() + " with " + info.name + ". TickExisted:" + killed.ticksExisted / 20 + " KilledPos(X:" + (int)killed.posX + " Y:" + (int)killed.posY + " Z:" + (int)killed.posZ + ") KillerPos(X:" + (int)killer.posX + " Y:" + (int)killer.posY + " Z:" + (int)killer.posZ + ")");
            if (killed.getCurrentArmor(2) != null) {
                System.out.println("KilledPlayer:" + killed + " wear a " + killed.getCurrentArmor(2).getUnlocalizedName());
            }
            else {
                System.out.println("KilledPlayer:" + killed + " wear nothing.");
            }
            if (killer.getCurrentArmor(2) != null) {
                System.out.println("Killer:" + killer + " wear a " + killer.getCurrentArmor(2).getUnlocalizedName());
            }
            else {
                System.out.println("Killer:" + killer + " wear nothing.");
            }
            if (killed.ticksExisted / 20 < FlansMod.noticeSpawnKillTime) {
                System.out.println("Warning! PlayerName:" + killer.getCommandSenderName() + " may do SPAWN KILL. Time:" + killed.ticksExisted / 20 + " " + killed.getCommandSenderName() + " was killed.");
            }
        }
    }
    
    @SubscribeEvent
    public void onPlayerDeath(final LivingDeathEvent event) {
        if (event.entity instanceof EntityPlayer) {
            final EntityPlayer player = (EntityPlayer)event.entity;
            PlayerHandler.getPlayerData(player).blood = 100.0f;
            PlayerHandler.getPlayerData(player).minorBleed = 0;
            PlayerHandler.getPlayerData(player).Bleed = 0;
            PlayerHandler.getPlayerData(player).hemorrhaging = 0;
        }
    }
    
    @Mod.EventHandler
    public void onRespawnPVPEVENT(final PlayerEvent.PlayerRespawnEvent pvpevent) {
        final EntityPlayer player = pvpevent.player;
        PlayerHandler.getPlayerData(player).blood = 100.0f;
        PlayerHandler.getPlayerData(player).minorBleed = 0;
        PlayerHandler.getPlayerData(player).Bleed = 0;
        PlayerHandler.getPlayerData(player).hemorrhaging = 0;
    }
}
