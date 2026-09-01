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
        return Vec3.createVectorHelper(this.baseVector.xCoord, this.baseVector.yCoord, this.baseVector.zCoord);
    }
    
    public Vec3 getTransformVector() {
        return this.baseVector.subtract(this.attachedBone.getPosition());
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
        Vec3 vector = Vec3.createVectorHelper(vertex.neutralVector.xCoord, vertex.neutralVector.yCoord, vertex.neutralVector.zCoord);
        vector = this.getBaseVector().subtract(vector);
        final Angle3D angle = this.getTransformAngle();
        this.setVectorRotations(vector, angle.angleX, angle.angleY, angle.angleZ);
        return vector;
    }
    
    protected void setVectorRotations(final Vec3 vector, final float xRot, final float yRot, final float zRot) {
        final float x = xRot;
        final float y = yRot;
        final float z = zRot;
        final float xC = MathHelper.cos(x);
        final float xS = MathHelper.sin(x);
        final float yC = MathHelper.cos(y);
        final float yS = MathHelper.sin(y);
        final float zC = MathHelper.cos(z);
        final float zS = MathHelper.sin(z);
        double xVec = vector.xCoord;
        double yVec = vector.yCoord;
        double zVec = vector.zCoord;
        final double xy = xC * yVec - xS * zVec;
        final double xz = xC * zVec + xS * yVec;
        final double yz = yC * xz - yS * xVec;
        final double yx = yC * xVec + yS * xz;
        final double zx = zC * yx - zS * xy;
        final double zy = zC * xy + zS * yx;
        xVec = zx;
        yVec = zy;
        zVec = yz;
        vector.xCoord = xVec;
        vector.yCoord = yVec;
        vector.zCoord = zVec;
    }
}
