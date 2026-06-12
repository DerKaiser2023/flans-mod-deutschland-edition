// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketDriveableGUI extends PacketBase
{
    public int guiID;
    
    public PacketDriveableGUI() {
    }
    
    public PacketDriveableGUI(final int i) {
        this.guiID = i;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.guiID);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.guiID = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        if (playerEntity.field_70154_o != null && playerEntity.field_70154_o instanceof EntitySeat) {
            final EntityDriveable d = ((EntitySeat)playerEntity.field_70154_o).driveable;
            switch (this.guiID) {
                case 0: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 6, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
                case 1: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 7, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
                case 2: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 8, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
                case 3: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 9, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
                case 4: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 10, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
                case 5: {
                    playerEntity.openGui((Object)FlansMod.INSTANCE, 12, playerEntity.field_70170_p, d.field_70176_ah, d.field_70162_ai, d.field_70164_aj);
                    break;
                }
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received GUI open packet on client. Skipping.");
    }
}
