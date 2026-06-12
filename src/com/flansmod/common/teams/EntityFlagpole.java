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
        this.func_70105_a(1.0f, 2.0f);
        this.field_70155_l = 100.0;
    }
    
    public EntityFlagpole(final World world, final double x, final double y, final double z) {
        this(world);
        this.func_70107_b(x, y, z);
        this.flag = new EntityFlag(this.field_70170_p, this);
        this.objects.add(this.flag);
        this.field_70170_p.func_72838_d((Entity)this.flag);
        if (EntityFlagpole.teamsManager.maps.size() > 0) {
            this.map = EntityFlagpole.teamsManager.maps.values().iterator().next();
        }
    }
    
    public EntityFlagpole(final World world, final int x, final int y, final int z) {
        this(world, x + 0.5, y, z + 0.5);
    }
    
    public AxisAlignedBB func_70046_E() {
        return null;
    }
    
    public boolean func_70067_L() {
        return true;
    }
    
    protected void func_70088_a() {
    }
    
    protected void func_70037_a(final NBTTagCompound tags) {
        this.setBaseID(tags.func_74762_e("ID"));
        final int func_74762_e = tags.func_74762_e("TeamID");
        this.defaultTeamID = func_74762_e;
        this.currentTeamID = func_74762_e;
        this.map = EntityFlagpole.teamsManager.maps.get(tags.func_74779_i("Map"));
        this.name = tags.func_74779_i("Name");
        this.setMap(this.map);
    }
    
    protected void func_70014_b(final NBTTagCompound tags) {
        tags.func_74768_a("TeamID", this.defaultTeamID);
        tags.func_74778_a("Map", (this.map == null) ? "" : this.map.shortName);
        tags.func_74768_a("ID", this.getBaseID());
        tags.func_74778_a("Name", this.name);
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
        this.func_70106_y();
    }
    
    public Entity getEntity() {
        return this;
    }
    
    public double getPosX() {
        return this.field_70165_t;
    }
    
    public double getPosY() {
        return this.field_70163_u;
    }
    
    public double getPosZ() {
        return this.field_70161_v;
    }
    
    public World getWorld() {
        return this.field_70170_p;
    }
    
    public void roundCleanup() {
        if (this.flag != null) {
            this.flag.reset();
        }
    }
    
    public ITeamObject getFlag() {
        return this.flag;
    }
    
    public void func_70071_h_() {
        super.func_70071_h_();
        if (!this.field_70170_p.field_72995_K) {
            if (this.flag == null) {
                this.flag = new EntityFlag(this.field_70170_p, this);
                this.objects.add(this.flag);
            }
            if (!this.flag.field_70175_ag) {
                this.field_70170_p.func_72838_d((Entity)this.flag);
            }
            if (this.flag.isHome) {
                this.flag.func_70107_b(this.field_70165_t, this.field_70163_u + 2.0, this.field_70161_v);
            }
        }
        if (this.field_70170_p.field_72995_K) {
            this.func_70066_B();
        }
    }
    
    public void func_70106_y() {
        super.func_70106_y();
    }
    
    public boolean func_130002_c(final EntityPlayer player) {
        final PlayerData data = PlayerHandler.getPlayerData(player);
        if (!this.field_70170_p.field_72995_K && data.team == null && TeamsManager.getInstance().playerIsOp(player) && (player.func_71045_bC() == null || !(player.func_71045_bC().func_77973_b() instanceof ItemOpStick))) {
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
    
    public boolean func_70027_ad() {
        return false;
    }
    
    static {
        EntityFlagpole.teamsManager = TeamsManager.getInstance();
    }
}
