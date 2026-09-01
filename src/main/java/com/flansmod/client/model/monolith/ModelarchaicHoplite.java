// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelarchaicHoplite extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelarchaicHoplite() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[16];
        this.leftArmModel = new ModelRendererTurbo[3];
        this.rightArmModel = new ModelRendererTurbo[3];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.skirtFrontModel = new ModelRendererTurbo[3];
        this.skirtRearModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 6.5f, -2.0f, 4, 4, 4, 0.0f, 0.1f, -1.0f, 0.4f, 0.0f, -0.5f, 0.8f, 0.0f, 0.0f, 1.0f, 0.2f, 0.0f, 0.5f, 0.15f, -0.4f, 0.2f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.15f, -0.4f, 0.2f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -2.0f, -0.3f, 1.0f, 0.0f, 0.2f, 1.5f, 0.0f, -0.7f, 0.5f, -2.0f, -1.0f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, -3.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.2f, 1.5f, -2.0f, -0.3f, 1.0f, -2.0f, -1.0f, 0.5f, 0.0f, -0.7f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, -3.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.5f, -1.0f, 0.4f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.0f, 0.1f, -1.0f, 0.5f, 0.1f, 1.0f, 0.4f, 0.0f, 0.49f, 0.8f, 0.0f, 0.0f, 1.0f, 0.2f, 0.0f, 0.4f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.8f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, 0.8f, 0.5f, 0.3f, 0.5f, 1.0f, 0.4f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 1.0f, 0.1f, 1.0f, 0.5f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 1, 4, 0.0f, 1.0f, -0.3f, 0.3f, -1.5f, -0.3f, 0.2f, 0.0f, -0.3f, 0.8f, 1.0f, -0.3f, 0.5f, 0.8f, 0.5f, 0.5f, -0.5f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, 0.8f, 0.5f, 0.3f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, -0.5f, -2.0f, 4, 1, 4, 0.0f, -1.5f, -0.3f, 0.2f, 1.0f, -0.3f, 0.3f, 1.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.8f, -0.5f, 0.5f, 0.8f, 0.8f, 0.5f, 0.5f, 0.8f, 0.5f, 0.3f, 0.0f, 0.5f, 1.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.5f, 0.8f, 0.8f, 0.5f, 0.5f, 0.8f, 0.5f, 0.3f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.8f, 0.5f, 1.0f, 0.4f, 0.1f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.1f, -1.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.51f, 0.8f, 0.1f, 1.0f, 0.4f, 0.2f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 6.5f, -2.0f, 4, 4, 4, 0.0f, 0.0f, -0.5f, 0.8f, 0.1f, -1.0f, 0.4f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, -0.4f, 0.4f, 0.15f, -0.4f, 0.2f, 0.15f, -0.4f, 0.2f, 0.0f, -0.4f, 0.4f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 1.8f, -2.1f, 4, 2, 1, 0.0f, -0.4f, 0.2f, 0.5f, -0.2f, 0.0f, 0.8f, 0.0f, 0.5f, -1.5f, -0.2f, 0.5f, -0.3f, 0.4f, 0.3f, 1.0f, -0.4f, 0.3f, 1.2f, 0.0f, 1.3f, -1.0f, 0.4f, 1.8f, -0.5f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 1.8f, -2.1f, 4, 2, 1, 0.0f, -0.2f, 0.0f, 0.8f, -0.4f, 0.2f, 0.5f, -0.2f, 0.5f, -0.3f, 0.0f, 0.5f, -1.5f, -0.4f, 0.3f, 1.2f, 0.4f, 0.3f, 1.0f, 0.4f, 1.8f, -0.5f, 0.0f, 1.3f, -1.0f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-2.0f, 7.5f, -2.9f, 4, 3, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -0.5f, -0.3f, -0.2f, -0.5f, -0.3f, -0.2f, 1.0f, -0.3f, 0.0f, 1.0f, -0.3f, 0.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-2.0f, 5.5f, -2.9f, 4, 2, 1, 0.0f, -0.7f, -0.3f, 0.0f, -0.7f, -0.3f, 0.0f, 1.0f, 1.5f, 0.0f, 1.0f, 1.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-4.0f, 10.1f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, 0.0f, 0.4f, 0.0f, 0.3f, 0.8f, 0.0f, 0.3f, 0.8f, 0.4f, 0.0f, 0.4f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, 10.1f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.3f, 0.8f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.0f, 0.3f, 0.8f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 4.5f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 1.5f, -2.0f, 4, 3, 4, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-2.0f, -2.5f, -2.0f, 5, 3, 4, 0.0f, -2.0f, 0.3f, 0.4f, 1.0f, -0.75f, 0.4f, 1.0f, -0.75f, 0.4f, -2.0f, 0.3f, 0.4f, -0.7f, 0.2f, 0.2f, 0.3f, 1.5f, 0.2f, 0.3f, 1.5f, 0.2f, -0.7f, 0.2f, 0.2f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, 1.5f, -2.0f, 4, 3, 4, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 4.5f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, -2.5f, -2.0f, 5, 3, 4, 0.0f, 1.0f, -0.75f, 0.4f, -2.0f, 0.3f, 0.4f, -2.0f, 0.3f, 0.4f, 1.0f, -0.75f, 0.4f, 0.3f, 1.5f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, 0.3f, 1.5f, 0.2f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 1.0f, 0.1f, 0.0f, 1.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.5f, -2.0f, 2, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 7.5f, -2.0f, 2, 3, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -1.8f, 0.1f, 0.0f, -1.8f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 3.2f, -2.0f, 2, 2, 4, 0.0f, 0.1f, 0.0f, 0.2f, 2.1f, 0.0f, 0.2f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.2f, 0.1f, -0.5f, 0.2f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.3f, 0.9f, 0.1f, 0.3f, 0.9f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.leftLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 1.0f, 0.1f, 0.0f, 1.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 5.5f, -2.0f, 2, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 7.5f, -2.0f, 2, 3, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -1.8f, 0.1f, 0.0f, -1.8f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 3.2f, -2.0f, 2, 2, 4, 0.0f, 0.1f, 0.0f, 0.2f, 2.1f, 0.0f, 0.2f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.2f, 0.1f, -0.5f, 0.2f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.3f, 0.9f, 0.1f, 0.3f, 0.9f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.rightLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-4.0f, -2.2f, -2.0f, 8, 6, 3, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f);
        this.skirtFrontModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(-2.0f, -0.7f, -2.8f, 4, 2, 1, 0.0f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.skirtFrontModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-2.0f, 1.3f, -2.8f, 4, 2, 1, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f, -0.9f, -0.3f, 0.2f);
        this.skirtFrontModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY)).addShapeBox(-4.0f, -2.2f, -1.0f, 8, 6, 3, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f, 0.8f, 0.2f, 0.8f);
        this.skirtRearModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
