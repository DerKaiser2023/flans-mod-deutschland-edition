// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelRoundShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelRoundShield() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[15];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 15, 18, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 34, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 27, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 15, 18, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 1, 27, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 34, 9, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 15, 18, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 15, 18, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 25, 0, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(1.0f, -1.0f, -8.0f);
        this.gunModel[1].addShapeBox(0.0f, -5.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(1.0f, -3.5f, -4.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[2].func_78793_a(1.0f, -7.5f, -6.0f);
        this.gunModel[3].addShapeBox(0.0f, -3.0f, 0.0f, 1, 3, 14, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.gunModel[3].func_78793_a(1.0f, -1.0f, -7.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[4].func_78793_a(1.3f, -1.0f, -2.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(2.3f, -1.0f, -1.5f);
        this.gunModel[6].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78793_a(2.3f, -0.99f, -1.5f);
        this.gunModel[7].addShapeBox(0.0f, -1.7f, 0.0f, 1, 1, 4, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[7].func_78793_a(1.3f, -1.0f, -2.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f);
        this.gunModel[8].func_78793_a(1.0f, -5.5f, -6.0f);
        this.gunModel[9].addShapeBox(0.0f, -1.3f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f);
        this.gunModel[9].func_78793_a(1.3f, 2.0f, -2.0f);
        this.gunModel[10].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[10].func_78793_a(2.3f, 1.01f, -1.5f);
        this.gunModel[11].addShapeBox(0.0f, 1.0f, 0.0f, 1, 3, 14, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f);
        this.gunModel[11].func_78793_a(1.0f, -1.0f, -7.0f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[12].func_78793_a(1.0f, 2.5f, -6.0f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 12, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[13].func_78793_a(1.0f, 4.5f, -6.0f);
        this.gunModel[14].addShapeBox(0.0f, -5.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f, 0.0f, -0.1f, -3.5f);
        this.gunModel[14].func_78793_a(1.0f, 11.5f, -4.0f);
    }
}
