// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import java.util.Iterator;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import java.util.ArrayList;
import com.flansmod.common.types.TypeFile;
import com.flansmod.client.model.ModelAAGun;
import java.util.List;
import com.flansmod.common.types.InfoType;

public class AAGunType extends InfoType
{
    public List<BulletType> ammo;
    public int reloadTime;
    public int recoil;
    public int accuracy;
    public int damage;
    public int shootDelay;
    public int numBarrels;
    public boolean fireAlternately;
    public int health;
    public int gunnerX;
    public int gunnerY;
    public int gunnerZ;
    public String shootSound;
    public String reloadSound;
    public ModelAAGun model;
    public float topViewLimit;
    public float bottomViewLimit;
    public int[] barrelX;
    public int[] barrelY;
    public int[] barrelZ;
    public boolean targetMobs;
    public boolean targetPlayers;
    public boolean targetVehicles;
    public boolean targetPlanes;
    public boolean targetMechas;
    public float targetRange;
    public boolean shareAmmo;
    public boolean canShootHomingMissile;
    public int countExplodeAfterShoot;
    public boolean isDropThis;
    public static List<AAGunType> infoTypes;
    
    public AAGunType(final TypeFile file) {
        super(file);
        this.ammo = new ArrayList<BulletType>();
        this.recoil = 5;
        this.topViewLimit = 75.0f;
        this.bottomViewLimit = 0.0f;
        this.targetMobs = false;
        this.targetPlayers = false;
        this.targetVehicles = false;
        this.targetPlanes = false;
        this.targetMechas = false;
        this.targetRange = 10.0f;
        this.shareAmmo = false;
        this.canShootHomingMissile = false;
        this.countExplodeAfterShoot = -1;
        this.isDropThis = true;
        AAGunType.infoTypes.add(this);
    }
    
    @Override
    protected void preRead(final TypeFile file) {
    }
    
    @Override
    protected void postRead(final TypeFile file) {
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelAAGun.class);
            }
            if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            if (split[0].equals("Damage")) {
                this.damage = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ReloadTime")) {
                this.reloadTime = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Recoil")) {
                this.recoil = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Accuracy")) {
                this.accuracy = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ShootDelay")) {
                this.shootDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ShootSound")) {
                this.shootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "aaguns", split[1]);
            }
            if (split[0].equals("ReloadSound")) {
                this.reloadSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "aaguns", split[1]);
            }
            if (split[0].equals("FireAlternately")) {
                this.fireAlternately = split[1].equals("True");
            }
            if (split[0].equals("NumBarrels")) {
                this.numBarrels = Integer.parseInt(split[1]);
                this.barrelX = new int[this.numBarrels];
                this.barrelY = new int[this.numBarrels];
                this.barrelZ = new int[this.numBarrels];
            }
            if (split[0].equals("Barrel")) {
                final int id = Integer.parseInt(split[1]);
                this.barrelX[id] = Integer.parseInt(split[2]);
                this.barrelY[id] = Integer.parseInt(split[3]);
                this.barrelZ[id] = Integer.parseInt(split[4]);
            }
            if (split[0].equals("Health")) {
                this.health = Integer.parseInt(split[1]);
            }
            if (split[0].equals("TopViewLimit")) {
                this.topViewLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("BottomViewLimit")) {
                this.bottomViewLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Ammo")) {
                final BulletType type = BulletType.getBullet(split[1]);
                if (type != null) {
                    this.ammo.add(type);
                }
            }
            if (split[0].equals("GunnerPos")) {
                this.gunnerX = Integer.parseInt(split[1]);
                this.gunnerY = Integer.parseInt(split[2]);
                this.gunnerZ = Integer.parseInt(split[3]);
            }
            if (split[0].equals("TargetMobs")) {
                this.targetMobs = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetPlayers")) {
                this.targetPlayers = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetVehicles")) {
                this.targetVehicles = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetPlanes")) {
                this.targetPlanes = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetMechas")) {
                this.targetMechas = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetDriveables")) {
                final boolean boolean1 = Boolean.parseBoolean(split[1]);
                this.targetVehicles = boolean1;
                this.targetPlanes = boolean1;
                this.targetMechas = boolean1;
            }
            if (split[0].equals("ShareAmmo")) {
                this.shareAmmo = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("TargetRange")) {
                this.targetRange = Float.parseFloat(split[1]);
            }
            if (split[0].equals("CanShootHomingMissile")) {
                this.canShootHomingMissile = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("CountExplodeAfterShoot")) {
                this.countExplodeAfterShoot = Integer.parseInt(split[1]);
            }
            if (split[0].equals("IsDropThis")) {
                this.isDropThis = Boolean.parseBoolean(split[1]);
            }
        }
        catch (final Exception e) {
            FlansMod.log("" + e);
        }
    }
    
    public boolean isAmmo(final BulletType type) {
        return this.ammo.contains(type);
    }
    
    public boolean isAmmo(final ItemStack stack) {
        return stack != null && stack.func_77973_b() instanceof ItemBullet && this.isAmmo(((ItemBullet)stack.func_77973_b()).type);
    }
    
    public static AAGunType getAAGun(final String s) {
        for (final AAGunType gun : AAGunType.infoTypes) {
            if (gun.shortName.equals(s)) {
                return gun;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelAAGun.class);
    }
    
    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return this.model;
    }
    
    static {
        AAGunType.infoTypes = new ArrayList<AAGunType>();
    }
}
