// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.FlansMod;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.collisions.RidingEntityPosition;
import com.flansmod.common.driveables.collisions.CollisionTest;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.nbt.NBTTagCompound;

public class DriveablePart
{
    public EnumDriveablePart type;
    public CollisionBox box;
    public int maxHealth;
    public int health;
    public int fireTime;
    public boolean onFire;
    public int maxCrew;
    public int crew;
    public int armor;
    public int compArmor;
    public int animal;
    public int crewRegenTimer;
    public int autoRepairTimer;
    public int autoRepairLimit;
    public int totalCrewFactor;
    public boolean dead;
    public EntityDriveable owner;
    
    public DriveablePart(final EnumDriveablePart e, final CollisionBox b) {
        this.maxHealth = 1;
        this.health = 1;
        this.maxCrew = 1;
        this.crew = 1;
        this.autoRepairLimit = 20;
        this.totalCrewFactor = 20;
        this.type = e;
        this.box = b;
        final int n = (b == null) ? 0 : b.health;
        this.maxHealth = n;
        this.health = n;
        final int n2 = (b == null) ? 0 : b.crew;
        this.maxCrew = n2;
        this.crew = n2;
        this.armor = ((b == null) ? 0 : b.armor);
        this.compArmor = ((b == null) ? 0 : b.compArmor);
        this.animal = ((b == null) ? 0 : b.animal);
    }
    
