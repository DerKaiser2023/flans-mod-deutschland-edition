// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.item.Item;
import com.flansmod.common.FlansMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class EntityFlag extends Entity implements ITeamObject
{
    public int baseID;
    public EntityFlagpole base;
    public boolean isHome;
    public int timeUntilReturn;
    
    public EntityFlag(final World world) {
        super(world);
        this.isHome = true;
        this.func_70105_a(1.0f, 1.0f);
        this.field_70155_l = 100.0;
        this.field_70158_ak = true;
    }
    
    public EntityFlag(final World world, final EntityFlagpole pole) {
        this(world);
        this.func_70107_b(pole.field_70165_t, pole.field_70163_u + 2.0, pole.field_70161_v);
        this.setBase(pole);
    }
    
    public boolean func_70067_L() {
        return true;
    }
    
    protected void func_70088_a() {
        this.field_70180_af.func_75682_a(2, (Object)0);
    }
    
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.base == null && !this.field_70170_p.field_72995_K) {
            this.setBase(TeamsManager.getInstance().getBase(this.baseID));
        }
        if (this.field_70154_o != null && this.field_70154_o.field_70128_L) {
            if (this.field_70154_o instanceof EntityPlayerMP) {
                final EntityPlayerMP player = (EntityPlayerMP)this.field_70154_o;
                final Team team = PlayerHandler.getPlayerData(player.func_70005_c_()).team;
                TeamsManager.getInstance();
                TeamsManager.messageAll("§f" + player.func_70005_c_() + " dropped the §" + team.textColour + team.name + "§f flag");
            }
            this.func_70078_a(null);
        }
        if (!this.field_70175_ag) {
            this.field_70170_p.func_72838_d((Entity)this);
        }
        if (this.timeUntilReturn > 0) {
            if (this.field_70154_o != null || this.isHome) {
                this.timeUntilReturn = 0;
            }
            else {
                --this.timeUntilReturn;
                if (this.timeUntilReturn == 0) {
                    this.reset();
                    final Team flagTeam = TeamsManager.getInstance().getTeam(this.getBase().getOwnerID());
                    TeamsManager.messageAll("§fThe §" + flagTeam.textColour + flagTeam.name + "§f flag returned itself");
                }
            }
        }
        if (this.field_70170_p.field_72995_K) {
            this.func_70066_B();
        }
    }
    
    public void func_70078_a(final Entity entity) {
        if (entity == null) {
            if (TeamsManager.getInstance().currentRound != null && TeamsManager.getInstance().currentRound.gametype instanceof GametypeCTF) {
                this.timeUntilReturn = ((GametypeCTF)TeamsManager.getInstance().currentRound.gametype).flagReturnTime * 20;
            }
            else {
                this.timeUntilReturn = 600;
            }
        }
        super.func_70078_a(entity);
    }
    
    public void reset() {
        this.func_70078_a(null);
        this.func_70107_b(this.base.field_70165_t, this.base.field_70163_u + 2.0, this.base.field_70161_v);
        this.isHome = true;
    }
    
    public boolean func_70039_c(final NBTTagCompound tags) {
        return false;
    }
    
    protected void func_70037_a(final NBTTagCompound tags) {
    }
    
    protected void func_70014_b(final NBTTagCompound tags) {
    }
    
    public ITeamBase getBase() {
        return this.base;
    }
    
    public void onBaseSet(final int newTeamID) {
        this.field_70180_af.func_75692_b(2, (Object)(byte)newTeamID);
        this.func_70107_b(this.base.field_70165_t, this.base.field_70163_u + 2.0, this.base.field_70161_v);
    }
    
    public void onBaseCapture(final int newTeamID) {
        this.onBaseSet(newTeamID);
    }
    
    public void tick() {
    }
    
    public void setBase(final ITeamBase b) {
        this.base = (EntityFlagpole)b;
        if (this.base != null) {
            this.base.addObject(this);
            this.onBaseSet(this.base.getOwnerID());
        }
    }
    
    public void destroy() {
        this.func_70106_y();
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
    
    public int getTeamID() {
        return this.field_70180_af.func_75683_a(2);
    }
    
    public boolean isSpawnPoint() {
        return false;
    }
    
    public boolean func_130002_c(final EntityPlayer player) {
        return false;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack((Item)FlansMod.flag, 1, 0);
        return stack;
    }
    
    public boolean forceChunkLoading() {
        return false;
    }
    
    public boolean func_70027_ad() {
        return false;
    }
}
