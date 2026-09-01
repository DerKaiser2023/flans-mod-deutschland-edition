// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.network.PacketBase;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import java.util.Collection;
import java.util.Arrays;
import org.lwjgl.input.Keyboard;
import com.flansmod.common.network.PacketBaseEdit;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiBaseEditor extends GuiScreen
{
    private static final ResourceLocation texture;
    private int guiOriginX;
    private int guiOriginY;
    private GuiTextField nameEntryField;
    private GuiButton[] teamButtons;
    private GuiButton[] mapButtons;
    private GuiButton leftButton;
    private GuiButton rightButton;
    private int mapsPage;
    public PacketBaseEdit packet;
    
    public GuiBaseEditor(final PacketBaseEdit packet) {
        this.packet = packet;
    }
    
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        Keyboard.enableRepeatEvents(true);
        (this.nameEntryField = new GuiTextField(this.fontRendererObj, this.width / 2 - 128 + 70, this.height / 2 - 94 + 24, 179, this.fontRendererObj.FONT_HEIGHT)).setMaxStringLength(60);
        this.nameEntryField.setEnableBackgroundDrawing(true);
        this.nameEntryField.setVisible(true);
        this.nameEntryField.setFocused(true);
        this.nameEntryField.setTextColor(16777215);
        this.nameEntryField.setText(this.packet.baseName);
        (this.teamButtons = new GuiButton[4])[0] = new GuiButton(0, this.width / 2 - 128 + 6, this.height / 2 - 94 + 38, 58, 20, "No Team");
        this.teamButtons[1] = new GuiButton(1, this.width / 2 - 128 + 68, this.height / 2 - 94 + 38, 58, 20, "Spectator");
        this.teamButtons[2] = new GuiButton(2, this.width / 2 - 128 + 130, this.height / 2 - 94 + 38, 58, 20, "Team 1");
        this.teamButtons[3] = new GuiButton(3, this.width / 2 - 128 + 192, this.height / 2 - 94 + 38, 58, 20, "Team 2");
        this.buttonList.addAll(Arrays.asList(this.teamButtons).subList(0, 4));
        this.mapButtons = new GuiButton[5];
        for (int i = 0; i < 5; ++i) {
            this.mapButtons[i] = new GuiButton(4 + i, this.width / 2 - 128 + 28, this.height / 2 - 94 + 75 + 22 * i, 200, 20, "Map " + (i + 1));
            this.buttonList.add(this.mapButtons[i]);
        }
        this.leftButton = new GuiButton(9, this.width / 2 - 128 + 6, this.height / 2 - 94 + 119, 20, 20, "<");
        this.rightButton = new GuiButton(10, this.width / 2 + 128 - 26, this.height / 2 - 94 + 119, 20, 20, ">");
        this.buttonList.add(this.leftButton);
        this.buttonList.add(this.rightButton);
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int k = scaledresolution.getScaledWidth();
        final int l = scaledresolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiBaseEditor.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int guiOriginX = k / 2 - 128;
        this.guiOriginX = guiOriginX;
        final int m = guiOriginX;
        final int guiOriginY = l / 2 - 94;
        this.guiOriginY = guiOriginY;
        final int n = guiOriginY;
        this.drawTexturedModalRect(m, n, 0, 0, 256, 189);
        this.drawString(this.fontRendererObj, "Base Settings", this.guiOriginX + 6, this.guiOriginY + 6, 16777215);
        this.drawString(this.fontRendererObj, "Base Name : ", this.guiOriginX + 6, this.guiOriginY + 24, 16777215);
        this.drawString(this.fontRendererObj, "Map", this.guiOriginX + 6, this.guiOriginY + 64, 16777215);
        this.nameEntryField.drawTextBox();
        super.drawScreen(i, j, f);
    }
    
    protected void actionPerformed(final GuiButton button) {
        switch (button.id) {
            case 0:
            case 1:
            case 2:
            case 3: {
                this.packet.teamID = button.id;
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                this.packet.mapID = this.mapsPage * 5 + button.id - 4;
                break;
            }
            case 9: {
                --this.mapsPage;
                break;
            }
            case 10: {
                ++this.mapsPage;
                break;
            }
        }
    }
    
    public void updateScreen() {
        for (int i = 0; i < 4; ++i) {
            this.teamButtons[i].enabled = (this.packet.teamID != i);
        }
        for (int i = 0; i < 5; ++i) {
            this.mapButtons[i].visible = (this.packet.maps.length > i + this.mapsPage * 5);
            if (this.mapButtons[i].visible) {
                this.mapButtons[i].displayString = this.packet.maps[i + this.mapsPage * 5];
                this.mapButtons[i].enabled = (i + this.mapsPage * 5 != this.packet.mapID);
            }
        }
        this.rightButton.visible = (this.packet.maps.length > (this.mapsPage + 1) * 5);
        this.leftButton.visible = (this.mapsPage > 0);
        this.nameEntryField.updateCursorCounter();
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
        this.nameEntryField.mouseClicked(i, j, k);
    }
    
    protected void keyTyped(final char c, final int i) {
        super.keyTyped(c, i);
        this.nameEntryField.textboxKeyTyped(c, i);
    }
    
    public void onGuiClosed() {
        super.onGuiClosed();
        this.packet.baseName = this.nameEntryField.getText();
        Keyboard.enableRepeatEvents(false);
        FlansMod.getPacketHandler().sendToServer(this.packet);
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/baseEdit.png");
    }
}
