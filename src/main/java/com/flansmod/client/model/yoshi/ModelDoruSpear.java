// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.yoshi;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDoruSpear extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelDoruSpear() {
        this.textureX = 80;
        this.textureY = 19;
        this.gunModel = new ModelRendererTurbo[32];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 3, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 6, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 44, 12, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 44, 16, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 44, 14, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 38, 14, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 38, 12, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 32, 12, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 32, 14, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 25, 12, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 25, 14, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 19, 14, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 13, 14, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 19, 12, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 13, 12, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 7, 14, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 7, 12, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 1, 12, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 1, 14, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 50, 16, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 50, 14, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 50, 12, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 56, 12, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 56, 14, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 56, 16, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 60, 14, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 60, 12, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 65, 12, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo(this, 69, 12, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo(this, 69, 14, this.textureX, this.textureY);
        this.gunModel[31] = new ModelRendererTurbo(this, 65, 14, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(-20.0f, 0.0f, 0.0f, 38, 1, 1, 0.0f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.375f, -0.375f);
        this.gunModel[0].setRotationPoint(-2.0f, -2.5f, -0.25f);
        this.gunModel[1].addShapeBox(-20.0f, 0.0f, 0.0f, 38, 1, 1, 0.0f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f);
        this.gunModel[1].setRotationPoint(-2.0f, -2.5f, -0.5f);
        this.gunModel[2].addShapeBox(-20.0f, 0.0f, 0.0f, 38, 1, 1, 0.0f, 0.0f, -0.375f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.375f, -0.375f, 0.0f, -0.125f, -0.375f, 0.0f, -0.125f, -0.375f);
        this.gunModel[2].setRotationPoint(-2.0f, -2.5f, -0.75f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.325f, -0.325f, 0.0f, -0.375f, -0.45f, 0.0f, -0.125f, -0.25f, 0.0f, -0.075f, -0.375f, 0.0f, -0.325f, -0.325f, 0.0f, -0.375f, -0.45f, 0.0f, -0.125f, -0.25f, 0.0f, -0.075f, -0.375f);
        this.gunModel[3].setRotationPoint(16.0f, -2.5f, -0.75f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.075f, -0.375f, 0.0f, -0.125f, -0.25f, 0.0f, -0.375f, -0.45f, 0.0f, -0.325f, -0.325f, 0.0f, -0.075f, -0.375f, 0.0f, -0.125f, -0.25f, 0.0f, -0.375f, -0.45f, 0.0f, -0.325f, -0.325f);
        this.gunModel[4].setRotationPoint(16.0f, -2.5f, -0.25f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.075f, -0.375f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.075f, -0.375f, 0.0f, -0.075f, -0.375f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.075f, -0.375f);
        this.gunModel[5].setRotationPoint(16.0f, -2.5f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.125f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.575f, 0.0f, -0.375f, -0.45f, 0.0f, -0.125f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.575f, 0.0f, -0.375f, -0.45f);
        this.gunModel[6].setRotationPoint(18.0f, -2.5f, -0.25f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.375f, -0.45f, 0.0f, -0.5f, -0.575f, 0.0f, -0.25f, -0.3f, 0.0f, -0.125f, -0.3f, 0.0f, -0.375f, -0.45f, 0.0f, -0.5f, -0.575f, 0.0f, -0.25f, -0.25f, 0.0f, -0.125f, -0.25f);
        this.gunModel[7].setRotationPoint(18.0f, -2.5f, -0.75f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, -0.575f, 0.125f, -0.5f, -0.775f, 0.125f, -0.475f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.575f, 0.125f, -0.5f, -0.775f, 0.125f, -0.475f, -0.25f, 0.0f, -0.25f, -0.25f);
        this.gunModel[8].setRotationPoint(20.0f, -2.5f, -0.75f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.125f, -0.475f, -0.25f, 0.125f, -0.5f, -0.775f, 0.0f, -0.5f, -0.575f, 0.0f, -0.25f, -0.25f, 0.125f, -0.475f, -0.25f, 0.125f, -0.5f, -0.775f, 0.0f, -0.5f, -0.575f);
        this.gunModel[9].setRotationPoint(20.0f, -2.5f, -0.25f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.25f, -0.725f, -0.25f, 0.0f, -0.675f, -0.25f, 0.125f, -0.25f, -0.75f, -0.125f, -0.25f, -0.75f, -0.25f, -0.725f, -0.25f, 0.0f, -0.675f, -0.25f, 0.125f, -0.25f, -0.75f, -0.125f, -0.25f);
        this.gunModel[10].setRotationPoint(16.75f, -2.5f, -0.75f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.25f, -0.725f, -0.25f, 0.0f, -0.675f, -0.25f, 0.125f, -0.25f, -0.75f, -0.125f, -0.25f, -0.75f, -0.25f, -0.725f, -0.25f, 0.0f, -0.675f, -0.25f, 0.125f, -0.25f, -0.75f, -0.125f, -0.25f);
        this.gunModel[11].setRotationPoint(16.75f, -1.5f, 0.75f);
        this.gunModel[11].rotateAngleX = 3.1415927f;
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, 0.0f, -0.675f, -0.5f, -0.1f, -0.625f, -0.5f, 0.025f, -0.25f, -0.75f, 0.125f, -0.25f, -0.75f, 0.0f, -0.675f, -0.5f, -0.1f, -0.625f, -0.5f, 0.025f, -0.25f, -0.75f, 0.125f, -0.25f);
        this.gunModel[12].setRotationPoint(17.75f, -1.5f, 0.75f);
        this.gunModel[12].rotateAngleX = 3.1415927f;
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.1f, -0.625f, -0.25f, -0.225f, -0.625f, -0.25f, -0.1f, -0.25f, -0.75f, 0.025f, -0.25f, -0.75f, -0.1f, -0.625f, -0.25f, -0.225f, -0.625f, -0.25f, -0.1f, -0.25f, -0.75f, 0.025f, -0.25f);
        this.gunModel[13].setRotationPoint(18.5f, -1.5f, 0.75f);
        this.gunModel[13].rotateAngleX = 3.1415927f;
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, 0.0f, -0.675f, -0.5f, -0.1f, -0.625f, -0.5f, 0.025f, -0.25f, -0.75f, 0.125f, -0.25f, -0.75f, 0.0f, -0.675f, -0.5f, -0.1f, -0.625f, -0.5f, 0.025f, -0.25f, -0.75f, 0.125f, -0.25f);
        this.gunModel[14].setRotationPoint(17.75f, -2.5f, -0.75f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.1f, -0.625f, -0.25f, -0.225f, -0.625f, -0.25f, -0.1f, -0.25f, -0.75f, 0.025f, -0.25f, -0.75f, -0.1f, -0.625f, -0.25f, -0.225f, -0.625f, -0.25f, -0.1f, -0.25f, -0.75f, 0.025f, -0.25f);
        this.gunModel[15].setRotationPoint(18.5f, -2.5f, -0.75f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.225f, -0.625f, -0.25f, -0.4f, -0.725f, -0.25f, -0.275f, -0.25f, -0.75f, -0.1f, -0.25f, -0.75f, -0.225f, -0.625f, -0.25f, -0.4f, -0.725f, -0.25f, -0.275f, -0.25f, -0.75f, -0.1f, -0.25f);
        this.gunModel[16].setRotationPoint(19.5f, -1.5f, 0.75f);
        this.gunModel[16].rotateAngleX = 3.1415927f;
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.225f, -0.625f, -0.25f, -0.4f, -0.725f, -0.25f, -0.275f, -0.25f, -0.75f, -0.1f, -0.25f, -0.75f, -0.225f, -0.625f, -0.25f, -0.4f, -0.725f, -0.25f, -0.275f, -0.25f, -0.75f, -0.1f, -0.25f);
        this.gunModel[17].setRotationPoint(19.5f, -2.5f, -0.75f);
        this.gunModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.4f, -0.725f, -0.375f, -0.5f, -0.75f, -0.375f, -0.475f, -0.25f, -0.75f, -0.275f, -0.25f, -0.75f, -0.4f, -0.725f, -0.375f, -0.5f, -0.75f, -0.375f, -0.475f, -0.25f, -0.75f, -0.275f, -0.25f);
        this.gunModel[18].setRotationPoint(20.5f, -2.5f, -0.75f);
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.75f, -0.4f, -0.725f, -0.375f, -0.5f, -0.75f, -0.375f, -0.475f, -0.25f, -0.75f, -0.275f, -0.25f, -0.75f, -0.4f, -0.725f, -0.375f, -0.5f, -0.75f, -0.375f, -0.475f, -0.25f, -0.75f, -0.275f, -0.25f);
        this.gunModel[19].setRotationPoint(20.5f, -1.5f, 0.75f);
        this.gunModel[19].rotateAngleX = 3.1415927f;
        this.gunModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.375f, 0.0f, -0.225f, -0.25f, 0.0f, -0.475f, -0.5f, 0.0f, -0.35f, -0.35f, 0.0f, -0.1f, -0.375f, 0.0f, -0.225f, -0.25f, 0.0f, -0.475f, -0.5f, 0.0f, -0.35f, -0.35f);
        this.gunModel[20].setRotationPoint(-22.0f, -1.5f, -0.25f);
        this.gunModel[20].rotateAngleX = 3.1415927f;
        this.gunModel[20].rotateAngleY = -3.1415927f;
        this.gunModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.375f, 0.0f, -0.225f, -0.5f, 0.0f, -0.225f, -0.5f, 0.0f, -0.1f, -0.375f, 0.0f, -0.1f, -0.375f, 0.0f, -0.225f, -0.5f, 0.0f, -0.225f, -0.5f, 0.0f, -0.1f, -0.375f);
        this.gunModel[21].setRotationPoint(-22.0f, -1.5f, -0.5f);
        this.gunModel[21].rotateAngleX = 3.1415927f;
        this.gunModel[21].rotateAngleY = -3.1415927f;
        this.gunModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.35f, -0.35f, 0.0f, -0.475f, -0.5f, 0.0f, -0.225f, -0.25f, 0.0f, -0.1f, -0.375f, 0.0f, -0.35f, -0.35f, 0.0f, -0.475f, -0.5f, 0.0f, -0.225f, -0.25f, 0.0f, -0.1f, -0.375f);
        this.gunModel[22].setRotationPoint(-22.0f, -1.5f, -0.75f);
        this.gunModel[22].rotateAngleX = 3.1415927f;
        this.gunModel[22].rotateAngleY = -3.1415927f;
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.45f, -0.5f, 0.0f, -0.475f, -0.6f, 0.0f, -0.325f, -0.25f, 0.0f, -0.225f, -0.375f, 0.0f, -0.45f, -0.5f, 0.0f, -0.475f, -0.6f, 0.0f, -0.325f, -0.25f, 0.0f, -0.225f, -0.375f);
        this.gunModel[23].setRotationPoint(-24.0f, -1.5f, -0.75f);
        this.gunModel[23].rotateAngleX = 3.1415927f;
        this.gunModel[23].rotateAngleY = -3.1415927f;
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.225f, -0.375f, 0.0f, -0.325f, -0.5f, 0.0f, -0.325f, -0.5f, 0.0f, -0.225f, -0.375f, 0.0f, -0.225f, -0.375f, 0.0f, -0.325f, -0.5f, 0.0f, -0.325f, -0.5f, 0.0f, -0.225f, -0.375f);
        this.gunModel[24].setRotationPoint(-24.0f, -1.5f, -0.5f);
        this.gunModel[24].rotateAngleX = 3.1415927f;
        this.gunModel[24].rotateAngleY = -3.1415927f;
        this.gunModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.225f, -0.375f, 0.0f, -0.325f, -0.25f, 0.0f, -0.475f, -0.6f, 0.0f, -0.45f, -0.5f, 0.0f, -0.225f, -0.375f, 0.0f, -0.325f, -0.25f, 0.0f, -0.475f, -0.6f, 0.0f, -0.45f, -0.5f);
        this.gunModel[25].setRotationPoint(-24.0f, -1.5f, -0.25f);
        this.gunModel[25].rotateAngleX = 3.1415927f;
        this.gunModel[25].rotateAngleY = -3.1415927f;
        this.gunModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.325f, -0.25f, 0.0f, -0.325f, -0.25f, 0.0f, -0.475f, -0.6f, 0.0f, -0.475f, -0.6f, 0.0f, -0.325f, -0.25f, 0.0f, -0.325f, -0.25f, 0.0f, -0.475f, -0.6f, 0.0f, -0.475f, -0.6f);
        this.gunModel[26].setRotationPoint(-25.0f, -1.5f, -0.25f);
        this.gunModel[26].rotateAngleX = 3.1415927f;
        this.gunModel[26].rotateAngleY = -3.1415927f;
        this.gunModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.475f, -0.6f, 0.0f, -0.475f, -0.6f, 0.0f, -0.325f, -0.25f, 0.0f, -0.325f, -0.25f, 0.0f, -0.475f, -0.6f, 0.0f, -0.475f, -0.6f, 0.0f, -0.325f, -0.25f, 0.0f, -0.325f, -0.25f);
        this.gunModel[27].setRotationPoint(-25.0f, -1.5f, -0.75f);
        this.gunModel[27].rotateAngleX = 3.1415927f;
        this.gunModel[27].rotateAngleY = -3.1415927f;
        this.gunModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.7f, -0.85f, -0.5f, -0.6f, -0.85f, -0.325f, -0.25f, 0.0f, -0.425f, -0.25f, 0.0f, -0.5f, -0.7f, -0.85f, -0.5f, -0.6f, -0.85f, -0.325f, -0.25f, 0.0f, -0.425f, -0.25f);
        this.gunModel[28].setRotationPoint(-26.0f, -1.5f, -0.75f);
        this.gunModel[28].rotateAngleX = 3.1415927f;
        this.gunModel[28].rotateAngleY = -3.1415927f;
        this.gunModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.6f, -0.85f, -0.5f, -0.75f, -0.85f, -0.5f, -0.25f, 0.0f, -0.325f, -0.25f, 0.0f, -0.5f, -0.6f, -0.85f, -0.5f, -0.75f, -0.85f, -0.5f, -0.25f, 0.0f, -0.325f, -0.25f);
        this.gunModel[29].setRotationPoint(-26.15f, -1.5f, -0.75f);
        this.gunModel[29].rotateAngleX = 3.1415927f;
        this.gunModel[29].rotateAngleY = -3.1415927f;
        this.gunModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.75f, -0.85f, -0.5f, -0.6f, -0.85f, -0.325f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.75f, -0.85f, -0.5f, -0.6f, -0.85f, -0.325f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.gunModel[30].setRotationPoint(-26.3f, -1.5f, 0.75f);
        this.gunModel[30].rotateAngleX = 3.1415927f;
        this.gunModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.5f, -0.6f, -0.85f, -0.5f, -0.7f, -0.85f, -0.425f, -0.25f, 0.0f, -0.325f, -0.25f, 0.0f, -0.5f, -0.6f, -0.85f, -0.5f, -0.7f, -0.85f, -0.425f, -0.25f, 0.0f, -0.325f, -0.25f);
        this.gunModel[31].setRotationPoint(-26.15f, -1.5f, 0.75f);
        this.gunModel[31].rotateAngleX = 3.1415927f;
    }
}
