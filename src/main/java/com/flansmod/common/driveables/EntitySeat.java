// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import net.minecraft.util.Vec3;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import akka.japi.Pair;
import com.hfr.faction.relations.FactionRelations;
import net.minecraft.util.EnumChatFormatting;
import java.util.ArrayList;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.network.PacketSeatCheck;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.player.EntityPlayerMP;
import com.flansmod.client.FlansModClient;
import java.util.Iterator;
import java.util.List;
import com.hfr.faction.Factions;
import com.hfr.faction.IFaction;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemLead;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.tools.ItemTool;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.network.PacketSeatUpdates;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.FlansMod;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.RotatedAxes;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import com.hbm.blocks.ILookOverlay;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import com.flansmod.api.IControllable;
import net.minecraft.entity.Entity;

public class EntitySeat extends Entity implements IControllable, IEntityAdditionalSpawnData, ILookOverlay
{
    @SideOnly(Side.CLIENT)
    public boolean foundDriveable;
    private int driveableID;
    private int seatID;
    public EntityDriveable driveable;
    @SideOnly(Side.CLIENT)
    public float playerRoll;
    @SideOnly(Side.CLIENT)
    public float prevPlayerRoll;
    public Seat seatInfo;
    public boolean driver;
    public RotatedAxes looking;
    public RotatedAxes prevLooking;
    public RotatedAxes playerLooking;
    public RotatedAxes prevPlayerLooking;
    public int gunDelay;
    public int nintendoSwitch;
    public int exitTimer;
    public float minigunSpeed;
    public float minigunAngle;
    public int soundDelay;
    public int yawSoundDelay;
    public int pitchSoundDelay;
    public boolean playYawSound;
    public boolean playPitchSound;
    private double playerPosX;
    private double playerPosY;
    private double playerPosZ;
    private float playerYaw;
    private float playerPitch;
    private double prevPlayerPosX;
    private double prevPlayerPosY;
    private double prevPlayerPosZ;
    private float prevPlayerYaw;
    private float prevPlayerPitch;
    private boolean shooting;
    public Entity lastRiddenByEntity;
    public EntityPlayer Seatbelt;
    public int SeatBeltMemory;
    public int timeLimitDriveableNull;
    public boolean calculator;
    public boolean walterCalculator;
    public boolean walterMortar;
    public float targetYaw;
    public float targetPitch;
    
    public EntitySeat(final World world) {
        super(world);
        this.nintendoSwitch = 10;
        this.exitTimer = 20;
        this.yawSoundDelay = 0;
        this.pitchSoundDelay = 0;
        this.playYawSound = false;
        this.playPitchSound = false;
        this.Seatbelt = null;
        this.SeatBeltMemory = 0;
        this.timeLimitDriveableNull = 0;
        this.calculator = false;
        this.walterCalculator = false;
        this.walterMortar = false;
        this.targetYaw = 0.0f;
        this.targetPitch = 0.0f;
        this.setSize(1.0f, 1.0f);
        this.prevLooking = new RotatedAxes();
        this.looking = new RotatedAxes();
        this.playerLooking = new RotatedAxes();
        this.prevPlayerLooking = new RotatedAxes();
        this.lastRiddenByEntity = null;
    }
    
    public EntitySeat(final World world, final EntityDriveable d, final int id) {
        this(world);
        this.driveable = d;
        this.driveableID = d.getEntityId();
        this.seatInfo = this.driveable.getDriveableType().seats[id];
        this.driver = (id == 0);
        this.setPosition(d.posX, d.posY, d.posZ);
        final double posX = this.posX;
        this.prevPlayerPosX = posX;
        this.playerPosX = posX;
        final double posY = this.posY;
        this.prevPlayerPosY = posY;
        this.playerPosY = posY;
        final double posZ = this.posZ;
        this.prevPlayerPosZ = posZ;
        this.playerPosZ = posZ;
        this.looking.setAngles((this.seatInfo.minYaw + this.seatInfo.maxYaw) / 2.0f, 0.0f, 0.0f);
        this.playerLooking.setAngles((this.seatInfo.minYaw + this.seatInfo.maxYaw) / 2.0f, 0.0f, 0.0f);
        if (this.driveable.getDriveableType().gunRange) {
            this.calculator = true;
        }
        if (this.driveable.getDriveableType().walterGunRange) {
            this.walterCalculator = true;
        }
        if (this.driveable.getDriveableType().walterMortar) {
            this.walterMortar = true;
        }
    }
    
