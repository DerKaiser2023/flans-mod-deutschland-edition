// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPolishCzapka extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPolishCzapka() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[10];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-5.0f, -8.5f, -5.0f, 10, 4, 9, 0.0f, -0.2f, -2.0f, -0.5f, -0.2f, -2.0f, -0.5f, 0.0f, -0.5f, 0.25f, 0.0f, -0.5f, 0.25f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f, 1.0f, 0.1f, -0.5f, 1.0f, 0.1f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(0.0f, -8.5f, -4.0f, 5, 2, 8, 0.0f, 0.0f, 0.75f, 1.5f, 0.5f, 0.5f, 0.8f, 0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.25f, 0.0f, 0.7f, 0.25f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-5.0f, -8.5f, -4.0f, 5, 2, 8, 0.0f, 0.5f, 0.5f, 0.8f, 0.0f, 0.75f, 1.5f, 0.0f, -0.5f, 1.0f, 0.5f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.7f, 0.25f, 0.0f, 0.5f, 0.25f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -4.5f, -3.0f, 8, 5, 1, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.5f, 0.4f, 0.0f, 0.5f, 0.25f, 0.1f, 0.0f, 0.25f, 0.1f, 0.0f, 0.25f, 0.2f, 0.0f, 0.25f, 0.2f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].rotateAngleX = -0.12217305f;
        this.headModel[4].addShapeBox(-4.5f, -5.5f, -8.0f, 9, 1, 3, 0.0f, -2.5f, -0.7f, -1.3f, -2.5f, -0.7f, -1.3f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -2.0f, 0.5f, 0.3f, -2.0f, 0.5f, 0.3f, 0.3f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -5.5f, -5.0f, 9, 1, 3, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, -2.0f, 0.0f, 4.3f, -2.0f, 0.0f, 4.3f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -11.5f, -4.0f, 5, 2, 4, 0.0f, -4.9f, 1.0f, 5.25f, 0.0f, 1.0f, 5.25f, 0.0f, -0.5f, 0.0f, 4.0f, -0.5f, 0.0f, 0.5f, 0.5f, 0.8f, 0.0f, 0.2f, 1.5f, 0.0f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-5.0f, -11.5f, 0.0f, 5, 2, 4, 0.0f, 4.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.5f, 4.25f, -4.9f, -1.5f, 4.25f, 0.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.5f, 1.0f, 0.5f, 1.5f, 0.5f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -11.5f, 0.0f, 5, 2, 4, 0.0f, 0.0f, -0.5f, 0.0f, 4.0f, -0.5f, 0.0f, -4.9f, -1.5f, 4.25f, 0.0f, -1.5f, 4.25f, 0.0f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.5f, 0.5f, 0.0f, 1.5f, 1.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(0.0f, -11.5f, -4.0f, 5, 2, 4, 0.0f, 0.0f, 1.0f, 5.25f, -4.9f, 1.0f, 5.25f, 4.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.2f, 1.5f, 0.5f, 0.5f, 0.8f, 0.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
