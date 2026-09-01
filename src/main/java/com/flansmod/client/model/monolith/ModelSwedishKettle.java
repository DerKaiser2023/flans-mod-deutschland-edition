// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSwedishKettle extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSwedishKettle() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[16];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 2, 8, 0.0f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -10.3f, -4.0f, 8, 1, 8, 0.0f, -2.0f, 0.2f, -2.0f, -2.0f, 0.2f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-0.5f, -11.3f, -0.5f, 1, 1, 1, 0.0f, 0.1f, -0.5f, 0.1f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.1f, -0.5f, 0.1f, 1.5f, -0.2f, 1.5f, 1.5f, -0.2f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-0.5f, -11.5f, -0.5f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -6.0f, -4.0f, 8, 2, 8, 0.0f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, -0.4f, 0.9f, 0.9f, -0.4f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.0f, -4.5f, 4.8f, 10, 1, 3, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-7.9f, -4.9f, -4.8f, 3, 1, 10, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, -0.9f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-8.01f, -4.9f, -7.8f, 3, 1, 3, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-8.01f, -4.5f, 4.91f, 3, 1, 3, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -5.0f, -3.4f, 8, 5, 1, 0.0f, 0.4f, 0.3f, -4.2f, 0.4f, 0.3f, -4.2f, 0.4f, 0.3f, 3.8f, 0.4f, 0.3f, 3.8f, 0.1f, 0.3f, -0.2f, 0.1f, 0.3f, -0.2f, 0.1f, 0.3f, -0.2f, 0.1f, 0.3f, -0.2f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-5.0f, -4.9f, -7.8f, 10, 1, 3, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(4.9f, -4.9f, -4.8f, 3, 1, 10, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.9f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(4.9f, -4.5f, 4.91f, 3, 1, 3, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(4.9f, -4.9f, -7.8f, 3, 1, 3, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-4.0f, -8.5f, -4.0f, 8, 2, 8, 0.0f, 0.9f, -0.8f, 0.9f, 0.9f, -0.8f, 0.9f, 0.9f, -1.2f, 0.9f, 0.9f, -1.2f, 0.9f, 0.9f, -0.1f, 0.9f, 0.9f, -0.1f, 0.9f, 0.9f, 0.3f, 0.9f, 0.9f, 0.3f, 0.9f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-4.0f, -7.5f, -4.0f, 8, 2, 8, 0.0f, 0.9f, -0.8f, 0.9f, 0.9f, -0.8f, 0.9f, 0.9f, -1.2f, 0.9f, 0.9f, -1.2f, 0.9f, 0.5f, -0.1f, 0.5f, 0.5f, -0.1f, 0.5f, 0.5f, 0.3f, 0.5f, 0.5f, 0.3f, 0.5f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
