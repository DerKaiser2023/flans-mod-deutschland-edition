// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelDvina extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelDvina() {
        this.textureX = 512;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[4];
        this.turretModel = new ModelRendererTurbo[9];
        this.barrelModel = new ModelRendererTurbo[13];
        this.initbodyModel_1();
        this.initturretModel_1();
        this.initbarrelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo(this, 409, 57, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 265, 81, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 1, 137, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 97, 169, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 24, 18, 24, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].func_78793_a(-12.0f, -2.0f, -12.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 10, 10, 75, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].func_78793_a(-5.0f, 6.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 10, 10, 75, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].func_78793_a(-5.0f, 6.0f, -75.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 140, 10, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(-70.0f, 6.0f, -6.0f);
    }
    
    private void initturretModel_1() {
        this.turretModel[0] = new ModelRendererTurbo(this, 177, 193, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo(this, 1, 233, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo(this, 201, 233, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo(this, 1, 273, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo(this, 1, 329, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo(this, 225, 289, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo(this, 489, 33, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo(this, 361, 81, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo(this, 193, 81, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 90, 30, 6, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[0].func_78793_a(-40.0f, -30.0f, -12.0f);
        this.turretModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 90, 30, 6, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[1].func_78793_a(-40.0f, -30.0f, 6.0f);
        this.turretModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 90, 30, 18, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.turretModel[2].func_78793_a(-40.0f, -30.0f, -30.0f);
        this.turretModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 90, 30, 18, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, -18.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.turretModel[3].func_78793_a(-40.0f, -30.0f, 12.0f);
        this.turretModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 142, 4, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[4].func_78793_a(-93.0f, -4.0f, -9.0f);
        this.turretModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 72, 4, 24, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f);
        this.turretModel[5].func_78793_a(-160.0f, -31.0f, -12.0f);
        this.turretModel[5].field_78808_h = -0.36651915f;
        this.turretModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 41, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[6].func_78793_a(-145.0f, -21.0f, -2.0f);
        this.turretModel[6].field_78808_h = 0.34906584f;
        this.turretModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 32, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[7].func_78793_a(-118.0f, -14.0f, -2.0f);
        this.turretModel[7].field_78808_h = -0.34906584f;
        this.turretModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 18, 4, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[8].func_78793_a(-139.0f, 13.0f, -8.0f);
    }
    
    private void initbarrelModel_1() {
        this.barrelModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo(this, 441, 1, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo(this, 137, 33, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo(this, 241, 33, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo(this, 345, 33, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo(this, 137, 57, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo(this, 241, 57, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo(this, 337, 57, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo(this, 1, 73, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo(this, 97, 81, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo(this, 1, 105, this.textureX, this.textureY);
        this.barrelModel[0].addShapeBox(32.0f, -22.0f, -6.0f, 166, 12, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[0].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[1].addShapeBox(198.0f, -22.0f, -6.0f, 24, 12, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -5.0f, 0.0f, -5.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -5.0f, 0.0f, -5.0f, -5.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[1].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[2].addShapeBox(2.0f, -24.0f, -8.0f, 50, 16, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[3].addShapeBox(-16.0f, -22.0f, -6.0f, 18, 12, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[3].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[4].addShapeBox(-14.0f, -43.5f, -28.0f, 50, 20, 1, 0.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f);
        this.barrelModel[4].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[5].addShapeBox(-14.0f, -43.5f, 27.0f, 50, 20, 1, 0.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f);
        this.barrelModel[5].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[6].addShapeBox(-14.0f, -8.5f, 27.0f, 50, 20, 1, 0.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[6].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[7].addShapeBox(-14.0f, -8.5f, -28.0f, 50, 20, 1, 0.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, -20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 20.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[7].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[8].addShapeBox(96.0f, -10.5f, -22.0f, 44, 16, 1, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[8].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[9].addShapeBox(96.0f, -37.5f, -22.0f, 44, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f);
        this.barrelModel[9].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[10].addShapeBox(96.0f, -37.5f, 21.0f, 44, 16, 1, 0.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f);
        this.barrelModel[10].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[11].addShapeBox(96.0f, -10.5f, 21.0f, 44, 16, 1, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, -35.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[11].func_78793_a(-54.0f, -30.0f, 0.0f);
        this.barrelModel[12].addShapeBox(-9.0f, -8.0f, -6.0f, 156, 17, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[12].func_78793_a(-54.0f, -30.0f, 0.0f);
    }
}
