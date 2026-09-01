// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.util.ResourceLocation;
import com.flansmod.common.teams.ItemTeamArmour;
import net.minecraft.potion.Potion;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBiped;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.guns.AttachmentType;
import net.minecraft.util.MathHelper;
import com.flansmod.common.guns.EnumFireMode;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.ItemShootable;
import java.util.Random;
import com.flansmod.common.guns.IScope;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.item.EntityItem;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.PlayerData;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.PlayerHandler;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.client.FlansModClient;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.RenderBlocks;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraftforge.client.IItemRenderer;

public class RenderGun implements IItemRenderer
{
    private static TextureManager renderEngine;
    public static float smoothing;
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case ENTITY: {
                if (!Minecraft.func_71410_x().field_71474_y.field_74347_j) {
                    return false;
                }
                return item != null && item.func_77973_b() instanceof ItemGun && ((ItemGun)item.func_77973_b()).type.model != null;
            }
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON: {
                return item != null && item.func_77973_b() instanceof ItemGun && ((ItemGun)item.func_77973_b()).type.model != null;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return false;
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        if (!(item.func_77973_b() instanceof ItemGun)) {
            return;
        }
        final RenderBlocks renderBlocks = (RenderBlocks)data[0];
        final GunType gunType = ((ItemGun)item.func_77973_b()).type;
        if (gunType == null) {
            return;
        }
        final ModelGun model = gunType.model;
        if (model == null) {
            return;
        }
        final GunAnimations animations = (type == IItemRenderer.ItemRenderType.ENTITY) ? new GunAnimations() : FlansModClient.getGunAnimations((EntityLivingBase)data[1], false);
        this.renderGun(type, item, gunType, animations, false, data);
        if (gunType.oneHanded && type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
            final EntityLivingBase entity = (EntityLivingBase)data[1];
            if (entity instanceof EntityPlayer) {
                final EntityPlayer player = (EntityPlayer)entity;
                final PlayerData playerData = PlayerHandler.getPlayerData(player, Side.CLIENT);
                if (playerData.offHandGunSlot != 0) {
                    GunAnimations animations2 = FlansModClient.gunAnimationsLeft.get(data[1]);
                    if (animations2 == null) {
                        animations2 = new GunAnimations();
                        FlansModClient.gunAnimationsLeft.put((EntityLivingBase)data[1], animations2);
                    }
                    final ItemStack offHandItem = player.field_71071_by.func_70301_a(playerData.offHandGunSlot - 1);
                    if (offHandItem == null || !(offHandItem.func_77973_b() instanceof ItemGun)) {
                        return;
                    }
                    final GunType offHandGunType = ((ItemGun)offHandItem.func_77973_b()).type;
                    if (!offHandGunType.oneHanded) {
                        return;
                    }
                    this.renderGun(type, offHandItem, offHandGunType, animations2, true, data);
                }
            }
        }
    }
    
    public void renderOffHandGun(final EntityPlayer player, final ItemStack offHandItemStack) {
        GunAnimations animations = FlansModClient.gunAnimationsLeft.get(player);
        if (animations == null) {
            animations = new GunAnimations();
            FlansModClient.gunAnimationsLeft.put((EntityLivingBase)player, animations);
        }
        final GunType offHandGunType = ((ItemGun)offHandItemStack.func_77973_b()).type;
        if (!offHandGunType.oneHanded) {
            return;
        }
        this.renderGun(IItemRenderer.ItemRenderType.EQUIPPED, offHandItemStack, offHandGunType, animations, true, player);
    }
    
