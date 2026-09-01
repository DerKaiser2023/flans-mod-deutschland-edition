// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelNorseGoth extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelNorseGoth() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[29];
        this.leftArmModel = new ModelRendererTurbo[11];
        this.rightArmModel = new ModelRendererTurbo[11];
        this.leftLegModel = new ModelRendererTurbo[13];
        this.rightLegModel = new ModelRendererTurbo[12];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 4, 49, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.5f, 0.4f, -0.5f, 0.5f, 0.2f, -0.5f, 1.0f, 0.3f, 0.0f, 1.0f, 0.4f, 0.0f, 0.0f, 2.2f, 0.0f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 0.0f, 0.0f, 1.2f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(0.0f, 3.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.0f, 2.2f, 0.0f, -0.3f, 0.8f, 0.0f, -0.3f, 0.8f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 2.5f, 0.8f, 0.5f, 1.0f, 0.8f, 0.0f, 0.9f, 0.0f, 0.0f, 1.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(2.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, 0.0f, -0.5f, 2.1f, 1.0f, -1.5f, 1.3f, 1.2f, -1.0f, 1.0f, 2.0f, -1.0f, 1.4f, -0.5f, 1.0f, 1.5f, 0.8f, 1.0f, 1.2f, 0.9f, 1.5f, 0.6f, 2.0f, 0.5f, 1.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(0.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, -1.5f, 2.5f, 0.8f, -1.5f, 1.2f, 0.9f, -1.5f, 0.6f, 0.0f, -0.5f, 1.2f, 0.0f, 1.0f, 0.9f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(0.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.4f, 0.5f, 0.2f, 0.8f, 0.1f, 0.2f, 0.8f, 0.1f, 0.0f, 0.9f, 0.5f, 0.0f, 0.5f, 0.8f, 1.2f, 0.0f, 0.3f, 1.2f, 0.0f, 0.3f, 0.0f, 0.5f, 0.8f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(0.0f, 9.5f, -2.0f, 4, 1, 4, 0.0f, 0.0f, -1.0f, 1.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.15f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 1.2f, 0.5f, -0.5f, 0.15f, 0.5f, -0.5f, 0.15f, 0.0f, -0.5f, 0.9f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(2.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, -0.5f, -1.5f, 2.5f, 1.0f, -2.5f, 1.5f, 1.1f, -2.5f, 0.2f, 0.0f, -1.5f, 1.0f, -0.5f, 1.5f, 1.8f, 0.8f, 1.5f, 1.2f, 0.9f, 1.5f, 0.6f, 0.0f, 0.5f, 0.2f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 4.5f, -2.0f, 2, 2, 3, 0.0f, 0.0f, 2.5f, 2.8f, 0.0f, -0.5f, 2.1f, 1.2f, -1.0f, 0.9f, 0.0f, -1.0f, 1.3f, 0.0f, 1.0f, 2.2f, 0.5f, 1.0f, 1.5f, 0.9f, 1.5f, 0.6f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, 0.0f, 0.0f, 3.5f, 0.5f, -1.5f, 2.5f, 1.1f, -2.5f, 0.2f, 0.0f, -1.5f, 1.0f, 0.0f, 1.5f, 2.5f, 0.5f, 1.5f, 1.8f, 0.9f, 1.5f, 0.6f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 11.8f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.1f, 0.8f, 1.0f, 0.6f, 0.6f, 1.0f, 0.6f, 0.6f, 0.0f, 0.1f, 0.8f, 0.0f, 0.0f, 1.2f, 1.5f, -0.2f, 0.9f, 1.5f, -0.2f, 0.9f, 0.0f, 0.0f, 1.2f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.8f, -1.5f, 1.2f, 0.0f, -1.5f, 2.5f, 0.0f, -0.5f, 1.2f, 0.9f, -1.5f, 0.6f, 0.2f, 0.0f, 0.3f, 0.0f, 1.0f, 0.9f, 0.0f, 0.0f, 0.4f, 0.2f, 0.0f, 0.3f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 9.5f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.3f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.2f, 0.0f, 0.15f, 0.5f, -0.5f, 0.15f, 0.0f, 0.5f, 1.2f, 0.0f, -0.5f, 0.9f, 0.5f, -0.5f, 0.15f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.8f, 0.1f, 0.0f, 0.4f, 0.5f, 0.0f, 0.9f, 0.5f, 0.2f, 0.8f, 0.1f, 1.2f, 0.0f, 0.3f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 1.2f, 0.0f, 0.3f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-4.0f, 11.8f, -2.0f, 4, 1, 4, 0.0f, 1.0f, 0.6f, 0.6f, 0.0f, 0.1f, 0.8f, 0.0f, 0.1f, 0.8f, 1.0f, 0.6f, 0.6f, 1.5f, -0.2f, 0.9f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f, 1.5f, -0.2f, 0.9f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-4.0f, 3.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, -0.3f, 0.8f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 1.2f, 0.0f, -0.3f, 0.8f, 0.8f, 0.5f, 1.0f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 1.3f, 0.8f, 0.0f, 0.9f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, -0.5f, 0.5f, 0.2f, 0.0f, 0.5f, 0.4f, 0.0f, 1.0f, 0.4f, -0.5f, 1.0f, 0.3f, 0.0f, 0.3f, 0.8f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.3f, 0.8f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-2.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, 0.5f, -1.5f, 2.5f, 0.0f, 0.0f, 3.5f, 0.0f, -1.5f, 1.0f, 1.1f, -2.5f, 0.2f, 0.5f, 1.5f, 1.8f, 0.0f, 1.5f, 2.5f, 0.0f, 0.5f, 1.2f, 0.9f, 1.5f, 0.6f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-2.0f, 4.5f, -2.0f, 2, 2, 3, 0.0f, 0.0f, -0.5f, 2.1f, 0.0f, 2.5f, 2.8f, 0.0f, -1.0f, 1.3f, 1.2f, -1.0f, 0.9f, 0.5f, 1.0f, 1.5f, 0.0f, 1.0f, 2.2f, 0.0f, 0.5f, 1.2f, 0.9f, 1.5f, 0.6f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, 1.0f, -1.5f, 1.3f, 0.0f, -0.5f, 2.1f, 2.0f, -1.0f, 1.4f, 1.2f, -1.0f, 1.0f, 0.8f, 1.0f, 1.2f, -0.5f, 1.0f, 1.5f, 2.0f, 0.5f, 1.2f, 0.9f, 1.5f, 0.6f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.0f, 4.5f, -2.0f, 2, 2, 4, 0.0f, 1.0f, -2.5f, 1.5f, -0.5f, -1.5f, 2.5f, 0.0f, -1.5f, 1.0f, 1.1f, -2.5f, 0.2f, 0.8f, 1.5f, 1.2f, -0.5f, 1.5f, 1.8f, 0.0f, 0.5f, 0.2f, 0.9f, 1.5f, 0.6f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-5.6f, 12.9f, -2.0f, 5, 1, 4, 0.0f, 0.0f, 0.3f, 0.9f, 1.4f, 0.0f, 1.5f, 2.5f, 0.0f, 1.7f, 0.0f, 0.3f, 0.9f, 0.3f, 0.0f, 1.1f, 1.2f, 0.2f, 1.8f, 2.5f, 0.2f, 2.0f, 0.3f, 0.0f, 1.1f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(0.6f, 12.9f, -2.0f, 5, 1, 4, 0.0f, 1.4f, 0.0f, 1.5f, 0.0f, 0.3f, 0.9f, 0.0f, 0.3f, 0.9f, 2.5f, 0.0f, 1.7f, 1.2f, 0.2f, 1.8f, 0.3f, 0.0f, 1.1f, 0.3f, 0.0f, 1.1f, 2.5f, 0.2f, 2.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-5.8f, 13.5f, -2.5f, 4, 2, 1, 0.0f, 0.2f, 0.5f, 0.9f, 0.2f, 0.0f, 1.6f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 2.9f, 0.5f, 1.5f, 1.1f, -0.8f, 1.2f, 1.8f, -1.8f, 1.2f, 1.1f, 0.7f, 1.5f, 0.1f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-2.8f, 12.5f, -3.8f, 1, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(1.8f, 12.5f, -3.8f, 1, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-4.0f, 3.5f, -2.0f, 8, 2, 4, 0.0f, 0.2f, 0.0f, 2.2f, 0.2f, 0.0f, 2.2f, 0.2f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f, 0.8f, 0.5f, 1.0f, 0.8f, 0.5f, 1.0f, 0.8f, 0.0f, 1.4f, 0.8f, 0.0f, 1.4f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-4.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.5f, 2.3f, 1.0f, 0.0f, 0.3f, 1.3f, 0.0f, 0.5f, 1.4f, 0.5f, 2.3f, 1.4f, 0.2f, 0.0f, 2.2f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-8.0f, 0.0f, -2.0f, 16, 2, 4, 0.0f, -3.9f, 0.2f, 0.1f, -3.9f, 0.2f, 0.1f, -3.9f, 0.2f, 0.4f, -3.9f, 0.2f, 0.4f, -3.9f, -0.8f, 0.1f, -3.9f, -0.8f, 0.1f, -3.9f, -0.8f, 0.8f, -3.9f, -0.8f, 0.8f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(0.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.3f, 1.3f, 0.5f, 2.3f, 1.0f, 0.5f, 2.3f, 1.4f, 0.0f, 0.5f, 1.4f, 0.0f, 0.0f, 2.2f, 0.2f, 0.0f, 2.2f, 0.2f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.leftArmModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.leftArmModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.leftArmModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.leftArmModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 9.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(1.0f, 5.0f, -2.0f, 2, 4, 4, 0.0f, 0.0f, -0.5f, 1.0f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.5f, 0.5f, -0.5f, 1.0f, 0.0f, -0.2f, 0.4f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.0f, -0.2f, 0.4f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-0.8f, 1.0f, -2.0f, 4, 1, 4, 0.0f, -0.2f, -0.5f, 1.0f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.6f, -0.2f, -0.5f, 1.0f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-0.8f, 2.0f, -2.0f, 4, 1, 4, 0.0f, -0.2f, -0.4f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, -0.2f, -0.4f, 0.4f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.5f, 0.2f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-0.8f, -1.0f, -2.0f, 4, 2, 4, 0.0f, 1.0f, -1.5f, 1.0f, 0.5f, -0.3f, 0.5f, 0.5f, -0.3f, 0.5f, 1.0f, -1.5f, 1.0f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, 0.4f, 0.2f, 0.5f, 0.7f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(-0.8f, -2.0f, -2.0f, 4, 2, 4, 0.0f, 1.5f, -1.5f, 1.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 1.5f, -1.5f, 1.0f, 1.0f, 0.5f, 0.7f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, 0.4f, 1.0f, 0.5f, 0.7f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(-0.8f, -3.5f, -2.0f, 4, 2, 4, 0.0f, 1.7f, -1.8f, 1.0f, -2.0f, -1.0f, 0.5f, -2.0f, -1.0f, 0.5f, 1.7f, -1.8f, 1.0f, 1.5f, 1.0f, 0.7f, 0.3f, -0.6f, 0.4f, 0.3f, -0.6f, 0.4f, 1.5f, 1.0f, 0.7f);
        this.leftArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[7].addShapeBox(-0.8f, 3.0f, -2.0f, 4, 1, 4, 0.0f, -0.2f, -0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, -0.2f, -0.3f, 0.4f, 0.0f, 0.4f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.4f, 0.2f);
        this.leftArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[8].addShapeBox(-1.0f, 5.0f, -2.0f, 2, 4, 4, 0.0f, 0.5f, -1.8f, 0.5f, 0.0f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, 0.5f, -1.8f, 0.5f, 0.2f, -0.2f, 0.2f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.4f, 0.2f, -0.2f, 0.2f);
        this.leftArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[9].addShapeBox(0.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, 0.5f, 2.3f, 1.0f, 0.0f, 2.0f, 1.3f, 0.0f, 2.0f, 1.4f, 0.5f, 2.3f, 1.4f, 2.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 2.0f, 0.0f, 1.5f);
        this.leftArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[10].addShapeBox(0.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 2.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 2.0f, 0.0f, 1.5f, 1.0f, 3.3f, 0.5f, -0.7f, 2.0f, 0.2f, -0.7f, 2.0f, 0.2f, 1.0f, 3.3f, 0.4f);
        this.leftArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.rightArmModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.rightArmModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.rightArmModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.rightArmModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, 9.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 5.0f, -2.0f, 2, 4, 4, 0.0f, 0.7f, 0.2f, 0.5f, 0.0f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, 0.7f, 0.2f, 0.5f, 0.2f, -0.2f, 0.2f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.4f, 0.2f, -0.2f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.2f, 1.0f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.6f, -0.2f, -0.5f, 1.0f, -0.2f, -0.5f, 1.0f, 0.5f, 0.0f, 0.6f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.2f, 2.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, 0.0f, 0.4f, -0.2f, -0.4f, 0.4f, -0.2f, -0.4f, 0.4f, 0.4f, 0.0f, 0.4f, 0.0f, 0.3f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f, 0.2f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.2f, -1.0f, -2.0f, 4, 2, 4, 0.0f, 0.5f, -0.3f, 0.5f, 1.0f, -1.5f, 1.0f, 1.0f, -1.5f, 1.0f, 0.5f, -0.3f, 0.5f, 0.2f, 0.0f, 0.4f, 0.2f, 0.5f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, 0.4f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.2f, -2.0f, -2.0f, 4, 2, 4, 0.0f, 0.5f, 0.2f, 0.5f, 1.5f, -1.5f, 1.0f, 1.5f, -1.5f, 1.0f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.4f, 1.0f, 0.5f, 0.7f, 1.0f, 0.5f, 0.7f, 0.2f, 0.0f, 0.4f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-3.2f, -3.5f, -2.0f, 4, 2, 4, 0.0f, -2.0f, -1.0f, 0.5f, 1.7f, -1.8f, 1.0f, 1.7f, -1.8f, 1.0f, -2.0f, -1.0f, 0.5f, 0.3f, -0.6f, 0.4f, 1.5f, 1.0f, 0.7f, 1.5f, 1.0f, 0.7f, 0.3f, -0.6f, 0.4f);
        this.rightArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[7].addShapeBox(-3.2f, 3.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, 0.0f, 0.4f, -0.2f, -0.3f, 0.4f, -0.2f, -0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.0f, 0.3f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, 0.3f, 0.2f);
        this.rightArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[8].addShapeBox(-1.0f, 5.0f, -2.0f, 2, 4, 4, 0.0f, 0.0f, -0.5f, 1.0f, 0.5f, -1.8f, 0.5f, 0.5f, -1.8f, 0.5f, 0.5f, -0.5f, 1.0f, 0.0f, -0.2f, 0.4f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.0f, -0.2f, 0.4f);
        this.rightArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[9].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 2.0f, 1.3f, 0.5f, 2.3f, 1.0f, 0.5f, 2.3f, 1.4f, 0.0f, 2.0f, 1.4f, 0.5f, 0.0f, 1.0f, 2.0f, 0.0f, 1.5f, 2.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.0f);
        this.rightArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[10].addShapeBox(-4.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.5f, 0.0f, 1.0f, 2.0f, 0.0f, 1.5f, 2.0f, 0.0f, 1.5f, 0.5f, 0.0f, 1.0f, -0.7f, 2.0f, 0.2f, 1.0f, 3.3f, 0.5f, 1.0f, 3.3f, 0.4f, -0.7f, 2.0f, 0.2f);
        this.rightArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.leftLegModel[6] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.leftLegModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.leftLegModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.leftLegModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.leftLegModel[10] = new ModelRendererTurbo((ModelBase)this, 4, 49, this.textureX, this.textureY);
        this.leftLegModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[12] = new ModelRendererTurbo((ModelBase)this, 95, 51, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-1.8f, 11.1f, -0.3f, 4, 1, 3, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, -0.4f, 0.4f, 0.5f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-1.5f, 1.1f, -2.0f, 4, 4, 4, 0.0f, 0.9f, -1.3f, 0.8f, 1.0f, 0.3f, 0.8f, 1.0f, 0.3f, 0.8f, -3.0f, -0.5f, 1.0f, 0.7f, 0.5f, 0.4f, 0.2f, 0.5f, 0.4f, 0.2f, 1.5f, 0.2f, -2.5f, 1.5f, 0.2f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.1f, 5.1f, -2.8f, 5, 1, 3, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-1.5f, 6.1f, -2.0f, 4, 4, 4, 0.0f, 0.7f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -0.5f, 0.6f, 0.7f, -0.5f, 0.6f, 0.6f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 0.9f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(-2.1f, 6.1f, -2.8f, 5, 1, 3, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[6].addShapeBox(2.5f, 6.1f, -0.8f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, -1.0f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 0.5f, 0.5f, 0.8f, -1.0f, 0.5f, 0.8f);
        this.leftLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].addShapeBox(2.5f, 5.1f, -0.8f, 1, 1, 3, 0.0f, -1.0f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 0.5f, 0.5f, 0.8f, -1.0f, 0.5f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.leftLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[8].addShapeBox(-1.8f, 11.1f, -2.3f, 4, 1, 2, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.6f, 0.0f, 0.2f, 0.6f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.leftLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[9].addShapeBox(-0.3f, 11.0f, -4.3f, 1, 1, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 0.6f, 0.0f, 2.0f, 0.6f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 2.0f, 0.0f, -0.2f, 2.0f, 0.0f, -0.2f);
        this.leftLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[10].addShapeBox(-0.2f, 1.5f, -2.5f, 4, 2, 1, 0.0f, 0.2f, 0.0f, 1.6f, 0.2f, 0.5f, 0.9f, 0.2f, 0.0f, 2.9f, 0.2f, 0.0f, 0.9f, -0.8f, 1.0f, 1.8f, 0.5f, 1.5f, 1.1f, 0.7f, 1.5f, 0.1f, -1.8f, 1.0f, 1.1f);
        this.leftLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[11].addShapeBox(-2.0f, 1.8f, -3.0f, 5, 2, 6, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.2f, 0.3f, 0.7f, 0.9f, -0.2f, 0.2f, 0.9f, -0.2f, 0.2f, 0.2f, 0.3f, 0.7f);
        this.leftLegModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[12].addShapeBox(-2.0f, 2.8f, -3.0f, 10, 6, 6, 0.0f, 0.0f, 0.0f, 0.5f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, -3.0f, 0.7f, -3.5f, -3.4f, 0.2f, -3.5f, -3.4f, 0.2f, 0.0f, -3.0f, 0.7f);
        this.leftLegModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.rightLegModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.rightLegModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.rightLegModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.rightLegModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.rightLegModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightLegModel[11] = new ModelRendererTurbo((ModelBase)this, 95, 51, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.2f, 11.1f, -0.3f, 4, 1, 3, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, -0.4f, 0.4f, 0.5f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.5f, 1.1f, -2.0f, 4, 4, 4, 0.0f, 1.0f, 0.3f, 0.8f, 0.9f, -1.3f, 0.8f, -3.0f, -0.5f, 1.0f, 1.0f, 0.3f, 0.8f, 0.2f, 0.5f, 0.4f, 0.7f, 0.5f, 0.4f, -2.5f, 1.5f, 0.2f, 0.2f, 1.5f, 0.2f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-3.1f, 5.1f, -2.8f, 5, 1, 3, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.5f, 6.1f, -2.0f, 4, 4, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.7f, 0.0f, 0.2f, 0.7f, -0.5f, 0.6f, 0.2f, -0.5f, 0.6f, 0.1f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 0.9f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-3.1f, 6.1f, -2.8f, 5, 1, 3, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[6].addShapeBox(-2.2f, 11.1f, -2.3f, 4, 1, 2, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.6f, 0.0f, 0.2f, 0.6f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.rightLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[7].addShapeBox(-0.7f, 11.0f, -4.3f, 1, 1, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 0.6f, 0.0f, 2.0f, 0.6f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 2.0f, 0.0f, -0.2f, 2.0f, 0.0f, -0.2f);
        this.rightLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[8].addShapeBox(-3.5f, 5.1f, -0.8f, 1, 1, 3, 0.0f, 0.5f, 0.8f, -0.5f, -1.0f, 0.8f, -0.5f, -1.0f, 0.5f, 0.8f, 0.5f, 0.5f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.rightLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[9].addShapeBox(-3.5f, 6.1f, -0.8f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.5f, 0.8f, -0.5f, -1.0f, 0.8f, -0.5f, -1.0f, 0.5f, 0.8f, 0.5f, 0.5f, 0.8f);
        this.rightLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[10].addShapeBox(-3.0f, 1.8f, -3.0f, 5, 2, 6, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.9f, -0.2f, 0.2f, 0.2f, 0.3f, 0.7f, 0.2f, 0.3f, 0.7f, 0.9f, -0.2f, 0.2f);
        this.rightLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[11].addShapeBox(-8.0f, 2.8f, -3.0f, 10, 6, 6, 0.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -4.5f, 0.0f, 0.0f, -3.5f, -3.4f, 0.2f, 0.0f, -3.0f, 0.7f, 0.0f, -3.0f, 0.7f, -3.5f, -3.4f, 0.2f);
        this.rightLegModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
