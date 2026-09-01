// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

import com.flansmod.common.guns.GunType;
import com.flansmod.common.PlayerData;
import java.util.Iterator;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.DamageSource;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.potion.Potion;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketPlaySound;
import net.minecraft.potion.PotionEffect;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.guns.EntityBullet;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import net.minecraft.world.World;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.RotatedAxes;
import net.minecraft.entity.player.EntityPlayer;

public class PlayerHitbox
{
    public EntityPlayer player;
    public RotatedAxes axes;
    public Vector3f rP;
    public Vector3f o;
    public Vector3f d;
    public EnumHitboxType type;
    public static int lefty;
    public static int righty;
    public static int topy;
    public static int bottomy;
    public static int shieldHit;
    
    public PlayerHitbox(final EntityPlayer player, final RotatedAxes axes, final Vector3f rotationPoint, final Vector3f origin, final Vector3f dimensions, final EnumHitboxType type) {
        this.player = player;
        this.axes = axes;
        this.o = origin;
        this.d = dimensions;
        this.type = type;
        this.rP = rotationPoint;
    }
    
    @SideOnly(Side.CLIENT)
    public void renderHitbox(final World world, final Vector3f pos) {
        final Vector3f boxOrigin = new Vector3f(pos.x + this.rP.x, pos.y + this.rP.y, pos.z + this.rP.z);
        if (this.type != EnumHitboxType.NEARBY && (PlayerHandler.getPlayerData(this.player).shieldHit > 0 || FlansMod.DEBUG)) {
            world.spawnEntityInWorld((Entity)new EntityDebugAABB(world, boxOrigin, this.d, 2, 1.0f, 1.0f, 0.0f, this.axes.getYaw(), this.axes.getPitch(), this.axes.getRoll(), this.o, PlayerHandler.getPlayerData(this.player).shieldHit));
        }
    }
    
