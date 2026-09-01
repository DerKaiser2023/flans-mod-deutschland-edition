// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.driveables.mechas.ItemMecha;
import net.minecraft.util.IIcon;
import com.flansmod.common.guns.GunType;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.Tessellator;
import com.flansmod.client.ClientProxy;
import com.flansmod.common.guns.ItemGun;
import net.minecraft.client.Minecraft;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.vector.Vector3f;
import java.util.Iterator;
import com.flansmod.common.driveables.mechas.MechaItemType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.ShootPoint;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.driveables.mechas.ItemMechaAddon;
import com.flansmod.common.driveables.mechas.EnumMechaSlotType;
import com.flansmod.common.driveables.EntityDriveable;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.driveables.mechas.EntityMecha;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraft.client.renderer.entity.Render;

public class RenderMecha extends Render implements IItemRenderer
{
    private static final ResourceLocation RES_ITEM_GLINT;
    private static final ItemRenderer renderer;
    
    public RenderMecha() {
        this.field_76989_e = 1.5f;
    }
    
    public void render(final EntityMecha mecha, final double d, final double d1, final double d2, final float f, final float f1) {
        this.func_110777_b((Entity)mecha);
        final float scale = 0.0625f;
        final MechaType type = mecha.getMechaType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw;
        for (dYaw = mecha.axes.getYaw() - mecha.field_70126_B; dYaw > 180.0f; dYaw -= 360.0f) {}
        while (dYaw <= -180.0f) {
            dYaw += 360.0f;
        }
        float dPitch;
        for (dPitch = mecha.axes.getPitch() - mecha.field_70127_C; dPitch > 180.0f; dPitch -= 360.0f) {}
        while (dPitch <= -180.0f) {
            dPitch += 360.0f;
        }
        float dRoll;
        for (dRoll = mecha.axes.getRoll() - mecha.prevRotationRoll; dRoll > 180.0f; dRoll -= 360.0f) {}
        while (dRoll <= -180.0f) {
            dRoll += 360.0f;
        }
        GL11.glRotatef(-mecha.field_70126_B - dYaw * f1, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(mecha.field_70127_C + dPitch * f1, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
        final float modelScale = mecha.getMechaType().modelScale;
        final ModelMecha model = (ModelMecha)type.model;
        GL11.glPushMatrix();
        GL11.glScalef(modelScale, modelScale, modelScale);
        if (model != null) {
            model.render(mecha, f1);
        }
        final ItemStack hipsSlot = mecha.inventory.getStackInSlot(EnumMechaSlotType.hips);
        if (hipsSlot != null && hipsSlot.func_77973_b() instanceof ItemMechaAddon) {
            final MechaItemType hipsAddon = ((ItemMechaAddon)hipsSlot.func_77973_b()).type;
            if (hipsAddon.model != null) {
                if (model != null) {
                    GL11.glTranslatef(model.hipsAttachmentPoint.x, model.hipsAttachmentPoint.y, model.hipsAttachmentPoint.z);
                }
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                if (hipsAddon.texture != null) {
                    this.func_110776_a(FlansModResourceHandler.getTexture(hipsAddon));
                }
                hipsAddon.model.render(mecha, f1);
            }
        }
        GL11.glPopMatrix();
        if (mecha.isPartIntact(EnumDriveablePart.leftArm)) {
            this.func_110777_b((Entity)mecha);
            GL11.glPushMatrix();
            float smoothedPitch = 0.0f;
            if (mecha.seats[0] != null) {
                smoothedPitch = mecha.seats[0].prevLooking.getPitch() + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
            }
            if (smoothedPitch > type.lowerArmLimit) {
                smoothedPitch = type.lowerArmLimit;
            }
            if (smoothedPitch < -type.upperArmLimit) {
                smoothedPitch = -type.upperArmLimit;
            }
            GL11.glTranslatef(type.leftArmOrigin.x, mecha.getMechaType().leftArmOrigin.y, mecha.getMechaType().leftArmOrigin.z);
            GL11.glRotatef(90.0f - smoothedPitch, 0.0f, 0.0f, 1.0f);
            GL11.glPushMatrix();
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (model != null) {
                model.renderLeftArm(scale, mecha, f1);
            }
            GL11.glPopMatrix();
            GL11.glTranslatef(0.0f + type.leftHandModifierY, -type.armLength - type.leftHandModifierX, 0.0f + type.leftHandModifierZ);
            final ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.leftTool);
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (holdingStack == null) {
                if (model != null) {
                    model.renderLeftHand(scale, mecha, f1);
                }
            }
            else {
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                this.renderItem(mecha, holdingStack, 0, true, f1);
            }
            GL11.glPopMatrix();
        }
        if (mecha.isPartIntact(EnumDriveablePart.rightArm)) {
            this.func_110777_b((Entity)mecha);
            GL11.glPushMatrix();
            float smoothedPitch = 0.0f;
            if (mecha.seats[0] != null) {
                smoothedPitch = mecha.seats[0].prevLooking.getPitch() + (mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch()) * f1;
            }
            if (smoothedPitch > type.lowerArmLimit) {
                smoothedPitch = type.lowerArmLimit;
            }
            if (smoothedPitch < -type.upperArmLimit) {
                smoothedPitch = -type.upperArmLimit;
            }
            GL11.glTranslatef(type.rightArmOrigin.x, mecha.getMechaType().rightArmOrigin.y, mecha.getMechaType().rightArmOrigin.z);
            GL11.glRotatef(90.0f - smoothedPitch, 0.0f, 0.0f, 1.0f);
            GL11.glPushMatrix();
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (model != null) {
                model.renderRightArm(scale, mecha, f1);
            }
            GL11.glPopMatrix();
            GL11.glTranslatef(0.0f + type.rightHandModifierY, -type.armLength - type.rightHandModifierX, 0.0f + type.rightHandModifierZ);
            GL11.glScalef(modelScale, modelScale, modelScale);
            final ItemStack holdingStack = mecha.inventory.getStackInSlot(EnumMechaSlotType.rightTool);
            if (holdingStack == null) {
                if (model != null) {
                    model.renderRightHand(scale, mecha, f1);
                }
            }
            else {
                GL11.glScalef(type.heldItemScale, type.heldItemScale, type.heldItemScale);
                this.renderItem(mecha, holdingStack, 0, false, f1);
            }
            GL11.glPopMatrix();
        }
        if (FlansMod.DEBUG) {
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glColor4f(1.0f, 0.0f, 0.0f, 0.3f);
            for (final DriveablePart part : mecha.getDriveableData().parts.values()) {
                if (part.box == null) {
                    continue;
                }
                func_76980_a(AxisAlignedBB.func_72330_a((double)(part.box.x / 16.0f), (double)(part.box.y / 16.0f), (double)(part.box.z / 16.0f), (double)((part.box.x + part.box.w) / 16.0f), (double)((part.box.y + part.box.h) / 16.0f), (double)((part.box.z + part.box.d) / 16.0f)));
            }
            GL11.glColor4f(0.0f, 0.0f, 1.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsPrimary) {
                func_76980_a(AxisAlignedBB.func_72330_a((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
            }
            GL11.glColor4f(0.0f, 1.0f, 0.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsSecondary) {
                func_76980_a(AxisAlignedBB.func_72330_a((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
            }
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        GL11.glPopMatrix();
        if (mecha.isPartIntact(EnumDriveablePart.hips)) {
            this.func_110777_b((Entity)mecha);
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d1, (float)d2);
            for (dYaw = mecha.legAxes.getYaw() - mecha.prevLegsYaw; dYaw > 180.0f; dYaw -= 360.0f) {}
            while (dYaw <= -180.0f) {
                dYaw += 360.0f;
            }
            GL11.glRotatef(-dYaw * f1 - mecha.prevLegsYaw, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(mecha.field_70127_C + dPitch * f1, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(mecha.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
            GL11.glScalef(modelScale, modelScale, modelScale);
            if (model != null) {
                final float legLength = type.legLength;
                final float dLLUR = mecha.leftLegUpperAngle - mecha.prevLeftLegUpperAngle;
                final float dLLLR = mecha.leftLegLowerAngle - mecha.prevLeftLegLowerAngle;
                final float dLFR = mecha.leftFootAngle - mecha.prevLeftFootAngle;
                final float dRLUR = mecha.rightLegUpperAngle - mecha.prevRightLegUpperAngle;
                final float dRLLR = mecha.rightLegLowerAngle - mecha.prevRightLegLowerAngle;
                final float dRFR = mecha.rightFootAngle - mecha.prevRightFootAngle;
                final float leftLegUpperRot = (float)Math.toRadians(mecha.prevLeftLegUpperAngle + dLLUR * f1);
                final float rightLegUpperRot = (float)Math.toRadians(mecha.prevRightLegUpperAngle + dRLUR * f1);
                final float leftLegLowerRot = (float)Math.toRadians(mecha.prevLeftLegLowerAngle + dLLLR * f1);
                final float rightLegLowerRot = (float)Math.toRadians(mecha.prevRightLegLowerAngle + dRLLR * f1);
                final float leftFootRot = (float)Math.toRadians(mecha.prevLeftFootAngle + dLFR * f1);
                final float rightFootRot = (float)Math.toRadians(mecha.rightFootAngle + dRFR * f1);
                final float legsYaw = (float)Math.sin((mecha.field_70173_aa + f1) / type.legSwingTime) * mecha.legSwing;
                final float footH = (float)Math.sin(legsYaw) * legLength;
                final float footV = (float)Math.cos(legsYaw) * legLength;
                model.renderHips(scale, mecha, f1);
                GL11.glPushMatrix();
                GL11.glTranslatef(0.0f, legLength, 0.0f);
                GL11.glPushMatrix();
                GL11.glTranslatef(footH, -footV, 0.0f);
                model.renderLeftFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glTranslatef(-footH, -footV, 0.0f);
                model.renderRightFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(legsYaw * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -legLength, 0.0f);
                model.renderLeftLeg(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(-legsYaw * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -legLength, 0.0f);
                model.renderRightLeg(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(leftLegUpperRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -legLength, 0.0f);
                model.renderLeftAnimLegUpper(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glRotatef(rightLegUpperRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -legLength, 0.0f);
                model.renderRightAnimLegUpper(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glPushMatrix();
                final Vector3f leftLegLowerPos = this.rotatedChildPosition(model.leftLegUpperOrigin, model.leftLegLowerOrigin, leftLegUpperRot);
                GL11.glTranslatef(model.leftLegUpperOrigin.x, model.leftLegUpperOrigin.y, model.leftLegUpperOrigin.z);
                GL11.glTranslatef(leftLegLowerPos.x, -leftLegLowerPos.y, 0.0f);
                GL11.glRotatef(leftLegLowerRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                model.renderLeftAnimLegLower(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                final Vector3f rightLegLowerPos = this.rotatedChildPosition(model.rightLegUpperOrigin, model.rightLegLowerOrigin, rightLegUpperRot);
                GL11.glTranslatef(model.rightLegUpperOrigin.x, model.rightLegUpperOrigin.y, model.rightLegUpperOrigin.z);
                GL11.glTranslatef(rightLegLowerPos.x, -rightLegLowerPos.y, 0.0f);
                GL11.glRotatef(rightLegLowerRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                model.renderRightAnimLegLower(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                final Vector3f leftFootPos = this.rotatedChildPosition(model.leftLegLowerOrigin, model.leftFootOrigin, leftLegLowerRot);
                GL11.glTranslatef(-model.leftFootOrigin.x, legLength, -model.leftFootOrigin.z);
                GL11.glTranslatef(leftFootPos.x + leftLegLowerPos.x, -leftFootPos.y - leftLegLowerPos.y, 0.0f);
                GL11.glRotatef(leftFootRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                model.renderLeftAnimFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                final Vector3f rightFootPos = this.rotatedChildPosition(model.rightLegLowerOrigin, model.rightFootOrigin, rightLegLowerRot);
                GL11.glTranslatef(-model.rightFootOrigin.x, legLength, -model.rightFootOrigin.z);
                GL11.glTranslatef(rightFootPos.x + rightLegLowerPos.x, -rightFootPos.y - rightLegLowerPos.y, 0.0f);
                GL11.glRotatef(rightFootRot * 180.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                model.renderRightAnimFoot(scale, mecha, f1);
                GL11.glPopMatrix();
                GL11.glPopMatrix();
            }
            GL11.glPopMatrix();
        }
    }
    
    public void func_76986_a(final Entity entity, final double d0, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityMecha)entity, d0, d1, d2, f, f1);
    }
    
    public Vector3f rotatedChildPosition(final Vector3f parentJoint, final Vector3f childJoint, final float rotation) {
        final float yDiff = parentJoint.y - childJoint.y;
        final float xDiff = parentJoint.x - childJoint.x;
        final float length = (float)Math.sqrt(yDiff * yDiff + xDiff * xDiff);
        final float initialRot = (float)Math.atan(xDiff / yDiff);
        final float xPos = (float)Math.sin(rotation - initialRot) * length;
        final float yPos = (float)Math.cos(rotation - initialRot) * length;
        final Vector3f position = new Vector3f(xPos, yPos, 0.0f);
        return position;
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
        final DriveableType type = ((EntityDriveable)entity).getDriveableType();
        final Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
        return FlansModResourceHandler.getPaintjobTexture(paintjob);
    }
    
    private void renderItem(final EntityMecha mecha, final ItemStack stack, final int par3, final boolean leftHand, final float dT) {
        GL11.glPushMatrix();
        final TextureManager texturemanager = Minecraft.func_71410_x().func_110434_K();
        final Item item = stack.func_77973_b();
        if (item instanceof ItemMechaAddon) {
            GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(0.0f, 0.0f, 0.0f);
            final ItemMechaAddon toolItem = (ItemMechaAddon)item;
            final MechaItemType toolType = toolItem.type;
            this.func_110776_a(FlansModResourceHandler.getTexture(toolType));
            if (toolType.model != null) {
                toolType.model.render(mecha, dT);
                GL11.glPushMatrix();
                if ((leftHand && mecha.leftMouseHeld) || (!leftHand && mecha.rightMouseHeld)) {
                    GL11.glRotatef(25.0f * mecha.field_70173_aa, 1.0f, 0.0f, 0.0f);
                }
                toolType.model.renderDrill(mecha, dT);
                GL11.glPopMatrix();
                toolType.model.renderSaw(mecha, dT, (leftHand && mecha.leftMouseHeld) || (!leftHand && mecha.rightMouseHeld));
            }
        }
        else if (item instanceof ItemGun && ((ItemGun)item).type.model != null) {
            final GunType gunType = ((ItemGun)item).type;
            final ModelGun model = gunType.model;
            GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
            texturemanager.func_110577_a(FlansModResourceHandler.getTexture(gunType));
            final IItemRenderer.ItemRenderType type = IItemRenderer.ItemRenderType.ENTITY;
            ClientProxy.gunRenderer.renderGun(stack, gunType, 0.0625f, model, leftHand ? mecha.leftAnimations : mecha.rightAnimations, 0.0f, type);
        }
        else {
            final IIcon icon = stack.func_77954_c();
            if (icon == null) {
                GL11.glPopMatrix();
                return;
            }
            texturemanager.func_110577_a(texturemanager.func_130087_a(stack.func_94608_d()));
            final Tessellator tessellator = Tessellator.field_78398_a;
            final float f = icon.func_94209_e();
            final float f2 = icon.func_94212_f();
            final float f3 = icon.func_94206_g();
            final float f4 = icon.func_94210_h();
            final float f5 = 0.0f;
            final float f6 = 0.3f;
            GL11.glEnable(32826);
            GL11.glTranslatef(-f5, -f6, 0.0f);
            final float f7 = 1.5f;
            GL11.glScalef(f7, f7, f7);
            GL11.glTranslatef(0.2f, 0.7f, 0.0f);
            GL11.glRotatef(0.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-133.0f, 0.0f, 0.0f, 1.0f);
            final ItemRenderer renderer = RenderMecha.renderer;
            ItemRenderer.func_78439_a(tessellator, f2, f3, f, f4, icon.func_94211_a(), icon.func_94216_b(), 0.0625f);
            if (stack.hasEffect(par3)) {
                GL11.glDepthFunc(514);
                GL11.glDisable(2896);
                texturemanager.func_110577_a(RenderMecha.RES_ITEM_GLINT);
                GL11.glEnable(3042);
                GL11.glBlendFunc(768, 1);
                final float f8 = 0.76f;
                GL11.glColor4f(0.5f * f8, 0.25f * f8, 0.8f * f8, 1.0f);
                GL11.glMatrixMode(5890);
                GL11.glPushMatrix();
                final float f9 = 0.125f;
                GL11.glScalef(f9, f9, f9);
                float f10 = Minecraft.func_71386_F() % 3000L / 3000.0f * 8.0f;
                GL11.glTranslatef(f10, 0.0f, 0.0f);
                GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
                final ItemRenderer renderer2 = RenderMecha.renderer;
                ItemRenderer.func_78439_a(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glPushMatrix();
                GL11.glScalef(f9, f9, f9);
                f10 = Minecraft.func_71386_F() % 4873L / 4873.0f * 8.0f;
                GL11.glTranslatef(-f10, 0.0f, 0.0f);
                GL11.glRotatef(10.0f, 0.0f, 0.0f, 1.0f);
                final ItemRenderer renderer3 = RenderMecha.renderer;
                ItemRenderer.func_78439_a(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
                GL11.glPopMatrix();
                GL11.glMatrixMode(5888);
                GL11.glDisable(3042);
                GL11.glEnable(2896);
                GL11.glDepthFunc(515);
            }
            GL11.glDisable(32826);
        }
        GL11.glPopMatrix();
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case ENTITY: {
                return Minecraft.func_71410_x().field_71474_y.field_74347_j && item != null && item.func_77973_b() instanceof ItemMecha && ((ItemMecha)item.func_77973_b()).type.model != null;
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
        GL11.glPushMatrix();
        if (item != null && item.func_77973_b() instanceof ItemMecha) {
            final MechaType mechaType = ((ItemMecha)item.func_77973_b()).type;
            if (mechaType.model != null) {
                float scale = 0.5f;
                switch (type) {
                    case ENTITY: {
                        scale = 1.5f;
                        GL11.glRotatef((float)((EntityItem)data[1]).field_70173_aa, 0.0f, 1.0f, 0.0f);
                        break;
                    }
                    case EQUIPPED: {
                        GL11.glRotatef(15.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(15.0f, 1.0f, 0.0f, 0.0f);
                        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.0f, 0.1f, -0.4f);
                        scale = 1.0f;
                        break;
                    }
                    case EQUIPPED_FIRST_PERSON: {
                        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.15f, 0.35f, -0.6f);
                        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                        break;
                    }
                }
                GL11.glScalef(scale / mechaType.cameraDistance, scale / mechaType.cameraDistance, scale / mechaType.cameraDistance);
                Minecraft.func_71410_x().field_71446_o.func_110577_a(FlansModResourceHandler.getTexture(mechaType));
                final ModelDriveable model = mechaType.model;
                model.render(mechaType);
            }
        }
        GL11.glPopMatrix();
    }
    
    static {
        RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
        renderer = new ItemRenderer(Minecraft.func_71410_x());
    }
}
