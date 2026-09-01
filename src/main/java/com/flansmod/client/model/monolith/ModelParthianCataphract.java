// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelParthianCataphract extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelParthianCataphract() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[26];
        this.leftArmModel = new ModelRendererTurbo[11];
        this.rightArmModel = new ModelRendererTurbo[11];
        this.leftLegModel = new ModelRendererTurbo[11];
        this.rightLegModel = new ModelRendererTurbo[11];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-8.0f, -6.0f, -4.0f, 16, 23, 8, 0.0f, -3.9f, -5.9f, -1.9f, -3.9f, -5.9f, -1.9f, -3.9f, -5.9f, -1.9f, -3.9f, -5.9f, -1.9f, -3.9f, -4.9f, -1.9f, -3.9f, -4.9f, -1.9f, -3.9f, -4.9f, -1.9f, -3.9f, -4.9f, -1.9f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.5f, 7.1f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.5f, 4.4f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-1.5f, 4.4f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.9f, -0.2f, 0.4f, 0.9f, -0.2f, 0.5f, 1.0f, -0.2f, 0.5f, 1.0f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.9f, 7.1f, -1.5f, 1, 2, 1, 0.0f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.9f, 4.4f, -1.5f, 1, 2, 1, 0.0f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-1.5f, 7.1f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.5f, 7.1f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.5f, 7.1f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.5f, 4.4f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.9f, -0.2f, 0.4f, 0.9f, -0.2f, 0.5f, 1.0f, -0.2f, 0.5f, 1.0f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(2.5f, 4.4f, -2.9f, 1, 2, 1, 0.0f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(2.5f, 4.4f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.5f, 4.4f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 1.0f, -0.2f, 0.4f, 0.9f, -0.2f, 0.4f, 0.9f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.5f, 4.4f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 1.0f, -0.2f, 0.4f, 0.9f, -0.2f, 0.4f, 0.9f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.5f, 4.4f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-3.5f, 7.1f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-1.5f, 7.1f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.5f, 7.1f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(2.5f, 7.1f, 1.9f, 1, 2, 1, 0.0f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f, 0.5f, 0.35f, -0.2f, 0.5f, 0.35f, -0.2f, 0.4f, 0.25f, -0.2f, 0.4f, 0.25f, -0.2f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.9f, 7.1f, 0.5f, 1, 2, 1, 0.0f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-4.9f, 4.4f, 0.5f, 1, 2, 1, 0.0f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(3.9f, 7.1f, 0.5f, 1, 2, 1, 0.0f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(3.9f, 4.4f, 0.5f, 1, 2, 1, 0.0f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(3.9f, 4.4f, -1.5f, 1, 2, 1, 0.0f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(3.9f, 7.1f, -1.5f, 1, 2, 1, 0.0f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f, -0.2f, 0.35f, 0.5f, -0.2f, 0.25f, 0.4f, -0.2f, 0.25f, 0.4f, -0.2f, 0.35f, 0.5f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -4.5f, -2.0f, 4, 10, 4, 0.0f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(1.0f, -1.0f, -2.0f, 2, 1, 4, 0.0f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(1.0f, 0.0f, -2.0f, 2, 1, 4, 0.0f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(1.0f, 1.0f, -2.0f, 2, 1, 4, 0.0f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(1.0f, 2.0f, -2.0f, 2, 1, 4, 0.0f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(-1.0f, 7.0f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, 0.3f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.3f, 0.2f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(-1.0f, 5.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.leftArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[7].addShapeBox(-1.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.3f, 0.3f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.leftArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[8].addShapeBox(-1.0f, 3.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.leftArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[9].addShapeBox(-1.0f, 4.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.leftArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[10].addShapeBox(1.0f, -2.0f, -2.0f, 2, 1, 4, 0.0f, 0.7f, 0.3f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f, 0.7f, 0.3f, 0.2f, 0.5f, 0.3f, 0.4f, 0.7f, 0.0f, 0.4f, 0.7f, 0.0f, 0.4f, 0.5f, 0.3f, 0.4f);
        this.leftArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -4.5f, -2.0f, 4, 10, 4, 0.0f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f, 0.1f, -2.4f, 0.1f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -1.0f, -2.0f, 2, 1, 4, 0.0f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, 0.0f, -2.0f, 2, 1, 4, 0.0f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 1.0f, -2.0f, 2, 1, 4, 0.0f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.0f, 2.0f, -2.0f, 2, 1, 4, 0.0f, 0.3f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.4f, 0.2f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.0f, 3.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-3.0f, 4.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.rightArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[7].addShapeBox(-3.0f, 5.0f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.rightArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[8].addShapeBox(-3.0f, 6.0f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.3f, 0.3f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.rightArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[9].addShapeBox(-3.0f, 7.0f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, 0.3f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.3f, 0.2f);
        this.rightArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[10].addShapeBox(-3.0f, -2.0f, -2.0f, 2, 1, 4, 0.0f, 0.3f, 0.5f, 0.2f, 0.7f, 0.3f, 0.2f, 0.7f, 0.3f, 0.2f, 0.3f, 0.5f, 0.2f, 0.7f, 0.0f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.7f, 0.0f, 0.4f);
        this.rightArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[6] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[9] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[10] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 10.1f, -3.3f, 4, 2, 4, 0.0f, 0.2f, -0.5f, 0.3f, 0.2f, -0.5f, 0.3f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.5f, 0.2f, 0.1f, 0.5f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-4.0f, -6.1f, -4.0f, 8, 24, 8, 0.0f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 6.7f, -2.0f, 4, 1, 4, 0.0f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 2.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-4.0f, -5.5f, -4.0f, 8, 16, 8, 0.0f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -2.8f, -5.0f, -0.8f, -0.8f, -4.0f, -0.8f, -0.8f, -4.0f, -0.8f, -2.8f, -5.0f, -0.8f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(-2.0f, 3.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[6].addShapeBox(-2.0f, 4.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].addShapeBox(-2.0f, 5.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[8].addShapeBox(-2.0f, 6.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[9].addShapeBox(-2.0f, 7.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[10].addShapeBox(-2.0f, 8.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[6] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[9] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[10] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 10.1f, -3.3f, 4, 2, 4, 0.0f, 0.2f, -0.5f, 0.3f, 0.2f, -0.5f, 0.3f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.5f, 0.2f, 0.1f, 0.5f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-4.0f, -6.1f, -4.0f, 8, 24, 8, 0.0f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f, -1.9f, -5.9f, -1.9f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 6.7f, -2.0f, 4, 1, 4, 0.0f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, -0.8f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 2.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-4.0f, -5.5f, -4.0f, 8, 16, 8, 0.0f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -1.8f, -4.0f, -1.8f, -0.8f, -4.0f, -0.8f, -2.8f, -5.0f, -0.8f, -2.8f, -5.0f, -0.8f, -0.8f, -4.0f, -0.8f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-2.0f, 3.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[6].addShapeBox(-2.0f, 4.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[7].addShapeBox(-2.0f, 5.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[8].addShapeBox(-2.0f, 6.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[9].addShapeBox(-2.0f, 7.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[10].addShapeBox(-2.0f, 8.7f, -2.0f, 4, 1, 3, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
