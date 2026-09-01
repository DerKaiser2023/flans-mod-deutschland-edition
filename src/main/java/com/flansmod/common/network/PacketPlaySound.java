// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import com.flansmod.client.FlansModResourceHandler;
import cpw.mods.fml.client.FMLClientHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import java.util.Random;

public class PacketPlaySound extends PacketBase
{
    public static Random rand;
    public float posX;
    public float posY;
    public float posZ;
    public String sound;
    public boolean distort;
    public boolean silenced;
    
    public PacketPlaySound() {
    }
    
    public static void sendSoundPacket(final double x, final double y, final double z, final double range, final int dimension, final String s, final boolean distort) {
        sendSoundPacket(x, y, z, range, dimension, s, distort, false);
    }
    
    public static void sendSoundPacket(final double x, final double y, final double z, final double range, final int dimension, final String s, final boolean distort, final boolean silenced) {
        if (s != null && !s.isEmpty()) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(x, y, z, s, distort, silenced), x, y, z, (float)range, dimension);
        }
    }
    
    public static void sendSoundPacketClient(final String s, final boolean distort, final boolean silenced, final EntityPlayer clientPlayer) {
        if (s != null && !s.isEmpty()) {
            FlansMod.getPacketHandler().sendTo(new PacketPlaySound(1.0, 1.0, 1.0, s, distort, silenced), (EntityPlayerMP)clientPlayer);
        }
    }
    
    public PacketPlaySound(final double x, final double y, final double z, final String s) {
        this(x, y, z, s, false);
    }
    
    public PacketPlaySound(final double x, final double y, final double z, final String s, final boolean distort) {
        this(x, y, z, s, distort, false);
    }
    
    public PacketPlaySound(final double x, final double y, final double z, final String s, final boolean distort, final boolean silenced) {
        this.posX = (float)x;
        this.posY = (float)y;
        this.posZ = (float)z;
        this.sound = s;
        this.distort = distort;
        this.silenced = silenced;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeFloat(this.posX);
        data.writeFloat(this.posY);
        data.writeFloat(this.posZ);
        this.writeUTF(data, this.sound);
        data.writeBoolean(this.distort);
        data.writeBoolean(this.silenced);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.posX = data.readFloat();
        this.posY = data.readFloat();
        this.posZ = data.readFloat();
        this.sound = this.readUTF(data);
        this.distort = data.readBoolean();
        this.silenced = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received play sound packet on server. Skipping.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FMLClientHandler.instance().getClient().func_147118_V().func_147682_a((ISound)new PositionedSoundRecord(FlansModResourceHandler.getSound(this.sound), this.silenced ? 5.0f : 10.0f, (this.distort ? (1.0f / (PacketPlaySound.rand.nextFloat() * 0.4f + 0.8f)) : 1.0f) * (this.silenced ? 2.0f : 1.0f), this.posX, this.posY, this.posZ));
    }
    
    static {
        PacketPlaySound.rand = new Random();
    }
}
