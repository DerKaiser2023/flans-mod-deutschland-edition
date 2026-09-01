// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraftforge.client.model.IModelCustom;
import com.flansmod.common.driveables.VehicleType;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraft.util.ResourceLocation;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.RotatedAxes;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelVehicle extends ModelDriveable
{
    public ModelRendererTurbo[] turretModel;
    public ModelRendererTurbo[] barrelModel;
    public ModelRendererTurbo[][] ammoModel;
    public ModelRendererTurbo[] frontWheelModel;
    public ModelRendererTurbo[] backWheelModel;
    public ModelRendererTurbo[] leftFrontWheelModel;
    public ModelRendererTurbo[] rightFrontWheelModel;
    public ModelRendererTurbo[] leftBackWheelModel;
    public ModelRendererTurbo[] rightBackWheelModel;
    public ModelRendererTurbo[] rightTrackModel;
    public ModelRendererTurbo[] leftTrackModel;
    public ModelRendererTurbo[] rightTrackWheelModels;
    public ModelRendererTurbo[] leftTrackWheelModels;
    public ModelRendererTurbo[][] leftAnimTrackModel;
    public ModelRendererTurbo[][] rightAnimTrackModel;
    public ModelRendererTurbo[] fancyTrackModel;
    public ModelRendererTurbo[] rightAnimTrackModel1;
    public ModelRendererTurbo[] leftAnimTrackModel1;
    public ModelRendererTurbo[] rightAnimTrackModel2;
    public ModelRendererTurbo[] leftAnimTrackModel2;
    public ModelRendererTurbo[] rightAnimTrackModel3;
    public ModelRendererTurbo[] leftAnimTrackModel3;
    public ModelRendererTurbo[] bodyDoorOpenModel;
    public ModelRendererTurbo[] bodyDoorCloseModel;
    public ModelRendererTurbo[] trailerModel;
    public ModelRendererTurbo[] steeringWheelModel;
    public ModelRendererTurbo[] drillHeadModel;
    public Vector3f drillHeadOrigin;
    public ModelRendererTurbo[] barrelSpecModel;
    public ModelRendererTurbo[] animBarrelModel;
    public Vector3f barrelAttach;
    public ModelRendererTurbo[] doorAnimModel;
    public Vector3f doorAttach;
    public ModelRendererTurbo[] door2AnimModel;
    public Vector3f door2Attach;
    public ModelRendererTurbo[] drakonModel;
    public ModelRendererTurbo[] drakonReloadModel;
    public ModelRendererTurbo[] drakonArmModel;
    public ModelRendererTurbo[] drakonRailModel;
    public ModelRendererTurbo[] drakonDoorModel;
    public Vector3f drakonArmAttach;
    public Vector3f drakonRailAttach;
    public Vector3f drakonDoorAttach;
    public float animFrameLeft;
    public float animFrameRight;
    public Vector3f turretScale;
    public Vector3f turretTrans;
    public boolean fancyTurret;
    public String turretName;
    
    public ModelVehicle() {
        this.turretModel = new ModelRendererTurbo[0];
        this.barrelModel = new ModelRendererTurbo[0];
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.frontWheelModel = new ModelRendererTurbo[0];
        this.backWheelModel = new ModelRendererTurbo[0];
        this.leftFrontWheelModel = new ModelRendererTurbo[0];
        this.rightFrontWheelModel = new ModelRendererTurbo[0];
        this.leftBackWheelModel = new ModelRendererTurbo[0];
        this.rightBackWheelModel = new ModelRendererTurbo[0];
        this.rightTrackModel = new ModelRendererTurbo[0];
        this.leftTrackModel = new ModelRendererTurbo[0];
        this.rightTrackWheelModels = new ModelRendererTurbo[0];
        this.leftTrackWheelModels = new ModelRendererTurbo[0];
        this.leftAnimTrackModel = new ModelRendererTurbo[0][0];
        this.rightAnimTrackModel = new ModelRendererTurbo[0][0];
        this.fancyTrackModel = new ModelRendererTurbo[0];
        this.rightAnimTrackModel1 = new ModelRendererTurbo[0];
        this.leftAnimTrackModel1 = new ModelRendererTurbo[0];
        this.rightAnimTrackModel2 = new ModelRendererTurbo[0];
        this.leftAnimTrackModel2 = new ModelRendererTurbo[0];
        this.rightAnimTrackModel3 = new ModelRendererTurbo[0];
        this.leftAnimTrackModel3 = new ModelRendererTurbo[0];
        this.bodyDoorOpenModel = new ModelRendererTurbo[0];
        this.bodyDoorCloseModel = new ModelRendererTurbo[0];
        this.trailerModel = new ModelRendererTurbo[0];
        this.steeringWheelModel = new ModelRendererTurbo[0];
        this.drillHeadModel = new ModelRendererTurbo[0];
        this.drillHeadOrigin = new Vector3f();
        this.barrelSpecModel = new ModelRendererTurbo[0];
        this.animBarrelModel = new ModelRendererTurbo[0];
        this.barrelAttach = new Vector3f();
        this.doorAnimModel = new ModelRendererTurbo[0];
        this.doorAttach = new Vector3f();
        this.door2AnimModel = new ModelRendererTurbo[0];
        this.door2Attach = new Vector3f();
        this.drakonModel = new ModelRendererTurbo[0];
        this.drakonReloadModel = new ModelRendererTurbo[0];
        this.drakonArmModel = new ModelRendererTurbo[0];
        this.drakonRailModel = new ModelRendererTurbo[0];
        this.drakonDoorModel = new ModelRendererTurbo[0];
        this.drakonArmAttach = new Vector3f(0.0f, 0.0f, 0.0f);
        this.drakonRailAttach = new Vector3f(0.0f, 0.0f, 0.0f);
        this.drakonDoorAttach = new Vector3f(0.0f, 0.0f, 0.0f);
        this.animFrameLeft = 0.0f;
        this.animFrameRight = 0.0f;
        this.turretScale = new Vector3f(1.0f, 1.0f, 1.0f);
        this.turretTrans = new Vector3f(0.0f, 0.0f, 0.0f);
        this.fancyTurret = false;
    }
    
    @Override
    public void render(final EntityDriveable driveable, final float f1) {
        this.render(0.0625f, (EntityVehicle)driveable, f1);
    }
    
    @Override
    public void render(final DriveableType type) {
        super.render(type);
        this.renderPart(this.leftBackWheelModel);
        this.renderPart(this.rightBackWheelModel);
        this.renderPart(this.leftFrontWheelModel);
        this.renderPart(this.rightFrontWheelModel);
        this.renderPart(this.rightTrackModel);
        this.renderPart(this.leftTrackModel);
        this.renderPart(this.rightTrackWheelModels);
        this.renderPart(this.leftTrackWheelModels);
        this.renderPart(this.bodyDoorCloseModel);
        this.renderPart(this.trailerModel);
        GL11.glPushMatrix();
        GL11.glScalef(this.turretScale.x, this.turretScale.y, this.turretScale.z);
        GL11.glTranslatef(this.turretTrans.x, this.turretTrans.y, this.turretTrans.z);
        this.renderPart(this.turretModel);
        this.renderPart(this.barrelModel);
        GL11.glPopMatrix();
        this.renderPart(this.drillHeadModel);
        for (final ModelRendererTurbo[] mods : this.ammoModel) {
            this.renderPart(mods);
        }
        for (final ModelRendererTurbo[] latm : this.leftAnimTrackModel) {
            this.renderPart(latm);
        }
        for (final ModelRendererTurbo[] ratm : this.rightAnimTrackModel) {
            this.renderPart(ratm);
        }
        this.renderPart(this.rightAnimTrackModel1);
        this.renderPart(this.leftAnimTrackModel1);
        this.renderPart(this.rightAnimTrackModel2);
        this.renderPart(this.leftAnimTrackModel2);
        this.renderPart(this.rightAnimTrackModel3);
        this.renderPart(this.leftAnimTrackModel3);
        this.renderPart(this.steeringWheelModel);
        this.renderPart(this.steeringWheelModel);
        this.renderPart(this.barrelSpecModel);
        this.renderTrackInGUI(type);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.barrelAttach.x, this.barrelAttach.y, -this.barrelAttach.z);
        this.renderPart(this.animBarrelModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.doorAttach.x, this.doorAttach.y, -this.doorAttach.z);
        this.renderPart(this.doorAnimModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.door2Attach.x, this.door2Attach.y, -this.door2Attach.z);
        this.renderPart(this.door2AnimModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.drakonArmAttach.x, this.drakonArmAttach.y, this.drakonArmAttach.z);
        this.renderPart(this.drakonArmModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.drakonRailAttach.x, this.drakonRailAttach.y, this.drakonRailAttach.z);
        this.renderPart(this.drakonRailModel);
        this.renderPart(this.drakonModel);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.drakonDoorAttach.x, this.drakonDoorAttach.y, this.drakonDoorAttach.z);
        this.renderPart(this.drakonDoorModel);
        GL11.glPopMatrix();
    }
    
    public void renderTrackInGUI(final DriveableType type) {
        final AnimTankTrack rightTrack = new AnimTankTrack(type.rightTrackPoints, type.trackLinkLength);
        final AnimTankTrack leftTrack = new AnimTankTrack(type.leftTrackPoints, type.trackLinkLength);
        AnimTrackLink[] trackLinksLeft = new AnimTrackLink[0];
        AnimTrackLink[] trackLinksRight = new AnimTrackLink[0];
        final int numLinks = Math.round(rightTrack.getTrackLength() / type.trackLinkLength);
        trackLinksLeft = new AnimTrackLink[numLinks];
        trackLinksRight = new AnimTrackLink[numLinks];
        for (int i = 0; i < numLinks; ++i) {
            final float progress = 0.01f + type.trackLinkLength * i;
            final int trackPart = leftTrack.getTrackPart(progress);
            trackLinksLeft[i] = new AnimTrackLink(progress);
            trackLinksRight[i] = new AnimTrackLink(progress);
            trackLinksLeft[i].position = leftTrack.getPositionOnTrack(progress);
            trackLinksRight[i].position = rightTrack.getPositionOnTrack(progress);
            trackLinksLeft[i].rot = new RotatedAxes(0.0f, 0.0f, this.rotateTowards(leftTrack.points.get((trackPart == 0) ? (leftTrack.points.size() - 1) : (trackPart - 1)), trackLinksLeft[i].position));
            trackLinksRight[i].rot = new RotatedAxes(0.0f, 0.0f, this.rotateTowards(rightTrack.points.get((trackPart == 0) ? (rightTrack.points.size() - 1) : (trackPart - 1)), trackLinksRight[i].position));
            trackLinksLeft[i].zRot = this.rotateTowards(leftTrack.points.get((trackPart == 0) ? (leftTrack.points.size() - 1) : (trackPart - 1)), trackLinksLeft[i].position);
            trackLinksRight[i].zRot = this.rotateTowards(rightTrack.points.get((trackPart == 0) ? (rightTrack.points.size() - 1) : (trackPart - 1)), trackLinksRight[i].position);
        }
        for (int i = 0; i < trackLinksLeft.length; ++i) {
            final AnimTrackLink link = trackLinksLeft[i];
            float rotZ = link.zRot;
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16.0f, link.position.y / 16.0f, link.position.z / 16.0f);
            while (rotZ > 180.0f) {
                rotZ -= 360.0f;
            }
            while (rotZ <= -180.0f) {
                rotZ += 360.0f;
            }
            GL11.glRotatef(rotZ * 57.29578f, 0.0f, 0.0f, 1.0f);
            this.renderPart(this.fancyTrackModel);
            GL11.glPopMatrix();
        }
        for (int i = 0; i < trackLinksRight.length; ++i) {
            final AnimTrackLink link = trackLinksRight[i];
            float rotZ;
            for (rotZ = link.zRot; rotZ > 180.0f; rotZ -= 360.0f) {}
            while (rotZ <= -180.0f) {
                rotZ += 360.0f;
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16.0f, link.position.y / 16.0f, link.position.z / 16.0f);
            GL11.glRotatef(rotZ * 57.29578f, 0.0f, 0.0f, 1.0f);
            this.renderPart(this.fancyTrackModel);
            GL11.glPopMatrix();
        }
    }
    
    public float rotateTowards(final Vector3f point, final Vector3f original) {
        final float angle = (float)Math.atan2(point.y - original.y, point.x - original.x);
        return angle;
    }
    
    public void render(final float f5, final EntityVehicle vehicle, final float f) {
        final boolean rotateWheels = vehicle.getVehicleType().rotateWheels;
        this.animFrameLeft = (float)vehicle.animFrameLeft;
        this.animFrameRight = (float)vehicle.animFrameRight;
        if (vehicle.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aBodyModel : this.bodyModel) {
                aBodyModel.render(f5, this.oldRotateOrder);
            }
            for (final ModelRendererTurbo aBodyDoorOpenModel : this.bodyDoorOpenModel) {
                if (vehicle.varDoor) {
                    aBodyDoorOpenModel.render(f5, this.oldRotateOrder);
                }
            }
            for (final ModelRendererTurbo aBodyDoorCloseModel : this.bodyDoorCloseModel) {
                if (!vehicle.varDoor) {
                    aBodyDoorCloseModel.render(f5, this.oldRotateOrder);
                }
            }
            for (final ModelRendererTurbo aSteeringWheelModel : this.steeringWheelModel) {
                if (!vehicle.hugeBoat) {
                    aSteeringWheelModel.field_78795_f = vehicle.wheelsYaw * 3.1415927f / 180.0f * 3.0f;
                }
                else {
                    aSteeringWheelModel.field_78795_f = -vehicle.wheelsYaw * 3.1415927f / 180.0f * 3.0f;
                }
                aSteeringWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.backLeftWheel)) {
            for (final ModelRendererTurbo aLeftBackWheelModel : this.leftBackWheelModel) {
                aLeftBackWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aLeftBackWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.backRightWheel)) {
            for (final ModelRendererTurbo aRightBackWheelModel : this.rightBackWheelModel) {
                aRightBackWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aRightBackWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel)) {
            for (final ModelRendererTurbo aLeftFrontWheelModel : this.leftFrontWheelModel) {
                aLeftFrontWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aLeftFrontWheelModel.field_78796_g = -vehicle.wheelsYaw * 3.1415927f / 180.0f * 3.0f;
                aLeftFrontWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.frontRightWheel)) {
            for (final ModelRendererTurbo aRightFrontWheelModel : this.rightFrontWheelModel) {
                aRightFrontWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aRightFrontWheelModel.field_78796_g = -vehicle.wheelsYaw * 3.1415927f / 180.0f * 3.0f;
                aRightFrontWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.frontWheel)) {
            for (final ModelRendererTurbo aFrontWheelModel : this.frontWheelModel) {
                aFrontWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aFrontWheelModel.field_78796_g = -vehicle.wheelsYaw * 3.1415927f / 180.0f * 3.0f;
                aFrontWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.backWheel)) {
            for (final ModelRendererTurbo aBackWheelModel : this.backWheelModel) {
                aBackWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                aBackWheelModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.leftTrack)) {
            for (final ModelRendererTurbo aLeftTrackModel : this.leftTrackModel) {
                aLeftTrackModel.render(f5, this.oldRotateOrder);
            }
            for (final ModelRendererTurbo leftTrackWheelModel : this.leftTrackWheelModels) {
                leftTrackWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                leftTrackWheelModel.render(f5, this.oldRotateOrder);
            }
            if (vehicle.animFrameLeft == 0) {
                for (final ModelRendererTurbo aLeftTrackModel2 : this.leftAnimTrackModel1) {
                    aLeftTrackModel2.render(f5, this.oldRotateOrder);
                }
            }
            else if (vehicle.animFrameLeft == 1) {
                for (final ModelRendererTurbo aLeftTrackModel3 : this.leftAnimTrackModel2) {
                    aLeftTrackModel3.render(f5, this.oldRotateOrder);
                }
            }
            else if (vehicle.animFrameLeft == 2) {
                for (final ModelRendererTurbo aLeftTrackModel4 : this.leftAnimTrackModel3) {
                    aLeftTrackModel4.render(f5, this.oldRotateOrder);
                }
            }
            for (int i = 0; i < this.leftAnimTrackModel.length; ++i) {
                if (i == this.animFrameLeft) {
                    for (final ModelRendererTurbo aLeftAnimTrackModel : this.leftAnimTrackModel[i]) {
                        aLeftAnimTrackModel.render(f5, this.oldRotateOrder);
                    }
                }
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.rightTrack)) {
            for (final ModelRendererTurbo aRightTrackModel : this.rightTrackModel) {
                aRightTrackModel.render(f5, this.oldRotateOrder);
            }
            for (final ModelRendererTurbo rightTrackWheelModel : this.rightTrackWheelModels) {
                rightTrackWheelModel.field_78808_h = (rotateWheels ? (-vehicle.wheelsAngle) : 0.0f);
                rightTrackWheelModel.render(f5, this.oldRotateOrder);
            }
            if (vehicle.animFrameRight == 0) {
                for (final ModelRendererTurbo aRightTrackModel2 : this.rightAnimTrackModel1) {
                    aRightTrackModel2.render(f5, this.oldRotateOrder);
                }
            }
            else if (vehicle.animFrameRight == 1) {
                for (final ModelRendererTurbo aRightTrackModel3 : this.rightAnimTrackModel2) {
                    aRightTrackModel3.render(f5, this.oldRotateOrder);
                }
            }
            else if (vehicle.animFrameRight == 2) {
                for (final ModelRendererTurbo aRightTrackModel4 : this.rightAnimTrackModel3) {
                    aRightTrackModel4.render(f5, this.oldRotateOrder);
                }
            }
            for (int i = 0; i < this.rightAnimTrackModel.length; ++i) {
                if (i == this.animFrameRight) {
                    for (final ModelRendererTurbo aRightAnimTrackModel : this.rightAnimTrackModel[i]) {
                        aRightAnimTrackModel.render(f5, this.oldRotateOrder);
                    }
                }
            }
        }
        if (vehicle.isPartIntact(EnumDriveablePart.trailer)) {
            for (final ModelRendererTurbo aTrailerModel : this.trailerModel) {
                aTrailerModel.render(f5, this.oldRotateOrder);
            }
        }
        for (final EntitySeat seat : vehicle.seats) {
            if (seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && this.gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part) && !vehicle.rotateWithTurret(seat.seatInfo)) {
                final float yaw = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * f;
                final float pitch = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * f;
                final ModelRendererTurbo[][] gunModel = this.gunModels.get(seat.seatInfo.gunName);
                for (final ModelRendererTurbo gunModelPart : gunModel[0]) {
                    GL11.glPushMatrix();
                    GL11.glScalef(vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale);
                    gunModelPart.field_78796_g = -yaw * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                    GL11.glPopMatrix();
                }
                GL11.glPushMatrix();
                GL11.glScalef(vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale, vehicle.getVehicleType().vehicleGunModelScale);
                for (final ModelRendererTurbo gunModelPart : gunModel[1]) {
                    gunModelPart.field_78796_g = -yaw * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                }
                for (final ModelRendererTurbo gunModelPart : gunModel[2]) {
                    gunModelPart.field_78796_g = -yaw * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch * 3.1415927f / 180.0f;
                    gunModelPart.func_78785_a(f5);
                }
                GL11.glPopMatrix();
            }
        }
    }
    
    public void renderDoor(final EntityVehicle vehicle, final float f5) {
        if (vehicle.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aDoorAnimModel : this.doorAnimModel) {
                aDoorAnimModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderDoor2(final EntityVehicle vehicle, final float f5) {
        if (vehicle.isPartIntact(EnumDriveablePart.core)) {
            for (final ModelRendererTurbo aDoor2AnimModel : this.door2AnimModel) {
                aDoor2AnimModel.func_78785_a(f5);
            }
        }
    }
    
    public void renderTurret(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityVehicle vehicle, final float dt) {
        final VehicleType type = vehicle.getVehicleType();
        GL11.glPushMatrix();
        GL11.glScalef(this.turretScale.x, this.turretScale.y, this.turretScale.z);
        GL11.glTranslatef(this.turretTrans.x, this.turretTrans.y, this.turretTrans.z);
        if (this.fancyTurret) {
            final ResourceLocation turretobj = new ResourceLocation("flansmod", "models/" + this.turretName);
            final IModelCustom model = AdvancedModelLoader.loadModel(turretobj);
            GL11.glPushMatrix();
            final float scale = 1.0f;
            model.renderAll();
            GL11.glPopMatrix();
        }
        final float yaw = vehicle.seats[0].looking.getYaw();
        final float pitch = vehicle.seats[0].looking.getPitch();
        final float dPitch = vehicle.seats[0].looking.getPitch() - vehicle.seats[0].prevLooking.getPitch();
        final float aPitch = vehicle.seats[0].prevLooking.getPitch() + dPitch * dt;
        for (final ModelRendererTurbo aTurretModel : this.turretModel) {
            if (Minecraft.func_71410_x().field_71474_y.field_74320_O != 0 || vehicle.seats[0].field_70153_n != Minecraft.func_71410_x().field_71439_g || vehicle.alwaysShowTurret) {
                aTurretModel.render(f5, this.oldRotateOrder);
            }
        }
        for (final ModelRendererTurbo aBarrelModel : this.barrelModel) {
            aBarrelModel.field_78808_h = -(aPitch * 3.1415927f / 180.0f);
            aBarrelModel.render(f5, this.oldRotateOrder);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(this.barrelAttach.x, this.barrelAttach.y, -this.barrelAttach.z);
        GL11.glRotatef(-aPitch, 0.0f, 0.0f, 1.0f);
        for (final ModelRendererTurbo aBarrelModel : this.barrelSpecModel) {
            aBarrelModel.render(f5, this.oldRotateOrder);
        }
        GL11.glPopMatrix();
        for (int i = 0; i < this.ammoModel.length; ++i) {
            if (i >= type.numMissileSlots || vehicle.getDriveableData().missiles[i] != null) {
                for (int j = 0; j < this.ammoModel[i].length; ++j) {
                    this.ammoModel[i][j].field_78808_h = -pitch * 3.1415927f / 180.0f;
                    this.ammoModel[i][j].render(f5, this.oldRotateOrder);
                }
            }
        }
        final float armAngle = vehicle.drakonArmAngle;
        float dArmAngle;
        for (dArmAngle = vehicle.drakonArmAngle - vehicle.prevDrakonArmAngle; dArmAngle > 180.0f; dArmAngle -= 360.0f) {}
        while (dArmAngle <= -180.0f) {
            dArmAngle += 360.0f;
        }
        final float drakonArmAngle = vehicle.prevDrakonArmAngle + dArmAngle * dt;
        final float railAngle = vehicle.drakonRailAngle;
        float dRailAngle;
        for (dRailAngle = vehicle.drakonRailAngle - vehicle.prevDrakonRailAngle; dRailAngle > 180.0f; dRailAngle -= 360.0f) {}
        while (dRailAngle <= -180.0f) {
            dRailAngle += 360.0f;
        }
        final float drakonRailAngle = vehicle.prevDrakonRailAngle + dRailAngle * dt;
        final float doorAngle = vehicle.drakonDoorAngle;
        float dDoorAngle;
        for (dDoorAngle = vehicle.drakonDoorAngle - vehicle.prevDrakonDoorAngle; dDoorAngle > 180.0f; dDoorAngle -= 360.0f) {}
        while (dDoorAngle <= -180.0f) {
            dDoorAngle += 360.0f;
        }
        final float drakonDoorAngle = vehicle.prevDrakonDoorAngle + dDoorAngle * dt;
        GL11.glPushMatrix();
        GL11.glTranslatef(this.drakonArmAttach.x, this.drakonArmAttach.y, this.drakonArmAttach.z);
        GL11.glRotatef(drakonArmAngle, 0.0f, 0.0f, 1.0f);
        for (final ModelRendererTurbo aArmModel : this.drakonArmModel) {
            aArmModel.render(f5, this.oldRotateOrder);
        }
        GL11.glTranslatef(this.drakonRailAttach.x - this.drakonArmAttach.x, this.drakonRailAttach.y - this.drakonArmAttach.y, this.drakonRailAttach.z - this.drakonArmAttach.z);
        GL11.glRotatef(drakonRailAngle, 0.0f, 0.0f, 1.0f);
        for (final ModelRendererTurbo aRailModel : this.drakonRailModel) {
            aRailModel.render(f5, this.oldRotateOrder);
        }
        if (vehicle.canFireIT1) {
            for (final ModelRendererTurbo aMissileModel : this.drakonModel) {
                aMissileModel.render(f5, this.oldRotateOrder);
            }
        }
        if (vehicle.reloadingDrakon && !vehicle.canFireIT1) {
            for (final ModelRendererTurbo aMissileModel : this.drakonReloadModel) {
                aMissileModel.render(f5, this.oldRotateOrder);
            }
        }
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.drakonDoorAttach.x, this.drakonDoorAttach.y, this.drakonDoorAttach.z);
        GL11.glRotatef(drakonDoorAngle, 1.0f, 0.0f, 0.0f);
        for (final ModelRendererTurbo aDoorModel : this.drakonDoorModel) {
            aDoorModel.render(f5, this.oldRotateOrder);
        }
        GL11.glPopMatrix();
        for (final EntitySeat seat : vehicle.seats) {
            if (seat != null && seat.seatInfo != null && seat.seatInfo.gunName != null && this.gunModels.get(seat.seatInfo.gunName) != null && vehicle.isPartIntact(seat.seatInfo.part) && vehicle.rotateWithTurret(seat.seatInfo)) {
                final EntitySeat driverSeat = vehicle.seats[0];
                final float driverYaw = driverSeat.prevLooking.getYaw() + (driverSeat.looking.getYaw() - driverSeat.prevLooking.getYaw()) * dt;
                final float yaw2 = seat.prevLooking.getYaw() + (seat.looking.getYaw() - seat.prevLooking.getYaw()) * dt;
                final float pitch2 = seat.prevLooking.getPitch() + (seat.looking.getPitch() - seat.prevLooking.getPitch()) * dt;
                final float effectiveYaw = yaw2 - driverYaw;
                final ModelRendererTurbo[][] gunModel = this.gunModels.get(seat.seatInfo.gunName);
                for (final ModelRendererTurbo gunModelPart : gunModel[0]) {
                    gunModelPart.field_78796_g = -effectiveYaw * 3.1415927f / 180.0f;
                    gunModelPart.render(f5, this.oldRotateOrder);
                }
                for (final ModelRendererTurbo gunModelPart : gunModel[1]) {
                    gunModelPart.field_78796_g = -effectiveYaw * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch2 * 3.1415927f / 180.0f;
                    gunModelPart.render(f5, this.oldRotateOrder);
                }
                for (final ModelRendererTurbo gunModelPart : gunModel[2]) {
                    gunModelPart.field_78796_g = -effectiveYaw * 3.1415927f / 180.0f;
                    gunModelPart.field_78808_h = -pitch2 * 3.1415927f / 180.0f;
                    gunModelPart.render(f5, this.oldRotateOrder);
                }
            }
        }
        GL11.glPopMatrix();
    }
    
    public void renderAnimBarrel(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityVehicle vehicle, final float dt) {
        if (vehicle.isPartIntact(EnumDriveablePart.turret)) {
            for (final ModelRendererTurbo aAnimBarrelModel : this.animBarrelModel) {
                aAnimBarrelModel.render(f5, this.oldRotateOrder);
            }
        }
    }
    
    public void renderDrillBit(final EntityVehicle vehicle, final float f) {
        if (vehicle.isPartIntact(EnumDriveablePart.harvester)) {
            for (final ModelRendererTurbo adrillHeadModel : this.drillHeadModel) {
                adrillHeadModel.render(0.0625f, this.oldRotateOrder);
            }
        }
    }
    
    public void renderFancyTracks(final EntityVehicle vehicle, final float f) {
        for (final ModelRendererTurbo adrillHeadModel : this.fancyTrackModel) {
            adrillHeadModel.render(0.0625f, this.oldRotateOrder);
        }
    }
    
    @Override
    public void flipAll() {
        super.flipAll();
        this.flip(this.bodyDoorOpenModel);
        this.flip(this.bodyDoorCloseModel);
        this.flip(this.turretModel);
        this.flip(this.barrelModel);
        this.flip(this.barrelSpecModel);
        this.flip(this.animBarrelModel);
        this.flip(this.leftFrontWheelModel);
        this.flip(this.rightFrontWheelModel);
        this.flip(this.leftBackWheelModel);
        this.flip(this.rightBackWheelModel);
        this.flip(this.rightTrackModel);
        this.flip(this.leftTrackModel);
        this.flip(this.rightTrackWheelModels);
        this.flip(this.leftTrackWheelModels);
        this.flip(this.trailerModel);
        this.flip(this.steeringWheelModel);
        this.flip(this.frontWheelModel);
        this.flip(this.backWheelModel);
        this.flip(this.drillHeadModel);
        this.flip(this.rightAnimTrackModel1);
        this.flip(this.leftAnimTrackModel1);
        this.flip(this.rightAnimTrackModel2);
        this.flip(this.leftAnimTrackModel2);
        this.flip(this.rightAnimTrackModel3);
        this.flip(this.leftAnimTrackModel3);
        this.flip(this.drakonArmModel);
        this.flip(this.drakonRailModel);
        this.flip(this.drakonDoorModel);
        this.flip(this.drakonModel);
        this.flip(this.drakonReloadModel);
        for (final ModelRendererTurbo[] latm : this.leftAnimTrackModel) {
            this.flip(latm);
        }
        for (final ModelRendererTurbo[] ratm : this.rightAnimTrackModel) {
            this.flip(ratm);
        }
        this.flip(this.doorAnimModel);
        this.flip(this.door2AnimModel);
        this.flip(this.fancyTrackModel);
    }
    
    @Override
    public void translateAll(final float x, final float y, final float z) {
        super.translateAll(x, y, z);
        this.translate(this.bodyDoorOpenModel, x, y, z);
        this.translate(this.bodyDoorCloseModel, x, y, z);
        this.translate(this.turretModel, x, y, z);
        this.translate(this.barrelModel, x, y, z);
        this.translate(this.barrelSpecModel, x, y, z);
        this.translate(this.animBarrelModel, x, y, z);
        this.translate(this.leftFrontWheelModel, x, y, z);
        this.translate(this.rightFrontWheelModel, x, y, z);
        this.translate(this.leftBackWheelModel, x, y, z);
        this.translate(this.rightBackWheelModel, x, y, z);
        this.translate(this.rightTrackModel, x, y, z);
        this.translate(this.leftTrackModel, x, y, z);
        this.translate(this.rightTrackWheelModels, x, y, z);
        this.translate(this.leftTrackWheelModels, x, y, z);
        this.translate(this.trailerModel, x, y, z);
        this.translate(this.steeringWheelModel, x, y, z);
        this.translate(this.frontWheelModel, x, y, z);
        this.translate(this.backWheelModel, x, y, z);
        this.translate(this.drillHeadModel, x, y, z);
        this.translate(this.rightAnimTrackModel1, x, y, z);
        this.translate(this.leftAnimTrackModel1, x, y, z);
        this.translate(this.rightAnimTrackModel2, x, y, z);
        this.translate(this.leftAnimTrackModel2, x, y, z);
        this.translate(this.rightAnimTrackModel3, x, y, z);
        this.translate(this.leftAnimTrackModel3, x, y, z);
        for (final ModelRendererTurbo[] latm : this.leftAnimTrackModel) {
            this.translate(latm, x, y, z);
        }
        for (final ModelRendererTurbo[] ratm : this.rightAnimTrackModel) {
            this.translate(ratm, x, y, z);
        }
        this.translate(this.doorAnimModel, x, y, z);
        this.translate(this.door2AnimModel, x, y, z);
        this.translate(this.drakonArmModel, x, y, z);
        this.translate(this.drakonRailModel, x, y, z);
        this.translate(this.drakonDoorModel, x, y, z);
        this.translate(this.drakonReloadModel, x, y, z);
        this.translate(this.drakonModel, x, y, z);
        this.translate(this.fancyTrackModel, x, y, z);
    }
}
