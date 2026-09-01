// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Modelkoreanpeasantarmorhat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Modelkoreanpeasantarmorhat() {
        this.textureX = 512;
        this.textureY = 512;
        (this.headModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 401, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 425, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 465, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -11.0f, -4.0f, 8, 3, 8, 0.0f, -0.9f, -0.6f, -1.5f, -0.9f, -0.6f, -1.5f, -0.9f, -0.7f, -1.25f, -0.9f, -0.7f, -1.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-6.0f, -8.0f, -6.0f, 12, 2, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-0.5f, -12.1f, 0.5f, 1, 1, 3, 0.0f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-0.5f, -11.4f, -0.5f, 1, 1, 1, 0.0f, 0.3f, 0.5f, -0.7f, 0.3f, 0.5f, -0.7f, 0.3f, -0.3f, 1.3f, 0.3f, -0.3f, 1.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-7.0f, -8.0f, -6.0f, 1, 2, 12, 0.0f, -0.4f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, -1.5f, 0.0f, -0.6f, -1.5f, 0.0f, -0.6f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, -1.5f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(6.0f, -8.0f, -6.0f, 1, 2, 12, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, -1.5f, -0.4f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, -1.5f, 0.0f, -0.7f, -1.5f, 0.0f, -0.7f, 0.0f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-6.0f, -8.0f, -7.0f, 12, 2, 1, 0.0f, -1.5f, 0.0f, -0.4f, -1.5f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.6f, 0.0f, -1.5f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.6f, 0.0f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-6.0f, -8.0f, 6.0f, 12, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -0.4f, -1.5f, 0.0f, -0.4f, 0.0f, -0.6f, 0.0f, 0.0f, -0.7f, 0.0f, -1.5f, -0.7f, 0.0f, -1.5f, -0.6f, 0.0f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-0.5f, -11.4f, 3.5f, 1, 1, 1, 0.0f, 0.3f, -0.3f, 1.3f, 0.3f, -0.3f, 1.3f, 0.3f, 0.7f, -1.0f, 0.3f, 0.7f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 369, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 385, 1, this.textureX, this.textureY);
        this.headModel[9].addShapeBox(-4.0f, -7.5f, -4.0f, 8, 2, 8, 0.0f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-1.5f, -5.5f, 0.0f, 2, 5, 5, 0.0f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 1.0f, -0.6f, -0.55f, -1.0f, -0.2f, -0.55f, -1.0f, -0.2f, 0.25f, 1.0f, -0.6f, 0.25f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-0.5f, -5.5f, 0.0f, 2, 5, 5, 0.0f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.55f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, -1.0f, -0.2f, -0.55f, 1.0f, -0.6f, -0.55f, 1.0f, -0.6f, 0.25f, -1.0f, -0.2f, 0.25f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
