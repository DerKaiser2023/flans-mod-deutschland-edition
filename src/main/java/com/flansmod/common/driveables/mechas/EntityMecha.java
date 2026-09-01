// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import com.flansmod.common.network.PacketParticle;
import net.minecraft.util.AxisAlignedBB;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.ArrayList;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import java.util.Iterator;
import com.flansmod.common.network.PacketMechaControl;
import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.guns.InventoryHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.ForgeHooks;
import net.minecraft.world.WorldSettings;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.Minecraft;
import com.flansmod.client.gui.GuiDriveableController;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import java.util.Random;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.network.PacketDriveableDamage;
import com.flansmod.common.driveables.DriveablePart;
import net.minecraft.util.DamageSource;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.Item;
import com.flansmod.common.guns.ItemBullet;
import net.minecraft.inventory.IInventory;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.Entity;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.FlansMod;
import net.minecraft.item.ItemStack;
import com.flansmod.common.tools.ItemTool;
import cpw.mods.fml.common.network.ByteBufUtils;
import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTBase;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.driveables.DriveableData;
import net.minecraft.world.World;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.vector.Vector3i;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;

public class EntityMecha extends EntityDriveable
{
    private int ticksSinceUsed;
    public int toggleTimer;
    private float moveX;
    private float moveZ;
    public RotatedAxes legAxes;
    public float prevLegsYaw;
    private int jumpDelay;
    public MechaInventory inventory;
    public float legSwing;
    public int shootDelayLeft;
    public int shootDelayRight;
    public int soundDelayLeft;
    public int soundDelayRight;
    public Vector3i breakingBlock;
    public float breakingProgress;
    private float rocketTimer;
    private int diamondTimer;
    public int legAnimTimer;
    public int legAnimMax;
    public int animState;
    public float second;
    public int lastHealth;
    public int lastFlare;
    public float fivesec;
    public float poopooThrottle;
    public int targetLeftUpper;
    public int targetLeftLower;
    public int targetLeftFoot;
    public int targetLeftUpperSpeed;
    public int targetLeftLowerSpeed;
    public int targetLeftFootSpeed;
    int targetRightUpper;
    int targetRightLower;
    int targetRightFoot;
    int targetRightUpperSpeed;
    int targetRightLowerSpeed;
    int targetRightFootSpeed;
    public float leftLegUpperAngle;
    public float leftLegLowerAngle;
    public float leftFootAngle;
    public float rightLegUpperAngle;
    public float rightLegLowerAngle;
    public float rightFootAngle;
    public float prevLeftLegUpperAngle;
    public float prevLeftLegLowerAngle;
    public float prevLeftFootAngle;
    public float prevRightLegUpperAngle;
    public float prevRightLegLowerAngle;
    public float prevRightFootAngle;
    public float legPosition;
    public int stompDelay;
    public GunAnimations leftAnimations;
    public GunAnimations rightAnimations;
    boolean couldNotFindFuel;
    private int exitTimer;
    
    public EntityMecha(final World world) {
        super(world);
        this.toggleTimer = 0;
        this.moveX = 0.0f;
        this.moveZ = 0.0f;
        this.prevLegsYaw = 0.0f;
        this.jumpDelay = 0;
        this.legSwing = 0.0f;
        this.shootDelayLeft = 0;
        this.shootDelayRight = 0;
        this.soundDelayLeft = 0;
        this.soundDelayRight = 0;
        this.breakingBlock = null;
        this.breakingProgress = 0.0f;
        this.rocketTimer = 0.0f;
        this.diamondTimer = 0;
        this.legAnimTimer = 1;
        this.legAnimMax = 1;
        this.second = 0.0f;
        this.lastHealth = 0;
        this.lastFlare = 0;
        this.fivesec = 0.0f;
        this.poopooThrottle = 0.0f;
        this.targetLeftUpper = 0;
        this.targetLeftLower = 0;
        this.targetLeftFoot = 0;
        this.targetLeftUpperSpeed = 1;
        this.targetLeftLowerSpeed = 1;
        this.targetLeftFootSpeed = 1;
        this.targetRightUpper = 0;
        this.targetRightLower = 0;
        this.targetRightFoot = 0;
        this.targetRightUpperSpeed = 1;
        this.targetRightLowerSpeed = 1;
        this.targetRightFootSpeed = 1;
        this.leftLegUpperAngle = 0.0f;
        this.leftLegLowerAngle = 0.0f;
        this.leftFootAngle = 0.0f;
        this.rightLegUpperAngle = 0.0f;
        this.rightLegLowerAngle = 0.0f;
        this.rightFootAngle = 0.0f;
        this.prevLeftLegUpperAngle = 0.0f;
        this.prevLeftLegLowerAngle = 0.0f;
        this.prevLeftFootAngle = 0.0f;
        this.prevRightLegUpperAngle = 0.0f;
        this.prevRightLegLowerAngle = 0.0f;
        this.prevRightFootAngle = 0.0f;
        this.legPosition = 0.0f;
        this.leftAnimations = new GunAnimations();
        this.rightAnimations = new GunAnimations();
        this.exitTimer = 40;
        this.func_70105_a(2.0f, 3.0f);
        this.field_70138_W = 3.0f;
        this.legAxes = new RotatedAxes();
        this.inventory = new MechaInventory(this);
        this.isMecha = true;
    }
    
    public EntityMecha(final World world, final double x, final double y, final double z, final MechaType type, final DriveableData data, final NBTTagCompound tags) {
        super(world, type, data);
        this.toggleTimer = 0;
        this.moveX = 0.0f;
        this.moveZ = 0.0f;
        this.prevLegsYaw = 0.0f;
        this.jumpDelay = 0;
        this.legSwing = 0.0f;
        this.shootDelayLeft = 0;
        this.shootDelayRight = 0;
        this.soundDelayLeft = 0;
        this.soundDelayRight = 0;
        this.breakingBlock = null;
        this.breakingProgress = 0.0f;
        this.rocketTimer = 0.0f;
        this.diamondTimer = 0;
        this.legAnimTimer = 1;
        this.legAnimMax = 1;
        this.second = 0.0f;
        this.lastHealth = 0;
        this.lastFlare = 0;
        this.fivesec = 0.0f;
        this.poopooThrottle = 0.0f;
        this.targetLeftUpper = 0;
        this.targetLeftLower = 0;
        this.targetLeftFoot = 0;
        this.targetLeftUpperSpeed = 1;
        this.targetLeftLowerSpeed = 1;
        this.targetLeftFootSpeed = 1;
        this.targetRightUpper = 0;
        this.targetRightLower = 0;
        this.targetRightFoot = 0;
        this.targetRightUpperSpeed = 1;
        this.targetRightLowerSpeed = 1;
        this.targetRightFootSpeed = 1;
        this.leftLegUpperAngle = 0.0f;
        this.leftLegLowerAngle = 0.0f;
        this.leftFootAngle = 0.0f;
        this.rightLegUpperAngle = 0.0f;
        this.rightLegLowerAngle = 0.0f;
        this.rightFootAngle = 0.0f;
        this.prevLeftLegUpperAngle = 0.0f;
        this.prevLeftLegLowerAngle = 0.0f;
        this.prevLeftFootAngle = 0.0f;
        this.prevRightLegUpperAngle = 0.0f;
        this.prevRightLegLowerAngle = 0.0f;
        this.prevRightFootAngle = 0.0f;
        this.legPosition = 0.0f;
        this.leftAnimations = new GunAnimations();
        this.rightAnimations = new GunAnimations();
        this.exitTimer = 40;
        this.legAxes = new RotatedAxes();
        this.func_70105_a(2.0f, 3.0f);
        this.field_70138_W = 3.0f;
        this.func_70107_b(x, y, z);
        this.initType(type, false);
        this.inventory = new MechaInventory(this, tags);
        this.isMecha = true;
    }
    
