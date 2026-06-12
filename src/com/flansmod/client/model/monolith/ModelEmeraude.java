// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelEmeraude extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelEmeraude() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[32];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 81, 65, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 81, 73, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 49, 81, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 89, 81, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 57, 89, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 89, 89, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 113, 65, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 139, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 139, 0, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-11.0f, 8.0f, -4.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 35, 4, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-11.0f, 10.0f, -4.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 35, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[2].func_78793_a(-11.0f, 14.0f, -4.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 19, 3, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[3].func_78793_a(24.0f, 8.0f, -4.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f, -7.0f, -0.5f, -3.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[4].func_78793_a(24.0f, 14.0f, -4.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 11, 4, 8, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2.0f, 8.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(24.0f, 10.0f, -4.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 32, 3, 8, 0.0f, 0.0f, 0.0f, -3.5f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -3.5f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -2.0f);
        this.bodyModel[6].func_78793_a(-43.0f, 8.0f, -4.0f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 24, 4, 8, 0.0f, 8.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8.0f, 0.0f, -2.0f, -6.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -2.0f);
        this.bodyModel[7].func_78793_a(-35.0f, 10.0f, -4.0f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 18, 2, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -7.0f, -0.5f, -3.0f);
        this.bodyModel[8].func_78793_a(-29.0f, 14.0f, -4.0f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(-7.0f, 4.0f, -1.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(-7.0f, 6.0f, -1.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 4, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bodyModel[11].func_78793_a(-10.0f, 4.0f, -1.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 3, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f);
        this.bodyModel[12].func_78793_a(-8.0f, 3.2f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f);
        this.bodyModel[13].func_78793_a(-15.0f, 3.2f, -1.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, 0.2f);
        this.bodyModel[14].func_78793_a(5.0f, 3.2f, -1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].func_78793_a(-40.0f, 12.0f, -0.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.bodyModel[16].func_78793_a(-34.8f, 11.2f, -0.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 16, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f);
        this.bodyModel[17].func_78793_a(-34.8f, 15.0f, -0.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[18].func_78793_a(-42.0f, 13.0f, -1.7f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 14, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[19].func_78793_a(-42.0f, 13.0f, 0.7f);
        this.bodyModel[20].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[20].func_78793_a(-42.0f, 13.5f, -1.2f);
        this.bodyModel[21].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[21].func_78793_a(-42.0f, 13.5f, -1.2f);
        this.bodyModel[21].field_78795_f = 2.0943952f;
        this.bodyModel[22].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[22].func_78793_a(-42.0f, 13.5f, -1.2f);
        this.bodyModel[22].field_78795_f = 4.1887903f;
        this.bodyModel[23].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[23].func_78793_a(-42.0f, 13.5f, 1.2f);
        this.bodyModel[23].field_78795_f = 4.1887903f;
        this.bodyModel[24].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[24].func_78793_a(-42.0f, 13.5f, 1.2f);
        this.bodyModel[24].field_78795_f = 2.0943952f;
        this.bodyModel[25].addShapeBox(0.0f, -0.5f, -0.5f, 1, 2, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f);
        this.bodyModel[25].func_78793_a(-42.0f, 13.5f, 1.2f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[26].func_78793_a(8.0f, 3.2f, 0.3f);
        this.bodyModel[26].field_78808_h = -0.36651915f;
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[27].func_78793_a(-13.5f, 3.2f, 0.3f);
        this.bodyModel[27].field_78808_h = -1.5707964f;
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[28].func_78793_a(-13.5f, 3.2f, -1.3f);
        this.bodyModel[28].field_78808_h = -1.5707964f;
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 13, 1, 1, 0.0f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.bodyModel[29].func_78793_a(8.0f, 3.2f, -1.3f);
        this.bodyModel[29].field_78808_h = -0.36651915f;
        this.bodyModel[30].addShapeBox(0.0f, 0.0f, -1.0f, 54, 90, 1, 0.0f, 0.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, 0.0f, -85.0f, 0.0f);
        this.bodyModel[30].func_78793_a(-5.0f, 7.2f, 1.55f);
        this.bodyModel[30].field_78808_h = 1.5707964f;
        this.bodyModel[31].addShapeBox(0.0f, 0.0f, -1.0f, 54, 90, 1, 0.0f, 0.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, -51.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, -51.0f, -85.0f, 0.0f, 0.0f, -85.0f, 0.0f);
        this.bodyModel[31].func_78793_a(0.0f, 7.2f, -1.55f);
        this.bodyModel[31].field_78796_g = -3.1415927f;
        this.bodyModel[31].field_78808_h = 1.5707964f;
    }
}
