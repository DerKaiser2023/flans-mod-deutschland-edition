// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelRam extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelRam() {
        this.textureX = 256;
        this.textureY = 256;
        this.bodyModel = new ModelRendererTurbo[23];
        this.bodyDoorOpenModel = new ModelRendererTurbo[3];
        this.bodyDoorCloseModel = new ModelRendererTurbo[3];
        this.leftBackWheelModel = new ModelRendererTurbo[9];
        this.rightBackWheelModel = new ModelRendererTurbo[9];
        this.initbodyModel_1();
        this.initbodyDoorOpenModel_1();
        this.initbodyDoorCloseModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 97, 41, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 145, 41, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 161, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 177, 41, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 193, 41, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 209, 41, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 225, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 241, 41, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 1, 145, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 1, 193, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 217, 73, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 233, 73, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 217, 105, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 1, 241, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 193, 137, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 177, 169, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 177, 201, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 80, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-40.0f, 3.5f, -13.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 80, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-40.0f, 3.5f, 8.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].func_78793_a(-40.0f, 3.5f, -8.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(36.0f, 3.5f, -8.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].func_78793_a(-39.0f, -20.0f, -12.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(-14.0f, -20.0f, -12.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].func_78793_a(11.0f, -20.0f, -12.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].func_78793_a(36.0f, -20.0f, -12.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(-39.0f, -20.0f, 9.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(-14.0f, -20.0f, 9.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(11.0f, -20.0f, 9.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(36.0f, -20.0f, 9.5f);
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, -1.5f, 84, 41, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].func_78793_a(-42.0f, -44.5f, 0.0f);
        this.bodyModel[12].field_78795_f = -0.4886922f;
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, -1.5f, 84, 41, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(-42.0f, -44.5f, 0.0f);
        this.bodyModel[13].field_78795_f = 0.4886922f;
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(-39.0f, -43.0f, -1.5f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].func_78793_a(-14.0f, -43.0f, -1.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].func_78793_a(11.0f, -43.0f, -1.5f);
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 3, 24, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].func_78793_a(36.0f, -43.0f, -1.5f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 80, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].func_78793_a(-40.0f, -22.0f, -1.5f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].func_78793_a(36.0f, -23.0f, -12.5f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].func_78793_a(11.0f, -23.0f, -12.5f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].func_78793_a(-14.0f, -23.0f, -12.5f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].func_78793_a(-40.0f, -23.0f, -12.5f);
    }
    
    private void initbodyDoorOpenModel_1() {
        this.bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
        this.bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
        this.bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
        this.bodyDoorOpenModel[0].addShapeBox(0.0f, -10.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[0].func_78793_a(-33.0f, -7.5f, -7.5f);
        this.bodyDoorOpenModel[1].addShapeBox(0.0f, -10.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyDoorOpenModel[1].func_78793_a(-33.0f, 2.5f, -7.5f);
        this.bodyDoorOpenModel[2].addShapeBox(0.0f, -5.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorOpenModel[2].func_78793_a(-33.0f, -7.5f, -7.5f);
    }
    
    private void initbodyDoorCloseModel_1() {
        this.bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1, 97, this.textureX, this.textureY);
        this.bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 1, 121, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[0].func_78793_a(-45.0f, -7.5f, -7.5f);
        this.bodyDoorCloseModel[1].addShapeBox(0.0f, -5.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyDoorCloseModel[1].func_78793_a(-45.0f, -7.5f, -7.5f);
        this.bodyDoorCloseModel[2].addShapeBox(0.0f, -5.0f, 0.0f, 90, 5, 15, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.bodyDoorCloseModel[2].func_78793_a(-45.0f, 2.5f, -7.5f);
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo(this, 129, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo(this, 161, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo(this, 193, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[6] = new ModelRendererTurbo(this, 225, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[7] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[8] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].func_78793_a(36.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[1].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].func_78793_a(36.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].func_78793_a(36.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[3].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].func_78793_a(0.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].func_78793_a(0.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[5].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].func_78793_a(0.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[6].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[6].func_78793_a(-36.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[7].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[7].func_78793_a(-36.0f, 5.5f, 13.5f);
        this.leftBackWheelModel[8].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[8].func_78793_a(-36.0f, 5.5f, 13.5f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo(this, 169, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo(this, 201, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo(this, 177, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo(this, 209, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[6] = new ModelRendererTurbo(this, 169, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[7] = new ModelRendererTurbo(this, 201, 25, this.textureX, this.textureY);
        this.rightBackWheelModel[8] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].func_78793_a(-36.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[1].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].func_78793_a(-36.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].func_78793_a(-36.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[3].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].func_78793_a(0.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].func_78793_a(0.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[5].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].func_78793_a(0.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[6].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[6].func_78793_a(36.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[7].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[7].func_78793_a(36.0f, 5.5f, -17.5f);
        this.rightBackWheelModel[8].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[8].func_78793_a(36.0f, 5.5f, -17.5f);
    }
}
