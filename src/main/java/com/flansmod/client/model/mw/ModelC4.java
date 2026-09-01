// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelC4 extends ModelBase
{
    public ModelRendererTurbo[] c4Model;
    
    public ModelC4() {
        this.c4Model = new ModelRendererTurbo[2];
        (this.c4Model[0] = new ModelRendererTurbo(this, 0, 0, 32, 8)).addBox(-2.0f, 0.0f, -3.0f, 4, 2, 6);
        (this.c4Model[1] = new ModelRendererTurbo(this, 20, 0, 32, 8)).addBox(-1.0f, 1.5f, -2.0f, 2, 1, 4);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo mineModelBit : this.c4Model) {
            mineModelBit.func_78785_a(f5);
        }
    }
}
