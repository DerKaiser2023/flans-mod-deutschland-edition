// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.guns.GunType;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.item.ItemStack;

public class PacketGunSpread extends PacketBase
{
    private float spread;
    
    public PacketGunSpread() {
        this.spread = 0.0f;
    }
    
    public PacketGunSpread(final ItemStack stack, final float amount) {
        this.spread = 0.0f;
        if (stack != null && stack.getItem() instanceof ItemGun) {
            this.spread = amount;
        }
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeFloat(this.spread);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.spread = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP player) {
        final ItemStack stack = player.inventory.getCurrentItem();
        if (stack != null && stack.getItem() instanceof ItemGun) {
            final GunType type = ((ItemGun)stack.getItem()).type;
            if (type.getGrip(stack) != null && type.getSecondaryFire(stack)) {
                ((ItemGun)stack.getItem()).type.getGrip(stack).secondarySpread = this.spread;
            }
            else {
                ((ItemGun)stack.getItem()).type.bulletSpread = this.spread;
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer client) {
    }
}
