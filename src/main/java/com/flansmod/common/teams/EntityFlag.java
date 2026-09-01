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
        this.setSize(1.0f, 1.0f);
        this.renderDistanceWeight = 100.0;
        this.ignoreFrustumCheck = true;
    }
    
    public EntityFlag(final World world, final EntityFlagpole pole) {
        this(world);
        this.setPosition(pole.posX, pole.posY + 2.0, pole.posZ);
        this.setBase(pole);
    }
    
    public boolean canBeCollidedWith() {
        return true;
    }
    
    protected void entityInit() {
        this.dataWatcher.addObject(2, (Object)0);
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.base == null && !this.worldObj.isRemote) {
            this.setBase(TeamsManager.getInstance().getBase(this.baseID));
        }
        if (this.ridingEntity != null && this.ridingEntity.isDead) {
            if (this.ridingEntity instanceof EntityPlayerMP) {
                final EntityPlayerMP player = (EntityPlayerMP)this.ridingEntity;
                final Team team = PlayerHandler.getPlayerData(player.getCommandSenderName()).team;
                TeamsManager.getInstance();
                TeamsManager.messageAll("§f" + player.getCommandSenderName() + " dropped the §" + team.textColour + team.name + "§f flag");
            }
            this.mountEntity(null);
        }
        if (!this.addedToChunk) {
            this.worldObj.spawnEntityInWorld((Entity)this);
        }
        if (this.timeUntilReturn > 0) {
            if (this.ridingEntity != null || this.isHome) {
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
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    public void mountEntity(final Entity entity) {
        if (entity == null) {
            if (TeamsManager.getInstance().currentRound != null && TeamsManager.getInstance().currentRound.gametype instanceof GametypeCTF) {
                this.timeUntilReturn = ((GametypeCTF)TeamsManager.getInstance().currentRound.gametype).flagReturnTime * 20;
            }
            else {
                this.timeUntilReturn = 600;
            }
        }
        super.mountEntity(entity);
    }
    
    public void reset() {
        this.mountEntity(null);
        this.setPosition(this.base.posX, this.base.posY + 2.0, this.base.posZ);
        this.isHome = true;
    }
    
    public boolean writeToNBTOptional(final NBTTagCompound tags) {
        return false;
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
    }
    
    public ITeamBase getBase() {
        return this.base;
    }
    
    public void onBaseSet(final int newTeamID) {
        this.dataWatcher.updateObject(2, (Object)(byte)newTeamID);
        this.setPosition(this.base.posX, this.base.posY + 2.0, this.base.posZ);
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
        this.setDead();
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
    
    public int getTeamID() {
        return this.dataWatcher.getWatchableObjectByte(2);
    }
    
    public boolean isSpawnPoint() {
        return false;
    }
    
    public boolean interactFirst(final EntityPlayer player) {
        return false;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack((Item)FlansMod.flag, 1, 0);
        return stack;
    }
    
    public boolean forceChunkLoading() {
        return false;
    }
    
    public boolean isBurning() {
        return false;
    }
}
