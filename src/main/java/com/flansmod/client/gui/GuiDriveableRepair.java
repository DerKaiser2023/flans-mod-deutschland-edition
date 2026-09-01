// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.driveables.EnumDriveablePart;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.GuiButton;
import java.util.Iterator;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.renderer.entity.RenderItem;
import com.flansmod.common.driveables.DriveablePart;
import java.util.ArrayList;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiDriveableRepair extends GuiScreen
{
    private static final ResourceLocation texture;
    private EntityPlayer driver;
    private EntityDriveable driving;
    private ArrayList<DriveablePart> partsToDraw;
    private static RenderItem itemRenderer;
    private int guiOriginX;
    private int guiOriginY;
    private int scroll;
    private boolean canScroll;
    
    public GuiDriveableRepair(final EntityPlayer player) {
        this.partsToDraw = new ArrayList<DriveablePart>();
        this.scroll = 0;
        this.canScroll = false;
        this.driver = player;
        this.driving = ((EntitySeat)player.field_70154_o).driveable;
        for (final DriveablePart part : this.driving.getDriveableData().parts.values()) {
            if (part.maxHealth > 0) {
                this.partsToDraw.add(part);
            }
        }
    }
    
    public void func_73866_w_() {
        super.func_73866_w_();
        for (int i = 0; i < this.partsToDraw.size(); ++i) {
            this.field_146292_n.add(new GuiButton(i, 0, 0, 45, 20, "Repair"));
        }
    }
    
    protected void func_146284_a(final GuiButton button) {
        FlansMod.proxy.repairDriveable(this.driver, this.driving, this.partsToDraw.get(button.field_146127_k));
        if (this.scroll > 0) {
            --this.scroll;
        }
    }
    
    private void updateButtons(final int maxAllowableY) {
        int y = 43;
        for (int i = 0; i < this.partsToDraw.size(); ++i) {
            final DriveablePart part = this.partsToDraw.get(i);
            final GuiButton button = this.field_146292_n.get(i);
            button.field_146128_h = this.guiOriginX + 9;
            button.field_146129_i = this.guiOriginY + y;
            if (i >= this.scroll) {
                y += ((part.health <= 0) ? 40 : 20);
            }
            button.field_146125_m = (part.health <= 0 && button.field_146129_i - this.guiOriginY + 8 < maxAllowableY && i >= this.scroll);
        }
    }
    
    public void func_73863_a(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.field_146297_k, this.field_146297_k.field_71443_c, this.field_146297_k.field_71440_d);
        final int w = scaledresolution.func_78326_a();
        final int h = scaledresolution.func_78328_b();
        final int guiWidth = 202;
        int guiAllowedHeight = 31;
        int guiNeededHeight = 31;
        for (final DriveablePart part : this.partsToDraw) {
            if (guiAllowedHeight + ((part.health <= 0) ? 40 : 20) < h) {
                guiAllowedHeight += ((part.health <= 0) ? 40 : 20);
            }
            guiNeededHeight += ((part.health <= 0) ? 40 : 20);
        }
        this.updateButtons(guiAllowedHeight);
        this.func_146276_q_();
        GL11.glEnable(3042);
        this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableRepair.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.guiOriginX = w / 2 - guiWidth / 2;
        this.guiOriginY = h / 2 - guiAllowedHeight / 2;
        this.func_73729_b(this.guiOriginX, this.guiOriginY, 0, 0, 202, 23);
        this.func_73731_b(this.field_146289_q, this.driving.getDriveableType().name + " - Repair", this.guiOriginX + 7, this.guiOriginY + 7, 16777215);
        final int buttonIndex = 0;
        int y = 23;
        int partIndex = 0;
        this.canScroll = false;
        for (final DriveablePart part2 : this.partsToDraw) {
            final boolean broken = part2.health <= 0;
            if (y + (broken ? 40 : 20) + 8 <= guiAllowedHeight && partIndex >= this.scroll) {
                this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableRepair.texture);
                this.func_73729_b(this.guiOriginX, this.guiOriginY + y, 0, 24, 202, broken ? 40 : 20);
                final float percentHealth = part2.health / (float)part2.maxHealth;
                GL11.glColor3f(1.0f - percentHealth, percentHealth, 0.0f);
                this.func_73729_b(this.guiOriginX + 111, this.guiOriginY + y + 2, 0, 73, (int)(70.0f * percentHealth), 16);
                if (part2.armor > 1) {
                    this.func_73731_b(this.field_146289_q, part2.type.getName() + ": " + part2.armor + "mm", this.guiOriginX + 10, this.guiOriginY + y + 6, 16777215);
                }
                else if (part2.armor == 1) {
                    this.func_73731_b(this.field_146289_q, part2.type.getName(), this.guiOriginX + 10, this.guiOriginY + y + 6, 16777215);
                }
                this.func_73732_a(this.field_146289_q, (int)(percentHealth * 100.0f) + "%", this.guiOriginX + 158, this.guiOriginY + y + 6, 16777215);
                if (broken && part2.type != EnumDriveablePart.frontalArmor) {
                    final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
                    temporaryInventory.func_70455_b(this.driver.field_71071_by);
                    final ArrayList<ItemStack> stacksNeeded = this.driving.getDriveableType().getItemsRequired(part2, this.driving.getDriveableData().engine);
                    for (int n = 0; n < 7; ++n) {
                        final int stackNum = n + FlansMod.ticker / 60 % Math.max(1, stacksNeeded.size() - 6);
                        if (stackNum < stacksNeeded.size()) {
                            final ItemStack stackNeeded = stacksNeeded.get(stackNum);
                            int totalAmountFound = 0;
                            for (int m = 0; m < temporaryInventory.func_70302_i_(); ++m) {
                                ItemStack stackInSlot = temporaryInventory.func_70301_a(m);
                                if (stackInSlot != null && stackInSlot.func_77973_b() == stackNeeded.func_77973_b() && stackInSlot.func_77960_j() == stackNeeded.func_77960_j()) {
                                    final int amountFound = Math.min(stackInSlot.field_77994_a, stackNeeded.field_77994_a - totalAmountFound);
                                    final ItemStack itemStack = stackInSlot;
                                    itemStack.field_77994_a -= amountFound;
                                    if (stackInSlot.field_77994_a <= 0) {
                                        stackInSlot = null;
                                    }
                                    temporaryInventory.func_70299_a(m, stackInSlot);
                                    totalAmountFound += amountFound;
                                    if (totalAmountFound == stackNeeded.field_77994_a) {
                                        break;
                                    }
                                }
                            }
                            if (totalAmountFound < stackNeeded.field_77994_a) {
                                this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableRepair.texture);
                                this.func_73729_b(this.guiOriginX + 57 + 18 * n, this.guiOriginY + y + 22, 202, 0, 16, 16);
                            }
                            this.drawSlotInventory(stacksNeeded.get(stackNum), this.guiOriginX + 57 + 18 * n, this.guiOriginY + y + 22);
                        }
                    }
                }
                y += (broken ? 40 : 20);
            }
            else if (partIndex >= this.scroll) {
                this.canScroll = true;
            }
            ++partIndex;
        }
        if (guiNeededHeight > guiAllowedHeight) {
            this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableRepair.texture);
            this.func_73729_b(this.guiOriginX + 184, this.guiOriginY + 23, 206, 24, 18, 40);
            final int spacing = 12;
            this.func_73732_a(this.field_146289_q, Integer.toString(this.scroll + 1), this.guiOriginX + 192, this.guiOriginY + 73, 16777215);
            this.func_73732_a(this.field_146289_q, "/", this.guiOriginX + 192, this.guiOriginY + 73 + spacing, 16777215);
            this.func_73732_a(this.field_146289_q, Integer.toString(this.getMaxScroll((float)guiAllowedHeight)), this.guiOriginX + 192, this.guiOriginY + 73 + spacing * 2, 16777215);
        }
        this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableRepair.texture);
        this.func_73729_b(this.guiOriginX, this.guiOriginY + y, 0, 65, 202, 8);
        super.func_73863_a(i, j, f);
    }
    
    protected void func_73864_a(final int i, final int j, final int k) {
        super.func_73864_a(i, j, k);
        final int m = i - this.guiOriginX;
        final int n = j - this.guiOriginY;
        if (m > 185 && m < 195 && n > 5 && n < 15) {
            if (this.driving instanceof EntityMecha) {
                FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(4));
                this.driver.openGui((Object)FlansMod.INSTANCE, 10, this.driver.field_70170_p, this.driving.field_70176_ah, this.driving.field_70162_ai, this.driving.field_70164_aj);
            }
            else {
                this.field_146297_k.func_147108_a((GuiScreen)new GuiDriveableMenu(this.driver.field_71071_by, this.driver.field_70170_p, this.driving));
            }
        }
        else if (m > 189 && m < 199 && n > 32 && n < 42 && this.scroll > 0) {
            --this.scroll;
        }
        else if (m > 189 && m < 199 && n > 44 && n < 54 && this.canScroll) {
            ++this.scroll;
        }
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.func_77973_b() == null) {
            return;
        }
        GuiDriveableRepair.itemRenderer.func_77015_a(this.field_146289_q, this.field_146297_k.field_71446_o, itemstack, i, j);
        GuiDriveableRepair.itemRenderer.func_77021_b(this.field_146289_q, this.field_146297_k.field_71446_o, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    private int getMaxScroll(final float h) {
        int lScroll = 0;
        int counter = 0;
        while (counter < this.partsToDraw.size()) {
            int y = 0;
            counter = 0;
            for (final DriveablePart part : this.partsToDraw) {
                if (y + ((part.health <= 0) ? 40 : 20) <= h - 31.0f && counter >= lScroll) {
                    y += ((part.health <= 0) ? 40 : 20);
                    ++counter;
                }
                else {
                    if (counter >= lScroll) {
                        continue;
                    }
                    ++counter;
                }
            }
            ++lScroll;
        }
        return lScroll;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/repair.png");
        GuiDriveableRepair.itemRenderer = new RenderItem();
    }
}
