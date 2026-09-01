// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelFullKrug extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelFullKrug() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[40];
        this.leftArmModel = new ModelRendererTurbo[7];
        this.rightArmModel = new ModelRendererTurbo[7];
        this.leftLegModel = new ModelRendererTurbo[13];
        this.rightLegModel = new ModelRendererTurbo[13];
        this.skirtFrontModel = new ModelRendererTurbo[1];
        this.skirtRearModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 4.8f, -2.5f, 9, 6, 5, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 10.55f, -2.0f, 4, 1, 4, 0.0f, 0.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 5, 5, 0.0f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.5f, 6.0f, -3.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.5f, 2.5f, -3.7f, 9, 2, 1, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.5f, 4.0f, -3.7f, 9, 2, 1, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.5f, 8.0f, -3.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.5f, 9.5f, -3.7f, 9, 2, 1, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-1.5f, 6.5f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-1.5f, 5.5f, -3.9f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-1.5f, 7.5f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.5f, 0.2f, -3.5f, 3, 2, 1, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.5f, -0.8f, -3.5f, 3, 3, 7, 0.0f, 1.0f, -0.1f, -0.7f, -1.2f, 0.4f, -0.7f, -1.2f, 0.4f, -0.7f, 1.0f, -0.1f, -0.7f, -1.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 1.5f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-5.5f, 5.8f, -3.0f, 1, 2, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, 0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-5.5f, 4.8f, -3.0f, 1, 1, 3, 0.0f, -0.6f, 0.3f, -0.2f, 0.5f, 0.5f, 0.3f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-5.5f, 8.0f, -3.0f, 1, 1, 3, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.3f, -0.2f, 0.5f, 0.5f, 0.3f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.5f, 9.5f, 2.7f, 9, 2, 1, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-1.5f, 7.5f, 2.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-5.5f, 5.0f, -2.0f, 1, 1, 4, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-5.5f, 8.0f, -2.0f, 1, 1, 4, 0.0f, 0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-1.5f, -0.8f, 2.5f, 3, 3, 1, 0.0f, 1.2f, 0.4f, 1.0f, 1.2f, 0.4f, 1.0f, 1.2f, 0.4f, -0.7f, 1.2f, 0.4f, -0.7f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-2.5f, -1.2f, -1.5f, 5, 1, 3, 0.0f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.3f, -0.2f, 1.2f, 0.3f, -0.2f, 1.2f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-4.5f, 8.0f, 2.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-4.5f, 6.0f, 2.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-4.5f, 4.0f, 2.7f, 9, 2, 1, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-4.5f, 2.5f, 2.7f, 9, 2, 1, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-1.5f, 6.5f, 2.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-1.5f, 5.5f, 2.9f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(1.5f, -0.8f, -3.5f, 3, 3, 7, 0.0f, -1.2f, 0.4f, -0.7f, 1.0f, -0.1f, -0.7f, 1.0f, -0.1f, -0.7f, -1.2f, 0.4f, -0.7f, 0.5f, 0.0f, 0.0f, -1.0f, 1.5f, 0.0f, -1.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(4.5f, 4.8f, -3.0f, 1, 1, 3, 0.0f, 0.5f, 0.5f, 0.3f, -0.6f, 0.3f, -0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(4.5f, 5.8f, -3.0f, 1, 2, 3, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.2f, 0.3f, -0.2f, 0.2f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(4.5f, 8.0f, -3.0f, 1, 1, 3, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.3f, -0.6f, 0.3f, -0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(4.5f, 5.0f, -2.0f, 1, 1, 4, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(4.5f, 8.0f, -2.0f, 1, 1, 4, 0.0f, -0.6f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-5.5f, 5.8f, 0.0f, 1, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f, 0.3f, -0.2f, 0.2f, -0.2f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-5.5f, 4.8f, 0.0f, 1, 1, 3, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.3f, -0.6f, 0.3f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(-5.5f, 8.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, -0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.3f, -0.6f, 0.3f, -0.2f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(4.5f, 8.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.6f, 0.3f, -0.2f, 0.5f, 0.5f, 0.3f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(4.5f, 5.8f, 0.0f, 1, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, 0.3f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(4.5f, 4.8f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.6f, 0.3f, -0.2f, 0.5f, 0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 0.3f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 5.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 8.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, 9.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(3.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(3.0f, 0.6f, -2.0f, 1, 3, 4, 0.0f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(1.0f, -2.0f, -2.0f, 2, 2, 4, 0.0f, 0.0f, 0.6f, 0.4f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.0f, 0.6f, 0.4f, -0.7f, -0.9f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, -0.7f, -0.9f, 0.5f);
        this.leftArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 5.0f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-4.0f, 0.6f, -2.0f, 1, 3, 4, 0.0f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.0f, 8.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.0f, 9.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-3.0f, -2.0f, -2.0f, 2, 2, 4, 0.0f, 0.3f, 0.4f, 0.3f, 0.0f, 0.6f, 0.4f, 0.0f, 0.6f, 0.4f, 0.3f, 0.4f, 0.3f, 0.8f, 0.0f, 0.5f, -0.7f, -0.9f, 0.5f, -0.7f, -0.9f, 0.5f, 0.8f, 0.0f, 0.5f);
        this.rightArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftLegModel[6] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.leftLegModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.leftLegModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.leftLegModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[12] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 4.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-1.5f, 5.0f, -2.55f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(-1.5f, 6.0f, -2.55f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[6].addShapeBox(-1.5f, 7.0f, -2.55f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.leftLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].addShapeBox(1.7f, 5.1f, -2.0f, 1, 3, 4, 0.0f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f);
        this.leftLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[8].addShapeBox(1.7f, 8.5f, -2.0f, 1, 3, 4, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f);
        this.leftLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[9].addShapeBox(-2.0f, 3.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[10].addShapeBox(-2.0f, 2.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[11].addShapeBox(-2.0f, 1.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[12].addShapeBox(-2.0f, 0.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[6] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.rightLegModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.rightLegModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.rightLegModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[12] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-1.5f, 6.0f, -2.55f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-1.5f, 5.0f, -2.55f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-1.5f, 7.0f, -2.55f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-2.0f, 4.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[6].addShapeBox(-2.7f, 8.5f, -2.0f, 1, 3, 4, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f);
        this.rightLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[7].addShapeBox(-2.7f, 5.1f, -2.0f, 1, 3, 4, 0.0f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.rightLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[8].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 1, 4, 0.0f, 0.5f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.2f, -0.1f, 0.2f, 0.5f, -0.1f, 0.2f);
        this.rightLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[9].addShapeBox(-2.0f, 3.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[10].addShapeBox(-2.0f, 2.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[11].addShapeBox(-2.0f, 1.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[12].addShapeBox(-2.0f, 0.5f, -2.0f, 4, 1, 3, 0.0f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.35f, -0.1f, 0.35f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.5f, -2.0f, 8, 4, 2, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.5f, 1.2f, 0.0f, 1.0f, 1.2f, 0.0f, 1.0f, 1.3f, 0.1f, 1.0f, 1.3f, 0.1f, 1.0f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.5f, 0.0f, 8, 4, 2, 0.0f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.6f, 1.2f, 0.0f, 1.0f, 1.2f, 0.0f, 1.0f, 1.2f, 0.0f, 1.0f, 1.2f, 0.0f, 0.8f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
