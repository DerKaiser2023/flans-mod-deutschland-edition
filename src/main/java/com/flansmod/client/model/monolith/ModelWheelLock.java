// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelWheelLock extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelWheelLock() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[28];
        this.ammoModel = new ModelRendererTurbo[1];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(7.0f, -4.5f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, -2.5f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.2f, -0.3f, 1.5f, -0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.3f, 1.5f, -0.2f);
        this.gunModel[1].setRotationPoint(-8.5f, -4.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -3.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.gunModel[3].setRotationPoint(4.0f, -4.9f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f, 0.0f, -0.05f, -0.05f);
        this.gunModel[4].setRotationPoint(19.0f, -4.9f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.gunModel[5].setRotationPoint(-3.0f, -4.0f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, -0.8f, -0.3f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -0.8f, -0.3f);
        this.gunModel[6].setRotationPoint(16.0f, -4.5f, -1.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.gunModel[7].setRotationPoint(16.0f, -3.8f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[8].setRotationPoint(0.0f, -3.5f, -1.2f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.gunModel[9].setRotationPoint(0.2f, -2.0f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[10].setRotationPoint(-0.8f, -0.3f, -0.5f);
        this.gunModel[10].rotateAngleZ = 0.7853982f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.gunModel[11].setRotationPoint(5.0f, -4.3f, -1.9f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.gunModel[12].setRotationPoint(5.5f, -5.6f, -1.9f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.gunModel[13].setRotationPoint(5.2f, -4.7f, -1.9f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.gunModel[14].setRotationPoint(4.5f, -6.6f, -1.9f);
        this.gunModel[14].rotateAngleZ = -0.43633232f;
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f);
        this.gunModel[15].setRotationPoint(0.0f, -4.9f, -0.5f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f);
        this.gunModel[16].setRotationPoint(0.5f, -5.2f, -1.4f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.gunModel[17].setRotationPoint(-4.0f, -4.0f, -1.0f);
        this.gunModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[18].setRotationPoint(-3.8f, -0.8f, -0.5f);
        this.gunModel[18].rotateAngleZ = 1.2217305f;
        this.gunModel[19].addShapeBox(-4.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[19].setRotationPoint(-0.8f, -0.8f, -0.5f);
        this.gunModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, 0.0f, 0.0f);
        this.gunModel[20].setRotationPoint(-9.8f, -1.5f, -1.0f);
        this.gunModel[20].rotateAngleZ = 0.34906584f;
        this.gunModel[21].addShapeBox(-0.6f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.3f, -0.3f);
        this.gunModel[21].setRotationPoint(-9.8f, -1.5f, -1.0f);
        this.gunModel[21].rotateAngleZ = 0.34906584f;
        this.gunModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.3f, -0.2f, -1.0f, -0.5f, -0.2f, -1.0f, -0.5f, 0.0f, -1.0f, -0.3f);
        this.gunModel[22].setRotationPoint(19.0f, -4.5f, -1.0f);
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 2, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.gunModel[23].setRotationPoint(-3.0f, -3.5f, -1.2f);
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, -1.5f, -0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 1.3f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 1.3f, 0.0f);
        this.gunModel[24].setRotationPoint(-7.0f, -3.5f, -1.2f);
        this.gunModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f);
        this.gunModel[25].setRotationPoint(-1.0f, -3.5f, -1.5f);
        this.gunModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.gunModel[26].setRotationPoint(-4.8f, -1.5f, -0.5f);
        this.gunModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.gunModel[27].setRotationPoint(-1.0f, -3.5f, -1.7f);
    }
    
    private void initammoModel_1() {
        (this.ammoModel[0] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.ammoModel[0].setRotationPoint(20.0f, -4.8f, -0.5f);
        this.animationType = EnumAnimationType.END_LOADED;
    }
}
