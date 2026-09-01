// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.mechas;

import com.flansmod.common.types.InfoType;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import net.minecraft.item.Item;

public class ItemMechaAddon extends Item implements IFlanItem
{
    public MechaItemType type;
    
    public ItemMechaAddon(final MechaItemType type1) {
        this.type = type1;
        this.func_77625_d(1);
        ((ItemMechaAddon)(this.type.item = this)).func_77637_a((CreativeTabs)FlansMod.tabFlanMechas);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void func_77624_a(final ItemStack stack, final EntityPlayer player, final List list, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            list.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(list, this.type.description.split("_"));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int func_82790_a(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_94581_a(final IIconRegister icon) {
        this.field_77791_bV = icon.func_94245_a("FlansMod:" + this.type.iconPath);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
}
