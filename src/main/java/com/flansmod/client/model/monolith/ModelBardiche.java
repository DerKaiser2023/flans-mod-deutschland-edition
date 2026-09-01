// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelBardiche extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelBardiche() {
        this.textureX = 32;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 26, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -13.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.gunModel[1].setRotationPoint(0.0f, -13.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.3f, 0.0f, -0.1f, -0.1f, 4.0f, -0.3f, -0.1f, 4.0f, -0.3f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.1f, 1.8f, -0.3f, -0.1f, 1.8f, -0.3f, 0.3f, 0.0f, -0.1f);
        this.gunModel[2].setRotationPoint(1.2f, -13.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, 0.1f, 0.4f, -0.3f, 0.3f, 0.4f, -0.4f, 0.3f, 0.4f, -0.4f, 0.1f, 0.4f, -0.3f, 0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.4f, -0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.3f);
        this.gunModel[3].setRotationPoint(2.2f, -12.5f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.4f, -0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.3f, 1.1f, 1.0f, -0.3f, -0.5f, -0.5f, -0.4f, -0.5f, -0.5f, -0.4f, 1.1f, 1.0f, -0.3f);
        this.gunModel[4].setRotationPoint(2.2f, -6.5f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.gunModel[5].setRotationPoint(0.0f, 13.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, 0.1f, 0.0f, -0.3f, -0.1f, -2.0f, -0.4f, -0.1f, -2.0f, -0.4f, 0.1f, 0.0f, -0.3f, 0.1f, 0.4f, -0.3f, 0.3f, 0.4f, -0.4f, 0.3f, 0.4f, -0.4f, 0.1f, 0.4f, -0.3f);
        this.gunModel[6].setRotationPoint(2.2f, -19.3f, 0.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 1.0f, 1.8f, -0.4f, 0.1f, 0.0f, -0.3f, 0.1f, 0.0f, -0.3f, 1.0f, 1.8f, -0.4f, 0.8f, -0.5f, -0.4f, 0.1f, 1.5f, -0.3f, 0.1f, 1.5f, -0.3f, 0.8f, -0.5f, -0.4f);
        this.gunModel[7].setRotationPoint(1.0f, -19.3f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.4f, -0.5f, 0.0f, -0.4f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.4f);
        this.gunModel[8].setRotationPoint(1.0f, -18.3f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
