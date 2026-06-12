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
        this.func_75146_a(new Slot((IInventory)this.table, 0, 187, 139));
        this.func_75146_a(new Slot((IInventory)this.table, 1, 187, 193));
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.func_75146_a(new Slot((IInventory)this.playerInv, col + row * 9 + 9, 8 + col * 18, 184 + row * 18));
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.func_75146_a(new Slot((IInventory)this.playerInv, col2, 8 + col2 * 18, 242));
        }
    }
    
    public void func_75134_a(final EntityPlayer player) {
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
            if (slotID >= 1) {
                return null;
            }
            if (!this.func_75135_a(slotStack, 1, this.field_75151_b.size(), true)) {
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
    
    public void pressButton(final boolean paint, final boolean left) {
    }
    
    public void clickPaintjob(final int i) {
        final ItemStack paintableStack = this.table.getPaintableStack();
        if (paintableStack != null && paintableStack.func_77973_b() instanceof IPaintableItem) {
            final PaintableType paintableType = ((IPaintableItem)paintableStack.func_77973_b()).GetPaintableType();
            this.clickPaintjob(paintableType.getPaintjob(i));
        }
    }
    
    public void clickPaintjob(final Paintjob paintjob) {
        final ItemStack paintableStack = this.table.getPaintableStack();
        if (paintableStack != null && paintableStack.func_77973_b() instanceof IPaintableItem) {
            final PaintableType paintableType = ((IPaintableItem)paintableStack.func_77973_b()).GetPaintableType();
            final int numDyes = paintjob.dyesNeeded.length;
            if (!this.playerInv.field_70458_d.field_71075_bZ.field_75098_d) {
                for (int n = 0; n < numDyes; ++n) {
                    int amountNeeded = paintjob.dyesNeeded[n].field_77994_a;
                    for (int s = 0; s < this.playerInv.func_70302_i_(); ++s) {
                        final ItemStack stack = this.playerInv.func_70301_a(s);
                        if (stack != null && stack.func_77973_b() == Items.field_151100_aR && stack.func_77960_j() == paintjob.dyesNeeded[n].func_77960_j()) {
                            amountNeeded -= stack.field_77994_a;
                        }
                    }
                    if (amountNeeded > 0) {
                        return;
                    }
                }
                for (int n = 0; n < numDyes; ++n) {
                    int amountNeeded = paintjob.dyesNeeded[n].field_77994_a;
                    for (int s = 0; s < this.playerInv.func_70302_i_(); ++s) {
                        if (amountNeeded > 0) {
                            final ItemStack stack = this.playerInv.func_70301_a(s);
                            if (stack != null && stack.func_77973_b() == Items.field_151100_aR && stack.func_77960_j() == paintjob.dyesNeeded[n].func_77960_j()) {
                                final ItemStack consumed = this.playerInv.func_70298_a(s, amountNeeded);
                                amountNeeded -= consumed.field_77994_a;
                            }
                        }
                    }
                }
            }
            paintableStack.func_77964_b(paintjob.ID);
        }
    }
}
