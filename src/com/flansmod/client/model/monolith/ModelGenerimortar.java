// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelGenerimortar extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelGenerimortar() {
        this.textureX = 512;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[10];
        this.turretModel = new ModelRendererTurbo[10];
        this.barrelModel = new ModelRendererTurbo[17];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.bodyModel[0].func_78793_a(-3.5f, 8.0f, -2.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, -1.0f, 7, 1, 1, 0.0f, 0.0f, 1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, 1.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.bodyModel[1].func_78793_a(-3.5f, 8.0f, 2.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.4f, 0.0f, 3, 1, 10, 0.0f, 3.0f, -0.2f, 1.0f, 3.0f, -0.9f, 1.0f, 3.0f, -0.9f, 1.0f, 3.0f, -0.2f, 1.0f, 3.0f, -0.2f, 1.0f, 3.0f, 0.5f, 1.0f, 3.0f, 0.5f, 1.0f, 3.0f, -0.2f, 1.0f);
        this.bodyModel[2].func_78793_a(-1.5f, 6.9f, -5.0f);
        this.bodyModel[2].field_78808_h = -0.12217305f;
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.45f, 0.2f, 0.45f, 0.45f, -0.2f, 0.45f, 0.45f, -0.2f, 0.45f, 0.45f, 0.2f, 0.45f, 0.45f, -0.2f, 0.45f, 0.45f, 0.0f, 0.45f, 0.45f, 0.0f, 0.45f, 0.45f, -0.2f, 0.45f);
        this.bodyModel[3].func_78793_a(-0.5f, 7.0f, -0.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, -0.5f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f);
        this.bodyModel[4].func_78793_a(-1.35f, 6.85f, -2.3f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f);
        this.bodyModel[5].func_78793_a(-1.35f, 6.85f, 1.3f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f);
        this.bodyModel[6].func_78793_a(0.35f, 7.2f, 1.3f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, -0.5f, 0.45f, -0.4f, -0.5f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f, -0.4f, 0.0f, 0.45f);
        this.bodyModel[7].func_78793_a(0.35f, 7.2f, -2.3f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.45f, 0.0f, -0.4f, 0.45f, -0.9f, -0.4f, 0.45f, -0.9f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f);
        this.bodyModel[8].func_78793_a(1.35f, 7.2f, -0.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.45f, -0.2f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, -0.2f, -0.4f, 0.45f, -0.5f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, 0.0f, -0.4f, 0.45f, -0.5f, -0.4f);
        this.bodyModel[9].func_78793_a(-2.4f, 6.8f, -0.5f);
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo(this, 425, 1, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo(this, 457, 1, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo(this, 465, 1, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo(this, 473, 1, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo(this, 489, 1, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(-0.5f, -7.0f, -0.5f, 1, 8, 1, 0.0f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f);
        this.turretModel[0].func_78793_a(17.5f, -1.0f, 0.0f);
        this.turretModel[0].field_78808_h = 0.715585f;
        this.turretModel[1].addShapeBox(17.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, -0.15f, -0.1f, 0.15f, -0.15f, -0.1f, 0.15f, -0.15f, -0.1f, 0.15f, -0.15f, -0.1f, 0.15f, -0.15f, -0.1f, 0.4f, -0.15f, -0.1f, 0.4f, -0.15f, -0.1f, 0.4f, -0.15f, -0.1f, 0.4f);
        this.turretModel[1].func_78793_a(0.0f, -1.0f, 0.0f);
        this.turretModel[2].addShapeBox(17.0f, 0.5f, -0.2f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[2].func_78793_a(0.0f, -2.0f, 0.0f);
        this.turretModel[2].field_78795_f = 0.4712389f;
        this.turretModel[3].addShapeBox(17.0f, 0.5f, -0.8f, 1, 12, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.turretModel[3].func_78793_a(0.0f, -2.0f, 0.0f);
        this.turretModel[3].field_78795_f = -0.4712389f;
        this.turretModel[4].addShapeBox(-0.5f, 0.5f, -0.5f, 1, 1, 1, 0.0f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f, -0.15f, -0.25f, -0.15f);
        this.turretModel[4].func_78793_a(17.5f, -1.0f, 0.0f);
        this.turretModel[4].field_78808_h = 0.715585f;
        this.turretModel[5].addShapeBox(-0.5f, -2.5f, -0.5f, 1, 1, 1, 0.0f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f, -0.05f, 0.2f, -0.05f);
        this.turretModel[5].func_78793_a(17.5f, -1.0f, 0.0f);
        this.turretModel[5].field_78808_h = 0.715585f;
        this.turretModel[6].addShapeBox(-0.5f, -2.7f, -0.5f, 1, 1, 1, 0.0f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f, -0.1f, 0.2f, -0.1f);
        this.turretModel[6].func_78793_a(17.5f, -1.0f, 0.0f);
        this.turretModel[6].field_78808_h = 0.715585f;
        this.turretModel[7].addShapeBox(-0.5f, -2.85f, -0.5f, 1, 1, 1, 0.0f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f, -0.13f, 0.2f, -0.13f);
        this.turretModel[7].func_78793_a(17.5f, -1.0f, 0.0f);
        this.turretModel[7].field_78808_h = 0.715585f;
        this.turretModel[8].addShapeBox(17.0f, -8.5f, -6.2f, 1, 1, 1, 0.0f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f);
        this.turretModel[8].func_78793_a(0.0f, 16.8f, 0.0f);
        this.turretModel[9].addShapeBox(17.0f, 8.65f, 5.3f, 1, 1, 1, 0.0f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f, 0.15f, -0.3f, 0.15f);
        this.turretModel[9].func_78793_a(0.0f, -0.3f, 0.0f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo(this, 233, 1, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo(this, 345, 1, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo(this, 401, 1, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(0.2f, -0.7f, 0.0f, 1, 1, 1, 0.0f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f, 0.4f, -0.15f, -0.15f);
        this.barrelModel[0].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[0].field_78808_h = 0.7853982f;
        this.barrelModel[1].addShapeBox(1.9f, -0.75f, 0.0f, 1, 1, 1, 0.0f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f, 0.3f, -0.05f, 0.75f);
        this.barrelModel[1].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[1].field_78808_h = 0.7853982f;
        this.barrelModel[2].addShapeBox(1.9f, -1.6f, 0.0f, 1, 1, 1, 0.0f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f);
        this.barrelModel[2].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[2].field_78808_h = 0.7853982f;
        this.barrelModel[3].addShapeBox(1.9f, 0.1f, 0.0f, 1, 1, 1, 0.0f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f, 0.3f, -0.1f, 0.75f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f, 0.3f, -0.15f, 0.1f);
        this.barrelModel[3].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[3].field_78808_h = 0.7853982f;
        this.barrelModel[4].addShapeBox(2.9f, -0.75f, 0.0f, 24, 1, 1, 0.0f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f, 0.3f, -0.05f, 0.65f);
        this.barrelModel[4].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[4].field_78808_h = 0.7853982f;
        this.barrelModel[5].addShapeBox(2.9f, -1.6f, 0.0f, 24, 1, 1, 0.0f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f);
        this.barrelModel[5].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[5].field_78808_h = 0.7853982f;
        this.barrelModel[6].addShapeBox(2.9f, 0.1f, 0.0f, 24, 1, 1, 0.0f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f, 0.3f, -0.1f, 0.65f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f, 0.3f, -0.25f, 0.05f);
        this.barrelModel[6].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[6].field_78808_h = 0.7853982f;
        this.barrelModel[7].addShapeBox(15.9f, -0.6f, 0.0f, 1, 1, 1, 0.0f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f, 0.2f, -0.05f, 0.75f);
        this.barrelModel[7].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[7].field_78808_h = 0.7853982f;
        this.barrelModel[8].addShapeBox(15.9f, -0.45f, 0.0f, 1, 1, 1, 0.0f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f);
        this.barrelModel[8].func_78793_a(0.0f, 6.0f, -0.5f);
        this.barrelModel[8].field_78808_h = 0.7853982f;
        this.barrelModel[9].addShapeBox(15.9f, 0.25f, 0.0f, 1, 1, 1, 0.0f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f, 0.2f, -0.1f, 0.75f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f, 0.2f, -0.15f, 0.1f);
        this.barrelModel[9].func_78793_a(0.0f, 7.0f, -0.5f);
        this.barrelModel[9].field_78808_h = 0.7853982f;
        this.barrelModel[10].addShapeBox(14.0f, 0.65f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f);
        this.barrelModel[10].func_78793_a(0.0f, 7.0f, 0.2f);
        this.barrelModel[10].field_78808_h = 0.7853982f;
        this.barrelModel[11].addShapeBox(14.0f, 0.65f, 0.0f, 5, 1, 1, 0.0f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f);
        this.barrelModel[11].func_78793_a(0.0f, 7.0f, -1.0f);
        this.barrelModel[11].field_78808_h = 0.7853982f;
        this.barrelModel[12].addShapeBox(18.05f, 0.6f, 0.0f, 1, 1, 3, 0.0f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.25f, 0.1f, 0.0f, -0.25f, 0.1f, 0.0f, -0.25f, 0.1f, 0.0f, -0.25f, 0.1f);
        this.barrelModel[12].func_78793_a(0.0f, 7.0f, -1.5f);
        this.barrelModel[12].field_78808_h = 0.7853982f;
        this.barrelModel[13].addShapeBox(18.05f, 1.1f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f);
        this.barrelModel[13].func_78793_a(0.0f, 7.0f, -1.8f);
        this.barrelModel[13].field_78808_h = 0.7853982f;
        this.barrelModel[14].addShapeBox(18.05f, 1.1f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f, 0.0f, -0.05f, -0.2f);
        this.barrelModel[14].func_78793_a(0.0f, 7.0f, 0.8f);
        this.barrelModel[14].field_78808_h = 0.7853982f;
        this.barrelModel[15].addShapeBox(18.3f, 1.25f, 0.0f, 1, 1, 4, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.barrelModel[15].func_78793_a(0.0f, 7.0f, -1.5f);
        this.barrelModel[15].field_78808_h = 0.7853982f;
        this.barrelModel[16].addShapeBox(18.3f, 1.25f, 0.0f, 1, 1, 1, 0.0f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f, -0.1f, -0.1f, -0.4f);
        this.barrelModel[16].func_78793_a(0.0f, 7.0f, 2.0f);
        this.barrelModel[16].field_78808_h = 0.7853982f;
    }
}
