// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.client.model.ModelBase;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.model.ModelCustomArmour;
import java.util.ArrayList;
import com.flansmod.common.types.InfoType;

public class ArmourType extends InfoType
{
    public static ArrayList<ArmourType> armours;
    public int type;
    public double defence;
    public String armourTextureName;
    public float moveSpeedModifier;
    public float knockbackModifier;
    public float jumpModifier;
    public boolean nightVision;
    public boolean invisible;
    public String overlay;
    public boolean smokeProtection;
    public boolean negateFallDamage;
    public boolean fireResistance;
    public boolean waterBreathing;
    public boolean onWaterWalking;
    public boolean energyShield;
    public boolean regenerate;
    public boolean hunger;
    public boolean submarine;
    public boolean playermodel;
    public int maxDamage;
    public int rechargeTimer;
    public int warningSoundTimer;
    public int rechargeDelay;
    public float armArmor;
    public float legArmor;
    public float headArmor;
    public float napeArmor;
    public float faceArmor;
    public float bodyArmor;
    public float backArmor;
    public float ReserveLegArmor;
    public float ReserveBodyArmor;
    public float ReserveArmArmor;
    public float ReserveHeadArmor;
    public float ReserveNapeArmor;
    public float ReserveFaceArmor;
    public float ReserveBackArmor;
    public double backupDefence;
    public int durability;
    @SideOnly(Side.CLIENT)
    public ModelCustomArmour model;
    public String warningSound;
    public String rechargeSound;
    public String ShieldHit;
    public String ShieldKill;
    public float pouchMultiplier;
    public boolean hasPouch;
    public boolean hasOldGunPouch;
    public boolean hasGunPouch;
    public boolean hasHeavyPouch;
    public boolean hasBowPouch;
    public boolean hasFrontMount;
    public float frontMountY1;
    public float frontMountZ1;
    public float frontMountY2;
    public float frontMountZ2;
    public float frontMountRotation;
    public boolean hasTopMount;
    public float topMountY;
    public float topMountZ;
    public float topMountRotation;
    
