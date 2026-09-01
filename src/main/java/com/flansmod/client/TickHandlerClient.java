// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client;

import com.flansmod.common.types.InfoType;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.MouseHelper;
import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.model.RenderFlag;
import net.minecraft.util.MovingObjectPosition;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.EnumSkyBlock;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketChecker;
import com.flansmod.client.model.RenderGun;
import cpw.mods.fml.common.gameevent.TickEvent;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.DriveableData;
import java.util.Iterator;
import com.flansmod.common.PlayerData;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.item.ItemStack;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import com.flansmod.common.FlansMod;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.gui.ScaledResolution;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntitySeat;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import java.util.List;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.vector.Vector3i;
import java.util.ArrayList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

public class TickHandlerClient
{
    public static Entity lastMount;
    public static final ResourceLocation offHand;
    public static ArrayList<Vector3i> blockLightOverrides;
    public static ArrayList<Vector3i> vehicleLightOverrides;
    public static int lightOverrideRefreshRate;
    public static int vehicleLightOverrideRefreshRate;
    int tickcount;
    int tickcountflash;
    int tickcountWounded;
    boolean isInFlash;
    int flashTime;
    EntityPlayer entityPlayerFlash;
    private static GuiScreen guiDriveableController;
    public static float cringeBlood;
    public static float cringeHemorrhaging;
    public static int killsTotal;
    private static RenderItem itemRenderer;
    private static List<KillMessage> killMessages;
    private static List<KillMessageDumb> killMessagesDumb;
    
    public TickHandlerClient() {
        this.tickcount = 0;
        this.tickcountflash = 0;
        this.tickcountWounded = 0;
        FMLCommonHandler.instance().bus().register((Object)this);
        MinecraftForge.EVENT_BUS.register((Object)this);
    }
    
