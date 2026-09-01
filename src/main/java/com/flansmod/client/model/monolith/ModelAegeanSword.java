// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAegeanSword extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAegeanSword() {
        this.textureX = 32;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.0f, -0.1f, 0.6f, 0.0f, -0.1f, 0.6f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[0].setRotationPoint(0.2f, -2.8f, 0.5f);
        this.gunModel[0].rotateAngleY = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -1.15f, 1, 5, 2, 0.0f, -0.45f, 0.5f, -0.3f, -0.45f, 0.5f, -0.3f, -0.45f, 0.5f, -0.3f, -0.45f, 0.5f, -0.3f, -0.45f, 0.3f, 0.0f, -0.45f, 0.3f, 0.0f, -0.45f, 0.3f, 0.0f, -0.45f, 0.3f, 0.0f);
        this.gunModel[1].setRotationPoint(0.2f, -7.8f, 0.5f);
        this.gunModel[1].rotateAngleY = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -1.15f, 1, 7, 2, 0.0f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f, -0.45f, 1.0f, -0.3f);
        this.gunModel[2].setRotationPoint(0.2f, -16.3f, 0.5f);
        this.gunModel[2].rotateAngleY = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.65f, 1, 3, 1, 0.0f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f, -0.1f, 0.5f, -0.1f);
        this.gunModel[3].setRotationPoint(0.2f, -2.3f, 0.5f);
        this.gunModel[3].rotateAngleY = -1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, -0.4f, 0.3f, 0.2f, -0.4f, 0.3f, 0.2f, -0.4f, 0.3f, 0.2f, -0.4f, 0.3f);
        this.gunModel[4].setRotationPoint(0.2f, 1.7f, 0.5f);
        this.gunModel[4].rotateAngleY = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.6f, 0.0f, -0.1f, 0.6f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f);
        this.gunModel[5].setRotationPoint(0.2f, -2.8f, 0.5f);
        this.gunModel[5].rotateAngleY = -1.0471976f;
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f);
        this.gunModel[6].setRotationPoint(0.2f, -0.3f, 0.5f);
        this.gunModel[6].rotateAngleY = -1.0471976f;
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f, -0.05f, -0.4f, -0.05f);
        this.gunModel[7].setRotationPoint(0.2f, -1.3f, 0.5f);
        this.gunModel[7].rotateAngleY = -1.0471976f;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
