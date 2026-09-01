// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.FlansMod;

public class PacketModConfig extends PacketBase
{
    public boolean hitCrossHairEnable;
    public boolean bulletGuiEnable;
    public boolean crosshairEnable;
    public boolean gunCarryLimitEnable;
    public int gunCarryLimit;
    public float driveableUpdateRange;
    
    public PacketModConfig() {
        this.hitCrossHairEnable = FlansMod.hitCrossHairEnable;
        this.bulletGuiEnable = FlansMod.bulletGuiEnable;
        this.crosshairEnable = FlansMod.crosshairEnable;
        this.gunCarryLimitEnable = FlansMod.gunCarryLimitEnable;
        this.gunCarryLimit = FlansMod.gunCarryLimit;
        this.driveableUpdateRange = FlansMod.driveableUpdateRange;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.hitCrossHairEnable);
        data.writeBoolean(this.bulletGuiEnable);
        data.writeBoolean(this.crosshairEnable);
        data.writeBoolean(this.gunCarryLimitEnable);
        data.writeInt(this.gunCarryLimit);
        data.writeFloat(this.driveableUpdateRange);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.hitCrossHairEnable = data.readBoolean();
        this.bulletGuiEnable = data.readBoolean();
        this.crosshairEnable = data.readBoolean();
        this.gunCarryLimitEnable = data.readBoolean();
        this.gunCarryLimit = data.readInt();
        this.driveableUpdateRange = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        FlansMod.hitCrossHairEnable = this.hitCrossHairEnable;
        FlansMod.bulletGuiEnable = this.bulletGuiEnable;
        FlansMod.crosshairEnable = this.crosshairEnable;
        FlansMod.gunCarryLimitEnable = this.gunCarryLimitEnable;
        FlansMod.gunCarryLimit = this.gunCarryLimit;
        FlansMod.driveableUpdateRange = this.driveableUpdateRange;
        FlansMod.log("Config synced successfully");
    }
}