    private void renderGun(final IItemRenderer.ItemRenderType type, final ItemStack item, final GunType gunType, final GunAnimations animations, final boolean offHand, final Object... data) {
        final float f = 0.0625f;
        final ModelGun model = gunType.model;
        final int flip = offHand ? -1 : 1;
        GL11.glPushMatrix();
        float reloadRotate = 0.0f;
        switch (type) {
            case ENTITY: {
                final EntityItem entity = (EntityItem)data[1];
                GL11.glRotatef(entity.field_70292_b + ((entity.field_70292_b == 0) ? 0.0f : RenderGun.smoothing), 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(-0.2f + model.itemFrameOffset.x, 0.2f + model.itemFrameOffset.y, 0.1f + model.itemFrameOffset.z);
                break;
            }
            case EQUIPPED: {
                if (offHand) {
                    GL11.glRotatef(-70.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(48.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(105.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glTranslatef(-0.1f, -0.22f, -0.15f);
                }
                else {
                    GL11.glRotatef(35.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glTranslatef(0.75f, -0.22f, -0.08f);
                    GL11.glScalef(1.0f, 1.0f, -1.0f);
                }
                GL11.glTranslatef(model.thirdPersonOffset.x, model.thirdPersonOffset.y, model.thirdPersonOffset.z);
                break;
            }
            case EQUIPPED_FIRST_PERSON: {
                final IScope scope = gunType.getCurrentScope(item);
                if (FlansModClient.zoomProgress > 0.9f && scope.hasZoomOverlay()) {
                    GL11.glPopMatrix();
                    return;
                }
                final float adsSwitch = FlansModClient.lastZoomProgress + (FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) * RenderGun.smoothing;
                if (offHand) {
                    GL11.glTranslatef(0.0f, 0.03f, -0.76f);
                    GL11.glRotatef(23.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(-4.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glTranslatef(0.15f, 0.2f, -0.6f);
                }
                GL11.glRotatef(25.0f - 5.0f * adsSwitch, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-15.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(10.0f * adsSwitch, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(0.0f, 0.0275f, -0.1f);
                GL11.glTranslatef(0.15f - gunType.dillZoomModifier * 0.2f * adsSwitch, 0.2f + gunType.dillElevator * 0.13f * adsSwitch, -0.6f - 0.305f * adsSwitch);
                if (gunType.hasScopeOverlay) {
                    GL11.glTranslatef(-0.3f * adsSwitch, 0.0f, 0.0f);
                }
                GL11.glRotatef(4.5f * adsSwitch, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(-0.0f, -0.03f * adsSwitch, 0.0f);
                if (animations.switchAnimationProgress > 0.0f && animations.switchAnimationLength > 0.0f) {
                    final Vector3f pos1 = new Vector3f(0.0f, -0.4f, 0.0f);
                    final Vector3f pos2 = new Vector3f(0.0f, 0.0f, 0.0f);
                    final Vector3f startAngles = new Vector3f(90.0f, 30.0f, -40.0f);
                    final Vector3f endAngles = new Vector3f(0.0f, 0.0f, 0.0f);
                    final float interp = (animations.switchAnimationProgress + RenderGun.smoothing) / animations.switchAnimationLength;
                    GL11.glTranslatef(pos2.x + (pos2.x - pos1.x) * interp, pos1.y + (pos2.y - pos1.y) * interp, pos1.z + (pos2.z - pos1.z) * interp);
                    GL11.glRotatef(startAngles.y + (endAngles.y - startAngles.y) * interp, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(startAngles.z + (endAngles.z - startAngles.z) * interp, 0.0f, 0.0f, 1.0f);
                }
                if (animations.meleeAnimationProgress > 0 && animations.meleeAnimationProgress < gunType.meleePath.size()) {
                    final Vector3f meleePos = gunType.meleePath.get(animations.meleeAnimationProgress);
                    final Vector3f nextMeleePos = (animations.meleeAnimationProgress + 1 < gunType.meleePath.size()) ? gunType.meleePath.get(animations.meleeAnimationProgress + 1) : new Vector3f();
                    GL11.glTranslatef(meleePos.x + (nextMeleePos.x - meleePos.x) * RenderGun.smoothing, meleePos.y + (nextMeleePos.y - meleePos.y) * RenderGun.smoothing, meleePos.z + (nextMeleePos.z - meleePos.z) * RenderGun.smoothing);
                    final Vector3f meleeAngles = gunType.meleePathAngles.get(animations.meleeAnimationProgress);
                    final Vector3f nextMeleeAngles = (animations.meleeAnimationProgress + 1 < gunType.meleePathAngles.size()) ? gunType.meleePathAngles.get(animations.meleeAnimationProgress + 1) : new Vector3f();
                    GL11.glRotatef(meleeAngles.y + (nextMeleeAngles.y - meleeAngles.y) * RenderGun.smoothing, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(meleeAngles.z + (nextMeleeAngles.z - meleeAngles.z) * RenderGun.smoothing, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(meleeAngles.x + (nextMeleeAngles.x - meleeAngles.x) * RenderGun.smoothing, 1.0f, 0.0f, 0.0f);
                }
                if (animations.meleeLeftAnimationProgress > 0 && animations.meleeLeftAnimationProgress < gunType.meleeLeftPath.size()) {
                    final Vector3f meleeLeftPos = gunType.meleeLeftPath.get(animations.meleeLeftAnimationProgress);
                    final Vector3f nextMeleePos = (animations.meleeLeftAnimationProgress + 1 < gunType.meleeLeftPath.size()) ? gunType.meleeLeftPath.get(animations.meleeLeftAnimationProgress + 1) : new Vector3f();
                    GL11.glTranslatef(meleeLeftPos.x + (nextMeleePos.x - meleeLeftPos.x) * RenderGun.smoothing, meleeLeftPos.y + (nextMeleePos.y - meleeLeftPos.y) * RenderGun.smoothing, meleeLeftPos.z + (nextMeleePos.z - meleeLeftPos.z) * RenderGun.smoothing);
                    final Vector3f meleeLeftAngles = gunType.meleeLeftPathAngles.get(animations.meleeLeftAnimationProgress);
                    final Vector3f nextMeleeAngles = (animations.meleeLeftAnimationProgress + 1 < gunType.meleeLeftPathAngles.size()) ? gunType.meleeLeftPathAngles.get(animations.meleeLeftAnimationProgress + 1) : new Vector3f();
                    GL11.glRotatef(meleeLeftAngles.y + (nextMeleeAngles.y - meleeLeftAngles.y) * RenderGun.smoothing, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(meleeLeftAngles.z + (nextMeleeAngles.z - meleeLeftAngles.z) * RenderGun.smoothing, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(meleeLeftAngles.x + (nextMeleeAngles.x - meleeLeftAngles.x) * RenderGun.smoothing, 1.0f, 0.0f, 0.0f);
                }
                else if (animations.meleeRightAnimationProgress > 0 && animations.meleeRightAnimationProgress < gunType.meleeRightPath.size()) {
                    final Vector3f meleeRightPos = gunType.meleeRightPath.get(animations.meleeRightAnimationProgress);
                    final Vector3f nextMeleePos = (animations.meleeRightAnimationProgress + 1 < gunType.meleeRightPath.size()) ? gunType.meleeRightPath.get(animations.meleeRightAnimationProgress + 1) : new Vector3f();
                    GL11.glTranslatef(meleeRightPos.x + (nextMeleePos.x - meleeRightPos.x) * RenderGun.smoothing, meleeRightPos.y + (nextMeleePos.y - meleeRightPos.y) * RenderGun.smoothing, meleeRightPos.z + (nextMeleePos.z - meleeRightPos.z) * RenderGun.smoothing);
                    final Vector3f meleeRightAngles = gunType.meleeRightPathAngles.get(animations.meleeRightAnimationProgress);
                    final Vector3f nextMeleeAngles = (animations.meleeRightAnimationProgress + 1 < gunType.meleeRightPathAngles.size()) ? gunType.meleeRightPathAngles.get(animations.meleeRightAnimationProgress + 1) : new Vector3f();
                    GL11.glRotatef(meleeRightAngles.y + (nextMeleeAngles.y - meleeRightAngles.y) * RenderGun.smoothing, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(meleeRightAngles.z + (nextMeleeAngles.z - meleeRightAngles.z) * RenderGun.smoothing, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(meleeRightAngles.x + (nextMeleeAngles.x - meleeRightAngles.x) * RenderGun.smoothing, 1.0f, 0.0f, 0.0f);
                }
                else if (animations.meleeDownAnimationProgress > 0 && animations.meleeDownAnimationProgress < gunType.meleeDownPath.size()) {
                    final Vector3f meleeDownPos = gunType.meleeDownPath.get(animations.meleeDownAnimationProgress);
                    final Vector3f nextMeleePos = (animations.meleeDownAnimationProgress + 1 < gunType.meleeDownPath.size()) ? gunType.meleeDownPath.get(animations.meleeDownAnimationProgress + 1) : new Vector3f();
                    GL11.glTranslatef(meleeDownPos.x + (nextMeleePos.x - meleeDownPos.x) * RenderGun.smoothing, meleeDownPos.y + (nextMeleePos.y - meleeDownPos.y) * RenderGun.smoothing, meleeDownPos.z + (nextMeleePos.z - meleeDownPos.z) * RenderGun.smoothing);
                    final Vector3f meleeDownAngles = gunType.meleeDownPathAngles.get(animations.meleeDownAnimationProgress);
                    final Vector3f nextMeleeAngles = (animations.meleeDownAnimationProgress + 1 < gunType.meleeDownPathAngles.size()) ? gunType.meleeDownPathAngles.get(animations.meleeDownAnimationProgress + 1) : new Vector3f();
                    GL11.glRotatef(meleeDownAngles.y + (nextMeleeAngles.y - meleeDownAngles.y) * RenderGun.smoothing, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(meleeDownAngles.z + (nextMeleeAngles.z - meleeDownAngles.z) * RenderGun.smoothing, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(meleeDownAngles.x + (nextMeleeAngles.x - meleeDownAngles.x) * RenderGun.smoothing, 1.0f, 0.0f, 0.0f);
                }
                if (model.spinningCocking) {
                    GL11.glTranslatef(model.spinPoint.x, model.spinPoint.y, model.spinPoint.z);
                    final float pumped = animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing;
                    GL11.glRotatef(pumped * 180.0f + 180.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(-model.spinPoint.x, -model.spinPoint.y, -model.spinPoint.z);
                }
                if (animations.reloading) {
                    EnumAnimationType anim = model.animationType;
                    if (gunType.getGrip(item) != null && gunType.getSecondaryFire(item)) {
                        anim = gunType.getGrip(item).model.secondaryAnimType;
                    }
                    final float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * RenderGun.smoothing;
                    reloadRotate = 1.0f;
                    if (effectiveReloadAnimationProgress < model.tiltGunTime) {
                        reloadRotate = effectiveReloadAnimationProgress / model.tiltGunTime;
                    }
                    if (effectiveReloadAnimationProgress > model.tiltGunTime + model.unloadClipTime + model.loadClipTime) {
                        reloadRotate = 1.0f - (effectiveReloadAnimationProgress - (model.tiltGunTime + model.unloadClipTime + model.loadClipTime)) / model.untiltGunTime;
                    }
                    switch (anim) {
                        case BOTTOM_CLIP:
                        case PISTOL_CLIP:
                        case SHOTGUN:
                        case END_LOADED: {
                            GL11.glRotatef(60.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(30.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.25f * reloadRotate, 0.0f, 0.0f);
                            break;
                        }
                        case CROSSBOW: {
                            GL11.glRotatef(60.0f * reloadRotate, 0.0f, 0.0f, -1.0f);
                            GL11.glTranslatef(0.25f * reloadRotate, 0.0f, 0.0f);
                            break;
                        }
                        case CUSTOMBOTTOM_CLIP:
                        case CUSTOMPISTOL_CLIP:
                        case CUSTOMSHOTGUN:
                        case CUSTOMEND_LOADED: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case BACK_LOADED: {
                            GL11.glRotatef(-75.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(-30.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.5f * reloadRotate, 0.0f, 0.0f);
                            break;
                        }
                        case CUSTOMBACK_LOADED: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case BULLPUP: {
                            GL11.glRotatef(70.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(10.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.5f * reloadRotate, -0.2f * reloadRotate, 0.0f);
                            break;
                        }
                        case CUSTOMBULLPUP: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case RIFLE: {
                            GL11.glRotatef(30.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(-30.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.5f * reloadRotate, 0.0f, -0.5f * reloadRotate);
                            break;
                        }
                        case CUSTOMRIFLE: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case RIFLE_TOP: {
                            GL11.glRotatef(30.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(10.0f * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(-10.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.1f * reloadRotate, -0.2f * reloadRotate, -0.1f * reloadRotate);
                            break;
                        }
                        case REVOLVER: {
                            GL11.glRotatef(30.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(10.0f * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(-10.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.1f * reloadRotate, -0.2f * reloadRotate, -0.1f * reloadRotate);
                            break;
                        }
                        case CUSTOMRIFLE_TOP:
                        case CUSTOMREVOLVER: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case REVOLVER2: {
                            GL11.glRotatef(20.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(-10.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            break;
                        }
                        case CUSTOMREVOLVER2: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case ALT_PISTOL_CLIP: {
                            GL11.glRotatef(60.0f * reloadRotate * flip, 0.0f, 1.0f, 0.0f);
                            GL11.glTranslatef(0.15f * reloadRotate, 0.25f * reloadRotate, 0.0f);
                            break;
                        }
                        case CUSTOMALT_PISTOL_CLIP: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case STRIKER: {
                            GL11.glRotatef(-35.0f * reloadRotate * flip, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(0.2f * reloadRotate, 0.0f, -0.1f * reloadRotate);
                            break;
                        }
                        case CUSTOMSTRIKER: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case GENERIC: {
                            GL11.glRotatef(45.0f * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glTranslatef(-0.2f * reloadRotate, -0.5f * reloadRotate, 0.0f);
                            break;
                        }
                        case CUSTOMGENERIC: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                        case CUSTOM: {
                            GL11.glRotatef(model.rotateGunVertical * reloadRotate, 0.0f, 0.0f, 1.0f);
                            GL11.glRotatef(model.rotateGunHorizontal * reloadRotate, 0.0f, 1.0f, 0.0f);
                            GL11.glRotatef(model.tiltGun * reloadRotate, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(model.translateGun.x * reloadRotate, model.translateGun.y * reloadRotate, model.translateGun.z * reloadRotate);
                            break;
                        }
                    }
                    break;
                }
                break;
            }
        }
        this.renderGun(item, gunType, f, model, animations, reloadRotate, type);
        GL11.glPopMatrix();
    }
    
    public void renderGun(final ItemStack item, final GunType type, final float f, final ModelGun model, GunAnimations animations, float reloadRotate, final IItemRenderer.ItemRenderType rtype) {
        final float min = -1.5f;
        final float max = 1.5f;
        final float randomNum = new Random().nextFloat();
        final float result = min + randomNum * (max - min);
        if (RenderGun.renderEngine == null) {
            RenderGun.renderEngine = Minecraft.func_71410_x().field_71446_o;
        }
        if (animations == null) {
            animations = GunAnimations.defaults;
        }
        final AttachmentType scopeAttachment = type.getScope(item);
        final AttachmentType barrelAttachment = type.getBarrel(item);
        final AttachmentType stockAttachment = type.getStock(item);
        final AttachmentType gripAttachment = type.getGrip(item);
        final AttachmentType gadgetAttachment = type.getGadget(item);
        final AttachmentType slideAttachment = type.getSlide(item);
        final AttachmentType pumpAttachment = type.getPump(item);
        final AttachmentType accessoryAttachment = type.getAccessory(item);
        final ItemStack scopeItemStack = type.getScopeItemStack(item);
        final ItemStack barrelItemStack = type.getBarrelItemStack(item);
        final ItemStack stockItemStack = type.getStockItemStack(item);
        final ItemStack gripItemStack = type.getGripItemStack(item);
        final ItemStack gadgetItemStack = type.getGadgetItemStack(item);
        final ItemStack slideItemStack = type.getSlideItemStack(item);
        final ItemStack pumpItemStack = type.getPumpItemStack(item);
        final ItemStack accessoryItemStack = type.getAccessoryItemStack(item);
        animations.recoilAmount = model.recoilAmount;
        GL11.glPushMatrix();
        if (rtype == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON) {
            GL11.glTranslatef(0.0f, 0.0f, 0.0f);
            GL11.glTranslatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * RenderGun.smoothing) * getRecoilDistance(gripAttachment, type, item), 0.0f, 0.0f);
            GL11.glRotatef(-(animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * RenderGun.smoothing) * getRecoilAngle(gripAttachment, type, item), 0.0f, 0.0f, 1.0f);
            GL11.glRotatef((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * RenderGun.smoothing) * result * RenderGun.smoothing * model.ShakeDistance, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef((-animations.lastGunRecoil + (animations.gunRecoil - animations.lastGunRecoil) * RenderGun.smoothing) * result * RenderGun.smoothing * model.ShakeDistance, 1.0f, 0.0f, 0.0f);
            if (model.animationType == EnumAnimationType.SHOTGUN && !animations.reloading) {
                GL11.glRotatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * -5.0f, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * 5.0f, 1.0f, 0.0f, 0.0f);
            }
            if (model.isSingleAction) {
                GL11.glRotatef(-(1.0f - Math.abs(animations.lastGunPullback + (animations.gunPullback - animations.lastGunPullback) * RenderGun.smoothing)) * -5.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-(1.0f - Math.abs(animations.lastGunPullback + (animations.gunPullback - animations.lastGunPullback) * RenderGun.smoothing)) * 2.5f, 1.0f, 0.0f, 0.0f);
            }
        }
        final ItemStack[] bulletStacks = new ItemStack[type.getNumAmmoItemsInGun(item)];
        boolean empty = true;
        int numRounds = 0;
        for (int i = 0; i < type.getNumAmmoItemsInGun(item); ++i) {
            bulletStacks[i] = ((ItemGun)item.func_77973_b()).getBulletItemStack(item, i);
            if (bulletStacks[i] != null && bulletStacks[i].func_77973_b() instanceof ItemShootable && bulletStacks[i].func_77960_j() < bulletStacks[i].func_77958_k()) {
                empty = false;
                numRounds += bulletStacks[i].func_77958_k() - bulletStacks[i].func_77960_j();
            }
        }
        if (model.slideLockOnEmpty) {
            if (empty) {
                animations.onGunEmpty(true);
            }
            else if (!empty && !animations.reloading) {
                animations.onGunEmpty(false);
            }
        }
        if (rtype == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms && FlansMod.armsEnable) {
            final Minecraft mc = Minecraft.func_71410_x();
            renderFirstPersonArm((EntityPlayer)mc.field_71439_g, model, animations);
        }
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(type.getPaintjob(item.func_77960_j())));
        if (scopeAttachment != null && model.gunOffset != 0.0f && FlansModClient.zoomProgress >= 0.5f) {
            GL11.glTranslatef(0.0f, -scopeAttachment.model.renderOffset + model.gunOffset / 16.0f, 0.0f);
        }
        GL11.glPushMatrix();
        GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
        model.renderGun(f);
        if (scopeAttachment == null && !model.scopeIsOnSlide && !model.scopeIsOnBreakAction) {
            model.renderDefaultScope(f);
        }
        if (barrelAttachment == null) {
            model.renderDefaultBarrel(f);
        }
        if (stockAttachment == null) {
            model.renderDefaultStock(f);
        }
        if (gripAttachment == null && !model.gripIsOnPump) {
            model.renderDefaultGrip(f);
        }
        if (gadgetAttachment == null && !model.gadgetIsOnPump) {
            model.renderDefaultGadget(f);
        }
        GL11.glPushMatrix();
        if (model.isBulletCounterActive) {
            model.renderBulletCounter(f, numRounds);
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        if (model.isAdvBulletCounterActive) {
            model.renderAdvBulletCounter(f, numRounds, model.countOnRightHandSide);
        }
        GL11.glPopMatrix();
        boolean isFlashEnabled = true;
        if (barrelAttachment != null && barrelAttachment.disableMuzzleFlash) {
            isFlashEnabled = false;
        }
        if (isFlashEnabled && animations.muzzleFlashTime > 0 && type.flashModel != null && !type.getSecondaryFire(item)) {
            GL11.glPushMatrix();
            final ModelFlash flash = type.flashModel;
            GL11.glScalef(model.flashScale, model.flashScale, model.flashScale);
            if (barrelAttachment != null) {
                GL11.glTranslatef(model.muzzleFlashPoint.x + barrelAttachment.model.attachmentFlashOffset.x, model.muzzleFlashPoint.y + barrelAttachment.model.attachmentFlashOffset.y, model.muzzleFlashPoint.z + barrelAttachment.model.attachmentFlashOffset.z);
            }
            else {
                GL11.glTranslatef(model.muzzleFlashPoint.x + model.defaultBarrelFlashPoint.x, model.muzzleFlashPoint.y + model.defaultBarrelFlashPoint.y, model.muzzleFlashPoint.z + model.defaultBarrelFlashPoint.z);
            }
            RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getAuxiliaryTexture(type.flashTexture));
            ModelGun.glowOn();
            flash.renderFlash(f, animations.flashInt);
            ModelGun.glowOff();
            RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(type.getPaintjob(item.func_77960_j())));
            GL11.glPopMatrix();
        }
        if (slideAttachment == null && !type.getSecondaryFire(item)) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * RenderGun.smoothing) * model.gunSlideDistance, 0.0f, 0.0f);
            GL11.glTranslatef(-(1.0f - Math.abs(animations.lastCharged + (animations.charged - animations.lastCharged) * RenderGun.smoothing)) * model.chargeHandleDistance, 0.0f, 0.0f);
            model.renderSlide(f);
            if (scopeAttachment == null && model.scopeIsOnSlide) {
                model.renderDefaultScope(f);
            }
            GL11.glPopMatrix();
        }
        if (slideAttachment == null && !type.getSecondaryFire(item)) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * RenderGun.smoothing) * model.altgunSlideDistance, 0.0f, 0.0f);
            model.renderaltSlide(f);
            GL11.glPopMatrix();
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
        GL11.glRotatef(reloadRotate * -model.breakAngle, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
        model.renderBreakAction(f);
        if (scopeAttachment == null && model.scopeIsOnBreakAction) {
            model.renderDefaultScope(f);
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(model.altbarrelBreakPoint.x, model.altbarrelBreakPoint.y, model.altbarrelBreakPoint.z);
        GL11.glRotatef(reloadRotate * -model.altbreakAngle, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-model.altbarrelBreakPoint.x, -model.altbarrelBreakPoint.y, -model.altbarrelBreakPoint.z);
        model.renderaltBreakAction(f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(model.hammerSpinPoint.x, model.hammerSpinPoint.y, model.hammerSpinPoint.z);
        GL11.glRotatef(-animations.hammerRotation, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-model.hammerSpinPoint.x, -model.hammerSpinPoint.y, -model.hammerSpinPoint.z);
        model.renderHammer(f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(model.althammerSpinPoint.x, model.althammerSpinPoint.y, model.althammerSpinPoint.z);
        GL11.glRotatef(-animations.althammerRotation, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-model.althammerSpinPoint.x, -model.althammerSpinPoint.y, -model.althammerSpinPoint.z);
        model.renderaltHammer(f);
        GL11.glPopMatrix();
        if (pumpAttachment == null) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * RenderGun.smoothing) * model.gunSlideDistance, 0.0f, 0.0f);
            GL11.glTranslatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance, 0.0f, 0.0f);
            model.renderPump(f);
            if (gripAttachment == null && model.gripIsOnPump) {
                model.renderDefaultGrip(f);
            }
            if (gadgetAttachment == null && model.gadgetIsOnPump) {
                model.renderDefaultGadget(f);
            }
            if (FlansModClient.shotState != -1 && -(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance != -0.0) {
                FlansModClient.shotState = -1;
                if (type.actionSound != null) {
                    Minecraft.func_71410_x().func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(type.actionSound), 1.0f));
                }
            }
            GL11.glPopMatrix();
        }
        if (pumpAttachment == null) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance, 0.0f, 0.0f);
            final float pumped = animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing;
            model.renderaltPump(f);
            if (gripAttachment == null && model.gripIsOnPump) {
                model.renderDefaultGrip(f);
            }
            if (gadgetAttachment == null && model.gadgetIsOnPump) {
                model.renderDefaultGadget(f);
            }
            GL11.glPopMatrix();
        }
        if (model.chargeHandleDistance != 0.0f) {
            GL11.glPushMatrix();
            GL11.glTranslatef(-(1.0f - Math.abs(animations.lastCharged + (animations.charged - animations.lastCharged) * RenderGun.smoothing)) * model.chargeHandleDistance, 0.0f, 0.0f);
            model.renderCharge(f);
            GL11.glPopMatrix();
        }
        if (type.mode == EnumFireMode.MINIGUN) {
            GL11.glPushMatrix();
            GL11.glTranslatef(model.minigunBarrelOrigin.x, model.minigunBarrelOrigin.y, model.minigunBarrelOrigin.z);
            GL11.glRotatef(animations.minigunBarrelRotation, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(-model.minigunBarrelOrigin.x, -model.minigunBarrelOrigin.y, -model.minigunBarrelOrigin.z);
            model.renderMinigunBarrel(f);
            GL11.glPopMatrix();
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
        GL11.glRotatef(reloadRotate * model.revolverFlipAngle, 1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
        model.renderRevolverBarrel(f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
        GL11.glRotatef(reloadRotate * model.revolverFlipAngle, -1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
        model.renderRevolver2Barrel(f);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        boolean shouldRender = true;
        EnumAnimationType anim = model.animationType;
        if (gripAttachment != null && type.getSecondaryFire(item)) {
            anim = gripAttachment.model.secondaryAnimType;
        }
        float tiltGunTime = model.tiltGunTime;
        float unloadClipTime = model.unloadClipTime;
        float loadClipTime = model.loadClipTime;
        if (gripAttachment != null && type.getSecondaryFire(item)) {
            tiltGunTime = gripAttachment.model.tiltGunTime;
            unloadClipTime = gripAttachment.model.unloadClipTime;
            loadClipTime = gripAttachment.model.loadClipTime;
        }
        switch (anim) {
            case END_LOADED:
            case CROSSBOW:
            case BACK_LOADED: {
                if (empty) {
                    shouldRender = false;
                    break;
                }
                break;
            }
        }
        if (shouldRender && animations.reloading && Minecraft.func_71410_x().field_71474_y.field_74320_O == 0) {
            final float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * RenderGun.smoothing;
            float clipPosition = 0.0f;
            if (effectiveReloadAnimationProgress > tiltGunTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime) {
                clipPosition = (effectiveReloadAnimationProgress - tiltGunTime) / unloadClipTime;
            }
            if (effectiveReloadAnimationProgress >= tiltGunTime + unloadClipTime && effectiveReloadAnimationProgress < tiltGunTime + unloadClipTime + loadClipTime) {
                clipPosition = 1.0f - (effectiveReloadAnimationProgress - (tiltGunTime + unloadClipTime)) / loadClipTime;
            }
            final float loadOnlyClipPosition = Math.max(0.0f, Math.min(1.0f, 1.0f - (effectiveReloadAnimationProgress - tiltGunTime) / (unloadClipTime + loadClipTime)));
            switch (anim) {
                case BREAK_ACTION:
                case CUSTOMBREAK_ACTION: {
                    GL11.glTranslatef(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
                    GL11.glRotatef(reloadRotate * -model.breakAngle, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
                    GL11.glTranslatef(-model.breakActionAmmoDistance * clipPosition * 1.0f / type.modelScale, 0.0f, 0.0f);
                    break;
                }
                case REVOLVER:
                case CUSTOMREVOLVER: {
                    GL11.glTranslatef(model.revolverFlipPoint.x, model.revolverFlipPoint.y, model.revolverFlipPoint.z);
                    GL11.glRotatef(reloadRotate * model.revolverFlipAngle, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(-model.revolverFlipPoint.x, -model.revolverFlipPoint.y, -model.revolverFlipPoint.z);
                    GL11.glTranslatef(-1.0f * clipPosition * 1.0f / type.modelScale, 0.0f, 0.0f);
                    break;
                }
                case REVOLVER2:
                case CUSTOMREVOLVER2: {
                    GL11.glTranslatef(model.revolver2FlipPoint.x, model.revolver2FlipPoint.y, model.revolver2FlipPoint.z);
                    GL11.glRotatef(reloadRotate * model.revolver2FlipAngle, -1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(-model.revolver2FlipPoint.x, -model.revolver2FlipPoint.y, -model.revolver2FlipPoint.z);
                    GL11.glTranslatef(-1.0f * clipPosition * 1.0f / type.modelScale, 0.0f, 0.0f);
                    break;
                }
                case BOTTOM_CLIP:
                case CUSTOMBOTTOM_CLIP: {
                    GL11.glRotatef(-180.0f * clipPosition, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(60.0f * clipPosition, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(0.5f * clipPosition * 1.0f / type.modelScale, 0.0f, 0.0f);
                    break;
                }
                case PISTOL_CLIP:
                case CUSTOMPISTOL_CLIP: {
                    GL11.glRotatef(-90.0f * clipPosition * clipPosition, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -1.0f * clipPosition * 1.0f / type.modelScale, 0.0f);
                    break;
                }
                case ALT_PISTOL_CLIP:
                case CUSTOMALT_PISTOL_CLIP: {
                    GL11.glRotatef(5.0f * clipPosition, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -3.0f * clipPosition * 1.0f / type.modelScale, 0.0f);
                    break;
                }
                case SIDE_CLIP:
                case CUSTOMSIDE_CLIP: {
                    GL11.glRotatef(180.0f * clipPosition, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(60.0f * clipPosition, 0.0f, 1.0f, 0.0f);
                    GL11.glTranslatef(0.5f * clipPosition * 1.0f / type.modelScale, 0.0f, 0.0f);
                    break;
                }
                case BULLPUP:
                case CUSTOMBULLPUP: {
                    GL11.glRotatef(-150.0f * clipPosition, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(60.0f * clipPosition, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(1.0f * clipPosition * 1.0f / type.modelScale, -0.5f * clipPosition * 1.0f / type.modelScale, 0.0f);
                    break;
                }
                case P90:
                case CUSTOMP90: {
                    GL11.glRotatef(-15.0f * reloadRotate * reloadRotate, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, 0.075f * reloadRotate, 0.0f);
                    GL11.glTranslatef(-2.0f * clipPosition * 1.0f / type.modelScale, -0.3f * clipPosition * 1.0f / type.modelScale, 0.5f * clipPosition * 1.0f / type.modelScale);
                    break;
                }
                case RIFLE: {
                    final float ammoPosition = clipPosition * getNumBulletsInReload(animations, gripAttachment, type, item);
                    final int bulletNum = MathHelper.func_76141_d(ammoPosition);
                    final float bulletProgress = ammoPosition - bulletNum;
                    GL11.glRotatef(bulletProgress * 15.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(bulletProgress * 15.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(bulletProgress * -1.0f * 1.0f / type.modelScale, 0.0f, bulletProgress * 0.5f * 1.0f / type.modelScale);
                    break;
                }
                case CUSTOMRIFLE: {
                    final float maxBullets = getNumBulletsInReload(animations, gripAttachment, type, item);
                    final float ammoPosition2 = clipPosition * maxBullets;
                    final int bulletNum2 = MathHelper.func_76141_d(ammoPosition2);
                    final float bulletProgress2 = ammoPosition2 - bulletNum2;
                    if (type.getNumAmmoItemsInGun(item) > 1 && type.bulletInsert != null && FlansModClient.lastBulletReload != -2) {
                        if (maxBullets == 2.0f && FlansModClient.lastBulletReload != -1) {
                            final int time = (int)(animations.reloadAnimationTime / maxBullets);
                            Minecraft.func_71410_x().func_147118_V().func_147681_a((ISound)PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(type.bulletInsert), 1.0f), time);
                            FlansModClient.lastBulletReload = -1;
                        }
                        else if (bulletNum2 == (int)maxBullets || bulletNum2 == FlansModClient.lastBulletReload - 1) {
                            FlansModClient.lastBulletReload = bulletNum2;
                            Minecraft.func_71410_x().func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(type.bulletInsert), 1.0f));
                        }
                        if (ammoPosition2 < 0.03 && bulletProgress2 > 0.0f) {
                            FlansModClient.lastBulletReload = -2;
                            Minecraft.func_71410_x().func_147118_V().func_147682_a((ISound)PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound(type.bulletInsert), 1.0f));
                        }
                    }
                    GL11.glRotatef(bulletProgress2 * model.rotateClipVertical, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(bulletProgress2 * model.rotateClipHorizontal, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(bulletProgress2 * model.tiltClip, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(bulletProgress2 * model.translateClip.x / type.modelScale, bulletProgress2 * model.translateClip.y / type.modelScale, bulletProgress2 * model.translateClip.z / type.modelScale);
                    break;
                }
                case RIFLE_TOP:
                case CUSTOMRIFLE_TOP: {
                    final float ammoPosition = clipPosition * 1.0f;
                    final int bulletNum = MathHelper.func_76141_d(ammoPosition);
                    final float bulletProgress = ammoPosition - bulletNum;
                    GL11.glRotatef(bulletProgress * 55.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(bulletProgress * 95.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(bulletProgress * -0.1f * 1.0f / type.modelScale, bulletProgress * 1.0f * 1.0f / type.modelScale, bulletProgress * 0.5f * 1.0f / type.modelScale);
                    break;
                }
                case SHOTGUN:
                case CUSTOMSHOTGUN:
                case STRIKER:
                case CUSTOMSTRIKER: {
                    final float ammoPosition = clipPosition * getNumBulletsInReload(animations, gripAttachment, type, item);
                    final int bulletNum = MathHelper.func_76141_d(ammoPosition);
                    final float bulletProgress = ammoPosition - bulletNum;
                    GL11.glRotatef(bulletProgress * -30.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(bulletProgress * -0.5f * 1.0f / type.modelScale, bulletProgress * -1.0f * 1.0f / type.modelScale, 0.0f);
                    break;
                }
                case CUSTOM: {
                    if (effectiveReloadAnimationProgress < 0.5 && model.stagedReload) {
                        GL11.glRotatef(model.rotateClipVertical * clipPosition, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0.0f, 1.0f, 0.0f);
                        GL11.glRotatef(model.tiltClip * clipPosition, 1.0f, 0.0f, 0.0f);
                        GL11.glTranslatef(model.translateClip.x * clipPosition * 1.0f / type.modelScale, model.translateClip.y * clipPosition * 1.0f / type.modelScale, model.translateClip.z * clipPosition * 1.0f / type.modelScale);
                        break;
                    }
                    if (effectiveReloadAnimationProgress > 0.5 && model.stagedReload) {
                        GL11.glRotatef(model.stagedrotateClipVertical * clipPosition, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(model.stagedrotateClipHorizontal * clipPosition, 0.0f, 1.0f, 0.0f);
                        GL11.glRotatef(model.stagedtiltClip * clipPosition, 1.0f, 0.0f, 0.0f);
                        GL11.glTranslatef(model.stagedtranslateClip.x * clipPosition * 1.0f / type.modelScale, model.stagedtranslateClip.y * clipPosition * 1.0f / type.modelScale, model.stagedtranslateClip.z * clipPosition * 1.0f / type.modelScale);
                        break;
                    }
                    GL11.glRotatef(model.rotateClipVertical * clipPosition, 0.0f, 0.0f, 1.0f);
                    GL11.glRotatef(model.rotateClipHorizontal * clipPosition, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(model.tiltClip * clipPosition, 1.0f, 0.0f, 0.0f);
                    GL11.glTranslatef(model.translateClip.x * clipPosition * 1.0f / type.modelScale, model.translateClip.y * clipPosition * 1.0f / type.modelScale, model.translateClip.z * clipPosition * 1.0f / type.modelScale);
                    break;
                }
                case END_LOADED:
                case CUSTOMEND_LOADED: {
                    final float dYaw = (loadOnlyClipPosition > 0.5f) ? (loadOnlyClipPosition * 2.0f - 1.0f) : 0.0f;
                    GL11.glRotatef(-45.0f * dYaw, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(-getEndLoadedDistance(gripAttachment, type, item) * dYaw, -0.5f * dYaw, 0.0f);
                    final float xDisplacement = (loadOnlyClipPosition < 0.5f) ? (loadOnlyClipPosition * 2.0f) : 1.0f;
                    GL11.glTranslatef(getEndLoadedDistance(gripAttachment, type, item) * xDisplacement, 0.0f, 0.0f);
                    break;
                }
                case CROSSBOW: {
                    final float dYaw = (loadOnlyClipPosition > 0.5f) ? (loadOnlyClipPosition * 2.0f - 1.0f) : 0.0f;
                    GL11.glRotatef(45.0f * dYaw, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(-getEndLoadedDistance(gripAttachment, type, item) * dYaw, 0.5f * dYaw, 0.0f);
                    final float xDisplacement = (loadOnlyClipPosition < 0.5f) ? (loadOnlyClipPosition * 2.0f) : 1.0f;
                    GL11.glTranslatef(getEndLoadedDistance(gripAttachment, type, item) * xDisplacement, 0.0f, 0.0f);
                    break;
                }
                case BACK_LOADED:
                case CUSTOMBACK_LOADED: {
                    final float dYaw = (loadOnlyClipPosition > 0.5f) ? (loadOnlyClipPosition * 2.0f - 1.0f) : 0.0f;
                    GL11.glTranslatef(getEndLoadedDistance(gripAttachment, type, item) * dYaw, -0.5f * dYaw, 0.0f);
                    final float xDisplacement = (loadOnlyClipPosition < 0.5f) ? (loadOnlyClipPosition * 2.0f) : 1.0f;
                    GL11.glTranslatef(-getEndLoadedDistance(gripAttachment, type, item) * xDisplacement, 0.0f, 0.0f);
                    break;
                }
            }
        }
        if (rtype == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON && model.hasArms && FlansMod.armsEnable) {
            final Minecraft mc2 = Minecraft.func_71410_x();
            renderAnimArm((EntityPlayer)mc2.field_71439_g, model, type, animations);
        }
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(type.getPaintjob(item.func_77960_j())));
        if (shouldRender) {
            if (gripAttachment != null && type.getSecondaryFire(item)) {
                renderAttachmentAmmo(f, gripAttachment, model, gripAttachment.getPaintjob(gripItemStack.func_77960_j()), type.getPaintjob(item.func_77960_j()));
            }
            else {
                model.renderAmmo(f);
            }
        }
        final float effectiveReloadAnimationProgress = animations.lastReloadAnimationProgress + (animations.reloadAnimationProgress - animations.lastReloadAnimationProgress) * RenderGun.smoothing;
        reloadRotate = 1.0f;
        if (effectiveReloadAnimationProgress > 0.5) {
            model.renderfullAmmo(f);
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        if (type.getSecondaryFire(item)) {
            model.renderAmmo(f);
        }
        else if (gripAttachment != null && !type.getSecondaryFire(item)) {
            renderAttachmentAmmo(f, gripAttachment, model, gripAttachment.getPaintjob(gripItemStack.func_77960_j()), type.getPaintjob(item.func_77960_j()));
        }
        GL11.glPopMatrix();
        if (rtype == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON && FlansMod.casingEnable && type.casingModel != null && !type.getSecondaryFire(item)) {
            final ModelCasing casing = type.casingModel;
            GL11.glPushMatrix();
            float casingProg = (animations.lastCasingStage + (animations.casingStage - animations.lastCasingStage) * RenderGun.smoothing) / model.casingAnimTime;
            if (casingProg >= 1.0f) {
                casingProg = 0.0f;
            }
            final float moveX = model.casingAnimDistance.x + animations.casingRandom.x * model.casingAnimSpread.x;
            final float moveY = model.casingAnimDistance.y + animations.casingRandom.y * model.casingAnimSpread.y;
            final float moveZ = model.casingAnimDistance.z + animations.casingRandom.z * model.casingAnimSpread.z;
            GL11.glScalef(model.caseScale, model.caseScale, model.caseScale);
            GL11.glTranslatef(model.casingAttachPoint.x + casingProg * moveX, model.casingAttachPoint.y + casingProg * moveY, model.casingAttachPoint.z + casingProg * moveZ);
            GL11.glRotatef(casingProg * 180.0f, model.casingRotateVector.x, model.casingRotateVector.y, model.casingRotateVector.z);
            RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getAuxiliaryTexture(type.casingTexture));
            casing.renderCasing(f);
            RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(type.getPaintjob(item.func_77960_j())));
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
        if (scopeAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(scopeAttachment, scopeItemStack, model.scopeAttachPoint, type);
            if (model.scopeIsOnBreakAction) {
                GL11.glTranslatef(model.barrelBreakPoint.x, model.barrelBreakPoint.y, model.barrelBreakPoint.z);
                GL11.glRotatef(reloadRotate * -model.breakAngle, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(-model.barrelBreakPoint.x, -model.barrelBreakPoint.y, -model.barrelBreakPoint.z);
            }
            if (model.scopeIsOnSlide) {
                GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * RenderGun.smoothing) * model.gunSlideDistance, 0.0f, 0.0f);
            }
            postRenderAttachment(scopeAttachment, scopeItemStack, f);
            GL11.glPopMatrix();
        }
        if (gripAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(gripAttachment, gripItemStack, model.gripAttachPoint, type);
            if (model.gripIsOnPump) {
                GL11.glTranslatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance, 0.0f, 0.0f);
            }
            postRenderAttachment(gripAttachment, gripItemStack, f);
            GL11.glPopMatrix();
        }
        if (barrelAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(barrelAttachment, barrelItemStack, model.barrelAttachPoint, type);
            postRenderAttachment(barrelAttachment, barrelItemStack, f);
            GL11.glPopMatrix();
        }
        if (stockAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(stockAttachment, stockItemStack, model.stockAttachPoint, type);
            postRenderAttachment(stockAttachment, stockItemStack, f);
            GL11.glPopMatrix();
        }
        if (slideAttachment != null && !type.getSecondaryFire(item)) {
            GL11.glPushMatrix();
            preRenderAttachment(slideAttachment, slideItemStack, model.slideAttachPoint, type);
            GL11.glTranslatef(-(animations.lastGunSlide + (animations.gunSlide - animations.lastGunSlide) * RenderGun.smoothing) * model.gunSlideDistance, 0.0f, 0.0f);
            postRenderAttachment(slideAttachment, slideItemStack, f);
            GL11.glPopMatrix();
        }
        if (gadgetAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(gadgetAttachment, gadgetItemStack, model.gadgetAttachPoint, type);
            if (model.gadgetIsOnPump) {
                GL11.glTranslatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance, 0.0f, 0.0f);
            }
            postRenderAttachment(gadgetAttachment, gadgetItemStack, f);
            GL11.glPopMatrix();
        }
        if (accessoryAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(accessoryAttachment, accessoryItemStack, model.accessoryAttachPoint, type);
            postRenderAttachment(accessoryAttachment, accessoryItemStack, f);
            GL11.glPopMatrix();
        }
        if (pumpAttachment != null) {
            GL11.glPushMatrix();
            preRenderAttachment(pumpAttachment, pumpItemStack, model.pumpAttachPoint, type);
            GL11.glTranslatef(-(1.0f - Math.abs(animations.lastPumped + (animations.pumped - animations.lastPumped) * RenderGun.smoothing)) * model.pumpHandleDistance, 0.0f, 0.0f);
            postRenderAttachment(pumpAttachment, pumpItemStack, f);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
    }
    
    private static void preRenderAttachment(final AttachmentType attachment, final ItemStack stack, final Vector3f model, final GunType type) {
        final Paintjob paintjob = attachment.getPaintjob(stack.func_77960_j());
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(paintjob));
        GL11.glTranslatef(model.x * type.modelScale, model.y * type.modelScale, model.z * type.modelScale);
        GL11.glScalef(attachment.modelScale, attachment.modelScale, attachment.modelScale);
    }
    
    private static void postRenderAttachment(final AttachmentType attachment, final ItemStack stack, final float f) {
        final Paintjob paintjob = attachment.getPaintjob(stack.func_77960_j());
        final ModelAttachment model = attachment.model;
        if (model != null) {
            model.renderAttachment(f);
        }
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(paintjob));
    }
    
    private static void renderAttachmentAmmo(final float f, final AttachmentType grip, final ModelGun model, final Paintjob ammo, final Paintjob otherAmmo) {
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(ammo));
        GL11.glTranslatef(model.gripAttachPoint.x, model.gripAttachPoint.y, model.gripAttachPoint.z);
        grip.model.renderAttachmentAmmo(f);
        RenderGun.renderEngine.func_110577_a(FlansModResourceHandler.getPaintjobTexture(otherAmmo));
    }
    
    private void renderArms(final EntityPlayer player, final ModelGun model, final GunType type, final GunAnimations anim) {
    }
    
    private static void renderFirstPersonArm(final EntityPlayer player, final ModelGun model, final GunAnimations anim) {
        final Minecraft mc = Minecraft.func_71410_x();
        final ModelBiped modelBipedMain = new ModelBiped(0.0f);
        mc.field_71446_o.func_110577_a(mc.field_71439_g.func_110306_p());
        final float f = 1.0f;
        GL11.glColor3f(f, f, f);
        modelBipedMain.field_78095_p = 0.0f;
        GL11.glPushMatrix();
        if (!anim.reloading && model.righthandPump) {
            RenderArms.renderArmPump(model, anim, RenderGun.smoothing, model.rightArmRot, model.rightArmPos);
        }
        else if (anim.charged < 0.9 && model.leftHandAmmo && model.rightHandCharge && anim.charged != -1.0f) {
            RenderArms.renderArmCharge(model, anim, RenderGun.smoothing, model.rightArmChargeRot, model.rightArmChargePos);
        }
        else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
            RenderArms.renderArmBolt(model, anim, RenderGun.smoothing, model.rightArmChargeRot, model.rightArmChargePos);
        }
        else if (!anim.reloading && !model.righthandPump) {
            RenderArms.renderArmDefault(model, anim, RenderGun.smoothing, model.rightArmRot, model.rightArmPos);
        }
        else {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
        }
        GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
        modelBipedMain.func_78087_a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)player);
        modelBipedMain.field_78112_f.field_82908_p = 0.0f;
        if (!model.rightHandAmmo) {
            if (!player.func_70644_a(Potion.field_76441_p)) {
                modelBipedMain.field_78112_f.func_78785_a(0.0625f);
            }
            for (int a = 0; a < 4; ++a) {
                if (Minecraft.func_71410_x().field_71439_g.func_82169_q(a) != null && Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b() instanceof ItemTeamArmour) {
                    final ItemTeamArmour kiyafet = (ItemTeamArmour)Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b();
                    final ModelCustomArmour sekil = (ModelCustomArmour)kiyafet.type.GetModel();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("flansmod:armor/" + kiyafet.type.armourTextureName + "_" + ((kiyafet.type.type == 2) ? "2" : "1") + ".png"));
                    for (int i = 0; i < sekil.rightArmModel.length; ++i) {
                        sekil.rightArmModel[i].field_78795_f = modelBipedMain.field_78112_f.field_78795_f;
                        sekil.rightArmModel[i].field_78796_g = modelBipedMain.field_78112_f.field_78796_g;
                        sekil.rightArmModel[i].field_78808_h = modelBipedMain.field_78112_f.field_78808_h;
                        sekil.rightArmModel[i].field_78800_c = modelBipedMain.field_78112_f.field_78800_c;
                        sekil.rightArmModel[i].field_78797_d = modelBipedMain.field_78112_f.field_78797_d;
                        sekil.rightArmModel[i].field_78798_e = modelBipedMain.field_78112_f.field_78798_e;
                        sekil.rightArmModel[i].func_78785_a(0.0625f);
                    }
                }
                mc.field_71446_o.func_110577_a(mc.field_71439_g.func_110306_p());
            }
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        if (!anim.reloading && model.lefthandPump) {
            RenderArms.renderArmPump(model, anim, RenderGun.smoothing, model.leftArmRot, model.leftArmPos);
        }
        else if (anim.charged < 0.9 && model.rightHandCharge && model.leftHandAmmo && anim.charged != -1.0f) {
            RenderArms.renderArmCharge(model, anim, RenderGun.smoothing, model.leftArmChargeRot, model.leftArmChargePos);
        }
        else if (anim.pumped < 0.9 && model.rightHandBolt && model.leftHandAmmo) {
            RenderArms.renderArmBolt(model, anim, RenderGun.smoothing, model.leftArmChargeRot, model.leftArmChargePos);
        }
        else if (!anim.reloading && !model.lefthandPump) {
            RenderArms.renderArmDefault(model, anim, RenderGun.smoothing, model.leftArmRot, model.leftArmPos);
        }
        else {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
        }
        GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
        modelBipedMain.field_78113_g.field_82908_p = 0.0f;
        if (!model.leftHandAmmo) {
            if (!player.func_70644_a(Potion.field_76441_p)) {
                modelBipedMain.field_78113_g.func_78785_a(0.0625f);
            }
            for (int a = 0; a < 4; ++a) {
                if (Minecraft.func_71410_x().field_71439_g.func_82169_q(a) != null && Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b() instanceof ItemTeamArmour) {
                    final ItemTeamArmour kiyafet = (ItemTeamArmour)Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b();
                    final ModelCustomArmour sekil = (ModelCustomArmour)kiyafet.type.GetModel();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("flansmod:armor/" + kiyafet.type.armourTextureName + "_" + ((kiyafet.type.type == 2) ? "2" : "1") + ".png"));
                    for (int i = 0; i < sekil.leftArmModel.length; ++i) {
                        sekil.leftArmModel[i].field_78795_f = modelBipedMain.field_78113_g.field_78795_f;
                        sekil.leftArmModel[i].field_78796_g = modelBipedMain.field_78113_g.field_78796_g;
                        sekil.leftArmModel[i].field_78808_h = modelBipedMain.field_78113_g.field_78808_h;
                        sekil.leftArmModel[i].field_78800_c = modelBipedMain.field_78113_g.field_78800_c;
                        sekil.leftArmModel[i].field_78797_d = modelBipedMain.field_78113_g.field_78797_d;
                        sekil.leftArmModel[i].field_78798_e = modelBipedMain.field_78113_g.field_78798_e;
                        sekil.leftArmModel[i].func_78785_a(0.0625f);
                    }
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    private static void renderAnimArm(final EntityPlayer player, final ModelGun model, final GunType type, final GunAnimations anim) {
        final Minecraft mc = Minecraft.func_71410_x();
        final ModelBiped modelBipedMain = new ModelBiped(0.0f);
        mc.field_71446_o.func_110577_a(mc.field_71439_g.func_110306_p());
        GL11.glPushMatrix();
        GL11.glScalef(1.0f / type.modelScale, 1.0f / type.modelScale, 1.0f / type.modelScale);
        final float f = 1.0f;
        GL11.glColor3f(f, f, f);
        modelBipedMain.field_78095_p = 0.0f;
        GL11.glPushMatrix();
        final float effectiveReloadAnimationProgress = anim.lastReloadAnimationProgress + (anim.reloadAnimationProgress - anim.lastReloadAnimationProgress) * RenderGun.smoothing;
        if (anim.charged < 0.9 && model.rightHandCharge && model.rightHandAmmo && anim.charged != -1.0f) {
            RenderArms.renderArmPump(model, anim, RenderGun.smoothing, model.rightArmRot, model.rightArmPos);
        }
        else if (anim.pumped < 0.9 && model.rightHandBolt && model.rightHandAmmo) {
            RenderArms.renderArmBolt(model, anim, RenderGun.smoothing, model.rightArmChargeRot, model.rightArmChargePos);
        }
        else if (!anim.reloading) {
            RenderArms.renderArmDefault(model, anim, RenderGun.smoothing, model.rightArmRot, model.rightArmPos);
        }
        else {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.rightArmReloadRot, model.rightArmReloadPos);
        }
        GL11.glScalef(model.rightArmScale.x, model.rightArmScale.y, model.rightArmScale.z);
        modelBipedMain.func_78087_a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, (Entity)player);
        modelBipedMain.field_78112_f.field_82908_p = 0.0f;
        if (model.rightHandAmmo) {
            if (!player.func_70644_a(Potion.field_76441_p)) {
                modelBipedMain.field_78112_f.func_78785_a(0.0625f);
            }
            for (int a = 0; a < 4; ++a) {
                if (Minecraft.func_71410_x().field_71439_g.func_82169_q(a) != null && Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b() instanceof ItemTeamArmour) {
                    final ItemTeamArmour kiyafet = (ItemTeamArmour)Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b();
                    final ModelCustomArmour sekil = (ModelCustomArmour)kiyafet.type.GetModel();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("flansmod:armor/" + kiyafet.type.armourTextureName + "_" + ((kiyafet.type.type == 2) ? "2" : "1") + ".png"));
                    for (int i = 0; i < sekil.rightArmModel.length; ++i) {
                        sekil.rightArmModel[i].field_78795_f = modelBipedMain.field_78112_f.field_78795_f;
                        sekil.rightArmModel[i].field_78796_g = modelBipedMain.field_78112_f.field_78796_g;
                        sekil.rightArmModel[i].field_78808_h = modelBipedMain.field_78112_f.field_78808_h;
                        sekil.rightArmModel[i].field_78800_c = modelBipedMain.field_78112_f.field_78800_c;
                        sekil.rightArmModel[i].field_78797_d = modelBipedMain.field_78112_f.field_78797_d;
                        sekil.rightArmModel[i].field_78798_e = modelBipedMain.field_78112_f.field_78798_e;
                        sekil.rightArmModel[i].func_78785_a(0.0625f);
                    }
                }
                mc.field_71446_o.func_110577_a(mc.field_71439_g.func_110306_p());
            }
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        if (anim.charged < 0.9 && model.leftHandCharge && model.leftHandAmmo && anim.charged != -1.0f) {
            RenderArms.renderArmCharge(model, anim, RenderGun.smoothing, model.leftArmChargeRot, model.leftArmChargePos);
        }
        else if (!anim.reloading && model.lefthandPump) {
            RenderArms.renderArmPump(model, anim, RenderGun.smoothing, model.leftArmRot, model.leftArmPos);
        }
        else if (!anim.reloading) {
            RenderArms.renderArmDefault(model, anim, RenderGun.smoothing, model.leftArmRot, model.leftArmPos);
        }
        else if (effectiveReloadAnimationProgress < 0.5 && model.stagedleftArmReloadPos.x != 0.0f) {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
        }
        else if (effectiveReloadAnimationProgress > 0.5 && model.stagedleftArmReloadPos.x != 0.0f) {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.stagedleftArmReloadRot, model.stagedleftArmReloadPos);
        }
        else {
            RenderArms.renderArmReload(model, anim, RenderGun.smoothing, model.leftArmReloadRot, model.leftArmReloadPos);
        }
        GL11.glScalef(model.leftArmScale.x, model.leftArmScale.y, model.leftArmScale.z);
        modelBipedMain.field_78113_g.field_82908_p = 0.0f;
        if (model.leftHandAmmo) {
            if (!player.func_70644_a(Potion.field_76441_p)) {
                modelBipedMain.field_78113_g.func_78785_a(0.0625f);
            }
            for (int a = 0; a < 4; ++a) {
                if (Minecraft.func_71410_x().field_71439_g.func_82169_q(a) != null && Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b() instanceof ItemTeamArmour) {
                    final ItemTeamArmour kiyafet = (ItemTeamArmour)Minecraft.func_71410_x().field_71439_g.func_82169_q(a).func_77973_b();
                    final ModelCustomArmour sekil = (ModelCustomArmour)kiyafet.type.GetModel();
                    Minecraft.func_71410_x().field_71446_o.func_110577_a(new ResourceLocation("flansmod:armor/" + kiyafet.type.armourTextureName + "_" + ((kiyafet.type.type == 2) ? "2" : "1") + ".png"));
                    for (int i = 0; i < sekil.leftArmModel.length; ++i) {
                        sekil.leftArmModel[i].field_78795_f = modelBipedMain.field_78113_g.field_78795_f;
                        sekil.leftArmModel[i].field_78796_g = modelBipedMain.field_78113_g.field_78796_g;
                        sekil.leftArmModel[i].field_78808_h = modelBipedMain.field_78113_g.field_78808_h;
                        sekil.leftArmModel[i].field_78800_c = modelBipedMain.field_78113_g.field_78800_c;
                        sekil.leftArmModel[i].field_78797_d = modelBipedMain.field_78113_g.field_78797_d;
                        sekil.leftArmModel[i].field_78798_e = modelBipedMain.field_78113_g.field_78798_e;
                        sekil.leftArmModel[i].func_78785_a(0.0625f);
                    }
                }
            }
        }
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
    
    private static float getEndLoadedDistance(final AttachmentType grip, final GunType gun, final ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack)) {
            return grip.model.endLoadedAmmoDistance;
        }
        return gun.model.endLoadedAmmoDistance;
    }
    
    private static float getNumBulletsInReload(final GunAnimations animations, final AttachmentType grip, final GunType gun, final ItemStack gunStack) {
        return animations.reloadAmmoCount;
    }
    
    private static float getRecoilDistance(final AttachmentType grip, final GunType gun, final ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack)) {
            return grip.model.recoilDistance;
        }
        return gun.model.RecoilSlideDistance;
    }
    
    private static float getRecoilAngle(final AttachmentType grip, final GunType gun, final ItemStack gunStack) {
        if (grip != null && gun.getSecondaryFire(gunStack)) {
            return grip.model.recoilAngle;
        }
        return gun.model.RotateSlideDistance;
    }
}
