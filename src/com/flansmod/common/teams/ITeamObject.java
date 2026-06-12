// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

public interface ITeamObject
{
    ITeamBase getBase();
    
    void onBaseSet(final int p0);
    
    void onBaseCapture(final int p0);
    
    void setBase(final ITeamBase p0);
    
    void tick();
    
    void destroy();
    
    double getPosX();
    
    double getPosY();
    
    double getPosZ();
    
    boolean isSpawnPoint();
    
    boolean forceChunkLoading();
}
