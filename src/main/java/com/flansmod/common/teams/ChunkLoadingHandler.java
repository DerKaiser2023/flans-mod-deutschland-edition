// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import java.util.Iterator;
import net.minecraft.world.World;
import java.util.List;
import net.minecraftforge.common.ForgeChunkManager;

public class ChunkLoadingHandler implements ForgeChunkManager.LoadingCallback
{
    public void ticketsLoaded(final List<ForgeChunkManager.Ticket> tickets, final World world) {
        for (final ForgeChunkManager.Ticket ticket : tickets) {
            final String s = ticket.getModData().func_74779_i("ShortName");
            final TeamsMap map = TeamsManager.getInstance().maps.get(s);
            if (map != null) {
                map.forceChunkLoading(ticket);
            }
        }
    }
}
