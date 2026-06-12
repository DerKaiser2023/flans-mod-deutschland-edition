// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketParticle extends PacketBase
{
    public float x;
    public float y;
    public float z;
    public float mx;
    public float my;
    public float mz;
    public String particleType;
    
    public PacketParticle() {
    }
    
    public PacketParticle(final String s, final double x1, final double y1, final double z1, final double x2, final double y2, final double z2) {
        this.x = (float)x1;
        this.y = (float)y1;
        this.z = (float)z1;
        this.mx = (float)x2;
        this.my = (float)y2;
        this.mz = (float)z2;
        this.particleType = s;
    }
    
    public PacketParticle(final String s, final double x1, final double y1, final double z1, final double x2, final double y2, final double z2, final int time) {
        this.x = (float)x1;
        this.y = (float)y1;
        this.z = (float)z1;
        this.mx = (float)x2;
        this.my = (float)y2;
        this.mz = (float)z2;
        this.particleType = s;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeFloat(this.x);
        data.writeFloat(this.y);
        data.writeFloat(this.z);
        data.writeFloat(this.mx);
        data.writeFloat(this.my);
        data.writeFloat(this.mz);
        this.writeUTF(data, this.particleType);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.x = data.readFloat();
        this.y = data.readFloat();
        this.z = data.readFloat();
        this.mx = data.readFloat();
        this.my = data.readFloat();
        this.mz = data.readFloat();
        this.particleType = this.readUTF(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received particle packet on server. Disregarding.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.proxy.spawnParticle(this.particleType, this.x, this.y, this.z, this.mx, this.my, this.mz);
    }
}
