// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelDeployableBag extends ModelBase
{
    public ModelRendererTurbo[] bagModel;
    
    public ModelDeployableBag() {
        this.bagModel = new ModelRendererTurbo[2];
        (this.bagModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 32)).addShapeBox(-3.0f, 0.0f, -6.0f, 6, 6, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.1f, -1.0f, 0.0f);
        (this.bagModel[1] = new ModelRendererTurbo(this, 0, 12, 32, 32)).addShapeBox(-3.0f, 0.0f, 0.0f, 6, 6, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo bagModelBit : this.bagModel) {
            bagModelBit.func_78785_a(f5);
        }
    }
}
