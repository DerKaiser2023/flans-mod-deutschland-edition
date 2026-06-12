// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.client.FlansModClient;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Random;

public class PacketFlak extends PacketBase
{
    public static Random rand;
    public double x;
    public double y;
    public double z;
    public int numParticles;
    public String particleType;
    
    public PacketFlak() {
    }
    
    public PacketFlak(final double x1, final double y1, final double z1, final int n, final String s) {
        this.x = x1;
        this.y = y1;
        this.z = z1;
        this.numParticles = n;
        this.particleType = s;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeDouble(this.x);
        data.writeDouble(this.y);
        data.writeDouble(this.z);
        data.writeInt(this.numParticles);
        this.writeUTF(data, this.particleType);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.x = data.readDouble();
        this.y = data.readDouble();
        this.z = data.readDouble();
        this.numParticles = data.readInt();
        this.particleType = this.readUTF(data);
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received flak packet on server. Disregarding.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final World world = clientPlayer.field_70170_p;
        for (int i = 0; i < this.numParticles; ++i) {
            final EntityFX obj = FlansModClient.getParticle(this.particleType, world, this.x + PacketFlak.rand.nextGaussian(), this.y + PacketFlak.rand.nextGaussian(), this.z + PacketFlak.rand.nextGaussian());
            if (obj != null) {
                obj.field_70159_w = PacketFlak.rand.nextGaussian() / 20.0;
                obj.field_70181_x = PacketFlak.rand.nextGaussian() / 20.0;
                obj.field_70179_y = PacketFlak.rand.nextGaussian() / 20.0;
                obj.field_70155_l = 250.0;
                FMLClientHandler.instance().getClient().field_71452_i.func_78873_a(obj);
            }
        }
    }
    
    static {
        PacketFlak.rand = new Random();
    }
}
