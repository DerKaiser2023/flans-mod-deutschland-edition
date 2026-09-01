// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import java.util.Iterator;
import java.util.ArrayList;
import net.minecraft.util.Vec3;

public class PositionTransformVertex extends PositionTextureVertex
{
    public Vec3 neutralVector;
    public ArrayList<TransformGroup> transformGroups;
    
    public PositionTransformVertex(final float x, final float y, final float z, final float u, final float v) {
        this(Vec3.createVectorHelper((double)x, (double)y, (double)z), u, v);
    }
    
    public PositionTransformVertex(final PositionTextureVertex vertex, final float u, final float v) {
        super(vertex, u, v);
        this.transformGroups = new ArrayList<TransformGroup>();
        if (vertex instanceof PositionTransformVertex) {
            this.neutralVector = ((PositionTransformVertex)vertex).neutralVector;
        }
        else {
            this.neutralVector = Vec3.createVectorHelper(vertex.vector3D.xCoord, vertex.vector3D.yCoord, vertex.vector3D.zCoord);
        }
    }
    
    public PositionTransformVertex(final PositionTextureVertex vertex) {
        this(vertex, vertex.texturePositionX, vertex.texturePositionY);
    }
    
    public PositionTransformVertex(final Vec3 vector, final float u, final float v) {
        super(vector, u, v);
        this.transformGroups = new ArrayList<TransformGroup>();
        this.neutralVector = Vec3.createVectorHelper(vector.xCoord, vector.yCoord, vector.zCoord);
    }
    
    public void setTransformation() {
        if (this.transformGroups.size() == 0) {
            this.vector3D.xCoord = this.neutralVector.xCoord;
            this.vector3D.yCoord = this.neutralVector.yCoord;
            this.vector3D.zCoord = this.neutralVector.zCoord;
            return;
        }
        double weight = 0.0;
        for (final TransformGroup transformGroup : this.transformGroups) {
            weight += transformGroup.getWeight();
        }
        this.vector3D.xCoord = 0.0;
        this.vector3D.yCoord = 0.0;
        this.vector3D.zCoord = 0.0;
        for (final TransformGroup group : this.transformGroups) {
            final double cWeight = group.getWeight() / weight;
            final Vec3 vector = group.doTransformation(this);
            final Vec3 vector3D = this.vector3D;
            vector3D.xCoord += cWeight * vector.xCoord;
            final Vec3 field_78243_a2 = this.vector3D;
            field_78243_a2.yCoord += cWeight * vector.yCoord;
            final Vec3 field_78243_a3 = this.vector3D;
            field_78243_a3.zCoord += cWeight * vector.zCoord;
        }
    }
    
    public void addGroup(final TransformGroup group) {
        this.transformGroups.add(group);
    }
    
    public void removeGroup(final TransformGroup group) {
        this.transformGroups.remove(group);
    }
}
