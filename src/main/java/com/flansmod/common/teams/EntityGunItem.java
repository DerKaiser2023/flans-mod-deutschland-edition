// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.Entity;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import com.flansmod.common.guns.GunType;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.guns.ItemShootable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.block.Block;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraft.util.MathHelper;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.util.AxisAlignedBB;
import java.util.Iterator;
import com.flansmod.common.guns.ItemBullet;
import java.util.ArrayList;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.entity.item.EntityItem;

public class EntityGunItem extends EntityItem
{
    public List<ItemStack> ammoStacks;
    
    public EntityGunItem(final World w) {
        super(w);
    }
    
    public EntityGunItem(final EntityItem entity) {
        super(entity.worldObj, entity.posX, entity.posY, entity.posZ, entity.getEntityItem().copy());
        this.setSize(1.0f, 1.0f);
        this.ammoStacks = new ArrayList<ItemStack>();
    }
    
    public EntityGunItem(final World w, final double x, final double y, final double z, final ItemStack stack, final List<ItemStack> stacks) {
        super(w, x, y, z, stack);
        this.setSize(1.0f, 1.0f);
        this.ammoStacks = new ArrayList<ItemStack>();
        for (final ItemStack ammoStack : stacks) {
            if (ammoStack != null && ammoStack.getItem() != null && ammoStack.getItem() instanceof ItemBullet) {
                this.ammoStacks.add(ammoStack);
            }
        }
    }
    
    public EntityGunItem(final World w, final double x, final double y, final double z) {
        super(w, x, y, z);
    }
    
    public boolean canBeCollidedWith() {
        return true;
    }
    
    protected boolean canTriggerWalking() {
        return true;
    }
    
    public AxisAlignedBB getBoundingBox() {
        return null;
    }
    
    public void onUpdate() {
        this.onEntityUpdate();
        if (this.getEntityItem() == null || this.getEntityItem().getItem() == null || !(this.getEntityItem().getItem() instanceof ItemGun)) {
            this.setDead();
        }
        if (!this.worldObj.isRemote && this.ammoStacks == null) {
            this.setDead();
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033;
        this.pushOutOfBlocks(this.posX, (this.boundingBox.minY + this.boundingBox.maxY) / 2.0, this.posZ);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        float var2 = 0.98f;
        if (this.onGround) {
            var2 = 0.58800006f;
            final Block block = this.worldObj.getBlock(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.boundingBox.minY) - 1, MathHelper.floor_double(this.posZ));
            if (block != null) {
                var2 = block.slipperiness * 0.98f;
            }
        }
        this.motionX *= var2;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= var2;
        if (this.onGround) {
            this.motionY *= -0.5;
        }
        ++this.age;
        final ItemStack item = this.getDataWatcher().getWatchableObjectItemStack(10);
        if (!this.worldObj.isRemote && this.age >= this.lifespan) {
            if (item != null) {
                final ItemExpireEvent event = new ItemExpireEvent((EntityItem)this, (item.getItem() == null) ? 6000 : item.getItem().getEntityLifespan(item, this.worldObj));
                if (MinecraftForge.EVENT_BUS.post((Event)event)) {
                    this.lifespan += event.extraLife;
                }
                else {
                    this.setDead();
                }
            }
            else {
                this.setDead();
            }
        }
        if (item != null && item.stackSize <= 0) {
            this.setDead();
        }
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final float par2) {
        return false;
    }
    
    public void onCollideWithPlayer(final EntityPlayer player) {
        if (!this.worldObj.isRemote && this.ammoStacks != null && this.ammoStacks.size() > 0) {
            for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
                final ItemStack stack = player.inventory.getStackInSlot(i);
                if (stack != null && stack.getItem() != null && stack.getItem() instanceof ItemGun) {
                    final GunType type = ((ItemGun)stack.getItem()).type;
                    for (int j = this.ammoStacks.size() - 1; j >= 0; --j) {
                        final ItemStack ammoStack = this.ammoStacks.get(j);
                        if (type.isAmmo(((ItemShootable)ammoStack.getItem()).type, stack) && player.inventory.addItemStackToInventory(ammoStack)) {
                            FMLCommonHandler.instance().firePlayerItemPickupEvent(player, (EntityItem)this);
                            this.playSound("random.pop", 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                            this.ammoStacks.remove(j);
                        }
                    }
                    if (this.ammoStacks.size() == 0) {
                        this.setDead();
                    }
                }
            }
        }
    }
    
    public boolean interactFirst(final EntityPlayer player) {
        if (this.worldObj.isRemote) {
            return true;
        }
        final EntityItemPickupEvent event = new EntityItemPickupEvent(player, (EntityItem)this);
        TeamsManager.getInstance().playerLoot(event);
        if (!event.isCanceled()) {
            final ItemStack currentItem = player.getCurrentEquippedItem();
            if (currentItem != null && currentItem.getItem() instanceof ItemGun) {
                final GunType gunType = ((ItemGun)currentItem.getItem()).type;
                final List<ItemStack> newAmmoStacks = new ArrayList<ItemStack>();
                for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
                    final ItemStack stack = player.inventory.getStackInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemShootable) {
                        final ShootableType bulletType = ((ItemShootable)stack.getItem()).type;
                        if (gunType.isAmmo(bulletType, currentItem)) {
                            newAmmoStacks.add(stack.copy());
                            player.inventory.setInventorySlotContents(i, (ItemStack)null);
                        }
                    }
                }
                final EntityGunItem newGunItem = new EntityGunItem(this.worldObj, this.posX, this.posY, this.posZ, currentItem.copy(), newAmmoStacks);
                this.worldObj.spawnEntityInWorld((Entity)newGunItem);
                player.inventory.setInventorySlotContents(player.inventory.currentItem, this.getEntityItem());
                for (final ItemStack stack2 : this.ammoStacks) {
                    player.inventory.addItemStackToInventory(stack2);
                }
                this.setDead();
                PlayerHandler.getPlayerData(player).shootClickDelay = 10;
                PlayerHandler.getPlayerData(player).isShootingRight = false;
                return true;
            }
        }
        return false;
    }
    
    public boolean canAttackWithItem() {
        return false;
    }
    
    public boolean isBurning() {
        return false;
    }
}
