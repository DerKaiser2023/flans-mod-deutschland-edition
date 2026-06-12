// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;

public class RenderSpawnerBlock implements ISimpleBlockRenderingHandler
{
    public void renderInventoryBlock(final Block block, final int metadata, final int modelID, final RenderBlocks renderer) {
    }
    
    public boolean renderWorldBlock(final IBlockAccess world, final int x, final int y, final int z, final Block block, final int modelId, final RenderBlocks renderer) {
        renderer.func_147769_a(block, x, y, z);
        return false;
    }
    
    public boolean shouldRender3DInInventory(final int i) {
        return false;
    }
    
    public int getRenderId() {
        return 0;
    }
}
