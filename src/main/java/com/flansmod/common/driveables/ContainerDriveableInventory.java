// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerDriveableInventory extends Container
{
    public InventoryPlayer inventory;
    public World world;
    public EntityDriveable plane;
    public int numItems;
    public int screen;
    public int maxScroll;
    public int scroll;
    public DriveableType type;
    
    public ContainerDriveableInventory(final InventoryPlayer inventoryplayer, final World worldy, final EntityDriveable entPlane, final int i) {
        this.inventory = inventoryplayer;
        this.world = worldy;
        this.plane = entPlane;
        this.type = this.plane.getDriveableType();
        this.screen = i;
        this.numItems = 0;
        switch (i) {
            case 0: {
                this.numItems = this.plane.driveableData.numGuns;
                this.maxScroll = ((this.numItems > 3) ? (this.numItems - 3) : 0);
                break;
            }
            case 1: {
                this.numItems = this.plane.getDriveableType().numBombSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
            case 2: {
                this.numItems = this.plane.getDriveableType().numCargoSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
            case 3: {
                this.numItems = this.plane.getDriveableType().numMissileSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
        }
        switch (this.screen) {
            case 0: {
                int slotsDone = 0;
                for (int j = 0; j < this.plane.driveableData.numGuns; ++j) {
                    int yPos = -1000;
                    if (slotsDone < 3 + this.scroll && slotsDone >= this.scroll) {
                        yPos = 25 + 19 * slotsDone;
                    }
                    this.addSlotToContainer((Slot)new SlotDriveableAmmunition((IInventory)this.plane.driveableData, j, 29, yPos, this.type.filterAmmunition));
                    ++slotsDone;
                }
                break;
            }
            case 1:
            case 2:
            case 3: {
                int startSlot = this.plane.driveableData.getBombInventoryStart();
                if (this.screen == 2) {
                    startSlot = this.plane.driveableData.getCargoInventoryStart();
                }
                if (this.screen == 3) {
                    startSlot = this.plane.driveableData.getMissileInventoryStart();
                }
                for (int m = (this.numItems + 7) / 8, row = 0; row < m; ++row) {
                    int yPos2 = -1000;
                    if (row < 3 + this.scroll && row >= this.scroll) {
                        yPos2 = 25 + 19 * (row - this.scroll);
                    }
                    for (int col = 0; col < (((row + this.scroll + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                        this.addSlotToContainer((Slot)new SlotDriveableAmmunition((IInventory)this.plane.driveableData, startSlot + row * 8 + col, 10 + 18 * col, yPos2, this.type.filterAmmunition));
                    }
                }
                break;
            }
        }
        for (int row2 = 0; row2 < 3; ++row2) {
            for (int col2 = 0; col2 < 9; ++col2) {
                this.addSlotToContainer(new Slot((IInventory)inventoryplayer, col2 + row2 * 9 + 9, 8 + col2 * 18, 98 + row2 * 18));
            }
        }
        for (int col3 = 0; col3 < 9; ++col3) {
            this.addSlotToContainer(new Slot((IInventory)inventoryplayer, col3, 8 + col3 * 18, 156));
        }
    }
    
    public void updateScroll(final int scrololol) {
        this.scroll = scrololol;
        switch (this.screen) {
            case 0: {
                int slotsDone = 0;
                for (int i = 0; i < this.plane.driveableData.numGuns; ++i) {
                    int yPos = -1000;
                    if (slotsDone < 3 + this.scroll && slotsDone >= this.scroll) {
                        yPos = 25 + 19 * (slotsDone - this.scroll);
                    }
                    ((Slot) this.inventorySlots.get(slotsDone)).yDisplayPosition = yPos;
                    ++slotsDone;
                }
                break;
            }
            case 1:
            case 2:
            case 3: {
                for (int m = (this.numItems + 7) / 8, row = 0; row < m; ++row) {
                    int yPos = -1000;
                    if (row < 3 + this.scroll && row >= this.scroll) {
                        yPos = 25 + 19 * (row - this.scroll);
                    }
                    for (int col = 0; col < (((row + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                        ((Slot) this.inventorySlots.get(row * 8 + col)).yDisplayPosition = yPos;
                    }
                }
                break;
            }
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
            if (slotID >= this.numItems) {
                if (!this.mergeItemStack(slotStack, 0, this.numItems, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(slotStack, this.numItems, this.inventorySlots.size(), true)) {
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
    
    protected boolean mergeItemStack(final ItemStack stack, final int startIndex, final int endIndex, final boolean reverseDirection) {
        boolean flag = false;
        int i = startIndex;
        if (reverseDirection) {
            i = endIndex - 1;
        }
        if (stack.isStackable()) {
            while (stack.stackSize > 0 && ((!reverseDirection && i < endIndex) || (reverseDirection && i >= startIndex))) {
                final Slot slot = (Slot) this.inventorySlots.get(i);
                final ItemStack itemstack = slot.getStack();
                final int maxLimit = Math.min(stack.getMaxStackSize(), slot.getSlotStackLimit());
                if (itemstack != null && ItemStack.areItemStacksEqual(stack, itemstack)) {
                    final int j = itemstack.stackSize + stack.stackSize;
                    if (j <= maxLimit) {
                        stack.stackSize = 0;
                        itemstack.stackSize = j;
                        slot.onSlotChanged();
                        flag = true;
                    }
                    else if (itemstack.stackSize < maxLimit) {
                        stack.stackSize = maxLimit;
                        itemstack.stackSize = maxLimit;
                        slot.onSlotChanged();
                        flag = true;
                    }
                }
                if (reverseDirection) {
                    --i;
                }
                else {
                    ++i;
                }
            }
        }
        if (stack.stackSize > 0) {
            if (reverseDirection) {
                i = endIndex - 1;
            }
            else {
                i = startIndex;
            }
            while ((!reverseDirection && i < endIndex) || (reverseDirection && i >= startIndex)) {
                final Slot slot2 = (Slot) this.inventorySlots.get(i);
                ItemStack itemstack2 = slot2.getStack();
                if (itemstack2 == null && slot2.isItemValid(stack)) {
                    if (stack.stackSize <= slot2.getSlotStackLimit()) {
                        slot2.putStack(stack.copy());
                        slot2.onSlotChanged();
                        stack.stackSize = 0;
                        flag = true;
                        break;
                    }
                    itemstack2 = stack.copy();
                    stack.stackSize -= slot2.getSlotStackLimit();
                    itemstack2.stackSize = slot2.getSlotStackLimit();
                    slot2.putStack(itemstack2);
                    slot2.onSlotChanged();
                    flag = true;
                }
                if (reverseDirection) {
                    --i;
                }
                else {
                    ++i;
                }
            }
        }
        return flag;
    }
}
