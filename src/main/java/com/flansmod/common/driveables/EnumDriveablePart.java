// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import java.util.ArrayList;

public enum EnumDriveablePart
{
    tailWheel(new EnumDriveablePart[0], "tailWheel", "Wheel (Tail)"), 
    tail(new EnumDriveablePart[] { EnumDriveablePart.tailWheel }, "tail", "Tail"), 
    bay(new EnumDriveablePart[] { EnumDriveablePart.tail }, "bay", "Bay"), 
    topWing(new EnumDriveablePart[0], "topWing", "Top Wing"), 
    leftWingWheel(new EnumDriveablePart[0], "leftWingWheel", "Wheel (Left Wing)"), 
    leftWing(new EnumDriveablePart[] { EnumDriveablePart.topWing, EnumDriveablePart.leftWingWheel }, "leftWing", "Left Wing"), 
    rightWingWheel(new EnumDriveablePart[0], "rightWingWheel", "Wheel (Right Wing)"), 
    rightWing(new EnumDriveablePart[] { EnumDriveablePart.topWing, EnumDriveablePart.rightWingWheel }, "rightWing", "Right Wing"), 
    nose(new EnumDriveablePart[0], "nose", "Nose"), 
    coreWheel(new EnumDriveablePart[0], "coreWheel", "Wheel (Core)"), 
    skids(new EnumDriveablePart[0], "skids", "Skids"), 
    blades(new EnumDriveablePart[0], "blades", "Blades"), 
    turret(new EnumDriveablePart[0], "turret", "Turret"), 
    backWheel(new EnumDriveablePart[0], "backWheel", "Back Wheel"), 
    frontWheel(new EnumDriveablePart[0], "frontWheel", "Front Wheel"), 
    backLeftWheel(new EnumDriveablePart[0], "backLeftWheel", "Back Left Wheel"), 
    frontLeftWheel(new EnumDriveablePart[0], "frontLeftWheel", "Front Left Wheel"), 
    backRightWheel(new EnumDriveablePart[0], "backRightWheel", "Back Right Wheel"), 
    frontRightWheel(new EnumDriveablePart[0], "frontRightWheel", "Front Right Wheel"), 
    leftTrack(new EnumDriveablePart[0], "leftTrack", "Left Track"), 
    rightTrack(new EnumDriveablePart[0], "rightTrack", "Right Track"), 
    trailer(new EnumDriveablePart[0], "trailer", "AdditionArmor"), 
    harvester(new EnumDriveablePart[0], "harvester", "Harvester"), 
    frontalArmor(new EnumDriveablePart[0], "frontalArmor", "Frontal Armor"), 
    leftsideArmor(new EnumDriveablePart[0], "leftsideArmor", "Left Side Armor"), 
    rightsideArmor(new EnumDriveablePart[0], "rightsideArmor", "Right Side Armor"), 
    additionalArmor(new EnumDriveablePart[0], "additionalArmor", "Additional Armor"), 
    ERA(new EnumDriveablePart[0], "ERA", "ERA"), 
    APS(new EnumDriveablePart[0], "APS", "APS"), 
    ADS(new EnumDriveablePart[0], "ADS", "ADS"), 
    composite(new EnumDriveablePart[0], "composite", "Composite Armor"), 
    composite2(new EnumDriveablePart[0], "composite2", "More Comp Armor"), 
    spaced(new EnumDriveablePart[0], "spaced", "Spaced Armor"), 
    compositeL(new EnumDriveablePart[0], "compositeL", "Left Comp Armor"), 
    compositeR(new EnumDriveablePart[0], "compositeR", "Right Comp Armor"), 
    generic0(new EnumDriveablePart[0], "generic0", "Extra Armor"), 
    generic1(new EnumDriveablePart[0], "generic1", "Extra Armor 1"), 
    generic2(new EnumDriveablePart[0], "generic2", "Extra Armor 2"), 
    generic3(new EnumDriveablePart[0], "generic3", "Extra Armor 3"), 
    generic4(new EnumDriveablePart[0], "generic4", "Extra Armor 4"), 
    generic5(new EnumDriveablePart[0], "generic5", "Extra Armor 5"), 
    generic6(new EnumDriveablePart[0], "generic6", "Extra Armor 6"), 
    generic7(new EnumDriveablePart[0], "generic7", "Extra Armor 7"), 
    generic8(new EnumDriveablePart[0], "generic8", "Extra Armor 8"), 
    generic9(new EnumDriveablePart[0], "generic9", "Extra Armor 9"), 
    turret1(new EnumDriveablePart[0], "turret1", "Turret 1"), 
    turret2(new EnumDriveablePart[0], "turret2", "Turret 2"), 
    turret3(new EnumDriveablePart[0], "turret3", "Turret 3"), 
    turret4(new EnumDriveablePart[0], "turret4", "Turret 4"), 
    turret5(new EnumDriveablePart[0], "turret5", "Turret 5"), 
    turret6(new EnumDriveablePart[0], "turret6", "Turret 6"), 
    turret7(new EnumDriveablePart[0], "turret7", "Turret 7"), 
    turret8(new EnumDriveablePart[0], "turret8", "Turret 8"), 
    turret9(new EnumDriveablePart[0], "turret9", "Turret 9"), 
    bias(new EnumDriveablePart[0], "russianBias", "Stalinium"), 
    bulge(new EnumDriveablePart[0], "bulge", "Torpedo Bulge"), 
    bulgel(new EnumDriveablePart[0], "bulgel", "Left Torpedo Bulge"), 
    bulger(new EnumDriveablePart[0], "bulger", "Right Torpedo Bulge"), 
    superstructure(new EnumDriveablePart[0], "superstructure", "Super Structure"), 
    bow(new EnumDriveablePart[0], "bow", "Bow"), 
    stern(new EnumDriveablePart[0], "stern", "Stern"), 
    midsection(new EnumDriveablePart[0], "midsection", "Midsection"), 
    left(new EnumDriveablePart[0], "left", "Center Port"), 
    right(new EnumDriveablePart[0], "right", "Center Starboard"), 
    citadel(new EnumDriveablePart[0], "citadel", "Citadel"), 
    belt(new EnumDriveablePart[0], "belt", "Armor Belt"), 
    beltl(new EnumDriveablePart[0], "beltl", "Left Armor Belt"), 
    beltr(new EnumDriveablePart[0], "beltr", "Right Armor Belt"), 
    deck(new EnumDriveablePart[0], "deck", "Deck"), 
    steering(new EnumDriveablePart[0], "steering", "Steering System"), 
    ERA2(new EnumDriveablePart[0], "ERA2", "More ERA"), 
    ERA3(new EnumDriveablePart[0], "ERA3", "Even More ERA"), 
    infantry(new EnumDriveablePart[0], "infantry", "Meat Shield"), 
    turretarmor(new EnumDriveablePart[0], "turretarmor", "Turret Armor"), 
    moreturretarmor(new EnumDriveablePart[0], "moreturretarmor", "Turret Comp Armor"), 
    turretside(new EnumDriveablePart[0], "turretside", "Turret Side Armor"), 
    airframe(new EnumDriveablePart[0], "airframe", "Air Frame"), 
    gasbag(new EnumDriveablePart[0], "gasbag", "Gas Bag"), 
    buoyancy(new EnumDriveablePart[0], "buoyancy", "Buoyancy"), 
    shield(new EnumDriveablePart[0], "shield", "Energy Shield"), 
    turretWeak(new EnumDriveablePart[0], "weakTrt", "Turret Weak Spot"), 
    turretWeak2(new EnumDriveablePart[0], "weakTrt2", "Turret Weak Spot"), 
    engine(new EnumDriveablePart[0], "engine", "Engine"), 
    engine2(new EnumDriveablePart[0], "engine2", "Engine 2"), 
    engine3(new EnumDriveablePart[0], "engine3", "Engine 3"), 
    engine4(new EnumDriveablePart[0], "engine4", "Engine 4"), 
    engine5(new EnumDriveablePart[0], "engine5", "Engine 5"), 
    engine6(new EnumDriveablePart[0], "engine6", "Engine 6"), 
    weakSpot(new EnumDriveablePart[0], "weakSpot", "Weak Spot"), 
    weakSpot2(new EnumDriveablePart[0], "weakSpot2", "Weak Spot"), 
    weakSpot3(new EnumDriveablePart[0], "weakSpot3", "Weak Spot"), 
    leftArm(new EnumDriveablePart[0], "leftArm", "Left Arm"), 
    rightArm(new EnumDriveablePart[0], "rightArm", "Right Arm"), 
    head(new EnumDriveablePart[0], "head", "Head"), 
    hips(new EnumDriveablePart[0], "hips", "Hips"), 
    barrel(new EnumDriveablePart[0], "barrel", "Barrel"), 
    core(new EnumDriveablePart[] { EnumDriveablePart.bay, EnumDriveablePart.leftWing, EnumDriveablePart.rightWing, EnumDriveablePart.nose, EnumDriveablePart.turret, EnumDriveablePart.coreWheel, EnumDriveablePart.leftArm, EnumDriveablePart.rightArm, EnumDriveablePart.head, EnumDriveablePart.hips, EnumDriveablePart.blades, EnumDriveablePart.skids, EnumDriveablePart.backWheel, EnumDriveablePart.frontWheel, EnumDriveablePart.backLeftWheel, EnumDriveablePart.frontLeftWheel, EnumDriveablePart.backRightWheel, EnumDriveablePart.frontRightWheel, EnumDriveablePart.leftTrack, EnumDriveablePart.rightTrack, EnumDriveablePart.trailer, EnumDriveablePart.harvester, EnumDriveablePart.infantry }, "core", "Core");
    
