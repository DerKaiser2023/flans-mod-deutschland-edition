// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.RotatedAxes;
import com.flansmod.common.vector.Vector3f;

public class AnimTrackLink
{
    public Vector3f position;
    public Vector3f prevPosition;
    public float zRot;
    public float prevZRot;
    public float progress;
    public RotatedAxes rot;
    
    public AnimTrackLink(final float prog) {
        this.zRot = 0.0f;
        this.progress = 0.0f;
        this.progress = prog;
    }
}
