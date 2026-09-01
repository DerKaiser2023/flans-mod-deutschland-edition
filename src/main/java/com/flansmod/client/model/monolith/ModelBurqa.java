// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelBurqa extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelBurqa() {
        this.textureX = 64;
        this.textureY = 512;
        this.headModel = new ModelRendererTurbo[26];
        this.bodyModel = new ModelRendererTurbo[23];
        this.leftArmModel = new ModelRendererTurbo[5];
        this.rightArmModel = new ModelRendererTurbo[5];
        this.leftLegModel = new ModelRendererTurbo[10];
        this.rightLegModel = new ModelRendererTurbo[10];
        this.skirtFrontModel = new ModelRendererTurbo[3];
        this.skirtRearModel = new ModelRendererTurbo[3];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 121, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 129, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 137, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 33, 113, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 145, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 145, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 137, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 145, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 153, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 161, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 161, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 161, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 169, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 169, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 169, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 49, 169, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 177, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 17, 177, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 25, 177, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 129, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 177, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.5f, -4.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.5f, -8.5f, -4.0f, 1, 8, 8, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-2.5f, -4.6f, -4.6f, 5, 2, 1, 0.0f, 0.4f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.4f, 0.3f, -0.4f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -2.7f, -4.6f, 3, 5, 1, 0.0f, 0.0f, 2.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, 2.3f, -4.6f, 8, 3, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, -2.0f, 0.0f, -0.6f, -2.0f, 0.0f, -0.6f, -2.0f, 0.0f, -0.2f, -2.0f, 0.0f, -0.2f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -1.0f, -1.0f, 1, 2, 2, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -1.0f, -4.0f, 1, 2, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, -1.0f, 1.0f, 1, 2, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, -8.5f, 3.5f, 8, 11, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, 2.3f, 3.5f, 8, 3, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -2.0f, 0.0f, 0.6f, -2.0f, 0.0f, 0.6f, -2.0f, 0.0f, -1.4f, -2.0f, 0.0f, -1.4f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.5f, 1.0f, -4.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(3.5f, -8.5f, -4.0f, 1, 8, 8, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(3.5f, -1.0f, 1.0f, 1, 2, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(3.5f, -1.0f, -1.0f, 1, 2, 2, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(3.5f, -1.0f, -4.0f, 1, 2, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(3.5f, 1.0f, -4.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-4.5f, 1.0f, 0.9f, 1, 1, 3, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-4.5f, 2.3f, 0.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -1.4f, -1.0f, 1.0f, 0.6f, -1.0f, 1.0f, 1.6f, 0.0f, -1.0f, -2.4f, 0.0f, -1.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(3.5f, 1.0f, 0.9f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(3.5f, 2.3f, 0.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.6f, -1.0f, 1.0f, -1.4f, -1.0f, 1.0f, -2.4f, 0.0f, -1.0f, 1.6f, 0.0f, -1.0f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(1.0f, -2.7f, -4.6f, 3, 5, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-4.0f, -8.7f, -4.6f, 3, 5, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, 1.6f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.4f, -0.3f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(1.0f, -8.7f, -4.6f, 3, 5, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, 1.6f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.8f, -0.3f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 1, 8, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-1.0f, -2.7f, -4.6f, 2, 5, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-1.0f, -8.7f, -4.6f, 2, 5, 1, 0.0f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f, -0.3f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 57, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 121, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 209, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 49, 193, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 201, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 257, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 249, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 17, 257, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 49, 257, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 7.5f, -3.4f, 9, 3, 5, 0.0f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, 0.2f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, -0.2f, 0.0f, 1.6f, -0.2f, 0.0f, 1.6f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.5f, -2.5f, 8, 3, 4, 0.0f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, -2.8f, 0.0f, -0.7f, -2.8f, 0.0f, -0.7f, 0.1f, -2.0f, 1.0f, 0.1f, -2.0f, 1.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.5f, 8.5f, -3.0f, 9, 1, 5, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.5f, 2.5f, -3.0f, 7, 4, 4, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.0f, 6.0f, -3.0f, 6, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.5f, 0.5f, -2.5f, 7, 2, 4, 0.0f, -0.5f, 0.5f, -1.0f, -0.5f, 0.5f, -1.0f, -0.5f, 0.5f, 0.3f, -0.5f, 0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.5f, 1.0f, -2.5f, 3, 2, 1, 0.0f, -0.5f, -0.8f, 0.3f, 0.0f, -0.8f, 0.3f, 0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.5f, 3.01f, -2.5f, 3, 1, 1, 0.0f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.5f, -0.4f, 0.7f, 0.0f, -0.4f, 0.7f, 0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.5f, 3.0f, -2.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.0f, -0.4f, 0.7f, -0.5f, -0.4f, 0.7f, -0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.5f, 1.01f, -2.5f, 3, 2, 1, 0.0f, 0.0f, -0.8f, 0.3f, -0.5f, -0.8f, 0.3f, -0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.5f, 0.1f, -1.5f, 4, 5, 3, 0.0f, 0.0f, -0.2f, 0.0f, -1.5f, 0.3f, 0.0f, -2.5f, 0.3f, 0.5f, 0.0f, -0.2f, 0.2f, -1.3f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.3f, 0.0f, -1.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 0.1f, -1.0f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, 0.7f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.7f, 0.7f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.5f, 0.1f, -1.5f, 4, 5, 3, 0.0f, -1.5f, 0.3f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.2f, -2.5f, 0.3f, 0.5f, 0.0f, -1.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, -1.0f, -1.0f, -2.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.1f, -1.0f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -2.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -1.0f, -1.0f, 0.7f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.5f, -2.5f, -1.2f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.5f, 4.5f, -3.0f, 7, 4, 4, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.2f, -1.0f, 0.2f, -0.2f, -1.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.5f, 10.5f, -1.4f, 9, 3, 3, 0.0f, 0.2f, 0.5f, -0.2f, 0.2f, 0.5f, -0.2f, -0.2f, 0.0f, 1.6f, -0.2f, 0.0f, 1.6f, 0.4f, -1.0f, -1.2f, 0.4f, -1.0f, -1.2f, 0.0f, -1.8f, 2.2f, 0.0f, -1.8f, 2.2f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.5f, -0.5f, -1.5f, 4, 3, 3, 0.0f, 0.0f, -0.2f, 0.0f, -1.5f, 0.3f, 0.0f, -1.0f, 0.3f, 0.5f, 0.0f, -0.2f, 0.4f, -0.3f, 0.5f, 2.0f, 0.0f, 0.5f, 2.5f, 0.0f, 0.0f, 1.0f, -0.3f, 0.0f, 1.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.5f, -0.5f, -1.5f, 4, 3, 3, 0.0f, -1.5f, 0.3f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.4f, -1.0f, 0.3f, 0.5f, 0.0f, 0.5f, 2.5f, -0.3f, 0.5f, 2.0f, -0.3f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.5f, 3.5f, -1.5f, 4, 7, 3, 0.0f, -0.3f, 0.5f, 2.0f, 0.0f, 0.5f, 2.5f, 0.0f, 1.0f, 1.0f, -0.3f, 1.0f, 1.0f, 0.0f, -1.2f, 1.5f, 0.0f, 0.3f, 2.0f, 0.0f, 0.3f, 1.4f, 0.0f, -1.2f, 1.3f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-1.0f, 3.5f, -1.5f, 2, 7, 3, 0.0f, 0.0f, 0.5f, 2.6f, 0.0f, 0.5f, 2.6f, 0.0f, 1.0f, 1.2f, 0.0f, 1.0f, 1.2f, 1.0f, 0.3f, 2.0f, 1.0f, 0.3f, 2.0f, 0.0f, 0.5f, 1.5f, 0.0f, 0.5f, 1.5f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-1.0f, -0.5f, -1.5f, 2, 3, 3, 0.0f, 1.0f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f, 1.0f, 0.5f, 0.7f, 1.0f, 0.5f, 0.7f, 0.0f, 0.5f, 2.6f, 0.0f, 0.5f, 2.6f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.5f, 3.5f, -1.5f, 4, 7, 3, 0.0f, 0.0f, 0.5f, 2.5f, -0.3f, 0.5f, 2.0f, -0.3f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.3f, 2.0f, 0.0f, -1.2f, 1.5f, 0.0f, -1.2f, 1.3f, 0.0f, 0.3f, 1.4f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 65, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 265, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 265, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.5f, -2.0f, -1.5f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -1.0f, -0.6f, -0.2f, -1.0f, -0.6f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -1.0f, 0.0f, -0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-0.55f, 4.0f, -1.0f, 2, 6, 2, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-0.8f, 0.0f, -1.0f, 2, 4, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-2.0f, -1.5f, -1.5f, 3, 7, 3, 0.0f, -1.5f, 0.3f, 0.0f, 0.5f, -0.2f, -0.5f, 0.5f, -0.2f, -0.2f, -1.0f, 0.3f, 0.5f, 0.0f, 1.5f, 2.5f, 0.7f, 0.5f, 0.5f, 0.7f, 0.0f, 0.5f, 0.0f, 1.0f, 2.0f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-0.55f, 4.0f, -1.0f, 2, 6, 2, 0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.5f, -0.5f, 1.5f, 0.5f, -0.5f, 1.5f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 65, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 257, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 265, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-1.5f, -2.0f, -1.5f, 3, 3, 3, 0.0f, -0.2f, -1.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -1.0f, -0.6f, -0.2f, 0.0f, -0.4f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.4f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-1.2f, 0.0f, -1.0f, 2, 4, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-1.0f, -1.5f, -1.5f, 3, 7, 3, 0.0f, 0.5f, -0.2f, -0.5f, -1.5f, 0.3f, 0.0f, -1.0f, 0.3f, 0.5f, 0.5f, -0.2f, -0.2f, 0.7f, 0.5f, 0.5f, 0.0f, 1.5f, 2.5f, 0.0f, 1.0f, 2.0f, 0.7f, 0.0f, 0.5f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-1.55f, 4.0f, -1.0f, 2, 6, 2, 0.0f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.5f, -0.5f, 1.5f, 0.5f, -0.5f, 1.5f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-1.45f, 4.0f, -1.0f, 2, 6, 2, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 73, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 73, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 81, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 89, this.textureX, this.textureY);
        this.leftLegModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 89, this.textureX, this.textureY);
        this.leftLegModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.leftLegModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 217, this.textureX, this.textureY);
        this.leftLegModel[9] = new ModelRendererTurbo((ModelBase)this, 9, 233, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-1.0f, 0.4f, 1.0f, 4, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-1.7f, 0.0f, -2.0f, 4, 6, 4, 0.0f, -0.4f, 0.0f, 0.2f, 0.2f, 2.5f, 0.5f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, -0.8f, 0.0f, -0.5f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-1.7f, 6.0f, -2.0f, 3, 6, 4, 0.0f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-1.0f, -2.6f, 1.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.8f, -0.5f, 0.0f, -0.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-3.0f, 0.4f, 1.0f, 2, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, -0.5f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, -0.5f, -1.0f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(-3.0f, -2.6f, 1.0f, 2, 2, 2, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, -1.0f, -0.8f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, -0.5f, 0.5f, 0.0f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[6].addShapeBox(-1.0f, 0.4f, -2.0f, 4, 1, 3, 0.0f, 0.0f, 0.5f, 0.0f, -0.8f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.leftLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].addShapeBox(-1.0f, -2.6f, -2.0f, 4, 2, 3, 0.0f, 0.0f, -0.8f, 0.0f, -0.5f, 0.1f, 0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -0.8f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.leftLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[8].addShapeBox(3.7f, -0.5f, -0.2f, 1, 11, 5, 0.0f, 1.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -2.5f, 0.0f, -2.0f, 2.0f, 0.0f, -2.0f, -1.2f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, -2.2f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f);
        this.leftLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[9].addShapeBox(3.7f, -0.5f, -3.2f, 1, 11, 5, 0.0f, 1.2f, 2.0f, -1.5f, -2.0f, 2.0f, -1.5f, -1.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.8f, -0.5f, 0.0f, -1.2f, -0.5f, 0.0f, 0.8f, 0.0f, -1.0f, -1.2f, 0.0f, -1.0f);
        this.leftLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 97, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 97, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 97, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 105, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 105, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 105, this.textureX, this.textureY);
        this.rightLegModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 113, this.textureX, this.textureY);
        this.rightLegModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 121, this.textureX, this.textureY);
        this.rightLegModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 233, this.textureX, this.textureY);
        this.rightLegModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 233, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(1.0f, -2.6f, 1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.8f, -0.5f, 0.0f, -0.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-3.0f, -2.6f, 1.0f, 4, 2, 2, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, -1.0f, -0.8f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, -0.5f, 0.5f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(1.0f, 0.4f, 1.0f, 2, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-3.0f, 0.4f, 1.0f, 4, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, -0.5f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.2f, 0.0f, -2.0f, 4, 6, 4, 0.0f, 0.2f, 2.5f, 0.5f, -0.4f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-1.2f, 6.0f, -2.0f, 3, 6, 4, 0.0f, 0.0f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.8f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[6].addShapeBox(-3.0f, 0.4f, -2.0f, 4, 1, 3, 0.0f, -0.8f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f);
        this.rightLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[7].addShapeBox(-3.0f, -2.6f, -2.0f, 4, 2, 3, 0.0f, -0.5f, 0.1f, 0.5f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.8f, 0.5f, -0.5f, -1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.rightLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[8].addShapeBox(-4.7f, -0.5f, -3.2f, 1, 11, 5, 0.0f, -2.0f, 2.0f, -1.5f, 1.2f, 2.0f, -1.5f, 1.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -1.2f, -0.5f, 0.0f, 0.8f, -0.5f, 0.0f, -1.2f, 0.0f, -1.0f, 0.8f, 0.0f, -1.0f);
        this.rightLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[9].addShapeBox(-4.7f, -0.5f, -0.2f, 1, 11, 5, 0.0f, -1.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, -2.0f, -2.5f, 0.0f, -2.0f, 0.8f, 0.0f, 1.0f, -1.2f, 0.0f, 1.0f, 1.8f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f);
        this.rightLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 185, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 217, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 217, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-4.5f, -2.5f, -3.4f, 9, 13, 1, 0.0f, 0.2f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 1.2f, -0.5f, 0.8f, 1.2f, -0.5f, 0.8f, 1.2f, -0.5f, -1.2f, 1.2f, -0.5f, -1.2f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(5.7f, -0.5f, -4.2f, 1, 11, 5, 0.0f, 1.2f, 2.0f, -1.5f, -2.0f, 2.0f, -1.5f, -1.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.8f, -0.5f, 0.0f, -1.2f, -0.5f, 0.0f, 0.8f, 0.0f, -1.0f, -1.2f, 0.0f, -1.0f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-6.7f, -0.5f, -4.2f, 1, 11, 5, 0.0f, -2.0f, 2.0f, -1.5f, 1.2f, 2.0f, -1.5f, 1.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -1.2f, -0.5f, 0.0f, 0.8f, -0.5f, 0.0f, -1.2f, 0.0f, -1.0f, 0.8f, 0.0f, -1.0f);
        this.skirtFrontModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 193, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 201, this.textureX, this.textureY);
        this.skirtRearModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 217, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(-4.5f, -0.5f, 3.0f, 9, 11, 1, 0.0f, 0.5f, -1.0f, -0.2f, 0.5f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.5f, 1.8f, 0.0f, 0.5f, 1.8f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(5.7f, -0.5f, 0.8f, 1, 11, 5, 0.0f, 1.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -2.5f, 0.0f, -2.0f, 2.0f, 0.0f, -2.0f, -1.2f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, -2.2f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[2].addShapeBox(-6.7f, -0.5f, 0.8f, 1, 11, 5, 0.0f, -1.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, -2.0f, -2.5f, 0.0f, -2.0f, 0.8f, 0.0f, 1.0f, -1.2f, 0.0f, 1.0f, 1.8f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f);
        this.skirtRearModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
