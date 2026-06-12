// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAquila extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAquila() {
        this.textureX = 32;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[19];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 25, 49, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 25, 57, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 11, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 4, 18, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -1.0f, 2, 13, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 37.0f, -0.25f, -0.25f, 37.0f, -0.25f, -0.25f, 37.0f, -0.25f, -0.25f, 37.0f, -0.25f);
        this.gunModel[0].func_78793_a(0.0f, -28.0f, 0.0f);
        this.gunModel[1].func_78790_a(0.0f, 0.0f, 0.0f, 2, 2, 6, 0.0f);
        this.gunModel[1].func_78793_a(0.0f, -29.0f, -3.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.gunModel[2].func_78793_a(0.5f, -31.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.gunModel[3].func_78793_a(0.5f, -31.0f, 0.0f);
        this.gunModel[4].func_78790_a(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f);
        this.gunModel[4].func_78793_a(0.5f, -34.0f, -1.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(0.5f, -35.0f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, 0.0f, 0.75f, -1.0f, 0.0f, 0.75f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78793_a(0.5f, -34.0f, -3.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f);
        this.gunModel[7].func_78793_a(0.5f, -34.0f, -5.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 1.5f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, -1.1f, 0.7f, 0.0f, -1.1f, 0.7f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f);
        this.gunModel[8].func_78793_a(0.5f, -34.0f, -3.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, -1.25f, -1.0f, 0.0f, -1.25f, -1.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f);
        this.gunModel[9].func_78793_a(0.5f, -32.0f, -5.0f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, -1.0f, 0.0f, 0.75f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f);
        this.gunModel[10].func_78793_a(0.5f, -34.0f, 1.0f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, 1.5f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.1f, 0.7f, 0.0f, -1.1f, 0.7f);
        this.gunModel[11].func_78793_a(0.5f, -34.0f, 2.0f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[12].func_78793_a(0.5f, -34.0f, 3.0f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -1.25f, -1.0f, 0.0f, -1.25f, -1.0f);
        this.gunModel[13].func_78793_a(0.5f, -32.0f, 3.0f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.6f, -0.25f, 0.0f, -0.6f, -0.25f, 0.0f, -0.6f, -0.25f, 0.0f, -0.6f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[14].func_78793_a(0.5f, -36.5f, -0.5f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -0.6f, 0.25f, 0.0f, -0.6f, 0.25f, 0.0f, -0.9f, -0.75f, 0.0f, -0.9f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f);
        this.gunModel[15].func_78793_a(0.5f, -36.25f, 0.5f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.6f, 0.25f, 0.0f, -0.6f, 0.25f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[16].func_78793_a(0.5f, -36.5f, 0.5f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.6f, 0.25f, 0.0f, -0.6f, 0.25f, 0.0f, -0.9f, -0.75f, 0.0f, -0.9f, -0.75f);
        this.gunModel[17].func_78793_a(0.5f, -35.25f, 0.5f);
        this.gunModel[18].func_78790_a(0.0f, 0.0f, 0.0f, 2, 5, 2, 0.0f);
        this.gunModel[18].func_78793_a(0.0f, -27.0f, -1.0f);
    }
}
