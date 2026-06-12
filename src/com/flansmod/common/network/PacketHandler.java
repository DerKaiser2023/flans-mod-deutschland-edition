// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import java.util.Iterator;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.Packet;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.common.network.FMLOutboundHandler;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Collections;
import java.util.Comparator;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.INetHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import io.netty.buffer.ByteBuf;
import cpw.mods.fml.common.network.NetworkRegistry;
import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.FlansMod;
import java.util.LinkedList;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.relauncher.Side;
import java.util.EnumMap;
import io.netty.channel.ChannelHandler;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import io.netty.handler.codec.MessageToMessageCodec;

@ChannelHandler.Sharable
public class PacketHandler extends MessageToMessageCodec<FMLProxyPacket, PacketBase>
{
    private EnumMap<Side, FMLEmbeddedChannel> channels;
    private LinkedList<Class<? extends PacketBase>> packets;
    private boolean modInitialised;
    
    public PacketHandler() {
        this.packets = new LinkedList<Class<? extends PacketBase>>();
        this.modInitialised = false;
    }
    
    public boolean registerPacket(final Class<? extends PacketBase> cl) {
        if (this.packets.size() > 256) {
            FlansMod.log("Packet limit exceeded in Flan's Mod packet handler by packet " + cl.getCanonicalName() + ".");
            return false;
        }
        if (this.packets.contains(cl)) {
            FlansMod.log("Tried to register " + cl.getCanonicalName() + " packet class twice.");
            return false;
        }
        if (this.modInitialised) {
            FlansMod.log("Tried to register packet " + cl.getCanonicalName() + " after mod initialisation.");
            return false;
        }
        this.packets.add(cl);
        return true;
    }
    
    protected void encode(final ChannelHandlerContext ctx, final PacketBase msg, final List<Object> out) throws Exception {
        final ByteBuf encodedData = Unpooled.buffer();
        final Class<? extends PacketBase> cl = msg.getClass();
        if (!this.packets.contains(cl)) {
            throw new NullPointerException("Packet not registered : " + cl.getCanonicalName());
        }
        final byte discriminator = (byte)this.packets.indexOf(cl);
        encodedData.writeByte((int)discriminator);
        msg.encodeInto(ctx, encodedData);
        final FMLProxyPacket proxyPacket = new FMLProxyPacket(encodedData.copy(), (String)ctx.channel().attr(NetworkRegistry.FML_CHANNEL).get());
        out.add(proxyPacket);
    }
    
    protected void decode(final ChannelHandlerContext ctx, final FMLProxyPacket msg, final List<Object> out) throws Exception {
        final ByteBuf encodedData = msg.payload();
        final byte discriminator = encodedData.readByte();
        final Class<? extends PacketBase> cl = this.packets.get(discriminator);
        if (cl == null) {
            throw new NullPointerException("Packet not registered for discriminator : " + discriminator);
        }
        final PacketBase packet = (PacketBase)cl.newInstance();
        packet.decodeInto(ctx, encodedData.slice());
        switch (FMLCommonHandler.instance().getEffectiveSide()) {
            case CLIENT: {
                packet.handleClientSide(getClientPlayer());
                break;
            }
            case SERVER: {
                final INetHandler netHandler = (INetHandler)ctx.channel().attr(NetworkRegistry.NET_HANDLER).get();
                packet.handleServerSide(((NetHandlerPlayServer)netHandler).field_147369_b);
                break;
            }
        }
    }
    
    public void initialise() {
        this.channels = NetworkRegistry.INSTANCE.newChannel("FlansMod", new ChannelHandler[] { (ChannelHandler)this });
        this.registerPacket(PacketCurrentMissile.class);
        this.registerPacket(PacketAAGunAngles.class);
        this.registerPacket(PacketBaseEdit.class);
        this.registerPacket(PacketBreakSound.class);
        this.registerPacket(PacketBuyArmour.class);
        this.registerPacket(PacketBuyWeapon.class);
        this.registerPacket(PacketCraftDriveable.class);
        this.registerPacket(PacketDriveableControl.class);
        this.registerPacket(PacketDriveableDamage.class);
        this.registerPacket(PacketDriveableGUI.class);
        this.registerPacket(PacketDriveableKey.class);
        this.registerPacket(PacketDriveableKeyHeld.class);
        this.registerPacket(PacketFlak.class);
        this.registerPacket(PacketExplosion.class);
        this.registerPacket(PacketGunFire.class);
        this.registerPacket(PacketGunMode.class);
        this.registerPacket(PacketGunPaint.class);
        this.registerPacket(PacketGunSpread.class);
        this.registerPacket(PacketKillMessage.class);
        this.registerPacket(PacketMechaControl.class);
        this.registerPacket(PacketMGFire.class);
        this.registerPacket(PacketMGMount.class);
        this.registerPacket(PacketOffHandGunInfo.class);
        this.registerPacket(PacketParticle.class);
        this.registerPacket(PacketPlaneControl.class);
        this.registerPacket(PacketPlaySound.class);
        this.registerPacket(PacketReload.class);
        this.registerPacket(PacketRepairDriveable.class);
        this.registerPacket(PacketRoundFinished.class);
        this.registerPacket(PacketSeatUpdates.class);
        this.registerPacket(PacketSeatCheck.class);
        this.registerPacket(PacketSelectOffHandGun.class);
        this.registerPacket(PacketTeamInfo.class);
        this.registerPacket(PacketTeamSelect.class);
        this.registerPacket(PacketVehicleControl.class);
        this.registerPacket(PacketVoteCast.class);
        this.registerPacket(PacketVoting.class);
        this.registerPacket(PacketRequestDebug.class);
        this.registerPacket(PacketFlashBang.class);
        this.registerPacket(PacketImpactPoint.class);
        this.registerPacket(PacketModConfig.class);
        this.registerPacket(PacketGunRecoil.class);
        this.registerPacket(PacketGunState.class);
        this.registerPacket(PacketBlood.class);
        this.registerPacket(PacketChecker.class);
        this.registerPacket(PacketVaccine.class);
    }
    
