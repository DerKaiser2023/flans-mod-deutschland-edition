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
        super(Material.iron);
        this.setHardness(3.0f);
        this.setResistance(6.0f);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanDriveables);
    }
    
    public void getSubBlocks(final Item item, final CreativeTabs tab, final List par3List) {
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
    
    public IIcon getIcon(final int i, final int j) {
        if (i == 1 && j < this.top.length) {
            return this.top[j];
        }
        return this.side;
    }
    
    public boolean onBlockActivated(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
        switch (world.getBlockMetadata(i, j, k)) {
            case 0: {
                if (world.isRemote) {
                    entityplayer.openGui((Object)FlansMod.INSTANCE, 0, world, i, j, k);
                    break;
                }
                break;
            }
            case 1: {
                if (!world.isRemote) {
                    entityplayer.openGui((Object)FlansMod.INSTANCE, 2, world, i, j, k);
                    break;
                }
                break;
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister register) {
        (this.top = new IIcon[3])[0] = register.registerIcon("FlansMod:planeCraftingTableSmall");
        this.top[1] = register.registerIcon("FlansMod:planeCraftingTableLarge");
        this.top[2] = register.registerIcon("FlansMod:vehicleCraftingTable");
        this.side = register.registerIcon("FlansMod:planeCraftingTableSide");
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
}
