// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketVoteCast;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.GuiButton;
import com.flansmod.common.network.PacketVoting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiVoting extends GuiScreen
{
    public static final ResourceLocation texture;
    public static PacketVoting packet;
    public static int myVote;
    private int guiHeight;
    
    public GuiVoting(final PacketVoting packet) {
        GuiVoting.myVote = 0;
        GuiVoting.packet = packet;
    }
    
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        this.guiHeight = 29 + GuiVoting.packet.clientOptions.length * 24;
        for (int i = 0; i < GuiVoting.packet.clientOptions.length; ++i) {
            this.buttonList.add(new GuiButton(i, this.width / 2 + 128 - 50, this.height / 2 - this.guiHeight / 2 + 24 + 24 * i, 40, 20, "Vote"));
        }
    }
    
    protected void actionPerformed(final GuiButton button) {
        GuiVoting.myVote = button.id + 1;
        FlansMod.getPacketHandler().sendToServer(new PacketVoteCast(GuiVoting.myVote));
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int k = scaledresolution.getScaledWidth();
        final int l = scaledresolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiVoting.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int m = k / 2 - 128;
        final int n = l / 2 - this.guiHeight / 2;
        this.drawTexturedModalRect(m, n, 0, 0, 256, 22);
        for (int p = 0; p < GuiVoting.packet.clientOptions.length; ++p) {
            this.drawTexturedModalRect(m, n + 22 + 24 * p, 0, 23, 256, 24);
        }
        this.drawTexturedModalRect(m, l / 2 + this.guiHeight / 2 - 6, 0, 73, 256, 7);
        this.drawString(this.fontRendererObj, "Vote for the Next Round", m + 8, n + 8, 16777215);
        this.drawString(this.fontRendererObj, GuiVoting.packet.timeLeft / 20 + "", m + 256 - 20, n + 8, 16777215);
        for (int p = 0; p < GuiVoting.packet.clientOptions.length; ++p) {
            this.drawString(this.fontRendererObj, GuiVoting.packet.clientOptions[p].mapName, m + 10, n + 25 + 24 * p, 16777215);
            this.drawString(this.fontRendererObj, GuiVoting.packet.clientOptions[p].gametype + " : §" + GuiVoting.packet.clientOptions[p].teamNames[0] + ", §" + GuiVoting.packet.clientOptions[p].teamNames[1], m + 10, n + 35 + 24 * p, 16777215);
            this.drawCenteredString(this.fontRendererObj, ((GuiVoting.myVote == p + 1) ? "§2" : "") + GuiVoting.packet.numVotes[p], m + 196, n + 31 + 24 * p, 16777215);
        }
        super.drawScreen(i, j, f);
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/vote.png");
        GuiVoting.myVote = 0;
    }
}
