// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.EntityLivingBase;

public class EntityCamera extends EntityLivingBase
{
    public EntityDriveable driveable;
    public int pupperino;
    
    public EntityCamera(final World world) {
        super(world);
        this.pupperino = 0;
        this.setSize(0.0f, 0.0f);
    }
    
    public EntityCamera(final World world, final EntityDriveable d) {
        this(world);
        this.driveable = d;
        this.setPosition(d.posX, d.posY, d.posZ);
    }
    
    public void onUpdate() {
        if (this.pupperino > 0) {
            --this.pupperino;
        }
        if (this.pupperino == 1 && FlansModClient.minecraft.gameSettings.thirdPersonView == 1) {
            FlansModClient.minecraft.gameSettings.thirdPersonView = 0;
        }
        final List<Entity> foxes = this.driveable.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this.driveable, AxisAlignedBB.getBoundingBox(this.driveable.posX - 200.0, this.driveable.posY - 500.0, this.driveable.posZ - 200.0, this.driveable.posX + 200.0, this.driveable.posY + 500.0, this.driveable.posZ + 200.0));
        for (final Entity stuff : foxes) {
            if (!(stuff instanceof EntityBullet)) {
                continue;
            }
            final EntityBullet missile = (EntityBullet)stuff;
            if (this.driveable != null && missile.type != null && !missile.type.TVguided && !missile.type.starShell && !this.driveable.artilleryMode) {
                continue;
            }
            for (int i = 0; i < this.driveable.getDriveableType().numPassengers + 1; ++i) {
                if (this.driveable.seats[i] != null && missile.owner != null && this.driveable.seats[i].riddenByEntity != null && missile.owner == this.driveable.seats[i].riddenByEntity && (missile.type.TVguided || this.driveable.artilleryMode)) {
                    final EnumWeaponType weaponType = missile.type.weaponType;
                    final EnumWeaponType weaponType2 = missile.type.weaponType;
                    Label_0420: {
                        if (!weaponType.equals(EnumWeaponType.MISSILE)) {
                            final EnumWeaponType weaponType3 = missile.type.weaponType;
                            final EnumWeaponType weaponType4 = missile.type.weaponType;
                            if (!weaponType3.equals(EnumWeaponType.SHELL)) {
                                final EnumWeaponType weaponType5 = missile.type.weaponType;
                                final EnumWeaponType weaponType6 = missile.type.weaponType;
                                if (!weaponType5.equals(EnumWeaponType.BOMB)) {
                                    break Label_0420;
                                }
                            }
                        }
                        this.setPosition(missile.posX, missile.posY, missile.posZ);
                    }
                    this.rotationYaw = missile.rotationYaw;
                    this.rotationPitch = missile.rotationPitch;
                    if (missile.type.TVguided) {
                        if (missile.owner != null && this.pupperino < 40 && FlansModClient.minecraft.thePlayer == missile.owner) {
                            this.pupperino += 2;
                        }
                        this.mountEntity((Entity)missile);
                        if (FlansModClient.minecraft.gameSettings.thirdPersonView == 0 && FlansModClient.minecraft.thePlayer == missile.owner) {
                            FlansModClient.minecraft.gameSettings.thirdPersonView = 1;
                        }
                    }
                }
            }
        }
        if (foxes != null) {
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            Vector3f cameraPosition = new Vector3f();
            cameraPosition = this.driveable.axes.findLocalVectorGlobally(cameraPosition);
            final double dX = this.driveable.posX + cameraPosition.x - this.posX;
            final double dY = this.driveable.posY + cameraPosition.y - this.posY;
            final double dZ = this.driveable.posZ + cameraPosition.z - this.posZ;
            final float lerpAmount = 0.1f;
            this.setPosition(this.posX + dX * lerpAmount, this.posY + dY * lerpAmount, this.posZ + dZ * lerpAmount);
            if (FlansMod.proxy.mouseControlEnabled() && !(this.driveable instanceof EntityVehicle)) {
                this.rotationYaw = this.driveable.axes.getYaw() - 90.0f;
                this.rotationPitch = this.driveable.axes.getPitch();
            }
            else {
                final Entity player = (Entity)FlansMod.proxy.getThePlayer();
                if (player != null) {
                    this.rotationYaw = player.rotationYaw;
                    this.rotationPitch = player.rotationPitch;
                }
            }
            while (this.rotationYaw - this.prevRotationYaw >= 180.0f) {
                this.rotationYaw -= 360.0f;
            }
            while (this.rotationYaw - this.prevRotationYaw < -180.0f) {
                this.rotationYaw += 360.0f;
            }
        }
    }
    
    public ItemStack getHeldItem() {
        return null;
    }
    
    public ItemStack getEquipmentInSlot(final int p_71124_1_) {
        return null;
    }
    
    public void setCurrentItemOrArmor(final int p_70062_1_, final ItemStack p_70062_2_) {
    }
    
    public ItemStack[] getInventory() {
        return null;
    }
}
