// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelCloakerGoggles extends ModelCustomArmour
{
    public ModelCloakerGoggles() {
        final int textureX = 64;
        final int textureY = 32;
        this.headModel = new ModelRendererTurbo[4];
        (this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY)).addBox(-4.5f, -9.0f, -4.5f, 9, 9, 9);
        (this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 18, textureX, textureY)).addBox(-3.0f, -6.5f, -7.5f, 2, 2, 3);
        (this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 18, textureX, textureY)).addBox(1.0f, -6.5f, -7.5f, 2, 2, 3);
        (this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 23, textureX, textureY)).addBox(-2.0f, -3.5f, -6.5f, 4, 4, 2);
    }
}
