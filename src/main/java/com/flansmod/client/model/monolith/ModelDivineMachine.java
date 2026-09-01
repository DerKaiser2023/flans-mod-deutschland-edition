// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDivineMachine extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelDivineMachine() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[28];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 13, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 41, 28, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 49, 28, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 0, 28, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 0, 28, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 0, 28, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 6, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 13, 2, 2, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-1.0f, -4.0f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, -1.4f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.4f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f);
        this.gunModel[1].func_78793_a(-6.0f, -4.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -2.0f, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f);
        this.gunModel[2].func_78793_a(-7.0f, -4.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.gunModel[3].func_78793_a(-7.0f, -1.0f, -1.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(-9.0f, 2.0f, -1.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.5f, 0.0f, 0.0f, -0.6f, 0.5f, 0.0f, -0.6f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.2f, -0.5f, 0.0f, 1.2f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(-11.0f, 2.0f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[6].func_78793_a(-1.0f, -5.0f, -1.2f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[7].func_78793_a(-1.0f, -5.0f, 0.2f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[8].func_78793_a(11.0f, -2.0f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[9].func_78793_a(11.0f, -2.5f, -1.3f);
        this.gunModel[9].field_78795_f = 0.34906584f;
        this.gunModel[10].addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[10].func_78793_a(11.0f, -2.5f, 1.3f);
        this.gunModel[10].field_78795_f = -0.34906584f;
        this.gunModel[11].addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[11].func_78793_a(11.0f, -4.0f, 0.8f);
        this.gunModel[11].field_78795_f = 0.9599311f;
        this.gunModel[12].addShapeBox(0.0f, -0.5f, -0.5f, 16, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[12].func_78793_a(11.0f, -4.0f, -0.8f);
        this.gunModel[12].field_78795_f = -0.9599311f;
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.gunModel[13].func_78793_a(3.0f, -3.5f, -1.5f);
        this.gunModel[13].field_78808_h = -0.17453294f;
        this.gunModel[14].addShapeBox(5.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.gunModel[14].func_78793_a(3.0f, -3.5f, -1.5f);
        this.gunModel[14].field_78808_h = -0.17453294f;
        this.gunModel[15].addShapeBox(8.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -1.2f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.0f, -0.2f);
        this.gunModel[15].func_78793_a(3.0f, -3.5f, -1.5f);
        this.gunModel[15].field_78808_h = -0.17453294f;
        this.gunModel[16].addShapeBox(10.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.8f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, 0.0f, -0.8f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.5f, -0.2f);
        this.gunModel[16].func_78793_a(3.0f, -3.5f, -1.5f);
        this.gunModel[16].field_78808_h = -0.17453294f;
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[17].func_78793_a(14.0f, -1.5f, -1.5f);
        this.gunModel[18].addShapeBox(0.0f, -0.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[18].func_78793_a(10.8f, -2.5f, -1.3f);
        this.gunModel[18].field_78795_f = 0.34906584f;
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[19].func_78793_a(10.8f, -2.0f, -0.5f);
        this.gunModel[20].addShapeBox(0.0f, -0.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[20].func_78793_a(10.8f, -4.0f, -0.8f);
        this.gunModel[20].field_78795_f = -0.9599311f;
        this.gunModel[21].addShapeBox(0.0f, -0.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[21].func_78793_a(10.8f, -4.0f, 0.8f);
        this.gunModel[21].field_78795_f = 0.9599311f;
        this.gunModel[22].addShapeBox(0.0f, -0.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[22].func_78793_a(10.8f, -2.5f, 1.3f);
        this.gunModel[22].field_78795_f = -0.34906584f;
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[23].func_78793_a(18.8f, -2.0f, -0.5f);
        this.gunModel[24].addShapeBox(0.0f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[24].func_78793_a(18.8f, -2.5f, 1.3f);
        this.gunModel[24].field_78795_f = -0.34906584f;
        this.gunModel[25].addShapeBox(0.0f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[25].func_78793_a(18.8f, -4.0f, 0.8f);
        this.gunModel[25].field_78795_f = 0.9599311f;
        this.gunModel[26].addShapeBox(0.0f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[26].func_78793_a(18.8f, -4.0f, -0.8f);
        this.gunModel[26].field_78795_f = -0.9599311f;
        this.gunModel[27].addShapeBox(0.0f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.gunModel[27].func_78793_a(18.8f, -2.5f, -1.3f);
        this.gunModel[27].field_78795_f = 0.34906584f;
        this.translateAll(0.0f, -1.6f, 0.0f);
    }
}
