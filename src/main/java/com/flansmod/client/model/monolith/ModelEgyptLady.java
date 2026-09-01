// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEgyptLady extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEgyptLady() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[23];
        this.bodyModel = new ModelRendererTurbo[43];
        this.leftArmModel = new ModelRendererTurbo[3];
        this.rightArmModel = new ModelRendererTurbo[3];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 81, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 97, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 89, 97, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 65, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 55, 100, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 55, 100, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 55, 100, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 55, 103, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 55, 105, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.1f, -4.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-2.5f, -8.5f, -4.5f, 5, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.5f, -8.5f, 2.5f, 9, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.5f, -8.5f, -4.5f, 1, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-5.0f, -7.2f, -5.0f, 10, 1, 9, 0.0f, -0.3f, -0.2f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.6f, 0.6f, -0.3f, -0.6f, 0.6f, -0.3f, -0.2f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, 0.2f, 0.6f, -0.3f, 0.2f, 0.6f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, 0.5f, 2.5f, 9, 4, 3, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -2.5f, -3.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 1.1f, 0.0f, 0.0f, 1.1f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, 1.5f, -4.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.5f, -4.5f, -4.5f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.5f, -8.5f, -4.5f, 1, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.5f, -8.5f, -1.5f, 1, 12, 5, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -4.0f, 0.0f, -3.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(2.5f, -8.5f, -4.5f, 1, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.5f, -6.5f, 2.5f, 9, 7, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(3.5f, -8.5f, -1.5f, 1, 12, 5, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -4.0f, 0.0f, -3.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(3.5f, -8.5f, -4.5f, 1, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(3.5f, -4.5f, -4.5f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(3.5f, -2.5f, -3.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 1.1f, 0.0f, 0.0f, 1.1f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(3.5f, 1.5f, -4.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-3.0f, -4.1f, -4.0f, 2, 1, 1, 0.0f, 0.3f, 0.1f, 0.05f, 0.1f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.3f, 0.1f, 0.05f, 0.1f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(1.0f, -4.1f, -4.0f, 2, 1, 1, 0.0f, 0.1f, 0.1f, 0.05f, 0.3f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.1f, 0.1f, 0.05f, 0.3f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(1.0f, -4.1f, -4.0f, 2, 1, 1, 0.0f, 0.1f, 0.1f, 0.05f, 0.3f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f, 0.1f, 0.1f, 0.05f, 0.3f, 0.1f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, 0.05f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-3.0f, -4.1f, -4.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(1.0f, -4.1f, -4.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 102, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 102, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 113, 41, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 89, 57, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 121, 57, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 49, 73, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 73, 73, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 97, 73, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 25, 81, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 2.0f, -2.0f, 8, 3, 4, 0.0f, -0.5f, -0.1f, -0.1f, -0.5f, -0.1f, -0.1f, -0.5f, -1.0f, -0.5f, -0.5f, -1.0f, -0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.5f, -1.5f, -1.0f, 0.5f, -1.5f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.0f, -2.0f, 8, 2, 4, 0.0f, -1.2f, 0.0f, 0.7f, -1.2f, 0.0f, 0.7f, -0.8f, 0.0f, -0.5f, -0.8f, 0.0f, -0.5f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.5f, -1.5f, -0.5f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.5f, 5.0f, -3.0f, 7, 4, 4, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.7f, 0.0f, -0.2f, -0.7f, 0.0f, -0.2f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.0f, 11.0f, -2.0f, 6, 2, 4, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -2.5f, -0.5f, -1.0f, -2.5f, -0.5f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 3, 4, 0.0f, -1.0f, 0.0f, -1.5f, -1.0f, 0.0f, -1.5f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, -0.5f, -0.5f, -0.8f, 0.2f, -0.5f, -0.8f, 0.2f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 3, 4, 0.0f, 0.5f, -0.3f, 0.4f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.3f, 1.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, -1.0f, 2.0f, -1.0f, -1.0f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.8f, 1.0f, -0.8f, 0.5f, 0.3f, 0.4f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, -0.3f, 1.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 2.0f, -1.0f, -0.8f, 1.0f, -0.8f, -0.3f, 0.0f, -0.5f, -0.5f, 0.3f, 0.0f, 0.5f, 0.3f, 0.4f, 0.5f, -0.3f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 10.8f, -2.0f, 4, 3, 4, 0.0f, -0.5f, -0.3f, 0.0f, 0.5f, -0.3f, 0.4f, 0.5f, 0.3f, 1.0f, 0.0f, 0.0f, 1.0f, -0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.0f, 2.2f, -2.21f, 4, 2, 2, 0.0f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -1.9f, 0.2f, 0.0f, -1.7f, 0.2f, -0.5f, -1.2f, -2.0f, -0.5f, -1.2f, -2.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 0.2f, -2.19f, 4, 2, 2, 0.0f, -0.2f, -0.7f, -0.9f, -0.3f, -1.5f, -0.3f, -1.5f, -0.5f, -0.8f, 0.5f, 0.0f, -0.5f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-3.5f, 3.29f, -2.0f, 3, 2, 1, 0.0f, 0.0f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.3f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f, -0.1f, -1.6f, 0.0f, -0.2f, -1.6f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.01f, 0.21f, -2.21f, 4, 2, 2, 0.0f, -0.3f, -1.5f, -0.3f, -0.2f, -0.7f, -0.9f, 0.5f, 0.0f, -0.5f, -1.5f, -0.5f, -0.8f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 2.2f, -2.21f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.7f, 0.2f, -0.5f, -1.9f, 0.2f, -0.5f, -1.2f, -2.0f, -0.5f, -1.2f, -2.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.5f, 2.5f, -3.4f, 3, 1, 1, 0.0f, 0.0f, -0.4f, -0.5f, -0.1f, -0.2f, -0.5f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, -0.1f, -0.5f, 0.1f, -0.1f, -0.5f, 0.0f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.4f, 2.4f, -3.89f, 3, 1, 1, 0.0f, -0.7f, -1.0f, 0.0f, -0.2f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, -0.1f, -0.5f, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(0.4f, 2.4f, -4.9f, 3, 1, 1, 0.0f, -1.8f, -1.9f, 0.0f, -0.9f, -1.9f, 0.0f, -0.2f, -0.8f, 0.0f, -0.7f, -1.0f, 0.0f, -1.6f, 1.2f, 0.0f, -0.8f, 1.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(0.5f, 3.29f, -3.4f, 3, 2, 1, 0.0f, 0.2f, -0.1f, -0.5f, 0.1f, -0.1f, -0.5f, 0.0f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, -0.6f, 0.0f, -0.5f, 0.1f, 0.1f, -0.5f, 0.0f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.4f, 4.39f, -3.9f, 3, 1, 1, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.2f, 1.0f, 0.0f, 0.1f, 1.0f, 0.0f, -1.0f, 0.0f, 0.3f, -0.1f, 0.1f, 0.3f, 0.2f, 0.0f, 0.0f, -0.7f, -0.1f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(0.4f, 5.79f, -4.9f, 3, 1, 1, 0.0f, -1.6f, 1.2f, 0.0f, -0.8f, 1.2f, 0.0f, 0.0f, 1.9f, 0.0f, -0.4f, 1.9f, 0.0f, -1.8f, -1.9f, 0.0f, -0.9f, -1.9f, 0.0f, -0.1f, -1.3f, -0.3f, -1.0f, -1.4f, -0.3f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(0.5f, 3.29f, -2.0f, 3, 2, 1, 0.0f, 0.5f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 1.0f, 0.5f, 0.3f, 1.0f, 0.5f, 0.5f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, -0.2f, -1.6f, 0.0f, -0.1f, -1.6f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-3.0f, 8.0f, -3.0f, 3, 3, 5, 0.0f, 0.8f, -1.0f, -0.5f, -2.6f, -1.0f, 0.0f, 0.05f, 0.0f, -0.5f, 0.4f, 0.0f, 0.0f, 1.6f, 0.0f, -0.5f, 0.05f, 0.0f, -0.5f, 0.05f, 0.0f, 1.3f, 1.9f, 0.0f, 1.4f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-14.7f, -8.2f, -5.5f, 25, 25, 1, 0.0f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-10.3f, -8.2f, -5.5f, 25, 25, 1, 0.0f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f, -11.25f, -11.25f, -0.45f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-3.5f, 3.29f, -3.4f, 3, 2, 1, 0.0f, 0.1f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.5f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.1f, 0.1f, -0.5f, -0.6f, 0.0f, -0.5f, 0.5f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-3.4f, 4.39f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, 0.1f, 1.0f, 0.0f, 0.2f, 1.0f, 0.0f, -0.1f, 0.1f, 0.3f, -1.0f, 0.0f, 0.3f, -0.7f, -0.1f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-3.4f, 5.79f, -4.9f, 3, 1, 1, 0.0f, -0.8f, 1.2f, 0.0f, -1.6f, 1.2f, 0.0f, -0.4f, 1.9f, 0.0f, 0.0f, 1.9f, 0.0f, -0.9f, -1.9f, 0.0f, -1.8f, -1.9f, 0.0f, -1.0f, -1.4f, -0.3f, -0.1f, -1.3f, -0.3f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-3.5f, 2.5f, -3.4f, 3, 1, 1, 0.0f, -0.1f, -0.2f, -0.5f, 0.0f, -0.4f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.1f, -0.1f, -0.5f, 0.2f, -0.1f, -0.5f, 0.5f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-3.4f, 2.4f, -3.89f, 3, 1, 1, 0.0f, -0.2f, -0.8f, 0.0f, -0.7f, -1.0f, 0.0f, -0.1f, -0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, 0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-3.4f, 2.4f, -4.9f, 3, 1, 1, 0.0f, -0.9f, -1.9f, 0.0f, -1.8f, -1.9f, 0.0f, -0.7f, -1.0f, 0.0f, -0.2f, -0.8f, 0.0f, -0.8f, 1.2f, 0.0f, -1.6f, 1.2f, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(0.0f, 7.99f, -2.9f, 3, 3, 5, 0.0f, -2.6f, -1.0f, 0.0f, 0.8f, -1.0f, -0.5f, 0.4f, 0.0f, 0.0f, 0.05f, 0.0f, -0.5f, 0.05f, 0.0f, -0.5f, 1.6f, 0.0f, -0.5f, 1.9f, 0.0f, 1.4f, 0.05f, 0.0f, 1.3f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-2.5f, 9.0f, -3.5f, 5, 2, 1, 0.0f, 0.11f, 0.0f, -0.5f, 0.11f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -2.49f, 0.0f, -1.0f, -2.49f, 0.0f, -1.0f, -2.49f, 0.1f, 1.0f, -2.49f, 0.1f, 1.0f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-2.5f, 6.0f, -3.5f, 5, 3, 5, 0.0f, 0.6f, 0.0f, -0.5f, 0.6f, 0.0f, -0.5f, 0.6f, 0.1f, -0.5f, 0.6f, 0.1f, -0.5f, 0.11f, 0.0f, -0.5f, 0.11f, 0.0f, -0.5f, 1.0f, -0.7f, 0.5f, 1.0f, -0.7f, 0.5f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(-3.8f, 6.0f, -3.0f, 1, 3, 5, 0.0f, -0.7f, 0.0f, 0.0f, -0.29f, 0.0f, 0.0f, -0.3f, 0.1f, -1.0f, -0.69f, 0.1f, -1.0f, 0.0f, 0.0f, -0.5f, 0.21f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(2.8f, 6.0f, -3.0f, 1, 3, 5, 0.0f, -0.29f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.69f, 0.1f, -1.0f, -0.3f, 0.1f, -1.0f, 0.21f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-2.5f, 5.0f, -3.5f, 5, 1, 5, 0.0f, -1.75f, 0.0f, -0.5f, -1.75f, 0.0f, -0.5f, -1.5f, 2.0f, 0.4f, -1.5f, 2.0f, 0.4f, 0.6f, 0.0f, -0.5f, 0.6f, 0.0f, -0.5f, 0.6f, 0.1f, -0.5f, 0.6f, 0.1f, -0.5f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(-1.0f, 0.0f, 0.7f, 2, 3, 1, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(-0.5f, 3.0f, -3.0f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-0.5f, 0.0f, -3.0f, 1, 4, 1, 0.0f, -0.35f, 0.1f, -2.3f, -0.35f, 0.1f, -2.3f, -0.3f, 0.1f, 3.0f, -0.3f, 0.1f, 3.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-4.0f, -0.8f, -1.0f, 8, 1, 3, 0.0f, -2.0f, -0.5f, -0.4f, -2.0f, -0.5f, -0.4f, -2.0f, -0.5f, -0.5f, -2.0f, -0.5f, -0.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-4.0f, 0.2f, -1.0f, 8, 1, 3, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.7f, -0.5f, 0.2f, 0.7f, -0.5f, 0.2f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(-4.0f, 0.7f, -1.0f, 8, 1, 3, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.7f, 0.0f, 0.2f, 0.7f, 0.0f, 0.2f, -1.5f, -0.5f, 1.0f, -1.5f, -0.5f, 1.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-3.0f, 0.7f, -1.0f, 6, 1, 3, 0.0f, -0.5f, -0.5f, 1.0f, -0.5f, -0.5f, 1.0f, 1.2f, -1.0f, 0.2f, 1.2f, -1.0f, 0.2f, -2.5f, 0.0f, 1.3f, -2.5f, 0.0f, 1.3f, -1.5f, 2.0f, 0.2f, -1.5f, 2.0f, 0.2f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 65, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, 0.8f, 0.0f, -0.2f, -1.0f, -0.2f, -0.2f, -1.0f, -0.2f, -0.2f, 0.8f, 0.0f, -0.2f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 4.7f, -0.7f, 3, 6, 3, 0.0f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.6f, -0.5f, 0.8f, 0.0f, -0.5f, 0.8f, 0.0f, 0.0f, -1.8f, -0.6f, 0.0f, -1.8f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-0.8f, 8.0f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.5f, -0.3f, 0.0f, 0.5f, -0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-2.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, -1.0f, -0.2f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, -1.0f, -0.2f, -0.2f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-2.0f, 4.7f, -0.7f, 3, 6, 3, 0.0f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.0f, -0.5f, 0.8f, -0.6f, -0.5f, 0.8f, -0.6f, 0.0f, -1.8f, 0.0f, 0.0f, -1.8f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-2.2f, 8.0f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.5f, -0.3f, 0.0f, 0.5f, -0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 73, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 3, 4, 0.0f, -0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.2f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 4.8f, -2.0f, 4, 7, 4, 0.0f, -0.2f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.5f, 0.0f, -1.5f, -1.0f, 0.0f, -1.5f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-3.0f, -1.0f, -2.0f, 6, 6, 4, 0.0f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.4f, -0.5f, 0.2f, -0.4f, -0.5f, 0.2f, -0.4f, -0.5f, 0.0f, -0.4f, -0.5f, 0.0f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-3.0f, 4.5f, -2.0f, 6, 4, 4, 0.0f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -1.2f, 0.0f, -0.2f, -1.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.2f, 9.8f, -1.3f, 4, 1, 4, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 65, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 4.8f, -2.0f, 4, 7, 4, 0.0f, -0.1f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -1.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-1.8f, 9.8f, -1.3f, 4, 1, 4, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-3.0f, -1.0f, -2.0f, 6, 6, 4, 0.0f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.4f, -0.5f, 0.2f, -0.4f, -0.5f, 0.2f, -0.4f, -0.5f, 0.0f, -0.4f, -0.5f, 0.0f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-3.0f, 4.5f, -2.0f, 6, 4, 4, 0.0f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -1.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.5f, -1.2f, 0.0f, 0.5f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
