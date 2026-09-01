// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAyudhaKatti extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAyudhaKatti() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[7];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -2.25f, 1, 4, 2, 0.0f, -0.45f, -0.5f, 1.9f, -0.45f, -0.5f, 1.9f, -0.45f, -0.5f, -1.0f, -0.45f, -0.5f, -1.0f, -0.45f, -1.5f, 0.5f, -0.45f, -1.5f, 0.5f, -0.45f, -2.0f, 0.0f, -0.45f, -2.0f, 0.0f);
        this.gunModel[0].setRotationPoint(0.2f, -13.0f, 0.5f);
        this.gunModel[0].rotateAngleY = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -3.65f, 1, 1, 2, 0.0f, -0.45f, -0.7f, 1.3f, -0.45f, -0.7f, 1.3f, -0.45f, -0.9f, -1.2f, -0.45f, -0.9f, -1.2f, -0.45f, 1.0f, 0.5f, -0.45f, 1.0f, 0.5f, -0.45f, 1.0f, 0.4f, -0.45f, 1.0f, 0.4f);
        this.gunModel[1].setRotationPoint(0.2f, -14.5f, 0.5f);
        this.gunModel[1].rotateAngleY = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -0.65f, 1, 5, 1, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(0.2f, -2.5f, 0.5f);
        this.gunModel[2].rotateAngleY = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.2f, 1, 1, 1, 0.0f, 0.7f, -0.2f, 0.0f, 0.7f, -0.2f, 0.0f, 0.7f, -0.2f, 0.0f, 0.7f, -0.2f, 0.0f, 0.7f, -0.4f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, -0.5f, 0.0f, 0.7f, -0.4f, 0.0f);
        this.gunModel[3].setRotationPoint(0.2f, 2.0f, 0.5f);
        this.gunModel[3].rotateAngleY = -2.6179938f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -1.25f, 1, 5, 2, 0.0f, -0.45f, -2.5f, 1.5f, -0.45f, -2.5f, 1.5f, -0.45f, -2.0f, -1.0f, -0.45f, -2.0f, -1.0f, -0.45f, 0.0f, 0.2f, -0.45f, 0.0f, 0.2f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f);
        this.gunModel[4].setRotationPoint(0.2f, -13.0f, 0.5f);
        this.gunModel[4].rotateAngleY = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -1.15f, 1, 5, 2, 0.0f, -0.45f, -3.0f, 0.3f, -0.45f, -3.0f, 0.3f, -0.45f, -3.0f, -0.5f, -0.45f, -3.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f);
        this.gunModel[5].setRotationPoint(0.2f, -11.0f, 0.5f);
        this.gunModel[5].rotateAngleY = -1.0471976f;
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -1.15f, 1, 4, 2, 0.0f, -0.45f, -0.5f, -0.5f, -0.45f, -0.5f, -0.5f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, 0.0f, -0.2f, -0.45f, 0.0f, -0.2f, -0.45f, -0.3f, -0.3f, -0.45f, -0.3f, -0.3f);
        this.gunModel[6].setRotationPoint(0.2f, -6.5f, 0.5f);
        this.gunModel[6].rotateAngleY = -1.0471976f;
    }
}
