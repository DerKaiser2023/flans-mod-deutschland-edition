// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelKuyakPlate extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelKuyakPlate() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[12];
        this.leftArmModel = new ModelRendererTurbo[6];
        this.rightArmModel = new ModelRendererTurbo[6];
        this.leftLegModel = new ModelRendererTurbo[9];
        this.rightLegModel = new ModelRendererTurbo[9];
        this.skirtFrontModel = new ModelRendererTurbo[2];
        this.skirtRearModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 65, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-2.0f, 9.2f, -3.5f, 4, 1, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, 4.8f, -2.5f, 9, 6, 5, 0.0f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 5, 5, 0.0f, -0.4f, -0.1f, -0.4f, -0.4f, -0.1f, -0.4f, -0.4f, -0.1f, -0.4f, -0.4f, -0.1f, -0.4f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(2.0f, 9.2f, -3.5f, 2, 1, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, -1.0f, 0.2f, 0.0f, -1.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, -1.0f, 0.1f, 0.0f, -1.0f, 0.0f, 0.0f, -0.7f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(1.5f, -0.2f, -2.5f, 2, 2, 4, 0.0f, -0.1f, 0.1f, -0.2f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(1.5f, -0.2f, 1.4f, 2, 7, 1, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, 4.2f, 0.5f, 0.1f, -4.5f, 0.5f, -0.1f, -4.5f, 0.5f, 0.0f, 4.2f, 0.5f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.5f, -0.2f, 1.4f, 2, 7, 1, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -4.5f, 0.5f, -0.1f, 4.2f, 0.5f, 0.1f, 4.2f, 0.5f, 0.0f, -4.5f, 0.5f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.5f, -0.2f, -2.5f, 2, 2, 4, 0.0f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.2f, -0.1f, 0.1f, 0.0f, -0.1f, 0.1f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-4.0f, 9.2f, -3.5f, 2, 1, 7, 0.0f, 0.25f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.25f, 0.0f, -1.0f, 0.15f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.15f, 0.0f, -1.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.5f, 4.8f, -2.5f, 18, 10, 10, 0.0f, 0.0f, 0.0f, 0.5f, -9.0f, 0.0f, 0.5f, -9.0f, 0.0f, -4.6f, 0.0f, 0.0f, -4.6f, -0.25f, -5.0f, -0.1f, -9.25f, -5.0f, -0.1f, -9.25f, -5.0f, -5.1f, -0.25f, -5.0f, -5.1f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.5f, 9.8f, -2.5f, 18, 4, 10, 0.0f, -0.4f, 0.0f, -0.1f, -9.4f, 0.0f, -0.1f, -9.4f, 0.0f, -5.1f, -0.4f, 0.0f, -5.1f, 0.3f, -2.0f, 0.6f, -8.7f, -2.0f, 0.6f, -8.7f, -2.0f, -4.5f, 0.3f, -2.0f, -4.5f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.5f, 0.8f, -2.5f, 18, 8, 10, 0.0f, -0.1f, 0.0f, 0.2f, -9.1f, 0.0f, 0.2f, -9.1f, 0.0f, -4.9f, -0.1f, 0.0f, -4.9f, 0.0f, -4.0f, 0.5f, -9.0f, -4.0f, 0.5f, -9.0f, -4.0f, -4.6f, 0.0f, -4.0f, -4.6f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 9.5f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 9.0f, -2.0f, 4, 3, 4, 0.0f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 2.4f, -2.0f, 4, 1, 4, 0.0f, 0.4f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.3f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, 5.7f, -2.0f, 4, 3, 4, 0.0f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-1.0f, 3.9f, -2.0f, 4, 2, 4, 0.0f, 0.4f, -0.8f, 0.5f, 0.4f, -0.8f, 0.5f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, -0.8f, 0.5f, 0.4f, -0.8f, 0.5f, 0.4f, 0.2f, 0.5f, 0.4f, 0.2f, 0.5f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f);
        this.leftArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, 2.4f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.4f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, 5.7f, -2.0f, 4, 3, 4, 0.0f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.3f, 2.0f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 9.0f, -2.0f, 4, 3, 4, 0.0f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f, 0.2f, -2.2f, 0.2f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.0f, 9.5f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.0f, 3.9f, -2.0f, 4, 2, 4, 0.0f, 0.4f, -0.8f, 0.5f, 0.4f, -0.8f, 0.5f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, -0.8f, 0.5f, 0.4f, -0.8f, 0.5f, 0.4f, 0.2f, 0.5f, 0.4f, 0.2f, 0.5f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.leftLegModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.leftLegModel[7] = new ModelRendererTurbo((ModelBase)this, 99, 3, this.textureX, this.textureY);
        this.leftLegModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 11.1f, -1.5f, 4, 1, 4, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, -0.4f, 0.4f, 0.5f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-1.8f, 5.1f, -2.5f, 4, 1, 1, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-1.8f, 6.1f, -2.0f, 4, 4, 4, 0.0f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.4f, -1.0f, 0.6f, 0.4f, -1.0f, 0.6f, 0.3f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.3f, 0.5f, 0.1f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-1.8f, 1.9f, -2.0f, 4, 5, 3, 0.0f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, -1.5f, 0.2f, 0.5f, -1.5f, -0.7f, 0.2f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, -0.9f, 0.3f, 0.0f, -1.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-1.8f, 6.1f, -2.5f, 4, 1, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(2.0f, 6.5f, -1.8f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, -1.0f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 0.5f, 0.5f, 0.8f, -1.0f, 0.5f, 0.8f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[6].addShapeBox(2.0f, 5.5f, -1.8f, 1, 1, 3, 0.0f, -1.0f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 0.5f, 0.5f, 0.8f, -1.0f, 0.5f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.leftLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].addShapeBox(-2.0f, 11.1f, -3.5f, 4, 1, 2, 0.0f, -0.1f, 0.0f, 0.5f, -0.1f, 0.0f, 0.5f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[8].addShapeBox(-2.0f, 1.1f, -2.0f, 4, 7, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 99, 3, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.rightLegModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.rightLegModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.rightLegModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 1.1f, -2.0f, 4, 7, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.2f, 1.9f, -2.0f, 4, 5, 3, 0.0f, 0.8f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, -1.5f, -0.7f, 0.8f, -1.5f, 0.2f, 0.3f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.3f, 0.0f, -1.2f, 0.3f, 0.0f, -0.9f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.2f, 6.1f, -2.0f, 4, 4, 4, 0.0f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.4f, -1.0f, 0.6f, 0.4f, -1.0f, 0.6f, 0.0f, 0.5f, 0.1f, 0.3f, 0.5f, 0.1f, 0.3f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 11.1f, -1.5f, 4, 1, 4, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, -0.4f, 0.4f, 0.5f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 11.1f, -3.5f, 4, 1, 2, 0.0f, -0.1f, 0.0f, 0.5f, -0.1f, 0.0f, 0.5f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-2.2f, 5.1f, -2.5f, 4, 1, 1, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[6].addShapeBox(-2.2f, 6.1f, -2.5f, 4, 1, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, 0.7f, -0.4f, 0.2f, 0.7f, -0.4f);
        this.rightLegModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[7].addShapeBox(-3.0f, 5.5f, -1.8f, 1, 1, 3, 0.0f, 0.5f, 0.8f, -0.5f, -1.0f, 0.8f, -0.5f, -1.0f, 0.5f, 0.8f, 0.5f, 0.5f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.rightLegModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[8].addShapeBox(-3.0f, 6.5f, -1.8f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.5f, 0.8f, -0.5f, -1.0f, 0.8f, -0.5f, -1.0f, 0.5f, 0.8f, 0.5f, 0.5f, 0.8f);
        this.rightLegModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-4.0f, -1.5f, -2.0f, 8, 2, 2, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.5f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, 0.9f, 0.1f, 0.5f, 0.9f, 0.1f, 0.5f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-4.0f, 0.5f, -2.0f, 8, 2, 2, 0.0f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.4f, 0.6f, 1.4f, 1.4f, 0.6f, 1.4f, 1.4f, 0.6f, 1.7f, 1.4f, 0.6f, 1.7f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(-4.0f, -1.5f, 0.0f, 8, 2, 2, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(-4.0f, 0.5f, 0.0f, 8, 2, 2, 0.0f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, 1.4f, 0.6f, 1.8f, 1.4f, 0.6f, 1.7f, 1.4f, 0.6f, 1.4f, 1.4f, 0.6f, 1.4f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
