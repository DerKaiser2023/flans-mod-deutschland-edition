// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.block.Block;

public class BlockFlansWorkbench extends Block
{
    private IIcon side;
    private IIcon[] top;
    
    public BlockFlansWorkbench(final int j, final int k) {
        super(Material.field_151573_f);
        this.func_149711_c(3.0f);
        this.func_149752_b(6.0f);
        this.func_149647_a((CreativeTabs)FlansMod.tabFlanDriveables);
    }
    
    public void func_149666_a(final Item item, final CreativeTabs tab, final List par3List) {
        if (tab == FlansMod.tabFlanDriveables) {
            par3List.add(new ItemStack(item, 1, 0));
        }
        else if (tab == FlansMod.tabFlanGuns) {
            par3List.add(new ItemStack(item, 1, 1));
        }
        else if (tab == FlansMod.tabFlanParts) {
            par3List.add(new ItemStack(item, 1, 2));
        }
    }
    
    public IIcon func_149691_a(final int i, final int j) {
        if (i == 1 && j < this.top.length) {
            return this.top[j];
        }
        return this.side;
    }
    
    public boolean func_149727_a(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
        switch (world.func_72805_g(i, j, k)) {
            case 0: {
                if (world.field_72995_K) {
                    entityplayer.openGui((Object)FlansMod.INSTANCE, 0, world, i, j, k);
                    break;
                }
                break;
            }
            case 1: {
                if (!world.field_72995_K) {
                    entityplayer.openGui((Object)FlansMod.INSTANCE, 2, world, i, j, k);
                    break;
                }
                break;
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_149651_a(final IIconRegister register) {
        (this.top = new IIcon[3])[0] = register.func_94245_a("FlansMod:planeCraftingTableSmall");
        this.top[1] = register.func_94245_a("FlansMod:planeCraftingTableLarge");
        this.top[2] = register.func_94245_a("FlansMod:vehicleCraftingTable");
        this.side = register.func_94245_a("FlansMod:planeCraftingTableSide");
    }
    
    public int func_149692_a(final int par1) {
        return par1;
    }
}
