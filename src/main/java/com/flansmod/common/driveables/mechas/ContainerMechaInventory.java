// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;

public class ContainerMechaInventory extends Container
{
    public InventoryPlayer inventory;
    public World world;
    public EntityMecha mecha;
    public int numItems;
    public int maxScroll;
    public int scroll;
    public MechaType type;
    
    public ContainerMechaInventory(final InventoryPlayer inv, final World w, final EntityMecha em) {
        this.inventory = inv;
        this.world = w;
        this.mecha = em;
        this.type = (MechaType)this.mecha.getDriveableType();
        this.numItems = this.mecha.getDriveableType().numCargoSlots;
        final int numRows = (this.numItems + 7) / 8;
        this.maxScroll = ((numRows > 3) ? (numRows - 3) : 0);
        final int startSlot = this.mecha.driveableData.getCargoInventoryStart();
        for (int row = 0; row < numRows; ++row) {
            int yPos = -1000;
            if (row < 3 + this.scroll && row >= this.scroll) {
                yPos = 25 + 19 * (row - this.scroll);
            }
            for (int col = 0; col < (((row + this.scroll + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                this.func_75146_a((Slot)new SlotMechaInventory((IInventory)this.mecha.driveableData, startSlot + row * 8 + col, 186 + 18 * col, yPos, this.type.restrictInventoryInput));
            }
        }
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.legs, 84, 128));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.hips, 60, 128));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.leftArm, 36, 80));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.leftTool, 36, 56));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.leftShoulder, 60, 32));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.head, 84, 32));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.feet, 108, 128));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.rightArm, 132, 80));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.rightTool, 132, 56));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.rightShoulder, 108, 32));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.u1, 10, 32));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.u2, 10, 56));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.u3, 10, 80));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.u4, 10, 104));
        this.func_75146_a((Slot)new SlotMecha((IInventory)this.mecha.inventory, EnumMechaSlotType.u5, 10, 128));
        for (int row = 0; row < 3; ++row) {
            for (int col2 = 0; col2 < 9; ++col2) {
                this.func_75146_a(new Slot((IInventory)this.inventory, col2 + row * 9 + 9, 182 + col2 * 18, 98 + row * 18));
            }
        }
        for (int col3 = 0; col3 < 9; ++col3) {
            this.func_75146_a(new Slot((IInventory)this.inventory, col3, 182 + col3 * 18, 156));
        }
    }
    
    public void func_75134_a(final EntityPlayer par1EntityPlayer) {
        super.func_75134_a(par1EntityPlayer);
        this.mecha.couldNotFindFuel = false;
    }
    
    public void updateScroll(final int scrololol) {
        this.scroll = scrololol;
        for (int m = (this.numItems + 7) / 8, row = 0; row < m; ++row) {
            int yPos = -1000;
            if (row < 3 + this.scroll && row >= this.scroll) {
                yPos = 25 + 19 * (row - this.scroll);
            }
            for (int col = 0; col < (((row + 1) * 8 < this.numItems) ? 8 : (this.numItems % 8)); ++col) {
                this.field_75151_b.get(row * 8 + col).field_75221_f = yPos;
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
}
