// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotGun extends Slot
{
    private int slotID;
    private SlotGun gunSlot;
    
    public SlotGun(final IInventory inventory, final int i, final int x, final int y, final SlotGun s) {
        super(inventory, i, x, y);
        this.slotID = i;
        this.gunSlot = s;
    }
    
    public boolean func_75214_a(final ItemStack stack) {
        switch (this.slotID) {
            case 0: {
                return stack == null || (stack.func_77973_b() instanceof ItemGun && !((ItemGun)stack.func_77973_b()).type.deployable && stack.func_77978_p() != null);
            }
            case 1: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.barrel);
            }
            case 2: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.sights);
            }
            case 3: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.stock);
            }
            case 4: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.grip);
            }
            case 5: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.gadget);
            }
            case 6: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.slide);
            }
            case 7: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.pump);
            }
            case 8: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.accessory);
            }
            default: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.func_77973_b()).type.type == EnumAttachmentType.generic);
            }
        }
    }
    
    public boolean canAttachToCurrentGun(final ItemStack stack) {
        if (stack == null || !(stack.func_77973_b() instanceof ItemAttachment) || !this.gunSlot.func_75216_d() || !(this.gunSlot.func_75211_c().func_77973_b() instanceof ItemGun)) {
            return false;
        }
        final AttachmentType attachmentType = ((ItemAttachment)stack.func_77973_b()).type;
        final GunType gunType = ((ItemGun)this.gunSlot.func_75211_c().func_77973_b()).type;
        return gunType.allowAllAttachments || gunType.allowedAttachments.contains(attachmentType);
    }
}
