// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.driveables.EnumDriveablePart;

public class PacketRepairDriveable extends PacketBase
{
    public String shortName;
    
    public PacketRepairDriveable() {
    }
    
    public PacketRepairDriveable(final EnumDriveablePart part) {
        this.shortName = part.getShortName();
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.writeUTF(data, this.shortName);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.shortName = this.readUTF(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final EnumDriveablePart part = EnumDriveablePart.getPart(this.shortName);
        FlansMod.proxy.repairDriveable((EntityPlayer)playerEntity, ((EntitySeat)playerEntity.field_70154_o).driveable, ((EntitySeat)playerEntity.field_70154_o).driveable.getDriveableData().parts.get(part));
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received driveable repair packet on client side. Skipping.");
    }
}
