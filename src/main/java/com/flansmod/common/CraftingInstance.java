// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import java.util.Arrays;
import java.util.ArrayList;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.inventory.IInventory;

public class CraftingInstance
{
    public IInventory inventory;
    public List<ItemStack> requiredStacks;
    public List<ItemStack> outputStacks;
    public boolean craftingSuccessful;
    
    public CraftingInstance(final IInventory i, final List<ItemStack> in, final List<ItemStack> out) {
        this.inventory = i;
        this.requiredStacks = in;
        this.outputStacks = out;
    }
    
    public CraftingInstance(final IInventory i, final ArrayList<ItemStack> in, final ItemStack out) {
        this(i, in, Arrays.asList(out));
    }
    
    public boolean canCraft() {
        this.craftingSuccessful = true;
        for (final ItemStack check : this.requiredStacks) {
            int numMatchingStuff = 0;
            for (int j = 0; j < this.inventory.func_70302_i_(); ++j) {
                final ItemStack stack = this.inventory.func_70301_a(j);
                if (stack != null && stack.func_77973_b() == check.func_77973_b() && stack.func_77960_j() == check.func_77960_j()) {
                    numMatchingStuff += stack.field_77994_a;
                }
            }
            if (numMatchingStuff < check.field_77994_a) {
                this.craftingSuccessful = false;
            }
        }
        return this.craftingSuccessful;
    }
    
    public void craft(final EntityPlayer player) {
        if (!this.craftingSuccessful) {
            return;
        }
        for (final ItemStack remove : this.requiredStacks) {
            int amountLeft = remove.field_77994_a;
            for (int j = 0; j < this.inventory.func_70302_i_(); ++j) {
                final ItemStack stack = this.inventory.func_70301_a(j);
                if (amountLeft > 0 && stack != null && stack.func_77973_b() == remove.func_77973_b() && stack.func_77960_j() == remove.func_77960_j()) {
                    amountLeft -= this.inventory.func_70298_a(j, amountLeft).field_77994_a;
                }
            }
        }
        for (final ItemStack stack2 : this.outputStacks) {
            if (!player.field_71071_by.func_70441_a(stack2)) {
                player.func_71019_a(stack2, false);
            }
        }
    }
}
