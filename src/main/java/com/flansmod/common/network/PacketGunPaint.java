// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.paintjob.ContainerPaintjobTable;
import com.flansmod.common.guns.ContainerGunModTable;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketGunPaint extends PacketBase
{
    private int paintjobID;
    
    public PacketGunPaint() {
    }
    
    public PacketGunPaint(final int i) {
        this.paintjobID = i;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.paintjobID);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.paintjobID = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.openContainer instanceof ContainerGunModTable) {
            final ContainerGunModTable gunModTable = (ContainerGunModTable)playerEntity.openContainer;
            gunModTable.clickPaintjob(this.paintjobID);
        }
        else if (playerEntity.openContainer instanceof ContainerPaintjobTable) {
            final ContainerPaintjobTable paintjobTable = (ContainerPaintjobTable)playerEntity.openContainer;
            paintjobTable.clickPaintjob(this.paintjobID);
        }
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
    }
}
