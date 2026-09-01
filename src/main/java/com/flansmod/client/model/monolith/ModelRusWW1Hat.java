// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelRusWW1Hat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelRusWW1Hat() {
        this.textureX = 128;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[10];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-3.5f, -7.5f, -4.5f, 7, 2, 9, 0.0f, 0.0f, 1.0f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 2.7f, 0.0f, 0.0f, 2.7f, 0.0f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-2.0f, -5.5f, -6.5f, 4, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(2.0f, -5.5f, -6.5f, 2, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -1.5f, 0.3f, 0.25f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.3f, -1.5f, 0.3f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-2.5f, -9.5f, -4.5f, 5, 4, 9, 0.0f, 0.0f, 1.3f, 2.5f, 0.0f, 1.3f, 2.5f, 0.0f, -1.2f, 2.5f, 0.0f, -1.2f, 2.5f, 0.8f, -2.0f, 1.0f, 0.8f, -2.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(3.5f, -7.5f, -4.5f, 1, 2, 9, 0.0f, 0.0f, 1.0f, 0.2f, 0.2f, -0.3f, -1.2f, 0.2f, -1.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.1f, 0.2f, -1.0f, -0.1f, 2.0f, -1.0f, 0.0f, 2.7f, 0.0f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(2.5f, -9.5f, -4.5f, 3, 4, 9, 0.0f, 0.0f, 1.3f, 2.5f, 1.0f, -1.2f, -0.5f, 1.0f, -2.2f, 0.2f, 0.0f, -1.2f, 2.5f, -0.8f, -2.0f, 1.0f, -0.4f, -1.5f, -0.8f, -0.7f, 0.0f, -0.3f, 0.0f, 1.0f, 1.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-0.5f, -7.1f, -5.2f, 1, 1, 1, 0.0f, 0.1f, 0.2f, -0.1f, 0.1f, 0.2f, -0.1f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-5.5f, -9.5f, -4.5f, 3, 4, 9, 0.0f, 1.0f, -1.2f, -0.5f, 0.0f, 1.3f, 2.5f, 0.0f, -1.2f, 2.5f, 1.0f, -2.7f, 0.2f, -0.4f, -1.5f, -0.8f, -0.8f, -2.0f, 1.0f, 0.0f, 1.0f, 1.0f, -0.7f, 0.0f, -0.3f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.5f, -7.5f, -4.5f, 1, 2, 9, 0.0f, 0.2f, -0.3f, -1.2f, 0.0f, 1.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.2f, -1.0f, -0.5f, -0.1f, 0.2f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 2.7f, 0.0f, -0.1f, 2.0f, -1.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -5.5f, -6.5f, 2, 1, 6, 0.0f, 0.0f, -0.4f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.3f, 0.25f, 0.0f, 0.0f, -0.3f, -1.5f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
