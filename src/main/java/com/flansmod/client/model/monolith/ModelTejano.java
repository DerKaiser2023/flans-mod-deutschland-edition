// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelTejano extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelTejano() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[36];
        this.bodyModel = new ModelRendererTurbo[8];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[3];
        this.skirtFrontModel = new ModelRendererTurbo[1];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 9, 49, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 34, 53, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 34, 53, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -5.0f, -4.0f, 7, 1, 1, 0.0f, 0.5f, 0.3f, 1.0f, 0.5f, 0.3f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -8.0f, -4.0f, 7, 3, 9, 0.0f, -1.5f, 0.5f, -2.0f, -1.5f, 0.5f, -2.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -4.0f, -3.5f, 7, 1, 1, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.2f, 0.3f, 1.0f, 0.2f, 0.3f, 1.0f, -0.2f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -2.5f, -3.5f, 7, 1, 1, 0.0f, 0.2f, 0.2f, 1.0f, 0.2f, 0.2f, 1.0f, -0.2f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, -0.7f, 0.5f, 0.8f, -0.7f, 0.5f, 0.8f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-1.5f, -4.0f, -4.0f, 2, 1, 1, 0.0f, -0.2f, 0.4f, 0.2f, -0.2f, 0.4f, 0.2f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, -0.5f, 1.5f, 0.0f, -0.5f, 1.5f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-1.5f, -3.0f, -5.0f, 2, 1, 1, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, -0.8f, 0.0f, -0.2f, -0.8f, 0.0f, 0.2f, -0.3f, 1.0f, 0.2f, -0.3f, 1.0f, -0.2f, 1.0f, -0.5f, -0.2f, 1.0f, -0.5f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-3.5f, -2.0f, -5.0f, 3, 1, 1, 0.0f, -0.5f, -0.4f, 0.0f, -0.8f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -0.5f, -0.4f, 0.0f, 0.0f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-3.5f, 0.0f, -5.5f, 3, 1, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, -0.4f, 0.0f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.0f, -0.5f, -0.4f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-3.5f, -0.5f, -5.0f, 1, 1, 1, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.2f, -0.7f, 0.5f, -0.3f, -0.6f, 0.5f, -0.3f, -0.5f, -0.3f, 0.2f, -0.6f, -0.3f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-3.0f, -4.3f, -4.3f, 1, 1, 1, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -2.5f, -4.0f, 7, 2, 4, 0.0f, -0.1f, 2.0f, -0.5f, -0.1f, 2.0f, -0.5f, -0.1f, 1.0f, 1.0f, -0.1f, 1.0f, 1.0f, -0.3f, 0.5f, 0.4f, -0.3f, 0.5f, 0.4f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -3.0f, -4.0f, 7, 2, 9, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -2.0f, -1.5f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.0f, 0.5f, -4.0f, 7, 1, 4, 0.0f, -0.3f, 0.5f, 0.4f, -0.3f, 0.5f, 0.4f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -1.0f, 0.0f, 0.4f, -1.0f, 0.0f, 0.4f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-2.5f, 0.5f, -5.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f, -0.2f, -0.5f, -1.0f, -0.2f, -0.5f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-7.0f, -6.5f, -0.5f, 4, 3, 1, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.5f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-5.0f, -3.0f, -0.4f, 2, 1, 1, 0.0f, -0.2f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, 0.5f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.0f, 0.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-2.5f, -1.5f, -1.0f, 4, 6, 4, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, -0.2f, -1.0f, 0.5f, -0.2f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 1.5f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-2.5f, -1.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(2.0f, -6.5f, -0.5f, 4, 3, 1, 0.0f, 0.0f, -1.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(2.0f, -3.0f, -0.4f, 2, 1, 1, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-0.5f, -2.0f, -5.0f, 3, 1, 1, 0.0f, -0.8f, -0.2f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.8f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-0.5f, 0.0f, -5.5f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.2f, 0.5f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(1.5f, -0.5f, -5.0f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, -0.3f, -0.6f, 0.5f, 0.2f, -0.7f, 0.5f, 0.2f, -0.6f, -0.3f, -0.3f, -0.5f, -0.3f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(1.0f, -4.3f, -4.3f, 1, 1, 1, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.35f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(0.5f, -1.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-1.5f, -1.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-0.5f, -1.2f, -5.2f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-3.0f, -0.8f, -5.5f, 1, 1, 1, 0.0f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(-2.0f, -0.8f, -5.5f, 1, 1, 1, 0.0f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.headModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-1.0f, -0.8f, -5.5f, 1, 1, 1, 0.0f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.headModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(0.0f, -0.8f, -5.5f, 1, 1, 1, 0.0f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.headModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(1.0f, -0.8f, -5.5f, 1, 1, 1, 0.0f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.49f, -0.2f, -0.49f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.headModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-2.5f, -9.0f, -3.5f, 2, 2, 8, 0.0f, 0.0f, 2.0f, -2.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 2.0f, 1.0f, 1.0f, 1.0f, 0.0f);
        this.headModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(-0.5f, -9.0f, -3.5f, 2, 2, 8, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 2.0f, -2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 2.0f, 1.0f);
        this.headModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(-5.5f, -7.0f, -2.0f, 5, 1, 5, 0.0f, 1.0f, 1.0f, 3.0f, 0.0f, 0.0f, 4.0f, 0.0f, -2.0f, 6.0f, 1.0f, 1.0f, 5.0f, 1.0f, -1.0f, 5.0f, 0.0f, 0.0f, 6.0f, 0.0f, 2.0f, 6.0f, 1.0f, -1.0f, 5.0f);
        this.headModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(-0.5f, -7.0f, -2.0f, 5, 1, 5, 0.0f, 0.0f, 0.0f, 4.0f, 1.0f, 1.0f, 3.0f, 1.0f, 1.0f, 5.0f, 0.0f, -2.0f, 6.0f, 0.0f, 0.0f, 6.0f, 1.0f, -1.0f, 5.0f, 1.0f, -1.0f, 5.0f, 0.0f, 2.0f, 6.0f);
        this.headModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-5.0f, 3.5f, -1.0f, 8, 4, 5, 0.0f, -0.5f, 0.6f, -1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 0.0f, -0.5f, -0.5f, 1.0f, 1.0f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-5.0f, 7.5f, -1.0f, 8, 5, 5, 0.0f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-5.0f, 12.5f, -1.0f, 8, 3, 5, 0.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -2.0f, 0.0f, -0.5f, -2.0f, 0.0f, -0.5f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-2.5f, 14.0f, -1.5f, 3, 3, 3, 0.0f, -0.8f, -0.3f, -0.8f, -0.8f, -0.3f, -0.8f, -0.8f, -0.3f, -0.8f, -0.8f, -0.3f, -0.8f, -0.5f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.5f, 4.0f, -2.0f, 3, 6, 3, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, -1.0f, -2.0f, 5.0f, 0.5f, -2.0f, 5.0f, 0.5f, -1.0f, -6.0f, -1.0f, -1.0f, -6.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(1.0f, 1.5f, -9.0f, 3, 6, 3, 0.0f, 4.0f, -2.0f, 4.0f, -4.0f, -2.0f, 4.0f, -4.0f, -1.0f, -4.0f, 4.0f, -1.0f, -4.0f, -2.5f, 1.5f, -3.0f, 2.0f, 1.0f, -3.0f, 2.0f, -1.0f, 2.0f, -2.5f, 0.5f, 2.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-7.0f, 4.5f, 0.0f, 3, 6, 3, 0.0f, 0.0f, 2.5f, -4.0f, 0.0f, 2.5f, -4.0f, 0.0f, -0.5f, 2.0f, 0.0f, -0.5f, 2.0f, 1.5f, -8.0f, 3.0f, -1.5f, -8.0f, 3.0f, -1.5f, -5.5f, -5.5f, 1.5f, -5.5f, -5.5f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-7.0f, 4.5f, -10.0f, 3, 6, 3, 0.0f, -1.5f, 0.5f, 2.0f, 2.0f, 0.5f, 2.0f, 1.0f, 2.5f, -4.0f, -0.5f, 2.5f, -4.0f, 1.5f, -5.5f, -7.5f, -1.5f, -5.5f, -7.5f, -1.5f, -8.0f, 4.0f, 1.5f, -8.0f, 4.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-1.5f, -2.5f, -1.0f, 3, 4, 4, 0.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, -2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.5f, 0.0f, 2.5f, 1.0f, 0.0f, 2.5f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-1.5f, 1.5f, -1.0f, 3, 6, 4, 0.0f, 1.0f, 2.0f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, 0.0f, 2.5f, 1.0f, 0.0f, 2.5f, -1.0f, -1.0f, 2.0f, 1.0f, -1.0f, 2.0f, 1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-0.5f, 7.5f, -3.0f, 3, 5, 3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.5f, 1.5f, 0.0f, 3, 6, 4, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 2.0f, 0.5f, 1.0f, 2.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-3.5f, 7.5f, 0.0f, 3, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.5f, -2.5f, 0.0f, 3, 4, 4, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.5f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 2.0f, 0.5f, -1.0f, 2.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 38, this.textureX, this.textureY)).addShapeBox(-2.5f, 0.5f, -2.0f, 15, 15, 1, 0.0f, 0.3f, 0.0f, 0.0f, -10.7f, 0.0f, 0.0f, -10.7f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.6f, -10.0f, 0.3f, -10.4f, -10.0f, 0.8f, -10.4f, -10.0f, -1.0f, 0.6f, -10.0f, -0.5f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
