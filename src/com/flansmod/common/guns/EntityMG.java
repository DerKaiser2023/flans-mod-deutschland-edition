// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import java.util.ArrayList;
import net.minecraft.util.MovingObjectPosition;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTBase;
import com.EconomyPlus.lib.util.NBTParser;
import net.minecraft.nbt.NBTTagCompound;
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
        this.func_70105_a(1.0f, 1.0f);
        this.field_70158_ak = true;
    }
    
    public EntityMG(final World world, final int x, final int y, final int z, final int dir, final GunType gunType) {
        super(world);
        this.wasShooting = false;
        this.ticksSinceUsed = 0;
        this.func_70105_a(1.0f, 1.0f);
        this.blockX = x;
        this.blockY = y;
        this.blockZ = z;
        this.field_70169_q = x + 0.5;
        this.field_70167_r = y;
        this.field_70166_s = z + 0.5;
        this.func_70107_b(x + 0.5, (double)y, z + 0.5);
        this.direction = dir;
        this.field_70177_z = 0.0f;
        this.field_70125_A = -60.0f;
        this.type = gunType;
        this.field_70158_ak = true;
        EntityMG.mgs.add(this);
    }
    
    public boolean func_70067_L() {
        return !this.field_70128_L;
    }
    
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.type == null) {
            FlansMod.log("EntityMG.onUpdate() Error: GunType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        ++this.ticksSinceUsed;
        if (TeamsManager.mgLife > 0 && this.ticksSinceUsed > TeamsManager.mgLife * 20) {
            this.func_70106_y();
        }
        if (this.field_70170_p.func_147439_a(this.blockX, this.blockY - 1, this.blockZ) == null && !this.field_70170_p.field_72995_K) {
            this.func_70106_y();
        }
        this.field_70126_B = this.field_70177_z;
        this.field_70127_C = this.field_70125_A;
        if (this.gunner != null) {
            this.ticksSinceUsed = 0;
            this.field_70177_z = this.gunner.field_70177_z - this.direction * 90;
            while (this.field_70177_z < -180.0f) {
                this.field_70177_z += 360.0f;
            }
            while (this.field_70177_z > 180.0f) {
                this.field_70177_z -= 360.0f;
            }
            this.field_70125_A = this.gunner.field_70125_A;
            if (this.field_70177_z > this.type.sideViewLimit) {
                final float sideViewLimit = this.type.sideViewLimit;
                this.field_70177_z = sideViewLimit;
                this.field_70126_B = sideViewLimit;
            }
            if (this.field_70177_z < -this.type.sideViewLimit) {
                final float n = -this.type.sideViewLimit;
                this.field_70177_z = n;
                this.field_70126_B = n;
            }
            final float angle = this.direction * 90.0f + this.field_70177_z;
            final double dX = this.type.standBackDist * Math.sin(angle * 3.1415927f / 180.0f);
            final double dZ = -(this.type.standBackDist * Math.cos(angle * 3.1415927f / 180.0f));
            this.gunner.func_70107_b(this.blockX + 0.5 + dX, this.blockY + this.gunner.func_70033_W() - 0.5, this.blockZ + 0.5 + dZ);
        }
        else {
            --this.field_70125_A;
        }
        if (this.field_70125_A < this.type.topViewLimit) {
            this.field_70125_A = this.type.topViewLimit;
        }
        if (this.field_70125_A > this.type.bottomViewLimit) {
            this.field_70125_A = this.type.bottomViewLimit;
        }
        if (this.shootDelay > 0) {
            --this.shootDelay;
        }
        if (this.reloadTimer > 0) {
            --this.reloadTimer;
        }
        if (this.ammo != null && this.ammo.func_77960_j() == this.ammo.func_77958_k()) {
            this.ammo = null;
        }
        if (this.ammo == null && this.gunner != null) {
            final int slot = this.findAmmo(this.gunner);
            if (slot >= 0) {
                this.ammo = this.gunner.field_71071_by.func_70301_a(slot);
                if (!this.gunner.field_71075_bZ.field_75098_d) {
                    this.gunner.field_71071_by.func_70299_a(slot, (ItemStack)null);
                }
                this.reloadTimer = this.type.reloadTime;
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.type.reloadSound, false);
            }
        }
        if (this.field_70170_p.field_72995_K && this.gunner != null && this.gunner == FMLClientHandler.instance().getClient().field_71439_g && this.type.mode == EnumFireMode.FULLAUTO) {
            this.checkForShooting();
        }
        if (!this.field_70170_p.field_72995_K && this.isShooting) {
            if (this.gunner == null || this.gunner.field_70128_L) {
                this.isShooting = false;
            }
            if (this.ammo == null || this.reloadTimer > 0 || this.shootDelay > 0) {
                return;
            }
            final BulletType bullet = BulletType.getBullet(this.ammo.func_77973_b());
            if (this.gunner != null && !this.gunner.field_71075_bZ.field_75098_d) {
                this.ammo.func_77972_a(1, (EntityLivingBase)this.gunner);
            }
            this.shootDelay = (int)this.type.shootDelay;
            this.field_70170_p.func_72838_d((Entity)((ItemBullet)this.ammo.func_77973_b()).getEntity(this.field_70170_p, Vec3.func_72443_a(this.blockX + 0.5, (double)(this.blockY + this.type.pivotHeight), this.blockZ + 0.5), this.direction * 90.0f + this.field_70177_z, this.field_70125_A, (EntityLivingBase)this.gunner, this.type.bulletSpread, this.type.damage, this.ammo.func_77960_j(), this.type));
            if (this.soundDelay <= 0) {
                this.soundDelay = this.type.shootSoundLength;
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.type.shootSound, this.type.distortSound);
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
    
    public boolean func_70097_a(final DamageSource damagesource, final float i) {
        if (damagesource.field_76373_n.equals("player")) {
            final Entity player = damagesource.func_76346_g();
            if (player == this.gunner) {
                if (this.type.mode == EnumFireMode.FULLAUTO) {
                    return true;
                }
                if (this.ammo == null || this.reloadTimer > 0 || this.shootDelay > 0) {
                    return true;
                }
                final BulletType bullet = BulletType.getBullet(this.ammo.func_77973_b());
                if (this.gunner != null && !this.gunner.field_71075_bZ.field_75098_d) {
                    this.ammo.func_77972_a(1, (EntityLivingBase)player);
                }
                this.shootDelay = (int)this.type.shootDelay;
                if (!this.field_70170_p.field_72995_K) {
                    this.field_70170_p.func_72838_d(((ItemBullet)this.ammo.func_77973_b()).getEntity(this.field_70170_p, (EntityLivingBase)player, this.type.bulletSpread, this.type.damage, this.type.bulletSpeed, false, this.ammo.func_77960_j(), this.type, new Vector3f(0.0f, 0.0f, 0.0f)));
                }
                if (this.soundDelay <= 0) {
                    final float distortion = this.type.distortSound ? (1.0f / (this.field_70146_Z.nextFloat() * 0.4f + 0.8f)) : 1.0f;
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.type.shootSound, this.type.distortSound);
                    this.soundDelay = this.type.shootSoundLength;
                }
            }
            else {
                if (this.gunner != null) {
                    return this.gunner.func_70097_a(damagesource, i);
                }
                if (TeamsManager.canBreakGuns) {
                    this.func_70106_y();
                }
            }
        }
        return true;
    }
    
    public boolean func_130002_c(final EntityPlayer player) {
        if (this.gunner != null && this.gunner instanceof EntityPlayer && this.gunner != player) {
            return true;
        }
        if (!this.field_70170_p.field_72995_K) {
            if (this.gunner == player) {
                this.mountGun(player, false);
                FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, false), this.field_70165_t, this.field_70163_u, this.field_70161_v, FlansMod.driveableUpdateRange, this.field_71093_bK);
                return true;
            }
            if (PlayerHandler.getPlayerData(player).mountingGun != null && !PlayerHandler.getPlayerData(player).mountingGun.field_70128_L) {
                PlayerHandler.getPlayerData(player).mountingGun.mountGun(player, false);
                return true;
            }
            if (TeamsManager.instance.currentRound != null && PlayerHandler.getPlayerData(player).team == Team.spectators) {
                return true;
            }
            this.mountGun(player, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketMGMount(player, this, true), this.field_70165_t, this.field_70163_u, this.field_70161_v, FlansMod.driveableUpdateRange, this.field_71093_bK);
            if (this.ammo == null) {
                final int slot = this.findAmmo(player);
                if (slot >= 0) {
                    this.ammo = player.field_71071_by.func_70301_a(slot);
                    player.field_71071_by.func_70299_a(slot, (ItemStack)null);
                    this.reloadTimer = this.type.reloadTime;
                    this.field_70170_p.func_72956_a((Entity)this, this.type.reloadSound, 1.0f, 1.0f / (this.field_70146_Z.nextFloat() * 0.4f + 0.8f));
                }
            }
        }
        return true;
    }
    
    public void mountGun(final EntityPlayer player, final boolean mounting) {
        if (player == null) {
            return;
        }
        final Side side = this.field_70170_p.field_72995_K ? Side.CLIENT : Side.SERVER;
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
        for (int i = 0; i < player.field_71071_by.func_70302_i_(); ++i) {
            final ItemStack stack = player.field_71071_by.func_70301_a(i);
            if (this.type.isAmmo(stack)) {
                return i;
            }
        }
        return -1;
    }
    
    public void func_70106_y() {
        try {
            if (!this.field_70170_p.field_72995_K) {
                if (TeamsManager.weaponDrops == 2) {
                    final EntityGunItem gunEntity = new EntityGunItem(this.field_70170_p, this.field_70165_t, this.field_70163_u, this.field_70161_v, new ItemStack(this.type.getItem()), Arrays.asList(this.ammo));
                    this.field_70170_p.func_72838_d((Entity)gunEntity);
                }
                else if (TeamsManager.weaponDrops == 1) {
                    this.func_145779_a(this.type.getItem(), 1);
                    if (this.ammo != null) {
                        this.func_70099_a(this.ammo, 0.5f);
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
        super.func_70106_y();
    }
    
    protected void func_70014_b(final NBTTagCompound nbttagcompound) {
        if (this.type == null) {
            FlansMod.log("EntityMG.writeEntityToNBT() Error: GunType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        nbttagcompound.func_74778_a("Type", this.type.shortName);
        if (this.ammo != null) {
            nbttagcompound.func_74782_a("Ammo", (NBTBase)NBTParser.toNBT(this.ammo));
        }
        nbttagcompound.func_74768_a("BlockX", this.blockX);
        nbttagcompound.func_74768_a("BlockY", this.blockY);
        nbttagcompound.func_74768_a("BlockZ", this.blockZ);
        nbttagcompound.func_74774_a("Dir", (byte)this.direction);
    }
    
    protected void func_70037_a(final NBTTagCompound nbttagcompound) {
        this.type = GunType.getGun(nbttagcompound.func_74779_i("Type"));
        if (this.type == null) {
            FlansMod.log("EntityMG.readEntityFromNBT() Error: GunType is null (" + this + ")");
            this.func_70106_y();
            return;
        }
        this.blockX = nbttagcompound.func_74762_e("BlockX");
        this.blockY = nbttagcompound.func_74762_e("BlockY");
        this.blockZ = nbttagcompound.func_74762_e("BlockZ");
        this.direction = nbttagcompound.func_74771_c("Dir");
        try {
            this.ammo = NBTParser.parseItemStack(nbttagcompound.func_74775_l("Ammo"));
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void func_70088_a() {
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
            super.func_70106_y();
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
