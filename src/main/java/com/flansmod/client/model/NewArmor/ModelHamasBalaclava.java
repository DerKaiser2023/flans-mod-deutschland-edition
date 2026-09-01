// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.NewArmor;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelHamasBalaclava extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelHamasBalaclava() {
        this.textureX = 256;
        this.textureY = 128;
        (this.headModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 169, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 137, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 177, 9, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 169, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 186, 15, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -2.0f, -4.0f, 8, 2, 8, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.1f, 0.01f, 0.01f, 0.1f, 0.01f, 0.01f, 0.1f, 0.01f, 0.01f, 0.1f, 0.01f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -3.0f, -4.0f, 3, 1, 1, 0.0f, -1.0f, -0.2f, 0.01f, 0.1f, 1.9428903E-16f, 0.01f, 0.1f, 1.9428903E-16f, 0.01f, -1.0f, -0.2f, 0.01f, -1.0f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, -1.0f, 0.0f, 0.01f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-2.0f, -3.0f, -4.0f, 3, 1, 1, 0.0f, -1.1f, -2.7755576E-17f, 0.01f, 0.1f, 1.9428903E-16f, 0.01f, 0.1f, 1.9428903E-16f, 0.01f, -1.1f, -2.7755576E-17f, 0.01f, -1.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, -1.1f, 0.0f, 0.01f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -5.0f, -4.0f, 1, 3, 8, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, -8.326673E-17f, 0.01f, 0.01f, 8.326673E-17f, 0.01f, 0.01f, 8.326673E-17f, 0.01f, 0.01f, -8.326673E-17f, 0.01f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -5.0f, -4.0f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, -1.0f, 0.0f, 0.01f, -1.0f, -0.1f, 0.01f, 0.1f, -0.2f, 0.01f, 0.1f, -0.2f, 0.01f, -1.0f, -0.1f, 0.01f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-2.0f, -5.0f, -4.0f, 3, 1, 1, 0.0f, -1.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, 0.1f, 0.0f, 0.01f, -1.1f, 0.0f, 0.01f, -1.1f, -0.2f, 0.01f, 0.1f, -0.2f, 0.01f, 0.1f, -0.2f, 0.01f, -1.1f, -0.2f, 0.01f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(1.0f, -3.0f, -4.0f, 3, 1, 1, 0.0f, -0.1f, 1.9428903E-16f, 0.01f, -1.0f, -0.2f, 0.01f, -1.0f, -0.2f, 0.01f, -0.1f, 1.9428903E-16f, 0.01f, -0.1f, 0.0f, 0.01f, -1.0f, 0.0f, 0.01f, -1.0f, 0.0f, 0.01f, -0.1f, 0.0f, 0.01f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(1.0f, -5.0f, -4.0f, 3, 1, 1, 0.0f, -0.1f, 0.0f, 0.01f, -1.0f, 0.0f, 0.01f, -1.1f, 0.0f, 0.01f, -0.1f, 0.0f, 0.01f, -0.1f, -0.2f, 0.01f, -1.0f, -0.1f, 0.01f, -1.0f, -0.1f, 0.01f, -0.1f, -0.2f, 0.01f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.0f, -5.0f, -4.0f, 1, 3, 8, 0.0f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, -8.326673E-17f, 0.01f, 0.01f, 8.326673E-17f, 0.01f, 0.01f, 8.326673E-17f, 0.01f, 0.01f, -8.326673E-17f, 0.01f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f, 0.01f, 0.0f, 0.01f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-3.0f, -5.0f, 3.0f, 6, 3, 1, 0.0f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.01f, 0.0f, 0.0f, 0.01f, 0.0f, -8.326673E-17f, 0.01f, 0.0f, 8.326673E-17f, 0.01f, 0.0f, 8.326673E-17f, 0.01f, 0.0f, -8.326673E-17f, 0.01f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -7.5f, -4.0f, 8, 2, 8, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -2.0f, 0.1f, 0.1f, -2.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-0.2f, -5.5f, 4.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, -1.5f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, -1.5f, -1.5f, 2.0f, -1.5f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-0.8f, -5.5f, 4.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 2.0f, -1.5f, 1.0f, 2.0f, -1.5f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-17.0f, -15.5f, -4.1f, 34, 18, 1, 0.0f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
