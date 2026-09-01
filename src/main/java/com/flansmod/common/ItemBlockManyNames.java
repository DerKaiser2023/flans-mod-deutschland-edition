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
        this.func_77627_a(true);
    }
    
    public String func_77667_c(final ItemStack stack) {
        return super.func_77658_a() + "." + stack.func_77960_j();
    }
    
    public int func_77647_b(final int par1) {
        return par1;
    }
    
    public CreativeTabs[] getCreativeTabs() {
        return new CreativeTabs[] { FlansMod.tabFlanDriveables, FlansMod.tabFlanGuns, FlansMod.tabFlanTeams, FlansMod.tabFlanParts };
    }
}
