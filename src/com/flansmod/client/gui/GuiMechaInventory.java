// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.Tessellator;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import org.lwjgl.opengl.GL11;
import net.minecraft.inventory.Container;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import com.flansmod.common.driveables.mechas.ContainerMechaInventory;
import com.flansmod.client.model.RenderMecha;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiMechaInventory extends GuiContainer
{
    private static final ResourceLocation texture;
    private static final RenderMecha mechaRenderer;
    public ContainerMechaInventory container;
    public InventoryPlayer inventory;
    public World world;
    public int scroll;
    public int numItems;
    public int maxScroll;
    public EntityMecha mecha;
    private int anim;
    private long lastTime;
    
    public GuiMechaInventory(final InventoryPlayer inventoryplayer, final World world1, final EntityMecha entMecha) {
        super((Container)new ContainerMechaInventory(inventoryplayer, world1, entMecha));
        this.anim = 0;
        this.mecha = entMecha;
        this.inventory = inventoryplayer;
        this.world = world1;
        this.container = (ContainerMechaInventory)this.field_147002_h;
        this.field_147000_g = 180;
        this.field_146999_f = 350;
        this.maxScroll = this.container.maxScroll;
        this.numItems = this.container.numItems;
    }
    
    public void func_73863_a(final int i, final int j, final float f) {
        super.func_73863_a(i, j, f);
    }
    
    protected void func_146979_b(final int x, final int y) {
        this.field_146289_q.func_78276_b(this.mecha.getMechaType().name, 9, 9, 4210752);
        this.field_146289_q.func_78276_b("Inventory", 181, this.field_147000_g - 96 + 2, 4210752);
    }
    
    protected void func_146976_a(final float f, final int i1, final int j1) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.field_146297_k.field_71446_o.func_110577_a(GuiMechaInventory.texture);
        final int k = (this.field_146294_l - this.field_146999_f) / 2;
        final int l = (this.field_146295_m - this.field_147000_g) / 2;
        this.func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
        for (int numRows = (this.numItems + 7) / 8, row = 0; row < ((numRows > 3) ? 3 : numRows); ++row) {
            this.func_73729_b(k + 185, l + 24 + 19 * row, 181, 97, 18 * (((row + this.scroll + 1) * 8 <= this.numItems) ? 8 : (this.numItems % 8)), 18);
        }
        if (this.scroll == 0) {
            this.func_73729_b(k + 336, l + 41, 350, 0, 10, 10);
        }
        if (this.scroll == this.maxScroll) {
            this.func_73729_b(k + 336, l + 53, 350, 10, 10, 10);
        }
        final long newTime = this.field_146297_k.field_71441_e.func_72912_H().func_76073_f();
        if (newTime > this.lastTime) {
            this.lastTime = newTime;
            if (newTime % 5L == 0L) {
                ++this.anim;
            }
        }
        final int fuelTankSize = this.mecha.getMechaType().fuelTankSize;
        final float fuelInTank = this.mecha.driveableData.fuelInTank;
        if (fuelInTank < fuelTankSize / 8 && this.anim % 4 > 1) {
            this.func_73729_b(this.field_146294_l / 2 - 14, this.field_146295_m / 2 - 59, 360, 0, 6, 6);
        }
        if (fuelInTank > 0.0f) {
            this.func_73729_b(this.field_146294_l / 2 - 18, this.field_146295_m / 2 + 45 - (int)(94.0f * fuelInTank / fuelTankSize), 350, 20, 15, (int)(94.0f * fuelInTank / fuelTankSize));
        }
        final MechaType type = this.mecha.getMechaType();
        GL11.glPushMatrix();
        GL11.glEnable(2929);
        GL11.glEnable(2896);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glTranslatef((float)(k + 92), (float)(l + 105), 100.0f);
        GL11.glScalef(-50.0f / type.cameraDistance, 50.0f / type.cameraDistance, 50.0f / type.cameraDistance);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(30.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef((float)FlansMod.ticker, 0.0f, 1.0f, 0.0f);
        this.field_146297_k.field_71446_o.func_110577_a(FlansModResourceHandler.getTexture(type));
        GuiMechaInventory.mechaRenderer.render(this.mecha, 0.0, 0.0, 0.0, 0.0f, 0.0f);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
        GL11.glPopMatrix();
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
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 - 166, this.field_146295_m / 2 + 63, 93, 20, "Passenger Guns"));
        this.field_146292_n.add(new GuiButton(1, this.field_146294_l / 2 - 68, this.field_146295_m / 2 + 63, 68, 20, "Repair"));
    }
    
    protected void func_146284_a(final GuiButton button) {
        if (button.field_146127_k == 0) {
            this.inventory.field_70458_d.openGui((Object)FlansMod.INSTANCE, 6, this.world, this.mecha.field_70176_ah, this.mecha.field_70162_ai, this.mecha.field_70164_aj);
        }
        if (button.field_146127_k == 1) {
            this.inventory.field_70458_d.openGui((Object)FlansMod.INSTANCE, 1, this.world, this.mecha.field_70176_ah, this.mecha.field_70162_ai, this.mecha.field_70164_aj);
        }
    }
    
    protected void func_73864_a(final int i, final int j, final int k) {
        super.func_73864_a(i, j, k);
        final int m = i - (this.field_146294_l - this.field_146999_f) / 2;
        final int n = j - (this.field_146295_m - this.field_147000_g) / 2;
        if (this.scroll > 0 && m > 336 && m < 346 && n > 41 && n < 51) {
            --this.scroll;
            this.container.updateScroll(this.scroll);
        }
        if (this.scroll < this.maxScroll && (m > 336 & m < 346) && n > 53 && n < 63) {
            ++this.scroll;
            this.container.updateScroll(this.scroll);
        }
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/mechaInventory.png");
        (mechaRenderer = new RenderMecha()).func_76976_a(RenderManager.field_78727_a);
    }
}
