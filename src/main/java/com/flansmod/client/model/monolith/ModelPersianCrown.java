// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPersianCrown extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPersianCrown() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[40];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.headModel[38] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[39] = new ModelRendererTurbo((ModelBase)this, 73, 57, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-3.5f, -10.3f, -3.5f, 7, 1, 7, 0.0f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-3.5f, -11.1f, -3.5f, 7, 1, 7, 0.0f, 1.0f, -0.2f, 1.0f, 1.0f, -0.2f, 1.0f, 1.0f, -0.2f, 1.0f, 1.0f, -0.2f, 1.0f, 0.8f, -0.2f, 0.8f, 0.8f, -0.2f, 0.8f, 0.8f, -0.2f, 0.8f, 0.8f, -0.2f, 0.8f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-3.5f, -11.9f, -3.5f, 7, 1, 7, 0.0f, 1.3f, 0.3f, 1.3f, 1.3f, 0.3f, 1.3f, 1.3f, 0.3f, 1.3f, 1.3f, 0.3f, 1.3f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.5f, -13.2f, -3.5f, 7, 1, 7, 0.0f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.3f, 0.0f, 1.3f, 1.3f, 0.0f, 1.3f, 1.3f, 0.0f, 1.3f, 1.3f, 0.0f, 1.3f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.5f, -15.2f, -3.5f, 7, 1, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-3.5f, -16.5f, -3.5f, 7, 1, 7, 0.0f, -1.6f, -0.3f, -1.6f, -1.6f, -0.3f, -1.6f, -1.6f, -0.3f, -1.6f, -1.6f, -0.3f, -1.6f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-3.5f, -14.2f, -3.5f, 7, 1, 7, 0.0f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f, 1.2f, 0.0f, 1.2f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-3.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.2f, -0.2f, 0.2f, 0.4f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(1.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.4f, 0.0f, 0.2f, 0.2f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -1.0f, -4.0f, 8, 1, 5, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 1.0f, 0.2f, 0.2f, 1.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-2.0f, -2.5f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.8f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.5f, 0.7f, 0.2f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(0.0f, -2.5f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.5f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, -0.3f, 0.2f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.0f, -4.7f, 0.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 1.2f, 1.8f, 0.5f, 1.2f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-4.0f, -0.7f, 0.0f, 8, 1, 4, 0.0f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.0f, 1.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-4.0f, -3.2f, 0.0f, 8, 2, 4, 0.0f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 0.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.0f, 1.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 0.2f, 1.8f, 0.5f, 1.2f, 1.8f, 0.5f, 1.2f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-4.0f, -3.2f, -1.2f, 8, 2, 1, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-4.0f, -4.7f, -1.2f, 8, 1, 1, 0.0f, -1.2f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-4.0f, -0.2f, -1.2f, 8, 1, 1, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, 1.8f, 0.5f, 0.0f, -1.2f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-4.0f, 0.0f, -4.0f, 8, 1, 5, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -2.8f, 0.0f, 0.2f, -2.8f, 0.0f, 0.2f, -2.8f, 0.0f, 0.2f, -2.8f, 0.0f, 0.2f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-4.0f, -7.0f, -4.0f, 9, 2, 8, 0.0f, 0.9f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-2.5f, -8.5f, -4.9f, 5, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-1.5f, -9.5f, -4.9f, 3, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-0.5f, -10.5f, -4.9f, 1, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-2.5f, -8.5f, 3.9f, 5, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-1.5f, -9.5f, 3.9f, 3, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-0.5f, -10.5f, 3.9f, 1, 2, 1, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(3.9f, -10.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(3.9f, -9.5f, -1.5f, 1, 2, 3, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(3.9f, -8.5f, -2.5f, 1, 2, 5, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-4.9f, -10.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(-4.9f, -9.5f, -1.5f, 1, 2, 3, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(-4.9f, -8.5f, -2.5f, 1, 2, 5, 0.0f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-3.5f, -9.9f, -3.5f, 7, 1, 7, 0.0f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.headModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(-3.5f, -8.9f, -3.5f, 7, 1, 7, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f);
        this.headModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(-3.5f, -8.2f, -3.5f, 7, 2, 7, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f, 0.6f, -0.3f, 0.6f);
        this.headModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(-0.5f, -5.0f, 5.0f, 1, 1, 9, 0.0f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, 5.7f, -12.0f, 0.9f, -6.3f, -12.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, 5.7f, 12.0f, 0.9f, -6.3f, 12.0f, 0.9f);
        this.headModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(-0.5f, -5.0f, 5.0f, 1, 1, 9, 0.0f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -6.3f, -12.0f, 0.9f, 5.7f, -12.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -6.3f, 12.0f, 0.9f, 5.7f, 12.0f, 0.9f);
        this.headModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(-0.7f, -5.5f, 5.0f, 1, 1, 5, 0.0f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, 3.7f, -4.0f, 0.9f, -4.3f, -4.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, 3.7f, 4.0f, 0.9f, -4.3f, 4.0f, 0.9f);
        this.headModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[38].addShapeBox(-0.3f, -5.5f, 5.0f, 1, 1, 5, 0.0f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -4.3f, -4.0f, 0.9f, 3.7f, -4.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -4.3f, 4.0f, 0.9f, 3.7f, 4.0f, 0.9f);
        this.headModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[39].addShapeBox(-4.0f, -6.0f, -4.0f, 8, 2, 8, 0.0f, 0.5f, 0.0f, 0.1f, 0.5f, 0.0f, 0.1f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, -0.7f, 0.1f, 0.5f, -0.7f, 0.1f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.headModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
