package com.flansmod.common.teams;

import api.hbm.item.IGasMask;
import com.hbm.util.ArmorRegistry;
import com.hbm.util.ArmorRegistry.HazardClass;
import com.hbm.util.ArmorUtil;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGasMaskFilter extends Item
{
    public ItemGasMaskFilter()
    {
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(1);
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack stack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player)
    {
        ItemStack helmet = player.inventory.armorItemInSlot(3);
        
        if(helmet == null)
            return stack;
        
        if(!(helmet.getItem() instanceof IGasMask))
            return stack;
        
        IGasMask mask = (IGasMask) helmet.getItem();
        if(!mask.isFilterApplicable(helmet, player, stack))
            return stack;
        
        ItemStack copy = stack.copy();
        ItemStack current = mask.getFilter(helmet, player);
        
        if(current != null) {
            stack = current;
        } else {
            stack.stackSize = 0;
        }
        
        mask.installFilter(helmet, player, copy);
        world.playSoundAtEntity(player, "hbm:item.gasmaskScrew", 1.0F, 1.0F);
        
        return stack;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(net.minecraft.client.renderer.texture.IIconRegister icon)
    {
        this.itemIcon = icon.registerIcon("flansmod:gasMaskFilter");
    }
}
