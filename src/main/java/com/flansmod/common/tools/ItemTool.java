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
        this.field_77777_bU = 1;
        this.type = t;
        ((ItemTool)(this.type.item = (Item)this)).func_77656_e(this.type.toolLife);
        if (this.type.foodness == 0) {
            this.func_77637_a((CreativeTabs)FlansMod.tabFlanParts);
            if (this.type.remote) {
                this.func_77637_a((CreativeTabs)FlansMod.tabFlanGuns);
            }
            if (this.type.healDriveables) {
                this.func_77637_a((CreativeTabs)FlansMod.tabFlanDriveables);
            }
        }
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        if (stack.field_77990_d != null) {
            lines.add(stack.field_77990_d.func_74779_i("key"));
        }
    }
    
    public void func_77622_d(final ItemStack itemStack, final World world, final EntityPlayer player) {
        (itemStack.field_77990_d = new NBTTagCompound()).func_74778_a("key", this.generateRandomString());
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    public ItemStack func_77659_a(final ItemStack itemstack, final World world, final EntityPlayer entityplayer) {
        if (this.type.foodness > 0) {
            super.func_77659_a(itemstack, world, entityplayer);
        }
        else {
            if (this.type.parachute) {
                if (EntityParachute.canUseParachute((Entity)entityplayer)) {
                    if (!world.field_72995_K) {
                        final EntityParachute parachute = new EntityParachute(world, this.type, entityplayer);
                        if (!parachute.field_70128_L) {
                            world.func_72838_d((Entity)parachute);
                            entityplayer.func_70078_a((Entity)parachute);
                        }
                    }
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                }
                return itemstack;
            }
            if (this.type.remote) {
                final PlayerData data = PlayerHandler.getPlayerData(entityplayer, world.field_72995_K ? Side.CLIENT : Side.SERVER);
                final Iterator<EntityGrenade> i = data.remoteExplosives.iterator();
                while (i.hasNext()) {
                    final EntityGrenade grenade = i.next();
                    if (grenade.field_70128_L) {
                        i.remove();
                    }
                }
                if (data.remoteExplosives.size() > 0) {
                    data.remoteExplosives.get(0).detonate();
                    if (data.remoteExplosives.get(0).detonated) {
                        data.remoteExplosives.remove(0);
                    }
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                    return itemstack;
                }
            }
            else {
                if (this.type.bandAid && PlayerHandler.getPlayerData(entityplayer).minorBleed > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                }
                if (this.type.superBandAid && PlayerHandler.getPlayerData(entityplayer).Bleed > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).Bleed = 0;
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                }
                if (this.type.surgery && PlayerHandler.getPlayerData(entityplayer).hemorrhaging > 0) {
                    PlayerHandler.getPlayerData(entityplayer).minorBleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).Bleed = 0;
                    PlayerHandler.getPlayerData(entityplayer).hemorrhaging = 0;
                    final PlayerData playerData = PlayerHandler.getPlayerData(entityplayer);
                    --playerData.blood;
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                }
                if (this.type.transfusion && PlayerHandler.getPlayerData(entityplayer).blood < 100.0f) {
                    final PlayerData playerData2 = PlayerHandler.getPlayerData(entityplayer);
                    playerData2.blood += this.type.healAmount;
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
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
                    world.func_72838_d((Entity)new EntityItem(world, entityplayer.field_70165_t, entityplayer.field_70163_u, entityplayer.field_70161_v, dropStack));
                    if (this.type.toolLife > 0 && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
                    }
                }
                final float cosYaw = MathHelper.func_76134_b(-entityplayer.field_70177_z * 0.01745329f);
                final float sinYaw = MathHelper.func_76126_a(-entityplayer.field_70177_z * 0.01745329f);
                final float cosPitch = -MathHelper.func_76134_b(entityplayer.field_70125_A * 0.01745329f);
                final float sinPitch = MathHelper.func_76126_a(entityplayer.field_70125_A * 0.01745329f);
                final double length = -5.0;
                final Vec3 posVec = Vec3.func_72443_a(entityplayer.field_70165_t, entityplayer.field_70163_u + 1.62 - entityplayer.field_70129_M, entityplayer.field_70161_v);
                final Vec3 lookVec = posVec.func_72441_c(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
                if (world.field_72995_K && FlansMod.DEBUG) {
                    world.func_72838_d((Entity)new EntityDebugVector(world, new Vector3f(posVec), new Vector3f(posVec.func_72444_a(lookVec)), 100));
                }
                if (this.type.healDriveables) {
                    for (int j = 0; j < world.field_72996_f.size(); ++j) {
                        final Object obj = world.field_72996_f.get(j);
                        if (obj instanceof EntityDriveable) {
                            final EntityDriveable driveable = (EntityDriveable)obj;
                            final DriveablePart part = driveable.raytraceParts(new Vector3f(posVec), Vector3f.sub(new Vector3f(lookVec), new Vector3f(posVec), null));
                            if (part != null && part.maxHealth > 0 && part.health < part.maxHealth && (this.type.toolLife == 0 || itemstack.func_77960_j() < itemstack.func_77958_k())) {
                                final DriveablePart driveablePart = part;
                                driveablePart.health += this.type.healAmount;
                                if (part.health > part.maxHealth) {
                                    part.health = part.maxHealth;
                                }
                                if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                                    itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                                }
                                if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.func_77960_j() == itemstack.func_77958_k()) {
                                    --itemstack.field_77994_a;
                                }
                                return itemstack;
                            }
                        }
                    }
                }
                if (!world.field_72995_K && this.type.healPlayers) {
                    EntityLivingBase hitLiving = (EntityLivingBase)entityplayer;
                    final List list = world.func_72872_a((Class)EntityLivingBase.class, AxisAlignedBB.func_72330_a(Math.min(posVec.field_72450_a, lookVec.field_72450_a), Math.min(posVec.field_72448_b, lookVec.field_72448_b), Math.min(posVec.field_72449_c, lookVec.field_72449_c), Math.max(posVec.field_72450_a, lookVec.field_72450_a), Math.max(posVec.field_72448_b, lookVec.field_72448_b), Math.max(posVec.field_72449_c, lookVec.field_72449_c)));
                    for (final Object aList : list) {
                        if (!(aList instanceof EntityLivingBase)) {
                            continue;
                        }
                        final EntityLivingBase checkEntity = (EntityLivingBase)aList;
                        if (checkEntity == entityplayer) {
                            continue;
                        }
                        final MovingObjectPosition hit = checkEntity.field_70121_D.func_72327_a(posVec, lookVec);
                        if (hit == null) {
                            continue;
                        }
                        hitLiving = checkEntity;
                    }
                    if (itemstack.func_77960_j() >= itemstack.func_77958_k() && this.type.toolLife > 0) {
                        return itemstack;
                    }
                    hitLiving.func_70690_d(new PotionEffect(Potion.field_76428_l.field_76415_H, this.type.healAmount, this.type.healStrength));
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(hitLiving.field_70165_t, hitLiving.field_70163_u, hitLiving.field_70161_v, 5, "heart"), new NetworkRegistry.TargetPoint(hitLiving.field_71093_bK, hitLiving.field_70165_t, hitLiving.field_70163_u, hitLiving.field_70161_v, 50.0));
                    if (!entityplayer.field_71075_bZ.field_75098_d && this.type.toolLife > 0) {
                        itemstack.func_77964_b(itemstack.func_77960_j() + 1);
                    }
                    if (this.type.toolLife > 0 && this.type.destroyOnEmpty && itemstack.func_77960_j() >= itemstack.func_77958_k()) {
                        --itemstack.field_77994_a;
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
        return (this.type == null) ? this.func_77658_a() : this.type.name;
    }
}
