// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.driveables.EnumDriveablePart;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.renderer.entity.RenderItem;
import com.flansmod.common.driveables.DriveablePart;
import java.util.ArrayList;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiDriveableRepair extends GuiScreen
{
    private static final ResourceLocation texture;
    private EntityPlayer driver;
    private EntityDriveable driving;
    private ArrayList<DriveablePart> partsToDraw;
    private static RenderItem itemRenderer;
    private int guiOriginX;
    private int guiOriginY;
    private int scroll;
    private boolean canScroll;
    
    public GuiDriveableRepair(final EntityPlayer player) {
        this.partsToDraw = new ArrayList<DriveablePart>();
        this.scroll = 0;
        this.canScroll = false;
        this.driver = player;
        this.driving = ((EntitySeat)player.ridingEntity).driveable;
        for (final DriveablePart part : this.driving.getDriveableData().parts.values()) {
            if (part.maxHealth > 0) {
                this.partsToDraw.add(part);
            }
        }
    }
    
    public void initGui() {
        super.initGui();
        for (int i = 0; i < this.partsToDraw.size(); ++i) {
            this.buttonList.add(new GuiButton(i, 0, 0, 45, 20, "Repair"));
        }
    }
    
    protected void actionPerformed(final GuiButton button) {
        FlansMod.proxy.repairDriveable(this.driver, this.driving, this.partsToDraw.get(button.id));
        if (this.scroll > 0) {
            --this.scroll;
        }
    }
    
    private void updateButtons(final int maxAllowableY) {
        int y = 43;
        for (int i = 0; i < this.partsToDraw.size(); ++i) {
            final DriveablePart part = this.partsToDraw.get(i);
            final GuiButton button = (GuiButton) this.buttonList.get(i);
            button.xPosition = this.guiOriginX + 9;
            button.yPosition = this.guiOriginY + y;
            if (i >= this.scroll) {
                y += ((part.health <= 0) ? 40 : 20);
            }
            button.visible = (part.health <= 0 && button.yPosition - this.guiOriginY + 8 < maxAllowableY && i >= this.scroll);
        }
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int w = scaledresolution.getScaledWidth();
        final int h = scaledresolution.getScaledHeight();
        final int guiWidth = 202;
        int guiAllowedHeight = 31;
        int guiNeededHeight = 31;
        for (final DriveablePart part : this.partsToDraw) {
            if (guiAllowedHeight + ((part.health <= 0) ? 40 : 20) < h) {
                guiAllowedHeight += ((part.health <= 0) ? 40 : 20);
            }
            guiNeededHeight += ((part.health <= 0) ? 40 : 20);
        }
        this.updateButtons(guiAllowedHeight);
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiDriveableRepair.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.guiOriginX = w / 2 - guiWidth / 2;
        this.guiOriginY = h / 2 - guiAllowedHeight / 2;
        this.drawTexturedModalRect(this.guiOriginX, this.guiOriginY, 0, 0, 202, 23);
        this.drawString(this.fontRendererObj, this.driving.getDriveableType().name + " - Repair", this.guiOriginX + 7, this.guiOriginY + 7, 16777215);
        final int buttonIndex = 0;
        int y = 23;
        int partIndex = 0;
        this.canScroll = false;
        for (final DriveablePart part2 : this.partsToDraw) {
            final boolean broken = part2.health <= 0;
            if (y + (broken ? 40 : 20) + 8 <= guiAllowedHeight && partIndex >= this.scroll) {
                this.mc.renderEngine.bindTexture(GuiDriveableRepair.texture);
                this.drawTexturedModalRect(this.guiOriginX, this.guiOriginY + y, 0, 24, 202, broken ? 40 : 20);
                final float percentHealth = part2.health / (float)part2.maxHealth;
                GL11.glColor3f(1.0f - percentHealth, percentHealth, 0.0f);
                this.drawTexturedModalRect(this.guiOriginX + 111, this.guiOriginY + y + 2, 0, 73, (int)(70.0f * percentHealth), 16);
                if (part2.armor > 1) {
                    this.drawString(this.fontRendererObj, part2.type.getName() + ": " + part2.armor + "mm", this.guiOriginX + 10, this.guiOriginY + y + 6, 16777215);
                }
                else if (part2.armor == 1) {
                    this.drawString(this.fontRendererObj, part2.type.getName(), this.guiOriginX + 10, this.guiOriginY + y + 6, 16777215);
                }
                this.drawCenteredString(this.fontRendererObj, (int)(percentHealth * 100.0f) + "%", this.guiOriginX + 158, this.guiOriginY + y + 6, 16777215);
                if (broken && part2.type != EnumDriveablePart.frontalArmor) {
                    final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
                    temporaryInventory.copyInventory(this.driver.inventory);
                    final ArrayList<ItemStack> stacksNeeded = this.driving.getDriveableType().getItemsRequired(part2, this.driving.getDriveableData().engine);
                    for (int n = 0; n < 7; ++n) {
                        final int stackNum = n + FlansMod.ticker / 60 % Math.max(1, stacksNeeded.size() - 6);
                        if (stackNum < stacksNeeded.size()) {
                            final ItemStack stackNeeded = stacksNeeded.get(stackNum);
                            int totalAmountFound = 0;
                            for (int m = 0; m < temporaryInventory.getSizeInventory(); ++m) {
                                ItemStack stackInSlot = temporaryInventory.getStackInSlot(m);
                                if (stackInSlot != null && stackInSlot.getItem() == stackNeeded.getItem() && stackInSlot.getMetadata() == stackNeeded.getMetadata()) {
                                    final int amountFound = Math.min(stackInSlot.stackSize, stackNeeded.stackSize - totalAmountFound);
                                    final ItemStack itemStack = stackInSlot;
                                    itemStack.stackSize -= amountFound;
                                    if (stackInSlot.stackSize <= 0) {
                                        stackInSlot = null;
                                    }
                                    temporaryInventory.setInventorySlotContents(m, stackInSlot);
                                    totalAmountFound += amountFound;
                                    if (totalAmountFound == stackNeeded.stackSize) {
                                        break;
                                    }
                                }
                            }
                            if (totalAmountFound < stackNeeded.stackSize) {
                                this.mc.renderEngine.bindTexture(GuiDriveableRepair.texture);
                                this.drawTexturedModalRect(this.guiOriginX + 57 + 18 * n, this.guiOriginY + y + 22, 202, 0, 16, 16);
                            }
                            this.drawSlotInventory(stacksNeeded.get(stackNum), this.guiOriginX + 57 + 18 * n, this.guiOriginY + y + 22);
                        }
                    }
                }
                y += (broken ? 40 : 20);
            }
            else if (partIndex >= this.scroll) {
                this.canScroll = true;
            }
            ++partIndex;
        }
        if (guiNeededHeight > guiAllowedHeight) {
            this.mc.renderEngine.bindTexture(GuiDriveableRepair.texture);
            this.drawTexturedModalRect(this.guiOriginX + 184, this.guiOriginY + 23, 206, 24, 18, 40);
            final int spacing = 12;
            this.drawCenteredString(this.fontRendererObj, Integer.toString(this.scroll + 1), this.guiOriginX + 192, this.guiOriginY + 73, 16777215);
            this.drawCenteredString(this.fontRendererObj, "/", this.guiOriginX + 192, this.guiOriginY + 73 + spacing, 16777215);
            this.drawCenteredString(this.fontRendererObj, Integer.toString(this.getMaxScroll((float)guiAllowedHeight)), this.guiOriginX + 192, this.guiOriginY + 73 + spacing * 2, 16777215);
        }
        this.mc.renderEngine.bindTexture(GuiDriveableRepair.texture);
        this.drawTexturedModalRect(this.guiOriginX, this.guiOriginY + y, 0, 65, 202, 8);
        super.drawScreen(i, j, f);
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        final int m = i - this.guiOriginX;
        final int n = j - this.guiOriginY;
        if (m > 185 && m < 195 && n > 5 && n < 15) {
            if (this.driving instanceof EntityMecha) {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                this.driver.openGui((Object)FlansMod.INSTANCE, 10, this.driver.worldObj, this.driving.chunkCoordX, this.driving.chunkCoordY, this.driving.chunkCoordZ);
            }
            else {
                this.mc.displayGuiScreen((GuiScreen)new GuiDriveableMenu(this.driver.inventory, this.driver.worldObj, this.driving));
            }
        }
        else if (m > 189 && m < 199 && n > 32 && n < 42 && this.scroll > 0) {
            --this.scroll;
        }
        else if (m > 189 && m < 199 && n > 44 && n < 54 && this.canScroll) {
            ++this.scroll;
        }
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.getItem() == null) {
            return;
        }
        GuiDriveableRepair.itemRenderer.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GuiDriveableRepair.itemRenderer.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    private int getMaxScroll(final float h) {
        int lScroll = 0;
        int counter = 0;
        while (counter < this.partsToDraw.size()) {
            int y = 0;
            counter = 0;
            for (final DriveablePart part : this.partsToDraw) {
                if (y + ((part.health <= 0) ? 40 : 20) <= h - 31.0f && counter >= lScroll) {
                    y += ((part.health <= 0) ? 40 : 20);
                    ++counter;
                }
                else {
                    if (counter >= lScroll) {
                        continue;
                    }
                    ++counter;
                }
            }
            ++lScroll;
        }
        return lScroll;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/repair.png");
        GuiDriveableRepair.itemRenderer = new RenderItem();
    }
}
