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
    
    public boolean isItemValid(final ItemStack stack) {
        switch (this.slotID) {
            case 0: {
                return stack == null || (stack.getItem() instanceof ItemGun && !((ItemGun)stack.getItem()).type.deployable && stack.getTagCompound() != null);
            }
            case 1: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.barrel);
            }
            case 2: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.sights);
            }
            case 3: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.stock);
            }
            case 4: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.grip);
            }
            case 5: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.gadget);
            }
            case 6: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.slide);
            }
            case 7: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.pump);
            }
            case 8: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.accessory);
            }
            default: {
                return stack == null || (this.canAttachToCurrentGun(stack) && ((ItemAttachment)stack.getItem()).type.type == EnumAttachmentType.generic);
            }
        }
    }
    
    public boolean canAttachToCurrentGun(final ItemStack stack) {
        if (stack == null || !(stack.getItem() instanceof ItemAttachment) || !this.gunSlot.getHasStack() || !(this.gunSlot.getStack().getItem() instanceof ItemGun)) {
            return false;
        }
        final AttachmentType attachmentType = ((ItemAttachment)stack.getItem()).type;
        final GunType gunType = ((ItemGun)this.gunSlot.getStack().getItem()).type;
        return gunType.allowAllAttachments || gunType.allowedAttachments.contains(attachmentType);
    }
}
