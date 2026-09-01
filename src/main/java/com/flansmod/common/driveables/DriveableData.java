// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.guns.ItemBullet;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;
import com.flansmod.common.parts.PartType;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class DriveableData implements IInventory
{
    public String type;
    public int numGuns;
    public int numBombs;
    public int numMissiles;
    public int numCargo;
    public ItemStack[] ammo;
    public ItemStack[] bombs;
    public ItemStack[] missiles;
    public ItemStack[] cargo;
    public PartType engine;
    public ItemStack fuel;
    public float fuelInTank;
    public float depth;
    public int totalCrew;
    public int notFlooding;
    public int notFloodingMax;
    public int maximumCrew;
    public float fakeReloadShell;
    public float fakeReloadMissile;
    public int overheat;
    public int overheatSuffer;
    public int sinkingTimer;
    public int sinkLimit;
    public int repairingTimer;
    public int repairLimit;
    public HashMap<EnumDriveablePart, DriveablePart> parts;
    public boolean inventoryChanged;
    public int originX;
    public int originY;
    public int originZ;
    public String puppy;
    public int morale;
    public int panicTimer;
    public int landBrake;
    public int paintjobID;
    public int thermalTimer;
    public int scopeTimer;
    public String seatBelt;
    public int WarpLimit;
    public boolean emergencyMode;
    public int carrierTip;
    public int catapult;
    
    public DriveableData(final NBTTagCompound tags, final int paintjobID) {
        this(tags);
        this.paintjobID = paintjobID;
    }
    
    public DriveableData(final NBTTagCompound tags) {
        this.totalCrew = 1;
        this.notFlooding = 1;
        this.notFloodingMax = 1;
        this.maximumCrew = 1;
        this.overheat = 0;
        this.overheatSuffer = 0;
        this.sinkingTimer = 0;
        this.sinkLimit = 400;
        this.repairingTimer = 0;
        this.repairLimit = 40;
        this.inventoryChanged = false;
        this.originX = 0;
        this.originY = 69;
        this.originZ = 0;
        this.morale = 1;
        this.panicTimer = 0;
        this.landBrake = 0;
        this.thermalTimer = 0;
        this.scopeTimer = 0;
        this.seatBelt = "null";
        this.WarpLimit = 1;
        this.emergencyMode = false;
        this.carrierTip = 0;
        this.catapult = 0;
        this.parts = new HashMap<EnumDriveablePart, DriveablePart>();
        this.readFromNBT(tags);
    }
    
    public void readFromNBT(final NBTTagCompound tag) {
        if (tag == null) {
            return;
        }
        if (!tag.hasKey("Type")) {
            return;
        }
        this.type = tag.getString("Type");
        final DriveableType dType = DriveableType.getDriveable(this.type);
        this.numBombs = dType.numBombSlots;
        this.numCargo = dType.numCargoSlots;
        this.numMissiles = dType.numMissileSlots;
        this.numGuns = dType.ammoSlots();
        this.engine = PartType.getPart(tag.getString("Engine"));
        this.paintjobID = tag.getInteger("Paint");
        this.ammo = new ItemStack[this.numGuns];
        this.bombs = new ItemStack[this.numBombs];
        this.missiles = new ItemStack[this.numMissiles];
        this.cargo = new ItemStack[this.numCargo];
        for (int i = 0; i < this.numGuns; ++i) {
            try {
                this.ammo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Ammo " + i));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < this.numBombs; ++i) {
            try {
                this.bombs[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Bombs " + i));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < this.numMissiles; ++i) {
            try {
                this.missiles[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Missiles " + i));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < this.numCargo; ++i) {
            try {
                this.cargo[i] = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Cargo " + i));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
        try {
            this.fuel = ItemStack.loadItemStackFromNBT(tag.getCompoundTag("Fuel"));
        }
        catch (final Exception e2) {
            e2.printStackTrace();
        }
        this.fuelInTank = (float)tag.getInteger("FuelInTank");
        for (final EnumDriveablePart part : EnumDriveablePart.values()) {
            this.parts.put(part, new DriveablePart(part, dType.health.get(part)));
            this.parts.put(part, new DriveablePart(part, dType.crew.get(part)));
        }
        for (final DriveablePart part2 : this.parts.values()) {
            part2.readFromNBT(tag);
        }
        if (!tag.hasKey("seatBelt")) {
            this.seatBelt = "null";
            return;
        }
        this.seatBelt = tag.getString("seatBelt");
        this.emergencyMode = tag.getBoolean("emergencyMode");
        this.seatBelt = tag.getString("seatBelt");
        if (!tag.hasKey("WarpLimiterino")) {
            this.WarpLimit = dType.numPassengers;
        }
        else {
            this.WarpLimit = tag.getInteger("WarpLimiterino");
        }
    }
    
    public void writeToNBT(final NBTTagCompound tag) {
        tag.setString("Type", this.type);
        tag.setString("Engine", this.engine.shortName);
        tag.setInteger("Paint", this.paintjobID);
        for (int i = 0; i < this.ammo.length; ++i) {
            if (this.ammo[i] != null) {
                tag.setTag("Ammo " + i, (NBTBase)this.ammo[i].writeToNBT(new NBTTagCompound()));
            }
        }
        for (int i = 0; i < this.bombs.length; ++i) {
            if (this.bombs[i] != null) {
                tag.setTag("Bombs " + i, (NBTBase)this.bombs[i].writeToNBT(new NBTTagCompound()));
            }
        }
        for (int i = 0; i < this.missiles.length; ++i) {
            if (this.missiles[i] != null) {
                tag.setTag("Missiles " + i, (NBTBase)this.missiles[i].writeToNBT(new NBTTagCompound()));
            }
        }
        for (int i = 0; i < this.cargo.length; ++i) {
            if (this.cargo[i] != null) {
                tag.setTag("Cargo " + i, (NBTBase)this.cargo[i].writeToNBT(new NBTTagCompound()));
            }
        }
        if (this.fuel != null) {
            tag.setTag("Fuel", (NBTBase)this.fuel.writeToNBT(new NBTTagCompound()));
        }
        tag.setInteger("FuelInTank", (int)this.fuelInTank);
        for (final DriveablePart part : this.parts.values()) {
            part.writeToNBT(tag);
        }
        tag.setBoolean("emergencyMode", this.emergencyMode);
        tag.setString("seatBelt", this.seatBelt);
        tag.setInteger("WarpLimiterino", this.WarpLimit);
    }
    
    public int getSizeInventory() {
        return this.getFuelSlot() + 1;
    }
    
    public ItemStack getStackInSlot(int i) {
        ItemStack[] inv = this.ammo;
        if (i >= this.ammo.length) {
            i -= this.ammo.length;
            inv = this.bombs;
            if (i >= this.bombs.length) {
                i -= this.bombs.length;
                inv = this.missiles;
                if (i >= this.missiles.length) {
                    i -= this.missiles.length;
                    inv = this.cargo;
                    if (i >= this.cargo.length) {
                        return this.fuel;
                    }
                }
            }
        }
        return inv[i];
    }
    
    public ItemStack decrStackSize(int i, final int j) {
        ItemStack[] inv = this.ammo;
        if (i >= this.ammo.length) {
            i -= this.ammo.length;
            inv = this.bombs;
            if (i >= this.bombs.length) {
                i -= this.bombs.length;
                inv = this.missiles;
                if (i >= this.missiles.length) {
                    i -= this.missiles.length;
                    inv = this.cargo;
                    if (i >= this.cargo.length) {
                        i -= this.cargo.length;
                        inv = new ItemStack[] { this.fuel };
                        this.setInventorySlotContents(this.getFuelSlot(), null);
                    }
                }
            }
        }
        if (inv[i] == null) {
            return null;
        }
        if (inv[i].stackSize <= j) {
            final ItemStack itemstack = inv[i];
            inv[i] = null;
            return itemstack;
        }
        final ItemStack itemstack2 = inv[i].splitStack(j);
        if (inv[i].stackSize <= 0) {
            inv[i] = null;
        }
        return itemstack2;
    }
    
    public ItemStack getStackInSlotOnClosing(final int i) {
        return this.getStackInSlot(i);
    }
    
    public void setInventorySlotContents(int i, final ItemStack stack) {
        if (stack != null) {
            this.inventoryChanged = true;
        }
        ItemStack[] inv = this.ammo;
        if (i >= this.ammo.length) {
            i -= this.ammo.length;
            inv = this.bombs;
            if (i >= this.bombs.length) {
                i -= this.bombs.length;
                inv = this.missiles;
                if (i >= this.missiles.length) {
                    i -= this.missiles.length;
                    inv = this.cargo;
                    if (i >= this.cargo.length) {
                        this.fuel = stack;
                        return;
                    }
                }
            }
        }
        inv[i] = stack;
    }
    
    public String getInventoryName() {
        return "Flan's Secret Data";
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public void markDirty() {
    }
    
    public boolean isUseableByPlayer(final EntityPlayer player) {
        return true;
    }
    
    public void openChest() {
    }
    
    public void closeChest() {
    }
    
    public int getAmmoInventoryStart() {
        return 0;
    }
    
    public int getBombInventoryStart() {
        return this.ammo.length;
    }
    
    public int getMissileInventoryStart() {
        return this.ammo.length + this.bombs.length;
    }
    
    public int getCargoInventoryStart() {
        return this.ammo.length + this.bombs.length + this.missiles.length;
    }
    
    public int getFuelSlot() {
        return this.ammo.length + this.bombs.length + this.missiles.length + this.cargo.length;
    }
    
    public boolean isCustomInventoryName() {
        return false;
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        return (i < this.getBombInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet) || (i >= this.getBombInventoryStart() && i < this.getMissileInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet) || (i >= this.getMissileInventoryStart() && i < this.getCargoInventoryStart() && itemstack != null && itemstack.getItem() instanceof ItemBullet) || (i >= this.getCargoInventoryStart() && i < this.getFuelSlot()) || (i == this.getFuelSlot() && itemstack != null && itemstack.getItem() instanceof ItemPart && ((ItemPart)itemstack.getItem()).type.category == 9);
    }
}
