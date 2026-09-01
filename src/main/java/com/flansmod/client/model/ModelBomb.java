// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelBomb extends ModelBase
{
    public ModelRendererTurbo[] bombModel;
    
    public ModelBomb() {
        (this.bombModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo(this, 104, 0, 128, 64);
        this.bombModel[1] = new ModelRendererTurbo(this, 104, 0, 128, 64);
        this.bombModel[2] = new ModelRendererTurbo(this, 56, 8, 128, 64);
        this.bombModel[3] = new ModelRendererTurbo(this, 56, 8, 128, 64);
        this.bombModel[0].addTrapezoid(-2.0f, 0.0f, -2.0f, 4, 1, 4, 0.0f, 1.0f, 4);
        this.bombModel[1].addBox(-2.0f, 1.0f, -2.0f, 4, 6, 4, 0.0f);
        this.bombModel[2].addTrapezoid(-2.0f, 7.0f, -2.0f, 4, 1, 4, 0.0f, 1.0f, 5);
        this.bombModel[3].addBox(-2.0f, 8.0f, -2.0f, 4, 2, 4, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 4; ++i) {
            this.bombModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
