// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelSiegeTower extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelSiegeTower() {
        this.textureX = 1024;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[27];
        this.leftBackWheelModel = new ModelRendererTurbo[9];
        this.rightBackWheelModel = new ModelRendererTurbo[9];
        this.initbodyModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 121, 73, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 801, 49, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 961, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 881, 57, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 921, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 497, 73, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 553, 73, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 625, 73, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 569, 153, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 1, 161, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 233, 161, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 593, 73, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 665, 73, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 721, 73, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 385, 177, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 1, 185, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 249, 185, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 905, 185, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 737, 225, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 313, 233, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 385, 257, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 505, 257, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, -0.5f, 48, 100, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-8.0f, -104.0f, -35.0f);
        this.bodyModel[0].field_78795_f = -0.06981317f;
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, -0.5f, 48, 100, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-8.0f, -104.0f, 35.0f);
        this.bodyModel[1].field_78795_f = 0.06981317f;
        this.bodyModel[2].addShapeBox(0.0f, 51.0f, -0.5f, 64, 50, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].func_78793_a(-72.01f, -105.0f, 35.0f);
        this.bodyModel[2].field_78795_f = 0.06981317f;
        this.bodyModel[3].addShapeBox(0.0f, 51.0f, -0.5f, 64, 50, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(-72.01f, -105.0f, -35.0f);
        this.bodyModel[3].field_78795_f = -0.06981317f;
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 142, 3, 84, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].func_78793_a(-72.01f, -5.0f, -42.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 100, 70, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 6.0f);
        this.bodyModel[5].func_78793_a(39.0f, -104.0f, -35.0f);
        this.bodyModel[5].field_78808_h = 0.05235988f;
        this.bodyModel[6].addShapeBox(0.0f, 61.0f, -0.5f, 24, 40, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(41.99f, -105.0f, -35.0f);
        this.bodyModel[6].field_78795_f = -0.06981317f;
        this.bodyModel[7].addShapeBox(0.0f, 41.0f, -0.5f, 18, 20, 1, 0.0f, 2.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(41.99f, -105.0f, -35.0f);
        this.bodyModel[7].field_78795_f = -0.06981317f;
        this.bodyModel[8].addShapeBox(0.0f, 41.0f, -0.5f, 18, 20, 1, 0.0f, 2.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, -17.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(41.99f, -105.0f, 35.0f);
        this.bodyModel[8].field_78795_f = 0.06981317f;
        this.bodyModel[9].addShapeBox(0.0f, 61.0f, -0.5f, 24, 40, 1, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(41.99f, -105.0f, 35.0f);
        this.bodyModel[9].field_78795_f = 0.06981317f;
        this.bodyModel[10].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 27, 76, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[10].func_78793_a(42.5f, -64.0f, -38.0f);
        this.bodyModel[10].field_78808_h = 0.715585f;
        this.bodyModel[11].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 40, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(60.0f, -44.0f, -39.0f);
        this.bodyModel[11].field_78808_h = 0.19198622f;
        this.bodyModel[12].addShapeBox(-0.5f, 0.0f, 0.0f, 1, 40, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f);
        this.bodyModel[12].func_78793_a(60.0f, -44.0f, 7.0f);
        this.bodyModel[12].field_78808_h = 0.19198622f;
        this.bodyModel[13].addShapeBox(-35.0f, -2.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[14].addShapeBox(-35.0f, -6.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[15].addShapeBox(-35.0f, 2.0f, 0.0f, 100, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[15].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[16].addShapeBox(65.0f, -6.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[17].addShapeBox(65.0f, -2.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[18].addShapeBox(65.0f, 2.0f, 0.0f, 15, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.bodyModel[18].func_78793_a(45.0f, -27.0f, -6.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 115, 1, 78, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].func_78793_a(-72.01f, -36.0f, -39.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 49, 1, 74, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].func_78793_a(-8.01f, -79.0f, -37.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].func_78793_a(10.0f, -130.0f, -19.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].func_78793_a(23.0f, -130.0f, -19.5f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 13, 50, 39, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[23].func_78793_a(-3.0f, -130.0f, -19.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 14, 15, 43, 0.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f);
        this.bodyModel[24].func_78793_a(-5.0f, -145.0f, -21.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 15, 15, 43, 0.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[25].func_78793_a(9.0f, -145.0f, -21.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 14, 15, 43, 0.0f, 0.0f, 0.0f, -14.0f, -4.0f, -4.0f, -16.0f, -4.0f, -4.0f, -16.0f, 0.0f, 0.0f, -14.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, -13.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[26].func_78793_a(24.0f, -145.0f, -21.5f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo(this, 641, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo(this, 721, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo(this, 801, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo(this, 881, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo(this, 473, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo(this, 553, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo(this, 633, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo(this, 713, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo(this, 793, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].func_78793_a(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[1].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].func_78793_a(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[2].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].func_78793_a(-4.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[3].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].func_78793_a(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[4].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].func_78793_a(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[5].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].func_78793_a(-55.01f, -4.0f, 30.0f);
        this.leftBackWheelModel[6].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[6].func_78793_a(45.99f, -4.0f, 30.0f);
        this.leftBackWheelModel[7].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[7].func_78793_a(45.99f, -4.0f, 30.0f);
        this.leftBackWheelModel[8].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[8].func_78793_a(45.99f, -4.0f, 30.0f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo(this, 561, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo(this, 641, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo(this, 721, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo(this, 801, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo(this, 881, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo(this, 945, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo(this, 561, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].func_78793_a(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[1].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].func_78793_a(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[2].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].func_78793_a(-55.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[3].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].func_78793_a(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[4].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].func_78793_a(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[5].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].func_78793_a(-4.01f, -4.0f, -39.0f);
        this.rightBackWheelModel[6].addShapeBox(-13.5f, 4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[6].func_78793_a(45.99f, -4.0f, -39.0f);
        this.rightBackWheelModel[7].addShapeBox(-13.5f, -13.5f, 0.0f, 27, 9, 9, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[7].func_78793_a(45.99f, -4.0f, -39.0f);
        this.rightBackWheelModel[8].addShapeBox(-13.5f, -4.5f, 0.0f, 27, 9, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[8].func_78793_a(45.99f, -4.0f, -39.0f);
    }
}
