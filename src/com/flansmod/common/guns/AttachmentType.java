// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.client.model.ModelBase;
import java.util.Iterator;
import net.minecraft.item.ItemStack;
import com.EconomyPlus.lib.util.NBTParser;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.client.model.ModelAttachment;
import java.util.List;
import java.util.ArrayList;
import com.flansmod.common.paintjob.PaintableType;

public class AttachmentType extends PaintableType implements IScope
{
    public static ArrayList<AttachmentType> attachments;
    public EnumAttachmentType type;
    public boolean silencer;
    public boolean flashlight;
    public float flashlightRange;
    public int flashlightStrength;
    public boolean disableMuzzleFlash;
    public boolean barisLaser;
    public boolean barisInfrared;
    public float spreadMultiplier;
    public float recoilMultiplier;
    public float damageMultiplier;
    public float meleeDamageMultiplier;
    public float bulletSpeedMultiplier;
    public float reloadTimeMultiplier;
    public float moveSpeedMultiplier;
    public EnumFireMode modeOverride;
    public boolean secondaryFire;
    public List<String> secondaryAmmo;
    public float secondaryDamage;
    public float secondarySpread;
    public float secondarySpeed;
    public int secondaryReloadTime;
    public float secondaryShootDelay;
    public String secondaryShootSound;
    public String secondaryReloadSound;
    public EnumFireMode secondaryFireMode;
    public String toggleSound;
    public int secondaryNumBullets;
    public int numSecAmmoItems;
    public float zoomLevel;
    public float FOVZoomLevel;
    public String zoomOverlay;
    public boolean hasScopeOverlay;
    public boolean hasNightVision;
    @SideOnly(Side.CLIENT)
    public ModelAttachment model;
    public float modelScale;
    public int maxStackSize;
    public float secondaryDefaultSpread;
    public boolean bayonet;
    public ArrayList<Vector3f> meleePath;
    public ArrayList<Vector3f> meleePathAngles;
    
