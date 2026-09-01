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

public class PacketDriveableKeyHeld extends PacketBase
{
    public int key;
    public boolean held;
    
    public PacketDriveableKeyHeld() {
    }
    
    public PacketDriveableKeyHeld(final int key, final boolean held) {
        this.key = key;
        this.held = held;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.key);
        data.writeBoolean(this.held);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.key = data.readInt();
        this.held = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.ridingEntity != null && playerEntity.ridingEntity instanceof IControllable) {
            ((IControllable)playerEntity.ridingEntity).updateKeyHeldState(this.key, this.held);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Driveable key packet received on client. Skipping.");
    }
}
