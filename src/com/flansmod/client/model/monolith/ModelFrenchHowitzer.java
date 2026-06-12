// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelFrenchHowitzer extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelFrenchHowitzer() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[7];
        this.barrelModel = new ModelRendererTurbo[9];
        this.leftBackWheelModel = new ModelRendererTurbo[13];
        this.rightBackWheelModel = new ModelRendererTurbo[13];
        this.initbodyModel_1();
        this.initbarrelModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-33.0f, -2.0f, -3.0f, 42, 4, 6, 0.0f, 0.5f, -0.6f, -0.5f, 3.0f, -0.3f, 0.0f, 3.0f, -0.3f, 0.0f, 0.5f, -0.6f, -0.5f, -1.0f, -1.5f, -0.5f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -1.0f, -1.5f, -0.5f);
        this.bodyModel[0].func_78793_a(-8.0f, -4.9f, 0.0f);
        this.bodyModel[0].field_78808_h = 0.41887903f;
        this.bodyModel[1].addShapeBox(0.0f, -2.0f, -4.0f, 2, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-1.0f, -12.9f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 8.0f, -0.15f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 4.0f, 8.0f, -0.1f);
        this.bodyModel[2].func_78793_a(-3.5f, -14.5f, -3.0f);
        this.bodyModel[2].field_78808_h = -0.2443461f;
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 8.0f, -0.15f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 4.0f, 8.0f, -0.1f);
        this.bodyModel[3].func_78793_a(-3.5f, -14.5f, 1.95f);
        this.bodyModel[3].field_78808_h = -0.2443461f;
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 4.0f, 1.5f, -0.1f, 1.3f, 4.7f, 0.0f, 1.3f, 4.7f, 0.0f, 4.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].func_78793_a(-4.5f, -1.5f, -3.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f, 4.0f, 1.5f, 0.0f, 1.3f, 4.7f, 0.0f, 1.3f, 4.7f, 0.0f, 4.0f, 1.5f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(-4.5f, -1.5f, 2.0f);
        this.bodyModel[6].addShapeBox(-1.0f, -1.0f, 0.0f, 2, 2, 22, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(-2.5f, -0.5f, -11.0f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(3.0f, -1.0f, -1.0f, 22, 2, 2, 0.0f, 0.0f, 0.7f, 0.7f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.7f, 0.7f);
        this.barrelModel[0].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[1].addShapeBox(1.0f, -1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 1.0f, 1.0f);
        this.barrelModel[1].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[2].addShapeBox(-13.0f, -2.0f, -2.0f, 14, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[3].addShapeBox(-15.0f, -2.0f, -2.0f, 2, 4, 4, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.barrelModel[3].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[4].addShapeBox(-9.0f, -2.0f, -2.0f, 1, 4, 4, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.barrelModel[4].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[5].addShapeBox(25.0f, -1.0f, -1.0f, 1, 2, 2, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f);
        this.barrelModel[5].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[6].addShapeBox(-2.0f, -3.0f, -0.5f, 1, 1, 1, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.barrelModel[6].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[7].addShapeBox(0.5f, -3.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.barrelModel[7].func_78793_a(0.0f, -14.2f, 0.0f);
        this.barrelModel[8].addShapeBox(-2.0f, -4.0f, -0.5f, 3, 1, 1, 0.0f, -0.8f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.8f, -0.5f, 0.0f, -0.4f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.barrelModel[8].func_78793_a(0.0f, -14.2f, 0.0f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo(this, 1, 65, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo(this, 113, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo(this, 33, 65, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo(this, 65, 65, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo(this, 121, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo(this, 105, 57, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo(this, 121, 57, this.textureX, this.textureY);
        this.leftBackWheelModel[9] = new ModelRendererTurbo(this, 105, 65, this.textureX, this.textureY);
        this.leftBackWheelModel[10] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
        this.leftBackWheelModel[11] = new ModelRendererTurbo(this, 25, 73, this.textureX, this.textureY);
        this.leftBackWheelModel[12] = new ModelRendererTurbo(this, 41, 73, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-6.0f, -5.5f, 0.0f, 12, 1, 1, 0.0f, -0.2f, 0.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, -0.5f, -0.2f);
        this.leftBackWheelModel[0].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[1].addShapeBox(-0.5f, -7.0f, 0.0f, 1, 14, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.leftBackWheelModel[1].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[2].addShapeBox(-6.0f, -5.5f, 0.0f, 12, 1, 1, 0.0f, -0.2f, -10.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 10.3f, -0.2f);
        this.leftBackWheelModel[2].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[3].addShapeBox(-8.0f, -0.5f, 0.0f, 16, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.leftBackWheelModel[3].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[4].addShapeBox(7.0f, -4.0f, 0.0f, 2, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[5].addShapeBox(4.0f, -9.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[6].addShapeBox(-4.0f, -9.0f, 0.0f, 8, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[6].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[7].addShapeBox(-10.0f, -9.0f, 0.0f, 6, 2, 1, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f);
        this.leftBackWheelModel[7].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[8].addShapeBox(-9.0f, -4.0f, 0.0f, 2, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[8].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[9].addShapeBox(-10.0f, 7.0f, 0.0f, 6, 2, 1, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f);
        this.leftBackWheelModel[9].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[10].addShapeBox(-4.0f, 7.0f, 0.0f, 8, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[10].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[11].addShapeBox(4.0f, 7.0f, 0.0f, 6, 2, 1, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[11].func_78793_a(-2.5f, -0.5f, 9.0f);
        this.leftBackWheelModel[12].addShapeBox(-2.0f, -2.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[12].func_78793_a(-2.5f, -0.5f, 9.0f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo(this, 121, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo(this, 89, 33, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo(this, 89, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[9] = new ModelRendererTurbo(this, 105, 41, this.textureX, this.textureY);
        this.rightBackWheelModel[10] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.rightBackWheelModel[11] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
        this.rightBackWheelModel[12] = new ModelRendererTurbo(this, 73, 57, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-2.0f, -2.0f, 0.0f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[1].addShapeBox(-4.0f, 7.0f, 0.0f, 8, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[2].addShapeBox(-9.0f, -4.0f, 0.0f, 2, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[3].addShapeBox(7.0f, -4.0f, 0.0f, 2, 8, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[4].addShapeBox(-4.0f, -9.0f, 0.0f, 8, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[5].addShapeBox(4.0f, -9.0f, 0.0f, 6, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[6].addShapeBox(-10.0f, -9.0f, 0.0f, 6, 2, 1, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f);
        this.rightBackWheelModel[6].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[7].addShapeBox(-10.0f, 7.0f, 0.0f, 6, 2, 1, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f);
        this.rightBackWheelModel[7].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[8].addShapeBox(4.0f, 7.0f, 0.0f, 6, 2, 1, 0.0f, 1.0f, 0.0f, 0.0f, -3.0f, 4.0f, 0.0f, -3.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -5.0f, 0.0f, -1.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[8].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[9].addShapeBox(-0.5f, -7.0f, 0.0f, 1, 14, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.rightBackWheelModel[9].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[10].addShapeBox(-8.0f, -0.5f, 0.0f, 16, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.rightBackWheelModel[10].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[11].addShapeBox(-6.0f, -5.5f, 0.0f, 12, 1, 1, 0.0f, -0.2f, 0.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, -0.5f, -0.2f);
        this.rightBackWheelModel[11].func_78793_a(-2.5f, -0.5f, -10.0f);
        this.rightBackWheelModel[12].addShapeBox(-6.0f, -5.5f, 0.0f, 12, 1, 1, 0.0f, -0.2f, -10.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, -10.5f, -0.2f, -0.2f, 10.3f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 10.3f, -0.2f);
        this.rightBackWheelModel[12].func_78793_a(-2.5f, -0.5f, -10.0f);
    }
}
