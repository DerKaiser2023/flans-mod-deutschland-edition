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
            this.func_75146_a(new Slot((IInventory)this.plane.driveableData, this.plane.driveableData.getFuelSlot(), 35, 44));
        }
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.func_75146_a(new Slot((IInventory)inventoryplayer, col + row * 9 + 9, 8 + col * 18, 79 + (this.isFuel ? 0 : 19) + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.func_75146_a(new Slot((IInventory)inventoryplayer, col2, 8 + col2 * 18, 137 + (this.isFuel ? 0 : 19)));
        }
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
    
    public boolean func_75145_c(final EntityPlayer entityplayer) {
        return true;
    }
}
