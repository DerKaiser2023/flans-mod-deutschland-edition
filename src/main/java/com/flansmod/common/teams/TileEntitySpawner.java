// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTBase;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.FlansMod;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.Packet;
import java.util.ArrayList;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.tileentity.TileEntity;

public class TileEntitySpawner extends TileEntity implements ITeamObject
{
    public int spawnDelay;
    public List<ItemStack> stacksToSpawn;
    public List<EntityTeamItem> itemEntities;
    public Entity spawnedEntity;
    public ITeamBase base;
    private int baseID;
    private int dimension;
    public int currentDelay;
    private ForgeChunkManager.Ticket chunkTicket;
    private boolean uninitialized;
    private int loadDistance;
    private int teamID;
    public String map;
    
    public TileEntitySpawner() {
        this.spawnDelay = 1200;
        this.stacksToSpawn = new ArrayList<ItemStack>();
        this.itemEntities = new ArrayList<EntityTeamItem>();
        this.baseID = -1;
        this.uninitialized = true;
        this.loadDistance = 1;
        TeamsManager.getInstance().registerObject(this);
    }
    
    public Packet getDescriptionPacket() {
        final NBTTagCompound tags = new NBTTagCompound();
        tags.setByte("TeamID", (byte)((this.base == null) ? 0 : ((byte)this.base.getOwnerID())));
        tags.setString("Map", (this.base == null || this.base.getMap() == null) ? "" : this.base.getMap().shortName);
        return (Packet)new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 1, tags);
    }
    
    public void onDataPacket(final NetworkManager net, final S35PacketUpdateTileEntity packet) {
        this.teamID = packet.getNbtCompound().getByte("TeamID");
        this.map = packet.getNbtCompound().getString("Map");
    }
    
    public void updateEntity() {
        if (this.worldObj.isRemote) {
            return;
        }
        if (this.baseID >= 0 && this.base == null) {
            final ITeamBase newBase = TeamsManager.getInstance().getBase(this.baseID);
            if (newBase != null) {
                this.setBase(newBase);
                newBase.addObject(this);
            }
        }
        if (this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord) != FlansMod.spawner) {
            this.destroy();
            return;
        }
        if (this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord) == 1) {
            return;
        }
        for (int i = this.itemEntities.size() - 1; i >= 0; --i) {
            if (this.itemEntities.get(i).isDead) {
                this.itemEntities.remove(i);
            }
        }
        if (this.currentDelay > 0 && this.itemEntities.size() == 0) {
            --this.currentDelay;
        }
        if (this.currentDelay == 0) {
            this.currentDelay = ((this.spawnDelay > 0) ? this.spawnDelay : 20);
            for (int i = 0; i < this.stacksToSpawn.size(); ++i) {
                if (this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord) == 2) {
                    if (this.spawnedEntity == null || this.spawnedEntity.isDead) {
                        final ItemStack stack = this.stacksToSpawn.get(i);
                        if (stack != null && stack.getItem() instanceof ItemPlane) {
                            this.spawnedEntity = ((ItemPlane)stack.getItem()).spawnPlane(this.worldObj, this.xCoord + 0.5f, this.yCoord + 0.5f, this.zCoord + 0.5f, stack);
                        }
                        if (stack != null && stack.getItem() instanceof ItemVehicle) {
                            this.spawnedEntity = ((ItemVehicle)stack.getItem()).spawnVehicle(this.worldObj, this.xCoord + 0.5f, this.yCoord + 0.5f, this.zCoord + 0.5f, stack);
                        }
                        if (stack != null && stack.getItem() instanceof ItemAAGun) {
                            this.spawnedEntity = ((ItemAAGun)stack.getItem()).spawnAAGun(this.worldObj, this.xCoord + 0.5f, this.yCoord, this.zCoord + 0.5f, stack);
                        }
                    }
                }
                else {
                    final EntityTeamItem itemEntity = new EntityTeamItem(this, i);
                    this.worldObj.spawnEntityInWorld((Entity)itemEntity);
                }
            }
        }
    }
    
    public void writeToNBT(final NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        nbt.setInteger("delay", this.spawnDelay);
        nbt.setInteger("Base", this.baseID);
        nbt.setInteger("dim", this.worldObj.provider.dimensionId);
        nbt.setInteger("numStacks", this.stacksToSpawn.size());
        for (int i = 0; i < this.stacksToSpawn.size(); ++i) {
            final NBTTagCompound stackNBT = ((ItemStack)this.stacksToSpawn.get(i)).writeToNBT(new NBTTagCompound());
            nbt.setTag("stack" + i, (NBTBase)stackNBT);
        }
    }
    
    public void readFromNBT(final NBTTagCompound nbt) {
        super.readFromNBT(nbt);
        final int getInteger = nbt.getInteger("delay");
        this.spawnDelay = getInteger;
        this.currentDelay = getInteger;
        if (this.currentDelay < 20) {
            this.currentDelay = 20;
        }
        this.baseID = nbt.getInteger("Base");
        this.dimension = nbt.getInteger("dim");
        this.setBase(TeamsManager.getInstance().getBase(this.baseID));
        if (this.base != null) {
            this.base.addObject(this);
        }
        for (int i = 0; i < nbt.getInteger("numStacks"); ++i) {
            try {
                this.stacksToSpawn.add(ItemStack.loadItemStackFromNBT(nbt.getCompoundTag("stack" + i)));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public ITeamBase getBase() {
        return this.base;
    }
    
    public int getTeamID() {
        if (this.worldObj.isRemote) {
            return this.teamID;
        }
        return (this.base == null) ? 0 : this.base.getOwnerID();
    }
    
    public void onBaseSet(final int newTeamID) {
        FlansMod.packetHandler.sendToDimension(this.getDescriptionPacket(), (this.worldObj == null) ? this.dimension : this.worldObj.provider.dimensionId);
    }
    
    public void onBaseCapture(final int newTeamID) {
        this.onBaseSet(newTeamID);
    }
    
    public void setBase(final ITeamBase b) {
        this.base = b;
        if (b != null) {
            this.baseID = b.getBaseID();
        }
        FlansMod.packetHandler.sendToDimension(this.getDescriptionPacket(), (this.worldObj == null) ? this.dimension : this.worldObj.provider.dimensionId);
    }
    
    public void tick() {
    }
    
    public void destroy() {
        this.worldObj.setBlock(this.xCoord, this.yCoord, this.zCoord, Blocks.air);
    }
    
    public double getPosX() {
        return this.xCoord + 0.5f;
    }
    
    public double getPosY() {
        return this.yCoord + 0.5f;
    }
    
    public double getPosZ() {
        return this.zCoord + 0.5f;
    }
    
    public boolean isSpawnPoint() {
        final int metadata = this.worldObj.getBlockMetadata(this.xCoord, this.yCoord, this.zCoord);
        return metadata == 1;
    }
    
    public boolean forceChunkLoading() {
        return false;
    }
}
