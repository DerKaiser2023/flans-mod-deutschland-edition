// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.network;

import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.ItemShootable;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.FlansModClient;
import cpw.mods.fml.relauncher.Side;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.PlayerData;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;

public class PacketReload extends PacketBase
{
    public boolean left;
    
    public PacketReload() {
    }
    
    public PacketReload(final boolean l) {
        this.left = l;
    }
    
    @Override
    public void encodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        data.writeBoolean(this.left);
    }
    
    @Override
    public void decodeInto(final ChannelHandlerContext ctx, final ByteBuf data) {
        this.left = data.readBoolean();
    }
    
    @Override
    public void handleServerSide(final EntityPlayerMP playerEntity) {
        final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)playerEntity);
        ItemStack stack = playerEntity.getCurrentEquippedItem();
        if (this.left && data.offHandGunSlot != 0) {
            stack = playerEntity.inventory.getStackInSlot(data.offHandGunSlot - 1);
        }
        if (data != null && stack != null && stack.getItem() instanceof ItemGun) {
            final GunType type = ((ItemGun)stack.getItem()).type;
            boolean empty = true;
            for (int i = 0; i < type.getNumAmmoItemsInGun(stack); ++i) {
                final ItemStack bulletStack = ((ItemGun)stack.getItem()).getBulletItemStack(stack, i);
                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getMetadata() < bulletStack.getMaxDurability()) {
                    empty = false;
                    break;
                }
            }
            if (((ItemGun)stack.getItem()).reload(stack, type, playerEntity.worldObj, (EntityPlayer)playerEntity, true, this.left)) {
                final PlayerData playerData = data;
                final PlayerData playerData2 = data;
                final float n = (float)((int)(type.reloadTime * ((ItemGun)stack.getItem()).pouchMultiplier) + 1);
                playerData2.shootTimeLeft = n;
                playerData.shootTimeRight = n;
                if (this.left) {
                    data.reloadingLeft = true;
                }
                else {
                    data.reloadingRight = true;
                }
                if (type.sidearm) {
                    final PlayerData playerData3 = data;
                    final PlayerData playerData4 = data;
                    final float n2 = (float)((int)(type.reloadTime * ((ItemGun)stack.getItem()).pouchMultiplier) + 1);
                    playerData4.stabTimeLeft = n2;
                    playerData3.stabTimeRight = n2;
                }
                FlansMod.getPacketHandler().sendTo(new PacketReload(this.left), playerEntity);
                String soundToPlay = null;
                final AttachmentType grip = type.getGrip(stack);
                if (type.getSecondaryFire(stack) && grip != null && grip.secondaryReloadSound != null) {
                    soundToPlay = grip.secondaryReloadSound;
                }
                else if (empty && type.reloadSoundOnEmpty != null) {
                    soundToPlay = type.reloadSoundOnEmpty;
                }
                else if (type.reloadSound != null) {
                    soundToPlay = type.reloadSound;
                }
                if (soundToPlay != null) {
                    PacketPlaySound.sendSoundPacket(playerEntity.posX, playerEntity.posY, playerEntity.posZ, type.reloadSoundRange, playerEntity.dimension, soundToPlay, true);
                }
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public void handleClientSide(final EntityPlayer clientPlayer) {
        ItemStack stack = clientPlayer.getCurrentEquippedItem();
        final PlayerData data = PlayerHandler.getPlayerData(clientPlayer, Side.CLIENT);
        if (this.left) {
            stack = clientPlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
        }
        if (stack != null && stack.getItem() instanceof ItemGun) {
            final GunType type = ((ItemGun)stack.getItem()).type;
            if (this.left) {
                FlansModClient.shootTimeLeft = (float)(int)type.getReloadTime(stack);
                if (type.sidearm) {
                    FlansModClient.stabTimeLeft = (int)type.getReloadTime(stack);
                }
            }
            else {
                FlansModClient.shootTimeRight = (float)(int)type.getReloadTime(stack);
                if (type.sidearm) {
                    FlansModClient.stabTimeRight = (int)type.getReloadTime(stack);
                }
            }
            GunAnimations animations = null;
            if (this.left) {
                if (FlansModClient.gunAnimationsLeft.containsKey(clientPlayer)) {
                    animations = FlansModClient.gunAnimationsLeft.get(clientPlayer);
                }
                else {
                    animations = new GunAnimations();
                    FlansModClient.gunAnimationsLeft.put((EntityLivingBase)clientPlayer, animations);
                }
            }
            else if (FlansModClient.gunAnimationsRight.containsKey(clientPlayer)) {
                animations = FlansModClient.gunAnimationsRight.get(clientPlayer);
            }
            else {
                animations = new GunAnimations();
                FlansModClient.gunAnimationsRight.put((EntityLivingBase)clientPlayer, animations);
            }
            final int pumpDelay = (type.model == null) ? 0 : type.model.pumpDelayAfterReload;
            final int pumpTime = (type.model == null) ? 1 : type.model.pumpTime;
            final int chargeDelay = (type.model == null) ? 0 : type.model.chargeDelayAfterReload;
            final int chargeTime = (type.model == null) ? 1 : type.model.chargeTime;
            animations.doReload((int)(type.reloadTime * ((ItemGun)stack.getItem()).pouchMultiplier) + 1, pumpDelay, pumpTime, chargeDelay, chargeTime);
            int bestSlot = -1;
            int bulletsInBestSlot = 0;
            for (int j = 0; j < clientPlayer.inventory.getSizeInventory(); ++j) {
                final ItemStack item = clientPlayer.inventory.getStackInSlot(j);
                if (item != null && item.getItem() instanceof ItemShootable && type.isAmmo(((ItemShootable)item.getItem()).type, stack)) {
                    final int bulletsInThisSlot = item.getMaxDurability() - item.getMetadata();
                    if (bulletsInThisSlot > bulletsInBestSlot) {
                        bestSlot = j;
                        bulletsInBestSlot = bulletsInThisSlot;
                    }
                }
            }
            if (bestSlot != -1) {
                ItemStack newBulletStack = clientPlayer.inventory.getStackInSlot(bestSlot);
                final ShootableType newBulletType = ((ItemShootable)newBulletStack.getItem()).type;
                if (!clientPlayer.capabilities.isCreativeMode) {
                    final ItemStack itemStack = newBulletStack;
                    --itemStack.stackSize;
                }
                if (newBulletStack.stackSize <= 0) {
                    newBulletStack = null;
                }
                clientPlayer.inventory.setInventorySlotContents(bestSlot, newBulletStack);
            }
        }
    }
}
