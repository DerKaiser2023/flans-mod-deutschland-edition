// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IIconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import java.util.Iterator;
import net.minecraft.inventory.IInventory;
import com.flansmod.common.CraftingInstance;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public class BlockArmourBox extends Block
{
    public ArmourBoxType type;
    
    public BlockArmourBox(final ArmourBoxType t) throws Exception {
        super(Material.wood);
        this.type = t;
        this.setUnlocalizedName(this.type.shortName);
        this.setHardness(2.0f);
        this.setResistance(4.0f);
        final Block block = Block.getBlockFromName("flansmod:armorBox." + this.type.shortName);
        if (block != null) {
            throw new Exception("Caught an exception during block registration");
        }
        GameRegistry.registerBlock((Block)this, "armorBox." + this.type.shortName);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanTeams);
        this.type.block = this;
        this.type.item = Item.getItemFromBlock((Block)this);
    }
    
    public void buyArmour(final String shortName, final int piece, final InventoryPlayer inventory) {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            FlansMod.proxy.buyArmour(shortName, piece, this.type);
        }
        ArmourBoxType.ArmourBoxEntry entryPicked = null;
        for (final ArmourBoxType.ArmourBoxEntry page : this.type.pages) {
            if (page.shortName.equals(shortName)) {
                entryPicked = page;
            }
        }
        if (entryPicked == null) {
            return;
        }
        final ItemStack resultStack = new ItemStack(entryPicked.armours[piece].item);
        final CraftingInstance crafting = new CraftingInstance((IInventory)inventory, entryPicked.requiredStacks[piece], resultStack);
        if (crafting.canCraft()) {
            crafting.craft(inventory.player);
        }
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int side, final int metadata) {
        if (this.type == null) {
            return null;
        }
        if (side == 1) {
            return this.type.top;
        }
        if (side == 0) {
            return this.type.bottom;
        }
        return this.type.side;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister register) {
        this.type.top = register.registerIcon("FlansMod:" + this.type.topTexturePath);
        this.type.side = register.registerIcon("FlansMod:" + this.type.sideTexturePath);
        this.type.bottom = register.registerIcon("FlansMod:" + this.type.bottomTexturePath);
    }
    
    public boolean onBlockActivated(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
        if (entityplayer.isSneaking()) {
            return false;
        }
        entityplayer.openGui((Object)FlansMod.INSTANCE, 11, world, i, j, k);
        return true;
    }
}
