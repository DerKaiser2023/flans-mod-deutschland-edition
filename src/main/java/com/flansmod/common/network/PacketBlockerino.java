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

public class PacketBlockerino extends PacketBase
{
    public int lefty;
    public int righty;
    public int topy;
    public int bottomy;
    public int minigunSpeed;
    public int entityID;
    
    public PacketBlockerino() {
    }
    
    public PacketBlockerino(final int left, final int right, final int top, final int bottom, final int minigun) {
        this.lefty = left;
        this.righty = right;
        this.topy = top;
        this.bottomy = bottom;
        this.minigunSpeed = minigun;
    }
    
    public PacketBlockerino(final EntityPlayer player, final int left, final int right, final int top, final int bottom, final int minigun) {
        this.entityID = player.getEntityId();
        this.lefty = left;
        this.righty = right;
        this.topy = top;
        this.bottomy = bottom;
        this.minigunSpeed = minigun;
        System.out.println(this.lefty + "public packerino");
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        System.out.println(this.lefty + "was written");
        data.writeByte(this.lefty);
        data.writeByte(this.righty);
        data.writeByte(this.topy);
        data.writeByte(this.bottomy);
        data.writeByte(this.minigunSpeed);
        data.writeInt(this.entityID);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.lefty = data.readByte();
        this.righty = data.readByte();
        this.topy = data.readByte();
        this.bottomy = data.readByte();
        this.minigunSpeed = data.readByte();
        this.entityID = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerEntity, Side.SERVER);
        data.isBlockingLeft = this.lefty;
        data.isBlockingRight = this.righty;
        data.isBlockingTop = this.topy;
        data.isBlockingBottom = this.bottomy;
        data.minigunSpeed = this.minigunSpeed;
        System.out.println(this.lefty + "this one is based packet");
        FlansMod.getPacketHandler().sendToAllAround(new PacketBlockerinoInfo(playerEntity, this.lefty, this.righty, this.topy, this.minigunSpeed), playerEntity.posX, playerEntity.posY, playerEntity.posZ, 25.0f, playerEntity.dimension);
    }
    
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received off hand gun select packet on client. Skipping. Did you mean to send a PacketOffHandGunInfo?");
    }
}
