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
        this.setMaxStackSize(1);
        ((ItemMechaAddon)(this.type.item = this)).setCreativeTab((CreativeTabs)FlansMod.tabFlanMechas);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    public void addInformation(final ItemStack stack, final EntityPlayer player, final List list, final boolean b) {
        if (!this.type.packName.isEmpty()) {
            list.add(this.type.packName);
        }
        if (this.type.description != null) {
            Collections.addAll(list, this.type.description.split("_"));
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
