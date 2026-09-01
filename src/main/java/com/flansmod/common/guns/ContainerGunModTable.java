// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.init.Items;
import com.flansmod.common.paintjob.Paintjob;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerGunModTable extends Container
{
    private InventoryGunModTable inventory;
    public InventoryPlayer playerInv;
    public World world;
    
    public ContainerGunModTable(final InventoryPlayer i, final World w) {
        this.playerInv = i;
        this.inventory = new InventoryGunModTable();
        this.world = w;
        final SlotGun gunSlot = new SlotGun((IInventory)this.inventory, 0, 184, 37, null);
        this.addSlotToContainer((Slot)gunSlot);
        for (int k = 0; k < 8; ++k) {
            this.addSlotToContainer((Slot)new SlotGun((IInventory)this.inventory, k + 1, 17 + k * 18, 89, gunSlot));
        }
        for (int col = 0; col < 8; ++col) {
            this.addSlotToContainer((Slot)new SlotGun((IInventory)this.inventory, 9 + col, 17 + col * 18, 115 + col * 18, gunSlot));
        }
        for (int row = 0; row < 3; ++row) {
            for (int col2 = 0; col2 < 9; ++col2) {
                this.addSlotToContainer(new Slot((IInventory)this.playerInv, col2 + row * 9 + 9, 8 + col2 * 18, 154 + row * 18));
            }
        }
        for (int col = 0; col < 9; ++col) {
            this.addSlotToContainer(new Slot((IInventory)this.playerInv, col, 8 + col * 18, 212));
        }
    }
    
    public void onContainerClosed(final EntityPlayer player) {
        if (this.inventory.getStackInSlot(0) != null) {
            player.dropPlayerItemWithRandomChoice(this.inventory.getStackInSlot(0), false);
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
            if (slotID >= 17) {
                return null;
            }
            if (!this.mergeItemStack(slotStack, 17, this.inventorySlots.size(), true)) {
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
    
    public void clickPaintjob(final int id) {
        final ItemStack gunStack = this.inventory.getStackInSlot(0);
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.getItem()).type;
            this.clickPaintjob(gunType.getPaintjob(id));
        }
    }
    
    public void clickPaintjob(final Paintjob paintjob) {
        final ItemStack gunStack = this.inventory.getStackInSlot(0);
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.getItem()).type;
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
            gunStack.setMetadata(paintjob.ID);
        }
    }
}
