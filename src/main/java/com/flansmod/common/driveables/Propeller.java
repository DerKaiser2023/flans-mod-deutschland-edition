// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.common.driveables;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.parts.PartType;

public class Propeller
{
    public PartType itemType;
    public int ID;
    public int x;
    public int y;
    public int z;
    public EnumDriveablePart planePart;
    
    public Propeller(final int i, final int x, final int y, final int z, final EnumDriveablePart part, final PartType type) {
        this.ID = i;
        this.x = x;
        this.y = y;
        this.z = z;
        this.planePart = part;
        this.itemType = type;
    }
    
    public Vector3f getPosition() {
        return new Vector3f(this.x / 16.0f, this.y / 16.0f, this.z / 16.0f);
    }
}
