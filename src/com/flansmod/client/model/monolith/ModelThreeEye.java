// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelThreeEye extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelThreeEye() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[20];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 35.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 35.0f, 0.0f, 0.0f, 35.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 35.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-11.0f, -2.8f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(16.0f, -5.0f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f, -0.2f, 0.2f, 0.2f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.2f, 0.2f);
        this.gunModel[2].func_78793_a(2.0f, -3.3f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f);
        this.gunModel[3].func_78793_a(21.5f, -5.0f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[4].func_78793_a(28.0f, -5.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[5].func_78793_a(24.5f, -5.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[6].func_78793_a(21.0f, -5.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(16.0f, -2.3f, -2.0f);
        this.gunModel[7].field_78795_f = -0.17453294f;
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[8].func_78793_a(21.0f, -2.3f, -2.0f);
        this.gunModel[8].field_78795_f = -0.17453294f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[9].func_78793_a(24.5f, -2.3f, -2.0f);
        this.gunModel[9].field_78795_f = -0.17453294f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[10].func_78793_a(28.0f, -2.3f, -2.0f);
        this.gunModel[10].field_78795_f = -0.17453294f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f);
        this.gunModel[11].func_78793_a(21.5f, -2.3f, -2.0f);
        this.gunModel[11].field_78795_f = -0.17453294f;
        this.gunModel[12].addShapeBox(0.0f, 0.0f, -2.0f, 5, 2, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.0f, 0.0f);
        this.gunModel[12].func_78793_a(16.0f, -2.3f, 3.0f);
        this.gunModel[12].field_78795_f = 0.17453294f;
        this.gunModel[13].addShapeBox(0.0f, 0.0f, -2.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[13].func_78793_a(21.0f, -2.3f, 3.0f);
        this.gunModel[13].field_78795_f = 0.17453294f;
        this.gunModel[14].addShapeBox(0.0f, 0.0f, -2.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[14].func_78793_a(24.5f, -2.3f, 3.0f);
        this.gunModel[14].field_78795_f = 0.17453294f;
        this.gunModel[15].addShapeBox(0.0f, 0.0f, -2.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[15].func_78793_a(28.0f, -2.3f, 3.0f);
        this.gunModel[15].field_78795_f = 0.17453294f;
        this.gunModel[16].addShapeBox(0.0f, 0.0f, -2.0f, 10, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f);
        this.gunModel[16].func_78793_a(21.5f, -2.3f, 3.0f);
        this.gunModel[16].field_78795_f = 0.17453294f;
        this.gunModel[17].addShapeBox(-1.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[17].func_78793_a(11.8f, -3.8f, -0.5f);
        this.gunModel[17].field_78808_h = 0.2268928f;
        this.gunModel[18].addShapeBox(-1.0f, -2.0f, -1.0f, 6, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[18].func_78793_a(11.8f, -0.8f, 1.0f);
        this.gunModel[18].field_78795_f = 0.17453294f;
        this.gunModel[18].field_78796_g = 0.2617994f;
        this.gunModel[18].field_78808_h = -0.13962634f;
        this.gunModel[19].addShapeBox(-1.0f, -2.0f, -1.0f, 6, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[19].func_78793_a(11.8f, -0.8f, 0.0f);
        this.gunModel[19].field_78795_f = -0.17453294f;
        this.gunModel[19].field_78796_g = -0.2617994f;
        this.gunModel[19].field_78808_h = -0.13962634f;
    }
}
