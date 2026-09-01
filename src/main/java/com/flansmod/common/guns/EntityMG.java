// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import java.util.ArrayList;
import net.minecraft.util.MovingObjectPosition;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTBase;
import com.flansmod.common.teams.EntityGunItem;
import java.util.Arrays;
import com.flansmod.common.teams.Team;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketMGMount;
import javax.vecmath.Vector3f;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.DamageSource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketMGFire;
import org.lwjgl.input.Mouse;
import com.flansmod.common.types.InfoType;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.FlansMod;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;

public class EntityMG extends Entity implements IEntityAdditionalSpawnData
{
    public int blockX;
    public int blockY;
    public int blockZ;
    public int direction;
    public GunType type;
    public ItemStack ammo;
    public int reloadTimer;
    public int soundDelay;
    public int shootDelay;
    public static List<EntityMG> mgs;
    public EntityPlayer gunner;
    public boolean isShooting;
    public boolean wasShooting;
    public int ticksSinceUsed;
    
    public EntityMG(final World world) {
        super(world);
        this.wasShooting = false;
        this.ticksSinceUsed = 0;
        this.setSize(1.0f, 1.0f);
        this.ignoreFrustumCheck = true;
    }
    
    public EntityMG(final World world, final int x, final int y, final int z, final int dir, final GunType gunType) {
        super(world);
        this.wasShooting = false;
        this.ticksSinceUsed = 0;
        this.setSize(1.0f, 1.0f);
        this.blockX = x;
        this.blockY = y;
        this.blockZ = z;
        this.prevPosX = x + 0.5;
        this.prevPosY = y;
        this.prevPosZ = z + 0.5;
        this.setPosition(x + 0.5, (double)y, z + 0.5);
        this.direction = dir;
        this.rotationYaw = 0.0f;
        this.rotationPitch = -60.0f;
        this.type = gunType;
        this.ignoreFrustumCheck = true;
        EntityMG.mgs.add(this);
    }
    
