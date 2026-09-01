// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.item.EntityItem;

public class EntityTeamItem extends EntityItem implements IEntityAdditionalSpawnData
{
    public TileEntitySpawner spawner;
    public double angle;
    public int xCoord;
    public int yCoord;
    public int zCoord;
    
    public EntityTeamItem(final TileEntitySpawner te, final int i) {
        super(te.getWorld(), (double)(te.xCoord + 0.5f), (double)(te.yCoord + 0.5f), (double)(te.zCoord + 0.5f), te.stacksToSpawn.get(i).copy());
        te.itemEntities.add(this);
        this.angle = i * 3.141592653589793 * 2.0 / te.stacksToSpawn.size();
        final double motionX = 0.0;
        this.motionZ = motionX;
        this.motionY = motionX;
        this.motionX = motionX;
        this.lifespan = 1000000000;
        this.spawner = te;
    }
    
    public EntityTeamItem(final World world) {
        super(world);
    }
    
    public void setPositionAndRotation2(final double x, final double y, final double z, final float yaw, final float pitch, final int i) {
    }
    
    public void onUpdate() {
        ++this.ticksExisted;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.prevRotationYaw = this.rotationYaw;
        ++this.age;
        if (this.worldObj.isRemote) {
            this.angle += 0.05;
            this.setPosition(this.xCoord + 0.5f + Math.cos(this.angle) * 0.30000001192092896, (double)(this.yCoord + 0.5f), this.zCoord + 0.5f + Math.sin(this.angle) * 0.30000001192092896);
        }
        if (this.worldObj.isRemote) {
            this.extinguish();
        }
    }
    
    public boolean attackEntityFrom(final DamageSource par1DamageSource, final int par2) {
        return false;
    }
    
    public void onCollideWithPlayer(final EntityPlayer player) {
        if (!this.worldObj.isRemote) {
            final EntityItemPickupEvent event = new EntityItemPickupEvent(player, (EntityItem)this);
            if (MinecraftForge.EVENT_BUS.post((Event)event)) {
                return;
            }
            final int spawnerTeamID = this.spawner.getTeamID();
            final Team spawnerTeam = TeamsManager.getInstance().getTeam(spawnerTeamID);
            final Team playerTeam = PlayerHandler.getPlayerData(player).team;
            if (spawnerTeam != null && playerTeam != spawnerTeam) {
                return;
            }
            final int var2 = this.getEntityItem().stackSize;
            if (event.getResult() == Event.Result.ALLOW || var2 <= 0 || player.inventory.addItemStackToInventory(this.getEntityItem())) {
                FMLCommonHandler.instance().firePlayerItemPickupEvent(player, (EntityItem)this);
                this.playSound("random.pop", 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                player.onItemPickup((Entity)this, var2);
                if (this.getEntityItem().stackSize <= 0) {
                    this.spawner.itemEntities.remove(this);
                    this.setDead();
                }
            }
        }
    }
    
    public void writeSpawnData(final ByteBuf data) {
        if (this.spawner == null) {
            data.writeInt(0);
            data.writeInt(0);
            data.writeInt(0);
        }
        else {
            data.writeInt(this.spawner.xCoord);
            data.writeInt(this.spawner.yCoord);
            data.writeInt(this.spawner.zCoord);
        }
        data.writeDouble(this.angle);
        final NBTTagCompound tags = this.getEntityItem().writeToNBT(new NBTTagCompound());
        ByteBufUtils.writeTag(data, tags);
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.xCoord = data.readInt();
        this.yCoord = data.readInt();
        this.zCoord = data.readInt();
        this.angle = data.readDouble();
        try {
            this.setEntityItemStack(ItemStack.loadItemStackFromNBT(ByteBufUtils.readTag(data)));
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
    public void readEntityFromNBT(final NBTTagCompound tags) {
        this.setDead();
    }
    
    public boolean canAttackWithItem() {
        return false;
    }
    
    public boolean isBurning() {
        return false;
    }
}
