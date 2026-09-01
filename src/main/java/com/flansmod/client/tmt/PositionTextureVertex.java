// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.tmt;

import net.minecraft.util.Vec3;

public class PositionTextureVertex extends net.minecraft.client.model.PositionTextureVertex
{
    public float texturePositionW;
    
    public PositionTextureVertex(final float par1, final float par2, final float par3, final float par4, final float par5) {
        this(par1, par2, par3, par4, par5, 1.0f);
    }
    
    public PositionTextureVertex(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6) {
        this(Vec3.createVectorHelper((double)par1, (double)par2, (double)par3), par4, par5);
    }
    
    public PositionTextureVertex setTexturePosition(final float par1, final float par2) {
        return new PositionTextureVertex(this, par1, par2, 1.0f);
    }
    
    public PositionTextureVertex setTexturePosition(final float par1, final float par2, final float q) {
        return new PositionTextureVertex(this, par1, par2, q);
    }
    
    public PositionTextureVertex(final PositionTextureVertex par1PositionTextureVertex, final float par2, final float par3) {
        this(par1PositionTextureVertex, par2, par3, 1.0f);
    }
    
    public PositionTextureVertex(final PositionTextureVertex par1PositionTextureVertex, final float par2, final float par3, final float q) {
        super((net.minecraft.client.model.PositionTextureVertex)par1PositionTextureVertex, par2, par3);
        this.texturePositionW = 1.0f;
        this.texturePositionW = q;
    }
    
    public PositionTextureVertex(final Vec3 par1Vec3, final float par2, final float par3) {
        this(par1Vec3, par2, par3, 1.0f);
    }
    
    public PositionTextureVertex(final Vec3 par1Vec3, final float par2, final float par3, final float par4) {
        super(par1Vec3, par2, par3);
        this.texturePositionW = 1.0f;
        this.texturePositionW = par4;
    }
}
