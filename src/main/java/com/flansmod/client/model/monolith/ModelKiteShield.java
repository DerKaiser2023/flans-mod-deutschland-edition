// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelKiteShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelKiteShield() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[9];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, -1.0f, 0.0f, 1, 4, 12, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[0].setRotationPoint(1.0f, -2.5f, -6.0f);
        this.gunModel[1].addShapeBox(0.0f, 1.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[1].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[2].addShapeBox(0.0f, 1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(2.3f, -1.0f, -1.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(2.3f, -0.99f, -1.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[4].setRotationPoint(2.3f, 1.01f, -1.5f);
        this.gunModel[5].addShapeBox(0.0f, -0.7f, 0.0f, 1, 1, 4, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[5].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[6].addShapeBox(0.0f, 2.7f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f);
        this.gunModel[6].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[7].addShapeBox(0.0f, -5.0f, 0.0f, 1, 4, 12, 0.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[7].setRotationPoint(1.0f, -2.5f, -6.0f);
        this.gunModel[8].addShapeBox(0.0f, -5.0f, 0.0f, 1, 19, 12, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.gunModel[8].setRotationPoint(1.0f, 5.5f, -6.0f);
    }
}
