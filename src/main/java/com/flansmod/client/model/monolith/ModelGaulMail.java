// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelGaulMail extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGaulMail() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[15];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[2];
        this.rightLegModel = new ModelRendererTurbo[2];
        this.skirtRearModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 8.5f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 6, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 2.0f, -2.0f, 8, 6, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 10.0f, -2.0f, 8, 3, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.6f, 1.6f, 0.6f, 0.6f, 1.6f, 0.6f, 0.6f, 1.6f, 0.6f, 0.6f, 1.6f, 0.6f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 8.3f, -2.0f, 8, 1, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 0.0f, -2.2f, 2, 2, 4, 0.0f, 0.8f, 0.5f, 0.55f, 1.2f, 0.3f, 0.55f, 1.2f, 0.3f, 0.55f, 0.8f, 0.5f, 0.55f, 1.55f, 1.3f, 0.55f, 0.55f, 2.3f, 0.55f, 0.55f, 2.3f, 0.55f, 1.55f, 1.3f, 0.55f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 0.0f, 1.0f, 8, 4, 1, 0.0f, 0.55f, 0.3f, -1.0f, 0.55f, 0.5f, -1.0f, 0.55f, 0.5f, 0.55f, 0.55f, 0.3f, 0.55f, 0.55f, 0.3f, -1.0f, 0.55f, 0.3f, -1.0f, 0.55f, 0.3f, 0.55f, 0.55f, 0.3f, 0.55f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.0f, 0.0f, -2.2f, 2, 2, 4, 0.0f, 1.2f, 0.3f, 0.55f, 0.8f, 0.5f, 0.55f, 0.8f, 0.5f, 0.55f, 1.2f, 0.3f, 0.55f, 0.55f, 2.3f, 0.55f, 1.55f, 1.3f, 0.55f, 1.55f, 1.3f, 0.55f, 0.55f, 2.3f, 0.55f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.0f, 1.0f, -2.0f, 8, 6, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 1.2f, -4.6f, 8, 1, 4, 0.0f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f, -2.7f, -0.3f, -1.6f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-5.0f, -1.0f, 2.0f, 10, 1, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-7.0f, 0.0f, 3.0f, 14, 10, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-4.5f, -1.7f, -3.0f, 5, 3, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 1.5f, -0.7f, 3.0f, 0.5f, -0.8f, 3.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 5.0f, -1.0f, 0.0f, 5.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.5f, -1.7f, -3.0f, 4, 3, 1, 0.0f, 0.5f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -0.8f, 3.0f, 1.5f, -0.7f, 3.0f, 1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 5.0f, 1.0f, 0.5f, 5.0f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f, 0.1f, 3.1f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 2.1f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.7f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 2.1f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY)).addShapeBox(-7.0f, -1.5f, 3.0f, 14, 10, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.skirtRearModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
