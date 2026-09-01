// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelCuirassierHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelCuirassierHat() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[24];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 59, 18, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -9.0f, -4.0f, 4, 3, 8, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 1.3f, 0.2f, 0.0f, 1.3f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 1.5f, 0.9f, -0.5f, 1.5f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -10.5f, -3.3f, 8, 1, 8, 0.0f, -2.0f, 0.2f, -3.0f, -2.0f, 0.2f, -3.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.6f, 0.2f, 0.5f, 0.6f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.5f, -5.0f, 8, 2, 9, 0.0f, 0.9f, 0.0f, -0.1f, 0.9f, 0.0f, -0.1f, 0.9f, 0.0f, 1.5f, 0.9f, 0.0f, 1.5f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, 0.4f, 0.9f, 0.9f, 0.4f, 0.9f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-2.0f, -9.0f, 3.0f, 4, 3, 1, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 1.3f, 0.2f, 0.0f, 1.3f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 1.5f, 0.9f, -0.5f, 1.5f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-0.5f, -9.0f, -3.8f, 1, 1, 1, 0.0f, 2.2f, 0.0f, -0.4f, 2.2f, 0.0f, -0.4f, 2.2f, 0.0f, 1.0f, 2.2f, 0.0f, 1.0f, 2.2f, 1.5f, 0.9f, 2.2f, 1.5f, 0.9f, 2.2f, 1.5f, 1.2f, 2.2f, 1.5f, 1.2f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -5.5f, -8.5f, 9, 1, 2, 0.0f, -1.8f, -0.8f, -1.3f, -1.8f, -0.8f, -1.3f, 0.2f, -0.5f, 0.0f, 0.2f, -0.5f, 0.0f, -1.8f, 0.9f, 0.3f, -1.8f, 0.9f, 0.3f, 1.0f, 0.5f, -0.1f, 1.0f, 0.5f, -0.1f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -6.0f, -6.5f, 9, 1, 3, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, -0.1f, 0.0f, 0.7f, 0.2f, 0.0f, 0.7f, 1.0f, 1.0f, 0.1f, 1.0f, 1.0f, 0.1f, -1.4f, 0.0f, 4.3f, -1.3f, 0.0f, 4.3f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-1.0f, -10.5f, 6.1f, 2, 12, 1, 0.0f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f, 1.3f, 0.0f, 0.0f, 1.3f, 0.0f, 0.0f, 0.5f, 2.0f, 2.0f, 0.5f, 2.0f, 2.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-1.0f, -13.5f, 5.1f, 2, 3, 2, 0.0f, 0.3f, 1.0f, 4.0f, 0.3f, 1.0f, 4.0f, 0.3f, -1.0f, -1.5f, 0.3f, -1.0f, -1.5f, 0.3f, 2.0f, -0.2f, 0.3f, 2.0f, -0.2f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-1.0f, -14.0f, 0.1f, 2, 4, 4, 0.0f, 0.0f, 0.4f, -0.5f, 0.0f, 0.4f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-1.0f, -12.0f, 4.1f, 2, 5, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -4.5f, -3.0f, 8, 5, 1, 0.0f, 1.2f, 0.0f, -0.3f, 1.2f, 0.0f, -0.3f, 1.2f, 0.0f, 0.8f, 1.2f, 0.0f, 0.8f, 0.25f, 0.0f, 0.0f, 0.25f, -0.125f, 0.0f, 0.25f, -0.125f, 0.0f, 0.25f, -0.125f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-2.0f, -5.5f, -2.5f, 4, 1, 1, 0.0f, 3.5f, 0.2f, 0.0f, 3.5f, 0.2f, 0.0f, 3.5f, 0.2f, 0.5f, 3.5f, 0.2f, 0.5f, 3.5f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, 3.5f, 0.0f, 0.5f, 3.5f, 0.0f, 0.5f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(0.0f, -9.0f, -4.0f, 4, 3, 8, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 1.3f, 0.2f, 0.0f, 1.3f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 1.5f, 0.9f, -0.5f, 1.5f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-4.0f, -6.6f, -5.0f, 8, 2, 9, 0.0f, 0.9f, 1.8f, 0.0f, 0.9f, 1.8f, 0.0f, 0.9f, 0.0f, 2.0f, 0.9f, 0.0f, 2.0f, 1.0f, -0.5f, 0.9f, 1.0f, -0.5f, 0.9f, 1.1f, 1.4f, 1.3f, 1.1f, 1.4f, 1.3f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-1.0f, -14.0f, -2.9f, 2, 4, 4, 0.0f, 0.0f, 0.7f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.4f, -0.5f, 0.0f, 0.4f, -0.5f, 0.0f, 0.5f, -0.8f, 0.0f, 0.5f, -0.8f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-1.0f, -12.0f, 6.1f, 2, 5, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -3.0f, -0.7f, 0.0f, -3.0f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -0.7f, 0.0f, -1.0f, -0.7f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-1.0f, -15.5f, -3.0f, 2, 1, 2, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-1.0f, -17.5f, -3.75f, 2, 1, 2, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-1.0f, -17.0f, -3.55f, 2, 2, 2, 0.0f, -0.5f, -0.2f, -0.3f, -0.5f, -0.2f, -0.3f, -0.5f, 0.0f, -0.7f, -0.5f, 0.0f, -0.7f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-1.0f, -14.5f, -2.9f, 2, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, -3.0f, 0.3f, 0.0f, -3.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f, 2.0f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(5.0f, -8.0f, -1.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(5.0f, -9.0f, -1.0f, 1, 1, 1, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(5.0f, -19.0f, -1.0f, 1, 8, 1, 0.0f, 1.0f, 0.2f, 0.8f, 1.0f, 0.2f, 0.8f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, 1.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
