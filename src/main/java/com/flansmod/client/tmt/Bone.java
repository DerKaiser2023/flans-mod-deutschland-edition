// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.MathHelper;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.client.model.ModelRenderer;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public class Bone
{
    protected Angle3D neutralAngles;
    public Angle3D relativeAngles;
    protected Angle3D absoluteAngles;
    private Vec3 positionVector;
    private float length;
    private Bone parentNode;
    protected ArrayList<Bone> childNodes;
    private ArrayList<ModelRenderer> models;
    private Map<ModelRenderer, Angle3D> modelBaseRot;
    private float offsetX;
    private float offsetY;
    private float offsetZ;
    
    public Bone(final float x, final float y, final float z, final float l) {
        this.neutralAngles = new Angle3D(x, y, z);
        this.relativeAngles = new Angle3D(0.0f, 0.0f, 0.0f);
        this.absoluteAngles = new Angle3D(0.0f, 0.0f, 0.0f);
        this.positionVector = Vec3.createVectorHelper(0.0, 0.0, 0.0);
        this.length = l;
        this.childNodes = new ArrayList<Bone>();
        this.models = new ArrayList<ModelRenderer>();
        this.modelBaseRot = new HashMap<ModelRenderer, Angle3D>();
        this.parentNode = null;
        this.offsetX = 0.0f;
        this.offsetY = 0.0f;
        this.offsetZ = 0.0f;
        this.positionVector = Vec3.createVectorHelper(0.0, 0.0, 0.0);
    }
    
    public Bone(final float xOrig, final float yOrig, final float zOrig, final float xRot, final float yRot, final float zRot, final float l) {
        this(xRot, yRot, zRot, l);
        this.positionVector = this.setOffset(xOrig, yOrig, zOrig);
    }
    
    public Bone(final float x, final float y, final float z, final float l, final Bone parent) {
        this(x, y, z, l);
        this.attachBone(parent);
    }
    
    public void detachBone() {
        this.parentNode.childNodes.remove(this);
        this.parentNode = null;
    }
    
    public void attachBone(final Bone parent) {
        if (this.parentNode != null) {
            this.detachBone();
        }
        (this.parentNode = parent).addChildBone(this);
        this.offsetX = parent.offsetX;
        this.offsetY = parent.offsetY;
        this.offsetZ = parent.offsetZ;
        this.resetOffset();
    }
    
    public Vec3 setOffset(final float x, final float y, final float z) {
        if (this.parentNode != null) {
            final Vec3 vector = this.parentNode.setOffset(x, y, z);
            this.offsetX = (float)vector.xCoord;
            this.offsetY = (float)vector.yCoord;
            this.offsetZ = (float)vector.zCoord;
            return vector;
        }
        this.offsetX = x;
        this.offsetY = y;
        this.offsetZ = z;
        this.resetOffset(true);
        return Vec3.createVectorHelper((double)x, (double)y, (double)z);
    }
    
    public void resetOffset() {
        this.resetOffset(false);
    }
    
    public void resetOffset(final boolean doRecursive) {
        if (this.parentNode != null) {
            this.positionVector = Vec3.createVectorHelper(0.0, 0.0, (double)this.parentNode.length);
            this.parentNode.setVectorRotations(this.positionVector);
            final Vec3 positionVector = this.positionVector;
            positionVector.xCoord += this.parentNode.positionVector.xCoord;
            final Vec3 positionVector2 = this.positionVector;
            positionVector2.yCoord += this.parentNode.positionVector.yCoord;
            final Vec3 positionVector3 = this.positionVector;
            positionVector3.zCoord += this.parentNode.positionVector.zCoord;
        }
        if (doRecursive && !this.childNodes.isEmpty()) {
            for (final Bone childNode : this.childNodes) {
                childNode.resetOffset(doRecursive);
            }
        }
    }
    
    public void setNeutralRotation(final float x, final float y, final float z) {
        this.neutralAngles.angleX = x;
        this.neutralAngles.angleY = y;
        this.neutralAngles.angleZ = z;
    }
    
    public Bone getRootParent() {
        if (this.parentNode == null) {
            return this;
        }
        return this.parentNode.getRootParent();
    }
    
    public void addModel(final ModelRenderer model) {
        this.addModel(model, false);
    }
    
    public void addModel(final ModelRenderer model, final boolean inherit) {
        this.addModel(model, 0.0f, 0.0f, 0.0f, inherit);
    }
    
    public void addModel(final ModelRenderer model, final boolean inherit, final boolean isUpright) {
        this.addModel(model, 0.0f, 0.0f, 0.0f, inherit, isUpright);
    }
    
    public void addModel(final ModelRenderer model, final float x, final float y, final float z) {
        this.addModel(model, x, y, z, false);
    }
    
    public void addModel(final ModelRenderer model, final float x, final float y, final float z, final boolean inherit) {
        this.addModel(model, x, y, z, inherit, false);
    }
    
    public void addModel(final ModelRenderer model, float x, float y, float z, final boolean inherit, final boolean isUpright) {
        if (inherit) {
            x += this.neutralAngles.angleX + (isUpright ? 1.5707964f : 0.0f);
            y += this.neutralAngles.angleY;
            z += this.neutralAngles.angleZ;
        }
        this.models.add(model);
        this.modelBaseRot.put(model, new Angle3D(x, y, z));
    }
    
    public void removeModel(final ModelRenderer model) {
        this.models.remove(model);
        this.modelBaseRot.remove(model);
    }
    
    public Angle3D getAbsoluteAngle() {
        return new Angle3D(this.absoluteAngles.angleX, this.absoluteAngles.angleY, this.absoluteAngles.angleZ);
    }
    
    public Vec3 getPosition() {
        return Vec3.createVectorHelper(this.positionVector.xCoord, this.positionVector.yCoord, this.positionVector.zCoord);
    }
    
    protected void addChildBone(final Bone bone) {
        this.childNodes.add(bone);
    }
    
    public void prepareDraw() {
        if (this.parentNode != null) {
            this.parentNode.prepareDraw();
        }
        else {
            this.setAbsoluteRotations();
            this.setVectors();
        }
    }
    
    public void setRotations(final float x, final float y, final float z) {
        this.relativeAngles.angleX = x;
        this.relativeAngles.angleY = y;
        this.relativeAngles.angleZ = z;
    }
    
    protected void setAbsoluteRotations() {
        this.absoluteAngles.angleX = this.relativeAngles.angleX;
        this.absoluteAngles.angleY = this.relativeAngles.angleY;
        this.absoluteAngles.angleZ = this.relativeAngles.angleZ;
        for (final Bone childNode : this.childNodes) {
            childNode.setAbsoluteRotations(this.absoluteAngles.angleX, this.absoluteAngles.angleY, this.absoluteAngles.angleZ);
        }
    }
    
    protected void setAbsoluteRotations(final float x, final float y, final float z) {
        this.absoluteAngles.angleX = this.relativeAngles.angleX + x;
        this.absoluteAngles.angleY = this.relativeAngles.angleY + y;
        this.absoluteAngles.angleZ = this.relativeAngles.angleZ + z;
        for (final Bone childNode : this.childNodes) {
            childNode.setAbsoluteRotations(this.absoluteAngles.angleX, this.absoluteAngles.angleY, this.absoluteAngles.angleZ);
        }
    }
    
    protected void setVectorRotations(final Vec3 vector) {
        final float x = this.neutralAngles.angleX + this.absoluteAngles.angleX;
        final float y = this.neutralAngles.angleY + this.absoluteAngles.angleY;
        final float z = this.neutralAngles.angleZ + this.absoluteAngles.angleZ;
        this.setVectorRotations(vector, x, y, z);
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
    
    public void setParent(final Bone parent) {
        this.attachBone(parent);
    }
    
    protected void addVector(final Vec3 destVec, final Vec3 srcVec) {
        destVec.xCoord += srcVec.xCoord;
        destVec.yCoord += srcVec.yCoord;
        destVec.zCoord += srcVec.zCoord;
    }
    
    protected void setVectors() {
        final Vec3 tempVec = Vec3.createVectorHelper(0.0, 0.0, (double)this.length);
        this.addVector(tempVec, this.positionVector = Vec3.createVectorHelper((double)this.offsetX, (double)this.offsetY, (double)this.offsetZ));
        this.setVectorRotations(tempVec);
        for (final Bone childNode : this.childNodes) {
            childNode.setVectors(tempVec);
        }
    }
    
    protected void setVectors(final Vec3 vector) {
        this.positionVector = vector;
        final Vec3 tempVec = Vec3.createVectorHelper(0.0, 0.0, (double)this.length);
        this.setVectorRotations(tempVec);
        this.addVector(tempVec, vector);
        for (final Bone childNode : this.childNodes) {
            childNode.setVectors(tempVec);
        }
    }
    
    public void setAnglesToModels() {
        for (final ModelRenderer currentModel : this.models) {
            final Angle3D baseAngles = this.modelBaseRot.get(currentModel);
            currentModel.rotateAngleX = baseAngles.angleX + this.absoluteAngles.angleX;
            currentModel.rotateAngleY = baseAngles.angleY + this.absoluteAngles.angleY;
            currentModel.rotateAngleZ = baseAngles.angleZ + this.absoluteAngles.angleZ;
            currentModel.rotationPointX = (float)this.positionVector.xCoord;
            currentModel.rotationPointY = (float)this.positionVector.yCoord;
            currentModel.rotationPointZ = (float)this.positionVector.zCoord;
        }
        for (final Bone childNode : this.childNodes) {
            childNode.setAnglesToModels();
        }
    }
}
