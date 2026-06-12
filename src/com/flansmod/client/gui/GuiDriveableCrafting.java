// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.gui;

import java.util.Iterator;
import com.flansmod.common.types.EnumType;
import com.flansmod.common.parts.ItemPart;
import com.flansmod.common.parts.PartType;
import java.util.HashMap;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.driveables.mechas.MechaType;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.FlansMod;
import net.minecraft.client.gui.GuiButton;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.GuiScreen;

public class GuiDriveableCrafting extends GuiScreen
{
    private static final ResourceLocation texture;
    private InventoryPlayer inventory;
    private World world;
    private int x;
    private int y;
    private int z;
    private static RenderItem itemRenderer;
    private int guiOriginX;
    private int guiOriginY;
    private static int blueprintsScroll;
    private int recipeScroll;
    private static int selectedBlueprint;
    private float spinner;
    private boolean canCraft;
    
    public GuiDriveableCrafting(final InventoryPlayer playerinventory, final World w, final int i, final int j, final int k) {
        this.recipeScroll = 0;
        this.spinner = 0.0f;
        this.canCraft = false;
        this.inventory = playerinventory;
        this.field_146297_k = FMLClientHandler.instance().getClient();
        this.world = w;
        this.x = i;
        this.y = j;
        this.z = k;
    }
    
    public void func_73866_w_() {
        super.func_73866_w_();
        this.field_146292_n.add(new GuiButton(0, this.field_146294_l / 2 + 22, this.field_146295_m / 2 + 63, 40, 20, "Craft"));
    }
    
    protected void func_146284_a(final GuiButton button) {
        if (button.field_146127_k == 0) {
            FlansMod.proxy.craftDriveable(this.inventory.field_70458_d, DriveableType.types.get(GuiDriveableCrafting.selectedBlueprint));
        }
    }
    
