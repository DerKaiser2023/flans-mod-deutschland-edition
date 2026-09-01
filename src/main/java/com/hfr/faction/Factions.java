package com.hfr.faction;

import com.hfr.clowder.Clowder;

import net.minecraft.entity.player.EntityPlayer;

import java.util.IdentityHashMap;
import java.util.Map;

public class Factions {
    private static final Map<Clowder, IFaction> cache = new IdentityHashMap<>();

    public static IFaction getFactionFromPlayer(EntityPlayer player) {
        Clowder clowder = Clowder.getClowderFromPlayer(player);
        if (clowder == null) return null;
        synchronized (cache) {
            IFaction adapter = cache.get(clowder);
            if (adapter == null) {
                adapter = new HFRFactionAdapter(clowder);
                cache.put(clowder, adapter);
            }
            return adapter;
        }
    }

    public static IFaction getFactionFromName(String name) {
        Clowder clowder = Clowder.getClowderFromName(name);
        if (clowder == null) return null;
        synchronized (cache) {
            IFaction adapter = cache.get(clowder);
            if (adapter == null) {
                adapter = new HFRFactionAdapter(clowder);
                cache.put(clowder, adapter);
            }
            return adapter;
        }
    }
}
