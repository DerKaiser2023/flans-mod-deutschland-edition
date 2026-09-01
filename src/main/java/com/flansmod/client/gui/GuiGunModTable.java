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
        this.xSize = 331;
        this.ySize = 236;
    }
    
    protected void drawGuiContainerForegroundLayer(final int x, final int y) {
        this.fontRendererObj.drawString("Gun Modification Table", 6, 6, 4210752);
        this.fontRendererObj.drawString("Inventory", 7, 142, 4210752);
        this.fontRendererObj.drawString("Gun Information", 179, 22, 4210752);
        this.fontRendererObj.drawString("Paintjobs", 179, 128, 4210752);
        final ItemStack gunStack = this.inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.getItem()).type;
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
                RenderHelper.enableStandardItemLighting();
                GL11.glScalef(-60.0f, 60.0f, 60.0f);
                ClientProxy.gunRenderer.renderGun(gunStack, gunType, 0.0625f, gunType.model, GunAnimations.defaults, 0.0f, IItemRenderer.ItemRenderType.ENTITY);
                GL11.glPopMatrix();
            }
            if (gunStack.getDisplayName() != null) {
                this.fontRendererObj.drawString(gunStack.getDisplayName(), 207, 36, 4210752);
            }
            this.fontRendererObj.drawString(gunType.description, 207, 46, 4210752);
            this.fontRendererObj.drawString("Damage", 181, 61, 4210752);
            this.fontRendererObj.drawString("Accuracy", 181, 73, 4210752);
            this.fontRendererObj.drawString("Recoil", 181, 85, 4210752);
            this.fontRendererObj.drawString("Reload", 181, 97, 4210752);
            this.fontRendererObj.drawString(String.valueOf(roundFloat(gunType.getDamage(gunStack), 2)), 241, 62, 4210752);
            this.fontRendererObj.drawString(String.valueOf(gunType.getSpread(gunStack, false, false)), 241, 74, 4210752);
            this.fontRendererObj.drawString(String.valueOf(roundFloat(gunType.getRecoilPitch(gunStack), 2)), 241, 86, 4210752);
            this.fontRendererObj.drawString(String.valueOf(roundFloat((float)(reloadt / 20), 2)) + "s", 241, 98, 4210752);
            if (this.hoveringOverModSlots != null) {
                this.drawHoveringText((List)Collections.singletonList(this.hoveringOverModSlots), this.mouseX - this.guiLeft, this.mouseY - this.guiTop, this.fontRendererObj);
            }
        }
    }
    
    protected void drawGuiContainerBackgroundLayer(final float f, final int i, final int j) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        final int xOrigin = (this.width - this.xSize) / 2;
        final int yOrigin = (this.height - this.ySize) / 2;
        this.mc.renderEngine.bindTexture(GuiGunModTable.texture);
        this.drawTexturedModalRect(xOrigin, yOrigin, 0, 0, this.xSize, this.ySize);
        for (int z = 1; z < 17; ++z) {
            this.inventorySlots.getSlot(z).yDisplayPosition = -1000;
        }
        final ItemStack gunStack = this.inventorySlots.getSlot(0).getStack();
        if (gunStack == null) {
            this.lastStats = new int[] { 0, 0, 0, 0 };
        }
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.getItem()).type;
            final boolean[] allowBools = { gunType.allowBarrelAttachments, gunType.allowScopeAttachments, gunType.allowStockAttachments, gunType.allowGripAttachments, gunType.allowGadgetAttachments, gunType.allowSlideAttachments, gunType.allowPumpAttachments, gunType.allowAccessoryAttachments };
            final int reloadt = Math.round(gunType.getReloadTime(gunStack));
            this.drawTexturedModalRect(xOrigin + 146, yOrigin + 63, 340, 166, 20, 10);
            for (int m = 0; m < allowBools.length; ++m) {
                if (allowBools[m]) {
                    this.drawTexturedModalRect(xOrigin + 16 + m * 18, yOrigin + 88, 340 + m * 18, 136, 18, 18);
                    this.inventorySlots.getSlot(m + 1).yDisplayPosition = 89;
                }
            }
            for (int x = 0; x < 8; ++x) {
                if (x < gunType.numGenericAttachmentSlots) {
                    this.drawTexturedModalRect(xOrigin + 16 + 18 * x, yOrigin + 114, 340, 100, 18, 18);
                    this.inventorySlots.getSlot(allowBools.length + 1 + x).yDisplayPosition = 115;
                }
            }
            final int[] stats = { Math.round(gunType.getDamage(gunStack)) * 4, Math.round(gunType.getSpread(gunStack, false, false)) * 4, Math.round(gunType.getRecoilPitch(gunStack)) * 4, reloadt / 20 * 8 };
            this.displayGunValues(stats);
            final int numPaintjobs = gunType.paintjobs.size();
            final int numRows = numPaintjobs / 2 + 1;
            for (int y = 0; y < numRows; ++y) {
                for (int x2 = 0; x2 < 2; ++x2) {
                    if (2 * y + x2 < numPaintjobs) {
                        this.drawTexturedModalRect(xOrigin + 181 + 18 * x2, yOrigin + 150 + 18 * y, 340, 100, 18, 18);
                    }
                }
            }
            for (int y = 0; y < numRows; ++y) {
                for (int x2 = 0; x2 < 2; ++x2) {
                    if (2 * y + x2 < numPaintjobs) {
                        final Paintjob paintjob = gunType.paintjobs.get(2 * y + x2);
                        final ItemStack stack = gunStack.copy();
                        stack.setMetadata(paintjob.ID);
                        GuiGunModTable.itemRender.renderItemIntoGUI(this.mc.fontRendererObj, this.mc.getTextureManager(), stack, xOrigin + 182 + x2 * 18, yOrigin + 151 + y * 18);
                    }
                }
            }
        }
        if (this.hoveringOver != null) {
            final int numDyes = this.hoveringOver.dyesNeeded.length;
            if (numDyes != 0 && !this.inventory.player.capabilities.isCreativeMode) {
                final boolean[] haveDyes = new boolean[numDyes];
                for (int n = 0; n < numDyes; ++n) {
                    int amountNeeded = this.hoveringOver.dyesNeeded[n].stackSize;
                    for (int s = 0; s < this.inventory.getSizeInventory(); ++s) {
                        final ItemStack stack2 = this.inventory.getStackInSlot(s);
                        if (stack2 != null && stack2.getItem() == Items.dye && stack2.getMetadata() == this.hoveringOver.dyesNeeded[n].getMetadata()) {
                            amountNeeded -= stack2.stackSize;
                        }
                    }
                    if (amountNeeded <= 0) {
                        haveDyes[n] = true;
                    }
                }
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(2896);
                this.mc.renderEngine.bindTexture(GuiGunModTable.texture);
                for (int s2 = 0; s2 < numDyes; ++s2) {
                    this.drawTexturedModalRect(xOrigin + 223 + 18 * s2, yOrigin + 150, haveDyes[s2] ? 358 : 340, 118, 18, 18);
                }
                for (int s2 = 0; s2 < numDyes; ++s2) {
                    GuiGunModTable.itemRender.renderItemIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), this.hoveringOver.dyesNeeded[s2], xOrigin + 224 + s2 * 18, yOrigin + 151);
                    GuiGunModTable.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), this.hoveringOver.dyesNeeded[s2], xOrigin + 224 + s2 * 18, yOrigin + 151);
                }
            }
        }
    }
    
    public void displayGunValues(final int[] stats) {
        final int xOrigin = (this.width - this.xSize) / 2;
        final int yOrigin = (this.height - this.ySize) / 2;
        for (int y = 0; y < 4; ++y) {
            this.drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + 12 * y, 340, 80, 80, 10);
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
                this.drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + 12 * k, 340, 90, finalWidth, 10);
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
                this.drawTexturedModalRect(xOrigin + 239, yOrigin + 60 + 12 * k, 340, 90, finalWidth, 10);
            }
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
        this.hoveringOver = null;
        final ItemStack gunStack = this.inventorySlots.getSlot(0).getStack();
        if (gunStack != null && gunStack.getItem() instanceof ItemGun) {
            final GunType gunType = ((ItemGun)gunStack.getItem()).type;
            final int numPaintjobs = gunType.paintjobs.size();
            for (int numRows = numPaintjobs / 2 + 1, j = 0; j < numRows; ++j) {
                for (int i = 0; i < 2; ++i) {
                    if (2 * j + i < numPaintjobs) {
                        final Paintjob paintjob = gunType.paintjobs.get(2 * j + i);
                        final ItemStack stack = gunStack.copy();
                        stack.stackTagCompound.setString("Paint", paintjob.iconName);
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
                if (mouseXInGUI >= slotX2 && mouseXInGUI < slotX2 + 18 && mouseYInGUI >= slotY2 && mouseYInGUI < slotY2 + 18 && !this.inventorySlots.getSlot(a + 1).getHasStack() && allowBools[a]) {
                    this.hoveringOverModSlots = text[a];
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
        ((ContainerGunModTable)this.inventorySlots).clickPaintjob(this.hoveringOver);
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
