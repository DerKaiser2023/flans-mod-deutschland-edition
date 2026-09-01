// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.entity.EntityLivingBase;
import com.flansmod.common.FlansMod;
import org.lwjgl.input.Keyboard;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.KeyInputHandler;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.inventory.GuiInventory;
import org.lwjgl.input.Mouse;
import net.minecraft.entity.player.EntityPlayer;
import javax.annotation.Nonnull;
import com.flansmod.api.IControllable;
import net.minecraft.client.gui.GuiScreen;

public class GuiDriveableController extends GuiScreen
{
    private IControllable plane;
    private boolean leftMouseHeld;
    private boolean rightMouseHeld;
    private boolean getOut;
    private boolean getIn;
    
    public GuiDriveableController(@Nonnull final IControllable thePlane) {
        this.plane = thePlane;
    }
    
    public void initGui() {
        if (this.mc.gameSettings.thirdPersonView == 1 && this.plane != null) {
            this.mc.renderViewEntity = (EntityLivingBase)((this.plane.getCamera() == null) ? this.mc.thePlayer : this.plane.getCamera());
        }
    }
    
    public void onGuiClosed() {
        this.mc.mouseHelper.ungrabMouseCursor();
        this.mc.renderViewEntity = (EntityLivingBase)this.mc.thePlayer;
    }
    
    public void handleMouseInput() {
        final EntityPlayer player = (EntityPlayer)this.plane.getControllingEntity();
        if (player != this.mc.thePlayer) {
            this.mc.displayGuiScreen((GuiScreen)null);
            return;
        }
        final int dWheel = Mouse.getDWheel();
        if (dWheel != 0) {
            player.inventory.changeCurrentItem(dWheel);
        }
        if (Mouse.isButtonDown(1)) {
            this.plane.pressKey(8, player);
        }
        if (!this.leftMouseHeld && Mouse.isButtonDown(0)) {
            this.leftMouseHeld = true;
            this.plane.updateKeyHeldState(9, true);
        }
        if (this.leftMouseHeld && !Mouse.isButtonDown(0)) {
            this.leftMouseHeld = false;
            this.plane.updateKeyHeldState(9, false);
        }
        if (!this.rightMouseHeld && Mouse.isButtonDown(1)) {
            this.rightMouseHeld = true;
            this.plane.updateKeyHeldState(8, true);
        }
        if (this.rightMouseHeld && !Mouse.isButtonDown(1)) {
            this.rightMouseHeld = false;
            this.plane.updateKeyHeldState(8, false);
        }
    }
    