    public AttachmentType(final TypeFile file) {
        super(file);
        this.type = EnumAttachmentType.generic;
        this.silencer = false;
        this.flashlight = false;
        this.flashlightRange = 10.0f;
        this.flashlightStrength = 12;
        this.disableMuzzleFlash = false;
        this.barisLaser = false;
        this.barisInfrared = false;
        this.spreadMultiplier = 1.0f;
        this.recoilMultiplier = 1.0f;
        this.damageMultiplier = 1.0f;
        this.meleeDamageMultiplier = 1.0f;
        this.bulletSpeedMultiplier = 1.0f;
        this.reloadTimeMultiplier = 1.0f;
        this.moveSpeedMultiplier = 1.0f;
        this.modeOverride = null;
        this.secondaryFire = false;
        this.secondaryAmmo = new ArrayList<String>();
        this.secondaryDamage = 1.0f;
        this.secondarySpread = 1.0f;
        this.secondarySpeed = 5.0f;
        this.secondaryReloadTime = 1;
        this.secondaryShootDelay = 1.0f;
        this.secondaryFireMode = EnumFireMode.SEMIAUTO;
        this.secondaryNumBullets = 1;
        this.numSecAmmoItems = 1;
        this.zoomLevel = 1.0f;
        this.FOVZoomLevel = 1.0f;
        this.hasScopeOverlay = false;
        this.hasNightVision = false;
        this.modelScale = 1.0f;
        this.maxStackSize = 1;
        this.secondaryDefaultSpread = 0.0f;
        this.bayonet = false;
        this.meleePath = new ArrayList<Vector3f>();
        this.meleePathAngles = new ArrayList<Vector3f>();
        AttachmentType.attachments.add(this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("AttachmentType")) {
                this.type = EnumAttachmentType.get(split[1]);
            }
            else if (FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model")) {
                this.model = FlansMod.proxy.loadModel(split[1], this.shortName, ModelAttachment.class);
            }
            else if (split[0].equals("ModelScale")) {
                this.modelScale = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("Texture")) {
                this.texture = split[1];
            }
            else if (split[0].equals("Silencer")) {
                this.silencer = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("DisableMuzzleFlash") || split[0].equals("DisableFlash")) {
                this.disableMuzzleFlash = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("barisLaser")) {
                this.barisLaser = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("barisInfrared")) {
                this.barisInfrared = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("bayonet")) {
                this.bayonet = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("AddNode")) {
                this.meleePath.add(new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f));
                this.meleePathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
            }
            else if (split[0].equals("Flashlight")) {
                this.flashlight = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("FlashlightRange")) {
                this.flashlightRange = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FlashlightStrength")) {
                this.flashlightStrength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("ModeOverride")) {
                this.modeOverride = EnumFireMode.getFireMode(split[1]);
            }
            else if (split[0].equals("SecondaryMode")) {
                this.secondaryFire = Boolean.parseBoolean(split[1].toLowerCase());
            }
            else if (split[0].equals("SecondaryAmmo")) {
                this.secondaryAmmo.add(split[1]);
            }
            else if (split[0].equals("SecondaryDamage")) {
                this.secondaryDamage = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("SecondarySpread") || split[0].equals("SecondaryAccuracy")) {
                final float float1 = Float.parseFloat(split[1]);
                this.secondaryDefaultSpread = float1;
                this.secondarySpread = float1;
            }
            else if (split[0].equals("SecondaryBulletSpeed")) {
                this.secondarySpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("SecondaryShootDelay")) {
                this.secondaryShootDelay = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SecondaryReloadTime")) {
                this.secondaryReloadTime = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SecondaryShootDelay")) {
                this.secondaryShootDelay = (float)Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SecondaryNumBullets")) {
                this.secondaryNumBullets = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("LoadSecondaryIntoGun")) {
                this.numSecAmmoItems = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("SecondaryFireMode")) {
                this.secondaryFireMode = EnumFireMode.getFireMode(split[1]);
            }
            else if (split[0].equals("SecondaryShootSound")) {
                this.secondaryShootSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("SecondaryReloadSound")) {
                this.secondaryReloadSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("ModeSwitchSound")) {
                this.toggleSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "guns", split[1]);
            }
            else if (split[0].equals("MeleeDamageMultiplier")) {
                this.meleeDamageMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("DamageMultiplier")) {
                this.damageMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("SpreadMultiplier")) {
                this.spreadMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RecoilMultiplier")) {
                this.recoilMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("BulletSpeedMultiplier")) {
                this.bulletSpeedMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ReloadTimeMultiplier")) {
                this.reloadTimeMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("MovementSpeedMultiplier")) {
                this.moveSpeedMultiplier = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ZoomLevel")) {
                this.zoomLevel = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("FOVZoomLevel")) {
                this.FOVZoomLevel = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("ZoomOverlay")) {
                this.hasScopeOverlay = true;
                if (split[1].equals("None")) {
                    this.hasScopeOverlay = false;
                }
                else {
                    this.zoomOverlay = split[1];
                }
            }
            else if (split[0].equals("HasNightVision")) {
                this.hasNightVision = Boolean.parseBoolean(split[1].toLowerCase());
            }
        }
        catch (final Exception e) {
            System.out.println("Reading attachment file failed.");
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelAttachment.class);
    }
    
    public static AttachmentType getFromNBT(final NBTTagCompound tags) {
        try {
            final ItemStack stack = NBTParser.parseItemStack(tags);
            if (stack != null && stack.func_77973_b() instanceof ItemAttachment) {
                return ((ItemAttachment)stack.func_77973_b()).type;
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    @Override
    public float getZoomFactor() {
        return this.zoomLevel;
    }
    
    @Override
    public boolean hasZoomOverlay() {
        return this.hasScopeOverlay;
    }
    
    @Override
    public String getZoomOverlay() {
        return this.zoomOverlay;
    }
    
    @Override
    public float getFOVFactor() {
        return this.FOVZoomLevel;
    }
    
    public static AttachmentType getAttachment(final String s) {
        for (final AttachmentType attachment : AttachmentType.attachments) {
            if (attachment.shortName.equals(s)) {
                return attachment;
            }
        }
        return null;
    }
    
    @Override
    public float GetRecommendedScale() {
        return 100.0f;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public ModelBase GetModel() {
        return this.model;
    }
    
    static {
        AttachmentType.attachments = new ArrayList<AttachmentType>();
    }
}
