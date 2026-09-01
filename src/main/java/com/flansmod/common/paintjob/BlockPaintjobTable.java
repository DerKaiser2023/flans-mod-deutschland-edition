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
        super(Material.rock);
        this.setHardness(2.0f);
        this.setResistance(4.0f);
        this.setUnlocalizedName("paintjobTable");
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanGuns);
    }
    
    public boolean canPlaceBlockAt(final World world, final int x, final int y, final int z) {
        return World.doesBlockHaveSolidTopSurface((IBlockAccess)world, x, y - 1, z);
    }
    
    public TileEntity createNewTileEntity(final World world, final int i) {
        return new TileEntityPaintjobTable();
    }
    
    public IIcon getIcon(final int i, final int j) {
        if (i == 1) {
            return this.top;
        }
        return this.side;
    }
    
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int facing, final float par7, final float par8, final float par9) {
        if (world.isRemote) {
            final PlayerHandler playerHandler = FlansMod.playerHandler;
            final PlayerData playerData = PlayerHandler.getPlayerData(player, Side.CLIENT);
            final PlayerHandler playerHandler2 = FlansMod.playerHandler;
            final PlayerData playerData2 = PlayerHandler.getPlayerData(player, Side.CLIENT);
            final float n = 10.0f;
            playerData2.shootTimeRight = n;
            playerData.shootTimeLeft = n;
            return true;
        }
        final TileEntityPaintjobTable table = (TileEntityPaintjobTable)world.getTileEntity(x, y, z);
        if (!world.isRemote) {
            player.openGui((Object)FlansMod.INSTANCE, 13, world, x, y, z);
        }
        return true;
    }
    
    public void breakBlock(final World worldIn, final int x, final int y, final int z, final Block block, final int meta) {
        final TileEntity tileentity = worldIn.getTileEntity(x, y, z);
        if (tileentity instanceof IInventory) {
            InventoryHelper.dropInventoryItems(worldIn, x, y, z, (IInventory)tileentity);
        }
        super.breakBlock(worldIn, x, y, z, block, meta);
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister register) {
        this.top = register.registerIcon("FlansMod:paintjobTableTop");
        this.side = register.registerIcon("FlansMod:planeCraftingTableSide");
    }
}
