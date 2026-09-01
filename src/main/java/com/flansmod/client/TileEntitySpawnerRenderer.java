// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import com.flansmod.common.FlansMod;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.Tessellator;
import com.flansmod.common.teams.BlockSpawner;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class TileEntitySpawnerRenderer extends TileEntitySpecialRenderer
{
    private RenderBlocks blockRenderer;
    
    public void renderTileEntityAt(final TileEntity te, final double x, final double y, final double z, final float f) {
        BlockSpawner.colouredPass = true;
        final Tessellator var10 = Tessellator.instance;
        this.bindTexture(TextureMap.locationBlocksTexture);
        RenderHelper.disableStandardItemLighting();
        GL11.glBlendFunc(770, 771);
        GL11.glEnable(3042);
        GL11.glDisable(2884);
        if (Minecraft.isAmbientOcclusionEnabled()) {
            GL11.glShadeModel(7425);
        }
        else {
            GL11.glShadeModel(7424);
        }
        var10.startDrawingQuads();
        var10.setTranslation((double)((float)x - te.xCoord), (double)((float)y - te.yCoord), (double)((float)z - te.zCoord));
        var10.setColorOpaque(1, 1, 1);
        GL11.glColor4f(1.0f, 1.0f, 0.0f, 0.5f);
        this.blockRenderer.renderBlockAllFaces((Block)FlansMod.spawner, te.xCoord, te.yCoord, te.zCoord);
        var10.setTranslation(0.0, 0.0, 0.0);
        var10.draw();
        RenderHelper.enableStandardItemLighting();
        BlockSpawner.colouredPass = false;
    }
    
    public void onWorldChange(final World par1World) {
        this.blockRenderer = new RenderBlocks((IBlockAccess)par1World);
    }
}
