// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.boxes;

import net.minecraft.client.renderer.texture.IIconRegister;
import java.util.ArrayList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.types.InfoType;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public class BlockGunBox extends Block
{
    public GunBoxType type;
    
    public BlockGunBox(final GunBoxType t) throws Exception {
        super(Material.wood);
        this.setHardness(2.0f);
        this.setResistance(4.0f);
        this.type = t;
        this.setUnlocalizedName(this.type.shortName);
        final Block block = Block.getBlockFromName("flansmod:gunBox." + this.type.shortName);
        if (block != null) {
            throw new Exception("Caught an exception during block registration");
        }
        GameRegistry.registerBlock((Block)this, "gunBox." + this.type.shortName);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
        this.type.block = this;
        this.type.item = Item.getItemFromBlock((Block)this);
    }
    
    public void buyGun(final InfoType item, final InventoryPlayer inventory, final GunBoxType type) {
        if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
            FlansMod.proxy.buyGun(type, item);
        }
        final GunBoxEntry entry = this.searchFor(item);
        if (entry != null) {
            boolean canBuy = true;
            for (final ItemStack check : entry.requiredParts) {
                int numMatchingStuff = 0;
                for (int j = 0; j < inventory.getSizeInventory(); ++j) {
                    final ItemStack stack = inventory.getStackInSlot(j);
                    if (stack != null && stack.getItem() == check.getItem() && stack.getMetadata() == check.getMetadata()) {
                        numMatchingStuff += stack.stackSize;
                    }
                }
                if (numMatchingStuff < check.stackSize) {
                    canBuy = false;
                }
            }
            if (canBuy) {
                for (final ItemStack remove : entry.requiredParts) {
                    int amountLeft = remove.stackSize;
                    for (int j = 0; j < inventory.getSizeInventory(); ++j) {
                        final ItemStack stack = inventory.getStackInSlot(j);
                        if (amountLeft > 0 && stack != null && stack.getItem() == remove.getItem() && stack.getMetadata() == remove.getMetadata()) {
                            amountLeft -= inventory.decrStackSize(j, amountLeft).stackSize;
                        }
                    }
                }
                final ItemStack gunStack = new ItemStack(entry.type.getItem());
                if (entry.type instanceof GunType) {
                    final GunType gunType = (GunType)entry.type;
                    final NBTTagCompound tags = new NBTTagCompound();
                    tags.setString("Paint", gunType.defaultPaintjob.iconName);
                    final NBTTagList ammoTagsList = new NBTTagList();
                    for (int i = 0; i < gunType.numPrimaryAmmoItems; ++i) {
                        ammoTagsList.appendTag((NBTBase)new NBTTagCompound());
                    }
                    tags.setTag("ammo", (NBTBase)ammoTagsList);
                    gunStack.stackTagCompound = tags;
                }
                if (!inventory.addItemStackToInventory(gunStack)) {
                    inventory.player.dropPlayerItemWithRandomChoice(gunStack, false);
                }
            }
        }
    }
    
    private GunBoxEntry searchFor(final InfoType item) {
        for (final GunPage page : this.type.gunPages) {
            for (final GunBoxEntry entry : page.gunList) {
                if (entry.type == item) {
                    return entry;
                }
                if (!entry.isAmmoNullOrEmpty()) {
                    for (final GunBoxEntry ammoEntry : entry.ammoEntryList) {
                        if (ammoEntry.type == item) {
                            return ammoEntry;
                        }
                    }
                }
            }
        }
        return null;
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
    
    public boolean onBlockActivated(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
        if (entityplayer.isSneaking()) {
            return false;
        }
        entityplayer.openGui((Object)FlansMod.INSTANCE, 5, world, i, j, k);
        return true;
    }
    
    public ArrayList<ItemStack> getDrops(final World world, final int x, final int y, final int z, final int metadata, final int fortune) {
        final ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack((Block)this, 1, 0));
        return ret;
    }
    
    public void breakBlock(final World world, final int x, final int y, final int z, final Block block, final int metadata) {
        super.breakBlock(world, x, y, z, block, metadata);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister register) {
        this.type.top = register.registerIcon("FlansMod:" + this.type.topTexturePath);
        this.type.side = register.registerIcon("FlansMod:" + this.type.sideTexturePath);
        this.type.bottom = register.registerIcon("FlansMod:" + this.type.bottomTexturePath);
    }
}
