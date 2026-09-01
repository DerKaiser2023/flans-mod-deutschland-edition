// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.util.MovingObjectPosition;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.network.PacketMGFire;
import org.lwjgl.input.Mouse;
import com.flansmod.common.PlayerData;
import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.common.teams.Team;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityPlane;
import net.minecraft.entity.monster.EntityMob;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketAAGunAngles;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.network.PacketPlaySound;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.common.FlansMod;
import net.minecraft.util.Vec3;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;

public class EntityAAGun extends Entity implements IEntityAdditionalSpawnData
{
    private int sUpdateTime;
    private double sPosX;
    private double sPosY;
    private double sPosZ;
    private double sYaw;
    private double sPitch;
    private double field_9388_j;
    private double field_9387_k;
    private double field_9386_l;
    private int health;
    private int shootDelay;
    public float gunYaw;
    public float gunPitch;
    public float prevGunYaw;
    public float prevGunPitch;
    public float[] barrelRecoil;
    public AAGunType type;
    public Entity towedByEntity;
    public ItemStack[] ammo;
    public int reloadTimer;
    public int currentBarrel;
    public boolean mouseHeld;
    public boolean wasShooting;
    public int shootcnt;
    public int shootTimeCount;
    public EntityPlayer placer;
    public String placerName;
    public Entity target;
    public static final float targetAcquireInterval = 10.0f;
    public int ticksSinceUsed;
    
    public EntityAAGun(final World world) {
        super(world);
        this.shootcnt = 1;
        this.shootTimeCount = 0;
        this.placer = null;
        this.placerName = null;
        this.target = null;
        this.ticksSinceUsed = 0;
        this.preventEntitySpawning = true;
        this.setSize(2.0f, 2.0f);
        this.yOffset = 0.0f;
        this.gunYaw = 0.0f;
        this.gunPitch = 0.0f;
        this.shootDelay = 0;
    }
    
    public EntityAAGun(final World world, final AAGunType type1, final double d, final double d1, final double d2, final EntityPlayer p) {
        this(world);
        this.placer = p;
        this.placerName = p.getCommandSenderName();
        this.type = type1;
        this.initType();
        this.setPosition(d, d1, d2);
    }
    
    public void setPosition(final double d, final double d1, final double d2) {
        this.posX = d;
        this.posY = d1;
        this.posZ = d2;
        final float f = this.width / 2.0f;
        final float f2 = this.height;
        this.boundingBox.setBounds(d - f, d1 - this.yOffset + this.yOffset2, d2 - f, d + f, d1 - this.yOffset + this.yOffset2 + f2, d2 + f);
    }
    
    public void setPositionAndRotation2(final double d, final double d1, final double d2, final float f, final float f1, final int i) {
        this.sPosX = d;
        this.sPosY = d1;
        this.sPosZ = d2;
        this.sYaw = f;
        this.sPitch = f1;
        this.sUpdateTime = i;
    }
    
    public void initType() {
        this.health = this.type.health;
        this.barrelRecoil = new float[this.type.numBarrels];
        this.ammo = new ItemStack[this.type.numBarrels];
    }
    
    protected void entityInit() {
    }
    
    public void onCollideWithPlayer(final EntityPlayer par1EntityPlayer) {
    }
    
    public void applyEntityCollision(final Entity entity) {
    }
    
    public AxisAlignedBB getCollisionBox(final Entity entity) {
        return entity.boundingBox;
    }
    
