// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelYoroi extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelYoroi() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[47];
        this.leftArmModel = new ModelRendererTurbo[10];
        this.rightArmModel = new ModelRendererTurbo[10];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.skirtFrontModel = new ModelRendererTurbo[7];
        this.skirtRearModel = new ModelRendererTurbo[7];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 193, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 169, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 217, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 241, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 161, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 185, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 177, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 193, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 217, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 241, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 217, 41, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 193, 33, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 217, 33, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 241, 33, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 233, 49, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 121, 57, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 241, 41, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 217, 57, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-3.0f, 4.0f, -2.1f, 6, 6, 4, 0.0f, 0.8f, 0.8f, 1.0f, 0.8f, 0.8f, 1.0f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.3f, 1.0f, 0.8f, 0.3f, 1.0f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.0f, 1.5f, -3.2f, 1, 5, 5, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(2.0f, 1.5f, -3.2f, 1, 5, 5, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 7.0f, -2.0f, 1, 3, 4, 0.0f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 5.0f, -2.0f, 1, 2, 4, 0.0f, 1.0f, -0.7f, 0.8f, -0.8f, 0.0f, 0.8f, -0.8f, 0.0f, 0.8f, 1.0f, -0.7f, 0.8f, 0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(2.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.0f, 0.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(2.0f, 0.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(3.0f, 5.0f, -2.0f, 1, 2, 4, 0.0f, -0.8f, 0.0f, 0.8f, 1.0f, -0.7f, 0.8f, 1.0f, -0.7f, 0.8f, -0.8f, 0.0f, 0.8f, -0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(3.0f, 7.0f, -2.0f, 1, 3, 4, 0.0f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.5f, 10.5f, -2.0f, 1, 7, 4, 0.0f, 0.0f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 1.0f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.0f, 0.5f, 2.0f, 1, 2, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(2.0f, 0.5f, 2.0f, 1, 2, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.0f, 3.1f, 2.0f, 6, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.5f, 15.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, 1.0f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.3f, 14.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, 1.0f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.15f, 13.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.2f, -0.5f, -0.1f, 1.2f, -0.5f, -0.1f, 1.2f, 0.8f, -0.1f, 1.2f, 1.0f, -0.1f, 1.3f, -1.5f, -0.1f, 1.3f, -1.5f, -0.1f, 1.3f, 1.0f, -0.1f, 1.3f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.05f, 12.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, 1.0f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-3.9f, 11.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.0f, -0.5f, -0.1f, 1.0f, -0.5f, -0.1f, 1.0f, 0.8f, -0.1f, 1.0f, 1.0f, -0.1f, 1.1f, -1.5f, -0.1f, 1.1f, -1.5f, -0.1f, 1.1f, 1.0f, -0.1f, 1.1f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-3.8f, 10.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, 1.0f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(2.8f, 10.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, -1.5f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(2.9f, 11.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.0f, 0.8f, -0.1f, 1.0f, 0.8f, -0.1f, 1.0f, -0.5f, -0.1f, 1.0f, -1.5f, -0.1f, 1.1f, 1.0f, -0.1f, 1.1f, 1.0f, -0.1f, 1.1f, -1.5f, -0.1f, 1.1f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(3.05f, 12.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, -1.5f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(3.25f, 13.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.2f, 0.8f, -0.1f, 1.2f, 0.8f, -0.1f, 1.2f, -0.5f, -0.1f, 1.2f, -1.5f, -0.1f, 1.3f, 1.0f, -0.1f, 1.3f, 1.0f, -0.1f, 1.3f, -1.5f, -0.1f, 1.3f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(3.3f, 14.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, -1.5f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(3.5f, 15.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, -1.5f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(3.5f, 10.5f, -2.0f, 1, 7, 4, 0.0f, -0.5f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, -1.5f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-4.0f, 9.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-4.0f, 8.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-4.0f, 7.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-4.0f, 6.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(3.0f, 6.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(3.0f, 7.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(3.0f, 8.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(3.0f, 9.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(-4.0f, 6.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-4.0f, 7.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-4.0f, 8.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-4.0f, 9.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(-3.0f, 5.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-3.0f, 4.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addShapeBox(-4.0f, 6.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[44].addShapeBox(-4.0f, 7.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[44].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[45].addShapeBox(-4.0f, 8.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[45].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[46].addShapeBox(-4.0f, 9.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[46].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 153, 33, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 177, 33, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 201, 33, this.textureX, this.textureY);
        this.leftArmModel[7] = new ModelRendererTurbo((ModelBase)this, 225, 33, this.textureX, this.textureY);
        this.leftArmModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.leftArmModel[9] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(2.8f, -2.5f, -3.5f, 1, 9, 7, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(2.9f, -0.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(2.9f, -1.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(2.9f, -2.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(2.9f, 0.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(2.9f, 1.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[7].addShapeBox(2.9f, 2.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[8].addShapeBox(2.9f, 3.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[9].addShapeBox(2.9f, 4.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.leftArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 129, 41, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 145, 49, this.textureX, this.textureY);
        this.rightArmModel[7] = new ModelRendererTurbo((ModelBase)this, 169, 49, this.textureX, this.textureY);
        this.rightArmModel[8] = new ModelRendererTurbo((ModelBase)this, 193, 49, this.textureX, this.textureY);
        this.rightArmModel[9] = new ModelRendererTurbo((ModelBase)this, 233, 57, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, 3.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.0f, -2.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-4.0f, -1.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-4.0f, -0.6f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-4.0f, 0.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-4.0f, 1.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[7].addShapeBox(-4.0f, 2.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[8].addShapeBox(-3.9f, -2.5f, -3.5f, 1, 9, 7, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f);
        this.rightArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[9].addShapeBox(-4.0f, 4.4f, -3.5f, 1, 1, 7, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.15f, -0.1f, 0.0f);
        this.rightArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 5, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 4, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 145, 9, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 5, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 4, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 233, 17, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.skirtFrontModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.skirtFrontModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.skirtFrontModel[5] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.skirtFrontModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-3.5f, -1.5f, -3.0f, 7, 7, 1, 0.0f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, -0.5f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, -1.5f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-4.0f, 3.5f, -4.0f, 8, 1, 1, 0.0f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-4.0f, 2.5f, -3.9f, 8, 1, 1, 0.0f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f);
        this.skirtFrontModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[3].addShapeBox(-4.0f, 1.5f, -3.8f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.2f, 0.7f, -0.1f, -0.2f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, 0.0f, 0.7f, -0.1f, 0.0f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, -0.3f);
        this.skirtFrontModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[4].addShapeBox(-4.0f, 0.5f, -3.7f, 8, 1, 1, 0.0f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f);
        this.skirtFrontModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[5].addShapeBox(-4.0f, -0.5f, -3.6f, 8, 1, 1, 0.0f, 0.5f, -0.1f, -0.2f, 0.5f, -0.1f, -0.2f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, 0.0f, 0.5f, -0.1f, 0.0f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, -0.3f);
        this.skirtFrontModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[6].addShapeBox(-4.0f, -1.5f, -3.5f, 8, 1, 1, 0.0f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f);
        this.skirtFrontModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 161, 25, this.textureX, this.textureY);
        this.skirtRearModel[2] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.skirtRearModel[3] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.skirtRearModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.skirtRearModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.skirtRearModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(-3.5f, -1.5f, 2.0f, 7, 7, 1, 0.0f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, 1.0f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(-4.0f, -1.5f, 2.5f, 8, 1, 1, 0.0f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, 0.0f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[2].addShapeBox(-4.0f, -0.5f, 2.6f, 8, 1, 1, 0.0f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, -0.2f, 0.5f, -0.1f, -0.2f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, -0.3f, 0.5f, -0.1f, 0.0f, 0.5f, -0.1f, 0.0f);
        this.skirtRearModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[3].addShapeBox(-4.0f, 0.5f, 2.7f, 8, 1, 1, 0.0f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, 0.0f);
        this.skirtRearModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[4].addShapeBox(-4.0f, 1.5f, 2.8f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, -0.2f, 0.7f, -0.1f, -0.2f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, -0.3f, 0.7f, -0.1f, 0.0f, 0.7f, -0.1f, 0.0f);
        this.skirtRearModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[5].addShapeBox(-4.0f, 2.5f, 2.9f, 8, 1, 1, 0.0f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, 0.0f);
        this.skirtRearModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[6].addShapeBox(-4.0f, 3.5f, 3.0f, 8, 1, 1, 0.0f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, 0.0f);
        this.skirtRearModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
