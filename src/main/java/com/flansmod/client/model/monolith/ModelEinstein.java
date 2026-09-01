// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEinstein extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEinstein() {
        this.textureX = 512;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[9];
        this.bodyModel = new ModelRendererTurbo[13];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[6];
        this.rightLegModel = new ModelRendererTurbo[6];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 241, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-0.5f, -3.8f, -5.0f, 1, 2, 1, 0.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, -0.5f, 0.5f, 0.2f, -0.5f, 0.5f, 0.2f, -0.5f, 0.0f, 0.2f, -0.5f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-0.5f, -2.8f, -5.0f, 1, 1, 1, 0.0f, 0.2f, -0.5f, 0.5f, 0.2f, -0.5f, 0.5f, 0.2f, -0.5f, 0.0f, 0.2f, -0.5f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.5f, -2.2f, -4.2f, 3, 1, 1, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-2.5f, -2.2f, -4.2f, 1, 1, 1, 0.0f, -0.1f, -0.4f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-1.4f, -2.8f, -5.0f, 1, 1, 2, 0.0f, -0.4f, -0.2f, -0.3f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.2f, -0.2f, -0.3f, -0.2f, -0.3f, -0.2f, -0.2f, -0.2f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-2.5f, -5.0f, -4.2f, 1, 1, 1, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.2f, -0.3f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(1.5f, -5.0f, -4.2f, 1, 1, 1, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.1f, 0.0f, 0.0f, -0.4f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, -0.4f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(0.4f, -2.8f, -5.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, -0.2f, -0.4f, -0.2f, -0.3f, -0.3f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.2f, -0.3f, -0.1f, -0.1f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(1.5f, -2.2f, -4.2f, 1, 1, 1, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 2, 7, 3, 0.0f, 0.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 0.0f, -2.0f, 2, 11, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, -2.0f, 2, 7, 3, 0.0f, -2.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(2.0f, 0.0f, -2.0f, 2, 11, 4, 0.0f, 0.0f, 0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.0f, 0.0f, -2.0f, 6, 10, 4, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-2.0f, 0.0f, -1.0f, 4, 5, 3, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, 2.0f, 0.5f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.95f, 1.0f, -2.0f, 1, 6, 1, 0.0f, -0.35f, 0.0f, 0.6f, -0.2f, 0.1f, 0.6f, -0.2f, 0.1f, 0.6f, -0.35f, 0.0f, 0.6f, 1.0f, 0.0f, 0.6f, -0.5f, -0.5f, 0.6f, -0.5f, -0.5f, 0.6f, 1.0f, 0.0f, 0.6f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.0f, 0.0f, -2.0f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.6f, -0.7f, -0.7f, 0.6f, -0.7f, -0.7f, 0.6f, 0.1f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, -1.4f, 0.0f, 0.6f, -1.4f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.0f, 0.0f, -2.0f, 1, 1, 1, 0.0f, -0.7f, -0.7f, 0.6f, 0.1f, 0.0f, 0.6f, 0.1f, 0.0f, 0.6f, -0.7f, -0.7f, 0.6f, -1.4f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, -1.4f, 0.0f, 0.6f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-1.95f, 1.0f, -2.0f, 1, 6, 1, 0.0f, -0.2f, 0.1f, 0.6f, -0.35f, 0.0f, 0.6f, -0.35f, 0.0f, 0.6f, -0.2f, 0.1f, 0.6f, -0.5f, -0.5f, 0.6f, 1.0f, 0.0f, 0.6f, 1.0f, 0.0f, 0.6f, -0.5f, -0.5f, 0.6f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, -2.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, -0.4f, 0.5f, -0.2f, 0.0f, 0.5f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-2.0f, 0.0f, -2.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, 0.0f, -0.4f, 0.5f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 321, 1, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 345, 1, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 433, 1, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -2.0f, -2.0f, 4, 9, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -1.0f, -2.0f, 2, 8, 3, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(0.0f, -1.0f, -2.0f, 2, 8, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, -0.3f, 0.7f, 1.0f, -0.3f, 1.0f, 2.0f, 0.0f, 1.2f);
        this.leftLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 273, 1, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 297, 1, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.rightLegModel[5] = new ModelRendererTurbo((ModelBase)this, 417, 1, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -2.0f, -2.0f, 4, 9, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(0.0f, -1.0f, -2.0f, 2, 8, 3, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[5].addShapeBox(-2.0f, -1.0f, -2.0f, 2, 8, 4, 0.0f, 0.1f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 1.0f, -0.3f, 0.7f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.2f, 1.0f, -0.3f, 1.0f);
        this.rightLegModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
