// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelLadder extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelLadder() {
        this.textureX = 32;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[18];
        this.initbodyModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 141, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[0].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[0].field_78808_h = -0.08726646f;
        this.bodyModel[1].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 141, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.bodyModel[1].func_78793_a(5.0f, -130.0f, 8.0f);
        this.bodyModel[1].field_78808_h = -0.08726646f;
        this.bodyModel[2].addShapeBox(-0.5f, 8.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[2].field_78808_h = -0.08726646f;
        this.bodyModel[3].addShapeBox(-0.5f, 16.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[3].field_78808_h = -0.08726646f;
        this.bodyModel[4].addShapeBox(-0.5f, 24.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[4].field_78808_h = -0.08726646f;
        this.bodyModel[5].addShapeBox(-0.5f, 32.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[5].field_78808_h = -0.08726646f;
        this.bodyModel[6].addShapeBox(-0.5f, 40.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[6].field_78808_h = -0.08726646f;
        this.bodyModel[7].addShapeBox(-0.5f, 48.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[7].field_78808_h = -0.08726646f;
        this.bodyModel[8].addShapeBox(-0.5f, 56.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[8].field_78808_h = -0.08726646f;
        this.bodyModel[9].addShapeBox(-0.5f, 64.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[9].field_78808_h = -0.08726646f;
        this.bodyModel[10].addShapeBox(-0.5f, 72.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[10].field_78808_h = -0.08726646f;
        this.bodyModel[11].addShapeBox(-0.5f, 80.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[11].field_78808_h = -0.08726646f;
        this.bodyModel[12].addShapeBox(-0.5f, 88.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[12].field_78808_h = -0.08726646f;
        this.bodyModel[13].addShapeBox(-0.5f, 96.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[13].field_78808_h = -0.08726646f;
        this.bodyModel[14].addShapeBox(-0.5f, 104.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[14].field_78808_h = -0.08726646f;
        this.bodyModel[15].addShapeBox(-0.5f, 112.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[15].field_78808_h = -0.08726646f;
        this.bodyModel[16].addShapeBox(-0.5f, 120.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[16].field_78808_h = -0.08726646f;
        this.bodyModel[17].addShapeBox(-0.5f, 128.0f, 0.5f, 1, 1, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].func_78793_a(5.0f, -130.0f, -8.0f);
        this.bodyModel[17].field_78808_h = -0.08726646f;
    }
}
