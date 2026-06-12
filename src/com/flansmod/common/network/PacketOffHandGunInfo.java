// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import net.minecraft.entity.Entity;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class PacketOffHandGunInfo extends PacketBase
{
    public int entityID;
    public ItemStack gunStack;
    
    public PacketOffHandGunInfo() {
    }
    
    public PacketOffHandGunInfo(final EntityPlayerMP playerEntity, final int slot) {
        this.entityID = playerEntity.func_145782_y();
        if (slot == 0) {
            this.gunStack = null;
        }
        else {
            this.gunStack = playerEntity.field_71071_by.func_70301_a(slot - 1);
        }
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityID);
        ByteBufUtils.writeItemStack(data, this.gunStack);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityID = data.readInt();
        this.gunStack = ByteBufUtils.readItemStack(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received off hand gun info packet on server. Skipping. Did you mean to send a PacketSelectOffHandGun?");
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final Entity entity = clientPlayer.field_70170_p.func_73045_a(this.entityID);
        if (entity instanceof EntityPlayer && entity != clientPlayer) {
            final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)entity, Side.CLIENT);
            data.offHandGunStack = this.gunStack;
        }
    }
}
