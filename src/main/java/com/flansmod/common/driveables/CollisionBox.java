// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;

public class CollisionBox
{
    public float x;
    public float y;
    public float z;
    public float w;
    public float h;
    public float d;
    public int health;
    public int armor;
    public int compArmor;
    public int animal;
    public int crew;
    public EnumDriveablePart part;
    
    public CollisionBox(final int health, final int x, final int y, final int z, final int w, final int h, final int d, final int armor, final int compArmor, final int animal, final int crew) {
        this.health = health;
        this.x = x / 16.0f;
        this.y = y / 16.0f;
        this.z = z / 16.0f;
        this.w = w / 16.0f;
        this.h = h / 16.0f;
        this.d = d / 16.0f;
        this.armor = armor;
        this.compArmor = compArmor;
        this.animal = animal;
        this.crew = crew;
    }
    
    public Vector3f getCentre() {
        return new Vector3f(this.x + this.w / 2.0f, this.y + this.h / 2.0f, this.z + this.d / 2.0f);
    }
}