    protected void keyTyped(final char c, final int i) {
        if (i == 1) {
            this.mc.displayGuiScreen((GuiScreen)null);
            this.mc.displayInGameMenu();
        }
        if (i == 59) {
            this.mc.gameSettings.hideGUI = !this.mc.gameSettings.hideGUI;
        }
        if (i == 61) {
            this.mc.gameSettings.showDebugInfo = !this.mc.gameSettings.showDebugInfo;
        }
        if (i == 63) {
            this.mc.gameSettings.thirdPersonView = (this.mc.gameSettings.thirdPersonView + 1) % 3;
            if (this.mc.gameSettings.thirdPersonView == 1) {
                this.mc.renderViewEntity = (EntityLivingBase)((this.plane.getCamera() == null) ? this.mc.thePlayer : this.plane.getCamera());
            }
            else {
                this.mc.renderViewEntity = (EntityLivingBase)this.mc.thePlayer;
            }
        }
        if (i == 66) {
            this.mc.gameSettings.smoothCamera = !this.mc.gameSettings.smoothCamera;
        }
        if (i == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)new GuiInventory((EntityPlayer)this.mc.thePlayer));
        }
        if (i == this.mc.gameSettings.keyBindDrop.getKeyCode()) {}
        if (i == this.mc.gameSettings.keyBindChat.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)new GuiChat());
        }
        if (i == this.mc.gameSettings.keyBindCommand.getKeyCode()) {
            this.mc.displayGuiScreen((GuiScreen)new GuiChat("/"));
        }
        if (i == KeyInputHandler.reloadModelsKey.getKeyCode()) {
            FlansModClient.reloadModels(false);
        }
    }
    
    public void updateScreen() {
        if (this.mc.gameSettings.thirdPersonView == 1) {
            this.mc.renderViewEntity = (EntityLivingBase)((this.plane.getCamera() == null) ? this.mc.thePlayer : this.plane.getCamera());
        }
        else {
            this.mc.renderViewEntity = (EntityLivingBase)this.mc.thePlayer;
        }
    }
    
    public void handleInput() {
        final EntityPlayer player = (EntityPlayer)this.plane.getControllingEntity();
        if (player != this.mc.thePlayer) {
            this.mc.displayGuiScreen((GuiScreen)null);
            return;
        }
        if (!Mouse.isGrabbed()) {
            this.mc.mouseHelper.grabMouseCursor();
        }
        this.handleMouseInput();
        while (Keyboard.next()) {
            this.handleKeyboardInput();
        }
        final int l = Mouse.getDX();
        final int m = Mouse.getDY();
        this.plane.onMouseMoved(l, m);
        if (this.plane != null && !this.plane.isDead() && this.plane.getControllingEntity() != null && this.plane.getControllingEntity() instanceof EntityPlayer) {
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindForward.getKeyCode())) {
                this.plane.pressKey(0, player);
            }
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindBack.getKeyCode())) {
                this.plane.pressKey(1, player);
            }
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindLeft.getKeyCode())) {
                this.plane.pressKey(2, player);
            }
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindRight.getKeyCode())) {
                this.plane.pressKey(3, player);
            }
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindJump.getKeyCode())) {
                this.plane.pressKey(4, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.downKey.getKeyCode())) {
                this.plane.pressKey(5, player);
            }
            if (FlansMod.proxy.keyDown(this.mc.gameSettings.keyBindSneak.getKeyCode())) {
                this.plane.pressKey(6, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.inventoryKey.getKeyCode())) {
                this.plane.pressKey(7, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.bombKey.getKeyCode())) {
                this.plane.pressKey(8, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.gunKey.getKeyCode())) {
                this.plane.pressKey(9, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.controlSwitchKey.getKeyCode())) {
                this.plane.pressKey(10, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.leftRollKey.getKeyCode())) {
                this.plane.pressKey(11, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.rightRollKey.getKeyCode())) {
                this.plane.pressKey(12, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.gearKey.getKeyCode())) {
                this.plane.pressKey(13, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.doorKey.getKeyCode())) {
                this.plane.pressKey(14, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.modeKey.getKeyCode())) {
                this.plane.pressKey(15, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.trimKey.getKeyCode())) {
                this.plane.pressKey(16, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.flareKey.getKeyCode())) {
                this.plane.pressKey(18, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.nintendoSwitch.getKeyCode())) {
                this.plane.pressKey(19, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s0.getKeyCode())) {
                this.plane.pressKey(20, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s1.getKeyCode())) {
                this.plane.pressKey(21, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s2.getKeyCode())) {
                this.plane.pressKey(22, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s3.getKeyCode())) {
                this.plane.pressKey(23, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s4.getKeyCode())) {
                this.plane.pressKey(24, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s5.getKeyCode())) {
                this.plane.pressKey(25, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s6.getKeyCode())) {
                this.plane.pressKey(26, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s7.getKeyCode())) {
                this.plane.pressKey(27, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s8.getKeyCode())) {
                this.plane.pressKey(28, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s9.getKeyCode())) {
                this.plane.pressKey(29, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.thermal.getKeyCode())) {
                this.plane.pressKey(32, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.artilleryMode.getKeyCode())) {
                this.plane.pressKey(33, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.repairKey.getKeyCode())) {
                this.plane.pressKey(34, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.activeRadar.getKeyCode())) {
                this.plane.pressKey(35, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.switchWeapon.getKeyCode())) {
                this.plane.pressKey(36, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileUp.getKeyCode())) {
                this.plane.pressKey(37, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileDown.getKeyCode())) {
                this.plane.pressKey(38, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileLeft.getKeyCode())) {
                this.plane.pressKey(39, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileRight.getKeyCode())) {
                this.plane.pressKey(40, player);
            }
            if (!this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.eject.getKeyCode())) {
                this.getOut = true;
                this.plane.updateKeyHeldState(30, true);
            }
            if (this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.eject.getKeyCode())) {
                this.getOut = false;
                this.plane.updateKeyHeldState(30, false);
            }
            if (!this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.openBorders.getKeyCode())) {
                this.getIn = true;
                this.plane.updateKeyHeldState(31, true);
            }
            if (this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.openBorders.getKeyCode())) {
                this.getIn = false;
                this.plane.updateKeyHeldState(31, false);
            }
        }
        else {
            this.mc.displayGuiScreen((GuiScreen)null);
        }
    }
    
    public boolean doesGuiPauseGame() {
        return false;
    }
}
