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

public class PacketGunFire extends PacketBase
{
    public boolean held;
    public boolean left;
    public float yaw;
    public float pitch;
    
    public PacketGunFire() {
    }
    
    public PacketGunFire(final boolean l, final boolean h, final float y, final float p) {
        this.left = l;
        this.held = h;
        this.yaw = y;
        this.pitch = p;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.held);
        data.writeBoolean(this.left);
        data.writeFloat(this.yaw);
        data.writeFloat(this.pitch);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.held = data.readBoolean();
        this.left = data.readBoolean();
        this.yaw = data.readFloat();
        this.pitch = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final ItemStack currentItem = playerEntity.field_71071_by.func_70448_g();
        if (currentItem != null && currentItem.func_77973_b() != null && currentItem.func_77973_b() instanceof ItemGun) {
            final float bkYaw = playerEntity.field_70177_z;
            final float bkPitch = playerEntity.field_70125_A;
            playerEntity.field_70177_z = this.yaw;
            playerEntity.field_70125_A = this.pitch;
            ((ItemGun)currentItem.func_77973_b()).onMouseHeld(currentItem, playerEntity.field_70170_p, playerEntity, this.left, this.held);
            playerEntity.field_70177_z = bkYaw;
            playerEntity.field_70125_A = bkPitch;
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received gun button packet on client. Skipping.");
        final ItemStack currentItem = clientPlayer.field_71071_by.func_70448_g();
    }
}
