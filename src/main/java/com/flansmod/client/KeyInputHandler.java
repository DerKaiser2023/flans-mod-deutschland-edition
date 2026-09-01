// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.api.IControllable;
import org.lwjgl.input.Keyboard;
import com.flansmod.common.network.PacketRequestDebug;
import com.flansmod.common.network.PacketBolterino;
import com.flansmod.common.network.PacketGunMode;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketReload;
import com.flansmod.common.FlansMod;
import com.flansmod.client.gui.GuiTeamScores;
import net.minecraft.client.gui.GuiScreen;
import com.flansmod.client.gui.GuiTeamSelect;
import net.minecraft.client.gui.GuiChat;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class KeyInputHandler
{
    public static KeyBinding downKey;
    public static KeyBinding inventoryKey;
    public static KeyBinding gunKey;
    public static KeyBinding controlSwitchKey;
    public static KeyBinding bombKey;
    public static KeyBinding reloadKey;
    public static KeyBinding gunModeKey;
    public static KeyBinding teamsMenuKey;
    public static KeyBinding teamsScoresKey;
    public static KeyBinding leftRollKey;
    public static KeyBinding rightRollKey;
    public static KeyBinding gearKey;
    public static KeyBinding doorKey;
    public static KeyBinding modeKey;
    public static KeyBinding flareKey;
    public static KeyBinding trimKey;
    public static KeyBinding debugKey;
    public static KeyBinding reloadModelsKey;
    public static KeyBinding secondaryKey;
    public static KeyBinding nintendoSwitch;
    public static KeyBinding s0;
    public static KeyBinding s1;
    public static KeyBinding s2;
    public static KeyBinding s3;
    public static KeyBinding s4;
    public static KeyBinding s5;
    public static KeyBinding s6;
    public static KeyBinding s7;
    public static KeyBinding s8;
    public static KeyBinding s9;
    public static KeyBinding eject;
    public static KeyBinding openBorders;
    public static KeyBinding bolterino;
    public static KeyBinding thermal;
    public static KeyBinding artilleryMode;
    public static KeyBinding repairKey;
    public static KeyBinding activeRadar;
    public static KeyBinding switchWeapon;
    public static KeyBinding missileUp;
    public static KeyBinding missileDown;
    public static KeyBinding missileLeft;
    public static KeyBinding missileRight;
    Minecraft mc;
    
    public KeyInputHandler() {
        ClientRegistry.registerKeyBinding(KeyInputHandler.downKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.inventoryKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.gunKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.controlSwitchKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.bombKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.reloadKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.gunModeKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.teamsMenuKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.teamsScoresKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.leftRollKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.rightRollKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.gearKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.doorKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.trimKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.modeKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.flareKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.debugKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.reloadModelsKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.secondaryKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.nintendoSwitch);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s0);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s1);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s2);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s3);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s4);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s5);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s6);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s7);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s8);
        ClientRegistry.registerKeyBinding(KeyInputHandler.s9);
        ClientRegistry.registerKeyBinding(KeyInputHandler.eject);
        ClientRegistry.registerKeyBinding(KeyInputHandler.openBorders);
        ClientRegistry.registerKeyBinding(KeyInputHandler.thermal);
        ClientRegistry.registerKeyBinding(KeyInputHandler.artilleryMode);
        ClientRegistry.registerKeyBinding(KeyInputHandler.bolterino);
        ClientRegistry.registerKeyBinding(KeyInputHandler.repairKey);
        ClientRegistry.registerKeyBinding(KeyInputHandler.activeRadar);
        ClientRegistry.registerKeyBinding(KeyInputHandler.switchWeapon);
        ClientRegistry.registerKeyBinding(KeyInputHandler.missileUp);
        ClientRegistry.registerKeyBinding(KeyInputHandler.missileDown);
        ClientRegistry.registerKeyBinding(KeyInputHandler.missileLeft);
        ClientRegistry.registerKeyBinding(KeyInputHandler.missileRight);
        this.mc = Minecraft.getMinecraft();
    }
    
    @SubscribeEvent
    public void onKeyInput(final InputEvent.KeyInputEvent event) {
        if (FMLClientHandler.instance().isGUIOpen((Class)GuiChat.class) || this.mc.currentScreen != null) {
            return;
        }
        final EntityPlayer player = (EntityPlayer)this.mc.thePlayer;
        final Entity ridingEntity = player.ridingEntity;
        if (KeyInputHandler.teamsMenuKey.isPressed()) {
            this.mc.displayGuiScreen((GuiScreen)new GuiTeamSelect());
            return;
        }
        if (KeyInputHandler.teamsScoresKey.isPressed()) {
            this.mc.displayGuiScreen((GuiScreen)new GuiTeamScores());
            return;
        }
        if (KeyInputHandler.reloadKey.isPressed() && FlansModClient.shootTime(false) <= 0.0f) {
            FlansMod.getPacketHandler().sendToServer(new PacketReload(false));
            return;
        }
        if (KeyInputHandler.gunModeKey.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(1));
            return;
        }
        if (KeyInputHandler.bolterino.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketBolterino(true));
            return;
        }
        if (KeyInputHandler.secondaryKey.isPressed()) {
            FlansMod.getPacketHandler().sendToServer(new PacketGunMode(2));
            return;
        }
        if (KeyInputHandler.debugKey.isPressed()) {
            if (FlansMod.DEBUG) {
                FlansMod.DEBUG = false;
            }
            else {
                FlansMod.packetHandler.sendToServer(new PacketRequestDebug());
            }
        }
        if (KeyInputHandler.reloadModelsKey.isPressed()) {
            FlansModClient.reloadModels(Keyboard.isKeyDown(42));
        }
        if (ridingEntity instanceof IControllable) {
            final IControllable riding = (IControllable)ridingEntity;
            if (this.mc.gameSettings.keyBindForward.isPressed()) {
                riding.pressKey(0, player);
            }
            if (this.mc.gameSettings.keyBindBack.isPressed()) {
                riding.pressKey(1, player);
            }
            if (this.mc.gameSettings.keyBindLeft.isPressed()) {
                riding.pressKey(2, player);
            }
            if (this.mc.gameSettings.keyBindRight.isPressed()) {
                riding.pressKey(3, player);
            }
            if (this.mc.gameSettings.keyBindJump.isPressed()) {
                riding.pressKey(4, player);
            }
            if (KeyInputHandler.downKey.isPressed()) {
                riding.pressKey(5, player);
            }
            if (this.mc.gameSettings.keyBindSneak.isPressed()) {
                riding.pressKey(6, player);
            }
            if (this.mc.gameSettings.keyBindInventory.isPressed() || KeyInputHandler.inventoryKey.isPressed()) {
                riding.pressKey(7, player);
            }
            if (KeyInputHandler.bombKey.isPressed()) {
                riding.pressKey(8, player);
            }
            if (KeyInputHandler.gunKey.isPressed()) {
                riding.pressKey(9, player);
            }
            if (KeyInputHandler.controlSwitchKey.isPressed()) {
                riding.pressKey(10, player);
            }
            if (KeyInputHandler.leftRollKey.isPressed()) {
                riding.pressKey(11, player);
            }
            if (KeyInputHandler.rightRollKey.isPressed()) {
                riding.pressKey(12, player);
            }
            if (KeyInputHandler.gearKey.isPressed()) {
                riding.pressKey(13, player);
            }
            if (KeyInputHandler.doorKey.isPressed()) {
                riding.pressKey(14, player);
            }
            if (KeyInputHandler.modeKey.isPressed()) {
                riding.pressKey(15, player);
            }
            if (KeyInputHandler.trimKey.isPressed()) {
                riding.pressKey(16, player);
            }
            if (KeyInputHandler.flareKey.isPressed()) {
                riding.pressKey(18, player);
            }
            if (KeyInputHandler.nintendoSwitch.isPressed()) {
                riding.pressKey(19, player);
            }
            if (KeyInputHandler.s0.isPressed()) {
                riding.pressKey(20, player);
            }
            if (KeyInputHandler.s1.isPressed()) {
                riding.pressKey(21, player);
            }
            if (KeyInputHandler.s2.isPressed()) {
                riding.pressKey(22, player);
            }
            if (KeyInputHandler.s3.isPressed()) {
                riding.pressKey(23, player);
            }
            if (KeyInputHandler.s4.isPressed()) {
                riding.pressKey(24, player);
            }
            if (KeyInputHandler.s5.isPressed()) {
                riding.pressKey(25, player);
            }
            if (KeyInputHandler.s6.isPressed()) {
                riding.pressKey(26, player);
            }
            if (KeyInputHandler.s7.isPressed()) {
                riding.pressKey(27, player);
            }
            if (KeyInputHandler.s8.isPressed()) {
                riding.pressKey(28, player);
            }
            if (KeyInputHandler.s9.isPressed()) {
                riding.pressKey(29, player);
            }
            if (KeyInputHandler.eject.isPressed()) {
                riding.pressKey(30, player);
            }
            if (KeyInputHandler.openBorders.isPressed()) {
                riding.pressKey(31, player);
            }
            if (KeyInputHandler.thermal.isPressed()) {
                riding.pressKey(32, player);
            }
            if (KeyInputHandler.artilleryMode.isPressed()) {
                riding.pressKey(33, player);
            }
            if (KeyInputHandler.repairKey.isPressed()) {
                riding.pressKey(34, player);
            }
            if (KeyInputHandler.activeRadar.isPressed()) {
                riding.pressKey(35, player);
            }
            if (KeyInputHandler.switchWeapon.isPressed()) {
                riding.pressKey(36, player);
            }
            if (KeyInputHandler.missileUp.isPressed()) {
                riding.pressKey(37, player);
            }
            if (KeyInputHandler.missileDown.isPressed()) {
                riding.pressKey(38, player);
            }
            if (KeyInputHandler.missileLeft.isPressed()) {
                riding.pressKey(39, player);
            }
            if (KeyInputHandler.missileRight.isPressed()) {
                riding.pressKey(40, player);
            }
        }
    }
    
    static {
        KeyInputHandler.downKey = new KeyBinding("Down key / Gunsight", 29, "Flan's Mod");
        KeyInputHandler.inventoryKey = new KeyBinding("Inventory key", 19, "Flan's Mod");
        KeyInputHandler.gunKey = new KeyBinding("Docking Key", 34, "Flan's Mod");
        KeyInputHandler.controlSwitchKey = new KeyBinding("Surface key / Control Switch key", 46, "Flan's Mod");
        KeyInputHandler.bombKey = new KeyBinding("Undocking Key", 36, "Flan's Mod");
        KeyInputHandler.reloadKey = new KeyBinding("Reload key", 19, "Flan's Mod");
        KeyInputHandler.gunModeKey = new KeyBinding("Gun Mode", 33, "Flan's Mod");
        KeyInputHandler.teamsMenuKey = new KeyBinding("Teams Menu Key", 34, "Flan's Mod");
        KeyInputHandler.teamsScoresKey = new KeyBinding("Teams Scores Key", 35, "Flan's Mod");
        KeyInputHandler.leftRollKey = new KeyBinding("Roll Left / Turret Lock", 44, "Flan's Mod");
        KeyInputHandler.rightRollKey = new KeyBinding("Roll Right / Turret Unlock", 45, "Flan's Mod");
        KeyInputHandler.gearKey = new KeyBinding("Gear Up / Down Key / Manual Pitch Down", 38, "Flan's Mod");
        KeyInputHandler.doorKey = new KeyBinding("Radar Range / Door Toggle Key", 37, "Flan's Mod");
        KeyInputHandler.modeKey = new KeyBinding("Dive Key / VTOL / Manual Pitch Up", 47, "Flan's Mod");
        KeyInputHandler.flareKey = new KeyBinding("Flare Key / Ship Repair", 49, "Flan's Mod");
        KeyInputHandler.trimKey = new KeyBinding("Afterburner / WEP Key", 33, "Flan's Mod");
        KeyInputHandler.debugKey = new KeyBinding("Debug Key", 68, "Flan's Mod");
        KeyInputHandler.reloadModelsKey = new KeyBinding("Reload Models Key", 67, "Flan's Mod");
        KeyInputHandler.secondaryKey = new KeyBinding("Select Gun Underbarrel", 37, "Flan's Mod");
        KeyInputHandler.nintendoSwitch = new KeyBinding("Bombsight Toggle", 33, "Flan's Mod");
        KeyInputHandler.s0 = new KeyBinding("Driver Seat", 11, "Flan's Mod");
        KeyInputHandler.s1 = new KeyBinding("Passenger Gun 1", 2, "Flan's Mod");
        KeyInputHandler.s2 = new KeyBinding("Passenger Gun 2", 3, "Flan's Mod");
        KeyInputHandler.s3 = new KeyBinding("Passenger Gun 3", 4, "Flan's Mod");
        KeyInputHandler.s4 = new KeyBinding("Passenger Gun 4", 5, "Flan's Mod");
        KeyInputHandler.s5 = new KeyBinding("Passenger Gun 5", 6, "Flan's Mod");
        KeyInputHandler.s6 = new KeyBinding("Passenger Gun 6", 7, "Flan's Mod");
        KeyInputHandler.s7 = new KeyBinding("Passenger Gun 7", 8, "Flan's Mod");
        KeyInputHandler.s8 = new KeyBinding("Passenger Gun 8", 9, "Flan's Mod");
        KeyInputHandler.s9 = new KeyBinding("Passenger Gun 9", 10, "Flan's Mod");
        KeyInputHandler.eject = new KeyBinding("Fire Passenger Guns", 24, "Flan's Mod");
        KeyInputHandler.openBorders = new KeyBinding("Evict/Allow Passengers", 25, "Flan's Mod");
        KeyInputHandler.bolterino = new KeyBinding("Manual Gun Loading", 46, "Flan's Mod");
        KeyInputHandler.thermal = new KeyBinding("Thermal / Night Sight", 21, "Flan's Mod");
        KeyInputHandler.artilleryMode = new KeyBinding("Magic Camera", 22, "Flan's Mod");
        KeyInputHandler.repairKey = new KeyBinding("Repair Key", 23, "Flan's Mod");
        KeyInputHandler.activeRadar = new KeyBinding("Active Radar Toggle", 66, "Flan's Mod");
        KeyInputHandler.switchWeapon = new KeyBinding("Ammo Switch", 48, "Flan's Mod");
        KeyInputHandler.missileUp = new KeyBinding("Missile Up", 200, "Flan's Mod");
        KeyInputHandler.missileDown = new KeyBinding("Missile Down", 208, "Flan's Mod");
        KeyInputHandler.missileLeft = new KeyBinding("Missile Left", 203, "Flan's Mod");
        KeyInputHandler.missileRight = new KeyBinding("Missile Right", 205, "Flan's Mod");
    }
}
