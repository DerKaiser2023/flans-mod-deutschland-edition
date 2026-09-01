// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelCzapkaGeneric extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelCzapkaGeneric() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[15];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-5.0f, -8.5f, -6.0f, 10, 4, 10, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -0.5f, 0.25f, 0.0f, -0.5f, 0.25f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 0.25f, 0.0f, 0.5f, 0.25f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(0.0f, -10.5f, -4.0f, 5, 4, 8, 0.0f, 0.0f, 2.25f, 2.5f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.5f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.25f, 0.0f, 0.7f, 0.25f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-5.0f, -5.5f, -6.0f, 5, 1, 1, 0.0f, 0.0f, -0.75f, -0.75f, 0.0f, -0.75f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -5.5f, -3.0f, 8, 6, 1, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, -0.125f, 0.0f, 0.25f, -0.125f, 0.0f, 0.25f, -0.125f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].rotateAngleX = -0.12217305f;
        this.headModel[4].addShapeBox(-6.0f, -11.5f, -5.2f, 1, 10, 1, 0.0f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f, -0.25f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addBox(-6.0f, -11.5f, -5.3f, 1, 1, 1, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-6.0f, -6.5f, -5.2f, 1, 2, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(3.0f, -8.5f, -5.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.075f, -2.475f, 0.0f, -4.05f, -1.45f, 0.0f, -4.05f, -1.45f, 0.0f, 3.075f, -2.475f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(5.0f, -11.5f, -5.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, -0.125f, -0.25f, 0.0f, 0.0f, -0.125f, 0.0f, 2.0f, -1.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addBox(5.0f, -11.5f, -5.3f, 1, 1, 1, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-6.0f, -3.5f, -5.2f, 1, 2, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-5.0f, -10.5f, -4.0f, 5, 4, 8, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 2.25f, 2.5f, 0.0f, 1.0f, 1.0f, 1.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.25f, 0.0f, 0.5f, 0.25f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(0.0f, -5.5f, -6.0f, 5, 1, 1, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, -0.75f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-4.0f, -8.5f, -5.0f, 1, 4, 1, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -3.925f, -1.45f, 0.0f, 2.95f, -2.475f, 0.0f, 2.95f, -2.475f, 0.0f, -3.925f, -1.45f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-6.0f, -11.5f, -5.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, -0.125f, -0.25f, 0.0f, -2.5f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, -2.5f, 0.0f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
