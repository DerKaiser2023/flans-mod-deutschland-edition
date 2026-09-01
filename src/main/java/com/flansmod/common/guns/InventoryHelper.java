// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.world.World;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class InventoryHelper
{
    public static boolean addItemStackToInventory(final IInventory inventory, final ItemStack stack, final boolean creative) {
        if (stack == null) {
            return false;
        }
        if (stack.stackSize == 0) {
            return false;
        }
        try {
            if (stack.isItemDamaged()) {
                final int i = getFirstEmptyStack(inventory);
                if (i >= 0) {
                    final ItemStack stackToAdd = ItemStack.copyItemStack(stack);
                    stackToAdd.animationsToGo = 5;
                    inventory.setInventorySlotContents(i, stackToAdd);
                    stack.stackSize = 0;
                    return true;
                }
                if (creative) {
                    stack.stackSize = 0;
                    return true;
                }
                return false;
            }
            else {
                int i;
                do {
                    i = stack.stackSize;
                    stack.stackSize = storePartialItemStack(inventory, stack);
                } while (stack.stackSize > 0 && stack.stackSize < i);
                if (stack.stackSize == i && creative) {
                    stack.stackSize = 0;
                    return true;
                }
                return stack.stackSize < i;
            }
        }
        catch (final Throwable throwable) {
            throwable.printStackTrace();
            return false;
        }
    }
    
    public static int storeItemStack(final IInventory inventory, final ItemStack stack) {
        for (int i = 0; i < inventory.getSizeInventory(); ++i) {
            final ItemStack oldStack = inventory.getStackInSlot(i);
            if (oldStack != null && oldStack.getItem() == stack.getItem() && oldStack.isStackable() && oldStack.stackSize < oldStack.getMaxStackSize() && oldStack.stackSize < inventory.getInventoryStackLimit() && (!oldStack.getHasSubtypes() || oldStack.getMetadata() == stack.getMetadata()) && ItemStack.areItemStackTagsEqual(oldStack, stack)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int storePartialItemStack(final IInventory inventory, final ItemStack stack) {
        final Item item = stack.getItem();
        int j = stack.stackSize;
        if (stack.getMaxStackSize() == 1) {
            final int k = getFirstEmptyStack(inventory);
            if (k < 0) {
                return j;
            }
            if (inventory.getStackInSlot(k) == null) {
                inventory.setInventorySlotContents(k, ItemStack.copyItemStack(stack));
            }
            return 0;
        }
        else {
            int k = storeItemStack(inventory, stack);
            if (k < 0) {
                k = getFirstEmptyStack(inventory);
            }
            if (k < 0) {
                return j;
            }
            ItemStack oldStack = inventory.getStackInSlot(k);
            if (oldStack == null) {
                oldStack = new ItemStack(item, 0, stack.getMetadata());
                if (stack.hasTagCompound()) {
                    oldStack.setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
                }
                inventory.setInventorySlotContents(k, oldStack);
            }
            int l;
            if ((l = j) > oldStack.getMaxStackSize() - oldStack.stackSize) {
                l = oldStack.getMaxStackSize() - oldStack.stackSize;
            }
            if (l > inventory.getInventoryStackLimit() - oldStack.stackSize) {
                l = inventory.getInventoryStackLimit() - oldStack.stackSize;
            }
            if (l == 0) {
                return j;
            }
            j -= l;
            final ItemStack itemStack = oldStack;
            itemStack.stackSize += l;
            oldStack.animationsToGo = 5;
            return j;
        }
    }
    
    public static int getFirstEmptyStack(final IInventory inventory) {
        for (int i = 0; i < inventory.getSizeInventory(); ++i) {
            if (inventory.getStackInSlot(i) == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static void dropInventoryItems(final World worldIn, final int x, final int y, final int z, final IInventory tileentity) {
    }
}
