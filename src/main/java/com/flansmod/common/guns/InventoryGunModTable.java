// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.InventoryBasic;

public class InventoryGunModTable extends InventoryBasic
{
    public ItemStack lastGunStack;
    public GunType gunType;
    public int genericScroll;
    private boolean busy;
    
    public InventoryGunModTable() {
        super("Gun Modification Table", true, 17);
        this.genericScroll = 0;
        this.busy = false;
    }
    
    public void markDirty() {
        if (this.busy) {
            return;
        }
        final ItemStack gunStack = this.getStackInSlot(0);
        if (gunStack == null || !(gunStack.getItem() instanceof ItemGun)) {
            return;
        }
        this.gunType = ((ItemGun)gunStack.getItem()).type;
        final String[] tags = { "barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory" };
        if (gunStack != this.lastGunStack) {
            this.busy = true;
            final NBTTagCompound attachmentTags = gunStack.stackTagCompound.getCompoundTag("attachments");
            for (int i = 0; i < 8; ++i) {
                try {
                    this.setInventorySlotContents(i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag(tags[i])));
                }
                catch (final Exception e) {
                    e.printStackTrace();
                }
            }
            this.genericScroll = 0;
            for (int i = 0; i < Math.min(this.gunType.numGenericAttachmentSlots, 8); ++i) {
                try {
                    this.setInventorySlotContents(tags.length + i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.getCompoundTag("generic_" + i)));
                }
                catch (final Exception e) {
                    e.printStackTrace();
                }
            }
            this.busy = false;
        }
        else {
            final NBTTagCompound gunTags = new NBTTagCompound();
            gunTags.setTag("ammo", this.getStackInSlot(0).stackTagCompound.getTag("ammo"));
            if (this.getStackInSlot(0).stackTagCompound.getTag("Paint") != null) {
                gunTags.setTag("Paint", this.getStackInSlot(0).stackTagCompound.getTag("Paint"));
            }
            final NBTTagCompound attachmentTags2 = new NBTTagCompound();
            for (int j = 0; j < 8; ++j) {
                this.writeAttachmentTags(attachmentTags2, this.getStackInSlot(j + 1), tags[j]);
            }
            for (int j = 0; j < this.gunType.numGenericAttachmentSlots; ++j) {
                if (j >= this.genericScroll * 4 && j < this.genericScroll * 4 + 8) {
                    this.writeAttachmentTags(attachmentTags2, this.getStackInSlot(j - this.genericScroll * 4 + tags.length + 1), "generic_" + j);
                }
                else {
                    attachmentTags2.setTag("generic_" + j, this.getStackInSlot(0).stackTagCompound.getTag("generic_" + j));
                }
            }
            gunTags.setTag("attachments", (NBTBase)attachmentTags2);
            gunStack.stackTagCompound = gunTags;
        }
        this.lastGunStack = gunStack;
    }
    
    public void writeAttachmentTags(final NBTTagCompound attachmentTags, final ItemStack attachmentStack, final String attachmentName) {
        NBTTagCompound tags = new NBTTagCompound();
        if (attachmentStack != null) {
            tags = attachmentStack.writeToNBT(new NBTTagCompound());
        }
        attachmentTags.setTag(attachmentName, (NBTBase)tags);
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        return false;
    }
}
