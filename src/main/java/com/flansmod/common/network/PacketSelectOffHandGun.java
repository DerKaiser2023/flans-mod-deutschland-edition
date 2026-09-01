// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import com.flansmod.common.PlayerData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;

public class PacketSelectOffHandGun extends PacketBase
{
    public int slot;
    public int entityID;
    
    public PacketSelectOffHandGun() {
    }
    
    public PacketSelectOffHandGun(final int i) {
        this.slot = i;
    }
    
    public PacketSelectOffHandGun(final EntityPlayer player, final int i) {
        this.entityID = player.getEntityId();
        this.slot = i;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeByte(this.slot);
        data.writeInt(this.entityID);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.slot = data.readByte();
        this.entityID = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerEntity, Side.SERVER);
        data.offHandGunSlot = this.slot;
        FlansMod.getPacketHandler().sendToAllAround(new PacketOffHandGunInfo(playerEntity, this.slot), playerEntity.posX, playerEntity.posY, playerEntity.posZ, 50.0f, playerEntity.dimension);
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received off hand gun select packet on client. Skipping. Did you mean to send a PacketOffHandGunInfo?");
    }
}
