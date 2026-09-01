// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.inventory.Container;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiDriveableMenu extends GuiContainer
{
    private static final ResourceLocation texture;
    public World world;
    public InventoryPlayer inventory;
    public EntityDriveable entity;
    
    public GuiDriveableMenu(final InventoryPlayer inventoryplayer, final World world1, final EntityDriveable entPlane) {
        super((Container)new ContainerDriveableMenu(inventoryplayer, world1));
        this.entity = entPlane;
        this.ySize = 180;
        this.world = world1;
        this.inventory = inventoryplayer;
    }
    
    public void initGui() {
        super.initGui();
        final DriveableType type = this.entity.getDriveableType();
        final GuiButton cargoButton = new GuiButton(0, this.width / 2 - 60, this.height / 2 - 71, 58, 20, "Cargo");
        cargoButton.enabled = (type.numCargoSlots > 0);
        this.buttonList.add(cargoButton);
        final GuiButton gunsButton = new GuiButton(1, this.width / 2 + 2, this.height / 2 - 71, 58, 20, "Guns");
        gunsButton.enabled = (type.ammoSlots() > 0);
        this.buttonList.add(gunsButton);
        final GuiButton fuelButton = new GuiButton(2, this.width / 2 - 60, this.height / 2 - 49, 58, 20, "Fuel");
        fuelButton.enabled = (type.fuelTankSize > 0);
        this.buttonList.add(fuelButton);
        final GuiButton missileButton = new GuiButton(3, this.width / 2 + 2, this.height / 2 - 49, 58, 20, this.entity.getMissileInventoryName());
        missileButton.enabled = (type.numMissileSlots > 0);
        this.buttonList.add(missileButton);
        final GuiButton bombButton = new GuiButton(5, this.width / 2 + 2, this.height / 2 - 27, 58, 20, this.entity.getBombInventoryName());
        bombButton.enabled = (type.numBombSlots > 0);
        this.buttonList.add(bombButton);
        this.buttonList.add(new GuiButton(4, this.width / 2 - 60, this.height / 2 - 27, 58, 20, "Repair"));
    }
    
    protected void actionPerformed(final GuiButton button) {
        if (button.id == 0) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(3));
        }
        if (button.id == 1) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(0));
        }
        if (button.id == 2) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(2));
        }
        if (button.id == 3) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(5));
        }
        if (button.id == 4) {
            this.inventory.player.openGui((Object)FlansMod.INSTANCE, 1, this.world, this.entity.chunkCoordX, this.entity.chunkCoordY, this.entity.chunkCoordZ);
        }
        if (button.id == 5) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(1));
        }
        if (button.id == 6) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(1));
        }
    }
    
    protected void drawGuiContainerForegroundLayer(final int i, final int j) {
        this.fontRendererObj.drawString(this.entity.getDriveableType().name, 6, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i1, final int j1) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(GuiDriveableMenu.texture);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/planeMenu.png");
    }
}
