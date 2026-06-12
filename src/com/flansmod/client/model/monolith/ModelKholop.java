// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelKholop extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelKholop() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[7];
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
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, -0.2f, -2.0f, 8, 8, 4, 0.0f, 0.7f, 0.0f, 0.8f, 0.7f, 0.0f, 0.8f, 0.7f, 0.0f, 1.8f, 0.7f, 0.0f, 1.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 8.2f, -2.0f, 8, 1, 4, 0.0f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 7.8f, -2.0f, 8, 1, 4, 0.0f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 8.8f, -2.0f, 8, 1, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.8f, 0.0f, 0.6f, 0.8f, 0.0f, 0.6f, 0.8f, 0.0f, 0.6f, 0.8f, 0.0f, 0.6f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.5f, -5.2f, 3.5f, 9, 6, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(4.0f, -5.2f, -2.5f, 1, 7, 6, 0.0f, 0.0f, -1.5f, -1.5f, 0.5f, -1.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.8f, 0.3f, -0.5f, -1.8f, 0.3f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-5.0f, -5.2f, -2.5f, 1, 7, 6, 0.0f, 0.5f, -1.5f, -1.0f, 0.0f, -1.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.8f, 0.3f, 0.0f, -1.8f, 0.3f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.4f, 0.5f, 0.4f, 0.5f, 0.3f, 0.4f, 0.5f, 0.3f, 0.4f, 0.4f, 0.5f, 0.4f, 0.2f, 1.2f, 1.0f, 1.0f, 0.9f, 0.8f, 1.0f, 0.9f, 0.8f, 0.2f, 1.2f, 1.0f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 2.7f, -2.0f, 4, 5, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.5f, 0.3f, 0.4f, 0.4f, 0.5f, 0.4f, 0.4f, 0.5f, 0.4f, 0.5f, 0.3f, 0.4f, 1.0f, 0.9f, 0.8f, 0.2f, 1.2f, 1.0f, 0.2f, 1.2f, 1.0f, 1.0f, 0.9f, 0.8f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 2.7f, -2.0f, 4, 5, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f, 0.1f, 0.4f, 0.1f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -1.4f, -2.0f, 4, 11, 4, 0.0f, 0.7f, 0.7f, 0.7f, 0.7f, 1.0f, 0.7f, 0.7f, 1.0f, 0.7f, 0.7f, 0.7f, 0.7f, -0.3f, 0.2f, 2.4f, 2.0f, 0.0f, 1.5f, 2.0f, 0.0f, 1.5f, -0.3f, 0.2f, 2.4f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -1.4f, -2.0f, 4, 11, 4, 0.0f, 0.8f, 1.0f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 1.0f, 0.8f, 2.0f, 0.0f, 1.5f, -0.3f, 0.2f, 2.4f, -0.3f, 0.2f, 2.4f, 2.0f, 0.0f, 1.5f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 6.8f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
