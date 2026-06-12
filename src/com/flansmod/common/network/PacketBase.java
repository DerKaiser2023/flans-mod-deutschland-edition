// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public abstract class PacketBase
{
    public abstract void encodeInto(final ChannelHandlerContext p0, final ByteBuf p1);
    
    public abstract void decodeInto(final ChannelHandlerContext p0, final ByteBuf p1);
    
    public abstract void handleServerSide(final EntityPlayerMP p0);
    
    @SideOnly(Side.CLIENT)
    public abstract void handleClientSide(final EntityPlayer p0);
    
    public void writeUTF(final ByteBuf data, final String s) {
        ByteBufUtils.writeUTF8String(data, s);
    }
    
    public String readUTF(final ByteBuf data) {
        return ByteBufUtils.readUTF8String(data);
    }
}
