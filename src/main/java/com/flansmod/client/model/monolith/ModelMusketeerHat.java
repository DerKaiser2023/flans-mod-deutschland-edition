// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelMusketeerHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelMusketeerHat() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[11];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(2.0f, -10.0f, 1.5f, 7, 3, 1, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(9.0f, -10.0f, 1.5f, 6, 3, 1, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(2.0f, -10.0f, 1.5f, 7, 3, 1, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.5f, -2.0f, 0.0f, 2.5f, 2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(9.0f, -10.0f, 1.5f, 4, 3, 1, 0.0f, 0.0f, 2.5f, -2.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, 3.0f, 0.0f, 2.5f, 2.0f, 0.0f, 0.0f, -2.0f, -3.0f, 2.0f, -3.0f, -3.0f, 2.0f, 3.0f, 0.0f, 0.0f, 2.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(2.0f, -9.0f, 1.5f, 7, 1, 1, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f, 2.0f, -2.0f, 0.0f, -1.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(9.0f, -9.0f, 1.5f, 4, 1, 1, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f, -1.0f, 3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 2.0f, -2.0f, 0.0f, 0.0f, 2.0f, -3.0f, 2.0f, 3.0f, -3.0f, 2.0f, -3.0f, 0.0f, 0.0f, -2.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-11.0f, -6.0f, -3.0f, 22, 1, 6, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-11.0f, -6.0f, -10.0f, 22, 1, 7, 0.0f, -7.0f, -0.8f, 0.0f, -7.0f, -0.8f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-11.0f, -6.0f, 3.0f, 22, 1, 7, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, -1.8f, 0.0f, -7.0f, -1.8f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -7.0f, 1.0f, 0.0f, -7.0f, 1.0f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 2, 9, 0.0f, 0.0f, 0.5f, -0.1f, 0.0f, 0.5f, -0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -12.0f, -4.0f, 8, 4, 9, 0.0f, -1.0f, -0.5f, -2.0f, -1.0f, -0.5f, -2.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
