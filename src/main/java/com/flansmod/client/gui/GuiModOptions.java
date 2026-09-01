// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import com.flansmod.client.FlanMouseButton;
import com.flansmod.client.AimType;
import net.minecraft.client.gui.GuiButton;
import com.flansmod.client.FlansModClient;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;

public class GuiModOptions extends GuiScreen
{
    public void initGui() {
        this.addButtons(0, 0);
    }
    
    public void drawScreen(final int var1, final int var2, final float var3) {
        this.drawWorldBackground(0);
        final FontRenderer fontRenderer = this.mc.fontRendererObj;
        fontRenderer.drawStringWithShadow("Flan's Options", this.width / 2 - fontRenderer.getStringWidth("Flan's Options") / 2, 10, 16777215);
        super.drawScreen(var1, var2, var3);
    }
    
    private void addButtons(final int var1, final int var2) {
        final FontRenderer fontRenderer = this.mc.fontRendererObj;
        final int fireButtonWidth = 132;
        this.buttonList.add(new GuiButton(1, this.width / 2 - fireButtonWidth / 2, 60, fireButtonWidth, 20, "Fire Button: " + FlansModClient.fireButton.getName()));
        this.buttonList.add(new GuiButton(2, this.width / 2 - fireButtonWidth / 2, 90, fireButtonWidth, 20, "Aim Button: " + FlansModClient.aimButton.getName()));
        final int aimTypeWidth = fireButtonWidth;
        this.buttonList.add(new GuiButton(0, this.width / 2 - aimTypeWidth / 2, 30, aimTypeWidth, 20, "Aim Type: " + FlansModClient.aimType.getName()));
    }
    
    protected void actionPerformed(final GuiButton button) {
        if (button.id == 0) {
            if (FlansModClient.aimType == AimType.HOLD) {
                FlansModClient.setAimType(AimType.TOGGLE);
            }
            else {
                FlansModClient.setAimType(AimType.HOLD);
            }
            this.buttonList.clear();
            this.addButtons(0, 0);
        }
        if (button.id == 1) {
            if (FlansModClient.fireButton == FlanMouseButton.LEFT) {
                FlansModClient.setFireButton(FlanMouseButton.RIGHT);
            }
            else {
                FlansModClient.setFireButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            this.addButtons(0, 0);
        }
        if (button.id == 2) {
            if (FlansModClient.aimButton == FlanMouseButton.LEFT) {
                FlansModClient.setAimButton(FlanMouseButton.RIGHT);
            }
            else {
                FlansModClient.setAimButton(FlanMouseButton.LEFT);
            }
            this.buttonList.clear();
            this.addButtons(0, 0);
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
}