    public AxisAlignedBB getBoundingBox() {
        return this.boundingBox;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    public double getMountedYOffset() {
        return 0.0;
    }
    
    public void setMouseHeld(final boolean held) {
        this.mouseHeld = held;
    }
    
    public boolean attackEntityFrom(final DamageSource damagesource, final float i) {
        if (damagesource.damageType.equals("player")) {
            final Entity player = damagesource.getEntity();
            if (player != this.riddenByEntity) {
                if (this.riddenByEntity != null) {
                    return this.riddenByEntity.attackEntityFrom(damagesource, i);
                }
                if (TeamsManager.canBreakGuns) {
                    this.setDead();
                }
            }
        }
        else {
            this.setBeenAttacked();
            this.health -= (int)i;
            if (!this.worldObj.isRemote && this.health <= 0) {
                this.setDead();
            }
        }
        return true;
    }
    
    public Vec3 rotate(final double x, final double y, final double z) {
        final double cosYaw = Math.cos(180.0f - this.gunYaw * 3.1415927f / 180.0f);
        final double sinYaw = Math.sin(180.0f - this.gunYaw * 3.1415927f / 180.0f);
        final double cosPitch = Math.cos(this.gunPitch * 3.1415927f / 180.0f);
        final double sinPitch = Math.sin(this.gunPitch * 3.1415927f / 180.0f);
        final double newX = x * cosYaw + (y * sinPitch + z * cosPitch) * sinYaw;
        final double newY = y * cosPitch - z * sinPitch;
        final double newZ = -x * sinYaw + (y * sinPitch + z * cosPitch) * cosYaw;
        return Vec3.createVectorHelper(newX, newY, newZ);
    }
    
    public boolean canBeCollidedWith() {
        return !this.isDead;
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.type == null) {
            FlansMod.log("EntityAAGun.onUpdate() Error: AAGunType is null (" + this + ")");
            this.setDead();
            return;
        }
        this.prevGunYaw = this.gunYaw;
        this.prevGunPitch = this.gunPitch;
        ++this.ticksSinceUsed;
        if (TeamsManager.aaLife > 0 && this.ticksSinceUsed > TeamsManager.aaLife * 20) {
            this.setDead();
        }
        if (this.riddenByEntity != null) {
            this.ticksSinceUsed = 0;
            this.gunYaw = this.riddenByEntity.rotationYaw - 90.0f;
            this.gunPitch = this.riddenByEntity.rotationPitch;
        }
        if (this.gunPitch > this.type.bottomViewLimit) {
            this.gunPitch = this.type.bottomViewLimit;
        }
        if (this.gunPitch < -this.type.topViewLimit) {
            this.gunPitch = -this.type.topViewLimit;
        }
        for (int i = 0; i < this.type.numBarrels; ++i) {
            final float[] barrelRecoil = this.barrelRecoil;
            final int n = i;
            barrelRecoil[n] *= 0.9f;
        }
        if (this.shootDelay > 0) {
            --this.shootDelay;
        }
        if (this.isSentry()) {
            if (this.target != null && this.target.isDead) {
                this.target = null;
            }
            if (this.target == null && this.ticksExisted % 10.0f == 0.0f) {
                this.target = this.getValidTarget();
            }
            if (this.target != null) {
                final double dX = this.target.posX - this.posX;
                final double dY = this.target.posY - (this.posY + 1.5);
                final double dZ = this.target.posZ - this.posZ;
                final double distanceToTarget = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
                if (distanceToTarget > this.type.targetRange) {
                    this.target = null;
                }
                else if (!this.type.canShootHomingMissile) {
                    final float newYaw = 180.0f + (float)Math.atan2(dZ, dX) * 180.0f / 3.14159f;
                    final float newPitch = -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180.0f / 3.14159f;
                    final float turnSpeed = 0.25f;
                    this.gunYaw += (newYaw - this.gunYaw) * turnSpeed;
                    this.gunPitch += (newPitch - this.gunPitch) * turnSpeed;
                }
                else {
                    final float newYaw = 180.0f + (float)Math.atan2(dZ, dX) * 180.0f / 3.14159f;
                    final float newPitch = -(float)Math.atan2(dY, Math.sqrt(dX * dX + dZ * dZ)) * 180.0f / 3.14159f;
                    this.gunYaw = newYaw;
                    this.gunPitch = newPitch;
                }
            }
        }
        if (!this.onGround && !this.worldObj.isRemote) {
            this.motionY -= 0.0245;
        }
        this.motionX *= 0.5;
        this.motionZ *= 0.5;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.worldObj.isRemote && this.riddenByEntity != null && this.riddenByEntity == FMLClientHandler.instance().getClient().thePlayer) {
            this.checkForShooting();
        }
        if (this.worldObj.isRemote) {
            if (this.sUpdateTime > 0) {
                final double d1 = this.posX + (this.sPosX - this.posX) / this.sUpdateTime;
                final double d2 = this.posY + (this.sPosY - this.posY) / this.sUpdateTime;
                final double d3 = this.posZ + (this.sPosZ - this.posZ) / this.sUpdateTime;
                double d4;
                for (d4 = this.sYaw - this.rotationYaw; d4 < -180.0; d4 += 360.0) {}
                while (d4 >= 180.0) {
                    d4 -= 360.0;
                }
                this.rotationYaw += (float)(d4 / this.sUpdateTime);
                this.rotationPitch += (float)((this.sPitch - this.rotationPitch) / this.sUpdateTime);
                --this.sUpdateTime;
                this.setPosition(d1, d2, d3);
                this.setRotation(this.rotationYaw, this.rotationPitch);
            }
            return;
        }
        if (this.riddenByEntity != null && this.riddenByEntity.isDead) {
            this.riddenByEntity = null;
        }
        if (this.reloadTimer > 0) {
            --this.reloadTimer;
        }
        else {
            for (int i = 0; i < this.type.numBarrels; ++i) {
                if (this.ammo[i] != null && this.ammo[i].getMetadata() == this.ammo[i].getMaxDurability()) {
                    this.ammo[i] = null;
                }
                if (this.ammo[i] == null && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
                    final int slot = this.findAmmo((EntityPlayer)this.riddenByEntity);
                    if (slot >= 0) {
                        this.ammo[i] = ((EntityPlayer)this.riddenByEntity).inventory.getStackInSlot(slot);
                        if (!((EntityPlayer)this.riddenByEntity).capabilities.isCreativeMode) {
                            ((EntityPlayer)this.riddenByEntity).inventory.decrStackSize(slot, 1);
                        }
                        this.reloadTimer = this.type.reloadTime;
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.reloadSound, true);
                    }
                }
            }
        }
        if (this.shootcnt > 0 && this.shootcnt < 10) {
            ++this.shootcnt;
        }
        if (!this.worldObj.isRemote && this.reloadTimer <= 0 && this.shootDelay <= 0) {
            if (this.mouseHeld && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)this.riddenByEntity;
                for (int j = 0; j < this.type.numBarrels; ++j) {
                    if (this.shootDelay <= 0 && this.ammo[j] != null && (!this.type.fireAlternately || (this.type.fireAlternately && this.currentBarrel == j))) {
                        final BulletType bullet = BulletType.getBullet(this.ammo[j].getItem());
                        if (!((EntityPlayer)this.riddenByEntity).capabilities.isCreativeMode) {
                            this.ammo[j].damageItem(1, (EntityLivingBase)player);
                        }
                        this.shootDelay = this.type.shootDelay;
                        this.barrelRecoil[j] = (float)this.type.recoil;
                        this.worldObj.spawnEntityInWorld((Entity)((ItemBullet)this.ammo[j].getItem()).getEntity(this.worldObj, this.rotate(this.type.barrelX[this.currentBarrel] / 16.0 - this.type.barrelZ[this.currentBarrel] / 16.0, this.type.barrelY[this.currentBarrel] / 16.0, this.type.barrelX[this.currentBarrel] / 16.0 + this.type.barrelZ[this.currentBarrel] / 16.0).addVector(this.posX, this.posY, this.posZ), this.gunYaw + 90.0f, this.gunPitch, (EntityLivingBase)player, (float)this.type.accuracy, (float)this.type.damage, this.ammo[j].getMetadata(), this.type));
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.shootSound, true);
                    }
                }
                this.currentBarrel = (this.currentBarrel + 1) % this.type.numBarrels;
            }
            else if (this.target != null && this.shootcnt > 5) {
                for (int k = 0; k < this.type.numBarrels; ++k) {
                    int ammoSlot = k;
                    if (this.type.shareAmmo) {
                        ammoSlot = 0;
                    }
                    if (this.shootDelay <= 0 && this.ammo[ammoSlot] != null && (!this.type.fireAlternately || (this.type.fireAlternately && this.currentBarrel == ammoSlot))) {
                        final BulletType bullet = BulletType.getBullet(this.ammo[ammoSlot].getItem());
                        this.ammo[ammoSlot].setMetadata(this.ammo[ammoSlot].getMetadata() + 1);
                        this.shootDelay = this.type.shootDelay;
                        this.barrelRecoil[ammoSlot] = (float)this.type.recoil;
                        this.worldObj.spawnEntityInWorld((Entity)((ItemBullet)this.ammo[ammoSlot].getItem()).getEntity(this.worldObj, this.rotate(this.type.barrelX[this.currentBarrel] / 16.0 - this.type.barrelZ[this.currentBarrel] / 16.0, this.type.barrelY[this.currentBarrel] / 16.0, this.type.barrelX[this.currentBarrel] / 16.0 + this.type.barrelZ[this.currentBarrel] / 16.0).addVector(this.posX, this.posY + 1.5, this.posZ), this.gunYaw + 90.0f, this.gunPitch, (EntityLivingBase)this.placer, (float)this.type.accuracy, (float)this.type.damage, this.ammo[ammoSlot].getMetadata(), this.type));
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.type.shootSound, true);
                        if (this.shootTimeCount >= this.type.countExplodeAfterShoot - 1 && this.type.countExplodeAfterShoot != -1 && !this.worldObj.isRemote) {
                            this.setDead();
                        }
                        ++this.shootTimeCount;
                    }
                }
                this.currentBarrel = (this.currentBarrel + 1) % this.type.numBarrels;
            }
        }
        if (!this.worldObj.isRemote) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketAAGunAngles(this), this.posX, this.posY, this.posZ, 50.0f, this.dimension);
        }
    }
    
    public boolean isSentry() {
        return this.type.targetMobs || this.type.targetPlayers || this.type.targetPlanes || this.type.targetVehicles || this.type.targetMechas;
    }
    
    public Entity getValidTarget() {
        if (this.worldObj.isRemote) {
            return null;
        }
        if (this.placer == null && this.placerName != null) {
            this.placer = this.worldObj.getPlayerEntityByName(this.placerName);
        }
        for (final Object obj : this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, this.boundingBox.expand((double)this.type.targetRange, (double)this.type.targetRange, (double)this.type.targetRange))) {
            final Entity candidateEntity = (Entity)obj;
            if (((this.type.targetMobs && candidateEntity instanceof EntityMob) || (this.type.targetPlayers && candidateEntity instanceof EntityPlayer) || (this.type.targetPlanes && candidateEntity instanceof EntityPlane) || (this.type.targetVehicles && candidateEntity instanceof EntityVehicle)) && candidateEntity.getDistanceToEntity((Entity)this) < this.type.targetRange) {
                if (candidateEntity instanceof EntityPlayer) {
                    if (candidateEntity == this.placer) {
                        continue;
                    }
                    if (candidateEntity.getCommandSenderName().equals(this.placerName)) {
                        continue;
                    }
                    if (TeamsManager.enabled && TeamsManager.getInstance().currentRound != null && this.placer != null) {
                        final PlayerData placerData = PlayerHandler.getPlayerData(this.placer, this.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
                        final PlayerData candidateData = PlayerHandler.getPlayerData((EntityPlayer)candidateEntity, this.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
                        if (candidateData.team == Team.spectators) {
                            continue;
                        }
                        if (candidateData.team == null) {
                            continue;
                        }
                        if (!TeamsManager.getInstance().currentRound.gametype.playerCanAttack((EntityPlayerMP)this.placer, placerData.team, (EntityPlayerMP)candidateEntity, candidateData.team)) {
                            continue;
                        }
                    }
                }
                return candidateEntity;
            }
        }
        return null;
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
    
    public void setDead() {
        super.setDead();
        if (this.worldObj.isRemote) {
            return;
        }
        if (this.type.isDropThis) {
            this.dropItem(this.type.getItem(), 1);
        }
        for (final ItemStack stack : this.ammo) {
            if (stack != null) {
                this.entityDropItem(stack, 0.5f);
            }
        }
    }
    
    public void updateRiderPosition() {
        if (this.riddenByEntity == null) {
            return;
        }
        final double x = this.type.gunnerX / 16.0;
        final double y = this.type.gunnerY / 16.0;
        final double z = this.type.gunnerZ / 16.0;
        final double cosYaw = Math.cos(-this.gunYaw / 180.0 * 3.141592653589793);
        final double sinYaw = Math.sin(-this.gunYaw / 180.0 * 3.141592653589793);
        final double cosPitch = Math.cos(this.gunPitch / 180.0 * 3.141592653589793);
        final double sinPitch = Math.sin(this.gunPitch / 180.0 * 3.141592653589793);
        final double x2 = x * cosYaw + z * sinYaw;
        final double z2 = -x * sinYaw + z * cosYaw;
        this.riddenByEntity.setPosition(this.posX + x2, this.posY + y, this.posZ + z2);
    }
    
    protected void writeEntityToNBT(final NBTTagCompound nbttagcompound) {
        if (this.type == null) {
            FlansMod.log("EntityAAGun.writeEntityToNBT() Error: AAGunType is null (" + this + ")");
            this.setDead();
            return;
        }
        nbttagcompound.setString("Type", this.type.shortName);
        nbttagcompound.setInteger("Health", this.health);
        nbttagcompound.setFloat("RotationYaw", this.rotationYaw);
        nbttagcompound.setFloat("RotationPitch", this.rotationPitch);
        for (int i = 0; i < this.type.numBarrels; ++i) {
            if (this.ammo[i] != null) {
                nbttagcompound.setTag("Ammo " + i, (NBTBase)this.ammo[i].writeToNBT(new NBTTagCompound()));
            }
        }
        nbttagcompound.setString("Placer", this.placer.getCommandSenderName());
    }
    
    protected void readEntityFromNBT(final NBTTagCompound nbttagcompound) {
        this.type = AAGunType.getAAGun(nbttagcompound.getString("Type"));
        if (this.type == null) {
            FlansMod.log("EntityAAGun.readEntityFromNBT() Error: AAGunType is null (" + this + ")");
            this.setDead();
            return;
        }
        this.initType();
        this.health = nbttagcompound.getInteger("Health");
        this.rotationYaw = nbttagcompound.getFloat("RotationYaw");
        this.rotationPitch = nbttagcompound.getFloat("RotationPitch");
        for (int i = 0; i < this.type.numBarrels; ++i) {
            try {
                this.ammo[i] = ItemStack.loadItemStackFromNBT(nbttagcompound.getCompoundTag("Ammo " + i));
            }
            catch (final Exception e) {
                e.printStackTrace();
            }
        }
        this.placerName = nbttagcompound.getString("Placer");
    }
    
    public float getShadowSize() {
        return 0.0f;
    }
    
    public boolean interactFirst(final EntityPlayer entityplayer) {
        if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.riddenByEntity != entityplayer) {
            return true;
        }
        if (!this.worldObj.isRemote) {
            if (this.riddenByEntity == entityplayer) {
                entityplayer.mountEntity((Entity)null);
                return true;
            }
            if (!this.isSentry()) {
                entityplayer.mountEntity((Entity)this);
            }
            for (int i = 0; i < (this.type.shareAmmo ? 1 : this.type.numBarrels); ++i) {
                if (this.ammo[i] == null) {
                    final int slot = this.findAmmo(entityplayer);
                    if (slot >= 0) {
                        this.ammo[i] = entityplayer.inventory.getStackInSlot(slot).copy();
                        this.ammo[i].stackSize = 1;
                        if (!entityplayer.capabilities.isCreativeMode) {
                            entityplayer.inventory.decrStackSize(slot, 1);
                        }
                        this.reloadTimer = this.type.reloadTime;
                        this.worldObj.playSoundAtEntity((Entity)this, this.type.reloadSound, 1.0f, 1.0f / (this.rand.nextFloat() * 0.4f + 0.8f));
                    }
                }
            }
        }
        return true;
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
    
    public void writeSpawnData(final ByteBuf data) {
        ByteBufUtils.writeUTF8String(data, this.type.shortName);
    }
    
    public void readSpawnData(final ByteBuf data) {
        try {
            this.type = AAGunType.getAAGun(ByteBufUtils.readUTF8String(data));
            this.initType();
        }
        catch (final Exception e) {
            FlansMod.log("Failed to retreive AA gun type from server.");
            super.setDead();
            e.printStackTrace();
        }
    }
    
    public boolean canRiderInteract() {
        return false;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        final ItemStack stack = new ItemStack(this.type.item, 1, 0);
        return stack;
    }
}
