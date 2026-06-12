// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import com.flansmod.common.teams.TeamsManager;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.FMLCommonHandler;

public class CommonTickHandler
{
    public CommonTickHandler() {
        FMLCommonHandler.instance().bus().register((Object)this);
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.ClientTickEvent event) {
        switch (event.phase) {
            case END: {
                FlansMod.playerHandler.clientTick();
                break;
            }
        }
    }
    
    @SubscribeEvent
    public void tick(final TickEvent.ServerTickEvent event) {
        switch (event.phase) {
            case END: {
                TeamsManager.getInstance().tick();
                FlansMod.playerHandler.serverTick();
                ++FlansMod.ticker;
                break;
            }
        }
    }
}
