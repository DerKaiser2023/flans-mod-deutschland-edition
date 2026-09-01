// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.debug;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.entity.Entity;

public class EntityDebugAABB extends Entity
{
    public Vector3f vector;
    public int life;
    public float red;
    public float green;
    public float blue;
    public float rotationRoll;
    public float opacity;
    public Vector3f offset;
    
    public EntityDebugAABB(final World w, final Vector3f u, final Vector3f v, final int i, final float r, final float g, final float b, final float yaw, final float pitch, final float roll, final Vector3f offset, final int timer) {
        super(w);
        this.red = 1.0f;
        this.green = 1.0f;
        this.blue = 1.0f;
        this.opacity = 0.0f;
        this.setPosition((double)u.x, (double)u.y, (double)u.z);
        this.rotationYaw = yaw;
        this.rotationPitch = pitch;
        this.rotationRoll = roll;
        this.vector = v;
        this.life = i;
        this.red = r;
        this.green = g;
        this.blue = b;
        this.offset = offset;
        this.opacity = (float)timer;
    }
    
    public EntityDebugAABB(final World w, final Vector3f u, final Vector3f v, final int i, final float r, final float g, final float b, final float yaw, final float pitch, final float roll) {
        this(w, u, v, i, r, g, b, yaw, pitch, roll, new Vector3f(), 0);
    }
    
    public EntityDebugAABB(final World w, final Vector3f u, final Vector3f v, final int i, final float r, final float g, final float b) {
        this(w, u, v, i, r, g, b, 0.0f, 0.0f, 0.0f);
    }
    
    public EntityDebugAABB(final World w, final Vector3f u, final Vector3f v, final int i) {
        this(w, u, v, i, 1.0f, 1.0f, 1.0f);
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
    
    protected void readEntityFromNBT(final NBTTagCompound nbttagcompound) {
    }
    
    protected void writeEntityToNBT(final NBTTagCompound nbttagcompound) {
    }
}
