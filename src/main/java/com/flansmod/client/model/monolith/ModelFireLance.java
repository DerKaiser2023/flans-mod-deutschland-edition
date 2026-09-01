// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelFireLance extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelFireLance() {
        this.textureX = 256;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[5];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[0].addBox(-25.0f, 0.0f, -3.0f, 106, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -3.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(81.0f, 0.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -3.0f, 5, 1, 1, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 1.0f, 0.0f);
        this.gunModel[2].setRotationPoint(83.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(-1.0f, 0.0f, -3.0f, 2, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.25f, -0.25f);
        this.gunModel[3].setRotationPoint(89.0f, 0.0f, 0.0f);
        this.gunModel[4].addBox(-31.0f, -2.0f, -2.0f, 20, 3, 3, 0.0f);
        this.gunModel[4].setRotationPoint(86.0f, 0.0f, 0.0f);
    }
}
