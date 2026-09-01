// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketGunPaint;
import com.flansmod.common.FlansMod;
import org.lwjgl.input.Mouse;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Items;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Collections;
import net.minecraftforge.client.IItemRenderer;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.client.ClientProxy;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.inventory.Container;
import com.flansmod.common.guns.ContainerGunModTable;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.paintjob.Paintjob;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiGunModTable extends GuiContainer
{
    private static final ResourceLocation texture;
    private static final Random rand;
    private Paintjob hoveringOver;
    private String hoveringOverModSlots;
    private int mouseX;
    private int mouseY;
    private InventoryPlayer inventory;
    private boolean flipGunModel;
    private int[] lastStats;
    
    public GuiGunModTable(final InventoryPlayer inv, final World w) {
        super((Container)new ContainerGunModTable(inv, w));
        this.hoveringOver = null;
        this.hoveringOverModSlots = null;
        this.flipGunModel = false;
        this.lastStats = new int[] { 0, 0, 0, 0 };
        this.inventory = inv;
        this.field_146999_f = 331;
        this.field_147000_g = 236;
    }
    
    protected void func_146979_b(final int x, final int y) {
        this.field_146289_q.func_78276_b("Gun Modification Table", 6, 6, 4210752);
        this.field_146289_q.func_78276_b("Inventory", 7, 142, 4210752);
        this.field_146289_q.func_78276_b("Gun Information", 179, 22, 4210752);
        this.field_146289_q.func_78276_b("Paintjobs", 179, 128, 4210752);
        final ItemStack gunStack = this.field_147002_h.func_75139_a(0).func_75211_c();
        if (gunStack != null && gunStack.func_77973_b() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.func_77973_b()).type;
            final int reloadt = Math.round(gunType.getReloadTime(gunStack));
            if (gunType.model != null) {
                GL11.glPushMatrix();
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
                GL11.glTranslatef(105.0f, 55.0f, 100.0f);
                GL11.glRotatef(160.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 1.0f, 0.0f);
                if (this.flipGunModel) {
                    GL11.glTranslatef(-30.0f, 0.0f, 0.0f);
                    GL11.glRotatef(190.0f, 0.0f, 1.0f, 0.0f);
                }
                RenderHelper.func_74519_b();
                GL11.glScalef(-60.0f, 60.0f, 60.0f);
                ClientProxy.gunRenderer.renderGun(gunStack, gunType, 0.0625f, gunType.model, GunAnimations.defaults, 0.0f, IItemRenderer.ItemRenderType.ENTITY);
                GL11.glPopMatrix();
            }
            if (gunStack.func_82833_r() != null) {
                this.field_146289_q.func_78276_b(gunStack.func_82833_r(), 207, 36, 4210752);
            }
            this.field_146289_q.func_78276_b(gunType.description, 207, 46, 4210752);
            this.field_146289_q.func_78276_b("Damage", 181, 61, 4210752);
            this.field_146289_q.func_78276_b("Accuracy", 181, 73, 4210752);
            this.field_146289_q.func_78276_b("Recoil", 181, 85, 4210752);
            this.field_146289_q.func_78276_b("Reload", 181, 97, 4210752);
            this.field_146289_q.func_78276_b(String.valueOf(roundFloat(gunType.getDamage(gunStack), 2)), 241, 62, 4210752);
            this.field_146289_q.func_78276_b(String.valueOf(gunType.getSpread(gunStack, false, false)), 241, 74, 4210752);
            this.field_146289_q.func_78276_b(String.valueOf(roundFloat(gunType.getRecoilPitch(gunStack), 2)), 241, 86, 4210752);
            this.field_146289_q.func_78276_b(String.valueOf(roundFloat((float)(reloadt / 20), 2)) + "s", 241, 98, 4210752);
            if (this.hoveringOverModSlots != null) {
                this.drawHoveringText((List)Collections.singletonList(this.hoveringOverModSlots), this.mouseX - this.field_147003_i, this.mouseY - this.field_147009_r, this.field_146289_q);
            }
        }
    }
    
    protected void func_146976_a(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2;
        final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2;
        this.field_146297_k.field_71446_o.func_110577_a(GuiGunModTable.texture);
        this.func_73729_b(xOrigin, yOrigin, 0, 0, this.field_146999_f, this.field_147000_g);
        for (int z = 1; z < 17; ++z) {
            this.field_147002_h.func_75139_a(z).field_75221_f = -1000;
        }
        final ItemStack gunStack = this.field_147002_h.func_75139_a(0).func_75211_c();
        if (gunStack == null) {
            this.lastStats = new int[] { 0, 0, 0, 0 };
        }
        if (gunStack != null && gunStack.func_77973_b() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.func_77973_b()).type;
            final boolean[] allowBools = { gunType.allowBarrelAttachments, gunType.allowScopeAttachments, gunType.allowStockAttachments, gunType.allowGripAttachments, gunType.allowGadgetAttachments, gunType.allowSlideAttachments, gunType.allowPumpAttachments, gunType.allowAccessoryAttachments };
            final int reloadt = Math.round(gunType.getReloadTime(gunStack));
            this.func_73729_b(xOrigin + 146, yOrigin + 63, 340, 166, 20, 10);
            for (int m = 0; m < allowBools.length; ++m) {
                if (allowBools[m]) {
                    this.func_73729_b(xOrigin + 16 + m * 18, yOrigin + 88, 340 + m * 18, 136, 18, 18);
                    this.field_147002_h.func_75139_a(m + 1).field_75221_f = 89;
                }
            }
            for (int x = 0; x < 8; ++x) {
                if (x < gunType.numGenericAttachmentSlots) {
                    this.func_73729_b(xOrigin + 16 + 18 * x, yOrigin + 114, 340, 100, 18, 18);
                    this.field_147002_h.func_75139_a(allowBools.length + 1 + x).field_75221_f = 115;
                }
            }
            final int[] stats = { Math.round(gunType.getDamage(gunStack)) * 4, Math.round(gunType.getSpread(gunStack, false, false)) * 4, Math.round(gunType.getRecoilPitch(gunStack)) * 4, reloadt / 20 * 8 };
            this.displayGunValues(stats);
            final int numPaintjobs = gunType.paintjobs.size();
            final int numRows = numPaintjobs / 2 + 1;
            for (int y = 0; y < numRows; ++y) {
                for (int x2 = 0; x2 < 2; ++x2) {
                    if (2 * y + x2 < numPaintjobs) {
                        this.func_73729_b(xOrigin + 181 + 18 * x2, yOrigin + 150 + 18 * y, 340, 100, 18, 18);
                    }
                }
            }
            for (int y = 0; y < numRows; ++y) {
                for (int x2 = 0; x2 < 2; ++x2) {
                    if (2 * y + x2 < numPaintjobs) {
                        final Paintjob paintjob = gunType.paintjobs.get(2 * y + x2);
                        final ItemStack stack = gunStack.func_77946_l();
                        stack.func_77964_b(paintjob.ID);
                        GuiGunModTable.field_146296_j.func_77015_a(this.field_146297_k.field_71466_p, this.field_146297_k.func_110434_K(), stack, xOrigin + 182 + x2 * 18, yOrigin + 151 + y * 18);
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
                this.field_146297_k.field_71446_o.func_110577_a(GuiGunModTable.texture);
                for (int s2 = 0; s2 < numDyes; ++s2) {
                    this.func_73729_b(xOrigin + 223 + 18 * s2, yOrigin + 150, haveDyes[s2] ? 358 : 340, 118, 18, 18);
                }
                for (int s2 = 0; s2 < numDyes; ++s2) {
                    GuiGunModTable.field_146296_j.func_77015_a(this.field_146289_q, this.field_146297_k.func_110434_K(), this.hoveringOver.dyesNeeded[s2], xOrigin + 224 + s2 * 18, yOrigin + 151);
                    GuiGunModTable.field_146296_j.func_77021_b(this.field_146289_q, this.field_146297_k.func_110434_K(), this.hoveringOver.dyesNeeded[s2], xOrigin + 224 + s2 * 18, yOrigin + 151);
                }
            }
        }
    }
    
    public void displayGunValues(final int[] stats) {
        final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2;
        final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2;
        for (int y = 0; y < 4; ++y) {
            this.func_73729_b(xOrigin + 239, yOrigin + 60 + 12 * y, 340, 80, 80, 10);
        }
        for (int k = 0; k < 4; ++k) {
            int difference = stats[k] - this.lastStats[k];
            int finalWidth = 0;
            if (k == 0) {
                if (stats[k] < 80 && difference != 0 && difference > 0) {
                    final int[] lastStats = this.lastStats;
                    final int n = k;
                    final int n2 = lastStats[n] + 2;
                    lastStats[n] = n2;
                    finalWidth = n2;
                }
                else if (difference != 0 && difference < 0) {
                    final int[] lastStats2 = this.lastStats;
                    final int n3 = k;
                    final int n4 = lastStats2[n3] - 2;
                    lastStats2[n3] = n4;
                    finalWidth = n4;
                }
                else if (stats[k] < 80) {
                    finalWidth = stats[k];
                }
                else {
                    finalWidth = 80;
                }
                this.func_73729_b(xOrigin + 239, yOrigin + 60 + 12 * k, 340, 90, finalWidth, 10);
            }
            else {
                difference = 80 - stats[k] - this.lastStats[k];
                if (80 - stats[k] > 2 && difference != 0 && difference > 0) {
                    final int[] lastStats3 = this.lastStats;
                    final int n5 = k;
                    final int n6 = lastStats3[n5] + 2;
                    lastStats3[n5] = n6;
                    finalWidth = n6;
                }
                else if (difference != 0 && difference < 0) {
                    final int[] lastStats4 = this.lastStats;
                    final int n7 = k;
                    final int n8 = lastStats4[n7] - 2;
                    lastStats4[n7] = n8;
                    finalWidth = n8;
                }
                else if (80 - stats[k] > 2) {
                    finalWidth = 80 - stats[k];
                }
                else {
                    finalWidth = 2;
                }
                this.func_73729_b(xOrigin + 239, yOrigin + 60 + 12 * k, 340, 90, finalWidth, 10);
            }
        }
    }
    
    public void func_73729_b(final int par1, final int par2, final int par3, final int par4, final int par5, final int par6) {
        final float f = 0.001953125f;
        final float f2 = 0.00390625f;
        final Tessellator tessellator = Tessellator.field_78398_a;
        tessellator.func_78382_b();
        tessellator.func_78374_a((double)par1, (double)(par2 + par6), (double)this.field_73735_i, (double)(par3 * f), (double)((par4 + par6) * f2));
        tessellator.func_78374_a((double)(par1 + par5), (double)(par2 + par6), (double)this.field_73735_i, (double)((par3 + par5) * f), (double)((par4 + par6) * f2));
        tessellator.func_78374_a((double)(par1 + par5), (double)par2, (double)this.field_73735_i, (double)((par3 + par5) * f), (double)(par4 * f2));
        tessellator.func_78374_a((double)par1, (double)par2, (double)this.field_73735_i, (double)(par3 * f), (double)(par4 * f2));
        tessellator.func_78381_a();
    }
    
    public void func_146274_d() {
        super.func_146274_d();
        this.mouseX = Mouse.getEventX() * this.field_146294_l / this.field_146297_k.field_71443_c;
        this.mouseY = this.field_146295_m - Mouse.getEventY() * this.field_146295_m / this.field_146297_k.field_71440_d - 1;
        final int mouseXInGUI = this.mouseX - this.field_147003_i;
        final int mouseYInGUI = this.mouseY - this.field_147009_r;
        this.hoveringOver = null;
        final ItemStack gunStack = this.field_147002_h.func_75139_a(0).func_75211_c();
        if (gunStack != null && gunStack.func_77973_b() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.func_77973_b()).type;
            final int numPaintjobs = gunType.paintjobs.size();
            for (int numRows = numPaintjobs / 2 + 1, j = 0; j < numRows; ++j) {
                for (int i = 0; i < 2; ++i) {
                    if (2 * j + i < numPaintjobs) {
                        final Paintjob paintjob = gunType.paintjobs.get(2 * j + i);
                        final ItemStack stack = gunStack.func_77946_l();
                        stack.field_77990_d.func_74778_a("Paint", paintjob.iconName);
                        final int slotX = 181 + i * 18;
                        final int slotY = 150 + j * 18;
                        if (mouseXInGUI >= slotX && mouseXInGUI < slotX + 18 && mouseYInGUI >= slotY && mouseYInGUI < slotY + 18) {
                            this.hoveringOver = paintjob;
                        }
                    }
                }
            }
            this.hoveringOverModSlots = null;
            final String[] text = { "Barrel", "Scope", "Stock", "Grip", "Gadget", "Slide", "Pump", "Accessory" };
            final boolean[] allowBools = { gunType.allowBarrelAttachments, gunType.allowScopeAttachments, gunType.allowStockAttachments, gunType.allowGripAttachments, gunType.allowGadgetAttachments, gunType.allowSlideAttachments, gunType.allowPumpAttachments, gunType.allowAccessoryAttachments };
            for (int a = 0; a < allowBools.length; ++a) {
                final int slotX2 = 16 + a * 18;
                final int slotY2 = 88;
                if (mouseXInGUI >= slotX2 && mouseXInGUI < slotX2 + 18 && mouseYInGUI >= slotY2 && mouseYInGUI < slotY2 + 18 && !this.field_147002_h.func_75139_a(a + 1).func_75216_d() && allowBools[a]) {
                    this.hoveringOverModSlots = text[a];
                }
            }
        }
    }
    
    protected void func_73864_a(final int x, final int y, final int button) {
        final int xOrigin = (this.field_146294_l - this.field_146999_f) / 2;
        final int yOrigin = (this.field_146295_m - this.field_147000_g) / 2;
        super.func_73864_a(x, y, button);
        final int m = x - xOrigin;
        final int n = y - yOrigin;
        if ((button == 0 || button == 1) && m >= 146 && m <= 165 && n >= 63 && n <= 72) {
            if (!this.flipGunModel) {
                this.flipGunModel = true;
            }
            else {
                this.flipGunModel = false;
            }
        }
        if (button != 0) {
            return;
        }
        if (this.hoveringOver == null) {
            return;
        }
        FlansMod.getPacketHandler().sendToServer(new PacketGunPaint(this.hoveringOver.ID));
        ((ContainerGunModTable)this.field_147002_h).clickPaintjob(this.hoveringOver);
    }
    
    public static float roundFloat(final float value, final int points) {
        int pow = 10;
        for (int i = 1; i < points; ++i) {
            pow *= 10;
        }
        final float result = value * pow;
        return (int)((result - (int)result >= 0.5f) ? (result + 1.0f) : result) / (float)pow;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/gunTableNew.png");
        rand = new Random();
    }
}
