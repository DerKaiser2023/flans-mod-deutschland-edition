// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSlavShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSlavShield() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[27];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 15, 18, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -1.0f, -8.0f);
        this.gunModel[1].addShapeBox(0.0f, -5.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -3.5f, -4.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -7.5f, -6.0f);
        this.gunModel[3].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 14, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.gunModel[3].setRotationPoint(1.0f, -1.0f, -7.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[4].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(2.3f, -1.0f, -1.5f);
        this.gunModel[6].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].setRotationPoint(2.3f, -0.99f, -1.5f);
        this.gunModel[7].addShapeBox(0.0f, -1.7f, 0.0f, 1, 1, 4, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[7].setRotationPoint(1.3f, -1.0f, -2.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f);
        this.gunModel[8].setRotationPoint(1.0f, -5.5f, -6.0f);
        this.gunModel[9].addShapeBox(0.0f, -1.3f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f);
        this.gunModel[9].setRotationPoint(1.3f, 2.0f, -2.0f);
        this.gunModel[10].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[10].setRotationPoint(2.3f, 1.01f, -1.5f);
        this.gunModel[11].addShapeBox(0.0f, 1.0f, 0.0f, 1, 3, 14, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f);
        this.gunModel[11].setRotationPoint(1.0f, -1.0f, -7.0f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[12].setRotationPoint(1.0f, 2.5f, -6.0f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[13].setRotationPoint(1.0f, 4.5f, -6.0f);
        this.gunModel[14].addShapeBox(0.0f, -5.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f);
        this.gunModel[14].setRotationPoint(1.0f, 11.5f, -4.0f);
        this.gunModel[15].addShapeBox(0.1f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f, 0.0f, -0.2f, 6.5f);
        this.gunModel[15].setRotationPoint(1.0f, -1.0f, -0.5f);
        this.gunModel[16].addShapeBox(0.1f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f, 0.0f, 6.3f, 0.0f);
        this.gunModel[16].setRotationPoint(1.0f, -1.0f, -0.5f);
        this.gunModel[17].addShapeBox(0.1f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 9.5f, -9.5f, 0.0f, 9.5f, -9.5f, 0.0f, 9.0f, 9.1f, 0.0f, 9.0f, 9.1f);
        this.gunModel[17].setRotationPoint(1.0f, -5.5f, -5.0f);
        this.gunModel[18].addShapeBox(0.1f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 9.0f, 9.1f, 0.0f, 9.0f, 9.1f, 0.0f, 9.5f, -9.5f, 0.0f, 9.5f, -9.5f);
        this.gunModel[18].setRotationPoint(1.0f, -5.5f, 4.0f);
        this.gunModel[19].addShapeBox(0.1f, 0.0f, 1.0f, 1, 1, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[19].setRotationPoint(1.0f, -7.5f, -0.5f);
        this.gunModel[20].addShapeBox(0.1f, 0.0f, 1.0f, 1, 1, 2, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.gunModel[20].setRotationPoint(1.0f, 5.5f, -3.5f);
        this.gunModel[21].addShapeBox(0.1f, 0.0f, 1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[21].setRotationPoint(1.0f, -0.2f, 5.4f);
        this.gunModel[22].addShapeBox(0.1f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.gunModel[22].setRotationPoint(1.0f, -2.8f, -7.4f);
        this.gunModel[23].addShapeBox(0.1f, 0.0f, 1.0f, 1, 1, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.gunModel[23].setRotationPoint(1.0f, -6.3f, -5.0f);
        this.gunModel[24].addShapeBox(0.1f, 0.0f, 1.0f, 1, 1, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -3.0f, -0.8f, 0.0f, -3.0f, -0.8f, 0.0f, -0.4f, 1.0f, 0.0f, -0.4f, 1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f, -1.0f);
        this.gunModel[24].setRotationPoint(1.0f, -5.7f, 4.0f);
        this.gunModel[25].addShapeBox(0.1f, 0.0f, 1.0f, 1, 1, 2, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.gunModel[25].setRotationPoint(1.0f, 4.2f, 1.5f);
        this.gunModel[26].addShapeBox(0.1f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, -0.4f, 1.0f, 0.0f, -0.4f, 1.0f, 0.0f, -3.0f, -0.8f, 0.0f, -3.0f, -0.8f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.gunModel[26].setRotationPoint(1.0f, 3.7f, -7.1f);
    }
}
