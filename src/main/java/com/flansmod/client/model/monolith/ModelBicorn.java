// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelBicorn extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelBicorn() {
        this.textureX = 128;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[17];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 1.5f, 0.3f, 0.2f, 1.5f, 0.3f, 0.2f, 1.0f, 0.9f, 0.2f, 1.0f, 0.9f, 0.9f, -1.5f, 1.2f, 0.9f, -1.5f, 1.2f, 0.9f, -0.6f, 1.0f, 0.9f, -0.6f, 1.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -13.0f, -4.0f, 8, 3, 8, 0.0f, -3.1f, -2.7f, -3.5f, -3.1f, -2.7f, -3.5f, -3.1f, -3.0f, -2.5f, -3.1f, -3.0f, -2.5f, 0.2f, 1.5f, 0.3f, 0.2f, 1.5f, 0.3f, 0.2f, 2.0f, 0.9f, 0.2f, 2.0f, 0.9f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-7.0f, -11.0f, -5.5f, 2, 6, 1, 0.0f, -1.0f, -2.5f, -3.0f, 1.5f, -0.5f, -1.0f, 1.5f, -0.5f, 1.0f, -1.5f, -2.5f, 3.0f, 0.0f, 1.0f, -2.0f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, -1.0f, -2.0f, 0.8f, 2.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-9.0f, -8.0f, -4.5f, 2, 5, 1, 0.0f, 0.5f, -1.5f, -5.0f, 1.0f, 0.5f, -2.0f, 1.5f, 0.5f, 2.0f, 0.5f, -1.5f, 5.0f, 2.0f, 0.0f, -5.0f, 0.0f, -1.0f, -1.0f, 2.0f, -1.2f, 1.0f, 2.0f, 0.0f, 5.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-9.0f, -8.0f, 7.5f, 4, 5, 1, 0.0f, 0.5f, -1.5f, 6.0f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, -2.0f, 0.5f, -1.5f, -6.0f, 2.0f, 0.0f, 6.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 2.0f, 0.0f, -6.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.0f, -8.0f, 7.5f, 5, 5, 1, 0.0f, 0.0f, 0.5f, 2.0f, 0.0f, 2.0f, 2.5f, 0.0f, 2.0f, -2.5f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -1.5f, 0.0f, 0.0f, -1.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -5.5f, -8.5f, 5, 1, 15, 0.0f, -0.5f, 0.5f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -2.5f, 0.0f, 0.0f, -1.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-10.5f, -5.5f, -0.5f, 5, 1, 7, 0.0f, -0.5f, -1.0f, -1.0f, 1.0f, 0.0f, 4.5f, 1.0f, 0.0f, 0.0f, -0.5f, -1.0f, -4.5f, 0.3f, 1.5f, -1.0f, 1.0f, 0.0f, 4.5f, 0.5f, 1.5f, 0.0f, 0.3f, 1.5f, -4.5f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -8.0f, 7.5f, 5, 5, 1, 0.0f, 0.0f, 2.0f, 2.5f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 2.0f, -2.5f, 0.0f, -0.2f, 1.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -1.5f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.0f, -11.0f, -5.5f, 5, 6, 1, 0.0f, -1.5f, -0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -1.5f, -0.5f, 1.0f, -0.5f, 0.5f, 1.0f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, -2.0f, -0.5f, 0.5f, -1.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(0.0f, -11.0f, -5.5f, 5, 6, 1, 0.0f, 0.0f, 0.5f, 0.0f, -1.5f, -0.5f, -1.0f, -1.5f, -0.5f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 2.0f, -0.5f, 0.5f, 1.0f, -0.5f, 0.5f, -1.0f, 0.0f, 0.5f, -2.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(0.0f, -5.5f, -8.5f, 5, 1, 15, 0.0f, 0.0f, 0.0f, -2.0f, -0.5f, 0.5f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, -2.5f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(5.0f, -11.0f, -5.5f, 2, 6, 1, 0.0f, 1.5f, -0.5f, -1.0f, -1.0f, -2.5f, -3.0f, -1.5f, -2.5f, 3.0f, 1.5f, -0.5f, 1.0f, 0.5f, 0.5f, 1.0f, 0.0f, 1.0f, -2.0f, -2.0f, 0.8f, 2.0f, 0.5f, 0.5f, -1.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(5.0f, -8.0f, 7.5f, 4, 5, 1, 0.0f, 0.0f, 0.5f, 2.0f, 0.5f, -1.5f, 6.0f, 0.5f, -1.5f, -6.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 6.0f, 2.0f, 0.0f, -6.0f, 0.0f, 0.0f, -1.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(5.5f, -5.5f, -0.5f, 5, 1, 7, 0.0f, 1.0f, 0.0f, 4.5f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -4.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.5f, 0.3f, 1.5f, -1.0f, 0.3f, 1.5f, -4.5f, 0.5f, 1.5f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(7.0f, -8.0f, -4.5f, 2, 5, 1, 0.0f, 1.0f, 0.5f, -2.0f, 0.5f, -1.5f, -5.0f, 0.5f, -1.5f, 5.0f, 1.5f, 0.5f, 2.0f, 0.0f, -1.0f, -1.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, 5.0f, 2.0f, -1.2f, 1.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(4.0f, -11.0f, -4.5f, 2, 5, 1, 0.0f, -0.5f, 0.5f, 0.5f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 1.0f, -0.5f, 0.5f, -0.5f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
