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
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.field_146292_n.clear();
        this.guiHeight = 29 + GuiVoting.packet.clientOptions.length * 24;
        for (int i = 0; i < GuiVoting.packet.clientOptions.length; ++i) {
            this.field_146292_n.add(new GuiButton(i, this.field_146294_l / 2 + 128 - 50, this.field_146295_m / 2 - this.guiHeight / 2 + 24 + 24 * i, 40, 20, "Vote"));
        }
    }
    
    protected void func_146284_a(final GuiButton button) {
        GuiVoting.myVote = button.field_146127_k + 1;
        FlansMod.getPacketHandler().sendToServer(new PacketVoteCast(GuiVoting.myVote));
    }
    
    public void func_73863_a(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.field_146297_k, this.field_146297_k.field_71443_c, this.field_146297_k.field_71440_d);
        final int k = scaledresolution.func_78326_a();
        final int l = scaledresolution.func_78328_b();
        final FontRenderer fontrenderer = this.field_146297_k.field_71466_p;
        this.func_146276_q_();
        GL11.glEnable(3042);
        this.field_146297_k.field_71446_o.func_110577_a(GuiVoting.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int m = k / 2 - 128;
        final int n = l / 2 - this.guiHeight / 2;
        this.func_73729_b(m, n, 0, 0, 256, 22);
        for (int p = 0; p < GuiVoting.packet.clientOptions.length; ++p) {
            this.func_73729_b(m, n + 22 + 24 * p, 0, 23, 256, 24);
        }
        this.func_73729_b(m, l / 2 + this.guiHeight / 2 - 6, 0, 73, 256, 7);
        this.func_73731_b(this.field_146289_q, "Vote for the Next Round", m + 8, n + 8, 16777215);
        this.func_73731_b(this.field_146289_q, GuiVoting.packet.timeLeft / 20 + "", m + 256 - 20, n + 8, 16777215);
        for (int p = 0; p < GuiVoting.packet.clientOptions.length; ++p) {
            this.func_73731_b(this.field_146289_q, GuiVoting.packet.clientOptions[p].mapName, m + 10, n + 25 + 24 * p, 16777215);
            this.func_73731_b(this.field_146289_q, GuiVoting.packet.clientOptions[p].gametype + " : §" + GuiVoting.packet.clientOptions[p].teamNames[0] + ", §" + GuiVoting.packet.clientOptions[p].teamNames[1], m + 10, n + 35 + 24 * p, 16777215);
            this.func_73732_a(this.field_146289_q, ((GuiVoting.myVote == p + 1) ? "§2" : "") + GuiVoting.packet.numVotes[p], m + 196, n + 31 + 24 * p, 16777215);
        }
        super.func_73863_a(i, j, f);
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/vote.png");
        GuiVoting.myVote = 0;
    }
}
