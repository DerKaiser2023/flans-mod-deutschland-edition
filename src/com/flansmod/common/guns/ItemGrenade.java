// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import com.flansmod.common.vector.Vector3f;
import net.minecraft.util.Vec3;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.SideOnly;
import com.flansmod.common.PlayerData;
import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.Entity;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.Multimap;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;

public class ItemGrenade extends ItemShootable implements IFlanItem
{
    public GrenadeType type;
    
    public ItemGrenade(final GrenadeType t) {
        super(t);
        this.type = t;
        ((ItemGrenade)(this.type.item = this)).func_77637_a((CreativeTabs)FlansMod.tabFlanGuns);
    }
    
    public Multimap getAttributeModifiers(final ItemStack stack) {
        final Multimap multimap = super.getAttributeModifiers(stack);
        multimap.put((Object)SharedMonsterAttributes.field_111264_e.func_111108_a(), (Object)new AttributeModifier(ItemGrenade.field_111210_e, "Weapon modifier", (double)this.type.meleeDamage, 0));
        return multimap;
    }
    
    public boolean func_77662_d() {
        return true;
    }
    
    public boolean onEntitySwing(final EntityLivingBase entityLiving, final ItemStack stack) {
        return this.type.meleeDamage == 0;
    }
    
    public ItemStack func_77659_a(final ItemStack stack, final World world, final EntityPlayer player) {
        final PlayerData data = PlayerHandler.getPlayerData(player, world.field_72995_K ? Side.CLIENT : Side.SERVER);
        if (this.type.canThrow && data != null && data.shootTimeRight <= 0.0f && data.shootTimeLeft <= 0.0f && !TeamsManager.violence) {
            data.shootTimeRight = (float)this.type.throwDelay;
            final EntityGrenade grenade = new EntityGrenade(world, this.type, (EntityLivingBase)player);
            if (!world.field_72995_K) {
                world.func_72838_d((Entity)grenade);
            }
            if (this.type.remote) {
                data.remoteExplosives.add(grenade);
            }
            if (!player.field_71075_bZ.field_75098_d) {
                --stack.field_77994_a;
            }
            if (this.type.dropItemOnThrow != null) {
                String itemName = this.type.dropItemOnDetonate;
                int damage = 0;
                if (itemName.contains(".")) {
                    damage = Integer.parseInt(itemName.split("\\.")[1]);
                    itemName = itemName.split("\\.")[0];
                }
                final ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
                world.func_72838_d((Entity)new EntityItem(world, player.field_70165_t, player.field_70163_u, player.field_70161_v, dropStack));
            }
        }
        return stack;
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    @Override
    public InfoType getInfoType() {
        return this.type;
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vec3 origin, final float yaw, final float pitch, final double motionX, final double motionY, final double motionZ, final EntityLivingBase shooter, final float gunDamage, final int itemDamage, final InfoType shotFrom) {
        return null;
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vector3f origin, final Vector3f direction, final EntityLivingBase thrower, final float spread, final float damage, final float speed, final int itemDamage, final InfoType shotFrom) {
        return this.getGrenade(worldObj, thrower);
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vec3 origin, final float yaw, final float pitch, final EntityLivingBase shooter, final float spread, final float damage, final int itemDamage, final InfoType shotFrom) {
        return null;
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final EntityLivingBase player, final float bulletSpread, final float damage, final float bulletSpeed, final boolean b, final int itemDamage, final InfoType shotFrom, final float Xoffset, final float Yoffset, final float Zoffset) {
        return this.getGrenade(worldObj, player);
    }
    
    public EntityGrenade getGrenade(final World world, final EntityLivingBase thrower) {
        final EntityGrenade grenade = new EntityGrenade(world, this.type, thrower);
        if (this.type.remote && thrower instanceof EntityPlayer) {
            PlayerHandler.getPlayerData((EntityPlayer)thrower).remoteExplosives.add(grenade);
        }
        return grenade;
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vector3f origin, final Vector3f direction, final EntityLivingBase shooter, final float spread, final float damage, final float speed, final int itemDamage, final InfoType shotFrom, final Boolean ai) {
        return null;
    }
}
