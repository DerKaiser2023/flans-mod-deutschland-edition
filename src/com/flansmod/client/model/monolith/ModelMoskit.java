// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelMoskit extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelMoskit() {
        this.textureX = 512;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[50];
        this.turretModel = new ModelRendererTurbo[2];
        this.barrelModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 100, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 265, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 329, 17, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 241, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 265, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 409, 9, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 289, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 305, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 393, 17, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo(this, 457, 9, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo(this, 417, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo(this, 393, 1, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 32, 5, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -0.75f, -0.25f, 0.0f, -0.75f, -0.25f, -1.5f, -0.5f, 0.0f);
        this.bodyModel[0].func_78793_a(-31.0f, 1.0f, -6.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 13, 4, 13, 0.0f, 0.0f, 0.5f, 0.0f, 3.0f, 2.0f, 0.0f, 3.0f, 2.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.25f, -0.25f, 3.0f, -1.25f, -0.75f, 3.0f, -1.25f, -0.75f, 0.0f, 0.25f, -0.25f);
        this.bodyModel[1].func_78793_a(1.0f, 1.0f, -6.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 13, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.5f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, -0.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.0f, -1.75f, 0.0f, 0.75f, -0.75f);
        this.bodyModel[2].func_78793_a(17.0f, -1.0f, -6.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 13, 0.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.75f, -2.0f, 0.0f, 0.75f, -2.0f, 0.0f, 0.5f, -0.75f, 0.0f, 0.0f, -1.75f, 0.0f, -1.0f, -3.75f, 0.0f, -1.0f, -3.75f, 0.0f, 0.0f, -1.75f);
        this.bodyModel[3].func_78793_a(22.0f, -1.0f, -6.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 13, 0.0f, 0.0f, 0.75f, -2.0f, 0.0f, 0.75f, -4.0f, 0.0f, 0.75f, -4.0f, 0.0f, 0.75f, -2.0f, 0.0f, -1.0f, -3.75f, 0.0f, -1.5f, -5.5f, 0.0f, -1.5f, -5.5f, 0.0f, -1.0f, -3.75f);
        this.bodyModel[4].func_78793_a(26.0f, -1.0f, -6.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 4, 0.0f, 0.0f, 0.75f, 0.5f, 0.5f, 0.75f, -1.75f, 0.5f, 0.75f, -1.75f, 0.0f, 0.75f, 0.5f, 0.0f, -1.5f, -1.0f, -0.75f, -1.75f, -1.75f, -0.75f, -1.75f, -1.75f, 0.0f, -1.5f, -1.0f);
        this.bodyModel[5].func_78793_a(29.0f, -1.0f, -2.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 22, 2, 13, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -0.33f, -0.17f, 0.0f, -0.33f, -0.17f, -1.5f, -0.5f, 0.0f, -16.75f, 0.0f, -4.75f, 0.0f, 0.25f, -3.75f, 0.0f, 0.25f, -3.75f, -16.75f, 0.0f, -4.75f);
        this.bodyModel[6].func_78793_a(-31.0f, 5.0f, -6.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 12, 2, 13, 0.0f, 0.0f, -0.33f, -0.17f, -2.0f, -0.25f, -0.25f, -2.0f, -0.25f, -0.25f, 0.0f, -0.33f, -0.17f, 0.0f, 0.25f, -3.75f, -1.75f, 0.0f, -3.0f, -1.75f, 0.0f, -3.0f, 0.0f, 0.25f, -3.75f);
        this.bodyModel[7].func_78793_a(-9.0f, 5.0f, -6.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 16, 2, 13, 0.0f, 0.0f, 0.25f, -0.25f, 0.0f, 1.75f, -0.75f, 0.0f, 1.75f, -0.75f, 0.0f, 0.25f, -0.25f, -0.25f, -0.5f, -3.0f, 0.0f, -0.25f, -3.75f, 0.0f, -0.25f, -3.75f, -0.25f, -0.5f, -3.0f);
        this.bodyModel[8].func_78793_a(1.0f, 5.5f, -6.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 13, 0.0f, 0.0f, 0.25f, -0.75f, 0.0f, 1.0f, -1.75f, 0.0f, 1.0f, -1.75f, 0.0f, 0.25f, -0.75f, 0.0f, 0.25f, -3.75f, 0.0f, 0.5f, -5.0f, 0.0f, 0.5f, -5.0f, 0.0f, 0.25f, -3.75f);
        this.bodyModel[9].func_78793_a(17.0f, 4.0f, -6.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 13, 0.0f, 0.0f, -1.0f, -1.75f, 0.0f, 0.0f, -3.75f, 0.0f, 0.0f, -3.75f, 0.0f, -1.0f, -1.75f, 0.0f, 1.5f, -5.0f, 0.0f, 0.0f, -5.75f, 0.0f, 0.0f, -5.75f, 0.0f, 1.5f, -5.0f);
        this.bodyModel[10].func_78793_a(22.0f, 2.0f, -6.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 13, 0.0f, 0.0f, 0.0f, -3.75f, 0.0f, 0.5f, -5.5f, 0.0f, 0.5f, -5.5f, 0.0f, 0.0f, -3.75f, 0.0f, 1.0f, -5.75f, 0.0f, -2.0f, -6.0f, 0.0f, -2.0f, -6.0f, 0.0f, 1.0f, -5.75f);
        this.bodyModel[11].func_78793_a(26.0f, 2.0f, -6.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 4, 0.0f, 0.0f, -0.5f, -1.0f, -0.75f, -0.25f, -1.75f, -0.75f, -0.25f, -1.75f, 0.0f, -0.5f, -1.0f, 0.0f, 1.0f, -1.5f, -1.25f, 0.1f, -1.75f, -1.25f, 0.1f, -1.75f, 0.0f, 1.0f, -1.5f);
        this.bodyModel[12].func_78793_a(29.0f, 1.0f, -2.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 24, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(-22.0f, -3.0f, -2.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(2.0f, -3.0f, -2.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 6, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].func_78793_a(5.0f, -3.0f, -3.0f);
        this.bodyModel[16].addShapeBox(0.0f, -1.0f, 0.0f, 4, 7, 8, 0.0f, 1.0f, 0.5f, 0.0f, -4.0f, 0.25f, -2.0f, -4.0f, 0.25f, -4.0f, 1.0f, 0.5f, -2.0f, 0.5f, 0.0f, 0.0f, -3.0f, -2.0f, -2.0f, -3.0f, -2.0f, -4.0f, 0.5f, -2.0f, -2.0f);
        this.bodyModel[16].func_78793_a(11.0f, -3.0f, -3.0f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 4, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[17].func_78793_a(3.0f, -5.5f, -2.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f);
        this.bodyModel[18].func_78793_a(1.0f, -13.5f, -0.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].func_78793_a(-8.0f, -3.2f, 2.9f);
        this.bodyModel[19].field_78808_h = 0.17453294f;
        this.bodyModel[20].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].func_78793_a(-8.0f, -3.2f, 2.9f);
        this.bodyModel[20].field_78808_h = 0.17453294f;
        this.bodyModel[21].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[21].func_78793_a(-8.0f, -3.2f, 2.9f);
        this.bodyModel[21].field_78808_h = 0.17453294f;
        this.bodyModel[22].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[22].func_78793_a(-6.0f, -4.2f, 2.9f);
        this.bodyModel[23].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[23].func_78793_a(-2.5f, -4.2f, 2.9f);
        this.bodyModel[23].field_78808_h = 0.17453294f;
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[24].func_78793_a(-29.0f, -1.0f, -1.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].func_78793_a(-29.0f, -2.0f, -1.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[26].func_78793_a(-29.0f, -3.0f, -1.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[27].func_78793_a(-29.0f, -4.0f, -1.5f);
        this.bodyModel[28].addShapeBox(-3.5f, -0.5f, 0.0f, 4, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.bodyModel[28].func_78793_a(-27.5f, -2.7f, -0.5f);
        this.bodyModel[28].field_78808_h = -0.2617994f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].func_78793_a(13.25f, -2.0f, -1.5f);
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].func_78793_a(13.25f, -1.0f, -1.5f);
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[31].func_78793_a(-20.5f, -6.0f, -1.0f);
        this.bodyModel[32].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 4, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f);
        this.bodyModel[32].func_78793_a(-21.5f, -6.5f, -2.0f);
        this.bodyModel[33].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.bodyModel[33].func_78793_a(-20.5f, -8.0f, -1.0f);
        this.bodyModel[34].addShapeBox(-1.0f, -2.0f, 0.0f, 3, 2, 3, 0.0f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.bodyModel[34].func_78793_a(-19.5f, -7.5f, -1.5f);
        this.bodyModel[34].field_78808_h = 0.7679449f;
        this.bodyModel[35].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[35].func_78793_a(-21.4f, -3.9f, 2.9f);
        this.bodyModel[35].field_78808_h = 0.17453294f;
        this.bodyModel[36].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[36].func_78793_a(-24.9f, -3.9f, 2.9f);
        this.bodyModel[37].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[37].func_78793_a(-26.9f, -2.9f, 2.9f);
        this.bodyModel[37].field_78808_h = 0.17453294f;
        this.bodyModel[38].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].func_78793_a(-26.9f, -2.9f, 2.9f);
        this.bodyModel[38].field_78808_h = 0.17453294f;
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[39].func_78793_a(-26.9f, -2.9f, 2.9f);
        this.bodyModel[39].field_78808_h = 0.17453294f;
        this.bodyModel[40].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[40].func_78793_a(-21.4f, -3.9f, -5.9f);
        this.bodyModel[40].field_78808_h = 0.17453294f;
        this.bodyModel[41].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[41].func_78793_a(-24.9f, -3.9f, -5.9f);
        this.bodyModel[42].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[42].func_78793_a(-26.9f, -2.9f, -5.9f);
        this.bodyModel[42].field_78808_h = 0.17453294f;
        this.bodyModel[43].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[43].func_78793_a(-26.9f, -2.9f, -5.9f);
        this.bodyModel[43].field_78808_h = 0.17453294f;
        this.bodyModel[44].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[44].func_78793_a(-26.9f, -2.9f, -5.9f);
        this.bodyModel[44].field_78808_h = 0.17453294f;
        this.bodyModel[45].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[45].func_78793_a(-8.0f, -3.2f, -5.9f);
        this.bodyModel[45].field_78808_h = 0.17453294f;
        this.bodyModel[46].addShapeBox(0.0f, 1.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].func_78793_a(-8.0f, -3.2f, -5.9f);
        this.bodyModel[46].field_78808_h = 0.17453294f;
        this.bodyModel[47].addShapeBox(0.0f, 2.0f, 0.0f, 11, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[47].func_78793_a(-8.0f, -3.2f, -5.9f);
        this.bodyModel[47].field_78808_h = 0.17453294f;
        this.bodyModel[48].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[48].func_78793_a(-6.0f, -4.2f, -5.9f);
        this.bodyModel[49].addShapeBox(0.0f, 2.0f, 0.0f, 1, 3, 3, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f);
        this.bodyModel[49].func_78793_a(-2.5f, -4.2f, -5.9f);
        this.bodyModel[49].field_78808_h = 0.17453294f;
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo(this, 345, 9, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo(this, 393, 9, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(-1.5f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -1.05f, -0.5f, -1.05f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[0].func_78793_a(14.75f, -4.0f, -1.5f);
        this.turretModel[1].addShapeBox(-1.5f, 0.0f, 0.0f, 3, 1, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[1].func_78793_a(14.75f, -3.0f, -1.5f);
    }
    
    private void initbarrelModel_1() {
        (this.barrelModel[0] = new ModelRendererTurbo(this, 281, 9, this.textureX, this.textureY)).addShapeBox(0.0f, -0.5f, 0.0f, 4, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.barrelModel[0].func_78793_a(14.75f, -2.5f, -0.5f);
    }
}
