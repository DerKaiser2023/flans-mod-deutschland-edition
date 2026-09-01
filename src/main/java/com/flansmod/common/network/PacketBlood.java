// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.TickHandlerClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketBlood extends PacketBase
{
    public float blood;
    public float hemorrhaging;
    public int isBlockingLeft;
    public int isBlockingRight;
    public int isBlockingTop;
    public int isBlockingBottom;
    public int kills;
    
    public PacketBlood() {
    }
    
    public PacketBlood(final float blood, final float hemorrhaging, final int kills) {
        this.blood = blood;
        this.hemorrhaging = hemorrhaging;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeFloat(this.blood);
        data.writeFloat(this.hemorrhaging);
        data.writeInt(this.kills);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.blood = data.readFloat();
        this.hemorrhaging = data.readFloat();
        this.kills = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP player) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        TickHandlerClient.cringeBlood = this.blood;
        TickHandlerClient.cringeHemorrhaging = this.hemorrhaging;
        TickHandlerClient.killsTotal = this.kills;
    }
}
