// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelP11 extends ModelPlane
{
    int textureX;
    int textureY;
    
    public ModelP11() {
        this.textureX = 1024;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[81];
        this.noseModel = new ModelRendererTurbo[7];
        this.tailModel = new ModelRendererTurbo[4];
        this.leftWingModel = new ModelRendererTurbo[4];
        this.rightWingModel = new ModelRendererTurbo[4];
        this.yawFlapModel = new ModelRendererTurbo[5];
        this.pitchFlapLeftModel = new ModelRendererTurbo[2];
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initnoseModel_1();
        this.inittailModel_1();
        this.initleftWingModel_1();
        this.initrightWingModel_1();
        this.inityawFlapModel_1();
        this.initpitchFlapLeftModel_1();
        this.initpitchFlapRightModel_1();
        this.initpitchFlapLeftWingModel_1();
        this.initpitchFlapRightWingModel_1();
        this.initPropeller();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 537, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 577, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 617, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 729, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 833, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 617, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 857, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 745, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 409, 41, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 729, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 793, 41, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 673, 65, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo(this, 873, 57, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo(this, 409, 73, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo(this, 121, 81, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo(this, 273, 9, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo(this, 385, 9, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo(this, 977, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo(this, 1009, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo(this, 1009, 33, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo(this, 137, 41, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo(this, 169, 41, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo(this, 233, 41, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo(this, 281, 41, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo(this, 385, 17, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo(this, 585, 1, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo(this, 737, 1, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo(this, 417, 9, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo(this, 569, 33, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo(this, 321, 41, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo(this, 977, 41, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo(this, 137, 49, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo(this, 345, 41, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo(this, 361, 17, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo(this, 529, 17, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo(this, 721, 17, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo(this, 857, 17, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo(this, 865, 17, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo(this, 409, 17, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo(this, 537, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 18, 12, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-44.0f, -31.0f, -10.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 18, 6, 10, 0.0f, 0.0f, 0.5f, 0.0f, 2.0f, 1.5f, -1.0f, 2.0f, 1.5f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[1].func_78793_a(-44.0f, -37.0f, -5.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 18, 5, 10, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, -1.0f, 5.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[2].func_78793_a(-44.0f, -19.0f, -5.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 10, 0.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(-51.0f, -19.0f, -5.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 10, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f);
        this.bodyModel[4].func_78793_a(-51.0f, -37.0f, -5.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 12, 20, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.bodyModel[5].func_78793_a(-51.0f, -31.0f, -10.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(-26.0f, -31.0f, -10.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 10, 0.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -2.0f, 0.0f, -1.5f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(-26.0f, -19.0f, -5.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, 0.0f, -1.5f, -5.5f, 0.0f, -5.0f, -3.0f, 0.0f, -5.0f, 3.0f, 0.0f, -1.5f, 5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(-15.0f, -40.0f, -9.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.15f);
        this.bodyModel[9].func_78793_a(-10.0f, -35.0f, -9.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 2.0f, -6.0f, 0.0f, 2.0f, 6.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f);
        this.bodyModel[10].func_78793_a(-6.0f, -35.0f, -9.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 42, 12, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5f, -4.5f, 0.0f, 1.5f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -4.5f, 0.0f, -5.0f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(-2.0f, -31.0f, -9.0f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 24, 13, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].func_78793_a(-26.0f, -31.0f, 9.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 1, 0.0f, 0.0f, -1.5f, 5.5f, 0.0f, -5.0f, 3.0f, 0.0f, -5.0f, -3.0f, 0.0f, -1.5f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(-15.0f, -40.0f, 8.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.15f);
        this.bodyModel[14].func_78793_a(-10.0f, -35.0f, 8.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 2.0f, 6.0f, 0.0f, 2.0f, -6.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.3f);
        this.bodyModel[15].func_78793_a(-6.0f, -35.0f, 8.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 42, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -4.5f, 0.0f, 5.0f, -4.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.0f, -5.0f, -7.5f, 0.0f, -5.0f, -7.5f, 0.0f, -0.5f, -6.0f);
        this.bodyModel[16].func_78793_a(-2.0f, -19.0f, -9.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 42, 6, 18, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -4.5f, 0.0f, -1.5f, -4.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].func_78793_a(-2.0f, -37.0f, -9.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 42, 3, 5, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].func_78793_a(-2.0f, -40.0f, -2.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 42, 2, 4, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, -5.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -1.0f, 0.0f, 5.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].func_78793_a(-2.0f, -42.0f, -2.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 21, 6, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.5f, 0.5f, 0.0f, -5.5f, -2.0f, 0.0f, -5.5f, -2.0f, 0.0f, -1.5f, 0.5f);
        this.bodyModel[20].func_78793_a(40.0f, -37.0f, -4.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, -1.0f, 16, 19, 2, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].func_78793_a(45.0f, -56.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, -1.0f, 15, 3, 2, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].func_78793_a(52.0f, -59.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, -1.0f, 11, 2, 2, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, -4.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[23].func_78793_a(54.0f, -61.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, -1.0f, 7, 4, 2, 0.0f, 0.0f, -3.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].func_78793_a(40.0f, -40.0f, 0.0f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f);
        this.bodyModel[25].func_78793_a(45.0f, -35.5f, 0.0f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].func_78793_a(45.0f, -35.5f, -32.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 15, 2, 32, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[27].func_78793_a(45.0f, -35.5f, -32.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f, 0.0f, 2.0f, 0.0f, 2.0f, 2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 3.0f, 0.0f);
        this.bodyModel[28].func_78793_a(-49.0f, -40.0f, -10.0f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 23, 2, 15, 0.0f, 0.0f, 4.0f, 0.0f, 15.0f, 4.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 15.0f, -2.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[29].func_78793_a(-49.0f, -43.0f, -25.0f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 36, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[30].func_78793_a(-49.0f, -48.0f, -43.0f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 23, 1, 10, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 2.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 2.5f, 0.0f, 2.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[31].func_78793_a(-49.0f, -40.0f, 0.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 23, 2, 15, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 15.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, 1.0f, 0.0f, 15.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[32].func_78793_a(-49.0f, -43.0f, 10.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 36, 4, 18, 0.0f, 0.0f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].func_78793_a(-49.0f, -48.0f, 25.0f);
        this.bodyModel[34].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[34].func_78793_a(-45.0f, -46.0f, 9.0f);
        this.bodyModel[35].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].func_78793_a(-30.0f, -46.0f, 9.0f);
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f);
        this.bodyModel[36].func_78793_a(-46.0f, -46.0f, -41.0f);
        this.bodyModel[37].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f);
        this.bodyModel[37].func_78793_a(-31.0f, -46.0f, -41.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].func_78793_a(-50.0f, 2.0f, 24.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.bodyModel[39].func_78793_a(-50.0f, 6.0f, 24.0f);
        this.bodyModel[40].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[40].func_78793_a(-50.0f, -2.0f, 24.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, -1.0f, 15.0f, 0.0f, -1.0f, 15.0f);
        this.bodyModel[41].func_78793_a(-45.0f, -20.0f, 8.0f);
        this.bodyModel[42].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, 0.0f, -16.0f, -14.0f, 0.0f, -16.0f, -14.0f, -1.0f, 15.0f, 15.0f, -1.0f, 15.0f);
        this.bodyModel[42].func_78793_a(-30.0f, -20.0f, 8.0f);
        this.bodyModel[43].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].func_78793_a(-50.0f, 2.0f, -26.0f);
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        this.bodyModel[44].func_78793_a(-50.0f, 6.0f, -26.0f);
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 12, 4, 2, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].func_78793_a(-50.0f, -2.0f, -26.0f);
        this.bodyModel[46].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 15.0f, 0.0f, -1.0f, 15.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f);
        this.bodyModel[46].func_78793_a(-45.0f, -20.0f, -10.0f);
        this.bodyModel[47].addShapeBox(0.0f, 0.0f, 0.0f, 2, 26, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 15.0f, -1.0f, 15.0f, -14.0f, -1.0f, 15.0f, -14.0f, 0.0f, -16.0f, 15.0f, 0.0f, -16.0f);
        this.bodyModel[47].func_78793_a(-30.0f, -20.0f, -10.0f);
        this.bodyModel[48].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[48].func_78793_a(-53.0f, -47.0f, 35.0f);
        this.bodyModel[49].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[49].func_78793_a(-53.0f, -47.0f, -36.0f);
        this.bodyModel[50].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[50].func_78793_a(-16.0f, -43.5f, 3.0f);
        this.bodyModel[51].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 4.0f, 0.0f, 1.0f, -4.0f, 0.0f, 1.0f, -4.0f, 0.0f, -1.0f, 4.0f, 0.0f, -1.0f);
        this.bodyModel[51].func_78793_a(-20.0f, -43.5f, 2.4f);
        this.bodyModel[52].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[52].func_78793_a(-20.0f, -43.5f, 1.0f);
        this.bodyModel[53].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[53].func_78793_a(-16.0f, -43.5f, -4.0f);
        this.bodyModel[54].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 4.0f, 0.0f, -1.0f, -4.0f, 0.0f, -1.0f, -4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 1.0f);
        this.bodyModel[54].func_78793_a(-20.0f, -43.5f, -3.4f);
        this.bodyModel[55].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[55].func_78793_a(-20.0f, -43.5f, -2.0f);
        this.bodyModel[56].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[56].func_78793_a(-16.0f, -43.5f, -2.5f);
        this.bodyModel[57].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[57].func_78793_a(-20.0f, -43.5f, -1.5f);
        this.bodyModel[58].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[58].func_78793_a(-31.0f, -42.5f, -0.5f);
        this.bodyModel[59].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[59].func_78793_a(-46.0f, -42.0f, -0.5f);
        this.bodyModel[60].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[60].func_78793_a(-46.0f, -43.6f, -0.5f);
        this.bodyModel[61].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[61].func_78793_a(-46.0f, -43.1f, 0.05f);
        this.bodyModel[62].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f);
        this.bodyModel[62].func_78793_a(-46.0f, -42.5f, -0.5f);
        this.bodyModel[63].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f);
        this.bodyModel[63].func_78793_a(-46.0f, -43.1f, -1.0f);
        this.bodyModel[64].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[64].func_78793_a(-3.0f, -41.0f, -2.0f);
        this.bodyModel[65].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[65].func_78793_a(-3.0f, -37.0f, -2.5f);
        this.bodyModel[65].field_78808_h = -0.12217305f;
        this.bodyModel[66].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[66].func_78793_a(-12.0f, -25.0f, -3.0f);
        this.bodyModel[67].addShapeBox(0.0f, 0.0f, 0.0f, 11, 8, 1, 0.0f, -2.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, 1.0f, -2.0f, -0.5f, 3.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, -5.0f);
        this.bodyModel[67].func_78793_a(-26.0f, -39.0f, -5.0f);
        this.bodyModel[68].addShapeBox(0.0f, 0.0f, 0.0f, 11, 8, 1, 0.0f, -2.0f, -0.5f, 3.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 0.0f, 5.0f);
        this.bodyModel[68].func_78793_a(-26.0f, -39.0f, 4.0f);
        this.bodyModel[69].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[69].func_78793_a(-18.0f, -38.0f, -4.5f);
        this.bodyModel[70].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f);
        this.bodyModel[70].func_78793_a(-18.0f, -38.0f, 1.5f);
        this.bodyModel[71].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[71].func_78793_a(-18.0f, -36.0f, -1.5f);
        this.bodyModel[72].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[72].func_78793_a(-25.0f, -37.3f, -1.5f);
        this.bodyModel[73].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 3, 0.0f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[73].func_78793_a(-17.8f, -36.1f, -1.5f);
        this.bodyModel[74].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[74].func_78793_a(-17.8f, -36.7f, -4.0f);
        this.bodyModel[75].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[75].func_78793_a(-17.8f, -34.1f, -6.0f);
        this.bodyModel[76].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[76].func_78793_a(-17.8f, -34.1f, 3.0f);
        this.bodyModel[77].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[77].func_78793_a(-17.8f, -36.1f, 1.8f);
        this.bodyModel[78].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[78].func_78793_a(-17.8f, -36.1f, 3.0f);
        this.bodyModel[79].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f);
        this.bodyModel[79].func_78793_a(-18.0f, -37.0f, -1.5f);
        this.bodyModel[80].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[80].func_78793_a(-18.0f, -37.0f, -0.5f);
    }
    
    private void initnoseModel_1() {
        this.noseModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.noseModel[3] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
        this.noseModel[4] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
        this.noseModel[5] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
        this.noseModel[6] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.noseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 8, 9, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[0].func_78793_a(-59.0f, -30.5f, -13.0f);
        this.noseModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 26, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.noseModel[1].func_78793_a(-59.0f, -38.5f, -13.0f);
        this.noseModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 8, 8, 26, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f);
        this.noseModel[2].func_78793_a(-59.0f, -21.5f, -13.0f);
        this.noseModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -8.5f, 0.0f, 0.5f, -8.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, -8.5f);
        this.noseModel[3].func_78793_a(-64.0f, -21.5f, -13.0f);
        this.noseModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 26, 0.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, -0.5f, -8.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[4].func_78793_a(-64.0f, -38.5f, -13.0f);
        this.noseModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 5, 9, 26, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.noseModel[5].func_78793_a(-64.0f, -30.5f, -13.0f);
        this.noseModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 10, 10, 10, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f);
        this.noseModel[6].func_78793_a(-74.0f, -31.0f, -5.0f);
    }
    
    private void inittailModel_1() {
        this.tailModel[0] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 945, 25, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 521, 1, this.textureX, this.textureY);
        this.tailModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 21, 8, 9, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 4.5f, -2.5f, 0.0f, 4.5f, -2.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f);
        this.tailModel[0].func_78793_a(40.0f, -32.0f, -4.5f);
        this.tailModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 21, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -11.0f, -1.5f, -4.0f, -11.0f, -1.5f, -4.0f, 0.0f, 0.0f, -3.0f);
        this.tailModel[1].func_78793_a(40.0f, -24.0f, -4.5f);
        this.tailModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 13, 13, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -4.5f, -1.5f, 1.0f, -4.5f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.tailModel[2].func_78793_a(61.0f, -37.0f, -2.0f);
        this.tailModel[3].addShapeBox(0.0f, 0.0f, -1.0f, 7, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, -2.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.tailModel[3].func_78793_a(50.0f, -23.0f, 0.0f);
    }
    
    private void initleftWingModel_1() {
        this.leftWingModel[0] = new ModelRendererTurbo(this, 545, 49, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo(this, 889, 41, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
        this.leftWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 36, 3, 51, 0.0f, -2.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -4.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f);
        this.leftWingModel[0].func_78793_a(-49.0f, -49.0f, -94.0f);
        this.leftWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 8, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[1].func_78793_a(-47.0f, -49.0f, -102.0f);
        this.leftWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 4, 0.0f, -5.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel[2].func_78793_a(-45.0f, -49.0f, -106.0f);
        this.leftWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 40, 0.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f);
        this.leftWingModel[3].func_78793_a(-54.0f, -49.0f, -97.0f);
    }
    
    private void initrightWingModel_1() {
        this.rightWingModel[0] = new ModelRendererTurbo(this, 737, 65, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo(this, 257, 17, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo(this, 153, 81, this.textureX, this.textureY);
        this.rightWingModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 36, 3, 51, 0.0f, 0.0f, -1.0f, 0.0f, -4.0f, -1.0f, 0.0f, -8.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -4.0f, 2.0f, 0.0f, -8.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.rightWingModel[0].func_78793_a(-49.0f, -49.0f, 43.0f);
        this.rightWingModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 26, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.rightWingModel[1].func_78793_a(-47.0f, -49.0f, 94.0f);
        this.rightWingModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 20, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.5f);
        this.rightWingModel[2].func_78793_a(-45.0f, -49.0f, 102.0f);
        this.rightWingModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 40, 1, 40, 0.0f, -11.0f, -0.3f, -11.0f, -11.0f, -0.3f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f, -11.0f, 0.0f, -11.0f);
        this.rightWingModel[3].func_78793_a(-54.0f, -48.7f, 36.0f);
    }
    
    private void inityawFlapModel_1() {
        this.yawFlapModel[0] = new ModelRendererTurbo(this, 545, 17, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo(this, 585, 41, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo(this, 169, 49, this.textureX, this.textureY);
        this.yawFlapModel[3] = new ModelRendererTurbo(this, 913, 57, this.textureX, this.textureY);
        this.yawFlapModel[4] = new ModelRendererTurbo(this, 912, 57, this.textureX, this.textureY);
        this.yawFlapModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 13, 19, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[0].func_78793_a(61.0f, -56.0f, 0.0f);
        this.yawFlapModel[1].addShapeBox(-4.0f, 0.0f, 3.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[1].func_78793_a(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[1].field_78808_h = -0.6981317f;
        this.yawFlapModel[2].addShapeBox(-4.0f, 0.0f, -7.5f, 8, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.yawFlapModel[2].func_78793_a(-19.0f, -23.3f, 0.0f);
        this.yawFlapModel[2].field_78808_h = -0.6981317f;
        this.yawFlapModel[3].addShapeBox(-5.0f, 1.0f, -0.8f, 20, 20, 1, 0.0f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f);
        this.yawFlapModel[3].func_78793_a(61.0f, -56.0f, 0.0f);
        this.yawFlapModel[4].addShapeBox(-5.0f, 1.0f, -0.2f, 20, 20, 1, 0.0f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f, -6.0f, -6.0f, -0.2f);
        this.yawFlapModel[4].func_78793_a(61.0f, -56.0f, 0.0f);
    }
    
    private void initpitchFlapLeftModel_1() {
        this.pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 513, 41, this.textureX, this.textureY);
        this.pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 369, 41, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShapeBox(0.0f, -0.5f, 0.0f, 9, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -5.0f, -0.2f, -3.0f, 1.0f, -0.2f, -5.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapLeftModel[0].func_78793_a(60.0f, -35.0f, -32.0f);
        this.pitchFlapLeftModel[1].addShapeBox(-0.5f, -12.0f, -0.5f, 1, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftModel[1].func_78793_a(-13.0f, -22.3f, 0.0f);
    }
    
    private void initpitchFlapRightModel_1() {
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo(this, 265, 41, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, 0.0f, 9, 2, 30, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 1.0f, -0.2f, -5.0f, -5.0f, -0.2f, -3.0f, 0.0f, -0.2f, 0.0f);
        this.pitchFlapRightModel[0].func_78793_a(60.0f, -35.0f, 2.0f);
    }
    
    private void initpitchFlapLeftWingModel_1() {
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo(this, 913, 41, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 4, 2, 51, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapLeftWingModel[0].func_78793_a(-21.0f, -47.5f, -94.0f);
        this.pitchFlapLeftWingModel[0].field_78795_f = -0.0296706f;
        this.pitchFlapLeftWingModel[0].field_78796_g = -0.07853982f;
    }
    
    private void initpitchFlapRightWingModel_1() {
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo(this, 433, 65, this.textureX, this.textureY)).addShapeBox(0.0f, -1.0f, 0.0f, 4, 2, 51, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.pitchFlapRightWingModel[0].func_78793_a(-17.0f, -46.0f, 43.0f);
        this.pitchFlapRightWingModel[0].field_78795_f = 0.0296706f;
        this.pitchFlapRightWingModel[0].field_78796_g = 0.07853982f;
    }
    
    private void initPropeller() {
        (this.propellerModels = new ModelRendererTurbo[1][2])[0] = this.makeProp1(-68.0f, -26.0f, 0.0f);
    }
    
    private ModelRendererTurbo[] makeProp1(final float i, final float j, final float k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo(this, 2, 97, this.textureX, this.textureY), new ModelRendererTurbo(this, 2, 97, this.textureX, this.textureY) };
        prop[0].func_78790_a(-0.5f, -22.0f, -1.5f, 1, 22, 3, 0.0f);
        prop[1].func_78790_a(-0.5f, -22.0f, -1.5f, 1, 22, 3, 0.0f);
        prop[0].func_78793_a(i, j, k);
        prop[1].func_78793_a(i, j, k);
        return prop;
    }
}
