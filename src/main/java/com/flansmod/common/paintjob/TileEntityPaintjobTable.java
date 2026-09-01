// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTBase;
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
    
    public int getSizeInventory() {
        return 2;
    }
    
    public ItemStack getStackInSlot(final int index) {
        return this.inventoryStacks[index];
    }
    
    public ItemStack decrStackSize(final int index, final int count) {
        if (this.getStackInSlot(index) == null) {
            return null;
        }
        if (count >= this.getStackInSlot(index).stackSize) {
            final ItemStack returnStack = this.getStackInSlot(index);
            this.setInventorySlotContents(index, null);
            return returnStack;
        }
        final ItemStack returnStack = this.getStackInSlot(index).splitStack(count);
        return returnStack;
    }
    
    public ItemStack getStackInSlotOnClosing(final int index) {
        final ItemStack returnStack = this.getStackInSlot(index);
        this.setInventorySlotContents(index, null);
        return returnStack;
    }
    
    public void setInventorySlotContents(final int index, final ItemStack stack) {
        this.inventoryStacks[index] = stack;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer player) {
        return true;
    }
    
    public boolean isItemValidForSlot(final int index, final ItemStack stack) {
        return true;
    }
    
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        for (int i = 0; i < this.inventoryStacks.length; ++i) {
            NBTTagCompound stackNBT = new NBTTagCompound();
            if (this.getStackInSlot(i) != null) {
                stackNBT = this.getStackInSlot(i).writeToNBT(new NBTTagCompound());
            }
            nbt.setTag("stack_" + i, (NBTBase)stackNBT);
        }
    }
    
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        for (int i = 0; i < this.inventoryStacks.length; ++i) {
            try {
                this.setInventorySlotContents(i, ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("stack_" + i)));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void update() {
    }
    
    public Packet getDescriptionPacket() {
        final NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return (Packet)new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, this.getBlockMetadata(), nbt);
    }
    
    public void onDataPacket(final NetworkManager net, final S35PacketUpdateTileEntity packet) {
        this.readFromNBT(packet.getNbtCompound());
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
    
    public String getInventoryName() {
        return "PaintjobTable";
    }
    
    public boolean isCustomInventoryName() {
        return false;
    }
    
    public void openChest() {
    }
    
    public void closeChest() {
    }
}
