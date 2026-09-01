// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSugarloaf extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSugarloaf() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[44];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[38] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[39] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[40] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[41] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[42] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[43] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-6.0f, -8.0f, -5.5f, 6, 4, 6, 0.0f, -2.0f, 0.1f, -1.2f, 0.0f, 0.1f, -0.7f, 0.0f, 0.1f, 0.0f, -1.7f, 0.1f, 0.0f, -0.7f, 0.2f, 0.0f, 0.0f, 0.2f, 0.8f, 0.0f, 0.2f, 0.0f, 0.2f, -0.3f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-0.5f, -9.0f, -5.4f, 1, 6, 1, 0.0f, -0.1f, -0.8f, -0.5f, -0.1f, -0.8f, -0.5f, -0.2f, 1.2f, 1.1f, -0.2f, 1.2f, 1.1f, 0.1f, -0.5f, 1.3f, 0.1f, -0.5f, 1.3f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.7f, -1.45f, -5.95f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-1.7f, -0.65f, -5.85f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-1.7f, 0.15f, -5.8f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-6.0f, -2.8f, -5.5f, 6, 5, 6, 0.0f, -0.7f, 0.2f, 0.0f, 0.0f, 0.2f, 0.8f, 0.0f, 0.2f, 0.0f, 0.15f, 0.7f, 0.0f, -1.0f, -0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, 0.0f, -0.3f, -1.5f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-6.0f, -8.0f, 0.5f, 6, 4, 5, 0.0f, -1.7f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.5f, -2.0f, 0.1f, -1.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.3f, 0.8f, -0.7f, -0.3f, -0.2f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-6.0f, -3.6f, 0.5f, 6, 5, 5, 0.0f, 0.3f, 0.7f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.7f, 1.0f, -0.6f, 0.7f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, 0.2f, 0.7f, -1.3f, -0.2f, -0.2f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-0.5f, -4.0f, -5.4f, 1, 6, 1, 0.0f, 0.1f, -0.5f, 1.3f, 0.1f, -0.5f, 1.3f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, -0.1f, 0.9f, 0.3f, -0.1f, 0.9f, 0.3f, 0.0f, 0.5f, -0.3f, 0.0f, 0.5f, -0.3f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-1.7f, -2.2f, -6.0f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-1.7f, 0.9f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-6.2f, -3.2f, -5.5f, 6, 1, 6, 0.0f, -0.8f, 0.0f, 0.5f, 0.0f, -0.2f, 1.0f, 0.0f, 0.3f, 0.2f, 0.2f, 0.6f, 0.2f, -0.9f, -0.4f, 0.2f, 0.0f, -0.1f, 0.8f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-6.2f, -4.5f, -5.5f, 6, 1, 6, 0.0f, -0.9f, -0.2f, 0.2f, 0.0f, -0.1f, 0.8f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, -0.8f, -0.2f, 0.5f, 0.0f, -0.2f, 1.0f, 0.0f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-5.7f, -4.5f, -5.5f, 2, 1, 6, 0.0f, -0.3f, -0.8f, 0.5f, -0.2f, -0.8f, 0.61f, -0.2f, -0.2f, 0.2f, 0.7f, -0.3f, 0.2f, -0.3f, 0.3f, 0.5f, -0.2f, 0.37f, 0.65f, -0.2f, -0.1f, 0.2f, 0.7f, -0.3f, 0.2f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-2.5f, -1.6f, -5.85f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-2.5f, -0.8f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-2.5f, -1.110223E-16f, -5.65f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-2.5f, 0.75f, -5.55f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-2.5f, -2.35f, -5.9f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-3.35f, -2.45f, -5.8f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-3.35f, -1.7f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-3.35f, -0.9f, -5.65f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-3.35f, -0.1f, -5.45f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-3.35f, 0.65f, -5.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-4.25f, -2.55f, -5.65f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-4.25f, -1.8f, -5.6f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-4.25f, -1.0f, -5.4f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-4.25f, -0.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(-4.25f, 0.55f, -5.1f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-4.0f, -10.2f, -5.5f, 4, 2, 6, 0.0f, -1.1f, 0.2f, -2.6f, 0.0f, 0.2f, -2.3f, 0.0f, 0.2f, 0.0f, -0.7f, 0.2f, 0.0f, 0.0f, 0.1f, -1.2f, 0.0f, 0.1f, -0.7f, 0.0f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f);
        this.headModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(-4.0f, -10.2f, 0.5f, 4, 2, 5, 0.0f, -0.7f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -1.2f, -0.9f, 0.0f, -1.7f, 0.3f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, -0.5f, 0.0f, 0.1f, -1.0f);
        this.headModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(-3.0f, -12.2f, -2.5f, 3, 2, 3, 0.0f, -1.7f, -0.9f, -1.0f, 0.0f, -0.7f, -1.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.7f, 0.0f, -0.2f, -0.2f, 0.3f, 0.0f, -0.2f, 0.6f, 0.0f, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f);
        this.headModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-3.0f, -12.2f, 0.5f, 3, 2, 3, 0.0f, -1.0f, -0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.7f, -1.0f, -1.7f, -0.9f, -1.0f, 0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.2f);
        this.headModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(3.7f, -4.5f, -5.5f, 2, 1, 6, 0.0f, -0.2f, -0.8f, 0.61f, -0.3f, -0.8f, 0.5f, 0.7f, -0.3f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, 0.37f, 0.65f, -0.3f, 0.3f, 0.5f, 0.7f, -0.3f, 0.2f, -0.2f, -0.1f, 0.2f);
        this.headModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(0.0f, -8.0f, -5.5f, 6, 4, 6, 0.0f, 0.0f, 0.1f, -0.7f, -2.0f, 0.1f, -1.2f, -1.7f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.2f, 0.8f, -0.7f, 0.2f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.headModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(0.0f, -2.8f, -5.5f, 6, 5, 6, 0.0f, 0.0f, 0.2f, 0.8f, -0.7f, 0.2f, 0.0f, 0.15f, 0.7f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, -0.5f, -1.0f, -0.3f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f);
        this.headModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(0.0f, -3.6f, 0.5f, 6, 5, 5, 0.0f, 0.0f, 0.2f, 0.0f, 0.3f, 0.7f, 0.0f, -0.6f, 0.7f, 0.0f, 0.0f, 0.7f, 1.0f, 0.0f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, -1.3f, -0.2f, -0.2f, 0.0f, 0.2f, 0.7f);
        this.headModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(0.0f, -8.0f, 0.5f, 6, 4, 5, 0.0f, 0.0f, 0.1f, 0.0f, -1.7f, 0.1f, 0.0f, -2.0f, 0.1f, -1.0f, 0.0f, 0.1f, -0.5f, 0.0f, 0.2f, 0.0f, 0.2f, -0.3f, 0.0f, -0.7f, -0.3f, -0.2f, 0.0f, -0.3f, 0.8f);
        this.headModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[38].addShapeBox(0.0f, -10.2f, 0.5f, 4, 2, 5, 0.0f, 0.0f, 0.2f, 0.0f, -0.7f, 0.2f, 0.0f, -0.9f, 0.0f, -1.7f, 0.0f, 0.0f, -1.2f, 0.0f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.0f, 0.1f, -1.0f, 0.0f, 0.1f, -0.5f);
        this.headModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[39].addShapeBox(0.0f, -12.2f, 0.5f, 3, 2, 3, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.7f, 0.0f, -1.7f, -0.9f, -1.0f, 0.0f, -0.7f, -1.0f, 0.0f, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.6f);
        this.headModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[40].addShapeBox(0.0f, -12.2f, -2.5f, 3, 2, 3, 0.0f, 0.0f, -0.7f, -1.0f, -1.7f, -0.9f, -1.0f, -1.0f, -0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.2f, 0.6f, -0.2f, -0.2f, 0.3f, 0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[41].addShapeBox(0.0f, -10.2f, -5.5f, 4, 2, 6, 0.0f, 0.0f, 0.2f, -2.3f, -1.1f, 0.2f, -2.6f, -0.7f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.1f, -0.7f, 0.0f, 0.1f, -1.2f, 0.3f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.headModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[42].addShapeBox(0.2f, -4.5f, -5.5f, 6, 1, 6, 0.0f, 0.0f, -0.1f, 0.8f, -0.9f, -0.2f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.2f, 1.0f, -0.8f, -0.2f, 0.5f, 0.2f, -0.7f, 0.2f, 0.0f, -0.7f, 0.2f);
        this.headModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[43].addShapeBox(0.2f, -3.2f, -5.5f, 6, 1, 6, 0.0f, 0.0f, -0.2f, 1.0f, -0.8f, 0.0f, 0.5f, 0.2f, 0.6f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, -0.1f, 0.8f, -0.9f, -0.4f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.headModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
