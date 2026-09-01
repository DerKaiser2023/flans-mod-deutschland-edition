// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.Vec3;
import java.util.ArrayList;

public class TexturedPolygon
{
    public PositionTextureVertex[] vertexPositions;
    public int nVertices;
    private boolean invertNormal;
    private float[] normals;
    private ArrayList<Vec3> iNormals;
    
    public TexturedPolygon(final PositionTextureVertex[] apositionTexturevertex) {
        this.invertNormal = false;
        this.vertexPositions = apositionTexturevertex;
        this.nVertices = apositionTexturevertex.length;
        this.iNormals = new ArrayList<Vec3>();
        this.normals = new float[0];
    }
    
    public TexturedPolygon(final PositionTextureVertex[] apositionTexturevertex, final int par2, final int par3, final int par4, final int par5, final float par6, final float par7) {
        this(apositionTexturevertex);
        final float var8 = 0.0f / par6;
        final float var9 = 0.0f / par7;
        apositionTexturevertex[0] = apositionTexturevertex[0].setTexturePosition(par4 / par6 - var8, par3 / par7 + var9);
        apositionTexturevertex[1] = apositionTexturevertex[1].setTexturePosition(par2 / par6 + var8, par3 / par7 + var9);
        apositionTexturevertex[2] = apositionTexturevertex[2].setTexturePosition(par2 / par6 + var8, par5 / par7 - var9);
        apositionTexturevertex[3] = apositionTexturevertex[3].setTexturePosition(par4 / par6 - var8, par5 / par7 - var9);
    }
    
    public void setInvertNormal(final boolean isSet) {
        this.invertNormal = isSet;
    }
    
    public void setNormals(final float x, final float y, final float z) {
        this.normals = new float[] { x, y, z };
    }
    
    public void flipFace() {
        final PositionTextureVertex[] var1 = new PositionTextureVertex[this.vertexPositions.length];
        for (int var2 = 0; var2 < this.vertexPositions.length; ++var2) {
            var1[var2] = this.vertexPositions[this.vertexPositions.length - var2 - 1];
        }
        this.vertexPositions = var1;
    }
    
    public void setNormals(final ArrayList<Vec3> vec) {
        this.iNormals = vec;
    }
    
    public void draw(final TmtTessellator tessellator, final float f) {
        if (this.nVertices == 3) {
            tessellator.func_78371_b(4);
        }
        else if (this.nVertices == 4) {
            tessellator.func_78382_b();
        }
        else {
            tessellator.func_78371_b(9);
        }
        if (this.iNormals.size() == 0) {
            if (this.normals.length == 3) {
                if (this.invertNormal) {
                    tessellator.func_78375_b(-this.normals[0], -this.normals[1], -this.normals[2]);
                }
                else {
                    tessellator.func_78375_b(this.normals[0], this.normals[1], this.normals[2]);
                }
            }
            else {
                if (this.vertexPositions.length < 3) {
                    return;
                }
                final Vec3 Vec3 = this.vertexPositions[1].field_78243_a.func_72444_a(this.vertexPositions[0].field_78243_a);
                final Vec3 Vec4 = this.vertexPositions[1].field_78243_a.func_72444_a(this.vertexPositions[2].field_78243_a);
                final Vec3 Vec5 = Vec4.func_72431_c(Vec3).func_72432_b();
                if (this.invertNormal) {
                    tessellator.func_78375_b(-(float)Vec5.field_72450_a, -(float)Vec5.field_72448_b, -(float)Vec5.field_72449_c);
                }
                else {
                    tessellator.func_78375_b((float)Vec5.field_72450_a, (float)Vec5.field_72448_b, (float)Vec5.field_72449_c);
                }
            }
        }
        for (int i = 0; i < this.nVertices; ++i) {
            final PositionTextureVertex positionTexturevertex = this.vertexPositions[i];
            if (positionTexturevertex instanceof PositionTransformVertex) {
                ((PositionTransformVertex)positionTexturevertex).setTransformation();
            }
            if (i < this.iNormals.size()) {
                if (this.invertNormal) {
                    tessellator.func_78375_b(-(float)this.iNormals.get(i).field_72450_a, -(float)this.iNormals.get(i).field_72448_b, -(float)this.iNormals.get(i).field_72449_c);
                }
                else {
                    tessellator.func_78375_b((float)this.iNormals.get(i).field_72450_a, (float)this.iNormals.get(i).field_72448_b, (float)this.iNormals.get(i).field_72449_c);
                }
            }
            tessellator.addVertexWithUVW((float)positionTexturevertex.field_78243_a.field_72450_a * f, (float)positionTexturevertex.field_78243_a.field_72448_b * f, (float)positionTexturevertex.field_78243_a.field_72449_c * f, positionTexturevertex.field_78241_b, positionTexturevertex.field_78242_c, positionTexturevertex.texturePositionW);
        }
        tessellator.func_78381_a();
    }
}
