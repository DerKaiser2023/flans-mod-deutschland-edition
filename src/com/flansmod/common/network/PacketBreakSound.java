// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.block.Block;

public class PacketBreakSound extends PacketBase
{
    public int x;
    public int y;
    public int z;
    public int blockID;
    
    public PacketBreakSound() {
    }
    
    public PacketBreakSound(final int x, final int y, final int z, final Block block) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.blockID = Block.func_149682_b(block);
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeInt(this.x);
        data.writeInt(this.y);
        data.writeInt(this.z);
        data.writeInt(this.blockID);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.x = data.readInt();
        this.y = data.readInt();
        this.z = data.readInt();
        this.blockID = data.readInt();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        FlansMod.log("Received block break sound packet on server. Skipping.");
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final Block block = Block.func_149729_e(this.blockID);
        FMLClientHandler.instance().getClient().field_71452_i.func_78867_a(this.x, this.y, this.z, 1);
        FMLClientHandler.instance().getClient().func_147118_V().func_147682_a((ISound)new PositionedSoundRecord(new ResourceLocation(block.field_149762_H.func_150495_a()), this.x + 0.5f, this.y + 0.5f, this.z + 0.5f, (block.field_149762_H.func_150497_c() + 1.0f) / 2.0f, block.field_149762_H.func_150494_d() * 0.8f));
    }
}
