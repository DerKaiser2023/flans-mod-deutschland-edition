// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelKalkan extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelKalkan() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[20];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 10, 0, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 10, 16, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 20, 8, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 20, 16, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 16, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 10, 8, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(1.0f, -6.0f, -6.0f, 1, 4, 4, 0.0f, 0.0f, -1.8f, -1.8f, 0.0f, -1.8f, -1.8f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.91f);
        this.gunModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(1.0f, -6.0f, -1.09f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.18f, 0.0f, 0.0f, 0.18f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.18f, 0.0f, 0.91f, 0.18f);
        this.gunModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[2].addShapeBox(1.0f, 4.0f, -1.09f, 1, 4, 4, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.18f, 0.0f, 0.91f, 0.18f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.18f, 0.0f, 0.0f, 0.18f);
        this.gunModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(1.0f, -1.09f, -6.0f, 1, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.18f, 0.0f, 0.0f, 0.18f, 0.0f, 0.0f, 0.18f, 0.0f, 0.0f, 0.18f, 0.0f);
        this.gunModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[4].addShapeBox(1.0f, -6.0f, 4.0f, 1, 4, 4, 0.0f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, -1.8f, -1.8f, 0.0f, -1.8f, -1.8f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f);
        this.gunModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[5].addShapeBox(1.0f, 4.0f, 4.0f, 1, 4, 4, 0.0f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, -1.8f, -1.8f, 0.0f, -1.8f, -1.8f);
        this.gunModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[6].addShapeBox(1.0f, 4.0f, -6.0f, 1, 4, 4, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f, 0.91f, 0.0f, 0.91f, 0.91f, 0.0f, -1.8f, -1.8f, 0.0f, -1.8f, -1.8f, 0.0f, 0.0f, 0.91f, 0.0f, 0.0f, 0.91f);
        this.gunModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[7].addShapeBox(2.05f, -6.0f, -1.09f, 1, 4, 4, 0.0f, 0.2f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.18f, 0.2f, -1.0f, 0.18f, 0.2f, 0.91f, 0.0f, 0.2f, 0.91f, 0.0f, 0.2f, 0.91f, 0.18f, 0.2f, 0.91f, 0.18f);
        this.gunModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[8].addShapeBox(2.05f, 4.0f, -1.09f, 1, 4, 4, 0.0f, 0.2f, 0.91f, 0.0f, 0.2f, 0.91f, 0.0f, 0.2f, 0.91f, 0.18f, 0.2f, 0.91f, 0.18f, 0.2f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.18f, 0.2f, -1.0f, 0.18f);
        this.gunModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[9].addShapeBox(2.05f, -1.09f, 3.0f, 1, 4, 4, 0.0f, 0.2f, 0.0f, -0.09f, 0.2f, 0.0f, -0.09f, -1.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.18f, -0.09f, 0.2f, 0.18f, -0.09f, -1.0f, 0.18f, 0.0f, 0.2f, 0.18f, 0.0f);
        this.gunModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[10].addShapeBox(2.05f, -6.0f, 4.0f, 1, 4, 4, 0.0f, 0.2f, -1.0f, 0.91f, -1.0f, -1.0f, 0.91f, -1.0f, -2.35f, -2.35f, 0.2f, -2.35f, -2.35f, 0.2f, 0.91f, 0.91f, 0.2f, 0.91f, 0.91f, -1.0f, 0.91f, -1.0f, 0.2f, 0.91f, -1.0f);
        this.gunModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[11].addShapeBox(2.05f, 4.0f, 4.0f, 1, 4, 4, 0.0f, 0.2f, 0.91f, 0.91f, 0.2f, 0.91f, 0.91f, -1.0f, 0.91f, -1.0f, 0.2f, 0.91f, -1.0f, 0.2f, -1.0f, 0.91f, -1.0f, -1.0f, 0.91f, -1.0f, -2.35f, -2.35f, 0.2f, -2.35f, -2.35f);
        this.gunModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[12].addShapeBox(2.05f, 4.0f, -6.0f, 1, 4, 4, 0.0f, 0.2f, 0.91f, -1.0f, -1.0f, 0.91f, -1.0f, 0.2f, 0.91f, 0.91f, 0.2f, 0.91f, 0.91f, 0.2f, -2.35f, -2.35f, -1.0f, -2.35f, -2.35f, -1.0f, -1.0f, 0.91f, 0.2f, -1.0f, 0.91f);
        this.gunModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[13].addShapeBox(2.05f, -6.0f, -6.0f, 1, 4, 4, 0.0f, 0.2f, -2.35f, -2.35f, -1.0f, -2.35f, -2.35f, -1.0f, -1.0f, 0.91f, 0.2f, -1.0f, 0.91f, 0.2f, 0.91f, -1.0f, -1.0f, 0.91f, -1.0f, 0.2f, 0.91f, 0.91f, 0.2f, 0.91f, 0.91f);
        this.gunModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[14].addShapeBox(2.05f, -1.09f, -5.0f, 1, 4, 4, 0.0f, 0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.2f, 0.0f, -0.09f, 0.2f, 0.0f, -0.09f, 0.2f, 0.18f, 0.0f, -1.0f, 0.18f, 0.0f, 0.2f, 0.18f, -0.09f, 0.2f, 0.18f, -0.09f);
        this.gunModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[15].addShapeBox(2.05f, -1.09f, -1.0f, 1, 4, 4, 0.0f, 0.2f, 0.0f, 0.09f, 0.2f, 0.0f, 0.09f, 0.2f, 0.0f, 0.09f, 0.2f, 0.0f, 0.09f, 0.2f, 0.18f, 0.09f, 0.2f, 0.18f, 0.09f, 0.2f, 0.18f, 0.09f, 0.2f, 0.18f, 0.09f);
        this.gunModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[16].addShapeBox(2.5f, -3.09f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[17].addShapeBox(2.5f, 2.91f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[18].addShapeBox(2.5f, -0.09f, 3.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[19].addShapeBox(2.5f, -0.09f, -1.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[19].func_78793_a(0.0f, 0.0f, -2.0f);
    }
}
