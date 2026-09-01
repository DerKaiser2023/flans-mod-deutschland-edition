// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.yoshi;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelPollaxe extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelPollaxe() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[12];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 40, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -23.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 15, 1, 0.0f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f);
        this.gunModel[1].setRotationPoint(0.0f, -23.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f);
        this.gunModel[2].setRotationPoint(0.0f, -24.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f, -0.1f, 0.0f, -0.3f);
        this.gunModel[3].setRotationPoint(-1.2f, -24.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, -0.5f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f);
        this.gunModel[4].setRotationPoint(-2.2f, -25.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.3f, 0.0f, -0.1f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f);
        this.gunModel[5].setRotationPoint(1.2f, -24.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 0.0f, -0.3f, -0.1f, 1.6f, -0.3f, -0.1f, 1.6f, -0.3f, 0.1f, 0.0f, -0.3f, 0.1f, 0.0f, -0.3f, -0.1f, 1.2f, -0.3f, -0.1f, 1.2f, -0.3f, 0.1f, 0.0f, -0.3f);
        this.gunModel[6].setRotationPoint(2.2f, -24.0f, 0.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 1.6f, -0.3f, -0.1f, 3.4f, -0.3f, -0.1f, 3.4f, -0.3f, 0.1f, 1.6f, -0.3f, 0.1f, 1.2f, -0.3f, -0.1f, 2.8f, -0.3f, -0.1f, 2.8f, -0.3f, 0.1f, 1.2f, -0.3f);
        this.gunModel[7].setRotationPoint(3.2f, -24.0f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 3.4f, -0.3f, -0.5f, 4.0f, -0.5f, -0.5f, 4.0f, -0.5f, 0.1f, 3.4f, -0.3f, 0.1f, 2.8f, -0.3f, -0.6f, 3.7f, -0.5f, -0.6f, 3.7f, -0.5f, 0.1f, 2.8f, -0.3f);
        this.gunModel[8].setRotationPoint(4.2f, -24.0f, 0.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, -0.5f, -0.4f, -1.9428903E-16f, -0.5f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.5f, -2.7755576E-17f, -8.326673E-17f, -0.5f, -0.6f, 1.0269563E-15f, -0.5f, -0.6f, 2.7755576E-17f, -0.5f, -0.3f, 0.1f, -0.1f, -0.6f, 0.1f);
        this.gunModel[9].setRotationPoint(0.0f, -24.0f, -3.0f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, -0.5f, -2.7755576E-17f, -8.326673E-17f, -0.1f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, -1.9428903E-16f, -0.1f, -0.6f, 0.1f, -0.5f, -0.3f, 0.1f, -0.5f, -0.6f, 2.7755576E-17f, -0.5f, -0.6f, 1.0269563E-15f);
        this.gunModel[10].setRotationPoint(0.0f, -24.0f, 1.0f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f);
        this.gunModel[11].setRotationPoint(0.0f, -29.0f, 0.0f);
    }
}
