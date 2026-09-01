// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerDriveableInventory extends Container
{
    public InventoryPlayer inventory;
    public World world;
    public EntityDriveable plane;
    public int numItems;
    public int screen;
    public int maxScroll;
    public int scroll;
    public DriveableType type;
    
    public ContainerDriveableInventory(final InventoryPlayer inventoryplayer, final World worldy, final EntityDriveable entPlane, final int i) {
        this.inventory = inventoryplayer;
        this.world = worldy;
        this.plane = entPlane;
        this.type = this.plane.getDriveableType();
        this.screen = i;
        this.numItems = 0;
        switch (i) {
            case 0: {
                this.numItems = this.plane.driveableData.numGuns;
                this.maxScroll = ((this.numItems > 3) ? (this.numItems - 3) : 0);
                break;
            }
            case 1: {
                this.numItems = this.plane.getDriveableType().numBombSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
            case 2: {
                this.numItems = this.plane.getDriveableType().numCargoSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
            case 3: {
                this.numItems = this.plane.getDriveableType().numMissileSlots;
                this.maxScroll = (((this.numItems + 7) / 8 > 3) ? ((this.numItems + 7) / 8 - 3) : 0);
                break;
            }
        }
        switch (this.screen) {
            case 0: {
                int slotsDone = 0;
                for (int j = 0; j < this.plane.driveableData.numGuns; ++j) {
                    int yPos = -1000;
                    if (slotsDone < 3 + this.scroll && slotsDone >= this.scroll) {
                        yPos = 25 + 19 * slotsDone;
                    }
                    this.func_75146_a((Slot)new SlotDriveableAmmunition((IInventory)this.plane.driveableData, j, 29, yPos, this.type.filterAmmunition));
                    ++slotsDone;
                }
                break;
            }
            case 1:
            case 2:
            case 3: {
                int startSlot = this.plane.driveableData.getBombInventoryStart();
                if (this.screen == 2) {
                    startSlot = this.plane.driveableData.getCargoInventoryStart();
                }
                if (this.screen == 3) {
                    startSlot = this.plane.driveableData.getMissileInventoryStart();
                }
                for (int m = (this.numItems + 7) / 8, row = 0; row < m; ++row) {
                    int yPos2 = -1000;
                    if (row < 3 + this.scroll && row >= this.scroll) {
                        yPos2 = 25 + 19 * (row - this.scroll);
                    }
                    for (int col = 0; col < (((row + this.scroll + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                        this.func_75146_a((Slot)new SlotDriveableAmmunition((IInventory)this.plane.driveableData, startSlot + row * 8 + col, 10 + 18 * col, yPos2, this.type.filterAmmunition));
                    }
                }
                break;
            }
        }
        for (int row2 = 0; row2 < 3; ++row2) {
            for (int col2 = 0; col2 < 9; ++col2) {
                this.func_75146_a(new Slot((IInventory)inventoryplayer, col2 + row2 * 9 + 9, 8 + col2 * 18, 98 + row2 * 18));
            }
        }
        for (int col3 = 0; col3 < 9; ++col3) {
            this.func_75146_a(new Slot((IInventory)inventoryplayer, col3, 8 + col3 * 18, 156));
        }
    }
    
    public void updateScroll(final int scrololol) {
        this.scroll = scrololol;
        switch (this.screen) {
            case 0: {
                int slotsDone = 0;
                for (int i = 0; i < this.plane.driveableData.numGuns; ++i) {
                    int yPos = -1000;
                    if (slotsDone < 3 + this.scroll && slotsDone >= this.scroll) {
                        yPos = 25 + 19 * (slotsDone - this.scroll);
                    }
                    this.field_75151_b.get(slotsDone).field_75221_f = yPos;
                    ++slotsDone;
                }
                break;
            }
            case 1:
            case 2:
            case 3: {
                for (int m = (this.numItems + 7) / 8, row = 0; row < m; ++row) {
                    int yPos = -1000;
                    if (row < 3 + this.scroll && row >= this.scroll) {
                        yPos = 25 + 19 * (row - this.scroll);
                    }
                    for (int col = 0; col < (((row + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                        this.field_75151_b.get(row * 8 + col).field_75221_f = yPos;
                    }
                }
                break;
            }
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
            if (slotID >= this.numItems) {
                if (!this.func_75135_a(slotStack, 0, this.numItems, false)) {
                    return null;
                }
            }
            else if (!this.func_75135_a(slotStack, this.numItems, this.field_75151_b.size(), true)) {
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
    
    protected boolean func_75135_a(final ItemStack stack, final int startIndex, final int endIndex, final boolean reverseDirection) {
        boolean flag = false;
        int i = startIndex;
        if (reverseDirection) {
            i = endIndex - 1;
        }
        if (stack.func_77985_e()) {
            while (stack.field_77994_a > 0 && ((!reverseDirection && i < endIndex) || (reverseDirection && i >= startIndex))) {
                final Slot slot = this.field_75151_b.get(i);
                final ItemStack itemstack = slot.func_75211_c();
                final int maxLimit = Math.min(stack.func_77976_d(), slot.func_75219_a());
                if (itemstack != null && ItemStack.func_77989_b(stack, itemstack)) {
                    final int j = itemstack.field_77994_a + stack.field_77994_a;
                    if (j <= maxLimit) {
                        stack.field_77994_a = 0;
                        itemstack.field_77994_a = j;
                        slot.func_75218_e();
                        flag = true;
                    }
                    else if (itemstack.field_77994_a < maxLimit) {
                        stack.field_77994_a = maxLimit;
                        itemstack.field_77994_a = maxLimit;
                        slot.func_75218_e();
                        flag = true;
                    }
                }
                if (reverseDirection) {
                    --i;
                }
                else {
                    ++i;
                }
            }
        }
        if (stack.field_77994_a > 0) {
            if (reverseDirection) {
                i = endIndex - 1;
            }
            else {
                i = startIndex;
            }
            while ((!reverseDirection && i < endIndex) || (reverseDirection && i >= startIndex)) {
                final Slot slot2 = this.field_75151_b.get(i);
                ItemStack itemstack2 = slot2.func_75211_c();
                if (itemstack2 == null && slot2.func_75214_a(stack)) {
                    if (stack.field_77994_a <= slot2.func_75219_a()) {
                        slot2.func_75215_d(stack.func_77946_l());
                        slot2.func_75218_e();
                        stack.field_77994_a = 0;
                        flag = true;
                        break;
                    }
                    itemstack2 = stack.func_77946_l();
                    stack.field_77994_a -= slot2.func_75219_a();
                    itemstack2.field_77994_a = slot2.func_75219_a();
                    slot2.func_75215_d(itemstack2);
                    slot2.func_75218_e();
                    flag = true;
                }
                if (reverseDirection) {
                    --i;
                }
                else {
                    ++i;
                }
            }
        }
        return flag;
    }
}
