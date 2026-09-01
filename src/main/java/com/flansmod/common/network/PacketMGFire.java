// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.EntityAAGun;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketMGFire extends PacketBase
{
    public boolean held;
    
    public PacketMGFire() {
    }
    
    public PacketMGFire(final boolean h) {
        this.held = h;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.held);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.held = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer)playerEntity).mountingGun;
        if (mg != null) {
            mg.mouseHeld(this.held);
        }
        else if (playerEntity.ridingEntity instanceof EntityAAGun) {
            ((EntityAAGun)playerEntity.ridingEntity).setMouseHeld(this.held);
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.log("MG firing packet received on client. Skipping.");
    }
}
