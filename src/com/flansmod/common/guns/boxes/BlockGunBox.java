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
        super(Material.field_151575_d);
        this.func_149711_c(2.0f);
        this.func_149752_b(4.0f);
        this.type = t;
        this.func_149663_c(this.type.shortName);
        final Block block = Block.func_149684_b("flansmod:gunBox." + this.type.shortName);
        if (block != null) {
            throw new Exception("Caught an exception during block registration");
        }
        GameRegistry.registerBlock((Block)this, "gunBox." + this.type.shortName);
        this.func_149647_a((CreativeTabs)FlansMod.tabFlanGuns);
        this.type.block = this;
        this.type.item = Item.func_150898_a((Block)this);
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
                for (int j = 0; j < inventory.func_70302_i_(); ++j) {
                    final ItemStack stack = inventory.func_70301_a(j);
                    if (stack != null && stack.func_77973_b() == check.func_77973_b() && stack.func_77960_j() == check.func_77960_j()) {
                        numMatchingStuff += stack.field_77994_a;
                    }
                }
                if (numMatchingStuff < check.field_77994_a) {
                    canBuy = false;
                }
            }
            if (canBuy) {
                for (final ItemStack remove : entry.requiredParts) {
                    int amountLeft = remove.field_77994_a;
                    for (int j = 0; j < inventory.func_70302_i_(); ++j) {
                        final ItemStack stack = inventory.func_70301_a(j);
                        if (amountLeft > 0 && stack != null && stack.func_77973_b() == remove.func_77973_b() && stack.func_77960_j() == remove.func_77960_j()) {
                            amountLeft -= inventory.func_70298_a(j, amountLeft).field_77994_a;
                        }
                    }
                }
                final ItemStack gunStack = new ItemStack(entry.type.getItem());
                if (entry.type instanceof GunType) {
                    final GunType gunType = (GunType)entry.type;
                    final NBTTagCompound tags = new NBTTagCompound();
                    tags.func_74778_a("Paint", gunType.defaultPaintjob.iconName);
                    final NBTTagList ammoTagsList = new NBTTagList();
                    for (int i = 0; i < gunType.numPrimaryAmmoItems; ++i) {
                        ammoTagsList.func_74742_a((NBTBase)new NBTTagCompound());
                    }
                    tags.func_74782_a("ammo", (NBTBase)ammoTagsList);
                    gunStack.field_77990_d = tags;
                }
                if (!inventory.func_70441_a(gunStack)) {
                    inventory.field_70458_d.func_71019_a(gunStack, false);
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
    public IIcon func_149691_a(final int side, final int metadata) {
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
    
    public boolean func_149727_a(final World world, final int i, final int j, final int k, final EntityPlayer entityplayer, final int par6, final float par7, final float par8, final float par9) {
        if (entityplayer.func_70093_af()) {
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
    
    public void func_149749_a(final World world, final int x, final int y, final int z, final Block block, final int metadata) {
        super.func_149749_a(world, x, y, z, block, metadata);
    }
    
    @SideOnly(Side.CLIENT)
    public void func_149651_a(final IIconRegister register) {
        this.type.top = register.func_94245_a("FlansMod:" + this.type.topTexturePath);
        this.type.side = register.func_94245_a("FlansMod:" + this.type.sideTexturePath);
        this.type.bottom = register.func_94245_a("FlansMod:" + this.type.bottomTexturePath);
    }
}
