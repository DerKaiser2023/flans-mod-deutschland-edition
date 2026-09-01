// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelIndiaShitShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelIndiaShitShield() {
        this.textureX = 128;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[10];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 3, 6, 14, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -2.0f, -7.0f);
        this.gunModel[1].addShapeBox(0.0f, 10.0f, 0.0f, 3, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[1].setRotationPoint(1.0f, -6.0f, -7.0f);
        this.gunModel[2].addShapeBox(0.0f, 10.0f, 0.0f, 3, 4, 14, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -16.0f, -7.0f);
        this.gunModel[3].addShapeBox(0.0f, 14.0f, 0.0f, 3, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[3].setRotationPoint(1.0f, -6.0f, -6.0f);
        this.gunModel[4].addShapeBox(0.0f, 17.0f, 0.0f, 3, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[4].setRotationPoint(1.0f, -6.0f, -4.0f);
        this.gunModel[5].addShapeBox(0.0f, 14.0f, 0.0f, 3, 3, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(1.0f, -23.0f, -6.0f);
        this.gunModel[6].addShapeBox(0.0f, 17.0f, 0.0f, 3, 1, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].setRotationPoint(1.0f, -27.0f, -4.0f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 2, 3, 7, 0.0f);
        this.gunModel[7].setRotationPoint(3.5f, -0.5f, -3.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 7, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].setRotationPoint(3.5f, -3.5f, -3.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[9].setRotationPoint(3.5f, 2.5f, -3.5f);
    }
}
