// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.api.IControllable;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketDriveableKey extends PacketBase
{
    public int key;
    
    public PacketDriveableKey() {
    }
    
    public PacketDriveableKey(final int k) {
        this.key = k;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.key);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.key = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.ridingEntity != null && playerEntity.ridingEntity instanceof IControllable) {
            ((IControllable)playerEntity.ridingEntity).pressKey(this.key, (EntityPlayer)playerEntity);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Driveable keypress packet received on client. Skipping.");
    }
}
