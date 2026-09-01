// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelRoundGrenade extends ModelBase
{
    public ModelRendererTurbo headModel;
    public ModelRendererTurbo bodyModel;
    
    public ModelRoundGrenade() {
        (this.bodyModel = new ModelRendererTurbo(this, 0, 0, 16, 8)).addBox(-1.0f, -1.0f, -1.0f, 2, 2, 2);
        (this.headModel = new ModelRendererTurbo(this, 8, 0, 16, 8)).addBox(-0.5f, -0.5f, 0.5f, 1, 1, 1);
        this.bodyModel.field_78795_f = -1.5707964f;
        this.headModel.field_78795_f = -1.5707964f;
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        this.headModel.func_78785_a(f5);
        this.bodyModel.func_78785_a(f5);
    }
}
