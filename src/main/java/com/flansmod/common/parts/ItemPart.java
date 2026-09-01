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
        this.setMaxStackSize(this.type.stackSize);
        if (this.type.category == 9) {
            this.setMaxDurability(this.type.fuel);
            this.setHasSubtypes(true);
        }
        ((ItemPart)(this.type.item = this)).setTextureName("FlansMod:" + this.type.iconPath);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanParts);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void addInformation(final ItemStack par1ItemStack, final EntityPlayer par2EntityPlayer, final List par3List, final boolean par4) {
        if (!this.type.packName.isEmpty()) {
            par3List.add(this.type.packName);
        }
        if (this.type.category == 9) {
            par3List.add("Fuel Stored: " + (this.type.fuel - par1ItemStack.getMetadata()) + " / " + this.type.fuel);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        return this.type.colour;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }
    
    public InfoType getInfoType() {
        return this.type;
    }
}
