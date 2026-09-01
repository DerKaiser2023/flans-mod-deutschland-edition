// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerPaintjobTable extends Container
{
    public InventoryPlayer playerInv;
    public TileEntityPaintjobTable table;
    public World world;
    
    public ContainerPaintjobTable(final InventoryPlayer i, final World w, final TileEntityPaintjobTable te) {
        this.playerInv = i;
        this.world = w;
        this.table = te;
        this.addSlotToContainer(new Slot((IInventory)this.table, 0, 187, 139));
        this.addSlotToContainer(new Slot((IInventory)this.table, 1, 187, 193));
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.addSlotToContainer(new Slot((IInventory)this.playerInv, col + row * 9 + 9, 8 + col * 18, 184 + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.addSlotToContainer(new Slot((IInventory)this.playerInv, col2, 8 + col2 * 18, 242));
        }
    }
    
    public void onContainerClosed(final EntityPlayer player) {
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
            if (slotID >= 1) {
                return null;
            }
            if (!this.mergeItemStack(slotStack, 1, this.inventorySlots.size(), true)) {
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
    
    public void pressButton(final boolean paint, final boolean left) {
    }
    
    public void clickPaintjob(final int i) {
        final ItemStack paintableStack = this.table.getPaintableStack();
        if (paintableStack != null && paintableStack.getItem() instanceof IPaintableItem) {
            final PaintableType paintableType = ((IPaintableItem)paintableStack.getItem()).GetPaintableType();
            this.clickPaintjob(paintableType.getPaintjob(i));
        }
    }
    
    public void clickPaintjob(final Paintjob paintjob) {
        final ItemStack paintableStack = this.table.getPaintableStack();
        if (paintableStack != null && paintableStack.getItem() instanceof IPaintableItem) {
            final PaintableType paintableType = ((IPaintableItem)paintableStack.getItem()).GetPaintableType();
            final int numDyes = paintjob.dyesNeeded.length;
            if (!this.playerInv.player.capabilities.isCreativeMode) {
                for (int n = 0; n < numDyes; ++n) {
                    int amountNeeded = paintjob.dyesNeeded[n].stackSize;
                    for (int s = 0; s < this.playerInv.getSizeInventory(); ++s) {
                        final ItemStack stack = this.playerInv.getStackInSlot(s);
                        if (stack != null && stack.getItem() == Items.dye && stack.getMetadata() == paintjob.dyesNeeded[n].getMetadata()) {
                            amountNeeded -= stack.stackSize;
                        }
                    }
                    if (amountNeeded > 0) {
                        return;
                    }
                }
                for (int n = 0; n < numDyes; ++n) {
                    int amountNeeded = paintjob.dyesNeeded[n].stackSize;
                    for (int s = 0; s < this.playerInv.getSizeInventory(); ++s) {
                        if (amountNeeded > 0) {
                            final ItemStack stack = this.playerInv.getStackInSlot(s);
                            if (stack != null && stack.getItem() == Items.dye && stack.getMetadata() == paintjob.dyesNeeded[n].getMetadata()) {
                                final ItemStack consumed = this.playerInv.decrStackSize(s, amountNeeded);
                                amountNeeded -= consumed.stackSize;
                            }
                        }
                    }
                }
            }
            paintableStack.setMetadata(paintjob.ID);
        }
    }
}
