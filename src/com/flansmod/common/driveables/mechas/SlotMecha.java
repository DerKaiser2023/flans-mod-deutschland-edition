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
    
    public boolean func_75214_a(final ItemStack stack) {
        if (stack == null || stack.func_77973_b() == null) {
            return true;
        }
        EnumMechaItemType itemType = null;
        final Item item = stack.func_77973_b();
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
    
    public void func_75215_d(final ItemStack stack) {
        if (!this.func_75214_a(stack)) {
            return;
        }
        this.field_75224_c.func_70299_a(this.slotType.ordinal(), stack);
        this.func_75218_e();
    }
}
