// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.entity.item.EntityItem;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.driveables.DriveableType;
import net.minecraft.util.ResourceLocation;
import com.flansmod.common.vector.Vector3f;
import java.util.Iterator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.model.ModelBase;
import com.flansmod.common.guns.BulletType;
import net.minecraft.item.ItemStack;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.driveables.DriveablePart;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.FlansMod;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.teams.TeamsManager;
import net.minecraft.entity.player.EntityPlayer;
import com.flansmod.common.driveables.EntitySeat;
import net.minecraft.client.Minecraft;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EnumDriveablePart;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.driveables.EntityVehicle;
import net.minecraftforge.client.IItemRenderer;
import net.minecraft.client.renderer.entity.Render;

public class RenderVehicle extends Render implements IItemRenderer
{
    public RenderVehicle() {
        this.shadowSize = 1.0f;
    }
    
    public void render(final EntityVehicle vehicle, final double d, final double d1, final double d2, final float f, final float f1) {
        if (vehicle.ridingEntity != null && vehicle.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            return;
        }
        this.bindEntityTexture((Entity)vehicle);
        final VehicleType type = vehicle.getVehicleType();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        float dYaw;
        for (dYaw = vehicle.axes.getYaw() - vehicle.prevRotationYaw; dYaw > 180.0f; dYaw -= 360.0f) {}
        while (dYaw <= -180.0f) {
            dYaw += 360.0f;
        }
        float dPitch;
        for (dPitch = vehicle.axes.getPitch() - vehicle.prevRotationPitch; dPitch > 180.0f; dPitch -= 360.0f) {}
        while (dPitch <= -180.0f) {
            dPitch += 360.0f;
        }
        float dRoll;
        for (dRoll = vehicle.axes.getRoll() - vehicle.prevRotationRoll; dRoll > 180.0f; dRoll -= 360.0f) {}
        while (dRoll <= -180.0f) {
            dRoll += 360.0f;
        }
        GL11.glRotatef(180.0f - vehicle.prevRotationYaw - dYaw * f1, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(vehicle.prevRotationPitch + dPitch * f1, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(vehicle.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glPushMatrix();
        final ModelVehicle modVehicle = (ModelVehicle)type.model;
        GL11.glPushMatrix();
        final float recoilDPos = (float)Math.sin(Math.toRadians(vehicle.recoilPos)) - (float)Math.sin(Math.toRadians(vehicle.lastRecoilPos));
        final float recoilPos = (float)Math.sin(Math.toRadians(vehicle.lastRecoilPos)) + recoilDPos * f1;
        float tankerinoYaw = 0.0f;
        if (vehicle.getVehicleType().marioKart && (vehicle.throttlePeepee > 0.01 || vehicle.throttlePeepee < -0.01f)) {
            GL11.glRotatef(2.0f * vehicle.throttlePeepee * vehicle.getVehicleType().animationMultiplier, 0.0f, 0.0f, 1.0f);
        }
        if (vehicle.getVehicleType().marioKart && vehicle.throttlePeepee > -0.01 && vehicle.throttlePeepee <= 0.01 && (vehicle.throttle > 0.005 || vehicle.throttle < -0.005f)) {
            GL11.glRotatef(-1.5f * vehicle.throttle * vehicle.getVehicleType().animationMultiplier, 0.0f, 0.0f, 1.0f);
        }
        if (vehicle.throttle > 0.0f) {
            GL11.glRotatef(0.5f * vehicle.throttle * vehicle.throttle * vehicle.wheelsYaw * vehicle.getVehicleType().driftMultiplier, 1.0f, 0.0f, 0.0f);
        }
        if (type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null) {
            tankerinoYaw = vehicle.seats[0].looking.getYaw();
            if (vehicle.backwardsTimer > 0.05 && !vehicle.epicShip && !vehicle.getVehicleType().canDive) {
                GL11.glTranslatef(0.0f, -0.03f * vehicle.recoilEnergy, 0.0f);
                if (tankerinoYaw < 23.0f && tankerinoYaw >= -22.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy, 0.0f, 0.0f, 1.0f);
                }
                else if (tankerinoYaw < 68.0f && tankerinoYaw >= 23.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy * 0.7f, -1.0f, 0.0f, 1.0f);
                }
                else if (tankerinoYaw < 113.0f && tankerinoYaw >= 68.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy, -1.0f, 0.0f, 0.0f);
                }
                else if (tankerinoYaw < 158.0f && tankerinoYaw >= 113.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy * 0.7f, -1.0f, 0.0f, -1.0f);
                }
                else if ((tankerinoYaw < 203.0f && tankerinoYaw >= 158.0f) || (tankerinoYaw > -180.0f && tankerinoYaw < -158.0f)) {
                    GL11.glRotatef(vehicle.recoilEnergy, 0.0f, 0.0f, -1.0f);
                }
                else if (tankerinoYaw < -113.0f && tankerinoYaw >= -158.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy * 0.7f, 1.0f, 0.0f, -1.0f);
                }
                else if (tankerinoYaw < -68.0f && tankerinoYaw >= -113.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy, 1.0f, 0.0f, 0.0f);
                }
                else if (tankerinoYaw < -23.0f && tankerinoYaw >= -68.0f) {
                    GL11.glRotatef(vehicle.recoilEnergy * 0.7f, 1.0f, 0.0f, 1.0f);
                }
                else {
                    GL11.glRotatef(vehicle.recoilEnergy, 0.0f, 0.0f, 1.0f);
                }
            }
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel) && !vehicle.isPartIntact(EnumDriveablePart.backRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel)) {
            GL11.glTranslatef(0.0f, -0.5f, 0.0f);
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.rightTrack) && !vehicle.isPartIntact(EnumDriveablePart.leftTrack)) {
            GL11.glTranslatef(0.0f, -0.5f, 0.0f);
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel)) {
            GL11.glRotatef(8.0f, 0.0f, 0.0f, -1.0f);
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.backRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel)) {
            GL11.glRotatef(8.0f, 0.0f, 0.0f, 1.0f);
        }
        float number = 1.0f;
        if (type.shiftSides) {
            number = -1.0f;
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.rightTrack) || (!vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backRightWheel))) {
            GL11.glRotatef(8.0f, 1.0f * number, 0.0f, 0.0f);
        }
        if (!vehicle.isPartIntact(EnumDriveablePart.leftTrack) || (!vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))) {
            GL11.glRotatef(8.0f, -1.0f * number, 0.0f, 0.0f);
        }
        GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
        if (modVehicle != null) {
            modVehicle.render(vehicle, f1);
        }
        for (int i = 0; i < vehicle.trackLinksLeft.length; ++i) {
            final AnimTrackLink link = vehicle.trackLinksLeft[i];
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
            if (modVehicle != null) {
                modVehicle.renderFancyTracks(vehicle, f1);
            }
            GL11.glPopMatrix();
        }
        for (int i = 0; i < vehicle.trackLinksRight.length; ++i) {
            final AnimTrackLink link = vehicle.trackLinksRight[i];
            float rotZ;
            for (rotZ = link.zRot; rotZ > 180.0f; rotZ -= 360.0f) {}
            while (rotZ <= -180.0f) {
                rotZ += 360.0f;
            }
            GL11.glPushMatrix();
            GL11.glTranslatef(link.position.x / 16.0f, link.position.y / 16.0f, link.position.z / 16.0f);
            GL11.glRotatef(rotZ * 57.29578f, 0.0f, 0.0f, 1.0f);
            if (modVehicle != null) {
                modVehicle.renderFancyTracks(vehicle, f1);
            }
            GL11.glPopMatrix();
        }
        if (type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null) {
            dYaw = vehicle.seats[0].looking.getYaw() - vehicle.seats[0].prevLooking.getYaw();
            final float pitch = vehicle.seats[0].looking.getPitch();
            while (dYaw > 180.0f) {
                dYaw -= 360.0f;
            }
            while (dYaw <= -180.0f) {
                dYaw += 360.0f;
            }
            final float yaw = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
            GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
            GL11.glRotatef(-yaw, 0.0f, 1.0f, 0.0f);
            GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
            if (modVehicle != null) {
                modVehicle.renderTurret(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, vehicle, f1);
            }
            if (modVehicle != null) {
                GL11.glTranslatef(modVehicle.barrelAttach.x, modVehicle.barrelAttach.y, -modVehicle.barrelAttach.z);
                final float bPitch = vehicle.seats[0].looking.getPitch() - vehicle.seats[0].prevLooking.getPitch();
                final float aPitch = vehicle.seats[0].prevLooking.getPitch() + bPitch * f1;
                GL11.glRotatef(-aPitch, 0.0f, 0.0f, 1.0f);
                if (vehicle.ticksRepairing > 1) {
                    GL11.glTranslatef(recoilPos * -0.3125f, 0.0f, 0.0f);
                }
                GL11.glTranslatef(vehicle.recoilEnergy * -0.5625f, 0.0f, 0.0f);
                modVehicle.renderAnimBarrel(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, vehicle, f1);
            }
        }
        GL11.glPopMatrix();
        if ((vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar) && Minecraft.getMinecraft() != null) {
            GL11.glPushMatrix();
            final Minecraft mc = Minecraft.getMinecraft();
            if (mc.thePlayer != null && mc.thePlayer.ridingEntity != null && mc.thePlayer.ridingEntity instanceof EntitySeat && vehicle.seats[0] != null && vehicle.seats[0].riddenByEntity != null && vehicle.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)vehicle.seats[0].riddenByEntity).getDisplayName() == mc.thePlayer.getDisplayName()) {
                final float pitch2 = -vehicle.seats[0].looking.getPitch();
                float WalterRange = -0.3228f * (pitch2 * pitch2) + 29.3893f * pitch2 - 76.1646f;
                if (vehicle.getDriveableType().walterMortar) {
                    WalterRange = -0.1035f * (pitch2 * pitch2) + 8.6336f * pitch2 + 53.001f;
                }
                if (TeamsManager.shellsEnabled) {
                    int slot = -1;
                    for (int i = vehicle.getDriveableData().getMissileInventoryStart(); i < vehicle.getDriveableData().getMissileInventoryStart() + type.numMissileSlots; ++i) {
                        final ItemStack shell = vehicle.getDriveableData().getStackInSlot(i);
                        if (shell != null && shell.getItem() instanceof ItemBullet) {
                            slot = i;
                        }
                    }
                    if (slot != -1) {
                        final ItemStack bulletStack = vehicle.driveableData.getStackInSlot(slot);
                        final ItemBullet item = (ItemBullet)bulletStack.getItem();
                        if (item instanceof ItemBullet && item.type.model != null && (vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar)) {
                            final BulletType gunType = item.type;
                            final ModelBase modelo = item.type.model;
                            final TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
                            texturemanager.bindTexture(FlansModResourceHandler.getTexture(gunType));
                            final IItemRenderer.ItemRenderType typerino = IItemRenderer.ItemRenderType.ENTITY;
                            if (vehicle.seats[0] != null) {
                                final float yaw2 = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
                                GL11.glRotatef(-yaw2, 0.0f, 1.0f, 0.0f);
                            }
                            GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                            GL11.glTranslatef(WalterRange, 0.0f, 0.0f);
                            GL11.glRotatef(-90.0f, -90.0f, 1.0f, 0.0f);
                            GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                            GL11.glScalef(3.0f, 3.0f, 3.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                            GL11.glTranslatef(0.0f, -3.0f, 0.0f);
                            GL11.glScalef(2.0f, 2.0f, 2.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                            GL11.glTranslatef(0.0f, -3.0f, 0.0f);
                            GL11.glScalef(2.0f, 2.0f, 2.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                            GL11.glTranslatef(0.0f, -3.0f, 0.0f);
                            GL11.glScalef(2.0f, 2.0f, 2.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                            GL11.glTranslatef(0.0f, -3.0f, 0.0f);
                            GL11.glScalef(2.0f, 2.0f, 2.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                            GL11.glTranslatef(0.0f, -3.0f, 0.0f);
                            GL11.glScalef(2.0f, 2.0f, 2.0f);
                            modelo.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
                        }
                    }
                }
            }
            GL11.glPopMatrix();
        }
        GL11.glPushMatrix();
        if (FlansMod.DEBUG && type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null) {
            for (dYaw = vehicle.seats[0].looking.getYaw() - vehicle.seats[0].prevLooking.getYaw(); dYaw > 180.0f; dYaw -= 360.0f) {}
            while (dYaw <= -180.0f) {
                dYaw += 360.0f;
            }
            final float yaw3 = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
            GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
            GL11.glRotatef(-yaw3, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(-vehicle.seats[0].looking.getPitch(), 0.0f, 0.0f, 1.0f);
            GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
            GL11.glColor4f(0.0f, 0.0f, 1.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsPrimary) {
                if (point.rootPos.part == EnumDriveablePart.turret) {
                    renderAABB(AxisAlignedBB.getBoundingBox((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
                }
            }
            GL11.glColor4f(0.0f, 1.0f, 0.0f, 0.3f);
            for (final ShootPoint point : type.shootPointsSecondary) {
                if (point.rootPos.part == EnumDriveablePart.turret) {
                    renderAABB(AxisAlignedBB.getBoundingBox((double)(point.rootPos.position.x - 0.25f), (double)(point.rootPos.position.y - 0.25f), (double)(point.rootPos.position.z - 0.25f), (double)(point.rootPos.position.x + 0.25f), (double)(point.rootPos.position.y + 0.25f), (double)(point.rootPos.position.z + 0.25f)));
                }
            }
        }
        GL11.glPopMatrix();
        if (modVehicle != null) {
            GL11.glPushMatrix();
            GL11.glTranslatef(modVehicle.drillHeadOrigin.x, modVehicle.drillHeadOrigin.y, modVehicle.drillHeadOrigin.z);
            GL11.glRotatef(vehicle.harvesterAngle * 50.0f, 1.0f, 0.0f, 0.0f);
            GL11.glTranslatef(-modVehicle.drillHeadOrigin.x, -modVehicle.drillHeadOrigin.y, -modVehicle.drillHeadOrigin.z);
            modVehicle.renderDrillBit(vehicle, f1);
            GL11.glPopMatrix();
        }
        if (modVehicle != null) {
            final Vector3f newRot = this.Interpolate(vehicle.doorRot, vehicle.prevDoorRot, f1);
            final Vector3f newPos = this.Interpolate(vehicle.doorPos, vehicle.prevDoorPos, f1);
            GL11.glPushMatrix();
            GL11.glTranslatef(modVehicle.doorAttach.x + newPos.x / 16.0f, modVehicle.doorAttach.y + newPos.y / 16.0f, -modVehicle.doorAttach.z + newPos.z / 16.0f);
            GL11.glRotatef(newRot.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-newRot.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(newRot.z, 0.0f, 0.0f, 1.0f);
            modVehicle.renderDoor(vehicle, 0.0625f);
            GL11.glPopMatrix();
            final Vector3f newRot2 = this.Interpolate(vehicle.door2Rot, vehicle.prevDoor2Rot, f1);
            final Vector3f newPos2 = this.Interpolate(vehicle.door2Pos, vehicle.prevDoor2Pos, f1);
            GL11.glPushMatrix();
            GL11.glTranslatef(modVehicle.door2Attach.x + newPos2.x / 16.0f, modVehicle.door2Attach.y + newPos2.y / 16.0f, -modVehicle.door2Attach.z + newPos2.z / 16.0f);
            GL11.glRotatef(newRot2.x, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(-newRot2.y, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(newRot2.z, 0.0f, 0.0f, 1.0f);
            modVehicle.renderDoor2(vehicle, 0.0625f);
            GL11.glPopMatrix();
        }
        GL11.glPopMatrix();
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        GL11.glDisable(2929);
        GL11.glColor4f(1.0f, 0.0f, 0.0f, 0.3f);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        if ((vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar) && Minecraft.getMinecraft() != null) {
            final Minecraft mc2 = Minecraft.getMinecraft();
            if (mc2.thePlayer != null && mc2.thePlayer.ridingEntity != null && mc2.thePlayer.ridingEntity instanceof EntitySeat && vehicle.seats[0] != null && vehicle.seats[0].riddenByEntity != null && vehicle.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)vehicle.seats[0].riddenByEntity).getDisplayName() == mc2.thePlayer.getDisplayName()) {
                GL11.glColor4f(0.0f, 2.0f, 2.0f, 0.3f);
                final float pitch3 = -vehicle.seats[0].looking.getPitch();
                float WalterRange2 = -0.3228f * (pitch3 * pitch3) + 29.3893f * pitch3 - 76.1646f;
                if (vehicle.getDriveableType().walterMortar) {
                    WalterRange2 = -0.1035f * (pitch3 * pitch3) + 8.6336f * pitch3 + 53.001f;
                }
                if (vehicle.seats[0] != null) {
                    final float yaw4 = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
                    GL11.glRotatef(-yaw4, 0.0f, 1.0f, 0.0f);
                }
                if (WalterRange2 < 0.0f) {
                    WalterRange2 = 0.0f;
                }
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-1.0f + WalterRange2), 0.0, -1.0, (double)(1.0f + WalterRange2), 1.0, 1.0));
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-2.0f + WalterRange2), 1.0, -2.0, (double)(2.0f + WalterRange2), 2.0, 2.0));
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-2.5f + WalterRange2), 2.0, -2.5, (double)(2.5f + WalterRange2), 3.0, 2.5));
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-3.0f + WalterRange2), 3.0, -3.0, (double)(3.0f + WalterRange2), 4.0, 3.0));
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-3.5f + WalterRange2), 4.0, -3.5, (double)(3.5f + WalterRange2), 5.0, 3.5));
                renderAABB(AxisAlignedBB.getBoundingBox((double)(-0.5f + WalterRange2), 5.0, -0.5, (double)(0.5f + WalterRange2), 450.0, 0.5));
            }
        }
        for (final DriveablePart part : vehicle.getDriveableData().parts.values()) {
            if (part.box == null) {
                continue;
            }
            float flux = 0.1f;
            if (flux > 0.1f || flux < -0.1f) {
                flux = 0.1f;
            }
            else {
                flux = (float)Math.sin(vehicle.ticksExisted / 10.0f);
            }
            float red = 0.5f;
            if (vehicle.shieldHitTimer > 0 || (part.health <= 0 && part.maxHealth > 0 && part.type == EnumDriveablePart.shield)) {
                red = vehicle.shieldHitTimer / 2.0f;
                flux = vehicle.shieldHitTimer / 2.0f;
            }
            else {
                red = 0.5f;
            }
            if (part.type == EnumDriveablePart.shield && !FlansMod.DEBUG) {
                GL11.glColor4f(red, red / 5.0f + 0.4f, 5.0f * red, Math.abs(flux * 0.5f));
            }
            if (FlansMod.DEBUG) {
                if (part.type == EnumDriveablePart.weakSpot || part.type == EnumDriveablePart.weakSpot2 || part.type == EnumDriveablePart.weakSpot3 || part.type == EnumDriveablePart.turretWeak || part.type == EnumDriveablePart.turretWeak2) {
                    GL11.glColor4f(3.0f, 0.0f, 0.0f, 0.5f);
                }
                else if (part.type == EnumDriveablePart.engine || part.type == EnumDriveablePart.leftTrack || part.type == EnumDriveablePart.rightTrack || part.type == EnumDriveablePart.frontLeftWheel || part.type == EnumDriveablePart.frontRightWheel || part.type == EnumDriveablePart.backLeftWheel || part.type == EnumDriveablePart.backRightWheel) {
                    GL11.glColor4f(0.0f, 0.0f, 2.0f, 0.3f);
                }
                else if (part.type == EnumDriveablePart.core || part.type == EnumDriveablePart.citadel || part.type == EnumDriveablePart.midsection || part.type == EnumDriveablePart.bow || part.type == EnumDriveablePart.stern || part.type == EnumDriveablePart.left || part.type == EnumDriveablePart.right || part.type == EnumDriveablePart.superstructure || part.type == EnumDriveablePart.turret) {
                    GL11.glColor4f(0.0f, 2.0f, 2.0f, 0.3f);
                }
                else if (part.type == EnumDriveablePart.shield) {
                    GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
                }
                else {
                    GL11.glColor4f(1.5f, 1.5f, 0.0f, 0.2f);
                }
            }
            else if (part.type != EnumDriveablePart.shield) {
                GL11.glColor4f(0.0f, 0.0f, 0.0f, 0.0f);
            }
            renderAABB(AxisAlignedBB.getBoundingBox((double)part.box.x, (double)part.box.y, (double)part.box.z, (double)(part.box.x + part.box.w), (double)(part.box.y + part.box.h), (double)(part.box.z + part.box.d)));
        }
        if (FlansMod.DEBUG) {
            GL11.glColor4f(0.0f, 0.0f, 1.0f, 0.3f);
            for (final ShootPoint point2 : type.shootPointsPrimary) {
                if (point2.rootPos.part != EnumDriveablePart.turret) {
                    renderAABB(AxisAlignedBB.getBoundingBox((double)(point2.rootPos.position.x - 0.25f), (double)(point2.rootPos.position.y - 0.25f), (double)(point2.rootPos.position.z - 0.25f), (double)(point2.rootPos.position.x + 0.25f), (double)(point2.rootPos.position.y + 0.25f), (double)(point2.rootPos.position.z + 0.25f)));
                }
            }
            GL11.glColor4f(0.0f, 1.0f, 0.0f, 0.3f);
            for (final ShootPoint point2 : type.shootPointsSecondary) {
                if (point2.rootPos.part != EnumDriveablePart.turret) {
                    renderAABB(AxisAlignedBB.getBoundingBox((double)(point2.rootPos.position.x - 0.25f), (double)(point2.rootPos.position.y - 0.25f), (double)(point2.rootPos.position.z - 0.25f), (double)(point2.rootPos.position.x + 0.25f), (double)(point2.rootPos.position.y + 0.25f), (double)(point2.rootPos.position.z + 0.25f)));
                }
            }
        }
        GL11.glEnable(3553);
        GL11.glEnable(2929);
        GL11.glDisable(3042);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glPopMatrix();
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityVehicle)entity, d, d1, d2, f, f1);
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
                return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null && item.getItem() instanceof ItemVehicle && ((ItemVehicle)item.getItem()).type.model != null;
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
        if (item != null && item.getItem() instanceof ItemVehicle) {
            final VehicleType vehicleType = ((ItemVehicle)item.getItem()).type;
            if (vehicleType.model != null) {
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
                        GL11.glRotatef(270.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.0f, 0.15f, -0.4f);
                        scale = 1.0f;
                        break;
                    }
                    case EQUIPPED_FIRST_PERSON: {
                        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.15f, 0.45f, -0.6f);
                        break;
                    }
                }
                GL11.glScalef(scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance);
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(vehicleType));
                final ModelDriveable model = vehicleType.model;
                model.render(vehicleType);
            }
        }
        GL11.glPopMatrix();
    }
    
    public Vector3f Interpolate(final Vector3f current, final Vector3f prev, final float f1) {
        final Vector3f result = new Vector3f(prev.x + (current.x - prev.x) * f1, prev.y + (current.y - prev.y) * f1, prev.z + (current.z - prev.z) * f1);
        return result;
    }
}
