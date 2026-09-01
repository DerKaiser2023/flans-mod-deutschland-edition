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
    
    public Packet func_145844_m() {
        final NBTTagCompound tags = new NBTTagCompound();
        tags.func_74774_a("TeamID", (byte)((this.base == null) ? 0 : ((byte)this.base.getOwnerID())));
        tags.func_74778_a("Map", (this.base == null || this.base.getMap() == null) ? "" : this.base.getMap().shortName);
        return (Packet)new S35PacketUpdateTileEntity(this.field_145851_c, this.field_145848_d, this.field_145849_e, 1, tags);
    }
    
    public void onDataPacket(final NetworkManager net, final S35PacketUpdateTileEntity packet) {
        this.teamID = packet.func_148857_g().func_74771_c("TeamID");
        this.map = packet.func_148857_g().func_74779_i("Map");
    }
    
    public void func_145845_h() {
        if (this.field_145850_b.field_72995_K) {
            return;
        }
        if (this.baseID >= 0 && this.base == null) {
            final ITeamBase newBase = TeamsManager.getInstance().getBase(this.baseID);
            if (newBase != null) {
                this.setBase(newBase);
                newBase.addObject(this);
            }
        }
        if (this.field_145850_b.func_147439_a(this.field_145851_c, this.field_145848_d, this.field_145849_e) != FlansMod.spawner) {
            this.destroy();
            return;
        }
        if (this.field_145850_b.func_72805_g(this.field_145851_c, this.field_145848_d, this.field_145849_e) == 1) {
            return;
        }
        for (int i = this.itemEntities.size() - 1; i >= 0; --i) {
            if (this.itemEntities.get(i).field_70128_L) {
                this.itemEntities.remove(i);
            }
        }
        if (this.currentDelay > 0 && this.itemEntities.size() == 0) {
            --this.currentDelay;
        }
        if (this.currentDelay == 0) {
            this.currentDelay = ((this.spawnDelay > 0) ? this.spawnDelay : 20);
            for (int i = 0; i < this.stacksToSpawn.size(); ++i) {
                if (this.field_145850_b.func_72805_g(this.field_145851_c, this.field_145848_d, this.field_145849_e) == 2) {
                    if (this.spawnedEntity == null || this.spawnedEntity.field_70128_L) {
                        final ItemStack stack = this.stacksToSpawn.get(i);
                        if (stack != null && stack.func_77973_b() instanceof ItemPlane) {
                            this.spawnedEntity = ((ItemPlane)stack.func_77973_b()).spawnPlane(this.field_145850_b, this.field_145851_c + 0.5f, this.field_145848_d + 0.5f, this.field_145849_e + 0.5f, stack);
                        }
                        if (stack != null && stack.func_77973_b() instanceof ItemVehicle) {
                            this.spawnedEntity = ((ItemVehicle)stack.func_77973_b()).spawnVehicle(this.field_145850_b, this.field_145851_c + 0.5f, this.field_145848_d + 0.5f, this.field_145849_e + 0.5f, stack);
                        }
                        if (stack != null && stack.func_77973_b() instanceof ItemAAGun) {
                            this.spawnedEntity = ((ItemAAGun)stack.func_77973_b()).spawnAAGun(this.field_145850_b, this.field_145851_c + 0.5f, this.field_145848_d, this.field_145849_e + 0.5f, stack);
                        }
                    }
                }
                else {
                    final EntityTeamItem itemEntity = new EntityTeamItem(this, i);
                    this.field_145850_b.func_72838_d((Entity)itemEntity);
                }
            }
        }
    }
    
    public void func_145841_b(final NBTTagCompound nbt) {
        super.func_145841_b(nbt);
        nbt.func_74768_a("delay", this.spawnDelay);
        nbt.func_74768_a("Base", this.baseID);
        nbt.func_74768_a("dim", this.field_145850_b.field_73011_w.field_76574_g);
        nbt.func_74768_a("numStacks", this.stacksToSpawn.size());
        for (int i = 0; i < this.stacksToSpawn.size(); ++i) {
            final NBTTagCompound stackNBT = ((ItemStack)this.stacksToSpawn.get(i)).writeToNBT(new NBTTagCompound());
            nbt.func_74782_a("stack" + i, (NBTBase)stackNBT);
        }
    }
    
    public void func_145839_a(final NBTTagCompound nbt) {
        super.func_145839_a(nbt);
        final int func_74762_e = nbt.func_74762_e("delay");
        this.spawnDelay = func_74762_e;
        this.currentDelay = func_74762_e;
        if (this.currentDelay < 20) {
            this.currentDelay = 20;
        }
        this.baseID = nbt.func_74762_e("Base");
        this.dimension = nbt.func_74762_e("dim");
        this.setBase(TeamsManager.getInstance().getBase(this.baseID));
        if (this.base != null) {
            this.base.addObject(this);
        }
        for (int i = 0; i < nbt.func_74762_e("numStacks"); ++i) {
            try {
                this.stacksToSpawn.add(ItemStack.loadItemStackFromNBT(nbt.func_74775_l("stack" + i)));
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
        if (this.field_145850_b.field_72995_K) {
            return this.teamID;
        }
        return (this.base == null) ? 0 : this.base.getOwnerID();
    }
    
    public void onBaseSet(final int newTeamID) {
        FlansMod.packetHandler.sendToDimension(this.func_145844_m(), (this.field_145850_b == null) ? this.dimension : this.field_145850_b.field_73011_w.field_76574_g);
    }
    
    public void onBaseCapture(final int newTeamID) {
        this.onBaseSet(newTeamID);
    }
    
    public void setBase(final ITeamBase b) {
        this.base = b;
        if (b != null) {
            this.baseID = b.getBaseID();
        }
        FlansMod.packetHandler.sendToDimension(this.func_145844_m(), (this.field_145850_b == null) ? this.dimension : this.field_145850_b.field_73011_w.field_76574_g);
    }
    
    public void tick() {
    }
    
    public void destroy() {
        this.field_145850_b.func_147449_b(this.field_145851_c, this.field_145848_d, this.field_145849_e, Blocks.field_150350_a);
    }
    
    public double getPosX() {
        return this.field_145851_c + 0.5f;
    }
    
    public double getPosY() {
        return this.field_145848_d + 0.5f;
    }
    
    public double getPosZ() {
        return this.field_145849_e + 0.5f;
    }
    
    public boolean isSpawnPoint() {
        final int metadata = this.field_145850_b.func_72805_g(this.field_145851_c, this.field_145848_d, this.field_145849_e);
        return metadata == 1;
    }
    
    public boolean forceChunkLoading() {
        return false;
    }
}
