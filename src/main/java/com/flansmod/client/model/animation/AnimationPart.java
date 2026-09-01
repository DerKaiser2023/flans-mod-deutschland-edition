// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.animation;

import com.flansmod.common.RotatedAxes;
import java.util.ArrayList;
import com.flansmod.common.vector.Vector3f;

public class AnimationPart
{
    public int type;
    public Vector3f position;
    public Vector3f offset;
    public Vector3f rotation;
    public Vector3f prevPos;
    public Vector3f prevOff;
    public Vector3f prevRot;
    public int parent;
    public boolean hasChildren;
    public ArrayList<AnimationPart> children;
    
    public AnimationPart(final int t, final Vector3f pos, final Vector3f off, final Vector3f rot) {
        this.parent = -1;
        this.hasChildren = false;
        this.children = new ArrayList<AnimationPart>();
        this.type = t;
        this.position = pos;
        this.offset = off;
        this.rotation = rot;
    }
    
    public RotatedAxes rotateToPartAxis(final RotatedAxes rot) {
        rot.rotateLocalRoll(-this.rotation.x);
        rot.rotateLocalYaw(this.rotation.y);
        rot.rotateLocalPitch(-this.rotation.z);
        return rot;
    }
    
    public static final RotatedAxes rotate(final double heading, final double attitude, final double bank, final RotatedAxes rot) {
        final double c1 = Math.cos(heading / 2.0);
        final double s1 = Math.sin(heading / 2.0);
        final double c2 = Math.cos(attitude / 2.0);
        final double s2 = Math.sin(attitude / 2.0);
        final double c3 = Math.cos(bank / 2.0);
        final double s3 = Math.sin(bank / 2.0);
        final double c1c2 = c1 * c2;
        final double s1s2 = s1 * s2;
        final double w = c1c2 * c3 - s1s2 * s3;
        double x = c1c2 * s3 + s1s2 * c3;
        double y = s1 * c2 * c3 + c1 * s2 * s3;
        double z = c1 * s2 * c3 - s1 * c2 * s3;
        final double angle = 2.0 * Math.acos(w);
        double norm = x * x + y * y + z * z;
        if (norm < 0.001) {
            x = 1.0;
            z = (y = 0.0);
        }
        else {
            norm = Math.sqrt(norm);
            x /= norm;
            y /= norm;
            z /= norm;
        }
        rot.rotateLocal((float)angle, new Vector3f(x, y, z));
        return rot;
    }
}
