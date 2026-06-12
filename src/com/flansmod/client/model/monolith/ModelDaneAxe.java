// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDaneAxe extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelDaneAxe() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[7];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 30, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -17.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, -0.1f, 0.0f, 0.1f);
        this.gunModel[1].func_78793_a(0.0f, -16.5f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.3f, 0.0f, -0.1f, -0.1f, 0.0f, -0.3f, -0.1f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, -0.1f, 0.4f, -0.3f, -0.1f, 0.4f, -0.3f, 0.3f, 0.0f, -0.1f);
        this.gunModel[2].func_78793_a(1.2f, -16.5f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 0.4f, -0.3f, -0.1f, 0.7f, -0.3f, -0.1f, 0.7f, -0.3f, 0.1f, 0.4f, -0.3f, 0.1f, 0.0f, -0.3f, -0.1f, 1.2f, -0.3f, -0.1f, 1.2f, -0.3f, 0.1f, 0.0f, -0.3f);
        this.gunModel[3].func_78793_a(2.2f, -16.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.1f, 0.7f, -0.3f, 0.9f, 1.5f, -0.3f, 0.9f, 1.5f, -0.3f, 0.1f, 0.7f, -0.3f, 0.1f, 1.2f, -0.3f, -0.299f, 2.1f, -0.3f, -0.299f, 2.1f, -0.3f, 0.1f, 1.2f, -0.3f);
        this.gunModel[4].func_78793_a(3.2f, -16.0f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.9f, 0.5f, -0.3f, 1.5f, 1.5f, -0.5f, 1.5f, 1.5f, -0.5f, -0.9f, 0.5f, -0.3f, -0.35f, 0.0f, -0.3f, 0.8f, 1.0f, -0.5f, 0.8f, 1.0f, -0.5f, -0.35f, 0.0f, -0.3f);
        this.gunModel[5].func_78793_a(4.2f, -17.0f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.35f, 0.0f, -0.3f, 0.8f, -1.0f, -0.5f, 0.8f, -1.0f, -0.5f, -0.35f, 0.0f, -0.3f, 0.3f, 2.1f, -0.3f, -0.6f, 2.8f, -0.5f, -0.6f, 2.8f, -0.5f, 0.3f, 2.1f, -0.3f);
        this.gunModel[6].func_78793_a(4.2f, -16.0f, 0.0f);
    }
}
