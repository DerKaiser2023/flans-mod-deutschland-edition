// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.teams.ArmourBoxType;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketBuyArmour extends PacketBase
{
    public String boxShortName;
    public String armourShortName;
    public int piece;
    
    public PacketBuyArmour() {
    }
    
    public PacketBuyArmour(final String box, final String armour, final int i) {
        this.boxShortName = box;
        this.armourShortName = armour;
        this.piece = i;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.writeUTF(data, this.boxShortName);
        this.writeUTF(data, this.armourShortName);
        data.writeByte((int)(byte)this.piece);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.boxShortName = this.readUTF(data);
        this.armourShortName = this.readUTF(data);
        this.piece = data.readByte();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final ArmourBoxType box = ArmourBoxType.getBox(this.boxShortName);
        box.block.buyArmour(this.armourShortName, this.piece, playerEntity.field_71071_by);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received armour box purchase packet on client. Skipping.");
    }
}
