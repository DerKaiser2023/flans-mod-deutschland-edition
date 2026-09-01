// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketImpactPoint extends PacketBase
{
    public int x;
    public int y;
    public int z;
    public int entityId;
    
    public PacketImpactPoint() {
    }
    
    public PacketImpactPoint(final int x, final int y, final int z, final int entityId) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.entityId = entityId;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.x);
        data.writeInt(this.y);
        data.writeInt(this.z);
        data.writeInt(this.entityId);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.x = data.readInt();
        this.y = data.readInt();
        this.z = data.readInt();
        this.entityId = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.getCurrentEquippedItem() != null && playerEntity.getCurrentEquippedItem().getItem() instanceof ItemGun) {
            final ItemGun itemGun = (ItemGun)playerEntity.getCurrentEquippedItem().getItem();
            itemGun.impactX = this.x;
            itemGun.impactY = this.y;
            itemGun.impactZ = this.z;
        }
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received impactpoint packet on client. Disregarding.");
    }
}
