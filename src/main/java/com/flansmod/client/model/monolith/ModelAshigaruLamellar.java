// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelAshigaruLamellar extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAshigaruLamellar() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[49];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[3];
        this.skirtFrontModel = new ModelRendererTurbo[5];
        this.skirtRearModel = new ModelRendererTurbo[5];
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
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 113, 41, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 17, 57, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-3.0f, 3.0f, -2.1f, 6, 7, 4, 0.0f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.8f, 0.3f, 0.5f, 0.8f, 0.3f, 0.5f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 7.0f, -2.0f, 1, 3, 4, 0.0f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 5.0f, -2.0f, 1, 2, 4, 0.0f, 1.0f, -0.7f, 0.8f, -0.8f, 0.0f, 0.8f, -0.8f, 0.0f, 0.8f, 1.0f, -0.7f, 0.8f, 0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(2.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.0f, 0.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(2.0f, 0.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(3.0f, 5.0f, -2.0f, 1, 2, 4, 0.0f, -0.8f, 0.0f, 0.8f, 1.0f, -0.7f, 0.8f, 1.0f, -0.7f, 0.8f, -0.8f, 0.0f, 0.8f, -0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f, 0.8f, -0.3f, 0.8f, -0.8f, -0.3f, 0.8f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(3.0f, 7.0f, -2.0f, 1, 3, 4, 0.0f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, 0.8f, 0.3f, 0.8f, -0.8f, 0.3f, 0.8f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.5f, 10.5f, -2.0f, 1, 4, 4, 0.0f, 0.0f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 1.0f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-3.0f, 0.0f, 2.0f, 1, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(2.0f, 0.0f, 2.0f, 1, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.0f, 1.6f, 2.0f, 6, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-4.5f, 13.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, 1.0f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.3f, 12.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, 1.0f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.05f, 11.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, 1.0f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-3.8f, 10.5f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, 1.0f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(2.8f, 10.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, 0.8f, -0.1f, 0.9f, -0.5f, -0.1f, 0.9f, -1.5f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f, -1.5f, -0.1f, 1.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(3.05f, 11.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, 0.8f, -0.1f, 1.1f, -0.5f, -0.1f, 1.1f, -1.5f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f, 1.0f, -0.1f, 1.2f, -1.5f, -0.1f, 1.2f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(3.3f, 12.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, 0.8f, -0.1f, 1.3f, -0.5f, -0.1f, 1.3f, -1.5f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f, 1.0f, -0.1f, 1.4f, -1.5f, -0.1f, 1.4f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(3.5f, 13.5f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, 0.8f, -0.1f, 1.4f, -0.5f, -0.1f, 1.4f, -1.5f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f, -1.5f, -0.1f, 1.5f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(3.5f, 10.5f, -2.0f, 1, 4, 4, 0.0f, -0.5f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, -0.5f, 0.3f, 0.8f, -1.5f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f, 1.0f, 0.3f, 1.8f, -1.5f, 0.3f, 1.8f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-4.0f, 6.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(3.0f, 6.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-4.0f, 6.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-4.0f, 6.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-3.0f, 2.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-3.0f, 1.0f, -3.2f, 1, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(2.0f, 1.0f, -3.2f, 1, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 2.0f, 0.3f, 0.0f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-3.0f, 2.6f, -3.2f, 6, 1, 1, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-3.0f, 3.3f, -2.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-4.0f, 7.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(3.0f, 7.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-4.0f, 7.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-4.0f, 7.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(-4.0f, 8.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(3.0f, 8.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-4.0f, 8.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-4.0f, 8.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-4.0f, 9.3f, -2.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(3.0f, 9.3f, -2.0f, 1, 1, 4, 0.0f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-4.0f, 9.3f, -2.0f, 1, 1, 4, 0.0f, 0.8f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, -0.5f, -0.1f, 0.7f, 0.8f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, -1.5f, -0.1f, 0.7f, 1.0f, -0.1f, 0.7f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addShapeBox(-4.0f, 9.3f, 1.0f, 8, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[44].addShapeBox(-3.0f, 4.3f, -2.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[44].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[45].addShapeBox(-3.0f, 3.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[45].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[46].addShapeBox(-3.0f, 5.3f, -2.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f);
        this.bodyModel[46].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[47].addShapeBox(-3.0f, 4.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[47].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[48].addShapeBox(-3.0f, 5.3f, 1.0f, 6, 1, 1, 0.0f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, 0.8f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, -1.5f, 0.7f, -0.1f, 1.0f, 0.7f, -0.1f, 1.0f);
        this.bodyModel[48].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 11.0f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 11.0f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.skirtFrontModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.skirtFrontModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-3.5f, -1.5f, -3.0f, 7, 4, 1, 0.0f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, -0.5f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, -1.5f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-4.0f, 1.5f, -4.0f, 8, 1, 1, 0.0f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-4.0f, 0.5f, -3.9f, 8, 1, 1, 0.0f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f);
        this.skirtFrontModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[3].addShapeBox(-4.0f, -0.5f, -3.7f, 8, 1, 1, 0.0f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f);
        this.skirtFrontModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[4].addShapeBox(-4.0f, -1.5f, -3.5f, 8, 1, 1, 0.0f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f);
        this.skirtFrontModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.skirtRearModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.skirtRearModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.skirtRearModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(-3.5f, -1.5f, 2.0f, 7, 4, 1, 0.0f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, -0.5f, 0.8f, 0.3f, 0.0f, 0.8f, 0.3f, 0.0f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, -1.5f, 1.8f, 0.3f, 1.0f, 1.8f, 0.3f, 1.0f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(-4.0f, -1.5f, 2.5f, 8, 1, 1, 0.0f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.2f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, -0.3f, 0.4f, -0.1f, 0.0f, 0.4f, -0.1f, 0.0f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[2].addShapeBox(-4.0f, -0.5f, 2.7f, 8, 1, 1, 0.0f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.2f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, -0.3f, 0.6f, -0.1f, 0.0f, 0.6f, -0.1f, 0.0f);
        this.skirtRearModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[3].addShapeBox(-4.0f, 0.5f, 2.9f, 8, 1, 1, 0.0f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.2f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, -0.3f, 0.8f, -0.1f, 0.0f, 0.8f, -0.1f, 0.0f);
        this.skirtRearModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[4].addShapeBox(-4.0f, 1.5f, 3.0f, 8, 1, 1, 0.0f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.2f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, -0.3f, 0.9f, -0.1f, 0.0f, 0.9f, -0.1f, 0.0f);
        this.skirtRearModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
