// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelGermArmor extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermArmor() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[5];
        this.leftLegModel = new ModelRendererTurbo[4];
        this.rightLegModel = new ModelRendererTurbo[4];
        this.initbodyModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 10.0f, -2.0f, 8, 5, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 12, 5, 0.0f, 1.0f, 0.1f, -0.2f, 1.0f, 0.1f, -0.2f, 1.0f, 0.1f, -0.2f, 1.0f, 0.1f, -0.2f, 0.3f, 0.2f, -0.2f, 0.3f, 0.2f, -0.2f, 0.3f, 0.2f, -0.2f, 0.3f, 0.2f, -0.2f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 12, 5, 0.0f, 1.3f, 0.4f, 0.1f, 1.3f, 0.4f, 0.1f, 1.3f, 0.4f, 0.1f, 1.3f, 0.4f, 0.1f, 0.6f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f, 0.6f, 0.5f, 0.1f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 12, 5, 0.0f, 1.6f, 0.7f, 0.4f, 1.6f, 0.7f, 0.4f, 1.6f, 0.7f, 0.4f, 1.6f, 0.7f, 0.4f, 0.9f, 0.8f, 0.4f, 0.9f, 0.8f, 0.4f, 0.9f, 0.8f, 0.4f, 0.9f, 0.8f, 0.4f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 12, 5, 0.0f, 2.2f, 1.2f, 0.8f, 2.2f, 1.2f, 0.8f, 2.2f, 1.2f, 0.8f, 2.2f, 1.2f, 0.8f, 1.5f, 1.2f, 0.8f, 1.5f, 1.2f, 0.8f, 1.5f, 1.2f, 0.8f, 1.5f, 1.2f, 0.8f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 8, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 9.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 9.4f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 9.4f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 8, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 9.0f, -2.0f, 4, 1, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
