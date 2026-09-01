// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.tools;

import java.util.Random;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.driveables.DriveablePart;
import java.util.Iterator;
import com.flansmod.common.PlayerData;
import com.flansmod.common.network.PacketBase;
import cpw.mods.fml.common.network.NetworkRegistry;
import com.flansmod.common.network.PacketFlak;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.item.ItemFood;

public class ItemTool extends ItemFood
{
    public ToolType type;
    private static final String CHAR_LIST = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final int RANDOM_STRING_LENGTH = 10;
    
    public ItemTool(final ToolType t) {
        super(t.foodness, false);
        this.maxStackSize = 1;
        this.type = t;
        ((ItemTool)(this.type.item = (Item)this)).setMaxDurability(this.type.toolLife);
        if (this.type.foodness == 0) {
            this.setCreativeTab((CreativeTabs)FlansMod.tabFlanParts);
            if (this.type.remote) {
                this.setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
            }
            if (this.type.healDriveables) {
                this.setCreativeTab((CreativeTabs)FlansMod.tabFlanDriveables);
            }
        }
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        if (stack.stackTagCompound != null) {
            lines.add(stack.stackTagCompound.getString("key"));
        }
    }
    
    public void onCreated(final ItemStack itemStack, final World world, final EntityPlayer player) {
        (itemStack.stackTagCompound = new NBTTagCompound()).setString("key", this.generateRandomString());
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }
    
