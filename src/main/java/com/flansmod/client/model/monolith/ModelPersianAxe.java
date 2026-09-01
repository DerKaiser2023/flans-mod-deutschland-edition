// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelPersianAxe extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelPersianAxe() {
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
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 26, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -19.5f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.gunModel[1].setRotationPoint(0.0f, -18.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.3f, -0.2f, -0.1f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.3f, -0.2f, -0.1f, 0.3f, -0.2f, -0.1f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -0.3f, 0.3f, -0.2f, -0.1f);
        this.gunModel[2].setRotationPoint(1.2f, -18.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.3f, -0.3f, 5.0f, 1.0f, -0.48f, 5.0f, 1.0f, -0.48f, -0.1f, 0.3f, -0.3f, -0.1f, 0.3f, -0.3f, 4.0f, 2.0f, -0.48f, 4.0f, 2.0f, -0.48f, -0.1f, 0.3f, -0.3f);
        this.gunModel[3].setRotationPoint(2.2f, -17.5f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[4].setRotationPoint(-2.0f, -17.3f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.5f, -0.2f);
        this.gunModel[5].setRotationPoint(-4.0f, -17.3f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.4f, -0.8f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, -0.4f, -0.8f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, -0.4f, 0.0f, -0.2f);
        this.gunModel[6].setRotationPoint(-6.0f, -17.3f, 0.0f);
    }
}
