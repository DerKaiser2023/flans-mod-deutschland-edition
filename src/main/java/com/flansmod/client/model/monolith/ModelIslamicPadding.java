// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelIslamicPadding extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelIslamicPadding() {
        this.textureX = 64;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[5];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[4];
        this.rightLegModel = new ModelRendererTurbo[4];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 97, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 7.7f, -2.0f, 8, 1, 4, 0.0f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.5f, -0.6f, 0.5f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f, 0.3f, 1.0f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, -0.2f, -2.0f, 7, 8, 4, 0.0f, 0.7f, 0.1f, 0.5f, -3.5f, 0.1f, 0.5f, -3.0f, 0.1f, 0.5f, 0.7f, 0.1f, 0.5f, 0.5f, 0.5f, 0.5f, -1.5f, 0.5f, 0.5f, -3.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 10.0f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 8.8f, -2.0f, 8, 1, 4, 0.0f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f, 0.55f, -0.1f, 0.55f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(0.0f, -0.2f, -2.0f, 7, 8, 4, 0.0f, -1.5f, 0.1f, 0.4f, -2.3f, 0.1f, 0.5f, -2.3f, 0.1f, 0.5f, 0.0f, 0.1f, 0.5f, 0.5f, 0.5f, 0.4f, -2.5f, 0.5f, 0.5f, -2.5f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 89, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -1.5f, -2.0f, 4, 9, 4, 0.0f, 1.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 0.7f, 0.0f, 1.2f, 1.5f, -0.5f, 0.7f, 1.5f, -0.5f, 0.7f, 0.7f, 0.0f, 1.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 7.8f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 81, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -1.5f, -2.0f, 4, 9, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.5f, 1.6f, -0.5f, 0.7f, -0.3f, 0.0f, 0.8f, -0.3f, 0.0f, 0.8f, 1.6f, -0.5f, 0.7f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 10.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 7.8f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