    public boolean attackEntityFrom(final DamageSource source, final float f) {
        if (this.seatInfo == null || this.seatInfo.hardpoint || this.seatInfo.helipad || this.seatInfo.carrier || (this.seatInfo.id == 0 && !this.driveable.getDriveableType().hijackablePilot)) {
            return false;
        }
        if (this.riddenByEntity != null) {
            if (this.exitTimer > 0) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(this.posX, this.posY, this.posZ, "woodHit"), this.posX, this.posY, this.posZ, 25.0f, this.dimension);
            }
            else if (this.exitTimer <= 5) {
                FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(this.posX, this.posY, this.posZ, "woodBreak"), this.posX, this.posY, this.posZ, 25.0f, this.dimension);
            }
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("crit", this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0), this.posX, this.posY, this.posZ, 25.0f, this.dimension);
            this.exitTimer -= 5;
            FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this));
            return false;
        }
        return false;
    }
    
    public boolean canBeCollidedWith() {
        return !this.isDead;
    }
    
    protected void entityInit() {
    }
    
    @SideOnly(Side.CLIENT)
    public EntityLivingBase getCamera() {
        return this.driveable.getCamera();
    }
    
    public float getCameraDistance() {
        return (this.foundDriveable && this.seatID == 0) ? this.driveable.getDriveableType().cameraDistance : 5.0f;
    }
    
    public Entity getControllingEntity() {
        return this.riddenByEntity;
    }
    
    public boolean getInvincible() {
        return this.seatInfo.invincible;
    }
    
    public float getMinigunSpeed() {
        return this.minigunSpeed;
    }
    
    public ItemStack getPickedResult(final MovingObjectPosition target) {
        if (this.worldObj.isRemote && !this.foundDriveable) {
            return null;
        }
        return this.driveable.getPickedResult(target);
    }
    
    public float getPlayerRoll() {
        while (this.playerRoll - this.prevPlayerRoll > 180.0f) {
            this.playerRoll -= 360.0f;
        }
        while (this.playerRoll - this.prevPlayerRoll < -180.0f) {
            this.playerRoll += 360.0f;
        }
        return this.playerRoll;
    }
    
    public float getShadowSize() {
        return 4.0f;
    }
    
    public boolean interactFirst(final EntityPlayer entityplayer) {
        if (this.isDead) {
            return false;
        }
        if (this.worldObj.isRemote) {
            return false;
        }
        if (this.seatID == 0) {
            FlansMod.proxy.doTutorialStuff(entityplayer, this.driveable);
        }
        final ItemStack currentItem = entityplayer.getCurrentEquippedItem();
        if (currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables) {
            return true;
        }
        if (currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.key) {
            return true;
        }
        if (currentItem != null && currentItem.getItem() instanceof ItemGun && ((ItemGun)currentItem.getItem()).type.shootMelee) {
            return true;
        }
        if (!this.seatInfo.enterable) {
            return true;
        }
        if (currentItem != null && currentItem.getItem() instanceof ItemPlane && (this.seatInfo.carrier || this.seatInfo.helipad || this.seatInfo.hardpoint)) {
            if (currentItem.getItem() instanceof ItemPlane) {
                final ItemPlane plane = (ItemPlane)currentItem.getItem();
                final PlaneType type = plane.type;
                if (type.mass < this.driveable.getDriveableType().weightLimit) {
                    if (type.helipadLandable || (type.carrierLandable && this.seatInfo.carrier) || (type.parasitePlane && this.seatInfo.hardpoint)) {
                        if (!this.worldObj.isRemote) {
                            final DriveableData data = plane.getPlaneData(currentItem, this.worldObj);
                            if (data != null) {
                                this.worldObj.spawnEntityInWorld((Entity)new EntityPlane(this.worldObj, this.posX + 0.5, this.posY + 2.5, this.posZ + 0.5, entityplayer, type, data, false));
                            }
                        }
                        if (!entityplayer.capabilities.isCreativeMode) {
                            final ItemStack itemStack = currentItem;
                            --itemStack.stackSize;
                        }
                    }
                    else if (type.carrierLandable && this.seatInfo.helipad) {
                        entityplayer.addChatMessage((IChatComponent)new ChatComponentText("This carrier slot can only handle Helicopters, VTOL Planes or Seaplanes"));
                    }
                    else if (type.carrierLandable || (type.helipadLandable && this.seatInfo.hardpoint)) {
                        entityplayer.addChatMessage((IChatComponent)new ChatComponentText("This slot can only handle parasite aircraft"));
                    }
                }
                else if ((type.carrierLandable || type.helipadLandable) && type.mass < 1.5f * this.driveable.getDriveableType().weightLimit) {
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("This plane (" + type.mass + " kg) is too heavy to properly operate on this carrier! (" + this.driveable.getDriveableType().weightLimit + " kg Weight Limit)"));
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("However, you CAN launch it: Park the carrier near land and place the plane nearby to load it onto the deck"));
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("Also, you will not be able to land back on the carrier after takeoff"));
                }
                else if (!type.carrierLandable && !type.helipadLandable && this.seatInfo.carrier && type.mass < 1.5f * this.driveable.getDriveableType().weightLimit) {
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("This aircraft is not meant to operate on carriers, however it CAN take off for a one-way trip!"));
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("Park the carrier near land and place the aircraft nearby to load it onto the deck"));
                }
                else {
                    entityplayer.addChatMessage((IChatComponent)new ChatComponentText("This plane (" + type.mass + " kg) is way too heavy for this carrier (" + this.driveable.getDriveableType().weightLimit + " kg Weight Limit)"));
                }
            }
            return true;
        }
        if (currentItem != null && currentItem.getItem() instanceof ItemLead) {
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityLiving && !(this.riddenByEntity instanceof EntityPlayer)) {
                final EntityLiving mob = (EntityLiving)this.riddenByEntity;
                this.riddenByEntity.mountEntity((Entity)null);
                mob.setLeashedToEntity((Entity)entityplayer, true);
                return true;
            }
            final double checkRange = 10.0;
            final List nearbyMobs = this.worldObj.getEntitiesWithinAABB((Class)EntityLiving.class, AxisAlignedBB.getBoundingBox(this.posX - checkRange, this.posY - checkRange, this.posZ - checkRange, this.posX + checkRange, this.posY + checkRange, this.posZ + checkRange));
            for (final Object obj : nearbyMobs) {
                final EntityLiving entity = (EntityLiving)obj;
                if (entity.getLeashed() && entity.getLeashedToEntity() == entityplayer && !this.driveable.locked) {
                    entity.mountEntity((Entity)this);
                    this.looking.setAngles(-entity.rotationYaw, entity.rotationPitch, 0.0f);
                    entity.clearLeashed(true, !entityplayer.capabilities.isCreativeMode);
                }
            }
            return true;
        }
        else {
            if (this.riddenByEntity != null) {
                return false;
            }
            if (this.driveable.owner == null || this.driveable.owner.getMembersOfRankAndAbove(IFaction.PermLevel.PLEBEIAN).contains(entityplayer.getDisplayName())) {
                entityplayer.mountEntity((Entity)this);
                if (this.driveable.owner == null) {
                    this.driveable.owner = Factions.getFactionFromPlayer(entityplayer);
                }
                return true;
            }
            if (!this.driveable.locked) {
                entityplayer.mountEntity((Entity)this);
                if (!this.driveable.stolen && this.driver) {
                    this.driveable.stolen = true;
                    this.driveable.owner.removeTransportVehicle((Entity)this.driveable);
                    this.driveable.owner = Factions.getFactionFromPlayer(entityplayer);
                }
                return true;
            }
            int time = 5;
            if (this.driveable.unlocks.containsKey(entityplayer.getDisplayName())) {
                time += this.driveable.unlocks.get(entityplayer.getDisplayName());
            }
            this.driveable.unlocks.put(entityplayer.getDisplayName(), time);
            if (time > this.driveable.timeToUnlock) {
                this.driveable.unlock(entityplayer);
            }
            return true;
        }
    }
    
    public boolean isDead() {
        return this.isDead;
    }
    
    public void onMouseMoved(final int deltaX, final int deltaY) {
        if (!this.foundDriveable) {
            return;
        }
        this.prevLooking = this.looking.clone();
        this.prevPlayerLooking = this.playerLooking.clone();
        if (this.driver) {
            this.driveable.onMouseMoved(deltaX, deltaY);
        }
        if (!this.driver || !FlansModClient.controlModeMouse || !this.driveable.hasMouseControlMode() || this.driver || !this.driveable.getDriveableType().centralControl || this.riddenByEntity == null) {
            final float lookSpeed = 4.0f;
            float newPlayerPitch = this.playerLooking.getPitch() - deltaY / lookSpeed * FlansMod.proxy.getMouseSensitivity();
            if (newPlayerPitch < -this.seatInfo.maxPitch) {
                newPlayerPitch = -this.seatInfo.maxPitch;
            }
            float newPlayerYaw = this.playerLooking.getYaw() + deltaX / lookSpeed * FlansMod.proxy.getMouseSensitivity();
            float otherNewPlayerYaw = newPlayerYaw - 360.0f;
            if (newPlayerYaw < 0.0f) {
                otherNewPlayerYaw = newPlayerYaw + 360.0f;
            }
            if (newPlayerYaw < this.seatInfo.minYaw || newPlayerYaw > this.seatInfo.maxYaw) {
                if (otherNewPlayerYaw < this.seatInfo.minYaw || otherNewPlayerYaw > this.seatInfo.maxYaw) {
                    final float newPlayerYawDistFromRange = Math.min(Math.abs(newPlayerYaw - this.seatInfo.minYaw), Math.abs(newPlayerYaw - this.seatInfo.maxYaw));
                    final float otherPlayerNewYawDistFromRange = Math.min(Math.abs(otherNewPlayerYaw - this.seatInfo.minYaw), Math.abs(otherNewPlayerYaw - this.seatInfo.maxYaw));
                    if (newPlayerYawDistFromRange <= otherPlayerNewYawDistFromRange) {
                        if (newPlayerYaw > this.seatInfo.maxYaw) {
                            newPlayerYaw = this.seatInfo.maxYaw;
                        }
                    }
                    else {
                        if (otherNewPlayerYaw > this.seatInfo.maxYaw) {
                            otherNewPlayerYaw = this.seatInfo.maxYaw;
                        }
                        if (otherNewPlayerYaw < this.seatInfo.minYaw) {
                            otherNewPlayerYaw = this.seatInfo.minYaw;
                        }
                        if (newPlayerYaw < 0.0f) {
                            newPlayerYaw = otherNewPlayerYaw - 360.0f;
                        }
                        else {
                            newPlayerYaw = otherNewPlayerYaw + 360.0f;
                        }
                    }
                }
            }
            this.playerLooking.setAngles(newPlayerYaw, newPlayerPitch, 0.0f);
            if (this.driveable.disabled) {
                return;
            }
            float targetX = this.playerLooking.getYaw();
            if (!FlansModClient.controlModeMouse && this.driver && !(this.driveable instanceof EntityPlane)) {
                targetX = this.targetYaw;
            }
            float yawToMove;
            for (yawToMove = targetX - this.looking.getYaw(); yawToMove > 180.0f; yawToMove -= 360.0f) {}
            while (yawToMove <= -180.0f) {
                yawToMove += 360.0f;
            }
            float signDeltaX = 0.0f;
            if (yawToMove > this.seatInfo.aimingSpeed.x / 20.0f && !this.seatInfo.legacyAiming) {
                signDeltaX = 0.1f;
            }
            else if (yawToMove < -(this.seatInfo.aimingSpeed.x / 20.0f) && !this.seatInfo.legacyAiming) {
                signDeltaX = -0.1f;
            }
            else {
                signDeltaX = 0.0f;
            }
            float newYaw = 0.0f;
            if (FlansModClient.controlModeMouse) {
                if (signDeltaX == 0.0f && deltaX == 0) {
                    newYaw = this.playerLooking.getYaw();
                }
                else if (Math.abs(yawToMove) < 2.0f) {
                    newYaw = this.looking.getYaw() + signDeltaX * this.seatInfo.aimingSpeed.x;
                }
                else {
                    newYaw = this.looking.getYaw() + 10.0f * signDeltaX * this.seatInfo.aimingSpeed.x;
                }
            }
            else {
                newYaw = this.targetYaw;
            }
            float otherNewYaw = newYaw - 360.0f;
            if (newYaw < 0.0f) {
                otherNewYaw = newYaw + 360.0f;
            }
            if (newYaw < this.seatInfo.minYaw || newYaw > this.seatInfo.maxYaw) {
                if (otherNewYaw < this.seatInfo.minYaw || otherNewYaw > this.seatInfo.maxYaw) {
                    final float newYawDistFromRange = Math.min(Math.abs(newYaw - this.seatInfo.minYaw), Math.abs(newYaw - this.seatInfo.maxYaw));
                    final float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - this.seatInfo.minYaw), Math.abs(otherNewYaw - this.seatInfo.maxYaw));
                    if (newYawDistFromRange <= otherNewYawDistFromRange) {
                        if (newYaw > this.seatInfo.maxYaw) {
                            newYaw = this.seatInfo.maxYaw;
                        }
                        if (newYaw < this.seatInfo.minYaw) {
                            newYaw = this.seatInfo.minYaw;
                        }
                    }
                    else {
                        if (otherNewYaw > this.seatInfo.maxYaw) {
                            otherNewYaw = this.seatInfo.maxYaw;
                        }
                        if (otherNewYaw < this.seatInfo.minYaw) {
                            otherNewYaw = this.seatInfo.minYaw;
                        }
                        if (newYaw < 0.0f) {
                            newYaw = otherNewYaw - 360.0f;
                        }
                        else {
                            newYaw = otherNewYaw + 360.0f;
                        }
                    }
                }
            }
            float targetY = this.playerLooking.getPitch();
            if (!FlansModClient.controlModeMouse && this.driver && !(this.driveable instanceof EntityPlane)) {
                targetY = this.targetPitch;
            }
            float pitchToMove;
            for (pitchToMove = targetY - this.looking.getPitch(); pitchToMove > 180.0f; pitchToMove -= 360.0f) {}
            while (pitchToMove <= -180.0f) {
                pitchToMove += 360.0f;
            }
            float signDeltaY = 0.0f;
            if (pitchToMove > this.seatInfo.aimingSpeed.y / 20.0f && !this.seatInfo.legacyAiming) {
                signDeltaY = 0.1f;
            }
            else if (pitchToMove < -(this.seatInfo.aimingSpeed.y / 20.0f) && !this.seatInfo.legacyAiming) {
                signDeltaY = -0.1f;
            }
            else {
                signDeltaY = 0.0f;
            }
            float newPitch = 0.0f;
            float minYawToMove = 0.0f;
            float currentYawToMove = 0.0f;
            if (this.seatInfo.latePitch) {
                minYawToMove = (float)Math.sqrt(pitchToMove / this.seatInfo.aimingSpeed.y * (pitchToMove / this.seatInfo.aimingSpeed.y)) * this.seatInfo.aimingSpeed.x;
            }
            else {
                minYawToMove = 360.0f;
            }
            currentYawToMove = (float)Math.sqrt(yawToMove * yawToMove);
            if (FlansModClient.controlModeMouse && this.driveable.hasMouseControlMode() && (this.seatInfo.legacyAiming || (signDeltaY == 0.0f && deltaY == 0))) {
                newPitch = this.playerLooking.getPitch();
            }
            else if (Math.abs(pitchToMove) < 2.0f && !this.seatInfo.yawBeforePitch && currentYawToMove < minYawToMove) {
                newPitch = this.looking.getPitch() + signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (Math.abs(pitchToMove) < 2.0f && this.seatInfo.yawBeforePitch && signDeltaX == 0.0f) {
                newPitch = this.looking.getPitch() + signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (Math.abs(pitchToMove) < 2.0f && this.seatInfo.yawBeforePitch && signDeltaX != 0.0f) {
                newPitch = this.looking.getPitch();
            }
            else if (!this.seatInfo.yawBeforePitch && currentYawToMove < minYawToMove) {
                newPitch = this.looking.getPitch() + 10.0f * signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (this.seatInfo.yawBeforePitch && signDeltaX == 0.0f) {
                newPitch = this.looking.getPitch() + 10.0f * signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (this.seatInfo.yawBeforePitch && signDeltaX != 0.0f) {
                newPitch = this.looking.getPitch();
            }
            else {
                newPitch = this.looking.getPitch();
            }
            if (newPitch > -this.seatInfo.minPitch) {
                newPitch = -this.seatInfo.minPitch;
            }
            if (newPitch < -this.seatInfo.maxPitch) {
                newPitch = -this.seatInfo.maxPitch;
            }
            this.looking.setAngles(newYaw, newPitch, 0.0f);
            if (signDeltaX != 0.0f && this.seatInfo.traverseSounds) {
                this.playYawSound = true;
            }
            else {
                this.playYawSound = false;
            }
            if (signDeltaY != 0.0f && !this.seatInfo.yawBeforePitch && currentYawToMove < minYawToMove) {
                this.playPitchSound = true;
            }
            else if (signDeltaY != 0.0f && this.seatInfo.yawBeforePitch && signDeltaX == 0.0f) {
                this.playPitchSound = true;
            }
            else {
                this.playPitchSound = false;
            }
            FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this));
        }
    }
    
    public void onUpdate() {
        super.onUpdate();
        if (this.driver && this.riddenByEntity == null && this.driveable != null && this.driveable.type != null && !this.driveable.type.evilGolem) {
            this.prevLooking = this.looking.clone();
            this.prevPlayerLooking = this.playerLooking.clone();
        }
        if (this.seatInfo != null && (this.seatInfo.helipad || this.seatInfo.carrier || this.seatInfo.hardpoint) && this.riddenByEntity == null) {
            this.setSize(5.0f, 5.0f);
        }
        else if (this.seatInfo != null && (this.seatInfo.helipad || this.seatInfo.carrier || this.seatInfo.hardpoint) && this.riddenByEntity != null) {
            this.setSize(0.1f, 0.1f);
        }
        if (this.worldObj.isRemote && !this.foundDriveable) {
            if (this.worldObj.getEntityByID(this.driveableID) instanceof EntityDriveable) {
                this.driveable = (EntityDriveable)this.worldObj.getEntityByID(this.driveableID);
            }
            if (this.driveable == null) {
                return;
            }
            this.foundDriveable = true;
            this.driveable.seats[this.seatID] = this;
            this.seatInfo = this.driveable.getDriveableType().seats[this.seatID];
            this.looking.setAngles((this.seatInfo.minYaw + this.seatInfo.maxYaw) / 2.0f, 0.0f, 0.0f);
            this.playerLooking.setAngles((this.seatInfo.minYaw + this.seatInfo.maxYaw) / 2.0f, 0.0f, 0.0f);
            this.prevLooking = this.looking.clone();
            final double posX = this.driveable.posX;
            this.posX = posX;
            this.prevPlayerPosX = posX;
            this.playerPosX = posX;
            final double posY = this.driveable.posY;
            this.posY = posY;
            this.prevPlayerPosY = posY;
            this.playerPosY = posY;
            final double posZ = this.driveable.posZ;
            this.posZ = posZ;
            this.prevPlayerPosZ = posZ;
            this.playerPosZ = posZ;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
        if (this.driveable == null) {
            return;
        }
        EntityDriveable entD;
        if (this.worldObj.getEntityByID(this.driveableID) instanceof EntityDriveable) {
            entD = (EntityDriveable)this.worldObj.getEntityByID(this.driveableID);
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
            this.setDead();
        }
        if (this.gunDelay > 0) {
            --this.gunDelay;
        }
        if (this.soundDelay > 0) {
            --this.soundDelay;
        }
        if (this.yawSoundDelay > 0) {
            --this.yawSoundDelay;
        }
        if (this.pitchSoundDelay > 0) {
            --this.pitchSoundDelay;
        }
        if (this.nintendoSwitch > 0) {
            --this.nintendoSwitch;
        }
        if (this.worldObj.isRemote && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.driveable != null && (this.seatID > 0 || (this.seatID == 0 && !this.driveable.getDriveableType().walterMortar && !this.driveable.getDriveableType().walterGunRange && this.driveable instanceof EntityVehicle)) && !FlansModClient.controlModeMouse) {
            FlansMod.proxy.changeControlMode((EntityPlayer)this.riddenByEntity);
        }
        if (this.exitTimer < 20) {
            ++this.exitTimer;
        }
        if (this.exitTimer < 0 || (this.driveable.gtfo && this.riddenByEntity != null && !this.driver)) {
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlane && this.driveable != null && this.driveable instanceof EntityPlane) {
                final EntityPlane Mothership = (EntityPlane)this.driveable;
                Mothership.accidentDelay = 100;
            }
            this.riddenByEntity.mountEntity((Entity)null);
            this.exitTimer = 20;
        }
        if (!this.worldObj.isRemote) {
            if (this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer) {
                final EntityPlayerMP mp = (EntityPlayerMP)this.riddenByEntity;
                if (this.Seatbelt != mp) {
                    this.Seatbelt = (EntityPlayer)this.riddenByEntity;
                    this.SeatBeltMemory = 1200;
                }
            }
            else if (this.Seatbelt != null && this.SeatBeltMemory > 0) {
                --this.SeatBeltMemory;
            }
            final int testerino = 0;
            if (!this.worldObj.playerEntities.contains(this.Seatbelt)) {
                if (this.Seatbelt != null) {
                    this.mountEntity((Entity)null);
                }
            }
            if (this.Seatbelt != null && this.SeatBeltMemory == 0) {
                this.Seatbelt = null;
            }
        }
        if (this.playYawSound && this.yawSoundDelay == 0 && this.seatInfo.traverseSounds) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.seatInfo.yawSound, false);
            this.yawSoundDelay = this.seatInfo.yawSoundLength;
        }
        if (this.playPitchSound && this.pitchSoundDelay == 0 && this.seatInfo.traverseSounds) {
            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 50.0, this.dimension, this.seatInfo.pitchSound, false);
            this.pitchSoundDelay = this.seatInfo.pitchSoundLength;
        }
        if (!(this.riddenByEntity instanceof EntityPlayer) || !FlansMod.proxy.isThePlayer((EntityPlayer)this.riddenByEntity)) {
            this.playYawSound = false;
            this.playPitchSound = false;
            this.yawSoundDelay = 0;
            this.pitchSoundDelay = 0;
        }
        if (this.worldObj.isRemote) {
            if (this.driver && this.riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.riddenByEntity) && FlansModClient.controlModeMouse && this.driveable.hasMouseControlMode()) {
                this.looking = new RotatedAxes();
                this.playerLooking = new RotatedAxes();
            }
            if (this.seatInfo.invisiblePassenger && this.riddenByEntity != null) {
                this.riddenByEntity.setInvisible(true);
            }
            final Vector3f xAxis = this.driveable.axes.findLocalAxesGlobally(this.looking).getXAxis();
            final Vector3f yAxis = this.driveable.axes.findLocalAxesGlobally(this.looking).getYAxis();
            final Vector3f zAxis = this.driveable.axes.findLocalAxesGlobally(this.looking).getZAxis();
            final Vector3f yOffset = this.driveable.axes.findLocalVectorGlobally(new Vector3f(0.0f, (this.riddenByEntity == null) ? 0.0f : ((float)this.riddenByEntity.getYOffset()), 0.0f));
            for (int i = 0; i < 10; ++i) {}
            if ((this.lastRiddenByEntity instanceof EntityPlayer && this.riddenByEntity == null && FlansModClient.proxy.isThePlayer((EntityPlayer)this.lastRiddenByEntity)) || (this.driveable != null && this.driveable.type != null && this.driveable.type.evilGolem)) {
                FlansMod.getPacketHandler().sendToServer(new PacketSeatCheck(this));
            }
        }
        if ((this.driveable.getDriveableType().centralControl && this.riddenByEntity == null && this.seatInfo.id > 0 && this.driveable.seats[0] != null && this.driveable.seats[0].riddenByEntity != null) || (this.driveable.seats[0] != null && this.driveable instanceof EntityVehicle && this.driveable.getDriveableType().evilGolem && ((EntityVehicle)this.driveable).target != null && ((EntityVehicle)this.driveable).humanTarget != null)) {
            if (this.driveable.getDriveableType().evilGolem) {
                final RotatedAxes evilTarget = new RotatedAxes(((EntityVehicle)this.driveable).aimYaw, ((EntityVehicle)this.driveable).aimPitch, 0.0f);
                final RotatedAxes evilTargetAA = new RotatedAxes(((EntityVehicle)this.driveable).aimYawAA, ((EntityVehicle)this.driveable).aimPitchAA, 0.0f);
                this.playerLooking = evilTarget;
            }
            else {
                this.playerLooking = this.driveable.seats[0].playerLooking;
            }
            this.prevLooking = this.looking.clone();
            final float targetX = this.playerLooking.getYaw();
            float yawToMove;
            for (yawToMove = targetX - this.looking.getYaw(); yawToMove > 180.0f; yawToMove -= 360.0f) {}
            while (yawToMove <= -180.0f) {
                yawToMove += 360.0f;
            }
            float signDeltaX = 0.0f;
            if (yawToMove > this.seatInfo.aimingSpeed.x / 20.0f && !this.seatInfo.legacyAiming) {
                signDeltaX = 0.1f;
            }
            else if (yawToMove < -(this.seatInfo.aimingSpeed.x / 20.0f) && !this.seatInfo.legacyAiming) {
                signDeltaX = -0.1f;
            }
            else {
                signDeltaX = 0.0f;
            }
            float newYaw = 0.0f;
            if (signDeltaX == 0.0f) {
                newYaw = this.playerLooking.getYaw();
            }
            else if (Math.abs(yawToMove) < 2.0f) {
                newYaw = this.looking.getYaw() + signDeltaX * this.seatInfo.aimingSpeed.x;
            }
            else {
                newYaw = this.looking.getYaw() + 10.0f * signDeltaX * this.seatInfo.aimingSpeed.x;
            }
            float otherNewYaw = newYaw - 360.0f;
            if (newYaw < 0.0f) {
                otherNewYaw = newYaw + 360.0f;
            }
            if (newYaw < this.seatInfo.minYaw || newYaw > this.seatInfo.maxYaw) {
                if (otherNewYaw < this.seatInfo.minYaw || otherNewYaw > this.seatInfo.maxYaw) {
                    final float newYawDistFromRange = Math.min(Math.abs(newYaw - this.seatInfo.minYaw), Math.abs(newYaw - this.seatInfo.maxYaw));
                    final float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - this.seatInfo.minYaw), Math.abs(otherNewYaw - this.seatInfo.maxYaw));
                    if (newYawDistFromRange <= otherNewYawDistFromRange) {
                        if (newYaw > this.seatInfo.maxYaw) {
                            newYaw = this.seatInfo.maxYaw;
                        }
                        if (newYaw < this.seatInfo.minYaw) {
                            newYaw = this.seatInfo.minYaw;
                        }
                    }
                    else {
                        if (otherNewYaw > this.seatInfo.maxYaw) {
                            otherNewYaw = this.seatInfo.maxYaw;
                        }
                        if (otherNewYaw < this.seatInfo.minYaw) {
                            otherNewYaw = this.seatInfo.minYaw;
                        }
                        if (newYaw < 0.0f) {
                            newYaw = otherNewYaw - 360.0f;
                        }
                        else {
                            newYaw = otherNewYaw + 360.0f;
                        }
                    }
                }
            }
            final float targetY = this.playerLooking.getPitch();
            float pitchToMove;
            for (pitchToMove = targetY - this.looking.getPitch(); pitchToMove > 180.0f; pitchToMove -= 360.0f) {}
            while (pitchToMove <= -180.0f) {
                pitchToMove += 360.0f;
            }
            float signDeltaY = 0.0f;
            if (pitchToMove > this.seatInfo.aimingSpeed.y / 20.0f && !this.seatInfo.legacyAiming) {
                signDeltaY = 0.1f;
            }
            else if (pitchToMove < -(this.seatInfo.aimingSpeed.y / 20.0f) && !this.seatInfo.legacyAiming) {
                signDeltaY = -0.1f;
            }
            else {
                signDeltaY = 0.0f;
            }
            float newPitch = 0.0f;
            float minYawToMove = 0.0f;
            float currentYawToMove = 0.0f;
            if (this.seatInfo.latePitch) {
                minYawToMove = (float)Math.sqrt(pitchToMove / this.seatInfo.aimingSpeed.y * (pitchToMove / this.seatInfo.aimingSpeed.y)) * this.seatInfo.aimingSpeed.x;
            }
            else {
                minYawToMove = 360.0f;
            }
            currentYawToMove = (float)Math.sqrt(yawToMove * yawToMove);
            if (Math.abs(pitchToMove) < 2.0f && !this.seatInfo.yawBeforePitch && currentYawToMove < minYawToMove) {
                newPitch = this.looking.getPitch() + signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (Math.abs(pitchToMove) < 2.0f && this.seatInfo.yawBeforePitch && signDeltaX == 0.0f) {
                newPitch = this.looking.getPitch() + signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (Math.abs(pitchToMove) < 2.0f && this.seatInfo.yawBeforePitch && signDeltaX != 0.0f) {
                newPitch = this.looking.getPitch();
            }
            else if (!this.seatInfo.yawBeforePitch && currentYawToMove < minYawToMove) {
                newPitch = this.looking.getPitch() + 10.0f * signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (this.seatInfo.yawBeforePitch && signDeltaX == 0.0f) {
                newPitch = this.looking.getPitch() + 10.0f * signDeltaY * this.seatInfo.aimingSpeed.y;
            }
            else if (this.seatInfo.yawBeforePitch && signDeltaX != 0.0f) {
                newPitch = this.looking.getPitch();
            }
            else {
                newPitch = this.looking.getPitch();
            }
            if (newPitch > -this.seatInfo.minPitch) {
                newPitch = -this.seatInfo.minPitch;
            }
            if (newPitch < -this.seatInfo.maxPitch) {
                newPitch = -this.seatInfo.maxPitch;
            }
            this.looking.setAngles(newYaw, newPitch, 0.0f);
        }
        if ((this.driveable.getDriveableType().centralControl && this.riddenByEntity == null && this.driveable.shootingTertiary && this.driveable.seats[0] != null && this.driveable.seats[0].riddenByEntity != null && this.driveable.seats[0].riddenByEntity instanceof EntityPlayer && this.driveable.getDriveableData().parts.get(this.seatInfo.part).health > 0 && this.driveable.seats[0].playerLooking.getYaw() + 8.0f >= this.looking.getYaw() && this.driveable.seats[0].playerLooking.getYaw() - 8.0f <= this.looking.getYaw() && this.driveable.seats[0].playerLooking.getPitch() + 8.0f >= this.looking.getPitch() && this.driveable.seats[0].playerLooking.getPitch() - 8.0f <= this.looking.getPitch()) || (this.driveable instanceof EntityVehicle && this.driveable.getDriveableType().evilGolem && this.driveable.shootingTertiary && ((EntityVehicle)this.driveable).target != null && ((EntityVehicle)this.driveable).humanTarget != null && this.driveable.getDriveableData().parts.get(this.seatInfo.part).health > 0 && this.driveable.seats[0].playerLooking.getYaw() + 8.0f >= this.looking.getYaw() && this.driveable.seats[0].playerLooking.getYaw() - 8.0f <= this.looking.getYaw() && this.driveable.seats[0].playerLooking.getPitch() + 8.0f >= this.looking.getPitch() && this.driveable.seats[0].playerLooking.getPitch() - 8.0f <= this.looking.getPitch())) {
            EntityPlayer player = (EntityPlayer)this.driveable.seats[0].riddenByEntity;
            if (this.driveable instanceof EntityVehicle && this.driveable.getDriveableType().evilGolem) {
                player = ((EntityVehicle)this.driveable).humanTarget;
            }
            final GunType gun = this.seatInfo.gunType;
            if (((this.driveable != null && this.driveable.atSea && gun != null && gun.mode != EnumFireMode.MINIGUN) || this.minigunSpeed > 2.0f) && this.gunDelay <= 0 && TeamsManager.bulletsEnabled && this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID] != null) {
                final ItemStack bulletItemStack = this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID];
                if (gun != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && !TeamsManager.violence) {
                    final ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
                    if (gun.isAmmo(bullet)) {
                        final Vector3f gunOrigin = Vector3f.add(this.driveable.axes.findLocalVectorGlobally(this.seatInfo.gunOrigin), new Vector3f(this.driveable.posX, this.driveable.posY, this.driveable.posZ), null);
                        final RotatedAxes globalLookAxes = this.driveable.axes.findLocalAxesGlobally(this.looking);
                        final Vector3f shootVec = this.driveable.axes.findLocalVectorGlobally(this.looking.getXAxis());
                        final Vector3f yOffset2 = this.driveable.axes.findLocalVectorGlobally(new Vector3f(0.0, this.getMountedYOffset(), 0.0));
                        if (this.seatInfo.barrels == 1) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * 0.0f, gunOrigin.y, gunOrigin.z + shootVec.x * 0.0f), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.seatInfo.barrels == 2) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.seatInfo.barrels == 3) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * 0.0f, gunOrigin.y, gunOrigin.z + shootVec.x * 0.0f), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.seatInfo.barrels == 4) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.seatInfo.barrels == 5) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * 0.0f, gunOrigin.y, gunOrigin.z + shootVec.x * 0.0f), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.seatInfo.barrels == 6) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread * 1.5f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset2, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread * 1.5f)), null), shootVec, (EntityLivingBase)player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType(), this.driveable.getDriveableType().evilGolem));
                        }
                        if (this.soundDelay <= 0) {
                            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 200.0, this.dimension, gun.shootSound, false);
                            this.soundDelay = gun.shootSoundLength;
                        }
                        final int damage = bulletItemStack.getMetadata();
                        if ((this.driveable.type == null || !this.driveable.type.evilGolem) && (player == null || player.capabilities == null || !player.capabilities.isCreativeMode)) {
                            bulletItemStack.setMetadata(damage + 1);
                        }
                        if (damage >= bulletItemStack.getMaxDurability()) {
                            if (player == null || (this.riddenByEntity != null && ((EntityPlayer)this.riddenByEntity).capabilities.isCreativeMode)) {
                                bulletItemStack.setMetadata(0);
                            }
                            else {
                                final ItemStack itemStack = this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID];
                                --itemStack.stackSize;
                                bulletItemStack.setMetadata(0);
                                if (this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID].stackSize <= 0) {
                                    this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID] = null;
                                }
                            }
                        }
                        this.gunDelay = (int)gun.shootDelay;
                    }
                }
            }
        }
        if (this.riddenByEntity instanceof EntityPlayer && this.shooting) {
            this.pressKey(9, (EntityPlayer)this.riddenByEntity);
        }
        this.minigunSpeed *= 0.95f;
        this.minigunAngle += this.minigunSpeed;
        this.lastRiddenByEntity = this.riddenByEntity;
    }
    
    public boolean pressKey(final int key, final EntityPlayer player) {
        if (this.driver && (!this.worldObj.isRemote || this.foundDriveable)) {
            return this.driveable.pressKey(key, player);
        }
        if (this.worldObj.isRemote) {
            if (this.foundDriveable) {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
                if (key == 9) {
                    this.minigunSpeed += 0.1f;
                }
            }
            return false;
        }
        if (key == 6 && this.riddenByEntity != null) {
            --this.exitTimer;
            --this.exitTimer;
            if (this.exitTimer > 20) {
                return true;
            }
        }
        if (key == 20 && this.riddenByEntity != null && this.driveable.seats[0].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s0 <= 0) {
            PlayerHandler.getPlayerData(player).s0 = 5;
            player.mountEntity((Entity)this.driveable.seats[0]);
        }
        if (key == 21 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 1 && this.driveable.seats[2].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s1 <= 0) {
            PlayerHandler.getPlayerData(player).s1 = 5;
            player.mountEntity((Entity)this.driveable.seats[2]);
        }
        if (key == 22 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 2 && this.driveable.seats[3].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s2 <= 0) {
            PlayerHandler.getPlayerData(player).s2 = 5;
            player.mountEntity((Entity)this.driveable.seats[3]);
        }
        if (key == 23 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 3 && this.driveable.seats[4].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s3 <= 0) {
            PlayerHandler.getPlayerData(player).s3 = 5;
            player.mountEntity((Entity)this.driveable.seats[4]);
        }
        if (key == 24 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 4 && this.driveable.seats[5].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s4 <= 0) {
            PlayerHandler.getPlayerData(player).s4 = 5;
            player.mountEntity((Entity)this.driveable.seats[5]);
        }
        if (key == 25 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 5 && this.driveable.seats[6].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s5 <= 0) {
            PlayerHandler.getPlayerData(player).s5 = 5;
            player.mountEntity((Entity)this.driveable.seats[6]);
        }
        if (key == 26 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 6 && this.driveable.seats[7].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s6 <= 0) {
            PlayerHandler.getPlayerData(player).s6 = 5;
            player.mountEntity((Entity)this.driveable.seats[7]);
        }
        if (key == 27 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 7 && this.driveable.seats[8].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s7 <= 0) {
            PlayerHandler.getPlayerData(player).s7 = 5;
            player.mountEntity((Entity)this.driveable.seats[8]);
        }
        if (key == 28 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 8 && this.driveable.seats[9].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s8 <= 0) {
            PlayerHandler.getPlayerData(player).s8 = 5;
            player.mountEntity((Entity)this.driveable.seats[9]);
        }
        if (key == 29 && this.riddenByEntity != null && this.driveable.getDriveableType().numPassengers > 9 && this.driveable.seats[10].riddenByEntity == null && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s9 <= 0) {
            PlayerHandler.getPlayerData(player).s9 = 5;
            player.mountEntity((Entity)this.driveable.seats[10]);
        }
        if (key == 19 && this.riddenByEntity != null && (this.driveable.seats[0].riddenByEntity == player || this.driveable.seats[0].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).nintendoSwitch <= 0 && this.driveable.seats[0].riddenByEntity == null) {
            PlayerHandler.getPlayerData(player).nintendoSwitch = 10;
            player.mountEntity((Entity)this.driveable.seats[0]);
            this.driveable.nintendoSwitchLite = 10;
        }
        if (key == 9) {
            final GunType gun = this.seatInfo.gunType;
            this.minigunSpeed += 0.1f;
            if (((gun != null && gun.mode != EnumFireMode.MINIGUN) || this.minigunSpeed > 2.0f) && this.gunDelay <= 0 && TeamsManager.bulletsEnabled && this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID] != null) {
                final ItemStack bulletItemStack = this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID];
                if (gun != null && this.driveable.atSea && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && !TeamsManager.violence) {
                    final ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
                    if (gun.isAmmo(bullet)) {
                        final Vector3f gunOrigin = Vector3f.add(this.driveable.axes.findLocalVectorGlobally(this.seatInfo.gunOrigin), new Vector3f(this.driveable.posX, this.driveable.posY, this.driveable.posZ), null);
                        final RotatedAxes globalLookAxes = this.driveable.axes.findLocalAxesGlobally(this.looking);
                        final Vector3f shootVec = this.driveable.axes.findLocalVectorGlobally(this.looking.getXAxis());
                        final Vector3f yOffset = this.driveable.axes.findLocalVectorGlobally(new Vector3f(0.0f, (float)player.getMountedYOffset(), 0.0f));
                        if (this.seatInfo.barrels == 1) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.seatInfo.barrels == 2) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.seatInfo.barrels == 3) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.seatInfo.barrels == 4) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (1.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (1.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.seatInfo.barrels == 5) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z - shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z + shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z + 2.0f * shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * this.seatInfo.barrelSpread, gunOrigin.y, gunOrigin.z - 2.0f * shootVec.x * this.seatInfo.barrelSpread), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.seatInfo.barrels == 6) {
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (this.seatInfo.barrelSpread / 2.0f), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (1.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (1.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x - shootVec.z * (2.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z - shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                            this.worldObj.spawnEntityInWorld((Entity)((ItemShootable)bulletItemStack.getItem()).getEntity(this.worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x + shootVec.z * (2.5 * this.seatInfo.barrelSpread), gunOrigin.y, gunOrigin.z + shootVec.x * (this.seatInfo.barrelSpread / 2.0f)), null), shootVec, (EntityLivingBase)this.riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getMetadata(), this.driveable.getDriveableType()));
                        }
                        if (this.soundDelay <= 0) {
                            PacketPlaySound.sendSoundPacket(this.posX, this.posY, this.posZ, 200.0, this.dimension, gun.shootSound, false);
                            this.soundDelay = gun.shootSoundLength;
                        }
                        final int damage = bulletItemStack.getMetadata();
                        if (!((EntityPlayer)this.riddenByEntity).capabilities.isCreativeMode) {
                            bulletItemStack.setMetadata(damage + 1);
                        }
                        if (damage >= bulletItemStack.getMaxDurability()) {
                            if (((EntityPlayer)this.riddenByEntity).capabilities.isCreativeMode) {
                                bulletItemStack.setMetadata(0);
                            }
                            else {
                                final ItemStack itemStack = this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID];
                                --itemStack.stackSize;
                                bulletItemStack.setMetadata(0);
                                if (this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID].stackSize <= 0) {
                                    this.driveable.getDriveableData().ammo[this.seatInfo.gunnerID] = null;
                                }
                            }
                        }
                        this.gunDelay = (int)gun.shootDelay;
                    }
                }
            }
        }
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void printHook(final RenderGameOverlayEvent.Pre event, final World world, final int x, final int y, final int z) {
        final EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
        if (player.isRiding() && player.ridingEntity instanceof EntitySeat) {
            return;
        }
        final List<String> text = new ArrayList<String>();
        if (!this.foundDriveable) {
            return;
        }
        String faction = this.driveable.ownerName;
        boolean ownedByPlayerFaction = false;
        text.add(EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + (this.driver ? "Driver" : "Passenger") + " seat");
        if (this.driveable.ownerName != null) {
            final String own = (Factions.getFactionFromPlayer((EntityPlayer)Minecraft.getMinecraft().thePlayer) == null) ? "Wilderness" : Factions.getFactionFromPlayer((EntityPlayer)Minecraft.getMinecraft().thePlayer).getName();
            if (faction != null && !faction.equals("None") && !faction.isEmpty()) {
                if (faction.equals(own)) {
                    faction = EnumChatFormatting.GREEN + faction;
                    ownedByPlayerFaction = true;
                }
                else if (FactionRelations.relations.containsKey(new Pair((Object)faction, (Object)own))) {
                    faction = FactionRelations.relations.get(new Pair((Object)faction, (Object)own)).color + faction;
                }
                else if (FactionRelations.relations.containsKey(new Pair((Object)own, (Object)faction))) {
                    faction = FactionRelations.relations.get(new Pair((Object)own, (Object)faction)).color + faction;
                }
                else {
                    faction = EnumChatFormatting.YELLOW + faction;
                }
            }
            else {
                faction += EnumChatFormatting.DARK_GRAY;
                ownedByPlayerFaction = true;
            }
        }
        text.add(((this.driveable.stolen && !faction.equals("None")) ? "Stolen by " : "Owner: ") + faction);
        text.add(((ownedByPlayerFaction != this.driveable.locked) ? EnumChatFormatting.RED : EnumChatFormatting.GREEN) + (this.driveable.locked ? "Locked" : "Unlocked"));
        if (this.driveable.stolen) {
            text.add((ownedByPlayerFaction ? EnumChatFormatting.RED : EnumChatFormatting.GREEN) + "Stolen");
        }
        else if (!ownedByPlayerFaction) {
            text.add(EnumChatFormatting.DARK_RED + "Hold right click to steal");
            if (this.driveable.unlocks.containsKey(Minecraft.getMinecraft().thePlayer.getDisplayName())) {
                text.add(EnumChatFormatting.DARK_GRAY + "Progress: " + Math.round(100.0 * Math.min(1.0, this.driveable.unlocks.get(Minecraft.getMinecraft().thePlayer.getDisplayName()) / (double)this.driveable.timeToUnlock)) + "%");
            }
        }
        if ((!this.driveable.locked || ownedByPlayerFaction) && this.seatInfo.enterable && this.riddenByEntity == null) {
            text.add(EnumChatFormatting.GREEN + "Use right click to enter");
        }
        ILookOverlay.printGeneric(event, this.driveable.getDriveableType().name, 16776960, 4210688, (List)text);
    }
    
    protected void readEntityFromNBT(final NBTTagCompound tags) {
    }
    
    public void readSpawnData(final ByteBuf data) {
        this.driveableID = data.readInt();
        this.driveable = (EntityDriveable)this.worldObj.getEntityByID(this.driveableID);
        this.seatID = data.readInt();
        this.driver = (this.seatID == 0);
        if (this.driveable != null) {
            this.seatInfo = this.driveable.getDriveableType().seats[this.seatID];
            this.looking.setAngles((this.seatInfo.minYaw + this.seatInfo.maxYaw) / 2.0f, 0.0f, 0.0f);
            final double posX = this.driveable.posX;
            this.posX = posX;
            this.prevPlayerPosX = posX;
            this.playerPosX = posX;
            final double posY = this.driveable.posY;
            this.posY = posY;
            this.prevPlayerPosY = posY;
            this.playerPosY = posY;
            final double posZ = this.driveable.posZ;
            this.posZ = posZ;
            this.prevPlayerPosZ = posZ;
            this.playerPosZ = posZ;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
    }
    
    public void setDead() {
        super.setDead();
    }
    
    public void setPositionAndRotation2(final double x, final double y, final double z, final float yaw, final float pitch, final int i) {
    }
    
    public void updateKeyHeldState(final int key, final boolean held) {
        if (this.worldObj.isRemote && this.foundDriveable) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));
        }
        if (this.driver) {
            this.driveable.updateKeyHeldState(key, held);
        }
        else if (key == 9) {
            this.shooting = held;
        }
    }
    
    public void updatePosition() {
        if (this.worldObj.isRemote && !this.foundDriveable) {
            return;
        }
        this.prevPlayerPosX = this.playerPosX;
        this.prevPlayerPosY = this.playerPosY;
        this.prevPlayerPosZ = this.playerPosZ;
        this.prevPlayerYaw = this.playerYaw;
        this.prevPlayerPitch = this.playerPitch;
        final Vector3f localPosition = new Vector3f(this.seatInfo.x / 16.0f, this.seatInfo.y / 16.0f, this.seatInfo.z / 16.0f);
        if (this.driveable != null && this.driveable.seats != null && this.driveable.seats[0] != null && this.driveable.seats[0].looking != null) {
            final RotatedAxes yawOnlyLooking = new RotatedAxes(this.driveable.seats[0].looking.getYaw(), (this.driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel) ? this.driveable.seats[0].looking.getPitch() : 0.0f, 0.0f);
            final Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(this.seatInfo.rotatedOffset);
            Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, (this.driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel) ? rotatedOffset.y : 0.0f, rotatedOffset.z), localPosition);
        }
        final Vector3f relativePosition = this.driveable.axes.findLocalVectorGlobally(localPosition);
        this.setPosition(this.driveable.posX + relativePosition.x, this.driveable.posY + relativePosition.y, this.driveable.posZ + relativePosition.z);
        if (this.riddenByEntity != null) {
            final DriveableType type = this.driveable.getDriveableType();
            final Vec3 yOffset = this.driveable.rotate(0.0, this.riddenByEntity.getYOffset(), 0.0).toVec3();
            this.playerPosX = this.posX + yOffset.xCoord;
            this.playerPosY = this.posY + yOffset.yCoord;
            this.playerPosZ = this.posZ + yOffset.zCoord;
            final Entity riddenByEntity = this.riddenByEntity;
            final Entity field_70153_n2 = this.riddenByEntity;
            final double prevPlayerPosX = this.prevPlayerPosX;
            field_70153_n2.prevPosX = prevPlayerPosX;
            riddenByEntity.lastTickPosX = prevPlayerPosX;
            final Entity field_70153_n3 = this.riddenByEntity;
            final Entity field_70153_n4 = this.riddenByEntity;
            final double prevPlayerPosY = this.prevPlayerPosY;
            field_70153_n4.prevPosY = prevPlayerPosY;
            field_70153_n3.lastTickPosY = prevPlayerPosY;
            final Entity field_70153_n5 = this.riddenByEntity;
            final Entity field_70153_n6 = this.riddenByEntity;
            final double prevPlayerPosZ = this.prevPlayerPosZ;
            field_70153_n6.prevPosZ = prevPlayerPosZ;
            field_70153_n5.lastTickPosZ = prevPlayerPosZ;
            this.riddenByEntity.setPosition(this.playerPosX, this.playerPosY, this.playerPosZ);
            final RotatedAxes globalLookAxes = this.driveable.axes.findLocalAxesGlobally(this.playerLooking);
            this.playerYaw = -90.0f + globalLookAxes.getYaw();
            this.playerPitch = globalLookAxes.getPitch();
            final double dYaw = this.playerYaw - this.prevPlayerYaw;
            if (dYaw > 180.0) {
                this.prevPlayerYaw += 360.0f;
            }
            if (dYaw < -180.0) {
                this.prevPlayerYaw -= 360.0f;
            }
            if (this.riddenByEntity instanceof EntityPlayer) {
                this.riddenByEntity.prevRotationYaw = this.prevPlayerYaw;
                this.riddenByEntity.prevRotationPitch = this.prevPlayerPitch;
                this.riddenByEntity.rotationYaw = this.playerYaw;
                this.riddenByEntity.rotationPitch = this.playerPitch;
            }
            if (this.worldObj.isRemote) {
                this.prevPlayerRoll = this.playerRoll;
                this.playerRoll = -globalLookAxes.getRoll();
            }
        }
    }
    
    public void updatePositionClient() {
        if (this.worldObj.isRemote && !this.foundDriveable) {
            return;
        }
        if (this.worldObj.isRemote) {
            this.prevPlayerPosX = this.playerPosX;
            this.prevPlayerPosY = this.playerPosY;
            this.prevPlayerPosZ = this.playerPosZ;
            this.prevPlayerYaw = this.playerYaw;
            this.prevPlayerPitch = this.playerPitch;
            final Vector3f localPosition = new Vector3f(this.seatInfo.x / 16.0f, this.seatInfo.y / 16.0f, this.seatInfo.z / 16.0f);
            if (this.driveable != null && this.driveable.seats != null && this.driveable.seats[0] != null && this.driveable.seats[0].looking != null) {
                final RotatedAxes yawOnlyLooking = new RotatedAxes(this.driveable.seats[0].looking.getYaw(), (this.driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel) ? this.driveable.seats[0].looking.getPitch() : 0.0f, 0.0f);
                final Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(this.seatInfo.rotatedOffset);
                Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, (this.driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel) ? rotatedOffset.y : 0.0f, rotatedOffset.z), localPosition);
            }
            final Vector3f relativePosition = this.driveable.axes.findLocalVectorGlobally(localPosition);
            this.setPosition(this.driveable.posX + relativePosition.x, this.driveable.posY + relativePosition.y, this.driveable.posZ + relativePosition.z);
            if (this.riddenByEntity != null) {
                final DriveableType type = this.driveable.getDriveableType();
                final Vec3 yOffset = this.driveable.rotate(0.0, this.riddenByEntity.getYOffset(), 0.0).toVec3();
                this.playerPosX = this.posX + yOffset.xCoord;
                this.playerPosY = this.posY + yOffset.yCoord;
                this.playerPosZ = this.posZ + yOffset.zCoord;
                final Entity riddenByEntity = this.riddenByEntity;
                final Entity field_70153_n2 = this.riddenByEntity;
                final double prevPlayerPosX = this.prevPlayerPosX;
                field_70153_n2.prevPosX = prevPlayerPosX;
                riddenByEntity.lastTickPosX = prevPlayerPosX;
                final Entity field_70153_n3 = this.riddenByEntity;
                final Entity field_70153_n4 = this.riddenByEntity;
                final double prevPlayerPosY = this.prevPlayerPosY;
                field_70153_n4.prevPosY = prevPlayerPosY;
                field_70153_n3.lastTickPosY = prevPlayerPosY;
                final Entity field_70153_n5 = this.riddenByEntity;
                final Entity field_70153_n6 = this.riddenByEntity;
                final double prevPlayerPosZ = this.prevPlayerPosZ;
                field_70153_n6.prevPosZ = prevPlayerPosZ;
                field_70153_n5.lastTickPosZ = prevPlayerPosZ;
                this.riddenByEntity.setPosition(this.playerPosX, this.playerPosY, this.playerPosZ);
                final RotatedAxes globalLookAxes = this.driveable.axes.findLocalAxesGlobally(this.playerLooking);
                this.playerYaw = -90.0f + globalLookAxes.getYaw();
                this.playerPitch = globalLookAxes.getPitch();
                final double dYaw = this.playerYaw - this.prevPlayerYaw;
                if (dYaw > 180.0) {
                    this.prevPlayerYaw += 360.0f;
                }
                if (dYaw < -180.0) {
                    this.prevPlayerYaw -= 360.0f;
                }
                if (this.riddenByEntity instanceof EntityPlayer) {
                    this.riddenByEntity.prevRotationYaw = this.prevPlayerYaw;
                    this.riddenByEntity.prevRotationPitch = this.prevPlayerPitch;
                    this.riddenByEntity.rotationYaw = this.playerYaw;
                    this.riddenByEntity.rotationPitch = this.playerPitch;
                }
                if (this.worldObj.isRemote) {
                    this.prevPlayerRoll = this.playerRoll;
                    this.playerRoll = -globalLookAxes.getRoll();
                }
            }
        }
    }
    
    public void updateRiderPosition() {
        if (this.riddenByEntity instanceof EntityPlayer) {
            this.riddenByEntity.rotationYaw = this.playerYaw;
            this.riddenByEntity.rotationPitch = this.playerPitch;
            this.riddenByEntity.prevRotationYaw = this.prevPlayerYaw;
            this.riddenByEntity.prevRotationPitch = this.prevPlayerPitch;
        }
        final Entity riddenByEntity = this.riddenByEntity;
        final Entity field_70153_n2 = this.riddenByEntity;
        final double prevPlayerPosX = this.prevPlayerPosX;
        field_70153_n2.prevPosX = prevPlayerPosX;
        riddenByEntity.lastTickPosX = prevPlayerPosX;
        final Entity field_70153_n3 = this.riddenByEntity;
        final Entity field_70153_n4 = this.riddenByEntity;
        final double prevPlayerPosY = this.prevPlayerPosY;
        field_70153_n4.prevPosY = prevPlayerPosY;
        field_70153_n3.lastTickPosY = prevPlayerPosY;
        final Entity field_70153_n5 = this.riddenByEntity;
        final Entity field_70153_n6 = this.riddenByEntity;
        final double prevPlayerPosZ = this.prevPlayerPosZ;
        field_70153_n6.prevPosZ = prevPlayerPosZ;
        field_70153_n5.lastTickPosZ = prevPlayerPosZ;
    }
    
    protected void writeEntityToNBT(final NBTTagCompound tags) {
    }
    
    public boolean writeMountToNBT(final NBTTagCompound tags) {
        return false;
    }
    
    public void writeSpawnData(final ByteBuf data) {
        data.writeInt(this.driveableID);
        data.writeInt(this.seatInfo.id);
    }
    
    public boolean writeToNBTOptional(final NBTTagCompound tags) {
        return false;
    }
}
