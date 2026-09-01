// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelBullet;

public class ModelStingerMissile extends ModelBullet
{
    public ModelRendererTurbo[] bulletModel;
    
    public ModelStingerMissile() {
        final int textureX = 64;
        final int textureY = 32;
        this.bulletModel = new ModelRendererTurbo[3];
        (this.bulletModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY)).addBox(-0.5f, -10.0f, -0.5f, 1, 20, 1);
        (this.bulletModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY)).addBox(-1.0f, -10.0f, 0.0f, 2, 1, 0);
        (this.bulletModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY)).addBox(0.0f, -10.0f, -1.0f, 0, 1, 2);
    }
    
    @Override
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (final ModelRendererTurbo mrt : this.bulletModel) {
            mrt.func_78785_a(f5);
        }
    }
}
