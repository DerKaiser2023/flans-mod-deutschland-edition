// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import org.lwjgl.opengl.GL11;
import net.minecraft.inventory.Container;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiDriveableFuel extends GuiContainer
{
    private static final ResourceLocation texture;
    public World world;
    public InventoryPlayer inventory;
    public EntityDriveable plane;
    private int anim;
    private long lastTime;
    
    public GuiDriveableFuel(final InventoryPlayer inventoryplayer, final World world1, final EntityDriveable entPlane) {
        super((Container)new ContainerDriveableMenu(inventoryplayer, world1, true, entPlane));
        this.anim = 0;
        this.plane = entPlane;
        this.ySize = 161;
        this.world = world1;
        this.inventory = inventoryplayer;
    }
    
    protected void drawGuiContainerForegroundLayer(final int i, final int j) {
        this.fontRendererObj.drawString(this.plane.getDriveableType().name + " - Fuel", 6, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i1, final int j1) {
        final long newTime = this.mc.theWorld.getWorldInfo().getWorldTime();
        if (newTime > this.lastTime) {
            this.lastTime = newTime;
            if (newTime % 5L == 0L) {
                ++this.anim;
            }
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(GuiDriveableFuel.texture);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        final int fuelTankSize = this.plane.getDriveableType().fuelTankSize;
        final float fuelInTank = this.plane.driveableData.fuelInTank;
        if (this.plane.fuelling) {
            this.drawTexturedModalRect(k + 15, l + 44, 176 + 15 * (this.anim % 4), 0, 15, 16);
        }
        if (fuelInTank < fuelTankSize / 8 && this.anim % 4 > 1) {
            this.drawTexturedModalRect(k + 16, l + 25, 176, 16, 6, 6);
        }
        if (fuelInTank > 0.0f) {
            this.drawTexturedModalRect(k + 26, l + 21, 0, 161, (int)(129.0f * fuelInTank / fuelTankSize), 15);
        }
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        final int m = i - (this.width - this.xSize) / 2;
        final int n = j - (this.height - this.ySize) / 2;
        if (m > 161 && m < 171 && n > 5 && n < 15) {
            this.mc.displayGuiScreen((GuiScreen)new GuiDriveableMenu(this.inventory, this.world, this.plane));
        }
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/planeFuel.png");
    }
}
