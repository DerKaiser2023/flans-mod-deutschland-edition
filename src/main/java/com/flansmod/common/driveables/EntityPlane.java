// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.hfr.faction.Factions;
import com.flansmod.common.network.PacketPlaneAnimator;
import com.flansmod.common.network.PacketPlaneControl;
import com.flansmod.common.vector.Matrix4f;
import net.minecraft.util.DamageSource;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.client.model.animation.AnimationPart;
import java.util.Iterator;
import java.util.List;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketDriveableControl;
import com.flansmod.common.RotatedAxes;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketCurrentMissile;
import com.flansmod.common.tools.ItemTool;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import com.hfr.faction.IFaction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import com.flansmod.client.model.animation.AnimationController;
import com.flansmod.common.vector.Vector3f;

public class EntityPlane extends EntityDriveable
{
    public float flapsYaw;
    public float flapsPitchLeft;
    public float flapsPitchRight;
    public int soundPosition;
    public int bombDelay;
    public int gunDelay;
    public int ticksSinceUsed;
    public boolean varGear;
    public boolean varDoor;
    public boolean varWing;
    public boolean varFlap;
    public boolean doorsHaveShut;
    public int toggleTimer;
    public int carrierTimer;
    public EnumPlaneMode mode;
    public boolean combatRadar;
    public int exitTimer;
    public int accidentRange;
    public Vector3f wingPos;
    public Vector3f wingRot;
    public Vector3f wingWheelPos;
    public Vector3f wingWheelRot;
    public Vector3f coreWheelPos;
    public Vector3f coreWheelRot;
    public Vector3f tailWheelPos;
    public Vector3f tailWheelRot;
    public Vector3f doorPos;
    public Vector3f doorRot;
    public Vector3f prevWingPos;
    public Vector3f prevWingRot;
    public Vector3f prevWingWheelPos;
    public Vector3f prevWingWheelRot;
    public Vector3f prevCoreWheelPos;
    public Vector3f prevCoreWheelRot;
    public Vector3f prevTailWheelPos;
    public Vector3f prevTailWheelRot;
    public Vector3f prevDoorPos;
    public Vector3f prevDoorRot;
    public float xSpeed;
    public float ySpeed;
    public float zSpeed;
    public float rollSpeed;
    public FlightController control;
    public AnimationController anim;
    public boolean initiatedAnim;
    public boolean radarVisible;
    public boolean hasPlaneRadar;
    public float radarRange;
    public int radarPositionOffset;
    public int radarRefreshDelay;
    public boolean digitalRadar;
    public boolean isHeli;
    public boolean landPlace;
    public int slbmFlightType;
    public int slbmDelay;
    public int slbmRange;
    public int slbmStrength;
    public int slbmWarheadType;
    private float radarDetectionRangeMultiplier;
    private int poopooTimer;
    private int testerino;
    private int stukaSoundDelay;
    
    public EntityPlane(final World world) {
        super(world);
        this.ticksSinceUsed = 0;
        this.varGear = true;
        this.varDoor = false;
        this.varWing = false;
        this.varFlap = false;
        this.doorsHaveShut = false;
        this.toggleTimer = 0;
        this.carrierTimer = 0;
        this.combatRadar = false;
        this.exitTimer = 5;
        this.accidentRange = 2;
        this.wingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
        this.zSpeed = 0.0f;
        this.rollSpeed = 0.0f;
        this.control = new FlightController();
        this.anim = new AnimationController();
        this.initiatedAnim = false;
        this.digitalRadar = false;
        this.isHeli = false;
        this.landPlace = true;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.testerino = 0;
        this.stukaSoundDelay = 0;
    }
    
    public EntityPlane(final World world, final double x, final double y, final double z, final PlaneType type, final DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.varGear = true;
        this.varDoor = false;
        this.varWing = false;
        this.varFlap = false;
        this.doorsHaveShut = false;
        this.toggleTimer = 0;
        this.carrierTimer = 0;
        this.combatRadar = false;
        this.exitTimer = 5;
        this.accidentRange = 2;
        this.wingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
        this.zSpeed = 0.0f;
        this.rollSpeed = 0.0f;
        this.control = new FlightController();
        this.anim = new AnimationController();
        this.initiatedAnim = false;
        this.digitalRadar = false;
        this.isHeli = false;
        this.landPlace = true;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.testerino = 0;
        this.stukaSoundDelay = 0;
        this.setPosition(x, y, z);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        this.initType(type, false);
    }
    
    public EntityPlane(final World world, final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final PlaneType type, final DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.varGear = true;
        this.varDoor = false;
        this.varWing = false;
        this.varFlap = false;
        this.doorsHaveShut = false;
        this.toggleTimer = 0;
        this.carrierTimer = 0;
        this.combatRadar = false;
        this.exitTimer = 5;
        this.accidentRange = 2;
        this.wingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.wingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.coreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.tailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevWingWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevCoreWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevTailWheelRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
        this.zSpeed = 0.0f;
        this.rollSpeed = 0.0f;
        this.control = new FlightController();
        this.anim = new AnimationController();
        this.initiatedAnim = false;
        this.digitalRadar = false;
        this.isHeli = false;
        this.landPlace = true;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.testerino = 0;
        this.stukaSoundDelay = 0;
        this.rotateYaw(yaw + 90.0f);
        this.rotatePitch(pitch);
        this.rotateRoll(roll);
        this.setPosition(x, y, z);
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
        this.initType(type, false);
    }
    
    public EntityPlane(final World world, final double x, final double y, final double z, final EntityPlayer placer, final PlaneType type, final DriveableData data) {
        this(world, x, y + 5.625, z, type, data);
        this.rotateYaw(placer.rotationYaw + 90.0f);
        this.rotatePitch(type.restingPitch);
    }
    
    public EntityPlane(final World world, final double x, final double y, final double z, final EntityPlayer placer, final PlaneType type, final DriveableData data, final Boolean landPlaced) {
        this(world, x, y + 5.625, z, type, data);
        this.rotateYaw(placer.rotationYaw + 90.0f);
        this.rotatePitch(type.restingPitch);
        this.landPlace = landPlaced;
    }
    
    public EntityPlane setOwner(final IFaction to) {
        this.owner = to;
        return this;
    }
    
    public void initType(final DriveableType type, final boolean clientSide) {
        this.fuelTimer = type.fuelTimer;
        this.labjacFuel = type.labjacFuel;
        this.radarVisible = type.radarVisible;
        this.hasPlaneRadar = type.hasPlaneRadar;
        this.digitalRadar = type.digitalRadar;
        this.radarDetectionRangeMultiplier = type.radarDetectionRangeMultiplier;
        this.radarRange = type.radarRange;
        this.radarPositionOffset = type.radarPositionOffset;
        this.radarRefreshDelay = type.radarRefreshDelay;
        this.slbmFlightType = type.slbmFlightType;
        this.slbmDelay = type.slbmDelay;
        this.slbmRange = type.slbmRange;
        this.slbmStrength = type.slbmStrength;
        this.slbmWarheadType = type.slbmWarheadType;
        super.initType(type, clientSide);
        this.mode = ((((PlaneType)type).mode == EnumPlaneMode.HELI) ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE);
        if (((PlaneType)type).mode == EnumPlaneMode.VTOL) {
            this.mode = EnumPlaneMode.HELI;
            this.isHeli = true;
        }
        else {
            this.isHeli = false;
        }
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound tag) {
        super.writeEntityToNBT(tag);
        tag.setTag("Pos", (NBTBase)this.newDoubleNBTList(new double[] { this.posX, this.posY + 1.0, this.posZ }));
        tag.setBoolean("VarGear", this.varGear);
        tag.setBoolean("VarDoor", this.varDoor);
        tag.setBoolean("VarWing", this.varWing);
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound tag) {
        super.readEntityFromNBT(tag);
        this.varGear = tag.getBoolean("VarGear");
        this.varDoor = tag.getBoolean("VarDoor");
        this.varWing = tag.getBoolean("VarWing");
    }
    
    @Override
    public boolean isInRangeToRenderDist(final double d) {
        final double d2 = 900.0;
        return d < d2 * d2;
    }
    
    public int getBrightnessForRender(final float par1) {
        if (Minecraft.getMinecraft().entityRenderer.isShaderActive()) {
            return 15728880;
        }
        final int i = MathHelper.floor_double(this.posX);
        final int j = MathHelper.floor_double(this.posZ);
        if (this.worldObj.blockExists(i, 0, j)) {
            final double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66;
            final int k = MathHelper.floor_double(this.posY - this.yOffset + d0);
            return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
        }
        return 0;
    }
    
