// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.common.network.IGuiHandler;

public class CommonGuiHandler implements IGuiHandler
{
    public Object getServerGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        return FlansMod.proxy.getServerGui(ID, player, world, x, y, z);
    }
    
    public Object getClientGuiElement(final int ID, final EntityPlayer player, final World world, final int x, final int y, final int z) {
        return FlansMod.proxy.getClientGui(ID, player, world, x, y, z);
    }
}
