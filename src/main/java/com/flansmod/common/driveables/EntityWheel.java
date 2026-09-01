// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.FlansMod;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraft.entity.Entity;

public class EntityWheel extends Entity implements IEntityAdditionalSpawnData
{
    public EntityDriveable vehicle;
    public int ID;
    @SideOnly(Side.CLIENT)
    public boolean foundVehicle;
    private int vehicleID;
    public boolean onDeck;
    private int invulnerableUnmountCount;
    public int timeLimitDriveableNull;
    
    public EntityWheel(final World world) {
        super(world);
        this.onDeck = false;
        this.timeLimitDriveableNull = 0;
        this.func_70105_a(1.0f, 1.0f);
        this.field_70138_W = 1.5f;
        this.invulnerableUnmountCount = 0;
    }
    
    public EntityWheel(final World world, final EntityDriveable entity, final int i) {
        this(world);
        this.vehicle = entity;
        this.vehicleID = entity.func_145782_y();
        this.ID = i;
        this.initPosition();
    }
    
    public void initPosition() {
        final Vector3f wheelVector = this.vehicle.axes.findLocalVectorGlobally(this.vehicle.getDriveableType().wheelPositions[this.ID].position);
        this.func_70107_b(this.vehicle.field_70165_t + wheelVector.x, this.vehicle.field_70163_u + wheelVector.y, this.vehicle.field_70161_v + wheelVector.z);
        this.field_70138_W = this.vehicle.getDriveableType().wheelStepHeight;
        this.field_70169_q = this.field_70165_t;
        this.field_70167_r = this.field_70163_u;
        this.field_70166_s = this.field_70161_v;
    }
    
    protected void func_70069_a(final float k) {
    }
    
    protected void func_70088_a() {
    }
    
    protected void func_70037_a(final NBTTagCompound tags) {
        this.func_70106_y();
    }
    
    protected void func_70014_b(final NBTTagCompound tags) {
    }
    
    public void func_70071_h_() {
        if (this.field_70154_o != null) {
            this.invulnerableUnmountCount = 80;
        }
        else if (this.invulnerableUnmountCount > 0) {
            --this.invulnerableUnmountCount;
        }
        if (this.field_70170_p.field_72995_K && !this.foundVehicle) {
            if (this.field_70170_p.func_73045_a(this.vehicleID) instanceof EntityDriveable) {
                this.vehicle = (EntityDriveable)this.field_70170_p.func_73045_a(this.vehicleID);
            }
            if (this.vehicle == null) {
                return;
            }
            this.foundVehicle = true;
            this.vehicle.wheels[this.ID] = this;
        }
        if (this.vehicle == null) {
            return;
        }
        EntityDriveable entD;
        if (this.field_70170_p.func_73045_a(this.vehicleID) instanceof EntityDriveable) {
            entD = (EntityDriveable)this.field_70170_p.func_73045_a(this.vehicleID);
        }
        else {
            entD = null;
        }
        if (entD == null) {
            ++this.timeLimitDriveableNull;
        }
        else {
            this.timeLimitDriveableNull = 0;
        }
        if (this.timeLimitDriveableNull > 1200) {
            this.func_70106_y();
        }
        if (!this.field_70175_ag) {
            this.field_70170_p.func_72838_d((Entity)this);
        }
    }
    
    public double getSpeedXZ() {
        return Math.sqrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y);
    }
    
    public double getSpeedXYZ() {
        return Math.cbrt(this.field_70159_w * this.field_70159_w + this.field_70179_y * this.field_70179_y + this.field_70181_x * this.field_70181_x);
    }
    
    public void func_70056_a(final double d, final double d1, final double d2, final float f, final float f1, final int i) {
    }
    
    public AxisAlignedBB func_70114_g(final Entity entity) {
        if (this.vehicle.seats[0] != null && this.vehicle.getDriveableType().collisionDamageEnable && this.vehicle.seats[0].field_70153_n != null && this.vehicle.throttle > this.vehicle.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes);
                if (this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes > 23.0f && ((EntityLiving)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
            else if (entity instanceof EntityPlayer && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes);
                if (this.vehicle.throttle * this.vehicle.throttle * this.vehicle.getDriveableType().collisionDamageTimes > 23.0f && ((EntityPlayer)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
        }
        return this.field_70121_D;
    }
    
    public void writeSpawnData(final ByteBuf data) {
        data.writeInt(this.vehicleID);
        data.writeInt(this.ID);
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.vehicleID = data.readInt();
        this.ID = data.readInt();
        if (this.vehicle instanceof EntityDriveable) {
            this.vehicle = (EntityDriveable)this.field_70170_p.func_73045_a(this.vehicleID);
        }
        if (this.vehicle != null) {
            this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        }
    }
}
