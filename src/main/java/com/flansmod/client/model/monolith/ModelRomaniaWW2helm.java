// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelRomaniaWW2helm extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelRomaniaWW2helm() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[7];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.5f, 0.0f, -4.0f, 9, 1, 1, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.6f, -0.8f, 0.0f, -0.6f, -0.8f, 0.0f, -0.6f, -0.8f, 0.0f, -0.6f, -0.8f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.5f, -4.0f, -4.5f, 9, 4, 4, 0.0f, 0.5f, 0.0f, -3.5f, 0.5f, 0.0f, -3.5f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -2.5f, -0.4f, 0.0f, -2.5f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -10.0f, -4.0f, 8, 2, 8, 0.0f, -1.2f, -0.4f, -2.8f, -1.2f, -0.4f, -2.8f, -1.2f, -0.7f, -1.0f, -1.2f, -0.7f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -8.0f, -5.0f, 8, 3, 5, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.1f, 0.0f, 1.1f, 0.1f, 0.0f, 1.1f, 0.75f, 0.4f, 0.5f, 0.75f, 0.4f, 0.5f, 1.5f, 1.0f, 1.1f, 1.5f, 1.0f, 1.1f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -8.0f, 0.2f, 8, 3, 4, 0.0f, 0.1f, 0.0f, -0.9f, 0.1f, 0.0f, -0.9f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 1.5f, 1.0f, -0.9f, 1.5f, 1.0f, -0.9f, 0.85f, 1.2f, 0.9f, 0.85f, 1.2f, 0.9f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -4.0f, 0.4f, 8, 1, 4, 0.0f, 1.5f, 0.5f, -0.4f, 1.5f, 0.5f, -0.4f, 0.85f, -0.2f, 0.7f, 0.85f, -0.2f, 0.7f, 1.7f, -0.8f, -0.4f, 1.7f, -0.8f, -0.4f, 1.4f, 0.8f, 1.5f, 1.4f, 0.8f, 1.5f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.0f, -4.0f, -4.2f, 8, 1, 4, 0.0f, 0.75f, 0.7f, 1.2f, 0.75f, 0.7f, 1.2f, 1.5f, 0.5f, 1.0f, 1.5f, 0.5f, 1.0f, 0.95f, -1.3f, 1.7f, 0.95f, -1.3f, 1.7f, 1.7f, -0.8f, 1.0f, 1.7f, -0.8f, 1.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
