// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.teams;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import java.util.Iterator;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.client.FlansModClient;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockFence;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import com.flansmod.common.FlansMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;
import net.minecraft.block.BlockContainer;

public class BlockSpawner extends BlockContainer
{
    public static boolean colouredPass;
    public IIcon[][] icons;
    
    public BlockSpawner(final Material material) {
        super(material);
        this.setCreativeTab((CreativeTabs)FlansMod.tabFlanTeams);
    }
    
    public void getSubBlocks(final Item item, final CreativeTabs tab, final List list) {
        if (tab == FlansMod.tabFlanTeams) {
            list.add(new ItemStack(item, 1, 0));
            list.add(new ItemStack(item, 1, 1));
            list.add(new ItemStack(item, 1, 2));
        }
    }
    
    public IIcon getIcon(final int i, int j) {
        if (j > 2) {
            j = 2;
        }
        return this.icons[BlockSpawner.colouredPass ? 1 : 0][j];
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        return null;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public boolean isPassable(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4) {
        return true;
    }
    
    public boolean canPlaceBlockAt(final World par1World, final int par2, final int par3, final int par4) {
        return World.doesBlockHaveSolidTopSurface((IBlockAccess)par1World, par2, par3 - 1, par4) || BlockFence.isFence(par1World.getBlock(par2, par3 - 1, par4));
    }
    
    public void onEntityCollidedWithBlock(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par1World.isRemote || par1World.getBlockMetadata(par2, par3, par4) != 1) {}
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess access, final int i, final int j, final int k) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.03125f, 1.0f);
    }
    
    public void setBlockBoundsForItemRender() {
        final float var1 = 0.5f;
        final float var2 = 0.015625f;
        final float var3 = 0.5f;
        this.setBlockBounds(0.0f, 0.5f - var2, 0.0f, 1.0f, 0.5f + var2, 1.0f);
    }
    
    public int getMobilityFlag() {
        return 1;
    }
    
    public TileEntity createNewTileEntity(final World var1, final int i) {
        return new TileEntitySpawner();
    }
    
    public int colorMultiplier(final IBlockAccess access, final int x, final int y, final int z) {
        if (!BlockSpawner.colouredPass) {
            return 16777215;
        }
        try {
            final TileEntitySpawner spawner = (TileEntitySpawner)access.getTileEntity(x, y, z);
            final int spawnerTeamID = spawner.getTeamID();
            final Team spawnerTeam = FlansModClient.getTeam(spawnerTeamID);
            final boolean currentMap = FlansModClient.isCurrentMap(spawner.map);
            if (spawnerTeam == null || !currentMap) {
                switch (spawnerTeamID) {
                    case 0: {
                        return 8421504;
                    }
                    case 1: {
                        return 4210752;
                    }
                    case 2: {
                        return 10584063;
                    }
                    case 3: {
                        return 16744374;
                    }
                }
            }
            if (spawnerTeam == null) {
                return 16777215;
            }
            return spawnerTeam.teamColour;
        }
        catch (final Exception e) {
            return 16777215;
        }
    }
    
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int side, final float par7, final float par8, final float par9) {
        if (world.isRemote) {
            return true;
        }
        if (MinecraftServer.getServer().getConfigurationManager().canSendCommands(player.getGameProfile())) {
            final TileEntitySpawner spawner = (TileEntitySpawner)world.getTileEntity(x, y, z);
            final ItemStack item = player.getCurrentEquippedItem();
            if (item == null || item.getItem() == null) {
                spawner.spawnDelay = (spawner.spawnDelay + 200) % 6000;
                player.addChatMessage((IChatComponent)new ChatComponentText("Set spawn delay to " + spawner.spawnDelay / 20));
            }
            else if (!(item.getItem() instanceof ItemOpStick)) {
                spawner.stacksToSpawn.add(item.copy());
                for (final Entity entity : spawner.itemEntities) {
                    entity.setDead();
                }
                spawner.currentDelay = 10;
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerIcons(final IIconRegister register) {
        this.icons = new IIcon[2][3];
        for (int i = 0; i < 2; ++i) {
            this.icons[i][0] = register.registerIcon("FlansMod:spawner_item_" + (i + 1));
            this.icons[i][1] = register.registerIcon("FlansMod:spawner_player_" + (i + 1));
            this.icons[i][2] = register.registerIcon("FlansMod:spawner_vehicle_" + (i + 1));
        }
    }
    
    static {
        BlockSpawner.colouredPass = false;
    }
}
