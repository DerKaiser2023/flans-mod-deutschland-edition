// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class TransformGroupBone extends TransformGroup
{
    protected Angle3D baseAngles;
    protected Vec3 baseVector;
    protected Bone attachedBone;
    protected double weight;
    
    public TransformGroupBone(final Bone bone, final double wght) {
        this.baseVector = bone.getPosition();
        this.baseAngles = bone.getAbsoluteAngle();
        this.attachedBone = bone;
        this.weight = wght;
    }
    
    public Angle3D getBaseAngles() {
        return this.baseAngles.copy();
    }
    
    public Angle3D getTransformAngle() {
        final Angle3D copy;
        final Angle3D returnAngle = copy = this.attachedBone.getAbsoluteAngle().copy();
        copy.angleX -= this.baseAngles.angleX;
        final Angle3D angle3D = returnAngle;
        angle3D.angleY -= this.baseAngles.angleY;
        final Angle3D angle3D2 = returnAngle;
        angle3D2.angleZ -= this.baseAngles.angleZ;
        return returnAngle;
    }
    
    public Vec3 getBaseVector() {
        return Vec3.func_72443_a(this.baseVector.field_72450_a, this.baseVector.field_72448_b, this.baseVector.field_72449_c);
    }
    
    public Vec3 getTransformVector() {
        return this.baseVector.func_72444_a(this.attachedBone.getPosition());
    }
    
    public Vec3 getCurrentVector() {
        return this.attachedBone.getPosition();
    }
    
    @Override
    public double getWeight() {
        return this.weight;
    }
    
    public void attachBone(final Bone bone) {
        this.baseVector = bone.getPosition();
        this.baseAngles = bone.getAbsoluteAngle();
        this.attachedBone = bone;
    }
    
    @Override
    public Vec3 doTransformation(final PositionTransformVertex vertex) {
        Vec3 vector = Vec3.func_72443_a(vertex.neutralVector.field_72450_a, vertex.neutralVector.field_72448_b, vertex.neutralVector.field_72449_c);
        vector = this.getBaseVector().func_72444_a(vector);
        final Angle3D angle = this.getTransformAngle();
        this.setVectorRotations(vector, angle.angleX, angle.angleY, angle.angleZ);
        return vector;
    }
    
    protected void setVectorRotations(final Vec3 vector, final float xRot, final float yRot, final float zRot) {
        final float x = xRot;
        final float y = yRot;
        final float z = zRot;
        final float xC = MathHelper.func_76134_b(x);
        final float xS = MathHelper.func_76126_a(x);
        final float yC = MathHelper.func_76134_b(y);
        final float yS = MathHelper.func_76126_a(y);
        final float zC = MathHelper.func_76134_b(z);
        final float zS = MathHelper.func_76126_a(z);
        double xVec = vector.field_72450_a;
        double yVec = vector.field_72448_b;
        double zVec = vector.field_72449_c;
        final double xy = xC * yVec - xS * zVec;
        final double xz = xC * zVec + xS * yVec;
        final double yz = yC * xz - yS * xVec;
        final double yx = yC * xVec + yS * xz;
        final double zx = zC * yx - zS * xy;
        final double zy = zC * xy + zS * yx;
        xVec = zx;
        yVec = zy;
        zVec = yz;
        vector.field_72450_a = xVec;
        vector.field_72448_b = yVec;
        vector.field_72449_c = zVec;
    }
}
