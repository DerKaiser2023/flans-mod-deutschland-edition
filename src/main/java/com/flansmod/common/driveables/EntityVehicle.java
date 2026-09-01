// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.hfr.faction.Factions;
import net.minecraft.util.Vec3;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumChatFormatting;
import java.util.Random;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.block.material.Material;
import com.flansmod.common.teams.TeamsManager;
import java.util.Iterator;
import java.util.List;
import com.flansmod.common.network.PacketVehicleControl;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketCurrentMissile;
import net.minecraft.item.ItemStack;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.tools.ItemTool;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import io.netty.buffer.ByteBuf;
import com.flansmod.common.RotatedAxes;
import com.hfr.faction.IFaction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import com.flansmod.client.model.AnimTrackLink;
import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;
import com.flansmod.api.IExplodeable;

public class EntityVehicle extends EntityDriveable implements IExplodeable
{
    public int shellDelay;
    public int gunDelay;
    public int soundPosition;
    public int idlePosition;
    public float wheelsYaw;
    private int ticksSinceUsed;
    public boolean varDoor;
    public boolean combatRadar;
    public float wheelsAngle;
    public int toggleTimer;
    public boolean pupperino;
    private int testerino;
    public int totalCrewInfo;
    public int exitTimer;
    public Entity target;
    public float aimYaw;
    public float aimPitch;
    public float yaw;
    public float pitch;
    public float roll;
    public float yawSpeed;
    public boolean leftTurnHeld;
    public boolean rightTurnHeld;
    public boolean allWheelsOnGround;
    public boolean tooDeep;
    boolean lockTurretForward;
    public Vector3f doorPos;
    public Vector3f doorRot;
    public Vector3f door2Pos;
    public Vector3f door2Rot;
    public Vector3f prevDoorPos;
    public Vector3f prevDoorRot;
    public Vector3f prevDoor2Pos;
    public Vector3f prevDoor2Rot;
    public int yawDelay;
    public int pitchDelay;
    public boolean turretYawing;
    public boolean turretPitching;
    public boolean deployedSmoke;
    public boolean repairing;
    public AnimTankTrack rightTrack;
    public AnimTankTrack leftTrack;
    public AnimTrackLink[] trackLinksLeft;
    public AnimTrackLink[] trackLinksRight;
    public boolean radarVisible;
    public boolean hasRadar;
    public boolean digitalRadar;
    public float radarRange;
    public int radarPositionOffset;
    public int radarRefreshDelay;
    public int slbmFlightType;
    public int slbmDelay;
    public int slbmRange;
    public int slbmStrength;
    public int slbmWarheadType;
    double jolt;
    int delay;
    double timer;
    int cringe;
    private int deathTimer;
    private float radarDetectionRangeMultiplier;
    private float terrainFactor;
    public boolean alwaysShowTurret;
    
    public EntityVehicle(final World world) {
        super(world);
        this.ticksSinceUsed = 0;
        this.combatRadar = false;
        this.toggleTimer = 0;
        this.pupperino = false;
        this.testerino = 0;
        this.exitTimer = 40;
        this.target = null;
        this.aimYaw = 0.0f;
        this.aimPitch = 0.0f;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.roll = 0.0f;
        this.yawSpeed = 0.0f;
        this.leftTurnHeld = false;
        this.rightTurnHeld = false;
        this.tooDeep = false;
        this.lockTurretForward = false;
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.yawDelay = 0;
        this.pitchDelay = 0;
        this.deployedSmoke = false;
        this.repairing = false;
        this.trackLinksLeft = new AnimTrackLink[0];
        this.trackLinksRight = new AnimTrackLink[0];
        this.digitalRadar = false;
        this.jolt = 0.0;
        this.delay = 0;
        this.timer = 0.0;
        this.cringe = 0;
        this.deathTimer = 0;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.terrainFactor = 1.0f;
        this.alwaysShowTurret = false;
        this.field_70138_W = 1.5f;
    }
    
    public EntityVehicle(final World world, final double x, final double y, final double z, final VehicleType type, final DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.combatRadar = false;
        this.toggleTimer = 0;
        this.pupperino = false;
        this.testerino = 0;
        this.exitTimer = 40;
        this.target = null;
        this.aimYaw = 0.0f;
        this.aimPitch = 0.0f;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.roll = 0.0f;
        this.yawSpeed = 0.0f;
        this.leftTurnHeld = false;
        this.rightTurnHeld = false;
        this.tooDeep = false;
        this.lockTurretForward = false;
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.yawDelay = 0;
        this.pitchDelay = 0;
        this.deployedSmoke = false;
        this.repairing = false;
        this.trackLinksLeft = new AnimTrackLink[0];
        this.trackLinksRight = new AnimTrackLink[0];
        this.digitalRadar = false;
        this.jolt = 0.0;
        this.delay = 0;
        this.timer = 0.0;
        this.cringe = 0;
        this.deathTimer = 0;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.terrainFactor = 1.0f;
        this.alwaysShowTurret = false;
        this.field_70138_W = type.wheelStepHeight;
        this.func_70107_b(x, y, z);
        this.initType(type, false);
    }
    
    public EntityVehicle(final World world, final double x, final double y, final double z, final float yaw, final VehicleType type, final DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.combatRadar = false;
        this.toggleTimer = 0;
        this.pupperino = false;
        this.testerino = 0;
        this.exitTimer = 40;
        this.target = null;
        this.aimYaw = 0.0f;
        this.aimPitch = 0.0f;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.roll = 0.0f;
        this.yawSpeed = 0.0f;
        this.leftTurnHeld = false;
        this.rightTurnHeld = false;
        this.tooDeep = false;
        this.lockTurretForward = false;
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.yawDelay = 0;
        this.pitchDelay = 0;
        this.deployedSmoke = false;
        this.repairing = false;
        this.trackLinksLeft = new AnimTrackLink[0];
        this.trackLinksRight = new AnimTrackLink[0];
        this.digitalRadar = false;
        this.jolt = 0.0;
        this.delay = 0;
        this.timer = 0.0;
        this.cringe = 0;
        this.deathTimer = 0;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.terrainFactor = 1.0f;
        this.alwaysShowTurret = false;
        this.field_70138_W = type.wheelStepHeight;
        this.func_70107_b(x, y, z);
        this.rotateYaw(yaw);
        this.initType(type, false);
    }
    
    public EntityVehicle(final World world, final double x, final double y, final double z, final EntityPlayer placer, final VehicleType type, final DriveableData data) {
        super(world, type, data);
        this.ticksSinceUsed = 0;
        this.combatRadar = false;
        this.toggleTimer = 0;
        this.pupperino = false;
        this.testerino = 0;
        this.exitTimer = 40;
        this.target = null;
        this.aimYaw = 0.0f;
        this.aimPitch = 0.0f;
        this.yaw = 0.0f;
        this.pitch = 0.0f;
        this.roll = 0.0f;
        this.yawSpeed = 0.0f;
        this.leftTurnHeld = false;
        this.rightTurnHeld = false;
        this.tooDeep = false;
        this.lockTurretForward = false;
        this.doorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.door2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorPos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoorRot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Pos = new Vector3f(0.0f, 0.0f, 0.0f);
        this.prevDoor2Rot = new Vector3f(0.0f, 0.0f, 0.0f);
        this.yawDelay = 0;
        this.pitchDelay = 0;
        this.deployedSmoke = false;
        this.repairing = false;
        this.trackLinksLeft = new AnimTrackLink[0];
        this.trackLinksRight = new AnimTrackLink[0];
        this.digitalRadar = false;
        this.jolt = 0.0;
        this.delay = 0;
        this.timer = 0.0;
        this.cringe = 0;
        this.deathTimer = 0;
        this.radarDetectionRangeMultiplier = 1.0f;
        this.terrainFactor = 1.0f;
        this.alwaysShowTurret = false;
        this.field_70138_W = type.wheelStepHeight;
        this.func_70107_b(x, y, z);
        if (placer != null) {
            this.rotateYaw(placer.field_70177_z + 90.0f);
        }
        this.initType(type, false);
        this.setupTracks(type);
    }
    
    public EntityVehicle setOwner(final IFaction to) {
        this.owner = to;
        return this;
    }
    
    public void setupTracks(final DriveableType type) {
        this.rightTrack = new AnimTankTrack(type.rightTrackPoints, type.trackLinkLength);
        this.leftTrack = new AnimTankTrack(type.leftTrackPoints, type.trackLinkLength);
        final int numLinks = Math.round(this.rightTrack.getTrackLength() / type.trackLinkLength);
        this.trackLinksLeft = new AnimTrackLink[numLinks];
        this.trackLinksRight = new AnimTrackLink[numLinks];
        for (int i = 0; i < numLinks; ++i) {
            final float progress = 0.01f + type.trackLinkLength * i;
            final int trackPart = this.leftTrack.getTrackPart(progress);
            this.trackLinksLeft[i] = new AnimTrackLink(progress);
            this.trackLinksRight[i] = new AnimTrackLink(progress);
            this.trackLinksLeft[i].position = this.leftTrack.getPositionOnTrack(progress);
            this.trackLinksRight[i].position = this.rightTrack.getPositionOnTrack(progress);
            this.trackLinksLeft[i].rot = new RotatedAxes(0.0f, 0.0f, this.rotateTowards(this.leftTrack.points.get((trackPart == 0) ? (this.leftTrack.points.size() - 1) : (trackPart - 1)), this.trackLinksLeft[i].position));
            this.trackLinksRight[i].rot = new RotatedAxes(0.0f, 0.0f, this.rotateTowards(this.rightTrack.points.get((trackPart == 0) ? (this.rightTrack.points.size() - 1) : (trackPart - 1)), this.trackLinksRight[i].position));
            this.trackLinksLeft[i].zRot = this.rotateTowards(this.leftTrack.points.get((trackPart == 0) ? (this.leftTrack.points.size() - 1) : (trackPart - 1)), this.trackLinksLeft[i].position);
            this.trackLinksRight[i].zRot = this.rotateTowards(this.rightTrack.points.get((trackPart == 0) ? (this.rightTrack.points.size() - 1) : (trackPart - 1)), this.trackLinksRight[i].position);
        }
    }
    
    @Override
    protected void initType(final DriveableType type, final boolean clientSide) {
        this.radarVisible = type.radarVisible;
        this.hasRadar = type.hasRadar;
        this.radarRange = type.radarRange;
        this.radarPositionOffset = type.radarPositionOffset;
        this.radarRefreshDelay = type.radarRefreshDelay;
        this.slbmFlightType = type.slbmFlightType;
        this.slbmDelay = type.slbmDelay;
        this.slbmRange = type.slbmRange;
        this.slbmStrength = type.slbmStrength;
        this.slbmWarheadType = type.slbmWarheadType;
        this.digitalRadar = type.digitalRadar;
        this.radarDetectionRangeMultiplier = type.radarDetectionRangeMultiplier;
        super.initType(type, clientSide);
        this.setupTracks(type);
        this.field_70138_W = type.wheelStepHeight;
        this.alwaysShowTurret = type.alwaysShowTurret;
    }
    
    @Override
    public void readSpawnData(final ByteBuf data) {
        super.readSpawnData(data);
    }
    
    @Override
    protected void func_70014_b(final NBTTagCompound tag) {
        super.func_70014_b(tag);
        tag.func_74757_a("VarDoor", this.varDoor);
    }
    
    @Override
    protected void func_70037_a(final NBTTagCompound tag) {
        super.func_70037_a(tag);
        this.varDoor = tag.func_74767_n("VarDoor");
    }
    
