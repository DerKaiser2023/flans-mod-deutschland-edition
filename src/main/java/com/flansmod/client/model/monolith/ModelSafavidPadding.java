// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSafavidPadding extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSafavidPadding() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[20];
        this.leftArmModel = new ModelRendererTurbo[2];
        this.rightArmModel = new ModelRendererTurbo[2];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[3];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 7.7f, -2.0f, 8, 1, 4, 0.0f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, -0.2f, -2.0f, 7, 8, 4, 0.0f, 0.7f, 0.1f, 0.5f, -3.0f, 0.1f, 0.5f, -3.0f, 0.1f, 0.5f, 0.7f, 0.1f, 0.5f, 0.5f, 0.5f, 0.5f, -3.0f, 0.7f, 0.5f, -3.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 10.0f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.5f, 2.0f, -3.0f, 7, 1, 1, 0.0f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.5f, 2.0f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(2.5f, 2.0f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.5f, 3.3f, -3.0f, 7, 1, 1, 0.0f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.5f, 3.3f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.5f, 3.3f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.5f, 4.6f, -3.0f, 7, 1, 1, 0.0f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-3.5f, 4.6f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(2.5f, 4.6f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-3.5f, 6.0f, -3.0f, 7, 1, 1, 0.0f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.5f, 6.0f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(2.5f, 6.0f, -3.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f, -0.1f, -0.1f, -0.2f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.0f, 8.8f, -2.0f, 8, 2, 4, 0.0f, 0.65f, -0.1f, 0.9f, 1.1f, 0.9f, 0.9f, 1.1f, 0.9f, 0.9f, 0.65f, -0.1f, 0.9f, 0.9f, 0.4f, 0.9f, 0.65f, -0.1f, 0.9f, 0.65f, -0.1f, 0.9f, 0.9f, 0.4f, 0.9f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.0f, 8.5f, -2.0f, 8, 2, 4, 0.0f, 1.1f, 0.4f, 1.1f, 0.7f, -0.1f, 1.1f, 0.7f, -0.1f, 1.1f, 1.1f, 0.4f, 1.1f, 0.9f, -0.1f, 1.1f, 1.1f, 0.4f, 1.1f, 1.1f, 0.5f, 1.1f, 0.9f, -0.1f, 1.1f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.0f, -0.2f, -2.5f, 4, 2, 5, 0.0f, 0.0f, 0.1f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.1f, 0.2f, -1.0f, -1.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -1.0f, 0.2f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-3.0f, -0.2f, -2.0f, 7, 8, 4, 0.0f, -3.0f, 0.1f, 0.5f, 0.7f, 0.1f, 0.5f, 0.7f, 0.1f, 0.5f, -3.0f, 0.1f, 0.5f, -3.0f, 0.7f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -3.0f, 0.7f, 0.5f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(0.0f, -0.2f, -2.5f, 4, 2, 5, 0.0f, 0.0f, 0.3f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -1.0f, 0.2f, -1.0f, -1.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.2f, 0.1f, 0.4f, 0.8f, 0.4f, 0.6f, 0.2f, 0.4f, 0.6f, 0.2f, 0.4f, 0.4f, 0.8f, 0.4f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.1f, 0.1f, 0.6f, 0.2f, 0.4f, 0.4f, 0.8f, 0.4f, 0.4f, 0.8f, 0.4f, 0.6f, 0.2f, 0.4f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 11, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -1.5f, -2.0f, 4, 8, 4, 0.0f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.4f, -0.3f, 0.0f, 0.8f, 1.6f, -0.5f, 0.7f, 1.6f, -0.5f, 0.7f, -0.3f, 0.0f, 0.8f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 57, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 11, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -1.5f, -2.0f, 4, 8, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.5f, 1.6f, -0.5f, 0.7f, -0.3f, 0.0f, 0.8f, -0.3f, 0.0f, 0.8f, 1.6f, -0.5f, 0.7f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
