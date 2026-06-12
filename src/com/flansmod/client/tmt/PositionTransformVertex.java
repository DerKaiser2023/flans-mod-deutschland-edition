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
        this(Vec3.func_72443_a((double)x, (double)y, (double)z), u, v);
    }
    
    public PositionTransformVertex(final PositionTextureVertex vertex, final float u, final float v) {
        super(vertex, u, v);
        this.transformGroups = new ArrayList<TransformGroup>();
        if (vertex instanceof PositionTransformVertex) {
            this.neutralVector = ((PositionTransformVertex)vertex).neutralVector;
        }
        else {
            this.neutralVector = Vec3.func_72443_a(vertex.field_78243_a.field_72450_a, vertex.field_78243_a.field_72448_b, vertex.field_78243_a.field_72449_c);
        }
    }
    
    public PositionTransformVertex(final PositionTextureVertex vertex) {
        this(vertex, vertex.field_78241_b, vertex.field_78242_c);
    }
    
    public PositionTransformVertex(final Vec3 vector, final float u, final float v) {
        super(vector, u, v);
        this.transformGroups = new ArrayList<TransformGroup>();
        this.neutralVector = Vec3.func_72443_a(vector.field_72450_a, vector.field_72448_b, vector.field_72449_c);
    }
    
    public void setTransformation() {
        if (this.transformGroups.size() == 0) {
            this.field_78243_a.field_72450_a = this.neutralVector.field_72450_a;
            this.field_78243_a.field_72448_b = this.neutralVector.field_72448_b;
            this.field_78243_a.field_72449_c = this.neutralVector.field_72449_c;
            return;
        }
        double weight = 0.0;
        for (final TransformGroup transformGroup : this.transformGroups) {
            weight += transformGroup.getWeight();
        }
        this.field_78243_a.field_72450_a = 0.0;
        this.field_78243_a.field_72448_b = 0.0;
        this.field_78243_a.field_72449_c = 0.0;
        for (final TransformGroup group : this.transformGroups) {
            final double cWeight = group.getWeight() / weight;
            final Vec3 vector = group.doTransformation(this);
            final Vec3 field_78243_a = this.field_78243_a;
            field_78243_a.field_72450_a += cWeight * vector.field_72450_a;
            final Vec3 field_78243_a2 = this.field_78243_a;
            field_78243_a2.field_72448_b += cWeight * vector.field_72448_b;
            final Vec3 field_78243_a3 = this.field_78243_a;
            field_78243_a3.field_72449_c += cWeight * vector.field_72449_c;
        }
    }
    
    public void addGroup(final TransformGroup group) {
        this.transformGroups.add(group);
    }
    
    public void removeGroup(final TransformGroup group) {
        this.transformGroups.remove(group);
    }
}
