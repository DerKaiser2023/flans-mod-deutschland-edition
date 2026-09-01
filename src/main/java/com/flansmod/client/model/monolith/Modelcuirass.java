// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Modelcuirass extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Modelcuirass() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[14];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.6f, 0.0f, 0.4f, 0.0f, -0.5f, 1.5f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.5f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -2.0f, -0.3f, 1.0f, 0.0f, 0.2f, 1.5f, 0.0f, -0.7f, 0.5f, -2.0f, -1.0f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.2f, 1.5f, -2.0f, -0.3f, 1.0f, -2.0f, -1.0f, 0.5f, 0.0f, -0.7f, 0.5f);
        this.bodyModel[2].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.0f, 0.4f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.5f, 0.6f, 0.0f, 0.4f, 0.0f, 0.49f, 1.49f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.4f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.5f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 1, 4, 0.0f, -1.0f, -0.3f, 0.3f, -1.5f, -0.3f, 0.2f, 0.0f, -0.3f, 0.8f, -1.0f, -0.3f, 0.5f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, -0.5f, -2.0f, 4, 1, 4, 0.0f, -1.5f, -0.3f, 0.2f, -1.0f, -0.3f, 0.3f, -1.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.8f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 1.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 1.2f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 1.2f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.51f, 1.51f, 0.6f, 0.0f, 0.4f, 0.6f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, -0.5f, 1.5f, 0.6f, 0.0f, 0.4f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 9.3f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
