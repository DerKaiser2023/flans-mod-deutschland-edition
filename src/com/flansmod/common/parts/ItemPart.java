// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.parts;

import com.flansmod.common.types.InfoType;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.IFlanItem;
import net.minecraft.item.Item;

public class ItemPart extends Item implements IFlanItem
{
    public PartType type;
    
    public ItemPart(final PartType type1) {
        this.type = type1;
        this.func_77625_d(this.type.stackSize);
        if (this.type.category == 9) {
            this.func_77656_e(this.type.fuel);
            this.func_77627_a(true);
        }
        ((ItemPart)(this.type.item = this)).func_111206_d("FlansMod:" + this.type.iconPath);
        this.func_77637_a((CreativeTabs)FlansMod.tabFlanParts);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void func_77624_a(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        if (!this.type.packName.isEmpty()) {
            par3List.add(this.type.packName);
        }
        if (this.type.category == 9) {
            par3List.add("Fuel Stored: " + (this.type.fuel - par1ItemStack.func_77960_j()) + " / " + this.type.fuel);
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
