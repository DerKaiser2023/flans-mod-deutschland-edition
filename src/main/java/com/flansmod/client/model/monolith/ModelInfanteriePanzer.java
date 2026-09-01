// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelInfanteriePanzer extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelInfanteriePanzer() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[56];
        this.leftArmModel = new ModelRendererTurbo[2];
        this.rightArmModel = new ModelRendererTurbo[2];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[3];
        this.skirtFrontModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 113, 41, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 89, 49, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 73, 57, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 17, 57, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 113, 57, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 41, 57, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.3f, 7.7f, -2.2f, 9, 1, 5, 0.0f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, -2.3f, 2, 1, 1, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-2.0f, 0.0f, -2.3f, 2, 1, 1, 0.0f, 0.0f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-0.5f, 8.0f, -2.2f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.2f, 7.85f, 1.05f, 3, 2, 2, 0.0f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.2f, 7.35f, 1.1f, 3, 1, 2, 0.0f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-2.2f, 8.05f, 2.15f, 1, 1, 1, 0.0f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-2.2f, 8.25f, 2.2f, 1, 1, 1, 0.0f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-2.2f, 10.05f, 2.0f, 1, 1, 1, 0.0f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-2.2f, 12.2f, 2.0f, 1, 1, 1, 0.0f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-2.2f, 14.2f, 2.0f, 1, 1, 1, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-2.2f, 14.6f, 2.0f, 1, 1, 1, 0.0f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(1.8f, 8.3f, 2.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(1.8f, 7.4f, 2.0f, 2, 1, 1, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(1.8f, 7.15f, 2.0f, 2, 1, 1, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(1.8f, 8.75f, 2.0f, 2, 1, 1, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(1.8f, 9.45f, 2.0f, 2, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(1.8f, 7.2f, 2.1f, 2, 1, 1, 0.0f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(1.8f, 6.6f, 2.1f, 2, 1, 1, 0.0f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-0.5f, 1.0f, -2.15f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.0f, -0.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.0f, 0.1f, -1.5f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-4.0f, 0.9f, -2.0f, 8, 11, 4, 0.0f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, -0.1f, -2.0f, 4, 1, 4, 0.0f, -1.5f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-1.5f, -0.09f, -2.05f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.14f, 0.0f, 0.0f, 3.14f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(2.37f, 7.95f, 2.27f, 12, 6, 1, 0.0f, 0.0f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, 0.0f, -0.2f, -0.22f, 0.0f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, 0.0f, -5.25f, -0.22f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-2.13f, 9.15f, 2.12f, 12, 6, 1, 0.0f, 0.0f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, 0.0f, -0.2f, -0.22f, 0.0f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, 0.0f, -5.25f, -0.22f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-2.1f, 0.0f, -2.31f, 2, 1, 1, 0.0f, -0.6f, -0.22f, 0.0f, -0.75f, 0.05f, 0.0f, -0.75f, 0.05f, 0.0f, -0.6f, -0.22f, 0.0f, -1.2f, 0.25f, 0.0f, -0.15f, -0.05f, 0.0f, -0.15f, -0.05f, 0.0f, -1.2f, 0.25f, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(0.1f, 0.0f, -2.31f, 2, 1, 1, 0.0f, -0.75f, 0.05f, 0.0f, -0.6f, -0.22f, 0.0f, -0.6f, -0.22f, 0.0f, -0.75f, 0.05f, 0.0f, -0.15f, -0.05f, 0.0f, -1.2f, 0.25f, 0.0f, -1.2f, 0.25f, 0.0f, -0.15f, -0.05f, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-4.0f, 1.5f, -3.0f, 2, 5, 3, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(2.0f, -0.5f, -0.5f, 2, 3, 3, 0.0f, -0.5f, 0.2f, -0.5f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.2f, -0.1f, 0.0f, 0.2f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(2.0f, 1.5f, -3.0f, 2, 5, 3, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.5f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-4.0f, -0.5f, -0.5f, 2, 3, 3, 0.0f, 0.5f, 0.0f, -0.5f, -0.5f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.2f, -0.1f, -0.2f, 0.2f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-2.0f, 1.5f, -3.0f, 4, 5, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(1.7f, 6.2f, -3.0f, 2, 3, 3, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.3f, 0.5f, -0.2f, -0.4f, 0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-2.0f, 6.2f, -3.0f, 4, 3, 1, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-3.7f, 6.2f, -3.0f, 2, 3, 3, 0.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.2f, -0.4f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(1.2f, 8.7f, -3.0f, 2, 3, 3, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.3f, 0.5f, -0.2f, -0.4f, 0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(-1.5f, 8.7f, -3.0f, 3, 3, 1, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-3.2f, 8.7f, -3.0f, 2, 3, 3, 0.0f, 0.5f, 0.0f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.2f, -0.4f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(2.0f, -0.5f, -3.0f, 2, 2, 3, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, -0.2f, -0.5f, 0.5f, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, -0.2f, 0.2f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-2.0f, -0.5f, -3.0f, 4, 2, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(-4.0f, -0.5f, -3.0f, 2, 2, 3, 0.0f, 0.5f, -0.2f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, -0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-4.0f, 11.7f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addShapeBox(-4.3f, 7.7f, -3.2f, 3, 1, 1, 0.0f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, 0.2f, -0.5f, 0.1f, -0.2f, 0.1f, 0.1f, 0.2f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, 0.2f, -0.5f, 0.1f, -0.2f, 0.1f, 0.1f, 0.2f);
        this.bodyModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[44].addShapeBox(1.3f, 7.7f, -3.2f, 3, 1, 1, 0.0f, -0.5f, 0.1f, 0.2f, -0.1f, 0.1f, -0.2f, 0.1f, 0.1f, 0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, 0.2f, -0.1f, 0.1f, -0.2f, 0.1f, 0.1f, 0.2f, -0.5f, 0.1f, -0.2f);
        this.bodyModel[44].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[45].addShapeBox(-2.0f, 7.7f, -3.2f, 4, 1, 1, 0.0f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f);
        this.bodyModel[45].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[46].addShapeBox(0.0f, 11.7f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.5f, 0.5f);
        this.bodyModel[46].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[47].addShapeBox(2.6f, 7.5f, -4.0f, 2, 3, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.2f, -0.1f, -0.2f, -0.3f, -0.1f, 0.2f, -0.3f, -0.1f, 0.0f);
        this.bodyModel[47].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[48].addShapeBox(1.0f, 7.5f, -4.2f, 2, 3, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, 0.2f, -0.2f, -0.3f, 0.0f, -0.6f, 0.1f, 0.0f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, 0.2f, -0.6f, 0.1f, 0.0f);
        this.bodyModel[48].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[49].addShapeBox(-0.7f, 7.6f, -4.2f, 2, 3, 1, 0.0f, 0.0f, -0.5f, 0.0f, -0.6f, -0.1f, -0.1f, -0.6f, -0.1f, 0.2f, 0.0f, -0.5f, 0.0f, -0.9f, 0.3f, 0.0f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, 0.2f, -0.9f, 0.3f, 0.0f);
        this.bodyModel[49].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[50].addShapeBox(-3.9f, 7.3f, -4.4f, 2, 2, 2, 0.0f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f);
        this.bodyModel[50].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[51].addShapeBox(-3.9f, 9.5f, -4.4f, 2, 4, 2, 0.0f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f);
        this.bodyModel[51].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[52].addShapeBox(-3.9f, 9.0f, -4.4f, 2, 1, 2, 0.0f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f);
        this.bodyModel[52].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[53].addShapeBox(-5.7f, 7.5f, -3.3f, 2, 2, 2, 0.0f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f);
        this.bodyModel[53].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[54].addShapeBox(-5.7f, 9.2f, -3.3f, 2, 1, 2, 0.0f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f, -0.15f, -0.4f, -0.15f);
        this.bodyModel[54].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[55].addShapeBox(-5.7f, 9.7f, -3.3f, 2, 4, 2, 0.0f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.1f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f, -0.65f, 0.4f, -0.65f);
        this.bodyModel[55].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.1f, -2.0f, 4, 9, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 7.5f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.1f, -2.0f, 4, 9, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 7.5f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 7, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 7, 4, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-2.0f, -1.2f, -2.8f, 4, 2, 1, 0.0f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-2.0f, 0.8f, -2.8f, 4, 2, 1, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
