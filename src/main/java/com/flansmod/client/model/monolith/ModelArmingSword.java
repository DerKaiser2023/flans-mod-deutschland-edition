// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelArmingSword extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelArmingSword() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[13];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.gunModel[0].setRotationPoint(0.2f, -3.0f, 0.5f);
        this.gunModel[0].rotateAngleY = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -1.15f, 1, 8, 2, 0.0f, -0.45f, -0.5f, -0.45f, -0.45f, -0.5f, -0.45f, -0.45f, -0.5f, -0.45f, -0.45f, -0.5f, -0.45f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f);
        this.gunModel[1].setRotationPoint(0.2f, -14.8f, 0.5f);
        this.gunModel[1].rotateAngleY = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -1.15f, 1, 3, 2, 0.0f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 1.0f, -0.45f, -0.45f, 1.0f, -0.45f, -0.45f, 1.0f, -0.45f, -0.45f, 1.0f, -0.45f);
        this.gunModel[2].setRotationPoint(0.2f, -18.3f, 0.5f);
        this.gunModel[2].rotateAngleY = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.65f, 1, 2, 1, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f);
        this.gunModel[3].setRotationPoint(0.2f, -2.0f, 0.5f);
        this.gunModel[3].rotateAngleY = -1.0471976f;
        this.gunModel[4].addShapeBox(0.15f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.gunModel[4].setRotationPoint(-0.1f, 1.0f, 0.5f);
        this.gunModel[4].rotateAngleY = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, -0.2f, -0.3f, -0.25f, -0.2f, -0.3f, -0.25f, -0.2f, -0.3f, -0.25f, -0.2f, -0.3f);
        this.gunModel[5].setRotationPoint(0.2f, 0.4f, 0.5f);
        this.gunModel[5].rotateAngleY = -1.0471976f;
        this.gunModel[6].addShapeBox(0.15f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, -0.8f, -0.3f, -0.2f, -0.8f, -0.3f, -0.2f, -0.8f, 0.2f, -0.2f, -0.8f, 0.2f);
        this.gunModel[6].setRotationPoint(-0.1f, 1.9f, 0.5f);
        this.gunModel[6].rotateAngleY = -1.0471976f;
        this.gunModel[7].addShapeBox(0.15f, 0.0f, -0.65f, 1, 1, 1, 0.0f, -0.2f, -0.6f, -0.3f, -0.2f, -0.6f, -0.3f, -0.2f, -0.6f, 0.2f, -0.2f, -0.6f, 0.2f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, -0.5f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f);
        this.gunModel[7].setRotationPoint(-0.1f, 1.5f, 0.5f);
        this.gunModel[7].rotateAngleY = -1.0471976f;
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, 0.5f, 0.0f, -0.4f, 0.5f);
        this.gunModel[8].setRotationPoint(0.2f, -3.0f, 0.5f);
        this.gunModel[8].rotateAngleY = -1.0471976f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -2.3f, 1, 1, 2, 0.0f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.4f, 0.5f, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f);
        this.gunModel[9].setRotationPoint(0.2f, -3.0f, 0.5f);
        this.gunModel[9].rotateAngleY = -1.0471976f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 1.9f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.gunModel[10].setRotationPoint(0.2f, -2.9f, 0.5f);
        this.gunModel[10].rotateAngleY = -1.0471976f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, -3.1f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.gunModel[11].setRotationPoint(0.2f, -2.9f, 0.5f);
        this.gunModel[11].rotateAngleY = -1.0471976f;
        this.gunModel[12].addShapeBox(0.0f, 0.0f, -1.15f, 1, 6, 2, 0.0f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.4f, -0.45f, -0.5f, -0.35f, -0.45f, -0.5f, -0.35f, -0.45f, -0.5f, -0.35f, -0.45f, -0.5f, -0.35f);
        this.gunModel[12].setRotationPoint(0.2f, -7.8f, 0.5f);
        this.gunModel[12].rotateAngleY = -1.0471976f;
    }
}
