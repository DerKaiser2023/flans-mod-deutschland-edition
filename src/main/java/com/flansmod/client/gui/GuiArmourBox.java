// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.item.ItemStack;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.common.teams.ArmourBoxType;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiArmourBox extends GuiScreen
{
    private static final ResourceLocation texture;
    private InventoryPlayer inventory;
    private static RenderItem itemRenderer;
    private ArmourBoxType type;
    private int page;
    private int guiOriginX;
    private int guiOriginY;
    private int scroll;
    
    public GuiArmourBox(final InventoryPlayer playerinventory, final ArmourBoxType type) {
        this.inventory = playerinventory;
        this.mc = FMLClientHandler.instance().getClient();
        this.type = type;
        this.page = 0;
    }
    
    public void updateScreen() {
        super.updateScreen();
        ++this.scroll;
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int k = scaledresolution.getScaledWidth();
        final int l = scaledresolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiArmourBox.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int guiOriginX = k / 2 - 88;
        this.guiOriginX = guiOriginX;
        final int m = guiOriginX;
        final int guiOriginY = l / 2 - 91;
        this.guiOriginY = guiOriginY;
        final int n = guiOriginY;
        this.drawTexturedModalRect(m, n, 0, 0, 176, 182);
        this.drawCenteredString(this.fontRendererObj, this.type.name, k / 2, n + 5, 16777215);
        this.mc.renderEngine.bindTexture(GuiArmourBox.texture);
        if (this.page == 0) {
            this.drawTexturedModalRect(m + 77, n + 87, 176, 0, 10, 10);
        }
        if (this.page >= this.type.pages.size() - 1) {
            this.drawTexturedModalRect(m + 89, n + 87, 186, 0, 10, 10);
        }
        RenderHelper.enableGUIStandardItemLighting();
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glEnable(32826);
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
        this.drawRecipe(fontrenderer, m, n, this.page);
        for (int row = 0; row < 3; ++row) {
            for (int col = 0; col < 9; ++col) {
                this.drawSlotInventory(this.inventory.getStackInSlot(col + (row + 1) * 9), m + 8 + col * 18, n + 100 + row * 18);
            }
        }
        for (int col2 = 0; col2 < 9; ++col2) {
            this.drawSlotInventory(this.inventory.getStackInSlot(col2), m + 8 + col2 * 18, n + 158);
        }
        GL11.glDisable(3042);
    }
    
    private void drawRecipe(final FontRenderer fontrenderer, final int m, final int n, final int q) {
        final ArmourBoxType.ArmourBoxEntry page = this.type.pages.get(q);
        if (page != null) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 2; ++j) {
                    this.drawSlotInventory(new ItemStack(page.armours[i * 2 + j].item), m + 9 + 83 * i, n + 44 + 22 * j);
                    final int numParts = page.requiredStacks[i * 2 + j].size();
                    int startPart = 0;
                    if (numParts >= 4) {
                        startPart = this.scroll / 40 % (numParts - 2);
                    }
                    for (int p = 0; p < ((numParts < 3) ? numParts : 3); ++p) {
                        this.drawSlotInventory(page.requiredStacks[i * 2 + j].get(startPart + p), m + 30 + p * 19 + 83 * i, n + 44 + 22 * j);
                    }
                }
            }
            RenderHelper.disableStandardItemLighting();
            this.drawCenteredString(fontrenderer, page.name, m + 87, n + 25, 16777215);
            RenderHelper.enableGUIStandardItemLighting();
        }
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.getItem() == null) {
            return;
        }
        RenderHelper.enableGUIStandardItemLighting();
        GuiArmourBox.itemRenderer.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GuiArmourBox.itemRenderer.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        final int m = i - this.guiOriginX;
        final int n = j - this.guiOriginY;
        if (k == 0 || k == 1) {
            if (m > 77 && m < 87 && n > 87 && n < 97 && this.page > 0) {
                --this.page;
            }
            if (m > 89 && m < 99 && n > 87 && n < 97 && this.page < this.type.pages.size() - 1) {
                ++this.page;
            }
            for (int x = 0; x < 2; ++x) {
                for (int y = 0; y < 2; ++y) {
                    if (this.type.pages.get(this.page).armours[x * 2 + y] != null && m > 7 + 83 * x && m < 27 + 83 * x && n > 42 + 22 * y && n < 62 + 22 * y) {
                        this.type.block.buyArmour(this.type.pages.get(this.page).shortName, x * 2 + y, this.inventory);
                    }
                }
            }
        }
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
        texture = new ResourceLocation("flansmod", "gui/armourBox.png");
        GuiArmourBox.itemRenderer = new RenderItem();
    }
}
