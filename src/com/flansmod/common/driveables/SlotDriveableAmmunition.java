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
    
    public boolean func_75214_a(final ItemStack stack) {
        if (stack == null || stack.func_77973_b() == null) {
            return true;
        }
        final Item item = stack.func_77973_b();
        if (item instanceof ItemVehicle || item instanceof ItemPlane || item instanceof ItemMecha) {
            return false;
        }
        if (!this.restrictInput) {
            return true;
        }
        FlansMod.log("E %b", item instanceof ItemBullet || item instanceof ItemGrenade);
        return item instanceof ItemBullet || item instanceof ItemGrenade;
    }
    
    public void func_75215_d(final ItemStack stack) {
        if (!this.func_75214_a(stack)) {
            return;
        }
        this.field_75224_c.func_70299_a(this.slotd, stack);
        this.func_75218_e();
    }
}
