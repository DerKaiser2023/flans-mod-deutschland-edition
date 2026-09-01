// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.guns.FlansModExplosion;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketExplosion extends PacketBase
{
    public double explosionX;
    public double explosionY;
    public double explosionZ;
    public float explosionSize;
    
    public PacketExplosion() {
    }
    
    public PacketExplosion(final double x1, final double y1, final double z1, final float s) {
        this.explosionX = x1;
        this.explosionY = y1;
        this.explosionZ = z1;
        this.explosionSize = s;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeDouble(this.explosionX);
        data.writeDouble(this.explosionY);
        data.writeDouble(this.explosionZ);
        data.writeFloat(this.explosionSize);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.explosionX = data.readDouble();
        this.explosionY = data.readDouble();
        this.explosionZ = data.readDouble();
        this.explosionSize = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received Explosion packet on server. Disregarding.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansModExplosion.clientExplosion(clientPlayer.field_70170_p, this.explosionSize, this.explosionX, this.explosionY, this.explosionZ);
    }
}
