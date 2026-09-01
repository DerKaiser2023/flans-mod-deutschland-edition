// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelJazayer extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelJazayer() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[17];
        this.ammoModel = new ModelRendererTurbo[1];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 17, 2, 2, 0.0f, 10.0f, -0.3f, 0.0f, 10.0f, -0.3f, -0.2f, 10.0f, -0.3f, -0.2f, 10.0f, -0.3f, 0.0f, 10.0f, 0.0f, 0.0f, 10.0f, -0.7f, -0.3f, 10.0f, -0.7f, -0.3f, 10.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(19.0f, -4.5f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 2, 0.0f, 0.0f, -0.9f, 0.2f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.9f, 0.2f, -1.0f, 2.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -1.0f, 2.5f, 0.2f);
        this.gunModel[1].setRotationPoint(-13.5f, -4.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(3.0f, -3.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f, 15.0f, -0.1f, -0.1f);
        this.gunModel[3].setRotationPoint(22.0f, -4.9f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(46.0f, -4.9f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(1.0f, -4.0f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.gunModel[6].setRotationPoint(2.0f, -4.7f, -1.2f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.gunModel[7].setRotationPoint(1.2f, -3.7f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[8].setRotationPoint(0.2f, -0.9f, -0.5f);
        this.gunModel[8].rotateAngleZ = 0.7853982f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.gunModel[9].setRotationPoint(6.0f, -4.3f, -1.9f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.gunModel[10].setRotationPoint(5.5f, -5.6f, -1.9f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.gunModel[11].setRotationPoint(6.2f, -4.7f, -1.9f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f, -0.1f, -0.3f, -0.2f);
        this.gunModel[12].setRotationPoint(6.0f, -5.4f, -1.9f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.gunModel[13].setRotationPoint(1.0f, -4.9f, -0.5f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[14].setRotationPoint(0.0f, -4.0f, -1.0f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.5f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, -0.3f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.gunModel[15].setRotationPoint(-1.0f, -4.0f, -1.0f);
        this.gunModel[16].addShapeBox(-1.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[16].setRotationPoint(-0.5f, -2.1f, -0.5f);
        this.gunModel[16].rotateAngleZ = -0.62831855f;
    }
    
    private void initammoModel_1() {
        (this.ammoModel[0] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.ammoModel[0].setRotationPoint(46.0f, -4.8f, -0.5f);
    }
}
