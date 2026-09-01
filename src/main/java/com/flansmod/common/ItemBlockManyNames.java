// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockManyNames extends ItemBlock
{
    public ItemBlockManyNames(final Block b) {
        super(b);
        this.setHasSubtypes(true);
    }
    
    public String getUnlocalizedName(final ItemStack stack) {
        return super.getUnlocalizedName() + "." + stack.getMetadata();
    }
    
    public int getMetadata(final int par1) {
        return par1;
    }
    
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[] { FlansMod.tabFlanDriveables, FlansMod.tabFlanGuns, FlansMod.tabFlanTeams, FlansMod.tabFlanParts };
    }
}
