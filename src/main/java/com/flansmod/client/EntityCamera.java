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
        this.func_70105_a(0.0f, 0.0f);
    }
    
    public EntityCamera(final World world, final EntityDriveable d) {
        this(world);
        this.driveable = d;
        this.func_70107_b(d.field_70165_t, d.field_70163_u, d.field_70161_v);
    }
    
    public void func_70071_h_() {
        if (this.pupperino > 0) {
            --this.pupperino;
        }
        if (this.pupperino == 1 && FlansModClient.minecraft.field_71474_y.field_74320_O == 1) {
            FlansModClient.minecraft.field_71474_y.field_74320_O = 0;
        }
        final List<Entity> foxes = this.driveable.field_70170_p.func_72839_b((Entity)this.driveable, AxisAlignedBB.func_72330_a(this.driveable.field_70165_t - 200.0, this.driveable.field_70163_u - 500.0, this.driveable.field_70161_v - 200.0, this.driveable.field_70165_t + 200.0, this.driveable.field_70163_u + 500.0, this.driveable.field_70161_v + 200.0));
        for (final Entity stuff : foxes) {
            if (!(stuff instanceof EntityBullet)) {
                continue;
            }
            final EntityBullet missile = (EntityBullet)stuff;
            if (this.driveable != null && missile.type != null && !missile.type.TVguided && !missile.type.starShell && !this.driveable.artilleryMode) {
                continue;
            }
            for (int i = 0; i < this.driveable.getDriveableType().numPassengers + 1; ++i) {
                if (this.driveable.seats[i] != null && missile.owner != null && this.driveable.seats[i].field_70153_n != null && missile.owner == this.driveable.seats[i].field_70153_n && (missile.type.TVguided || this.driveable.artilleryMode)) {
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
                        this.func_70107_b(missile.field_70165_t, missile.field_70163_u, missile.field_70161_v);
                    }
                    this.field_70177_z = missile.field_70177_z;
                    this.field_70125_A = missile.field_70125_A;
                    if (missile.type.TVguided) {
                        if (missile.owner != null && this.pupperino < 40 && FlansModClient.minecraft.field_71439_g == missile.owner) {
                            this.pupperino += 2;
                        }
                        this.func_70078_a((Entity)missile);
                        if (FlansModClient.minecraft.field_71474_y.field_74320_O == 0 && FlansModClient.minecraft.field_71439_g == missile.owner) {
                            FlansModClient.minecraft.field_71474_y.field_74320_O = 1;
                        }
                    }
                }
            }
        }
        if (foxes != null) {
            this.field_70169_q = this.field_70165_t;
            this.field_70167_r = this.field_70163_u;
            this.field_70166_s = this.field_70161_v;
            Vector3f cameraPosition = new Vector3f();
            cameraPosition = this.driveable.axes.findLocalVectorGlobally(cameraPosition);
            final double dX = this.driveable.field_70165_t + cameraPosition.x - this.field_70165_t;
            final double dY = this.driveable.field_70163_u + cameraPosition.y - this.field_70163_u;
            final double dZ = this.driveable.field_70161_v + cameraPosition.z - this.field_70161_v;
            final float lerpAmount = 0.1f;
            this.func_70107_b(this.field_70165_t + dX * lerpAmount, this.field_70163_u + dY * lerpAmount, this.field_70161_v + dZ * lerpAmount);
            if (FlansMod.proxy.mouseControlEnabled() && !(this.driveable instanceof EntityVehicle)) {
                this.field_70177_z = this.driveable.axes.getYaw() - 90.0f;
                this.field_70125_A = this.driveable.axes.getPitch();
            }
            else {
                final Entity player = (Entity)FlansMod.proxy.getThePlayer();
                if (player != null) {
                    this.field_70177_z = player.field_70177_z;
                    this.field_70125_A = player.field_70125_A;
                }
            }
            while (this.field_70177_z - this.field_70126_B >= 180.0f) {
                this.field_70177_z -= 360.0f;
            }
            while (this.field_70177_z - this.field_70126_B < -180.0f) {
                this.field_70177_z += 360.0f;
            }
        }
    }
    
    public ItemStack func_70694_bm() {
        return null;
    }
    
    public ItemStack func_71124_b(final int p_71124_1_) {
        return null;
    }
    
    public void func_70062_b(final int p_70062_1_, final ItemStack p_70062_2_) {
    }
    
    public ItemStack[] func_70035_c() {
        return null;
    }
}
