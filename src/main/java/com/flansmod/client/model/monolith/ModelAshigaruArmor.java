// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelAshigaruArmor extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAshigaruArmor() {
        this.textureX = 256;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[31];
        this.leftArmModel = new ModelRendererTurbo[4];
        this.rightArmModel = new ModelRendererTurbo[4];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.skirtFrontModel = new ModelRendererTurbo[12];
        this.skirtRearModel = new ModelRendererTurbo[12];
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
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 209, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 241, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 145, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 193, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 209, 9, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 241, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 249, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 161, 33, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 241, 33, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 249, 33, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-3.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(2.0f, -0.5f, -3.0f, 1, 1, 6, 0.0f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.0f, 0.5f, -3.0f, 1, 2, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.0f, 0.5f, -3.0f, 1, 2, 6, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 6.5f, -2.4f, 4, 3, 5, 0.0f, 0.6f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.4f, 0.5f, 0.0f, 0.2f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 3.5f, -2.4f, 4, 3, 5, 0.0f, 0.6f, 0.0f, 0.7f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.5f, 0.6f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.4f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 1.5f, -2.4f, 4, 2, 5, 0.0f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.4f, -0.2f, 0.5f, 0.2f, 0.6f, 0.0f, 0.7f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.5f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 1.5f, -2.4f, 4, 2, 5, 0.0f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.2f, 0.0f, 0.5f, 0.4f, 0.0f, 0.0f, 1.2f, 0.6f, 0.0f, 0.7f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 3.5f, -2.4f, 4, 3, 5, 0.0f, 0.0f, 0.0f, 1.2f, 0.6f, 0.0f, 0.7f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.7f, 0.6f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 6.5f, -2.4f, 4, 3, 5, 0.0f, 0.0f, 0.0f, 1.0f, 0.46f, 0.0f, 0.7f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.0f, 8.7f, -3.4f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.0f, 8.7f, -3.4f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.8f, 8.7f, -3.4f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.8f, 8.7f, -3.4f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(3.6f, 8.7f, -3.1f, 1, 3, 1, 0.0f, 0.0f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(2.7f, 8.7f, -3.2f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(2.0f, 8.7f, -3.2f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.6f, 8.7f, -3.1f, 1, 3, 1, 0.0f, -0.6f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-3.0f, 8.7f, -3.2f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-3.7f, 8.7f, -3.2f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(3.6f, 8.7f, 2.1f, 1, 3, 1, 0.0f, 0.0f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(2.7f, 8.7f, 2.0f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(2.0f, 8.7f, 2.0f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.8f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(0.0f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-1.0f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-1.8f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-3.0f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-3.7f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-4.6f, 8.7f, 2.1f, 1, 3, 1, 0.0f, -0.6f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.5f, -0.3f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 137, 25, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 4.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 3.5f, -2.0f, 4, 1, 4, 0.0f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, 8.6f, -2.0f, 4, 2, 4, 0.0f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 217, 17, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 4.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, 3.5f, -2.0f, 4, 1, 4, 0.0f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.25f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 8.6f, -2.0f, 4, 2, 4, 0.0f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, 0.2f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f, 0.25f, -0.5f, 0.25f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
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
        this.leftLegModel[3].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 4, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
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
        this.rightLegModel[3].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 4, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.skirtFrontModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.skirtFrontModel[4] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.skirtFrontModel[5] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.skirtFrontModel[6] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.skirtFrontModel[7] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.skirtFrontModel[8] = new ModelRendererTurbo((ModelBase)this, 217, 1, this.textureX, this.textureY);
        this.skirtFrontModel[9] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.skirtFrontModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.skirtFrontModel[11] = new ModelRendererTurbo((ModelBase)this, 161, 9, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-2.0f, -1.0f, -3.6f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-2.0f, 0.0f, -4.1f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-2.0f, 1.0f, -4.5f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[3].addShapeBox(-2.0f, 2.0f, -5.0f, 4, 2, 1, 0.0f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f);
        this.skirtFrontModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[4].addShapeBox(2.0f, -1.0f, -3.5f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 0.1f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[5].addShapeBox(2.2f, 0.0f, -4.0f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, 0.5f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.7f, 0.2f, 0.0f, 0.4f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[6].addShapeBox(2.4f, 1.0f, -4.5f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.0f, 0.2f, 0.0f, 0.7f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.9f, 0.2f, 0.0f, 0.6f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[7].addShapeBox(2.6f, 2.0f, -5.0f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.3f, 0.2f, 0.0f, 1.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.2f, 0.2f, 0.0f, 0.9f, -0.2f, 0.0f, -0.5f);
        this.skirtFrontModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[8].addShapeBox(-5.0f, -1.0f, -3.5f, 3, 2, 1, 0.0f, 0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.1f);
        this.skirtFrontModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[9].addShapeBox(-5.2f, 0.0f, -4.0f, 3, 2, 1, 0.0f, 0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, -0.7f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.4f);
        this.skirtFrontModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[10].addShapeBox(-5.4f, 1.0f, -4.5f, 3, 2, 1, 0.0f, 0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.7f, 0.2f, 0.0f, -0.9f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.6f);
        this.skirtFrontModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[11].addShapeBox(-5.6f, 2.0f, -5.0f, 3, 2, 1, 0.0f, 0.2f, 0.0f, -1.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.9f);
        this.skirtFrontModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.skirtRearModel[2] = new ModelRendererTurbo((ModelBase)this, 137, 17, this.textureX, this.textureY);
        this.skirtRearModel[3] = new ModelRendererTurbo((ModelBase)this, 161, 17, this.textureX, this.textureY);
        this.skirtRearModel[4] = new ModelRendererTurbo((ModelBase)this, 185, 17, this.textureX, this.textureY);
        this.skirtRearModel[5] = new ModelRendererTurbo((ModelBase)this, 209, 17, this.textureX, this.textureY);
        this.skirtRearModel[6] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.skirtRearModel[7] = new ModelRendererTurbo((ModelBase)this, 129, 25, this.textureX, this.textureY);
        this.skirtRearModel[8] = new ModelRendererTurbo((ModelBase)this, 233, 17, this.textureX, this.textureY);
        this.skirtRearModel[9] = new ModelRendererTurbo((ModelBase)this, 153, 25, this.textureX, this.textureY);
        this.skirtRearModel[10] = new ModelRendererTurbo((ModelBase)this, 177, 33, this.textureX, this.textureY);
        this.skirtRearModel[11] = new ModelRendererTurbo((ModelBase)this, 193, 33, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(2.6f, 2.0f, 3.7f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, -1.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.3f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(2.0f, -1.0f, 2.2f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.3f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[2].addShapeBox(2.4f, 1.0f, 3.2f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.7f, 0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.6f, 0.2f, 0.0f, -0.9f, -0.2f, 0.0f, -0.3f);
        this.skirtRearModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[3].addShapeBox(2.2f, 0.0f, 2.7f, 3, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, -0.7f, -0.2f, 0.0f, -0.3f);
        this.skirtRearModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[4].addShapeBox(-2.0f, -1.0f, 2.5f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f);
        this.skirtRearModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[5].addShapeBox(-2.0f, 0.0f, 3.0f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f);
        this.skirtRearModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[6].addShapeBox(-2.0f, 1.0f, 3.6f, 4, 2, 1, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f);
        this.skirtRearModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[7].addShapeBox(-2.0f, 2.0f, 4.1f, 4, 2, 1, 0.0f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f);
        this.skirtRearModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[8].addShapeBox(-5.0f, -1.0f, 2.2f, 3, 2, 1, 0.0f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.1f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.4f);
        this.skirtRearModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[9].addShapeBox(-5.2f, 0.0f, 2.7f, 3, 2, 1, 0.0f, 0.2f, 0.0f, 0.5f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, 0.4f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.7f);
        this.skirtRearModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[10].addShapeBox(-5.4f, 1.0f, 3.2f, 3, 2, 1, 0.0f, 0.2f, 0.0f, 0.7f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.0f, 0.2f, 0.0f, 0.6f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.9f);
        this.skirtRearModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[11].addShapeBox(-5.6f, 2.0f, 3.7f, 3, 2, 1, 0.0f, 0.2f, 0.0f, 1.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.3f, 0.2f, 0.0f, 0.9f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -1.2f);
        this.skirtRearModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
