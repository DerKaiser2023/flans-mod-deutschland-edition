// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.animation;

import java.util.Iterator;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;

public class AnimationPose
{
    ArrayList<PoseComponent> parts;
    
    public AnimationPose() {
        this.parts = new ArrayList<PoseComponent>();
    }
    
    public PoseComponent getComponentWithName(final String name) {
        PoseComponent part = new PoseComponent("nope", null, null, 0, 0, false);
        for (final PoseComponent p : this.parts) {
            if (p.name.equals(name)) {
                part = p;
            }
        }
        return part;
    }
}
