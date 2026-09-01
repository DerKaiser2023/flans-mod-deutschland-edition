// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import java.util.Iterator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.FlansMod;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import java.util.ArrayList;
import net.minecraft.world.World;
import java.util.List;
import net.minecraft.entity.Entity;

public class EntityFlagpole extends Entity implements ITeamBase
{
    public int defaultTeamID;
    public int currentTeamID;
    public TeamsMap map;
    public List<ITeamObject> objects;
    public String name;
    private int ID;
    private EntityFlag flag;
    public static TeamsManager teamsManager;
    private boolean uninitialized;
    private int loadDistance;
    
    public EntityFlagpole(final World world) {
        super(world);
        this.objects = new ArrayList<ITeamObject>();
        this.name = "Default Name";
        this.uninitialized = true;
        this.loadDistance = 1;
        this.setSize(1.0f, 2.0f);
        this.renderDistanceWeight = 100.0;
    }
    
    public EntityFlagpole(final World world, final double x, final double y, final double z) {
        this(world);
        this.setPosition(x, y, z);
        this.flag = new EntityFlag(this.worldObj, this);
        this.objects.add(this.flag);
        this.worldObj.spawnEntityInWorld((Entity)this.flag);
        if (EntityFlagpole.teamsManager.maps.size() > 0) {
            this.map = EntityFlagpole.teamsManager.maps.values().iterator().next();
        }
    }
    
    public EntityFlagpole(final World world, final int x, final int y, final int z) {
        this(world, x + 0.5, y, z + 0.5);
    }
    
    public AxisAlignedBB getBoundingBox() {
        return null;
    }
    
    public boolean canBeCollidedWith() {
        return true;
    }
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
        this.setBaseID(tags.getInteger("ID"));
        final int getInteger = tags.getInteger("TeamID");
        this.defaultTeamID = getInteger;
        this.currentTeamID = getInteger;
        this.map = EntityFlagpole.teamsManager.maps.get(tags.getString("Map"));
        this.name = tags.getString("Name");
        this.setMap(this.map);
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
        tags.setInteger("TeamID", this.defaultTeamID);
        tags.setString("Map", (this.map == null) ? "" : this.map.shortName);
        tags.setInteger("ID", this.getBaseID());
        tags.setString("Name", this.name);
    }
    
    public TeamsMap getMap() {
        return this.map;
    }
    
    public void setMap(final TeamsMap newMap) {
        if (newMap == null) {
            FlansMod.log("Flagpole given invalid map");
            return;
        }
        if (this.map != null && this.map != newMap) {
            this.map.removeBase(this);
        }
        (this.map = newMap).addBase(this);
    }
    
    public void setMapFirstTime(final TeamsMap newMap) {
        if (newMap == null) {
            FlansMod.log("Flagpole given invalid map");
            return;
        }
        if (this.map != null && this.map != newMap) {
            this.map.removeBase(this);
        }
        (this.map = newMap).addBaseFirstTime(this);
    }
    
    public List<ITeamObject> getObjects() {
        return this.objects;
    }
    
    public void tick() {
    }
    
    public void startRound() {
        this.currentTeamID = this.defaultTeamID;
    }
    
    public void addObject(final ITeamObject object) {
        this.objects.add(object);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String newName) {
        this.name = newName;
    }
    
    public void destroy() {
        this.setDead();
    }
    
    public Entity getEntity() {
        return this;
    }
    
    public double getPosX() {
        return this.posX;
    }
    
    public double getPosY() {
        return this.posY;
    }
    
    public double getPosZ() {
        return this.posZ;
    }
    
    public World getWorld() {
        return this.worldObj;
    }
    
    public void roundCleanup() {
        if (this.flag != null) {
            this.flag.reset();
        }
    }
    
    public ITeamObject getFlag() {
        return this.flag;
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote) {
            if (this.flag == null) {
                this.flag = new EntityFlag(this.worldObj, this);
                this.objects.add(this.flag);
            }
            if (!this.flag.addedToChunk) {
                this.worldObj.spawnEntityInWorld((Entity)this.flag);
            }
            if (this.flag.isHome) {
                this.flag.setPosition(this.posX, this.posY + 2.0, this.posZ);
            }
        }
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    public void setDead() {
        super.setDead();
    }
    
    public boolean interactFirst(final EntityPlayer player) {
        final PlayerData data = PlayerHandler.getPlayerData(player);
        if (!this.worldObj.isRemote && data.team == null && TeamsManager.getInstance().playerIsOp(player) && (player.getCurrentEquippedItem() == null || !(player.getCurrentEquippedItem().getItem() instanceof ItemOpStick))) {
            ItemOpStick.openBaseEditGUI(this, (EntityPlayerMP)player);
        }
        return false;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack((Item)FlansMod.flag, 1, 0);
        return stack;
    }
    
    public void setBaseID(final int i) {
        this.ID = i;
    }
    
    public int getBaseID() {
        return this.ID;
    }
    
    public int getDefaultOwnerID() {
        return this.defaultTeamID;
    }
    
    public void setDefaultOwnerID(final int id) {
        this.defaultTeamID = id;
        this.currentTeamID = id;
        for (final ITeamObject object : this.objects) {
            object.onBaseSet(id);
        }
    }
    
    public int getOwnerID() {
        return this.currentTeamID;
    }
    
    public void setOwnerID(final int id) {
        this.currentTeamID = id;
    }
    
    public boolean isBurning() {
        return false;
    }
    
    static {
        EntityFlagpole.teamsManager = TeamsManager.getInstance();
    }
}
