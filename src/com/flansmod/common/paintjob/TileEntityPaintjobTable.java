// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntity;

public class TileEntityPaintjobTable extends TileEntity implements IInventory, IUpdatePlayerListBox
{
    private ItemStack[] inventoryStacks;
    
    public TileEntityPaintjobTable() {
        this.inventoryStacks = new ItemStack[2];
    }
    
    public int func_70302_i_() {
        return 2;
    }
    
    public ItemStack func_70301_a(final int index) {
        return this.inventoryStacks[index];
    }
    
    public ItemStack func_70298_a(final int index, final int count) {
        if (this.func_70301_a(index) == null) {
            return null;
        }
        if (count >= this.func_70301_a(index).field_77994_a) {
            final ItemStack returnStack = this.func_70301_a(index);
            this.func_70299_a(index, null);
            return returnStack;
        }
        final ItemStack returnStack = this.func_70301_a(index).func_77979_a(count);
        return returnStack;
    }
    
    public ItemStack func_70304_b(final int index) {
        final ItemStack returnStack = this.func_70301_a(index);
        this.func_70299_a(index, null);
        return returnStack;
    }
    
    public void func_70299_a(final int index, final ItemStack stack) {
        this.inventoryStacks[index] = stack;
    }
    
    public int func_70297_j_() {
        return 64;
    }
    
    public boolean func_70300_a(final EntityPlayer player) {
        return true;
    }
    
    public boolean func_94041_b(final int index, final ItemStack stack) {
        return true;
    }
    
    public void func_145841_b(final NBTTagCompound nbt) {
        super.func_145841_b(nbt);
        for (int i = 0; i < this.inventoryStacks.length; ++i) {
            NBTTagCompound stackNBT = new NBTTagCompound();
            if (this.func_70301_a(i) != null) {
                stackNBT = this.func_70301_a(i).writeToNBT(new NBTTagCompound());
            }
            nbt.func_74782_a("stack_" + i, (NBTBase)stackNBT);
        }
    }
    
    public void func_145839_a(final NBTTagCompound nbt) {
        super.func_145839_a(nbt);
        for (int i = 0; i < this.inventoryStacks.length; ++i) {
            try {
                this.func_70299_a(i, ItemStack.loadItemStackFromNBT(nbt.func_74775_l("stack_" + i)));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void func_73660_a() {
    }
    
    public Packet func_145844_m() {
        final NBTTagCompound nbt = new NBTTagCompound();
        this.func_145841_b(nbt);
        return (Packet)new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, this.func_145832_p(), nbt);
    }
    
    public void onDataPacket(final NetworkManager net, final S35PacketUpdateTileEntity packet) {
        this.func_145839_a(packet.func_148857_g());
    }
    
    public ItemStack getPaintableStack() {
        return this.inventoryStacks[0];
    }
    
    public void setPaintableStack(final ItemStack stack) {
        this.inventoryStacks[0] = stack;
    }
    
    public ItemStack getPaintCans() {
        return this.inventoryStacks[1];
    }
    
    public String func_145825_b() {
        return "PaintjobTable";
    }
    
    public boolean func_145818_k_() {
        return false;
    }
    
    public void func_70295_k_() {
    }
    
    public void func_70305_f() {
    }
}
