// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelBullet;

public class ModelMIM23Rocket extends ModelBullet
{
    public ModelRendererTurbo[] bulletModel;
    
    public ModelMIM23Rocket() {
        final int textureX = 256;
        final int textureY = 256;
        this.bulletModel = new ModelRendererTurbo[4];
        this.bulletModel = new ModelRendererTurbo[4];
        (this.bulletModel[0] = new ModelRendererTurbo(this, 72, 212, textureX, textureY)).addBox(-20.0f, -3.0f, -3.0f, 40, 6, 6);
        (this.bulletModel[1] = new ModelRendererTurbo(this, 72, 226, textureX, textureY)).addTrapezoid(20.0f, -3.0f, -3.0f, 8, 6, 6, 0.0f, -3.0f, 2);
        (this.bulletModel[2] = new ModelRendererTurbo(this, 102, 226, textureX, textureY)).addShapeBox(-20.0f, -7.0f, 0.0f, 20, 14, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.bulletModel[3] = new ModelRendererTurbo(this, 88, 242, textureX, textureY)).addShapeBox(-20.0f, 0.0f, -7.0f, 20, 0, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        for (int i = 0; i < 4; ++i) {
            this.bulletModel[i].field_78808_h = 1.5707964f;
        }
    }
    
    @Override
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo mrt : this.bulletModel) {
            mrt.func_78785_a(f5);
        }
    }
}
