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
    
    public void func_73866_w_() {
        if (this.field_146297_k.field_71474_y.field_74320_O == 1 && this.plane != null) {
            this.field_146297_k.field_71451_h = (EntityLivingBase)((this.plane.getCamera() == null) ? this.field_146297_k.field_71439_g : this.plane.getCamera());
        }
    }
    
    public void func_146281_b() {
        this.field_146297_k.field_71417_B.func_74373_b();
        this.field_146297_k.field_71451_h = (EntityLivingBase)this.field_146297_k.field_71439_g;
    }
    
    public void func_146274_d() {
        final EntityPlayer player = (EntityPlayer)this.plane.getControllingEntity();
        if (player != this.field_146297_k.field_71439_g) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            return;
        }
        final int dWheel = Mouse.getDWheel();
        if (dWheel != 0) {
            player.field_71071_by.func_70453_c(dWheel);
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
    
    protected void func_73869_a(final char c, final int i) {
        if (i == 1) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            this.field_146297_k.func_71385_j();
        }
        if (i == 59) {
            this.field_146297_k.field_71474_y.field_74319_N = !this.field_146297_k.field_71474_y.field_74319_N;
        }
        if (i == 61) {
            this.field_146297_k.field_71474_y.field_74330_P = !this.field_146297_k.field_71474_y.field_74330_P;
        }
        if (i == 63) {
            this.field_146297_k.field_71474_y.field_74320_O = (this.field_146297_k.field_71474_y.field_74320_O + 1) % 3;
            if (this.field_146297_k.field_71474_y.field_74320_O == 1) {
                this.field_146297_k.field_71451_h = (EntityLivingBase)((this.plane.getCamera() == null) ? this.field_146297_k.field_71439_g : this.plane.getCamera());
            }
            else {
                this.field_146297_k.field_71451_h = (EntityLivingBase)this.field_146297_k.field_71439_g;
            }
        }
        if (i == 66) {
            this.field_146297_k.field_71474_y.field_74326_T = !this.field_146297_k.field_71474_y.field_74326_T;
        }
        if (i == this.field_146297_k.field_71474_y.field_151445_Q.func_151463_i()) {
            this.field_146297_k.func_147108_a((GuiScreen)new GuiInventory((EntityPlayer)this.field_146297_k.field_71439_g));
        }
        if (i == this.field_146297_k.field_71474_y.field_74316_C.func_151463_i()) {}
        if (i == this.field_146297_k.field_71474_y.field_74310_D.func_151463_i()) {
            this.field_146297_k.func_147108_a((GuiScreen)new GuiChat());
        }
        if (i == this.field_146297_k.field_71474_y.field_74323_J.func_151463_i()) {
            this.field_146297_k.func_147108_a((GuiScreen)new GuiChat("/"));
        }
        if (i == KeyInputHandler.reloadModelsKey.func_151463_i()) {
            FlansModClient.reloadModels(false);
        }
    }
    
    public void func_73876_c() {
        if (this.field_146297_k.field_71474_y.field_74320_O == 1) {
            this.field_146297_k.field_71451_h = (EntityLivingBase)((this.plane.getCamera() == null) ? this.field_146297_k.field_71439_g : this.plane.getCamera());
        }
        else {
            this.field_146297_k.field_71451_h = (EntityLivingBase)this.field_146297_k.field_71439_g;
        }
    }
    
    public void func_146269_k() {
        final EntityPlayer player = (EntityPlayer)this.plane.getControllingEntity();
        if (player != this.field_146297_k.field_71439_g) {
            this.field_146297_k.func_147108_a((GuiScreen)null);
            return;
        }
        if (!Mouse.isGrabbed()) {
            this.field_146297_k.field_71417_B.func_74372_a();
        }
        this.func_146274_d();
        while (Keyboard.next()) {
            this.func_146282_l();
        }
        final int l = Mouse.getDX();
        final int m = Mouse.getDY();
        this.plane.onMouseMoved(l, m);
        if (this.plane != null && !this.plane.isDead() && this.plane.getControllingEntity() != null && this.plane.getControllingEntity() instanceof EntityPlayer) {
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74351_w.func_151463_i())) {
                this.plane.pressKey(0, player);
            }
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74368_y.func_151463_i())) {
                this.plane.pressKey(1, player);
            }
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74370_x.func_151463_i())) {
                this.plane.pressKey(2, player);
            }
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74366_z.func_151463_i())) {
                this.plane.pressKey(3, player);
            }
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74314_A.func_151463_i())) {
                this.plane.pressKey(4, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.downKey.func_151463_i())) {
                this.plane.pressKey(5, player);
            }
            if (FlansMod.proxy.keyDown(this.field_146297_k.field_71474_y.field_74311_E.func_151463_i())) {
                this.plane.pressKey(6, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.inventoryKey.func_151463_i())) {
                this.plane.pressKey(7, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.bombKey.func_151463_i())) {
                this.plane.pressKey(8, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.gunKey.func_151463_i())) {
                this.plane.pressKey(9, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.controlSwitchKey.func_151463_i())) {
                this.plane.pressKey(10, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.leftRollKey.func_151463_i())) {
                this.plane.pressKey(11, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.rightRollKey.func_151463_i())) {
                this.plane.pressKey(12, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.gearKey.func_151463_i())) {
                this.plane.pressKey(13, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.doorKey.func_151463_i())) {
                this.plane.pressKey(14, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.modeKey.func_151463_i())) {
                this.plane.pressKey(15, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.trimKey.func_151463_i())) {
                this.plane.pressKey(16, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.flareKey.func_151463_i())) {
                this.plane.pressKey(18, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.nintendoSwitch.func_151463_i())) {
                this.plane.pressKey(19, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s0.func_151463_i())) {
                this.plane.pressKey(20, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s1.func_151463_i())) {
                this.plane.pressKey(21, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s2.func_151463_i())) {
                this.plane.pressKey(22, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s3.func_151463_i())) {
                this.plane.pressKey(23, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s4.func_151463_i())) {
                this.plane.pressKey(24, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s5.func_151463_i())) {
                this.plane.pressKey(25, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s6.func_151463_i())) {
                this.plane.pressKey(26, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s7.func_151463_i())) {
                this.plane.pressKey(27, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s8.func_151463_i())) {
                this.plane.pressKey(28, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.s9.func_151463_i())) {
                this.plane.pressKey(29, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.thermal.func_151463_i())) {
                this.plane.pressKey(32, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.artilleryMode.func_151463_i())) {
                this.plane.pressKey(33, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.repairKey.func_151463_i())) {
                this.plane.pressKey(34, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.activeRadar.func_151463_i())) {
                this.plane.pressKey(35, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.switchWeapon.func_151463_i())) {
                this.plane.pressKey(36, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileUp.func_151463_i())) {
                this.plane.pressKey(37, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileDown.func_151463_i())) {
                this.plane.pressKey(38, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileLeft.func_151463_i())) {
                this.plane.pressKey(39, player);
            }
            if (FlansMod.proxy.keyDown(KeyInputHandler.missileRight.func_151463_i())) {
                this.plane.pressKey(40, player);
            }
            if (!this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.eject.func_151463_i())) {
                this.getOut = true;
                this.plane.updateKeyHeldState(30, true);
            }
            if (this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.eject.func_151463_i())) {
                this.getOut = false;
                this.plane.updateKeyHeldState(30, false);
            }
            if (!this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.openBorders.func_151463_i())) {
                this.getIn = true;
                this.plane.updateKeyHeldState(31, true);
            }
            if (this.getOut && FlansMod.proxy.keyDown(KeyInputHandler.openBorders.func_151463_i())) {
                this.getIn = false;
                this.plane.updateKeyHeldState(31, false);
            }
        }
        else {
            this.field_146297_k.func_147108_a((GuiScreen)null);
        }
    }
    
    public boolean func_73868_f() {
        return false;
    }
}
