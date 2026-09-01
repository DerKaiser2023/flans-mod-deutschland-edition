// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import java.util.Iterator;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.client.model.ModelMecha;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.guns.GunType;
import java.util.List;
import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.DriveableType;

public class MechaType extends DriveableType
{
    public float turnLeftModifier;
    public float turnRightModifier;
    public float moveSpeed;
    public boolean squashMobs;
    public int stepHeight;
    public float jumpHeight;
    public float jumpVelocity;
    public float rotateSpeed;
    public Vector3f leftArmOrigin;
    public Vector3f rightArmOrigin;
    public float armLength;
    public float legLength;
    public float heldItemScale;
    public float height;
    public float width;
    public float chassisHeight;
    public String panicSound;
    public String runAmokSound;
    public float morale;
    public int panicTime;
    public float reach;
    public boolean damageBlocksFromFalling;
    public float blockDamageFromFalling;
    public boolean takeFallDamage;
    public float fallDamageMultiplier;
    public float legSwingLimit;
    public boolean limitHeadTurn;
    public float limitHeadTurnValue;
    public float legSwingTime;
    public float upperArmLimit;
    public float lowerArmLimit;
    public float leftHandModifierX;
    public float leftHandModifierY;
    public float leftHandModifierZ;
    public float rightHandModifierX;
    public float rightHandModifierY;
    public float rightHandModifierZ;
    public ArrayList<LegNode> legNodes;
    public float legAnimSpeed;
    public String stompSound;
    public int stompSoundLength;
    public float stompRangeLower;
    public float stompRangeUpper;
    public static ArrayList<MechaType> types;
    public boolean acceptAllGuns;
    public List<GunType> allowedGuns;
    public boolean unpunchable;
    public boolean restrictInventoryInput;
    
    public boolean isValidGun(final GunType gunType) {
        return this.acceptAllGuns || this.allowedGuns.contains(gunType);
    }
    
    public MechaType(final TypeFile file) {
        super(file);
        this.turnLeftModifier = 1.0f;
        this.turnRightModifier = 1.0f;
        this.moveSpeed = 1.0f;
        this.squashMobs = false;
        this.stepHeight = 0;
        this.jumpHeight = 1.0f;
        this.jumpVelocity = 1.0f;
        this.rotateSpeed = 10.0f;
        this.armLength = 1.0f;
        this.legLength = 1.0f;
        this.heldItemScale = 1.0f;
        this.height = 3.0f;
        this.width = 2.0f;
        this.chassisHeight = 1.0f;
        this.panicSound = "";
        this.runAmokSound = "";
        this.morale = 1.0f;
        this.panicTime = 40;
        this.reach = 10.0f;
        this.damageBlocksFromFalling = true;
        this.blockDamageFromFalling = 1.0f;
        this.takeFallDamage = true;
        this.fallDamageMultiplier = 1.0f;
        this.legSwingLimit = 2.0f;
        this.limitHeadTurn = false;
        this.limitHeadTurnValue = 90.0f;
        this.legSwingTime = 5.0f;
        this.upperArmLimit = 90.0f;
        this.lowerArmLimit = 90.0f;
        this.leftHandModifierX = 0.0f;
        this.leftHandModifierY = 0.0f;
        this.leftHandModifierZ = 0.0f;
        this.rightHandModifierX = 0.0f;
        this.rightHandModifierY = 0.0f;
        this.rightHandModifierZ = 0.0f;
        this.legNodes = new ArrayList<LegNode>();
        this.legAnimSpeed = 0.0f;
        this.stompSound = "";
        this.stompSoundLength = 0;
        this.stompRangeLower = 0.0f;
        this.stompRangeUpper = 0.0f;
        this.acceptAllGuns = true;
        this.allowedGuns = new ArrayList<GunType>();
        this.unpunchable = false;
        MechaType.types.add(this);
    }
    
