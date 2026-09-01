// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.model.ModelBase;
import com.flansmod.common.guns.BulletType;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import com.flansmod.client.model.animation.AnimationPart;
import com.flansmod.client.model.animation.AnimationController;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.client.Minecraft;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.driveables.Propeller;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.FlansMod;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.EntityDriveable;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.driveables.EntityPlane;
import net.minecraftforge.client.IItemRenderer;
import net.minecraft.client.renderer.entity.Render;

public class RenderPlane extends Render implements IItemRenderer
{
    public RenderPlane() {
        this.shadowSize = 1.0f;
    }
    
    public void render(final EntityPlane entityPlane, final double d, final double d1, final double d2, final float f, final float f1) {
        if (entityPlane.ridingEntity != null && entityPlane.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            return;
        }
        this.bindEntityTexture((Entity)entityPlane);
        final PlaneType type = entityPlane.getPlaneType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw;
        for (dYaw = entityPlane.axes.getYaw() - entityPlane.prevRotationYaw; dYaw > 180.0f; dYaw -= 360.0f) {}
        while (dYaw <= -180.0f) {
            dYaw += 360.0f;
        }
        float dPitch;
        for (dPitch = entityPlane.axes.getPitch() - entityPlane.prevRotationPitch; dPitch > 180.0f; dPitch -= 360.0f) {}
        while (dPitch <= -180.0f) {
            dPitch += 360.0f;
        }
        float dRoll;
        for (dRoll = entityPlane.axes.getRoll() - entityPlane.prevRotationRoll; dRoll > 180.0f; dRoll -= 360.0f) {}
        while (dRoll <= -180.0f) {
            dRoll += 360.0f;
        }
        GL11.glRotatef(180.0f - entityPlane.prevRotationYaw - dYaw * f1, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(entityPlane.prevRotationPitch + dPitch * f1, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(entityPlane.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
        final ModelPlane model = (ModelPlane)type.model;
        if (model != null) {
            GL11.glPushMatrix();
            float division = 1.0f;
            if (!type.parasitePlane) {
                division = (22.0f + 1.15f * entityPlane.driveableData.catapult) / 22.0f;
            }
            GL11.glScalef(type.modelScale / division, type.modelScale / division, type.modelScale / division);
            model.render(entityPlane, f1);
            final float dRotorAngle = entityPlane.rotorAngle - entityPlane.prevRotorAngle;
            final float rotorAngle = entityPlane.prevRotorAngle + dRotorAngle * f1;
            for (int i = 0; i < model.heliMainRotorModels.length; ++i) {
                GL11.glPushMatrix();
                GL11.glTranslatef(model.heliMainRotorOrigins[i].x, model.heliMainRotorOrigins[i].y, model.heliMainRotorOrigins[i].z);
                GL11.glRotatef((entityPlane.rotorAngle + f1 * entityPlane.throttle / 7.0f) * model.heliRotorSpeeds[i] * 1440.0f / 3.1415927f, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(-model.heliMainRotorOrigins[i].x, -model.heliMainRotorOrigins[i].y, -model.heliMainRotorOrigins[i].z);
                model.renderRotor(entityPlane, 0.0625f, i);
                GL11.glPopMatrix();
            }
            for (int i = 0; i < model.heliTailRotorModels.length; ++i) {
                GL11.glPushMatrix();
                GL11.glTranslatef(model.heliTailRotorOrigins[i].x, model.heliTailRotorOrigins[i].y, model.heliTailRotorOrigins[i].z);
                GL11.glRotatef((entityPlane.rotorAngle + f1 * entityPlane.throttle / 7.0f) * 1440.0f / 3.1415927f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(-model.heliTailRotorOrigins[i].x, -model.heliTailRotorOrigins[i].y, -model.heliTailRotorOrigins[i].z);
                model.renderTailRotor(entityPlane, 0.0625f, i);
                GL11.glPopMatrix();
            }
            final Vector3f wingPos = this.getRenderPosition(entityPlane.wingPos, entityPlane.prevWingPos, f1);
            final Vector3f wingRot = this.getRenderPosition(entityPlane.wingRot, entityPlane.prevWingRot, f1);
            if (entityPlane.initiatedAnim) {
                final AnimationController cont = entityPlane.anim;
                final AnimationPart p = cont.getCorePart();
                this.renderAnimPart(p, new Vector3f(0.0f, 0.0f, 0.0f), model, entityPlane, 0.0625f, f1);
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(model.leftWingAttach.x + wingPos.x / 16.0f, model.leftWingAttach.y + wingPos.y / 16.0f, -model.leftWingAttach.z + wingPos.z / 16.0f);
            GL11.glRotatef(wingRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(wingRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(wingRot.z, 0.0f, 0.0f, 1.0f);
            model.renderLeftWing(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef(model.rightWingAttach.x + wingPos.x / 16.0f, model.rightWingAttach.y + wingPos.y / 16.0f, -model.rightWingAttach.z + wingPos.z / 16.0f);
            GL11.glRotatef(-wingRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-wingRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(wingRot.z, 0.0f, 0.0f, 1.0f);
            model.renderRightWing(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef(model.leftWingWheelAttach.x + entityPlane.wingWheelPos.x / 16.0f, model.leftWingWheelAttach.y + entityPlane.wingWheelPos.y / 16.0f, -model.leftWingWheelAttach.z + entityPlane.wingWheelPos.z / 16.0f);
            GL11.glRotatef(entityPlane.wingWheelRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(entityPlane.wingWheelRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(entityPlane.wingWheelRot.z, 0.0f, 0.0f, 1.0f);
            model.renderLeftWingWheel(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef(model.rightWingWheelAttach.x + entityPlane.wingWheelPos.x / 16.0f, model.rightWingWheelAttach.y + entityPlane.wingWheelPos.y / 16.0f, -model.rightWingWheelAttach.z + entityPlane.wingWheelPos.z / 16.0f);
            GL11.glRotatef(-entityPlane.wingWheelRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-entityPlane.wingWheelRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(entityPlane.wingWheelRot.z, 0.0f, 0.0f, 1.0f);
            model.renderRightWingWheel(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef(model.bodyWheelAttach.x + entityPlane.coreWheelPos.x / 16.0f, model.bodyWheelAttach.y + entityPlane.coreWheelPos.y / 16.0f, model.bodyWheelAttach.z + entityPlane.coreWheelPos.z / 16.0f);
            GL11.glRotatef(entityPlane.coreWheelRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(entityPlane.coreWheelRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(entityPlane.coreWheelRot.z, 0.0f, 0.0f, 1.0f);
            model.renderCoreWheel(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glTranslatef(model.tailWheelAttach.x + entityPlane.tailWheelPos.x / 16.0f, model.tailWheelAttach.y + entityPlane.tailWheelPos.y / 16.0f, model.tailWheelAttach.z + entityPlane.tailWheelPos.z / 16.0f);
            GL11.glRotatef(entityPlane.tailWheelRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(entityPlane.tailWheelRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(entityPlane.tailWheelRot.z, 0.0f, 0.0f, 1.0f);
            model.renderTailWheel(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            final Vector3f doorPos = this.getRenderPosition(entityPlane.doorPos, entityPlane.prevDoorPos, f1);
            final Vector3f doorRot = this.getRenderPosition(entityPlane.doorRot, entityPlane.prevDoorRot, f1);
            GL11.glPushMatrix();
            GL11.glTranslatef(model.doorAttach.x + doorPos.x / 16.0f, model.doorAttach.y + doorPos.y / 16.0f, model.doorAttach.z + doorPos.z / 16.0f);
            GL11.glRotatef(doorRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(doorRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(doorRot.z, 0.0f, 0.0f, 1.0f);
            model.renderDoor(entityPlane, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
        }
        if (FlansMod.DEBUG) {
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glDisable(2929);
            GL11.glColor4f(1.0f, 0.0f, 0.0f, 0.03f);
            GL11.glScalef(-1.0f, 1.0f, -1.0f);
            for (final DriveablePart part : entityPlane.getDriveableData().parts.values()) {
                if (part.box == null) {
                    continue;
                }
                if (part.type == EnumDriveablePart.core || part.type == EnumDriveablePart.engine || part.type == EnumDriveablePart.engine2 || part.type == EnumDriveablePart.engine3 || part.type == EnumDriveablePart.engine4 || part.type == EnumDriveablePart.engine5 || part.type == EnumDriveablePart.engine6) {
                    GL11.glColor4f(3.0f, 0.0f, 0.0f, 0.5f);
                }
                else if (part.type == EnumDriveablePart.airframe) {
                    GL11.glColor4f(0.0f, 2.0f, 2.0f, 0.3f);
                }
                else if (part.type == EnumDriveablePart.leftWing || part.type == EnumDriveablePart.rightWing || part.type == EnumDriveablePart.tail || part.type == EnumDriveablePart.nose || part.type == EnumDriveablePart.blades) {
                    GL11.glColor4f(0.0f, 0.0f, 2.0f, 0.3f);
                }
                else {
                    GL11.glColor4f(1.5f, 1.5f, 0.0f, 0.2f);
                }
                renderAABB(AxisAlignedBB.getBoundingBox((double)part.box.x, (double)part.box.y, (double)part.box.z, (double)(part.box.x + part.box.w), (double)(part.box.y + part.box.h), (double)(part.box.z + part.box.d)));
            }
            GL11.glColor4f(1.0f, 1.0f, 0.0f, 0.3f);
            for (final Propeller prop : type.propellers) {
                renderAABB(AxisAlignedBB.getBoundingBox((double)(prop.x / 16.0f - 0.25f), (double)(prop.y / 16.0f - 0.25f), (double)(prop.z / 16.0f - 0.25f), (double)(prop.x / 16.0f + 0.25f), (double)(prop.y / 16.0f + 0.25f), (double)(prop.z / 16.0f + 0.25f)));
            }
            GL11.glColor4f(1.0f, 0.0f, 1.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsPrimary) {
                renderAABB(AxisAlignedBB.getBoundingBox((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
            }
            GL11.glColor4f(0.0f, 1.0f, 0.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsSecondary) {
                renderAABB(AxisAlignedBB.getBoundingBox((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
            }
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        if (TeamsManager.shellsEnabled) {
            int slot = -1;
            for (int j = entityPlane.getDriveableData().getMissileInventoryStart(); j < entityPlane.getDriveableData().getMissileInventoryStart() + type.numMissileSlots; ++j) {
                final ItemStack shell = entityPlane.getDriveableData().getStackInSlot(j);
                if (shell != null && shell.getItem() instanceof ItemBullet) {
                    slot = j;
                }
            }
            if (slot != -1) {
                final ItemStack bulletStack = entityPlane.driveableData.getStackInSlot(slot);
                final ItemBullet item = (ItemBullet)bulletStack.getItem();
                if (item instanceof ItemBullet && item.type.model != null && item.type.wingVisible && type.missileVisible) {
                    final BulletType gunType = item.type;
                    final ModelBase modelo = item.type.model;
                    final TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
                    final ModelBase modelLauncher = item.type.launcherMesh;
                    if (item.type.hasLauncherModel) {
                        texturemanager.bindTexture(FlansModResourceHandler.getAlternateTexture(gunType));
                        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                        if (entityPlane.isPartIntact(EnumDriveablePart.leftWing)) {
                            final IItemRenderer.ItemRenderType typerino = IItemRenderer.ItemRenderType.ENTITY;
                            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(type.missileWingSpan, type.missileForward, -1.0f * type.missileElevation);
                            modelLauncher.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                        }
                        if (entityPlane.isPartIntact(EnumDriveablePart.rightWing)) {
                            GL11.glTranslatef(type.missileWingSpan * -2.0f, 0.0f, 0.0f);
                            modelLauncher.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                        }
                    }
                    if (!item.type.hasLauncherModel) {
                        texturemanager.bindTexture(FlansModResourceHandler.getTexture(gunType));
                        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
                        final IItemRenderer.ItemRenderType typerino = IItemRenderer.ItemRenderType.ENTITY;
                        if (entityPlane.isPartIntact(EnumDriveablePart.leftWing)) {
                            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(type.missileWingSpan, type.missileForward, -1.0f * type.missileElevation);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                        }
                        if (entityPlane.isPartIntact(EnumDriveablePart.rightWing)) {
                            GL11.glTranslatef(type.missileWingSpan * -2.0f, 0.0f, 0.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                        }
                    }
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    public Vector3f getRenderPosition(final Vector3f current, final Vector3f previous, final float f) {
        final Vector3f diff = new Vector3f(current.x - previous.x, current.y - previous.y, current.z - previous.z);
        final Vector3f corrected = new Vector3f(previous.x + diff.x * f, previous.y + diff.y * f, previous.z + diff.z * f);
        return corrected;
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityPlane)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final DriveableType type = ((EntityDriveable)entity).getDriveableType();
        final Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
        return FlansModResourceHandler.getPaintjobTexture(paintjob);
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON:
            case ENTITY: {
                return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null && item.getItem() instanceof ItemPlane && ((ItemPlane)item.getItem()).type.model != null;
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
        if (item != null && item.getItem() instanceof ItemPlane) {
            final PlaneType planeType = ((ItemPlane)item.getItem()).type;
            if (planeType.model != null) {
                float scale = 0.5f;
                switch (type) {
                    case ENTITY: {
                        scale = 1.5f;
                        GL11.glRotatef((float)((EntityItem)data[1]).ticksExisted, 0.0f, 1.0f, 0.0f);
                        break;
                    }
                    case EQUIPPED: {
                        GL11.glRotatef(15.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(15.0f, 1.0f, 0.0f, 0.0f);
                        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.0f, 0.2f, 0.4f);
                        scale = 1.0f;
                        break;
                    }
                    case EQUIPPED_FIRST_PERSON: {
                        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.15f, 0.45f, -0.6f);
                        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
                        break;
                    }
                }
                GL11.glScalef(scale / planeType.cameraDistance, scale / planeType.cameraDistance, scale / planeType.cameraDistance);
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(planeType));
                final ModelDriveable model = planeType.model;
                model.render(planeType);
            }
        }
        GL11.glPopMatrix();
    }
    
    public int getPartId(final int i) {
        final int id = i;
        return id;
    }
    
    public void renderAnimPart(final AnimationPart p, final Vector3f parent, final ModelPlane mod, final EntityPlane plane, final float f5, final float f1) {
        final Vector3f pos = Vector3f.sub(p.position, parent, null);
        final Vector3f offset = this.Interpolate(p.offset, p.prevOff, f1);
        final Vector3f rotation = this.Interpolate(p.rotation, p.prevRot, f1);
        GL11.glPushMatrix();
        GL11.glTranslatef(pos.x / 16.0f, -pos.y / 16.0f, -pos.z / 16.0f);
        GL11.glRotatef(rotation.x, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(rotation.y, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(rotation.z, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(offset.x / 16.0f, offset.y / 16.0f, offset.z / 16.0f);
        final int i = this.getPartId(p.type);
        mod.renderValk(plane, f5, i);
        if (p.hasChildren) {
            for (final AnimationPart p2 : p.children) {
                this.renderAnimPart(p2, p.position, mod, plane, f5, f1);
            }
        }
        GL11.glPopMatrix();
    }
    
    public Vector3f Interpolate(final Vector3f current, final Vector3f prev, final float f1) {
        final Vector3f result = new Vector3f(prev.x + (current.x - prev.x) * f1, prev.y + (current.y - prev.y) * f1, prev.z + (current.z - prev.z) * f1);
        return result;
    }
}
