// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEgyptBody extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEgyptBody() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 329, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-3.0f, 0.0f, -2.0f, 1, 4, 4, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 10.0f, -2.0f, 8, 2, 4, 0.0f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addBox(2.0f, 0.0f, -2.0f, 1, 4, 4, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 8.0f, -2.0f, 8, 2, 4, 0.0f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 6.0f, -2.0f, 8, 2, 4, 0.0f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f, 0.075f, 0.0f, 0.075f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 4.0f, -2.0f, 8, 2, 4, 0.0f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel = new ModelRendererTurbo[1];
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY)).addShapeBox(-1.8f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel = new ModelRendererTurbo[1];
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY)).addShapeBox(-2.2f, 0.0f, -2.0f, 4, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.skirtFrontModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.skirtFrontModel[1] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.skirtFrontModel[2] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.skirtFrontModel[0].addShapeBox(-4.0f, 0.0f, -2.0f, 4, 5, 1, 0.0f, 0.125f, 0.0f, 0.125f, 0.0f, 0.0f, 0.125f, 0.0f, 0.0f, 0.0f, 0.125f, 0.0f, 0.0f, 0.125f, 0.0f, 0.125f, 0.0f, -1.0f, 0.125f, 0.0f, -1.0f, 0.0f, 0.125f, 0.0f, 0.0f);
        this.skirtFrontModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[1].addShapeBox(0.0f, 0.0f, -2.0f, 4, 5, 1, 0.0f, 0.0f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.skirtFrontModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtFrontModel[2].addShapeBox(-2.0f, 0.0f, -2.5f, 4, 5, 1, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f);
        this.skirtFrontModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.skirtRearModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.skirtRearModel[1] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.skirtRearModel[0].addShapeBox(0.0f, 0.0f, 1.0f, 4, 5, 1, 0.0f, 0.0f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.skirtRearModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.skirtRearModel[1].addShapeBox(-4.0f, 0.0f, 1.0f, 4, 5, 1, 0.0f, 0.125f, 0.0f, 0.125f, 0.0f, 0.0f, 0.125f, 0.0f, 0.0f, 0.0f, 0.125f, 0.0f, 0.0f, 0.125f, 0.0f, 0.125f, 0.0f, -1.0f, 0.125f, 0.0f, -1.0f, 0.0f, 0.125f, 0.0f, 0.0f);
        this.skirtRearModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
