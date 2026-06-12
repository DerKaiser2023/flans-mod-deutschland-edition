// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import java.util.ArrayList;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class ModelPoolObjEntry extends ModelPoolEntry
{
    public ModelPoolObjEntry() {
        this.fileExtensions = new String[] { "obj" };
    }
    
    @Override
    public void getModel(final File file) {
        try (final BufferedReader in = new BufferedReader(new FileReader(file))) {
            final ArrayList<PositionTransformVertex> verts = new ArrayList<PositionTransformVertex>();
            final ArrayList<float[]> uvs = new ArrayList<float[]>();
            final ArrayList<float[]> normals = new ArrayList<float[]>();
            final ArrayList<TexturedPolygon> face = new ArrayList<TexturedPolygon>();
            String s;
            while ((s = in.readLine()) != null) {
                if (s.contains("#")) {
                    s = s.substring(0, s.indexOf("#"));
                }
                s = s.trim();
                if (s.equals("")) {
                    continue;
                }
                if (s.startsWith("g ")) {
                    this.setTextureGroup(s.substring(s.indexOf(" ") + 1).trim());
                }
                else if (s.startsWith("v ")) {
                    s = s.substring(s.indexOf(" ") + 1).trim();
                    final float[] v = new float[3];
                    for (int i = 0; i < 3; ++i) {
                        final int ind = s.indexOf(" ");
                        if (ind > -1) {
                            v[i] = Float.parseFloat(s.substring(0, ind));
                        }
                        else {
                            v[i] = Float.parseFloat(s.substring(0));
                        }
                        s = s.substring(s.indexOf(" ") + 1).trim();
                    }
                    final float flt = v[2];
                    v[2] = -v[1];
                    v[1] = flt;
                    verts.add(new PositionTransformVertex(v[0], v[1], v[2], 0.0f, 0.0f));
                }
                else if (s.startsWith("vt ")) {
                    s = s.substring(s.indexOf(" ") + 1).trim();
                    final float[] v = new float[2];
                    for (int i = 0; i < 2; ++i) {
                        final int ind = s.indexOf(" ");
                        if (ind > -1) {
                            v[i] = Float.parseFloat(s.substring(0, ind));
                        }
                        else {
                            v[i] = Float.parseFloat(s.substring(0));
                        }
                        s = s.substring(s.indexOf(" ") + 1).trim();
                    }
                    uvs.add(new float[] { v[0], 1.0f - v[1] });
                }
                else if (s.startsWith("vn ")) {
                    s = s.substring(s.indexOf(" ") + 1).trim();
                    final float[] v = new float[3];
                    for (int i = 0; i < 3; ++i) {
                        final int ind = s.indexOf(" ");
                        if (ind > -1) {
                            v[i] = Float.parseFloat(s.substring(0, ind));
                        }
                        else {
                            v[i] = Float.parseFloat(s.substring(0));
                        }
                        s = s.substring(s.indexOf(" ") + 1).trim();
                    }
                    final float flt = v[2];
                    v[2] = v[1];
                    v[1] = flt;
                    normals.add(new float[] { v[0], v[1], v[2] });
                }
                else {
                    if (!s.startsWith("f ")) {
                        continue;
                    }
                    s = s.substring(s.indexOf(" ") + 1).trim();
                    final ArrayList<PositionTextureVertex> v2 = new ArrayList<PositionTextureVertex>();
                    int finalPhase = 0;
                    final float[] normal = { 0.0f, 0.0f, 0.0f };
                    final ArrayList<Vec3> iNormal = new ArrayList<Vec3>();
                    do {
                        final int ind2 = s.indexOf(" ");
                        String s2 = s;
                        if (ind2 > -1) {
                            s2 = s.substring(0, ind2);
                        }
                        int vInt;
                        float[] curUV;
                        float[] curNormals;
                        if (s2.contains("/")) {
                            final String[] f = s2.split("/");
                            vInt = Integer.parseInt(f[0]) - 1;
                            if (f[1].equals("")) {
                                f[1] = f[0];
                            }
                            final int vtInt = Integer.parseInt(f[1]) - 1;
                            if (uvs.size() > vtInt) {
                                curUV = uvs.get(vtInt);
                            }
                            else {
                                curUV = new float[] { 0.0f, 0.0f };
                            }
                            int vnInt = 0;
                            if (f.length == 3) {
                                if (f[2].equals("")) {
                                    f[2] = f[0];
                                }
                                vnInt = Integer.parseInt(f[2]) - 1;
                            }
                            else {
                                vnInt = Integer.parseInt(f[0]) - 1;
                            }
                            if (normals.size() > vnInt) {
                                curNormals = normals.get(vnInt);
                            }
                            else {
                                curNormals = new float[] { 0.0f, 0.0f, 0.0f };
                            }
                        }
                        else {
                            vInt = Integer.parseInt(s2) - 1;
                            if (uvs.size() > vInt) {
                                curUV = uvs.get(vInt);
                            }
                            else {
                                curUV = new float[] { 0.0f, 0.0f };
                            }
                            if (normals.size() > vInt) {
                                curNormals = normals.get(vInt);
                            }
                            else {
                                curNormals = new float[] { 0.0f, 0.0f, 0.0f };
                            }
                        }
                        iNormal.add(Vec3.func_72443_a((double)curNormals[0], (double)curNormals[1], (double)curNormals[2]));
                        final float[] array = normal;
                        final int n = 0;
                        array[n] += curNormals[0];
                        final float[] array2 = normal;
                        final int n2 = 1;
                        array2[n2] += curNormals[1];
                        final float[] array3 = normal;
                        final int n3 = 2;
                        array3[n3] += curNormals[2];
                        if (vInt < verts.size()) {
                            v2.add(verts.get(vInt).setTexturePosition(curUV[0], curUV[1]));
                            if (verts.get(vInt) instanceof PositionTransformVertex) {
                                verts.get(vInt).addGroup(this.group);
                            }
                        }
                        if (ind2 > -1) {
                            s = s.substring(s.indexOf(" ") + 1).trim();
                        }
                        else {
                            ++finalPhase;
                        }
                    } while (finalPhase < 1);
                    final float d = MathHelper.func_76133_a((double)(normal[0] * normal[0] + normal[1] * normal[1] + normal[2] * normal[2]));
                    final float[] array4 = normal;
                    final int n4 = 0;
                    array4[n4] /= d;
                    final float[] array5 = normal;
                    final int n5 = 1;
                    array5[n5] /= d;
                    final float[] array6 = normal;
                    final int n6 = 2;
                    array6[n6] /= d;
                    final PositionTextureVertex[] vToArr = new PositionTextureVertex[v2.size()];
                    for (int j = 0; j < v2.size(); ++j) {
                        vToArr[j] = v2.get(j);
                    }
                    final TexturedPolygon poly = new TexturedPolygon(vToArr);
                    poly.setNormals(normal[0], normal[1], normal[2]);
                    poly.setNormals(iNormal);
                    face.add(poly);
                    this.texture.addPoly(poly);
                }
            }
            this.vertices = new PositionTransformVertex[verts.size()];
            for (int k = 0; k < verts.size(); ++k) {
                this.vertices[k] = verts.get(k);
            }
            this.faces = new TexturedPolygon[face.size()];
            for (int k = 0; k < face.size(); ++k) {
                this.faces[k] = face.get(k);
            }
            in.close();
        }
        catch (final Throwable t3) {}
    }
}
