// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSuperHeavyBoots extends ModelCustomArmour
{
    public ModelSuperHeavyBoots() {
        final int textureX = 128;
        final int textureY = 64;
        this.leftLegModel = new ModelRendererTurbo[1];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 84, 0, textureX, textureY)).addBox(-2.1f, 9.0f, -3.0f, 5, 3, 6);
        this.rightLegModel = new ModelRendererTurbo[1];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 84, 9, textureX, textureY)).addBox(-2.9f, 9.0f, -3.0f, 5, 3, 6);
    }
}