    public boolean canBeCollidedWith() {
        return !this.isDead;
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.type == null) {
            FlansMod.log("EntityMG.onUpdate() Error: GunType is null (" + this + ")");
            this.setDead();
            return;
        }
        ++this.ticksSinceUsed;
        if (TeamsManager.mgLife > 0 && this.ticksSinceUsed > TeamsManager.mgLife * 20) {
            this.setDead();
        }
        if (this.worldObj.getBlock(this.blockX, this.blockY - 1, this.blockZ) == null && !this.worldObj.isRemote) {
            this.setDead();
        }
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        if (this.gunner != null) {
            this.ticksSinceUsed = 0;
            this.rotationYaw = this.gunner.rotationYaw - this.direction * 90;
            while (this.rotationYaw < -180.0f) {
                this.rotationYaw += 360.0f;
            }
            while (this.rotationYaw > 180.0f) {
                this.rotationYaw -= 360.0f;
            }
            this.rotationPitch = this.gunner.rotationPitch;
            if (this.rotationYaw > this.type.sideViewLimit) {
                final float sideViewLimit = this.type.sideViewLimit;
                this.rotationYaw = sideViewLimit;
                this.prevRotationYaw = sideViewLimit;
            }
            if (this.rotationYaw < -this.type.sideViewLimit) {
                final float n = -this.type.sideViewLimit;
                this.rotationYaw = n;
                this.prevRotationYaw = n;
            }
            final float angle = this.direction * 90.0f + this.rotationYaw;
            final double dX = this.type.standBackDist * Math.sin(angle * 3.1415927f / 180.0f);
            final double dZ = -(this.type.standBackDist * Math.cos(angle * 3.1415927f / 180.0f));
            this.gunner.setPosition(this.blockX + 0.5 + dX, this.blockY + this.gunner.getYOffset() - 0.5, this.blockZ + 0.5 + dZ);
        }
        else {
            --this.rotationPitch;
        }
        if (this.rotationPitch < this.type.topViewLimit) {
            this.rotationPitch = this.type.topViewLimit;
        }
        if (this.rotationPitch > this.type.bottomViewLimit) {
            this.rotationPitch = this.type.bottomViewLimit;
        }
        if (this.shootDelay > 0) {
            --this.shootDelay;
        }
        if (this.reloadTimer > 0) {
            --this.reloadTimer;
        }
        if (this.ammo != null && this.ammo.getMetadata() == this.ammo.getMaxDurability()) {
            this.ammo = null;
        }
        if (this.ammo == null && this.gunner != null) {
            final int slot = this.findAmmo(this.gunner);
            if (slot >= 0) {
                this.ammo = this.gunner.inventory.getStackInSlot(slot);
                if (!this.gunner.capabilities.isCreativeMode) {
                    this.gunner.inventory.setInventorySlotContents(slot, (ItemStack)null);
                }
                this.reloadTimer = this.type.reloadTime;
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.reloadSound, false);
            }
        }
        if (this.worldObj.isRemote && this.gunner != null && this.gunner == FMLClientHandler.instance().getClient().thePlayer && this.type.mode == EnumFireMode.FULLAUTO) {
            this.checkForShooting();
        }
        if (!this.worldObj.isRemote && this.isShooting) {
            if (this.gunner == null || this.gunner.isDead) {
                this.isShooting = false;
            }
            if (this.ammo == null || this.reloadTimer > 0 || this.shootDelay > 0) {
                return;
            }
            final BulletType bullet = BulletType.getBullet(this.ammo.getItem());
            if (this.gunner != null && !this.gunner.capabilities.isCreativeMode) {
                this.ammo.damageItem(1, (EntityLivingBase)this.gunner);
            }
            this.shootDelay = (int)this.type.shootDelay;
            this.worldObj.spawnEntityInWorld((Entity)((ItemBullet)this.ammo.getItem()).getEntity(this.worldObj, Vec3.createVectorHelper(this.blockX + 0.5, (double)(this.blockY + this.type.pivotHeight), this.blockZ + 0.5), this.direction * 90.0f + this.rotationYaw, this.rotationPitch, (EntityLivingBase)this.gunner, this.type.bulletSpread, this.type.damage, this.ammo.getMetadata(), this.type));
            if (this.soundDelay <= 0) {
                this.soundDelay = this.type.shootSoundLength;
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.shootSound, this.type.distortSound);
            }
        }
        if (this.soundDelay > 0) {
            --this.soundDelay;
        }
    }
    
    @SideOnly(Side.CLIENT)
    private void checkForShooting() {
        if (Mouse.isButtonDown(0) && !this.wasShooting && !FlansMod.proxy.isScreenOpen()) {
            FlansMod.getPacketHandler().sendToServer(new PacketMGFire(true));
            this.wasShooting = true;
        }
        else if (!Mouse.isButtonDown(0) && this.wasShooting) {
            FlansMod.getPacketHandler().sendToServer(new PacketMGFire(false));
            this.wasShooting = false;
        }
    }
    
    public void mouseHeld(final boolean held) {
        this.isShooting = held;
    }
    
    public boolean attackEntityFrom(final DamageSource damagesource, final float i) {
        if (damagesource.damageType.equals("player")) {
            final Entity player = damagesource.getEntity();
            if (player == this.gunner) {
                if (this.type.mode == EnumFireMode.FULLAUTO) {
                    return true;
                }
                if (this.ammo == null || this.reloadTimer > 0 || this.shootDelay > 0) {
                    return true;
                }
                final BulletType bullet = BulletType.getBullet(this.ammo.getItem());
                if (this.gunner != null && !this.gunner.capabilities.isCreativeMode) {
                    this.ammo.damageItem(1, (EntityLivingBase)player);
                }
                this.shootDelay = (int)this.type.shootDelay;
                if (!this.worldObj.isRemote) {
                    this.worldObj.spawnEntityInWorld(((ItemBullet)this.ammo.getItem()).getEntity(this.worldObj, (EntityLivingBase)player, this.type.bulletSpread, this.type.damage, this.type.bulletSpeed, false, this.ammo.getMetadata(), this.type, new Vector3f(0.0f, 0.0f, 0.0f)));
                }
                if (this.soundDelay <= 0) {
                    final float distortion = this.type.distortSound ? (1.0f / (this.rand.nextFloat() * 0.4f + 0.8f)) : 1.0f;
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.shootSound, this.type.distortSound);
                    this.soundDelay = this.type.shootSoundLength;
                }
            }
            else {
                if (this.gunner != null) {
                    return this.gunner.attackEntityFrom(damagesource, i);
                }
                if (TeamsManager.canBreakGuns) {
                    this.setDead();
                }
            }
        }
        return true;
    }
    
    public boolean interactFirst(final EntityPlayer player) {
        if (this.gunner != null && this.gunner instanceof EntityPlayer && this.gunner != player) {
            return true;
        }
        if (!this.worldObj.isRemote) {
            if (this.gunner == player) {
                this.mountGun(player, false);
                FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, false), this.posX, this.posY, this.posZ, FlansMod.driveableUpdateRange, this.dimension);
                return true;
            }
            if (PlayerHandler.getPlayerData(player).mountingGun != null && !PlayerHandler.getPlayerData(player).mountingGun.isDead) {
                PlayerHandler.getPlayerData(player).mountingGun.mountGun(player, false);
                return true;
            }
            if (TeamsManager.instance.currentRound != null && PlayerHandler.getPlayerData(player).team == Team.spectators) {
                return true;
            }
            this.mountGun(player, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, true), this.posX, this.posY, this.posZ, FlansMod.driveableUpdateRange, this.dimension);
            if (this.ammo == null) {
                final int slot = this.findAmmo(player);
                if (slot >= 0) {
                    this.ammo = player.inventory.getStackInSlot(slot);
                    player.inventory.setInventorySlotContents(slot, (ItemStack)null);
                    this.reloadTimer = this.type.reloadTime;
                    this.worldObj.playSoundAtEntity((Entity)this, this.type.reloadSound, 1.0f, 1.0f / (this.rand.nextFloat() * 0.4f + 0.8f));
                }
            }
        }
        return true;
    }
    
    public void mountGun(final EntityPlayer player, final boolean mounting) {
        if (player == null) {
            return;
        }
        final Side side = this.worldObj.isRemote ? Side.CLIENT : Side.SERVER;
        if (PlayerHandler.getPlayerData(player, side) == null) {
            return;
        }
        if (mounting) {
            this.gunner = player;
            PlayerHandler.getPlayerData(player, side).mountingGun = this;
        }
        else {
            PlayerHandler.getPlayerData(player, side).mountingGun = null;
            this.gunner = null;
        }
    }
    
    public int findAmmo(final EntityPlayer player) {
        for (int i = 0; i < player.inventory.getSizeInventory(); ++i) {
            final ItemStack stack = player.inventory.getStackInSlot(i);
            if (this.type.isAmmo(stack)) {
                return i;
            }
        }
        return -1;
    }
    
    public void setDead() {
        try {
            if (!this.worldObj.isRemote) {
                if (TeamsManager.weaponDrops == 2) {
                    final EntityGunItem gunEntity = new EntityGunItem(this.worldObj, this.posX, this.posY, this.posZ, new ItemStack(this.type.getItem()), Arrays.asList(this.ammo));
                    this.worldObj.spawnEntityInWorld((Entity)gunEntity);
                }
                else if (TeamsManager.weaponDrops == 1) {
                    this.dropItem(this.type.getItem(), 1);
                    if (this.ammo != null) {
                        this.entityDropItem(this.ammo, 0.5f);
                    }
                }
            }
            if (this.gunner != null && PlayerHandler.getPlayerData(this.gunner) != null) {
                PlayerHandler.getPlayerData(this.gunner).mountingGun = null;
            }
        }
        catch (final Exception e) {
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
        super.setDead();
    }
    
    protected void writeEntityToNBT(final NBTTagCompound nbttagcompound) {
        if (this.type == null) {
            FlansMod.log("EntityMG.writeEntityToNBT() Error: GunType is null (" + this + ")");
            this.setDead();
            return;
        }
        nbttagcompound.setString("Type", this.type.shortName);
        if (this.ammo != null) {
            nbttagcompound.setTag("Ammo", (NBTBase)this.ammo.writeToNBT(new NBTTagCompound()));
        }
        nbttagcompound.setInteger("BlockX", this.blockX);
        nbttagcompound.setInteger("BlockY", this.blockY);
        nbttagcompound.setInteger("BlockZ", this.blockZ);
        nbttagcompound.setByte("Dir", (byte)this.direction);
    }
    
    protected void readEntityFromNBT(final NBTTagCompound nbttagcompound) {
        this.type = GunType.getGun(nbttagcompound.getString("Type"));
        if (this.type == null) {
            FlansMod.log("EntityMG.readEntityFromNBT() Error: GunType is null (" + this + ")");
            this.setDead();
            return;
        }
        this.blockX = nbttagcompound.getInteger("BlockX");
        this.blockY = nbttagcompound.getInteger("BlockY");
        this.blockZ = nbttagcompound.getInteger("BlockZ");
        this.direction = nbttagcompound.getByte("Dir");
        try {
            this.ammo = ItemStack.loadItemStackFromNBT(nbttagcompound.getCompoundTag("Ammo"));
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void entityInit() {
    }
    
    public void writeSpawnData(final ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.type.shortName);
        data.writeInt(this.direction);
        data.writeInt(this.blockX);
        data.writeInt(this.blockY);
        data.writeInt(this.blockZ);
        ByteBufUtils.writeItemStack(data, this.ammo);
    }
    
    public void readSpawnData(final ByteBuf data) {
        try {
            this.type = GunType.getGun(ByteBufUtils.readUTF8String(data));
            this.direction = data.readInt();
            this.blockX = data.readInt();
            this.blockY = data.readInt();
            this.blockZ = data.readInt();
            this.ammo = ByteBufUtils.readItemStack(data);
        }
        catch (final Exception e) {
            FlansMod.log("Failed to retreive gun type from server.");
            super.setDead();
            e.printStackTrace();
        }
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack(this.type.item, 1, 0);
        return stack;
    }
    
    static {
        EntityMG.mgs = new ArrayList<EntityMG>();
    }
}
