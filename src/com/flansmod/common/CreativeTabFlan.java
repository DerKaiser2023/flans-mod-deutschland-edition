// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.guns.ItemGrenade;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemAttachment;
import net.minecraft.item.ItemBlock;
import com.flansmod.common.types.IFlanItem;
import java.util.Comparator;
import java.util.List;
import net.minecraft.block.Block;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabFlan extends CreativeTabs
{
    public int type;
    public int icon;
    public int time;
    
    public CreativeTabFlan(final int i) {
        super("tabFlan" + i);
        this.time = 0;
        this.type = i;
    }
    
    public Item func_78016_d() {
        return null;
    }
    
    public ItemStack func_151244_d() {
        this.icon = FlansMod.ticker / 20;
        switch (this.type) {
            case 0: {
                return (GunType.gunList.size() == 0) ? new ItemStack((Item)FlansMod.opStick, 1, 5) : new ItemStack((Item)FlansMod.opStick, 1, 5);
            }
            case 1: {
                return (DriveableType.types.size() == 0) ? new ItemStack((Item)FlansMod.opStick, 1, 1) : new ItemStack((Item)FlansMod.opStick, 1, 1);
            }
            case 2: {
                return (FlansMod.partItems.size() == 0) ? new ItemStack((Item)FlansMod.opStick, 1, 3) : new ItemStack((Item)FlansMod.opStick, 1, 3);
            }
            case 3: {
                return (FlansMod.armourItems.size() == 0) ? new ItemStack((Item)FlansMod.opStick, 1, 0) : new ItemStack((Item)FlansMod.opStick, 1, 0);
            }
            case 4: {
                return (FlansMod.mechaItems.size() == 0) ? new ItemStack((Item)FlansMod.opStick, 1, 2) : new ItemStack((Item)FlansMod.opStick, 1, 2);
            }
            default: {
                return new ItemStack((Block)FlansMod.workbench);
            }
        }
    }
    
    @SideOnly(Side.CLIENT)
    public void func_78018_a(final List list) {
        super.func_78018_a(list);
        final Comparator cmp = new Comparator<ItemStack>() {
            @Override
            public int compare(final ItemStack is1, final ItemStack is2) {
                final String s1 = is1.func_77977_a();
                final String s2 = is2.func_77977_a();
                final Item i1 = is1.func_77973_b();
                final Item i2 = is2.func_77973_b();
                if (i1 instanceof IFlanItem && i2 instanceof IFlanItem) {
                    final String it1 = ((IFlanItem)i1).getInfoType().packName;
                    final String it2 = ((IFlanItem)i2).getInfoType().packName;
                    final int cmp = it1.compareTo(it2);
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                if (i1 instanceof ItemBlockManyNames && !(i2 instanceof ItemBlockManyNames)) {
                    return -1;
                }
                if (!(i1 instanceof ItemBlockManyNames) && i2 instanceof ItemBlockManyNames) {
                    return 1;
                }
                if (i1 instanceof ItemBlock && !(i2 instanceof ItemBlock)) {
                    return -1;
                }
                if (!(i1 instanceof ItemBlock) && i2 instanceof ItemBlock) {
                    return 1;
                }
                if (i1 instanceof ItemAttachment && !(i2 instanceof ItemAttachment)) {
                    return -1;
                }
                if (!(i1 instanceof ItemAttachment) && i2 instanceof ItemAttachment) {
                    return 1;
                }
                if (i1 instanceof ItemAAGun && !(i2 instanceof ItemAAGun)) {
                    return -1;
                }
                if (!(i1 instanceof ItemAAGun) && i2 instanceof ItemAAGun) {
                    return 1;
                }
                if (i1 instanceof ItemVehicle && i2 instanceof ItemBullet) {
                    return 1;
                }
                if (i1 instanceof ItemBullet && i2 instanceof ItemVehicle) {
                    return -1;
                }
                if (i1 instanceof ItemPlane && i2 instanceof ItemBullet) {
                    return 1;
                }
                if (i1 instanceof ItemBullet && i2 instanceof ItemPlane) {
                    return -1;
                }
                DriveableType dt1 = null;
                DriveableType dt2 = null;
                if (i1 instanceof ItemVehicle) {
                    dt1 = ((ItemVehicle)i1).type;
                }
                if (i2 instanceof ItemVehicle) {
                    dt2 = ((ItemVehicle)i2).type;
                }
                if (i1 instanceof ItemPlane) {
                    dt1 = ((ItemPlane)i1).type;
                }
                if (i2 instanceof ItemPlane) {
                    dt2 = ((ItemPlane)i2).type;
                }
                if (dt1 != null && dt2 != null) {
                    String ct1 = "";
                    final String ct2 = "";
                    if (dt1.modelString.indexOf(".") >= 1) {
                        ct1 = dt1.modelString.substring(0, dt1.modelString.indexOf(".") - 1);
                    }
                    if (dt2.modelString.indexOf(".") >= 1) {
                        ct1 = dt2.modelString.substring(0, dt2.modelString.indexOf(".") - 1);
                    }
                    if (!ct1.equals(ct2)) {
                        return ct1.compareTo(ct2);
                    }
                }
                if (i1 instanceof ItemVehicle && !(i2 instanceof ItemVehicle)) {
                    return -1;
                }
                if (!(i1 instanceof ItemVehicle) && i2 instanceof ItemVehicle) {
                    return 1;
                }
                if (i1 instanceof ItemPlane && !(i2 instanceof ItemPlane)) {
                    return -1;
                }
                if (!(i1 instanceof ItemPlane) && i2 instanceof ItemPlane) {
                    return 1;
                }
                if (i1 instanceof ItemPlane && i2 instanceof ItemPlane) {
                    final EnumPlaneMode epm1 = ((ItemPlane)i1).type.mode;
                    final EnumPlaneMode epm2 = ((ItemPlane)i2).type.mode;
                    return epm1.compareTo(epm2);
                }
                if (!(i1 instanceof ItemGrenade) && i2 instanceof ItemGrenade) {
                    return -1;
                }
                if (i1 instanceof ItemGrenade && !(i2 instanceof ItemGrenade)) {
                    return 1;
                }
                return s1.compareTo(s2);
            }
        };
        try {
            Collections.sort((List<Object>)list, cmp);
        }
        catch (final Exception ex) {}
    }
}
