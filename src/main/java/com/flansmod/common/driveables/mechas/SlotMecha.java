// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.item.Item;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotMecha extends Slot
{
    private EnumMechaSlotType slotType;
    
    public SlotMecha(final IInventory inv, final EnumMechaSlotType e, final int x, final int y) {
        super(inv, e.ordinal(), x, y);
        this.slotType = e;
    }
    
    public boolean isItemValid(final ItemStack stack) {
        if (stack == null || stack.getItem() == null) {
            return true;
        }
        EnumMechaItemType itemType = null;
        final Item item = stack.getItem();
        if (item instanceof ItemGun && ((ItemGun)item).type.usableByMechas) {
            itemType = EnumMechaItemType.tool;
        }
        else {
            if (!(item instanceof ItemMechaAddon)) {
                return false;
            }
            itemType = ((ItemMechaAddon)item).type.type;
        }
        return this.slotType.accepts(itemType);
    }
    
    public void putStack(final ItemStack stack) {
        if (!this.isItemValid(stack)) {
            return;
        }
        this.inventory.setInventorySlotContents(this.slotType.ordinal(), stack);
        this.onSlotChanged();
    }
}
