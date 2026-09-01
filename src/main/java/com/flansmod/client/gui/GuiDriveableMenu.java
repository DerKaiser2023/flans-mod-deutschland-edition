// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import org.lwjgl.opengl.GL11;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketDriveableGUI;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.inventory.Container;
import com.flansmod.common.driveables.ContainerDriveableMenu;
import com.flansmod.common.driveables.EntityDriveable;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiDriveableMenu extends GuiContainer
{
    private static final ResourceLocation texture;
    public World world;
    public InventoryPlayer inventory;
    public EntityDriveable entity;
    
    public GuiDriveableMenu(final InventoryPlayer inventoryplayer, final World world1, final EntityDriveable entPlane) {
        super((Container)new ContainerDriveableMenu(inventoryplayer, world1));
        this.entity = entPlane;
        this.field_147000_g = 180;
        this.world = world1;
        this.inventory = inventoryplayer;
    }
    
    public void func_73866_w_() {
        super.func_73866_w_();
        final DriveableType type = this.entity.getDriveableType();
        final GuiButton cargoButton = new GuiButton(0, this.field_146294_l / 2 - 60, this.field_146295_m / 2 - 71, 58, 20, "Cargo");
        cargoButton.field_146124_l = (type.numCargoSlots > 0);
        this.field_146292_n.add(cargoButton);
        final GuiButton gunsButton = new GuiButton(1, this.field_146294_l / 2 + 2, this.field_146295_m / 2 - 71, 58, 20, "Guns");
        gunsButton.field_146124_l = (type.ammoSlots() > 0);
        this.field_146292_n.add(gunsButton);
        final GuiButton fuelButton = new GuiButton(2, this.field_146294_l / 2 - 60, this.field_146295_m / 2 - 49, 58, 20, "Fuel");
        fuelButton.field_146124_l = (type.fuelTankSize > 0);
        this.field_146292_n.add(fuelButton);
        final GuiButton missileButton = new GuiButton(3, this.field_146294_l / 2 + 2, this.field_146295_m / 2 - 49, 58, 20, this.entity.getMissileInventoryName());
        missileButton.field_146124_l = (type.numMissileSlots > 0);
        this.field_146292_n.add(missileButton);
        final GuiButton bombButton = new GuiButton(5, this.field_146294_l / 2 + 2, this.field_146295_m / 2 - 27, 58, 20, this.entity.getBombInventoryName());
        bombButton.field_146124_l = (type.numBombSlots > 0);
        this.field_146292_n.add(bombButton);
        this.field_146292_n.add(new GuiButton(4, this.field_146294_l / 2 - 60, this.field_146295_m / 2 - 27, 58, 20, "Repair"));
    }
    
    protected void func_146284_a(final GuiButton button) {
        if (button.field_146127_k == 0) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(3));
        }
        if (button.field_146127_k == 1) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(0));
        }
        if (button.field_146127_k == 2) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(2));
        }
        if (button.field_146127_k == 3) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(5));
        }
        if (button.field_146127_k == 4) {
            this.inventory.field_70458_d.openGui((Object)FlansMod.INSTANCE, 1, this.world, this.entity.field_70176_ah, this.entity.field_70162_ai, this.entity.field_70164_aj);
        }
        if (button.field_146127_k == 5) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(1));
        }
        if (button.field_146127_k == 6) {
            FlansMod.getPacketHandler().sendToServer(new PacketDriveableGUI(1));
        }
    }
    
    protected void func_146979_b(final int i, final int j) {
        this.field_146289_q.func_78276_b(this.entity.getDriveableType().name, 6, 6, 4210752);
        this.field_146289_q.func_78276_b("Inventory", 8, this.field_147000_g - 96 + 2, 4210752);
    }
    
    protected void func_146976_a(final float f, final int i1, final int j1) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableMenu.texture);
        final int k = (this.field_146294_l - this.field_146999_f) / 2;
        final int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/planeMenu.png");
    }
}
