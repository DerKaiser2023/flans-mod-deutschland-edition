// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerDriveableMenu extends Container
{
    public EntityDriveable plane;
    public boolean isFuel;
    public InventoryPlayer inventory;
    public World world;
    
    public ContainerDriveableMenu(final InventoryPlayer inventoryplayer, final World worldy) {
        this(inventoryplayer, worldy, false, null);
    }
    
    public ContainerDriveableMenu(final InventoryPlayer inventoryplayer, final World worldy, final boolean fuel, final EntityDriveable planey) {
        this.inventory = inventoryplayer;
        this.world = worldy;
        this.plane = planey;
        this.isFuel = fuel;
        if (this.isFuel) {
            this.addSlotToContainer(new Slot((IInventory)this.plane.driveableData, this.plane.driveableData.getFuelSlot(), 35, 44));
        }
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlotToContainer(new Slot((IInventory)inventoryplayer, col + row * 9 + 9, 8 + col * 18, 79 + (this.isFuel ? 0 : 19) + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.addSlotToContainer(new Slot((IInventory)inventoryplayer, col2, 8 + col2 * 18, 137 + (this.isFuel ? 0 : 19)));
        }
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
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
