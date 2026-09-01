// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelDenmarkNapoleonic extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelDenmarkNapoleonic() {
        this.textureX = 128;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[24];
        this.leftArmModel = new ModelRendererTurbo[5];
        this.rightArmModel = new ModelRendererTurbo[5];
        this.leftLegModel = new ModelRendererTurbo[4];
        this.rightLegModel = new ModelRendererTurbo[4];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 80, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 80, 14, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 115, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 116, 26, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 97, 2, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 97, 2, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-3.25f, 0.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-2.25f, 2.0f, -3.2f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-2.25f, 4.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-2.25f, 6.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-2.25f, 8.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(0.0f, -0.2f, -2.0f, 4, 7, 4, 0.0f, 0.0f, 0.25f, 0.5f, 0.7f, 0.1f, 0.5f, 0.7f, 0.1f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.25f, 0.4f, 0.5f, 0.1f, 0.4f, 0.5f, 0.1f, 0.8f, 0.0f, 0.2f, 0.8f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.0f, -1.2f, -2.0f, 6, 1, 4, 0.0f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 8.5f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, 0.2f, 0.2f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 9.0f, 0.0f, 4, 5, 2, 0.0f, -0.5f, -0.25f, 0.8f, 0.5f, -0.1f, 0.8f, 0.5f, -0.1f, 0.8f, 0.0f, -0.2f, 0.8f, 0.5f, 0.5f, 0.5f, -0.4f, 0.2f, 0.5f, 0.0f, 0.2f, 1.0f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(1.25f, 0.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.25f, 2.0f, -3.2f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.25f, 4.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.25f, 6.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.25f, 8.0f, -3.1f, 1, 1, 1, 0.0f, -0.7f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, -0.7f, -0.2f, -0.3f, -0.7f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, -0.7f, -0.3f, -0.3f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.0f, 8.5f, -2.0f, 4, 3, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, -0.2f, 0.2f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.3f, 0.2f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.3f, 0.2f, 0.5f, 0.5f, 0.1f, 0.4f, 0.0f, 0.25f, 0.4f, 0.0f, 0.2f, 0.8f, 0.5f, 0.1f, 0.8f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.0f, -0.2f, -2.0f, 4, 7, 4, 0.0f, 0.7f, 0.1f, 0.4f, 0.0f, 0.25f, 0.5f, 0.0f, 0.2f, 0.5f, 0.7f, 0.1f, 0.5f, 0.3f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.3f, 0.0f, 0.5f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.0f, 9.0f, 0.0f, 4, 5, 2, 0.0f, 0.5f, -0.1f, 0.8f, -0.5f, -0.25f, 0.8f, 0.0f, -0.2f, 0.8f, 0.5f, -0.1f, 0.8f, -0.4f, 0.2f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.5f, 1.2f, 0.0f, 0.2f, 1.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(2.0f, -0.55f, -2.5f, 2, 10, 5, 0.0f, -0.3f, 0.1f, 0.4f, 0.3f, -0.1f, 0.4f, 0.3f, -0.1f, 0.2f, -0.3f, 0.1f, 0.2f, 6.5f, -1.5f, 0.5f, -8.7f, 1.8f, 0.5f, -8.4f, 3.8f, 0.8f, 6.5f, 0.8f, 0.8f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-2.0f, 1.8f, -2.6f, 4, 7, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-2.0f, -0.2f, -2.6f, 4, 2, 1, 0.0f, 1.4f, 0.3f, -0.1f, 1.4f, 0.3f, -0.1f, 1.4f, 0.3f, 0.0f, 1.4f, 0.3f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, 9.0f, -2.0f, 4, 2, 3, 0.0f, 0.0f, -0.25f, 0.4f, 0.5f, -0.1f, 0.4f, 0.5f, -0.1f, 1.5f, 0.0f, 0.0f, 1.5f, -1.5f, 0.5f, 1.0f, 0.7f, 0.0f, 0.7f, 0.3f, 0.0f, 1.5f, -2.0f, 0.5f, 1.5f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-4.0f, 9.0f, -2.0f, 4, 2, 3, 0.0f, 0.5f, -0.1f, 0.4f, 0.0f, -0.25f, 0.4f, 0.0f, 0.0f, 1.5f, 0.5f, -0.1f, 1.5f, 0.7f, 0.0f, 0.7f, -1.5f, 0.5f, 1.0f, -2.0f, 0.5f, 1.5f, 0.3f, 0.0f, 1.5f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 19, 18, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-2.0f, -2.5f, -1.5f, 4, 2, 3, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 1.1f, 0.2f, 0.3f, 0.9f, 0.2f, 0.3f, 0.9f, 0.2f, 0.2f, 1.1f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 6.5f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.6f, 0.2f, 0.3f, 0.4f, 0.2f, 0.3f, 0.4f, 0.2f, 0.2f, 0.6f, 0.2f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(3.0f, 6.5f, -0.5f, 1, 1, 1, 0.0f, -0.2f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.6f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, 0.1f, 0.0f, -0.3f, -0.6f, -1.0214052E-14f, -0.3f, -0.6f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(3.0f, 5.0f, -0.5f, 1, 1, 1, 0.0f, -0.2f, -0.4f, -0.3f, -0.6f, -0.4f, -0.3f, -0.6f, -0.4f, -0.1f, -0.3f, -0.4f, -0.1f, 0.1f, 0.0f, -0.3f, -0.6f, -1.0214052E-14f, -0.3f, -0.6f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 19, 18, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.9f, 0.2f, 0.2f, 1.1f, 0.2f, 0.2f, 1.1f, 0.2f, 0.3f, 0.9f, 0.2f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 6.5f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.4f, 0.2f, 0.2f, 0.6f, 0.2f, 0.2f, 0.6f, 0.2f, 0.3f, 0.4f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.0f, 5.0f, -0.5f, 1, 1, 1, 0.0f, -0.6f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.6f, -0.4f, -0.1f, -0.6f, -1.0214052E-14f, -0.3f, 0.1f, 0.0f, -0.3f, 0.1f, 0.0f, -0.1f, -0.6f, 0.0f, -0.1f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-4.0f, 6.5f, -0.5f, 1, 1, 1, 0.0f, -0.6f, -0.4f, -0.3f, -0.2f, -0.4f, -0.3f, -0.3f, -0.4f, -0.1f, -0.6f, -0.4f, -0.1f, -0.6f, -1.0214052E-14f, -0.3f, 0.1f, 0.0f, -0.3f, 0.1f, 0.0f, -0.1f, -0.6f, 0.0f, -0.1f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-2.0f, -2.5f, -1.5f, 4, 2, 3, 0.0f, 0.2f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 5, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 22, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -0.5f, -2.0f, 4, 5, 4, 0.0f, 0.4f, -0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 6, 5, 0.0f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, -0.8f, 0.4f, 0.0f, -0.8f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 5, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 22, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -0.5f, -2.0f, 4, 5, 4, 0.0f, 0.4f, 0.2f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, -0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f, 0.4f, 0.5f, 0.2f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 6, 5, 0.0f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, -0.8f, 0.4f, 0.0f, -0.8f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
