// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns;

import net.minecraft.entity.Entity;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.types.InfoType;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.settings.GameSettings;
import java.util.Collection;
import java.util.Collections;
import net.minecraft.client.Minecraft;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;

public class ItemBullet extends ItemShootable implements IFlanItem
{
    public BulletType type;
    
    public ItemBullet(final BulletType infoType) {
        super(infoType);
        this.type = infoType;
        this.func_77625_d(this.type.maxStackSize);
        this.func_77627_a(true);
        this.type.item = this;
        switch (this.type.weaponType) {
            case SHELL:
            case BOMB:
            case MINE:
            case MISSILE: {
                this.func_77637_a((CreativeTabs)FlansMod.tabFlanDriveables);
                break;
            }
            default: {
                this.func_77637_a((CreativeTabs)FlansMod.tabFlanGuns);
                break;
            }
        }
    }
    
    public boolean isRepairable() {
        return this.canRepair;
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List lines, final boolean b) {
        final KeyBinding shift = Minecraft.func_71410_x().field_71474_y.field_74311_E;
        if (!this.type.packName.isEmpty()) {
            lines.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(lines, this.type.description.split("_"));
        }
        if (this.type.roundsPerItem > 1) {
            lines.add("§6Rounds§7: " + (float)this.type.roundsPerItem);
        }
        if (this.type.damageVsLiving > 1.0f) {
            lines.add("§6Soft Target Damage§7: " + this.type.damageVsLiving);
        }
        if (this.type.damageVsVehicles > 1.0f) {
            lines.add("§6Hard Target Damage§7: " + this.type.damageVsVehicles);
        }
        if (this.type.damageVsPlanes > 1.0f) {
            lines.add("§6Air Target Damage§7: " + this.type.damageVsVehicles);
        }
        if (this.type.bodyarmorPen != 500.0f) {
            lines.add("§2Body Armor Penetration§7: " + this.type.bodyarmorPen);
        }
        if (this.type.armorPen > 2.0f) {
            lines.add("§2Tank Armor Penetration§7: " + (float)this.type.armorPen + " mm");
        }
        if (this.type.HEAT) {
            lines.add("Has Shaped-Charge (Weak Against Composite armor)");
        }
        if (!GameSettings.func_100015_a(shift) && this.type.dynamicBulletDelay < 8999) {
            lines.add("Hold §b§o" + GameSettings.func_74298_c(shift.func_151463_i()) + "§r§7 for long range details");
        }
        else if (this.type.dynamicBulletDelay < 8999) {
            lines.add("");
            lines.add("§oLong-Range Performance: ");
            lines.add("§6Soft-Target Damage§7: " + this.type.dynamicDamage);
            lines.add("§2Body Armor Penetration§7: " + this.type.dynamicBodyarmorPen);
        }
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vec3 origin, final float yaw, final float pitch, final double motionX, final double motionY, final double motionZ, final EntityLivingBase shooter, final float gunDamage, final int itemDamage, final InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vector3f origin, final Vector3f direction, final EntityLivingBase shooter, final float spread, final float damage, final float speed, final int itemDamage, final InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vector3f origin, final Vector3f direction, final EntityLivingBase shooter, final float spread, final float damage, final float speed, final int itemDamage, final InfoType shotFrom, final Boolean ai) {
        if (!ai) {
            return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom, ai);
        }
        return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom, ai);
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final Vec3 origin, final float yaw, final float pitch, final EntityLivingBase shooter, final float spread, final float damage, final int itemDamage, final InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, shotFrom);
    }
    
    @Override
    public EntityShootable getEntity(final World worldObj, final EntityLivingBase player, final float bulletSpread, final float damage, final float bulletSpeed, final boolean b, final int itemDamage, final InfoType shotFrom, final float Xoffset, final float Yoffset, final float Zoffset) {
        return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, b, shotFrom, Xoffset, Yoffset, Zoffset);
    }
    
    @Override
    public InfoType getInfoType() {
        return this.type;
    }
    
    public Entity getEntity(final World worldObj, final EntityLivingBase player, final float bulletSpread, final float damage, final float bulletSpeed, final boolean b, final int itemDamage, final GunType type2, final javax.vecmath.Vector3f vector3f) {
        return null;
    }
}
