// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.item.Item;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import net.minecraft.inventory.IInventory;

public class MechaInventory implements IInventory
{
    public EntityMecha mecha;
    public HashMap<EnumMechaSlotType, ItemStack> stacks;
    
    public MechaInventory(final EntityMecha m) {
        this.mecha = m;
        this.stacks = new HashMap<EnumMechaSlotType, ItemStack>();
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            this.stacks.put(type, null);
        }
    }
    
    public MechaInventory(final EntityMecha m, final NBTTagCompound tags) {
        this(m);
        this.readFromNBT(tags);
    }
    
    public void readFromNBT(final NBTTagCompound tags) {
        if (tags == null) {
            return;
        }
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            try {
                this.stacks.put(type, ItemStack.loadItemStackFromNBT(tags.func_74775_l(type.toString())));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public NBTTagCompound writeToNBT(final NBTTagCompound tags) {
        if (tags == null) {
            return null;
        }
        for (final EnumMechaSlotType type : EnumMechaSlotType.values()) {
            if (this.stacks.get(type) != null) {
                tags.func_74782_a(type.toString(), (NBTBase)((ItemStack)this.stacks.get(type)).writeToNBT(new NBTTagCompound()));
            }
        }
        return tags;
    }
    
    public int func_70302_i_() {
        return EnumMechaSlotType.values().length;
    }
    
    public ItemStack func_70301_a(final int i) {
        return this.stacks.get(EnumMechaSlotType.values()[i]);
    }
    
    public ItemStack getStackInSlot(final EnumMechaSlotType e) {
        return this.stacks.get(e);
    }
    
    public ItemStack func_70298_a(final int i, final int j) {
        this.func_70296_d();
        ItemStack slot = this.func_70301_a(i);
        if (slot == null) {
            return null;
        }
        final int numToTake = Math.min(j, slot.field_77994_a);
        final ItemStack returnStack = slot.func_77946_l();
        returnStack.field_77994_a = numToTake;
        final ItemStack itemStack = slot;
        itemStack.field_77994_a -= numToTake;
        if (slot.field_77994_a <= 0) {
            slot = null;
        }
        this.func_70299_a(i, slot);
        return returnStack;
    }
    
    public ItemStack func_70304_b(final int i) {
        return this.func_70301_a(i);
    }
    
    public void func_70299_a(final int i, final ItemStack itemstack) {
        this.setInventorySlotContents(EnumMechaSlotType.values()[i], itemstack);
    }
    
    public void setInventorySlotContents(final EnumMechaSlotType e, final ItemStack itemstack) {
        this.func_70296_d();
        this.stacks.put(e, itemstack);
    }
    
    public String func_145825_b() {
        return "Mecha";
    }
    
    public boolean func_145818_k_() {
        return true;
    }
    
    public int func_70297_j_() {
        return 64;
    }
    
    public void func_70296_d() {
        if (this.mecha != null) {
            this.mecha.couldNotFindFuel = false;
        }
    }
    
    public boolean func_70300_a(final EntityPlayer entityplayer) {
        return this.mecha != null && entityplayer.func_70032_d((Entity)this.mecha) <= 10.0;
    }
    
    public void func_70295_k_() {
    }
    
    public void func_70305_f() {
    }
    
    public boolean func_94041_b(final int i, final ItemStack itemstack) {
        final Item item = itemstack.func_77973_b();
        if (item == null) {
            return true;
        }
        switch (EnumMechaSlotType.values()[i]) {
            case leftTool:
            case rightTool: {
                return item instanceof ItemGun || item instanceof ItemMechaAddon;
            }
            case leftArm:
            case rightArm: {
                return item instanceof ItemBullet;
            }
            default: {
                return false;
            }
        }
    }
}
