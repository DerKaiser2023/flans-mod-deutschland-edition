// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.eventhandlers;

import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.Entity;
import com.flansmod.common.driveables.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.EntityPlane;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import com.flansmod.common.guns.AttachmentType;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import net.minecraft.potion.Potion;
import com.flansmod.common.guns.ItemGun;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import java.util.ArrayList;

public class ServerTickEvent
{
    public static ArrayList<EntityPlayerMP> nightVisionPlayers;
    public static ArrayList<Object[]> remount;
    int tickCount;
    
    public ServerTickEvent() {
        this.tickCount = 0;
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.ServerTickEvent event) {
        switch (event.phase) {
            case END: {
                if (this.tickCount >= 20) {
                    final ArrayList<EntityPlayerMP> playersToRemove = new ArrayList<EntityPlayerMP>();
                    for (final EntityPlayerMP player : ServerTickEvent.nightVisionPlayers) {
                        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                            final ItemGun itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
                            final ItemStack itemstack = player.getCurrentEquippedItem();
                            final AttachmentType scope = itemGun.type.getScope(itemstack);
                            System.out.println("est");
                            if (scope != null && scope.hasNightVision) {
                                continue;
                            }
                            player.removePotionEffect(Potion.nightVision.id);
                            playersToRemove.add(player);
                        }
                        else {
                            player.removePotionEffect(Potion.nightVision.id);
                            playersToRemove.add(player);
                        }
                    }
                    this.tickCount = 0;
                    for (final EntityPlayerMP player : playersToRemove) {
                        ServerTickEvent.nightVisionPlayers.remove(player);
                    }
                }
                ++this.tickCount;
                break;
            }
        }
    }
    
    @SubscribeEvent
    public void onPlayerTick(final TickEvent.PlayerTickEvent event) {
        final EntityPlayer player = event.player;
        if (!player.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendTo(new PacketBlood(PlayerHandler.getPlayerData(player).blood, (float)PlayerHandler.getPlayerData(player).hemorrhaging, PlayerHandler.getPlayerData(player).killStreak), (EntityPlayerMP)player);
            for (final Object[] o : ServerTickEvent.remount) {
                final EntityPlayerMP mp = (EntityPlayerMP)o[0];
                if (o[1] instanceof EntitySeat) {
                    final EntitySeat seato = (EntitySeat)o[1];
                    if (mp != null) {
                        mp.addChatMessage((IChatComponent)new ChatComponentText("An eternal glitch tried to kick " + mp.getDisplayName() + " out of his vehicle!"));
                        mp.addChatMessage((IChatComponent)new ChatComponentText("Seatkick reset TM will try to refund the vehicle and bring you back to where you first placed it!"));
                        final EntitySeat seat = (EntitySeat)o[1];
                        final EntityDriveable plane = seat.driveable;
                        if (plane instanceof EntityPlane) {
                            ((EntityPlane)plane).reset((EntityPlayer)mp);
                            mp.addChatMessage((IChatComponent)new ChatComponentText("Potion Effects will help you survive if teleport drops you from too high!"));
                            mp.addChatMessage((IChatComponent)new ChatComponentText("However, you are also blinded and slowed so you cant abuse this in combat!"));
                        }
                        if (plane instanceof EntityVehicle) {
                            ((EntityVehicle)plane).reset((EntityPlayer)mp);
                            mp.addChatMessage((IChatComponent)new ChatComponentText("Potion Effects will help you survive if teleport drops you from too high!"));
                            mp.addChatMessage((IChatComponent)new ChatComponentText("However, you are also blinded and slowed so you cant abuse this in combat!"));
                        }
                    }
                }
                ((EntityPlayer)o[0]).mountEntity((Entity)o[1]);
                System.out.println("remount attempted to remount");
            }
            ServerTickEvent.remount.clear();
        }
    }
    
    static {
        ServerTickEvent.nightVisionPlayers = new ArrayList<EntityPlayerMP>();
        ServerTickEvent.remount = new ArrayList<Object[]>();
    }
}
