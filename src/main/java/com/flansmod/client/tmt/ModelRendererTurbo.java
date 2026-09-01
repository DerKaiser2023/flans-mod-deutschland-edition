// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GLAllocation;
import java.util.Collection;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderManager;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.TexturedQuad;
import net.minecraft.util.Vec3;
import java.util.Arrays;
import java.util.ArrayList;
import net.minecraft.util.MathHelper;
import java.util.HashMap;
import net.minecraft.client.model.ModelBase;
import java.util.List;
import java.util.Map;
import net.minecraft.client.model.ModelRenderer;

public class ModelRendererTurbo extends ModelRenderer
{
    public boolean glow;
    private static float lightmapLastX;
    private static float lightmapLastY;
    private static boolean optifineBreak;
    private PositionTextureVertex[] vertices;
    private TexturedPolygon[] faces;
    private int textureOffsetX;
    private int textureOffsetY;
    private boolean compiled;
    private int displayList;
    private int[] displayListArray;
    private Map<String, TransformGroup> transformGroup;
    private Map<String, TextureGroup> textureGroup;
    private TransformGroup currentGroup;
    private TextureGroup currentTextureGroup;
    public boolean field_78809_i;
    public boolean flip;
    public boolean field_78806_j;
    public boolean field_1402_i;
    public boolean forcedRecompile;
    public boolean useLegacyCompiler;
    public List field_78804_l;
    public List field_78805_m;
    public final String field_78802_n;
    private String defaultTexture;
    public static final int MR_FRONT = 0;
    public static final int MR_BACK = 1;
    public static final int MR_LEFT = 2;
    public static final int MR_RIGHT = 3;
    public static final int MR_TOP = 4;
    public static final int MR_BOTTOM = 5;
    private static final float pi = 3.1415927f;
    
    public ModelRendererTurbo(final ModelBase modelbase, final String s) {
        super(modelbase, s);
        this.glow = false;
        this.flip = false;
        this.compiled = false;
        this.displayList = 0;
        this.field_78809_i = false;
        this.field_78806_j = true;
        this.field_1402_i = false;
        this.vertices = new PositionTextureVertex[0];
        this.faces = new TexturedPolygon[0];
        this.forcedRecompile = false;
        (this.transformGroup = new HashMap<String, TransformGroup>()).put("0", new TransformGroupBone(new Bone(0.0f, 0.0f, 0.0f, 0.0f), 1.0));
        (this.textureGroup = new HashMap<String, TextureGroup>()).put("0", new TextureGroup());
        this.currentTextureGroup = this.textureGroup.get("0");
        this.field_78802_n = s;
        this.defaultTexture = "";
        this.useLegacyCompiler = false;
    }
    
    public ModelRendererTurbo(final ModelBase modelbase) {
        this(modelbase, null);
    }
    
    public ModelRendererTurbo(final ModelBase modelbase, final int textureX, final int textureY) {
        this(modelbase, textureX, textureY, 64, 32);
    }
    
    public ModelRendererTurbo(final ModelBase modelbase, final int textureX, final int textureY, final int textureU, final int textureV) {
        this(modelbase);
        this.textureOffsetX = textureX;
        this.textureOffsetY = textureY;
        this.field_78801_a = (float)textureU;
        this.field_78799_b = (float)textureV;
    }
    
    public void addPolygon(final PositionTextureVertex[] verts) {
        this.copyTo(verts, new TexturedPolygon[] { new TexturedPolygon(verts) });
    }
    
    public void addPolygon(final PositionTextureVertex[] verts, final int[][] uv) {
        try {
            for (int i = 0; i < verts.length; ++i) {
                verts[i] = verts[i].setTexturePosition(uv[i][0] / this.field_78801_a, uv[i][1] / this.field_78799_b);
            }
        }
        finally {
            this.addPolygon(verts);
        }
    }
    
    public void addPolygon(final PositionTextureVertex[] verts, final int u1, final int v1, final int u2, final int v2) {
        this.copyTo(verts, new TexturedPolygon[] { this.addPolygonReturn(verts, u1, v1, u2, v2) });
    }
    
    private TexturedPolygon addPolygonReturn(final PositionTextureVertex[] verts, final int u1, final int v1, final int u2, final int v2, final float q1, final float q2, final float q3, final float q4) {
        if (verts.length < 3) {
            return null;
        }
        final float uOffs = 1.0f / (this.field_78801_a * 10.0f);
        final float vOffs = 1.0f / (this.field_78799_b * 10.0f);
        if (verts.length < 4) {
            float xMin = -1.0f;
            float yMin = -1.0f;
            float xMax = 0.0f;
            float yMax = 0.0f;
            for (final PositionTextureVertex vert : verts) {
                final float xPos = vert.field_78241_b;
                final float yPos = vert.field_78242_c;
                xMax = Math.max(xMax, xPos);
                xMin = ((xMin < -1.0f) ? xPos : Math.min(xMin, xPos));
                yMax = Math.max(yMax, yPos);
                yMin = ((yMin < -1.0f) ? yPos : Math.min(yMin, yPos));
            }
            final float uMin = u1 / this.field_78801_a + uOffs;
            final float vMin = v1 / this.field_78799_b + vOffs;
            final float uSize = (u2 - u1) / this.field_78801_a - uOffs * 2.0f;
            final float vSize = (v2 - v1) / this.field_78799_b - vOffs * 2.0f;
            final float xSize = xMax - xMin;
            final float ySize = yMax - yMin;
            for (int i = 0; i < verts.length; ++i) {
                float xPos2 = verts[i].field_78241_b;
                float yPos2 = verts[i].field_78242_c;
                xPos2 = (xPos2 - xMin) / xSize;
                yPos2 = (yPos2 - yMin) / ySize;
                verts[i] = verts[i].setTexturePosition(uMin + xPos2 * uSize, vMin + yPos2 * vSize);
            }
        }
        else {
            verts[0] = verts[0].setTexturePosition((u2 / this.field_78801_a - uOffs) * q1, (v1 / this.field_78799_b + vOffs) * q1, q1);
            verts[1] = verts[1].setTexturePosition((u1 / this.field_78801_a + uOffs) * q2, (v1 / this.field_78799_b + vOffs) * q2, q2);
            verts[2] = verts[2].setTexturePosition((u1 / this.field_78801_a + uOffs) * q3, (v2 / this.field_78799_b - vOffs) * q3, q3);
            verts[3] = verts[3].setTexturePosition((u2 / this.field_78801_a - uOffs) * q4, (v2 / this.field_78799_b - vOffs) * q4, q4);
        }
        return new TexturedPolygon(verts);
    }
    
    private TexturedPolygon addPolygonReturn(final PositionTextureVertex[] verts, final int u1, final int v1, final int u2, final int v2) {
        if (verts.length < 3) {
            return null;
        }
        final float uOffs = 1.0f / (this.field_78801_a * 10.0f);
        final float vOffs = 1.0f / (this.field_78799_b * 10.0f);
        if (verts.length < 4) {
            float xMin = -1.0f;
            float yMin = -1.0f;
            float xMax = 0.0f;
            float yMax = 0.0f;
            for (final PositionTextureVertex vert : verts) {
                final float xPos = vert.field_78241_b;
                final float yPos = vert.field_78242_c;
                xMax = Math.max(xMax, xPos);
                xMin = ((xMin < -1.0f) ? xPos : Math.min(xMin, xPos));
                yMax = Math.max(yMax, yPos);
                yMin = ((yMin < -1.0f) ? yPos : Math.min(yMin, yPos));
            }
            final float uMin = u1 / this.field_78801_a + uOffs;
            final float vMin = v1 / this.field_78799_b + vOffs;
            final float uSize = (u2 - u1) / this.field_78801_a - uOffs * 2.0f;
            final float vSize = (v2 - v1) / this.field_78799_b - vOffs * 2.0f;
            final float xSize = xMax - xMin;
            final float ySize = yMax - yMin;
            for (int i = 0; i < verts.length; ++i) {
                float xPos2 = verts[i].field_78241_b;
                float yPos2 = verts[i].field_78242_c;
                xPos2 = (xPos2 - xMin) / xSize;
                yPos2 = (yPos2 - yMin) / ySize;
                verts[i] = verts[i].setTexturePosition(uMin + xPos2 * uSize, vMin + yPos2 * vSize);
            }
        }
        else {
            verts[0] = verts[0].setTexturePosition(u2 / this.field_78801_a - uOffs, v1 / this.field_78799_b + vOffs);
            verts[1] = verts[1].setTexturePosition(u1 / this.field_78801_a + uOffs, v1 / this.field_78799_b + vOffs);
            verts[2] = verts[2].setTexturePosition(u1 / this.field_78801_a + uOffs, v2 / this.field_78799_b - vOffs);
            verts[3] = verts[3].setTexturePosition(u2 / this.field_78801_a - uOffs, v2 / this.field_78799_b - vOffs);
        }
        return new TexturedPolygon(verts);
    }
    
    public void addRectShape(final float[] v, final float[] v1, final float[] v2, final float[] v3, final float[] v4, final float[] v5, final float[] v6, final float[] v7, final int w, final int h, final int d) {
        final float[] var1 = { 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f };
        this.addRectShape(v, v1, v2, v3, v4, v5, v6, v7, w, h, d, var1);
    }
    
