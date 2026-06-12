// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketGunPaint;
import com.flansmod.common.FlansMod;
import org.lwjgl.input.Mouse;
import net.minecraft.init.Items;
import com.flansmod.common.paintjob.PaintableType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.client.model.ModelAttachment;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraftforge.client.IItemRenderer;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.ClientProxy;
import com.flansmod.common.guns.GunType;
import com.flansmod.client.model.RenderGun;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.Container;
import com.flansmod.common.paintjob.ContainerPaintjobTable;
import com.flansmod.common.paintjob.TileEntityPaintjobTable;
import net.minecraft.world.World;
import com.flansmod.common.RotatedAxes;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.paintjob.Paintjob;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiPaintjobTable extends GuiContainer
{
    private static final ResourceLocation texture;
    private static final Random rand;
    private static final int paletteSizeX = 18;
    private static final int paletteSizeY = 4;
    private static final float componentBarLength = 68.0f;
    private Paintjob hoveringOver;
    private int mouseX;
    private int mouseY;
    private InventoryPlayer inventory;
    private boolean inCustomMode;
    private float customModeTransitionTimer;
    private float transitionSpeed;
    private int prevMainPageX;
    private RotatedAxes modelAxes;
    private RotatedAxes prevModelAxes;
    private static int[][] paletteColours;
    private static int[] baseColours;
    private static int currentColour;
    
    private static void ResetPalette() {
        for (int x = 0; x < 18; ++x) {
            for (int y = 0; y < 4; ++y) {
                int red = GuiPaintjobTable.baseColours[x] >> 16 & 0xFF;
                int green = GuiPaintjobTable.baseColours[x] >> 8 & 0xFF;
                int blue = GuiPaintjobTable.baseColours[x] >> 0 & 0xFF;
                if (x == 0) {
                    green = (red = (blue = 255 * y / 7));
                }
                else if (x == 1) {
                    green = (red = (blue = 255 * (y + 4) / 7));
                }
                else {
                    if (y == 3) {
                        red /= 2;
                        green /= 2;
                        blue /= 2;
                    }
                    if (y == 1) {
                        red = 255 - (255 - red) / 2;
                        green = 255 - (255 - green) / 2;
                        blue = 255 - (255 - blue) / 2;
                    }
                    if (y == 0) {
                        red = 255 - (255 - red) / 4;
                        green = 255 - (255 - green) / 4;
                        blue = 255 - (255 - blue) / 4;
                    }
                }
                GuiPaintjobTable.paletteColours[x][y] = (red << 16) + (green << 8) + blue;
            }
        }
    }
    
    public GuiPaintjobTable(final InventoryPlayer inv, final World w, final TileEntityPaintjobTable te) {
        super((Container)new ContainerPaintjobTable(inv, w, te));
        this.hoveringOver = null;
        this.customModeTransitionTimer = 0.0f;
        this.transitionSpeed = 0.9f;
        this.modelAxes = new RotatedAxes();
        this.prevModelAxes = new RotatedAxes();
        this.inventory = inv;
        this.field_146999_f = 224;
        this.field_147000_g = 264;
    }
    
    public void func_73876_c() {
        super.func_73876_c();
        this.prevModelAxes = this.modelAxes.clone();
        if (this.inCustomMode) {
            this.customModeTransitionTimer = 1.0f - (1.0f - this.customModeTransitionTimer) * this.transitionSpeed;
        }
        else {
            this.customModeTransitionTimer *= this.transitionSpeed;
            this.modelAxes.rotateLocalYaw(2.5f);
        }
        final int xPos = this.GetMainPageX();
        final int dPos = xPos - this.prevMainPageX;
        for (int i = 0; i < 38; ++i) {
            final Slot func_75139_a = this.field_147002_h.func_75139_a(i);
            func_75139_a.field_75223_e += dPos;
        }
        this.prevMainPageX = xPos;
    }
    
    private int GetMainPageX() {
        return (int)(-500.0f * this.customModeTransitionTimer);
    }
    
    private static int GetMainPageY() {
        return 0;
    }
    
    private int GetCustomPageX() {
        return (int)(500.0f * (1.0f - this.customModeTransitionTimer));
    }
    
    private static int GetCustomPageY() {
        return 0;
    }
    
    private static Vector3f GetRenderOrigin() {
        final Vector3f mainPagePosition = new Vector3f(100.0f, 64.0f, 100.0f);
        return mainPagePosition;
    }
    
    protected void func_146979_b(final int x, final int y) {
        if (this.customModeTransitionTimer <= 0.999f) {
            final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2 + this.GetMainPageX();
            final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2 + GetMainPageY();
            this.field_146289_q.func_78276_b("Inventory", this.GetMainPageX() + 8, GetMainPageY() + (this.field_147000_g - 94) + 2, 4210752);
            this.field_146289_q.func_78276_b("Paintjob Table", this.GetMainPageX() + 8, GetMainPageY() + 6, 4210752);
        }
        final Vector3f renderOrigin = GetRenderOrigin();
        final ItemStack paintableStack = this.field_147002_h.func_75139_a(0).func_75211_c();
        if (paintableStack != null && paintableStack.func_77973_b() instanceof IPaintableItem) {
            final ItemStack tempStack = paintableStack.func_77946_l();
            if (this.hoveringOver != null) {
                tempStack.func_77964_b(this.hoveringOver.ID);
            }
            final PaintableType paintableType = ((IPaintableItem)paintableStack.func_77973_b()).GetPaintableType();
            final EnumType eType = EnumType.getFromObject(paintableType);
            if (paintableType.GetModel() != null) {
                GL11.glPushMatrix();
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(2896);
                GL11.glPushMatrix();
                GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
                RenderHelper.func_74519_b();
                GL11.glPopMatrix();
                GL11.glEnable(2977);
                GL11.glTranslatef(renderOrigin.x, renderOrigin.y, renderOrigin.z);
                GL11.glRotatef(160.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 1.0f, 0.0f);
                final float scale = paintableType.GetRecommendedScale();
                GL11.glScalef(-scale, scale, scale);
                float dYaw;
                for (dYaw = this.modelAxes.getYaw() - this.prevModelAxes.getYaw(); dYaw > 180.0f; dYaw -= 360.0f) {}
                while (dYaw < -180.0f) {
                    dYaw += 360.0f;
                }
                GL11.glRotatef(this.prevModelAxes.getYaw() + dYaw * RenderGun.smoothing, 0.0f, 1.0f, 0.0f);
                final Paintjob paintjob = paintableType.paintjobs.get(tempStack.func_77960_j());
                switch (eType) {
                    case gun: {
                        final GunType gunType = (GunType)paintableType;
                        ClientProxy.gunRenderer.renderGun(tempStack, gunType, 0.0625f, gunType.model, GunAnimations.defaults, 0.0f, IItemRenderer.ItemRenderType.ENTITY);
                        break;
                    }
                    case attachment: {
                        this.field_146297_k.field_71446_o.func_110577_a(FlansModResourceHandler.getPaintjobTexture(paintjob));
                        final AttachmentType model = (AttachmentType)paintableType;
                        GL11.glScalef(model.modelScale, model.modelScale, model.modelScale);
                        ((ModelAttachment)paintableType.GetModel()).renderAttachment(0.0625f);
                        break;
                    }
                    case plane:
                    case vehicle:
                    case mecha: {
                        this.field_146297_k.field_71446_o.func_110577_a(FlansModResourceHandler.getPaintjobTexture(paintjob));
                        ((ModelDriveable)paintableType.GetModel()).render((DriveableType)paintableType);
                        break;
                    }
                }
                GL11.glPopMatrix();
            }
        }
    }
    
    private static void drawModalRectWithCustomSizedTexture(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {
        func_146110_a(a, b, (float)c, (float)d, e, f, (float)g, (float)h);
    }
    
    protected void func_146976_a(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2929);
        this.field_146297_k.field_71446_o.func_110577_a(GuiPaintjobTable.texture);
        final int textureX = 512;
        final int textureY = 256;
        if (this.customModeTransitionTimer <= 0.999f) {
            final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2 + this.GetMainPageX();
            final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2 + GetMainPageY();
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin, 0, 0, this.field_146999_f, 114, textureX, textureY);
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin + 122, 0, 114, this.field_146999_f, 142, textureX, textureY);
            final ItemStack gunStack = this.field_147002_h.func_75139_a(0).func_75211_c();
            if (gunStack != null && gunStack.func_77973_b() instanceof IPaintableItem) {
                final PaintableType gunType = ((IPaintableItem)gunStack.func_77973_b()).GetPaintableType();
                final int numPaintjobs = gunType.paintjobs.size();
                for (int numRows = numPaintjobs / 9 + 1, y = 0; y < numRows; ++y) {
                    for (int x = 0; x < 9; ++x) {
                        if (9 * y + x < numPaintjobs) {
                            final Paintjob paintjob = gunType.paintjobs.get(9 * y + x);
                            final ItemStack stack = gunStack.func_77946_l();
                            stack.func_77964_b(paintjob.ID);
                            GuiPaintjobTable.field_146296_j.func_77015_a(this.field_146297_k.field_71466_p, this.field_146297_k.func_110434_K(), stack, xOrigin + 8 + x * 18, yOrigin + 130 + y * 18);
                        }
                    }
                }
            }
            if (this.hoveringOver != null) {
                final int numDyes = this.hoveringOver.dyesNeeded.length;
                if (numDyes != 0 && !this.inventory.field_70458_d.field_71075_bZ.field_75098_d) {
                    final boolean[] haveDyes = new boolean[numDyes];
                    for (int n = 0; n < numDyes; ++n) {
                        int amountNeeded = this.hoveringOver.dyesNeeded[n].field_77994_a;
                        for (int s = 0; s < this.inventory.func_70302_i_(); ++s) {
                            final ItemStack stack2 = this.inventory.func_70301_a(s);
                            if (stack2 != null && stack2.func_77973_b() == Items.field_151100_aR && stack2.func_77960_j() == this.hoveringOver.dyesNeeded[n].func_77960_j()) {
                                amountNeeded -= stack2.field_77994_a;
                            }
                        }
                        if (amountNeeded <= 0) {
                            haveDyes[n] = true;
                        }
                    }
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    GL11.glDisable(2896);
                    this.field_146297_k.field_71446_o.func_110577_a(GuiPaintjobTable.texture);
                    final int originX = this.mouseX + 6;
                    final int originY = this.mouseY - 20;
                    if (numDyes == 1) {
                        drawModalRectWithCustomSizedTexture(originX, originY, haveDyes[0] ? 379 : 356, 0, 22, 22, textureX, textureY);
                    }
                    else {
                        drawModalRectWithCustomSizedTexture(originX, originY, 256, haveDyes[0] ? 23 : 0, 20, 22, textureX, textureY);
                        for (int s = 1; s < numDyes - 1; ++s) {
                            drawModalRectWithCustomSizedTexture(originX + 2 + 18 * s, originY, 277, haveDyes[s] ? 23 : 0, 18, 22, textureX, textureY);
                        }
                        drawModalRectWithCustomSizedTexture(originX + 2 + 18 * (numDyes - 1), originY, 296, haveDyes[numDyes - 1] ? 23 : 0, 20, 22, textureX, textureY);
                    }
                    for (int s = 0; s < numDyes; ++s) {
                        GuiPaintjobTable.field_146296_j.func_77015_a(this.field_146297_k.field_71466_p, this.field_146297_k.func_110434_K(), this.hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3);
                        GuiPaintjobTable.field_146296_j.func_94148_a(this.field_146297_k.field_71466_p, this.field_146297_k.func_110434_K(), this.hoveringOver.dyesNeeded[s], originX + 3 + s * 18, originY + 3, (String)null);
                    }
                }
            }
        }
        if (this.customModeTransitionTimer >= 0.001f) {
            this.field_146297_k.field_71446_o.func_110577_a(GuiPaintjobTable.texture);
            final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2 + this.GetCustomPageX() - 32;
            final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2 + GetCustomPageY();
            drawModalRectWithCustomSizedTexture(xOrigin, yOrigin + 200, 224, 206, 288, 50, textureX, textureY);
            GL11.glDisable(3553);
            for (int x2 = 0; x2 < 18; ++x2) {
                for (int y2 = 0; y2 < 4; ++y2) {
                    final int colour = GuiPaintjobTable.paletteColours[x2][y2];
                    final float scale = 0.00390625f;
                    GL11.glColor3f(scale * (colour >> 16 & 0xFF), scale * (colour >> 8 & 0xFF), scale * (colour >> 0 & 0xFF));
                    drawModalRectWithCustomSizedTexture(xOrigin + 8 + 9 * x2, yOrigin + 200 + 8 + 9 * y2, 0, 0, 7, 7, textureX, textureY);
                }
            }
            final float scale2 = 0.00390625f;
            final float red = scale2 * (GuiPaintjobTable.currentColour >> 16 & 0xFF);
            final float green = scale2 * (GuiPaintjobTable.currentColour >> 8 & 0xFF);
            final float blue = scale2 * (GuiPaintjobTable.currentColour >> 0 & 0xFF);
            GL11.glColor3f(red, green, blue);
            drawModalRectWithCustomSizedTexture(xOrigin + 172, yOrigin + 208, 0, 0, 34, 34, textureX, textureY);
            for (int n2 = 0; n2 < 68.0f; ++n2) {
                GL11.glColor3f(n2 / 68.0f, green, blue);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n2, yOrigin + 208, 0, 0, 1, 10, textureX, textureY);
            }
            for (int n2 = 0; n2 < 68.0f; ++n2) {
                GL11.glColor3f(red, n2 / 68.0f, blue);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n2, yOrigin + 220, 0, 0, 1, 10, textureX, textureY);
            }
            for (int n2 = 0; n2 < 68.0f; ++n2) {
                GL11.glColor3f(red, green, n2 / 68.0f);
                drawModalRectWithCustomSizedTexture(xOrigin + 212 + n2, yOrigin + 232, 0, 0, 1, 10, textureX, textureY);
            }
            GL11.glEnable(3553);
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(red * 68.0f), yOrigin + 207, 317, 21, 3, 12, textureX, textureY);
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(green * 68.0f), yOrigin + 219, 317, 21, 3, 12, textureX, textureY);
            drawModalRectWithCustomSizedTexture(xOrigin + 212 + (int)(blue * 68.0f), yOrigin + 231, 317, 21, 3, 12, textureX, textureY);
        }
        GL11.glEnable(2929);
    }
    
    public void func_146274_d() {
        super.func_146274_d();
        this.mouseX = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
        this.mouseY = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
        final int mouseXInGUI = this.mouseX - this.field_147003_i;
        final int mouseYInGUI = this.mouseY - this.field_147009_r;
        this.hoveringOver = null;
        if (this.inCustomMode) {
            final int xOrigin = this.GetCustomPageX() - 32;
            final int yOrigin = GetCustomPageY();
            for (int x = 0; x < 18; ++x) {
                for (int y = 0; y < 4; ++y) {
                    if (mouseXInGUI >= xOrigin + 8 + 9 * x && mouseXInGUI < xOrigin + 15 + 9 * x && mouseYInGUI >= yOrigin + 208 + 9 * y && mouseYInGUI < yOrigin + 215 + 9 * y) {
                        switch (Mouse.getEventButton()) {
                            case 0: {
                                GuiPaintjobTable.currentColour = GuiPaintjobTable.paletteColours[x][y];
                                break;
                            }
                            case 1: {
                                GuiPaintjobTable.paletteColours[x][y] = GuiPaintjobTable.currentColour;
                                break;
                            }
                        }
                    }
                }
            }
            if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState()) {
                if (mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + 68.0f && mouseYInGUI >= yOrigin + 208 && mouseYInGUI < yOrigin + 218) {
                    final int red = (int)((mouseXInGUI - (xOrigin + 212)) * 255 / 68.0f);
                    GuiPaintjobTable.currentColour &= 0xFFFF;
                    GuiPaintjobTable.currentColour |= red << 16;
                }
                if (mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + 68.0f && mouseYInGUI >= yOrigin + 220 && mouseYInGUI < yOrigin + 230) {
                    final int green = (int)((mouseXInGUI - (xOrigin + 212)) * 255 / 68.0f);
                    GuiPaintjobTable.currentColour &= 0xFF00FF;
                    GuiPaintjobTable.currentColour |= green << 8;
                }
                if (mouseXInGUI >= xOrigin + 212 && mouseXInGUI < xOrigin + 212 + 68.0f && mouseYInGUI >= yOrigin + 232 && mouseYInGUI < yOrigin + 242) {
                    final int blue = (int)((mouseXInGUI - (xOrigin + 212)) * 255 / 68.0f);
                    GuiPaintjobTable.currentColour &= 0xFFFF00;
                    GuiPaintjobTable.currentColour |= blue << 0;
                }
            }
        }
        else {
            final ItemStack gunStack = this.field_147002_h.func_75139_a(0).func_75211_c();
            if (gunStack != null && gunStack.func_77973_b() instanceof IPaintableItem) {
                final PaintableType paintableType = ((IPaintableItem)gunStack.func_77973_b()).GetPaintableType();
                final int numPaintjobs = paintableType.paintjobs.size();
                for (int numRows = numPaintjobs / 9 + 1, j = 0; j < numRows; ++j) {
                    for (int i = 0; i < 9; ++i) {
                        if (9 * j + i < numPaintjobs) {
                            final Paintjob paintjob = paintableType.paintjobs.get(9 * j + i);
                            final ItemStack stack = gunStack.func_77946_l();
                            try {
                                stack.func_77978_p().func_74778_a("Paint", paintjob.iconName);
                            }
                            catch (final NullPointerException ex) {}
                            final int slotX = 7 + i * 18;
                            final int slotY = 129 + j * 18;
                            if (mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY && mouseYInGUI < slotY + 18) {
                                this.hoveringOver = paintjob;
                            }
                        }
                    }
                }
            }
        }
    }
    
    protected void func_73864_a(final int x, final int y, final int button) {
        super.func_73864_a(x, y, button);
        if (button != 0) {
            return;
        }
        if (this.hoveringOver == null) {
            return;
        }
        FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(this.hoveringOver.ID));
        ((ContainerPaintjobTable)this.field_147002_h).clickPaintjob(this.hoveringOver.ID);
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/paintjobTable.png");
        rand = new Random();
        GuiPaintjobTable.paletteColours = new int[18][4];
        GuiPaintjobTable.baseColours = new int[] { 0, 16777215, 16711680, 16733440, 16755200, 16776960, 11206400, 5635840, 65280, 65365, 65450, 65535, 43775, 22015, 255, 5570815, 11141375, 16711935 };
        ResetPalette();
    }
}
