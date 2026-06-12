// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelBallistaBolt extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] ballistaboltModel;
    
    public ModelBallistaBolt() {
        this.textureX = 32;
        this.textureY = 32;
        (this.ballistaboltModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.ballistaboltModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.ballistaboltModel[0].addShapeBox(-0.5f, -25.0f, -0.5f, 1, 29, 1, 0.0f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f, 0.4f, 5.0f, 0.4f);
        this.ballistaboltModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.ballistaboltModel[1].addShapeBox(-0.5f, 9.0f, -0.5f, 1, 10, 1, 0.0f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, -0.45f, 5.0f, -0.45f, -0.45f, 5.0f, -0.45f, -0.45f, 5.0f, -0.45f, 0.0f, 5.0f, -0.45f);
        this.ballistaboltModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 2; ++i) {
            this.ballistaboltModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