    public void update(final EntityDriveable driveable) {
        if (this.crew < 0) {
            this.crew = 0;
        }
        if (this.fireTime > 0) {
            --this.fireTime;
        }
        if (this.fireTime == 0) {
            this.onFire = false;
        }
        if (this.onFire) {
            --this.health;
        }
        if (this.health <= 0 && this.maxHealth > 0) {
            this.dead = true;
            this.crew = 0;
        }
        this.owner = driveable;
        if (this.maxCrew > 1000 && this.owner.throttle > -0.1 && this.owner.throttle < 0.1 && !this.dead && this.crew < this.maxCrew && this.owner.shootDelaySecondary <= 0 && this.owner.shootDelayPrimary <= 0) {
            this.totalCrewFactor = 3;
        }
        if (this.maxCrew < 1000 && this.maxCrew > 900) {
            this.totalCrewFactor = 6;
        }
        if (this.maxCrew < 900 && this.maxCrew > 800) {
            this.totalCrewFactor = 8;
        }
        if (this.maxCrew < 800 && this.maxCrew > 700) {
            this.totalCrewFactor = 12;
        }
        if (this.maxCrew < 700 && this.maxCrew > 600) {
            this.totalCrewFactor = 20;
        }
        if (this.maxCrew < 600 && this.maxCrew > 500) {
            this.totalCrewFactor = 30;
        }
        if (this.maxCrew < 500 && this.maxCrew > 400) {
            this.totalCrewFactor = 46;
        }
        if (this.maxCrew < 400 && this.maxCrew > 300) {
            this.totalCrewFactor = 56;
        }
        if (this.maxCrew < 300 && this.maxCrew > 200) {
            this.totalCrewFactor = 72;
        }
        if (this.maxCrew < 200 && this.maxCrew > 100) {
            this.totalCrewFactor = 90;
        }
        if (this.maxCrew < 100 && this.maxCrew > 0) {
            this.totalCrewFactor = 110;
        }
        if (this.crewRegenTimer >= this.totalCrewFactor) {
            this.crewRegenTimer = 0;
        }
        if (this.crewRegenTimer < this.totalCrewFactor) {
            ++this.crewRegenTimer;
        }
        if (this.crewRegenTimer == this.totalCrewFactor - 1 && this.owner.throttle > -0.1 && this.owner.throttle < 0.1 && !this.dead && this.crew < this.maxCrew && this.owner.shootDelaySecondary <= 0 && this.owner.shootDelayPrimary <= 0) {
            ++this.crew;
        }
        if (this.type != EnumDriveablePart.buoyancy && driveable.ticksFlareUsing > 0 && driveable.throttle > -0.1 && driveable.throttle < 0.1 && this.health < this.maxHealth) {
            ++this.autoRepairTimer;
            final int globalMaximum = driveable.getDriveableData().maximumCrew;
            final int globalCrew = driveable.getDriveableData().totalCrew;
            this.autoRepairLimit = (int)(566.0f - (137.0f * this.crew / this.maxCrew + 409.0f * globalCrew / globalMaximum));
            if (this.autoRepairTimer > this.autoRepairLimit) {
                this.autoRepairTimer = 0;
            }
            if (this.autoRepairTimer == 15 && !this.dead) {
                this.health = this.health + 1 + (int)(this.maxHealth * 0.025);
            }
        }
        if ((driveable.ticksRepairing > 0 || driveable.mounted) && driveable.throttle > -0.1 && driveable.throttle < 0.1 && this.health < this.maxHealth) {
            ++this.autoRepairTimer;
            if (this.autoRepairTimer > 20) {
                this.autoRepairTimer = 0;
            }
            if (this.autoRepairTimer == 15 && !this.dead && this.type != EnumDriveablePart.leftTrack && this.type != EnumDriveablePart.rightTrack && this.type != EnumDriveablePart.frontLeftWheel && this.type != EnumDriveablePart.frontRightWheel && this.type != EnumDriveablePart.backLeftWheel && this.type != EnumDriveablePart.backRightWheel && this.type != EnumDriveablePart.engine && this.type != EnumDriveablePart.engine2 && this.type != EnumDriveablePart.engine3 && this.type != EnumDriveablePart.engine4 && this.type != EnumDriveablePart.engine5 && this.type != EnumDriveablePart.engine6) {
                this.health = this.health + 1 + (int)(this.maxHealth * 0.005);
            }
            if (this.autoRepairTimer == 15 && !this.dead && (this.type == EnumDriveablePart.leftTrack || this.type == EnumDriveablePart.rightTrack || this.type == EnumDriveablePart.frontLeftWheel || this.type == EnumDriveablePart.frontRightWheel || this.type == EnumDriveablePart.backLeftWheel || this.type == EnumDriveablePart.backRightWheel || this.type == EnumDriveablePart.engine || this.type == EnumDriveablePart.engine5 || this.type == EnumDriveablePart.engine2 || this.type == EnumDriveablePart.engine3 || this.type == EnumDriveablePart.engine4 || this.type == EnumDriveablePart.engine6)) {
                this.health = this.health + 1 + (int)(this.maxHealth * 0.025);
            }
        }
        if (driveable.mounted && this.health < this.maxHealth) {
            ++this.health;
        }
        if (this.health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        if (this.crew > this.maxCrew) {
            this.crew = this.maxCrew;
        }
    }
    
    public void writeToNBT(final NBTTagCompound tags) {
        tags.func_74768_a(this.type.getShortName() + "_Health", this.health);
        tags.func_74768_a(this.type.getShortName() + "_Crew", this.crew);
        tags.func_74757_a(this.type.getShortName() + "_Fire", this.onFire);
    }
    
    public void readFromNBT(final NBTTagCompound tags) {
        if (!tags.func_74764_b(this.type.getShortName() + "_Health")) {
            this.health = this.maxHealth;
            this.onFire = false;
            return;
        }
        if (!tags.func_74764_b(this.type.getShortName() + "_Crew")) {
            this.crew = this.maxCrew;
            this.onFire = false;
            return;
        }
        this.health = tags.func_74762_e(this.type.getShortName() + "_Health");
        this.crew = tags.func_74762_e(this.type.getShortName() + "_Crew");
        this.onFire = tags.func_74767_n(this.type.getShortName() + "_Fire");
    }
    
    public float smashIntoGround(final EntityDriveable driveable, final float damage) {
        if (this.box == null || this.dead) {
            return 0.0f;
        }
        if (!driveable.canHitPart(this.type)) {
            return 0.0f;
        }
        if (this.maxHealth == 0) {
            return damage;
        }
        this.health -= (int)(damage / 2.0f);
        return damage / 2.0f;
    }
    
    public DriveableHit rayTrace(final EntityDriveable driveable, final Vector3f origin, final Vector3f motion, final boolean evilBullet) {
        if (this.box == null || this.health <= 0 || this.dead) {
            return null;
        }
        if (!driveable.canHitPart(this.type)) {
            return null;
        }
        if (driveable.type != null && driveable.type.evilGolem && evilBullet) {
            return null;
        }
        if (motion.x != 0.0f) {
            if (origin.x < this.box.x) {
                final float intersectTime = (this.box.x - origin.x) / motion.x;
                final float intersectY = origin.y + motion.y * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectY >= this.box.y && intersectY <= this.box.y + this.box.h && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
            else if (origin.x > this.box.x + this.box.w) {
                final float intersectTime = (this.box.x + this.box.w - origin.x) / motion.x;
                final float intersectY = origin.y + motion.y * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectY >= this.box.y && intersectY <= this.box.y + this.box.h && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
        }
        if (motion.z != 0.0f) {
            if (origin.z < this.box.z) {
                final float intersectTime = (this.box.z - origin.z) / motion.z;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectY2 = origin.y + motion.y * intersectTime;
                if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w && intersectY2 >= this.box.y && intersectY2 <= this.box.y + this.box.h && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
            else if (origin.z > this.box.z + this.box.d) {
                final float intersectTime = (this.box.z + this.box.d - origin.z) / motion.z;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectY2 = origin.y + motion.y * intersectTime;
                if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w && intersectY2 >= this.box.y && intersectY2 <= this.box.y + this.box.h && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
        }
        if (motion.y != 0.0f) {
            if (origin.y < this.box.y) {
                final float intersectTime = (this.box.y - origin.y) / motion.y;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
            else if (origin.y > this.box.y + this.box.h) {
                final float intersectTime = (this.box.y + this.box.h - origin.y) / motion.y;
                final float intersectX = origin.x + motion.x * intersectTime;
                final float intersectZ = origin.z + motion.z * intersectTime;
                if (intersectX >= this.box.x && intersectX <= this.box.x + this.box.w && intersectZ >= this.box.z && intersectZ <= this.box.z + this.box.d && intersectTime >= 0.0f) {
                    return new DriveableHit(driveable, this.type, intersectTime);
                }
            }
        }
        return null;
    }
    
    public RidingEntityPosition rayTraceRider(final EntityDriveable driveable, final CollisionTest tester, final boolean evil) {
        if (this.box == null || this.health <= 0 || this.dead) {
            return null;
        }
        if (!driveable.canHitPart(this.type)) {
            return null;
        }
        double distance = 10.0;
        Vector3f collisionPoint = new Vector3f(40.0f, 0.0f, 0.0f);
        int surface = 0;
        if (tester.didCollide) {
            return new RidingEntityPosition(collisionPoint.x, collisionPoint.y, collisionPoint.z, 1, distance, this.type);
        }
        final Vector3f pos = new Vector3f(driveable.field_70165_t, driveable.field_70163_u, driveable.field_70161_v);
        final RotatedAxes shift = driveable.axes;
        Vector3f p1 = shift.findLocalVectorGlobally(new Vector3f(this.box.x + this.box.w, this.box.y + this.box.h, this.box.z));
        Vector3f p2 = shift.findLocalVectorGlobally(new Vector3f(this.box.x + this.box.w, this.box.y + this.box.h, this.box.z + this.box.d));
        Vector3f p3 = shift.findLocalVectorGlobally(new Vector3f(this.box.x, this.box.y + this.box.h, this.box.z + this.box.d));
        Vector3f p4 = shift.findLocalVectorGlobally(new Vector3f(this.box.x, this.box.y + this.box.h, this.box.z));
        Vector3f p5 = shift.findLocalVectorGlobally(new Vector3f(this.box.x + this.box.w, this.box.y, this.box.z));
        Vector3f p6 = shift.findLocalVectorGlobally(new Vector3f(this.box.x + this.box.w, this.box.y, this.box.z + this.box.d));
        Vector3f p7 = shift.findLocalVectorGlobally(new Vector3f(this.box.x, this.box.y, this.box.z + this.box.d));
        Vector3f p8 = shift.findLocalVectorGlobally(new Vector3f(this.box.x, this.box.y, this.box.z));
        if (driveable.type != null && driveable.type.evilGolem && evil) {
            p1 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p2 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p3 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p4 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p5 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p6 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p7 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
            p8 = shift.findLocalVectorGlobally(new Vector3f(0.0f, 0.0f, 0.0f));
        }
        if (this.type == EnumDriveablePart.turret && driveable.seats[0] != null) {
            p1 = driveable.getPositionOnTurret(new Vector3f(this.box.x + this.box.w, this.box.y + this.box.h, this.box.z), false);
            p2 = driveable.getPositionOnTurret(new Vector3f(this.box.x + this.box.w, this.box.y + this.box.h, this.box.z + this.box.d), false);
            p3 = driveable.getPositionOnTurret(new Vector3f(this.box.x, this.box.y + this.box.h, this.box.z + this.box.d), false);
            p4 = driveable.getPositionOnTurret(new Vector3f(this.box.x, this.box.y + this.box.h, this.box.z), false);
            p5 = driveable.getPositionOnTurret(new Vector3f(this.box.x + this.box.w, this.box.y, this.box.z), false);
            p6 = driveable.getPositionOnTurret(new Vector3f(this.box.x + this.box.w, this.box.y, this.box.z + this.box.d), false);
            p7 = driveable.getPositionOnTurret(new Vector3f(this.box.x, this.box.y, this.box.z + this.box.d), false);
            p8 = driveable.getPositionOnTurret(new Vector3f(this.box.x, this.box.y, this.box.z), false);
        }
        double topFaceDist = 100.0;
        tester.checkTriangle(tester, p3, p2, p1);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p4, p3, p1);
        if (tester.didCollide && tester.nearestDistance < distance) {
            collisionPoint = tester.intersectionPoint;
            surface = 1;
            tester.part = this.type;
        }
        if (tester.didCollide) {
            tester.isOnTop = true;
            topFaceDist = tester.nearestDistance;
        }
        tester.checkTriangle(tester, p1, p2, p6);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 2;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p1, p6, p5);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 2;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p3, p4, p8);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 3;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p4, p8, p7);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 3;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p4, p1, p5);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 4;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p1, p5, p8);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 4;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p2, p3, p7);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 5;
            tester.part = this.type;
        }
        tester.checkTriangle(tester, p3, p7, p6);
        if (tester.didCollide && tester.nearestDistance < distance) {
            distance = tester.nearestDistance;
            collisionPoint = tester.intersectionPoint;
            surface = 5;
            tester.part = this.type;
        }
        if (tester.nearestDistance < topFaceDist) {
            tester.isOnTop = false;
        }
        if (surface == 1) {
            tester.isOnTop = true;
        }
        if (tester.part == this.type) {
            return null;
        }
        return null;
    }
    
    public void hitByBullet(final EntityBullet bullet, final DriveableHit hit) {
        EntitySeat parkingSeat = null;
        EntitySeat shooterSeat = null;
        if (bullet != null) {
            if (hit.driveable != null && hit.driveable.func_70115_ae() && hit.driveable.field_70154_o != null && hit.driveable.field_70154_o instanceof EntitySeat) {
                parkingSeat = (EntitySeat)hit.driveable.field_70154_o;
                if (bullet.owner != null && bullet.owner.func_70115_ae() && bullet.owner.field_70154_o != null && bullet.owner.field_70154_o instanceof EntitySeat) {
                    shooterSeat = (EntitySeat)bullet.owner.field_70154_o;
                }
            }
            if (shooterSeat != null && parkingSeat != null && shooterSeat.driveable != null && parkingSeat.driveable != null && (shooterSeat.driveable == parkingSeat.driveable || shooterSeat.driveable == this.owner)) {
                System.out.println("Self-damage should have been prevented");
                this.health -= 0;
            }
            else if (hit.driveable != null && hit.driveable.type != null && hit.driveable.type.evilGolem && bullet.evilBullet) {
                this.health -= 0;
            }
            else if (hit.driveable.APSdelay <= 0 && bullet.truePen > 30.0f && hit.driveable.APSchecker < 3) {
                hit.driveable.APSdelay = hit.driveable.APSmax;
                PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 25.0, 0, bullet.type.APSsound, true);
            }
            else if (hit.driveable instanceof EntityPlane) {
                if (this.type == EnumDriveablePart.shield) {
                    hit.driveable.shieldHitTimer = 20;
                }
                if (bullet.isSword && this.animal == 1) {
                    this.health -= 0;
                }
                else if (this.animal == 2) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsLiving);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 1, "blood"), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 200.0f, 0);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", bullet.field_70165_t, bullet.field_70163_u + 1.0, bullet.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 150.0f, 0);
                }
                else if (bullet.truePen < this.armor && 0.9 * this.armor < bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 35.0, 0, bullet.type.minorPenSound, true);
                }
                else if (bullet.truePen < this.compArmor && 0.9 * this.compArmor < bullet.truePen && bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 35.0, 0, bullet.type.minorPenSound, true);
                }
                else if (0.9f * this.armor >= bullet.truePen && !bullet.isHEAT) {
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 25.0, 0, bullet.type.ricochetSound, true);
                }
                else if (0.9f * this.compArmor >= bullet.truePen && bullet.isHEAT) {
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 25.0, 0, bullet.type.ricochetSound, true);
                }
                else if (bullet.truePen > this.armor && 3 * this.armor >= bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsPlanes);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.penetrateSound, true);
                }
                else if (bullet.truePen > this.compArmor && 3 * this.compArmor >= bullet.truePen && bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsPlanes);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.penetrateSound, true);
                }
                else if (3 * this.armor < bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsPlanes * bullet.type.overPenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.overPenSound, true);
                }
                else if (3 * this.compArmor < bullet.truePen && bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsPlanes * bullet.type.overPenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.overPenSound, true);
                }
            }
            else {
                if (this.type == EnumDriveablePart.shield) {
                    hit.driveable.shieldHitTimer = 10;
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 15, "crit"), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 200.0f, 0);
                }
                if (bullet.isSword && this.animal == 1) {
                    this.health -= 0;
                }
                else if (this.animal == 2) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsLiving);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 1, "blood"), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 200.0f, 0);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", bullet.field_70165_t, bullet.field_70163_u + 1.0, bullet.field_70161_v, (float)Math.random() * 1.0f, (float)Math.random() * 1.0f, -(float)Math.random() * 1.0f), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 150.0f, 0);
                }
                else if (bullet.truePen < this.armor && 0.9 * this.armor < bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 35.0, 0, bullet.type.minorPenSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart2 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart2.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart3 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart3.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart4 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart4.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
                else if (bullet.isHEAT && bullet.truePen < this.compArmor && 0.9 * this.compArmor < bullet.truePen) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 35.0, 0, bullet.type.minorPenSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles * bullet.type.barelypenPenalty;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart5 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart5.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart6 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart6.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart7 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart7.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart8 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart8.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
                else if (0.9f * this.armor >= bullet.truePen && !bullet.isHEAT) {
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 25.0, 0, bullet.type.ricochetSound, true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 1, "crit"), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 200.0f, 0);
                }
                else if (0.9f * this.compArmor >= bullet.truePen && bullet.isHEAT) {
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 25.0, 0, bullet.type.ricochetSound, true);
                    FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 1, "crit"), bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 200.0f, 0);
                }
                else if (bullet.truePen > this.armor && 3 * this.armor >= bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.penetrateSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart9 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart9.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart10 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart10.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart11 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart11.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart12 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart12.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
                else if (bullet.truePen > this.armor && 3 * this.compArmor >= bullet.truePen && bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.penetrateSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart13 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart13.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart14 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart14.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart15 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart15.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart16 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart16.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
                else if (3 * this.armor < bullet.truePen && !bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.overPenSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart17 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart17.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart18 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart18.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart19 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart19.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart20 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart20.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
                else if (3 * this.compArmor < bullet.truePen && bullet.isHEAT) {
                    this.health -= (int)(bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    this.crew -= (int)(hit.driveable.damageVsCrew * bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty);
                    PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 50.0, 0, bullet.type.overPenSound, true);
                    final float ouch = bullet.damage * bullet.type.damageVsVehicles * bullet.type.overPenPenalty;
                    if (ouch > 2 * this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1) {
                        final DriveablePart driveablePart21 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow);
                        driveablePart21.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart22 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left);
                        driveablePart22.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart23 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right);
                        driveablePart23.health -= (int)(0.4 * ouch);
                        final DriveablePart driveablePart24 = hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern);
                        driveablePart24.health -= (int)(0.4 * ouch);
                        FlansMod.proxy.spawnParticle("flansmod.tankDeath", bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 0.0, 0.0, 0.0);
                        PacketPlaySound.sendSoundPacket(bullet.field_70165_t, bullet.field_70163_u, bullet.field_70161_v, 250.0, bullet.field_71093_bK, "explcls6", false);
                    }
                }
            }
            if (bullet.type.setEntitiesOnFire) {
                this.fireTime = 20;
                this.onFire = true;
            }
        }
    }
    
    private static boolean coordIsEntering(final float start, final float end, final float min, final float max) {
        return (start < min && end >= min) || (start > max && end <= max);
    }
    
    private static boolean coordIsIn(final float start, final float end, final float min, final float max) {
        return (start >= min && start <= max) || (end >= min && end <= max) || (start < min && end > max) || (end < min && start > max);
    }
    
    public boolean attack(final float damage, final boolean fireDamage) {
        this.health -= (int)damage;
        if (fireDamage) {
            this.fireTime = 0;
            this.onFire = false;
        }
        if (this.health < 0) {
            this.health = 0;
        }
        return this.health <= 0;
    }
}
