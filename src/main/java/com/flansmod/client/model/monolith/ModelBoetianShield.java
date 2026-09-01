// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelBoetianShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelBoetianShield() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[18];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 19, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 9, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -2.5f, -4.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[1].setRotationPoint(1.3f, -2.0f, -2.0f);
        this.gunModel[2].addShapeBox(0.0f, -2.7f, 0.0f, 1, 1, 4, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[2].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[3].addShapeBox(0.0f, -5.0f, 0.0f, 1, 1, 10, 0.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(1.0f, -6.5f, -5.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.gunModel[4].setRotationPoint(1.0f, -10.5f, -5.0f);
        this.gunModel[5].addShapeBox(0.0f, -3.0f, 0.0f, 1, 5, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(1.0f, -4.5f, -7.0f);
        this.gunModel[6].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f);
        this.gunModel[6].setRotationPoint(1.0f, -0.5f, -7.0f);
        this.gunModel[7].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].setRotationPoint(1.0f, -0.5f, -4.6f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f);
        this.gunModel[8].setRotationPoint(1.0f, 9.5f, -5.0f);
        this.gunModel[9].addShapeBox(0.0f, -2.8f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f);
        this.gunModel[9].setRotationPoint(1.3f, 4.5f, -2.0f);
        this.gunModel[10].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].setRotationPoint(1.0f, 2.5f, -4.6f);
        this.gunModel[11].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.gunModel[11].setRotationPoint(1.0f, 2.5f, -7.0f);
        this.gunModel[12].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.gunModel[12].setRotationPoint(1.0f, -0.5f, 6.0f);
        this.gunModel[13].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[13].setRotationPoint(1.0f, -0.5f, 3.6f);
        this.gunModel[14].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.gunModel[14].setRotationPoint(1.0f, 2.5f, 3.6f);
        this.gunModel[15].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[15].setRotationPoint(1.0f, 2.5f, 6.0f);
        this.gunModel[16].addShapeBox(0.0f, -3.0f, 0.0f, 1, 5, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[16].setRotationPoint(1.0f, 4.5f, -7.0f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 10, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[17].setRotationPoint(1.0f, 6.5f, -5.0f);
    }
}
