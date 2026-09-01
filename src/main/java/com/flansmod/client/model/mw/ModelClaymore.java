// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelClaymore extends ModelBase
{
    public ModelRendererTurbo[] claymoreModel;
    
    public ModelClaymore() {
        this.claymoreModel = new ModelRendererTurbo[2];
        (this.claymoreModel[0] = new ModelRendererTurbo(this, 0, 0, 32, 16)).addBox(-1.0f, 2.0f, -4.0f, 2, 4, 8);
        (this.claymoreModel[1] = new ModelRendererTurbo(this, 12, 4, 32, 16)).addBox(0.0f, -2.0f, -4.0f, 0, 4, 8);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo claymoreModelBit : this.claymoreModel) {
            claymoreModelBit.func_78785_a(f5);
        }
    }
}
