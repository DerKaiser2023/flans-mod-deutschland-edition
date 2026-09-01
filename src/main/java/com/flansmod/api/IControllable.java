// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.api;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public interface IControllable
{
    void onMouseMoved(final int p0, final int p1);
    
    boolean pressKey(final int p0, final EntityPlayer p1);
    
    void updateKeyHeldState(final int p0, final boolean p1);
    
    Entity getControllingEntity();
    
    boolean isDead();
    
    float getPlayerRoll();
    
    float getCameraDistance();
    
    @SideOnly(Side.CLIENT)
    EntityLivingBase getCamera();
}
