// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.item.Item;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.parts.ItemPart;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotMechaInventory extends Slot
{
    int slotd;
    boolean restrictInput;
    
    public SlotMechaInventory(final IInventory inv, final int e, final int x, final int y, final boolean filterInput) {
        super(inv, e, x, y);
        this.slotd = 0;
        this.restrictInput = false;
        this.slotd = e;
        this.restrictInput = filterInput;
    }
    
    public boolean isItemValid(final ItemStack stack) {
        if (stack == null || stack.getItem() == null) {
            return true;
        }
        if (!this.restrictInput) {
            return true;
        }
        final Item item = stack.getItem();
        return (item instanceof ItemPart && ((ItemPart)item).type.fuel > 0) || item instanceof ItemBullet || item instanceof ItemGrenade;
    }
    
    public void putStack(final ItemStack stack) {
        this.inventory.setInventorySlotContents(this.slotd, stack);
        this.onSlotChanged();
    }
}
