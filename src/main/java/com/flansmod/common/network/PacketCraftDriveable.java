// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketCraftDriveable extends PacketBase
{
    public String shortName;
    
    public PacketCraftDriveable() {
    }
    
    public PacketCraftDriveable(final String s) {
        this.shortName = s;
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
        final DriveableType type = DriveableType.getDriveable(this.shortName);
        FlansMod.proxy.craftDriveable((EntityPlayer)playerEntity, type);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received driveable repair packet on client side. Skipping.");
    }
}