    public int func_70070_b(final float par1) {
        if (Minecraft.func_71410_x().field_71460_t.func_147702_a()) {
            return 15728880;
        }
        final int i = MathHelper.func_76128_c(this.field_70165_t);
        final int j = MathHelper.func_76128_c(this.field_70161_v);
        if (this.field_70170_p.func_72899_e(i, 0, j)) {
            final double d0 = (this.field_70121_D.field_72337_e - this.field_70121_D.field_72338_b) * 0.66;
            final int k = MathHelper.func_76128_c(this.field_70163_u - this.field_70129_M + d0);
            return this.field_70170_p.func_72802_i(i, k, j, 0);
        }
        return 0;
    }
    
    @Override
    public void onMouseMoved(final int deltaX, final int deltaY) {
    }
    
    @Override
    public void setPositionRotationAndMotion(final double x, final double y, final double z, final float yaw, final float pitch, final float roll, final double motX, final double motY, final double motZ, final float velYaw, final float velPitch, final float velRoll, final float throt, final float steeringYaw, final float throtPP) {
        super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw, throtPP);
        this.wheelsYaw = steeringYaw;
    }
    
    public boolean func_130002_c(final EntityPlayer entityplayer) {
        if (this.field_70128_L) {
            return false;
        }
        if (this.field_70170_p.field_72995_K) {
            return false;
        }
        final ItemStack currentItem = entityplayer.func_71045_bC();
        if (currentItem != null && currentItem.func_77973_b() instanceof ItemTool && ((ItemTool)currentItem.func_77973_b()).type.healDriveables) {
            return true;
        }
        if (currentItem != null && currentItem.func_77973_b() instanceof ItemGun && ((ItemGun)currentItem.func_77973_b()).type.shootMelee) {
            return true;
        }
        final VehicleType type = this.getVehicleType();
        if (type.numPassengers > 0 && this.seats[1].field_70153_n != null && this.seats[0].field_70153_n == null) {
            return true;
        }
        for (int i = 0; i <= type.numPassengers; ++i) {
            if (this.seats[i].func_130002_c(entityplayer)) {
                if (i == 0) {
                    this.shellDelay = type.vehicleShellDelay;
                    FlansMod.proxy.doTutorialStuff(entityplayer, this);
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean pressKey(final int key, final EntityPlayer player) {
        final VehicleType type = this.getVehicleType();
        if (key == 36 && System.currentTimeMillis() - this.lastshellswitchedat > 500L && this.seats != null && this.seats[0] != null) {
            this.lastshellswitchedat = System.currentTimeMillis();
            FlansMod.getPacketHandler().sendToServer(new PacketCurrentMissile(this.func_145782_y(), this.driveableData.func_70301_a(1)));
        }
        float engineHealth = this.getDriveableData().parts.get(EnumDriveablePart.engine).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth * 1.0f;
        if (this.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth == 0) {
            engineHealth = 1.0f;
        }
        float steeringHealth = this.getDriveableData().parts.get(EnumDriveablePart.steering).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth * 1.0f;
        if (this.getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth == 0) {
            steeringHealth = 1.0f;
        }
        float buoyancy = this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 1.0f;
        if (this.getDriveableData().parts.get(EnumDriveablePart.steering).maxHealth == 0) {
            buoyancy = 1.0f;
        }
        if (this.field_70170_p.field_72995_K && (key == 6 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        }
        switch (key) {
            case 0: {
                if (((type.epicShip || type.canDive || type.airship) && this.throttle <= 1.0f) || (!type.floatOnWater && this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttle <= 0.1)) {
                    this.throttle += type.accelModifier * 0.01f;
                }
                else if (!type.marioKart && ((!type.floatOnWater && !this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttle < 1.0f && !type.epicShip) || (type.floatOnWater && this.throttle < 1.0f && !type.epicShip))) {
                    this.throttle += type.accelModifier * 0.1f;
                }
                else if (type.marioKart && ((!type.floatOnWater && !this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttlePeepee < 1.5 && !type.epicShip) || (type.floatOnWater && this.throttlePeepee < 1.5 && !type.epicShip))) {
                    this.throttlePeepee += 0.5f;
                }
                else if (type.floatOnWater || type.epicShip) {
                    this.throttle += type.accelModifier * 0.01f;
                }
                if (this.throttle > 1.0f * engineHealth) {
                    this.throttle = 1.0f * engineHealth;
                }
                if (this.throttle > 1.0f * steeringHealth) {
                    this.throttle = 1.0f * steeringHealth;
                }
                if (this.throttle > 1.0f * buoyancy) {
                    this.throttle = 1.0f * buoyancy;
                }
                return true;
            }
            case 1: {
                if (type.epicShip || type.canDive || type.airship) {
                    this.throttle -= 2.0f * (type.decelModifier * 0.01f);
                }
                else if (!type.marioKart && !type.floatOnWater && !this.field_70170_p.func_72953_d(this.field_70121_D)) {
                    this.throttle -= type.decelModifier * 0.1f;
                }
                else if (type.marioKart && ((!type.floatOnWater && !this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttlePeepee > -1.5 && !type.epicShip) || (type.floatOnWater && this.throttlePeepee > -1.5 && !type.epicShip))) {
                    this.throttlePeepee -= 0.5f;
                }
                else {
                    this.throttle -= type.decelModifier * 0.005f;
                }
                if (this.throttle < -1.0f * engineHealth) {
                    this.throttle = -1.0f * engineHealth;
                }
                if (this.throttle < -1.0f * steeringHealth) {
                    this.throttle = -1.0f * steeringHealth;
                }
                if (this.throttle < -1.0f * buoyancy) {
                    this.throttle = -1.0f * buoyancy;
                }
                if (this.throttle < 0.0f && type.maxNegativeThrottle == 0.0f) {
                    this.throttle = 0.0f;
                }
                return true;
            }
            case 2: {
                this.wheelsYaw -= 1.0f * steeringHealth;
                return this.leftTurnHeld = true;
            }
            case 3: {
                this.wheelsYaw += 1.0f * steeringHealth;
                return this.rightTurnHeld = true;
            }
            case 4: {
                if ((this.getVehicleType().canDive && this.oxygenMeter > 0.1f) || this.getVehicleType().airship) {
                    this.divingFactor *= 0.7f / (type.brakeModifier + 0.01f);
                }
                if (this.getVehicleType().canDive && this.oxygenMeter < 0.1f) {
                    this.divingFactor += 0.01f;
                    if (this.divingFactor > 1.0f) {
                        this.divingFactor = 1.0f;
                    }
                }
                this.throttle *= 0.91f / (type.brakeModifier + 0.01f);
                if (type.epicShip) {
                    this.throttle *= 0.93f / (type.brakeModifier + 0.01f);
                }
                if (this.throttle > type.boostLimit) {
                    this.throttle = 0.0f;
                }
                return true;
            }
            case 5: {
                if (this.driveableData.scopeTimer <= 0 && type.hasScope) {
                    this.aiming = !this.aiming;
                    this.driveableData.scopeTimer = 10;
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 10.0, this.field_71093_bK, "tankSight", false);
                }
                return true;
            }
            case 6: {
                if (!this.aiming) {
                    --this.exitTimer;
                    --this.exitTimer;
                    return true;
                }
            }
            case 7: {
                if (this.field_70170_p.field_72995_K) {
                    FlansMod.proxy.openDriveableMenu((EntityPlayer)this.seats[0].field_70153_n, this.field_70170_p, this);
                }
                return true;
            }
            case 8: {
                this.func_70078_a((Entity)null);
                return true;
            }
            case 19: {
                if (PlayerHandler.getPlayerData(player) != null && this.nintendoSwitchLite <= 0 && type.numPassengers > 0 && this.seats[1].field_70153_n == null) {
                    this.nintendoSwitchLite = 10;
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 21: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 1 && this.seats[1].field_70153_n == null && this.seats[2].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 22: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 2 && this.seats[1].field_70153_n == null && this.seats[3].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 23: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 3 && this.seats[1].field_70153_n == null && this.seats[4].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 24: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 4 && this.seats[1].field_70153_n == null && this.seats[5].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 25: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 5 && this.seats[1].field_70153_n == null && this.seats[6].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 26: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 6 && this.seats[1].field_70153_n == null && this.seats[7].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 27: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 7 && this.seats[1].field_70153_n == null && this.seats[8].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 28: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 8 && this.seats[1].field_70153_n == null && this.seats[9].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 29: {
                if (PlayerHandler.getPlayerData(player) != null && type.numPassengers > 9 && this.seats[1].field_70153_n == null && this.seats[10].field_70153_n == null) {
                    player.func_70078_a((Entity)this.seats[1]);
                }
                return true;
            }
            case 30: {
                return true;
            }
            case 32: {
                if (this.driveableData.thermalTimer <= 0 && type.thermalSight) {
                    this.thermalScoping = !this.thermalScoping;
                    this.driveableData.thermalTimer = 10;
                }
                return true;
            }
            case 33: {
                if (this.driveableData.thermalTimer <= 0 && type.hasMagicArtilleryMode) {
                    this.artilleryMode = !this.artilleryMode;
                    this.driveableData.thermalTimer = 10;
                }
                return true;
            }
            case 35: {
                if (this.toggleTimer <= 0 && type.hasRadar) {
                    this.activeRadar = !this.activeRadar;
                    this.toggleTimer = 10;
                    player.func_145747_a((IChatComponent)new ChatComponentText("Radar Mode : " + (this.activeRadar ? "active" : "passive")));
                }
                return true;
            }
            case 9: {
                final double checkCarrierRange = 20.0;
                final List carrier = this.field_70170_p.func_72872_a((Class)EntitySeat.class, AxisAlignedBB.func_72330_a(this.field_70165_t - checkCarrierRange, this.field_70163_u - checkCarrierRange, this.field_70161_v - checkCarrierRange, this.field_70165_t + checkCarrierRange, this.field_70163_u + checkCarrierRange, this.field_70161_v + checkCarrierRange));
                if (type.canDabOnEntity) {
                    if (this.field_70153_n != null && this.field_70153_n instanceof EntityVehicle && !(this.field_70153_n instanceof EntityPlayer)) {
                        this.field_70153_n.func_70078_a((Entity)null);
                        return true;
                    }
                    for (final Object obj : carrier) {
                        final EntitySeat carrierSpot = (EntitySeat)obj;
                        if (carrierSpot.field_70153_n == null && carrierSpot.seatInfo.parkingSpot) {
                            this.func_70078_a((Entity)carrierSpot);
                        }
                    }
                }
                return true;
            }
            case 10: {
                if (!type.canDive || !type.airship) {
                    FlansMod.proxy.changeControlMode((EntityPlayer)this.seats[0].field_70153_n);
                    this.seats[0].targetYaw = this.seats[0].looking.getYaw();
                    this.seats[0].targetPitch = this.seats[0].looking.getPitch();
                }
                if (this.getVehicleType().canDive || this.getVehicleType().airship) {
                    this.divingFactor += 0.02f;
                }
                if (this.divingFactor > 1.0f) {
                    this.divingFactor = 1.0f;
                }
                return true;
            }
            case 11: {
                return true;
            }
            case 12: {
                return true;
            }
            case 13: {
                if ((type.walterGunRange || type.walterMortar || type.gunRange) && this.seats[0].targetPitch < -this.seats[0].seatInfo.minPitch) {
                    final EntitySeat entitySeat = this.seats[0];
                    entitySeat.targetPitch += 0.1f;
                }
                return true;
            }
            case 14: {
                if (this.toggleTimer <= 0) {
                    this.varDoor = !this.varDoor;
                    if (type.hasDoor) {
                        player.func_145747_a((IChatComponent)new ChatComponentText("Doors " + (this.varDoor ? "open" : "closed")));
                    }
                    this.toggleTimer = 10;
                    FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
                }
                if (this.toggleTimer <= 0) {
                    this.combatRadar = !this.combatRadar;
                    if (type.hasRadar) {
                        player.func_145747_a((IChatComponent)new ChatComponentText("Radar set to " + (this.combatRadar ? "combat range" : "long range")));
                    }
                    this.toggleTimer = 10;
                }
                return true;
            }
            case 15: {
                if ((type.walterGunRange || type.walterMortar || type.gunRange) && this.seats[0].targetPitch > -this.seats[0].seatInfo.maxPitch) {
                    final EntitySeat entitySeat2 = this.seats[0];
                    entitySeat2.targetPitch -= 0.1f;
                }
                if ((this.getVehicleType().canDive && this.oxygenMeter > 0.1f) || this.getVehicleType().airship) {
                    this.divingFactor -= 0.02f;
                }
                if (this.divingFactor < -1.0f) {
                    this.divingFactor = -1.0f;
                }
                if (this.getVehicleType().canDive && this.oxygenMeter < 0.1f) {
                    this.divingFactor += 0.02f;
                    if (this.divingFactor > 1.0f) {
                        this.divingFactor = 1.0f;
                    }
                }
                return true;
            }
            case 16: {}
            case 18: {
                if (type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0 && !type.autoSmoke) {
                    this.ticksFlareUsing = type.timeFlareUsing * 20;
                    this.flareDelay = type.flareDelay;
                    if (!type.epicShip) {
                        this.dischargeSmoke();
                    }
                    if (this.field_70170_p.field_72995_K) {
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                    }
                    else {
                        this.dischargeSmoke();
                        if (!type.flareSound.isEmpty()) {
                            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.flareSound, false);
                        }
                    }
                    return true;
                }
                break;
            }
            case 34: {
                if (type.canRepair && this.ticksRepairing <= 0 && this.throttle <= 0.05 && !type.epicShip) {
                    this.ticksRepairing = type.ticksRepairing;
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 10.0, this.field_71093_bK, "Repair", false);
                    if (this.field_70170_p.field_72995_K) {
                        FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                    }
                    else if (!type.flareSound.isEmpty()) {
                        PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, type.flareSound, false);
                    }
                    return true;
                }
                break;
            }
            case 37: {
                ++this.pitchSignal;
                break;
            }
            case 38: {
                --this.pitchSignal;
                break;
            }
            case 39: {
                ++this.yawSignal;
                break;
            }
            case 40: {
                --this.yawSignal;
                break;
            }
        }
        return false;
    }
    
    @Override
    public Vector3f getLookVector(final ShootPoint dp) {
        return this.rotate(this.seats[0].looking.getXAxis());
    }
    
    @Override
    public void func_70071_h_() {
        final double bkPrevPosY = this.field_70167_r;
        super.func_70071_h_();
        this.animateFancyTracks();
        if (this.field_70170_p.field_72995_K) {
            for (final Entity e : this.findEntitiesWithinbounds()) {
                if (e != this) {
                    this.moveRiders(e);
                }
            }
        }
        if (this.testerino > 5 && this.seats[0] != null && this.field_70170_p.field_72995_K) {
            this.seats[0].field_70153_n = null;
        }
        if (Math.abs(this.pitchSignal) > 0.0f) {
            this.pitchSignal *= 0.8f;
        }
        if (Math.abs(this.pitchSignal) > 0.0f && Math.abs(this.pitchSignal) < 0.5f) {
            this.pitchSignal = 0.0f;
        }
        if (this.pitchSignal > 9.0f) {
            this.pitchSignal = 9.0f;
        }
        if (this.pitchSignal < -9.0f) {
            this.pitchSignal = -9.0f;
        }
        if (Math.abs(this.yawSignal) > 0.0f) {
            this.yawSignal *= 0.8f;
        }
        if (Math.abs(this.yawSignal) > 0.0f && Math.abs(this.yawSignal) < 0.5f) {
            this.yawSignal = 0.0f;
        }
        if (this.yawSignal > 9.0f) {
            this.yawSignal = 9.0f;
        }
        if (this.yawSignal < -9.0f) {
            this.yawSignal = -9.0f;
        }
        if (this.field_70173_aa == 5) {
            this.driveableData.seatBelt = "null";
        }
        if (this.field_70173_aa == 19 && (this.getDriveableData().seatBelt == null || this.getDriveableData().seatBelt.length() == 0)) {
            this.getDriveableData().seatBelt = "null";
        }
        if (this.field_70173_aa > 20) {
            if (this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer) {
                final EntityPlayer Master = (EntityPlayer)this.seats[0].field_70153_n;
                this.getDriveableData().seatBelt = Master.getDisplayName();
                this.getDriveableData().emergencyMode = false;
            }
            if (this.getDriveableData().seatBelt != null && !this.getDriveableData().seatBelt.equals("null") && this.getDriveableData().seatBelt.length() != 0 && this.field_70170_p.func_72924_a(this.getDriveableData().seatBelt) == null && !this.getDriveableData().emergencyMode) {
                this.getDriveableData().emergencyMode = true;
                this.rebirthVehicle();
            }
        }
        final boolean isDivisibleBy10 = this.field_70173_aa % 5 == 0;
        if (this.getDriveableData().emergencyMode && isDivisibleBy10) {
            final List<Entity> foxes = this.field_70170_p.func_72839_b((Entity)this, AxisAlignedBB.func_72330_a(this.field_70165_t - 200.0, this.field_70163_u - 500.0, this.field_70161_v - 200.0, this.field_70165_t + 200.0, this.field_70163_u + 500.0, this.field_70161_v + 200.0));
            for (final Entity stuff : foxes) {
                if (!(stuff instanceof EntityPlayer)) {
                    continue;
                }
                final EntityPlayer human = (EntityPlayer)stuff;
                if (this.field_70170_p.func_72924_a(this.getDriveableData().seatBelt) != human) {
                    continue;
                }
                human.func_70078_a((Entity)this.seats[0]);
            }
        }
        final VehicleType type = this.getVehicleType();
        final DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Vehicle type null. Not ticking vehicle");
            return;
        }
        if (this.throttle > 0.7 && this.getDriveableType().needsThrottle && this.leftMouseHeld && this.ramDelay <= 0) {
            this.ramDelay = 20;
        }
        if (!type.marioKart) {
            if (this.throttle > 0.0f && !type.epicShip && !type.canDive && !type.airship) {
                this.throttle -= type.accelModifier * 0.05f;
            }
            if (this.throttle < 0.0f && !type.epicShip && !type.canDive && !type.airship) {
                this.throttle += type.decelModifier * 0.05f;
            }
            if (Math.abs(this.throttle) < 0.2 && Math.abs(this.throttle) > 0.0f && !type.epicShip && !type.canDive && !type.airship) {
                this.throttle *= (float)0.8;
            }
        }
        if (type.evilGolem) {
            if (this.target != null && (this.target.field_70128_L || (this.target instanceof EntityVehicle && ((EntityVehicle)this.target).deathTimer > 30))) {
                this.target = null;
            }
            if ((this.target == null || this.humanTarget == null) && this.field_70173_aa % 10.0f == 0.0f && !this.field_70170_p.field_72995_K) {
                this.target = this.getValidTarget();
                this.humanTarget = this.getValidHumanTarget();
            }
            if (this.target != null && this.humanTarget != null) {
                final double dX = this.target.field_70165_t - this.field_70165_t;
                final double dY = this.target.field_70163_u - (this.field_70163_u + 1.5);
                final double dZ = this.target.field_70161_v - this.field_70161_v;
                final double distanceToTarget = Math.sqrt(dX * dX + dY * dY + dZ * dZ);
                final double dY2 = this.target.field_70163_u - (this.field_70163_u + 2.0 - (8 + type.evilGravity) * distanceToTarget / 230.0);
                if (distanceToTarget > type.evilRange) {
                    this.target = null;
                    this.humanTarget = null;
                }
                this.aimYaw = 360.0f + (float)Math.atan2(dZ, dX) * 180.0f / 3.14159f - this.axes.getYaw();
                this.aimPitch = -(float)Math.atan2(dY2, Math.sqrt(dX * dX + dZ * dZ)) * 180.0f / 3.14159f;
                if (this.seats != null && this.tertiaryTimer < 4) {
                    this.tertiaryTimer += 2;
                }
            }
        }
        if (!type.epicShip && !type.canDive && !type.airship) {
            if (this.throttlePeepee >= 0.05) {
                if (this.throttle < 0.2) {
                    this.throttle += (float)(this.throttlePeepee * 0.15);
                }
                else if (this.throttle >= 0.2 && this.throttle < 0.4) {
                    this.throttle += (float)(this.throttlePeepee * 0.05);
                }
                else if (this.throttle >= 0.4 && this.throttle < 0.6) {
                    this.throttle += (float)(this.throttlePeepee * 0.015);
                }
                else if (this.throttle >= 0.6 && this.throttle < 0.85) {
                    this.throttle += (float)(this.throttlePeepee * 0.005);
                }
                else if (this.throttle >= 0.85 && this.throttle < 1.0f) {
                    this.throttle += (float)(this.throttlePeepee * 0.001);
                }
            }
            else if (this.throttlePeepee < 0.05 && this.throttlePeepee > -0.05) {
                this.throttle *= 0.75f;
            }
            else if (this.throttlePeepee <= -0.05) {
                if (this.throttle > -0.2) {
                    this.throttle += (float)(this.throttlePeepee * 0.1);
                }
                else if (this.throttle <= -0.2 && this.throttle > -0.4) {
                    this.throttle += (float)(this.throttlePeepee * 0.05);
                }
                else if (this.throttle <= -0.4 && this.throttle > -0.6) {
                    this.throttle += (float)(this.throttlePeepee * 0.02);
                }
                else if (this.throttle <= -0.6 && this.throttle > -0.85) {
                    this.throttle += (float)(this.throttlePeepee * 0.0025);
                }
                else if (this.throttle <= -0.85 && this.throttle > -1.0f) {
                    this.throttle += (float)(this.throttlePeepee * 5.0E-4);
                }
            }
        }
        this.throttlePeepee *= 0.55f;
        if (this.nintendoSwitchLite > 0) {
            --this.nintendoSwitchLite;
            --this.nintendoSwitchLite;
        }
        final boolean thePlayerIsDrivingThis = this.field_70170_p.field_72995_K && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.seats[0].field_70153_n);
        ++this.ticksSinceUsed;
        if (!this.field_70170_p.field_72995_K && this.seats[0].field_70153_n != null) {
            this.ticksSinceUsed = 0;
        }
        if (!this.field_70170_p.field_72995_K && TeamsManager.vehicleLife > 0 && this.ticksSinceUsed > TeamsManager.vehicleLife * 20) {
            this.func_70106_y();
        }
        if (this.field_70170_p.field_72995_K && (this.varFlare || this.ticksFlareUsing > type.timeFlareUsing * 20 - 5) && this.field_70173_aa % 5 == 0) {
            if (!type.epicShip) {
                this.deployedSmoke = true;
            }
            if (type.epicShip) {
                this.repairing = true;
            }
        }
        if (this.field_70170_p.field_72995_K && this.ticksRepairing > type.ticksRepairing - 5 && this.field_70173_aa % 5 == 0) {
            this.repairing = true;
        }
        if (type.setPlayerInvisible && !this.field_70170_p.field_72995_K && this.seats[0].field_70153_n != null) {
            this.seats[0].field_70153_n.func_82142_c(true);
        }
        if (this.ticksFlareUsing <= 0 || this.ticksRepairing <= 0) {
            this.deployedSmoke = false;
            this.repairing = false;
        }
        if (this.cringe < 5) {
            ++this.cringe;
        }
        if (this.cringe == 5) {
            this.cringe = 0;
        }
        final Material mat = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 1, (int)this.field_70161_v).func_149688_o();
        if (!type.epicShip) {
            if (mat == Material.field_151578_c || mat == Material.field_151577_b || mat == Material.field_151595_p || mat == Material.field_151597_y || mat == Material.field_151596_z || mat == Material.field_151584_j || mat == Material.field_151579_a) {
                this.terrainFactor = type.terrainPenalty;
            }
            else {
                this.terrainFactor = 1.0f;
            }
        }
        if (this.exitTimer < type.exitTimer) {
            ++this.exitTimer;
        }
        if (this.exitTimer > type.exitTimer) {
            this.exitTimer = type.exitTimer;
        }
        if (this.exitTimer < 0) {
            if (this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null) {
                this.seats[0].field_70153_n.func_70078_a((Entity)null);
            }
            this.exitTimer = type.exitTimer;
        }
        if (type.raceCar) {
            this.throttle *= (float)0.9;
        }
        final float floatiness = this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 1.0f;
        final DriveablePart bow = this.getDriveableData().parts.get(EnumDriveablePart.bow);
        final DriveablePart stern = this.getDriveableData().parts.get(EnumDriveablePart.stern);
        final DriveablePart leftShip = this.getDriveableData().parts.get(EnumDriveablePart.left);
        final DriveablePart right = this.getDriveableData().parts.get(EnumDriveablePart.right);
        final DriveablePart midsection = this.getDriveableData().parts.get(EnumDriveablePart.midsection);
        if (floatiness < 0.1 && TeamsManager.seaLevel - this.field_70163_u > 1.0) {
            this.throttle = 0.0f;
        }
        if ((floatiness < 0.1 && TeamsManager.seaLevel - this.field_70163_u > 14.0) || (TeamsManager.seaLevel - this.field_70163_u > 14.0 && bow.health <= 0 && bow.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 14.0 && stern.health <= 0 && stern.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 14.0 && leftShip.health <= 0 && leftShip.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 14.0 && right.health <= 0 && right.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 14.0 && midsection.health <= 0 && midsection.maxHealth > 0)) {
            this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u + 2.0, this.field_70161_v, 1.0f, false);
        }
        if ((floatiness < 0.1 && TeamsManager.seaLevel - this.field_70163_u > 15.0) || (TeamsManager.seaLevel - this.field_70163_u > 15.0 && bow.health <= 0 && bow.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 15.0 && stern.health <= 0 && stern.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 15.0 && leftShip.health <= 0 && leftShip.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 15.0 && right.health <= 0 && right.maxHealth > 0) || (TeamsManager.seaLevel - this.field_70163_u > 15.0 && midsection.health <= 0 && midsection.maxHealth > 0)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "shippuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
            if (type.nuclearDeath) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "nuclear"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 400.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "YamatoGun", false);
            }
            if (type.bigDeath) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "shippuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "BattleshipGun", false);
            }
            if (type.Death) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "tankkuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "explcls6", false);
            }
            this.func_70106_y();
        }
        if ((bow.health <= 0 && bow.maxHealth > 0) || (stern.health <= 0 && stern.maxHealth > 0) || (leftShip.health <= 0 && leftShip.maxHealth > 0) || (right.health <= 0 && right.maxHealth > 0) || (midsection.health <= 0 && midsection.maxHealth > 0)) {
            ++this.deathTimer;
        }
        else if (this.deathTimer > 0) {
            --this.deathTimer;
        }
        if ((this.deathTimer > 1800 && bow.health <= 0 && bow.maxHealth > 0) || (this.deathTimer > 1200 && stern.health <= 0 && stern.maxHealth > 0) || (this.deathTimer > 1200 && leftShip.health <= 0 && leftShip.maxHealth > 0) || (this.deathTimer > 1200 && right.health <= 0 && right.maxHealth > 0) || (this.deathTimer > 1200 && midsection.health <= 0 && midsection.maxHealth > 0)) {
            if (type.nuclearDeath) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "nuclear"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 400.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "YamatoGun", false);
            }
            if (type.bigDeath) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "shippuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "BattleshipGun", false);
            }
            if (type.Death) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "tankkuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 200.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 250.0, this.field_71093_bK, "explcls6", false);
            }
            this.func_70106_y();
        }
        this.totalCrewInfo = this.getDriveableData().totalCrew;
        if (((this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak).health <= 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0) || (this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turretWeak2).health <= 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health > 0)) && this.cringe == 4) {
            this.getDriveableData().parts.get(EnumDriveablePart.turret).health -= this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth / (int)(4.0f * type.WeakspotCookTime);
            this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u + 3.0, this.field_70161_v, 0.1f, false);
            for (int smoke = 0; smoke < 10; ++smoke) {
                final float smokeRand = (float)Math.random();
                if (smokeRand < 0.25) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.25 && smokeRand < 0.5) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand, -(float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.5 && smokeRand < 0.75) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, -(float)Math.random() * smokeRand, (float)Math.random() * smokeRand, -(float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.75) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, -(float)Math.random() * smokeRand, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
            }
        }
        if (((this.getDriveableData().parts.get(EnumDriveablePart.weakSpot).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.weakSpot).health <= 0) || (this.getDriveableData().parts.get(EnumDriveablePart.weakSpot2).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.weakSpot2).health <= 0) || (this.getDriveableData().parts.get(EnumDriveablePart.weakSpot3).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.weakSpot3).health <= 0) || (this.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0 && this.getDriveableData().parts.get(EnumDriveablePart.turret).health <= 0 && !type.epicShip && type.needsTurret)) && this.cringe == 4) {
            this.getDriveableData().parts.get(EnumDriveablePart.core).health -= this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth / (int)(4.0f * type.WeakspotCookTime);
            this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u + 2.0, this.field_70161_v, 0.1f, false);
            for (int smoke = 0; smoke < 10; ++smoke) {
                final float smokeRand = (float)Math.random();
                if (smokeRand < 0.25) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 1.0, this.field_70161_v, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.25 && smokeRand < 0.5) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 1.0, this.field_70161_v, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand, -(float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.5 && smokeRand < 0.75) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 1.0, this.field_70161_v, -(float)Math.random() * smokeRand, (float)Math.random() * smokeRand, -(float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
                else if (smokeRand > 0.75) {
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.flare", this.field_70165_t, this.field_70163_u + 1.0, this.field_70161_v, -(float)Math.random() * smokeRand, (float)Math.random() * smokeRand, (float)Math.random() * smokeRand), this.field_70165_t, this.field_70163_u + 4.0, this.field_70161_v, 150.0f, this.field_70170_p.field_73011_w.field_76574_g);
                }
            }
        }
        if (this.ticksFlareUsing > 0) {
            --this.ticksFlareUsing;
        }
        if (this.ticksRepairing > 0) {
            --this.ticksRepairing;
        }
        if (this.repairDelay > 0) {
            --this.repairDelay;
        }
        if (this.flareDelay > 0) {
            --this.flareDelay;
        }
        if (this.ramDelay > 0) {
            if (this.getDriveableType().needsThrottle || type.bigRecoil) {
                this.throttle = this.ramDelay * (float)this.ramDelay * this.ramDelay * -1.25E-4f - 0.1f;
            }
            --this.ramDelay;
        }
        if (this.nintendoSwitchLite < 10) {
            ++this.nintendoSwitchLite;
        }
        if (this.APSdelay > 0) {
            --this.APSdelay;
        }
        if (this.APSdelay == type.APSdelayMax - 5) {
            this.dischargeAPS();
        }
        if ((this.getVehicleType().canDive && this.oxygenMeter > 0.1f && this.divingFactor >= -1.0f && this.divingFactor < 0.0f) || (this.getVehicleType().airship && this.divingFactor > -1.0f && this.divingFactor < 0.0f)) {
            this.divingFactor += 0.01f;
        }
        if ((this.getVehicleType().canDive && this.oxygenMeter > 0.1f && this.divingFactor <= 1.0f && this.divingFactor > 0.0f) || (this.getVehicleType().airship && this.divingFactor < 1.0f && this.divingFactor > 0.0f)) {
            this.divingFactor -= 0.01f;
        }
        if (this.shellDelay > 0) {
            --this.shellDelay;
        }
        if (this.gunDelay > 0) {
            --this.gunDelay;
        }
        if (this.toggleTimer > 0) {
            --this.toggleTimer;
        }
        if (this.driveableData.thermalTimer > 0) {
            final DriveableData driveableData = this.driveableData;
            --driveableData.thermalTimer;
        }
        if (this.driveableData.scopeTimer > 0) {
            final DriveableData driveableData2 = this.driveableData;
            --driveableData2.scopeTimer;
        }
        if (this.soundPosition > 0) {
            --this.soundPosition;
        }
        if (this.idlePosition > 0) {
            --this.idlePosition;
        }
        if (this.driveableData.thermalTimer == 9) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 10.0, this.field_71093_bK, "AnalogComputerSound", false);
        }
        if (this.driveableData.scopeTimer == 9) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 10.0, this.field_71093_bK, "tankSight", false);
        }
        if (type.tank && !this.hasBothTracks()) {
            this.throttle = 0.0f;
        }
        if (this.disabled) {
            this.wheelsYaw = 0.0f;
        }
        if (!type.tank && !this.hasAllTyres()) {
            this.throttle = 0.0f;
        }
        if (this.hasEnoughFuel()) {
            this.wheelsAngle += this.throttle / 7.0f;
        }
        if (!this.varDoor) {
            this.doorPos = this.transformPart(this.doorPos, type.doorPos1, type.doorRate);
            this.doorRot = this.transformPart(this.doorRot, type.doorRot1, type.doorRotRate);
        }
        else {
            this.doorPos = this.transformPart(this.doorPos, type.doorPos2, type.doorRate);
            this.doorRot = this.transformPart(this.doorRot, type.doorRot2, type.doorRotRate);
        }
        this.wheelsYaw *= 0.9f;
        if (this.wheelsYaw > 20.0f) {
            this.wheelsYaw = 20.0f;
        }
        if (this.wheelsYaw < -20.0f) {
            this.wheelsYaw = -20.0f;
        }
        if (this.field_70170_p.field_72995_K && !thePlayerIsDrivingThis && this.serverPositionTransitionTicker > 0) {
            final double x = this.field_70165_t + (this.field_70118_ct - this.field_70165_t) / this.serverPositionTransitionTicker;
            final double y = this.field_70163_u + (this.field_70117_cu - this.field_70163_u) / this.serverPositionTransitionTicker;
            final double z = this.field_70161_v + (this.field_70116_cv - this.field_70161_v) / this.serverPositionTransitionTicker;
            final double dYaw = MathHelper.func_76138_g(this.serverYaw - this.axes.getYaw());
            final double dPitch = MathHelper.func_76138_g(this.serverPitch - this.axes.getPitch());
            final double dRoll = MathHelper.func_76138_g(this.serverRoll - this.axes.getRoll());
            this.field_70177_z = (float)(this.axes.getYaw() + dYaw / this.serverPositionTransitionTicker);
            this.field_70125_A = (float)(this.axes.getPitch() + dPitch / this.serverPositionTransitionTicker);
            final float rotationRoll = (float)(this.axes.getRoll() + dRoll / this.serverPositionTransitionTicker);
            --this.serverPositionTransitionTicker;
            this.func_70107_b(x, y, z);
            this.setRotation(this.field_70177_z, this.field_70125_A, rotationRoll);
        }
        this.correctWheelPos();
        final Vector3f amountToMoveCar = new Vector3f();
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                final double prevPosYWheel = wheel.field_70163_u;
                this.field_70122_E = true;
                wheel.field_70122_E = true;
                final List<Entity> shipsCheck = this.field_70170_p.func_72872_a((Class)Entity.class, wheel.field_70121_D);
                boolean onShip = false;
                for (final Entity ship : shipsCheck) {
                    if (this.getClass().toString().indexOf("cuchaz.ships.EntityShip") > 0) {
                        wheel.field_70122_E = true;
                        onShip = true;
                    }
                }
                wheel.field_70177_z = this.axes.getYaw();
                if (!type.tank && (wheel.ID == 2 || wheel.ID == 3)) {
                    final EntityWheel entityWheel = wheel;
                    entityWheel.field_70177_z += this.wheelsYaw;
                }
                final EntityWheel entityWheel2 = wheel;
                entityWheel2.field_70159_w *= 0.8999999761581421;
                final EntityWheel entityWheel3 = wheel;
                entityWheel3.field_70181_x *= ((this.field_70163_u - bkPrevPosY < 0.0) ? 0.9990000128746033 : 0.8999999761581421);
                final EntityWheel entityWheel4 = wheel;
                entityWheel4.field_70179_y *= 0.8999999761581421;
                final boolean canThrustCreatively = !TeamsManager.vehiclesNeedFuel || (this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                if (canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption * this.throttle) {
                    if (this.getVehicleType().tank) {
                        final boolean left = wheel.ID == 0 || wheel.ID == 3;
                        final float turningDrag = 0.02f;
                        final EntityWheel entityWheel5 = wheel;
                        entityWheel5.field_70159_w *= 1.0f - Math.abs(this.wheelsYaw) * turningDrag;
                        final EntityWheel entityWheel6 = wheel;
                        entityWheel6.field_70179_y *= 1.0f - Math.abs(this.wheelsYaw) * turningDrag;
                        final float velocityScale = 0.04f * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed * this.terrainFactor;
                        float steeringScale = 0.1f * ((this.wheelsYaw > 0.0f) ? type.turnLeftModifier : type.turnRightModifier);
                        if ((this.isPartHealthy(EnumDriveablePart.leftTrack) && this.isPartHealthy(EnumDriveablePart.rightTrack)) || !this.isPartHealthy(EnumDriveablePart.engine)) {
                            steeringScale = 0.0f;
                        }
                        final float effectiveWheelSpeed = (this.throttle + this.wheelsYaw * (left ? 1 : -1) * steeringScale) * velocityScale;
                        final EntityWheel entityWheel7 = wheel;
                        entityWheel7.field_70159_w += effectiveWheelSpeed * Math.cos(wheel.field_70177_z * 3.1415927f / 180.0f);
                        final EntityWheel entityWheel8 = wheel;
                        entityWheel8.field_70179_y += effectiveWheelSpeed * Math.sin(wheel.field_70177_z * 3.1415927f / 180.0f);
                        this.yawSpeed += (float)(effectiveWheelSpeed * Math.sin(wheel.field_70177_z * 3.1415927f / 180.0f));
                    }
                    else {
                        float velocityScale2 = 0.1f * this.throttle * this.terrainFactor * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
                        final EntityWheel entityWheel9 = wheel;
                        entityWheel9.field_70159_w += Math.cos(wheel.field_70177_z * 3.1415927f / 180.0f) * velocityScale2;
                        final EntityWheel entityWheel10 = wheel;
                        entityWheel10.field_70179_y += Math.sin(wheel.field_70177_z * 3.1415927f / 180.0f) * velocityScale2;
                        if (wheel.ID == 2 || wheel.ID == 3) {
                            velocityScale2 = 0.01f * ((this.wheelsYaw > 0.0f) ? type.turnLeftModifier : type.turnRightModifier) * ((this.throttle > 0.0f) ? 1 : -1);
                            final EntityWheel entityWheel11 = wheel;
                            entityWheel11.field_70159_w -= wheel.getSpeedXZ() * Math.sin(wheel.field_70177_z * 3.1415927f / 180.0f) * velocityScale2 * this.wheelsYaw;
                            final EntityWheel entityWheel12 = wheel;
                            entityWheel12.field_70179_y += wheel.getSpeedXZ() * Math.cos(wheel.field_70177_z * 3.1415927f / 180.0f) * velocityScale2 * this.wheelsYaw;
                        }
                        else {
                            final EntityWheel entityWheel13 = wheel;
                            entityWheel13.field_70159_w *= 0.8999999761581421;
                            final EntityWheel entityWheel14 = wheel;
                            entityWheel14.field_70179_y *= 0.8999999761581421;
                        }
                    }
                }
                wheel.func_70091_d(wheel.field_70159_w, wheel.field_70181_x, wheel.field_70179_y);
                final Vector3f targetWheelPos = this.axes.findLocalVectorGlobally(this.getVehicleType().wheelPositions[wheel.ID].position);
                final Vector3f currentWheelPos = new Vector3f(wheel.field_70165_t - this.field_70165_t, wheel.field_70163_u - this.field_70163_u, wheel.field_70161_v - this.field_70161_v);
                final Vector3f dPos = (Vector3f)Vector3f.sub(targetWheelPos, currentWheelPos, null).scale(type.wheelSpringStrength);
                if (dPos.length() > 0.001f) {
                    wheel.func_70091_d((double)dPos.x, (double)dPos.y, (double)dPos.z);
                    dPos.scale(0.5f);
                    Vector3f.sub(amountToMoveCar, dPos, amountToMoveCar);
                }
                float avgWheelHeight = 0.0f;
                if (this.wheels[0] != null && this.wheels[1] != null && this.wheels[2] != null && this.wheels[3] != null) {
                    avgWheelHeight = (float)(this.wheels[0].field_70165_t + this.wheels[1].field_70165_t + this.wheels[2].field_70165_t + this.wheels[3].field_70165_t) / 4.0f;
                    if (!this.wheels[0].field_70122_E && !this.wheels[1].field_70122_E && !this.wheels[2].field_70122_E && !this.wheels[3].field_70122_E) {
                        this.allWheelsOnGround = false;
                    }
                    else {
                        this.allWheelsOnGround = true;
                    }
                }
                float gas = this.getDriveableData().parts.get(EnumDriveablePart.gasbag).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.gasbag).maxHealth * 1.0f;
                if (this.getDriveableData().parts.get(EnumDriveablePart.gasbag).maxHealth == 0) {
                    gas = 1.0f;
                }
                if (data.depth > 0.01 && this.getDriveableData().parts.get(EnumDriveablePart.core).health > 0.0f) {
                    data.depth = 0.0f;
                }
                if (TeamsManager.seaLevel - this.field_70163_u > 2.0) {
                    if (!type.unlimitedOxygen) {
                        --this.oxygenMeter;
                    }
                    if (this.oxygenMeter < 0.0f) {
                        this.oxygenMeter = 0.0f;
                    }
                }
                if (TeamsManager.seaLevel - this.field_70163_u < 2.0 && this.getDriveableData().parts.get(EnumDriveablePart.core).health > 0.0f) {
                    this.oxygenMeter += 15.0f;
                    if (this.oxygenMeter > type.maxOxygen) {
                        this.oxygenMeter = type.maxOxygen;
                    }
                }
                if (TeamsManager.seaLevel - this.field_70163_u > type.maxDepth && type.canDive) {
                    this.getDriveableData().parts.get(EnumDriveablePart.core).health -= 10;
                }
                if (!type.floatOnWater && this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttle > 0.1) {
                    this.throttle -= (float)0.001;
                }
                if (!type.floatOnWater && this.field_70170_p.func_72953_d(this.field_70121_D) && this.throttle < -0.1) {
                    this.throttle += (float)0.001;
                }
                final Random rand = new Random();
                if (!type.Stabilizer) {
                    if (this.throttle > 0.05) {
                        --this.delay;
                        this.timer += 0.05;
                        this.timer %= 15.0;
                        ++this.jolt;
                        if (this.jolt > 0.8) {
                            this.jolt = 0.8;
                        }
                        else {
                            this.jolt = 0.0;
                        }
                        if (this.delay <= 0) {
                            this.delay = 1 + 2 * rand.nextInt(2);
                        }
                        final float change = (float)(3.141592653589793 * Math.cos(3.141592653589793 * this.timer) / 180.0 * this.timer * this.jolt);
                        this.seats[0].playerLooking.rotateLocalPitch(change * this.throttle * 2.0f);
                    }
                    else {
                        this.jolt = 0.0;
                    }
                }
                final DriveablePart buoyancy = this.getDriveableData().parts.get(EnumDriveablePart.buoyancy);
                if (type.epicShip && leftShip.health > 0 && right.health > 0 && bow.health > 0 && stern.health > 0) {
                    this.roll = 0.0f;
                    this.pitch = 0.0f;
                }
                if (this.allWheelsOnGround && (!type.floatOnWater || !this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0))) && !wheel.onDeck && !type.canDive && !type.airship) {
                    wheel.func_70091_d(0.0, this.onDeck ? 0.0 : -2.0, 0.0);
                    if ((type.epicShip && floatiness < 0.1f) || (bow.maxHealth > 0 && bow.health <= 0) || (stern.maxHealth > 0 && stern.health <= 0) || (leftShip.maxHealth > 0 && leftShip.health <= 0) || (right.maxHealth > 0 && right.health <= 0) || (midsection.health <= 0 && midsection.maxHealth > 0)) {
                        wheel.func_70091_d(0.0, -0.19600000977516174, 0.0);
                    }
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && !type.canDive && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && !wheel.onDeck) {
                    if (!type.epicShip) {
                        wheel.func_70091_d(0.0, 0.5, 0.0);
                    }
                    data.depth = 0.0f;
                    if (type.epicShip && leftShip.maxHealth <= 0.0f && right.maxHealth <= 0.0f && bow.maxHealth <= 0.0f && stern.maxHealth <= 0.0f && midsection.maxHealth <= 0.0f) {
                        wheel.func_70091_d(0.0, 0.30000001192092896 * (1.1 * floatiness - 0.5), 0.0);
                        data.depth = 0.0f;
                    }
                    else if ((type.epicShip && leftShip.health > 1.0f && leftShip.maxHealth > 0 && right.health > 1.0f && right.maxHealth > 1 && midsection.maxHealth <= 0 && bow.health > 1 && bow.maxHealth > 0 && stern.health > 0 && stern.maxHealth > 0) || (midsection.maxHealth > 0 && midsection.health > 1 && type.epicShip) || (type.epicShip && leftShip.maxHealth <= 0 && right.health > 1.0f && right.maxHealth <= 0 && midsection.maxHealth > 1 && midsection.health > 1 && bow.health > 1 && bow.maxHealth > 0 && stern.health > 0 && stern.maxHealth > 0)) {
                        wheel.func_70091_d(0.0, 0.30000001192092896 * (1.1 * floatiness - 0.5), 0.0);
                        data.depth = 0.0f;
                    }
                    else {
                        wheel.func_70091_d(0.0, -0.009000000543892384, 0.0);
                        if (leftShip.health <= 0 && right.health > 0 && this.roll < 1.5f) {
                            this.roll += 5.0E-4f;
                        }
                        if (right.health <= 0 && leftShip.health > 0 && this.roll > -1.5f) {
                            this.roll -= 5.0E-4f;
                        }
                        if (bow.health <= 0 && stern.health > 0 && this.pitch < 0.6f) {
                            this.pitch += 2.5E-4f;
                        }
                        if (stern.health <= 0 && bow.health > 0 && this.pitch > -0.6f) {
                            this.pitch -= 2.5E-4f;
                        }
                    }
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && !type.airship && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor > 0.0f && this.seats[0].field_70153_n instanceof EntityPlayer && this.oxygenMeter > 0.1f) {
                    wheel.func_70091_d(0.0, type.surfaceSpeed * 0.5 * this.divingFactor, 0.0);
                    final DriveableData driveableData3 = data;
                    driveableData3.depth += (float)(type.surfaceSpeed * 0.5 * this.divingFactor * 0.16666);
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && !type.airship && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor > 0.0f && this.seats[0].field_70153_n instanceof EntityPlayer && this.oxygenMeter < 0.1f) {
                    wheel.func_70091_d(0.0, type.surfaceSpeed * 0.5 * 1.0, 0.0);
                    final DriveableData driveableData4 = data;
                    driveableData4.depth += (float)(type.surfaceSpeed * 0.5 * 1.0 * 0.16666);
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && !type.airship && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor < 0.0f && this.seats[0].field_70153_n instanceof EntityPlayer && this.oxygenMeter > 0.1f) {
                    wheel.func_70091_d(0.0, type.diveSpeed * 0.5 * this.divingFactor, 0.0);
                    final DriveableData driveableData5 = data;
                    driveableData5.depth += (float)(type.diveSpeed * 0.5 * this.divingFactor * 0.16666);
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && !type.airship && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor < 0.0f && this.seats[0].field_70153_n instanceof EntityPlayer && this.oxygenMeter < 0.1f) {
                    wheel.func_70091_d(0.0, type.diveSpeed * 0.5 * 1.0, 0.0);
                    final DriveableData driveableData6 = data;
                    driveableData6.depth += (float)(type.diveSpeed * 0.5 * 1.0 * 0.16666);
                }
                else if (!this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && !type.canDive && type.airship && !this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor > 0.1 && this.field_70163_u < type.maxAltitude && this.seats[0].field_70153_n instanceof EntityPlayer) {
                    wheel.func_70091_d(0.0, this.divingFactor * (type.surfaceSpeed * 0.5) * (2.0f * gas - 1.0f), 0.0);
                }
                else if (!this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && !type.canDive && type.airship && !this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor < -0.1 && this.seats[0].field_70153_n instanceof EntityPlayer) {
                    wheel.func_70091_d(0.0, this.divingFactor * (type.diveSpeed * 0.5) * (2.0f - gas * 1.0f), 0.0);
                }
                else if (!this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && !type.canDive && type.airship && !this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.divingFactor > -0.1 && this.divingFactor < 0.1) {
                    wheel.func_70091_d(0.0, 0.5 * (gas - 1.0f), 0.0);
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.oxygenMeter > 0.1f) {
                    wheel.func_70091_d(0.0, 0.0, 0.0);
                }
                else if (type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && type.canDive && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && this.oxygenMeter < 0.1f) {
                    wheel.func_70091_d(0.0, type.surfaceSpeed * 0.6 * 1.0, 0.0);
                }
                else if ((type.floatOnWater && this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(-type.floatOffset), 0.0)) && !this.field_70170_p.func_72953_d(wheel.field_70121_D.func_72329_c().func_72317_d(0.0, (double)(1.0f - type.floatOffset), 0.0)) && !type.canDive) || (wheel.onDeck && !type.canDive)) {
                    if (!type.epicShip) {
                        wheel.func_70091_d(0.0, 0.0, 0.0);
                        this.roll = 0.0f;
                        this.pitch = 0.0f;
                    }
                    if (type.epicShip && floatiness >= 0.1) {
                        wheel.func_70091_d(0.0, 0.0, 0.0);
                    }
                    if ((type.epicShip && floatiness < 0.1) || (type.epicShip && bow.maxHealth > 0 && bow.health <= 0) || (type.epicShip && stern.maxHealth > 0 && stern.health <= 0) || (type.epicShip && leftShip.maxHealth > 0 && leftShip.health <= 0) || (type.epicShip && right.maxHealth > 0 && right.health <= 0) || (midsection.health <= 0 && midsection.maxHealth > 0)) {
                        wheel.func_70091_d(0.0, -0.5, 0.0);
                    }
                }
                else if (wheel.onDeck && type.canDive && this.divingFactor < 0.0f) {
                    this.divingFactor = -0.3f;
                    data.depth = 0.0f;
                    this.roll = 0.0f;
                    this.pitch = 0.0f;
                }
                else {
                    wheel.func_70091_d(0.0, this.onDeck ? 0.0 : -0.9800000190734863, 0.0);
                }
                if ((this.throttle >= 1.1 || this.throttle <= -1.1) && wheel.getSpeedXYZ() <= this.getAvgWheelSpeedXYZ() / 1.0f) {
                    this.throttle = 1.0f;
                }
            }
        }
        if (this.wheels[0] != null && this.wheels[1] != null && this.wheels[2] != null && this.wheels[3] != null) {
            this.lastPos.x = (float)(this.wheels[0].field_70159_w + this.wheels[1].field_70159_w + this.wheels[2].field_70159_w + this.wheels[3].field_70159_w) / 4.0f;
            this.lastPos.y = (float)(this.wheels[0].field_70181_x + this.wheels[1].field_70181_x + this.wheels[2].field_70181_x + this.wheels[3].field_70181_x) / 4.0f;
            this.lastPos.z = (float)(this.wheels[0].field_70179_y + this.wheels[1].field_70179_y + this.wheels[2].field_70179_y + this.wheels[3].field_70179_y) / 4.0f;
        }
        final double bmy = this.field_70181_x;
        this.field_70181_x = amountToMoveCar.y;
        this.func_70091_d((double)amountToMoveCar.x, (double)amountToMoveCar.y, (double)amountToMoveCar.z);
        this.field_70181_x = bmy;
        if (this.wheels[0] != null && this.wheels[1] != null && this.wheels[2] != null && this.wheels[3] != null) {
            final Vector3f frontAxleCentre = new Vector3f((this.wheels[2].field_70165_t + this.wheels[3].field_70165_t) / 2.0, (this.wheels[2].field_70163_u + this.wheels[3].field_70163_u) / 2.0, (this.wheels[2].field_70161_v + this.wheels[3].field_70161_v) / 2.0);
            final Vector3f backAxleCentre = new Vector3f((this.wheels[0].field_70165_t + this.wheels[1].field_70165_t) / 2.0, (this.wheels[0].field_70163_u + this.wheels[1].field_70163_u) / 2.0, (this.wheels[0].field_70161_v + this.wheels[1].field_70161_v) / 2.0);
            final Vector3f leftSideCentre = new Vector3f((this.wheels[0].field_70165_t + this.wheels[3].field_70165_t) / 2.0, (this.wheels[0].field_70163_u + this.wheels[3].field_70163_u) / 2.0, (this.wheels[0].field_70161_v + this.wheels[3].field_70161_v) / 2.0);
            final Vector3f rightSideCentre = new Vector3f((this.wheels[1].field_70165_t + this.wheels[2].field_70165_t) / 2.0, (this.wheels[1].field_70163_u + this.wheels[2].field_70163_u) / 2.0, (this.wheels[1].field_70161_v + this.wheels[2].field_70161_v) / 2.0);
            final float dx = frontAxleCentre.x - backAxleCentre.x;
            final float dy = frontAxleCentre.y - backAxleCentre.y;
            final float dz = frontAxleCentre.z - backAxleCentre.z;
            final float drx = leftSideCentre.x - rightSideCentre.x;
            final float dry = leftSideCentre.y - rightSideCentre.y;
            final float drz = leftSideCentre.z - rightSideCentre.z;
            final float dxz = (float)Math.sqrt(dx * dx + dz * dz);
            final float drxz = (float)Math.sqrt(drx * drx + drz * drz);
            final float tyaw = (float)Math.atan2(dz, dx);
            final float tpitch = -(float)Math.atan2(dy, dxz);
            float troll = 0.0f;
            if (type.canRoll) {
                troll = -(float)Math.atan2(dry, drxz);
            }
            this.yaw = tyaw;
            this.pitch = this.Lerp(this.pitch, tpitch, 0.2f);
            this.roll = this.Lerp(this.roll, troll, 0.2f);
            float engineHealthTwo = this.getDriveableData().parts.get(EnumDriveablePart.engine).health / (float)this.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth * 1.0f;
            if (this.getDriveableData().parts.get(EnumDriveablePart.engine).maxHealth == 0) {
                engineHealthTwo = 1.0f;
            }
            if (type.epicShip) {
                final float velocityScale3 = 0.04f * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
                final float steeringScale2 = 0.040000003f * ((this.wheelsYaw > 0.0f) ? type.turnLeftModifier : type.turnRightModifier);
                final float effectiveWheelSpeed2 = this.wheelsYaw * steeringScale2 * velocityScale3;
                this.yaw = this.axes.getYaw() / 180.0f * 3.14159f + effectiveWheelSpeed2;
            }
            else {
                final float velocityScale3 = 0.1f * this.throttle * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
                float velocityScaleTank = 0.1f * (0.5f + 0.5f * this.throttle) * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
                if (this.throttle < 0.0f) {
                    velocityScaleTank = -0.1f * (-0.5f + 0.5f * this.throttle) * ((this.throttle > 0.0f) ? type.maxThrottle : type.maxNegativeThrottle) * data.engine.engineSpeed;
                }
                if ((!this.isPartHealthy(EnumDriveablePart.leftTrack) && !this.isPartHealthy(EnumDriveablePart.rightTrack)) || this.ticksRepairing > 0 || !this.isPartHealthy(EnumDriveablePart.engine)) {
                    velocityScaleTank = 0.0f;
                }
                float steeringScale3 = 0.1f * ((this.wheelsYaw > 0.0f) ? (type.turnLeftModifier * 0.5f) : (type.turnRightModifier * 0.5f));
                if (type.epicShip) {
                    steeringScale3 = 0.040000003f * ((this.wheelsYaw > 0.0f) ? type.turnLeftModifier : type.turnRightModifier);
                }
                float effectiveWheelSpeed3 = this.wheelsYaw * steeringScale3 * velocityScale3;
                if (type.tank) {
                    effectiveWheelSpeed3 = this.wheelsYaw * steeringScale3 * velocityScaleTank;
                }
                this.yaw = this.axes.getYaw() / 180.0f * 3.14159f + effectiveWheelSpeed3;
            }
            this.axes.setAngles(this.yaw * 180.0f / 3.14159f, this.pitch * 180.0f / 3.14159f, this.roll * 180.0f / 3.14159f);
        }
        if (this.field_70154_o != null && this.field_70154_o.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            this.axes.setAngles(this.field_70154_o.field_70177_z + 90.0f, 0.0f, 0.0f);
        }
        this.checkForCollisions();
        if (Math.abs(this.throttle) > 0.01f && Math.abs(this.throttle) < 0.2f && this.soundPosition == 0 && this.hasEnoughFuel()) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.startSoundRange, this.field_71093_bK, type.startSound, false);
            this.soundPosition = type.startSoundLength;
        }
        if (this.throttle >= 0.2f && this.soundPosition == 0 && this.hasEnoughFuel()) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.engineSoundRange, this.field_71093_bK, type.engineSound, false);
            this.soundPosition = type.engineSoundLength;
        }
        if (this.seats[0] != null && this.throttle <= 0.01f && this.throttle >= -0.2f && this.seats[0].field_70153_n != null && this.idlePosition == 0) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.engineSoundRange, this.field_71093_bK, type.idleSound, false);
            this.idlePosition = type.idleSoundLength;
        }
        if (this.throttle <= -0.2f && this.soundPosition == 0 && this.hasEnoughFuel()) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.backSoundRange, this.field_71093_bK, type.backSound, false);
            this.soundPosition = type.backSoundLength;
        }
        for (final EntitySeat seat : this.seats) {
            if ((seat != null && seat.field_70153_n != null && this.field_70173_aa % TeamsManager.seatRate == 0) || (seat != null && seat.field_70153_n == null && this.field_70173_aa % 20 == 0)) {
                seat.updatePosition();
            }
        }
        final int packetRate = 1;
        if (thePlayerIsDrivingThis && this.field_70173_aa % TeamsManager.vehicleRate == 0) {
            FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
            this.field_70118_ct = this.field_70165_t;
            this.field_70117_cu = this.field_70163_u;
            this.field_70116_cv = this.field_70161_v;
            this.serverYaw = this.axes.getYaw();
        }
        if (!this.field_70170_p.field_72995_K && this.field_70173_aa % TeamsManager.vehicleRate == 0) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketVehicleControl(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, FlansMod.driveableUpdateRange, this.field_71093_bK);
        }
        int animSpeed = 4;
        if ((this.throttle > 0.05 && this.throttle <= 0.33) || (this.throttle < -0.05 && this.throttle >= -0.33)) {
            animSpeed = 3;
        }
        else if ((this.throttle > 0.33 && this.throttle <= 0.66) || (this.throttle < -0.33 && this.throttle >= -0.66)) {
            animSpeed = 2;
        }
        else if ((this.throttle > 0.66 && this.throttle <= 0.9) || (this.throttle < -0.66 && this.throttle >= -0.9)) {
            animSpeed = 1;
        }
        else if ((this.throttle > 0.9 && this.throttle <= 1.0f) || (this.throttle < -0.9 && this.throttle >= -1.0f)) {
            animSpeed = 0;
        }
        boolean turningLeft = false;
        boolean turningRight = false;
        if (this.throttle > 0.05) {
            --this.animCountLeft;
            --this.animCountRight;
        }
        else if (this.throttle < -0.05) {
            ++this.animCountLeft;
            ++this.animCountRight;
        }
        else if (this.wheelsYaw < -1.0f) {
            turningLeft = true;
            ++this.animCountLeft;
            --this.animCountRight;
            animSpeed = 1;
            if (this.soundPosition == 0 && this.hasEnoughFuel() && type.tank) {
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.engineSoundRange, this.field_71093_bK, type.engineSound, false);
                this.soundPosition = type.engineSoundLength;
            }
        }
        else if (this.wheelsYaw > 1.0f) {
            turningRight = true;
            --this.animCountLeft;
            ++this.animCountRight;
            animSpeed = 1;
            if (this.soundPosition == 0 && this.hasEnoughFuel() && type.tank) {
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, type.engineSoundRange, this.field_71093_bK, type.engineSound, false);
                this.soundPosition = type.engineSoundLength;
            }
        }
        else {
            turningLeft = false;
            turningRight = false;
        }
        if (this.animCountLeft <= 0) {
            this.animCountLeft = animSpeed;
            ++this.animFrameLeft;
        }
        if (this.animCountRight <= 0) {
            this.animCountRight = animSpeed;
            ++this.animFrameRight;
        }
        if ((this.throttle < 0.0f || turningLeft) && this.animCountLeft >= animSpeed) {
            this.animCountLeft = 0;
            --this.animFrameLeft;
        }
        if ((this.throttle < 0.0f || turningRight) && this.animCountRight >= animSpeed) {
            this.animCountRight = 0;
            --this.animFrameRight;
        }
        if (this.animFrameLeft > type.animFrames) {
            this.animFrameLeft = 0;
        }
        if (this.animFrameLeft < 0) {
            this.animFrameLeft = type.animFrames;
        }
        if (this.animFrameRight > type.animFrames) {
            this.animFrameRight = 0;
        }
        if (this.animFrameRight < 0) {
            this.animFrameRight = type.animFrames;
        }
        if (this.field_70173_aa % 120 == 0 && this.field_70170_p.field_72995_K && type.epicShip && !this.atSea && this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer) {
            ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW.toString() + "A water bucket is not the ocean."));
            ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.RED.toString() + "You may not shoot until you are actually in a body of water!"));
            ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.RED.toString() + "Also enjoy a throttle penalty!"));
        }
        if (type.epicShip) {
            final Material water1 = this.field_70170_p.func_147439_a((int)this.field_70165_t + 6, (int)this.field_70163_u - 4, (int)this.field_70161_v + 6).func_149688_o();
            final Material water2 = this.field_70170_p.func_147439_a((int)this.field_70165_t - 6, (int)this.field_70163_u - 4, (int)this.field_70161_v - 6).func_149688_o();
            final Material water3 = this.field_70170_p.func_147439_a((int)this.field_70165_t, (int)this.field_70163_u - 6, (int)this.field_70161_v).func_149688_o();
            if (water1 != Material.field_151586_h || water2 != Material.field_151586_h || water3 != Material.field_151586_h) {
                if (this.field_70170_p.field_72995_K && this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer && this.atSea) {
                    ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.YELLOW.toString() + "Nice try retard, a water bucket doesn't count."));
                    ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.RED.toString() + "Try going in the actual ocean!"));
                }
                this.atSea = false;
            }
            else {
                if (!this.atSea && this.field_70170_p.field_72995_K && this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n != null && this.seats[0].field_70153_n instanceof EntityPlayer) {
                    ((EntityPlayer)this.seats[0].field_70153_n).func_145747_a((IChatComponent)new ChatComponentText(EnumChatFormatting.GREEN.toString() + "Okay, it seems you are actually at sea now!"));
                }
                this.atSea = true;
            }
        }
        if (type.epicShip && !this.atSea) {
            if (this.throttle > 0.0f && this.throttle > 0.3f) {
                this.throttle = 0.3f;
            }
            if (this.throttle <= 0.0f && this.throttle < -0.3f) {
                this.throttle = -0.3f;
            }
        }
    }
    
    private void interrupt(final float f) {
    }
    
    public Entity getValidTarget() {
        if (this.field_70170_p.field_72995_K) {
            return null;
        }
        for (final Object obj : this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b((double)this.getVehicleType().evilRange, (double)this.getVehicleType().evilRange, (double)this.getVehicleType().evilRange))) {
            final Entity candidateEntity = (Entity)obj;
            if (candidateEntity != this && candidateEntity instanceof EntityVehicle && !((EntityVehicle)candidateEntity).getVehicleType().evilGolem && ((EntityVehicle)candidateEntity).deathTimer <= 30 && candidateEntity.func_70032_d((Entity)this) < this.getVehicleType().evilRange) {
                return candidateEntity;
            }
        }
        return null;
    }
    
    public EntityPlayer getValidHumanTarget() {
        if (this.field_70170_p.field_72995_K) {
            return null;
        }
        for (final Object obj : this.field_70170_p.func_72839_b((Entity)this, this.field_70121_D.func_72314_b((double)this.getVehicleType().evilRange, (double)this.getVehicleType().evilRange, (double)this.getVehicleType().evilRange))) {
            final Entity candidateEntity = (Entity)obj;
            if (candidateEntity != this && candidateEntity instanceof EntityPlayer && candidateEntity.func_70032_d((Entity)this) < this.getVehicleType().evilRange) {
                return (EntityPlayer)candidateEntity;
            }
        }
        return null;
    }
    
    public void rebirthVehicle() {
        final VehicleType typo = this.getVehicleType();
        final ItemStack vehicleStack = new ItemStack(typo.item, 1, this.driveableData.paintjobID);
        vehicleStack.field_77990_d = new NBTTagCompound();
        for (final EntitySeat seat : this.seats) {
            if (seat != null && seat.field_70153_n != null && seat.field_70153_n instanceof EntityPlayerMP) {
                final EntityPlayerMP human = (EntityPlayerMP)seat.field_70153_n;
                human.field_71135_a.func_147360_c("Seat kick detected?! Let's hope you brought a rifle!");
            }
        }
        this.driveableData.writeToNBT(vehicleStack.field_77990_d);
        ((ItemVehicle)vehicleStack.func_77973_b()).spawnVehicleAngled(this.field_70170_p, this.field_70165_t + 0.5, this.field_70163_u + 0.5, this.field_70161_v + 0.5, this.axes.getYaw(), vehicleStack);
        System.out.println("rebirth attemtped!");
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                seat.func_70106_y();
            }
        }
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                wheel.func_70106_y();
            }
        }
        this.func_70106_y();
    }
    
    public void reset(final EntityPlayer master) {
        if (!this.field_70170_p.field_72995_K) {
            this.driveableData.seatBelt = "null";
            final VehicleType typo = this.getVehicleType();
            final ItemStack vehicleStack = new ItemStack(typo.item, 1, this.driveableData.paintjobID);
            vehicleStack.field_77990_d = new NBTTagCompound();
            this.driveableData.writeToNBT(vehicleStack.field_77990_d);
            boolean used = false;
            if (master.field_71071_by.func_70441_a(vehicleStack)) {
                used = true;
            }
            if (used && master != null) {
                MinecraftServer.func_71276_C().func_71187_D().func_71556_a((ICommandSender)MinecraftServer.func_71276_C(), "tp " + master.getDisplayName() + " " + this.driveableData.originX + " " + this.driveableData.originY + " " + this.driveableData.originZ);
                FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.field_70165_t, this.field_70163_u, this.field_70161_v, 1, "tankkuDeath"), this.field_70165_t, this.field_70163_u, this.field_70161_v, 150.0f, this.field_71093_bK);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 150.0, this.field_71093_bK, "Crash", false);
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 150.0, this.field_71093_bK, "explcls6", false);
                master.func_70690_d(new PotionEffect(Potion.field_76429_m.field_76415_H, 200, 9000));
                master.func_70690_d(new PotionEffect(Potion.field_76421_d.field_76415_H, 200, 9000));
                master.func_70690_d(new PotionEffect(Potion.field_76440_q.field_76415_H, 100, 9000));
                for (final EntitySeat seat : this.seats) {
                    if (seat != null) {
                        seat.func_70106_y();
                    }
                }
                for (final EntityWheel wheel : this.wheels) {
                    if (wheel != null) {
                        wheel.func_70106_y();
                    }
                }
                this.func_70106_y();
            }
        }
    }
    
    public void animateFancyTracks() {
        final float funkypart = (float)this.getVehicleType().trackLinkFix;
        final boolean funk = true;
        float funk2 = 0.0f;
        for (int i = 0; i < this.trackLinksLeft.length; ++i) {
            this.trackLinksLeft[i].prevPosition = this.trackLinksLeft[i].position;
            this.trackLinksLeft[i].prevZRot = this.trackLinksLeft[i].zRot;
            final float speed = this.throttle * 1.5f - this.wheelsYaw / 12.0f;
            final AnimTrackLink animTrackLink = this.trackLinksLeft[i];
            animTrackLink.progress += speed;
            if (this.trackLinksLeft[i].progress > this.leftTrack.getTrackLength()) {
                final AnimTrackLink animTrackLink2 = this.trackLinksLeft[i];
                animTrackLink2.progress -= this.leftTrack.getTrackLength();
            }
            if (this.trackLinksLeft[i].progress < 0.0f) {
                final AnimTrackLink animTrackLink3 = this.trackLinksLeft[i];
                animTrackLink3.progress += this.leftTrack.getTrackLength();
            }
            this.trackLinksLeft[i].position = this.leftTrack.getPositionOnTrack(this.trackLinksLeft[i].progress);
            while (this.trackLinksLeft[i].zRot > 180.0f) {
                final AnimTrackLink animTrackLink4 = this.trackLinksLeft[i];
                animTrackLink4.zRot -= 360.0f;
            }
            while (this.trackLinksLeft[i].zRot <= -180.0f) {
                final AnimTrackLink animTrackLink5 = this.trackLinksLeft[i];
                animTrackLink5.zRot += 360.0f;
            }
            final float newAngle = this.rotateTowards(this.leftTrack.points.get(this.leftTrack.getTrackPart(this.trackLinksLeft[i].progress)), this.trackLinksLeft[i].position);
            final int part = this.leftTrack.getTrackPart(this.trackLinksLeft[i].progress);
            if (funk) {
                funk2 = ((speed < 0.0f) ? 0.0f : 1.0f);
            }
            else {
                funk2 = ((speed < 0.0f) ? -1.0f : 0.0f);
            }
            this.trackLinksLeft[i].zRot = this.Lerp(this.trackLinksLeft[i].zRot, newAngle, (part != funkypart + funk2) ? 0.5f : 1.0f);
        }
        for (int i = 0; i < this.trackLinksRight.length; ++i) {
            this.trackLinksRight[i].prevPosition = this.trackLinksRight[i].position;
            this.trackLinksRight[i].prevZRot = this.trackLinksRight[i].zRot;
            final float speed = this.throttle * 1.5f + this.wheelsYaw / 12.0f;
            final AnimTrackLink animTrackLink6 = this.trackLinksRight[i];
            animTrackLink6.progress += speed;
            if (this.trackLinksRight[i].progress > this.rightTrack.getTrackLength()) {
                final AnimTrackLink animTrackLink7 = this.trackLinksRight[i];
                animTrackLink7.progress -= this.leftTrack.getTrackLength();
            }
            if (this.trackLinksRight[i].progress < 0.0f) {
                final AnimTrackLink animTrackLink8 = this.trackLinksRight[i];
                animTrackLink8.progress += this.rightTrack.getTrackLength();
            }
            this.trackLinksRight[i].position = this.rightTrack.getPositionOnTrack(this.trackLinksRight[i].progress);
            final float newAngle = this.rotateTowards(this.rightTrack.points.get(this.rightTrack.getTrackPart(this.trackLinksRight[i].progress)), this.trackLinksRight[i].position);
            final int part = this.rightTrack.getTrackPart(this.trackLinksRight[i].progress);
            if (funk) {
                funk2 = ((speed < 0.0f) ? 0.0f : 1.0f);
            }
            else {
                funk2 = ((speed < 0.0f) ? -1.0f : 0.0f);
            }
            this.trackLinksRight[i].zRot = this.Lerp(this.trackLinksRight[i].zRot, newAngle, (part != funkypart + funk2) ? 0.5f : 1.0f);
        }
    }
    
    public float rotateTowards(final Vector3f point, final Vector3f original) {
        final float angle = (float)Math.atan2(point.y - original.y, point.x - original.x);
        return angle;
    }
    
    public void dischargeSmoke() {
        final VehicleType type = this.getVehicleType();
        for (int i = 0; i < type.smokers.size(); ++i) {
            final VehicleType.SmokePoint smoker = type.smokers.get(i);
            Vector3f dir = smoker.direction;
            Vector3f pos = smoker.position;
            final int time = smoker.detTime;
            dir = this.axes.findLocalVectorGlobally(dir);
            pos = this.axes.findLocalVectorGlobally(pos);
            if (EnumDriveablePart.getPart(smoker.part) == EnumDriveablePart.turret) {
                dir = this.rotate(this.seats[0].looking.findLocalVectorGlobally(smoker.direction));
                pos = this.getPositionOnTurret(smoker.position, false);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.smoker", this.field_70165_t + pos.x / 16.0f, this.field_70163_u + pos.y / 16.0f, this.field_70161_v + pos.z / 16.0f, dir.x, dir.y, dir.z), this.field_70165_t, this.field_70163_u, this.field_70161_v, 150.0f, this.field_71093_bK);
        }
    }
    
    public void dischargeAPS() {
        final VehicleType type = this.getVehicleType();
        for (int i = 0; i < type.smokers.size(); ++i) {
            final VehicleType.SmokePoint smoker = type.smokers.get(i);
            Vector3f dir = smoker.direction;
            Vector3f pos = smoker.position;
            final int time = smoker.detTime;
            dir = this.axes.findLocalVectorGlobally(dir);
            pos = this.axes.findLocalVectorGlobally(pos);
            if (EnumDriveablePart.getPart(smoker.part) == EnumDriveablePart.turret) {
                dir = this.rotate(this.seats[0].looking.findLocalVectorGlobally(smoker.direction));
                pos = this.getPositionOnTurret(smoker.position, false);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.smokeburst", this.field_70165_t + pos.x / 10.0f, this.field_70163_u + pos.y / 10.0f, this.field_70161_v + pos.z / 10.0f, dir.x, dir.y, dir.z), this.field_70165_t, this.field_70163_u, this.field_70161_v, 150.0f, this.field_71093_bK);
        }
    }
    
    public float Lerp(final float start, final float end, final float percent) {
        final float result = start + percent * (end - start);
        return result;
    }
    
    public static float Clamp(final float val, final float min, final float max) {
        return Math.max(min, Math.min(max, val));
    }
    
    public List<Entity> findEntitiesWithinbounds() {
        final VehicleType type = this.getVehicleType();
        final AxisAlignedBB initialBox = this.field_70121_D.func_72329_c();
        final List<Entity> riddenEntities = this.field_70170_p.func_72872_a((Class)Entity.class, initialBox);
        final Vector3f size = new Vector3f(type.harvestBoxSize.x / 8.0f, type.harvestBoxSize.y / 8.0f, type.harvestBoxSize.z / 8.0f);
        final Vector3f pos = new Vector3f(type.harvestBoxPos.x / 8.0f, type.harvestBoxPos.y / 8.0f, type.harvestBoxPos.z / 8.0f);
        for (float x = pos.x; x <= pos.x + size.x; ++x) {
            for (float y = pos.y; y <= pos.y + size.y; ++y) {
                for (float z = pos.z; z <= pos.z + size.z; ++z) {
                    final Vector3f v = this.axes.findLocalVectorGlobally(new Vector3f(x, y, z));
                    final double entX = this.field_70165_t + v.x;
                    final double entY = this.field_70163_u + v.y;
                    final double entZ = this.field_70161_v + v.z;
                    final AxisAlignedBB checkBox = this.field_70121_D.func_72329_c().func_72317_d((double)v.x, (double)v.y, (double)v.z);
                    final List<Entity> entityhere = this.field_70170_p.func_72872_a((Class)Entity.class, checkBox);
                    for (int i = 0; i < entityhere.size(); ++i) {
                        if (entityhere.get(i) instanceof EntityLivingBase) {
                            riddenEntities.add(entityhere.get(i));
                        }
                    }
                }
            }
        }
        return riddenEntities;
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
    protected void func_70069_a(final float k) {
        if (k <= 20.0f) {
            return;
        }
        float damage = (float)(MathHelper.func_76123_f(k) * 2);
        boolean no_damage = true;
        if (damage > 0.0f && this.invulnerableUnmountCount == 0 && this.field_70173_aa > 20) {
            final DriveableType type = this.getDriveableType();
            damage = (int)(damage * type.fallDamageFactor) * 0.25f;
            this.getDriveableData().parts.get(EnumDriveablePart.core).health -= (int)damage + 1;
            if (type.wheelPositions.length > 0) {
                this.attackPart(type.wheelPositions[0].part, DamageSource.field_76379_h, damage / 5.0f);
            }
            no_damage = false;
        }
    }
    
    private static float averageAngles(float a, final float b) {
        FlansMod.log("Pre  " + a + " " + b);
        float pi;
        for (pi = 3.1415927f; a > b + pi; a -= 2.0f * pi) {}
        while (a < b - pi) {
            a += 2.0f * pi;
        }
        float avg;
        for (avg = (a + b) / 2.0f; avg > pi; avg -= 2.0f * pi) {}
        while (avg < -pi) {
            avg += 2.0f * pi;
        }
        FlansMod.log("Post " + a + " " + b + " " + avg);
        return avg;
    }
    
    private static Vec3 subtract(final Vec3 a, final Vec3 b) {
        return Vec3.func_72443_a(a.field_72450_a - b.field_72450_a, a.field_72448_b - b.field_72448_b, a.field_72449_c - b.field_72449_c);
    }
    
    private static Vec3 crossProduct(final Vec3 a, final Vec3 b) {
        return Vec3.func_72443_a(a.field_72448_b * b.field_72449_c - a.field_72449_c * b.field_72448_b, a.field_72449_c * b.field_72450_a - a.field_72450_a * b.field_72449_c, a.field_72450_a * b.field_72448_b - a.field_72448_b * b.field_72450_a);
    }
    
    @Override
    public boolean landVehicle() {
        return true;
    }
    
    @Override
    public boolean func_70097_a(final DamageSource damagesource, final float i) {
        final VehicleType type = this.getVehicleType();
        if (this.field_70170_p.field_72995_K || this.field_70128_L || damagesource.field_76373_n.equals("onFire") || damagesource.field_76373_n.equals("inFire") || damagesource.field_76373_n.equals("lava") || damagesource.field_76373_n.equals("arrow") || damagesource.field_76373_n.equals("arrow") || (!type.vanillaDamage && damagesource.field_76373_n.equals("player") && this.seats[0] != null && this.seats[0].field_70153_n != null && !type.evilGolem)) {
            return true;
        }
        if (damagesource.field_76373_n.equals("player") && damagesource.func_76346_g().field_70122_E && (this.seats[0] == null || this.seats[0].field_70153_n == null) && (!this.locked || this.owner == Factions.getFactionFromPlayer((EntityPlayer)damagesource.func_76346_g())) && !type.unpunchable) {
            this.driveableData.seatBelt = "null";
            final ItemStack vehicleStack = new ItemStack(type.item, 1, this.driveableData.paintjobID);
            vehicleStack.field_77990_d = new NBTTagCompound();
            this.driveableData.writeToNBT(vehicleStack.field_77990_d);
            this.func_70099_a(vehicleStack, 0.5f);
            this.func_70106_y();
        }
        float poopoo = 1.0f;
        if (damagesource.field_76373_n.equals("explosion")) {
            poopoo = type.explosionResistance;
        }
        return super.func_70097_a(damagesource, i * poopoo);
    }
    
    public VehicleType getVehicleType() {
        return VehicleType.getVehicle(this.driveableType);
    }
    
    @Override
    public float getPlayerRoll() {
        return this.axes.getRoll();
    }
    
    public float getAvgWheelSpeedXYZ() {
        final float speed = (float)(this.wheels[0].getSpeedXYZ() + this.wheels[1].getSpeedXYZ() + this.wheels[2].getSpeedXYZ() + this.wheels[3].getSpeedXYZ()) / 4.0f;
        return speed;
    }
    
    public void Recoil() {
    }
    
    @Override
    protected void dropItemsOnPartDeath(final Vector3f midpoint, final DriveablePart part) {
    }
    
    @Override
    public String getBombInventoryName() {
        return "Mines";
    }
    
    @Override
    public String getMissileInventoryName() {
        return "Shells";
    }
    
    @Override
    public boolean hasMouseControlMode() {
        return false;
    }
    
    public boolean hasAllTyres() {
        boolean tyres = true;
        if (!this.isPartHealthy(EnumDriveablePart.frontLeftWheel)) {
            tyres = false;
        }
        if (!this.isPartHealthy(EnumDriveablePart.frontRightWheel)) {
            tyres = false;
        }
        if (!this.isPartHealthy(EnumDriveablePart.backLeftWheel)) {
            tyres = false;
        }
        if (!this.isPartHealthy(EnumDriveablePart.backRightWheel)) {
            tyres = false;
        }
        return tyres;
    }
    
    public boolean hasBothTracks() {
        boolean tracks = true;
        if (!this.isPartHealthy(EnumDriveablePart.leftTrack)) {
            tracks = false;
        }
        if (!this.isPartHealthy(EnumDriveablePart.rightTrack)) {
            tracks = false;
        }
        return tracks;
    }
    
    @Override
    public void func_70106_y() {
        super.func_70106_y();
        for (final EntityWheel wheel : this.wheels) {
            if (wheel != null) {
                wheel.func_70106_y();
            }
        }
    }
}
