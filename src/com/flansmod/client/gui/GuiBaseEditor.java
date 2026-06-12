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
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.field_146292_n.clear();
        Keyboard.enableRepeatEvents(true);
        (this.nameEntryField = new GuiTextField(this.field_146289_q, this.field_146294_l / 2 - 128 + 70, this.field_146295_m / 2 - 94 + 24, 179, this.field_146289_q.field_78288_b)).func_146203_f(60);
        this.nameEntryField.func_146185_a(true);
        this.nameEntryField.func_146189_e(true);
        this.nameEntryField.func_146195_b(true);
        this.nameEntryField.func_146193_g(16777215);
        this.nameEntryField.func_146180_a(this.packet.baseName);
        (this.teamButtons = new GuiButton[4])[0] = new GuiButton(0, this.field_146294_l / 2 - 128 + 6, this.field_146295_m / 2 - 94 + 38, 58, 20, "No Team");
        this.teamButtons[1] = new GuiButton(1, this.field_146294_l / 2 - 128 + 68, this.field_146295_m / 2 - 94 + 38, 58, 20, "Spectator");
        this.teamButtons[2] = new GuiButton(2, this.field_146294_l / 2 - 128 + 130, this.field_146295_m / 2 - 94 + 38, 58, 20, "Team 1");
        this.teamButtons[3] = new GuiButton(3, this.field_146294_l / 2 - 128 + 192, this.field_146295_m / 2 - 94 + 38, 58, 20, "Team 2");
        this.field_146292_n.addAll(Arrays.asList(this.teamButtons).subList(0, 4));
        this.mapButtons = new GuiButton[5];
        for (int i = 0; i < 5; ++i) {
            this.mapButtons[i] = new GuiButton(4 + i, this.field_146294_l / 2 - 128 + 28, this.field_146295_m / 2 - 94 + 75 + 22 * i, 200, 20, "Map " + (i + 1));
            this.field_146292_n.add(this.mapButtons[i]);
        }
        this.leftButton = new GuiButton(9, this.field_146294_l / 2 - 128 + 6, this.field_146295_m / 2 - 94 + 119, 20, 20, "<");
        this.rightButton = new GuiButton(10, this.field_146294_l / 2 + 128 - 26, this.field_146295_m / 2 - 94 + 119, 20, 20, ">");
        this.field_146292_n.add(this.leftButton);
        this.field_146292_n.add(this.rightButton);
    }
    
    public void func_73863_a(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.field_146297_k, this.field_146297_k.field_71443_c, this.field_146297_k.field_71440_d);
        final int k = scaledresolution.func_78326_a();
        final int l = scaledresolution.func_78328_b();
        final FontRenderer fontrenderer = this.field_146297_k.field_71466_p;
        this.func_146276_q_();
        GL11.glEnable(3042);
        this.field_146297_k.field_71446_o.func_110577_a(GuiBaseEditor.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int guiOriginX = k / 2 - 128;
        this.guiOriginX = guiOriginX;
        final int m = guiOriginX;
        final int guiOriginY = l / 2 - 94;
        this.guiOriginY = guiOriginY;
        final int n = guiOriginY;
        this.func_73729_b(m, n, 0, 0, 256, 189);
        this.func_73731_b(this.field_146289_q, "Base Settings", this.guiOriginX + 6, this.guiOriginY + 6, 16777215);
        this.func_73731_b(this.field_146289_q, "Base Name : ", this.guiOriginX + 6, this.guiOriginY + 24, 16777215);
        this.func_73731_b(this.field_146289_q, "Map", this.guiOriginX + 6, this.guiOriginY + 64, 16777215);
        this.nameEntryField.func_146194_f();
        super.func_73863_a(i, j, f);
    }
    
    protected void func_146284_a(final GuiButton button) {
        switch (button.field_146127_k) {
            case 0:
            case 1:
            case 2:
            case 3: {
                this.packet.teamID = button.field_146127_k;
                break;
            }
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                this.packet.mapID = this.mapsPage * 5 + button.field_146127_k - 4;
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
    
    public void func_73876_c() {
        for (int i = 0; i < 4; ++i) {
            this.teamButtons[i].field_146124_l = (this.packet.teamID != i);
        }
        for (int i = 0; i < 5; ++i) {
            this.mapButtons[i].field_146125_m = (this.packet.maps.length > i + this.mapsPage * 5);
            if (this.mapButtons[i].field_146125_m) {
                this.mapButtons[i].field_146126_j = this.packet.maps[i + this.mapsPage * 5];
                this.mapButtons[i].field_146124_l = (i + this.mapsPage * 5 != this.packet.mapID);
            }
        }
        this.rightButton.field_146125_m = (this.packet.maps.length > (this.mapsPage + 1) * 5);
        this.leftButton.field_146125_m = (this.mapsPage > 0);
        this.nameEntryField.func_146178_a();
    }
    
    protected void func_73864_a(final int i, final int j, final int k) {
        super.func_73864_a(i, j, k);
        this.nameEntryField.func_146192_a(i, j, k);
    }
    
    protected void func_73869_a(final char c, final int i) {
        super.func_73869_a(c, i);
        this.nameEntryField.func_146201_a(c, i);
    }
    
    public void func_146281_b() {
        super.func_146281_b();
        this.packet.baseName = this.nameEntryField.func_146179_b();
        Keyboard.enableRepeatEvents(false);
        FlansMod.getPacketHandler().sendToServer(this.packet);
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/baseEdit.png");
    }
}
