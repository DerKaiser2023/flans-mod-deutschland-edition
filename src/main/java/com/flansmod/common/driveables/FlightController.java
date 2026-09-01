// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import java.util.Iterator;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.FlansMod;
import net.minecraft.util.DamageSource;
import com.flansmod.common.vector.Vector3f;

public class FlightController
{
    public boolean leftWing;
    public boolean rightWing;
    public boolean tail;
    public float throttle;
    public float yawControl;
    public float pitchControl;
    public float rollControl;
    public EnumPlaneMode mode;
    public float gravity;
    public float drag;
    public float dragerino;
    public float thrust;
    public float lift;
    public float V;
    public float T;
    public float Vh;
    public float stallMS;
    public float Lc;
    public float Lcc;
    public float Gfactor;
    public float speedBleedGrace;
    public Vector3f angularMomentum;
    private Object mounted;
    public float acceleration;
    public float doomsday;
    
    public FlightController() {
        this.leftWing = true;
        this.rightWing = true;
        this.tail = true;
        this.gravity = 1.0f;
        this.drag = 0.0f;
        this.dragerino = 5.0f;
        this.thrust = 0.0f;
        this.lift = 0.0f;
        this.V = 0.0f;
        this.T = 0.0f;
        this.Vh = 0.0f;
        this.stallMS = 0.0f;
        this.Lc = 0.0f;
        this.Lcc = 0.0f;
        this.Gfactor = 1.0f;
        this.speedBleedGrace = 0.0f;
        this.angularMomentum = new Vector3f(0.0f, 0.0f, 0.0f);
        this.doomsday = 0.0f;
    }
    
    public void UpdateParams(final EntityPlane plane) {
        this.throttle = plane.throttle;
        this.yawControl = plane.flapsYaw;
        this.pitchControl = (plane.flapsPitchLeft + plane.flapsPitchRight) / 2.0f;
        this.rollControl = (plane.flapsPitchRight - plane.flapsPitchLeft) / 2.0f;
        this.mode = plane.mode;
    }
    
    public void fly(final EntityPlane plane) {
        final PlaneType type = plane.getPlaneType();
        final DriveableData data = plane.getDriveableData();
        this.UpdateParams(plane);
        this.SetAxes(plane);
        this.thrust = 0.01f * (0.85f + ((data.engine == null) ? 0.0f : 2.5f));
        this.stallMS = 0.44704f * type.takeoffSpeed;
        this.Lc = (float)(9.8 * type.mass / (this.stallMS * this.stallMS));
        this.Lcc = (float)((this.Lc * (0.44704f * type.maxSpeed * 0.44704f * type.maxSpeed) - type.mass * 9.8) / (type.climbRate * type.climbRate));
        this.gravity = 0.098000005f;
        switch (this.mode) {
            case PLANE: {
                this.PlaneModeFly(plane);
            }
            case HELI: {
                this.HeliModeFly(plane);
                this.drag = 1.0f - 0.05f * type.drag;
                break;
            }
        }
    }
    
