// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSassanidSword extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSassanidSword() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[5];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.8f, 1, 1, 1, 0.0f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, 0.5f, -0.2f, -0.5f, 0.5f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.gunModel[0].setRotationPoint(0.2f, -3.0f, 0.5f);
        this.gunModel[0].rotateAngleY = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -1.0f, 1, 13, 2, 0.0f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, -0.3f, -0.45f, -0.4f, -0.3f, -0.45f, -0.4f, 0.5f, -0.45f, -0.4f, 0.5f, -0.45f, -0.4f, 0.5f, -0.45f, -0.4f, 0.5f, -0.45f);
        this.gunModel[1].setRotationPoint(0.2f, -16.0f, 0.5f);
        this.gunModel[1].rotateAngleY = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -1.0f, 1, 1, 2, 0.0f, -0.45f, 0.0f, -0.8f, -0.45f, 0.0f, -0.8f, -0.45f, 0.0f, -1.1f, -0.45f, 0.0f, -1.1f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.3f, -0.45f, -0.4f, 0.3f, -0.45f);
        this.gunModel[2].setRotationPoint(0.2f, -17.0f, 0.5f);
        this.gunModel[2].rotateAngleY = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.7f, 1, 4, 1, 0.0f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f);
        this.gunModel[3].setRotationPoint(0.2f, -2.0f, 0.5f);
        this.gunModel[3].rotateAngleY = -1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.7f, 1, 1, 1, 0.0f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, -0.2f, -0.1f, -0.15f, -0.2f, -0.1f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.5f, 0.1f, -0.15f, 0.5f, 0.1f);
        this.gunModel[4].setRotationPoint(0.2f, 2.0f, 0.5f);
        this.gunModel[4].rotateAngleY = -1.0471976f;
    }
}
