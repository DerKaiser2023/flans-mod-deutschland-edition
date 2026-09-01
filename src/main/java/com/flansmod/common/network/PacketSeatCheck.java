// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import com.flansmod.common.FlansMod;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ChatComponentText;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EntitySeat;

public class PacketSeatCheck extends PacketBase
{
    public int entityId;
    public int checkCount;
    
    public PacketSeatCheck() {
    }
    
    public PacketSeatCheck(final EntitySeat seat) {
        this.entityId = seat.getEntityId();
        this.checkCount = 3;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.entityId);
        data.writeInt(this.checkCount);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.entityId = data.readInt();
        this.checkCount = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        log("handleServerSide", (EntityPlayer)playerEntity);
        if (this.checkCount <= 0) {
            final ChatComponentText cct1 = new ChatComponentText("[FlansMod] " + playerEntity.getDisplayName() + " was recovering from a fall. id=" + this.entityId);
            cct1.getChatStyle().setColor(EnumChatFormatting.YELLOW);
            final ChatComponentText cct2 = new ChatComponentText("[FlansMod]================================================");
            cct2.getChatStyle().setColor(EnumChatFormatting.RED);
        }
        else {
            if (playerEntity.ridingEntity instanceof EntitySeat) {
                this.entityId = playerEntity.ridingEntity.getEntityId();
            }
            else {
                this.entityId = -1;
            }
            FlansMod.getPacketHandler().sendTo(this, playerEntity);
        }
    }
    
    private static void log(final String s, final EntityPlayer player) {
        final Entity re = player.ridingEntity;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        log("handleClientSide", clientPlayer);
        if (clientPlayer.ridingEntity == null && this.entityId != -1) {
            if (this.checkCount > 1) {
                --this.checkCount;
            }
            else {
                --this.checkCount;
                final Entity entity = clientPlayer.worldObj.getEntityByID(this.entityId);
                if (entity instanceof EntitySeat) {
                    System.out.println("mount seat :" + clientPlayer.getDisplayName() + " : seatEntityId=" + this.entityId + " : check=" + this.checkCount);
                    clientPlayer.mountEntity(entity);
                }
            }
            FlansMod.getPacketHandler().sendToServer(this);
        }
    }
}
