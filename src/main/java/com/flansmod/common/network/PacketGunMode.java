// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.PlayerData;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import com.flansmod.common.guns.EnumFireMode;

public class PacketGunMode extends PacketBase
{
    private int handle;
    public EnumFireMode mode;
    public boolean isInSecondary;
    
    public PacketGunMode() {
        this.mode = EnumFireMode.SEMIAUTO;
    }
    
    public PacketGunMode(final int aHandle) {
        this.mode = EnumFireMode.SEMIAUTO;
        this.handle = aHandle;
    }
    
    public PacketGunMode(final EnumFireMode md) {
        this.mode = EnumFireMode.SEMIAUTO;
        this.mode = md;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeByte(this.mode.ordinal());
        data.writeByte(this.handle);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        final int i = data.readByte();
        if (i < EnumFireMode.values().length) {
            this.mode = EnumFireMode.values()[i];
        }
        this.handle = data.readByte();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final ItemStack itemStack = playerEntity.field_71071_by.func_70448_g();
        if (this.handle == 1) {
            if (itemStack != null && itemStack.func_77973_b() instanceof ItemGun) {
                final ItemGun gun = (ItemGun)itemStack.func_77973_b();
                EnumFireMode nextMode;
                final EnumFireMode currentMode = nextMode = gun.type.getFireMode(itemStack);
                final EnumFireMode[] submode = gun.type.submode;
                for (int i = 0; i < submode.length; ++i) {
                    if (currentMode == submode[i]) {
                        nextMode = submode[(i + 1) % submode.length];
                        break;
                    }
                }
                if (currentMode != nextMode) {
                    gun.type.setFireMode(itemStack, nextMode.ordinal());
                    FlansMod.getPacketHandler().sendTo(new PacketGunMode(nextMode), playerEntity);
                }
            }
        }
        else {
            final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerEntity);
            if (itemStack != null && itemStack.func_77973_b() instanceof ItemGun) {
                final GunType type = ((ItemGun)itemStack.func_77973_b()).type;
                final AttachmentType attachment = type.getGrip(itemStack);
                if (attachment != null && attachment.secondaryFire) {
                    final boolean mode = type.getSecondaryFire(itemStack);
                    ((ItemGun)itemStack.func_77973_b()).type.setSecondaryFire(itemStack, !mode);
                    if (attachment.toggleSound != null) {
                        PacketPlaySound.sendSoundPacket(playerEntity.field_70165_t, playerEntity.field_70163_u, playerEntity.field_70161_v, type.reloadSoundRange, playerEntity.field_71093_bK, attachment.toggleSound, true);
                    }
                }
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        final ItemStack itemStack = clientPlayer.field_71071_by.func_70448_g();
        if (this.handle == 1) {
            if (itemStack != null && itemStack.func_77973_b() instanceof ItemGun) {
                ((ItemGun)itemStack.func_77973_b()).type.setFireMode(itemStack, this.mode.ordinal());
            }
        }
        else {
            final GunType type = ((ItemGun)itemStack.func_77973_b()).type;
            final AttachmentType attachment = type.getGrip(itemStack);
            if (attachment != null && attachment.secondaryFire) {
                final boolean mode = type.getSecondaryFire(itemStack);
                ((ItemGun)itemStack.func_77973_b()).type.setSecondaryFire(itemStack, !mode);
            }
        }
    }
}
