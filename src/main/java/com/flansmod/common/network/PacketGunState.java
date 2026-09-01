// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.guns.AttachmentType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.eventhandlers.ServerTickEvent;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketGunState extends PacketBase
{
    boolean isScoped;
    
    public PacketGunState() {
    }
    
    public PacketGunState(final boolean isScoped) {
        this.isScoped = isScoped;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.isScoped);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.isScoped = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP player) {
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
            final ItemGun itemGun = (ItemGun)player.getCurrentEquippedItem().getItem();
            final ItemStack itemstack = player.getCurrentEquippedItem();
            final AttachmentType scope = itemGun.type.getScope(itemstack);
            if (scope != null && scope.hasNightVision && this.isScoped) {
                player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 2400, 0));
                ServerTickEvent.nightVisionPlayers.add(player);
            }
            else if (scope != null && scope.hasNightVision && !this.isScoped) {
                player.removePotionEffect(Potion.nightVision.id);
                ServerTickEvent.nightVisionPlayers.remove(player);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
    }
}
