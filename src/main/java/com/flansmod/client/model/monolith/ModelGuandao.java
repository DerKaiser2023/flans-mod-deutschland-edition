// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelGuandao extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelGuandao() {
        this.textureX = 32;
        this.textureY = 64;
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
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 36, 1, 0.0f);
        this.gunModel[0].setRotationPoint(-1.5f, -25.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.05f, 0.0f, 0.0f, -0.4f, 0.0f, -0.25f, -0.4f, 0.0f, -0.25f, 0.05f, 0.0f, 0.0f, 0.05f, -0.5f, 2.7755576E-17f, -0.4f, -0.5f, -0.25f, -0.4f, -0.5f, -0.25f, 0.05f, -0.5f, 2.7755576E-17f);
        this.gunModel[1].setRotationPoint(-0.5f, -25.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, -0.25f, 0.05f, 0.0f, 0.0f, 0.05f, 0.0f, 0.0f, -0.4f, 0.0f, -0.25f, -0.4f, -0.5f, -0.25f, 0.05f, -0.5f, 2.7755576E-17f, 0.05f, -0.5f, 2.7755576E-17f, -0.4f, -0.5f, -0.25f);
        this.gunModel[2].setRotationPoint(-2.5f, -25.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.05f, 0.0f, -0.25f, 0.45f, 0.0f, -0.35f, 0.45f, 0.0f, -0.35f, -0.05f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.25f);
        this.gunModel[3].setRotationPoint(-1.5f, -29.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, 0.25f, 0.0f, -0.25f, 0.2f, 0.0f, -0.35f, 0.2f, 0.0f, -0.35f, 0.25f, 0.0f, -0.25f, -0.05f, 0.0f, -0.25f, 0.45f, 0.0f, -0.35f, 0.45f, 0.0f, -0.35f, -0.05f, 0.0f, -0.25f);
        this.gunModel[4].setRotationPoint(-1.5f, -35.0f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 1.0f, 0.5f, -0.35f, -0.75f, -0.25f, -0.45f, -0.75f, -0.25f, -0.45f, 1.0f, 0.5f, -0.35f, 0.25f, 0.0f, -0.25f, 0.2f, 0.0f, -0.35f, 0.2f, 0.0f, -0.35f, 0.25f, 0.0f, -0.25f);
        this.gunModel[5].setRotationPoint(-1.5f, -38.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.1f, 0.0f, -0.35f, -0.85f, 0.0f, -0.35f, -0.85f, 0.0f, -0.35f, -0.1f, 0.0f, -0.35f, -1.1f, 0.0f, -0.35f, 0.9f, 0.0f, -0.35f, 0.9f, 0.0f, -0.35f, -1.1f, 0.0f, -0.35f);
        this.gunModel[6].setRotationPoint(-2.5f, -33.0f, 0.0f);
    }
}
