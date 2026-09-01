// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.invalid;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelChina60sHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelChina60sHat() {
        this.textureX = 128;
        this.textureY = 128;
        (this.headModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 2, 65, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -5.25f, -6.0f, 8, 1, 2, 0.0f, -0.3f, -0.6f, 0.0f, -0.3f, -0.6f, 0.0f, 0.15f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, 0.15f, -0.8f, 0.0f, 0.15f, -0.8f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -8.8f, -4.0f, 8, 1, 8, 0.0f, -1.0f, -0.2f, -1.0f, -1.0f, -0.2f, -1.0f, -1.0f, -0.2f, -1.0f, -1.0f, -0.2f, -1.0f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -7.75f, -4.0f, 8, 2, 8, 0.0f, 0.1f, 0.25f, 0.1f, 0.1f, 0.25f, 0.1f, 0.1f, 0.25f, 0.1f, 0.1f, 0.25f, 0.1f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-0.5f, -7.5f, -4.2f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
