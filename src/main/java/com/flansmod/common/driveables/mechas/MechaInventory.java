// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.item.Item;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import net.minecraft.inventory.IInventory;

public class MechaInventory implements IInventory
{
    public EntityMecha mecha;
    public HashMap<EnumMechaSlotType, ItemStack> stacks;
    
    public MechaInventory(final EntityMecha m) {
        this.mecha = m;
        this.stacks = new HashMap<EnumMechaSlotType, ItemStack>();
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            this.stacks.put(type, null);
        }
    }
    
    public MechaInventory(final EntityMecha m, final NBTTagCompound tags) {
        this(m);
        this.readFromNBT(tags);
    }
    
    public void readFromNBT(final NBTTagCompound tags) {
        if (tags == null) {
            return;
        }
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            try {
                this.stacks.put(type, ItemStack.loadItemStackFromNBT(tags.getCompoundTag(type.toString())));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound tags) {
        if (tags == null) {
            return null;
        }
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            if (this.stacks.get(type) != null) {
                tags.setTag(type.toString(), (NBTBase)((ItemStack)this.stacks.get(type)).writeToNBT(new NBTTagCompound()));
            }
        }
        return tags;
    }
    
    public int getSizeInventory() {
        return EnumMechaSlotType.values().length;
    }
    
    public ItemStack getStackInSlot(final int i) {
        return this.stacks.get(EnumMechaSlotType.values()[i]);
    }
    
    public ItemStack getStackInSlot(final EnumMechaSlotType e) {
        return this.stacks.get(e);
    }
    
    public ItemStack decrStackSize(final int i, final int j) {
        this.markDirty();
        ItemStack slot = this.getStackInSlot(i);
        if (slot == null) {
            return null;
        }
        final int numToTake = Math.min(j, slot.stackSize);
        final ItemStack returnStack = slot.copy();
        returnStack.stackSize = numToTake;
        final ItemStack itemStack = slot;
        itemStack.stackSize -= numToTake;
        if (slot.stackSize <= 0) {
            slot = null;
        }
        this.setInventorySlotContents(i, slot);
        return returnStack;
    }
    
    public ItemStack getStackInSlotOnClosing(final int i) {
        return this.getStackInSlot(i);
    }
    
    public void setInventorySlotContents(final int i, final ItemStack itemstack) {
        this.setInventorySlotContents(EnumMechaSlotType.values()[i], itemstack);
    }
    
    public void setInventorySlotContents(final EnumMechaSlotType e, final ItemStack itemstack) {
        this.markDirty();
        this.stacks.put(e, itemstack);
    }
    
    public String getInventoryName() {
        return "Mecha";
    }
    
    public boolean isCustomInventoryName() {
        return true;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public void markDirty() {
        if (this.mecha != null) {
            this.mecha.couldNotFindFuel = false;
        }
    }
    
    public boolean isUseableByPlayer(final EntityPlayer entityplayer) {
        return this.mecha != null && entityplayer.getDistanceToEntity((Entity)this.mecha) <= 10.0;
    }
    
    public void openChest() {
    }
    
    public void closeChest() {
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        final Item item = itemstack.getItem();
        if (item == null) {
            return true;
        }
        switch (EnumMechaSlotType.values()[i]) {
            case leftTool:
            case rightTool: {
                return item instanceof ItemGun || item instanceof ItemMechaAddon;
            }
            case leftArm:
            case rightArm: {
                return item instanceof ItemBullet;
            }
            default: {
                return false;
            }
        }
    }
}