    private String shortName;
    private String name;
    private EnumDriveablePart[] children;
    
    private EnumDriveablePart(final EnumDriveablePart[] parts, final String s, final String s2) {
        this.children = parts;
        this.shortName = s;
        this.name = s2;
    }
    
    public EnumDriveablePart[] getChildren() {
        return this.children;
    }
    
    public EnumDriveablePart[] getParents() {
        final ArrayList<EnumDriveablePart> parents = new ArrayList<EnumDriveablePart>();
        for (final EnumDriveablePart part : values()) {
            for (final EnumDriveablePart childPart : part.getChildren()) {
                if (childPart == this) {
                    parents.add(part);
                }
            }
        }
        return parents.toArray(new EnumDriveablePart[parents.size()]);
    }
    
    public String getShortName() {
        return this.shortName;
    }
    
    public String getName() {
        return this.name;
    }
    
    public static EnumDriveablePart getPart(final String s) {
        for (final EnumDriveablePart part : values()) {
            if (part.getShortName().equals(s)) {
                return part;
            }
        }
        return null;
    }
    
    public static boolean isWheel(final EnumDriveablePart part) {
        return part == EnumDriveablePart.coreWheel || part == EnumDriveablePart.tailWheel || part == EnumDriveablePart.leftWingWheel || part == EnumDriveablePart.rightWingWheel;
    }
}
