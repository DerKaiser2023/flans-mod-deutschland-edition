// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.driveables.EntitySeat;
import java.util.Iterator;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.Propeller;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPlane extends ModelDriveable
{
    public ModelRendererTurbo[] noseModel;
    public ModelRendererTurbo[] leftWingModel;
    public ModelRendererTurbo[] rightWingModel;
    public ModelRendererTurbo[] topWingModel;
    public ModelRendererTurbo[] bayModel;
    public ModelRendererTurbo[] tailModel;
    public ModelRendererTurbo[][] propellerModels;
    public ModelRendererTurbo[] yawFlapModel;
    public ModelRendererTurbo[] pitchFlapLeftModel;
    public ModelRendererTurbo[] pitchFlapRightModel;
    public ModelRendererTurbo[] pitchFlapLeftWingModel;
    public ModelRendererTurbo[] pitchFlapRightWingModel;
    public ModelRendererTurbo[] leftAnimWingModel;
    public ModelRendererTurbo[] rightAnimWingModel;
    public Vector3f leftWingAttach;
    public Vector3f rightWingAttach;
    public ModelRendererTurbo[] bodyAnimWheelModel;
    public ModelRendererTurbo[] tailAnimWheelModel;
    public ModelRendererTurbo[] leftAnimWingWheelModel;
    public ModelRendererTurbo[] rightAnimWingWheelModel;
    public Vector3f bodyWheelAttach;
    public Vector3f tailWheelAttach;
    public Vector3f leftWingWheelAttach;
    public Vector3f rightWingWheelAttach;
    public ModelRendererTurbo[] doorAnimModel;
    public Vector3f doorAttach;
    public ModelRendererTurbo[][] heliMainRotorModels;
    public Vector3f[] heliMainRotorOrigins;
    public float[] heliRotorSpeeds;
    public ModelRendererTurbo[][] heliTailRotorModels;
    public Vector3f[] heliTailRotorOrigins;
    public ModelRendererTurbo[] skidsModel;
    public ModelRendererTurbo[] helicopterModeParts;
    public ModelRendererTurbo[] planeModeParts;
    public ModelRendererTurbo[] bodyWheelModel;
    public ModelRendererTurbo[] tailWheelModel;
    public ModelRendererTurbo[] leftWingWheelModel;
    public ModelRendererTurbo[] rightWingWheelModel;
    public ModelRendererTurbo[] tailDoorOpenModel;
    public ModelRendererTurbo[] tailDoorCloseModel;
    public ModelRendererTurbo[] rightWingPos1Model;
    public ModelRendererTurbo[] rightWingPos2Model;
    public ModelRendererTurbo[] leftWingPos1Model;
    public ModelRendererTurbo[] leftWingPos2Model;
    public ModelRendererTurbo[] hudModel;
    public ModelRendererTurbo[][] valkyrie;
    
    public ModelPlane() {
        this.noseModel = new ModelRendererTurbo[0];
        this.leftWingModel = new ModelRendererTurbo[0];
        this.rightWingModel = new ModelRendererTurbo[0];
        this.topWingModel = new ModelRendererTurbo[0];
        this.bayModel = new ModelRendererTurbo[0];
        this.tailModel = new ModelRendererTurbo[0];
        this.propellerModels = new ModelRendererTurbo[0][0];
        this.yawFlapModel = new ModelRendererTurbo[0];
        this.pitchFlapLeftModel = new ModelRendererTurbo[0];
        this.pitchFlapRightModel = new ModelRendererTurbo[0];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[0];
        this.leftAnimWingModel = new ModelRendererTurbo[0];
        this.rightAnimWingModel = new ModelRendererTurbo[0];
        this.leftWingAttach = new Vector3f();
        this.rightWingAttach = new Vector3f();
        this.bodyAnimWheelModel = new ModelRendererTurbo[0];
        this.tailAnimWheelModel = new ModelRendererTurbo[0];
        this.leftAnimWingWheelModel = new ModelRendererTurbo[0];
        this.rightAnimWingWheelModel = new ModelRendererTurbo[0];
        this.bodyWheelAttach = new Vector3f();
        this.tailWheelAttach = new Vector3f();
        this.leftWingWheelAttach = new Vector3f();
        this.rightWingWheelAttach = new Vector3f();
        this.doorAnimModel = new ModelRendererTurbo[0];
        this.doorAttach = new Vector3f();
        this.heliMainRotorModels = new ModelRendererTurbo[0][0];
        this.heliMainRotorOrigins = new Vector3f[0];
        this.heliRotorSpeeds = new float[0];
        this.heliTailRotorModels = new ModelRendererTurbo[0][0];
        this.heliTailRotorOrigins = new Vector3f[0];
        this.skidsModel = new ModelRendererTurbo[0];
        this.helicopterModeParts = new ModelRendererTurbo[0];
        this.planeModeParts = new ModelRendererTurbo[0];
        this.bodyWheelModel = new ModelRendererTurbo[0];
        this.tailWheelModel = new ModelRendererTurbo[0];
        this.leftWingWheelModel = new ModelRendererTurbo[0];
        this.rightWingWheelModel = new ModelRendererTurbo[0];
        this.tailDoorOpenModel = new ModelRendererTurbo[0];
        this.tailDoorCloseModel = new ModelRendererTurbo[0];
        this.rightWingPos1Model = new ModelRendererTurbo[0];
        this.rightWingPos2Model = new ModelRendererTurbo[0];
        this.leftWingPos1Model = new ModelRendererTurbo[0];
        this.leftWingPos2Model = new ModelRendererTurbo[0];
        this.hudModel = new ModelRendererTurbo[0];
        this.valkyrie = new ModelRendererTurbo[0][0];
    }
    
    @Override
    public void render(final EntityDriveable driveable, final float f1) {
        this.render(0.0625f, (EntityPlane)driveable, f1);
    }
    
    @Override
    public void render(final DriveableType type) {
        super.render(type);
        this.renderPart(this.noseModel);
        this.renderPart(this.leftWingModel);
        this.renderPart(this.rightWingModel);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftWingAttach.x, this.leftWingAttach.y, -this.leftWingAttach.z);
        this.renderPart(this.leftAnimWingModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightWingAttach.x, this.rightWingAttach.y, -this.rightWingAttach.z);
        this.renderPart(this.rightAnimWingModel);
        GL11.glPopMatrix();
        this.renderPart(this.topWingModel);
        this.renderPart(this.bayModel);
        this.renderPart(this.tailModel);
        for (final ModelRendererTurbo[] prop : this.propellerModels) {
            for (int j = 0; j < prop.length; ++j) {
                prop[j].field_78795_f = j * 2.0f * 3.1415927f / prop.length;
                prop[j].func_78785_a(0.0625f);
            }
        }
        for (final ModelRendererTurbo[] heliMainRotorModel : this.heliMainRotorModels) {
            this.renderPart(heliMainRotorModel);
        }
        for (final ModelRendererTurbo[] heliTailRotorModel : this.heliTailRotorModels) {
            this.renderPart(heliTailRotorModel);
        }
        for (final ModelRendererTurbo[] partModel : this.valkyrie) {
            this.renderPart(partModel);
        }
        this.renderPart(this.helicopterModeParts);
        this.renderPart(this.skidsModel);
        this.renderPart(this.yawFlapModel);
        this.renderPart(this.pitchFlapLeftModel);
        this.renderPart(this.pitchFlapRightModel);
        this.renderPart(this.pitchFlapLeftWingModel);
        this.renderPart(this.pitchFlapRightWingModel);
        this.renderPart(this.bodyWheelModel);
        this.renderPart(this.tailWheelModel);
        this.renderPart(this.leftWingWheelModel);
        this.renderPart(this.rightWingWheelModel);
        this.renderPart(this.tailDoorCloseModel);
        this.renderPart(this.rightWingPos1Model);
        this.renderPart(this.leftWingPos1Model);
        this.renderPart(this.hudModel);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bodyWheelAttach.x, this.bodyWheelAttach.y, -this.bodyWheelAttach.z);
        this.renderPart(this.bodyAnimWheelModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.tailWheelAttach.x, this.tailWheelAttach.y, -this.tailWheelAttach.z);
        this.renderPart(this.tailAnimWheelModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.leftWingWheelAttach.x, this.leftWingWheelAttach.y, -this.leftWingWheelAttach.z);
        this.renderPart(this.leftAnimWingWheelModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.rightWingWheelAttach.x, this.rightWingWheelAttach.y, -this.rightWingWheelAttach.z);
        this.renderPart(this.rightAnimWingWheelModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.doorAttach.x, this.doorAttach.y, -this.doorAttach.z);
        this.renderPart(this.doorAnimModel);
        GL11.glPopMatrix();
    }
    
    public void render(final float f5, final EntityPlane plane, final float f) {
        final PlaneType type = plane.getPlaneType();
        float dAngle;
        for (dAngle = plane.propAngle - plane.prevPropAngle; dAngle > 180.0f; dAngle -= 360.0f) {}
        while (dAngle <= -180.0f) {
            dAngle += 360.0f;
        }
        final float angle = plane.prevPropAngle + dAngle * f;
        for (final Propeller propeller : plane.getPlaneType().propellers) {
            if (plane.isPartIntact(propeller.planePart) && this.propellerModels.length > propeller.ID) {
                for (int numParts = this.propellerModels[propeller.ID].length, j = 0; j < numParts; ++j) {
                    this.propellerModels[propeller.ID][j].field_78795_f = angle + j * 2.0f * 3.1415927f / numParts;
                    this.propellerModels[propeller.ID][j].func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.nose)) {
            for (final ModelRendererTurbo aNoseModel : this.noseModel) {
                aNoseModel.func_78785_a(f5);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.bay)) {
            for (final ModelRendererTurbo aBayModel : this.bayModel) {
                aBayModel.func_78785_a(f5);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.tail)) {
            for (final ModelRendererTurbo aTailModel : this.tailModel) {
                aTailModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aTailDoorOpenModel : this.tailDoorOpenModel) {
                if (plane.varDoor) {
                    aTailDoorOpenModel.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aTailDoorCloseModel : this.tailDoorCloseModel) {
                if (!plane.varDoor) {
                    aTailDoorCloseModel.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aYawFlapModel : this.yawFlapModel) {
                aYawFlapModel.field_78796_g = plane.flapsYaw * 3.1415927f / 180.0f;
                aYawFlapModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aPitchFlapLeftModel : this.pitchFlapLeftModel) {
                aPitchFlapLeftModel.field_78808_h = plane.flapsPitchLeft * 3.1415927f / 180.0f;
                aPitchFlapLeftModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aPitchFlapRightModel : this.pitchFlapRightModel) {
                aPitchFlapRightModel.field_78808_h = plane.flapsPitchRight * 3.1415927f / 180.0f;
                aPitchFlapRightModel.func_78785_a(f5);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.skids)) {
            for (final ModelRendererTurbo aSkidsModel : this.skidsModel) {
                if (plane.varGear) {
                    aSkidsModel.func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.tailWheel)) {
            for (final ModelRendererTurbo aTailWheelModel : this.tailWheelModel) {
                if (plane.varGear) {
                    aTailWheelModel.func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.leftWing)) {
            for (final ModelRendererTurbo aLeftWingModel : this.leftWingModel) {
                aLeftWingModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aLeftWingPos1Model : this.leftWingPos1Model) {
                if (plane.varWing) {
                    aLeftWingPos1Model.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aLeftWingPos2Model : this.leftWingPos2Model) {
                if (!plane.varWing) {
                    aLeftWingPos2Model.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aPitchFlapLeftWingModel : this.pitchFlapLeftWingModel) {
                aPitchFlapLeftWingModel.field_78808_h = plane.flapsPitchLeft * 3.1415927f / 180.0f;
                aPitchFlapLeftWingModel.func_78785_a(f5);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.rightWing)) {
            for (final ModelRendererTurbo aRightWingModel : this.rightWingModel) {
                aRightWingModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aRightWingPos1Model : this.rightWingPos1Model) {
                if (plane.varWing) {
                    aRightWingPos1Model.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aRightWingPos2Model : this.rightWingPos2Model) {
                if (!plane.varWing) {
                    aRightWingPos2Model.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aPitchFlapRightWingModel : this.pitchFlapRightWingModel) {
                aPitchFlapRightWingModel.field_78808_h = plane.flapsPitchRight * 3.1415927f / 180.0f;
                aPitchFlapRightWingModel.func_78785_a(f5);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.leftWingWheel)) {
            for (final ModelRendererTurbo aLeftWingWheelModel : this.leftWingWheelModel) {
                if (plane.varGear) {
                    aLeftWingWheelModel.func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.rightWingWheel)) {
            for (final ModelRendererTurbo aRightWingWheelModel : this.rightWingWheelModel) {
                if (plane.varGear) {
                    aRightWingWheelModel.func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aBodyModel : this.bodyModel) {
                aBodyModel.func_78785_a(f5);
            }
            for (final ModelRendererTurbo aBodyDoorOpenModel : this.bodyDoorOpenModel) {
                if (plane.varDoor) {
                    aBodyDoorOpenModel.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aBodyDoorCloseModel : this.bodyDoorCloseModel) {
                if (!plane.varDoor) {
                    aBodyDoorCloseModel.func_78785_a(f5);
                }
            }
            for (final ModelRendererTurbo aHudModel : this.hudModel) {
                aHudModel.field_78795_f = -(plane.axes.getRoll() * 3.1415927f / 180.0f);
                aHudModel.func_78785_a(f5);
            }
            if (plane.mode == EnumPlaneMode.HELI) {
                this.renderPart(this.helicopterModeParts);
            }
            else {
                this.renderPart(this.planeModeParts);
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.coreWheel)) {
            for (final ModelRendererTurbo aBodyWheelModel : this.bodyWheelModel) {
                if (plane.varGear) {
                    aBodyWheelModel.func_78785_a(f5);
                }
            }
        }
        if (plane.isPartIntact(EnumDriveablePart.topWing)) {
            for (final ModelRendererTurbo aTopWingModel : this.topWingModel) {
                aTopWingModel.func_78785_a(f5);
            }
        }
        for (final EntitySeat seat : plane.seats) {
            if (seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && this.gunModels.get(seat.seatInfo.gunName) != null && plane.isPartIntact(seat.seatInfo.part)) {
                final float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
                final float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;
                final ModelRendererTurbo[][] gunModel = this.gunModels.get(seat.seatInfo.gunName);
                for (final ModelRendererTurbo gunModelPart : gunModel[0]) {
                    gunModelPart.field_78796_g = (180.0f - yaw) * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                }
                for (final ModelRendererTurbo gunModelPart : gunModel[1]) {
                    gunModelPart.field_78796_g = (180.0f - yaw) * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                }
                for (final ModelRendererTurbo gunModelPart : gunModel[2]) {
                    gunModelPart.field_78796_g = (180.0f - yaw) * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                }
                if (gunModel.length > 3) {
                    final float minigunSpeed = seat.getMinigunSpeed();
                    for (final ModelRendererTurbo gunModelPart2 : gunModel[3]) {
                        gunModelPart2.field_78796_g = (180.0f - yaw) * 3.1415927f / 180.0f;
                        gunModelPart2.field_78808_h = -pitch * 3.1415927f / 180.0f;
                        gunModelPart2.field_78795_f = seat.minigunAngle * 0.5f;
                        gunModelPart2.func_78785_a(f5);
                    }
                }
            }
        }
    }
    
    public void renderValk(final EntityPlane plane, final float f5, final int id) {
        for (final ModelRendererTurbo aModel : this.valkyrie[id]) {
            aModel.func_78785_a(f5);
        }
    }
    
    public void renderLeftWing(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.leftWing)) {
            for (final ModelRendererTurbo aAnimLeftWingModel : this.leftAnimWingModel) {
                aAnimLeftWingModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderRightWing(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.rightWing)) {
            for (final ModelRendererTurbo aAnimRightWingModel : this.rightAnimWingModel) {
                aAnimRightWingModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderLeftWingWheel(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.leftWingWheel)) {
            for (final ModelRendererTurbo aAnimLeftWingWheelModel : this.leftAnimWingWheelModel) {
                aAnimLeftWingWheelModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderRightWingWheel(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.rightWingWheel)) {
            for (final ModelRendererTurbo aAnimRightWingWheelModel : this.rightAnimWingWheelModel) {
                aAnimRightWingWheelModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderCoreWheel(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.coreWheel)) {
            for (final ModelRendererTurbo aAnimBodyWheelModel : this.bodyAnimWheelModel) {
                aAnimBodyWheelModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderTailWheel(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.tailWheel)) {
            for (final ModelRendererTurbo aAnimTailWheelModel : this.tailAnimWheelModel) {
                aAnimTailWheelModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderDoor(final EntityPlane plane, final float f5) {
        if (plane.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aDoorAnimModel : this.doorAnimModel) {
                aDoorAnimModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderRotor(final EntityPlane plane, final float f5, final int i) {
        final PlaneType type = plane.getPlaneType();
        if (i >= type.heliPropellers.size() || plane.isPartIntact(type.heliPropellers.get(i).planePart)) {
            for (int j = 0; j < this.heliMainRotorModels[i].length; ++j) {
                this.heliMainRotorModels[i][j].func_78785_a(f5);
            }
        }
    }
    
    public void renderTailRotor(final EntityPlane plane, final float f5, final int i) {
        final PlaneType type = plane.getPlaneType();
        if (i >= type.heliTailPropellers.size() || plane.isPartIntact(type.heliTailPropellers.get(i).planePart)) {
            for (int j = 0; j < this.heliTailRotorModels[i].length; ++j) {
                this.heliTailRotorModels[i][j].func_78785_a(f5);
            }
        }
    }
    
    @Override
    public void flipAll() {
        super.flipAll();
        this.flip(this.noseModel);
        this.flip(this.leftWingModel);
        this.flip(this.rightWingModel);
        this.flip(this.topWingModel);
        this.flip(this.bayModel);
        this.flip(this.tailModel);
        this.flip(this.yawFlapModel);
        this.flip(this.skidsModel);
        this.flip(this.helicopterModeParts);
        this.flip(this.planeModeParts);
        this.flip(this.pitchFlapLeftModel);
        this.flip(this.pitchFlapRightModel);
        this.flip(this.pitchFlapLeftWingModel);
        this.flip(this.pitchFlapRightWingModel);
        this.flip(this.bodyWheelModel);
        this.flip(this.tailWheelModel);
        this.flip(this.leftWingWheelModel);
        this.flip(this.rightWingWheelModel);
        this.flip(this.tailDoorOpenModel);
        this.flip(this.tailDoorCloseModel);
        this.flip(this.rightWingPos1Model);
        this.flip(this.rightWingPos2Model);
        this.flip(this.leftWingPos1Model);
        this.flip(this.leftWingPos2Model);
        this.flip(this.hudModel);
        this.flip(this.leftAnimWingModel);
        this.flip(this.rightAnimWingModel);
        this.flip(this.bodyAnimWheelModel);
        this.flip(this.tailAnimWheelModel);
        this.flip(this.leftAnimWingWheelModel);
        this.flip(this.rightAnimWingWheelModel);
        this.flip(this.doorAnimModel);
        for (final ModelRendererTurbo[] valkModel : this.valkyrie) {
            this.flip(valkModel);
        }
        for (final ModelRendererTurbo[] propellerModel : this.propellerModels) {
            this.flip(propellerModel);
        }
        for (final ModelRendererTurbo[] propellerModel : this.heliMainRotorModels) {
            this.flip(propellerModel);
        }
        for (final ModelRendererTurbo[] propellerModel : this.heliTailRotorModels) {
            this.flip(propellerModel);
        }
    }
    
    @Override
    public void translateAll(final float x, final float y, final float z) {
        super.translateAll(x, y, z);
        this.translate(this.noseModel, x, y, z);
        this.translate(this.leftWingModel, x, y, z);
        this.translate(this.rightWingModel, x, y, z);
        this.translate(this.topWingModel, x, y, z);
        this.translate(this.bayModel, x, y, z);
        this.translate(this.tailModel, x, y, z);
        this.translate(this.yawFlapModel, x, y, z);
        this.translate(this.skidsModel, x, y, z);
        this.translate(this.helicopterModeParts, x, y, z);
        this.translate(this.planeModeParts, x, y, z);
        this.translate(this.pitchFlapLeftModel, x, y, z);
        this.translate(this.pitchFlapRightModel, x, y, z);
        this.translate(this.pitchFlapLeftWingModel, x, y, z);
        this.translate(this.pitchFlapRightWingModel, x, y, z);
        this.translate(this.bodyWheelModel, x, y, z);
        this.translate(this.tailWheelModel, x, y, z);
        this.translate(this.leftWingWheelModel, x, y, z);
        this.translate(this.rightWingWheelModel, x, y, z);
        this.translate(this.tailDoorOpenModel, x, y, z);
        this.translate(this.tailDoorCloseModel, x, y, z);
        this.translate(this.rightWingPos1Model, x, y, z);
        this.translate(this.rightWingPos2Model, x, y, z);
        this.translate(this.leftWingPos1Model, x, y, z);
        this.translate(this.leftWingPos2Model, x, y, z);
        this.translate(this.hudModel, x, y, z);
        this.translate(this.leftAnimWingModel, x, y, z);
        this.translate(this.rightAnimWingModel, x, y, z);
        this.translate(this.bodyAnimWheelModel, x, y, z);
        this.translate(this.tailAnimWheelModel, x, y, z);
        this.translate(this.leftAnimWingWheelModel, x, y, z);
        this.translate(this.rightAnimWingWheelModel, x, y, z);
        this.translate(this.doorAnimModel, x, y, z);
        for (final ModelRendererTurbo[] valkModel : this.valkyrie) {
            this.translate(valkModel, x, y, z);
        }
        for (final ModelRendererTurbo[] mods : this.propellerModels) {
            this.translate(mods, x, y, z);
        }
        for (final ModelRendererTurbo[] mods : this.heliMainRotorModels) {
            this.translate(mods, x, y, z);
        }
        for (final ModelRendererTurbo[] mods : this.heliTailRotorModels) {
            this.translate(mods, x, y, z);
        }
        for (final Vector3f o : this.heliMainRotorOrigins) {
            Vector3f.add(o, new Vector3f(x / 16.0f, y / 16.0f, z / 16.0f), o);
        }
        for (final Vector3f o : this.heliTailRotorOrigins) {
            Vector3f.add(o, new Vector3f(x / 16.0f, y / 16.0f, z / 16.0f), o);
        }
    }
}
