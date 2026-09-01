// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.item.Item;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.driveables.mechas.ItemMecha;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotDriveableAmmunition extends Slot
{
    int slotd;
    boolean restrictInput;
    
    public SlotDriveableAmmunition(final IInventory inv, final int e, final int x, final int y, final boolean filterInput) {
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
        final Item item = stack.getItem();
        if (item instanceof ItemVehicle || item instanceof ItemPlane || item instanceof ItemMecha) {
            return false;
        }
        if (!this.restrictInput) {
            return true;
        }
        FlansMod.log("E %b", item instanceof ItemBullet || item instanceof ItemGrenade);
        return item instanceof ItemBullet || item instanceof ItemGrenade;
    }
    
    public void putStack(final ItemStack stack) {
        if (!this.isItemValid(stack)) {
            return;
        }
        this.inventory.setInventorySlotContents(this.slotd, stack);
        this.onSlotChanged();
    }
}
