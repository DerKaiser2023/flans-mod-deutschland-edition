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
        this.mc = FMLClientHandler.instance().getClient();
        this.world = w;
        this.x = i;
        this.y = j;
        this.z = k;
    }
    
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(0, this.width / 2 + 22, this.height / 2 + 63, 40, 20, "Craft"));
    }
    
    protected void actionPerformed(final GuiButton button) {
        if (button.id == 0) {
            FlansMod.proxy.craftDriveable(this.inventory.player, DriveableType.types.get(GuiDriveableCrafting.selectedBlueprint));
        }
    }
    
    public void drawScreen(final int i, final int j, final float f) {
        final ScaledResolution scaledresolution = new ScaledResolution(this.mc, this.mc.displayWidth, this.mc.displayHeight);
        final int w = scaledresolution.getScaledWidth();
        final int h = scaledresolution.getScaledHeight();
        this.drawDefaultBackground();
        GL11.glEnable(3042);
        this.mc.renderEngine.bindTexture(GuiDriveableCrafting.texture);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.guiOriginX = w / 2 - 88;
        this.guiOriginY = h / 2 - 99;
        this.drawTexturedModalRect(this.guiOriginX, this.guiOriginY, 0, 0, 176, 198);
        this.drawString(this.fontRendererObj, "Vehicle Crafting", this.guiOriginX + 6, this.guiOriginY + 6, 16777215);
        this.drawString(this.fontRendererObj, "Requires", this.guiOriginX + 6, this.guiOriginY + 125, 16777215);
        this.drawString(this.fontRendererObj, "Engine", this.guiOriginX + 114, this.guiOriginY + 141, 16777215);
        for (int m = 0; m < 2; ++m) {
            for (int n = 0; n < 8; ++n) {
                final int blueprintNumber = GuiDriveableCrafting.blueprintsScroll * 8 + 8 * m + n;
                if (blueprintNumber == GuiDriveableCrafting.selectedBlueprint) {
                    this.mc.renderEngine.bindTexture(GuiDriveableCrafting.texture);
                    this.drawTexturedModalRect(this.guiOriginX + 8 + n * 18, this.guiOriginY + 18 + m * 18, 213, 11, 16, 16);
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
            this.mc.renderEngine.bindTexture(FlansModResourceHandler.getTexture(selectedType));
            if (selectedType.model != null) {
                selectedType.model.render(selectedType);
            }
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            GL11.glPopMatrix();
            if (selectedType.model == null) {
                this.drawString(this.fontRendererObj, "Model not found.", this.guiOriginX + 12, this.guiOriginY + 84, 16777215);
            }
            String recipeName = selectedType.name;
            if (recipeName.length() > 16) {
                recipeName = recipeName.substring(0, 15) + "...";
            }
            this.drawString(this.fontRendererObj, recipeName, this.guiOriginX + 82, this.guiOriginY + 64, 16777215);
            this.drawString(this.fontRendererObj, "Cargo Slots : " + selectedType.numCargoSlots, this.guiOriginX + 82, this.guiOriginY + 74, 16777215);
            this.drawString(this.fontRendererObj, "Bomb Slots : " + selectedType.numBombSlots, this.guiOriginX + 82, this.guiOriginY + 84, 16777215);
            this.drawString(this.fontRendererObj, "Passengers : " + selectedType.numPassengers, this.guiOriginX + 82, this.guiOriginY + 94, 16777215);
            this.drawString(this.fontRendererObj, "Guns : " + selectedType.ammoSlots(), this.guiOriginX + 82, this.guiOriginY + 104, 16777215);
            this.drawString(this.fontRendererObj, selectedType.numEngines() + "x", this.guiOriginX + 100, this.guiOriginY + 141, 16777215);
            final InventoryPlayer temporaryInventory = new InventoryPlayer((EntityPlayer)null);
            temporaryInventory.copyInventory(this.inventory);
            for (int r = 0; r < 3; ++r) {
                for (int c = 0; c < 4; ++c) {
                    final int recipeItemNumber = this.recipeScroll * 4 + r * 4 + c;
                    if (recipeItemNumber < selectedType.driveableRecipe.size()) {
                        final ItemStack recipeStack = selectedType.driveableRecipe.get(recipeItemNumber);
                        int totalAmountFound = 0;
                        for (int n2 = 0; n2 < temporaryInventory.getSizeInventory(); ++n2) {
                            ItemStack stackInSlot = temporaryInventory.getStackInSlot(n2);
                            if (stackInSlot != null && recipeStack != null && stackInSlot.getItem() == recipeStack.getItem() && stackInSlot.getMetadata() == recipeStack.getMetadata()) {
                                final int amountFound = Math.min(stackInSlot.stackSize, recipeStack.stackSize - totalAmountFound);
                                final ItemStack itemStack = stackInSlot;
                                itemStack.stackSize -= amountFound;
                                if (stackInSlot.stackSize <= 0) {
                                    stackInSlot = null;
                                }
                                temporaryInventory.setInventorySlotContents(n2, stackInSlot);
                                totalAmountFound += amountFound;
                                if (totalAmountFound == recipeStack.stackSize) {
                                    break;
                                }
                            }
                        }
                        if (totalAmountFound < recipeStack.stackSize) {
                            this.mc.renderEngine.bindTexture(GuiDriveableCrafting.texture);
                            this.drawTexturedModalRect(this.guiOriginX + 8 + c * 18, this.guiOriginY + 138 + r * 18, 195, 11, 16, 16);
                            this.canCraft = false;
                        }
                        this.drawSlotInventory(recipeStack, this.guiOriginX + 8 + c * 18, this.guiOriginY + 138 + r * 18);
                    }
                }
            }
            final HashMap<PartType, ItemStack> engines = new HashMap<PartType, ItemStack>();
            for (int n3 = 0; n3 < temporaryInventory.getSizeInventory(); ++n3) {
                final ItemStack stackInSlot2 = temporaryInventory.getStackInSlot(n3);
                if (stackInSlot2 != null && stackInSlot2.getItem() instanceof ItemPart) {
                    final PartType partType = ((ItemPart)stackInSlot2.getItem()).type;
                    if (partType.category == 2 && partType.worksWith.contains(EnumType.getFromObject(selectedType))) {
                        if (engines.containsKey(partType)) {
                            final ItemStack itemStack2 = engines.get(partType);
                            itemStack2.stackSize += stackInSlot2.stackSize;
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
                if (part.engineSpeed > bestEngineSpeed && engines.get(part).stackSize >= selectedType.numEngines()) {
                    bestEngineSpeed = part.engineSpeed;
                    bestEngineStack = engines.get(part);
                }
            }
            this.mc.renderEngine.bindTexture(GuiDriveableCrafting.texture);
            if (bestEngineStack == null) {
                this.drawTexturedModalRect(this.guiOriginX + 152, this.guiOriginY + 138, 195, 11, 16, 16);
                this.canCraft = false;
            }
            else {
                this.drawSlotInventory(bestEngineStack, this.guiOriginX + 152, this.guiOriginY + 138);
            }
        }
        if (!this.canCraft) {
            this.mc.renderEngine.bindTexture(GuiDriveableCrafting.texture);
            this.drawTexturedModalRect(this.guiOriginX + 108, this.guiOriginY + 160, 176, 28, 44, 24);
            this.drawString(this.fontRendererObj, "Craft", this.guiOriginX + 116, this.guiOriginY + 168, 10526880);
        }
        else {
            super.drawScreen(i, j, f);
        }
    }
    
    private void drawSlotInventory(final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.getItem() == null) {
            return;
        }
        GuiDriveableCrafting.itemRenderer.renderItemIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GuiDriveableCrafting.itemRenderer.renderItemOverlayIntoGUI(this.fontRendererObj, this.mc.renderEngine, itemstack, i, j);
        GL11.glDisable(2896);
        GL11.glDisable(2929);
    }
    
    protected void keyTyped(final char c, final int i) {
        if (i == 1 || i == this.mc.gameSettings.keyBindInventory.getKeyCode()) {
            this.mc.thePlayer.closeScreen();
        }
    }
    
    protected void mouseClicked(final int i, final int j, final int k) {
        super.mouseClicked(i, j, k);
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
    
    public boolean doesGuiPauseGame() {
        return false;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "gui/driveableCrafting.png");
        GuiDriveableCrafting.itemRenderer = new RenderItem();
        GuiDriveableCrafting.blueprintsScroll = 0;
        GuiDriveableCrafting.selectedBlueprint = 0;
    }
}
