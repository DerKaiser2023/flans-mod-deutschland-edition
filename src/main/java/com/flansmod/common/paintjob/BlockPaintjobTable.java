// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.paintjob;

import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.flansmod.common.guns.InventoryHelper;
import net.minecraft.inventory.IInventory;
import net.minecraft.block.Block;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.block.BlockContainer;

public class BlockPaintjobTable extends BlockContainer
{
    private IIcon side;
    private IIcon top;
    
    public BlockPaintjobTable() {
        super(Material.field_151576_e);
        this.func_149711_c(2.0f);
        this.func_149752_b(4.0f);
        this.func_149663_c("paintjobTable");
        this.func_149647_a((CreativeTabs)FlansMod.tabFlanGuns);
    }
    
    public boolean func_149742_c(final World world, final int x, final int y, final int z) {
        return World.func_147466_a((IBlockAccess)world, x, y - 1, z);
    }
    
    public TileEntity func_149915_a(final World world, final int i) {
        return new TileEntityPaintjobTable();
    }
    
    public IIcon func_149691_a(final int i, final int j) {
        if (i == 1) {
            return this.top;
        }
        return this.side;
    }
    
    public boolean func_149727_a(final World world, final int x, final int y, final int z, final EntityPlayer player, final int facing, final float par7, final float par8, final float par9) {
        if (world.field_72995_K) {
            final PlayerHandler playerHandler = FlansMod.playerHandler;
            final PlayerData playerData = PlayerHandler.getPlayerData(player, Side.CLIENT);
            final PlayerHandler playerHandler2 = FlansMod.playerHandler;
            final PlayerData playerData2 = PlayerHandler.getPlayerData(player, Side.CLIENT);
            final float n = 10.0f;
            playerData2.shootTimeRight = n;
            playerData.shootTimeLeft = n;
            return true;
        }
        final TileEntityPaintjobTable table = (TileEntityPaintjobTable)world.func_147438_o(x, y, z);
        if (!world.field_72995_K) {
            player.openGui((Object)FlansMod.INSTANCE, 13, world, x, y, z);
        }
        return true;
    }
    
    public void func_149749_a(final World worldIn, final int x, final int y, final int z, final Block block, final int meta) {
        final TileEntity tileentity = worldIn.func_147438_o(x, y, z);
        if (tileentity instanceof IInventory) {
            InventoryHelper.dropInventoryItems(worldIn, x, y, z, (IInventory)tileentity);
        }
        super.func_149749_a(worldIn, x, y, z, block, meta);
    }
    
    @SideOnly(Side.CLIENT)
    public void func_149651_a(final IIconRegister register) {
        this.top = register.func_94245_a("FlansMod:paintjobTableTop");
        this.side = register.func_94245_a("FlansMod:planeCraftingTableSide");
    }
}
