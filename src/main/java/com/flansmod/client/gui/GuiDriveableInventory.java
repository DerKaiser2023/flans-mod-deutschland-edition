// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.client.gui.GuiScreen;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.GunType;
import java.util.Iterator;
import com.flansmod.common.driveables.Seat;
import java.util.List;
import net.minecraft.inventory.Slot;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.driveables.PilotGun;
import net.minecraft.item.ItemStack;
import com.flansmod.common.guns.ShootableType;
import java.util.ArrayList;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.inventory.Container;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.driveables.ContainerDriveableInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiDriveableInventory extends GuiContainer
{
    private static final ResourceLocation texture;
    public ContainerDriveableInventory container;
    public InventoryPlayer inventory;
    public World world;
    public int scroll;
    public int numItems;
    public int maxScroll;
    public EntityDriveable driveable;
    public int screen;
    
    public GuiDriveableInventory(final InventoryPlayer inventoryplayer, final World world1, final EntityDriveable entPlane, final int i) {
        super((Container)new ContainerDriveableInventory(inventoryplayer, world1, entPlane, i));
        this.driveable = entPlane;
        this.inventory = inventoryplayer;
        this.world = world1;
        this.container = (ContainerDriveableInventory)this.inventorySlots;
        this.ySize = 180;
        this.screen = i;
        this.maxScroll = this.container.maxScroll;
        this.numItems = this.container.numItems;
    }
    
    protected void drawGuiContainerForegroundLayer(final int x, final int y) {
        String title = " - Guns";
        if (this.screen == 1) {
            title = " - " + this.driveable.getBombInventoryName();
        }
        if (this.screen == 2) {
            title = " - Cargo";
        }
        if (this.screen == 3) {
            title = " - " + this.driveable.getMissileInventoryName();
        }
        this.fontRendererObj.drawString(this.driveable.getDriveableType().name + title, 6, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 8, this.ySize - 96 + 2, 4210752);
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final List<String> listHoveringText = new ArrayList<String>();
        if (this.screen == 0) {
            int slotsDone = 0;
            for (int i = 0; i < this.driveable.getDriveableType().seats.length; ++i) {
                if (slotsDone < 3 + this.scroll) {
                    if (this.driveable.getDriveableType().seats[i].gunType != null) {
                        if (slotsDone >= this.scroll) {
                            final Seat seat = this.driveable.getDriveableType().seats[i];
                            this.fontRendererObj.drawString(seat.gunName, 53, 29 + 19 * (slotsDone - this.scroll), 0);
                            final int itemY = 25 + 19 * (slotsDone - this.scroll);
                            if (y >= this.guiTop + itemY && y <= this.guiTop + itemY + 16) {
                                if (x >= this.guiLeft + 10 && x <= this.guiLeft + 10 + 17) {
                                    listHoveringText.add(seat.gunType.name);
                                }
                                else if (x >= this.guiLeft + 28 && x <= this.guiLeft + 28 + 17) {
                                    if (seat.gunType.ammo.size() > 0) {
                                        listHoveringText.add("[Ammo]");
                                    }
                                    for (final ShootableType ammo : seat.gunType.ammo) {
                                        listHoveringText.add("> " + ammo.name);
                                    }
                                }
                            }
                            for (int ai = 0; ai < seat.gunType.ammo.size(); ++ai) {
                                this.drawStack(new ItemStack(seat.gunType.ammo.get(ai).getItem()), 110 + ai * 16, itemY);
                            }
                            this.drawStack(new ItemStack(seat.gunType.getItem()), 10, 25 + 19 * (slotsDone - this.scroll));
                        }
                        ++slotsDone;
                    }
                }
            }
            for (int i = 0; i < this.driveable.getDriveableType().pilotGuns.size(); ++i) {
                if (slotsDone < 3 + this.scroll) {
                    if (this.driveable.getDriveableType().pilotGuns.get(i).type != null) {
                        if (slotsDone >= this.scroll) {
                            this.fontRendererObj.drawString("Driver's gun " + (i + 1), 53, 29 + 19 * (slotsDone - this.scroll), 0);
                            final int itemY2 = 25 + 19 * (slotsDone - this.scroll);
                            final GunType gunType = this.driveable.getDriveableType().pilotGuns.get(i).type;
                            if (y >= this.guiTop + itemY2 && y <= this.guiTop + itemY2 + 16) {
                                if (x >= this.guiLeft + 10 && x <= this.guiLeft + 10 + 17) {
                                    listHoveringText.add(gunType.name);
                                }
                                else if (x >= this.guiLeft + 28 && x <= this.guiLeft + 28 + 17) {
                                    if (gunType.ammo.size() > 0) {
                                        listHoveringText.add("[Ammo]");
                                    }
                                    for (final ShootableType ammo : gunType.ammo) {
                                        listHoveringText.add("> " + ammo.name);
                                    }
                                }
                            }
                            for (int ai = 0; ai < gunType.ammo.size(); ++ai) {
                                this.drawStack(new ItemStack(gunType.ammo.get(ai).getItem()), 110 + ai * 16, itemY2);
                            }
                            this.drawStack(new ItemStack(this.driveable.getDriveableType().pilotGuns.get(i).type.getItem()), 10, 25 + 19 * (slotsDone - this.scroll));
                        }
                        ++slotsDone;
                    }
                }
            }
        }
        else if (this.screen == 1) {
            if (x >= this.guiLeft + 10 && x < this.guiLeft + 180 - 10 && y >= this.guiTop + 20 && y < this.guiTop + 90 && this.driveable.getDriveableType().ammo.size() > 0) {
                listHoveringText.add("[Bombs]");
                for (final BulletType ammo2 : this.driveable.getDriveableType().ammo) {
                    if (ammo2 != null && ammo2.weaponType == EnumWeaponType.BOMB) {
                        listHoveringText.add("> " + ammo2.name);
                    }
                }
            }
        }
        else if (this.screen == 3 && x >= this.guiLeft + 10 && x < this.guiLeft + 180 - 10 && y >= this.guiTop + 20 && y < this.guiTop + 90 && this.driveable.getDriveableType().ammo.size() > 0) {
            listHoveringText.add("[Missiles]");
            for (final BulletType ammo2 : this.driveable.getDriveableType().ammo) {
                if (ammo2 != null && ammo2.weaponType != EnumWeaponType.BOMB) {
                    listHoveringText.add("> " + ammo2.name);
                }
            }
        }
        Slot mouseOverSlot = null;
        for (int i2 = 0; i2 < this.inventorySlots.inventorySlots.size(); ++i2) {
            final Slot slot = (Slot) this.inventorySlots.inventorySlots.get(i2);
            if (this.isPointInRegion(slot.xDisplayPosition, slot.yDisplayPosition, 16, 16, x, y) && slot.canBeHovered()) {
                mouseOverSlot = slot;
            }
        }
        if (mouseOverSlot == null || !mouseOverSlot.getHasStack()) {
            this.drawHoveringText((List)listHoveringText, x - this.guiLeft, y - this.guiTop, this.fontRendererObj);
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(32826);
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    private void drawStack(final ItemStack itemstack, final int i, final int j) {
        if (itemstack != null && itemstack.getItem() != null) {
            GuiDriveableInventory.itemRender.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
            GuiDriveableInventory.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        }
    }
    
    private static String getGunSlotName(final int i) {
        switch (i) {
            case 0: {
                return "Left Nose Gun";
            }
            case 1: {
                return "Right Nose Gun";
            }
            case 2: {
                return "Left Wing Gun";
            }
            case 3: {
                return "Right Wing Gun";
            }
            case 4: {
                return "Tail Gun";
            }
            case 5: {
                return "Left Bay Gun";
            }
            case 6: {
                return "Right Bay Gun";
            }
            case 7: {
                return "Dorsal Gun";
            }
            default: {
                return "Not a Gun";
            }
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i1, final int j1) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(GuiDriveableInventory.texture);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        switch (this.screen) {
            case 0: {
                for (int n = 0; n < ((this.numItems > 3) ? 3 : this.numItems); ++n) {
                    this.drawTexturedModalRect(k + 9, l + 24 + 19 * n, 176, 0, 37, 18);
                }
                break;
            }
            case 1:
            case 2:
            case 3: {
                for (int m = (this.numItems + 7) / 8, row = 0; row < ((m > 3) ? 3 : m); ++row) {
                    this.drawTexturedModalRect(k + 9, l + 24 + 19 * row, 7, 97, 18 * (((row + this.scroll + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)), 18);
                }
                break;
            }
        }
        if (this.scroll == 0) {
            this.drawTexturedModalRect(k + 161, l + 41, 176, 18, 10, 10);
        }
        if (this.scroll == this.maxScroll) {
            this.drawTexturedModalRect(k + 161, l + 53, 176, 28, 10, 10);
        }
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        final int m = i - (this.width - this.xSize) / 2;
        final int n = j - (this.height - this.ySize) / 2;
        if (this.scroll > 0 && m > 161 && m < 171 && n > 41 && n < 51) {
            --this.scroll;
            this.container.updateScroll(this.scroll);
        }
        if (this.scroll < this.maxScroll && m > 161 && m < 171 && n > 53 && n < 63) {
            ++this.scroll;
            this.container.updateScroll(this.scroll);
        }
        if (m > 161 && m < 171 && n > 5 && n < 15) {
            if (this.driveable instanceof EntityMecha) {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                this.inventory.player.openGui((Object)FlansMod.INSTANCE, 10, this.world, this.driveable.chunkCoordX, this.driveable.chunkCoordY, this.driveable.chunkCoordZ);
            }
            else {
                this.mc.displayGuiScreen((GuiScreen)new GuiDriveableMenu(this.inventory, this.world, this.driveable));
            }
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/planeInventory.png");
    }
}
