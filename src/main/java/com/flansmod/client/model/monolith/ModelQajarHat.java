// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelQajarHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelQajarHat() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[15];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-3.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(1.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -5.7f, 1.0f, 8, 1, 3, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 1.2f, 1.8f, 0.5f, 1.2f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -0.7f, 1.0f, 8, 1, 3, 0.0f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.0f, 1.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -4.2f, 1.0f, 8, 3, 3, 0.0f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 1.2f, 1.8f, 0.5f, 1.2f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -4.2f, -0.2f, 8, 3, 1, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.0f, -0.2f, -0.2f, 8, 1, 1, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, -1.2f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-6.0f, -2.0f, -4.5f, 6, 1, 1, 0.0f, 0.0f, -0.4f, -0.3f, -1.0f, 0.5f, -0.3f, -1.0f, 0.5f, -0.3f, 0.0f, -0.4f, -0.3f, -4.5f, -0.3f, -0.3f, 0.2f, -1.0f, -0.3f, 0.2f, -1.0f, -0.3f, -4.5f, -0.3f, -0.3f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -2.0f, -4.5f, 6, 1, 1, 0.0f, -1.0f, 0.5f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -1.0f, 0.5f, -0.3f, 0.2f, -1.0f, -0.3f, -4.5f, -0.3f, -0.3f, -4.5f, -0.3f, -0.3f, 0.2f, -1.0f, -0.3f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.0f, 1.1f, 0.0f, 1.0f, 1.1f, 0.5f, -1.5f, 0.2f, 0.5f, -1.5f, 0.2f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -14.0f, -4.0f, 8, 5, 8, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 1.1f, 0.0f, 1.0f, 1.1f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -5.7f, -0.2f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.0f, -5.7f, -3.2f, 8, 1, 3, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-4.0f, -4.2f, -3.2f, 8, 3, 1, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.0f, 0.5f, 0.4f, 0.0f, 0.5f, 0.4f, -0.5f, 0.0f, 0.4f, -0.5f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-4.0f, -20.0f, -4.0f, 8, 6, 8, 0.0f, -2.0f, 1.0f, -3.0f, -2.0f, -1.0f, -3.0f, -2.0f, 0.0f, 1.5f, -2.0f, 2.0f, 1.5f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
