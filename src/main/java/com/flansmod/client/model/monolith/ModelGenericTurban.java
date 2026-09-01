// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelGenericTurban extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGenericTurban() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[10];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -10.3f, -4.0f, 8, 2, 8, 0.0f, -2.0f, -0.5f, -2.0f, -2.0f, -0.5f, -2.0f, -2.0f, -0.5f, -2.0f, -2.0f, -0.5f, -2.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.0f, -4.0f, 8, 2, 8, 0.0f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.5f, -6.0f, -4.5f, 9, 2, 9, 0.0f, 0.9f, 0.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.9f, -0.2f, 0.9f, 0.9f, -0.2f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, 0.3f, 0.9f, 0.9f, 0.3f, 0.9f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.5f, -8.0f, -4.5f, 9, 1, 9, 0.0f, 0.6f, -0.9f, 0.6f, 0.6f, -0.9f, 0.6f, 0.6f, -1.7f, 0.6f, 0.6f, -1.7f, 0.6f, 0.9f, 0.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.9f, 1.2f, 0.9f, 0.9f, 1.2f, 0.9f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -3.2f, -4.5f, 9, 1, 9, 0.0f, 0.9f, 1.5f, 0.9f, 0.9f, 1.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.6f, -2.0f, 0.6f, 0.6f, -2.0f, 0.6f, 0.6f, -0.9f, 0.6f, 0.6f, -0.9f, 0.6f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.0f, -2.5f, -4.0f, 8, 2, 8, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -3.2f, -4.0f, 8, 1, 8, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.5f, -0.3f, 0.5f, 0.5f, -0.3f, 0.5f, 0.5f, -1.3f, 0.5f, 0.5f, -1.3f, 0.5f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, 0.0f, -4.0f, 4, 1, 8, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, -1.5f, -0.3f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -1.5f, -0.3f, 0.25f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(0.0f, 0.0f, -4.0f, 4, 1, 8, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, -1.5f, -0.3f, 0.0f, -1.5f, -0.3f, 0.25f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
