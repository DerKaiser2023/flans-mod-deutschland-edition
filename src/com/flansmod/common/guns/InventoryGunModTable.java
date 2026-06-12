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
    
    public void func_70296_d() {
        if (this.busy) {
            return;
        }
        final ItemStack gunStack = this.func_70301_a(0);
        if (gunStack == null || !(gunStack.func_77973_b() instanceof ItemGun)) {
            return;
        }
        this.gunType = ((ItemGun)gunStack.func_77973_b()).type;
        final String[] tags = { "barrel", "scope", "stock", "grip", "gadget", "slide", "pump", "accessory" };
        if (gunStack != this.lastGunStack) {
            this.busy = true;
            final NBTTagCompound attachmentTags = gunStack.field_77990_d.func_74775_l("attachments");
            for (int i = 0; i < 8; ++i) {
                try {
                    this.func_70299_a(i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.func_74775_l(tags[i])));
                }
                catch (final Exception e) {
                    e.printStackTrace();
                }
            }
            this.genericScroll = 0;
            for (int i = 0; i < Math.min(this.gunType.numGenericAttachmentSlots, 8); ++i) {
                try {
                    this.func_70299_a(tags.length + i + 1, ItemStack.loadItemStackFromNBT(attachmentTags.func_74775_l("generic_" + i)));
                }
                catch (final Exception e) {
                    e.printStackTrace();
                }
            }
            this.busy = false;
        }
        else {
            final NBTTagCompound gunTags = new NBTTagCompound();
            gunTags.func_74782_a("ammo", this.func_70301_a(0).field_77990_d.func_74781_a("ammo"));
            if (this.func_70301_a(0).field_77990_d.func_74781_a("Paint") != null) {
                gunTags.func_74782_a("Paint", this.func_70301_a(0).field_77990_d.func_74781_a("Paint"));
            }
            final NBTTagCompound attachmentTags2 = new NBTTagCompound();
            for (int j = 0; j < 8; ++j) {
                this.writeAttachmentTags(attachmentTags2, this.func_70301_a(j + 1), tags[j]);
            }
            for (int j = 0; j < this.gunType.numGenericAttachmentSlots; ++j) {
                if (j >= this.genericScroll * 4 && j < this.genericScroll * 4 + 8) {
                    this.writeAttachmentTags(attachmentTags2, this.func_70301_a(j - this.genericScroll * 4 + tags.length + 1), "generic_" + j);
                }
                else {
                    attachmentTags2.func_74782_a("generic_" + j, this.func_70301_a(0).field_77990_d.func_74781_a("generic_" + j));
                }
            }
            gunTags.func_74782_a("attachments", (NBTBase)attachmentTags2);
            gunStack.field_77990_d = gunTags;
        }
        this.lastGunStack = gunStack;
    }
    
    public void writeAttachmentTags(final NBTTagCompound attachmentTags, final ItemStack attachmentStack, final String attachmentName) {
        NBTTagCompound tags = new NBTTagCompound();
        if (attachmentStack != null) {
            tags = attachmentStack.writeToNBT(new NBTTagCompound());
        }
        attachmentTags.func_74782_a(attachmentName, (NBTBase)tags);
    }
    
    public boolean func_94041_b(final int i, final ItemStack itemstack) {
        return false;
    }
}
