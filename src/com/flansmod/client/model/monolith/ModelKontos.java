// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelKontos extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelKontos() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[6];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(15.0f, 0.0f, 1.0f, 10, 1, 1, 0.0f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f, 40.0f, -0.1f, -0.1f);
        this.gunModel[0].func_78793_a(-10.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 1.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(60.0f, 0.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 1.0f, 7, 1, 1, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 1.0f, 0.0f);
        this.gunModel[2].func_78793_a(63.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(-1.0f, 0.0f, 1.0f, 2, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.25f, -0.25f);
        this.gunModel[3].func_78793_a(71.0f, 0.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 1.0f, 7, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[4].func_78793_a(53.0f, 0.0f, 0.0f);
        this.gunModel[5].addShapeBox(15.0f, 0.0f, 1.0f, 10, 1, 1, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(-17.0f, 0.0f, 0.0f);
    }
}
