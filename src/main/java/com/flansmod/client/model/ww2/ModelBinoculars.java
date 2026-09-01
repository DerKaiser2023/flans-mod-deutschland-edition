// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelBinoculars extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelBinoculars() {
        this.textureX = 32;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[0].setRotationPoint(-1.5f, -3.25f, -2.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.gunModel[1].setRotationPoint(-1.5f, -3.0f, -2.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f);
        this.gunModel[2].setRotationPoint(-1.5f, -2.75f, -2.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[3].setRotationPoint(-1.5f, -3.25f, 1.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.gunModel[4].setRotationPoint(-1.5f, -3.0f, 1.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f, 0.0f, -0.25f, -0.3f);
        this.gunModel[5].setRotationPoint(-1.5f, -2.75f, 1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[6].setRotationPoint(0.0f, -3.0f, -1.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.gunModel[7].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -3.35f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f, -0.2f, -0.25f, -0.3f);
        this.gunModel[9].setRotationPoint(0.0f, -3.1f, -0.5f);
        this.translateAll(0.0f, -4.5f, 0.0f);
        this.flipAll();
    }
}
