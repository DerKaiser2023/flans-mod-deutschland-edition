// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelCarnyx extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelCarnyx() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[20];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 17, 49, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 33, 49, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, 40.0f, 0.0f, 0.0f, 40.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -65.0f, 3.0f);
        this.gunModel[1].addShapeBox(-1.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(1.0f, -7.0f, 3.0f);
        this.gunModel[1].field_78808_h = -0.27925268f;
        this.gunModel[2].addShapeBox(-1.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(0.5f, -5.0f, 3.0f);
        this.gunModel[2].field_78808_h = -0.89011794f;
        this.gunModel[3].addShapeBox(-1.0f, 3.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.gunModel[3].func_78793_a(0.5f, -5.0f, 3.0f);
        this.gunModel[3].field_78808_h = -0.89011794f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(-1.0f, -10.0f, 2.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(-1.0f, -26.0f, 2.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78793_a(-1.0f, -46.0f, 2.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(-1.0f, -64.0f, 2.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 1, 0.0f, 0.2f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(0.0f, -71.0f, 3.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.5f, 0.0f, 0.8f, 2.0f, -1.0f, 0.8f, 2.0f, -1.0f, 0.8f, -0.5f, 0.0f, 0.8f, 0.2f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f);
        this.gunModel[9].func_78793_a(0.0f, -74.0f, 3.0f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, -1.0f, -0.5f, 0.3f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, 0.3f, -1.0f, -0.5f, 0.3f, 0.0f, 0.0f, 0.3f, -0.5f, 1.0f, 0.3f, -0.5f, 1.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.gunModel[10].func_78793_a(0.5f, -76.01f, 2.5f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 2, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.gunModel[11].func_78793_a(3.0f, -76.01f, 2.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 7, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[12].func_78793_a(6.0f, -77.5f, 1.0f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 7, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, -2.0f, -1.0f, -0.8f, 0.0f, 0.0f);
        this.gunModel[13].func_78793_a(13.0f, -77.5f, 1.0f);
        this.gunModel[13].field_78808_h = -0.2268928f;
        this.gunModel[14].addShapeBox(0.0f, -1.0f, 0.0f, 6, 2, 5, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.7f, -1.5f, 0.0f, -0.7f, -1.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, -1.0f, -0.5f, -1.5f, -1.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[14].func_78793_a(13.0f, -73.5f, 1.0f);
        this.gunModel[14].field_78808_h = -0.19198622f;
        this.gunModel[15].addShapeBox(0.0f, -5.0f, 0.0f, 2, 6, 3, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[15].func_78793_a(7.0f, -76.5f, 0.5f);
        this.gunModel[16].addShapeBox(0.0f, -5.0f, 0.0f, 2, 6, 3, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[16].func_78793_a(7.0f, -76.5f, 3.5f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 6, 6, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[17].func_78793_a(1.0f, -80.01f, 3.0f);
        this.gunModel[17].field_78808_h = 0.27925268f;
        this.gunModel[18].addShapeBox(-6.0f, 0.0f, 0.0f, 6, 4, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.gunModel[18].func_78793_a(1.0f, -80.01f, 3.0f);
        this.gunModel[18].field_78808_h = 0.9250245f;
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 3, 10, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.gunModel[19].func_78793_a(-2.6f, -75.3f, 3.0f);
        this.gunModel[19].field_78808_h = 0.08726646f;
    }
}
