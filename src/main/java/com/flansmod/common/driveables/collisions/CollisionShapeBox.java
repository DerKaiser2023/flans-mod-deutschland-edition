// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables.collisions;

import com.flansmod.common.vector.Vector3f;

public class CollisionShapeBox
{
    public Vector3f pos;
    public Vector3f size;
    public Vector3f p1;
    public Vector3f p2;
    public Vector3f p3;
    public Vector3f p4;
    public Vector3f p5;
    public Vector3f p6;
    public Vector3f p7;
    public Vector3f p8;
    public String part;
    
    public CollisionShapeBox(final Vector3f position, final Vector3f boxsize, final Vector3f p1mod, final Vector3f p2mod, final Vector3f p3mod, final Vector3f p4mod, final Vector3f p5mod, final Vector3f p6mod, final Vector3f p7mod, final Vector3f p8mod, final String driveablePart) {
        this.pos = new Vector3f(position.x / 16.0f, -position.y / 16.0f - 0.625f, position.z / 16.0f);
        this.size = new Vector3f(boxsize.x / 16.0f, boxsize.y / 16.0f, boxsize.z / 16.0f);
        this.p1 = new Vector3f(p1mod.x / 16.0f, p1mod.y / 16.0f, p1mod.z / 16.0f);
        this.p2 = new Vector3f(p2mod.x / 16.0f, p2mod.y / 16.0f, p2mod.z / 16.0f);
        this.p3 = new Vector3f(p3mod.x / 16.0f, p3mod.y / 16.0f, p3mod.z / 16.0f);
        this.p4 = new Vector3f(p4mod.x / 16.0f, p4mod.y / 16.0f, p4mod.z / 16.0f);
        this.p5 = new Vector3f(p5mod.x / 16.0f, p5mod.y / 16.0f, p5mod.z / 16.0f);
        this.p6 = new Vector3f(p6mod.x / 16.0f, p6mod.y / 16.0f, p6mod.z / 16.0f);
        this.p7 = new Vector3f(p7mod.x / 16.0f, p7mod.y / 16.0f, p7mod.z / 16.0f);
        this.p8 = new Vector3f(p8mod.x / 16.0f, p8mod.y / 16.0f, p8mod.z / 16.0f);
        this.part = driveablePart;
    }
}
