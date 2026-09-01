// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

public class Shape3D
{
    public PositionTransformVertex[] vertices;
    public TexturedPolygon[] faces;
    
    public Shape3D(final PositionTransformVertex[] verts, final TexturedPolygon[] poly) {
        this.vertices = verts;
        this.faces = poly;
    }
}
