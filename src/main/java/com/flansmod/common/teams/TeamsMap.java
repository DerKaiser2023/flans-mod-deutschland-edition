// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import net.minecraft.world.World;
import java.util.ArrayList;
import net.minecraftforge.common.ForgeChunkManager;

public class TeamsMap
{
    public String shortName;
    public String name;
    public ForgeChunkManager.Ticket chunkLoadingTicket;
    public ArrayList<ITeamBase> bases;
    public int minPlayers;
    public int maxPlayers;
    
    public TeamsMap(final World world, final String sn, final String n) {
        this.bases = new ArrayList<ITeamBase>();
        this.minPlayers = 0;
        this.maxPlayers = 1000000;
        this.shortName = sn;
        this.name = n;
        this.chunkLoadingTicket = ForgeChunkManager.requestTicket((Object)FlansMod.INSTANCE, world, ForgeChunkManager.Type.NORMAL);
        if (this.chunkLoadingTicket == null) {
            FlansMod.log("Failed to add chunk loading ticket as Flan's Mod has run out");
            return;
        }
        this.chunkLoadingTicket.getModData().setString("ShortName", this.shortName);
    }
    
    public ArrayList<ITeamBase> getBasesPerTeam(final int teamID) {
        final ArrayList<ITeamBase> basesForThisTeam = new ArrayList<ITeamBase>();
        for (final ITeamBase base : this.bases) {
            if (base.getOwnerID() == teamID) {
                basesForThisTeam.add(base);
            }
        }
        return basesForThisTeam;
    }
    
    public void addBase(final ITeamBase base) {
        this.bases.add(base);
    }
    
    public void addBaseFirstTime(final ITeamBase base) {
        this.addBase(base);
        ForgeChunkManager.forceChunk(this.chunkLoadingTicket, new ChunkCoordIntPair((int)base.getPosX() >> 4, (int)base.getPosZ() >> 4));
        FlansMod.log("Added chunk at " + ((int)base.getPosX() >> 4) + ",  " + ((int)base.getPosZ() >> 4) + " to chunk loading ticket for base " + this.name);
    }
    
    public void removeBase(final ITeamBase base) {
        if (this.bases == null) {
            FlansMod.log("Base array for map " + this.name + " null");
            return;
        }
        this.bases.remove(base);
        ForgeChunkManager.unforceChunk(this.chunkLoadingTicket, new ChunkCoordIntPair((int)base.getPosX() >> 4, (int)base.getPosZ() >> 4));
        FlansMod.log("Removed chunk at " + ((int)base.getPosX() >> 4) + ",  " + ((int)base.getPosZ() >> 4) + " from chunk loading ticket for base " + this.name);
    }
    
    public void addObject(final ITeamObject object) {
    }
    
    public void addObjectFirstTime(final ITeamObject object) {
        if (object.forceChunkLoading()) {
            ForgeChunkManager.forceChunk(this.chunkLoadingTicket, new ChunkCoordIntPair((int)object.getPosX() >> 4, (int)object.getPosZ() >> 4));
        }
    }
    
    public TeamsMap(final World world, final NBTTagCompound tags) {
        this.bases = new ArrayList<ITeamBase>();
        this.minPlayers = 0;
        this.maxPlayers = 1000000;
        this.shortName = tags.getString("ShortName");
        this.name = tags.getString("Name");
        this.minPlayers = tags.getInteger("MinPlayers");
        this.maxPlayers = tags.getInteger("MaxPlayers");
    }
    
    public void writeToNBT(final NBTTagCompound tags) {
        tags.setString("ShortName", this.shortName);
        tags.setString("Name", this.name);
        tags.setInteger("MinPlayers", this.minPlayers);
        tags.setInteger("MaxPlayers", this.maxPlayers);
    }
    
    public void forceChunkLoading(final ForgeChunkManager.Ticket ticket) {
        for (final ChunkCoordIntPair coord : ticket.getChunkList()) {
            FlansMod.log("Loading chunk at " + coord.chunkXPos + ", " + coord.chunkZPos + " for map : " + this.name);
            ForgeChunkManager.forceChunk(ticket, coord);
        }
    }
    
    public void deleteMap() {
        ForgeChunkManager.releaseTicket(this.chunkLoadingTicket);
    }
}