    public ArmourType(final TypeFile file) {
        super(file);
        this.moveSpeedModifier = 1.0f;
        this.knockbackModifier = 0.2f;
        this.jumpModifier = 1.0f;
        this.nightVision = false;
        this.invisible = false;
        this.overlay = null;
        this.smokeProtection = false;
        this.negateFallDamage = false;
        this.fireResistance = false;
        this.waterBreathing = false;
        this.onWaterWalking = false;
        this.energyShield = false;
        this.regenerate = false;
        this.hunger = false;
        this.submarine = false;
        this.playermodel = false;
        this.maxDamage = 9000;
        this.rechargeTimer = 85;
        this.warningSoundTimer = 10;
        this.rechargeDelay = 5;
        this.armArmor = 1.0f;
        this.legArmor = 1.0f;
        this.headArmor = 1.0f;
        this.napeArmor = 1.0f;
        this.faceArmor = 1.0f;
        this.bodyArmor = 1.0f;
        this.backArmor = 1.0f;
        this.ReserveLegArmor = 1.0f;
        this.ReserveBodyArmor = 1.0f;
        this.ReserveArmArmor = 1.0f;
        this.ReserveHeadArmor = 1.0f;
        this.ReserveNapeArmor = 1.0f;
        this.ReserveFaceArmor = 1.0f;
        this.ReserveBackArmor = 1.0f;
        this.backupDefence = 0.0;
        this.durability = 101;
        this.pouchMultiplier = 1.0f;
        this.hasPouch = false;
        this.hasOldGunPouch = false;
        this.hasGunPouch = false;
        this.hasHeavyPouch = false;
        this.hasBowPouch = false;
        ArmourType.armours.add(this);
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
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelCustomArmour.class);
                this.model.type = this;
            }
            if (split[0].equals("Type")) {
                if (split[1].equals("Hat") || split[1].equals("Helmet")) {
                    this.type = 0;
                }
                if (split[1].equals("Chest") || split[1].equals("Body")) {
                    this.type = 1;
                }
                if (split[1].equals("Legs") || split[1].equals("Pants")) {
                    this.type = 2;
                }
                if (split[1].equals("Shoes") || split[1].equals("Boots")) {
                    this.type = 3;
                }
            }
            if (split[0].equals("hasTopMount")) {
                this.hasTopMount = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("topMountY")) {
                this.topMountY = Float.parseFloat(split[1]);
            }
            if (split[0].equals("topMountZ")) {
                this.topMountZ = Float.parseFloat(split[1]);
            }
            if (split[0].equals("topMountRotation")) {
                this.topMountRotation = Float.parseFloat(split[1]);
            }
            if (split[0].equals("hasFrontMount")) {
                this.hasFrontMount = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("frontMountY1")) {
                this.frontMountY1 = Float.parseFloat(split[1]);
            }
            if (split[0].equals("frontMountZ1")) {
                this.frontMountZ1 = Float.parseFloat(split[1]);
            }
            if (split[0].equals("frontMountY2")) {
                this.frontMountY2 = Float.parseFloat(split[1]);
            }
            if (split[0].equals("frontMountZ2")) {
                this.frontMountZ2 = Float.parseFloat(split[1]);
            }
            if (split[0].equals("frontMountRotation")) {
                this.frontMountRotation = Float.parseFloat(split[1]);
            }
            if (split[0].equals("DamageReduction") || split[0].equals("Defence")) {
                this.defence = Double.parseDouble(split[1]);
            }
            if (split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness")) {
                this.moveSpeedModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("JumpModifier")) {
                this.jumpModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier")) {
                this.knockbackModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("armArmor") || split[0].equals("gauntletArmor")) {
                this.armArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("legArmor") || split[0].equals("leggingArmor")) {
                this.legArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("headArmor") || split[0].equals("helmetArmor")) {
                this.headArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("neckArmor") || split[0].equals("napeArmor")) {
                this.napeArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("faceArmor") || split[0].equals("maskArmor")) {
                this.faceArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("bodyArmor") || split[0].equals("chestArmor")) {
                this.bodyArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("backArmor") || split[0].equals("rearArmor")) {
                this.backArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveArmArmor")) {
                this.ReserveArmArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveBackArmor")) {
                this.ReserveBackArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveLegArmor")) {
                this.ReserveLegArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveHeadArmor")) {
                this.ReserveHeadArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveNapeArmor")) {
                this.ReserveNapeArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveFaceArmor")) {
                this.ReserveFaceArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ReserveBodyArmor")) {
                this.ReserveBodyArmor = Float.parseFloat(split[1]);
            }
            if (split[0].equals("BackupDefence")) {
                this.backupDefence = Float.parseFloat(split[1]);
            }
            if (split[0].equals("pouchMultiplier") || split[0].equals("reloadMultiplier")) {
                this.pouchMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("hasPouch") || split[0].equals("hasMagPouch")) {
                this.hasPouch = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasOldGunPouch")) {
                this.hasOldGunPouch = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasBowPouch")) {
                this.hasBowPouch = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasHeavyPouch")) {
                this.hasHeavyPouch = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hasGunPouch")) {
                this.hasGunPouch = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("energyShield") || split[0].equals("forceField")) {
                this.energyShield = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("rechargeTimer")) {
                this.rechargeTimer = Integer.parseInt(split[1]);
            }
            if (split[0].equals("RechargeSound")) {
                this.rechargeSound = split[1];
            }
            if (split[0].equals("WarningSound")) {
                this.warningSound = split[1];
            }
            if (split[0].equals("rechargeDelay")) {
                this.rechargeDelay = Integer.parseInt(split[1]);
            }
            if (split[0].equals("WarningSoundTimer")) {
                this.warningSoundTimer = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ShieldHitSound")) {
                this.ShieldHit = split[1];
            }
            if (split[0].equals("ShieldKillSound")) {
                this.ShieldKill = split[1];
            }
            if (split[0].equals("NightVision")) {
                this.nightVision = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Invisible")) {
                this.invisible = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("NegateFallDamage")) {
                this.negateFallDamage = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("FireResistance")) {
                this.fireResistance = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("WaterBreathing")) {
                this.waterBreathing = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Overlay")) {
                this.overlay = split[1];
            }
            if (split[0].equals("SmokeProtection")) {
                this.smokeProtection = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("OnWaterWalking")) {
                this.onWaterWalking = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("submarine")) {
                this.submarine = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("playermodel")) {
                this.playermodel = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("regenerate")) {
                this.regenerate = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("hunger")) {
                this.hunger = Boolean.parseBoolean(split[1]);
            }
            if (split[0].equals("Durability")) {
                this.durability = Integer.parseInt(split[1]);
            }
            if (split[0].equals("damageLimit")) {
                this.maxDamage = Integer.parseInt(split[1]);
            }
            if (split[0].equals("ArmourTexture") || split[0].equals("ArmorTexture")) {
                this.armourTextureName = split[1];
            }
        }
        catch (final Exception e) {
            System.out.println("Reading armour file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    public static ArmourType getArmourType(final String string) {
        for (final ArmourType armour : ArmourType.armours) {
            if (armour.shortName.equals(string)) {
                return armour;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelCustomArmour.class);
        if (this.model != null) {
            this.model.type = this;
        }
    }
    
    @Override
    public float GetRecommendedScale() {
        return 50.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return (ModelBase)this.model;
    }
    
    static {
        ArmourType.armours = new ArrayList<ArmourType>();
    }
}
