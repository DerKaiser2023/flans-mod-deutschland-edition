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
                this.func_75146_a(new Slot((IInventory)i, col + row * 9 + 9, 57 + col * 18, 151 + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.func_75146_a(new Slot((IInventory)i, col2, 57 + col2 * 18, 209));
        }
    }
    
    public boolean func_75145_c(final EntityPlayer entityplayer) {
        return true;
    }
    
    public ItemStack func_82846_b(final EntityPlayer player, final int slotID) {
        ItemStack stack = null;
        final Slot currentSlot = this.field_75151_b.get(slotID);
        if (currentSlot != null && currentSlot.func_75216_d()) {
            final ItemStack slotStack = currentSlot.func_75211_c();
            stack = slotStack.func_77946_l();
            if (slotID != 0) {
                if (!this.func_75135_a(slotStack, 0, 1, false)) {
                    return null;
                }
            }
            else if (!this.func_75135_a(slotStack, 1, this.field_75151_b.size(), true)) {
                return null;
            }
            if (slotStack.field_77994_a == 0) {
                currentSlot.func_75215_d((ItemStack)null);
            }
            else {
                currentSlot.func_75218_e();
            }
            if (slotStack.field_77994_a == stack.field_77994_a) {
                return null;
            }
            currentSlot.func_82870_a(player, slotStack);
        }
        return stack;
    }
}
