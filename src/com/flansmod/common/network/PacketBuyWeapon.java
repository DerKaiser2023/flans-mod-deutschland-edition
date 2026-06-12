// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.boxes.GunBoxType;

public class PacketBuyWeapon extends PacketBase
{
    public String boxShortName;
    public String itemShortName;
    
    public PacketBuyWeapon() {
    }
    
    public PacketBuyWeapon(final GunBoxType box, final InfoType type) {
        this.boxShortName = box.shortName;
        this.itemShortName = type.shortName;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.writeUTF(data, this.boxShortName);
        this.writeUTF(data, this.itemShortName);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.boxShortName = this.readUTF(data);
        this.itemShortName = this.readUTF(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final GunBoxType box = GunBoxType.getBox(this.boxShortName);
        box.block.buyGun(InfoType.getType(this.itemShortName), playerEntity.field_71071_by, box);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("Received gun box purchase packet on client. Skipping.");
    }
}