    public EntityMecha(final World world, final double x, final double y, final double z, final EntityPlayer placer, final MechaType type, final DriveableData data, final NBTTagCompound tags) {
        this(world, x, y, z, type, data, tags);
        this.rotateYaw(placer.field_70177_z + 90.0f);
        this.legAxes.rotateGlobalYaw(placer.field_70177_z + 90.0f);
        this.prevLegsYaw = this.legAxes.getYaw();
        this.isMecha = true;
    }
    
    @Override
    protected void initType(final DriveableType type, final boolean clientSide) {
        super.initType(type, clientSide);
        this.func_70105_a(((MechaType)type).width, ((MechaType)type).height);
        this.field_70138_W = (float)((MechaType)type).stepHeight;
        this.isMecha = true;
        this.driveableData.morale = (int)this.getMechaType().morale;
    }
    
    @Override
    protected void func_70014_b(final NBTTagCompound tag) {
        super.func_70014_b(tag);
        tag.func_74776_a("LegsYaw", this.legAxes.getYaw());
        tag.func_74782_a("Inventory", (NBTBase)this.inventory.writeToNBT(new NBTTagCompound()));
        this.isMecha = true;
    }
    
    @Override
    protected void func_70037_a(final NBTTagCompound tag) {
        super.func_70037_a(tag);
        this.legAxes.setAngles(tag.func_74760_g("LegsYaw"), 0.0f, 0.0f);
        this.inventory.readFromNBT(tag.func_74775_l("Inventory"));
        this.isMecha = true;
    }
    
    @Override
    public void writeSpawnData(final ByteBuf data) {
        super.writeSpawnData(data);
        ByteBufUtils.writeTag(data, this.inventory.writeToNBT(new NBTTagCompound()));
        this.isMecha = true;
    }
    
    @Override
    public void readSpawnData(final ByteBuf data) {
        super.readSpawnData(data);
        this.legAxes.rotateGlobalYaw(this.axes.getYaw());
        this.prevLegsYaw = this.legAxes.getYaw();
        this.inventory.readFromNBT(ByteBufUtils.readTag(data));
        this.isMecha = true;
    }
    
    @Override
    public void onMouseMoved(final int deltaX, final int deltaY) {
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
        final MechaType type = this.getMechaType();
        for (int i = 0; i <= type.numPassengers; ++i) {
            if (this.seats[i].func_130002_c(entityplayer)) {
                return true;
            }
        }
        return false;
    }
    
    public MechaType getMechaType() {
        return MechaType.getMecha(this.driveableType);
    }
    