    @SubscribeEvent
    public void eventHandler(final MouseEvent event) {
        final EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
        if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun && ((ItemGun)player.getCurrentEquippedItem().getItem()).type.oneHanded && Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) && Math.abs(event.dwheel) > 0) {
            event.setCanceled(true);
        }
    }
    
    @SubscribeEvent
    public void eventHandler(final RenderGameOverlayEvent event) {
        final Minecraft mc = Minecraft.getMinecraft();
        final String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();
        if (Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode()) && !mc.thePlayer.isRiding()) {
            ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FMLClientHandler.instance().getClient().entityRenderer, (Object)1, new String[] { "cameraZoom", "af", "cameraZoom" });
        }
        if (mc.thePlayer.ridingEntity instanceof EntitySeat) {
            final EntityDriveable enterino = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
            if (enterino instanceof EntityVehicle) {
                final EntityVehicle enterinoTank = (EntityVehicle)enterino;
                if (event.type == RenderGameOverlayEvent.ElementType.CROSSHAIRS && mc.thePlayer != null && enterino.getDriveableType().hasScope && !enterinoTank.hasRadar) {
                    event.setCanceled(true);
                    return;
                }
            }
        }
        if (event.type == RenderGameOverlayEvent.ElementType.CROSSHAIRS && mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun && !mc.thePlayer.isRiding() && (!((ItemGun)mc.thePlayer.getHeldItem().getItem()).type.showCrosshair || FlansModClient.currentScope != null || FlansModClient.lastZoomProgress < -0.8)) {
            event.setCanceled(true);
            return;
        }
        final ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
        final int i = scaledresolution.getScaledWidth();
        final int j = scaledresolution.getScaledHeight();
        final Tessellator tessellator = Tessellator.instance;
        if (!event.isCancelable() && event.type == RenderGameOverlayEvent.ElementType.HELMET) {
            String overlayTexture = null;
            if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8f) {
                overlayTexture = FlansModClient.currentScope.getZoomOverlay();
            }
            else if (mc.thePlayer != null) {
                final ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
                if (stack != null && stack.getItem() instanceof ItemTeamArmour) {
                    if (((ItemTeamArmour)stack.getItem()).type.faceArmor / (((ItemTeamArmour)stack.getItem()).type.headArmor + 1.0f) > 0.7f && ((ItemTeamArmour)stack.getItem()).type.faceArmor != 1.0f) {
                        overlayTexture = "faceHelmet";
                    }
                    else if (((ItemTeamArmour)stack.getItem()).type.faceArmor / (((ItemTeamArmour)stack.getItem()).type.headArmor + 1.0f) > 0.2f && ((ItemTeamArmour)stack.getItem()).type.faceArmor / (((ItemTeamArmour)stack.getItem()).type.headArmor + 1.0f) <= 0.7f && ((ItemTeamArmour)stack.getItem()).type.faceArmor != 1.0f) {
                        overlayTexture = "cheekHelmet";
                    }
                    else {
                        overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
                    }
                }
                final PacketTeamInfo teamInfo = FlansModClient.teamInfo;
                if (TickHandlerClient.cringeHemorrhaging > 1.0f) {
                    mc.fontRendererObj.drawString("ORGAN FAILURE IMMINENT", 2, 72, 14329120);
                    mc.fontRendererObj.drawString("SURGERY NEEDED", 2, 82, 16711680);
                }
                if (TickHandlerClient.killsTotal > 0 && TickHandlerClient.killsTotal < 10) {
                    overlayTexture = "multikill" + TickHandlerClient.killsTotal;
                }
                else if (TickHandlerClient.killsTotal > 9) {
                    overlayTexture = "multikill10";
                }
                if (TickHandlerClient.cringeBlood <= 95.0f && TickHandlerClient.cringeBlood > 80.0f) {
                    overlayTexture = "blood1";
                }
                if (TickHandlerClient.cringeBlood <= 80.0f && TickHandlerClient.cringeBlood > 70.0f) {
                    overlayTexture = "blood2";
                }
                if (TickHandlerClient.cringeBlood <= 70.0f && TickHandlerClient.cringeBlood > 60.0f) {
                    overlayTexture = "blood3";
                }
                if (TickHandlerClient.cringeBlood <= 60.0f && TickHandlerClient.cringeBlood > 50.0f) {
                    overlayTexture = "blood4";
                }
                if (TickHandlerClient.cringeBlood <= 50.0f && TickHandlerClient.cringeBlood > 40.0f) {
                    overlayTexture = "blood5";
                }
                if (TickHandlerClient.cringeBlood <= 40.0f && TickHandlerClient.cringeBlood > 30.0f) {
                    overlayTexture = "blood6";
                }
                if (TickHandlerClient.cringeBlood <= 30.0f && TickHandlerClient.cringeBlood > 20.0f) {
                    overlayTexture = "blood7";
                }
                if (TickHandlerClient.cringeBlood <= 20.0f && TickHandlerClient.cringeBlood > 10.0f) {
                    overlayTexture = "blood8";
                }
                if (TickHandlerClient.cringeBlood <= 10.0f) {
                    overlayTexture = "blood9";
                }
            }
            if (overlayTexture != null) {
                FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                GL11.glEnable(3042);
                GL11.glDisable(2929);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(3008);
                mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV((double)(i / 2 - 2 * j), (double)j, -90.0, 0.0, 1.0);
                tessellator.addVertexWithUV((double)(i / 2 + 2 * j), (double)j, -90.0, 1.0, 1.0);
                tessellator.addVertexWithUV((double)(i / 2 + 2 * j), 0.0, -90.0, 1.0, 0.0);
                tessellator.addVertexWithUV((double)(i / 2 - 2 * j), 0.0, -90.0, 0.0, 0.0);
                tessellator.draw();
                GL11.glDepthMask(true);
                GL11.glEnable(2929);
                GL11.glEnable(3008);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            }
        }
        if (!event.isCancelable() && event.type == RenderGameOverlayEvent.ElementType.HOTBAR && FlansMod.bulletGuiEnable) {
            if (mc.thePlayer != null) {
                if (TickHandlerClient.cringeBlood < 100.0f) {
                    mc.fontRendererObj.drawString("Blood: " + TickHandlerClient.cringeBlood, 172, 30, 14329120);
                }
                if (TickHandlerClient.cringeHemorrhaging > 0.0f) {
                    mc.fontRendererObj.drawString("FATAL BEEDING", 172, 42, 16711680);
                }
                final ItemStack stack2 = mc.thePlayer.inventory.getCurrentItem();
                if (stack2 != null && stack2.getItem() instanceof ItemGun) {
                    final ItemGun gunItem = (ItemGun)stack2.getItem();
                    final GunType gunType = gunItem.type;
                    int x = 0;
                    for (int n = 0; n < gunType.getNumAmmoItemsInGun(stack2); ++n) {
                        final ItemStack bulletStack = ((ItemGun)stack2.getItem()).getBulletItemStack(stack2, n);
                        if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getMetadata() < bulletStack.getMaxDurability()) {
                            RenderHelper.enableGUIStandardItemLighting();
                            GL11.glEnable(32826);
                            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
                            drawSlotInventory(mc.fontRendererObj, bulletStack, i / 2 + 16 + x, j - 65);
                            GL11.glDisable(32826);
                            RenderHelper.disableStandardItemLighting();
                            String s = bulletStack.getMaxDurability() - bulletStack.getMetadata() + "/" + bulletStack.getMaxDurability();
                            if (gunType.submode.length >= 2) {
                                s = s + "[" + gunType.getFireMode(stack2) + "]";
                            }
                            if (bulletStack.getMaxDurability() == 1) {
                                s = "";
                            }
                            mc.fontRendererObj.drawString(s, i / 2 + 32 + x, j - 59, 0);
                            mc.fontRendererObj.drawString(s, i / 2 + 33 + x, j - 60, 16777215);
                            x += 16 + mc.fontRendererObj.getStringWidth(s);
                        }
                    }
                    final PlayerData data = PlayerHandler.getPlayerData((EntityPlayer)mc.thePlayer, Side.CLIENT);
                    if (gunType.oneHanded && data.offHandGunSlot != 0) {
                        final ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
                        if (offHandStack != null && offHandStack.getItem() instanceof ItemGun) {
                            final GunType offHandGunType = ((ItemGun)offHandStack.getItem()).type;
                            x = 0;
                            for (int n2 = 0; n2 < offHandGunType.getNumAmmoItemsInGun(offHandStack); ++n2) {
                                final ItemStack bulletStack2 = ((ItemGun)offHandStack.getItem()).getBulletItemStack(offHandStack, n2);
                                if (bulletStack2 != null && bulletStack2.getItem() != null && bulletStack2.getMetadata() < bulletStack2.getMaxDurability()) {
                                    String s2 = bulletStack2.getMaxDurability() - bulletStack2.getMetadata() + "/" + bulletStack2.getMaxDurability();
                                    if (gunType.submode.length >= 2) {
                                        s2 = s2 + "[" + gunType.getFireMode(offHandStack) + "]";
                                    }
                                    if (bulletStack2.getMaxDurability() == 1) {
                                        s2 = "";
                                    }
                                    RenderHelper.enableGUIStandardItemLighting();
                                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                                    GL11.glEnable(32826);
                                    OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
                                    drawSlotInventory(mc.fontRendererObj, bulletStack2, i / 2 - 32 - x, j - 65);
                                    x += 16 + mc.fontRendererObj.getStringWidth(s2);
                                    GL11.glDisable(32826);
                                    RenderHelper.disableStandardItemLighting();
                                    mc.fontRendererObj.drawString(s2, i / 2 - 16 - x, j - 59, 0);
                                    mc.fontRendererObj.drawString(s2, i / 2 - 17 - x, j - 60, 16777215);
                                }
                            }
                        }
                    }
                }
            }
            final PacketTeamInfo teamInfo2 = FlansModClient.teamInfo;
            if (teamInfo2 != null && FlansModClient.minecraft.thePlayer != null && (PacketTeamInfo.numTeams > 0 || !PacketTeamInfo.sortedByTeam) && PacketTeamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getCommandSenderName()) != null) {
                GL11.glEnable(3042);
                GL11.glDisable(2929);
                GL11.glDepthMask(false);
                GL11.glBlendFunc(770, 771);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                GL11.glDisable(3008);
                mc.renderEngine.bindTexture(GuiTeamScores.texture);
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV((double)(i / 2 - 43), 35.0, -90.0, 0.33203125, 0.13671875);
                tessellator.addVertexWithUV((double)(i / 2 + 43), 35.0, -90.0, 0.66796875, 0.13671875);
                tessellator.addVertexWithUV((double)(i / 2 + 43), 0.0, -90.0, 0.66796875, 0.0);
                tessellator.addVertexWithUV((double)(i / 2 - 43), 0.0, -90.0, 0.33203125, 0.0);
                tessellator.draw();
                if (PacketTeamInfo.numTeams == 2 && PacketTeamInfo.sortedByTeam) {
                    int colour = PacketTeamInfo.teamData[0].team.teamColour;
                    GL11.glColor4f((colour >> 16 & 0xFF) / 256.0f, (colour >> 8 & 0xFF) / 256.0f, (colour & 0xFF) / 256.0f, 1.0f);
                    tessellator.startDrawingQuads();
                    tessellator.addVertexWithUV((double)(i / 2 - 43), 27.0, -90.0, 0.0, 0.48828125);
                    tessellator.addVertexWithUV((double)(i / 2 - 19), 27.0, -90.0, 0.09375, 0.48828125);
                    tessellator.addVertexWithUV((double)(i / 2 - 19), 0.0, -90.0, 0.09375, 0.3828125);
                    tessellator.addVertexWithUV((double)(i / 2 - 43), 0.0, -90.0, 0.0, 0.3828125);
                    tessellator.draw();
                    colour = PacketTeamInfo.teamData[1].team.teamColour;
                    GL11.glColor4f((colour >> 16 & 0xFF) / 256.0f, (colour >> 8 & 0xFF) / 256.0f, (colour & 0xFF) / 256.0f, 1.0f);
                    tessellator.startDrawingQuads();
                    tessellator.addVertexWithUV((double)(i / 2 + 19), 27.0, -90.0, 0.2421875, 0.48828125);
                    tessellator.addVertexWithUV((double)(i / 2 + 43), 27.0, -90.0, 0.3359375, 0.48828125);
                    tessellator.addVertexWithUV((double)(i / 2 + 43), 0.0, -90.0, 0.3359375, 0.3828125);
                    tessellator.addVertexWithUV((double)(i / 2 + 19), 0.0, -90.0, 0.2421875, 0.3828125);
                    tessellator.draw();
                    GL11.glDepthMask(true);
                    GL11.glEnable(2929);
                    GL11.glEnable(3008);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    mc.fontRendererObj.drawString(PacketTeamInfo.teamData[0].score + "", i / 2 - 35, 9, 0);
                    mc.fontRendererObj.drawString(PacketTeamInfo.teamData[0].score + "", i / 2 - 36, 8, 16777215);
                    mc.fontRendererObj.drawString(PacketTeamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRendererObj.getStringWidth(PacketTeamInfo.teamData[1].score + ""), 9, 0);
                    mc.fontRendererObj.drawString(PacketTeamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRendererObj.getStringWidth(PacketTeamInfo.teamData[1].score + ""), 8, 16777215);
                }
                mc.fontRendererObj.drawString(PacketTeamInfo.gametype + "", i / 2 + 48, 9, 0);
                mc.fontRendererObj.drawString(PacketTeamInfo.gametype + "", i / 2 + 47, 8, 16777215);
                mc.fontRendererObj.drawString(PacketTeamInfo.map + "", i / 2 - 47 - mc.fontRendererObj.getStringWidth(PacketTeamInfo.map + ""), 9, 0);
                mc.fontRendererObj.drawString(PacketTeamInfo.map + "", i / 2 - 48 - mc.fontRendererObj.getStringWidth(PacketTeamInfo.map + ""), 8, 16777215);
                int secondsLeft = PacketTeamInfo.timeLeft / 20;
                final int minutesLeft = secondsLeft / 60;
                secondsLeft %= 60;
                final String timeLeft = minutesLeft + ":" + ((secondsLeft < 10) ? ("0" + secondsLeft) : Integer.valueOf(secondsLeft));
                mc.fontRendererObj.drawString(timeLeft, i / 2 - mc.fontRendererObj.getStringWidth(timeLeft) / 2 - 1, 37, 0);
                mc.fontRendererObj.drawString(timeLeft, i / 2 - mc.fontRendererObj.getStringWidth(timeLeft) / 2, 38, 16777215);
                GL11.glDepthMask(true);
                GL11.glEnable(2929);
                GL11.glEnable(3008);
                GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                mc.fontRendererObj.drawString(PacketTeamInfo.getPlayerScoreData(playerUsername).score + "", i / 2 - 7, 1, 0);
                mc.fontRendererObj.drawString(PacketTeamInfo.getPlayerScoreData(playerUsername).kills + "", i / 2 - 7, 9, 0);
                mc.fontRendererObj.drawString(PacketTeamInfo.getPlayerScoreData(playerUsername).deaths + "", i / 2 - 7, 17, 0);
                mc.fontRendererObj.drawString(PacketTeamInfo.getPlayerScoreData(playerUsername).shekels + "", i / 2 - 7, 25, 0);
            }
            for (final KillMessage killMessage : TickHandlerClient.killMessages) {
                mc.fontRendererObj.drawString("§" + killMessage.killerName + "     §" + killMessage.killedName, i - mc.fontRendererObj.getStringWidth(killMessage.killerName + "     " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 16777215);
            }
            for (final KillMessageDumb killMessage2 : TickHandlerClient.killMessagesDumb) {
                mc.fontRendererObj.drawString("§" + killMessage2.killerName + "  somehow  killed  §" + killMessage2.killedName, i - mc.fontRendererObj.getStringWidth(killMessage2.killerName + "  somehow  killed  " + killMessage2.killedName) - 6, j - 32 - killMessage2.line * 16, 16777215);
            }
            RenderHelper.enableGUIStandardItemLighting();
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glEnable(32826);
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0f, 240.0f);
            for (final KillMessage killMessage : TickHandlerClient.killMessages) {
                drawSlotInventory(mc.fontRendererObj, new ItemStack(killMessage.weapon.item), i - mc.fontRendererObj.getStringWidth("     " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
            }
            GL11.glDisable(3042);
            RenderHelper.disableStandardItemLighting();
            mc.renderEngine.bindTexture(TickHandlerClient.offHand);
            final ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
            final PlayerData data2 = PlayerHandler.getPlayerData((EntityPlayer)mc.thePlayer, Side.CLIENT);
            if (currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).type.oneHanded) {
                for (int n3 = 0; n3 < 9; ++n3) {
                    if (data2.offHandGunSlot == n3 + 1) {
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV((double)(i / 2 - 88 + 20 * n3), (double)(j - 3), -90.0, 0.25, 0.5);
                        tessellator.addVertexWithUV((double)(i / 2 - 72 + 20 * n3), (double)(j - 3), -90.0, 0.5, 0.5);
                        tessellator.addVertexWithUV((double)(i / 2 - 72 + 20 * n3), (double)(j - 19), -90.0, 0.5, 0.0);
                        tessellator.addVertexWithUV((double)(i / 2 - 88 + 20 * n3), (double)(j - 19), -90.0, 0.25, 0.0);
                        tessellator.draw();
                    }
                    else if (data2.isValidOffHandWeapon((EntityPlayer)mc.thePlayer, n3 + 1)) {
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV((double)(i / 2 - 88 + 20 * n3), (double)(j - 3), -90.0, 0.0, 0.5);
                        tessellator.addVertexWithUV((double)(i / 2 - 72 + 20 * n3), (double)(j - 3), -90.0, 0.25, 0.5);
                        tessellator.addVertexWithUV((double)(i / 2 - 72 + 20 * n3), (double)(j - 19), -90.0, 0.25, 0.0);
                        tessellator.addVertexWithUV((double)(i / 2 - 88 + 20 * n3), (double)(j - 19), -90.0, 0.0, 0.0);
                        tessellator.draw();
                    }
                }
            }
            final EntityPlayer player = (EntityPlayer)Minecraft.getMinecraft().thePlayer;
            final ItemStack currentHeldItem = player.getCurrentEquippedItem();
            if (mc.thePlayer.ridingEntity instanceof EntitySeat && ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.heliGuiSeat) {
                final String gunnerOverlay = ((EntitySeat)mc.thePlayer.ridingEntity).driveable.getDriveableType().heliGUI;
                if (gunnerOverlay != null) {
                    FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                    GL11.glEnable(3042);
                    GL11.glDisable(2929);
                    GL11.glDepthMask(false);
                    GL11.glBlendFunc(770, 771);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    GL11.glDisable(3008);
                    mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(gunnerOverlay));
                    tessellator.startDrawingQuads();
                    tessellator.addVertexWithUV((double)(i / 2 - 2 * j), (double)j, -90.0, 0.0, 1.0);
                    tessellator.addVertexWithUV((double)(i / 2 + 2 * j), (double)j, -90.0, 1.0, 1.0);
                    tessellator.addVertexWithUV((double)(i / 2 + 2 * j), 0.0, -90.0, 1.0, 0.0);
                    tessellator.addVertexWithUV((double)(i / 2 - 2 * j), 0.0, -90.0, 0.0, 0.0);
                    tessellator.draw();
                    GL11.glDepthMask(true);
                    GL11.glEnable(2929);
                    GL11.glEnable(3008);
                    GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FMLClientHandler.instance().getClient().entityRenderer, (Object)((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.passengerZoom, new String[] { "cameraZoom", "af", "cameraZoom" });
                }
            }
            else if (mc.thePlayer.ridingEntity instanceof EntitySeat && !((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.heliGuiSeat) {
                ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FMLClientHandler.instance().getClient().entityRenderer, (Object)1, new String[] { "cameraZoom", "af", "cameraZoom" });
            }
            if (mc.thePlayer.ridingEntity instanceof EntitySeat) {
                final EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
                final Vector3f forwards = (Vector3f)ent.axes.getXAxis().normalise();
                final float speed = forwards.x * (float)ent.motionX * (forwards.x * (float)ent.motionX) + forwards.y * (float)ent.motionY * (forwards.y * (float)ent.motionY) + forwards.z * (float)ent.motionZ * (forwards.z * (float)ent.motionZ);
                final float advancedSpeed = (float)Math.sqrt(speed);
                final float cringedUniversalBuff = 1.0f;
                float Mach = 0.0f;
                int MaxSpeed = 0;
                if (advancedSpeed * cringedUniversalBuff >= 1.05 && (Math.abs(ent.motionX) > 0.2 || Math.abs(ent.motionZ) > 0.2)) {
                    Mach = 1572.6646f * (float)Math.log(advancedSpeed * cringedUniversalBuff);
                }
                else if (Math.abs(ent.motionX) > 0.2 || Math.abs(ent.motionZ) > 0.2) {
                    Mach = (float)(0.0 + Math.sqrt(speed) * cringedUniversalBuff * 74.0);
                }
                else {
                    Mach = 0.0f;
                }
                if (ent instanceof EntityPlane) {
                    final EntityPlane Planerino = (EntityPlane)ent;
                    if (Planerino.control != null) {
                        Mach = (float)(Planerino.control.V * 2.23694);
                        MaxSpeed = (int)Planerino.getPlaneType().maxSpeed;
                        if (Planerino.control.Gfactor > 4.0f && Planerino.control.Gfactor < 6.0f) {
                            mc.fontRendererObj.drawString(String.format("OVERLOAD %.0f", Planerino.control.Gfactor) + "G", 198, 72, 11875123);
                        }
                        else if (Planerino.control.Gfactor >= 6.0f) {
                            mc.fontRendererObj.drawString(String.format("EXTREME OVERLOAD %.0f", Planerino.control.Gfactor) + "G", 182, 72, 16711680);
                        }
                    }
                    else {
                        MaxSpeed = 0;
                    }
                }
                final int healthP = (int)(ent.getDriveableData().parts.get(EnumDriveablePart.core).health / (float)ent.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth * 100.0f);
                int colour2 = 0;
                if (healthP > 75) {
                    colour2 = 16777215;
                }
                else if (healthP < 75 && healthP > 50) {
                    colour2 = 65280;
                }
                else if (healthP < 50 && healthP > 25) {
                    colour2 = 14329120;
                }
                else {
                    colour2 = 16711680;
                }
                float fakeThrottle = ent.throttle;
                int colourThrottle = 0;
                if (ent.throttle < 0.5 && ent.afterBurning) {
                    colourThrottle = 16777215;
                }
                else if (ent.throttle < 0.7 && ent.throttle > 0.5 && ent.afterBurning) {
                    colourThrottle = 65280;
                }
                else if (ent.throttle < 0.9 && ent.throttle > 0.7 && ent.afterBurning) {
                    colourThrottle = 14329120;
                }
                else if (ent.throttle > 0.9 && ent.afterBurning) {
                    colourThrottle = 16711680;
                }
                else {
                    colourThrottle = 16777215;
                }
                if (Math.abs(ent.throttle) > 0.5) {
                    fakeThrottle = ent.throttle * 1.075f;
                }
                if (fakeThrottle > 1.0f) {
                    fakeThrottle = 1.0f;
                }
                if (fakeThrottle < -1.0f) {
                    fakeThrottle = -1.0f;
                }
                if (!(ent instanceof EntityMecha) && !ent.aiming) {
                    if (!(ent instanceof EntityPlane)) {
                        mc.fontRendererObj.drawString(String.format("Throttle : %.0f%%", fakeThrottle * 100.0f), 2, 2, colourThrottle);
                    }
                    else if (ent instanceof EntityPlane) {
                        final EntityPlane Plane = (EntityPlane)ent;
                        if (Plane.driveableData.landBrake > 5 && !Plane.varFlap) {
                            mc.fontRendererObj.drawString("Throttle : BRK", 2, 2, colourThrottle);
                        }
                        if ((Mach > 0.1 || Mach < -0.1) && MaxSpeed < 1) {
                            mc.fontRendererObj.drawString(String.format("Speed : %.0f", Mach) + "mph", 2, 22, 16777215);
                        }
                        else if ((Mach > 0.1 || Mach < -0.1) && MaxSpeed >= 1 && Mach <= MaxSpeed) {
                            mc.fontRendererObj.drawString(String.format("Speed : %.0f", Mach) + "mph / " + MaxSpeed + "mph", 2, 22, 16777215);
                        }
                        else if ((Mach > 0.1 || Mach < -0.1) && MaxSpeed >= 1 && Mach > MaxSpeed) {
                            mc.fontRendererObj.drawString(String.format("Speed : %.0f", Mach) + "mph / " + MaxSpeed + "mph", 2, 22, 16711680);
                        }
                        if (Mach / 767.0f > 1.0f) {
                            mc.fontRendererObj.drawString(String.format("Mach %.1f", Mach / 767.0f), 2, 32, 16777215);
                        }
                        else if (Plane.driveableData.landBrake > 5 && Plane.varFlap) {
                            mc.fontRendererObj.drawString("Throttle : BRK - flaps", 2, 2, colourThrottle);
                        }
                        else if (Plane.varFlap) {
                            mc.fontRendererObj.drawString(String.format("Throttle : %.0f%% - flaps", fakeThrottle * 100.0f), 2, 2, colourThrottle);
                        }
                        else {
                            mc.fontRendererObj.drawString(String.format("Throttle : %.0f%%", fakeThrottle * 100.0f), 2, 2, colourThrottle);
                        }
                        if (Plane.driveableData.carrierTip > 0 && !ent.mounted) {
                            mc.fontRendererObj.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.bombKey.getKeyCode()) + " to dock", 172, 62, 65280);
                        }
                    }
                }
                if (ent instanceof EntityMecha && ent.getDriveableData().panicTimer <= 0 && ent.getDriveableData().morale > 1) {
                    mc.fontRendererObj.drawString("Morale : " + ent.getDriveableData().morale, 2, 2, 16777215);
                }
                if (ent instanceof EntityMecha && ent.getDriveableData().panicTimer > 0) {
                    mc.fontRendererObj.drawString(String.format("CONTROL LOST", new Object[0]), 2, 2, 16711680);
                }
                if (!ent.epicShip && !ent.aiming) {
                    mc.fontRendererObj.drawString("Health : " + healthP + "%", 2, 12, colour2);
                }
                if (Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode())) {
                    mc.fontRendererObj.drawString(String.format("EXITING VEHICLE", new Object[0]), 2, 56, 16777215);
                }
                if (ent.epicShip) {
                    final int healthB = (int)(ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 100.0f);
                    final float notFlooding = 100 * ent.getDriveableData().notFlooding / (ent.getDriveableData().notFloodingMax + 0.1f);
                    int color = 0;
                    if (notFlooding > 75.0f) {
                        color = 16777215;
                    }
                    else if (notFlooding < 75.0f && notFlooding > 50.0f) {
                        color = 65280;
                    }
                    else if (notFlooding < 50.0f && notFlooding > 25.0f) {
                        color = 14329120;
                    }
                    else {
                        color = 16711680;
                    }
                    int kostaColor = 0;
                    if (notFlooding > 75.0f) {
                        kostaColor = 16777215;
                    }
                    else if (healthB < 75 && healthB > 50) {
                        kostaColor = 65280;
                    }
                    else if (healthB < 50 && healthB > 25) {
                        kostaColor = 14329120;
                    }
                    else {
                        kostaColor = 16711680;
                    }
                    mc.fontRendererObj.drawString("Crew : " + ent.getDriveableData().totalCrew + "/" + ent.getDriveableData().maximumCrew, 2, 12, 16777215);
                    if (notFlooding == 100.0f) {
                        mc.fontRendererObj.drawString(String.format("Flooding : None", new Object[0]), 2, 22, 16777215);
                    }
                    if (notFlooding <= 99.0f && notFlooding > 75.0f) {
                        mc.fontRendererObj.drawString(String.format("Flooding : Minor", new Object[0]), 2, 22, 65280);
                    }
                    if (notFlooding <= 75.0f && notFlooding > 40.0f) {
                        mc.fontRendererObj.drawString(String.format("Flooding : Heavy", new Object[0]), 2, 22, 65280);
                    }
                    if (notFlooding <= 40.0f && notFlooding > 10.0f) {
                        mc.fontRendererObj.drawString(String.format("Flooding : Severe", new Object[0]), 2, 22, 16711680);
                    }
                    if (notFlooding <= 10.0f) {
                        mc.fontRendererObj.drawString(String.format("Abandon Ship", new Object[0]), 2, 22, 16711680);
                    }
                    mc.fontRendererObj.drawString(String.format("Buoyancy : " + ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health, new Object[0]), 2, 32, kostaColor);
                }
                if (!(ent instanceof EntityPlane)) {
                    if (!ent.aiming) {
                        mc.fontRendererObj.drawString(String.format("Gun Pitch : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getPitch() * -1.0f), 172, 12, 16777215);
                        mc.fontRendererObj.drawString(String.format("Yaw : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getYaw()), 172, 2, 16777215);
                    }
                    final float tankYaw = ((EntitySeat)mc.thePlayer.ridingEntity).looking.getYaw();
                    String tankBarrelerino = "gui/tankerino.png";
                    if (tankYaw < 23.0f && tankYaw >= -22.0f) {
                        tankBarrelerino = "gui/0.png";
                    }
                    else if (tankYaw < 68.0f && tankYaw >= 23.0f) {
                        tankBarrelerino = "gui/45.png";
                    }
                    else if (tankYaw < 113.0f && tankYaw >= 68.0f) {
                        tankBarrelerino = "gui/90.png";
                    }
                    else if (tankYaw < 158.0f && tankYaw >= 113.0f) {
                        tankBarrelerino = "gui/135.png";
                    }
                    else if ((tankYaw < 203.0f && tankYaw >= 158.0f) || (tankYaw > -180.0f && tankYaw < -158.0f)) {
                        tankBarrelerino = "gui/180.png";
                    }
                    else if (tankYaw < -113.0f && tankYaw >= -158.0f) {
                        tankBarrelerino = "gui/225.png";
                    }
                    else if (tankYaw < -68.0f && tankYaw >= -113.0f) {
                        tankBarrelerino = "gui/270.png";
                    }
                    else if (tankYaw < -23.0f && tankYaw >= -68.0f) {
                        tankBarrelerino = "gui/315.png";
                    }
                    else {
                        tankBarrelerino = "gui/0.png";
                    }
                    if (ent.getDriveableType().showTurretIndicator) {
                        FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                        GL11.glEnable(3042);
                        GL11.glDisable(2929);
                        GL11.glDepthMask(false);
                        GL11.glBlendFunc(770, 771);
                        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        GL11.glDisable(3008);
                        mc.renderEngine.bindTexture(new ResourceLocation("flansmod", tankBarrelerino));
                        tessellator.startDrawingQuads();
                        tessellator.addVertexWithUV(i / 1.35 - 0.05 * j, 1.07 * j, -90.0, 0.0, 1.0);
                        tessellator.addVertexWithUV(i / 2.3 + 1.0 * j, 1.07 * j, -90.0, 1.0, 1.0);
                        tessellator.addVertexWithUV(i / 2.3 + 1.0 * j, 0.7 * j, -90.0, 1.0, 0.0);
                        tessellator.addVertexWithUV(i / 1.35 - 0.05 * j, 0.7 * j, -90.0, 0.0, 0.0);
                        tessellator.draw();
                        GL11.glDepthMask(true);
                        GL11.glEnable(2929);
                        GL11.glEnable(3008);
                        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                    }
                    if (ent.getDriveableType().gunRange || ((EntitySeat)mc.thePlayer.ridingEntity).calculator || ent.getDriveableType().walterMortar || ent.getDriveableType().walterGunRange || ((EntitySeat)mc.thePlayer.ridingEntity).walterCalculator) {
                        final float pitch = -1.0f * ((EntitySeat)mc.thePlayer.ridingEntity).looking.getPitch();
                        float bulletSpeed = ent.getDriveableType().bulletSpeed;
                        if (mc.thePlayer.ridingEntity instanceof EntitySeat && ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.gunType != null) {
                            bulletSpeed = ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.gunType.bulletSpeed;
                        }
                        final float A = -0.0200431f * (bulletSpeed * bulletSpeed) + -0.0190021f * bulletSpeed + 0.0121473f;
                        final float B = 1.80951f * (bulletSpeed * bulletSpeed) + 1.28548f * bulletSpeed - 0.717027f;
                        final float C = -1.71186f * (bulletSpeed * bulletSpeed) + 28.3149f * bulletSpeed - 17.7582f;
                        final float Af = -0.0154103f * (bulletSpeed * bulletSpeed) + -0.0536423f * bulletSpeed + 0.0672506f;
                        final float Bf = 1.62975f * (bulletSpeed * bulletSpeed) + 2.87832f * bulletSpeed - 3.14029f;
                        final float Cf = 0.155543f * (bulletSpeed * bulletSpeed) + 10.6558f * bulletSpeed - 3.87799f;
                        final float Am = -0.025129f * (bulletSpeed * bulletSpeed) + 0.0681265f * bulletSpeed - 0.105299f;
                        final float Bm = 2.58971f * (bulletSpeed * bulletSpeed) + -11.2084f * bulletSpeed + 16.2033f;
                        final float Cm = -609.734f * (bulletSpeed * bulletSpeed) + 460.235f * bulletSpeed - 609.734f;
                        float WalterRange = -0.3228f * (pitch * pitch) + 29.3893f * pitch - 76.1646f;
                        if (ent.getDriveableType().walterMortar) {
                            WalterRange = -0.1035f * (pitch * pitch) + 8.6336f * pitch + 53.001f;
                        }
                        final float estimatedRange = A * (pitch * pitch) + B * pitch + C;
                        final float mortarRange = Am * (pitch * pitch) + Bm * pitch + Cm;
                        final float fieldgunRange = Af * (pitch * pitch) + Bf * pitch + Cf;
                        float displayRange = 69.0f;
                        if (pitch >= 0.0f && pitch < 20.0f) {
                            displayRange = fieldgunRange * ((20.0f - pitch) / 20.0f) + estimatedRange * (pitch / 20.0f);
                        }
                        if (pitch >= 20.0f && pitch < 90.0f) {
                            displayRange = estimatedRange;
                        }
                        displayRange = WalterRange;
                        if (pitch > 0.0f) {
                            mc.fontRendererObj.drawString(String.format("Estimated Gun Range : %.0f", displayRange), 172, 62, 16777215);
                        }
                        if (displayRange > 350.0f) {
                            mc.fontRendererObj.drawString(String.format("Warning: Bullet May Freeze Outside of Render Range", new Object[0]), 172, 72, 16711680);
                        }
                        if (pitch < 15.0f) {
                            mc.fontRendererObj.drawString(String.format("Warning: Predicion Less Accurate at Low Angles", new Object[0]), 172, 82, 14329120);
                        }
                    }
                }
                if (ent instanceof EntityPlane) {
                    final EntityDriveable entP = ent;
                    if (entP.getDriveableType().hasFlare) {
                        if (entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0) {
                            mc.fontRendererObj.drawString("Flare : READY", 2, 42, 65280);
                        }
                        if (entP.ticksFlareUsing > 0) {
                            mc.fontRendererObj.drawString("Flare : Deploying", 2, 52, 16711680);
                        }
                        if (entP.flareDelay > 0) {
                            mc.fontRendererObj.drawString("Flare : Reloading", 2, 62, 14329120);
                        }
                    }
                    final Vector3f up2 = (Vector3f)entP.axes.getYAxis().normalise();
                    mc.fontRendererObj.drawString(String.format("Plane Pitch : %.1f", -1.0f * entP.axes.getPitch()) + "°", 172, 22, 16777215);
                    mc.fontRendererObj.drawString(String.format("Plane Roll : %.1f", -1.0f * entP.axes.getRoll()) + "°", 172, 12, 16777215);
                    if (entP.axes.getYaw() < 22.5 && entP.axes.getYaw() >= -22.5) {
                        mc.fontRendererObj.drawString("Compass : East", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() < 67.5 && entP.axes.getYaw() >= 22.5) {
                        mc.fontRendererObj.drawString("Compass: South-East", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() >= 67.5 && entP.axes.getYaw() < 112.5) {
                        mc.fontRendererObj.drawString("Compass : South", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() >= 112.5 && entP.axes.getYaw() < 157.5) {
                        mc.fontRendererObj.drawString("Compass : South-West", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() < -157.5 || entP.axes.getYaw() >= 157.5) {
                        mc.fontRendererObj.drawString("Compass : West", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() < -112.5 && entP.axes.getYaw() >= -157.5) {
                        mc.fontRendererObj.drawString("Compass: North-West", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() > -112.5 && entP.axes.getYaw() <= -67.5) {
                        mc.fontRendererObj.drawString("Compass : North", 172, 2, 16777215);
                    }
                    if (entP.axes.getYaw() > -67.5 && entP.axes.getYaw() <= -22.5) {
                        mc.fontRendererObj.drawString("Compass : North-East", 172, 2, 16777215);
                    }
                    final int ceiling = 0;
                    final EntityPlane entPl = (EntityPlane)entP;
                    mc.fontRendererObj.drawString(String.format("Altitude : %.0f", ((EntitySeat)mc.thePlayer.ridingEntity).posY) + "m / " + entPl.getPlaneType().ceiling + "m", 172, 32, 16777215);
                    if (entP.getDriveableType().rocketThrottle) {
                        mc.fontRendererObj.drawString("Fuel : " + entP.fuelTimer, 172, 42, 16777215);
                    }
                    if (entP.getDriveableType().labjacFuel > 10.0f) {
                        mc.fontRendererObj.drawString(String.format("Fuel : %.2f", entP.labjacFuel / 12000.0f) + " Minutes", 288, 2, 16777215);
                    }
                    if (entP.mounted) {
                        mc.fontRendererObj.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.gunKey.getKeyCode()) + " to undock", 172, 62, 16711680);
                    }
                    if (!entP.getDriveableType().epicShip) {
                        if (entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01 && !entP.worldObj.isAirBlock((int)entP.posX, (int)(entP.posY - 5.0), (int)entP.posZ)) {
                            mc.fontRendererObj.drawString("Repair Ready - Press " + Keyboard.getKeyName(KeyInputHandler.repairKey.getKeyCode()), 288, 12, 65280);
                        }
                        if ((entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle > 0.01) || (entP.ticksRepairing <= 0 && ent.throttle < -0.01)) {
                            mc.fontRendererObj.drawString("You must land to repair", 288, 12, 14329120);
                        }
                    }
                    if (entP.ticksRepairing > 0) {
                        mc.fontRendererObj.drawString("Repairing ticks: " + entP.ticksRepairing, 288, 12, 65280);
                    }
                    if (entP.currentAmmo != null && !entP.currentAmmo.isEmpty()) {
                        mc.fontRendererObj.drawString("Current Ammo ", 172, 52, 16777215);
                        mc.fontRendererObj.drawString(entP.currentAmmo, 172, 62, 2424674);
                    }
                    if (entP.getDriveableType().hasPlaneRadar && entP.activeRadar) {
                        mc.fontRendererObj.drawString("Radar Mode: ACTIVE", 288, 22, 2424674);
                    }
                    if (entP.getDriveableType().hasPlaneRadar && !entP.activeRadar) {
                        mc.fontRendererObj.drawString("Radar Mode: PASSIVE", 288, 22, 14363648);
                    }
                    if (entP.getDriveableType().hasPlaneRadar) {
                        mc.fontRendererObj.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.activeRadar.getKeyCode()) + " to toggle", 288, 32, 16748580);
                    }
                }
                if (ent instanceof EntityMecha) {
                    final DriveableData datavehicle = ent.getDriveableData();
                    final EntityDriveable entP2 = ent;
                    if (entP2.getDriveableType().hasFlare) {
                        if (entP2.ticksFlareUsing <= 0 && entP2.flareDelay <= 0 && ent.getDriveableData().panicTimer <= 0) {
                            mc.fontRendererObj.drawString("Trample : READY", 2, 32, 65280);
                        }
                        if (entP2.ticksFlareUsing > 0 && ent.getDriveableData().panicTimer <= 0) {
                            mc.fontRendererObj.drawString("Trampling", 2, 32, 16711680);
                        }
                        if (entP2.flareDelay > 0 && entP2.ticksFlareUsing <= 0 && ent.getDriveableData().panicTimer <= 0) {
                            mc.fontRendererObj.drawString("Trample : Exhausted", 2, 32, 14329120);
                        }
                    }
                    final EntityMecha entityMecha = (EntityMecha)ent;
                }
                if (ent instanceof EntityVehicle) {
                    final DriveableData datavehicle = ent.getDriveableData();
                    final EntityDriveable entP2 = ent;
                    if (entP2.getDriveableType().hasFlare && !entP2.getDriveableType().epicShip) {
                        if (entP2.ticksFlareUsing <= 0 && entP2.flareDelay <= 0) {
                            mc.fontRendererObj.drawString("Smoke : READY", 2, 62, 65280);
                        }
                        if (entP2.ticksFlareUsing > 0) {
                            mc.fontRendererObj.drawString("Smoke : Deploying", 2, 62, 16711680);
                        }
                        if (entP2.flareDelay > 0) {
                            mc.fontRendererObj.drawString("Smoke : Reloading", 2, 72, 14329120);
                        }
                    }
                    if (((EntityVehicle)entP2).getVehicleType().canRepair && !entP2.getDriveableType().epicShip) {
                        if (entP2.ticksRepairing <= 0 && entP2.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01) {
                            mc.fontRendererObj.drawString("Repair Ready - Press " + Keyboard.getKeyName(KeyInputHandler.repairKey.getKeyCode()), 2, 42, 65280);
                        }
                        if ((entP2.ticksRepairing <= 0 && entP2.flareDelay <= 0 && ent.throttle > 0.01) || (entP2.ticksRepairing <= 0 && ent.throttle < -0.01)) {
                            mc.fontRendererObj.drawString("You must be at", 2, 36, 14329120);
                            mc.fontRendererObj.drawString("0 throttle to repair!", 2, 46, 14329120);
                        }
                    }
                    if (entP2.getDriveableType().hasRadar && entP2.activeRadar) {
                        mc.fontRendererObj.drawString("Radar Mode: ACTIVE", 292, 2, 2424674);
                    }
                    if (entP2.getDriveableType().hasRadar && !entP2.activeRadar) {
                        mc.fontRendererObj.drawString("Radar Mode: PASSIVE", 292, 2, 14363648);
                    }
                    if (entP2.getDriveableType().hasRadar) {
                        mc.fontRendererObj.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.activeRadar.getKeyCode()) + " to toggle", 292, 12, 16748580);
                    }
                    if (entP2.getDriveableType().shootDelayPrimary > 30) {
                        if (entP2.ticksRepairing > 0) {
                            mc.fontRendererObj.drawString("Repairing ticks: " + entP2.ticksRepairing, 2, 42, 65280);
                        }
                        if (entP2.recoilTimer > 1) {
                            mc.fontRendererObj.drawString(String.format("Reload Time: %.1f", entP2.recoilTimer / 20.0f) + " seconds", 172, 22, 16711680);
                        }
                        else if (entP2.recoilTimer <= 0) {
                            mc.fontRendererObj.drawString("Shell : Ready", 172, 22, 65280);
                        }
                    }
                    if (entP2.currentAmmo != null && !entP2.currentAmmo.equals("")) {
                        mc.fontRendererObj.drawString("Current Ammo ", 172, 32, 16777215);
                        mc.fontRendererObj.drawString(entP2.currentAmmo, 172, 42, 2424674);
                    }
                    if (entP2.getDriveableType().hasFlare && entP2.getDriveableType().epicShip) {
                        if (entP2.ticksFlareUsing <= 0 && entP2.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01) {
                            mc.fontRendererObj.drawString("Damage Control : READY", 2, 42, 65280);
                        }
                        if ((entP2.ticksFlareUsing <= 0 && entP2.flareDelay <= 0 && ent.throttle > 0.01) || (entP2.ticksFlareUsing <= 0 && entP2.flareDelay <= 0 && ent.throttle < -0.01)) {
                            mc.fontRendererObj.drawString("You must be at 0 throttle to Repair!", 2, 42, 14329120);
                        }
                        if (entP2.ticksFlareUsing > 0) {
                            mc.fontRendererObj.drawString("Damage Control : Repairing", 2, 42, 16711680);
                        }
                        if (entP2.flareDelay > 0 && entP2.ticksFlareUsing <= 0) {
                            mc.fontRendererObj.drawString("Damage Control : Resting", 2, 42, 14329120);
                        }
                    }
                    if (entP2.getDriveableType().hasAPS) {
                        if (entP2.APSdelay <= 5) {
                            mc.fontRendererObj.drawString("APS : READY", 2, 52, 65280);
                        }
                        if (entP2.APSdelay > 5) {
                            mc.fontRendererObj.drawString("APS : Reloading", 2, 52, 14329120);
                        }
                    }
                    final DriveableType allah = ((EntityVehicle)ent).getVehicleType();
                    if (mc.thePlayer != null) {
                        final ItemStack stack3 = mc.thePlayer.inventory.armorInventory[3];
                        String overlayTexture2 = null;
                        if (allah.hasScope && ent.aiming) {
                            overlayTexture2 = allah.overlay;
                            ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FMLClientHandler.instance().getClient().entityRenderer, (Object)allah.gunsightZoom, new String[] { "cameraZoom", "af", "cameraZoom" });
                        }
                        if (allah.hasScope && !ent.aiming) {
                            overlayTexture2 = null;
                            ObfuscationReflectionHelper.setPrivateValue((Class)EntityRenderer.class, (Object)FMLClientHandler.instance().getClient().entityRenderer, (Object)1, new String[] { "cameraZoom", "af", "cameraZoom" });
                        }
                        if (overlayTexture2 != null) {
                            FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
                            GL11.glEnable(3042);
                            GL11.glDisable(2929);
                            GL11.glDepthMask(false);
                            GL11.glBlendFunc(770, 771);
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                            GL11.glDisable(3008);
                            mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture2));
                            tessellator.startDrawingQuads();
                            tessellator.addVertexWithUV((double)(i / 2 - 2 * j), (double)j, -90.0, 0.0, 1.0);
                            tessellator.addVertexWithUV((double)(i / 2 + 2 * j), (double)j, -90.0, 1.0, 1.0);
                            tessellator.addVertexWithUV((double)(i / 2 + 2 * j), 0.0, -90.0, 1.0, 0.0);
                            tessellator.addVertexWithUV((double)(i / 2 - 2 * j), 0.0, -90.0, 0.0, 0.0);
                            tessellator.draw();
                            GL11.glDepthMask(true);
                            GL11.glEnable(2929);
                            GL11.glEnable(3008);
                            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
                        }
                    }
                    if (((EntityVehicle)ent).getVehicleType().airship) {
                        mc.fontRendererObj.drawString(String.format("Diving Throttle : %.0f%%", ent.divingFactor * 100.0f), 172, 32, 16777215);
                    }
                    if (((EntityVehicle)ent).getVehicleType().canDive) {
                        mc.fontRendererObj.drawString(String.format("Diving Throttle : %.0f%%", ent.divingFactor * 100.0f), 172, 52, 16777215);
                        if (!((EntityVehicle)entP2).getVehicleType().unlimitedOxygen) {
                            mc.fontRendererObj.drawString("Oxygen (Seconds) : " + ent.oxygenMeter / 160.0f, 172, 62, colour2);
                        }
                        if (((EntityVehicle)entP2).getVehicleType().unlimitedOxygen) {
                            mc.fontRendererObj.drawString("Unlimited Oxygen", 172, 62, colour2);
                        }
                        final int poopooDepth = (int)(TeamsManager.seaLevel - entP2.posY);
                        if (poopooDepth > 0) {
                            mc.fontRendererObj.drawString("Depth : " + poopooDepth, 2, 72, colour2);
                            if (poopooDepth / allah.maxDepth > 0.7) {
                                mc.fontRendererObj.drawString("WARNING : Aproaching Max Depth", 172, 82, 14329120);
                            }
                            if (poopooDepth / allah.maxDepth > 0.9) {
                                mc.fontRendererObj.drawString("DANGER : COLLAPSE IMMINENT", 172, 92, 16711680);
                            }
                        }
                    }
                    if (ent.getDriveableType().showReload) {
                        if (datavehicle.fakeReloadShell > 40.0f) {
                            mc.fontRendererObj.drawString("First Shot Delay (Seconds) : " + (datavehicle.fakeReloadShell - 20.0f) / 20.0f, 2, 62, 14329120);
                        }
                        if (datavehicle.fakeReloadMissile > 40.0f) {
                            mc.fontRendererObj.drawString("First Shot Delay (Seconds) : " + (datavehicle.fakeReloadMissile - 20.0f) / 20.0f, 2, 72, 14329120);
                        }
                    }
                    if (((EntityVehicle)ent).getVehicleType().shootWithOpenDoor) {
                        if (((EntityVehicle)ent).varDoor) {
                            mc.fontRendererObj.drawString("Weapon : READY", 2, 62, 65280);
                            mc.fontRendererObj.drawString("[" + Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode()) + " to disable]", 100, 62, 65280);
                        }
                        if (!((EntityVehicle)ent).varDoor) {
                            mc.fontRendererObj.drawString("Weapon : DISABLED", 2, 62, 16711680);
                            mc.fontRendererObj.drawString("[" + Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode()) + " to activate]", 100, 62, 16711680);
                        }
                    }
                }
                if (FlansMod.DEBUG && !ent.epicShip) {
                    mc.fontRendererObj.drawString("MotionX : " + ent.motionX, 2, 32, 16777215);
                    mc.fontRendererObj.drawString("MotionY : " + ent.motionY, 2, 42, 16777215);
                    mc.fontRendererObj.drawString("MotionZ : " + ent.motionZ, 2, 52, 16777215);
                    mc.fontRendererObj.drawString("Break Blocks : " + TeamsManager.driveablesBreakBlocks, 2, 62, 16777215);
                }
            }
        }
    }
    
    @SubscribeEvent
    public void renderTick(final TickEvent.RenderTickEvent event) {
        switch (event.phase) {
            case START: {
                RenderGun.smoothing = event.renderTickTime;
                this.renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
                break;
            }
            case END: {
                this.renderTickEnd(Minecraft.getMinecraft());
                break;
            }
        }
    }
    
    @SubscribeEvent
    public void clientTick(final TickEvent.ClientTickEvent event) {
        switch (event.phase) {
            case START: {
                this.clientTickStart(Minecraft.getMinecraft());
                break;
            }
            case END: {
                this.clientTickEnd(Minecraft.getMinecraft());
                break;
            }
        }
    }
    
    public void clientTickStart(final Minecraft mc) {
        if (Minecraft.getMinecraft() != null && Minecraft.getMinecraft().thePlayer != null) {
            final Entity ridden = Minecraft.getMinecraft().thePlayer.ridingEntity;
            if (TickHandlerClient.lastMount != null && ridden == null) {
                FlansMod.getPacketHandler().sendToServer(new PacketChecker());
            }
            if ((TickHandlerClient.lastMount = ridden) != null) {
                FlansMod.lastRidden = ridden;
            }
        }
        if (this.tickcount > 0) {
            --this.tickcount;
        }
        if (this.tickcountWounded > 0) {
            --this.tickcountWounded;
        }
        if (FlansMod.ticker % TickHandlerClient.lightOverrideRefreshRate == 0 && mc.theWorld != null) {
            TickHandlerClient.lightOverrideRefreshRate = (mc.gameSettings.fancyGraphics ? 10 : 20);
            for (final Vector3i v : TickHandlerClient.blockLightOverrides) {
                mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
            }
            TickHandlerClient.blockLightOverrides.clear();
            for (final Object obj : mc.theWorld.playerEntities) {
                final EntityPlayer player = (EntityPlayer)obj;
                final ItemStack currentHeldItem = player.getCurrentEquippedItem();
                if (currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun) {
                    final GunType type = ((ItemGun)currentHeldItem.getItem()).type;
                    final AttachmentType grip = type.getGrip(currentHeldItem);
                    if (grip != null && grip.flashlight) {
                        for (int i = 0; i < 2; ++i) {
                            final MovingObjectPosition ray = player.rayTrace((double)(grip.flashlightRange / 2.0f * (i + 1)), 1.0f);
                            if (ray != null) {
                                int x = ray.blockX;
                                int y = ray.blockY;
                                int z = ray.blockZ;
                                final int side = ray.sideHit;
                                switch (side) {
                                    case 0: {
                                        --y;
                                        break;
                                    }
                                    case 1: {
                                        ++y;
                                        break;
                                    }
                                    case 2: {
                                        --z;
                                        break;
                                    }
                                    case 3: {
                                        ++z;
                                        break;
                                    }
                                    case 4: {
                                        --x;
                                        break;
                                    }
                                    case 5: {
                                        ++x;
                                        break;
                                    }
                                }
                                TickHandlerClient.blockLightOverrides.add(new Vector3i(x, y, z));
                                mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 12);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
                                mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
                            }
                        }
                    }
                    if (!type.matchlock) {
                        continue;
                    }
                    for (int i = 0; i < 2; ++i) {
                        final MovingObjectPosition ray = player.rayTrace((double)(2.0f * (i + 1)), 1.0f);
                        if (ray != null) {
                            int x = ray.blockX;
                            int y = ray.blockY;
                            int z = ray.blockZ;
                            final int side = ray.sideHit;
                            switch (side) {
                                case 0: {
                                    --y;
                                    break;
                                }
                                case 1: {
                                    ++y;
                                    break;
                                }
                                case 2: {
                                    --z;
                                    break;
                                }
                                case 3: {
                                    ++z;
                                    break;
                                }
                                case 4: {
                                    --x;
                                    break;
                                }
                                case 5: {
                                    ++x;
                                    break;
                                }
                            }
                            TickHandlerClient.blockLightOverrides.add(new Vector3i(x, y, z));
                            mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 15);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
                            mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
                        }
                    }
                }
            }
            for (final Object obj : mc.theWorld.loadedEntityList) {
                if (obj instanceof EntityLiving && Minecraft.getMinecraft().entityRenderer.isShaderActive()) {
                    final EntityLiving bullet = (EntityLiving)obj;
                    bullet.getBrightnessForRender(1.572888E7f);
                    if (obj instanceof EntityPlayer) {
                        final EntityPlayer human = (EntityPlayer)obj;
                        human.getBrightnessForRender(1.572888E7f);
                        final int x2 = MathHelper.floor_double(human.posX);
                        final int y2 = MathHelper.floor_double(human.posY);
                        final int z2 = MathHelper.floor_double(human.posZ);
                        TickHandlerClient.blockLightOverrides.add(new Vector3i(x2, y2, z2));
                        mc.theWorld.setLightValue(EnumSkyBlock.Block, x2, y2, z2, 10);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2, y2 + 1, z2);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2, y2 - 1, z2);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2 + 1, y2, z2);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2 - 1, y2, z2);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2, y2, z2 + 1);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x2, y2, z2 - 1);
                    }
                }
                if (obj instanceof EntityBullet) {
                    final EntityBullet bullet2 = (EntityBullet)obj;
                    if (!bullet2.isDead && bullet2.type.hasLight) {
                        continue;
                    }
                    if (!bullet2.isDead || bullet2.type.hasLight) {}
                }
                else {
                    if (!(obj instanceof EntityMecha)) {
                        continue;
                    }
                    final EntityMecha mecha = (EntityMecha)obj;
                    final int x3 = MathHelper.floor_double(mecha.posX);
                    final int y3 = MathHelper.floor_double(mecha.posY);
                    final int z3 = MathHelper.floor_double(mecha.posZ);
                    if (mecha.lightLevel() > 0) {
                        TickHandlerClient.blockLightOverrides.add(new Vector3i(x3, y3, z3));
                        mc.theWorld.setLightValue(EnumSkyBlock.Block, x3, y3, z3, Math.max(mc.theWorld.getBlockLightValue(x3, y3, z3), mecha.lightLevel()));
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3 + 1, y3, z3);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3 - 1, y3 + 1, z3);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3, y3 + 1, z3);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3, y3 - 1, z3);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3, y3, z3 + 1);
                        mc.theWorld.updateLightByType(EnumSkyBlock.Block, x3, y3, z3 - 1);
                    }
                    if (!mecha.forceDark()) {
                        continue;
                    }
                    for (int i = -3; i <= 3; ++i) {
                        for (int j = -3; j <= 3; ++j) {
                            for (int k = -3; k <= 3; ++k) {
                                final int xd = i + x3;
                                final int yd = j + y3;
                                final int zd = k + z3;
                                TickHandlerClient.blockLightOverrides.add(new Vector3i(xd, yd, zd));
                                mc.theWorld.setLightValue(EnumSkyBlock.Sky, xd, yd, zd, Math.abs(i) + Math.abs(j) + Math.abs(k));
                            }
                        }
                    }
                }
            }
        }
        if (FlansMod.ticker % TickHandlerClient.vehicleLightOverrideRefreshRate == 0 && mc.theWorld != null) {
            TickHandlerClient.vehicleLightOverrideRefreshRate = (mc.gameSettings.fancyGraphics ? 1 : 2);
            for (final Vector3i v : TickHandlerClient.vehicleLightOverrides) {
                mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
            }
            TickHandlerClient.vehicleLightOverrides.clear();
        }
    }
    
    public void clientTickEnd(final Minecraft minecraft) {
        for (int i = 0; i < TickHandlerClient.killMessages.size(); ++i) {
            final KillMessage killMessage = TickHandlerClient.killMessages.get(i);
            --killMessage.timer;
            if (TickHandlerClient.killMessages.get(i).timer == 0) {
                TickHandlerClient.killMessages.remove(i);
            }
        }
        RenderFlag.angle += 2.0f;
        FlansModClient.tick();
    }
    
    public void renderTickStart(final Minecraft mc, final float smoothing) {
        if (mc.currentScreen == null && FlansModClient.controlModeMouse) {
            final MouseHelper mouse = mc.mouseHelper;
            final Entity ridden = mc.thePlayer.ridingEntity;
            if (ridden instanceof EntityDriveable) {
                final EntityDriveable entity = (EntityDriveable)ridden;
                entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
            }
        }
        FlansModClient.renderTick(smoothing);
        if (mc.currentScreen instanceof GuiDriveableController) {
            TickHandlerClient.guiDriveableController = mc.currentScreen;
            mc.currentScreen = null;
        }
        else {
            TickHandlerClient.guiDriveableController = null;
        }
    }
    
    public void renderTickEnd(final Minecraft mc) {
        if (mc.currentScreen == null && TickHandlerClient.guiDriveableController != null) {
            mc.currentScreen = TickHandlerClient.guiDriveableController;
            TickHandlerClient.guiDriveableController = null;
        }
        final Tessellator tessellator = Tessellator.instance;
        final ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
        final int i = scaledresolution.getScaledWidth();
        final int j = scaledresolution.getScaledHeight();
        if (FlansModClient.isInFlash) {
            this.isInFlash = true;
            this.flashTime = FlansModClient.flashTime;
            this.tickcountflash = 0;
            FlansModClient.isInFlash = false;
            FlansModClient.flashTime = 0;
        }
        if (this.isInFlash && this.tickcountflash < this.flashTime) {
            FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glDepthMask(false);
            GL11.glBlendFunc(770, 771);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glDisable(3008);
            mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/flash.png"));
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV((double)(i / 2 - 2 * j), (double)j, -90.0, 0.0, 1.0);
            tessellator.addVertexWithUV((double)(i / 2 + 2 * j), (double)j, -90.0, 1.0, 1.0);
            tessellator.addVertexWithUV((double)(i / 2 + 2 * j), 0.0, -90.0, 1.0, 0.0);
            tessellator.addVertexWithUV((double)(i / 2 - 2 * j), 0.0, -90.0, 0.0, 0.0);
            tessellator.draw();
            GL11.glDepthMask(true);
            GL11.glEnable(2929);
            GL11.glEnable(3008);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            ++this.tickcountflash;
        }
        else {
            this.isInFlash = false;
            this.flashTime = 0;
            this.tickcountflash = 0;
        }
    }
    
    private static void drawSlotInventory(final FontRenderer fontRenderer, final ItemStack itemstack, final int i, final int j) {
        if (itemstack == null || itemstack.getItem() == null) {
            return;
        }
        TickHandlerClient.itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
        TickHandlerClient.itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
    }
    
    public static void addKillMessage(final boolean headshot, final InfoType infoType, final int itmDmg, final String killer, final String killed) {
        for (final KillMessage killMessage2 : TickHandlerClient.killMessages) {
            final KillMessage killMessage = killMessage2;
            ++killMessage2.line;
            if (killMessage.line > 10) {
                killMessage.timer = 0;
            }
        }
        TickHandlerClient.killMessages.add(new KillMessage(headshot, infoType, itmDmg, killer, killed));
    }
    
    public static void addKillMessageDumb(final String killer, final String killed) {
        for (final KillMessage killMessage2 : TickHandlerClient.killMessages) {
            final KillMessage killMessage = killMessage2;
            ++killMessage2.line;
            if (killMessage.line > 10) {
                killMessage.timer = 0;
            }
        }
        TickHandlerClient.killMessagesDumb.add(new KillMessageDumb(killer, killed));
    }
    
    static {
        offHand = new ResourceLocation("flansmod", "gui/offHand.png");
        TickHandlerClient.blockLightOverrides = new ArrayList<Vector3i>();
        TickHandlerClient.vehicleLightOverrides = new ArrayList<Vector3i>();
        TickHandlerClient.lightOverrideRefreshRate = 5;
        TickHandlerClient.vehicleLightOverrideRefreshRate = 1;
        TickHandlerClient.guiDriveableController = null;
        TickHandlerClient.cringeBlood = 100.0f;
        TickHandlerClient.cringeHemorrhaging = 0.0f;
        TickHandlerClient.killsTotal = 0;
        TickHandlerClient.itemRenderer = new RenderItem();
        TickHandlerClient.killMessages = new ArrayList<KillMessage>();
        TickHandlerClient.killMessagesDumb = new ArrayList<KillMessageDumb>();
    }
    
    private static class KillMessageDumb
    {
        public String killerName;
        public String killedName;
        public int timer;
        public int line;
        
        public KillMessageDumb(final String killer, final String killed) {
            this.killerName = killer;
            this.killedName = killed;
            this.line = 0;
            this.timer = 200;
        }
    }
    
    private static class KillMessage
    {
        public String killerName;
        public String killedName;
        public InfoType weapon;
        public int itemDamage;
        public int timer;
        public int line;
        public boolean headshot;
        
        public KillMessage(final boolean head, final InfoType infoType, final int itmDmg, final String killer, final String killed) {
            this.headshot = head;
            this.killerName = killer;
            this.killedName = killed;
            this.weapon = infoType;
            this.itemDamage = itmDmg;
            this.line = 0;
            this.timer = 200;
        }
    }
}
