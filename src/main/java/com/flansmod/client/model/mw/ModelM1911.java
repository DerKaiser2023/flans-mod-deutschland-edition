// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelM1911 extends ModelM9
{
    public ModelM1911() {
        final int textureX = 32;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[4];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, 0.0f, -1.0f, 3, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY)).addBox(-2.0f, -2.0f, -1.0f, 3, 2, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(-1.0f, 2.0f, -1.0f, 8, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(-0.5f, 3.5f, -0.5f, 8, 1, 1);
        (this.ammoModel[0] = new ModelRendererTurbo(this, 14, 0, textureX, textureY)).addBox(-1.0f, -1.8f, -0.5f, 2, 4, 1);
    }
}
