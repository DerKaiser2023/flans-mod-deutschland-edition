// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelDendra extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelDendra() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[2];
        this.bodyModel = new ModelRendererTurbo[4];
        this.leftArmModel = new ModelRendererTurbo[4];
        this.rightArmModel = new ModelRendererTurbo[4];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[3];
        this.skirtFrontModel = new ModelRendererTurbo[1];
        this.skirtRearModel = new ModelRendererTurbo[1];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -2.0f, -4.0f, 8, 2, 8, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, 0.0f, -4.0f, 8, 2, 8, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -1.8f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 6, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 5.0f, -2.0f, 8, 5, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 8.0f, -2.0f, 8, 5, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 11.0f, -2.0f, 8, 5, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 5.0f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-2.5f, -2.0f, -2.0f, 4, 5, 4, 0.0f, -2.0f, 1.5f, 0.8f, 2.0f, 0.0f, 0.8f, 2.0f, 0.0f, 0.8f, -2.0f, 1.5f, 0.8f, 1.0f, -1.5f, 1.2f, -1.7f, 0.5f, 0.8f, -0.7f, 0.5f, 0.8f, 1.0f, -1.5f, 1.2f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, -0.5f, -2.0f, 4, 3, 4, 0.0f, -0.7f, 0.2f, 0.2f, 0.3f, 1.5f, 0.2f, 0.3f, 1.5f, 0.2f, -0.7f, 0.2f, 0.2f, -1.0f, 0.8f, 0.4f, 1.0f, 0.0f, 0.4f, 1.0f, 0.0f, 0.4f, -1.0f, 0.8f, 0.4f);
        this.leftArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 6, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-1.5f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 2.0f, 0.0f, 0.8f, -2.0f, 1.5f, 0.8f, -2.0f, 1.5f, 0.8f, 2.0f, 0.0f, 0.8f, -1.7f, 0.5f, 0.8f, 1.0f, -1.5f, 1.2f, 1.0f, -1.5f, 1.2f, -0.7f, 0.5f, 0.8f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, -0.5f, -2.0f, 4, 3, 4, 0.0f, 0.3f, 1.5f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, 0.3f, 1.5f, 0.2f, 1.0f, 0.0f, 0.4f, -1.0f, 0.8f, 0.4f, -1.0f, 0.8f, 0.4f, 1.0f, 0.0f, 0.4f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 5.0f, -2.0f, 4, 4, 4, 0.0f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f);
        this.rightArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.8f, 0.1f, -0.5f, 0.8f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.8f, 0.1f, 0.0f, 0.8f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 2, 2, 5, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 7.0f, -2.0f, 2, 4, 5, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.9f, 0.1f, 0.0f, -0.9f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.8f, 0.1f, -0.5f, 0.8f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.8f, 0.1f, 0.0f, 0.8f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 2, 2, 5, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 7.0f, -2.0f, 2, 4, 5, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.6f, 0.1f, 0.0f, -0.6f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.9f, 0.1f, 0.0f, -0.9f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.0f, -2.2f, 8, 5, 2, 0.0f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f);
        this.skirtFrontModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.0f, 0.2f, 8, 5, 2, 0.0f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.6f, -0.5f, 0.5f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f, 0.7f, 0.0f, 0.6f);
        this.skirtRearModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
