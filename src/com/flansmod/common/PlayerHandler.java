// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import java.util.HashMap;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketRequestDebug;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import java.util.Iterator;
import net.minecraft.world.WorldServer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraft.entity.Entity;
import com.flansmod.common.guns.ShootableType;
import net.minecraft.util.DamageSource;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityDamageSourceFlans;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraftforge.common.MinecraftForge;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class PlayerHandler
{
    private static final Random rand;
    public static Map<String, PlayerData> serverSideData;
    public static Map<String, PlayerData> clientSideData;
    public static ArrayList<String> clientsToRemoveAfterThisRound;
    public static int enginePower;
    
    public PlayerHandler() {
        MinecraftForge.EVENT_BUS.register((Object)this);
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void onEntityHurt(final LivingAttackEvent event) {
        final EntityLivingBase entity = event.entityLiving;
        if (event instanceof LivingAttackEvent) {
            if (entity.field_70154_o instanceof EntityDriveable && ((EntityDriveable)entity.field_70154_o).getDriveableType().invinciblePilotType) {
                event.setCanceled(true);
            }
            if (entity.field_70154_o instanceof EntitySeat && ((EntitySeat)entity.field_70154_o).seatInfo.invincible) {
                event.setCanceled(true);
            }
        }
    }
    
    @SubscribeEvent
    public void onLivingHurtEvent(final LivingHurtEvent event) {
        float damage = event.ammount;
        if (damage > 0.0f && event.source instanceof EntityDamageSourceFlans) {
            final EntityDamageSourceFlans source = (EntityDamageSourceFlans)event.source;
            ShootableType shootableType = null;
            final Entity damageSouceEntity = source.getDamageSourceEntity();
            if (damageSouceEntity instanceof EntityBullet) {
                shootableType = ((EntityBullet)damageSouceEntity).type;
            }
            if (damageSouceEntity instanceof EntityGrenade) {
                shootableType = ((EntityGrenade)damageSouceEntity).type;
            }
            if (shootableType != null && shootableType.ignoreArmorProbability > 0.0f && PlayerHandler.rand.nextFloat() < shootableType.ignoreArmorProbability) {
                final EntityLivingBase entity = event.entityLiving;
                final float f1 = damage;
                damage = Math.max(damage - entity.func_110139_bj(), 0.0f);
                entity.func_110149_m(entity.func_110139_bj() - (f1 - damage));
                damage *= shootableType.ignoreArmorDamageFactor;
                if (damage != 0.0f) {
                    final float health = entity.func_110143_aJ();
                    entity.func_70606_j(health - damage);
                    entity.func_110142_aN().func_94547_a((DamageSource)source, health, damage);
                    entity.func_110149_m(entity.func_110139_bj() - damage);
                }
                event.setCanceled(true);
            }
        }
    }
    
    @SubscribeEvent
    public void onEntityKilled(final LivingDeathEvent event) {
        final EntityLivingBase entity = event.entityLiving;
        if (entity instanceof EntityPlayer) {
            getPlayerData((EntityPlayer)entity).playerKilled();
        }
    }
    
    public void serverTick() {
        for (final WorldServer world : MinecraftServer.func_71276_C().field_71305_c) {
            for (final Object player : world.field_73010_i) {
                getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
            }
        }
    }
    
    public void clientTick() {
        if (Minecraft.func_71410_x().field_71441_e != null) {
            for (final Object player : Minecraft.func_71410_x().field_71441_e.field_73010_i) {
                getPlayerData((EntityPlayer)player).tick((EntityPlayer)player);
            }
        }
    }
    
    public static PlayerData getPlayerData(final EntityPlayer player) {
        if (player == null) {
            return null;
        }
        return getPlayerData(player.func_70005_c_(), player.field_70170_p.field_72995_K ? Side.CLIENT : Side.SERVER);
    }
    
    public static PlayerData getPlayerData(final String username) {
        return getPlayerData(username, Side.SERVER);
    }
    
    public static PlayerData getPlayerData(final EntityPlayer player, final Side side) {
        if (player == null) {
            return null;
        }
        return getPlayerData(player.func_70005_c_(), side);
    }
    
    public static PlayerData getPlayerData(final String username, final Side side) {
        if (side.isClient()) {
            if (!PlayerHandler.clientSideData.containsKey(username)) {
                PlayerHandler.clientSideData.put(username, new PlayerData(username));
            }
        }
        else if (!PlayerHandler.serverSideData.containsKey(username)) {
            PlayerHandler.serverSideData.put(username, new PlayerData(username));
        }
        return side.isClient() ? PlayerHandler.clientSideData.get(username) : PlayerHandler.serverSideData.get(username);
    }
    
    @SubscribeEvent
    public void onPlayerEvent(final PlayerEvent event) {
        if (event instanceof PlayerEvent.PlayerLoggedInEvent) {
            if (event.player instanceof EntityPlayerMP) {
                FlansMod.packetHandler.sendTo(new PacketRequestDebug(false), (EntityPlayerMP)event.player);
            }
            final EntityPlayer player = event.player;
            final String username = player.func_70005_c_();
            if (!PlayerHandler.serverSideData.containsKey(username)) {
                PlayerHandler.serverSideData.put(username, new PlayerData(username));
            }
            if (PlayerHandler.clientsToRemoveAfterThisRound.contains(username)) {
                PlayerHandler.clientsToRemoveAfterThisRound.remove(username);
            }
        }
        else if (event instanceof PlayerEvent.PlayerLoggedOutEvent) {
            final EntityPlayer player = event.player;
            final String username = player.func_70005_c_();
            if (TeamsManager.getInstance().currentRound == null) {
                PlayerHandler.serverSideData.remove(username);
            }
            else {
                PlayerHandler.clientsToRemoveAfterThisRound.add(username);
            }
        }
        else if (event instanceof PlayerEvent.PlayerRespawnEvent) {
            final EntityPlayer player = event.player;
            final String username = player.func_70005_c_();
            if (!PlayerHandler.serverSideData.containsKey(username)) {
                PlayerHandler.serverSideData.put(username, new PlayerData(username));
            }
        }
    }
    
    public static void roundEnded() {
        for (final String username : PlayerHandler.clientsToRemoveAfterThisRound) {
            PlayerHandler.serverSideData.remove(username);
        }
    }
    
    static {
        rand = new Random();
        PlayerHandler.serverSideData = new HashMap<String, PlayerData>();
        PlayerHandler.clientSideData = new HashMap<String, PlayerData>();
        PlayerHandler.clientsToRemoveAfterThisRound = new ArrayList<String>();
        PlayerHandler.enginePower = 14539;
    }
}
