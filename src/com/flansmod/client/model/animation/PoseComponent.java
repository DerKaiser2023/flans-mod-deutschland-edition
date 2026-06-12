// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.animation;

import com.flansmod.common.vector.Vector3f;

public class PoseComponent
{
    String name;
    Vector3f position;
    Vector3f rotation;
    int speed1;
    int speed2;
    boolean trackPlayerView;
    
    public PoseComponent(final String nam, final Vector3f pos, final Vector3f rot, final int s1, final int s2, final boolean tpv) {
        this.trackPlayerView = false;
        this.name = nam;
        this.position = pos;
        this.rotation = rot;
        this.trackPlayerView = tpv;
        this.speed1 = s1;
        this.speed2 = s2;
    }
}
