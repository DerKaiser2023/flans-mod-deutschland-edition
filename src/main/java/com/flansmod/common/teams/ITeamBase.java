// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import java.util.List;

public interface ITeamBase
{
    String getName();
    
    void setName(final String p0);
    
    void setBaseID(final int p0);
    
    int getBaseID();
    
    int getDefaultOwnerID();
    
    void setDefaultOwnerID(final int p0);
    
    int getOwnerID();
    
    void setOwnerID(final int p0);
    
    void startRound();
    
    void roundCleanup();
    
    TeamsMap getMap();
    
    void setMap(final TeamsMap p0);
    
    void setMapFirstTime(final TeamsMap p0);
    
    List<ITeamObject> getObjects();
    
    void addObject(final ITeamObject p0);
    
    void tick();
    
    void destroy();
    
    Entity getEntity();
    
    double getPosX();
    
    double getPosY();
    
    double getPosZ();
    
    World getWorld();
    
    ITeamObject getFlag();
}
