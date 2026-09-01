// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import java.util.Iterator;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.input.Mouse;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import java.util.List;
import java.util.Collections;
import com.flansmod.common.guns.boxes.GunBoxEntry;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.inventory.Container;
import com.flansmod.common.guns.boxes.ContainerGunBox;
import net.minecraft.world.World;
import com.flansmod.common.guns.boxes.GunBoxType;
import com.flansmod.common.guns.boxes.GunPage;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiGunBox extends GuiContainer
{
    private ResourceLocation texture;
    private static RenderItem itemRenderer;
    private InventoryPlayer inventory;
    private GunPage currentPage;
    private GunBoxType type;
    private String recipeTooltip;
    private int mouseX;
    private int mouseY;
    private boolean tabToAmmo;
    private int hoverOver;
    private int selectedItem;
    private int selectedAmmoitem;
    private int pageIndex;
    private boolean craftHighlight;
    private boolean nextHighlight;
    private boolean backHighlight;
    
    public GuiGunBox(final InventoryPlayer playerinventory, final GunBoxType type, final World w) {
        super((Container)new ContainerGunBox(playerinventory, w));
        this.texture = new ResourceLocation("flansmod", "gui/weaponBoxDefault.png");
        this.recipeTooltip = null;
        this.tabToAmmo = false;
        this.hoverOver = -1;
        this.selectedItem = -1;
        this.selectedAmmoitem = -1;
        this.pageIndex = 0;
        this.craftHighlight = false;
        this.nextHighlight = false;
        this.backHighlight = false;
        this.mc = FMLClientHandler.instance().getClient();
        this.type = type;
        this.inventory = playerinventory;
        this.xSize = 273;
        this.ySize = 233;
        this.currentPage = type.gunPages.get(this.pageIndex);
    }
    
    protected void drawGuiContainerForegroundLayer(final int x, final int y) {
        final GunBoxEntry[] entries = this.currentPage.gunList;
        this.fontRendererObj.drawString(this.type.name, 7, 6, hexColor(this.type.gunBoxTextColor));
        this.fontRendererObj.drawStringWithShadow(this.currentPage.pageName, 62 - this.fontRendererObj.getStringWidth(this.currentPage.pageName) / 2, 26, hexColor(this.type.pageTextColor));
        for (int i = 0; i < entries.length && i < 8; ++i) {
            if (entries[i] != null) {
                String label = entries[i].type.name;
                if (this.fontRendererObj.getStringWidth(label) > 97) {
                    label = label.substring(0, Math.min(label.length(), 15)) + "...";
                }
                this.fontRendererObj.drawString(label, 19, 46 + i * 12, hexColor(this.type.itemListTextColor));
            }
        }
        if (this.selectedItem != -1) {
            final GunBoxEntry entry = entries[this.selectedItem];
            this.drawSlotInventory(new ItemStack(entry.type.getItem()), 127, 26);
            if (!entry.isAmmoNullOrEmpty()) {
                for (int j = 0; j < entry.ammoEntryList.size(); ++j) {
                    this.drawSlotInventory(new ItemStack(entry.ammoEntryList.get(j).type.getItem()), 155 + j * 22, 26);
                }
            }
            if (!this.tabToAmmo) {
                this.fontRendererObj.drawString(entry.type.name, 127, 52, hexColor(this.type.itemTextColor));
                this.drawRecipe(entry.requiredParts);
            }
            else if (!entry.isAmmoNullOrEmpty()) {
                this.fontRendererObj.drawString(entry.ammoEntryList.get(this.selectedAmmoitem).type.name, 127, 52, hexColor(this.type.itemTextColor));
                this.drawRecipe(entry.ammoEntryList.get(this.selectedAmmoitem).requiredParts);
            }
            if (this.craftHighlight) {
                this.fontRendererObj.drawStringWithShadow("Craft", 158 - this.fontRendererObj.getStringWidth("Craft") / 2, 117, hexColor(this.type.buttonTextHoverColor));
            }
            else {
                this.fontRendererObj.drawStringWithShadow("Craft", 158 - this.fontRendererObj.getStringWidth("Craft") / 2, 117, hexColor(this.type.buttonTextColor));
            }
        }
        if (this.nextHighlight) {
            this.fontRendererObj.drawStringWithShadow(">", 107 - this.fontRendererObj.getStringWidth(">") / 2, 26, hexColor(this.type.buttonTextHoverColor));
        }
        else {
            this.fontRendererObj.drawStringWithShadow(">", 107 - this.fontRendererObj.getStringWidth(">") / 2, 26, hexColor(this.type.buttonTextColor));
        }
        if (this.backHighlight) {
            this.fontRendererObj.drawStringWithShadow("<", 17 - this.fontRendererObj.getStringWidth("<") / 2, 26, hexColor(this.type.buttonTextHoverColor));
        }
        else {
            this.fontRendererObj.drawStringWithShadow("<", 17 - this.fontRendererObj.getStringWidth("<") / 2, 26, hexColor(this.type.buttonTextColor));
        }
        if (this.recipeTooltip != null) {
            this.drawHoveringText((List)Collections.singletonList(this.recipeTooltip), this.mouseX - this.guiLeft, this.mouseY - this.guiTop, this.fontRendererObj);
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int xOrigin = (this.width - this.xSize) / 2;
        final int yOrigin = (this.height - this.ySize) / 2;
        if (this.type.guiTexturePath != null) {
            this.texture = new ResourceLocation("flansmod", this.type.guiTexturePath + ".png");
        }
        this.mc.renderEngine.bindTexture(this.texture);
        this.drawTexturedModalRect(xOrigin, yOrigin, 0, 0, this.xSize, this.ySize);
        if (this.hoverOver != -1) {
            this.drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + this.hoverOver * 12, 383, 5, 108, 12);
        }
        if (this.selectedItem != -1) {
            final GunBoxEntry entry = this.currentPage.gunList[this.selectedItem];
            this.drawTexturedModalRect(xOrigin + 8, yOrigin + 43 + this.selectedItem * 12, 275, 5, 108, 12);
            this.drawTexturedModalRect(xOrigin + 121, yOrigin + 20, 275, 207, 144, 25);
            if (!this.tabToAmmo) {
                this.drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 17, 144, 95);
                this.drawTexturedModalRect(xOrigin + 127, yOrigin + 26, 419, 33, 16, 16);
            }
            else {
                this.drawTexturedModalRect(xOrigin + 121, yOrigin + 45, 275, 112, 144, 95);
            }
            if (!entry.isAmmoNullOrEmpty()) {
                for (int k = 0; k < entry.ammoEntryList.size(); ++k) {
                    this.drawTexturedModalRect(xOrigin + 154 + k * 22, yOrigin + 25, 435, 17, 18, 18);
                }
            }
            if (this.craftHighlight) {
                this.drawTexturedModalRect(xOrigin + 126, yOrigin + 111, 419, 85, 64, 20);
            }
            else {
                this.drawTexturedModalRect(xOrigin + 126, yOrigin + 111, 419, 65, 64, 20);
            }
        }
        if (this.tabToAmmo && this.selectedAmmoitem != -1) {
            this.drawTexturedModalRect(xOrigin + 155 + this.selectedAmmoitem * 22, yOrigin + 26, 419, 17, 16, 16);
        }
        if (this.nextHighlight) {
            this.drawTexturedModalRect(xOrigin + 97, yOrigin + 20, 439, 105, 20, 20);
        }
        else {
            this.drawTexturedModalRect(xOrigin + 97, yOrigin + 20, 419, 105, 20, 20);
        }
        if (this.backHighlight) {
            this.drawTexturedModalRect(xOrigin + 7, yOrigin + 20, 439, 105, 20, 20);
        }
        else {
            this.drawTexturedModalRect(xOrigin + 7, yOrigin + 20, 419, 105, 20, 20);
        }
    }
    
    public void drawTexturedModalRect(final int par1, final int par2, final int par3, final int par4, final int par5, final int par6) {
        final float f = 0.001953125f;
        final float f2 = 0.00390625f;
        final Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        tessellator.addVertexWithUV((double)par1, (double)(par2 + par6), (double)this.zLevel, (double)(par3 * f), (double)((par4 + par6) * f2));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)(par2 + par6), (double)this.zLevel, (double)((par3 + par5) * f), (double)((par4 + par6) * f2));
        tessellator.addVertexWithUV((double)(par1 + par5), (double)par2, (double)this.zLevel, (double)((par3 + par5) * f), (double)(par4 * f2));
        tessellator.addVertexWithUV((double)par1, (double)par2, (double)this.zLevel, (double)(par3 * f), (double)(par4 * f2));
        tessellator.draw();
    }
    
    public void handleMouseInput() {
        super.handleMouseInput();
        this.mouseX = Mouse.getEventX() * this.width / this.mc.displayWidth;
        this.mouseY = this.height - Mouse.getEventY() * this.height / this.mc.displayHeight - 1;
        final int mouseXInGUI = this.mouseX - this.guiLeft;
        final int mouseYInGUI = this.mouseY - this.guiTop;
        this.hoverOver = -1;
        final int sectionX = 8;
        for (int i = 0; i < this.currentPage.gunList.length && i < 8; ++i) {
            final int sectionY = 43 + i * 12;
            if (mouseXInGUI >= sectionX && mouseXInGUI < sectionX + 108 && mouseYInGUI >= sectionY && mouseYInGUI < sectionY + 12) {
                this.hoverOver = i;
            }
        }
        this.craftHighlight = (mouseXInGUI >= 126 && mouseXInGUI < 189 && mouseYInGUI >= 111 && mouseYInGUI < 130);
        this.nextHighlight = (mouseXInGUI >= 97 && mouseXInGUI < 116 && mouseYInGUI >= 20 && mouseYInGUI < 39);
        this.backHighlight = (mouseXInGUI >= 7 && mouseXInGUI < 26 && mouseYInGUI >= 20 && mouseYInGUI < 39);
        this.recipeTooltip = null;
        if (this.selectedItem != -1) {
            final GunBoxEntry entry = this.currentPage.gunList[this.selectedItem];
            for (int count = this.tabToAmmo ? entry.ammoEntryList.get(this.selectedAmmoitem).requiredParts.size() : entry.requiredParts.size(), j = 0; j < count; ++j) {
                int itemX = 127 + j * 19;
                int itemY = 68;
                if (j >= 4) {
                    itemX = 127;
                    itemY = 87;
                }
                if (mouseXInGUI >= itemX && mouseXInGUI < itemX + 16 && mouseYInGUI >= itemY && mouseYInGUI < itemY + 16) {
                    this.recipeTooltip = (this.tabToAmmo ? entry.ammoEntryList.get(this.selectedAmmoitem).requiredParts.get(j).getDisplayName() : entry.requiredParts.get(j).getDisplayName());
                }
            }
        }
    }
    
    protected void mouseClicked(final int x, final int y, final int button) {
        final int xOrigin = (this.width - this.xSize) / 2;
        final int yOrigin = (this.height - this.ySize) / 2;
        super.mouseClicked(x, y, button);
        final int m = x - xOrigin;
        final int n = y - yOrigin;
        if (button == 0 || button == 1) {
            if (this.hoverOver != -1 && this.hoverOver < this.currentPage.gunList.length) {
                this.selectedItem = this.hoverOver;
                this.selectedAmmoitem = -1;
                this.tabToAmmo = false;
            }
            if (m >= 121 && m <= 148 && n >= 20 && n <= 44) {
                this.tabToAmmo = false;
            }
            if (this.backHighlight && this.type.gunPages.size() > 1) {
                if (this.pageIndex == 0) {
                    this.pageIndex = this.type.gunPages.size() - 1;
                }
                else {
                    --this.pageIndex;
                }
                this.resetAndSwapPages();
            }
            if (this.nextHighlight && this.type.gunPages.size() > 1) {
                if (this.pageIndex == this.type.gunPages.size() - 1) {
                    this.pageIndex = 0;
                }
                else {
                    ++this.pageIndex;
                }
                this.resetAndSwapPages();
            }
            if (this.selectedItem != -1 && !this.currentPage.gunList[this.selectedItem].isAmmoNullOrEmpty()) {
                for (int i = 0; i < this.currentPage.gunList[this.selectedItem].ammoEntryList.size(); ++i) {
                    if (m >= 152 + i * 22 && m <= 173 + i * 22 && n >= 23 && n <= 44) {
                        this.tabToAmmo = true;
                        this.selectedAmmoitem = i;
                    }
                }
            }
            if (this.craftHighlight) {
                if (this.selectedItem != -1 && !this.tabToAmmo) {
                    this.type.block.buyGun(this.currentPage.gunList[this.selectedItem].type, this.inventory, this.type);
                }
                if (this.tabToAmmo && this.selectedAmmoitem != -1) {
                    this.type.block.buyGun(this.currentPage.gunList[this.selectedItem].ammoEntryList.get(this.selectedAmmoitem).type, this.inventory, this.type);
                }
            }
        }
        if (button != 0) {
            return;
        }
    }
    
    private void resetAndSwapPages() {
        this.selectedItem = -1;
        this.selectedAmmoitem = -1;
        this.tabToAmmo = false;
        this.currentPage = this.type.gunPages.get(this.pageIndex);
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.getItem() == null) {
            return;
        }
        RenderHelper.enableGUIStandardItemLighting();
        GuiGunBox.itemRenderer.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GuiGunBox.itemRenderer.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    private void drawRecipe(final List<ItemStack> parts) {
        int i = 0;
        for (final ItemStack stack : parts) {
            if (i < 4) {
                this.drawSlotInventory(stack, 127 + i * 19, 68);
            }
            else {
                this.drawSlotInventory(stack, 127 + (i - 4) * 19, 87);
            }
            ++i;
        }
    }
    
    private static int hexColor(final String color) {
        return Integer.parseInt(color, 16);
    }
    
    protected void keyTyped(final char c, final int i) {
        if (i == 1 || i == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        GuiGunBox.itemRenderer = new RenderItem();
    }
}
