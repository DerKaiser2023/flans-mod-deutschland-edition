// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelByrnie extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelByrnie() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[9];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[2];
        this.rightLegModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 8.5f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 1.0f, -2.0f, 8, 7, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 9.9f, -2.0f, 8, 6, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f, 0.6f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 9.4f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f, 0.4f, -0.7f, 0.4f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 8.3f, -2.0f, 8, 1, 4, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, -0.7f, 0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-0.5f, 8.5f, -2.3f, 1, 1, 1, 0.0f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 1.0f, -2.0f, 8, 6, 4, 0.0f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 0.2f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f, 0.1f, 1.1f, 0.1f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 0.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, 0.2f, 0.4f, -2.6f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, -0.1f, 0.4f, -1.6f, -0.1f, 0.4f, 0.4f, -0.1f, 0.4f, 0.4f, -0.1f, 0.4f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, -2.0f, 4, 1, 4, 0.0f, -2.6f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, -1.6f, -0.1f, 0.4f, 0.4f, -0.1f, 0.4f, 0.4f, -0.1f, 0.4f, 0.4f, -0.1f, 0.4f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -0.2f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -0.2f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
