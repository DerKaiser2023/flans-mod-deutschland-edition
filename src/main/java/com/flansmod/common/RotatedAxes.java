// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Matrix4f;

public class RotatedAxes
{
    private float rotationYaw;
    private float rotationPitch;
    private float rotationRoll;
    private Matrix4f rotationMatrix;
    
    public RotatedAxes() {
        this.rotationMatrix = new Matrix4f();
    }
    
    public RotatedAxes(final Matrix4f mat) {
        this.rotationMatrix = mat;
        this.convertMatrixToAngles();
    }
    
    public RotatedAxes(final float yaw, final float pitch, final float roll) {
        this.setAngles(yaw, pitch, roll);
    }
    
    public RotatedAxes clone() {
        final RotatedAxes newAxes = new RotatedAxes();
        newAxes.rotationMatrix.load(this.getMatrix());
        newAxes.convertMatrixToAngles();
        return newAxes;
    }
    
    public void setAngles(final float yaw, final float pitch, final float roll) {
        this.rotationYaw = yaw;
        this.rotationPitch = pitch;
        this.rotationRoll = roll;
        this.convertAnglesToMatrix();
    }
    
    public float getYaw() {
        return this.rotationYaw;
    }
    
    public float getPitch() {
        return this.rotationPitch;
    }
    
    public float getRoll() {
        return this.rotationRoll;
    }
    
    public Vector3f getXAxis() {
        return new Vector3f(this.rotationMatrix.m00, this.rotationMatrix.m10, this.rotationMatrix.m20);
    }
    
    public Vector3f getYAxis() {
        return new Vector3f(this.rotationMatrix.m01, this.rotationMatrix.m11, this.rotationMatrix.m21);
    }
    
    public Vector3f getZAxis() {
        return new Vector3f(-this.rotationMatrix.m02, -this.rotationMatrix.m12, -this.rotationMatrix.m22);
    }
    
    public Matrix4f getMatrix() {
        return this.rotationMatrix;
    }
    
    public void rotateLocalYaw(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, this.getYAxis().normalise(null));
        this.convertMatrixToAngles();
    }
    
    public void rotateLocalPitch(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, this.getZAxis().normalise(null));
        this.convertMatrixToAngles();
    }
    
    public void rotateLocalRoll(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, this.getXAxis().normalise(null));
        this.convertMatrixToAngles();
    }
    
    public RotatedAxes rotateGlobalYaw(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public RotatedAxes rotateGlobalPitch(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, new Vector3f(0.0f, 0.0f, 1.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public RotatedAxes rotateGlobalRoll(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, new Vector3f(1.0f, 0.0f, 0.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public RotatedAxes rotateGlobalYawInRads(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy, new Vector3f(0.0f, 1.0f, 0.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public RotatedAxes rotateGlobalPitchInRads(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy, new Vector3f(0.0f, 0.0f, 1.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public RotatedAxes rotateGlobalRollInRads(final float rotateBy) {
        this.rotationMatrix.rotate(rotateBy, new Vector3f(1.0f, 0.0f, 0.0f));
        this.convertMatrixToAngles();
        return this;
    }
    
    public void rotateLocal(final float rotateBy, final Vector3f rotateAround) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, this.findLocalVectorGlobally(rotateAround));
        this.convertMatrixToAngles();
    }
    
    public void rotateGlobal(final float rotateBy, final Vector3f rotateAround) {
        this.rotationMatrix.rotate(rotateBy * 3.1415927f / 180.0f, rotateAround);
        this.convertMatrixToAngles();
    }
    
    public Vector3f findGlobalVectorLocally(final Vector3f in) {
        final Matrix4f mat = new Matrix4f();
        mat.m00 = in.x;
        mat.m10 = in.y;
        mat.m20 = in.z;
        mat.rotate(-this.rotationYaw * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        mat.rotate(-this.rotationPitch * 3.1415927f / 180.0f, new Vector3f(0.0f, 0.0f, 1.0f));
        mat.rotate(-this.rotationRoll * 3.1415927f / 180.0f, new Vector3f(1.0f, 0.0f, 0.0f));
        return new Vector3f(mat.m00, mat.m10, mat.m20);
    }
    
    public Vector3f findLocalVectorGlobally(final Vector3f in) {
        final Matrix4f mat = new Matrix4f();
        mat.m00 = in.x;
        mat.m10 = in.y;
        mat.m20 = in.z;
        mat.rotate(this.rotationRoll * 3.1415927f / 180.0f, new Vector3f(1.0f, 0.0f, 0.0f));
        mat.rotate(this.rotationPitch * 3.1415927f / 180.0f, new Vector3f(0.0f, 0.0f, 1.0f));
        mat.rotate(this.rotationYaw * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        return new Vector3f(mat.m00, mat.m10, mat.m20);
    }
    
    public Vector3f findLocalVectorGloballyYaw(final Vector3f in) {
        final Matrix4f mat = new Matrix4f();
        mat.m00 = in.x;
        mat.m10 = in.y;
        mat.m20 = in.z;
        mat.rotate(this.rotationYaw * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        return new Vector3f(mat.m00, mat.m10, mat.m20);
    }
    
    private void convertAnglesToMatrix() {
        (this.rotationMatrix = new Matrix4f()).rotate(this.rotationRoll * 3.1415927f / 180.0f, new Vector3f(1.0f, 0.0f, 0.0f));
        this.rotationMatrix.rotate(this.rotationPitch * 3.1415927f / 180.0f, new Vector3f(0.0f, 0.0f, 1.0f));
        this.rotationMatrix.rotate(this.rotationYaw * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        this.convertMatrixToAngles();
    }
    
    private void convertMatrixToAngles() {
        this.rotationYaw = (float)Math.atan2(this.rotationMatrix.m20, this.rotationMatrix.m00) * 180.0f / 3.1415927f;
        this.rotationPitch = (float)Math.atan2(-this.rotationMatrix.m10, Math.sqrt(this.rotationMatrix.m12 * this.rotationMatrix.m12 + this.rotationMatrix.m11 * this.rotationMatrix.m11)) * 180.0f / 3.1415927f;
        this.rotationRoll = (float)Math.atan2(this.rotationMatrix.m12, this.rotationMatrix.m11) * 180.0f / 3.1415927f;
    }
    
    public RotatedAxes findLocalAxesGlobally(final RotatedAxes in) {
        final Matrix4f mat = new Matrix4f();
        mat.load(in.getMatrix());
        mat.rotate(this.rotationRoll * 3.1415927f / 180.0f, new Vector3f(1.0f, 0.0f, 0.0f));
        mat.rotate(this.rotationPitch * 3.1415927f / 180.0f, new Vector3f(0.0f, 0.0f, 1.0f));
        mat.rotate(this.rotationYaw * 3.1415927f / 180.0f, new Vector3f(0.0f, 1.0f, 0.0f));
        return new RotatedAxes(mat);
    }
    
    @Override
    public String toString() {
        return "RotatedAxes[Yaw = " + this.getYaw() + ", Pitch = " + this.getPitch() + ", Roll = " + this.getRoll() + "]";
    }
}
