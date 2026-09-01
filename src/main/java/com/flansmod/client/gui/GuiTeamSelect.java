// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.client.Minecraft;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketTeamSelect;
import com.flansmod.common.FlansMod;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.GuiButton;
import cpw.mods.fml.client.FMLClientHandler;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiTeamSelect extends GuiScreen
{
    private static final ResourceLocation texture;
    private static RenderItem itemRenderer;
    private boolean classMenu;
    public static Team[] teamChoices;
    private PlayerClass[] classChoices;
    private int guiHeight;
    
    public GuiTeamSelect() {
        if (GuiTeamSelect.teamChoices == null) {
            FMLClientHandler.instance().getClient().displayGuiScreen((GuiScreen)null);
            return;
        }
        this.classMenu = false;
        this.guiHeight = 29 + 24 * GuiTeamSelect.teamChoices.length;
    }
    
    public GuiTeamSelect(final Team[] teams) {
        this.classMenu = false;
        GuiTeamSelect.teamChoices = teams;
        this.guiHeight = 29 + 24 * teams.length;
    }
    
    public GuiTeamSelect(final PlayerClass[] classes) {
        this.classMenu = true;
        this.classChoices = classes;
        this.guiHeight = 29 + 24 * classes.length;
    }
    
    public void initGui() {
        super.initGui();
        if (this.classMenu) {
            for (int i = 0; i < this.classChoices.length; ++i) {
                if (this.classChoices[i] != null) {
                    this.buttonList.add(new GuiButton(i, this.width / 2 - 128 + 9, this.height / 2 - this.guiHeight / 2 + 24 + 24 * i, 73, 20, this.classChoices[i].name));
                }
            }
        }
        else {
            if (GuiTeamSelect.teamChoices == null) {
                FMLClientHandler.instance().getClient().displayGuiScreen((GuiScreen)null);
                return;
            }
            for (int i = 0; i < GuiTeamSelect.teamChoices.length; ++i) {
                if (GuiTeamSelect.teamChoices[i] != null) {
                    this.buttonList.add(new GuiButton(i, this.width / 2 - 128 + 10, this.height / 2 - this.guiHeight / 2 + 24 + 24 * i, 236, 20, "§" + GuiTeamSelect.teamChoices[i].textColour + GuiTeamSelect.teamChoices[i].name));
                }
                else {
                    this.buttonList.add(new GuiButton(i, this.width / 2 - 128 + 10, this.height / 2 - this.guiHeight / 2 + 24 + 24 * i, 236, 20, "No Team / Builder"));
                }
            }
        }
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.renderEngine.bindTexture(GuiTeamSelect.texture);
        this.drawTexturedModalRect(this.width / 2 - 128, this.height / 2 - this.guiHeight / 2, 0, 0, 256, 22);
        this.drawTexturedModalRect(this.width / 2 - 128, this.height / 2 + this.guiHeight / 2 - 6, 0, 73, 256, 7);
        if (this.classMenu) {
            for (int n = 0; n < this.classChoices.length; ++n) {
                this.drawTexturedModalRect(this.width / 2 - 128, this.height / 2 - this.guiHeight / 2 + 22 + 24 * n, 0, 23, 256, 24);
            }
        }
        else {
            for (int n = 0; n < GuiTeamSelect.teamChoices.length; ++n) {
                this.drawTexturedModalRect(this.width / 2 - 128, this.height / 2 - this.guiHeight / 2 + 22 + 24 * n, 0, 48, 256, 24);
            }
        }
        this.fontRendererObj.drawStringWithShadow(this.classMenu ? "Choose a Class" : "Choose a Team", this.width / 2 - 120, this.height / 2 - this.guiHeight / 2 + 8, 16777215);
        super.drawScreen(i, j, f);
        if (this.classMenu) {
            for (int n = 0; n < this.classChoices.length; ++n) {
                for (int m = 0; m < this.classChoices[n].startingItems.size(); ++m) {
                    this.drawSlotInventory(this.classChoices[n].startingItems.get(m), this.width / 2 - 128 + 85 + 18 * m, this.height / 2 - this.guiHeight / 2 + 26 + 24 * n);
                }
            }
        }
    }
    
    protected void actionPerformed(final GuiButton button) {
        if (this.classMenu) {
            FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(this.classChoices[button.id].shortName, true));
        }
        else {
            FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect((GuiTeamSelect.teamChoices[button.id] == null) ? "null" : GuiTeamSelect.teamChoices[button.id].shortName, false));
        }
        Minecraft.getMinecraft().displayGuiScreen((GuiScreen)null);
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        GuiTeamSelect.itemRenderer.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GuiTeamSelect.itemRenderer.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    protected void keyTyped(final char c, final int i) {
        if (i == 1 || i == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
            if (this.classMenu) {
                if (this.classChoices != null && this.classChoices.length > 0) {
                    FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(this.classChoices[0].shortName, true));
                }
            }
            else {
                FlansMod.getPacketHandler().sendToServer(new PacketTeamSelect(Team.spectators.shortName, false));
            }
        }
    }
    
    public void onGuiClosed() {
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/teams.png");
        GuiTeamSelect.itemRenderer = new RenderItem();
    }
}
