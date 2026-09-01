// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.teams.Team;
import net.minecraft.client.gui.FontRenderer;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.client.FlansModClient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiTeamScores extends GuiScreen
{
    public static final ResourceLocation texture;
    public static final ResourceLocation texture2;
    
    public void drawScreen(final int i, final int j, final float f) {
        final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
        if (teamInfo == null || PacketTeamInfo.gametype == null || PacketTeamInfo.gametype.equals("") || PacketTeamInfo.teamData == null || PacketTeamInfo.teamData.length < 1) {
            this.mc.displayGuiScreen((GuiScreen)null);
            return;
        }
        if (PacketTeamInfo.sortedByTeam) {
            this.renderTwoTeamGUI(teamInfo);
        }
        else {
            this.renderDMGUI(teamInfo);
        }
    }
    
    public void renderTwoTeamGUI(final PacketTeamInfo teamInfo) {
        final long newTime = this.mc.theWorld.getWorldInfo().getWorldTime();
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int k = scaledresolution.getScaledWidth();
        final int l = scaledresolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiTeamScores.texture2);
        final int guiHeight = 68 + 9 * PacketTeamInfo.numLines;
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int m = k / 2 - 156;
        final int n = l / 2 - guiHeight / 2;
        drawModalRectWithCustomSizedTexture(m, n, 100.0f, 0.0f, 312, 66, 512.0f, 256.0f);
        for (int p = 0; p < PacketTeamInfo.numLines; ++p) {
            drawModalRectWithCustomSizedTexture(m, n + 66 + 9 * p, 100.0f, 71.0f, 312, 9, 512.0f, 256.0f);
        }
        drawModalRectWithCustomSizedTexture(m, n + 66 + PacketTeamInfo.numLines * 9, 100.0f, 168.0f, 312, 12, 512.0f, 256.0f);
        if (PacketTeamInfo.showZombieScore) {
            drawModalRectWithCustomSizedTexture(m + 103, n + 51, 412.0f, 0.0f, 29, 11, 512.0f, 256.0f);
            drawModalRectWithCustomSizedTexture(m + 254, n + 51, 412.0f, 0.0f, 29, 11, 512.0f, 256.0f);
        }
        this.drawString(this.fontRendererObj, PacketTeamInfo.map, m + 6, n + 6, 16777215);
        this.drawString(this.fontRendererObj, PacketTeamInfo.gametype, m + 312 - 6 - this.fontRendererObj.getStringWidth(PacketTeamInfo.gametype), n + 6, 16777215);
        if (teamInfo.roundOver()) {
            final Team winners = teamInfo.getWinner();
            if (winners == null) {
                this.drawString(this.fontRendererObj, "Time Ran Out!", m + 10, n + 20, 16777215);
            }
            else {
                this.drawString(this.fontRendererObj, winners.name + " Won!", m + 10, n + 20, 16777215);
            }
        }
        else {
            int secondsLeft = PacketTeamInfo.timeLeft / 20;
            final int minutesLeft = secondsLeft / 60;
            secondsLeft %= 60;
            this.drawString(this.fontRendererObj, "Time Left : " + minutesLeft + ":" + ((secondsLeft < 10) ? ("0" + secondsLeft) : Integer.valueOf(secondsLeft)), m + 10, n + 20, 16777215);
            this.drawString(this.fontRendererObj, "Score Limit : " + PacketTeamInfo.scoreLimit, m + 302 - this.fontRendererObj.getStringWidth("Score Limit : " + PacketTeamInfo.scoreLimit), n + 20, 16777215);
        }
        for (int i = 0; i < 2; ++i) {
            this.fontRendererObj.drawString("§" + PacketTeamInfo.teamData[i].team.textColour + PacketTeamInfo.teamData[i].team.name, m + 10 + 151 * i, n + 39, 16777215);
            this.fontRendererObj.drawString("§" + PacketTeamInfo.teamData[i].team.textColour + PacketTeamInfo.teamData[i].score, m + 133 + 151 * i, n + 39, 16777215);
            for (int j = 0; j < PacketTeamInfo.teamData[i].numPlayers; ++j) {
                this.drawString(this.fontRendererObj, PacketTeamInfo.teamData[i].playerData[j].username, m + 12 + 151 * i, n + 67 + 9 * j, 16777215);
                this.drawCenteredString(this.fontRendererObj, "" + PacketTeamInfo.teamData[i].playerData[j].score, m + 111 + 151 * i, n + 67 + 9 * j, 16777215);
                this.drawCenteredString(this.fontRendererObj, "" + (PacketTeamInfo.showZombieScore ? PacketTeamInfo.teamData[i].playerData[j].zombieScore : PacketTeamInfo.teamData[i].playerData[j].kills), m + 127 + 151 * i, n + 67 + 9 * j, 16777215);
                this.drawCenteredString(this.fontRendererObj, "" + PacketTeamInfo.teamData[i].playerData[j].deaths, m + 143 + 151 * i, n + 67 + 9 * j, 16777215);
            }
        }
        GL11.glDisable(3042);
    }
    
    public void renderDMGUI(final PacketTeamInfo teamInfo) {
        final long newTime = this.mc.theWorld.getWorldInfo().getWorldTime();
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int k = scaledresolution.getScaledWidth();
        final int l = scaledresolution.getScaledHeight();
        final FontRenderer fontrenderer = this.mc.fontRendererObj;
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiTeamScores.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int guiHeight = 34 + 9 * PacketTeamInfo.numLines;
        final int m = k / 2 - 128;
        final int n = l / 2 - guiHeight / 2;
        this.drawTexturedModalRect(m, n, 0, 45, 256, 24);
        for (int p = 0; p < PacketTeamInfo.numLines; ++p) {
            this.drawTexturedModalRect(m, n + 24 + 9 * p, 0, 71, 256, 9);
        }
        this.drawTexturedModalRect(m, l / 2 + guiHeight / 2 - 10, 0, 87, 256, 10);
        this.drawCenteredString(this.fontRendererObj, PacketTeamInfo.gametype, k / 2, n + 4, 16777215);
        this.drawString(this.fontRendererObj, "Name", m + 8, n + 14, 16777215);
        this.drawString(this.fontRendererObj, "Shekels", m + 50, n + 14, 16777215);
        this.drawString(this.fontRendererObj, "Score", m + 100, n + 14, 16777215);
        this.drawString(this.fontRendererObj, "Kills", m + 150, n + 14, 16777215);
        this.drawString(this.fontRendererObj, "Deaths", m + 200, n + 14, 16777215);
        int line = 0;
        if (PacketTeamInfo.sortedByTeam) {
            for (int p2 = 0; p2 < PacketTeamInfo.numTeams; ++p2) {
                if (PacketTeamInfo.teamData[p2] != null) {
                    if (PacketTeamInfo.teamData[p2].team != null) {
                        this.drawString(this.fontRendererObj, "§" + PacketTeamInfo.teamData[p2].team.textColour + PacketTeamInfo.teamData[p2].team.name, m + 8, n + 25 + 9 * line, 16777215);
                        this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[p2].score, m + 100, n + 25 + 9 * line, 16777215);
                        ++line;
                        for (int q = 0; q < PacketTeamInfo.teamData[p2].numPlayers; ++q) {
                            this.drawString(this.fontRendererObj, PacketTeamInfo.teamData[p2].playerData[q].username, m + 8, n + 25 + 9 * line, 16777215);
                            this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[p2].playerData[q].score, m + 100, n + 25 + 9 * line, 16777215);
                            this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[p2].playerData[q].kills, m + 150, n + 25 + 9 * line, 16777215);
                            this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[p2].playerData[q].deaths, m + 200, n + 25 + 9 * line, 16777215);
                            ++line;
                        }
                    }
                }
            }
        }
        else {
            for (int q2 = 0; q2 < PacketTeamInfo.teamData[0].numPlayers; ++q2) {
                this.drawString(this.fontRendererObj, PacketTeamInfo.teamData[0].playerData[q2].username, m + 8, n + 25 + 9 * line, 16777215);
                this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[0].playerData[q2].score, m + 100, n + 25 + 9 * line, 16777215);
                this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[0].playerData[q2].kills, m + 150, n + 25 + 9 * line, 16777215);
                this.drawString(this.fontRendererObj, "" + PacketTeamInfo.teamData[0].playerData[q2].deaths, m + 200, n + 25 + 9 * line, 16777215);
                ++line;
            }
        }
        GL11.glDisable(3042);
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/teamsScores.png");
        texture2 = new ResourceLocation("flansmod", "gui/teamsScores2.png");
    }
}
