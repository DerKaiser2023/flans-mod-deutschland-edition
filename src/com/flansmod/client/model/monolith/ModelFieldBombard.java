// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelFieldBombard extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelFieldBombard() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[14];
        this.barrelModel = new ModelRendererTurbo[13];
        this.leftBackWheelModel = new ModelRendererTurbo[6];
        this.rightBackWheelModel = new ModelRendererTurbo[6];
        this.initbodyModel_1();
        this.initbarrelModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 121, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 153, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 185, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 201, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 217, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 225, 73, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 74, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-55.5f, 5.5f, -13.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 74, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-55.5f, 5.5f, 8.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].func_78793_a(-50.5f, 5.5f, -8.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(12.5f, 5.5f, -8.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 16, 3, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[4].func_78793_a(-2.5f, -10.0f, -12.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 5, 16, 3, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.bodyModel[5].func_78793_a(-2.5f, -10.0f, 9.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 25, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f);
        this.bodyModel[6].func_78793_a(-40.5f, 5.5f, -12.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 18, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(-2.5f, -4.0f, 9.5f);
        this.bodyModel[7].field_78808_h = 0.7853982f;
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 18, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(-2.5f, -4.0f, -12.5f);
        this.bodyModel[8].field_78808_h = 0.7853982f;
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 18, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(-0.5f, -7.0f, 9.5f);
        this.bodyModel[9].field_78808_h = -0.7853982f;
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 18, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(-0.5f, -7.0f, -12.5f);
        this.bodyModel[10].field_78808_h = -0.7853982f;
        this.bodyModel[11].addShapeBox(-42.0f, -6.0f, -4.0f, 3, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(0.0f, -7.5f, 0.0f);
        this.bodyModel[11].field_78808_h = 0.29670596f;
        this.bodyModel[12].addShapeBox(-42.0f, -6.0f, -4.0f, 3, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].func_78793_a(0.0f, -7.5f, 0.0f);
        this.bodyModel[12].field_78808_h = 0.10471976f;
        this.bodyModel[13].addShapeBox(-42.0f, -6.0f, -4.0f, 3, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, -7.5f, 0.0f);
        this.bodyModel[13].field_78808_h = -0.08726646f;
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo(this, 41, 65, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo(this, 121, 65, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo(this, 153, 73, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo(this, 1, 81, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo(this, 73, 81, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo(this, 129, 89, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo(this, 153, 97, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo(this, 57, 105, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo(this, 193, 97, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo(this, 201, 73, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(-11.0f, -2.0f, 6.0f, 17, 6, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[0].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[1].addShapeBox(-46.0f, -2.0f, 5.0f, 35, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[1].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[2].addShapeBox(-46.0f, -2.0f, -9.0f, 35, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[3].addShapeBox(-11.0f, -2.0f, -9.0f, 17, 6, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f);
        this.barrelModel[3].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[4].addShapeBox(-10.0f, -5.0f, -6.0f, 20, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[4].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[5].addShapeBox(-10.0f, -9.0f, -6.0f, 20, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[5].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[6].addShapeBox(-10.0f, -1.0f, -6.0f, 20, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.barrelModel[6].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[7].addShapeBox(-45.0f, -1.5f, -6.0f, 2, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[8].addShapeBox(-25.0f, -4.5f, -4.5f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[9].addShapeBox(-25.0f, -1.5f, -4.5f, 15, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.barrelModel[9].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[10].addShapeBox(-25.0f, -7.5f, -4.5f, 15, 3, 9, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[10].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[11].addShapeBox(-29.0f, -4.0f, -8.0f, 4, 2, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[11].func_78793_a(0.0f, -7.5f, 0.0f);
        this.barrelModel[12].addShapeBox(-41.2f, -0.5f, -9.5f, 1, 1, 19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[12].func_78793_a(0.0f, -7.5f, 0.0f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo(this, 161, 17, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo(this, 193, 17, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo(this, 225, 17, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo(this, 161, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo(this, 193, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo(this, 225, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].func_78793_a(0.0f, 7.5f, 13.5f);
        this.leftBackWheelModel[1].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].func_78793_a(0.0f, 7.5f, 13.5f);
        this.leftBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].func_78793_a(0.0f, 7.5f, 13.5f);
        this.leftBackWheelModel[3].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].func_78793_a(-48.5f, 7.5f, 13.5f);
        this.leftBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].func_78793_a(-48.5f, 7.5f, 13.5f);
        this.leftBackWheelModel[5].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].func_78793_a(-48.5f, 7.5f, 13.5f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo(this, 161, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo(this, 193, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo(this, 225, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].func_78793_a(-48.5f, 7.5f, -17.5f);
        this.rightBackWheelModel[1].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].func_78793_a(-48.5f, 7.5f, -17.5f);
        this.rightBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].func_78793_a(-48.5f, 7.5f, -17.5f);
        this.rightBackWheelModel[3].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].func_78793_a(0.0f, 7.5f, -17.5f);
        this.rightBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].func_78793_a(0.0f, 7.5f, -17.5f);
        this.rightBackWheelModel[5].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].func_78793_a(0.0f, 7.5f, -17.5f);
    }
}
