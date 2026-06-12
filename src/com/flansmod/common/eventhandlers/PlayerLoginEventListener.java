// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.Mod;
import com.flansmod.common.network.PacketBase;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.network.PacketModConfig;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.FMLCommonHandler;

public class PlayerLoginEventListener
{
    public PlayerLoginEventListener() {
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @Mod.EventHandler
    @SubscribeEvent
    public void OnPlayerLogin(final PlayerEvent.PlayerLoggedInEvent event) {
        FlansMod.packetHandler.sendTo(new PacketModConfig(), (EntityPlayerMP)event.player);
    }
}
