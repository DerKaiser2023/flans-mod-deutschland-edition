// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import net.minecraft.client.model.ModelBase;
import java.util.Iterator;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.types.TypeFile;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.model.ModelMechaTool;
import java.util.ArrayList;
import com.flansmod.common.types.InfoType;

public class MechaItemType extends InfoType
{
    public static ArrayList<MechaItemType> types;
    public EnumMechaItemType type;
    public EnumMechaToolType function;
    public float speed;
    public float toolHardness;
    public float reach;
    public boolean floater;
    public float speedMultiplier;
    public float damageResistance;
    public String soundEffect;
    public String detectSound;
    public float soundTime;
    public int energyShield;
    public int lightLevel;
    public boolean stopMechaFallDamage;
    public boolean forceBlockFallDamage;
    public boolean vacuumItems;
    public boolean refineIron;
    public boolean autoCoal;
    public boolean autoRepair;
    public boolean rocketPack;
    public boolean diamondDetect;
    public boolean infiniteAmmo;
    public boolean forceDark;
    public boolean wasteCompact;
    public boolean flameBurst;
    public float fortuneDiamond;
    public float fortuneRedstone;
    public float fortuneCoal;
    public float fortuneEmerald;
    public float fortuneIron;
    public float rocketPower;
    @SideOnly(Side.CLIENT)
    public ModelMechaTool model;
    
    public MechaItemType(final TypeFile file) {
        super(file);
        this.function = EnumMechaToolType.sword;
        this.speed = 1.0f;
        this.toolHardness = 1.0f;
        this.reach = 1.0f;
        this.floater = false;
        this.speedMultiplier = 1.0f;
        this.damageResistance = 0.0f;
        this.soundEffect = "";
        this.detectSound = "";
        this.soundTime = 0.0f;
        this.energyShield = 0;
        this.lightLevel = 0;
        this.stopMechaFallDamage = false;
        this.forceBlockFallDamage = false;
        this.vacuumItems = false;
        this.refineIron = false;
        this.autoCoal = false;
        this.autoRepair = false;
        this.rocketPack = false;
        this.diamondDetect = false;
        this.infiniteAmmo = false;
        this.forceDark = false;
        this.wasteCompact = false;
        this.flameBurst = false;
        this.fortuneDiamond = 1.0f;
        this.fortuneRedstone = 1.0f;
        this.fortuneCoal = 1.0f;
        this.fortuneEmerald = 1.0f;
        this.fortuneIron = 1.0f;
        this.rocketPower = 1.0f;
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
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelMechaTool.class);
            }
            if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            if (split[0].equals("Type")) {
                this.type = EnumMechaItemType.getToolType(split[1]);
            }
            if (split[0].equals("ToolType")) {
                this.function = EnumMechaToolType.getToolType(split[1]);
            }
            if (split[0].equals("Speed")) {
                this.speed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("ToolHardness")) {
                this.toolHardness = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Reach")) {
                this.reach = Float.parseFloat(split[1]);
            }
            if (split[0].equals("AutoFuel")) {
                this.autoCoal = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("Armour")) {
                this.damageResistance = Float.parseFloat(split[1]);
            }
            if (split[0].equals("CoalMultiplier")) {
                this.fortuneCoal = Float.parseFloat(split[1]);
            }
            if (split[0].equals("DetectSound")) {
                this.detectSound = split[1];
            }
            if (split[0].equals("DiamondDetect")) {
                this.diamondDetect = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("DiamondMultiplier")) {
                this.fortuneDiamond = Float.parseFloat(split[1]);
            }
            if (split[0].equals("EmeraldMultiplier")) {
                this.fortuneEmerald = Float.parseFloat(split[1]);
            }
            if (split[0].equals("FlameBurst")) {
                this.flameBurst = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("Floatation")) {
                this.floater = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("ForceBlockFallDamage")) {
                this.forceBlockFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("ForceDark")) {
                this.forceDark = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("InfiniteAmmo")) {
                this.infiniteAmmo = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("IronMultiplier")) {
                this.fortuneIron = Float.parseFloat(split[1]);
            }
            if (split[0].equals("IronRefine")) {
                this.refineIron = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("ItemVacuum")) {
                this.vacuumItems = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("LightLevel")) {
                this.lightLevel = Integer.parseInt(split[1]);
            }
            if (split[0].equals("Nanorepair")) {
                this.autoRepair = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("RedstoneMultiplier")) {
                this.fortuneRedstone = Float.parseFloat(split[1]);
            }
            if (split[0].equals("RocketPack")) {
                this.rocketPack = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("RocketPower")) {
                this.rocketPower = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SoundEffect")) {
                this.soundEffect = split[1];
            }
            if (split[0].equals("SoundTime")) {
                this.soundTime = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SpeedMultiplier")) {
                this.speedMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("StopMechaFallDamage")) {
                this.stopMechaFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("WasteCompact")) {
                this.wasteCompact = Boolean.parseBoolean(split[1].toLowerCase());
            }
        }
        catch (final Exception ex) {}
    }
    
    public static MechaItemType getTool(final String find) {
        for (final MechaItemType type : MechaItemType.types) {
            if (type.shortName.equals(find)) {
                return type;
            }
        }
        return null;
    }
    
    @Override
    public void reloadModel() {
        if (this.modelString != null) {
            this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelMechaTool.class);
        }
    }
    
    @Override
    public float GetRecommendedScale() {
        return 0.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return null;
    }
    
    static {
        MechaItemType.types = new ArrayList<MechaItemType>();
    }
}
