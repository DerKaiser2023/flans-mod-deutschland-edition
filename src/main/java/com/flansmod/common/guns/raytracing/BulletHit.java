// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.guns.raytracing;

public class BulletHit implements Comparable<BulletHit>
{
    public float intersectTime;
    
    public BulletHit(final float f) {
        this.intersectTime = f;
    }
    
    @Override
    public int compareTo(final BulletHit other) {
        if (this.intersectTime < other.intersectTime) {
            return -1;
        }
        if (this.intersectTime > other.intersectTime) {
            return 1;
        }
        return 0;
    }
}
