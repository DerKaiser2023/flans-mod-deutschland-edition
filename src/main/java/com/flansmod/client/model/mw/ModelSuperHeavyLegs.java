// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSuperHeavyLegs extends ModelCustomArmour
{
    public ModelSuperHeavyLegs() {
        final int textureX = 64;
        final int textureY = 32;
        this.leftLegModel = new ModelRendererTurbo[2];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, textureX, textureY)).addBox(-2.1f, -1.0f, -2.5f, 5, 10, 5);
        (this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 15, textureX, textureY)).addBox(-1.0f, 3.0f, -3.5f, 3, 4, 1);
        this.rightLegModel = new ModelRendererTurbo[2];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 20, 0, textureX, textureY)).addBox(-2.9f, -1.0f, -2.5f, 5, 10, 5);
        (this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 8, 15, textureX, textureY)).addBox(-2.0f, 3.0f, -3.5f, 3, 4, 1);
    }
}
