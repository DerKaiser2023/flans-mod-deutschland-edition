// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.debug;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class EntityDebugDot extends Entity
{
    public float red;
    public float green;
    public float blue;
    public int life;
    
    public EntityDebugDot(final World w) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.life = 0;
    }
    
    public EntityDebugDot(final World w, final Vector3f pos, final int l) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.life = 0;
        this.setPosition((double)pos.x, (double)pos.y, (double)pos.z);
        this.life = l;
    }
    
    public EntityDebugDot(final World w, final Vector3f pos, final int l, final float r, final float g, final float b) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.life = 0;
        this.setPosition((double)pos.x, (double)pos.y, (double)pos.z);
        this.life = l;
        this.red = r;
        this.green = g;
        this.blue = b;
    }
    
    public void onUpdate() {
        --this.life;
        if (this.life <= 0) {
            this.setDead();
        }
    }
    
    public AxisAlignedBB getBoundingBox() {
        return null;
    }
    
    protected void entityInit() {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound p_70037_1_) {
    }
    
    protected void writeEntityToNBT(final NBTTagCompound p_70014_1_) {
    }
}
