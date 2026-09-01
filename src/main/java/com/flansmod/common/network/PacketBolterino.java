// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketBolterino extends PacketBase
{
    public boolean held;
    
    public PacketBolterino() {
    }
    
    public PacketBolterino(final boolean h) {
        this.held = h;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.held);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.held = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final ItemStack currentItem = playerEntity.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() != null && currentItem.getItem() instanceof ItemGun) {
            final float bkYaw = playerEntity.rotationYaw;
            final float bkPitch = playerEntity.rotationPitch;
            playerEntity.rotationYaw = bkYaw;
            playerEntity.rotationPitch = bkPitch;
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received gun button packet on client. Skipping.");
        final ItemStack currentItem = clientPlayer.inventory.getCurrentItem();
    }
}
