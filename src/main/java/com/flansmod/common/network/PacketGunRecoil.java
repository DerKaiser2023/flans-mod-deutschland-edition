// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.FlansModClient;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketGunRecoil extends PacketBase
{
    public float recoilPitch;
    public float recoilYaw;
    public float decreaseRecoilPitch;
    public float decreaseRecoilYaw;
    public float sustainedRecoilPitch;
    public float sustainedRecoilYaw;
    
    public PacketGunRecoil() {
    }
    
    public PacketGunRecoil(final float recoilPitch, final float recoilYaw, final float decreaseRecoilPitch, final float decreaseRecoilYaw, final float sustainedRecoilPitch, final float sustainedRecoilYaw) {
        this.recoilPitch = recoilPitch;
        this.recoilYaw = recoilYaw;
        this.decreaseRecoilPitch = decreaseRecoilPitch;
        this.decreaseRecoilYaw = decreaseRecoilYaw;
        this.sustainedRecoilPitch = sustainedRecoilPitch;
        this.sustainedRecoilYaw = sustainedRecoilYaw;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeFloat(this.recoilPitch);
        data.writeFloat(this.recoilYaw);
        data.writeFloat(this.decreaseRecoilPitch);
        data.writeFloat(this.decreaseRecoilYaw);
        data.writeFloat(this.sustainedRecoilPitch);
        data.writeFloat(this.sustainedRecoilYaw);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.recoilPitch = data.readFloat();
        this.recoilYaw = data.readFloat();
        this.decreaseRecoilPitch = data.readFloat();
        this.decreaseRecoilYaw = data.readFloat();
        this.sustainedRecoilPitch = data.readFloat();
        this.sustainedRecoilYaw = data.readFloat();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        if (!clientPlayer.isSneaking()) {
            if (FlansModClient.peepee >= 0.0f && FlansModClient.peepee < 20.0f) {
                FlansModClient.playerRecoilPitch += this.recoilPitch;
                FlansModClient.playerRecoilYaw += this.recoilYaw;
            }
            else if (FlansModClient.peepee >= 20.0f) {
                FlansModClient.playerRecoilPitch += this.recoilPitch + this.sustainedRecoilPitch * ((FlansModClient.peepee - 20.0f) / 80.0f) - this.recoilPitch * ((FlansModClient.peepee - 20.0f) / 80.0f);
                FlansModClient.playerRecoilYaw += this.recoilYaw + this.sustainedRecoilYaw * ((FlansModClient.peepee - 20.0f) / 80.0f) - this.recoilYaw * ((FlansModClient.peepee - 20.0f) / 80.0f);
            }
            if (FlansModClient.peepee < 100.0f) {
                FlansModClient.previousPeepee = FlansModClient.peepee;
                FlansModClient.peepee += 10.0f;
            }
            FlansModClient.sustainedRecoilPitch = this.sustainedRecoilPitch;
            FlansModClient.sustainedRecoilYaw = this.sustainedRecoilYaw;
        }
        else {
            if (FlansModClient.peepee >= 0.0f && FlansModClient.peepee < 20.0f) {
                FlansModClient.playerRecoilPitch += this.recoilPitch / this.decreaseRecoilPitch;
                FlansModClient.playerRecoilYaw += this.recoilYaw / this.decreaseRecoilYaw;
            }
            else if (FlansModClient.peepee >= 20.0f) {
                FlansModClient.playerRecoilPitch += this.recoilPitch / this.decreaseRecoilPitch + this.sustainedRecoilPitch / this.decreaseRecoilPitch * ((FlansModClient.peepee - 20.0f) / 80.0f) - this.recoilPitch / this.decreaseRecoilPitch * ((FlansModClient.peepee - 20.0f) / 80.0f);
                FlansModClient.playerRecoilYaw += this.recoilYaw / this.decreaseRecoilYaw + this.sustainedRecoilYaw / this.decreaseRecoilYaw * ((FlansModClient.peepee - 20.0f) / 80.0f) - this.recoilYaw / this.decreaseRecoilYaw * ((FlansModClient.peepee - 20.0f) / 80.0f);
            }
            if (FlansModClient.peepee < 100.0f) {
                FlansModClient.previousPeepee = FlansModClient.peepee;
                FlansModClient.peepee += 6.0f;
            }
            FlansModClient.sustainedRecoilPitch = this.sustainedRecoilPitch / this.decreaseRecoilPitch;
            FlansModClient.sustainedRecoilYaw = this.sustainedRecoilYaw / this.decreaseRecoilYaw;
        }
    }
}
