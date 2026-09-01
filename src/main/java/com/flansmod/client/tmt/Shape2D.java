// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Shape2D
{
    public ArrayList<Coord2D> coords;
    
    public Shape2D() {
        this.coords = new ArrayList<Coord2D>();
    }
    
    public Shape2D(final Coord2D[] coordArray) {
        Collections.addAll(this.coords = new ArrayList<Coord2D>(), coordArray);
    }
    
    public Shape2D(final ArrayList<Coord2D> coordList) {
        this.coords = coordList;
    }
    
    public Coord2D[] getCoordArray() {
        return (Coord2D[])this.coords.toArray();
    }
    
    public Shape3D extrude(final float x, final float y, final float z, final float rotX, final float rotY, final float rotZ, final float depth, final int u, final int v, final float textureWidth, final float textureHeight, final int shapeTextureWidth, final int shapeTextureHeight, final int sideTextureWidth, final int sideTextureHeight, float[] faceLengths) {
        final PositionTransformVertex[] verts = new PositionTransformVertex[this.coords.size() * 2];
        final PositionTransformVertex[] vertsTop = new PositionTransformVertex[this.coords.size()];
        final PositionTransformVertex[] vertsBottom = new PositionTransformVertex[this.coords.size()];
        final TexturedPolygon[] poly = new TexturedPolygon[this.coords.size() + 2];
        final Vec3 extrudeVector = Vec3.createVectorHelper(0.0, 0.0, (double)depth);
        this.setVectorRotations(extrudeVector, rotX, rotY, rotZ);
        if (faceLengths != null && faceLengths.length < this.coords.size()) {
            faceLengths = null;
        }
        float totalLength = 0.0f;
        for (int idx = 0; idx < this.coords.size(); ++idx) {
            final Coord2D curCoord = this.coords.get(idx);
            final Coord2D nextCoord = this.coords.get((idx + 1) % this.coords.size());
            final float texU1 = (curCoord.uCoord + u) / textureWidth;
            final float texU2 = (shapeTextureWidth * 2 - curCoord.uCoord + u) / textureWidth;
            final float texV = (curCoord.vCoord + v) / textureHeight;
            final Vec3 vecCoord = Vec3.createVectorHelper(curCoord.xCoord, curCoord.yCoord, 0.0);
            this.setVectorRotations(vecCoord, rotX, rotY, rotZ);
            verts[idx] = new PositionTransformVertex(x + (float)vecCoord.xCoord, y + (float)vecCoord.yCoord, z + (float)vecCoord.zCoord, texU1, texV);
            verts[idx + this.coords.size()] = new PositionTransformVertex(x + (float)vecCoord.xCoord - (float)extrudeVector.xCoord, y + (float)vecCoord.yCoord - (float)extrudeVector.yCoord, z + (float)vecCoord.zCoord - (float)extrudeVector.zCoord, texU2, texV);
            vertsTop[idx] = new PositionTransformVertex(verts[idx]);
            vertsBottom[this.coords.size() - idx - 1] = new PositionTransformVertex(verts[idx + this.coords.size()]);
            if (faceLengths != null) {
                totalLength += faceLengths[idx];
            }
            else {
                totalLength += (float)Math.sqrt(Math.pow(curCoord.xCoord - nextCoord.xCoord, 2.0) + Math.pow(curCoord.yCoord - nextCoord.yCoord, 2.0));
            }
        }
        poly[this.coords.size()] = new TexturedPolygon(vertsTop);
        poly[this.coords.size() + 1] = new TexturedPolygon(vertsBottom);
        float currentLengthPosition = totalLength;
        for (int idx2 = 0; idx2 < this.coords.size(); ++idx2) {
            final Coord2D curCoord2 = this.coords.get(idx2);
            final Coord2D nextCoord2 = this.coords.get((idx2 + 1) % this.coords.size());
            float currentLength = (float)Math.sqrt(Math.pow(curCoord2.xCoord - nextCoord2.xCoord, 2.0) + Math.pow(curCoord2.yCoord - nextCoord2.yCoord, 2.0));
            if (faceLengths != null) {
                currentLength = faceLengths[faceLengths.length - idx2 - 1];
            }
            final float ratioPosition = currentLengthPosition / totalLength;
            final float ratioLength = (currentLengthPosition - currentLength) / totalLength;
            final float texU3 = (ratioLength * sideTextureWidth + u) / textureWidth;
            final float texU4 = (ratioPosition * sideTextureWidth + u) / textureWidth;
            final float texV2 = (v + (float)shapeTextureHeight) / textureHeight;
            final float texV3 = (v + (float)shapeTextureHeight + sideTextureHeight) / textureHeight;
            final PositionTransformVertex[] polySide = { new PositionTransformVertex(verts[idx2], texU4, texV2), new PositionTransformVertex(verts[this.coords.size() + idx2], texU4, texV3), new PositionTransformVertex(verts[this.coords.size() + (idx2 + 1) % this.coords.size()], texU3, texV3), new PositionTransformVertex(verts[(idx2 + 1) % this.coords.size()], texU3, texV2) };
            poly[idx2] = new TexturedPolygon(polySide);
            currentLengthPosition -= currentLength;
        }
        return new Shape3D(verts, poly);
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
