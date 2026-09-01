// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.boxes;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerGunBox extends Container
{
    public InventoryPlayer playerInv;
    public World world;
    
    public ContainerGunBox(final InventoryPlayer i, final World w) {
        this.playerInv = i;
        this.world = w;
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlotToContainer(new Slot((IInventory)i, col + row * 9 + 9, 57 + col * 18, 151 + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.addSlotToContainer(new Slot((IInventory)i, col2, 57 + col2 * 18, 209));
        }
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer player, final int slotID) {
        ItemStack stack = null;
        final Slot currentSlot = (Slot) this.inventorySlots.get(slotID);
        if (currentSlot != null && currentSlot.getHasStack()) {
            final ItemStack slotStack = currentSlot.getStack();
            stack = slotStack.copy();
            if (slotID != 0) {
                if (!this.mergeItemStack(slotStack, 0, 1, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(slotStack, 1, this.inventorySlots.size(), true)) {
                return null;
            }
            if (slotStack.stackSize == 0) {
                currentSlot.putStack((ItemStack)null);
            }
            else {
                currentSlot.onSlotChanged();
            }
            if (slotStack.stackSize == stack.stackSize) {
                return null;
            }
            currentSlot.onPickupFromSlot(player, slotStack);
        }
        return stack;
    }
}
