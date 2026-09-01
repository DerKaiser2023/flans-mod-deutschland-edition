// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelMusketeer extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelMusketeer() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[21];
        this.leftArmModel = new ModelRendererTurbo[14];
        this.rightArmModel = new ModelRendererTurbo[14];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 77, 48, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, -1.0f, -3.5f, 2, 2, 5, 0.0f, 0.2f, 0.1f, -0.3f, 1.5f, 0.0f, -0.7f, 0.6f, 0.2f, 1.2f, 0.0f, 0.2f, 0.7f, -1.6f, -0.3f, 0.2f, 2.5f, -1.3f, -0.8f, 0.8f, -1.0f, 1.5f, 0.0f, -0.8f, 1.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-2.0f, -1.0f, -3.5f, 2, 2, 5, 0.0f, 1.5f, 0.0f, -1.3f, 0.2f, 0.1f, -0.3f, 0.0f, 0.2f, 0.7f, 0.6f, 0.2f, 1.2f, 2.5f, -1.3f, -0.8f, -1.6f, -0.3f, 0.2f, 0.0f, -0.8f, 1.3f, 0.8f, -1.0f, 1.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f, 0.5f, 0.5f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, 1.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.1f, 0.2f, 0.0f, 1.1f, 0.2f, 0.0f, 1.1f, 0.2f, 0.5f, 0.1f, 0.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-7.0f, 0.0f, -2.0f, 2, 3, 4, 0.0f, 0.0f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -0.9f, 0.2f, 0.5f, 0.1f, 0.2f, 0.5f, 0.1f, 0.2f, -1.0f, -0.9f, 0.2f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 8.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, -0.1f, 0.0f, 0.0f, -1.1f, 0.2f, 0.0f, -1.1f, 0.2f, 0.2f, -0.1f, 0.0f, 1.0f, 0.5f, 0.5f, 0.0f, 1.5f, 1.0f, 0.0f, 1.5f, 1.0f, 1.0f, 0.5f, 0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-1.0f, 0.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-1.0f, 1.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(5.0f, 0.0f, -2.0f, 2, 3, 4, 0.0f, 0.5f, 0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.1f, 0.2f, -1.0f, -0.9f, 0.2f, -1.0f, -0.9f, 0.2f, 0.5f, 0.1f, 0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, -2.0f, 4, 8, 4, 0.0f, 0.0f, 1.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, 1.1f, 0.2f, 0.5f, 0.1f, 0.2f, 0.5f, 0.1f, 0.2f, 0.0f, 1.1f, 0.2f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 8.0f, -2.0f, 4, 5, 4, 0.0f, 0.0f, -1.1f, 0.2f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.0f, -1.1f, 0.2f, 0.0f, 1.5f, 1.0f, 1.0f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, 0.0f, 1.5f, 1.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-1.0f, 1.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.0f, 2.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-1.0f, 3.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-1.0f, 4.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.0f, 4.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-1.0f, 5.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-1.0f, 6.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-1.0f, 7.0f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-1.0f, 7.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-1.0f, 8.5f, -2.7f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.0f, 7.7f, -2.0f, 8, 2, 4, 0.0f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f, 0.8f, 0.0f, 0.4f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftArmModel[7] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.leftArmModel[8] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.leftArmModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.leftArmModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.leftArmModel[11] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.leftArmModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftArmModel[13] = new ModelRendererTurbo((ModelBase)this, 60, 50, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 8.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 6.0f, -2.0f, 4, 2, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 2.0f, -2.0f, 4, 4, 4, 0.0f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-0.25f, -2.0f, -2.0f, 1, 5, 4, 0.0f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(1.25f, -2.0f, -2.0f, 1, 5, 4, 0.0f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(-1.0f, -2.0f, 0.25f, 4, 5, 1, 0.0f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f);
        this.leftArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[7].addShapeBox(-1.0f, -2.0f, -1.25f, 4, 5, 1, 0.0f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f);
        this.leftArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[8].addShapeBox(2.55f, -2.0f, -2.55f, 1, 5, 1, 0.0f, 0.0f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, -0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f);
        this.leftArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[9].addShapeBox(-1.55f, -2.0f, -2.55f, 1, 5, 1, 0.0f, -0.1f, 0.3f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f);
        this.leftArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[10].addShapeBox(-1.55f, -2.0f, 1.55f, 1, 5, 1, 0.0f, -0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, 0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.leftArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[11].addShapeBox(2.55f, -2.0f, 1.55f, 1, 5, 1, 0.0f, 0.0f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f);
        this.leftArmModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[12].addShapeBox(-1.0f, 3.5f, -2.0f, 4, 1, 4, 0.0f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f);
        this.leftArmModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[13].addShapeBox(-1.0f, 5.4f, -2.0f, 4, 2, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftArmModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightArmModel[7] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.rightArmModel[8] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.rightArmModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.rightArmModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.rightArmModel[11] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.rightArmModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightArmModel[13] = new ModelRendererTurbo((ModelBase)this, 60, 50, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, 8.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 6.0f, -2.0f, 4, 2, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, 2.0f, -2.0f, 4, 4, 4, 0.0f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, -0.9f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-2.25f, -2.0f, -2.0f, 1, 5, 4, 0.0f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-0.75f, -2.0f, -2.0f, 1, 5, 4, 0.0f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.4f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f, 0.1f, 0.3f, 0.6f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-3.0f, -2.0f, 0.25f, 4, 5, 1, 0.0f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f);
        this.rightArmModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[7].addShapeBox(-3.0f, -2.0f, -1.25f, 4, 5, 1, 0.0f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.4f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f, 0.6f, 0.3f, 0.1f);
        this.rightArmModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[8].addShapeBox(0.55f, -2.0f, -2.55f, 1, 5, 1, 0.0f, 0.0f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, -0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f);
        this.rightArmModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[9].addShapeBox(-3.55f, -2.0f, -2.55f, 1, 5, 1, 0.0f, -0.1f, 0.3f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f);
        this.rightArmModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[10].addShapeBox(-3.55f, -2.0f, 1.55f, 1, 5, 1, 0.0f, -0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, 0.1f, 0.3f, 0.0f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.rightArmModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[11].addShapeBox(0.55f, -2.0f, 1.55f, 1, 5, 1, 0.0f, 0.0f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, -0.1f, 0.0f, 0.3f, -0.1f, 0.0f, 0.3f, 0.1f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f);
        this.rightArmModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[12].addShapeBox(-3.0f, 3.5f, -2.0f, 4, 1, 4, 0.0f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.6f, 0.2f, 0.6f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f, 0.4f, -0.5f, 0.4f);
        this.rightArmModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[13].addShapeBox(-3.0f, 5.4f, -2.0f, 4, 2, 4, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightArmModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 83, 36, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 4, 51, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 5.8f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 83, 36, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 4, 51, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 5.8f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f, 0.7f, 0.2f, 0.7f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