    public void postInitialise() {
        if (this.modInitialised) {
            return;
        }
        this.modInitialised = true;
        Collections.sort(this.packets, new Comparator<Class<? extends PacketBase>>() {
            @Override
            public int compare(final Class<? extends PacketBase> c1, final Class<? extends PacketBase> c2) {
                int com = String.CASE_INSENSITIVE_ORDER.compare(c1.getCanonicalName(), c2.getCanonicalName());
                if (com == 0) {
                    com = c1.getCanonicalName().compareTo(c2.getCanonicalName());
                }
                return com;
            }
        });
    }
    
    @SideOnly(Side.CLIENT)
    private static EntityPlayer getClientPlayer() {
        return (EntityPlayer)Minecraft.func_71410_x().field_71439_g;
    }
    
    public void sendToAll(final PacketBase packet) {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set((Object)FMLOutboundHandler.OutboundTarget.ALL);
        this.channels.get(Side.SERVER).writeAndFlush((Object)packet);
    }
    
    public void sendTo(final PacketBase packet, final EntityPlayerMP player) {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set((Object)FMLOutboundHandler.OutboundTarget.PLAYER);
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set((Object)player);
        this.channels.get(Side.SERVER).writeAndFlush((Object)packet);
    }
    
    public void sendToAllAround(final PacketBase packet, final NetworkRegistry.TargetPoint point) {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set((Object)FMLOutboundHandler.OutboundTarget.ALLAROUNDPOINT);
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set((Object)point);
        this.channels.get(Side.SERVER).writeAndFlush((Object)packet);
    }
    
    public void sendToDimension(final PacketBase packet, final int dimensionID) {
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGET).set((Object)FMLOutboundHandler.OutboundTarget.DIMENSION);
        this.channels.get(Side.SERVER).attr(FMLOutboundHandler.FML_MESSAGETARGETARGS).set((Object)dimensionID);
        this.channels.get(Side.SERVER).writeAndFlush((Object)packet);
    }
    
    public void sendToServer(final PacketBase packet) {
        this.channels.get(Side.CLIENT).attr(FMLOutboundHandler.FML_MESSAGETARGET).set((Object)FMLOutboundHandler.OutboundTarget.TOSERVER);
        this.channels.get(Side.CLIENT).writeAndFlush((Object)packet);
    }
    
    public void sendToAll(final Packet packet) {
        MinecraftServer.func_71276_C().func_71203_ab().func_148540_a(packet);
    }
    
    public void sendTo(final Packet packet, final EntityPlayerMP player) {
        player.field_71135_a.func_147359_a(packet);
    }
    
    public void sendToAllAround(final Packet packet, final NetworkRegistry.TargetPoint point) {
        MinecraftServer.func_71276_C().func_71203_ab().func_148541_a(point.x, point.y, point.z, point.range, point.dimension, packet);
    }
    
    public void sendToDimension(final Packet packet, final int dimensionID) {
        MinecraftServer.func_71276_C().func_71203_ab().func_148537_a(packet, dimensionID);
    }
    
    public void sendToServer(final Packet packet) {
        Minecraft.func_71410_x().field_71439_g.field_71174_a.func_147297_a(packet);
    }
    
    public void sendToAllAround(final PacketBase packet, final double x, final double y, final double z, final float range, final int dimension) {
        this.sendToAllAround(packet, new NetworkRegistry.TargetPoint(dimension, x, y, z, (double)range));
    }
    
    public void sendToDonut(final PacketBase packet, final double x, final double y, final double z, final float minRange, final float maxRange, final int dimension) {
        List players;
        if (FMLCommonHandler.instance().getSide().isClient()) {
            players = Minecraft.func_71410_x().field_71441_e.field_73010_i;
        }
        else {
            players = MinecraftServer.func_71276_C().func_71203_ab().field_72404_b;
        }
        for (final Object p : players) {
            if (p instanceof EntityPlayerMP) {
                final EntityPlayerMP pl = (EntityPlayerMP)p;
                if (pl.field_71093_bK != dimension) {
                    continue;
                }
                final double dist = Math.sqrt((pl.field_70165_t - x) * (pl.field_70165_t - x) + (pl.field_70163_u - y) * (pl.field_70163_u - y) + (pl.field_70161_v - z) * (pl.field_70161_v - z));
                if (dist <= minRange || dist >= maxRange) {
                    continue;
                }
                this.sendTo(packet, pl);
            }
        }
    }
}
