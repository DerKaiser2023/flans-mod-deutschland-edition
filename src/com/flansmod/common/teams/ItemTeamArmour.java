// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import com.flansmod.common.PlayerData;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import com.flansmod.common.types.InfoType;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.Entity;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.PlayerHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import java.util.UUID;
import com.flansmod.common.types.IFlanItem;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraft.item.ItemArmor;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IFlanItem
{
    public ArmourType type;
    protected static final UUID[] uuid;
    public int timer;
    public int SoundTimer;
    public int rechargeTimer;
    public float secretBody;
    public float secretArm;
    public float secretNape;
    public float secretHead;
    public float secretFace;
    public float secretLeg;
    public double secretBack;
    public float pouchMultiplier;
    public boolean hasPouch;
    public boolean hasFrontMount;
    public float frontMountY1;
    public float frontMountZ1;
    public float frontMountY2;
    public float frontMountZ2;
    public float frontMountRotation;
    boolean hasTopMount;
    float topMountY;
    float topMountZ;
    float topMountRotation;
    
    public ItemTeamArmour(final ArmourType t) {
        super(ItemArmor.ArmorMaterial.CLOTH, 0, t.type);
        this.timer = 0;
        this.SoundTimer = 0;
        this.rechargeTimer = 0;
        this.secretBody = 0.0f;
        this.secretArm = 0.0f;
        this.secretNape = 0.0f;
        this.secretHead = 0.0f;
        this.secretFace = 0.0f;
        this.secretLeg = 0.0f;
        this.secretBack = 0.0;
        this.pouchMultiplier = 1.0f;
        this.hasPouch = false;
        this.hasFrontMount = false;
        this.frontMountY1 = 1.0f;
        this.frontMountZ1 = 1.0f;
        this.frontMountY2 = 1.0f;
        this.frontMountZ2 = 1.0f;
        this.frontMountRotation = 1.0f;
        this.hasTopMount = false;
        this.topMountY = 1.0f;
        this.topMountZ = 1.0f;
        this.topMountRotation = 1.0f;
        this.type = t;
        ((ItemTeamArmour)(this.type.item = (Item)this)).func_77637_a((CreativeTabs)FlansMod.tabFlanTeams);
        if (t.durability > 0) {
            this.func_77656_e(t.durability);
        }
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public ItemTeamArmour(final ItemArmor.ArmorMaterial armorMaterial, final int renderIndex, final int armourType) {
        super(armorMaterial, renderIndex, armourType);
        this.timer = 0;
        this.SoundTimer = 0;
        this.rechargeTimer = 0;
        this.secretBody = 0.0f;
        this.secretArm = 0.0f;
        this.secretNape = 0.0f;
        this.secretHead = 0.0f;
        this.secretFace = 0.0f;
        this.secretLeg = 0.0f;
        this.secretBack = 0.0;
        this.pouchMultiplier = 1.0f;
        this.hasPouch = false;
        this.hasFrontMount = false;
        this.frontMountY1 = 1.0f;
        this.frontMountZ1 = 1.0f;
        this.frontMountY2 = 1.0f;
        this.frontMountZ2 = 1.0f;
        this.frontMountRotation = 1.0f;
        this.hasTopMount = false;
        this.topMountY = 1.0f;
        this.topMountZ = 1.0f;
        this.topMountRotation = 1.0f;
    }
    
    public ISpecialArmor.ArmorProperties getProperties(final EntityLivingBase player, final ItemStack armor, final DamageSource source, final double damage, final int slot) {
        this.secretBody = this.type.bodyArmor;
        this.secretHead = this.type.headArmor;
        this.secretNape = this.type.napeArmor;
        this.secretFace = this.type.faceArmor;
        this.secretArm = this.type.armArmor;
        this.secretLeg = this.type.legArmor;
        this.secretBack = this.type.backArmor;
        this.pouchMultiplier = this.type.pouchMultiplier;
        this.hasPouch = this.type.hasPouch;
        this.hasFrontMount = this.type.hasFrontMount;
        this.frontMountY1 = this.type.frontMountY1;
        this.frontMountZ1 = this.type.frontMountZ1;
        this.frontMountY2 = this.type.frontMountY2;
        this.frontMountZ2 = this.type.frontMountZ2;
        this.frontMountRotation = this.type.frontMountRotation;
        this.hasTopMount = this.type.hasTopMount;
        this.topMountY = this.type.topMountY;
        this.topMountZ = this.type.topMountZ;
        this.topMountRotation = this.type.topMountRotation;
        if (armor.func_77960_j() >= this.type.durability && this.type.energyShield) {
            return new ISpecialArmor.ArmorProperties(1, this.type.backupDefence, 900);
        }
        if (armor.func_77960_j() < this.type.durability && this.type.energyShield) {
            return new ISpecialArmor.ArmorProperties(1, this.type.defence, 900);
        }
        return new ISpecialArmor.ArmorProperties(1, this.type.defence, 900);
    }
    
    public int getArmorDisplay(final EntityPlayer player, final ItemStack armor, final int slot) {
        return (int)(this.type.defence * 20.0);
    }
    
    public void damageArmor(final EntityLivingBase entity, final ItemStack stack, final DamageSource source, final int damage, final int slot) {
        super.setDamage(stack, (int)(stack.func_77960_j() + 1 + (int)(float)damage / 2.0f));
        if (this.type.energyShield && entity instanceof EntityPlayer) {
            final EntityPlayer player = (EntityPlayer)entity;
            PlayerHandler.getPlayerData(player).shieldTimer = this.type.rechargeTimer;
        }
        if (this.type.energyShield && stack.func_77960_j() < this.type.durability) {
            PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 5.0, entity.field_71093_bK, this.type.ShieldHit, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 25, "crit"), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 100.0f, entity.field_71093_bK);
            if (entity instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)entity;
                PlayerHandler.getPlayerData(player).shieldHit = 10;
            }
        }
        if (this.type.energyShield && stack.func_77960_j() == this.type.durability) {
            PacketPlaySound.sendSoundPacket(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 5.0, entity.field_71093_bK, this.type.ShieldKill, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 75, "fireworksSpark"), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, 150.0f, entity.field_71093_bK);
        }
        if (stack.func_77960_j() >= this.type.durability && !this.type.energyShield) {
            --stack.field_77994_a;
        }
    }
    
    public String getArmorTexture(final ItemStack itemstack, final Entity entity, final int slot, final String s) {
        return "flansmod:armor/" + this.type.armourTextureName + "_" + ((this.type.type == 2) ? "2" : "1") + ".png";
    }
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        lines.add("Defense: " + (float)(10.0 * this.type.defence) + " bars");
        if (this.type.headArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Head protection: " + this.type.headArmor);
        }
        if (this.type.faceArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Face protection: " + this.type.faceArmor);
        }
        if (this.type.bodyArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Front Chest protection: " + this.type.bodyArmor);
        }
        if (this.type.backArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Back Chest protection: " + this.type.backArmor);
        }
        if (this.type.armArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Arm protection: " + this.type.armArmor);
        }
        if (this.type.legArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Leg protection: " + this.type.legArmor);
        }
        if (this.type.napeArmor > 1.0f && !this.type.energyShield) {
            lines.add("§2Nape protection: " + this.type.napeArmor);
        }
        if (this.type.headArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Head protection: " + this.secretHead);
        }
        if (this.type.faceArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Face protection: " + this.secretFace);
        }
        if (this.type.bodyArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Front Chest protection: " + this.secretBody);
        }
        if (this.type.backArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Back Chest protection: " + (float)this.secretBack);
        }
        if (this.type.armArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Arm protection: " + this.secretArm);
        }
        if (this.type.legArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Leg protection: " + this.secretLeg);
        }
        if (this.type.napeArmor > 1.0f && this.type.energyShield) {
            lines.add("§2Leg protection: " + this.secretNape);
        }
        if (this.type.durability > 101.0f) {
            lines.add("§2Max Durability: " + (float)this.type.durability);
        }
        if (Math.abs(this.type.jumpModifier - 1.0f) > 0.01f) {
            lines.add("§3+" + (int)((this.type.jumpModifier - 1.0f) * 100.0f) + "% Jump Height");
        }
        if (this.type.smokeProtection) {
            lines.add("§2+Smoke Protection");
        }
        if (this.type.nightVision) {
            lines.add("§2+Night Vision");
        }
        if (this.type.invisible) {
            lines.add("§2+Invisiblity");
        }
        if (this.type.negateFallDamage) {
            lines.add("§2+Negates Fall Damage");
        }
        if (this.type.submarine) {
            lines.add("§2+Allows Underwater Breathing");
        }
        if (this.type.playermodel) {
            lines.add("§2+Custom Player Model");
        }
        if (this.type.regenerate) {
            lines.add("§2+Has Personal Energy Shield");
        }
        if (this.type.hunger) {
            lines.add("§c-Reduces Stamina");
        }
        if (this.type.hasPouch && this.type.pouchMultiplier > 1.0f) {
            lines.add("§c-Reload is " + this.type.pouchMultiplier + "§c times slower");
        }
        if (this.type.hasPouch && this.type.pouchMultiplier <= 1.0f) {
            lines.add("§2+Reload is " + 1.0f / this.type.pouchMultiplier + "§2 times faster");
        }
        if (this.type.hasOldGunPouch && this.type.pouchMultiplier > 1.0f) {
            lines.add("§c-Reload for old firearms is " + this.type.pouchMultiplier + "§c times slower");
        }
        if (this.type.hasOldGunPouch && this.type.pouchMultiplier <= 1.0f) {
            lines.add("§2+Reload for old firearms is " + 1.0f / this.type.pouchMultiplier + "§2 times faster");
        }
        if (this.type.hasBowPouch && this.type.pouchMultiplier > 1.0f) {
            lines.add("§c-Reload for bows is " + this.type.pouchMultiplier + "§c times slower");
        }
        if (this.type.hasBowPouch && this.type.pouchMultiplier <= 1.0f) {
            lines.add("§2+Reload for bows is " + 1.0f / this.type.pouchMultiplier + "§2 times faster");
        }
        if (this.type.hasHeavyPouch && this.type.pouchMultiplier > 1.0f) {
            lines.add("§c-Reload for heavy weapons is " + this.type.pouchMultiplier + "§c times slower");
        }
        if (this.type.hasHeavyPouch && this.type.pouchMultiplier <= 1.0f) {
            lines.add("§2+Reload for heavy weapons is " + 1.0f / this.type.pouchMultiplier + "§2 times faster");
        }
        if (this.type.hasGunPouch && this.type.pouchMultiplier > 1.0f) {
            lines.add("§c-Reload for repeating firearms is " + this.type.pouchMultiplier + "§c times slower");
        }
        if (this.type.hasGunPouch && this.type.pouchMultiplier <= 1.0f) {
            lines.add("§2+Reload for repeating firearms is " + 1.0f / this.type.pouchMultiplier + "§2 times faster");
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean func_77623_v() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    public Multimap getAttributeModifiers(final ItemStack stack) {
        final Multimap map = super.getAttributeModifiers(stack);
        map.put((Object)SharedMonsterAttributes.field_111266_c.func_111108_a(), (Object)new AttributeModifier(ItemTeamArmour.uuid[this.type.type], "KnockbackResist", (double)this.type.knockbackModifier, 0));
        map.put((Object)SharedMonsterAttributes.field_111263_d.func_111108_a(), (Object)new AttributeModifier(ItemTeamArmour.uuid[this.type.type], "MovementSpeed", (double)(this.type.moveSpeedModifier - 1.0f), 2));
        map.put((Object)SharedMonsterAttributes.field_111263_d.func_111108_a(), (Object)new AttributeModifier(ItemTeamArmour.uuid[this.type.type], "hunger", (double)(this.type.moveSpeedModifier - 1.0f), 2));
        return map;
    }
    
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(final EntityLivingBase entityLiving, final ItemStack itemStack, final int armorSlot) {
        return this.type.model;
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
    
    public void onArmorTick(final World world, final EntityPlayer player, final ItemStack itemStack) {
        if (this.type.energyShield && itemStack.func_77960_j() > this.type.durability + 2) {
            super.setDamage(itemStack, itemStack.func_77960_j() - 1);
        }
        if (itemStack.func_77960_j() == 0) {
            PlayerHandler.getPlayerData(player).shieldTimer = this.type.rechargeTimer;
        }
        if (itemStack.func_77960_j() >= 0 && PlayerHandler.getPlayerData(player).shieldTimer > 0) {
            final PlayerData playerData = PlayerHandler.getPlayerData(player);
            --playerData.shieldTimer;
        }
        if (itemStack.func_77960_j() >= 0 && PlayerHandler.getPlayerData(player).shieldTimer == 0 && this.type.energyShield) {
            final PlayerData playerData2 = PlayerHandler.getPlayerData(player);
            ++playerData2.rechargeTimer;
            if (PlayerHandler.getPlayerData(player).rechargeTimer == this.type.rechargeDelay) {
                PlayerHandler.getPlayerData(player).rechargeTimer = 0;
            }
            if (PlayerHandler.getPlayerData(player).rechargeTimer == 1) {
                super.setDamage(itemStack, itemStack.func_77960_j() - 1);
            }
        }
        if (itemStack.func_77960_j() >= 0 && PlayerHandler.getPlayerData(player).shieldTimer == 1 && this.type.energyShield) {
            PacketPlaySound.sendSoundPacket(player.field_70165_t, player.field_70163_u, player.field_70161_v, 5.0, player.field_71093_bK, this.type.rechargeSound, true);
            FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.field_70165_t, player.field_70163_u, player.field_70161_v, 100, "instantSpell"), player.field_70165_t, player.field_70163_u, player.field_70161_v, 100.0f, player.field_71093_bK);
        }
        if (itemStack.func_77960_j() < this.type.durability && this.type.energyShield) {
            PlayerHandler.getPlayerData(player).SoundTimer = 0;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretBody = this.type.ReserveBodyArmor;
            final PlayerData playerData3 = PlayerHandler.getPlayerData(player);
            ++playerData3.SoundTimer;
            if (PlayerHandler.getPlayerData(player).SoundTimer == this.type.warningSoundTimer) {
                PlayerHandler.getPlayerData(player).SoundTimer = 0;
            }
            if (PlayerHandler.getPlayerData(player).SoundTimer == 1 && PlayerHandler.getPlayerData(player).shieldTimer > 1) {
                PacketPlaySound.sendSoundPacket(player.field_70165_t, player.field_70163_u, player.field_70161_v, 5.0, player.field_71093_bK, this.type.warningSound, false);
            }
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretBody = this.type.bodyArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretBack = this.type.ReserveBackArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretBack = this.type.backArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretHead = this.type.ReserveHeadArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretHead = this.type.headArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretNape = this.type.ReserveNapeArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretNape = this.type.napeArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretFace = this.type.ReserveFaceArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretFace = this.type.faceArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretArm = this.type.ReserveArmArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretArm = this.type.armArmor;
        }
        if (itemStack.func_77960_j() >= this.type.durability) {
            this.secretLeg = this.type.ReserveLegArmor;
        }
        else if (itemStack.func_77960_j() < this.type.durability) {
            this.secretLeg = this.type.legArmor;
        }
        if (this.type.nightVision && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76439_r.field_76415_H, 250));
        }
        if (this.type.invisible && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76441_p.field_76415_H, 250));
            PlayerHandler.getPlayerData(player).invisArmor = true;
        }
        if (!this.type.invisible) {
            PlayerHandler.getPlayerData(player).invisArmor = false;
        }
        if (this.type.jumpModifier > 1.01f && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76430_j.field_76415_H, 250, (int)((this.type.jumpModifier - 1.0f) * 2.0f), true));
        }
        if (this.type.submarine && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76427_o.field_76415_H, 250));
        }
        if (this.type.playermodel && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76441_p.field_76415_H, 100));
        }
        if (this.type.hunger && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76438_s.field_76415_H, 250));
        }
        if (this.type.regenerate && FlansMod.ticker % 25 == 0) {
            player.func_70690_d(new PotionEffect(Potion.field_76428_l.field_76415_H, 250));
        }
        if (this.type.negateFallDamage) {
            player.field_70143_R = 0.0f;
        }
        if (this.type.onWaterWalking) {
            if (player.func_70090_H()) {
                player.field_71075_bZ.field_75101_c = true;
            }
            else {
                player.field_71075_bZ.field_75100_b = false;
            }
        }
    }
    
    static {
        uuid = new UUID[] { UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID() };
    }
}
