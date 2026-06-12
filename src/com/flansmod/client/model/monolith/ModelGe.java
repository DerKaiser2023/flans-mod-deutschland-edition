// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelGe extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelGe() {
        this.textureX = 32;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[5];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 1, 36, 1, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -20.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[1].func_78793_a(-1.0f, -19.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[2].func_78793_a(1.0f, -19.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.25f, -0.35f, 0.0f, -0.25f, -0.35f, 0.0f, 0.0f, -0.25f);
        this.gunModel[3].func_78793_a(2.0f, -19.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.25f, -0.25f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.25f, -0.25f, 0.0f, -0.25f, -0.35f, -0.25f, -0.5f, -0.5f, -0.25f, -0.5f, -0.5f, 0.0f, -0.25f, -0.35f);
        this.gunModel[4].func_78793_a(5.0f, -19.0f, 0.0f);
    }
}
