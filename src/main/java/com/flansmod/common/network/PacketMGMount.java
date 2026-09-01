// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.guns.EntityMG;
import net.minecraft.entity.player.EntityPlayer;

public class PacketMGMount extends PacketBase
{
    public int playerEntityId;
    public int mgEntityId;
    public boolean mounting;
    
    public PacketMGMount() {
    }
    
    public PacketMGMount(final EntityPlayer player, final EntityMG mg, final boolean mounting) {
        this.playerEntityId = player.func_145782_y();
        this.mgEntityId = mg.func_145782_y();
        this.mounting = mounting;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.playerEntityId);
        data.writeInt(this.mgEntityId);
        data.writeBoolean(this.mounting);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.playerEntityId = data.readInt();
        this.mgEntityId = data.readInt();
        this.mounting = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received MG mount packet on server. Skipping.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final EntityPlayer player = (EntityPlayer)clientPlayer.field_70170_p.func_73045_a(this.playerEntityId);
        final EntityMG mg = (EntityMG)clientPlayer.field_70170_p.func_73045_a(this.mgEntityId);
        if (mg != null && player != null) {
            mg.mountGun(player, this.mounting);
        }
    }
}
