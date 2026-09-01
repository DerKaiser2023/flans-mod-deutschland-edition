// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.norwegian;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelObjTest extends ModelPlane
{
    public ModelObjTest() {
        final int textureX = 256;
        final int textureY = 128;
        this.bodyModel = new ModelRendererTurbo[1];
        (this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addObj("/Tyrants and Plebeians/assets/flansmod/models/Girl_Lili.obj");
        this.bodyModel[0].setRotationPoint(3.5f, 2.0f, 0.0f);
        this.translateAll(-3.5f, -1.8f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo mrt : this.bodyModel) {
            mrt.render(1.0f);
        }
    }
}
