// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.debug;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;

public class EntityDebugVector extends Entity
{
    public Vector3f vector;
    public int life;
    public float red;
    public float green;
    public float blue;
    
    public EntityDebugVector(final World w) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
    }
    
    public EntityDebugVector(final World w, final Vector3f u, final Vector3f v, final int i, final float r, final float g, final float b) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.func_70107_b((double)u.x, (double)u.y, (double)u.z);
        this.vector = v;
        this.life = i;
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    
    public EntityDebugVector(final World w, final Vector3f u, final Vector3f v, final int i) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.func_70107_b((double)u.x, (double)u.y, (double)u.z);
        this.vector = v;
        this.life = i;
    }
    
    public void func_70071_h_() {
        --this.life;
        if (this.life <= 0) {
            this.func_70106_y();
        }
    }
    
    public AxisAlignedBB func_70046_E() {
        return null;
    }
    
    protected void func_70088_a() {
    }
    
    protected void func_70037_a(final NBTTagCompound nbttagcompound) {
    }
    
    protected void func_70014_b(final NBTTagCompound nbttagcompound) {
    }
}
