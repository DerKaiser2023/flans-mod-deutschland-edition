// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.driveables.EnumDriveablePart;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.driveables.mechas.MechaType;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelMecha extends ModelDriveable
{
    public ModelRendererTurbo[] leftArmModel;
    public ModelRendererTurbo[] rightArmModel;
    public ModelRendererTurbo[] leftHandModel;
    public ModelRendererTurbo[] rightHandModel;
    public ModelRendererTurbo[] hipsModel;
    public ModelRendererTurbo[] leftLegModel;
    public ModelRendererTurbo[] rightLegModel;
    public ModelRendererTurbo[] leftFootModel;
    public ModelRendererTurbo[] rightFootModel;
    public ModelRendererTurbo[] headModel;
    public ModelRendererTurbo[] barrelModel;
    public ModelRendererTurbo[] leftAnimLegUpperModel;
    public ModelRendererTurbo[] rightAnimLegUpperModel;
    public ModelRendererTurbo[] leftAnimLegLowerModel;
    public ModelRendererTurbo[] rightAnimLegLowerModel;
    public ModelRendererTurbo[] leftAnimFootModel;
    public ModelRendererTurbo[] rightAnimFootModel;
    public Vector3f hipsAttachmentPoint;
    public Vector3f legsOrigin;
    public Vector3f leftLegUpperOrigin;
    public Vector3f leftLegLowerOrigin;
    public Vector3f rightLegUpperOrigin;
    public Vector3f rightLegLowerOrigin;
    public Vector3f rightFootOrigin;
    public Vector3f leftFootOrigin;
    
    public ModelMecha() {
        this.leftArmModel = new ModelRendererTurbo[0];
        this.rightArmModel = new ModelRendererTurbo[0];
        this.leftHandModel = new ModelRendererTurbo[0];
        this.rightHandModel = new ModelRendererTurbo[0];
        this.hipsModel = new ModelRendererTurbo[0];
        this.leftLegModel = new ModelRendererTurbo[0];
        this.rightLegModel = new ModelRendererTurbo[0];
        this.leftFootModel = new ModelRendererTurbo[0];
        this.rightFootModel = new ModelRendererTurbo[0];
        this.headModel = new ModelRendererTurbo[0];
        this.barrelModel = new ModelRendererTurbo[0];
        this.leftAnimLegUpperModel = new ModelRendererTurbo[0];
        this.rightAnimLegUpperModel = new ModelRendererTurbo[0];
        this.leftAnimLegLowerModel = new ModelRendererTurbo[0];
        this.rightAnimLegLowerModel = new ModelRendererTurbo[0];
        this.leftAnimFootModel = new ModelRendererTurbo[0];
        this.rightAnimFootModel = new ModelRendererTurbo[0];
        this.hipsAttachmentPoint = new Vector3f();
        this.legsOrigin = new Vector3f();
        this.leftLegUpperOrigin = new Vector3f();
        this.leftLegLowerOrigin = new Vector3f();
        this.rightLegUpperOrigin = new Vector3f();
        this.rightLegLowerOrigin = new Vector3f();
        this.rightFootOrigin = new Vector3f();
        this.leftFootOrigin = new Vector3f();
    }
    
    @Override
    public void render(final EntityDriveable driveable, final float f1) {
        this.render(0.0625f, (EntityMecha)driveable, f1);
    }
    
    @Override
    public void render(final DriveableType type) {
        super.render(type);
        final MechaType mechaType = (MechaType)type;
        this.renderPart(this.hipsModel);
        this.renderPart(this.leftLegModel);
        this.renderPart(this.rightLegModel);
        this.renderPart(this.leftFootModel);
        this.renderPart(this.rightFootModel);
        GL11.glPushMatrix();
        this.renderPart(this.leftAnimLegUpperModel);
        this.renderPart(this.rightAnimLegUpperModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftLegLowerOrigin.x, this.leftLegLowerOrigin.y, this.leftLegLowerOrigin.z);
        this.renderPart(this.leftAnimLegLowerModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightLegLowerOrigin.x, this.rightLegLowerOrigin.y, this.rightLegLowerOrigin.z);
        this.renderPart(this.rightAnimLegLowerModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftFootOrigin.x, this.leftFootOrigin.y, -this.leftFootOrigin.z);
        this.renderPart(this.leftAnimFootModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightFootOrigin.x, this.rightFootOrigin.y, -this.rightFootOrigin.z);
        this.renderPart(this.rightAnimFootModel);
        GL11.glPopMatrix();
        this.renderPart(this.barrelModel);
        this.renderPart(this.headModel);
        GL11.glPushMatrix();
        GL11.glTranslatef(mechaType.leftArmOrigin.x / mechaType.modelScale, mechaType.leftArmOrigin.y / mechaType.modelScale, mechaType.leftArmOrigin.z / mechaType.modelScale);
        this.renderPart(this.leftArmModel);
        this.renderPart(this.leftHandModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(mechaType.rightArmOrigin.x / mechaType.modelScale, mechaType.rightArmOrigin.y / mechaType.modelScale, mechaType.rightArmOrigin.z / mechaType.modelScale);
        this.renderPart(this.rightArmModel);
        this.renderPart(this.rightHandModel);
        GL11.glPopMatrix();
    }
    
    public void render(final float f5, final EntityMecha mecha, final float f) {
        if (mecha.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aBodyModel : this.bodyModel) {
                aBodyModel.render(f5);
            }
        }
        if (mecha.isPartIntact(EnumDriveablePart.head)) {
            for (final ModelRendererTurbo model : this.headModel) {
                model.render(f5);
            }
        }
        float pitch = 0.0f;
        if (mecha.seats[0] != null) {
            if (mecha.seats[0].looking != null) {
                pitch = mecha.seats[0].looking.getPitch();
                final float dPitch = mecha.seats[0].looking.getPitch() - mecha.seats[0].prevLooking.getPitch();
                final float n = mecha.seats[0].prevLooking.getPitch() + dPitch * f;
            }
            else if (mecha.seats[0].looking == null) {
                pitch = 0.0f;
            }
        }
        if (mecha.isPartIntact(EnumDriveablePart.barrel)) {
            for (final ModelRendererTurbo aBarrelModel : this.barrelModel) {
                aBarrelModel.rotateAngleZ = -(pitch * 3.1415927f / 180.0f);
                aBarrelModel.render(f5, this.oldRotateOrder);
            }
        }
    }
    
    public void renderLeftArm(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftArmModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftHand(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftHandModel) {
            model.render(f5);
        }
    }
    
    public void renderRightArm(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightArmModel) {
            model.render(f5);
        }
    }
    
    public void renderRightHand(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightHandModel) {
            model.render(f5);
        }
    }
    
    public void renderRightFoot(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightFootModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftFoot(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftFootModel) {
            model.render(f5);
        }
    }
    
    public void renderRightLeg(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightLegModel) {
            model.render(f5);
        }
    }
    
    public void renderRightAnimLegUpper(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightAnimLegUpperModel) {
            model.render(f5);
        }
    }
    
    public void renderRightAnimLegLower(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightAnimLegLowerModel) {
            model.render(f5);
        }
    }
    
    public void renderRightAnimFoot(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.rightAnimFootModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftAnimLegUpper(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftAnimLegUpperModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftAnimLegLower(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftAnimLegLowerModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftAnimFoot(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftAnimFootModel) {
            model.render(f5);
        }
    }
    
    public void renderLeftLeg(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.leftLegModel) {
            model.render(f5);
        }
    }
    
    public void renderHips(final float f5, final EntityMecha mecha, final float f) {
        for (final ModelRendererTurbo model : this.hipsModel) {
            model.render(f5);
        }
    }
    
    @Override
    public void flipAll() {
        super.flipAll();
        this.flip(this.leftArmModel);
        this.flip(this.rightArmModel);
        this.flip(this.leftHandModel);
        this.flip(this.rightHandModel);
        this.flip(this.hipsModel);
        this.flip(this.leftLegModel);
        this.flip(this.rightLegModel);
        this.flip(this.leftAnimLegUpperModel);
        this.flip(this.rightAnimLegUpperModel);
        this.flip(this.leftAnimLegLowerModel);
        this.flip(this.rightAnimLegLowerModel);
        this.flip(this.leftAnimFootModel);
        this.flip(this.rightAnimFootModel);
        this.flip(this.leftFootModel);
        this.flip(this.rightFootModel);
        this.flip(this.headModel);
        this.flip(this.barrelModel);
    }
    
    @Override
    public void translateAll(final float x, final float y, final float z) {
        super.translateAll(x, y, z);
        this.translate(this.leftArmModel, x, y, z);
        this.translate(this.rightArmModel, x, y, z);
        this.translate(this.leftHandModel, x, y, z);
        this.translate(this.rightHandModel, x, y, z);
        this.translate(this.hipsModel, x, y, z);
        this.translate(this.leftLegModel, x, y, z);
        this.translate(this.rightLegModel, x, y, z);
        this.translate(this.leftFootModel, x, y, z);
        this.translate(this.rightFootModel, x, y, z);
        this.translate(this.leftAnimLegUpperModel, x, y, z);
        this.translate(this.rightAnimLegUpperModel, x, y, z);
        this.translate(this.leftAnimLegLowerModel, x, y, z);
        this.translate(this.rightAnimLegLowerModel, x, y, z);
        this.translate(this.leftAnimFootModel, x, y, z);
        this.translate(this.rightAnimFootModel, x, y, z);
        this.translate(this.headModel, x, y, z);
        this.translate(this.barrelModel, x, y, z);
    }
}
