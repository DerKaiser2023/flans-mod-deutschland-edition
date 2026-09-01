// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelDelfino extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelDelfino() {
        this.textureX = 512;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[33];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 273, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 337, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 217, 9, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 233, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 465, 9, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 481, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 489, 9, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(2.0f, 2.5f, -1.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(2.0f, 2.5f, -4.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[2].func_78793_a(2.0f, 2.5f, 1.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[3].func_78793_a(7.0f, 2.5f, 1.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[4].func_78793_a(7.0f, 2.5f, -1.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[5].func_78793_a(7.0f, 2.5f, -4.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[6].func_78793_a(14.0f, 2.5f, 1.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[7].func_78793_a(14.0f, 2.5f, -1.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[8].func_78793_a(14.0f, 2.5f, -4.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(21.0f, 5.0f, -1.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[10].func_78793_a(22.5f, 5.0f, -1.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f);
        this.bodyModel[11].func_78793_a(-5.0f, 2.5f, 1.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[12].func_78793_a(-5.0f, 2.5f, -1.5f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 8, 3, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -2.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[13].func_78793_a(-5.0f, 2.5f, -4.5f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.5f, -0.5f, 0.0f, -3.0f, -1.0f);
        this.bodyModel[14].func_78793_a(-9.0f, 2.5f, 1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[15].func_78793_a(-9.0f, 2.5f, -1.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 4, 8, 3, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -2.5f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.bodyModel[16].func_78793_a(-9.0f, 2.5f, -4.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.5f, -2.99f);
        this.bodyModel[17].func_78793_a(-19.0f, 2.5f, 1.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -3.5f, -2.99f, 0.0f, -3.0f, -1.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[18].func_78793_a(-19.0f, 2.5f, -4.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 3, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.bodyModel[19].func_78793_a(-19.0f, 2.5f, -1.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.3f, -0.3f);
        this.bodyModel[20].func_78793_a(-20.0f, 5.0f, -1.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.5f, -1.0f, -1.0f);
        this.bodyModel[21].func_78793_a(-22.5f, 5.0f, -1.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f);
        this.bodyModel[22].func_78793_a(-1.0f, 0.5f, -1.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f);
        this.bodyModel[23].func_78793_a(-22.5f, 4.5f, -0.5f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, -1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[24].func_78793_a(-22.5f, 6.5f, -0.5f);
        this.bodyModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[25].func_78793_a(-24.0f, 4.0f, -0.5f);
        this.bodyModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.bodyModel[26].func_78793_a(-24.5f, 4.0f, -0.5f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 1.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.5f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.bodyModel[27].func_78793_a(-24.0f, 8.0f, -0.5f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 1.0f, 0.0f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.bodyModel[28].func_78793_a(16.5f, 8.5f, -0.5f);
        this.bodyModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.4f);
        this.bodyModel[29].func_78793_a(-23.0f, 6.0f, -0.5f);
        this.bodyModel[30].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[30].func_78793_a(-23.0f, 6.5f, 0.0f);
        this.bodyModel[31].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[31].func_78793_a(-23.0f, 6.5f, 0.0f);
        this.bodyModel[31].field_78795_f = 2.3561945f;
        this.bodyModel[32].addShapeBox(0.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f, -0.25f, 0.0f, -0.2f);
        this.bodyModel[32].func_78793_a(-23.0f, 6.5f, 0.0f);
        this.bodyModel[32].field_78795_f = -2.3561945f;
    }
}
