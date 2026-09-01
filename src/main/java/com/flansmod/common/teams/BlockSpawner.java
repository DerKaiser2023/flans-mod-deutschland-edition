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
        this.func_149647_a((CreativeTabs)FlansMod.tabFlanTeams);
    }
    
    public void func_149666_a(final Item item, final CreativeTabs tab, final List list) {
        if (tab == FlansMod.tabFlanTeams) {
            list.add(new ItemStack(item, 1, 0));
            list.add(new ItemStack(item, 1, 1));
            list.add(new ItemStack(item, 1, 2));
        }
    }
    
    public IIcon func_149691_a(final int i, int j) {
        if (j > 2) {
            j = 2;
        }
        return this.icons[BlockSpawner.colouredPass][j];
    }
    
    public AxisAlignedBB func_149668_a(final World par1World, final int par2, final int par3, final int par4) {
        return null;
    }
    
    public boolean func_149662_c() {
        return false;
    }
    
    public boolean func_149686_d() {
        return false;
    }
    
    public boolean func_149655_b(final IBlockAccess par1IBlockAccess, final int par2, final int par3, final int par4) {
        return true;
    }
    
    public boolean func_149742_c(final World par1World, final int par2, final int par3, final int par4) {
        return World.func_147466_a((IBlockAccess)par1World, par2, par3 - 1, par4) || BlockFence.func_149825_a(par1World.func_147439_a(par2, par3 - 1, par4));
    }
    
    public void func_149670_a(final World par1World, final int par2, final int par3, final int par4, final Entity par5Entity) {
        if (par1World.field_72995_K || par1World.func_72805_g(par2, par3, par4) != 1) {}
    }
    
    public void func_149719_a(final IBlockAccess access, final int i, final int j, final int k) {
        this.func_149676_a(0.0f, 0.0f, 0.0f, 1.0f, 0.03125f, 1.0f);
    }
    
    public void func_149683_g() {
        final float var1 = 0.5f;
        final float var2 = 0.015625f;
        final float var3 = 0.5f;
        this.func_149676_a(0.0f, 0.5f - var2, 0.0f, 1.0f, 0.5f + var2, 1.0f);
    }
    
    public int func_149656_h() {
        return 1;
    }
    
    public TileEntity func_149915_a(final World var1, final int i) {
        return new TileEntitySpawner();
    }
    
    public int func_149720_d(final IBlockAccess access, final int x, final int y, final int z) {
        if (!BlockSpawner.colouredPass) {
            return 16777215;
        }
        try {
            final TileEntitySpawner spawner = (TileEntitySpawner)access.func_147438_o(x, y, z);
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
    
    public boolean func_149727_a(final World world, final int x, final int y, final int z, final EntityPlayer player, final int side, final float par7, final float par8, final float par9) {
        if (world.field_72995_K) {
            return true;
        }
        if (MinecraftServer.func_71276_C().func_71203_ab().func_152596_g(player.func_146103_bH())) {
            final TileEntitySpawner spawner = (TileEntitySpawner)world.func_147438_o(x, y, z);
            final ItemStack item = player.func_71045_bC();
            if (item == null || item.func_77973_b() == null) {
                spawner.spawnDelay = (spawner.spawnDelay + 200) % 6000;
                player.func_145747_a((IChatComponent)new ChatComponentText("Set spawn delay to " + spawner.spawnDelay / 20));
            }
            else if (!(item.func_77973_b() instanceof ItemOpStick)) {
                spawner.stacksToSpawn.add(item.func_77946_l());
                for (final Entity entity : spawner.itemEntities) {
                    entity.func_70106_y();
                }
                spawner.currentDelay = 10;
            }
        }
        return true;
    }
    
    @SideOnly(Side.CLIENT)
    public void func_149651_a(final IIconRegister register) {
        this.icons = new IIcon[2][3];
        for (int i = 0; i < 2; ++i) {
            this.icons[i][0] = register.func_94245_a("FlansMod:spawner_item_" + (i + 1));
            this.icons[i][1] = register.func_94245_a("FlansMod:spawner_player_" + (i + 1));
            this.icons[i][2] = register.func_94245_a("FlansMod:spawner_vehicle_" + (i + 1));
        }
    }
    
    static {
        BlockSpawner.colouredPass = false;
    }
}
