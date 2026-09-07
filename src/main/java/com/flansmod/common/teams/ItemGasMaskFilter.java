package com.flansmod.common.teams;

import api.hbm.item.IGasMask;
import com.hbm.util.ArmorUtil;

import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.IFlanItem;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemGasMaskFilter extends Item implements IFlanItem
{
    public GasMaskFilterType type;
    
    public ItemGasMaskFilter(final GasMaskFilterType t) {
        this.type = t;
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem((Item)this, this.type.shortName, "flansmod");
    }
    
    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
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
    
    @Override
    public InfoType getInfoType() {
        return this.type;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(net.minecraft.client.renderer.texture.IIconRegister icon) {
        this.itemIcon = icon.registerIcon("FlansMod:" + this.type.iconPath);
    }
}
