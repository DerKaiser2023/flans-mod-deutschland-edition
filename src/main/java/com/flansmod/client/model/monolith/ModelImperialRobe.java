// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelImperialRobe extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelImperialRobe() {
        this.textureX = 64;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[9];
        this.leftArmModel = new ModelRendererTurbo[2];
        this.rightArmModel = new ModelRendererTurbo[2];
        this.leftLegModel = new ModelRendererTurbo[1];
        this.rightLegModel = new ModelRendererTurbo[1];
        this.skirtFrontModel = new ModelRendererTurbo[1];
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
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 73, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 8.5f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 10.3f, -2.0f, 8, 3, 4, 0.0f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.4f, 0.1f, 0.5f, 0.4f, 0.1f, 0.5f, 0.4f, 0.1f, 0.5f, 0.4f, 0.1f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-6.5f, 2.0f, -2.0f, 13, 6, 4, 0.0f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f, -2.15f, 0.0f, 0.35f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 8.0f, -2.0f, 8, 1, 4, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 9.3f, -2.0f, 8, 1, 4, 0.0f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 0.0f, -2.0f, 2, 2, 4, 0.0f, 0.35f, 0.2f, 0.35f, -0.1f, 0.2f, 0.35f, 2.0f, 0.2f, 0.35f, 0.35f, 0.2f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 2.0f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(2.0f, 0.0f, -2.0f, 2, 2, 4, 0.0f, -0.1f, 0.2f, 0.35f, 0.35f, 0.2f, 0.35f, 0.35f, 0.2f, 0.35f, 2.0f, 0.2f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 2.0f, 0.0f, 0.35f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 7.3f, -2.2f, 8, 4, 4, 0.0f, -3.6f, 0.1f, 0.7f, 0.6f, 0.1f, 0.7f, 0.6f, 0.1f, 0.7f, -3.6f, 0.1f, 0.7f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.7f, 0.4f, 0.1f, 0.7f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-1.0f, 0.2f, -2.2f, 5, 7, 4, 0.0f, -3.0f, 0.8f, 0.4f, 1.6f, 0.4f, 0.4f, 1.6f, 0.4f, 0.7f, -3.0f, 0.8f, 0.7f, -0.6f, 0.1f, 0.7f, 0.6f, 0.1f, 0.7f, 0.6f, 0.1f, 0.7f, -0.6f, 0.1f, 0.7f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, 7.0f, -2.0f, 4, 2, 4, 0.0f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY)).addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY)).addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY)).addShapeBox(-4.0f, -0.7f, -2.2f, 8, 10, 3, 0.0f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY)).addShapeBox(-4.0f, -0.7f, -0.8f, 8, 10, 3, 0.0f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f, 0.7f, 0.1f, 0.7f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
