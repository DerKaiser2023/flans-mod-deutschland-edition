// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;

public class AnimTankTrack
{
    public ArrayList<Vector3f> points;
    public float trackLinkLength;
    
    public AnimTankTrack(final ArrayList<Vector3f> trackPoints, final float linkLength) {
        this.points = new ArrayList<Vector3f>();
        this.trackLinkLength = 0.0f;
        this.points = trackPoints;
        this.trackLinkLength = linkLength;
    }
    
    public void setLinkLength(final float length) {
        this.trackLinkLength = length;
    }
    
    public float distBetweenPoints(final Vector3f p1, final Vector3f p2) {
        final float x = p1.x - p2.x;
        final float y = p1.y - p2.y;
        final float distance = (float)Math.sqrt(x * x + y * y);
        return distance;
    }
    
    public float getTrackLength() {
        float length = 0.0f;
        for (int i = 0; i < this.points.size(); ++i) {
            length += this.distBetweenPoints(this.points.get(i), this.points.get((i == 0) ? (this.points.size() - 1) : (i - 1)));
        }
        return length;
    }
    
    public int getTrackPart(final float distance) {
        float length = 0.0f;
        for (int i = 0; i < this.points.size(); ++i) {
            if (length >= distance) {
                return i;
            }
            length += this.distBetweenPoints(this.points.get(i), this.points.get((i == this.points.size() - 1) ? 0 : (i + 1)));
        }
        return 0;
    }
    
    public float getProgressAlongTrackPart(final float distance, final int trackPart) {
        float length = 0.0f;
        final float lastLength = 0.0f;
        for (int i = 0; i < trackPart + 1; ++i) {
            if (i != 0) {
                length += this.distBetweenPoints(this.points.get(i - 1), this.points.get(i));
            }
        }
        return length;
    }
    
    public Vector3f getPositionOnTrack(final float distance) {
        final int trackPart = this.getTrackPart(distance);
        final Vector3f p2 = this.points.get((trackPart == 0) ? (this.points.size() - 1) : (trackPart - 1));
        final Vector3f p3 = this.points.get(trackPart);
        final float partLength = this.distBetweenPoints(p2, p3);
        final float prog = distance - this.getProgressAlongTrackPart(distance, (trackPart == 0) ? (this.points.size() - 1) : (trackPart - 1));
        final float progress = prog / partLength;
        final Vector3f finalPos = new Vector3f(this.lerp(p2.x, p3.x, progress), this.lerp(p2.y, p3.y, progress), this.lerp(p2.z, p3.z, progress));
        return finalPos;
    }
    
    public float lerp(final float a, final float b, final float f) {
        final float result = a + f * (b - a);
        return result;
    }
}
