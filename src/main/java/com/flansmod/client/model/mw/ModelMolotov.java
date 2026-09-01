// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMolotov extends ModelBase
{
    public ModelRendererTurbo neckModel;
    public ModelRendererTurbo bodyModel;
    public ModelRendererTurbo clothModel;
    
    public ModelMolotov() {
        (this.bodyModel = new ModelRendererTurbo(this, 0, 0, 32, 16)).addBox(-1.0f, -2.0f, -1.0f, 2, 4, 2);
        (this.neckModel = new ModelRendererTurbo(this, 8, 0, 32, 16)).addBox(-0.5f, 2.0f, -0.5f, 1, 2, 1);
        (this.clothModel = new ModelRendererTurbo(this, 0, 6, 32, 16)).addShapeBox(-1.0f, -0.5f, -0.5f, 2, 1, 5, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.clothModel.setRotationPoint(0.0f, 4.0f, 0.0f);
        this.clothModel.rotateAngleX = 1.0f;
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        this.neckModel.render(f5);
        this.bodyModel.render(f5);
        this.clothModel.render(f5);
    }
}