    public void func_73863_a(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.field_146297_k, this.field_146297_k.field_71443_c, this.field_146297_k.field_71440_d);
        final int w = scaledresolution.func_78326_a();
        final int h = scaledresolution.func_78328_b();
        this.func_146276_q_();
        GL11.glEnable(3042);
        this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableCrafting.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.guiOriginX = w / 2 - 88;
        this.guiOriginY = h / 2 - 99;
        this.func_73729_b(this.guiOriginX, this.guiOriginY, 0, 0, 176, 198);
        this.func_73731_b(this.field_146289_q, "Vehicle Crafting", this.guiOriginX + 6, this.guiOriginY + 6, 16777215);
        this.func_73731_b(this.field_146289_q, "Requires", this.guiOriginX + 6, this.guiOriginY + 125, 16777215);
        this.func_73731_b(this.field_146289_q, "Engine", this.guiOriginX + 114, this.guiOriginY + 141, 16777215);
        for (int m = 0; m < 2; ++m) {
            for (int n = 0; n < 8; ++n) {
                final int blueprintNumber = GuiDriveableCrafting.blueprintsScroll * 8 + 8 * m + n;
                if (blueprintNumber == GuiDriveableCrafting.selectedBlueprint) {
                    this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableCrafting.texture);
                    this.func_73729_b(this.guiOriginX + 8 + n * 18, this.guiOriginY + 18 + m * 18, 213, 11, 16, 16);
                }
                if (blueprintNumber < DriveableType.types.size()) {
                    final DriveableType type = DriveableType.types.get(blueprintNumber);
                    this.drawSlotInventory(new ItemStack(type.item), this.guiOriginX + 8 + n * 18, this.guiOriginY + 18 + m * 18);
                }
            }
        }
        ++this.spinner;
        if (GuiDriveableCrafting.selectedBlueprint >= DriveableType.types.size()) {
            return;
        }
        this.canCraft = true;
        final DriveableType selectedType = DriveableType.types.get(GuiDriveableCrafting.selectedBlueprint);
        if (selectedType != null) {
            GL11.glPushMatrix();
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glTranslatef((float)(w / 2 - 46), (float)(h / 2 - 10), 100.0f);
            if (selectedType instanceof MechaType) {
                GL11.glTranslatef(0.0f, 15.0f, 0.0f);
            }
            GL11.glScalef(-50.0f * selectedType.modelScale / selectedType.cameraDistance, 50.0f * selectedType.modelScale / selectedType.cameraDistance, 50.0f * selectedType.modelScale / selectedType.cameraDistance);
            GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(30.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(this.spinner / 5.0f, 0.0f, 1.0f, 0.0f);
            this.field_146297_k.field_71446_o.func_110577_a(FlansModResourceHandler.getTexture(selectedType));
            if (selectedType.model != null) {
                selectedType.model.render(selectedType);
            }
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            GL11.glPopMatrix();
            if (selectedType.model == null) {
                this.func_73731_b(this.field_146289_q, "Model not found.", this.guiOriginX + 12, this.guiOriginY + 84, 16777215);
            }
            String recipeName = selectedType.name;
            if (recipeName.length() > 16) {
                recipeName = recipeName.substring(0, 15) + "...";
            }
            this.func_73731_b(this.field_146289_q, recipeName, this.guiOriginX + 82, this.guiOriginY + 64, 16777215);
            this.func_73731_b(this.field_146289_q, "Cargo Slots : " + selectedType.numCargoSlots, this.guiOriginX + 82, this.guiOriginY + 74, 16777215);
            this.func_73731_b(this.field_146289_q, "Bomb Slots : " + selectedType.numBombSlots, this.guiOriginX + 82, this.guiOriginY + 84, 16777215);
            this.func_73731_b(this.field_146289_q, "Passengers : " + selectedType.numPassengers, this.guiOriginX + 82, this.guiOriginY + 94, 16777215);
            this.func_73731_b(this.field_146289_q, "Guns : " + selectedType.ammoSlots(), this.guiOriginX + 82, this.guiOriginY + 104, 16777215);
            this.func_73731_b(this.field_146289_q, selectedType.numEngines() + "x", this.guiOriginX + 100, this.guiOriginY + 141, 16777215);
            final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
            temporaryInventory.func_70455_b(this.inventory);
            for (int r = 0; r < 3; ++r) {
                for (int c = 0; c < 4; ++c) {
                    final int recipeItemNumber = this.recipeScroll * 4 + r * 4 + c;
                    if (recipeItemNumber < selectedType.driveableRecipe.size()) {
                        final ItemStack recipeStack = selectedType.driveableRecipe.get(recipeItemNumber);
                        int totalAmountFound = 0;
                        for (int n2 = 0; n2 < temporaryInventory.func_70302_i_(); ++n2) {
                            ItemStack stackInSlot = temporaryInventory.func_70301_a(n2);
                            if (stackInSlot != null && recipeStack != null && stackInSlot.func_77973_b() == recipeStack.func_77973_b() && stackInSlot.func_77960_j() == recipeStack.func_77960_j()) {
                                final int amountFound = Math.min(stackInSlot.field_77994_a, recipeStack.field_77994_a - totalAmountFound);
                                final ItemStack itemStack = stackInSlot;
                                itemStack.field_77994_a -= amountFound;
                                if (stackInSlot.field_77994_a <= 0) {
                                    stackInSlot = null;
                                }
                                temporaryInventory.func_70299_a(n2, stackInSlot);
                                totalAmountFound += amountFound;
                                if (totalAmountFound == recipeStack.field_77994_a) {
                                    break;
                                }
                            }
                        }
                        if (totalAmountFound < recipeStack.field_77994_a) {
                            this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableCrafting.texture);
                            this.func_73729_b(this.guiOriginX + 8 + c * 18, this.guiOriginY + 138 + r * 18, 195, 11, 16, 16);
                            this.canCraft = false;
                        }
                        this.drawSlotInventory(recipeStack, this.guiOriginX + 8 + c * 18, this.guiOriginY + 138 + r * 18);
                    }
                }
            }
            final HashMap<PartType, ItemStack> engines = new HashMap<PartType, ItemStack>();
            for (int n3 = 0; n3 < temporaryInventory.func_70302_i_(); ++n3) {
                final ItemStack stackInSlot2 = temporaryInventory.func_70301_a(n3);
                if (stackInSlot2 != null && stackInSlot2.func_77973_b() instanceof ItemPart) {
                    final PartType partType = ((ItemPart)stackInSlot2.func_77973_b()).type;
                    if (partType.category == 2 && partType.worksWith.contains(EnumType.getFromObject(selectedType))) {
                        if (engines.containsKey(partType)) {
                            final ItemStack itemStack2 = engines.get(partType);
                            itemStack2.field_77994_a += stackInSlot2.field_77994_a;
                        }
                        else {
                            engines.put(partType, stackInSlot2);
                        }
                    }
                }
            }
            float bestEngineSpeed = -1.0f;
            ItemStack bestEngineStack = null;
            for (final PartType part : engines.keySet()) {
                if (part.engineSpeed > bestEngineSpeed && engines.get(part).field_77994_a >= selectedType.numEngines()) {
                    bestEngineSpeed = part.engineSpeed;
                    bestEngineStack = engines.get(part);
                }
            }
            this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableCrafting.texture);
            if (bestEngineStack == null) {
                this.func_73729_b(this.guiOriginX + 152, this.guiOriginY + 138, 195, 11, 16, 16);
                this.canCraft = false;
            }
            else {
                this.drawSlotInventory(bestEngineStack, this.guiOriginX + 152, this.guiOriginY + 138);
            }
        }
        if (!this.canCraft) {
            this.field_146297_k.field_71446_o.func_110577_a(GuiDriveableCrafting.texture);
            this.func_73729_b(this.guiOriginX + 108, this.guiOriginY + 160, 176, 28, 44, 24);
            this.func_73731_b(this.field_146289_q, "Craft", this.guiOriginX + 116, this.guiOriginY + 168, 10526880);
        }
        else {
            super.func_73863_a(i, j, f);
        }
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.func_77973_b() == null) {
            return;
        }
        GuiDriveableCrafting.itemRenderer.func_77015_a(this.field_146289_q, this.field_146297_k.field_71446_o, itemstack, i, j);
        GuiDriveableCrafting.itemRenderer.func_77021_b(this.field_146289_q, this.field_146297_k.field_71446_o, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    protected void func_73869_a(final char c, final int i) {
        if (i == 1 || i == this.field_146297_k.field_71474_y.field_151445_Q.func_151463_i()) {
            this.field_146297_k.field_71439_g.func_71053_j();
        }
    }
    
    protected void func_73864_a(final int i, final int j, final int k) {
        super.func_73864_a(i, j, k);
        final int x = i - this.guiOriginX;
        final int y = j - this.guiOriginY;
        if (k == 0 || k == 1) {
            for (int m = 0; m < 2; ++m) {
                for (int n = 0; n < 8; ++n) {
                    if (x >= 8 + n * 18 && x <= 26 + n * 18 && y >= 18 + 18 * m && y <= 42 + 18 * m) {
                        GuiDriveableCrafting.selectedBlueprint = GuiDriveableCrafting.blueprintsScroll * 8 + m * 8 + n;
                    }
                }
            }
            if (x >= 157 && x <= 167 && y >= 21 && y <= 31 && GuiDriveableCrafting.blueprintsScroll > 0) {
                --GuiDriveableCrafting.blueprintsScroll;
            }
            if (x >= 157 && x <= 167 && y >= 39 && y <= 49 && GuiDriveableCrafting.blueprintsScroll * 8 + 16 < DriveableType.types.size()) {
                ++GuiDriveableCrafting.blueprintsScroll;
            }
            if (GuiDriveableCrafting.selectedBlueprint >= DriveableType.types.size()) {
                return;
            }
            if (x >= 83 && x <= 93 && y >= 141 && y <= 151 && this.recipeScroll > 0) {
                --this.recipeScroll;
            }
            if (x >= 83 && x <= 93 && y >= 177 && y <= 187) {
                final DriveableType selectedType = DriveableType.types.get(GuiDriveableCrafting.selectedBlueprint);
                if (selectedType != null && this.recipeScroll * 4 + 12 < selectedType.driveableRecipe.size()) {
                    ++this.recipeScroll;
                }
            }
        }
    }
    
    public boolean func_73868_f() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/driveableCrafting.png");
        GuiDriveableCrafting.itemRenderer = new RenderItem();
        GuiDriveableCrafting.blueprintsScroll = 0;
        GuiDriveableCrafting.selectedBlueprint = 0;
    }
}
