// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPhyrgianBeard extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPhyrgianBeard() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[16];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 0.3f, -0.2f, 0.2f, 0.3f, -0.2f, 0.2f, 0.3f, -0.7f, 0.2f, 0.3f, -0.7f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -11.8f, -4.0f, 8, 2, 7, 0.0f, -2.5f, -1.0f, -1.0f, -2.5f, -1.0f, -1.0f, -2.5f, 0.0f, -3.0f, -2.5f, 0.0f, -3.0f, 0.2f, 0.5f, -0.2f, 0.2f, 0.5f, -0.2f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -5.0f, -4.0f, 8, 1, 8, 0.0f, 1.0f, 0.1f, 1.0f, 1.0f, 0.1f, 1.0f, 1.0f, -0.3f, 1.0f, 1.0f, -0.3f, 1.0f, 1.0f, -0.4f, 2.5f, 1.0f, -0.4f, 2.5f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -6.5f, -4.0f, 8, 2, 8, 0.0f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.1f, 0.9f, 0.9f, -0.1f, 0.9f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.85f, -1.0f, -4.0f, 1, 2, 2, 0.0f, -0.8f, -0.5f, 0.8f, 4.0f, -0.5f, 1.5f, 0.7f, -0.5f, 0.8f, -0.2f, -0.5f, 0.8f, -1.5f, -0.3f, 1.5f, 4.0f, 0.3f, 2.0f, 0.7f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.85f, -2.0f, -4.0f, 2, 2, 2, 0.0f, -0.3f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.8f, -0.5f, 0.8f, 1.0f, -0.5f, 0.8f, 1.0f, -0.5f, 0.8f, -0.2f, -0.5f, 0.8f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.85f, -3.5f, -4.0f, 3, 2, 2, 0.0f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, -0.5f, 0.2f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, -0.3f, -0.5f, 0.5f, 0.7f, -0.5f, 0.5f, 0.7f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.85f, -4.5f, -4.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, -0.5f, 0.2f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-1.5f, -13.8f, -3.0f, 3, 2, 3, 0.0f, -0.5f, -2.5f, 0.5f, -0.5f, -2.5f, 0.5f, -0.5f, -0.5f, -3.0f, -0.5f, -0.5f, -3.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-1.0f, -13.3f, -6.0f, 2, 2, 3, 0.0f, 0.0f, -0.5f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -1.5f, 0.0f, 0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(3.85f, -1.0f, -4.0f, 1, 2, 2, 0.0f, 4.0f, -0.5f, 1.5f, -0.8f, -0.5f, 0.8f, -0.2f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 4.0f, 0.3f, 2.0f, -1.5f, -0.3f, 1.5f, -1.0f, -0.3f, 0.0f, 0.7f, -0.3f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(2.85f, -2.0f, -4.0f, 2, 2, 2, 0.0f, 1.0f, 0.0f, 0.5f, -0.3f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, -0.5f, 0.8f, -0.8f, -0.5f, 0.8f, -0.2f, -0.5f, 0.8f, 1.0f, -0.5f, 0.8f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(1.85f, -3.5f, -4.0f, 3, 2, 2, 0.0f, 0.4f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f, 0.7f, -0.5f, 0.5f, -0.3f, -0.5f, 0.5f, 0.0f, -0.5f, 1.0f, 0.7f, -0.5f, 1.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(3.85f, -4.5f, -4.0f, 1, 1, 2, 0.0f, 0.2f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f, 0.4f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-2.0f, -2.0f, -4.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.6f, 0.0f, -0.5f, 0.8f, 0.0f, -0.5f, 0.8f, 0.0f, 0.0f, 0.8f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(0.0f, -2.0f, -4.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.5f, 0.8f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.8f, 0.0f, -0.5f, 0.8f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
