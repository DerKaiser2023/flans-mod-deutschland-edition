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
        if (stack.field_77994_a == 0) {
            return false;
        }
        try {
            if (stack.func_77951_h()) {
                final int i = getFirstEmptyStack(inventory);
                if (i >= 0) {
                    final ItemStack stackToAdd = ItemStack.func_77944_b(stack);
                    stackToAdd.field_77992_b = 5;
                    inventory.func_70299_a(i, stackToAdd);
                    stack.field_77994_a = 0;
                    return true;
                }
                if (creative) {
                    stack.field_77994_a = 0;
                    return true;
                }
                return false;
            }
            else {
                int i;
                do {
                    i = stack.field_77994_a;
                    stack.field_77994_a = storePartialItemStack(inventory, stack);
                } while (stack.field_77994_a > 0 && stack.field_77994_a < i);
                if (stack.field_77994_a == i && creative) {
                    stack.field_77994_a = 0;
                    return true;
                }
                return stack.field_77994_a < i;
            }
        }
        catch (final Throwable throwable) {
            throwable.printStackTrace();
            return false;
        }
    }
    
    public static int storeItemStack(final IInventory inventory, final ItemStack stack) {
        for (int i = 0; i < inventory.func_70302_i_(); ++i) {
            final ItemStack oldStack = inventory.func_70301_a(i);
            if (oldStack != null && oldStack.func_77973_b() == stack.func_77973_b() && oldStack.func_77985_e() && oldStack.field_77994_a < oldStack.func_77976_d() && oldStack.field_77994_a < inventory.func_70297_j_() && (!oldStack.func_77981_g() || oldStack.func_77960_j() == stack.func_77960_j()) && ItemStack.func_77970_a(oldStack, stack)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int storePartialItemStack(final IInventory inventory, final ItemStack stack) {
        final Item item = stack.func_77973_b();
        int j = stack.field_77994_a;
        if (stack.func_77976_d() == 1) {
            final int k = getFirstEmptyStack(inventory);
            if (k < 0) {
                return j;
            }
            if (inventory.func_70301_a(k) == null) {
                inventory.func_70299_a(k, ItemStack.func_77944_b(stack));
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
            ItemStack oldStack = inventory.func_70301_a(k);
            if (oldStack == null) {
                oldStack = new ItemStack(item, 0, stack.func_77960_j());
                if (stack.func_77942_o()) {
                    oldStack.func_77982_d((NBTTagCompound)stack.func_77978_p().func_74737_b());
                }
                inventory.func_70299_a(k, oldStack);
            }
            int l;
            if ((l = j) > oldStack.func_77976_d() - oldStack.field_77994_a) {
                l = oldStack.func_77976_d() - oldStack.field_77994_a;
            }
            if (l > inventory.func_70297_j_() - oldStack.field_77994_a) {
                l = inventory.func_70297_j_() - oldStack.field_77994_a;
            }
            if (l == 0) {
                return j;
            }
            j -= l;
            final ItemStack itemStack = oldStack;
            itemStack.field_77994_a += l;
            oldStack.field_77992_b = 5;
            return j;
        }
    }
    
    public static int getFirstEmptyStack(final IInventory inventory) {
        for (int i = 0; i < inventory.func_70302_i_(); ++i) {
            if (inventory.func_70301_a(i) == null) {
                return i;
            }
        }
        return -1;
    }
    
    public static void dropInventoryItems(final World worldIn, final int x, final int y, final int z, final IInventory tileentity) {
    }
}
