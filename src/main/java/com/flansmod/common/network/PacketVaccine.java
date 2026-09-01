// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketVaccine extends PacketBase
{
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final Entity last = clientPlayer.field_70154_o;
        clientPlayer.field_70154_o = null;
        last.field_70153_n = null;
        clientPlayer.func_70078_a(last);
        if (FlansMod.lastRidden == null) {
            System.out.println("uh oh stinky fall out of planes boo boo");
        }
    }
}