    public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion) {
        origin = Vector3f.sub(origin, this.rP, null);
        origin = this.axes.findGlobalVectorLocally(origin);
        motion = this.axes.findGlobalVectorLocally(motion);
        if (motion.x != 0.0f) {
            if (origin.x < this.o.x) {
                final float intersectTime = (this.o.x - origin.x) / motion.x;
                final float intersectY = origin.y + motion.y * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectY >= this.o.y && intersectY <= this.o.y + this.d.y && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
            else if (origin.x > this.o.x + this.d.x) {
                final float intersectTime = (this.o.x + this.d.x - origin.x) / motion.x;
                final float intersectY = origin.y + motion.y * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectY >= this.o.y && intersectY <= this.o.y + this.d.y && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }
        if (motion.z != 0.0f) {
            if (origin.z < this.o.z) {
                final float intersectTime = (this.o.z - origin.z) / motion.z;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectY2 = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectY2 >= this.o.y && intersectY2 <= this.o.y + this.d.y) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
            else if (origin.z > this.o.z + this.d.z) {
                final float intersectTime = (this.o.z + this.d.z - origin.z) / motion.z;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectY2 = origin.y + motion.y * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectY2 >= this.o.y && intersectY2 <= this.o.y + this.d.y) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }
        if (motion.y != 0.0f) {
            if (origin.y < this.o.y) {
                final float intersectTime = (this.o.y - origin.y) / motion.y;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
            else if (origin.y > this.o.y + this.d.y) {
                final float intersectTime = (this.o.y + this.d.y - origin.y) / motion.y;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.o.x && intersectX <= this.o.x + this.d.x && intersectZ >= this.o.z && intersectZ <= this.o.z + this.d.z) {
                    return new PlayerBulletHit(this, intersectTime);
                }
            }
        }
        return null;
    }
    
    public float hitByBullet(final EntityBullet bullet, final float penetratingPower) {
        if (bullet.type.setEntitiesOnFire) {
            this.player.setFire(20);
        }
        float damageModifier = (bullet.type.penetratingPower < 0.1f) ? (penetratingPower / bullet.type.penetratingPower) : 1.0f;
        float trueBodyArmorPen = bullet.type.bodyarmorPen;
        if (bullet.ticksExisted > bullet.type.dynamicBulletDelay) {
            trueBodyArmorPen = bullet.type.dynamicBodyarmorPen;
        }
        switch (this.type) {
            case BODY: {
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        PlayerHandler.getPlayerData(this.player).pouchMultiplier = ((ItemTeamArmour)stack.getItem()).type.pouchMultiplier;
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (trueBodyArmorPen >= ((ItemTeamArmour)stack.getItem()).secretBody * 0.85f && trueBodyArmorPen <= ((ItemTeamArmour)stack.getItem()).secretBody) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            if (damageModifier <= 0.1f) {
                                stack.setMetadata(stack.getMetadata() + 1);
                            }
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (trueBodyArmorPen < ((ItemTeamArmour)stack.getItem()).secretBody * 0.85f) {
                            stack.setMetadata(stack.getMetadata() + 1);
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                    else {
                        PlayerHandler.getPlayerData(this.player).pouchMultiplier = 1.0f;
                    }
                }
                break;
            }
            case BACK: {
                damageModifier *= 1.0f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretBack * 0.8500000238418579 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretBack > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case NAPE: {
                damageModifier *= 3.5f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretNape * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretNape > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case CRANIUM: {
                damageModifier *= 2.0f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretHead * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretHead > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case FACE: {
                damageModifier *= 1.5f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretFace * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretFace > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case LEFTARM: {
                damageModifier *= 0.6f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretArm * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretArm > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case RIGHTARM: {
                damageModifier *= 0.6f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretArm * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretArm > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case LEGS: {
                damageModifier *= 0.6f;
                for (int i = 0; i < 5; ++i) {
                    final ItemStack stack = this.player.getEquipmentInSlot(i);
                    if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                        if ((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable) {
                            for (final PotionEffect effect : bullet.type.hitEffects) {
                                this.player.addPotionEffect(new PotionEffect(effect));
                            }
                        }
                        if (((ItemTeamArmour)stack.getItem()).secretLeg * 0.85 > trueBodyArmorPen) {
                            damageModifier *= bullet.type.nonpenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                        else if (((ItemTeamArmour)stack.getItem()).secretLeg > trueBodyArmorPen) {
                            damageModifier *= bullet.type.barelypenPenalty;
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "armorDeflect", true);
                            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(this.player.posX, this.player.posY, this.player.posZ, 25, "crit"), this.player.posX, this.player.posY, this.player.posZ, 5.0f, this.player.dimension);
                        }
                    }
                }
                break;
            }
            case NEARBY: {
                damageModifier *= 0.0f;
                if (!bullet.type.swordEnergy) {
                    PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 8.0, this.player.dimension, bullet.missNoise, true);
                }
                if (!this.player.isRiding() && !this.player.worldObj.isRemote) {
                    this.player.addPotionEffect(new PotionEffect(Potion.blindness.id, bullet.type.suppression));
                    break;
                }
                break;
            }
            case LEFTITEM: {
                final PlayerData data = PlayerHandler.getPlayerData(this.player);
                if (data.offHandGunSlot != 0) {
                    ItemStack leftHandStack = null;
                    if (this.player.worldObj.isRemote && !FlansMod.proxy.isThePlayer(this.player)) {
                        leftHandStack = data.offHandGunStack;
                    }
                    else {
                        leftHandStack = this.player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                    }
                    if (leftHandStack != null && leftHandStack.getItem() instanceof ItemGun) {
                        final GunType leftGunType = ((ItemGun)leftHandStack.getItem()).type;
                        if (trueBodyArmorPen < leftGunType.shieldDamageAbsorption) {
                            damageModifier *= 0.001f;
                            bullet.setDead();
                            PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "shield_metal", true);
                        }
                    }
                    break;
                }
                break;
            }
            case RIGHTITEM: {
                final ItemStack currentStack = this.player.getCurrentEquippedItem();
                if (currentStack != null && currentStack.getItem() instanceof ItemGun) {
                    final GunType gunType = ((ItemGun)currentStack.getItem()).type;
                    if (trueBodyArmorPen < gunType.shieldDamageAbsorption) {
                        damageModifier *= 0.001f;
                        bullet.setDead();
                        PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 5.0, this.player.dimension, "shield_metal", true);
                    }
                    break;
                }
                break;
            }
        }
        switch (this.type) {
            case BODY:
            case BACK:
            case NAPE:
            case CRANIUM:
            case FACE:
            case LEFTARM:
            case RIGHTARM:
            case LEGS:
            case LEFTITEM:
            case RIGHTITEM: {
                float hitDamage = bullet.damage * bullet.type.dynamicDamage * damageModifier;
                if (bullet.ticksExisted < bullet.type.dynamicBulletDelay) {
                    hitDamage = bullet.damage * bullet.type.damageVsPlayer * damageModifier;
                }
                final PlayerData data2 = PlayerHandler.getPlayerData(this.player);
                if (hitDamage < this.player.getHealth() && !this.player.getEntityData().getString("lastClowder").equals("SAFEZONE") && TeamsManager.bleeding) {
                    final PlayerData playerData = data2;
                    playerData.minorBleed += (int)(hitDamage * bullet.type.bleedMultiplier);
                }
                if (bullet.type.entityHitSoundEnable) {
                    PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, bullet.type.hitSoundRange, this.player.dimension, bullet.type.hitSound, true);
                }
                if (hitDamage > 40.0f && !this.player.getEntityData().getString("lastClowder").equals("SAFEZONE")) {
                    FlansMod.proxy.spawnParticle("flansmod.overkill", this.player.posX, this.player.posY - 4.0, this.player.posZ, 0.0, 0.10000000149011612, 0.0);
                    PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 15.0, this.player.dimension, "goreDeath", true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", this.player.posX, this.player.posY - 4.0, this.player.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), this.player.posX, this.player.posY, this.player.posZ, 150.0f, this.player.dimension);
                    if (hitDamage > 123.0f) {
                        PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 15.0, this.player.dimension, "deathOverkillLong", false);
                    }
                    else if (hitDamage > 69.0f) {
                        PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 15.0, this.player.dimension, "deathOverkill", false);
                    }
                    else {
                        PacketPlaySound.sendSoundPacket(this.player.posX, this.player.posY, this.player.posZ, 15.0, this.player.dimension, "deathOverkillTom", false);
                    }
                }
                if (hitDamage > 10.0f && !this.player.getEntityData().getString("lastClowder").equals("SAFEZONE")) {
                    FlansMod.proxy.spawnParticle("flansmod.blood", this.player.posX, this.player.posY - 4.0, this.player.posZ, 0.0, 0.10000000149011612, 0.0);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", this.player.posX, this.player.posY - 4.0, this.player.posZ, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), this.player.posX, this.player.posY, this.player.posZ, 150.0f, this.player.dimension);
                }
                final DamageSource damagesource = (bullet.owner == null) ? DamageSource.generic : bullet.getBulletDamage(this.type == EnumHitboxType.NAPE || this.type == EnumHitboxType.CRANIUM);
                if (!this.player.worldObj.isRemote && hitDamage == 0.0f && TeamsManager.getInstance().currentRound != null) {
                    TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)this.player, damagesource);
                }
                if (this.player.attackEntityFrom(damagesource, hitDamage)) {
                    final EntityPlayer player = this.player;
                    ++player.arrowHitTimer;
                    this.player.hurtResistantTime = this.player.maxHurtResistantTime / 2;
                }
                return penetratingPower - 1.0f;
            }
            default: {
                return penetratingPower;
            }
        }
    }
    
    static {
        PlayerHitbox.lefty = 0;
        PlayerHitbox.righty = 0;
        PlayerHitbox.topy = 0;
        PlayerHitbox.bottomy = 0;
        PlayerHitbox.shieldHit = 0;
    }
}