    @Override
    protected void read(final String[] split, final TypeFile file) {
        super.read(split, file);
        try {
            if (split[0].equals("TurnLeftSpeed")) {
                this.turnLeftModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TurnRightSpeed")) {
                this.turnRightModifier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("MoveSpeed")) {
                this.moveSpeed = Float.parseFloat(split[1]);
            }
            if (split[0].equals("SquashMobs")) {
                this.squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("StepHeight")) {
                this.stepHeight = Integer.parseInt(split[1]);
            }
            if (split[0].equals("JumpHeight")) {
                this.jumpHeight = Float.parseFloat(split[1]);
                this.jumpVelocity = (float)Math.sqrt(Math.abs(9.81f * (this.jumpHeight + 0.2f) / 200.0f));
            }
            if (split[0].equals("RotateSpeed")) {
                this.rotateSpeed = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("StompSound")) {
                this.stompSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("StompSoundLength")) {
                this.stompSoundLength = Integer.parseInt(split[1]);
            }
            else if (split[0].equals("StompRangeLower")) {
                this.stompRangeLower = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("StompRangeUpper")) {
                this.stompRangeUpper = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("RestrictInventoryInput")) {
                this.restrictInventoryInput = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("AddGun")) {
                this.allowedGuns.add(GunType.getGunForMech(split[1]));
            }
            else if (split[0].equals("AllowAllGuns") || split[0].equals("AcceptAllGuns")) {
                this.acceptAllGuns = Boolean.parseBoolean(split[1]);
            }
            else if (split[0].equals("panicSound")) {
                this.panicSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("runAmokSound")) {
                this.runAmokSound = split[1];
                FlansMod.proxy.loadSound(this.contentPack, "driveables", split[1]);
            }
            else if (split[0].equals("morale")) {
                this.morale = Float.parseFloat(split[1]);
            }
            else if (split[0].equals("panicTime")) {
                this.panicTime = Integer.parseInt(split[1]);
            }
            if (split[0].equals("unpunchable")) {
                this.unpunchable = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("LeftArmOrigin")) {
                this.leftArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
            }
            if (split[0].equals("RightArmOrigin")) {
                this.rightArmOrigin = new Vector3f(Float.parseFloat(split[1]) / 16.0f, Float.parseFloat(split[2]) / 16.0f, Float.parseFloat(split[3]) / 16.0f);
            }
            if (split[0].equals("ArmLength")) {
                this.armLength = Float.parseFloat(split[1]) / 16.0f;
            }
            if (split[0].equals("LegLength")) {
                this.legLength = Float.parseFloat(split[1]) / 16.0f;
            }
            if (split[0].equals("HeldItemScale")) {
                this.heldItemScale = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Height")) {
                this.height = Float.parseFloat(split[1]) / 16.0f;
            }
            if (split[0].equals("Width")) {
                this.width = Float.parseFloat(split[1]) / 16.0f;
            }
            if (split[0].equals("ChassisHeight")) {
                this.chassisHeight = Integer.parseInt(split[1]) / 16.0f;
            }
            if (split[0].equals("FallDamageMultiplier")) {
                this.fallDamageMultiplier = Float.parseFloat(split[1]);
            }
            if (split[0].equals("BlockDamageFromFalling")) {
                this.blockDamageFromFalling = Float.parseFloat(split[1]);
            }
            if (split[0].equals("Reach")) {
                this.reach = Float.parseFloat(split[1]);
            }
            if (split[0].equals("TakeFallDamage")) {
                this.takeFallDamage = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("DamageBlocksFromFalling")) {
                this.damageBlocksFromFalling = Boolean.parseBoolean(split[1].toLowerCase());
            }
            if (split[0].equals("LegSwingLimit")) {
                this.legSwingLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LimitHeadTurn")) {
                this.limitHeadTurn = Boolean.parseBoolean(split[1].toLowerCase());
                this.limitHeadTurnValue = Float.parseFloat(split[2]);
            }
            if (split[0].equals("LegSwingTime")) {
                this.legSwingTime = Float.parseFloat(split[1]);
            }
            if (split[0].equals("UpperArmLimit")) {
                this.upperArmLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LowerArmLimit")) {
                this.lowerArmLimit = Float.parseFloat(split[1]);
            }
            if (split[0].equals("LeftHandModifier")) {
                this.leftHandModifierX = Float.parseFloat(split[1]) / 16.0f;
                this.leftHandModifierY = Float.parseFloat(split[2]) / 16.0f;
                this.leftHandModifierZ = Float.parseFloat(split[3]) / 16.0f;
            }
            if (split[0].equals("RightHandModifier")) {
                this.rightHandModifierX = Float.parseFloat(split[1]) / 16.0f;
                this.rightHandModifierY = Float.parseFloat(split[2]) / 16.0f;
                this.rightHandModifierZ = Float.parseFloat(split[3]) / 16.0f;
            }
            else if (split[0].equals("LegNode")) {
                final LegNode node = new LegNode();
                node.rotation = Integer.parseInt(split[1]);
                node.lowerBound = Float.parseFloat(split[2]);
                node.upperBound = Float.parseFloat(split[3]);
                node.speed = Integer.parseInt(split[4]);
                node.legPart = Integer.parseInt(split[5]);
                this.legNodes.add(node);
            }
            else if (split[0].equals("LegAnimSpeed")) {
                this.legAnimSpeed = Float.parseFloat(split[1]);
            }
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public void reloadModel() {
        this.model = FlansMod.proxy.loadModel(this.modelString, this.shortName, ModelMecha.class);
    }
    
    private static DriveablePosition getShootPoint(final String[] split) {
        if (split.length == 5) {
            return new DriveablePosition(split);
        }
        return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
    }
    
    public static MechaType getMecha(final String find) {
        for (final MechaType type : MechaType.types) {
            if (type.shortName.equals(find)) {
                return type;
            }
        }
        return null;
    }
    
    static {
        MechaType.types = new ArrayList<MechaType>();
    }
    
    public class LegNode
    {
        public int rotation;
        public float lowerBound;
        public float upperBound;
        public int speed;
        public int legPart;
    }
}