    public void SetAxes(final EntityPlane plane) {
        final PlaneType type = plane.getPlaneType();
        final float labjacTickSpeed = (float)(0.5 * Math.exp(2.25 * (this.V * 2.23694f / 767.0f)));
        final float f;
        float sensitivityAdjustYaw = f = ((this.V * 2.23694f / (type.maxSpeed / 1.2f) > 0.5f) ? 0.5f : (this.V * 2.23694f / (type.maxSpeed / 1.2f)));
        if (plane.mounted || this.V * 2.23694f < 20.0f) {
            sensitivityAdjustYaw = 0.3f;
        }
        if (this.mode == EnumPlaneMode.HELI && this.throttle > 0.3) {
            sensitivityAdjustYaw = ((this.throttle > 0.5f) ? (1.5f - this.throttle) : (4.0f * this.throttle - 1.0f));
        }
        final float f2;
        float sensitivityAdjust = f2 = (((this.V * 2.23694f - type.takeoffSpeed) / 3.0f / ((type.maxSpeed - type.takeoffSpeed) / 2.0f) > 0.2f) ? 0.2f : ((this.V * 2.23694f - type.takeoffSpeed) / 3.0f / ((type.maxSpeed - type.takeoffSpeed) / 2.0f)));
        if (this.V * 2.23694f < type.takeoffSpeed) {
            sensitivityAdjust = 0.0f;
        }
        if (this.mode == EnumPlaneMode.HELI) {
            this.drag = 1.0f - 0.05f * type.drag;
            float n2 = 0.0f;
            if (this.throttle > 0.5f) {
                final float n = 1.5f - this.throttle;
            }
            else {
                n2 = 4.0f * this.throttle - 1.0f;
            }
            sensitivityAdjust = n2;
        }
        if ((float)plane.getSpeedXYZ() < 0.5 && sensitivityAdjust < -0.1f) {
            sensitivityAdjust = 0.1f;
        }
        final float rollerino = 0.0f;
        final float pitcherino = 0.0f;
        final float wingLoad = plane.getPlaneType().mass / plane.getPlaneType().area;
        float agilityU = 0.0f;
        final float sneed = 7.0f / (plane.getPlaneType().maxSpeed / 1.5f);
        if (this.V * 2.23694f < plane.getPlaneType().maxSpeed / 1.5f && this.V * 2.23694f > 1.0f && wingLoad < 100.0f) {
            agilityU = (float)(0.10000000149011612 + 0.5 * (-3.5 + 7.0 / (1.0 + Math.exp(-sneed * this.V * 2.23694f))));
        }
        else if (this.V * 2.23694f >= plane.getPlaneType().maxSpeed / 1.5f && this.V * 2.23694f < plane.getPlaneType().maxSpeed / 0.75f && this.V * 2.23694f > 1.0f && wingLoad < 100.0f) {
            agilityU = (float)(0.10000000149011612 + 0.5 * (3.5 - 7.0 / (1.0 + Math.exp(-sneed * (this.V * 2.23694f - plane.getPlaneType().maxSpeed * 1.333f)))));
        }
        else {
            agilityU = 0.0f;
        }
        float agilityS = 0.0f;
        float feed = 0.0f;
        if (this.V > 0.0f && wingLoad >= 0.0f && wingLoad < 200.0f && this.V <= plane.getPlaneType().maxSpeed / 0.75f) {
            feed = 3.25f / (plane.getPlaneType().maxSpeed / 1.5f * (plane.getPlaneType().maxSpeed / 1.5f));
            agilityS = 1.725f - feed * (this.V * 2.23694f - plane.getPlaneType().maxSpeed / 1.5f) * (this.V * 2.23694f - plane.getPlaneType().maxSpeed / 1.5f);
        }
        else {
            agilityS = 0.0f;
        }
        float agilityE = 0.0f;
        if (this.V * 2.23694f < plane.getPlaneType().maxSpeed / 1.5f && this.V > 0.0f && wingLoad >= 100.0f && wingLoad < 300.0f) {
            agilityE = 0.1f + 0.90000004f * this.V * 2.23694f / (plane.getPlaneType().maxSpeed / 1.5f);
        }
        else if (this.V * 2.23694f >= plane.getPlaneType().maxSpeed / 1.5f && this.V * 2.23694f < plane.getPlaneType().maxSpeed / 0.75f && wingLoad >= 100.0f && wingLoad < 300.0f) {
            agilityE = 0.1f + 0.5f * (3.0f - 3.0f * (this.V * 2.23694f - plane.getPlaneType().maxSpeed / 1.5f) / (plane.getPlaneType().maxSpeed / 1.5f));
        }
        else {
            agilityE = 0.0f;
        }
        float agilityR = 0.0f;
        if (this.V * 2.23694f < plane.getPlaneType().maxSpeed / 1.5f && this.V > 0.0f && wingLoad >= 200.0f) {
            agilityR = 0.05f + 0.5f * (2.0f * this.V * 2.23694f) / (plane.getPlaneType().maxSpeed / 1.5f);
        }
        else if (this.V * 2.23694f >= plane.getPlaneType().maxSpeed / 1.5f && this.V * 2.23694f < plane.getPlaneType().maxSpeed / 0.75f && wingLoad >= 200.0f) {
            agilityR = 0.05f + 0.5f * (2.0f - 2.0f * (this.V * 2.23694f - plane.getPlaneType().maxSpeed / 1.5f) / (plane.getPlaneType().maxSpeed / 1.5f));
        }
        else {
            agilityR = 0.0f;
        }
        float agility = 0.0f;
        if (wingLoad < 100.0f) {
            agility = 0.69f * agilityU * wingLoad / 100.0f + agilityS * (1.0f - wingLoad / 100.0f);
        }
        else if (wingLoad >= 100.0f && wingLoad < 200.0f) {
            agility = 0.69f * agilityS * ((wingLoad - 100.0f) / 100.0f) + agilityE * (1.0f - (wingLoad - 100.0f) / 100.0f);
        }
        else if (wingLoad >= 200.0f && wingLoad < 300.0f) {
            agility = 0.69f * agilityS * ((wingLoad - 200.0f) / 100.0f) + agilityE * (1.0f - (wingLoad - 200.0f) / 100.0f);
        }
        if (agility < 0.2f) {
            agility = 0.2f;
        }
        float lowpowerAgility = 0.0f;
        final float power = plane.getPlaneType().maxSpeed * plane.getPlaneType().maxSpeed / plane.getPlaneType().mass;
        if (power * this.throttle < 100.0f) {
            lowpowerAgility = agility * 0.5f + agility * 0.5f * (this.throttle * power / 100.0f);
            if (lowpowerAgility < 0.2f) {
                lowpowerAgility = 0.2f;
            }
        }
        else {
            lowpowerAgility = 0.0f;
        }
        float yaw = 0.0f;
        float roll = 0.0f;
        float pitch = 0.0f;
        final float penalty = 3.0f - 1.5f * (power / 200.0f);
        if (Math.abs(this.yawControl) > 0.1f && this.V > 0.0f) {
            if (this.speedBleedGrace < power) {
                this.speedBleedGrace += 0.2f * (0.05f * Math.abs(this.yawControl));
            }
            if (this.speedBleedGrace > power / 4.0f) {
                this.V /= 1.0f + 7.0f * ((this.speedBleedGrace - power / 4.0f) / (power * 0.75f)) * this.V * this.V / (0.7f * type.mass * type.mass);
                if (lowpowerAgility > 0.0f) {
                    lowpowerAgility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
                else {
                    agility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
            }
            else {
                this.V *= 0.999f;
            }
        }
        else if (Math.abs(this.pitchControl) > 0.1f && this.V > 0.0f) {
            if (this.speedBleedGrace < power) {
                this.speedBleedGrace += 0.2f * (0.05f * Math.abs(this.pitchControl));
            }
            if (this.speedBleedGrace > power / 4.0f) {
                this.V /= 1.0f + 7.0f * ((this.speedBleedGrace - power / 4.0f) / (power * 0.75f)) * this.V * this.V / (0.7f * type.mass * type.mass);
                if (lowpowerAgility > 0.0f) {
                    lowpowerAgility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
                else {
                    agility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
            }
            else {
                this.V *= 0.999f;
            }
        }
        else if (Math.abs(this.rollControl) > 0.1f && this.V > 0.0f) {
            if (this.speedBleedGrace < power) {
                this.speedBleedGrace += 0.2f * (0.05f * Math.abs(this.rollControl));
            }
            if (this.speedBleedGrace > power / 4.0f) {
                this.V /= 1.0f + 7.0f * ((this.speedBleedGrace - power / 4.0f) / (power * 0.75f)) * this.V * this.V / (0.7f * type.mass * type.mass);
                if (lowpowerAgility > 0.0f) {
                    lowpowerAgility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
                else {
                    agility *= 0.99f - 0.7f * ((this.speedBleedGrace - power / penalty) / (power * 0.75f)) * 0.55f;
                }
            }
            else {
                this.V *= 0.999f;
            }
        }
        else if (this.speedBleedGrace > 0.0f) {
            this.speedBleedGrace -= 0.5f * this.throttle;
        }
        if (this.speedBleedGrace > 0.0f) {
            this.speedBleedGrace -= 0.01f + 0.04f * this.throttle;
        }
        if (this.Gfactor > 5.0f) {
            agility *= 0.99f;
            lowpowerAgility *= 0.99f;
        }
        if (this.Gfactor > 6.0f) {
            agility *= 0.98f;
            lowpowerAgility *= 0.98f;
        }
        if (this.Gfactor > 7.0f) {
            agility *= 0.9f;
            lowpowerAgility *= 0.9f;
        }
        if (this.Gfactor > 10.0f && plane.isPartIntact(EnumDriveablePart.airframe)) {
            agility *= 0.8f;
            lowpowerAgility *= 0.8f;
            final float hullDamage = 1.0f + this.Gfactor * 0.0015f * plane.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth;
            plane.attackPart(EnumDriveablePart.airframe, DamageSource.cactus, hullDamage);
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (lowpowerAgility > 0.0f) {
            yaw = this.yawControl * ((this.yawControl > 0.0f) ? (type.yawBoost * lowpowerAgility * 1.0f) : (type.yawBoost * lowpowerAgility * 1.0f)) * (sensitivityAdjustYaw *= 0.5f);
            roll = this.rollControl * ((this.rollControl > 0.0f) ? (type.rollBoost * lowpowerAgility * 1.0f) : (type.rollBoost * lowpowerAgility * 1.0f)) * sensitivityAdjust;
            pitch = this.pitchControl * ((this.pitchControl > 0.0f) ? (type.pitchBoost * lowpowerAgility * 1.0f) : (type.pitchBoost * lowpowerAgility * 1.0f)) * sensitivityAdjust;
        }
        else {
            yaw = this.yawControl * ((this.yawControl > 0.0f) ? (type.yawBoost * agility * 1.0f) : (type.yawBoost * agility * 1.0f)) * (sensitivityAdjustYaw *= 0.5f);
            roll = this.rollControl * ((this.rollControl > 0.0f) ? (type.rollBoost * agility * 1.0f) : (type.rollBoost * agility * 1.0f)) * sensitivityAdjust;
            pitch = this.pitchControl * ((this.pitchControl > 0.0f) ? (type.pitchBoost * agility * 1.0f) : (type.pitchBoost * agility * 1.0f)) * sensitivityAdjust;
        }
        final float turnRate = (0.35f * Math.abs(yaw) + 0.4f * Math.abs(roll) + 0.9f * Math.abs(pitch)) / 5.0f;
        this.Gfactor = this.V * 1.5f * turnRate / 18.0f + 1.0f;
        if (plane.axes.getPitch() < 0.0f && plane.posY > type.ceiling - 10.0f) {
            plane.axes.rotateLocalPitch(-1.0f);
        }
        if (this.mode == EnumPlaneMode.PLANE) {
            if (!plane.isPartIntact(EnumDriveablePart.tail) && plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            if (!plane.isPartIntact(EnumDriveablePart.nose) && plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            if (!plane.isPartIntact(EnumDriveablePart.tail) && plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            if (!plane.isPartIntact(EnumDriveablePart.leftWing) && plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            if (!plane.isPartIntact(EnumDriveablePart.rightWing) && plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        else if (this.mode == EnumPlaneMode.HELI && !plane.isPartIntact(EnumDriveablePart.tail)) {
            yaw = 25.0f * this.throttle;
            roll = 5.0f * this.throttle;
            plane.motionY += -this.gravity;
            if (plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        if (!plane.mounted) {
            this.angularMomentum.x = this.moveToTarget(this.angularMomentum.x, yaw, 1.0f);
            this.angularMomentum.y = this.moveToTarget(this.angularMomentum.y, pitch, 1.0f);
            this.angularMomentum.z = this.moveToTarget(this.angularMomentum.z, roll, 1.0f);
            this.LimitAngularMomentum(this.angularMomentum, 20.0f);
            plane.axes.rotateLocalYaw(this.angularMomentum.x);
            plane.axes.rotateLocalPitch(this.angularMomentum.y);
            plane.axes.rotateLocalRoll(-this.angularMomentum.z);
            this.angularMomentum.scale(0.99f);
        }
        else {
            if (this.yawControl > 0.05f) {
                plane.axes.rotateLocalYaw(0.2f * this.yawControl);
            }
            if (this.yawControl < -0.05f) {
                plane.axes.rotateLocalYaw(0.2f * this.yawControl);
            }
        }
    }
    
    public float moveToTarget(float current, final float target, final float speed) {
        float pitchToMove;
        for (pitchToMove = (float)(Math.sqrt(target * target) - Math.sqrt(current * current)); pitchToMove > 180.0f; pitchToMove -= 360.0f) {}
        while (pitchToMove <= -180.0f) {
            pitchToMove += 360.0f;
        }
        float signDeltaY = 0.0f;
        if (pitchToMove > speed) {
            signDeltaY = 1.0f;
        }
        else {
            if (pitchToMove >= -speed) {
                signDeltaY = 0.0f;
                return target;
            }
            signDeltaY = -1.0f;
        }
        if (current > target) {
            current -= speed;
        }
        else if (current < target) {
            current += speed;
        }
        return current;
    }
    
    public void LimitAngularMomentum(final Vector3f vec, final float angle) {
        if (vec.x > angle) {
            vec.x = angle;
        }
        if (vec.x < -angle) {
            vec.x = -angle;
        }
        if (vec.y > angle) {
            vec.y = angle;
        }
        if (vec.y < -angle) {
            vec.y = -angle;
        }
        if (vec.z > angle) {
            vec.z = angle;
        }
        if (vec.z < -angle) {
            vec.z = -angle;
        }
    }
    
    public void PlaneModeFly(final EntityPlane plane) {
        if (plane.mode == EnumPlaneMode.HELI) {
            return;
        }
        final PlaneType type = plane.getPlaneType();
        final DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
        final float flap = this.angularMomentum.length();
        this.drag -= flap / 100.0f;
        this.throttle -= -flap / 500.0f;
        for (final Propeller prop : type.propellers) {
            if (!plane.isPartIntact(prop.planePart)) {
                continue;
            }
            ++numPropsWorking;
        }
        numProps = type.propellers.size();
        if (numProps == 0) {
            return;
        }
        final Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
        float lastTickSpeed = (float)plane.getSpeedXYZ();
        final float currentSpeedLimit = 1.0f;
        if (lastTickSpeed < 0.0f && this.V > 0.0f) {
            lastTickSpeed = 0.0f;
        }
        if (this.V * 2.23694f > 80.0f && Math.abs(forwards.y) > 0.15f) {
            final float mcSpeed = 0.35f + (float)(0.5 * Math.exp(2.25 * (this.V * 2.23694f / 767.0f)));
            if (lastTickSpeed < mcSpeed) {
                lastTickSpeed += 0.77f * (mcSpeed - lastTickSpeed);
            }
            else if (lastTickSpeed > mcSpeed) {
                lastTickSpeed -= 0.77f * (lastTickSpeed - mcSpeed);
            }
        }
        if (plane.axes.getRoll() > 0.1f || (!plane.getPlaneType().parasitePlane && plane.mounted)) {
            plane.axes.rotateLocalRoll(-0.15f);
        }
        if (plane.axes.getRoll() < -0.1f || (!plane.getPlaneType().parasitePlane && plane.mounted)) {
            plane.axes.rotateLocalRoll(0.15f);
        }
        if (plane.axes.getPitch() > 0.01 && (plane.axes.getPitch() < 5.0f || (!plane.getPlaneType().parasitePlane && plane.mounted))) {
            plane.axes.rotateLocalPitch(0.05f);
        }
        if (plane.axes.getPitch() < 0.0f && (plane.axes.getPitch() > -5.0f || (!plane.getPlaneType().parasitePlane && plane.mounted))) {
            plane.axes.rotateLocalPitch(-0.05f);
        }
        if (plane.axes.getPitch() < -1.0f && this.V * 2.23694f < type.takeoffSpeed * 1.2f) {
            plane.axes.rotateLocalPitch(-0.4f);
        }
        final float newSpeed = lastTickSpeed + this.thrust * 2.0f;
        if (this.acceleration < 1.0f && this.V > -0.1f) {
            this.acceleration += plane.throttle * 74.0f / 10.0f * type.mass - this.acceleration * 74.0f / 10.0f * type.mass;
        }
        if (this.V <= -0.1f && this.V > -1.01f) {
            this.acceleration = this.V / 1.01f;
        }
        else if (this.V <= -1.01f) {
            this.acceleration = -1.0f;
        }
        if (this.acceleration > 1.0f) {
            this.acceleration = 1.0f;
        }
        if ((plane.seats[0] != null && plane.seats[0].riddenByEntity == null && plane.throttle < 0.05f) || (plane.ticksExisted < 140 && this.throttle < 0.05f)) {
            this.acceleration = 0.0f;
            this.V = 0.0f;
            this.T = 0.0f;
        }
        if (plane.throttle < 0.05f && this.V < 0.0f) {
            this.acceleration *= 0.95f;
        }
        final float maxMS = 0.44704f * type.maxSpeed;
        float trueDrag = this.V * this.V;
        float diveAngle = 0.0f;
        final float trueRoll = Math.abs(plane.axes.getRoll());
        if (plane.axes.getPitch() > 0.0f) {
            if (trueRoll <= 90.0f) {
                diveAngle = plane.axes.getPitch() / 90.0f * (1.0f - trueRoll / 90.0f);
            }
            else if (trueRoll > 90.0f && trueRoll < 180.0f) {
                diveAngle = plane.axes.getPitch() / 90.0f * ((trueRoll - 90.0f) / 90.0f);
            }
        }
        if (plane.isRiding() && plane.ridingEntity != null && plane.ridingEntity instanceof EntitySeat && ((EntitySeat)plane.ridingEntity).driveable instanceof EntityPlane) {
            final EntityPlane mothership = (EntityPlane)((EntitySeat)plane.ridingEntity).driveable;
            plane.axes.setAngles(mothership.axes.getYaw(), mothership.axes.getPitch(), mothership.axes.getRoll());
        }
        if (plane.ticksExisted == 20) {
            if (plane.varFlap) {
                plane.varFlap = !plane.varFlap;
            }
            if (!plane.getDriveableData().emergencyMode) {
                this.V = 0.0f;
                this.acceleration = 0.0f;
                plane.throttle = 0.0f;
            }
        }
        if (plane.varGear && type.needsGear) {
            trueDrag = 1.8f * this.V * this.V;
        }
        if (plane.varFlap) {
            trueDrag = 3.5f * this.V * this.V;
        }
        if (plane.varFlap && plane.varGear) {
            trueDrag = 6.0f * this.V * this.V;
        }
        float maxAccel = maxMS * maxMS;
        float catapultBonus = 0.0f;
        if (plane.driveableData.catapult > 0) {
            catapultBonus = 3.0f;
        }
        else {
            catapultBonus = 0.0f;
        }
        if (type.hasAfterBurner && !plane.afterBurning && type.cruiseSpeed == 610.0f) {
            maxAccel = 74529.0f;
        }
        if (type.cruiseSpeed != 610.0f && !plane.afterBurning && type.hasAfterBurner) {
            maxAccel = type.cruiseSpeed * 0.44704f * (type.cruiseSpeed * 0.44704f);
        }
        this.T = this.throttle * maxAccel - trueDrag;
        if (this.V < 0.0f) {
            this.T = this.throttle * maxAccel + trueDrag;
        }
        this.lift = ((1.0f - Math.abs(forwards.y)) * (this.V * this.V) - this.stallMS * this.stallMS) / (this.stallMS * this.stallMS);
        if (this.lift > type.climbRate) {
            this.lift = type.climbRate;
        }
        if (this.lift < -100.0f) {
            this.lift = -100.0f;
        }
        final float VhMPH = this.Vh * 2.23694f;
        float DeltaVh = VhMPH / 74.0f;
        if (DeltaVh > 0.9f) {
            DeltaVh = 0.9f;
        }
        final float Vmph = this.V * 2.23694f;
        float bonusFactor = 0.0f;
        if (Vmph < type.maxSpeed && Vmph > 0.0f && (plane.afterBurning || !plane.getDriveableType().hasAfterBurner)) {
            bonusFactor = type.accelBonus * (1.0f - Vmph / type.maxSpeed);
        }
        else if (Vmph < type.cruiseSpeed && Vmph > 0.0f && !plane.afterBurning && plane.getDriveableType().hasAfterBurner) {
            bonusFactor = type.accelBonus * (1.0f - Vmph / type.cruiseSpeed);
        }
        if (plane.planeRecoil > 0.0f || (plane.driveableData.catapult > 0 && plane.driveableData.catapult < 40)) {
            this.V += (this.T - plane.planeRecoil) / type.mass - forwards.y * 9.8f / 20.0f + catapultBonus / 20.0f;
            plane.planeRecoil = 0.0f;
        }
        else {
            this.V += (1.0f + bonusFactor) * (1.0f + bonusFactor) * this.T / (type.mass * 20.0f) - type.gravityMultiplier * forwards.y * 9.8f / 20.0f;
        }
        if (!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY - 2.0), (int)plane.posZ) && this.throttle <= 0.2 && plane.driveableData.landBrake > 5 && this.V < 1.75f * type.takeoffSpeed) {
            this.V *= 0.965f;
            if (this.V > -5.0f && this.V < 5.0f) {
                this.acceleration = 0.0f;
                this.V *= 0.3f;
            }
            else {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud", plane.posX, plane.posY, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
            }
        }
        if (!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY + 1.0), (int)plane.posZ) && plane.worldObj.isAnyLiquid(plane.boundingBox)) {
            this.V *= 0.96f;
            if (this.V > -5.0f && this.V < 5.0f) {
                this.acceleration = 0.0f;
                this.V *= 0.3f;
            }
        }
        if (!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY - 2.0), (int)plane.posZ) && !plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY - 2.0), (int)plane.posZ) && this.throttle <= 0.2 && !plane.varGear && type.needsGear && !plane.worldObj.isAnyLiquid(plane.boundingBox)) {
            this.V *= 0.975f;
            if (this.V > -5.0f && this.V < 5.0f) {
                this.acceleration = 0.0f;
                this.V *= 0.3f;
            }
            else {
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud", plane.posX, plane.posY, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
                FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
            }
            if (this.V > 3.0f && plane.isPartIntact(EnumDriveablePart.airframe) && !plane.mounted) {
                final float hullDamage = 1.0f + 2.5E-4f * plane.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth;
                plane.attackPart(EnumDriveablePart.airframe, DamageSource.cactus, hullDamage);
            }
        }
        if (Vmph > type.maxSpeed) {
            plane.axes.rotateLocalPitch((Vmph - type.maxSpeed) / (type.maxSpeed / 20.0f) * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalYaw((Vmph - type.maxSpeed) / (type.maxSpeed / 20.0f) * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalRoll((Vmph - type.maxSpeed) / (type.maxSpeed / 20.0f) * ((float)Math.random() - 0.5f) / 4.0f);
        }
        if (Vmph <= 76.0f && Vmph >= 0.0f) {
            this.dragerino = (float)(-0.04 * Vmph + 5.0) + 0.18f;
        }
        else if (Vmph > 76.0f) {
            this.dragerino = (float)(-0.0031f * Vmph + 2.3641) + 0.18f;
        }
        else {
            this.dragerino = 5.0f;
        }
        this.drag = 1.0f - 0.05f * this.dragerino;
        if (this.mode == EnumPlaneMode.HELI) {
            this.drag = 1.0f - 0.05f * type.drag;
        }
        float proportionOfMotionToCorrect = 2.0f * this.acceleration;
        if (proportionOfMotionToCorrect < -1.0f) {
            proportionOfMotionToCorrect = -1.0f;
        }
        if (proportionOfMotionToCorrect > 1.5f) {
            proportionOfMotionToCorrect = 1.5f;
        }
        int numWingsIntact = 0;
        if (plane.isPartIntact(EnumDriveablePart.airframe)) {
            ++numWingsIntact;
        }
        if (!plane.mounted) {
            plane.motionX *= 1.0f - Math.abs(proportionOfMotionToCorrect);
            plane.motionY *= 1.0f - Math.abs(proportionOfMotionToCorrect);
            plane.motionZ *= 1.0f - Math.abs(proportionOfMotionToCorrect);
            if (this.V > 0.0f) {
                plane.motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
                plane.motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
                plane.motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
            }
        }
        if (this.lift >= 0.0f && this.doomsday < 1.0f) {
            plane.motionY += this.lift / 1480.0f;
        }
        else if (plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY - 2.0), (int)plane.posZ)) {
            plane.motionY += this.lift / 1480.0f + 0.13243243243243244 * this.lift - this.doomsday / 300.0f;
        }
        if (plane.driveableData.catapult > 0 && plane.motionY < 0.0) {
            plane.motionY = 0.009999999776482582;
        }
        if (plane.posY > type.ceiling) {
            plane.motionY = -0.1;
        }
        if (plane.getDriveableData().emergencyMode) {
            plane.motionY = 0.009999999776482582;
            plane.motionX = 0.0;
            plane.motionZ = 0.0;
            this.V = 0.69f * (0.44704f * type.maxSpeed);
        }
        if (this.V > 0.0f && plane.mounted) {
            this.V *= 0.9f;
        }
        if (!plane.isPartIntact(EnumDriveablePart.airframe)) {
            plane.motionY += -this.gravity;
            this.lift = -9.8f;
            plane.throttle = 0.0f;
            if (plane.axes.getRoll() > 0.1f) {
                plane.axes.rotateLocalRoll(-5.0f);
            }
            if (plane.axes.getRoll() < -0.1f) {
                plane.axes.rotateLocalRoll(5.0f);
            }
            ++this.doomsday;
            if (plane.axes.getPitch() < 35.0f) {
                plane.axes.rotateLocalPitch(-0.05f * this.doomsday);
            }
            if (plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        plane.motionX *= this.drag;
        plane.motionZ *= this.drag;
        plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
        if (!plane.isPartIntact(EnumDriveablePart.tail)) {
            plane.motionY += -this.gravity;
            this.lift *= 0.8f;
            this.lift -= (float)1.960000029206276;
            this.tail = false;
            if (this.doomsday < 750.0f) {
                ++this.doomsday;
            }
            if (this.doomsday >= 750.0f) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            plane.axes.rotateLocalPitch(type.lookUpModifier * this.doomsday / (this.doomsday / 2.0f));
            if (plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
            plane.motionY += -this.gravity;
            this.leftWing = false;
            if (this.doomsday < 750.0f) {
                ++this.doomsday;
            }
            if (this.doomsday >= 750.0f) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            plane.axes.rotateLocalRoll(type.rollRightModifier * this.doomsday / (this.doomsday / 10.0f));
            if (plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
            plane.motionY += -this.gravity;
            this.rightWing = false;
            if (this.doomsday < 750.0f) {
                ++this.doomsday;
            }
            if (this.doomsday >= 750.0f) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
            plane.axes.rotateLocalRoll(-type.rollLeftModifier * this.doomsday / (this.doomsday / 15.0f));
            if (plane.isInWater()) {
                plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10.0f);
            }
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largesmoke", plane.posX, plane.posY, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 20.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY, plane.posZ + 1.0, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 20.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY + 3.0, plane.posZ - 0.7, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 20.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY + 1.0, plane.posZ + 1.3, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largesmoke", plane.posX, plane.posY + 1.5, plane.posZ + 0.5, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY + 1.0, plane.posZ - 0.5, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY, plane.posZ + 0.5, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame", plane.posX, plane.posY - 0.5, plane.posZ - 2.0, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday >= 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.fmflame", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 5.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 18.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 30.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 100.0f) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 700.0f && (!this.leftWing || !this.tail || !this.rightWing)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 720.0f && (!this.leftWing || !this.tail || !this.rightWing)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 725.0f && (!this.leftWing || !this.tail || !this.rightWing)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 740.0f && (!this.leftWing || !this.tail || !this.rightWing)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
        if (this.doomsday == 748.0f && (!this.leftWing || !this.tail || !this.rightWing)) {
            FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.tankDeath", plane.posX, plane.posY + 1.0, plane.posZ, 0.0, 0.0, 0.0), plane.posX, plane.posY, plane.posZ, 150.0f, plane.dimension);
        }
    }
    
    public void HeliModeFly(final EntityPlane plane) {
        final PlaneType type = plane.getPlaneType();
        this.drag = 1.0f - 0.05f * type.drag;
        final DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
        for (final Propeller prop : type.heliPropellers) {
            if (!plane.isPartIntact(prop.planePart)) {
                continue;
            }
            ++numPropsWorking;
        }
        numProps = type.heliPropellers.size();
        this.gravity = 0.05f;
        if (numProps == 0) {
            return;
        }
        final Vector3f up = (Vector3f)plane.axes.getYAxis().normalise();
        this.thrust *= numPropsWorking / numProps * 2.0f;
        float upwardsForce = this.throttle * this.thrust + (this.gravity - this.thrust / 2.0f);
        if (this.throttle < 0.5f) {
            upwardsForce = this.gravity * this.throttle * 2.0f;
        }
        if (!plane.isPartIntact(EnumDriveablePart.blades)) {
            upwardsForce = 0.04f;
        }
        if (this.throttle < 0.52f && this.throttle > 0.48f && up.y >= 0.7f) {
            upwardsForce = this.gravity / up.y;
        }
        if (plane.getPlaneType().mode != EnumPlaneMode.VTOL && up.y < 0.0f) {
            final Vector3f vector3f = up;
            vector3f.y *= -1.0f;
            final Vector3f vector3f2 = up;
            vector3f2.x *= -1.0f;
            final Vector3f vector3f3 = up;
            vector3f3.z *= -1.0f;
        }
        if (plane.motionX < 1.0) {
            plane.motionX += upwardsForce * up.x * 0.5f;
        }
        if (plane.motionY < 1.0) {
            plane.motionY += upwardsForce * up.y - this.gravity;
        }
        if (plane.motionZ < 1.0) {
            plane.motionZ += upwardsForce * up.z * 0.5f;
        }
        if (plane.motionY >= 1.0) {
            upwardsForce = 0.04f;
        }
        if (plane.motionX >= 1.0) {
            upwardsForce = 0.04f;
        }
        if (plane.motionZ >= 1.0) {
            upwardsForce = 0.04f;
        }
        if (plane.posY > type.ceiling) {
            plane.motionY = -0.1;
        }
        plane.motionX *= 1.0f - (1.0f - this.drag) / 5.0f;
        plane.motionY *= this.drag;
        plane.motionZ *= 1.0f - (1.0f - this.drag) / 5.0f;
        plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
    }
}
