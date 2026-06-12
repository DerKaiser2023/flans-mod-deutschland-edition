// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelOhka extends ModelPlane
{
    int textureX;
    int textureY;
    
    public ModelOhka() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[47];
        this.noseModel = new ModelRendererTurbo[11];
        this.tailModel = new ModelRendererTurbo[25];
        this.leftWingModel = new ModelRendererTurbo[2];
        this.rightWingModel = new ModelRendererTurbo[1];
        this.yawFlapModel = new ModelRendererTurbo[3];
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.bodyWheelModel = new ModelRendererTurbo[8];
        this.tailWheelModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initnoseModel_1();
        this.inittailModel_1();
        this.initleftWingModel_1();
        this.initrightWingModel_1();
        this.inityawFlapModel_1();
        this.initpitchFlapLeftModel_1();
        this.initpitchFlapRightModel_1();
        this.initbodyWheelModel_1();
        this.inittailWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 177, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 193, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 129, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 249, 33, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 65, 49, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 73, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 249, 49, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 249, 57, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 89, 65, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 97, 65, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 249, 65, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo(this, 185, 97, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo(this, 233, 89, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo(this, 249, 89, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo(this, 113, 81, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo(this, 185, 25, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo(this, 169, 57, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 24, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[0].func_78793_a(-30.5f, -5.75f, -7.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 14, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.25f, -4.0f, 0.0f, 0.25f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[1].func_78793_a(-30.5f, -11.25f, -7.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 14, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.5f, 0.0f, -0.25f, 0.5f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[2].func_78793_a(-30.5f, -1.5f, -7.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 25, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(-6.5f, 2.5f, -3.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 25, 5, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f, 0.0f, -0.5f, 4.0f, 0.0f, -0.5f, 4.0f);
        this.bodyModel[4].func_78793_a(-6.5f, -1.5f, -7.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 25, 5, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.5f, 4.0f, 0.0f, -0.5f, 4.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -4.5f);
        this.bodyModel[5].func_78793_a(-6.5f, -1.5f, 6.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 25, 5, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(-6.5f, -6.25f, -7.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 25, 5, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(-6.5f, -6.25f, 6.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 8, 6, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -3.0f, 3.5f, 0.0f, -3.0f, -3.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, -4.5f);
        this.bodyModel[8].func_78793_a(-6.5f, -12.0f, -3.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 8, 6, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -3.0f, -3.5f, 0.0f, -3.0f, 3.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f);
        this.bodyModel[9].func_78793_a(-6.5f, -12.0f, 2.0f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 17, 6, 1, 0.0f, 0.0f, -3.0f, 3.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, -3.0f, -3.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, -4.5f);
        this.bodyModel[10].func_78793_a(1.5f, -12.0f, -3.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 17, 6, 1, 0.0f, 0.0f, -3.0f, -3.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, -3.0f, 3.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, -4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f);
        this.bodyModel[11].func_78793_a(1.5f, -12.0f, 2.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 21, 5, 15, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].func_78793_a(18.5f, -6.25f, -7.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 21, 7, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f);
        this.bodyModel[13].func_78793_a(18.5f, -12.5f, -3.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 21, 5, 6, 0.0f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(18.5f, -1.5f, -3.0f);
        this.bodyModel[15].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f);
        this.bodyModel[15].func_78793_a(-1.0f, -16.0f, -2.5f);
        this.bodyModel[15].field_78808_h = -0.83775806f;
        this.bodyModel[16].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[16].func_78793_a(-1.0f, -16.0f, -2.5f);
        this.bodyModel[16].field_78795_f = -0.41887903f;
        this.bodyModel[16].field_78808_h = 0.33161256f;
        this.bodyModel[17].addShapeBox(-0.5f, -0.5f, 0.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[17].func_78793_a(2.5f, -17.7f, 0.0f);
        this.bodyModel[17].field_78795_f = -0.38397244f;
        this.bodyModel[18].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f);
        this.bodyModel[18].func_78793_a(-1.0f, -16.0f, 2.5f);
        this.bodyModel[18].field_78808_h = -0.83775806f;
        this.bodyModel[19].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[19].func_78793_a(-1.0f, -16.0f, 2.5f);
        this.bodyModel[19].field_78795_f = 0.41887903f;
        this.bodyModel[19].field_78808_h = 0.33161256f;
        this.bodyModel[20].addShapeBox(-0.5f, 0.0f, -0.5f, 4, 1, 1, 0.0f, -0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[20].func_78793_a(-1.0f, -16.75f, 0.0f);
        this.bodyModel[20].field_78808_h = 0.38397244f;
        this.bodyModel[21].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 5, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f);
        this.bodyModel[21].func_78793_a(-1.0f, -16.0f, -2.0f);
        this.bodyModel[21].field_78808_h = -0.83775806f;
        this.bodyModel[22].addShapeBox(-0.5f, -0.5f, -2.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[22].func_78793_a(2.5f, -17.7f, 0.0f);
        this.bodyModel[22].field_78795_f = 0.38397244f;
        this.bodyModel[23].addShapeBox(-0.5f, -0.5f, 0.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[23].func_78793_a(6.5f, -17.7f, 0.0f);
        this.bodyModel[23].field_78795_f = -0.38397244f;
        this.bodyModel[24].addShapeBox(-0.5f, -0.5f, -2.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[24].func_78793_a(6.5f, -17.7f, 0.0f);
        this.bodyModel[24].field_78795_f = 0.38397244f;
        this.bodyModel[25].addShapeBox(-0.5f, -0.5f, 0.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[25].func_78793_a(10.0f, -16.7f, 0.0f);
        this.bodyModel[25].field_78795_f = -0.38397244f;
        this.bodyModel[26].addShapeBox(-0.5f, -0.5f, -2.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[26].func_78793_a(10.0f, -16.7f, 0.0f);
        this.bodyModel[26].field_78795_f = 0.38397244f;
        this.bodyModel[27].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 6, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[27].func_78793_a(10.0f, -16.0f, 1.8f);
        this.bodyModel[27].field_78795_f = 0.40142572f;
        this.bodyModel[27].field_78808_h = 0.12217305f;
        this.bodyModel[28].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[28].func_78793_a(6.5f, -17.0f, 1.8f);
        this.bodyModel[28].field_78795_f = 0.40142572f;
        this.bodyModel[28].field_78808_h = 0.05235988f;
        this.bodyModel[29].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 9, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[29].func_78793_a(2.5f, -17.0f, 1.8f);
        this.bodyModel[29].field_78795_f = 0.4712389f;
        this.bodyModel[29].field_78808_h = 0.03490659f;
        this.bodyModel[30].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[30].func_78793_a(6.5f, -17.0f, -1.8f);
        this.bodyModel[30].field_78795_f = -0.40142572f;
        this.bodyModel[30].field_78808_h = 0.05235988f;
        this.bodyModel[31].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 9, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[31].func_78793_a(2.5f, -17.0f, -1.8f);
        this.bodyModel[31].field_78795_f = -0.4712389f;
        this.bodyModel[31].field_78808_h = 0.03490659f;
        this.bodyModel[32].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 6, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[32].func_78793_a(10.0f, -16.0f, -1.8f);
        this.bodyModel[32].field_78795_f = -0.40142572f;
        this.bodyModel[32].field_78808_h = 0.12217305f;
        this.bodyModel[33].addShapeBox(-0.5f, 0.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[33].func_78793_a(3.0f, -18.1f, 0.0f);
        this.bodyModel[34].addShapeBox(-0.5f, 0.0f, -0.5f, 4, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[34].func_78793_a(7.0f, -18.0f, 0.0f);
        this.bodyModel[34].field_78808_h = -0.27925268f;
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 2, 12, 3, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[35].func_78793_a(14.0f, -11.0f, -1.5f);
        this.bodyModel[35].field_78808_h = -0.12217305f;
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 10, 7, 4, 0.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, -5.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f);
        this.bodyModel[36].func_78793_a(3.0f, -5.0f, -2.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 2, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f);
        this.bodyModel[37].func_78793_a(14.0f, -11.0f, -4.0f);
        this.bodyModel[37].field_78808_h = -0.12217305f;
        this.bodyModel[38].addShapeBox(-4.0f, 0.0f, 0.0f, 6, 6, 1, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.3f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -0.45f, 0.0f);
        this.bodyModel[38].func_78793_a(8.0f, -5.0f, -4.0f);
        this.bodyModel[38].field_78808_h = -0.12217305f;
        this.bodyModel[39].addShapeBox(-4.0f, 0.0f, 0.0f, 6, 6, 1, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.3f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -0.45f, 0.0f);
        this.bodyModel[39].func_78793_a(8.0f, -5.0f, 3.0f);
        this.bodyModel[39].field_78808_h = -0.12217305f;
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 2, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f);
        this.bodyModel[40].func_78793_a(14.0f, -11.0f, 3.0f);
        this.bodyModel[40].field_78808_h = -0.12217305f;
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[41].func_78793_a(-26.0f, -13.5f, -0.5f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[42].func_78793_a(-9.0f, -13.0f, -0.5f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[43].func_78793_a(-9.0f, -14.6f, -0.5f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[44].func_78793_a(-9.0f, -14.1f, 0.05f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[45].func_78793_a(-9.0f, -13.5f, -0.5f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[46].func_78793_a(-9.0f, -14.1f, -1.0f);
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.noseModel[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
        this.noseModel[8] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.noseModel[9] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.noseModel[10] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, -0.2f, -0.2f, 0.0f, 1.25f, 1.25f, 0.0f, 1.25f, 1.25f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.0f, 1.25f, 1.25f, 0.0f, 1.25f, 1.25f, -0.2f, -0.2f, -0.2f);
        this.noseModel[0].func_78793_a(-60.5f, -4.5f, -1.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 4, 0.0f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 0.25f);
        this.noseModel[1].func_78793_a(-59.5f, -5.5f, -2.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, -1.5f, -0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, -1.5f, -0.5f, -0.5f, 0.0f, -0.25f, 0.25f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 0.25f);
        this.noseModel[2].func_78793_a(-59.5f, -7.5f, -2.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 4, 0.0f, 0.0f, -0.25f, 0.25f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 0.25f, -1.5f, -0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, -1.5f, -0.5f, -0.5f);
        this.noseModel[3].func_78793_a(-59.5f, -1.5f, -2.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 4, 0.0f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 2.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 4.5f, 0.0f, 0.25f, 2.5f);
        this.noseModel[4].func_78793_a(-55.5f, -5.5f, -2.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 4, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, 0.75f, 0.5f, 0.0f, 0.75f, 0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 2.5f);
        this.noseModel[5].func_78793_a(-55.5f, -9.5f, -2.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 4, 0.0f, 0.0f, -0.25f, 2.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 2.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, -1.5f, -0.5f);
        this.noseModel[6].func_78793_a(-55.5f, -1.5f, -2.0f);
        this.noseModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f);
        this.noseModel[7].func_78793_a(-43.5f, -5.75f, -6.5f);
        this.noseModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 13, 0.0f, 0.0f, 0.25f, -4.0f, 0.0f, 1.2f, -3.5f, 0.0f, 1.2f, -3.5f, 0.0f, 0.25f, -4.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.5f, 0.0f, 0.25f, 0.5f, 0.0f, 0.25f, 0.0f);
        this.noseModel[8].func_78793_a(-43.5f, -10.0f, -6.5f);
        this.noseModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 13, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.5f, 0.0f, 0.25f, 0.5f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.5f, -3.5f, 0.0f, 0.5f, -3.5f, 0.0f, 0.0f, -3.5f);
        this.noseModel[9].func_78793_a(-43.5f, -1.0f, -6.5f);
        this.noseModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.noseModel[10].func_78793_a(-61.0f, -4.0f, -0.5f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo(this, 17, 65, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 169, 73, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 97, 17, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 153, 9, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
        this.tailModel[15] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
        this.tailModel[16] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.tailModel[17] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.tailModel[18] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.tailModel[19] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.tailModel[20] = new ModelRendererTurbo(this, 225, 57, this.textureX, this.textureY);
        this.tailModel[21] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.tailModel[22] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.tailModel[23] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.tailModel[24] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 2, 42, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].func_78793_a(41.5f, -12.25f, -21.0f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 13, 5, 15, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[1].func_78793_a(39.5f, -6.25f, -7.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 13, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, -4.5f, 0.0f, -2.5f, -6.0f, 0.0f, -2.5f, -6.0f, 0.0f, -0.75f, -4.5f);
        this.tailModel[2].func_78793_a(39.5f, -1.25f, -7.5f);
        this.tailModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[3].func_78793_a(52.5f, -7.25f, -1.0f);
        this.tailModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[4].func_78793_a(52.5f, -4.0f, -2.5f);
        this.tailModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[5].func_78793_a(52.5f, -4.0f, 0.5f);
        this.tailModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 1.0f, 0.0f, 0.1f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[6].func_78793_a(52.5f, -11.0f, -3.0f);
        this.tailModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 3.5f, -0.5f, 0.25f, 2.5f, -0.5f, 0.25f, -2.5f, 0.0f, 0.25f, -3.5f);
        this.tailModel[7].func_78793_a(52.5f, -11.0f, -3.0f);
        this.tailModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.2f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, -3.5f, -0.5f, 0.25f, -2.5f, -0.5f, 0.25f, 2.5f, 0.0f, 0.25f, 3.5f);
        this.tailModel[8].func_78793_a(52.5f, -11.0f, 2.0f);
        this.tailModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 1, 0.0f, 0.0f, 0.25f, 1.5f, -0.5f, 0.25f, 0.5f, -0.5f, 0.25f, -0.5f, 0.0f, 0.25f, -1.5f, 0.0f, 0.25f, 0.5f, -1.5f, -0.25f, -0.5f, -1.5f, -0.25f, 0.5f, 0.0f, 0.25f, -0.5f);
        this.tailModel[9].func_78793_a(52.5f, -5.5f, -5.0f);
        this.tailModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 1, 0.0f, 0.0f, 0.25f, -1.5f, -0.5f, 0.25f, -0.5f, -0.5f, 0.25f, 0.5f, 0.0f, 0.25f, 1.5f, 0.0f, 0.25f, -0.5f, -1.5f, -0.25f, 0.5f, -1.5f, -0.25f, -0.5f, 0.0f, 0.25f, 0.5f);
        this.tailModel[10].func_78793_a(52.5f, -5.5f, 4.0f);
        this.tailModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, -1.0f, 0.5f, 1.0f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -4.0f, 0.0f, -0.2f, -4.0f, 0.0f, -0.2f, 4.5f, 0.0f, 0.5f, 4.5f);
        this.tailModel[11].func_78793_a(52.5f, -1.25f, -5.5f);
        this.tailModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.8f, 0.5f, 0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 4.5f, 0.0f, -0.2f, 4.5f, 0.0f, -0.2f, -4.0f, 0.0f, 0.5f, -4.0f);
        this.tailModel[12].func_78793_a(52.5f, -1.25f, 4.5f);
        this.tailModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 1.0f, 0.2f, 0.7f, 0.0f, 0.2f, 0.7f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[13].func_78793_a(52.5f, 0.25f, -1.5f);
        this.tailModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 13, 7, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 4.5f, 0.0f, -0.25f, 3.5f, 0.0f, -0.25f, 3.5f, 0.0f, -0.25f, 4.5f);
        this.tailModel[14].func_78793_a(39.5f, -12.5f, -3.0f);
        this.tailModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 7, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.tailModel[15].func_78793_a(41.5f, -16.25f, -22.0f);
        this.tailModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[16].func_78793_a(44.5f, -18.25f, -22.0f);
        this.tailModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[17].func_78793_a(41.5f, -18.25f, -22.0f);
        this.tailModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, -0.7f, 0.0f);
        this.tailModel[18].func_78793_a(41.5f, -6.0f, -22.0f);
        this.tailModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.tailModel[19].func_78793_a(44.5f, -6.0f, -22.0f);
        this.tailModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 7, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.tailModel[20].func_78793_a(41.5f, -16.25f, 21.0f);
        this.tailModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[21].func_78793_a(44.5f, -18.25f, 21.0f);
        this.tailModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[22].func_78793_a(41.5f, -18.25f, 21.0f);
        this.tailModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.5f, -0.7f, 0.0f);
        this.tailModel[23].func_78793_a(41.5f, -6.0f, 21.0f);
        this.tailModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.tailModel[24].func_78793_a(44.5f, -6.0f, 21.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 13, 2, 29, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, -3.0f, 0.0f, 4.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 4.0f, 1.0f, 4.0f, 4.0f, 1.0f);
        this.leftWingModel[0].func_78793_a(-22.5f, -5.75f, -36.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[1].func_78793_a(-35.5f, -3.5f, -21.0f);
    }
    
    private void initrightWingModel_1() {
        (this.rightWingModel[0] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 13, 2, 29, 0.0f, 4.0f, -3.0f, 0.0f, 7.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 4.0f, 1.0f, 7.0f, 4.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightWingModel[0].func_78793_a(-22.5f, -5.75f, 7.0f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 81, 81, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 241, 17, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 3, 15, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, -1.2f, -0.2f, 0.5f, -1.2f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, -1.2f, -0.2f, 0.5f, -1.2f, -0.2f, 0.0f, 0.2f, 0.0f);
        this.yawFlapModel[0].func_78793_a(48.5f, -18.6f, -21.5f);
        this.yawFlapModel[1].addShapeBox(0.0f, -0.95f, -5.5f, 1, 1, 11, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].func_78793_a(-3.0f, 0.2f, 0.0f);
        this.yawFlapModel[1].field_78808_h = -0.43633232f;
        this.yawFlapModel[2].addShapeBox(0.0f, 0.0f, -0.5f, 3, 15, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, -1.2f, -0.2f, 0.5f, -1.2f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, -1.2f, -0.2f, 0.5f, -1.2f, -0.2f, 0.0f, 0.2f, 0.0f);
        this.yawFlapModel[2].func_78793_a(48.5f, -18.6f, 21.5f);
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 9, 81, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, -1.0f, 0.0f, 3, 2, 16, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapLeftModel[0].func_78793_a(48.5f, -11.25f, -21.0f);
        this.pitchFlapLeftModel[1].addShapeBox(-0.5f, -11.0f, -0.5f, 1, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[1].func_78793_a(2.0f, 1.0f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 145, 81, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 3, 2, 16, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapRightModel[0].func_78793_a(48.5f, -11.25f, 5.0f);
    }
    
    private void initbodyWheelModel_1() {
        this.bodyWheelModel[0] = new ModelRendererTurbo(this, 1, 113, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo(this, 81, 97, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo(this, 169, 81, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo(this, 217, 97, this.textureX, this.textureY);
        this.bodyWheelModel[4] = new ModelRendererTurbo(this, 233, 97, this.textureX, this.textureY);
        this.bodyWheelModel[5] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
        this.bodyWheelModel[6] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
        this.bodyWheelModel[7] = new ModelRendererTurbo(this, 233, 105, this.textureX, this.textureY);
        this.bodyWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[0].func_78793_a(-46.5f, 7.5f, -2.0f);
        this.bodyWheelModel[1].addShapeBox(-12.0f, 0.0f, 0.0f, 12, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[1].func_78793_a(-46.2f, 7.5f, -2.0f);
        this.bodyWheelModel[1].field_78808_h = -0.36651915f;
        this.bodyWheelModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[2].func_78793_a(-10.0f, 4.5f, -1.5f);
        this.bodyWheelModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[3].func_78793_a(-9.5f, 3.5f, -1.0f);
        this.bodyWheelModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[4].func_78793_a(-43.5f, 2.5f, -1.0f);
        this.bodyWheelModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[5].func_78793_a(-44.0f, 4.5f, -1.5f);
        this.bodyWheelModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[6].func_78793_a(-27.0f, 4.5f, -1.5f);
        this.bodyWheelModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyWheelModel[7].func_78793_a(-26.5f, 3.5f, -1.0f);
    }
    
    private void inittailWheelModel_1() {
        this.tailWheelModel[0] = new ModelRendererTurbo(this, 97, 113, this.textureX, this.textureY);
        this.tailWheelModel[1] = new ModelRendererTurbo(this, 121, 113, this.textureX, this.textureY);
        this.tailWheelModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailWheelModel[0].func_78793_a(37.0f, 2.5f, -1.5f);
        this.tailWheelModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.tailWheelModel[1].func_78793_a(37.0f, 4.5f, -1.5f);
    }
}
