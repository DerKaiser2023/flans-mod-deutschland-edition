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
            for (int j = 0; j < this.inventory.getSizeInventory(); ++j) {
                final ItemStack stack = this.inventory.getStackInSlot(j);
                if (stack != null && stack.getItem() == check.getItem() && stack.getMetadata() == check.getMetadata()) {
                    numMatchingStuff += stack.stackSize;
                }
            }
            if (numMatchingStuff < check.stackSize) {
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
            int amountLeft = remove.stackSize;
            for (int j = 0; j < this.inventory.getSizeInventory(); ++j) {
                final ItemStack stack = this.inventory.getStackInSlot(j);
                if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getMetadata() == remove.getMetadata()) {
                    amountLeft -= this.inventory.decrStackSize(j, amountLeft).stackSize;
                }
            }
        }
        for (final ItemStack stack2 : this.outputStacks) {
            if (!player.inventory.addItemStackToInventory(stack2)) {
                player.dropPlayerItemWithRandomChoice(stack2, false);
            }
        }
    }
}