    @Override
    public void onMouseMoved(final int deltaX, final int deltaY) {
        if (!FMLCommonHandler.instance().getSide().isClient()) {
            return;
        }
        if (!FlansMod.proxy.mouseControlEnabled()) {
            return;
        }
        final float sensitivity = 0.01f;
        this.flapsPitchLeft -= sensitivity * deltaY;
        this.flapsPitchRight -= sensitivity * deltaY;
        if (this.mode != EnumPlaneMode.SIXDOF) {
            this.flapsPitchLeft -= sensitivity * deltaX;
            this.flapsPitchRight += sensitivity * deltaX;
        }
        else {
            this.flapsPitchLeft -= sensitivity * deltaX;
            this.flapsPitchRight += sensitivity * deltaX;
        }
    }
    
    @Override
    public void setPositionRotationAndMotion(final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final double motX, final double motY, final double motZ, final float velYaw, final float velPitch, final float velRoll, final float throt, final float steeringYaw, final float throtPP) {
        super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw, throtPP);
        this.flapsYaw = steeringYaw;
    }
    
    public void setRotorPosition(final float current, final float previous) {
        this.rotorAngle = current;
        this.prevRotorAngle = previous;
    }
    
    public void rebirth() {
        final PlaneType typo = this.getPlaneType();
        final ItemStack vehicleStack = new ItemStack(typo.item, 1, this.driveableData.paintjobID);
        for (final EntitySeat seat : this.seats) {
            if (seat != null && seat.riddenByEntity != null && seat.riddenByEntity instanceof EntityPlayerMP) {
                seat.mountEntity((Entity)null);
            }
        }
        vehicleStack.stackTagCompound = new NBTTagCompound();
        this.driveableData.writeToNBT(vehicleStack.stackTagCompound);
        ((ItemPlane)vehicleStack.getItem()).spawnPlaneAngled(this.worldObj, this.posX + 0.0, this.posY + 0.0, this.posZ + 0.0, this.axes.getYaw() - 90.0f, -1.0f * this.axes.getPitch(), this.axes.getRoll(), vehicleStack);
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                seat.setDead();
            }
        }
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                wheel.setDead();
            }
        }
        this.setDead();
    }
    
    public void reset(final EntityPlayer master) {
        if (!this.worldObj.isRemote) {
            this.driveableData.seatBelt = "null";
            final PlaneType typo = this.getPlaneType();
            final ItemStack vehicleStack = new ItemStack(typo.item, 1, this.driveableData.paintjobID);
            vehicleStack.stackTagCompound = new NBTTagCompound();
            this.driveableData.writeToNBT(vehicleStack.stackTagCompound);
            boolean used = false;
            if (master.inventory.addItemStackToInventory(vehicleStack)) {
                used = true;
            }
            if (used && master != null) {
                MinecraftServer.getServer().getCommandManager().executeCommand((ICommandSender)MinecraftServer.getServer(), "tp " + master.getDisplayName() + " " + this.driveableData.originX + " " + this.driveableData.originY + " " + this.driveableData.originZ);
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 150.0f, this.dimension);
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 150.0, this.dimension, "Crash", false);
                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 150.0, this.dimension, "explcls6", false);
                master.addPotionEffect(new PotionEffect(Potion.resistance.id, 200, 9000));
                master.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 9000));
                master.addPotionEffect(new PotionEffect(Potion.blindness.id, 100, 9000));
                for (final EntitySeat seat : this.seats) {
                    if (seat != null) {
                        seat.setDead();
                    }
                }
                for (final EntityWheel wheel : this.wheels) {
                    if (wheel != null) {
                        wheel.setDead();
                    }
                }
                this.setDead();
            }
        }
    }
    
    public void setPropPosition(final float current, final float previous) {
        this.propAngle = current;
        this.prevPropAngle = previous;
    }
    
    public boolean interactFirst(final EntityPlayer entityplayer) {
        if (this.isDead) {
            return false;
        }
        if (this.worldObj.isRemote) {
            return false;
        }
        final ItemStack currentItem = entityplayer.getCurrentEquippedItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables) {
            return true;
        }
        final PlaneType type = this.getPlaneType();
        for (int i = 0; i <= type.numPassengers; ++i) {
            if (this.seats[i].interactFirst(entityplayer)) {
                if (i == 0) {
                    this.bombDelay = type.planeBombDelay;
                    FlansMod.proxy.doTutorialStuff(entityplayer, this);
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean pressKey(final int key, final EntityPlayer player) {
        final PlaneType type = this.getPlaneType();
        if (key == 36 && System.currentTimeMillis() - this.lastshellswitchedat > 500L && this.seats != null && this.seats[0] != null) {
            this.lastshellswitchedat = System.currentTimeMillis();
            FlansMod.getPacketHandler().sendToServer(new PacketCurrentMissile(this.getEntityId(), this.driveableData.getStackInSlot(1)));
        }
        if (this.worldObj.isRemote && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        }
        final boolean canThrust = (this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)this.seats[0].riddenByEntity).capabilities.isCreativeMode) || this.getDriveableData().fuelInTank > 0.0f;
        switch (key) {
            case 0: {
                if (canThrust || this.throttle < 0.0f) {
                    if (type.mode == EnumPlaneMode.HELI || this.mode == EnumPlaneMode.VTOL) {
                        this.throttle += 0.002f;
                        if (this.throttle > 1.0f) {
                            this.throttle = 1.0f;
                        }
                        this.xSpeed += 0.5f;
                    }
                    else {
                        this.throttle += 0.02f;
                        if (this.throttle > 1.0f) {
                            this.throttle = 1.0f;
                        }
                    }
                }
                return true;
            }
            case 1: {
                if (canThrust || this.throttle > 0.0f) {
                    if (type.mode == EnumPlaneMode.HELI || type.mode == EnumPlaneMode.VTOL) {
                        this.throttle -= 0.005f;
                        if (this.throttle < -1.0f) {
                            this.throttle = -1.0f;
                        }
                        if (this.throttle < 0.0f && type.maxNegativeThrottle == 0.0f) {
                            this.throttle = 0.0f;
                        }
                        this.xSpeed -= 0.5f;
                    }
                    else {
                        this.throttle -= 0.04f;
                        if (this.throttle < -1.0f) {
                            this.throttle = -1.0f;
                        }
                        if (this.throttle < 0.0f && type.maxNegativeThrottle == 0.0f) {
                            this.throttle = 0.0f;
                            if (this.driveableData.landBrake < 20 && (this.varGear || !type.needsGear)) {
                                final DriveableData driveableData = this.driveableData;
                                driveableData.landBrake += 2;
                            }
                        }
                    }
                }
                return true;
            }
            case 2: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    --this.flapsYaw;
                }
                --this.zSpeed;
                return true;
            }
            case 3: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    ++this.flapsYaw;
                }
                ++this.zSpeed;
                return true;
            }
            case 4: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    ++this.flapsPitchLeft;
                    ++this.flapsPitchRight;
                }
                ++this.ySpeed;
                return true;
            }
            case 5: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    --this.flapsPitchLeft;
                    --this.flapsPitchRight;
                }
                --this.ySpeed;
                return true;
            }
            case 6: {
                --this.exitTimer;
                --this.exitTimer;
                if (this.exitTimer > 20) {
                    return true;
                }
            }
            case 7: {
                if (this.worldObj.isRemote && (type.invInflight || (Math.abs(this.throttle) < 0.1f && this.onGround))) {
                    FlansMod.proxy.openDriveableMenu((EntityPlayer)this.seats[0].riddenByEntity, this.worldObj, this);
                }
                return true;
            }
            case 9: {
                if (this.ridingEntity != null && this.ridingEntity instanceof EntitySeat) {
                    final EntitySeat seat = (EntitySeat)this.ridingEntity;
                    if (seat.driveable != null && seat.driveable instanceof EntityPlane) {
                        final EntityPlane Mothership = (EntityPlane)seat.driveable;
                        Mothership.accidentDelay = 100;
                    }
                }
                this.mountEntity((Entity)null);
                return true;
            }
            case 8: {
                final double checkCarrierRange = 20.0;
                final List carrier = this.worldObj.getEntitiesWithinAABB((Class)EntitySeat.class, AxisAlignedBB.getBoundingBox(this.posX - checkCarrierRange, this.posY - checkCarrierRange, this.posZ - checkCarrierRange, this.posX + checkCarrierRange, this.posY + checkCarrierRange, this.posZ + checkCarrierRange));
                if (type.carrierLandable || type.helipadLandable || type.parasitePlane) {
                    if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlane && !(this.riddenByEntity instanceof EntityPlayer)) {
                        this.riddenByEntity.mountEntity((Entity)null);
                        return true;
                    }
                    for (final Object obj : carrier) {
                        final EntitySeat carrierSpot = (EntitySeat)obj;
                        if ((carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.hardpoint && type.parasitePlane) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad && type.helipadLandable)) {
                            if (carrierSpot.driveable != null && type.mass <= carrierSpot.driveable.getDriveableType().weightLimit) {
                                this.mountEntity((Entity)carrierSpot);
                            }
                            else {
                                player.addChatMessage((IChatComponent)new ChatComponentText("Your aircraft (" + type.mass + " kg) is too heavy to dock! Weight limit: " + carrierSpot.driveable.getDriveableType().weightLimit + " kg"));
                            }
                        }
                    }
                }
                return true;
            }
            case 10: {
                FlansMod.proxy.changeControlMode((EntityPlayer)this.seats[0].riddenByEntity);
                this.seats[0].playerLooking = new RotatedAxes(0.0f, 0.0f, 0.0f);
                return true;
            }
            case 11: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    this.flapsPitchLeft += 2.0f;
                    this.flapsPitchRight -= 2.0f;
                }
                else {
                    this.flapsYaw -= 0.5f;
                }
                return true;
            }
            case 12: {
                if (this.mode != EnumPlaneMode.SIXDOF) {
                    this.flapsPitchLeft -= 2.0f;
                    this.flapsPitchRight += 2.0f;
                }
                else {
                    this.flapsYaw += 0.5f;
                }
                return true;
            }
            case 13: {
                if (this.toggleTimer <= 0 && this.worldObj.isAirBlock((int)this.posX, (int)(this.posY - 3.0), (int)this.posZ) && type.needsGear) {
                    this.varGear = !this.varGear;
                    player.addChatMessage((IChatComponent)new ChatComponentText("Landing gear " + (this.varGear ? "down" : "up")));
                    this.toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                }
                return true;
            }
            case 14: {
                if (this.toggleTimer <= 0) {
                    this.varDoor = !this.varDoor;
                    if (type.hasDoor) {
                        player.addChatMessage((IChatComponent)new ChatComponentText("Doors " + (this.varDoor ? "open" : "closed")));
                    }
                    this.toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                }
                if (this.toggleTimer <= 0) {
                    this.combatRadar = !this.combatRadar;
                    if (type.hasRadar) {
                        player.addChatMessage((IChatComponent)new ChatComponentText("Radar set to " + (this.combatRadar ? "combat range" : "long range")));
                    }
                    this.toggleTimer = 10;
                }
                return true;
            }
            case 15: {
                if (this.toggleTimer <= 0) {
                    if (type.mode == EnumPlaneMode.VTOL) {
                        if (this.mode == EnumPlaneMode.HELI) {
                            this.mode = EnumPlaneMode.PLANE;
                        }
                        else {
                            this.mode = EnumPlaneMode.HELI;
                        }
                        this.toggleTimer = 10;
                        player.addChatMessage((IChatComponent)new ChatComponentText((this.mode == EnumPlaneMode.HELI) ? "Entering hover mode" : "Entering plane mode"));
                    }
                    else if (type.mode != EnumPlaneMode.HELI) {
                        player.addChatMessage((IChatComponent)new ChatComponentText(this.varFlap ? "Landing flaps retracted" : "Landing flaps deployed"));
                        this.varFlap = !this.varFlap;
                        this.toggleTimer = 10;
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                    }
                }
                return true;
            }
            case 19: {
                if (this.nintendoSwitchLite > 0) {
                    --this.nintendoSwitchLite;
                    --this.nintendoSwitchLite;
                }
                if (PlayerHandler.getPlayerData(player) != null && this.nintendoSwitchLite <= 0 && type.numPassengers > 0 && this.seats[1].riddenByEntity == null) {
                    PlayerHandler.getPlayerData(player).nintendoSwitch = 10;
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 21: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 1 && this.seats[1].riddenByEntity == null && this.seats[2].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 22: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 2 && this.seats[1].riddenByEntity == null && this.seats[3].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 23: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 3 && this.seats[1].riddenByEntity == null && this.seats[4].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 24: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 4 && this.seats[1].riddenByEntity == null && this.seats[5].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 25: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 5 && this.seats[1].riddenByEntity == null && this.seats[6].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 26: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 6 && this.seats[1].riddenByEntity == null && this.seats[7].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 27: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 7 && this.seats[1].riddenByEntity == null && this.seats[8].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 28: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 8 && this.seats[1].riddenByEntity == null && this.seats[9].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 29: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 9 && this.seats[1].riddenByEntity == null && this.seats[10].riddenByEntity == null) {
                    player.mountEntity((Entity)this.seats[1]);
                }
                return true;
            }
            case 34: {
                if (this.ticksRepairing <= 0 && this.throttle <= 0.05 && !this.worldObj.isAirBlock((int)this.posX, (int)(this.posY - 5.0), (int)this.posZ)) {
                    this.ticksRepairing = type.ticksRepairing;
                    PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 10.0, this.dimension, "Repair", false);
                    if (this.worldObj.isRemote) {
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                    }
                    else if (!type.flareSound.isEmpty()) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.flareSound, false);
                    }
                    return true;
                }
                break;
            }
            case 35: {
                if (this.toggleTimer <= 0 && type.hasPlaneRadar) {
                    this.activeRadar = !this.activeRadar;
                    this.toggleTimer = 10;
                    player.addChatMessage((IChatComponent)new ChatComponentText("Radar Mode : " + (this.activeRadar ? "active" : "passive")));
                }
                return true;
            }
            case 16: {
                if (this.toggleTimer <= 0 && type.hasAfterBurner) {
                    this.afterBurning = !this.afterBurning;
                    player.addChatMessage((IChatComponent)new ChatComponentText(type.afterBurnName + (this.afterBurning ? " activated" : " deactivated")));
                    this.toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
                    if (type.AfterburnWing) {
                        this.varWing = this.afterBurning;
                        this.anim.changeState(this.varWing ? 0 : 1);
                    }
                    else if (type.AfterburnWingFlipped) {
                        this.varWing = !this.afterBurning;
                        this.anim.changeState(this.varWing ? 0 : 1);
                    }
                }
                return true;
            }
            case 18: {
                if (type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0 && !type.autoSmoke) {
                    this.ticksFlareUsing = type.timeFlareUsing * 20;
                    this.flareDelay = type.flareDelay;
                    if (this.worldObj.isRemote) {
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                    }
                    else if (!type.flareSound.isEmpty()) {
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.flareSound, false);
                    }
                    return true;
                }
                break;
            }
            case 33: {
                if (this.driveableData.thermalTimer <= 0 && type.hasMagicArtilleryMode) {
                    this.artilleryMode = !this.artilleryMode;
                    this.driveableData.thermalTimer = 10;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void updateKeyHeldState(final int key, final boolean held) {
        super.updateKeyHeldState(key, held);
        if (!this.worldObj.isRemote) {
            switch (key) {
            }
        }
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.prevWingPos = this.wingPos;
        this.prevWingRot = this.wingRot;
        this.prevWingWheelPos = this.wingWheelPos;
        this.prevWingWheelRot = this.wingWheelRot;
        this.prevCoreWheelPos = this.coreWheelPos;
        this.prevCoreWheelRot = this.coreWheelRot;
        this.prevTailWheelPos = this.tailWheelPos;
        this.prevTailWheelRot = this.tailWheelRot;
        this.prevDoorPos = this.doorPos;
        this.prevDoorRot = this.doorRot;
        if (this.getPlaneType().valkyrie) {
            if (!this.initiatedAnim) {
                this.anim.initPoses();
                this.anim.initAnim();
                this.initiatedAnim = true;
                this.anim.changeState(this.varWing ? 0 : 1);
            }
            if (this.initiatedAnim) {
                final int i = this.varWing ? 0 : 1;
                this.anim.UpdateAnim(i);
            }
        }
        if (this.isRiding() || this.throttle > 0.5f) {
            this.setSize(0.05f, 0.05f);
        }
        else {
            this.setSize(1.5f, 1.5f);
        }
        if (this.accidentDelay > 0) {
            --this.accidentDelay;
        }
        final float mph = this.control.V * 2.23694f;
        final Vector3f protoVec = new Vector3f(this.motionX, this.motionY, this.motionZ);
        final Vector3f motionVecerino = (Vector3f)protoVec.normalise();
        final Entity closestEntity = null;
        if (mph > 20.0f && this.accidentDelay <= 0 && this.driveableData.catapult <= 0 && (!this.getPlaneType().carrierLandable || this.throttle >= 0.2f || (!this.varGear && this.getPlaneType().needsGear))) {
            final List<Entity> hits = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, AxisAlignedBB.getBoundingBox(this.posX - this.accidentRange, this.posY - this.accidentRange, this.posZ - this.accidentRange, this.posX + this.accidentRange, this.posY + this.accidentRange, this.posZ + this.accidentRange));
            for (final Entity stuff : hits) {
                if (!(stuff instanceof EntitySeat)) {
                    continue;
                }
                final EntityDriveable victim = ((EntitySeat)stuff).driveable;
                if (this.seats[0] == null || this.seats[0].driveable == null || victim == null || victim == this.seats[0].driveable || this.getDriveableData() == null || this.getDriveableData().emergencyMode || victim.mounted || victim.accidentDelay > 1) {
                    continue;
                }
                final Vector3f protoVictim = new Vector3f(victim.motionX, victim.motionY, victim.motionZ);
                final Vector3f victimMotion = (Vector3f)protoVictim.normalise();
                this.accidentDelay = 40;
                final float ms = mph / 2.24f;
                if (victim instanceof EntityPlane) {
                    final EntityPlane PlaneVictim = (EntityPlane)victim;
                    if (!PlaneVictim.getPlaneType().parasitePlane || !PlaneVictim.isRiding()) {
                        this.motionY += ((float)Math.random() - 0.5f) * 9.0f * (mph / this.getPlaneType().maxSpeed);
                        if (Math.abs(motionVecerino.x) - Math.abs(victimMotion.x) < 0.3f && Math.abs(motionVecerino.y) - Math.abs(victimMotion.y) < 0.3f && Math.abs(motionVecerino.z) - Math.abs(victimMotion.z) < 0.3f && (Math.abs(motionVecerino.x + victimMotion.x) > 1.33 || Math.abs(motionVecerino.y + victimMotion.y) > 1.33 || Math.abs(motionVecerino.z + victimMotion.z) > 1.33)) {
                            final float msEffective = ms - PlaneVictim.control.V / 2.24f;
                            final float megaJoules = msEffective * msEffective * 0.5f * (this.getPlaneType().mass / 1000.0f);
                            float damageVplane = 0.0f;
                            if (megaJoules / 10.0f > 31999.0f) {
                                damageVplane = 31999.0f;
                            }
                            else {
                                damageVplane = megaJoules / 10.0f;
                            }
                            if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.tail) != null && victim.getDriveableData().parts.get(EnumDriveablePart.tail).maxHealth > 0) {
                                final DriveablePart driveablePart = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.tail);
                                driveablePart.health -= (int)damageVplane;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart2 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart2.health -= (int)damageVplane;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart3 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart3.health -= (int)damageVplane;
                            }
                            if (damageVplane > 10000.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else if (damageVplane > 250.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                            }
                            if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart4 = this.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart4.health -= (int)damageVplane;
                            }
                            else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart5 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart5.health -= (int)damageVplane;
                            }
                        }
                        else if ((Math.abs(motionVecerino.x) + Math.abs(victimMotion.x) > 1.6 && motionVecerino.x + victimMotion.x < 0.2) || (Math.abs(motionVecerino.y) + Math.abs(victimMotion.y) > 1.6 && motionVecerino.y + victimMotion.y < 0.2) || (Math.abs(motionVecerino.z) + Math.abs(victimMotion.z) > 1.6 && motionVecerino.z + victimMotion.z < 0.2)) {
                            final float msEffective = ms + PlaneVictim.control.V / 2.24f;
                            final float megaJoules = msEffective * msEffective * 0.5f * (this.getPlaneType().mass / 1000.0f);
                            float damageVplane = 0.0f;
                            if (megaJoules / 10.0f > 31999.0f) {
                                damageVplane = 31999.0f;
                            }
                            else {
                                damageVplane = megaJoules / 10.0f;
                            }
                            if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart6 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart6.health -= (int)damageVplane;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart7 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart7.health -= (int)damageVplane;
                            }
                            if (damageVplane > 10000.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else if (damageVplane > 250.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                            }
                            if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart8 = this.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart8.health -= (int)damageVplane;
                            }
                            else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart9 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart9.health -= (int)damageVplane;
                            }
                        }
                        else if (Math.abs(motionVecerino.x) + Math.abs(victimMotion.z) < 1.0f || Math.abs(motionVecerino.z) + Math.abs(victimMotion.y) < 1.0f || Math.abs(motionVecerino.z) + Math.abs(victimMotion.y) < 1.0f) {
                            final float megaJoules2 = ms * ms * 0.5f * (this.getPlaneType().mass / 1000.0f);
                            float damageVplane2 = 0.0f;
                            if (megaJoules2 / 10.0f > 31999.0f) {
                                damageVplane2 = 31999.0f;
                            }
                            else {
                                damageVplane2 = megaJoules2 / 10.0f;
                            }
                            if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.leftWing) != null && victim.getDriveableData().parts.get(EnumDriveablePart.leftWing).maxHealth > 0) {
                                final DriveablePart driveablePart10 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.leftWing);
                                driveablePart10.health -= (int)damageVplane2;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.rightWing) != null && victim.getDriveableData().parts.get(EnumDriveablePart.rightWing).maxHealth > 0) {
                                final DriveablePart driveablePart11 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.rightWing);
                                driveablePart11.health -= (int)damageVplane2;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart12 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart12.health -= (int)damageVplane2;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart13 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart13.health -= (int)damageVplane2;
                            }
                            if (damageVplane2 > 10000.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else if (damageVplane2 > 250.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                            }
                            if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.leftWing) != null && this.getDriveableData().parts.get(EnumDriveablePart.leftWing).maxHealth > 0) {
                                final DriveablePart driveablePart14 = this.getDriveableData().parts.get(EnumDriveablePart.leftWing);
                                driveablePart14.health -= (int)damageVplane2;
                            }
                            else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.rightWing) != null && this.getDriveableData().parts.get(EnumDriveablePart.rightWing).maxHealth > 0) {
                                final DriveablePart driveablePart15 = this.getDriveableData().parts.get(EnumDriveablePart.rightWing);
                                driveablePart15.health -= (int)damageVplane2;
                            }
                            else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart16 = this.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart16.health -= (int)damageVplane2;
                            }
                            else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart17 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart17.health -= (int)damageVplane2;
                            }
                        }
                        else {
                            final float megaJoules2 = ms * ms * 0.5f * (this.getPlaneType().mass / 1000.0f);
                            float damageVplane2 = 0.0f;
                            if (megaJoules2 / 10.0f > 31999.0f) {
                                damageVplane2 = 31999.0f;
                            }
                            else {
                                damageVplane2 = megaJoules2 / 10.0f;
                            }
                            if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                final DriveablePart driveablePart18 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                driveablePart18.health -= (int)damageVplane2;
                            }
                            else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                final DriveablePart driveablePart19 = PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core);
                                driveablePart19.health -= (int)damageVplane2;
                            }
                            if (damageVplane2 > 10000.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else if (damageVplane2 > 250.0f) {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                            }
                            else {
                                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                                PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                            }
                            if (PlaneVictim.control.V < 20.0f) {
                                final float msEffective2 = ms - PlaneVictim.control.V / 2.24f;
                                final float megaJoulesEnemy = msEffective2 * msEffective2 * 0.5f * (PlaneVictim.getPlaneType().mass / 1000.0f);
                                float damageVyou = 0.0f;
                                if (megaJoules2 / 10.0f > 31999.0f) {
                                    damageVyou = 31999.0f;
                                }
                                else {
                                    damageVyou = megaJoules2 / 10.0f;
                                }
                                if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                                    final DriveablePart driveablePart20 = this.getDriveableData().parts.get(EnumDriveablePart.airframe);
                                    driveablePart20.health -= (int)damageVyou;
                                }
                                else if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                                    final DriveablePart driveablePart21 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                                    driveablePart21.health -= (int)damageVyou;
                                }
                            }
                        }
                    }
                }
                if (!(victim instanceof EntityVehicle)) {
                    continue;
                }
                final EntityVehicle VehicleVictim = (EntityVehicle)victim;
                this.motionY += ((float)Math.random() - 0.25f) * 9.0f * (mph / this.getPlaneType().maxSpeed);
                if (VehicleVictim.getVehicleType().epicShip) {
                    final float megaJoules2 = ms * ms * 0.5f * (this.getPlaneType().mass / 1000.0f);
                    float damageVship = 0.0f;
                    if (megaJoules2 / 40.0f + this.getPlaneType().kamikazeBonus > 31999.0f) {
                        damageVship = 31999.0f;
                    }
                    else {
                        damageVship = megaJoules2 / 40.0f + this.getPlaneType().kamikazeBonus;
                    }
                    if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.bow) != null && victim.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0) {
                        final DriveablePart driveablePart22 = VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart22.health -= (int)damageVship;
                    }
                    else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.stern) != null && victim.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0) {
                        final DriveablePart driveablePart23 = VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart23.health -= (int)damageVship;
                    }
                    else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.left) != null && victim.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0) {
                        final DriveablePart driveablePart24 = VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart24.health -= (int)damageVship;
                    }
                    else if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.right) != null && victim.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0) {
                        final DriveablePart driveablePart25 = VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart25.health -= (int)damageVship;
                    }
                    if (damageVship > 10000.0f) {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                    }
                    else if (damageVship > 250.0f) {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                    }
                    else {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                    }
                    if (this.getDriveableData().parts == null || this.getDriveableData().parts.get(EnumDriveablePart.core) == null || this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth <= 0) {
                        continue;
                    }
                    final DriveablePart driveablePart26 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                    driveablePart26.health -= (int)damageVship;
                }
                else {
                    final float megaJoules2 = ms * ms * 0.05f * (this.getPlaneType().mass / 1000.0f);
                    float damageVship = 0.0f;
                    if (megaJoules2 / 200.0f + this.getPlaneType().kamikazeBonus > 31999.0f) {
                        damageVship = 31999.0f;
                    }
                    else {
                        damageVship = megaJoules2 / 200.0f + this.getPlaneType().kamikazeBonus;
                    }
                    if (victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0) {
                        final DriveablePart driveablePart27 = VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.core);
                        driveablePart27.health -= (int)damageVship;
                    }
                    if (damageVship > 10000.0f) {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "tankkuDeath"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                    }
                    else if (damageVship > 250.0f) {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "hugeexplosion"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "explcls6", false);
                    }
                    else {
                        FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.posX, this.posY, this.posZ, 1, "largeexplode"), this.posX, this.posY, this.posZ, 200.0f, this.dimension);
                        PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 250.0, this.dimension, "Crash", false);
                    }
                    if (this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0) {
                        final DriveablePart driveablePart28 = this.getDriveableData().parts.get(EnumDriveablePart.airframe);
                        driveablePart28.health -= (int)damageVship;
                    }
                    else {
                        if (this.getDriveableData().parts == null || this.getDriveableData().parts.get(EnumDriveablePart.core) == null || this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth <= 0) {
                            continue;
                        }
                        final DriveablePart driveablePart29 = this.getDriveableData().parts.get(EnumDriveablePart.core);
                        driveablePart29.health -= (int)damageVship;
                    }
                }
            }
        }
        if (this.control.V * 2.23694 > this.getPlaneType().stukaSpeed && this.stukaSoundDelay <= 0 && !this.worldObj.isRemote) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, this.getPlaneType().stukaSoundRange, this.dimension, this.getPlaneType().stukaSound, false);
            this.stukaSoundDelay = this.getPlaneType().stukaSoundLength;
        }
        if (this.driveableData.catapult > 0) {
            final DriveableData driveableData = this.driveableData;
            --driveableData.catapult;
        }
        if (this.ticksExisted == 19 && (this.getDriveableData().seatBelt == null || this.getDriveableData().seatBelt.length() == 0)) {
            this.getDriveableData().seatBelt = "null";
        }
        if (this.ticksExisted > 20 && this.seats[0] != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayer) {
            final EntityPlayer Master = (EntityPlayer)this.seats[0].riddenByEntity;
            this.getDriveableData().seatBelt = Master.getDisplayName();
            this.getDriveableData().emergencyMode = false;
        }
        final boolean isDivisibleBy10 = this.ticksExisted % 5 == 0;
        if (this.getDriveableData().emergencyMode && isDivisibleBy10) {
            this.throttle = 1.0f;
            this.varGear = false;
            final List<Entity> foxes = this.worldObj.getEntitiesWithinAABBExcludingEntity((Entity)this, AxisAlignedBB.getBoundingBox(this.posX - 200.0, this.posY - 1000.0, this.posZ - 200.0, this.posX + 200.0, this.posY + 1000.0, this.posZ + 200.0));
            for (final Entity stuff2 : foxes) {
                if (!(stuff2 instanceof EntityPlayer)) {
                    continue;
                }
                final EntityPlayer human = (EntityPlayer)stuff2;
                if (this.worldObj.getPlayerEntityByName(this.getDriveableData().seatBelt) != human) {
                    continue;
                }
                human.mountEntity((Entity)this.seats[0]);
            }
        }
        if (this.driveableData.landBrake > 0) {
            final DriveableData driveableData2 = this.driveableData;
            --driveableData2.landBrake;
        }
        if (this.initiatedAnim && this.throttle > 0.2f) {
            Vector3f v = this.anim.getFullPosition(new Vector3f(151.0f, -25.0f, -24.0f), this.anim.parts.get(5));
            v = this.axes.findLocalVectorGlobally(new Vector3f(-v.x, -v.y, v.z));
            Vector3f v2 = this.anim.getFullPosition(new Vector3f(151.0f, -25.0f, 24.0f), this.anim.parts.get(8));
            v2 = this.axes.findLocalVectorGlobally(new Vector3f(-v2.x, -v2.y, v2.z));
            for (int j = 0; j < 4; ++j) {
                if (!Float.isNaN(v.x)) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn", this.posX + v2.x / 16.0f, this.posY + v2.y / 16.0f, this.posZ + v2.z / 16.0f, 0.0, 0.0, 0.0), this.posX + v2.x / 16.0f, this.posY + v2.y / 16.0f, this.posZ + v2.z / 16.0f, 150.0f, this.dimension);
                }
                if (!Float.isNaN(v.x)) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn", this.posX + v.x / 16.0f, this.posY + v.y / 16.0f, this.posZ + v.z / 16.0f, 0.0, 0.0, 0.0), this.posX + v.x / 16.0f, this.posY + v.y / 16.0f, this.posZ + v.z / 16.0f, 150.0f, this.dimension);
                }
            }
        }
        final PlaneType type = this.getPlaneType();
        final DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Plane type null. Not ticking plane");
            return;
        }
        if (this.ticksExisted == 10) {
            double checkCarrierRange = 20.0;
            if (type.carrierLandable || type.parasitePlane || type.helipadLandable) {
                checkCarrierRange = 3.0;
            }
            final List carrier = this.worldObj.getEntitiesWithinAABB((Class)EntitySeat.class, AxisAlignedBB.getBoundingBox(this.posX - checkCarrierRange, this.posY - checkCarrierRange, this.posZ - checkCarrierRange, this.posX + checkCarrierRange, this.posY + checkCarrierRange, this.posZ + checkCarrierRange));
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlane && !(this.riddenByEntity instanceof EntityPlayer)) {
                this.riddenByEntity.mountEntity((Entity)null);
            }
            for (final Object obj : carrier) {
                final EntitySeat carrierSpot = (EntitySeat)obj;
                if (obj != null && carrierSpot != null && carrierSpot.seatInfo != null && ((carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad && type.helipadLandable) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.hardpoint && type.parasitePlane))) {
                    if (carrierSpot.driveable != null && type.mass <= carrierSpot.driveable.getDriveableType().weightLimit && (type.carrierLandable || (type.parasitePlane && carrierSpot.seatInfo.hardpoint) || (type.helipadLandable && carrierSpot.seatInfo.helipad))) {
                        this.mountEntity((Entity)carrierSpot);
                    }
                    else {
                        if (type.mass > 1.5f * carrierSpot.driveable.getDriveableType().weightLimit) {
                            continue;
                        }
                        this.mountEntity((Entity)carrierSpot);
                    }
                }
            }
        }
        if (type.swapInitialWing && this.ticksExisted == 30) {
            this.anim.changeState(this.afterBurning ? 1 : 0);
        }
        final boolean thePlayerIsDrivingThis = this.worldObj.isRemote && this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.seats[0].riddenByEntity);
        ++this.ticksSinceUsed;
        if (!this.worldObj.isRemote && this.seats[0].riddenByEntity != null) {
            this.ticksSinceUsed = 0;
        }
        if (!this.worldObj.isRemote && TeamsManager.planeLife > 0 && this.ticksSinceUsed > TeamsManager.planeLife * 20) {
            this.setDead();
        }
        if (this.worldObj.isRemote && (this.varFlare || this.ticksFlareUsing > 0) && this.ticksExisted % 5 == 0) {
            final Vector3f dir = this.axes.findLocalVectorGlobally(new Vector3f(0.0f, -0.5f, 0.0f));
            FlansMod.proxy.spawnParticle("flansmod.flare", this.posX, this.posY, this.posZ, dir.x, dir.y, dir.z);
        }
        if (this.ticksFlareUsing > 0) {
            --this.ticksFlareUsing;
        }
        if (this.flareDelay > 0) {
            --this.flareDelay;
        }
        if (this.mode == EnumPlaneMode.PLANE && type.carrierLandable && this.throttle < 0.2f && (this.varGear || !type.needsGear) && this.driveableData.catapult == 0) {
            final List carrierLanding = this.worldObj.getEntitiesWithinAABB((Class)EntitySeat.class, AxisAlignedBB.getBoundingBox(this.posX - 3.0, this.posY - 1.0, this.posZ - 3.0, this.posX + 3.0, this.posY + 1.0, this.posZ + 3.0));
            if (type.carrierLandable || type.helipadLandable || type.parasitePlane) {
                if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlane && !(this.riddenByEntity instanceof EntityPlayer)) {
                    this.riddenByEntity.mountEntity((Entity)null);
                }
                for (final Object obj2 : carrierLanding) {
                    final EntitySeat carrierSpot2 = (EntitySeat)obj2;
                    if (obj2 != null && carrierSpot2 != null && carrierSpot2.seatInfo != null && ((carrierSpot2.riddenByEntity == null && carrierSpot2.seatInfo.carrier) || (carrierSpot2.riddenByEntity == null && carrierSpot2.seatInfo.helipad && type.helipadLandable) || (carrierSpot2.riddenByEntity == null && carrierSpot2.seatInfo.hardpoint && type.parasitePlane))) {
                        if (carrierSpot2.driveable != null && type.mass <= carrierSpot2.driveable.getDriveableType().weightLimit) {
                            this.mountEntity((Entity)carrierSpot2);
                        }
                        else {
                            if (this.seats[0].riddenByEntity == null) {
                                continue;
                            }
                            ((EntityPlayer)this.seats[0].riddenByEntity).addChatMessage((IChatComponent)new ChatComponentText("Your aircraft (" + type.mass + " kg) is too heavy to dock! Weight limit: " + carrierSpot2.driveable.getDriveableType().weightLimit + " kg"));
                        }
                    }
                }
            }
        }
        if (this.nintendoSwitchLite < 10) {
            ++this.nintendoSwitchLite;
        }
        if (this.exitTimer < type.exitTimer) {
            ++this.exitTimer;
        }
        if (this.driveableData.thermalTimer > 0) {
            final DriveableData driveableData3 = this.driveableData;
            --driveableData3.thermalTimer;
        }
        if (this.ticksRepairing > 0) {
            --this.ticksRepairing;
        }
        if (this.exitTimer < 0 && this.seats[0] != null && this.seats[0] != null && this.seats[0].riddenByEntity != null) {
            this.seats[0].riddenByEntity.mountEntity((Entity)null);
            this.exitTimer = type.exitTimer;
        }
        if (this.testerino > 5 && this.seats[0] != null && this.worldObj.isRemote) {
            this.seats[0].riddenByEntity = null;
        }
        if (this.afterBurning && type.hasAfterBurner && this.throttle < 1.0f) {
            this.throttle += 0.005f;
        }
        if (this.afterBurning && this.throttle > 0.5 && this.poopooTimer == 0 && this.getSpeedXYZ() > 1.7000000476837158) {
            FlansMod.packetHandler.sendToDonut(new PacketPlaySound(this.posX, this.posY, this.posZ, type.sonicBoomSound), this.posX, this.posY, this.posZ, 15.0f, 120.0f, this.dimension);
            this.poopooTimer = 140;
        }
        if (this.bombDelay > 0) {
            --this.bombDelay;
        }
        if (this.gunDelay > 0) {
            --this.gunDelay;
        }
        if (this.toggleTimer > 0) {
            --this.toggleTimer;
        }
        if (this.carrierTimer < 0) {
            ++this.carrierTimer;
        }
        if (this.poopooTimer > 0) {
            --this.poopooTimer;
        }
        if (!this.varWing) {
            this.wingPos = this.transformPart(this.wingPos, type.wingPos1, type.wingRate);
            this.wingRot = this.transformPart(this.wingRot, type.wingRot1, type.wingRotRate);
        }
        else {
            this.wingPos = this.transformPart(this.wingPos, type.wingPos2, type.wingRate);
            this.wingRot = this.transformPart(this.wingRot, type.wingRot2, type.wingRotRate);
        }
        if (this.varGear) {
            this.wingWheelPos = this.transformPart(this.wingWheelPos, type.wingWheelPos1, type.wingWheelRate);
            this.wingWheelRot = this.transformPart(this.wingWheelRot, type.wingWheelRot1, type.wingWheelRotRate);
            this.coreWheelPos = this.transformPart(this.coreWheelPos, type.bodyWheelPos1, type.bodyWheelRate);
            this.coreWheelRot = this.transformPart(this.coreWheelRot, type.bodyWheelRot1, type.bodyWheelRotRate);
            this.tailWheelPos = this.transformPart(this.tailWheelPos, type.tailWheelPos1, type.tailWheelRate);
            this.tailWheelRot = this.transformPart(this.tailWheelRot, type.tailWheelRot1, type.tailWheelRotRate);
        }
        else {
            this.wingWheelPos = this.transformPart(this.wingWheelPos, type.wingWheelPos2, type.wingWheelRate);
            this.wingWheelRot = this.transformPart(this.wingWheelRot, type.wingWheelRot2, type.wingWheelRotRate);
            this.coreWheelPos = this.transformPart(this.coreWheelPos, type.bodyWheelPos2, type.bodyWheelRate);
            this.coreWheelRot = this.transformPart(this.coreWheelRot, type.bodyWheelRot2, type.bodyWheelRotRate);
            this.tailWheelPos = this.transformPart(this.tailWheelPos, type.tailWheelPos2, type.tailWheelRate);
            this.tailWheelRot = this.transformPart(this.tailWheelRot, type.tailWheelRot2, type.tailWheelRotRate);
        }
        if (!this.varDoor) {
            this.doorPos = this.transformPart(this.doorPos, type.doorPos1, type.doorRate);
            this.doorRot = this.transformPart(this.doorRot, type.doorRot1, type.doorRotRate);
        }
        else {
            this.doorPos = this.transformPart(this.doorPos, type.doorPos2, type.doorRate);
            this.doorRot = this.transformPart(this.doorRot, type.doorRot2, type.doorRotRate);
        }
        if (!this.worldObj.isAirBlock((int)this.posX, (int)(this.posY - 10.0), (int)this.posZ) && this.throttle <= 0.2) {
            for (final EntitySeat seat : this.seats) {
                if (seat != null && !this.varGear && type.needsGear && this.seats != null && this.seats[0] != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity != null && this.poopooTimer == 0 && !this.mounted) {
                    if (this.worldObj.isRemote) {
                        ((EntityPlayer)this.seats[0].riddenByEntity).addChatMessage((IChatComponent)new ChatComponentText("Low Altitude! Deploy Landing Gear!"));
                    }
                    else {
                        ((EntityPlayer)this.seats[0].riddenByEntity).addChatMessage((IChatComponent)new ChatComponentText("Low Altitude! Deploy Landing Gear!"));
                    }
                    this.poopooTimer = 60;
                }
            }
            if (type.foldWingForLand) {
                if (this.varWing && this.seats[0].riddenByEntity != null) {
                    ((EntityPlayer)this.seats[0].riddenByEntity).addChatMessage((IChatComponent)new ChatComponentText("Extending wings"));
                }
                this.varWing = false;
            }
        }
        if (!this.worldObj.isAirBlock((int)this.posX, (int)(this.posY - 3.0), (int)this.posZ) && this.throttle <= 0.05) {
            if (!this.doorsHaveShut) {
                this.varDoor = true;
            }
            this.doorsHaveShut = true;
        }
        else if (!type.flyWithOpenDoor) {
            this.varDoor = false;
            this.doorsHaveShut = false;
        }
        if (this.locked) {
            this.varDoor = false;
            this.doorsHaveShut = false;
        }
        if (!this.isPartIntact(EnumDriveablePart.tail) && type.spinWithoutTail) {
            this.flapsYaw = 15.0f;
            if (this.isInWater()) {
                this.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        this.flapsYaw *= 0.9f;
        this.flapsPitchLeft *= 0.9f;
        this.flapsPitchRight *= 0.9f;
        if (this.flapsYaw > 20.0f) {
            this.flapsYaw = 20.0f;
        }
        if (this.flapsYaw < -20.0f) {
            this.flapsYaw = -20.0f;
        }
        if (this.flapsPitchRight > 20.0f) {
            this.flapsPitchRight = 20.0f;
        }
        if (this.flapsPitchRight < -20.0f) {
            this.flapsPitchRight = -20.0f;
        }
        if (this.flapsPitchLeft > 20.0f) {
            this.flapsPitchLeft = 20.0f;
        }
        if (this.flapsPitchLeft < -20.0f) {
            this.flapsPitchLeft = -20.0f;
        }
        if (this.worldObj.isRemote && !thePlayerIsDrivingThis && this.serverPositionTransitionTicker > 0) {
            final double x = this.posX + (this.serverPosX - this.posX) / this.serverPositionTransitionTicker;
            final double y = this.posY + (this.serverPosY - this.posY) / this.serverPositionTransitionTicker;
            final double z = this.posZ + (this.serverPosZ - this.posZ) / this.serverPositionTransitionTicker;
            final double dYaw = MathHelper.wrapAngleTo180_double(this.serverYaw - this.axes.getYaw());
            final double dPitch = MathHelper.wrapAngleTo180_double(this.serverPitch - this.axes.getPitch());
            final double dRoll = MathHelper.wrapAngleTo180_double(this.serverRoll - this.axes.getRoll());
            this.rotationYaw = (float)(this.axes.getYaw() + dYaw / this.serverPositionTransitionTicker);
            this.rotationPitch = (float)(this.axes.getPitch() + dPitch / this.serverPositionTransitionTicker);
            final float rotationRoll = (float)(this.axes.getRoll() + dRoll / this.serverPositionTransitionTicker);
            --this.serverPositionTransitionTicker;
            this.setPosition(x, y, z);
            this.setRotation(this.rotationYaw, this.rotationPitch, rotationRoll);
        }
        if (type.labjacFuel > 15.0f) {
            if (this.labjacFuel <= 0.0f) {
                this.throttle = 0.0f;
                this.afterBurning = false;
            }
            if (this.mounted && this.labjacFuel < type.labjacFuel) {
                this.labjacFuel += 50.0f;
            }
            if (type.parasitePlane && this.mounted && this.ridingEntity != null && this.ridingEntity instanceof EntitySeat && ((EntitySeat)this.ridingEntity).driveable instanceof EntityPlane) {
                final EntityDriveable Mothership = ((EntitySeat)this.ridingEntity).driveable;
                this.rotationPitch = Mothership.rotationPitch;
                this.rotationYaw = Mothership.rotationYaw;
                this.varGear = false;
            }
            if (this.labjacFuel < type.labjacFuel && this.throttle <= 0.1 && this.throttle > -0.1 && this.worldObj.isAirBlock((int)this.posX, (int)(this.posY + 1.0), (int)this.posZ) && !this.worldObj.isAirBlock((int)this.posX, (int)(this.posY - 10.0), (int)this.posZ)) {
                this.labjacFuel += 30.0f;
            }
            if (this.labjacFuel > type.labjacFuel) {
                this.labjacFuel = type.labjacFuel;
            }
            if (this.throttle > 0.05f && this.afterBurning) {
                this.labjacFuel -= 10.0f * this.throttle * type.afterBurnFuelPenalty;
            }
            else if (this.throttle > 0.05f && !this.afterBurning) {
                this.labjacFuel -= 10.0f * this.throttle;
            }
        }
        if (this.mounted) {
            if (this.mode != EnumPlaneMode.HELI && this.driveableData.catapult < 44) {
                final DriveableData driveableData4 = this.driveableData;
                driveableData4.catapult += 2;
            }
            this.varGear = true;
            this.rotationPitch *= 0.9f;
            this.accidentDelay = 100;
            if (this.mode != EnumPlaneMode.HELI || this.throttle > 0.5f) {
                this.throttle *= 0.97f;
            }
            if (!type.parasitePlane) {
                final FlightController control = this.control;
                control.V *= 0.95f;
            }
            if (this.ridingEntity != null && this.ridingEntity instanceof EntitySeat && type.parasitePlane) {
                final EntitySeat Seat = (EntitySeat)this.ridingEntity;
                if (Seat != null && Seat.driveable != null) {
                    final EntityDriveable Mothership2 = Seat.driveable;
                    this.motionX = Mothership2.motionX;
                    this.motionY = Mothership2.motionY;
                    this.motionZ = Mothership2.motionZ;
                    if (Mothership2 instanceof EntityPlane) {
                        final EntityPlane Mommy = (EntityPlane)Mothership2;
                        if (Mommy.control != null && this.control != null) {
                            this.control.V = Mommy.control.V;
                        }
                    }
                }
            }
            if (this.throttle <= 0.05f && this.ticksExisted % 10 == 0) {
                if (!type.carrierWingFlip) {
                    this.varWing = false;
                }
                else {
                    this.varWing = true;
                }
                this.anim.changeState(this.varWing ? 0 : 1);
            }
        }
        if (this.throttle > 0.05f && this.ticksExisted % 10 == 0 && !type.AfterburnWing) {
            if (!type.carrierWingFlip) {
                this.varWing = true;
            }
            else {
                this.varWing = false;
            }
            this.anim.changeState(this.varWing ? 0 : 1);
        }
        if (this.driveableData.catapult < 44 && this.driveableData.catapult > 0) {
            this.throttle += 0.025f;
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0), this.posX, this.posY, this.posZ, 150.0f, this.dimension);
        }
        if (this.worldObj != null && ((type.carrierLandable && this.ticksExisted > 40) || (type.helipadLandable && this.ticksExisted > 40))) {
            final List carrier2 = this.worldObj.getEntitiesWithinAABB((Class)EntitySeat.class, AxisAlignedBB.getBoundingBox(this.posX - 20.0, this.posY - 20.0, this.posZ - 20.0, this.posX + 20.0, this.posY + 20.0, this.posZ + 20.0));
            for (final Object obj2 : carrier2) {
                if (!(obj2 instanceof EntitySeat)) {
                    continue;
                }
                if (!(obj2 instanceof EntitySeat)) {
                    continue;
                }
                final EntitySeat carrierSpot2 = (EntitySeat)obj2;
                if (carrierSpot2.seatInfo == null || ((carrierSpot2.riddenByEntity != null || !carrierSpot2.seatInfo.carrier) && (carrierSpot2.riddenByEntity != null || !carrierSpot2.seatInfo.helipad || !type.helipadLandable))) {
                    continue;
                }
                final DriveableData driveableData5 = data;
                ++driveableData5.carrierTip;
                final DriveableData driveableData6 = data;
                ++driveableData6.carrierTip;
            }
        }
        if (data.carrierTip > 0) {
            final DriveableData driveableData7 = data;
            --driveableData7.carrierTip;
        }
        if (data.carrierTip > 5) {
            data.carrierTip = 5;
        }
        final boolean canThrust = (this.seats[0] != null && this.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)this.seats[0].riddenByEntity).capabilities.isCreativeMode) || data.fuelInTank > 0.0f;
        final float throttlePull = 0.99f;
        if (this.seats[0] != null && this.seats[0].riddenByEntity != null && this.mode == EnumPlaneMode.HELI && canThrust) {
            if (type.rocketThrottle && this.throttle > 0.1f && this.fuelTimer > 0) {
                this.throttle = 1.0f;
                --this.fuelTimer;
            }
            else if (this.fuelTimer <= 0) {
                this.throttle = 0.0f;
            }
            else {
                this.throttle = (this.throttle - 0.5f) * throttlePull + 0.5f;
            }
        }
        this.control.fly(this);
        final double motion = Math.sqrt(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
        if (motion > 10.0) {
            this.motionX *= 10.0 / motion;
            this.motionY *= 10.0 / motion;
            this.motionZ *= 10.0 / motion;
        }
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null && this.worldObj != null) {
                if (type.floatOnWater && this.worldObj.isAnyLiquid(this.boundingBox)) {
                    this.motionY = type.buoyancy;
                }
                if (!type.floatOnWater && this.worldObj.isAnyLiquid(this.boundingBox)) {
                    this.throttle = 0.0f;
                }
            }
        }
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                wheel.prevPosY = wheel.posY;
                wheel.moveEntity(this.motionX, this.onDeck ? 0.0 : this.motionY, this.motionZ);
            }
        }
        this.correctWheelPos();
        for (int k = 0; k < 2; ++k) {
            final Vector3f amountToMoveCar = new Vector3f(this.motionX / 2.0, this.onDeck ? 0.0 : (this.motionY / 2.0), this.motionZ / 2.0);
            for (final EntityWheel wheel2 : this.wheels) {
                if (wheel2 != null) {
                    this.onGround = true;
                    wheel2.onGround = true;
                    wheel2.rotationYaw = this.axes.getYaw();
                    Vector3f wPos = this.getPlaneType().wheelPositions[wheel2.ID].position;
                    if (type.valkyrie && this.varWing) {
                        wPos = new Vector3f(wPos.x, wPos.y + 5.625f, wPos.z);
                    }
                    final Vector3f targetWheelPos = this.axes.findLocalVectorGlobally(wPos);
                    final Vector3f currentWheelPos = new Vector3f(wheel2.posX - this.posX, wheel2.posY - this.posY, wheel2.posZ - this.posZ);
                    final float targetWheelLength = targetWheelPos.length();
                    final float currentWheelLength = currentWheelPos.length();
                    final float dLength = targetWheelLength - currentWheelLength;
                    final float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);
                    final float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
                    final Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);
                    final Matrix4f mat = new Matrix4f();
                    mat.m00 = currentWheelPos.x;
                    mat.m10 = currentWheelPos.y;
                    mat.m20 = currentWheelPos.z;
                    mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);
                    if (this.ticksExisted > 5 && (!type.valkyrie || this.anim.timeSinceSwitch >= 10)) {
                        this.axes.rotateGlobal(-dAngle * type.wheelSpringStrength, rotateAround);
                    }
                    final Vector3f newWheelPos = new Vector3f(mat.m00, mat.m10, mat.m20);
                    newWheelPos.normalise().scale(newLength);
                    final float wheelProportion = 0.75f;
                    final Vector3f amountToMoveWheel = new Vector3f();
                    amountToMoveWheel.x = (newWheelPos.x - currentWheelPos.x) * (1.0f - wheelProportion);
                    amountToMoveWheel.y = (newWheelPos.y - currentWheelPos.y) * (1.0f - wheelProportion);
                    amountToMoveWheel.z = (newWheelPos.z - currentWheelPos.z) * (1.0f - wheelProportion);
                    final Vector3f vector3f = amountToMoveCar;
                    vector3f.x -= (newWheelPos.x - currentWheelPos.x) * (1.0f - wheelProportion);
                    final Vector3f vector3f2 = amountToMoveCar;
                    vector3f2.y -= (newWheelPos.y - currentWheelPos.y) * (1.0f - wheelProportion);
                    final Vector3f vector3f3 = amountToMoveCar;
                    vector3f3.z -= (newWheelPos.z - currentWheelPos.z) * (1.0f - wheelProportion);
                    final Vector3f vector3f4 = amountToMoveCar;
                    vector3f4.y += (float)((wheel2.posY - wheel2.prevPosY - (this.onDeck ? 0.0 : this.motionY)) * 0.5 / this.wheels.length);
                    wheel2.moveEntity((double)amountToMoveWheel.x, (double)amountToMoveWheel.y, (double)amountToMoveWheel.z);
                }
            }
            this.moveEntity((double)amountToMoveCar.x, (double)amountToMoveCar.y, (double)amountToMoveCar.z);
        }
        if (this.ridingEntity != null && this.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            this.axes.setAngles(this.ridingEntity.rotationYaw + 90.0f, 0.0f, 0.0f);
        }
        this.checkForCollisions();
        if (this.throttle > 0.01f && this.throttle < 0.2f && this.soundPosition == 0) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.startSound, false);
            this.soundPosition = type.startSoundLength;
        }
        if (this.throttle > 0.2f && this.soundPosition == 0) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, type.engineSound, false);
            this.soundPosition = type.engineSoundLength;
        }
        if (this.soundPosition > 0) {
            --this.soundPosition;
        }
        if (this.stukaSoundDelay > 0) {
            --this.stukaSoundDelay;
        }
        for (final EntitySeat seat2 : this.seats) {
            if ((seat2 != null && seat2.riddenByEntity != null && this.ticksExisted % TeamsManager.seatRate == 0) || (seat2 != null && seat2.riddenByEntity == null && this.ticksExisted % 20 == 0)) {
                seat2.updatePosition();
            }
        }
        final int packetRate = 1;
        if (thePlayerIsDrivingThis && this.ticksExisted % TeamsManager.planeRate == 0) {
            FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
            FlansMod.getPacketHandler().sendToServer(new PacketPlaneAnimator(this));
            this.serverPosX = this.posX;
            this.serverPosY = this.posY;
            this.serverPosZ = this.posZ;
            this.serverYaw = this.axes.getYaw();
        }
        final float updateSpeed = 0.01f;
        if (!this.worldObj.isRemote && this.ticksExisted % TeamsManager.planeRate == 0) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), this.posX, this.posY, this.posZ, FlansMod.driveableUpdateRange, this.dimension);
            FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneAnimator(this), this.posX, this.posY, this.posZ, FlansMod.driveableUpdateRange, this.dimension);
        }
    }
    
    @Override
    public void setDead() {
        super.setDead();
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                wheel.setDead();
            }
        }
    }
    
    @Override
    public boolean gearDown() {
        return this.varGear;
    }
    
    public boolean attackEntityFrom(final DamageSource damagesource, final float i, final boolean doDamage) {
        final PlaneType type = PlaneType.getPlane(this.driveableType);
        if (this.worldObj.isRemote || this.isDead || damagesource.damageType.equals("arrow") || (!type.vanillaDamage && damagesource.damageType.equals("player") && this.seats[0] != null && this.seats[0].riddenByEntity != null && !type.evilGolem)) {
            return true;
        }
        if (damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (this.seats[0] == null || this.seats[0].riddenByEntity == null) && (!this.locked || this.owner == Factions.getFactionFromPlayer((EntityPlayer)damagesource.getEntity())) && !type.unpunchable) {
            this.driveableData.seatBelt = "null";
            final ItemStack planeStack = new ItemStack(type.item, 1, this.driveableData.paintjobID);
            planeStack.stackTagCompound = new NBTTagCompound();
            this.driveableData.writeToNBT(planeStack.stackTagCompound);
            this.entityDropItem(planeStack, 0.5f);
            this.setDead();
        }
        return super.attackEntityFrom(damagesource, i);
    }
    
    @Override
    public boolean canHitPart(final EnumDriveablePart part) {
        return this.varGear || (part != EnumDriveablePart.coreWheel && part != EnumDriveablePart.leftWingWheel && part != EnumDriveablePart.rightWingWheel && part != EnumDriveablePart.tailWheel);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource damagesource, final float i) {
        return this.attackEntityFrom(damagesource, i, true);
    }
    
    public PlaneType getPlaneType() {
        return PlaneType.getPlane(this.driveableType);
    }
    
    @Override
    protected void dropItemsOnPartDeath(final Vector3f midpoint, final DriveablePart part) {
    }
    
    public Vector3f transformPart(final Vector3f current, final Vector3f target, final Vector3f rate) {
        final Vector3f newPos = current;
        if (Math.sqrt((current.x - target.x) * (current.x - target.x)) > rate.x / 2.0f) {
            if (current.x > target.x) {
                current.x -= rate.x;
            }
            else if (current.x < target.x) {
                current.x += rate.x;
            }
        }
        else {
            current.x = target.x;
        }
        if (Math.sqrt((current.y - target.y) * (current.y - target.y)) > rate.y / 2.0f) {
            if (current.y > target.y) {
                current.y -= rate.y;
            }
            else if (current.y < target.y) {
                current.y += rate.y;
            }
        }
        else {
            current.y = target.y;
        }
        if (Math.sqrt((current.z - target.z) * (current.z - target.z)) > rate.z / 2.0f) {
            if (current.z > target.z) {
                current.z -= rate.z;
            }
            else if (current.z < target.z) {
                current.z += rate.z;
            }
        }
        else {
            current.z = target.z;
        }
        return newPos;
    }
    
    @Override
    public String getBombInventoryName() {
        return "Bombs";
    }
    
    @Override
    public String getMissileInventoryName() {
        return "Missiles";
    }
    
    @Override
    public boolean hasMouseControlMode() {
        return true;
    }
}
