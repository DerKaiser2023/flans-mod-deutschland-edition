// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelAdrian extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAdrian() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[28];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 57, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 2, 2, 8, 0.0f, 0.2f, 0.6f, -0.5f, 1.0f, 0.6f, 0.2f, 1.0f, -0.1f, 0.8f, 0.2f, -0.1f, 0.3f, 0.9f, -0.5f, 0.7f, 0.0f, -0.5f, 1.7f, 0.0f, 0.3f, 1.5f, 0.9f, 0.3f, 1.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.9f, -4.0f, 2, 1, 8, 0.0f, -1.2f, -0.3f, -2.5f, 1.0f, 0.0f, -2.2f, 1.0f, -0.6f, -0.7f, -1.2f, -0.8f, -1.2f, 0.2f, 0.3f, -0.5f, 1.0f, 0.3f, 0.2f, 1.0f, 1.0f, 0.8f, 0.2f, 1.0f, 0.3f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.5f, -4.0f, 1, 2, 8, 0.0f, 0.9f, 0.0f, 0.7f, 1.0f, 0.0f, 1.7f, 1.0f, -0.8f, 1.5f, 0.9f, -0.8f, 1.0f, 0.9f, -0.4f, 0.9f, 1.0f, -0.8f, 1.9f, 1.0f, 1.2f, 1.4f, 0.9f, 1.0f, 0.9f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -5.4f, 0.0f, 1, 1, 5, 0.0f, 0.9f, -1.2f, 0.0f, 1.0f, -1.3f, 0.0f, 1.0f, -2.1f, 0.4f, 0.9f, -1.9f, -0.1f, 1.7f, 0.9f, 0.0f, 1.3f, 0.5f, 0.0f, 1.3f, 2.8f, 1.1f, 1.3f, 2.2f, 0.3f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -5.4f, -5.0f, 1, 1, 5, 0.0f, 0.8f, -0.5f, -0.1f, 1.0f, -0.1f, 0.9f, 1.0f, -1.3f, 0.0f, 0.9f, -1.2f, 0.0f, 1.3f, 0.2f, 1.2f, 1.0f, -0.3f, 2.8f, 1.0f, 0.5f, 0.0f, 1.7f, 0.9f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-1.0f, -9.9f, -4.0f, 2, 1, 8, 0.0f, 0.2f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f, -0.4f, -0.7f, 0.2f, -0.4f, -0.7f, -0.3f, 0.15f, 0.1f, -0.3f, 0.15f, 0.1f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-1.0f, -8.0f, -4.0f, 2, 2, 8, 0.0f, 0.0f, 0.6f, 0.2f, 0.0f, 0.6f, 0.2f, 0.0f, -0.1f, 0.8f, 0.0f, -0.1f, 0.8f, 1.0f, -0.5f, 1.7f, 1.0f, -0.5f, 1.7f, 1.0f, 0.3f, 1.5f, 1.0f, 0.3f, 1.5f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-1.0f, -6.5f, -4.0f, 2, 2, 8, 0.0f, 1.0f, 0.0f, 1.7f, 1.0f, 0.0f, 1.7f, 1.0f, -0.8f, 1.5f, 1.0f, -0.8f, 1.5f, 1.0f, -0.8f, 1.9f, 1.0f, -0.8f, 1.9f, 1.0f, 1.2f, 1.4f, 1.0f, 1.2f, 1.4f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-1.0f, -5.4f, -5.0f, 2, 1, 5, 0.0f, 1.0f, -0.1f, 0.9f, 1.0f, -0.1f, 0.9f, 0.9f, -1.2f, 0.0f, 1.0f, -1.3f, 0.0f, 1.0f, -0.3f, 2.8f, 1.0f, -0.3f, 2.8f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(0.0f, -5.4f, 0.0f, 1, 1, 5, 0.0f, 1.0f, -1.3f, 0.0f, 0.9f, -1.2f, 0.0f, 1.0f, -2.1f, 0.4f, 2.0f, -2.1f, 0.4f, 1.3f, 0.9f, -1.0f, 1.7f, 0.9f, -1.0f, 0.7f, 2.8f, 1.1f, 1.7f, 2.8f, 1.1f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(3.0f, -5.4f, -5.0f, 1, 1, 5, 0.0f, 1.0f, -0.1f, 0.9f, 0.8f, -0.5f, -0.1f, 0.9f, -1.2f, 0.0f, 1.0f, -1.3f, 0.0f, 1.0f, -0.3f, 2.8f, 1.3f, 0.2f, 1.2f, 1.7f, 0.9f, 0.0f, 1.0f, 0.5f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(3.0f, -6.5f, -4.0f, 1, 2, 8, 0.0f, 1.0f, 0.0f, 1.7f, 0.9f, 0.0f, 0.7f, 0.9f, -0.8f, 1.0f, 1.0f, -0.8f, 1.5f, 1.0f, -0.8f, 1.9f, 0.9f, -0.4f, 0.9f, 0.9f, 1.0f, 0.9f, 1.0f, 1.2f, 1.4f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(2.0f, -8.0f, -4.0f, 2, 2, 8, 0.0f, 1.0f, 0.6f, 0.2f, 0.2f, 0.6f, -0.5f, 0.2f, -0.1f, 0.3f, 1.0f, -0.1f, 0.8f, 0.0f, -0.5f, 1.7f, 0.9f, -0.5f, 0.7f, 0.9f, 0.3f, 1.0f, 0.0f, 0.3f, 1.5f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(2.0f, -9.9f, -4.0f, 2, 1, 8, 0.0f, 1.0f, 0.0f, -2.2f, -1.2f, -0.3f, -2.5f, -1.2f, -0.8f, -1.2f, 1.0f, -0.6f, -0.7f, 1.0f, 0.3f, 0.2f, 0.2f, 0.3f, -0.5f, 0.2f, 1.0f, 0.3f, 1.0f, 1.0f, 0.8f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(3.0f, -5.4f, 0.0f, 1, 1, 5, 0.0f, 1.0f, -1.3f, 0.0f, 0.9f, -1.2f, 0.0f, 0.9f, -1.9f, -0.1f, 1.0f, -2.1f, 0.4f, 1.3f, 0.5f, 0.0f, 1.7f, 0.9f, 0.0f, 1.3f, 2.2f, 0.3f, 1.3f, 2.8f, 1.1f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-0.5f, -10.5f, -4.0f, 1, 1, 8, 0.0f, -0.1f, 0.1f, -2.6f, -0.1f, 0.1f, -2.6f, -0.1f, -0.5f, -0.7f, -0.1f, -0.5f, -0.7f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.4f, 1.2f, 0.0f, 1.4f, 1.2f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-0.5f, -8.7f, -2.0f, 1, 2, 6, 0.0f, 0.0f, 0.6f, 0.2f, 0.0f, 0.6f, 0.2f, 0.0f, -0.6f, 1.2f, 0.0f, -0.6f, 1.2f, 1.0f, -0.5f, 1.7f, 1.0f, -0.5f, 1.7f, 0.0f, 1.0f, 1.9f, 0.0f, 1.0f, 1.9f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-0.5f, -5.7f, 4.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-1.0f, -9.9f, -4.0f, 2, 1, 8, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, -0.6f, -0.7f, 0.0f, -0.6f, -0.7f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, 0.8f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-1.0f, -7.3f, 2.0f, 2, 1, 2, 0.0f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.5f, 1.6f, 0.2f, 0.5f, 1.6f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-1.0f, -5.3f, 2.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.5f, 1.6f, 0.2f, 0.5f, 1.6f, 0.0f, 0.15f, 0.1f, 0.0f, 0.15f, 0.1f, -0.2f, 0.4f, 1.5f, -0.2f, 0.4f, 1.5f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-0.5f, -7.2f, -5.7f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, -0.7f, -0.1f, 0.0f, -0.7f, -0.1f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-0.5f, -8.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.45f, 0.0f, 0.2f, -0.45f, 0.0f, 0.2f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-0.5f, -8.2f, -5.2f, 1, 1, 1, 0.0f, 0.2f, -0.2f, -0.3f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.4f, -0.2f, -0.05f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, 0.4f, -0.2f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-0.5f, -7.2f, -5.7f, 1, 1, 1, 0.0f, 0.0f, -0.7f, 0.1f, 0.0f, -0.7f, 0.1f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-0.5f, -6.9f, -5.7f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-5.0f, -4.0f, -1.0f, 10, 4, 1, 0.0f, -0.3f, 0.2f, 1.0f, -0.3f, 0.2f, 1.0f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.9f, 0.1f, 2.7f, -0.9f, 0.1f, 2.7f, -0.9f, 0.2f, -3.0f, -0.9f, 0.2f, -3.0f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-0.5f, -8.2f, -5.2f, 1, 1, 1, 0.0f, -0.7f, 0.0f, -0.4f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, 0.0f, -0.7f, 0.0f, 0.0f, -0.4f, -0.3f, 0.0f, 0.4f, -0.2f, -0.05f, 0.4f, -0.2f, 0.0f, -0.4f, -0.3f, 0.0f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