    @Override
    public boolean pressKey(final int key, final EntityPlayer player) {
        final MechaType type = this.getMechaType();
        final DriveableData data = this.getDriveableData();
        if (this.field_70170_p.field_72995_K && (key == 6 || key == 8 || key == 9)) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
            return true;
        }
        switch (key) {
            case 0: {
                return true;
            }
            case 1: {
                return true;
            }
            case 2: {
                return true;
            }
            case 3: {
                return true;
            }
            case 4: {
                final boolean canThrustCreatively = this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
                if (this.field_70122_E && this.jumpDelay == 0 && (canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && this.isPartIntact(EnumDriveablePart.hips)) {
                    this.jumpDelay = 20;
                    this.field_70181_x += type.jumpVelocity;
                    if (!canThrustCreatively) {
                        final DriveableData driveableData = data;
                        driveableData.fuelInTank -= data.engine.fuelConsumption * 0.0f;
                    }
                }
                return true;
            }
            case 5: {
                return true;
            }
            case 6: {
                --this.exitTimer;
                --this.exitTimer;
                if (this.exitTimer > 20) {
                    this.seats[0].field_70153_n.func_82142_c(false);
                }
                return true;
            }
            case 7: {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                ((EntityPlayer)this.seats[0].field_70153_n).openGui((Object)FlansMod.INSTANCE, 10, this.field_70170_p, this.field_70176_ah, this.field_70162_ai, this.field_70164_aj);
                return true;
            }
            case 8: {
                return true;
            }
            case 9: {
                return true;
            }
            case 10: {
                return true;
            }
            case 11: {
                return true;
            }
            case 12: {
                return true;
            }
            case 13: {
                return true;
            }
            case 14: {
                return true;
            }
            case 15: {
                return true;
            }
            case 16: {
                return true;
            }
            case 17: {
                return true;
            }
            case 18: {
                if (type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0) {
                    this.ticksFlareUsing = type.timeFlareUsing * 20;
                    this.flareDelay = type.flareDelay;
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
        }
        return false;
    }
    
    private boolean useItem(final boolean left) {
        if (left) {
            if (!this.isPartIntact(EnumDriveablePart.leftArm)) {
                return true;
            }
        }
        else if (!this.isPartIntact(EnumDriveablePart.rightArm)) {
            return true;
        }
        final boolean creative = !(this.seats[0].field_70153_n instanceof EntityPlayer) || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
        final ItemStack heldStack = left ? this.inventory.getStackInSlot(EnumMechaSlotType.leftTool) : this.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
        if (heldStack == null) {
            return false;
        }
        final Item heldItem = heldStack.func_77973_b();
        final MechaType mechaType = this.getMechaType();
        if (heldItem instanceof ItemMechaAddon) {
            final MechaItemType toolType = ((ItemMechaAddon)heldItem).type;
            final float reach = toolType.reach * mechaType.reach;
            Vector3f lookOrigin = new Vector3f(mechaType.seats[0].x / 16.0f, mechaType.seats[0].y / 16.0f + this.seats[0].field_70153_n.func_70042_X(), mechaType.seats[0].z / 16.0f);
            lookOrigin = this.axes.findLocalVectorGlobally(lookOrigin);
            Vector3f.add(lookOrigin, new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v), lookOrigin);
            final Vector3f lookVector = this.axes.findLocalVectorGlobally(this.seats[0].looking.findLocalVectorGlobally(new Vector3f(reach, 0.0f, 0.0f)));
            this.field_70170_p.func_72838_d((Entity)new EntityDebugVector(this.field_70170_p, lookOrigin, lookVector, 20));
            final Vector3f lookTarget = Vector3f.add(lookVector, lookOrigin, null);
            final MovingObjectPosition hit = this.field_70170_p.func_72933_a(lookOrigin.toVec3(), lookTarget.toVec3());
            if (hit != null && hit.field_72313_a == MovingObjectPosition.MovingObjectType.BLOCK) {
                if (this.breakingBlock == null || this.breakingBlock.x != hit.field_72311_b || this.breakingBlock.y != hit.field_72312_c || this.breakingBlock.z != hit.field_72309_d) {
                    this.breakingProgress = 0.0f;
                }
                this.breakingBlock = new Vector3i(hit.field_72311_b, hit.field_72312_c, hit.field_72309_d);
            }
        }
        else if (heldItem instanceof ItemGun) {
            final ItemGun gunItem = (ItemGun)heldItem;
            final GunType gunType = gunItem.type;
            if (heldStack.field_77990_d.func_74764_b("secondaryAmmo") && gunType.getSecondaryFire(heldStack)) {
                gunType.setSecondaryFire(heldStack, false);
            }
            final int delay = left ? this.shootDelayLeft : this.shootDelayRight;
            if (delay <= 0 && mechaType.isValidGun(gunType)) {
                int bulletID = 0;
                ItemStack bulletStack = null;
                while (bulletID < gunType.getNumAmmoItemsInGun(heldStack)) {
                    final ItemStack checkingStack = gunItem.getBulletItemStack(heldStack, bulletID);
                    if (checkingStack != null && checkingStack.func_77973_b() != null && checkingStack.func_77960_j() < checkingStack.func_77958_k()) {
                        bulletStack = checkingStack;
                        break;
                    }
                    ++bulletID;
                }
                if (bulletStack == null) {
                    if (!gunType.shootMelee) {
                        gunItem.reload(heldStack, gunType, this.field_70170_p, this, (IInventory)this.driveableData, this.infiniteAmmo() || creative, false);
                    }
                }
                else if (bulletStack.func_77973_b() instanceof ItemBullet) {
                    this.shoot(heldStack, gunType, bulletStack, creative, left);
                    if (this.field_70170_p.field_72995_K) {
                        final int pumpDelay = (gunType.model == null) ? 0 : gunType.model.pumpDelay;
                        final int pumpTime = (gunType.model == null) ? 1 : gunType.model.pumpTime;
                        final int hammerDelay = (gunType.model == null) ? 0 : gunType.model.hammerDelay;
                        final int casingDelay = (gunType.model == null) ? 0 : gunType.model.casingDelay;
                        final float hammerAngle = (gunType.model == null) ? 0.0f : gunType.model.hammerAngle;
                        final float althammerAngle = (gunType.model == null) ? 0.0f : gunType.model.althammerAngle;
                        if (left) {
                            this.leftAnimations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
                        }
                        else {
                            this.rightAnimations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
                        }
                    }
                    bulletStack.func_77964_b(bulletStack.func_77960_j() + 1);
                    gunItem.setBulletItemStack(heldStack, bulletStack, bulletID);
                }
            }
        }
        return true;
    }
    
    private void shoot(final ItemStack stack, final GunType gunType, final ItemStack bulletStack, final boolean creative, final boolean left) {
        final MechaType mechaType = this.getMechaType();
        final BulletType bulletType = ((ItemBullet)bulletStack.func_77973_b()).type;
        final RotatedAxes a = new RotatedAxes();
        Vector3f armVector = new Vector3f(mechaType.armLength, 0.0f, 0.0f);
        Vector3f gunVector = new Vector3f(mechaType.armLength + 1.2f * mechaType.heldItemScale, 0.5f * mechaType.heldItemScale, 0.0f);
        Vector3f armOrigin = left ? mechaType.leftArmOrigin : mechaType.rightArmOrigin;
        a.rotateGlobalYaw(this.axes.getYaw());
        armOrigin = a.findLocalVectorGlobally(armOrigin);
        a.rotateLocalPitch(-this.seats[0].looking.getPitch());
        gunVector = a.findLocalVectorGlobally(gunVector);
        armVector = a.findLocalVectorGlobally(armVector);
        Vector3f bulletOrigin = Vector3f.add(armOrigin, gunVector, null);
        bulletOrigin = Vector3f.add(new Vector3f(this.field_70165_t, this.field_70163_u, this.field_70161_v), bulletOrigin, null);
        if (!this.field_70170_p.field_72995_K) {
            for (int k = 0; k < gunType.numBullets; ++k) {
                this.field_70170_p.func_72838_d((Entity)((ItemBullet)bulletStack.func_77973_b()).getEntity(this.field_70170_p, bulletOrigin, armVector, (EntityLivingBase)this.seats[0].field_70153_n, gunType.getSpread(stack, false, false) / 2.0f, gunType.getDamage(stack), gunType.getBulletSpeed(stack), bulletStack.func_77960_j(), mechaType));
            }
        }
        if (left) {
            this.shootDelayLeft = ((gunType.mode == EnumFireMode.SEMIAUTO) ? ((int)Math.max(gunType.shootDelay, 5.0f)) : ((int)gunType.shootDelay));
        }
        else {
            this.shootDelayRight = ((gunType.mode == EnumFireMode.SEMIAUTO) ? ((int)Math.max(gunType.shootDelay, 5.0f)) : ((int)gunType.shootDelay));
        }
        if (bulletType.dropItemOnShoot != null && !creative) {
            ItemGun.dropItem(this.field_70170_p, this, bulletType.dropItemOnShoot);
        }
        if ((left ? this.soundDelayLeft : this.soundDelayRight) <= 0 && gunType.shootSound != null) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, gunType.shootSound, gunType.distortSound);
            if (left) {
                this.soundDelayLeft = gunType.shootSoundLength;
            }
            else {
                this.soundDelayRight = gunType.shootSoundLength;
            }
        }
    }
    
    private boolean driverIsCreative() {
        return this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
    }
    
    @Override
    protected void func_70069_a(final float f) {
        this.func_70097_a(DamageSource.field_76379_h, f);
    }
    
    public void setLegAngles(final float LLU, final float pLLU, final float RLU, final float pRLU, final float LLL, final float pLLL, final float RLL, final float pRLL, final float LLF, final float pLLF, final float RLF, final float pRLF) {
        this.leftLegUpperAngle = LLU;
        this.leftLegLowerAngle = LLL;
        this.leftFootAngle = LLF;
        this.rightLegUpperAngle = RLU;
        this.rightLegLowerAngle = RLL;
        this.rightFootAngle = RLF;
        this.prevLeftLegUpperAngle = pLLU;
        this.prevLeftLegLowerAngle = pLLL;
        this.prevLeftFootAngle = pLLF;
        this.prevRightLegUpperAngle = pRLU;
        this.prevRightLegLowerAngle = pRLL;
        this.prevRightFootAngle = pRLF;
    }
    
    @Override
    public boolean func_70097_a(final DamageSource damagesource, final float i) {
        final MechaType type = this.getMechaType();
        if (this.field_70170_p.field_72995_K || this.field_70128_L || damagesource.field_76373_n.equals("arrow") || (!type.vanillaDamage && damagesource.field_76373_n.equals("player") && this.seats[0] != null && this.seats[0].field_70153_n != null)) {
            return true;
        }
        if (damagesource.func_76355_l().equals("fall")) {
            final boolean takeFallDamage = type.takeFallDamage && !this.stopFallDamage();
            final boolean damageBlocksFromFalling = type.damageBlocksFromFalling || this.breakBlocksUponFalling();
            byte wouldBeNegativeDamage;
            if (i * type.fallDamageMultiplier * this.vulnerability() - 2.0f < 0.0f) {
                wouldBeNegativeDamage = 0;
            }
            else {
                wouldBeNegativeDamage = 1;
            }
            final float damageToInflict = takeFallDamage ? (i * (type.fallDamageMultiplier * this.vulnerability()) * wouldBeNegativeDamage) : 0.0f;
            final float blockDamageFromFalling = damageBlocksFromFalling ? (i * type.blockDamageFromFalling / 10.0f) : 0.0f;
            this.driveableData.parts.get(EnumDriveablePart.hips).attack(damageToInflict, false);
            this.checkParts();
            FlansMod.getPacketHandler().sendToAllAround(new PacketDriveableDamage(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, FlansMod.driveableUpdateRange, this.field_71093_bK);
            if (blockDamageFromFalling > 1.0f) {
                this.field_70170_p.func_72876_a((Entity)this, this.field_70165_t, this.field_70163_u, this.field_70161_v, blockDamageFromFalling, TeamsManager.explosions);
            }
        }
        else if (damagesource.field_76373_n.equals("player") && damagesource.func_76346_g().field_70122_E && (this.seats[0] == null || this.seats[0].field_70153_n == null) && !this.locked && !type.unpunchable) {
            final ItemStack mechaStack = new ItemStack(type.item, 1, this.driveableData.paintjobID);
            mechaStack.field_77990_d = new NBTTagCompound();
            this.driveableData.writeToNBT(mechaStack.field_77990_d);
            this.inventory.writeToNBT(mechaStack.field_77990_d);
            this.func_70099_a(mechaStack, 0.5f);
            this.func_70106_y();
        }
        else {
            this.driveableData.parts.get(EnumDriveablePart.core).attack(i * this.vulnerability(), damagesource.func_76347_k());
        }
        return true;
    }
    
    @Override
    public void func_70071_h_() {
        super.func_70071_h_();
        if (this.driveableData.panicTimer > 0) {
            final Random rand = new Random();
            this.moveZ = 2.0f * (rand.nextInt(3) - 1.0f);
            this.moveX = (float)(5 + 2 * rand.nextInt(2));
            this.throttle = 2.0f;
        }
        if (this.poopooThrottle > 0.0f) {
            this.poopooThrottle -= 0.05f;
        }
        if (this.poopooThrottle > 0.3) {
            this.poopooThrottle *= 0.98f;
        }
        if (this.poopooThrottle > 1.5) {
            this.poopooThrottle = 1.5f;
        }
        if (this.poopooThrottle < 0.0f) {
            this.poopooThrottle = 0.0f;
        }
        if (this.driveableData.panicTimer <= 0) {
            this.moveX = 0.0f;
            this.moveZ = 0.0f;
        }
        if (this.second < 20.0f) {
            ++this.second;
        }
        if (this.second >= 20.0f) {
            this.second = 0.0f;
        }
        if (this.fivesec >= 5.0f) {
            this.fivesec = 0.0f;
        }
        if (this.second == 2.0f) {
            if (this.driveableData.panicTimer > 0) {
                final DriveableData driveableData = this.driveableData;
                driveableData.panicTimer -= 2;
                this.driveableData.morale = 1;
            }
            if (this.driveableData.morale < this.getMechaType().morale) {
                final DriveableData driveableData2 = this.driveableData;
                ++driveableData2.morale;
            }
            this.lastHealth = this.getDriveableData().parts.get(EnumDriveablePart.core).health;
        }
        if (this.second == 19.0f) {
            if (this.fivesec < 5.0f) {
                ++this.fivesec;
            }
            if (this.driveableData.morale <= 0 && this.driveableData.panicTimer <= 0) {
                this.driveableData.panicTimer = this.getMechaType().panicTime;
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getMechaType().panicSound, false);
            }
            if (this.getDriveableData().parts.get(EnumDriveablePart.core).health < this.lastHealth && this.getDriveableType().panic) {
                final int cringeDamage = this.lastHealth - this.getDriveableData().parts.get(EnumDriveablePart.core).health;
                if (this.driveableData.morale > 0) {
                    final DriveableData driveableData3 = this.driveableData;
                    driveableData3.morale -= cringeDamage;
                }
                if (this.driveableData.panicTimer > 0) {
                    final DriveableData driveableData4 = this.driveableData;
                    driveableData4.panicTimer += (int)(cringeDamage * 0.25);
                }
            }
        }
        if (this.fivesec == 3.0f && this.second == 17.0f && this.driveableData.panicTimer > 0) {
            PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, "elephantAttack", false);
        }
        if (this.exitTimer < this.getDriveableType().exitTimer) {
            ++this.exitTimer;
        }
        if (this.exitTimer < 0) {
            this.seats[0].field_70153_n.func_70078_a((Entity)null);
            this.exitTimer = this.getDriveableType().exitTimer;
        }
        final boolean legDir = true;
        if (this.legPosition > 1.0f) {
            this.legPosition = 0.0f;
        }
        this.prevLeftLegUpperAngle = this.leftLegUpperAngle;
        this.prevLeftLegLowerAngle = this.leftLegLowerAngle;
        this.prevLeftFootAngle = this.leftFootAngle;
        this.prevRightLegUpperAngle = this.rightLegUpperAngle;
        this.prevRightLegLowerAngle = this.rightLegLowerAngle;
        this.prevRightFootAngle = this.rightFootAngle;
        if (this.field_70170_p.field_72995_K && (this.varFlare || this.ticksFlareUsing > 0)) {
            this.throttle = 2.0f;
        }
        if (this.field_70170_p.field_72995_K && (this.varFlare || this.ticksFlareUsing <= 0)) {
            this.throttle = 0.0f;
        }
        if (this.ticksFlareUsing > 0) {
            --this.ticksFlareUsing;
            if (this.getDriveableType().needsThrottle) {
                this.throttle = this.ticksFlareUsing * this.ticksFlareUsing * this.ticksFlareUsing * 1.25E-4f - 0.1f;
            }
        }
        if (this.flareDelay > 0) {
            --this.flareDelay;
        }
        for (final MechaType.LegNode node : this.getMechaType().legNodes) {
            if (this.legPosition >= node.lowerBound && this.legPosition <= node.upperBound) {
                if (node.legPart == 1) {
                    this.targetLeftUpper = node.rotation;
                    this.targetLeftUpperSpeed = node.speed;
                }
                else if (node.legPart == 2) {
                    this.targetLeftLower = node.rotation;
                    this.targetLeftLowerSpeed = node.speed;
                }
                else if (node.legPart == 3) {
                    this.targetLeftFoot = node.rotation;
                    this.targetLeftFootSpeed = node.speed;
                }
                else if (node.legPart == 4) {
                    this.targetRightUpper = node.rotation;
                    this.targetRightUpperSpeed = node.speed;
                }
                else if (node.legPart == 5) {
                    this.targetRightLower = node.rotation;
                    this.targetRightLowerSpeed = node.speed;
                }
                else {
                    if (node.legPart != 6) {
                        continue;
                    }
                    this.targetRightFoot = node.rotation;
                    this.targetRightFootSpeed = node.speed;
                }
            }
        }
        if (this.leftLegUpperAngle < this.targetLeftUpper) {
            this.leftLegUpperAngle += this.targetLeftUpperSpeed;
        }
        else if (this.leftLegUpperAngle > this.targetLeftUpper) {
            this.leftLegUpperAngle -= this.targetLeftUpperSpeed;
        }
        if ((float)Math.sqrt((this.leftLegUpperAngle - this.targetLeftUpper) * (this.leftLegUpperAngle - this.targetLeftUpper)) <= this.targetLeftUpperSpeed / 2) {
            this.leftLegUpperAngle = (float)this.targetLeftUpper;
        }
        if (this.rightLegUpperAngle < this.targetRightUpper) {
            this.rightLegUpperAngle += this.targetRightUpperSpeed;
        }
        else if (this.rightLegUpperAngle > this.targetRightUpper) {
            this.rightLegUpperAngle -= this.targetRightUpperSpeed;
        }
        if ((float)Math.sqrt((this.rightLegUpperAngle - this.targetRightUpper) * (this.rightLegUpperAngle - this.targetRightUpper)) <= this.targetRightUpperSpeed / 2) {
            this.rightLegUpperAngle = (float)this.targetRightUpper;
        }
        if (this.leftLegLowerAngle < this.targetLeftLower) {
            this.leftLegLowerAngle += this.targetLeftLowerSpeed;
        }
        else if (this.leftLegLowerAngle > this.targetLeftLower) {
            this.leftLegLowerAngle -= this.targetRightLowerSpeed;
        }
        if (this.rightLegLowerAngle < this.targetRightLower) {
            this.rightLegLowerAngle += this.targetRightLowerSpeed;
        }
        else if (this.rightLegLowerAngle > this.targetRightLower) {
            this.rightLegLowerAngle -= this.targetRightLowerSpeed;
        }
        if ((float)Math.sqrt((this.leftLegLowerAngle - this.targetLeftLower) * (this.leftLegLowerAngle - this.targetLeftLower)) <= this.targetLeftLowerSpeed / 2) {
            this.leftLegLowerAngle = (float)this.targetLeftLower;
        }
        if ((float)Math.sqrt((this.rightLegLowerAngle - this.targetRightLower) * (this.rightLegLowerAngle - this.targetRightLower)) <= this.targetRightLowerSpeed / 2) {
            this.rightLegLowerAngle = (float)this.targetRightLower;
        }
        if (this.leftFootAngle < this.targetLeftFoot) {
            this.leftFootAngle += this.targetLeftFootSpeed;
        }
        else if (this.leftFootAngle > this.targetLeftFoot) {
            this.leftFootAngle -= this.targetLeftFootSpeed;
        }
        if (this.rightFootAngle < this.targetRightFoot) {
            this.rightFootAngle += this.targetRightFootSpeed;
        }
        else if (this.rightFootAngle > this.targetRightFoot) {
            this.rightFootAngle -= this.targetRightFootSpeed;
        }
        if ((float)Math.sqrt((this.rightFootAngle - this.targetRightFoot) * (this.rightFootAngle - this.targetRightFoot)) <= this.targetRightFootSpeed / 2) {
            this.rightFootAngle = (float)this.targetRightFoot;
        }
        if ((float)Math.sqrt((this.leftFootAngle - this.targetLeftFoot) * (this.leftFootAngle - this.targetLeftFoot)) <= this.targetLeftFootSpeed / 2) {
            this.leftFootAngle = (float)this.targetLeftFoot;
        }
        if (this.jumpDelay > 0) {
            --this.jumpDelay;
        }
        if (this.shootDelayLeft > 0) {
            --this.shootDelayLeft;
        }
        if (this.shootDelayRight > 0) {
            --this.shootDelayRight;
        }
        if (this.soundDelayLeft > 0) {
            --this.soundDelayLeft;
        }
        if (this.soundDelayRight > 0) {
            --this.soundDelayRight;
        }
        if (!this.field_70170_p.field_72995_K && (this.seats[0] == null || this.seats[0].field_70153_n == null)) {
            final boolean b = false;
            this.leftMouseHeld = b;
            this.rightMouseHeld = b;
        }
        this.leftAnimations.update();
        this.rightAnimations.update();
        final MechaType type = this.getMechaType();
        final DriveableData data = this.getDriveableData();
        if (type == null) {
            FlansMod.log("Mecha type null. Not ticking mecha");
            return;
        }
        if (this.stompDelay > 0) {
            --this.stompDelay;
        }
        this.prevLegsYaw = this.legAxes.getYaw();
        if (this.toggleTimer == 0 && this.autoRepair()) {
            for (final EnumDriveablePart part : EnumDriveablePart.values()) {
                final DriveablePart thisPart = data.parts.get(part);
                final boolean hasCreativePlayer = this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
                if (thisPart != null && thisPart.health != 0 && thisPart.health < thisPart.maxHealth && (hasCreativePlayer || data.fuelInTank >= 10.0f)) {
                    final DriveablePart driveablePart = thisPart;
                    ++driveablePart.health;
                    if (!hasCreativePlayer) {
                        final DriveableData driveableData5 = data;
                        driveableData5.fuelInTank -= 10.0f;
                    }
                }
            }
            this.toggleTimer = 20;
        }
        if (this.diamondDetect() != null && this.diamondTimer == 0 && this.field_70170_p.field_72995_K && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.seats[0].field_70153_n)) {
            float sqDistance = 901.0f;
            for (float i = -30.0f; i <= 30.0f; ++i) {
                for (float j = -30.0f; j <= 30.0f; ++j) {
                    for (float k = -30.0f; k <= 30.0f; ++k) {
                        final int x = MathHelper.func_76128_c(i + this.field_70165_t);
                        final int y = MathHelper.func_76128_c(j + this.field_70163_u);
                        final int z = MathHelper.func_76128_c(k + this.field_70161_v);
                        if (i * i + j * j + k * k < sqDistance && this.field_70170_p.func_147439_a(x, y, z) == Blocks.field_150482_ag) {
                            sqDistance = i * i + j * j + k * k;
                        }
                    }
                }
            }
            if (sqDistance < 901.0f) {
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.diamondDetect().detectSound, false);
                this.diamondTimer = 1 + 2 * MathHelper.func_76141_d(MathHelper.func_76129_c(sqDistance));
            }
        }
        if (this.diamondTimer > 0) {
            --this.diamondTimer;
        }
        if (this.isPartIntact(EnumDriveablePart.hips)) {
            this.func_70105_a(type.width, type.height);
            this.field_70129_M = type.yOffset;
        }
        else {
            this.func_70105_a(type.width, type.height - type.chassisHeight);
            this.field_70129_M = type.yOffset - type.chassisHeight;
        }
        final boolean thePlayerIsDrivingThis = this.field_70170_p.field_72995_K && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)this.seats[0].field_70153_n);
        final boolean driverIsLiving = this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityLivingBase;
        ++this.ticksSinceUsed;
        if (!this.field_70170_p.field_72995_K && this.seats[0].field_70153_n != null) {
            this.ticksSinceUsed = 0;
        }
        if (!this.field_70170_p.field_72995_K && TeamsManager.mechaLove > 0 && this.ticksSinceUsed > TeamsManager.mechaLove * 20) {
            this.func_70106_y();
        }
        if (this.toggleTimer > 0) {
            --this.toggleTimer;
        }
        if (this.field_70170_p.field_72995_K && !thePlayerIsDrivingThis && this.serverPositionTransitionTicker > 0) {
            final double x2 = this.field_70165_t + (this.field_70118_ct - this.field_70165_t) / this.serverPositionTransitionTicker;
            final double y2 = this.field_70163_u + (this.field_70117_cu - this.field_70163_u) / this.serverPositionTransitionTicker;
            final double z2 = this.field_70161_v + (this.field_70116_cv - this.field_70161_v) / this.serverPositionTransitionTicker;
            final double dYaw = MathHelper.func_76138_g(this.serverYaw - this.axes.getYaw());
            final double dPitch = MathHelper.func_76138_g(this.serverPitch - this.axes.getPitch());
            final double dRoll = MathHelper.func_76138_g(this.serverRoll - this.axes.getRoll());
            this.field_70177_z = (float)(this.axes.getYaw() + dYaw / this.serverPositionTransitionTicker);
            this.field_70125_A = (float)(this.axes.getPitch() + dPitch / this.serverPositionTransitionTicker);
            final float rotationRoll = (float)(this.axes.getRoll() + dRoll / this.serverPositionTransitionTicker);
            --this.serverPositionTransitionTicker;
            this.func_70107_b(x2, y2, z2);
            this.setRotation(this.field_70177_z, this.field_70125_A, rotationRoll);
        }
        if (this.seats[0] != null && this.driveableData.panicTimer <= 0) {
            if (this.seats[0].field_70153_n instanceof EntityLivingBase && !(this.seats[0].field_70153_n instanceof EntityPlayer) && this.driveableData.panicTimer <= 0) {
                this.axes.setAngles(((EntityLivingBase)this.seats[0].field_70153_n).field_70761_aq + 90.0f, 0.0f, 0.0f);
            }
            else {
                if (type.limitHeadTurn) {
                    final float axesLegs = this.legAxes.getYaw();
                    float axesBody = this.axes.getYaw();
                    final double dYaw2 = axesBody - axesLegs;
                    if (dYaw2 > 180.0) {
                        axesBody -= 360.0f;
                    }
                    if (dYaw2 < -180.0) {
                        axesBody += 360.0f;
                    }
                    if (axesLegs + type.limitHeadTurnValue < axesBody) {
                        this.axes.setAngles(axesLegs + type.limitHeadTurnValue, 0.0f, 0.0f);
                    }
                    if (axesLegs - type.limitHeadTurnValue > axesBody) {
                        this.axes.setAngles(axesLegs - type.limitHeadTurnValue, 0.0f, 0.0f);
                    }
                }
                final float yaw = this.seats[0].looking.getYaw() - this.seats[0].prevLooking.getYaw();
                this.seats[0].looking.rotateGlobalYaw(-yaw);
                if (this.driveableData.panicTimer <= 0) {
                    this.seats[0].playerLooking.rotateGlobalYaw(-yaw);
                }
                this.axes.rotateGlobalYaw(yaw);
            }
        }
        final float jetPack = this.jetPackPower();
        if (!this.field_70122_E && thePlayerIsDrivingThis && Minecraft.func_71410_x().field_71462_r instanceof GuiDriveableController && FlansMod.proxy.isKeyDown(4) && this.shouldFly() && (((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d || data.fuelInTank >= 10.0f * jetPack)) {
            this.field_70181_x *= 0.95;
            this.field_70181_x += 0.07 * jetPack;
            this.field_70143_R = 0.0f;
            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                final DriveableData driveableData6 = data;
                driveableData6.fuelInTank -= 10.0f * jetPack;
            }
            if (this.rocketTimer <= 0.0f && this.rocketPack().soundEffect != null) {
                PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.rocketPack().soundEffect, false);
                this.rocketTimer = this.rocketPack().soundTime;
            }
        }
        else if (this.func_70090_H() && this.shouldFloat()) {
            this.field_70181_x *= 0.89;
            this.field_70181_x += 0.1;
        }
        if (this.rocketTimer != 0.0f) {
            --this.rocketTimer;
        }
        final Vector3f actualMotion = new Vector3f(0.0, this.field_70181_x - 0.03999999910593033, 0.0);
        if (driverIsLiving) {
            final EntityLivingBase entity = (EntityLivingBase)this.seats[0].field_70153_n;
            final boolean driverIsCreative = entity instanceof EntityPlayer && ((EntityPlayer)entity).field_71075_bZ.field_75098_d;
            if (thePlayerIsDrivingThis && Minecraft.func_71410_x().field_71462_r instanceof GuiDriveableController && this.driveableData.panicTimer <= 0) {
                if (FlansMod.proxy.isKeyDown(0)) {
                    this.moveX = 1.0f * this.poopooThrottle;
                    this.poopooThrottle += 0.1f;
                }
                if (this.poopooThrottle > 0.1) {
                    this.moveX = 1.0f * this.poopooThrottle;
                }
                if (FlansMod.proxy.isKeyDown(1)) {
                    this.moveX = -1.0f * this.poopooThrottle;
                    if (this.poopooThrottle < 0.5f) {
                        this.poopooThrottle += 0.1f;
                    }
                }
                if (FlansMod.proxy.isKeyDown(2)) {
                    this.moveZ = -1.0f * this.poopooThrottle;
                    if (this.poopooThrottle < 0.9f) {
                        this.poopooThrottle += 0.1f;
                    }
                }
                if (FlansMod.proxy.isKeyDown(3)) {
                    this.moveZ = 1.0f * this.poopooThrottle;
                    if (this.poopooThrottle < 0.9f) {
                        this.poopooThrottle += 0.1f;
                    }
                }
            }
            else if (this.seats[0].field_70153_n instanceof EntityLiving && !(this.seats[0].field_70153_n instanceof EntityPlayer)) {
                this.moveZ = 1.0f;
            }
            Vector3f intent = new Vector3f(this.moveX, 0.0f, this.moveZ);
            if (Math.abs(intent.lengthSquared()) > 0.1) {
                ++this.legSwing;
                this.legPosition += this.getMechaType().legAnimSpeed;
                if (this.stompDelay == 0 && this.legPosition >= this.getMechaType().stompRangeLower && this.legPosition <= this.getMechaType().stompRangeUpper) {
                    PacketPlaySound.sendSoundPacket(this.field_70165_t, this.field_70163_u, this.field_70161_v, 50.0, this.field_71093_bK, this.getMechaType().stompSound, false);
                    this.stompDelay = this.getMechaType().stompSoundLength;
                }
                intent = this.axes.findLocalVectorGlobally(intent);
                final Vector3f intentOnLegAxes = this.legAxes.findGlobalVectorLocally(intent);
                final float intentAngle = (float)Math.atan2(intent.z, intent.x) * 180.0f / 3.1415927f;
                float angleBetween = intentAngle - this.legAxes.getYaw();
                if (angleBetween > 180.0f) {
                    angleBetween -= 360.0f;
                }
                if (angleBetween < -180.0f) {
                    angleBetween += 360.0f;
                }
                final float signBetween = Math.signum(angleBetween);
                angleBetween = Math.abs(angleBetween);
                if (angleBetween > 0.1) {
                    this.legAxes.rotateGlobalYaw(Math.min(angleBetween, type.rotateSpeed) * signBetween);
                }
                intent.scale(type.moveSpeed * data.engine.engineSpeed * this.speedMultiplier() * 0.215f);
                final boolean canThrustCreatively = this.seats != null && this.seats[0] != null && this.seats[0].field_70153_n instanceof EntityPlayer && ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
                if ((canThrustCreatively || data.fuelInTank > data.engine.fuelConsumption) && this.isPartIntact(EnumDriveablePart.hips)) {
                    if (!this.field_70122_E && this.shouldFly() && (canThrustCreatively || data.fuelInTank > 10.0f * jetPack + data.engine.fuelConsumption)) {
                        intent.scale(jetPack);
                        if (!canThrustCreatively) {
                            final DriveableData driveableData7 = data;
                            driveableData7.fuelInTank -= 10.0f * jetPack;
                        }
                    }
                    Vector3f.add(actualMotion, intent, actualMotion);
                    if (!canThrustCreatively) {
                        final DriveableData driveableData8 = data;
                        driveableData8.fuelInTank -= data.engine.fuelConsumption;
                    }
                }
            }
            else {
                this.legPosition = 0.0f;
            }
            if (!this.field_70170_p.field_72995_K) {
                if (this.leftMouseHeld) {
                    this.useItem(true);
                }
                if (this.rightMouseHeld) {
                    this.useItem(false);
                }
                if (this.breakingBlock != null) {
                    final Block blockHit = this.field_70170_p.func_147439_a(this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z);
                    final int metadata = this.field_70170_p.func_72805_g(this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z);
                    final Material material = blockHit.func_149688_o();
                    final ItemStack leftStack = this.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
                    final ItemStack rightStack = this.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
                    final boolean leftStackIsTool = leftStack != null && leftStack.func_77973_b() instanceof ItemMechaAddon;
                    final boolean rightStackIsTool = rightStack != null && rightStack.func_77973_b() instanceof ItemMechaAddon;
                    final boolean breakingBlocks = (this.leftMouseHeld && leftStackIsTool) || (this.rightMouseHeld && rightStackIsTool);
                    if (!breakingBlocks) {
                        this.breakingBlock = null;
                    }
                    else {
                        final float blockHardness = blockHit.func_149712_f(this.field_70170_p, this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z);
                        float mineSpeed = 1.0f;
                        boolean atLeastOneEffectiveTool = false;
                        if (leftStackIsTool) {
                            final MechaItemType leftType = ((ItemMechaAddon)leftStack.func_77973_b()).type;
                            if (leftType.function.effectiveAgainst(material) && leftType.toolHardness > blockHardness) {
                                mineSpeed *= leftType.speed;
                                atLeastOneEffectiveTool = true;
                            }
                        }
                        if (rightStackIsTool) {
                            final MechaItemType rightType = ((ItemMechaAddon)rightStack.func_77973_b()).type;
                            if (rightType.function.effectiveAgainst(material) && rightType.toolHardness > blockHardness) {
                                mineSpeed *= rightType.speed;
                                atLeastOneEffectiveTool = true;
                            }
                        }
                        if (blockHardness < -0.01f) {
                            mineSpeed = 0.0f;
                        }
                        else if (Math.abs(blockHardness) < 0.01f) {
                            mineSpeed = 9001.0f;
                        }
                        else {
                            mineSpeed /= blockHit.func_149712_f(this.field_70170_p, this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z);
                        }
                        this.breakingProgress += 0.1f * mineSpeed;
                        if (this.breakingProgress >= 1.0f) {
                            boolean cancelled = false;
                            if (entity instanceof EntityPlayerMP) {
                                final BlockEvent.BreakEvent event = ForgeHooks.onBlockBreakEvent(this.field_70170_p, ((EntityPlayerMP)entity).field_71075_bZ.field_75098_d ? WorldSettings.GameType.CREATIVE : (((EntityPlayerMP)entity).field_71075_bZ.field_75099_e ? WorldSettings.GameType.SURVIVAL : WorldSettings.GameType.ADVENTURE), (EntityPlayerMP)this.seats[0].field_70153_n, this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z);
                                cancelled = event.isCanceled();
                            }
                            if (!cancelled) {
                                final boolean vacuumItems = this.vacuumItems();
                                if (vacuumItems) {
                                    for (ItemStack stack : blockHit.getDrops(this.field_70170_p, this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z, metadata, 0)) {
                                        boolean fuelCheck = data.fuelInTank >= 5.0f || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d;
                                        if (fuelCheck && this.refineIron() && stack.func_77973_b() instanceof ItemBlock && ((ItemBlock)stack.func_77973_b()).field_150939_a == Blocks.field_150366_p) {
                                            stack = new ItemStack(Items.field_151042_j, 1, 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData9 = data;
                                                driveableData9.fuelInTank -= 5.0f;
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 0.1f || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && this.wasteCompact() && stack.func_77973_b() instanceof ItemBlock && (((ItemBlock)stack.func_77973_b()).field_150939_a == Blocks.field_150347_e || ((ItemBlock)stack.func_77973_b()).field_150939_a == Blocks.field_150346_d || ((ItemBlock)stack.func_77973_b()).field_150939_a == Blocks.field_150354_m)) {
                                            stack.field_77994_a = 0;
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData10 = data;
                                                driveableData10.fuelInTank -= 0.1f;
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 3.0f * this.diamondMultiplier() || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && stack.func_77973_b() == Items.field_151045_i) {
                                            final float multiplier = this.diamondMultiplier();
                                            final ItemStack itemStack = stack;
                                            itemStack.field_77994_a *= MathHelper.func_76141_d(multiplier) + ((this.field_70146_Z.nextFloat() < tailFloat(multiplier)) ? 1 : 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData11 = data;
                                                driveableData11.fuelInTank -= 3.0f * this.diamondMultiplier();
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 2.0f * this.redstoneMultiplier() || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && stack.func_77973_b() == Items.field_151137_ax) {
                                            final float multiplier = this.redstoneMultiplier();
                                            final ItemStack itemStack2 = stack;
                                            itemStack2.field_77994_a *= MathHelper.func_76141_d(multiplier) + ((this.field_70146_Z.nextFloat() < tailFloat(multiplier)) ? 1 : 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData12 = data;
                                                driveableData12.fuelInTank -= 2.0f * this.redstoneMultiplier();
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 2.0f * this.coalMultiplier() || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && stack.func_77973_b() == Items.field_151044_h) {
                                            final float multiplier = this.coalMultiplier();
                                            final ItemStack itemStack3 = stack;
                                            itemStack3.field_77994_a *= MathHelper.func_76141_d(multiplier) + ((this.field_70146_Z.nextFloat() < tailFloat(multiplier)) ? 1 : 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData13 = data;
                                                driveableData13.fuelInTank -= 2.0f * this.coalMultiplier();
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 2.0f * this.emeraldMultiplier() || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && stack.func_77973_b() == Items.field_151166_bC) {
                                            final float multiplier = this.emeraldMultiplier();
                                            final ItemStack itemStack4 = stack;
                                            itemStack4.field_77994_a *= MathHelper.func_76141_d(multiplier) + ((this.field_70146_Z.nextFloat() < tailFloat(multiplier)) ? 1 : 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData14 = data;
                                                driveableData14.fuelInTank -= 2.0f * this.emeraldMultiplier();
                                            }
                                        }
                                        fuelCheck = (data.fuelInTank >= 2.0f * this.ironMultiplier() || ((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d);
                                        if (fuelCheck && stack.func_77973_b() == Items.field_151042_j && this.refineIron()) {
                                            final float multiplier = this.ironMultiplier();
                                            final ItemStack itemStack5 = stack;
                                            itemStack5.field_77994_a *= MathHelper.func_76141_d(multiplier) + ((this.field_70146_Z.nextFloat() < tailFloat(multiplier)) ? 1 : 0);
                                            if (!((EntityPlayer)this.seats[0].field_70153_n).field_71075_bZ.field_75098_d) {
                                                final DriveableData driveableData15 = data;
                                                driveableData15.fuelInTank -= 2.0f * this.ironMultiplier();
                                            }
                                        }
                                        if (this.autoCoal() && stack.func_77973_b() == Items.field_151044_h && data.fuelInTank + 250.0f < type.fuelTankSize) {
                                            data.fuelInTank = Math.min(data.fuelInTank + 1000.0f, (float)type.fuelTankSize);
                                            this.couldNotFindFuel = false;
                                            stack.field_77994_a = 0;
                                        }
                                        if (!InventoryHelper.addItemStackToInventory((IInventory)this.driveableData, stack, driverIsCreative) && !this.field_70170_p.field_72995_K && this.field_70170_p.func_82736_K().func_82766_b("doTileDrops")) {
                                            this.field_70170_p.func_72838_d((Entity)new EntityItem(this.field_70170_p, (double)(this.breakingBlock.x + 0.5f), (double)(this.breakingBlock.y + 0.5f), (double)(this.breakingBlock.z + 0.5f), stack));
                                        }
                                    }
                                }
                                this.field_70170_p.func_147480_a(this.breakingBlock.x, this.breakingBlock.y, this.breakingBlock.z, atLeastOneEffectiveTool && !vacuumItems);
                            }
                        }
                    }
                }
            }
        }
        this.field_70181_x = actualMotion.y;
        this.func_70091_d((double)actualMotion.x, (double)actualMotion.y, (double)actualMotion.z);
        this.func_70107_b(this.field_70165_t, this.field_70163_u, this.field_70161_v);
        if (thePlayerIsDrivingThis) {
            FlansMod.getPacketHandler().sendToServer(new PacketMechaControl(this));
            this.field_70118_ct = this.field_70165_t;
            this.field_70117_cu = this.field_70163_u;
            this.field_70116_cv = this.field_70161_v;
            this.serverYaw = this.axes.getYaw();
        }
        if (!this.field_70170_p.field_72995_K && this.field_70173_aa % 5 == 0) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketMechaControl(this), this.field_70165_t, this.field_70163_u, this.field_70161_v, FlansMod.driveableUpdateRange, this.field_71093_bK);
        }
        for (final EntitySeat seat : this.seats) {
            if (seat != null) {
                seat.updatePosition();
            }
        }
        if (!driverIsLiving || thePlayerIsDrivingThis) {
            this.legSwing /= type.legSwingLimit;
        }
    }
    
    private static float tailFloat(final float f) {
        return f - MathHelper.func_76141_d(f);
    }
    
    public boolean stopFallDamage() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.stopMechaFallDamage) {
                return true;
            }
        }
        return false;
    }
    
    public boolean breakBlocksUponFalling() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.forceBlockFallDamage) {
                return true;
            }
        }
        return false;
    }
    
    public boolean vacuumItems() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.vacuumItems) {
                return true;
            }
        }
        return false;
    }
    
    public boolean refineIron() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.refineIron) {
                return true;
            }
        }
        return false;
    }
    
    public MechaItemType diamondDetect() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.diamondDetect) {
                return type;
            }
        }
        return null;
    }
    
    public Boolean wasteCompact() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.wasteCompact) {
                return true;
            }
        }
        return false;
    }
    
    public float diamondMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.fortuneDiamond;
        }
        return multiplier;
    }
    
    public float speedMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.speedMultiplier;
        }
        return multiplier;
    }
    
    public float coalMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.fortuneCoal;
        }
        return multiplier;
    }
    
    public float redstoneMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.fortuneRedstone;
        }
        return multiplier;
    }
    
    public float vulnerability() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= 1.0f - type.damageResistance;
        }
        return multiplier;
    }
    
    public float emeraldMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.fortuneEmerald;
        }
        return multiplier;
    }
    
    public float ironMultiplier() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.fortuneIron;
        }
        return multiplier;
    }
    
    public int lightLevel() {
        int level = 0;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            level = Math.max(level, type.lightLevel);
        }
        return level;
    }
    
    public boolean forceDark() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.forceDark) {
                return true;
            }
        }
        return false;
    }
    
    public boolean autoCoal() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.autoCoal) {
                return true;
            }
        }
        return false;
    }
    
    public boolean autoRepair() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.autoRepair) {
                return true;
            }
        }
        return false;
    }
    
    public boolean shouldFloat() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.floater) {
                return true;
            }
        }
        return false;
    }
    
    public boolean infiniteAmmo() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.infiniteAmmo) {
                return true;
            }
        }
        return false;
    }
    
    public MechaItemType rocketPack() {
        for (final MechaItemType type : this.getUpgradeTypes()) {
            if (type.rocketPack) {
                return type;
            }
        }
        return null;
    }
    
    public boolean shouldFly() {
        return this.rocketPack() != null;
    }
    
    public float jetPackPower() {
        float multiplier = 1.0f;
        for (final MechaItemType type : this.getUpgradeTypes()) {
            multiplier *= type.rocketPower;
        }
        return multiplier;
    }
    
    public ArrayList<MechaItemType> getUpgradeTypes() {
        final ArrayList<MechaItemType> types = new ArrayList<MechaItemType>();
        for (final ItemStack stack : this.inventory.stacks.values()) {
            if (stack != null && stack.func_77973_b() instanceof ItemMechaAddon) {
                types.add(((ItemMechaAddon)stack.func_77973_b()).type);
            }
        }
        return types;
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public boolean showInventory(final int seat) {
        return seat != 0;
    }
    
    @Override
    protected void dropItemsOnPartDeath(final Vector3f midpoint, final DriveablePart part) {
    }
    
    @Override
    public boolean hasMouseControlMode() {
        return false;
    }
    
    @Override
    public String getBombInventoryName() {
        return "";
    }
    
    @Override
    public String getMissileInventoryName() {
        return "";
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public EntityLivingBase getCamera() {
        return null;
    }
    
    @Override
    public AxisAlignedBB func_70114_g(final Entity entity) {
        if (this.getDriveableType().collisionDamageEnable && this.throttle > this.getDriveableType().collisionDamageThrottle) {
            if (entity instanceof EntityLiving && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.getDriveableType().collisionDamageTimes);
                if (this.getDriveableType().collisionDamageTimes > 40.0f && ((EntityLiving)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
            else if (entity instanceof EntityPlayer && !entity.func_70115_ae() && !entity.field_70128_L) {
                entity.func_70097_a(DamageSource.field_76367_g, this.getDriveableType().collisionDamageTimes);
                if (this.getDriveableType().collisionDamageTimes > 40.0f && ((EntityPlayer)entity).func_110143_aJ() > 0.0f) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 15.0, entity.field_71093_bK, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entity.field_70165_t, entity.field_70163_u - 4.0, entity.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
                }
            }
        }
        return this.field_70121_D;
    }
}