    public void addRectShape(final float[] v, final float[] v1, final float[] v2, final float[] v3, final float[] v4, final float[] v5, final float[] v6, final float[] v7, final int w, final int h, final int d, final float[] qParam) {
        final PositionTextureVertex[] verts = new PositionTextureVertex[8];
        final TexturedPolygon[] poly = new TexturedPolygon[6];
        final PositionTextureVertex positionTexturevertex = new PositionTextureVertex(v[0], v[1], v[2], 0.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex2 = new PositionTextureVertex(v1[0], v1[1], v1[2], 0.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex3 = new PositionTextureVertex(v2[0], v2[1], v2[2], 8.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex4 = new PositionTextureVertex(v3[0], v3[1], v3[2], 8.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex5 = new PositionTextureVertex(v4[0], v4[1], v4[2], 0.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex6 = new PositionTextureVertex(v5[0], v5[1], v5[2], 0.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex7 = new PositionTextureVertex(v6[0], v6[1], v6[2], 8.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex8 = new PositionTextureVertex(v7[0], v7[1], v7[2], 8.0f, 0.0f);
        verts[0] = positionTexturevertex;
        verts[1] = positionTexturevertex2;
        verts[2] = positionTexturevertex3;
        verts[3] = positionTexturevertex4;
        verts[4] = positionTexturevertex5;
        verts[5] = positionTexturevertex6;
        verts[6] = positionTexturevertex7;
        verts[7] = positionTexturevertex8;
        poly[0] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex6, positionTexturevertex2, positionTexturevertex3, positionTexturevertex7 }, this.textureOffsetX + d + w, this.textureOffsetY + d, this.textureOffsetX + d + w + d, this.textureOffsetY + d + h, 1.0f, qParam[7], qParam[10] * qParam[7], qParam[10]);
        poly[1] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex, positionTexturevertex5, positionTexturevertex8, positionTexturevertex4 }, this.textureOffsetX, this.textureOffsetY + d, this.textureOffsetX + d, this.textureOffsetY + d + h, qParam[9] * qParam[6], qParam[9], 1.0f, qParam[6]);
        poly[2] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex6, positionTexturevertex5, positionTexturevertex, positionTexturevertex2 }, this.textureOffsetX + d, this.textureOffsetY, this.textureOffsetX + d + w, this.textureOffsetY + d, 1.0f, qParam[8], qParam[1] * qParam[8], qParam[1]);
        poly[3] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex3, positionTexturevertex4, positionTexturevertex8, positionTexturevertex7 }, this.textureOffsetX + d + w, this.textureOffsetY, this.textureOffsetX + d + w + w, this.textureOffsetY + d, qParam[3], qParam[3] * qParam[11], qParam[11], 1.0f);
        poly[4] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex2, positionTexturevertex, positionTexturevertex4, positionTexturevertex3 }, this.textureOffsetX + d, this.textureOffsetY + d, this.textureOffsetX + d + w, this.textureOffsetY + d + h, qParam[0], qParam[0] * qParam[4], qParam[4], 1.0f);
        poly[5] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex5, positionTexturevertex6, positionTexturevertex7, positionTexturevertex8 }, this.textureOffsetX + d + w + d, this.textureOffsetY + d, this.textureOffsetX + d + w + d + w, this.textureOffsetY + d + h, qParam[2] * qParam[5], qParam[2], 1.0f, qParam[5]);
        if (this.field_78809_i ^ this.flip) {
            for (final TexturedPolygon aPoly : poly) {
                aPoly.flipFace();
            }
        }
        this.copyTo(verts, poly);
    }
    
    public ModelRendererTurbo addBox(final float x, final float y, final float z, final int w, final int h, final int d) {
        this.func_78790_a(x, y, z, w, h, d, 0.0f);
        return this;
    }
    
    public void func_78790_a(final float x, final float y, final float z, final int w, final int h, final int d, final float expansion) {
        this.addBox(x, y, z, w, h, d, expansion, 1.0f);
    }
    
    public void addBox(float x, float y, float z, final int w, final int h, final int d, final float expansion, final float scale) {
        final float scaleX = w * scale;
        final float scaleY = h * scale;
        final float scaleZ = d * scale;
        float x2 = x + scaleX;
        float y2 = y + scaleY;
        float z2 = z + scaleZ;
        final float expX = expansion + scaleX - w;
        final float expY = expansion + scaleY - h;
        final float expZ = expansion + scaleZ - d;
        x -= expX;
        y -= expY;
        z -= expZ;
        x2 += expansion;
        y2 += expansion;
        z2 += expansion;
        if (this.field_78809_i) {
            final float xTemp = x2;
            x2 = x;
            x = xTemp;
        }
        final float[] v = { x, y, z };
        final float[] v2 = { x2, y, z };
        final float[] v3 = { x2, y2, z };
        final float[] v4 = { x, y2, z };
        final float[] v5 = { x, y, z2 };
        final float[] v6 = { x2, y, z2 };
        final float[] v7 = { x2, y2, z2 };
        final float[] v8 = { x, y2, z2 };
        this.addRectShape(v, v2, v3, v4, v5, v6, v7, v8, w, h, d);
    }
    
    public void addTrapezoid(float x, float y, float z, final int w, final int h, final int d, final float scale, final float bottomScale, final int dir) {
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;
        final int m = this.field_78809_i ? -1 : 1;
        if (this.field_78809_i) {
            final float f7 = f4;
            f4 = x;
            x = f7;
        }
        final float[] v = { x, y, z };
        final float[] v2 = { f4, y, z };
        final float[] v3 = { f4, f5, z };
        final float[] v4 = { x, f5, z };
        final float[] v5 = { x, y, f6 };
        final float[] v6 = { f4, y, f6 };
        final float[] v7 = { f4, f5, f6 };
        final float[] v8 = { x, f5, f6 };
        switch (dir) {
            case 3: {
                final float[] array = v;
                final int n = 1;
                array[n] -= bottomScale;
                final float[] array2 = v;
                final int n2 = 2;
                array2[n2] -= bottomScale;
                final float[] array3 = v4;
                final int n3 = 1;
                array3[n3] += bottomScale;
                final float[] array4 = v4;
                final int n4 = 2;
                array4[n4] -= bottomScale;
                final float[] array5 = v5;
                final int n5 = 1;
                array5[n5] -= bottomScale;
                final float[] array6 = v5;
                final int n6 = 2;
                array6[n6] += bottomScale;
                final float[] array7 = v8;
                final int n7 = 1;
                array7[n7] += bottomScale;
                final float[] array8 = v8;
                final int n8 = 2;
                array8[n8] += bottomScale;
                break;
            }
            case 2: {
                final float[] array9 = v2;
                final int n9 = 1;
                array9[n9] -= bottomScale;
                final float[] array10 = v2;
                final int n10 = 2;
                array10[n10] -= bottomScale;
                final float[] array11 = v3;
                final int n11 = 1;
                array11[n11] += bottomScale;
                final float[] array12 = v3;
                final int n12 = 2;
                array12[n12] -= bottomScale;
                final float[] array13 = v6;
                final int n13 = 1;
                array13[n13] -= bottomScale;
                final float[] array14 = v6;
                final int n14 = 2;
                array14[n14] += bottomScale;
                final float[] array15 = v7;
                final int n15 = 1;
                array15[n15] += bottomScale;
                final float[] array16 = v7;
                final int n16 = 2;
                array16[n16] += bottomScale;
                break;
            }
            case 0: {
                final float[] array17 = v;
                final int n17 = 0;
                array17[n17] -= m * bottomScale;
                final float[] array18 = v;
                final int n18 = 1;
                array18[n18] -= bottomScale;
                final float[] array19 = v2;
                final int n19 = 0;
                array19[n19] += m * bottomScale;
                final float[] array20 = v2;
                final int n20 = 1;
                array20[n20] -= bottomScale;
                final float[] array21 = v3;
                final int n21 = 0;
                array21[n21] += m * bottomScale;
                final float[] array22 = v3;
                final int n22 = 1;
                array22[n22] += bottomScale;
                final float[] array23 = v4;
                final int n23 = 0;
                array23[n23] -= m * bottomScale;
                final float[] array24 = v4;
                final int n24 = 1;
                array24[n24] += bottomScale;
                break;
            }
            case 1: {
                final float[] array25 = v5;
                final int n25 = 0;
                array25[n25] -= m * bottomScale;
                final float[] array26 = v5;
                final int n26 = 1;
                array26[n26] -= bottomScale;
                final float[] array27 = v6;
                final int n27 = 0;
                array27[n27] += m * bottomScale;
                final float[] array28 = v6;
                final int n28 = 1;
                array28[n28] -= bottomScale;
                final float[] array29 = v7;
                final int n29 = 0;
                array29[n29] += m * bottomScale;
                final float[] array30 = v7;
                final int n30 = 1;
                array30[n30] += bottomScale;
                final float[] array31 = v8;
                final int n31 = 0;
                array31[n31] -= m * bottomScale;
                final float[] array32 = v8;
                final int n32 = 1;
                array32[n32] += bottomScale;
                break;
            }
            case 4: {
                final float[] array33 = v;
                final int n33 = 0;
                array33[n33] -= m * bottomScale;
                final float[] array34 = v;
                final int n34 = 2;
                array34[n34] -= bottomScale;
                final float[] array35 = v2;
                final int n35 = 0;
                array35[n35] += m * bottomScale;
                final float[] array36 = v2;
                final int n36 = 2;
                array36[n36] -= bottomScale;
                final float[] array37 = v5;
                final int n37 = 0;
                array37[n37] -= m * bottomScale;
                final float[] array38 = v5;
                final int n38 = 2;
                array38[n38] += bottomScale;
                final float[] array39 = v6;
                final int n39 = 0;
                array39[n39] += m * bottomScale;
                final float[] array40 = v6;
                final int n40 = 2;
                array40[n40] += bottomScale;
                break;
            }
            case 5: {
                final float[] array41 = v3;
                final int n41 = 0;
                array41[n41] += m * bottomScale;
                final float[] array42 = v3;
                final int n42 = 2;
                array42[n42] -= bottomScale;
                final float[] array43 = v4;
                final int n43 = 0;
                array43[n43] -= m * bottomScale;
                final float[] array44 = v4;
                final int n44 = 2;
                array44[n44] -= bottomScale;
                final float[] array45 = v7;
                final int n45 = 0;
                array45[n45] += m * bottomScale;
                final float[] array46 = v7;
                final int n46 = 2;
                array46[n46] += bottomScale;
                final float[] array47 = v8;
                final int n47 = 0;
                array47[n47] -= m * bottomScale;
                final float[] array48 = v8;
                final int n48 = 2;
                array48[n48] += bottomScale;
                break;
            }
        }
        final float[] qValues = { Math.abs((v[0] - v2[0]) / (v4[0] - v3[0])), Math.abs((v[0] - v2[0]) / (v5[0] - v6[0])), Math.abs((v5[0] - v6[0]) / (v8[0] - v7[0])), Math.abs((v4[0] - v3[0]) / (v8[0] - v7[0])), Math.abs((v[1] - v4[1]) / (v2[1] - v3[1])), Math.abs((v5[1] - v8[1]) / (v6[1] - v7[1])), Math.abs((v[1] - v4[1]) / (v5[1] - v8[1])), Math.abs((v2[1] - v3[1]) / (v6[1] - v7[1])), Math.abs((v[2] - v5[2]) / (v2[2] - v6[2])), Math.abs((v[2] - v5[2]) / (v4[2] - v8[2])), Math.abs((v2[2] - v6[2]) / (v3[2] - v7[2])), Math.abs((v4[2] - v8[2]) / (v3[2] - v7[2])) };
        this.addRectShape(v, v2, v3, v4, v5, v6, v7, v8, w, h, d);
    }
    
    public void addFlexBox(float x, float y, float z, final int w, final int h, final int d, final float scale, final float bScale1, final float bScale2, final float bScale3, final float bScale4, final int dir) {
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;
        final int m = this.field_78809_i ? -1 : 1;
        if (this.field_78809_i) {
            final float f7 = f4;
            f4 = x;
            x = f7;
        }
        final float[] v = { x, y, z };
        final float[] v2 = { f4, y, z };
        final float[] v3 = { f4, f5, z };
        final float[] v4 = { x, f5, z };
        final float[] v5 = { x, y, f6 };
        final float[] v6 = { f4, y, f6 };
        final float[] v7 = { f4, f5, f6 };
        final float[] v8 = { x, f5, f6 };
        switch (dir) {
            case 3: {
                final float[] array = v;
                final int n = 1;
                array[n] -= bScale1;
                final float[] array2 = v;
                final int n2 = 2;
                array2[n2] -= bScale3;
                final float[] array3 = v4;
                final int n3 = 1;
                array3[n3] += bScale2;
                final float[] array4 = v4;
                final int n4 = 2;
                array4[n4] -= bScale3;
                final float[] array5 = v5;
                final int n5 = 1;
                array5[n5] -= bScale1;
                final float[] array6 = v5;
                final int n6 = 2;
                array6[n6] += bScale4;
                final float[] array7 = v8;
                final int n7 = 1;
                array7[n7] += bScale2;
                final float[] array8 = v8;
                final int n8 = 2;
                array8[n8] += bScale4;
                break;
            }
            case 2: {
                final float[] array9 = v2;
                final int n9 = 1;
                array9[n9] -= bScale1;
                final float[] array10 = v2;
                final int n10 = 2;
                array10[n10] -= bScale3;
                final float[] array11 = v3;
                final int n11 = 1;
                array11[n11] += bScale2;
                final float[] array12 = v3;
                final int n12 = 2;
                array12[n12] -= bScale3;
                final float[] array13 = v6;
                final int n13 = 1;
                array13[n13] -= bScale1;
                final float[] array14 = v6;
                final int n14 = 2;
                array14[n14] += bScale4;
                final float[] array15 = v7;
                final int n15 = 1;
                array15[n15] += bScale2;
                final float[] array16 = v7;
                final int n16 = 2;
                array16[n16] += bScale4;
                break;
            }
            case 0: {
                final float[] array17 = v;
                final int n17 = 0;
                array17[n17] -= m * bScale4;
                final float[] array18 = v;
                final int n18 = 1;
                array18[n18] -= bScale1;
                final float[] array19 = v2;
                final int n19 = 0;
                array19[n19] += m * bScale3;
                final float[] array20 = v2;
                final int n20 = 1;
                array20[n20] -= bScale1;
                final float[] array21 = v3;
                final int n21 = 0;
                array21[n21] += m * bScale3;
                final float[] array22 = v3;
                final int n22 = 1;
                array22[n22] += bScale2;
                final float[] array23 = v4;
                final int n23 = 0;
                array23[n23] -= m * bScale4;
                final float[] array24 = v4;
                final int n24 = 1;
                array24[n24] += bScale2;
                break;
            }
            case 1: {
                final float[] array25 = v5;
                final int n25 = 0;
                array25[n25] -= m * bScale4;
                final float[] array26 = v5;
                final int n26 = 1;
                array26[n26] -= bScale1;
                final float[] array27 = v6;
                final int n27 = 0;
                array27[n27] += m * bScale3;
                final float[] array28 = v6;
                final int n28 = 1;
                array28[n28] -= bScale1;
                final float[] array29 = v7;
                final int n29 = 0;
                array29[n29] += m * bScale3;
                final float[] array30 = v7;
                final int n30 = 1;
                array30[n30] += bScale2;
                final float[] array31 = v8;
                final int n31 = 0;
                array31[n31] -= m * bScale4;
                final float[] array32 = v8;
                final int n32 = 1;
                array32[n32] += bScale2;
                break;
            }
            case 4: {
                final float[] array33 = v;
                final int n33 = 0;
                array33[n33] -= m * bScale1;
                final float[] array34 = v;
                final int n34 = 2;
                array34[n34] -= bScale3;
                final float[] array35 = v2;
                final int n35 = 0;
                array35[n35] += m * bScale2;
                final float[] array36 = v2;
                final int n36 = 2;
                array36[n36] -= bScale3;
                final float[] array37 = v5;
                final int n37 = 0;
                array37[n37] -= m * bScale1;
                final float[] array38 = v5;
                final int n38 = 2;
                array38[n38] += bScale4;
                final float[] array39 = v6;
                final int n39 = 0;
                array39[n39] += m * bScale2;
                final float[] array40 = v6;
                final int n40 = 2;
                array40[n40] += bScale4;
                break;
            }
            case 5: {
                final float[] array41 = v3;
                final int n41 = 0;
                array41[n41] += m * bScale2;
                final float[] array42 = v3;
                final int n42 = 2;
                array42[n42] -= bScale3;
                final float[] array43 = v4;
                final int n43 = 0;
                array43[n43] -= m * bScale1;
                final float[] array44 = v4;
                final int n44 = 2;
                array44[n44] -= bScale3;
                final float[] array45 = v7;
                final int n45 = 0;
                array45[n45] += m * bScale2;
                final float[] array46 = v7;
                final int n46 = 2;
                array46[n46] += bScale4;
                final float[] array47 = v8;
                final int n47 = 0;
                array47[n47] -= m * bScale1;
                final float[] array48 = v8;
                final int n48 = 2;
                array48[n48] += bScale4;
                break;
            }
        }
        final float[] qValues = { Math.abs((v[0] - v2[0]) / (v4[0] - v3[0])), Math.abs((v[0] - v2[0]) / (v5[0] - v6[0])), Math.abs((v5[0] - v6[0]) / (v8[0] - v7[0])), Math.abs((v4[0] - v3[0]) / (v8[0] - v7[0])), Math.abs((v[1] - v4[1]) / (v2[1] - v3[1])), Math.abs((v5[1] - v8[1]) / (v6[1] - v7[1])), Math.abs((v[1] - v4[1]) / (v5[1] - v8[1])), Math.abs((v2[1] - v3[1]) / (v6[1] - v7[1])), Math.abs((v[2] - v5[2]) / (v2[2] - v6[2])), Math.abs((v[2] - v5[2]) / (v4[2] - v8[2])), Math.abs((v2[2] - v6[2]) / (v3[2] - v7[2])), Math.abs((v4[2] - v8[2]) / (v3[2] - v7[2])) };
        this.addRectShape(v, v2, v3, v4, v5, v6, v7, v8, w, h, d);
    }
    
    public void addFlexTrapezoid(float x, float y, float z, final int w, final int h, final int d, final float scale, final float bScale1, final float bScale2, final float bScale3, final float bScale4, final float fScale1, final float fScale2, final int dir) {
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;
        final int m = this.field_78809_i ? -1 : 1;
        if (this.field_78809_i) {
            final float f7 = f4;
            f4 = x;
            x = f7;
        }
        final float[] v = { x, y, z };
        final float[] v2 = { f4, y, z };
        final float[] v3 = { f4, f5, z };
        final float[] v4 = { x, f5, z };
        final float[] v5 = { x, y, f6 };
        final float[] v6 = { f4, y, f6 };
        final float[] v7 = { f4, f5, f6 };
        final float[] v8 = { x, f5, f6 };
        switch (dir) {
            case 3: {
                final float[] array = v;
                final int n = 2;
                array[n] -= fScale1;
                final float[] array2 = v2;
                final int n2 = 2;
                array2[n2] -= fScale1;
                final float[] array3 = v5;
                final int n3 = 2;
                array3[n3] += fScale2;
                final float[] array4 = v6;
                final int n4 = 2;
                array4[n4] += fScale2;
                final float[] array5 = v;
                final int n5 = 1;
                array5[n5] -= bScale1;
                final float[] array6 = v;
                final int n6 = 2;
                array6[n6] -= bScale3;
                final float[] array7 = v4;
                final int n7 = 1;
                array7[n7] += bScale2;
                final float[] array8 = v4;
                final int n8 = 2;
                array8[n8] -= bScale3;
                final float[] array9 = v5;
                final int n9 = 1;
                array9[n9] -= bScale1;
                final float[] array10 = v5;
                final int n10 = 2;
                array10[n10] += bScale4;
                final float[] array11 = v8;
                final int n11 = 1;
                array11[n11] += bScale2;
                final float[] array12 = v8;
                final int n12 = 2;
                array12[n12] += bScale4;
                break;
            }
            case 2: {
                final float[] array13 = v;
                final int n13 = 2;
                array13[n13] -= fScale1;
                final float[] array14 = v2;
                final int n14 = 2;
                array14[n14] -= fScale1;
                final float[] array15 = v5;
                final int n15 = 2;
                array15[n15] += fScale2;
                final float[] array16 = v6;
                final int n16 = 2;
                array16[n16] += fScale2;
                final float[] array17 = v2;
                final int n17 = 1;
                array17[n17] -= bScale1;
                final float[] array18 = v2;
                final int n18 = 2;
                array18[n18] -= bScale3;
                final float[] array19 = v3;
                final int n19 = 1;
                array19[n19] += bScale2;
                final float[] array20 = v3;
                final int n20 = 2;
                array20[n20] -= bScale3;
                final float[] array21 = v6;
                final int n21 = 1;
                array21[n21] -= bScale1;
                final float[] array22 = v6;
                final int n22 = 2;
                array22[n22] += bScale4;
                final float[] array23 = v7;
                final int n23 = 1;
                array23[n23] += bScale2;
                final float[] array24 = v7;
                final int n24 = 2;
                array24[n24] += bScale4;
                break;
            }
            case 0: {
                final float[] array25 = v2;
                final int n25 = 1;
                array25[n25] -= fScale1;
                final float[] array26 = v6;
                final int n26 = 1;
                array26[n26] -= fScale1;
                final float[] array27 = v3;
                final int n27 = 1;
                array27[n27] += fScale2;
                final float[] array28 = v7;
                final int n28 = 1;
                array28[n28] += fScale2;
                final float[] array29 = v;
                final int n29 = 0;
                array29[n29] -= m * bScale4;
                final float[] array30 = v;
                final int n30 = 1;
                array30[n30] -= bScale1;
                final float[] array31 = v2;
                final int n31 = 0;
                array31[n31] += m * bScale3;
                final float[] array32 = v2;
                final int n32 = 1;
                array32[n32] -= bScale1;
                final float[] array33 = v3;
                final int n33 = 0;
                array33[n33] += m * bScale3;
                final float[] array34 = v3;
                final int n34 = 1;
                array34[n34] += bScale2;
                final float[] array35 = v4;
                final int n35 = 0;
                array35[n35] -= m * bScale4;
                final float[] array36 = v4;
                final int n36 = 1;
                array36[n36] += bScale2;
                break;
            }
            case 1: {
                final float[] array37 = v2;
                final int n37 = 1;
                array37[n37] -= fScale1;
                final float[] array38 = v6;
                final int n38 = 1;
                array38[n38] -= fScale1;
                final float[] array39 = v3;
                final int n39 = 1;
                array39[n39] += fScale2;
                final float[] array40 = v7;
                final int n40 = 1;
                array40[n40] += fScale2;
                final float[] array41 = v5;
                final int n41 = 0;
                array41[n41] -= m * bScale4;
                final float[] array42 = v5;
                final int n42 = 1;
                array42[n42] -= bScale1;
                final float[] array43 = v6;
                final int n43 = 0;
                array43[n43] += m * bScale3;
                final float[] array44 = v6;
                final int n44 = 1;
                array44[n44] -= bScale1;
                final float[] array45 = v7;
                final int n45 = 0;
                array45[n45] += m * bScale3;
                final float[] array46 = v7;
                final int n46 = 1;
                array46[n46] += bScale2;
                final float[] array47 = v8;
                final int n47 = 0;
                array47[n47] -= m * bScale4;
                final float[] array48 = v8;
                final int n48 = 1;
                array48[n48] += bScale2;
                break;
            }
            case 4: {
                final float[] array49 = v2;
                final int n49 = 2;
                array49[n49] -= fScale1;
                final float[] array50 = v3;
                final int n50 = 2;
                array50[n50] -= fScale1;
                final float[] array51 = v6;
                final int n51 = 2;
                array51[n51] += fScale2;
                final float[] array52 = v7;
                final int n52 = 2;
                array52[n52] += fScale2;
                final float[] array53 = v;
                final int n53 = 0;
                array53[n53] -= m * bScale1;
                final float[] array54 = v;
                final int n54 = 2;
                array54[n54] -= bScale3;
                final float[] array55 = v2;
                final int n55 = 0;
                array55[n55] += m * bScale2;
                final float[] array56 = v2;
                final int n56 = 2;
                array56[n56] -= bScale3;
                final float[] array57 = v5;
                final int n57 = 0;
                array57[n57] -= m * bScale1;
                final float[] array58 = v5;
                final int n58 = 2;
                array58[n58] += bScale4;
                final float[] array59 = v6;
                final int n59 = 0;
                array59[n59] += m * bScale2;
                final float[] array60 = v6;
                final int n60 = 2;
                array60[n60] += bScale4;
                break;
            }
            case 5: {
                final float[] array61 = v2;
                final int n61 = 2;
                array61[n61] -= fScale1;
                final float[] array62 = v3;
                final int n62 = 2;
                array62[n62] -= fScale1;
                final float[] array63 = v6;
                final int n63 = 2;
                array63[n63] += fScale2;
                final float[] array64 = v7;
                final int n64 = 2;
                array64[n64] += fScale2;
                final float[] array65 = v3;
                final int n65 = 0;
                array65[n65] += m * bScale2;
                final float[] array66 = v3;
                final int n66 = 2;
                array66[n66] -= bScale3;
                final float[] array67 = v4;
                final int n67 = 0;
                array67[n67] -= m * bScale1;
                final float[] array68 = v4;
                final int n68 = 2;
                array68[n68] -= bScale3;
                final float[] array69 = v7;
                final int n69 = 0;
                array69[n69] += m * bScale2;
                final float[] array70 = v7;
                final int n70 = 2;
                array70[n70] += bScale4;
                final float[] array71 = v8;
                final int n71 = 0;
                array71[n71] -= m * bScale1;
                final float[] array72 = v8;
                final int n72 = 2;
                array72[n72] += bScale4;
                break;
            }
        }
        final float[] qValues = { Math.abs((v[0] - v2[0]) / (v4[0] - v3[0])), Math.abs((v[0] - v2[0]) / (v5[0] - v6[0])), Math.abs((v5[0] - v6[0]) / (v8[0] - v7[0])), Math.abs((v4[0] - v3[0]) / (v8[0] - v7[0])), Math.abs((v[1] - v4[1]) / (v2[1] - v3[1])), Math.abs((v5[1] - v8[1]) / (v6[1] - v7[1])), Math.abs((v[1] - v4[1]) / (v5[1] - v8[1])), Math.abs((v2[1] - v3[1]) / (v6[1] - v7[1])), Math.abs((v[2] - v5[2]) / (v2[2] - v6[2])), Math.abs((v[2] - v5[2]) / (v4[2] - v8[2])), Math.abs((v2[2] - v6[2]) / (v3[2] - v7[2])), Math.abs((v4[2] - v8[2]) / (v3[2] - v7[2])) };
        this.addRectShape(v, v2, v3, v4, v5, v6, v7, v8, w, h, d);
    }
    
    public void addBox(final float x, final float y, final float z, float w, float h, float d) {
        final int rw = MathHelper.func_76123_f(w);
        final int rh = MathHelper.func_76123_f(h);
        final int rd = MathHelper.func_76123_f(d);
        w -= rw;
        h -= rh;
        d -= rd;
        this.addShapeBox(x, y, z, rw, rh, rd, 0.0f, 0.0f, 0.0f, 0.0f, w, 0.0f, 0.0f, w, 0.0f, d, 0.0f, 0.0f, d, 0.0f, h, 0.0f, w, h, 0.0f, w, h, d, 0.0f, h, d);
    }
    
    public void addShapeBox(float x, float y, float z, final int w, final int h, final int d, final float scale, final float x0, final float y0, final float z0, final float x1, final float y1, final float z1, final float x2, final float y2, final float z2, final float x3, final float y3, final float z3, final float x4, final float y4, final float z4, final float x5, final float y5, final float z5, final float x6, final float y6, final float z6, final float x7, final float y7, final float z7) {
        float f4 = x + w;
        float f5 = y + h;
        float f6 = z + d;
        x -= scale;
        y -= scale;
        z -= scale;
        f4 += scale;
        f5 += scale;
        f6 += scale;
        final int m = this.field_78809_i ? -1 : 1;
        if (this.field_78809_i) {
            final float f7 = f4;
            f4 = x;
            x = f7;
        }
        final float[] v = { x - x0, y - y0, z - z0 };
        final float[] v2 = { f4 + x1, y - y1, z - z1 };
        final float[] v3 = { f4 + x5, f5 + y5, z - z5 };
        final float[] v4 = { x - x4, f5 + y4, z - z4 };
        final float[] v5 = { x - x3, y - y3, f6 + z3 };
        final float[] v6 = { f4 + x2, y - y2, f6 + z2 };
        final float[] v7 = { f4 + x6, f5 + y6, f6 + z6 };
        final float[] v8 = { x - x7, f5 + y7, f6 + z7 };
        final float[] qValues = { Math.abs((v[0] - v2[0]) / (v4[0] - v3[0])), Math.abs((v[0] - v2[0]) / (v5[0] - v6[0])), Math.abs((v5[0] - v6[0]) / (v8[0] - v7[0])), Math.abs((v4[0] - v3[0]) / (v8[0] - v7[0])), Math.abs((v[1] - v4[1]) / (v2[1] - v3[1])), Math.abs((v5[1] - v8[1]) / (v6[1] - v7[1])), Math.abs((v[1] - v4[1]) / (v5[1] - v8[1])), Math.abs((v2[1] - v3[1]) / (v6[1] - v7[1])), Math.abs((v[2] - v5[2]) / (v2[2] - v6[2])), Math.abs((v[2] - v5[2]) / (v4[2] - v8[2])), Math.abs((v2[2] - v6[2]) / (v3[2] - v7[2])), Math.abs((v4[2] - v8[2]) / (v3[2] - v7[2])) };
        this.addRectShape(v, v2, v3, v4, v5, v6, v7, v8, w, h, d);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Coord2D[] coordinates, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction) {
        this.addShape3D(x, y, z, coordinates, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Coord2D[] coordinates, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction, final float[] faceLengths) {
        this.addShape3D(x, y, z, new Shape2D(coordinates), depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, faceLengths);
    }
    
    public void addShape3D(final float x, final float y, final float z, final ArrayList<Coord2D> coordinates, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction) {
        this.addShape3D(x, y, z, coordinates, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }
    
    public void addShape3D(final float x, final float y, final float z, final ArrayList<Coord2D> coordinates, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction, final float[] faceLengths) {
        this.addShape3D(x, y, z, new Shape2D(coordinates), depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, faceLengths);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Shape2D shape, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction) {
        this.addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, direction, null);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Shape2D shape, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final int direction, final float[] faceLengths) {
        float rotX = 0.0f;
        float rotY = 0.0f;
        final float rotZ = 0.0f;
        switch (direction) {
            case 2: {
                rotY = 1.5707964f;
                break;
            }
            case 3: {
                rotY = -1.5707964f;
                break;
            }
            case 4: {
                rotX = 1.5707964f;
                break;
            }
            case 5: {
                rotX = -1.5707964f;
                break;
            }
            case 0: {
                rotY = 3.1415927f;
                break;
            }
        }
        this.addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, rotX, rotY, rotZ, faceLengths);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Shape2D shape, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final float rotX, final float rotY, final float rotZ) {
        this.addShape3D(x, y, z, shape, depth, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, rotX, rotY, rotZ, null);
    }
    
    public void addShape3D(final float x, final float y, final float z, final Shape2D shape, final float depth, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, final float rotX, final float rotY, final float rotZ, final float[] faceLengths) {
        final Shape3D shape3D = shape.extrude(x, y, z, rotX, rotY, rotZ, depth, this.textureOffsetX, this.textureOffsetY, this.field_78801_a, this.field_78799_b, shapeTextureWidth, shapeTextureHeight, sideTextureWidth, sideTextureHeight, faceLengths);
        if (this.flip) {
            for (int idx = 0; idx < shape3D.faces.length; ++idx) {
                shape3D.faces[idx].flipFace();
            }
        }
        this.copyTo(shape3D.vertices, shape3D.faces);
    }
    
    public void addPixel(final float x, final float y, final float z, final float width, final float height, final float length) {
        this.addPixel(x, y, z, new float[] { width, height, length }, this.textureOffsetX, this.textureOffsetY);
    }
    
    public void addPixel(final float x, final float y, final float z, final float[] scale, final int w, final int h) {
        final PositionTextureVertex[] verts = new PositionTextureVertex[8];
        final TexturedPolygon[] poly = new TexturedPolygon[6];
        final float x2 = x + scale[0];
        final float y2 = y + scale[1];
        final float z2 = z + scale[2];
        final float[] f = { x, y, z };
        final float[] f2 = { x2, y, z };
        final float[] f3 = { x2, y2, z };
        final float[] f4 = { x, y2, z };
        final float[] f5 = { x, y, z2 };
        final float[] f6 = { x2, y, z2 };
        final float[] f7 = { x2, y2, z2 };
        final float[] f8 = { x, y2, z2 };
        final PositionTextureVertex positionTexturevertex = new PositionTextureVertex(f[0], f[1], f[2], 0.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex2 = new PositionTextureVertex(f2[0], f2[1], f2[2], 0.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex3 = new PositionTextureVertex(f3[0], f3[1], f3[2], 8.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex4 = new PositionTextureVertex(f4[0], f4[1], f4[2], 8.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex5 = new PositionTextureVertex(f5[0], f5[1], f5[2], 0.0f, 0.0f);
        final PositionTextureVertex positionTexturevertex6 = new PositionTextureVertex(f6[0], f6[1], f6[2], 0.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex7 = new PositionTextureVertex(f7[0], f7[1], f7[2], 8.0f, 8.0f);
        final PositionTextureVertex positionTexturevertex8 = new PositionTextureVertex(f8[0], f8[1], f8[2], 8.0f, 0.0f);
        verts[0] = positionTexturevertex;
        verts[1] = positionTexturevertex2;
        verts[2] = positionTexturevertex3;
        verts[3] = positionTexturevertex4;
        verts[4] = positionTexturevertex5;
        verts[5] = positionTexturevertex6;
        verts[6] = positionTexturevertex7;
        verts[7] = positionTexturevertex8;
        poly[0] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex6, positionTexturevertex2, positionTexturevertex3, positionTexturevertex7 }, w, h, w + 1, h + 1);
        poly[1] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex, positionTexturevertex5, positionTexturevertex8, positionTexturevertex4 }, w, h, w + 1, h + 1);
        poly[2] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex6, positionTexturevertex5, positionTexturevertex, positionTexturevertex2 }, w, h, w + 1, h + 1);
        poly[3] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex3, positionTexturevertex4, positionTexturevertex8, positionTexturevertex7 }, w, h, w + 1, h + 1);
        poly[4] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex2, positionTexturevertex, positionTexturevertex4, positionTexturevertex3 }, w, h, w + 1, h + 1);
        poly[5] = this.addPolygonReturn(new PositionTextureVertex[] { positionTexturevertex5, positionTexturevertex6, positionTexturevertex7, positionTexturevertex8 }, w, h, w + 1, h + 1);
        this.copyTo(verts, poly);
    }
    
    public void addSprite(final float x, final float y, final float z, final int w, final int h, final float expansion) {
        this.addSprite(x, y, z, w, h, 1, false, false, false, false, false, expansion);
    }
    
    public void addSprite(final float x, final float y, final float z, final int w, final int h, final boolean rotX, final boolean rotY, final boolean rotZ, final boolean mirrorX, final boolean mirrorY, final float expansion) {
        this.addSprite(x, y, z, w, h, 1, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }
    
    public void addSprite(final float x, final float y, final float z, final int w, final int h, final int d, final boolean rotX, final boolean rotY, final boolean rotZ, final boolean mirrorX, final boolean mirrorY, final float expansion) {
        this.addSprite(x, y, z, w, h, d, 1.0f, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }
    
    public void addSprite(final float x, final float y, final float z, final int w, final int h, final int d, final float pixelScale, final boolean rotX, final boolean rotY, final boolean rotZ, final boolean mirrorX, final boolean mirrorY, final float expansion) {
        final String[] mask = new String[h];
        final char[] str = new char[w];
        Arrays.fill(str, '1');
        Arrays.fill(mask, new String(str));
        this.addSprite(x, y, z, mask, d, pixelScale, rotX, rotY, rotZ, mirrorX, mirrorY, expansion);
    }
    
    public void addSprite(final float x, final float y, final float z, final String[] mask, final int d, final float pixelScale, final boolean rotX, final boolean rotY, final boolean rotZ, final boolean mirrorX, final boolean mirrorY, final float expansion) {
        final int w = mask[0].length();
        final int h = mask.length;
        final float x2 = x - expansion;
        final float y2 = y - expansion;
        final float z2 = z - expansion;
        int wDir = 0;
        int hDir = 0;
        int dDir = 0;
        final float wScale = 1.0f + expansion / (w * pixelScale);
        final float hScale = 1.0f + expansion / (h * pixelScale);
        if (!rotX) {
            if (!rotY) {
                if (!rotZ) {
                    wDir = 0;
                    hDir = 1;
                    dDir = 2;
                }
                else {
                    wDir = 1;
                    hDir = 0;
                    dDir = 2;
                }
            }
            else if (!rotZ) {
                wDir = 2;
                hDir = 1;
                dDir = 0;
            }
            else {
                wDir = 2;
                hDir = 0;
                dDir = 1;
            }
        }
        else if (!rotY) {
            if (!rotZ) {
                wDir = 0;
                hDir = 2;
                dDir = 1;
            }
            else {
                wDir = 1;
                hDir = 2;
                dDir = 0;
            }
        }
        else if (!rotZ) {
            wDir = 2;
            hDir = 0;
            dDir = 1;
        }
        else {
            wDir = 2;
            hDir = 1;
            dDir = 0;
        }
        final int texStartX = this.textureOffsetX + (mirrorX ? (w - 1) : 0);
        final int texStartY = this.textureOffsetY + (mirrorY ? (h - 1) : 0);
        final int texDirX = mirrorX ? -1 : 1;
        final int texDirY = mirrorY ? -1 : 1;
        final float wVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2.0f, 0, 1, wDir, 1, 1);
        final float hVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2.0f, 0, 1, hDir, 1, 1);
        final float dVoxSize = getPixelSize(wScale, hScale, d * pixelScale + expansion * 2.0f, 0, 1, dDir, 1, 1);
        for (int i = 0; i < w; ++i) {
            for (int j = 0; j < h; ++j) {
                if (mask[j].charAt(i) == '1') {
                    this.addPixel(x2 + getPixelSize(wScale, hScale, 0.0f, wDir, hDir, 0, i, j), y2 + getPixelSize(wScale, hScale, 0.0f, wDir, hDir, 1, i, j), z2 + getPixelSize(wScale, hScale, 0.0f, wDir, hDir, 2, i, j), new float[] { wVoxSize, hVoxSize, dVoxSize }, texStartX + texDirX * i, texStartY + texDirY * j);
                }
            }
        }
    }
    
    private static float getPixelSize(final float wScale, final float hScale, final float dScale, final int wDir, final int hDir, final int checkDir, final int texPosX, final int texPosY) {
        return (wDir == checkDir) ? (wScale * texPosX) : ((hDir == checkDir) ? (hScale * texPosY) : dScale);
    }
    
    public void addSphere(final float x, final float y, final float z, final float r, int segs, int rings, final int textureW, final int textureH) {
        if (segs < 3) {
            segs = 3;
        }
        ++rings;
        final PositionTextureVertex[] tempVerts = new PositionTextureVertex[segs * (rings - 1) + 2];
        final TexturedPolygon[] poly = new TexturedPolygon[segs * rings];
        tempVerts[0] = new PositionTextureVertex(x, y - r, z, 0.0f, 0.0f);
        tempVerts[tempVerts.length - 1] = new PositionTextureVertex(x, y + r, z, 0.0f, 0.0f);
        final float uOffs = 1.0f / (this.field_78801_a * 10.0f);
        final float vOffs = 1.0f / (this.field_78799_b * 10.0f);
        final float texW = textureW / this.field_78801_a - 2.0f * uOffs;
        final float texH = textureH / this.field_78799_b - 2.0f * vOffs;
        final float segW = texW / segs;
        final float segH = texH / rings;
        final float startU = this.textureOffsetX / this.field_78801_a;
        final float startV = this.textureOffsetY / this.field_78799_b;
        int currentFace = 0;
        for (int j = 1; j < rings; ++j) {
            for (int i = 0; i < segs; ++i) {
                final float yWidth = MathHelper.func_76134_b(-1.5707964f + 3.1415927f / rings * j);
                final float yHeight = MathHelper.func_76126_a(-1.5707964f + 3.1415927f / rings * j);
                final float xSize = MathHelper.func_76126_a(3.1415927f / segs * i * 2.0f + 3.1415927f) * yWidth;
                final float zSize = -MathHelper.func_76134_b(3.1415927f / segs * i * 2.0f + 3.1415927f) * yWidth;
                final int curVert = 1 + i + segs * (j - 1);
                tempVerts[curVert] = new PositionTextureVertex(x + xSize * r, y + yHeight * r, z + zSize * r, 0.0f, 0.0f);
                if (i > 0) {
                    PositionTextureVertex[] verts;
                    if (j == 1) {
                        verts = new PositionTextureVertex[] { tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j), tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j), tempVerts[0].setTexturePosition(startU + segW * (i - 1), startV), tempVerts[0].setTexturePosition(startU + segW + segW * i, startV) };
                    }
                    else {
                        verts = new PositionTextureVertex[] { tempVerts[curVert].setTexturePosition(startU + segW * i, startV + segH * j), tempVerts[curVert - 1].setTexturePosition(startU + segW * (i - 1), startV + segH * j), tempVerts[curVert - 1 - segs].setTexturePosition(startU + segW * (i - 1), startV + segH * (j - 1)), tempVerts[curVert - segs].setTexturePosition(startU + segW * i, startV + segH * (j - 1)) };
                    }
                    poly[currentFace] = new TexturedPolygon(verts);
                    ++currentFace;
                }
            }
            PositionTextureVertex[] verts2;
            if (j == 1) {
                verts2 = new PositionTextureVertex[] { tempVerts[1].setTexturePosition(startU + segW * segs, startV + segH * j), tempVerts[segs].setTexturePosition(startU + segW * (segs - 1), startV + segH * j), tempVerts[0].setTexturePosition(startU + segW * (segs - 1), startV), tempVerts[0].setTexturePosition(startU + segW * segs, startV) };
            }
            else {
                verts2 = new PositionTextureVertex[] { tempVerts[1 + segs * (j - 1)].setTexturePosition(startU + texW, startV + segH * j), tempVerts[segs * (j - 1) + segs].setTexturePosition(startU + texW - segW, startV + segH * j), tempVerts[segs * (j - 1)].setTexturePosition(startU + texW - segW, startV + segH * (j - 1)), tempVerts[1 + segs * (j - 1) - segs].setTexturePosition(startU + texW, startV + segH * (j - 1)) };
            }
            poly[currentFace] = new TexturedPolygon(verts2);
            ++currentFace;
        }
        for (int k = 0; k < segs; ++k) {
            final PositionTextureVertex[] verts2 = new PositionTextureVertex[3];
            final int curVert2 = tempVerts.length - (segs + 1);
            verts2[0] = tempVerts[tempVerts.length - 1].setTexturePosition(startU + segW * (k + 0.5f), startV + texH);
            verts2[1] = tempVerts[curVert2 + k].setTexturePosition(startU + segW * k, startV + texH - segH);
            verts2[2] = tempVerts[curVert2 + (k + 1) % segs].setTexturePosition(startU + segW * (k + 1), startV + texH - segH);
            poly[currentFace] = new TexturedPolygon(verts2);
            ++currentFace;
        }
        this.copyTo(tempVerts, poly);
    }
    
    public void addCone(final float x, final float y, final float z, final float radius, final float length, final int segments) {
        this.addCone(x, y, z, radius, length, segments, 1.0f);
    }
    
    public void addCone(final float x, final float y, final float z, final float radius, final float length, final int segments, final float baseScale) {
        this.addCone(x, y, z, radius, length, segments, baseScale, 4);
    }
    
    public void addCone(final float x, final float y, final float z, final float radius, final float length, final int segments, final float baseScale, final int baseDirection) {
        this.addCone(x, y, z, radius, length, segments, baseScale, baseDirection, (int)Math.floor(radius * 2.0f), (int)Math.floor(radius * 2.0f));
    }
    
    public void addCone(final float x, final float y, final float z, final float radius, final float length, final int segments, final float baseScale, final int baseDirection, final int textureCircleDiameterW, final int textureCircleDiameterH) {
        this.addCylinder(x, y, z, radius, length, segments, baseScale, 0.0f, baseDirection, textureCircleDiameterW, textureCircleDiameterH, 1);
    }
    
    public void addCylinder(final float x, final float y, final float z, final float radius, final float length, final int segments) {
        this.addCylinder(x, y, z, radius, length, segments, 1.0f, 1.0f);
    }
    
    public void addCylinder(final float x, final float y, final float z, final float radius, final float length, final int segments, final float baseScale, final float topScale) {
        this.addCylinder(x, y, z, radius, length, segments, baseScale, topScale, 4);
    }
    
    public void addCylinder(final float x, final float y, final float z, final float radius, final float length, final int segments, final float baseScale, final float topScale, final int baseDirection) {
        this.addCylinder(x, y, z, radius, length, segments, baseScale, topScale, baseDirection, (int)Math.floor(radius * 2.0f), (int)Math.floor(radius * 2.0f), (int)Math.floor(length));
    }
    
    public void addCylinder(final float x, final float y, final float z, final float radius, final float length, final int segments, float baseScale, final float topScale, final int baseDirection, final int textureCircleDiameterW, final int textureCircleDiameterH, final int textureH) {
        final boolean dirTop = baseDirection == 4 || baseDirection == 5;
        final boolean dirSide = baseDirection == 3 || baseDirection == 2;
        final boolean dirFront = baseDirection == 0 || baseDirection == 1;
        final boolean dirMirror = baseDirection == 2 || baseDirection == 5 || baseDirection == 1;
        boolean coneBase = baseScale == 0.0f;
        final boolean coneTop = topScale == 0.0f;
        if (coneBase && coneTop) {
            baseScale = 1.0f;
            coneBase = false;
        }
        final PositionTextureVertex[] tempVerts = new PositionTextureVertex[segments * ((coneBase || coneTop) ? 1 : 2) + 2];
        final TexturedPolygon[] poly = new TexturedPolygon[segments * ((coneBase || coneTop) ? 2 : 3)];
        final float xLength = dirSide ? length : 0.0f;
        final float yLength = dirTop ? length : 0.0f;
        final float zLength = dirFront ? length : 0.0f;
        final float xStart = dirMirror ? (x + xLength) : x;
        final float yStart = dirMirror ? (y + yLength) : y;
        final float zStart = dirMirror ? (z + zLength) : z;
        final float xEnd = dirMirror ? x : (x + xLength);
        final float yEnd = dirMirror ? y : (y + yLength);
        final float zEnd = dirMirror ? z : (z + zLength);
        tempVerts[0] = new PositionTextureVertex(xStart, yStart, zStart, 0.0f, 0.0f);
        tempVerts[tempVerts.length - 1] = new PositionTextureVertex(xEnd, yEnd, zEnd, 0.0f, 0.0f);
        float xCur = xStart;
        float yCur = yStart;
        float zCur = zStart;
        float sCur = coneBase ? topScale : baseScale;
        for (int repeat = 0; repeat < ((coneBase || coneTop) ? 1 : 2); ++repeat) {
            for (int index = 0; index < segments; ++index) {
                final float xSize = ((this.field_78809_i ^ dirMirror) ? -1 : 1) * MathHelper.func_76126_a(3.1415927f / segments * index * 2.0f + 3.1415927f) * radius * sCur;
                final float zSize = -MathHelper.func_76134_b(3.1415927f / segments * index * 2.0f + 3.1415927f) * radius * sCur;
                final float xPlace = xCur + (dirSide ? 0.0f : xSize);
                final float yPlace = yCur + (dirTop ? 0.0f : zSize);
                final float zPlace = zCur + (dirSide ? xSize : (dirTop ? zSize : 0.0f));
                tempVerts[1 + index + repeat * segments] = new PositionTextureVertex(xPlace, yPlace, zPlace, 0.0f, 0.0f);
            }
            xCur = xEnd;
            yCur = yEnd;
            zCur = zEnd;
            sCur = topScale;
        }
        final float uScale = 1.0f / this.field_78801_a;
        final float vScale = 1.0f / this.field_78799_b;
        final float uOffset = uScale / 20.0f;
        final float vOffset = vScale / 20.0f;
        final float uCircle = textureCircleDiameterW * uScale;
        final float vCircle = textureCircleDiameterH * vScale;
        final float uWidth = (uCircle * 2.0f - uOffset * 2.0f) / segments;
        final float vHeight = textureH * vScale - uOffset * 2.0f;
        final float uStart = this.textureOffsetX * uScale;
        final float vStart = this.textureOffsetY * vScale;
        for (int index2 = 0; index2 < segments; ++index2) {
            final int index3 = (index2 + 1) % segments;
            final float uSize = MathHelper.func_76126_a(3.1415927f / segments * index2 * 2.0f + (dirTop ? 3.1415927f : 0.0f)) * (0.5f * uCircle - 2.0f * uOffset);
            final float vSize = MathHelper.func_76134_b(3.1415927f / segments * index2 * 2.0f + (dirTop ? 3.1415927f : 0.0f)) * (0.5f * vCircle - 2.0f * vOffset);
            final float uSize2 = MathHelper.func_76126_a(3.1415927f / segments * index3 * 2.0f + (dirTop ? 3.1415927f : 0.0f)) * (0.5f * uCircle - 2.0f * uOffset);
            final float vSize2 = MathHelper.func_76134_b(3.1415927f / segments * index3 * 2.0f + (dirTop ? 3.1415927f : 0.0f)) * (0.5f * vCircle - 2.0f * vOffset);
            PositionTextureVertex[] vert = { tempVerts[0].setTexturePosition(uStart + 0.5f * uCircle, vStart + 0.5f * vCircle), tempVerts[1 + index3].setTexturePosition(uStart + 0.5f * uCircle + uSize2, vStart + 0.5f * vCircle + vSize2), tempVerts[1 + index2].setTexturePosition(uStart + 0.5f * uCircle + uSize, vStart + 0.5f * vCircle + vSize) };
            poly[index2] = new TexturedPolygon(vert);
            if (this.field_78809_i ^ this.flip) {
                poly[index2].flipFace();
            }
            if (!coneBase && !coneTop) {
                vert = new PositionTextureVertex[] { tempVerts[1 + index2].setTexturePosition(uStart + uOffset + uWidth * index2, vStart + vOffset + vCircle), tempVerts[1 + index3].setTexturePosition(uStart + uOffset + uWidth * (index2 + 1), vStart + vOffset + vCircle), tempVerts[1 + segments + index3].setTexturePosition(uStart + uOffset + uWidth * (index2 + 1), vStart + vOffset + vCircle + vHeight), tempVerts[1 + segments + index2].setTexturePosition(uStart + uOffset + uWidth * index2, vStart + vOffset + vCircle + vHeight) };
                poly[index2 + segments] = new TexturedPolygon(vert);
                if (this.field_78809_i ^ this.flip) {
                    poly[index2 + segments].flipFace();
                }
            }
            vert = new PositionTextureVertex[] { tempVerts[tempVerts.length - 1].setTexturePosition(uStart + 1.5f * uCircle, vStart + 0.5f * vCircle), tempVerts[tempVerts.length - 2 - index2].setTexturePosition(uStart + 1.5f * uCircle + uSize2, vStart + 0.5f * vCircle + vSize2), tempVerts[tempVerts.length - (1 + segments) + (segments - index2) % segments].setTexturePosition(uStart + 1.5f * uCircle + uSize, vStart + 0.5f * vCircle + vSize) };
            poly[poly.length - segments + index2] = new TexturedPolygon(vert);
            if (this.field_78809_i ^ this.flip) {
                poly[poly.length - segments + index2].flipFace();
            }
        }
        this.copyTo(tempVerts, poly);
    }
    
    public void addObj(final String file) {
        this.addModel(file, ModelPool.OBJ);
    }
    
    public void addModel(final String file, final Class modelFormat) {
        final ModelPoolEntry entry = ModelPool.addFile(file, modelFormat, this.transformGroup, this.textureGroup);
        if (entry == null) {
            return;
        }
        final PositionTextureVertex[] verts = Arrays.copyOf(entry.vertices, entry.vertices.length);
        final TexturedPolygon[] poly = Arrays.copyOf(entry.faces, entry.faces.length);
        if (this.flip) {
            for (final TexturedPolygon face : this.faces) {
                face.flipFace();
            }
        }
        this.copyTo(verts, poly, false);
    }
    
    public ModelRendererTurbo setTextureOffset(final int x, final int y) {
        this.textureOffsetX = x;
        this.textureOffsetY = y;
        return this;
    }
    
    public void setPosition(final float x, final float y, final float z) {
        this.field_78800_c = x;
        this.field_78797_d = y;
        this.field_78798_e = z;
    }
    
    public void doMirror(final boolean x, final boolean y, final boolean z) {
        for (final TexturedPolygon face : this.faces) {
            final PositionTextureVertex[] verts = face.vertexPositions;
            for (int j = 0; j < verts.length; ++j) {
                final Vec3 field_78243_a = verts[j].field_78243_a;
                field_78243_a.field_72450_a *= (x ? -1 : 1);
                final Vec3 field_78243_a2 = verts[j].field_78243_a;
                field_78243_a2.field_72448_b *= (y ? -1 : 1);
                final Vec3 field_78243_a3 = verts[j].field_78243_a;
                field_78243_a3.field_72449_c *= (z ? -1 : 1);
            }
            if (x ^ y ^ z) {
                face.flipFace();
            }
        }
    }
    
    public void setMirrored(final boolean isMirrored) {
        this.field_78809_i = isMirrored;
    }
    
    public void setFlipped(final boolean isFlipped) {
        this.flip = isFlipped;
    }
    
    public void clear() {
        this.vertices = new PositionTextureVertex[0];
        this.faces = new TexturedPolygon[0];
        this.transformGroup.clear();
        this.transformGroup.put("0", new TransformGroupBone(new Bone(0.0f, 0.0f, 0.0f, 0.0f), 1.0));
        this.currentGroup = this.transformGroup.get("0");
    }
    
    public void copyTo(final PositionTextureVertex[] verts, final TexturedPolygon[] poly) {
        this.copyTo(verts, poly, true);
    }
    
    public void copyTo(final PositionTextureVertex[] verts, final TexturedPolygon[] poly, final boolean copyGroup) {
        this.vertices = Arrays.copyOf(this.vertices, this.vertices.length + verts.length);
        this.faces = Arrays.copyOf(this.faces, this.faces.length + poly.length);
        for (int idx = 0; idx < verts.length; ++idx) {
            this.vertices[this.vertices.length - verts.length + idx] = verts[idx];
            if (copyGroup && verts[idx] instanceof PositionTransformVertex) {
                ((PositionTransformVertex)verts[idx]).addGroup(this.currentGroup);
            }
        }
        for (int idx = 0; idx < poly.length; ++idx) {
            this.faces[this.faces.length - poly.length + idx] = poly[idx];
            if (copyGroup) {
                this.currentTextureGroup.addPoly(poly[idx]);
            }
        }
    }
    
    public void copyTo(final PositionTextureVertex[] verts, final TexturedQuad[] quad) {
        final TexturedPolygon[] poly = new TexturedPolygon[quad.length];
        for (int idx = 0; idx < quad.length; ++idx) {
            poly[idx] = new TexturedPolygon((PositionTextureVertex[])quad[idx].field_78239_a);
        }
        this.copyTo(verts, poly);
    }
    
    public void setGroup(final String groupName) {
        this.setGroup(groupName, new Bone(0.0f, 0.0f, 0.0f, 0.0f), 1.0);
    }
    
    public void setGroup(final String groupName, final Bone bone, final double weight) {
        if (!this.transformGroup.containsKey(groupName)) {
            this.transformGroup.put(groupName, new TransformGroupBone(bone, weight));
        }
        this.currentGroup = this.transformGroup.get(groupName);
    }
    
    public TransformGroup getGroup() {
        return this.currentGroup;
    }
    
    public TransformGroup getGroup(final String groupName) {
        if (!this.transformGroup.containsKey(groupName)) {
            return null;
        }
        return this.transformGroup.get(groupName);
    }
    
    public void setTextureGroup(final String groupName) {
        if (!this.textureGroup.containsKey(groupName)) {
            this.textureGroup.put(groupName, new TextureGroup());
        }
        this.currentTextureGroup = this.textureGroup.get(groupName);
    }
    
    public TextureGroup getTextureGroup() {
        return this.currentTextureGroup;
    }
    
    public TextureGroup getTextureGroup(final String groupName) {
        if (!this.textureGroup.containsKey(groupName)) {
            return null;
        }
        return this.textureGroup.get(groupName);
    }
    
    public void setGroupTexture(final String s) {
        this.currentTextureGroup.texture = s;
    }
    
    public void setDefaultTexture(final String s) {
        this.defaultTexture = s;
    }
    
    public void func_78785_a(final float worldScale) {
        this.render(worldScale, false);
    }
    
    public void render(final float worldScale, final boolean oldRotateOrder) {
        GL11.glPushMatrix();
        if (this.glow) {
            glowOn();
        }
        GL11.glAlphaFunc(516, 0.001f);
        GL11.glEnable(3042);
        final int srcBlend = GL11.glGetInteger(3041);
        final int dstBlend = GL11.glGetInteger(3040);
        GL11.glBlendFunc(770, 771);
        if (this.field_1402_i) {
            return;
        }
        if (!this.field_78806_j) {
            return;
        }
        if (!this.compiled || this.forcedRecompile) {
            this.compileDisplayList(worldScale);
        }
        if (this.field_78795_f != 0.0f || this.field_78796_g != 0.0f || this.field_78808_h != 0.0f) {
            GL11.glPushMatrix();
            GL11.glTranslatef(this.field_78800_c * worldScale, this.field_78797_d * worldScale, this.field_78798_e * worldScale);
            if (!oldRotateOrder && this.field_78796_g != 0.0f) {
                GL11.glRotatef(this.field_78796_g * 57.29578f, 0.0f, 1.0f, 0.0f);
            }
            if (this.field_78808_h != 0.0f) {
                GL11.glRotatef((oldRotateOrder ? -1 : 1) * this.field_78808_h * 57.29578f, 0.0f, 0.0f, 1.0f);
            }
            if (oldRotateOrder && this.field_78796_g != 0.0f) {
                GL11.glRotatef(-this.field_78796_g * 57.29578f, 0.0f, 1.0f, 0.0f);
            }
            if (this.field_78795_f != 0.0f) {
                GL11.glRotatef(this.field_78795_f * 57.29578f, 1.0f, 0.0f, 0.0f);
            }
            this.callDisplayList();
            if (this.field_78805_m != null) {
                for (final Object childModel : this.field_78805_m) {
                    ((ModelRenderer)childModel).func_78785_a(worldScale);
                }
            }
            GL11.glPopMatrix();
        }
        else if (this.field_78800_c != 0.0f || this.field_78797_d != 0.0f || this.field_78798_e != 0.0f) {
            GL11.glTranslatef(this.field_78800_c * worldScale, this.field_78797_d * worldScale, this.field_78798_e * worldScale);
            this.callDisplayList();
            if (this.field_78805_m != null) {
                for (final Object childModel : this.field_78805_m) {
                    ((ModelRenderer)childModel).func_78785_a(worldScale);
                }
            }
            GL11.glTranslatef(-this.field_78800_c * worldScale, -this.field_78797_d * worldScale, -this.field_78798_e * worldScale);
        }
        else {
            this.callDisplayList();
            if (this.field_78805_m != null) {
                for (final Object childModel : this.field_78805_m) {
                    ((ModelRenderer)childModel).func_78785_a(worldScale);
                }
            }
        }
        if (this.glow) {
            glowOff();
        }
        GL11.glBlendFunc(srcBlend, dstBlend);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public void func_78791_b(final float f) {
        if (this.field_1402_i) {
            return;
        }
        if (!this.field_78806_j) {
            return;
        }
        if (!this.compiled) {
            this.compileDisplayList(f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(this.field_78800_c * f, this.field_78797_d * f, this.field_78798_e * f);
        if (this.field_78796_g != 0.0f) {
            GL11.glRotatef(this.field_78796_g * 57.29578f, 0.0f, 1.0f, 0.0f);
        }
        if (this.field_78795_f != 0.0f) {
            GL11.glRotatef(this.field_78795_f * 57.29578f, 1.0f, 0.0f, 0.0f);
        }
        if (this.field_78808_h != 0.0f) {
            GL11.glRotatef(this.field_78808_h * 57.29578f, 0.0f, 0.0f, 1.0f);
        }
        this.callDisplayList();
        GL11.glPopMatrix();
    }
    
    public void func_78794_c(final float f) {
        if (this.field_1402_i) {
            return;
        }
        if (!this.field_78806_j) {
            return;
        }
        if (!this.compiled || this.forcedRecompile) {
            this.compileDisplayList(f);
        }
        if (this.field_78795_f != 0.0f || this.field_78796_g != 0.0f || this.field_78808_h != 0.0f) {
            GL11.glTranslatef(this.field_78800_c * f, this.field_78797_d * f, this.field_78798_e * f);
            if (this.field_78808_h != 0.0f) {
                GL11.glRotatef(this.field_78808_h * 57.29578f, 0.0f, 0.0f, 1.0f);
            }
            if (this.field_78796_g != 0.0f) {
                GL11.glRotatef(this.field_78796_g * 57.29578f, 0.0f, 1.0f, 0.0f);
            }
            if (this.field_78795_f != 0.0f) {
                GL11.glRotatef(this.field_78795_f * 57.29578f, 1.0f, 0.0f, 0.0f);
            }
        }
        else if (this.field_78800_c != 0.0f || this.field_78797_d != 0.0f || this.field_78798_e != 0.0f) {
            GL11.glTranslatef(this.field_78800_c * f, this.field_78797_d * f, this.field_78798_e * f);
        }
    }
    
    private void callDisplayList() {
        if (this.useLegacyCompiler) {
            GL11.glCallList(this.displayList);
        }
        else {
            final TextureManager renderEngine = RenderManager.field_78727_a.field_78724_e;
            final Collection<TextureGroup> textures = this.textureGroup.values();
            final Iterator<TextureGroup> itr = textures.iterator();
            int i = 0;
            while (itr.hasNext()) {
                final TextureGroup curTexGroup = itr.next();
                curTexGroup.loadTexture();
                GL11.glCallList(this.displayListArray[i]);
                if (!this.defaultTexture.equals("")) {
                    renderEngine.func_110577_a(new ResourceLocation("", this.defaultTexture));
                }
                ++i;
            }
        }
    }
    
    private void compileDisplayList(final float worldScale) {
        if (this.useLegacyCompiler) {
            this.compileLegacyDisplayList(worldScale);
        }
        else {
            final Collection<TextureGroup> textures = this.textureGroup.values();
            final Iterator<TextureGroup> itr = textures.iterator();
            this.displayListArray = new int[this.textureGroup.size()];
            int i = 0;
            while (itr.hasNext()) {
                GL11.glNewList(this.displayListArray[i] = GLAllocation.func_74526_a(1), 4864);
                final TmtTessellator tessellator = TmtTessellator.instance;
                final TextureGroup usedGroup = itr.next();
                for (int j = 0; j < usedGroup.poly.size(); ++j) {
                    usedGroup.poly.get(j).draw(tessellator, worldScale);
                }
                GL11.glEndList();
                ++i;
            }
        }
        this.compiled = true;
    }
    
    private void compileLegacyDisplayList(final float worldScale) {
        GL11.glNewList(this.displayList = GLAllocation.func_74526_a(1), 4864);
        final TmtTessellator tessellator = TmtTessellator.instance;
        for (final TexturedPolygon face : this.faces) {
            face.draw(tessellator, worldScale);
        }
        GL11.glEndList();
    }
    
    public static void glowOn() {
        glowOn(15);
    }
    
    public static void glowOn(final int glow) {
        GL11.glPushAttrib(64);
        try {
            ModelRendererTurbo.lightmapLastX = OpenGlHelper.lastBrightnessX;
            ModelRendererTurbo.lightmapLastY = OpenGlHelper.lastBrightnessY;
        }
        catch (final NoSuchFieldError e) {
            ModelRendererTurbo.optifineBreak = true;
        }
        final float glowRatioX = Math.min(glow / 15.0f * 240.0f + ModelRendererTurbo.lightmapLastX, 240.0f);
        final float glowRatioY = Math.min(glow / 15.0f * 240.0f + ModelRendererTurbo.lightmapLastY, 240.0f);
        if (!ModelRendererTurbo.optifineBreak) {
            OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, glowRatioX, glowRatioY);
        }
    }
    
    public static void glowOff() {
        if (!ModelRendererTurbo.optifineBreak) {
            OpenGlHelper.func_77475_a(OpenGlHelper.field_77476_b, ModelRendererTurbo.lightmapLastX, ModelRendererTurbo.lightmapLastY);
        }
        GL11.glPopAttrib();
    }
    
    static {
        ModelRendererTurbo.optifineBreak = false;
    }
}
