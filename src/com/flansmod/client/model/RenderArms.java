// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import com.flansmod.common.vector.Vector3f;

public class RenderArms
{
    public static void renderArmPump(final ModelGun model, final GunAnimations anim, final float smoothing, final Vector3f rotationPoint, final Vector3f armPosition) {
        GL11.glTranslatef(-(armPosition.x - Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.pumpModifier), armPosition.y, armPosition.z);
        handleRotate(rotationPoint);
    }
    
    public static void renderArmCharge(final ModelGun model, final GunAnimations anim, final float smoothing, final Vector3f rotationPoint, final Vector3f armPosition) {
        handleRotate(rotationPoint);
        GL11.glTranslatef(-(armPosition.x - Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) / model.chargeModifier.x), -(armPosition.y - Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) / model.chargeModifier.y), -(armPosition.z - Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) / model.chargeModifier.z));
    }
    
    public static void renderArmBolt(final ModelGun model, final GunAnimations anim, final float smoothing, final Vector3f rotationPoint, final Vector3f armPosition) {
        handleRotate(rotationPoint);
        GL11.glTranslatef(armPosition.x + Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.chargeModifier.x, armPosition.y + Math.abs(anim.lastPumped + (anim.pumped - anim.lastPumped) * smoothing) / model.chargeModifier.y, -(armPosition.z - Math.abs(anim.lastCharged + (anim.charged - anim.lastCharged) * smoothing) / model.chargeModifier.z));
    }
    
    public static void renderArmDefault(final ModelGun model, final GunAnimations anim, final float smoothing, final Vector3f rotationPoint, final Vector3f armPosition) {
        handleRotate(rotationPoint);
        GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
    }
    
    public static void renderArmReload(final ModelGun model, final GunAnimations anim, final float smoothing, final Vector3f rotationPoint, final Vector3f armPosition) {
        handleRotate(rotationPoint);
        GL11.glTranslatef(armPosition.x, armPosition.y, armPosition.z);
    }
    
    private static void handleRotate(final Vector3f rotationPoint) {
        GL11.glRotatef(rotationPoint.y, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(rotationPoint.z, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(rotationPoint.x, 1.0f, 0.0f, 0.0f);
    }
}