    public ItemStack onItemRightClick(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        if (this.type.foodness > 0) {
            super.onItemRightClick(itemstack, world, entityplayer);
        }
        else {
            if (this.type.parachute) {
                if (EntityParachute.canUseParachute((Entity)entityplayer)) {
                    if (!world.isRemote) {
                        final EntityParachute parachute = new EntityParachute(world, this.type, entityplayer);
                        if (!parachute.isDead) {
                            world.spawnEntityInWorld((Entity)parachute);
                            entityplayer.mountEntity((Entity)parachute);
                        }
                    }
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                return itemstack;
            }
            if (this.type.remote) {
                final PlayerData data = PlayerHandler.getPlayerData(entityplayer, world.isRemote ? Side.CLIENT : Side.SERVER);
                final Iterator<EntityGrenade> i = data.remoteExplosives.iterator();
                while (i.hasNext()) {
                    final EntityGrenade grenade = i.next();
                    if (grenade.isDead) {
                        i.remove();
                    }
                }
                if (data.remoteExplosives.size() > 0) {
                    data.remoteExplosives.get(0).detonate();
                    if (data.remoteExplosives.get(0).detonated) {
                        data.remoteExplosives.remove(0);
                    }
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                    return itemstack;
                }
            }
            else {
                if (this.type.bandAid && PlayerHandler.getPlayerData(entityplayer).minorBleed > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                if (this.type.superBandAid && PlayerHandler.getPlayerData(entityplayer).Bleed > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).Bleed = 0;
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                if (this.type.surgery && PlayerHandler.getPlayerData(entityplayer).hemorrhaging > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).Bleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).hemorrhaging = 0;
                    final PlayerData playerData = PlayerHandler.getPlayerData(entityplayer);
                    --playerData.blood;
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                if (this.type.transfusion && PlayerHandler.getPlayerData(entityplayer).blood < 100.0f) {
                    final PlayerData playerData2 = PlayerHandler.getPlayerData(entityplayer);
                    playerData2.blood += this.type.healAmount;
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                if (this.type.needle) {
                    final PlayerData playerData3 = PlayerHandler.getPlayerData(entityplayer);
                    playerData3.blood -= this.type.healAmount;
                    final PlayerData playerData4 = PlayerHandler.getPlayerData(entityplayer);
                    playerData4.minorBleed += 3;
                    String itemName = this.type.summonItem;
                    int damage = 0;
                    if (itemName.contains(".")) {
                        damage = Integer.parseInt(itemName.split("\\.")[1]);
                        itemName = itemName.split("\\.")[0];
                    }
                    final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
                    world.spawnEntityInWorld((Entity)new EntityItem(world, entityplayer.posX, entityplayer.posY, entityplayer.posZ, dropStack));
                    if (this.type.toolLife > 0 && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
                final float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329f);
                final float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329f);
                final float cosPitch = -MathHelper.cos(entityplayer.rotationPitch * 0.01745329f);
                final float sinPitch = MathHelper.sin(entityplayer.rotationPitch * 0.01745329f);
                final double length = -5.0;
                final Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62 - entityplayer.yOffset, entityplayer.posZ);
                final Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
                if (world.isRemote && FlansMod.DEBUG) {
                    world.spawnEntityInWorld((Entity)new EntityDebugVector(world, new Vector3f(posVec), new Vector3f(posVec.subtract(lookVec)), 100));
                }
                if (this.type.healDriveables) {
                    for (int j = 0; j < world.loadedEntityList.size(); ++j) {
                        final Object obj = world.loadedEntityList.get(j);
                        if (obj instanceof EntityDriveable) {
                            final EntityDriveable driveable = (EntityDriveable)obj;
                            final DriveablePart part = driveable.raytraceParts(new Vector3f(posVec), Vector3f.sub(new Vector3f(lookVec), new Vector3f(posVec), null));
                            if (part != null && part.maxHealth > 0 && part.health < part.maxHealth && (this.type.toolLife == 0 || itemstack.getMetadata() < itemstack.getMaxDurability())) {
                                final DriveablePart driveablePart = part;
                                driveablePart.health += this.type.healAmount;
                                if (part.health > part.maxHealth) {
                                    part.health = part.maxHealth;
                                }
                                if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                                    itemstack.setMetadata(itemstack.getMetadata() + 1);
                                }
                                if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.getMetadata() == itemstack.getMaxDurability()) {
                                    --itemstack.stackSize;
                                }
                                return itemstack;
                            }
                        }
                    }
                }
                if (!world.isRemote && this.type.healPlayers) {
                    EntityLivingBase hitLiving = (EntityLivingBase)entityplayer;
                    final List list = world.getEntitiesWithinAABB((Class)EntityLivingBase.class, AxisAlignedBB.getBoundingBox(Math.min(posVec.xCoord, lookVec.xCoord), Math.min(posVec.yCoord, lookVec.yCoord), Math.min(posVec.zCoord, lookVec.zCoord), Math.max(posVec.xCoord, lookVec.xCoord), Math.max(posVec.yCoord, lookVec.yCoord), Math.max(posVec.zCoord, lookVec.zCoord)));
                    for (final Object aList : list) {
                        if (!(aList instanceof EntityLivingBase)) {
                            continue;
                        }
                        final EntityLivingBase checkEntity = (EntityLivingBase)aList;
                        if (checkEntity == entityplayer) {
                            continue;
                        }
                        final MovingObjectPosition hit = checkEntity.boundingBox.calculateIntercept(posVec, lookVec);
                        if (hit == null) {
                            continue;
                        }
                        hitLiving = checkEntity;
                    }
                    if (itemstack.getMetadata() >= itemstack.getMaxDurability() && this.type.toolLife > 0) {
                        return itemstack;
                    }
                    hitLiving.addPotionEffect(new PotionEffect(Potion.regeneration.id, this.type.healAmount, this.type.healStrength));
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(hitLiving.posX, hitLiving.posY, hitLiving.posZ, 5, "heart"), new NetworkRegistry.TargetPoint(hitLiving.dimension, hitLiving.posX, hitLiving.posY, hitLiving.posZ, 50.0));
                    if (!entityplayer.capabilities.isCreativeMode && this.type.toolLife > 0) {
                        itemstack.setMetadata(itemstack.getMetadata() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.getMetadata() >= itemstack.getMaxDurability()) {
                        --itemstack.stackSize;
                    }
                }
            }
        }
        return itemstack;
    }
    
    public String generateRandomString() {
        final StringBuffer randStr = new StringBuffer();
        for (int i = 0; i < 10; ++i) {
            final int number = getRandomNumber();
            final char ch = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }
    
    private static int getRandomNumber() {
        int randomInt = 0;
        final Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".length());
        if (randomInt - 1 == -1) {
            return randomInt;
        }
        return randomInt - 1;
    }
    
    public String toString() {
        return (this.type == null) ? this.getUnlocalizedName() : this.type.name;
    }
}
