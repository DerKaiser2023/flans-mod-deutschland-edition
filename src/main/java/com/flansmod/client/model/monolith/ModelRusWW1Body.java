// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelRusWW1Body extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelRusWW1Body() {
        this.textureX = 512;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[12];
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
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 8.0f, 1.0f, 8, 1, 1, 0.0f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 8.0f, -2.0f, 3, 1, 1, 0.0f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(1.0f, 8.0f, -2.0f, 3, 1, 1, 0.0f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-0.4f, 8.0f, -2.0f, 1, 1, 1, 0.0f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f, 0.325f, 0.0f, 0.4f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 8, 4, 0.0f, -7.3f, 0.7f, 0.65f, 2.2f, 0.25f, 0.65f, 2.2f, 0.25f, 0.65f, -7.3f, 0.7f, 0.65f, 0.7f, -3.2f, 0.65f, -8.45f, 0.5f, 0.65f, -8.8f, 0.5f, 0.65f, 0.7f, -3.2f, 0.65f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(3.0f, 9.0f, -2.0f, 3, 3, 4, 0.0f, -0.05f, 0.0f, 0.45f, -1.15f, 0.0f, 0.45f, -1.15f, 0.0f, 0.45f, -0.35f, 0.0f, 0.45f, -1.0f, 1.0f, 0.45f, 0.0f, 0.0f, 0.45f, 0.0f, 0.0f, 0.45f, -1.0f, 1.0f, 0.45f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.5f, 8.0f, -3.0f, 2, 2, 1, 0.0f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f, 0.325f, 0.0f, 0.325f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.5f, 8.0f, 2.0f, 2, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.0f, 7.2f, 2.3f, 1, 1, 1, 0.0f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-0.5f, 0.0f, -2.0f, 1, 5, 1, 0.0f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f, 0.2f, 0.0f, 0.325f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 4, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-0.8f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-0.8f, -2.1f, -0.5f, 4, 1, 1, 0.0f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 185, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 201, 1, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.1f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.1f, -0.5f, 4, 1, 1, 0.0f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f, 0.125f, -0.8f, 0.125f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 257, 1, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 281, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 305, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 0.0f, -2.0f, 4, 6, 4, 0.0f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
