// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Model17cPikeman extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Model17cPikeman() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[12];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.initbodyModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 1.5f, -2.5f, 4, 3, 5, 0.0f, -0.2f, 0.0f, 0.6f, 0.0f, -0.5f, 1.5f, 0.0f, 0.0f, 1.0f, -0.2f, 0.0f, 0.7f, 0.0f, -1.0f, 0.8f, 0.0f, 0.0f, 2.3f, 0.0f, 0.0f, 1.5f, 0.0f, -1.0f, 0.8f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 4.5f, -2.5f, 4, 2, 5, 0.0f, 0.0f, 1.0f, 0.8f, 0.0f, 0.0f, 2.3f, 0.0f, 0.0f, 1.5f, 0.0f, 1.0f, 0.8f, 1.0f, -1.0f, 1.0f, 0.0f, 0.51f, 2.5f, 0.0f, 0.0f, 1.6f, 1.0f, -1.0f, 0.9f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 6.5f, -2.5f, 4, 3, 5, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, -0.5f, 2.5f, 0.0f, 0.0f, 1.6f, 1.0f, 1.0f, 0.9f, 0.4f, -1.0f, 0.8f, 0.0f, 0.2f, 2.2f, 0.0f, 0.0f, 1.7f, 0.4f, -1.0f, 0.7f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 10.0f, -2.5f, 4, 1, 5, 0.0f, 0.2f, 1.5f, 0.8f, 0.0f, 0.3f, 2.2f, 0.0f, 0.5f, 1.7f, 0.2f, 1.5f, 0.4f, 0.5f, -1.6f, 0.5f, 0.0f, -0.5f, 2.0f, 0.0f, -0.8f, 2.3f, 0.9f, -1.6f, 0.6f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-3.5f, -1.0f, -2.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.6f, -0.2f, 0.0f, 0.8f, -0.2f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, -0.5f, 1.1f, 1.3f, 0.3f, 1.0f, 1.5f, 0.3f, 1.0f, 1.3f, -0.5f, 1.2f, 1.3f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 0.5f, -2.5f, 4, 1, 5, 0.0f, -0.4f, 0.3f, 0.4f, 0.0f, -0.2f, 1.0f, 0.0f, 0.0f, 0.4f, -0.4f, 0.3f, 0.3f, -0.2f, 0.0f, 0.6f, 0.0f, 0.5f, 1.5f, 0.0f, 0.0f, 0.85f, -0.2f, 0.0f, 0.7f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.5f, -2.5f, 4, 1, 5, 0.0f, 0.0f, -0.2f, 1.0f, -0.4f, 0.3f, 0.4f, -0.4f, 0.3f, 0.3f, 0.0f, 0.0f, 0.4f, 0.0f, 0.5f, 1.5f, -0.2f, 0.0f, 0.6f, -0.2f, 0.0f, 0.7f, 0.0f, 0.0f, 0.85f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 1.5f, -2.5f, 4, 3, 5, 0.0f, 0.0f, -0.5f, 1.5f, -0.2f, 0.0f, 0.6f, -0.2f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.3f, 0.0f, -1.0f, 0.8f, 0.0f, -1.0f, 0.8f, 0.0f, 0.0f, 1.5f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 4.5f, -2.5f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 2.3f, 0.0f, 1.0f, 0.8f, 0.0f, 1.0f, 0.8f, 0.0f, 0.0f, 1.5f, 0.0f, 0.51f, 2.5f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 0.9f, 0.0f, 0.0f, 1.6f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 6.5f, -2.5f, 4, 3, 5, 0.0f, 0.0f, -0.5f, 2.5f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.9f, 0.0f, 0.0f, 1.6f, 0.0f, 0.2f, 2.2f, 0.4f, -1.0f, 0.8f, 0.4f, -1.0f, 0.7f, 0.0f, 0.0f, 1.7f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 10.0f, -2.5f, 4, 1, 5, 0.0f, 0.0f, 0.3f, 2.2f, 0.2f, 1.5f, 0.8f, 0.2f, 1.5f, 0.4f, 0.0f, 0.5f, 1.7f, 0.0f, -0.5f, 2.0f, 0.5f, -1.6f, 0.5f, 0.9f, -1.6f, 0.6f, 0.0f, -0.8f, 2.3f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(2.5f, -1.0f, -2.0f, 1, 1, 4, 0.0f, -0.2f, 0.0f, 0.8f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, -0.2f, 0.0f, 0.6f, 0.3f, 1.0f, 1.5f, -0.5f, 1.1f, 1.3f, -0.5f, 1.2f, 1.3f, 0.3f, 1.0f, 1.3f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -2.5f, -3.8f, 4, 1, 1, 0.0f, 0.3f, -0.7f, 1.0f, 0.2f, 0.0f, -0.4f, 0.8f, 0.0f, 3.1f, 0.3f, -0.7f, 0.6f, 0.2f, 0.4f, 1.2f, 0.8f, 0.0f, -0.2f, 1.5f, 0.0f, 3.3f, 0.2f, 0.4f, 0.6f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -1.0f, -3.8f, 4, 1, 1, 0.0f, 0.3f, 0.0f, 1.4f, 0.6f, 0.5f, 0.0f, 1.4f, 0.5f, 2.9f, 0.3f, 0.0f, -0.6f, 0.1f, 0.4f, 1.2f, 1.5f, 0.0f, -0.2f, 2.1f, 0.0f, 2.3f, 0.1f, 0.4f, -0.8f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-1.5f, 0.0f, -3.8f, 4, 3, 1, 0.0f, 0.5f, 0.0f, 1.4f, 0.8f, 0.5f, 0.0f, 1.7f, 0.5f, 2.4f, 0.5f, 0.0f, -0.6f, 0.2f, 0.4f, 0.9f, 1.3f, 0.0f, -0.5f, 2.0f, 0.0f, 2.6f, 0.2f, 0.4f, -0.5f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-1.5f, 0.7f, -3.8f, 4, 3, 1, 0.0f, 0.4f, 0.0f, 1.4f, 1.2f, 0.5f, 0.0f, 2.0f, 0.5f, 2.2f, 0.4f, 0.0f, -0.6f, 0.0f, 0.4f, 0.9f, 1.6f, 0.0f, -0.5f, 2.4f, 0.0f, 2.3f, 0.0f, 0.4f, -0.5f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-1.5f, 1.5f, -3.8f, 4, 3, 1, 0.0f, 0.3f, 0.0f, 1.4f, 1.4f, 0.5f, 0.0f, 2.3f, 0.5f, 1.9f, 0.2f, 0.0f, -0.6f, 0.0f, -0.1f, 0.9f, 1.8f, -0.8f, -0.5f, 2.7f, -0.8f, 2.1f, 0.0f, -0.1f, -0.5f);
        this.leftLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -2.5f, -4.1f, 4, 1, 1, 0.0f, 0.2f, 0.0f, -0.4f, 0.3f, -0.7f, 1.0f, 0.3f, -0.7f, 0.6f, 0.8f, 0.0f, 3.1f, 0.8f, 0.0f, -0.2f, 0.2f, 0.4f, 1.2f, 0.2f, 0.4f, 0.6f, 1.5f, 0.0f, 3.3f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -1.0f, -4.1f, 4, 1, 1, 0.0f, 0.6f, 0.5f, 0.0f, 0.3f, 0.0f, 1.4f, 0.3f, 0.0f, -0.6f, 1.4f, 0.5f, 2.9f, 1.5f, 0.0f, -0.2f, 0.1f, 0.4f, 1.2f, 0.1f, 0.4f, -0.8f, 2.1f, 0.0f, 2.3f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.5f, 0.0f, -4.1f, 4, 3, 1, 0.0f, 0.8f, 0.5f, 0.0f, 0.5f, 0.0f, 1.4f, 0.5f, 0.0f, -0.6f, 1.7f, 0.5f, 2.4f, 1.3f, 0.0f, -0.5f, 0.2f, 0.4f, 0.9f, 0.2f, 0.4f, -0.5f, 2.0f, 0.0f, 2.6f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.5f, 0.7f, -4.1f, 4, 3, 1, 0.0f, 1.2f, 0.5f, 0.0f, 0.4f, 0.0f, 1.4f, 0.4f, 0.0f, -0.6f, 2.0f, 0.5f, 2.2f, 1.6f, 0.0f, -0.5f, 0.0f, 0.4f, 0.9f, 0.0f, 0.4f, -0.5f, 2.4f, 0.0f, 2.3f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.5f, 1.5f, -4.1f, 4, 3, 1, 0.0f, 1.4f, 0.5f, 0.0f, 0.3f, 0.0f, 1.4f, 0.2f, 0.0f, -0.6f, 2.3f, 0.5f, 1.9f, 1.8f, -0.8f, -0.5f, 0.0f, -0.1f, 0.9f, 0.0f, -0.1f, -0.5f, 2.7f, -0.8f, 2.1f);
        this.rightLegModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
