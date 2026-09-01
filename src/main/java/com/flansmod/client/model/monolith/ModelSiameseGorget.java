// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSiameseGorget extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSiameseGorget() {
        this.textureX = 64;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[10];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-2.0f, 6.0f, -3.5f, 4, 2, 1, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.8f, 0.0f, -0.5f, -1.8f, 0.0f, -0.5f, -1.8f, 0.0f, 0.5f, -1.8f, 0.0f, 0.5f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-3.5f, 3.5f, -3.5f, 7, 2, 1, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-6.0f, 1.0f, -3.5f, 12, 2, 1, 0.0f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-6.0f, -1.0f, -3.3f, 3, 2, 3, 0.0f, 1.5f, -0.5f, -0.5f, 0.0f, -0.8f, -0.5f, -0.5f, 0.0f, 0.3f, 2.0f, 0.5f, 0.3f, 0.5f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.3f, 0.5f, 0.5f, 0.3f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(3.0f, -1.0f, -3.3f, 3, 2, 3, 0.0f, 0.0f, -0.8f, -0.5f, 1.5f, -0.5f, -0.5f, 2.0f, 0.5f, 0.3f, -0.5f, 0.0f, 0.3f, 2.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.3f, 1.0f, 0.5f, 0.3f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-6.0f, 1.0f, 2.5f, 12, 2, 1, 0.0f, 0.5f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f, 0.5f, -0.5f, -0.2f, 0.5f, -0.5f, -0.2f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-6.0f, -1.0f, 0.3f, 3, 2, 3, 0.0f, 2.0f, 0.5f, 0.3f, -0.5f, 0.0f, 0.3f, 0.0f, -0.8f, -0.5f, 1.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.3f, 1.0f, 0.5f, 0.3f, 2.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(3.0f, -1.0f, 0.3f, 3, 2, 3, 0.0f, -0.5f, 0.0f, 0.3f, 2.0f, 0.5f, 0.3f, 1.5f, -0.5f, -0.5f, 0.0f, -0.8f, -0.5f, 1.0f, 0.5f, 0.3f, 0.5f, 0.5f, 0.3f, 0.5f, 0.5f, 0.0f, 2.0f, 0.5f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.5f, 3.5f, 2.5f, 7, 2, 1, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-2.0f, 6.0f, 2.5f, 4, 2, 1, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.8f, 0.0f, 0.5f, -1.8f, 0.0f, 0.5f, -1.8f, 0.0f, -0.5f, -1.8f, 0.0f, -0.5f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY)).addShapeBox(-1.0f, 3.5f, -2.0f, 4, 5, 4, 0.0f, 0.8f, 0.0f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.5f, 0.8f, 0.8f, 0.0f, 0.8f, 0.3f, -0.2f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, -0.2f, 0.3f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY)).addShapeBox(-3.0f, 3.5f, -2.0f, 4, 5, 4, 0.0f, 0.8f, 0.5f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.5f, 0.8f, 0.3f, 0.0f, 0.3f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
