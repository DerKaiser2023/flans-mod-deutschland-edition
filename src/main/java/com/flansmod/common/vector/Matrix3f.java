// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.vector;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class Matrix3f
{
    float[][] matrix;
    
    public Matrix3f(final float[][] Matrix) {
        this.matrix = new float[3][3];
        for (int i = 0; i < 3; ++i) {
            System.arraycopy(Matrix[i], 0, this.matrix[i], 0, 3);
        }
    }
    
    public Matrix3f(final float m11, final float m12, final float m13, final float m21, final float m22, final float m23, final float m31, final float m32, final float m33) {
        this.matrix = new float[3][3];
        this.matrix[0][0] = m11;
        this.matrix[0][1] = m12;
        this.matrix[0][2] = m13;
        this.matrix[1][0] = m21;
        this.matrix[1][1] = m22;
        this.matrix[1][2] = m23;
        this.matrix[2][0] = m31;
        this.matrix[2][1] = m32;
        this.matrix[2][2] = m33;
    }
    
    public Matrix3f mult(final Matrix3f m) {
        return multMatrix(this, m);
    }
    
    public Vec3 mult(final Vec3 v) {
        return multVec(this, v);
    }
    
    public static Matrix3f getMatrixRotX(final float r) {
        final float sn = MathHelper.func_76126_a(r);
        final float cs = MathHelper.func_76134_b(r);
        return new Matrix3f(new float[][] { { 1.0f, 0.0f, 0.0f }, { 0.0f, cs, -sn }, { 0.0f, sn, cs } });
    }
    
    public static Matrix3f getMatrixRotY(final float r) {
        final float sn = MathHelper.func_76126_a(r);
        final float cs = MathHelper.func_76134_b(r);
        return new Matrix3f(new float[][] { { cs, 0.0f, sn }, { 0.0f, 1.0f, 0.0f }, { -sn, 0.0f, cs } });
    }
    
    public static Matrix3f getMatrixRotZ(final float r) {
        final float sn = MathHelper.func_76126_a(r);
        final float cs = MathHelper.func_76134_b(r);
        return new Matrix3f(new float[][] { { cs, -sn, 0.0f }, { sn, cs, 0.0f }, { 0.0f, 0.0f, 1.0f } });
    }
    
    public static Vec3 multVec(final Matrix3f m, final Vec3 vec) {
        final float[][] retMat = new float[3][3];
        final float[] retVec = new float[3];
        for (int i = 0; i < 3; ++i) {
            final float[] row = { m.matrix[i][0], m.matrix[i][1], m.matrix[i][2] };
            final float[] column = { (float)vec.field_72450_a, (float)vec.field_72448_b, (float)vec.field_72449_c };
            for (int sm = 0; sm < 3; ++sm) {
                final float[] array = retVec;
                final int n = i;
                array[n] += row[sm] * column[sm];
            }
        }
        return Vec3.func_72443_a((double)retVec[0], (double)retVec[1], (double)retVec[2]);
    }
    
    public static Matrix3f multMatrix(final Matrix3f m1, final Matrix3f m2) {
        final Matrix3f retMat = new Matrix3f(new float[3][3]);
        for (int i = 0; i < 3; ++i) {
            final float[] row = { m1.matrix[i][0], m1.matrix[i][1], m1.matrix[i][2] };
            for (int j = 0; j < 3; ++j) {
                final float[] column = { m2.matrix[0][j], m2.matrix[1][j], m2.matrix[2][j] };
                for (int sm = 0; sm < 3; ++sm) {
                    final float[] array = retMat.matrix[i];
                    final int n = j;
                    array[n] += row[sm] * column[sm];
                }
            }
        }
        return retMat;
    }
}
