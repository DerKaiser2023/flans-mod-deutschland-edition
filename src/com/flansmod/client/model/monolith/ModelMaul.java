// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelMaul extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelMaul() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[5];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.65f, 1, 14, 1, 0.0f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f);
        this.gunModel[0].func_78793_a(0.3f, -7.0f, 0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -0.65f, 1, 3, 1, 0.0f, -0.35f, 0.2f, -0.35f, -0.35f, 0.2f, -0.35f, -0.35f, 0.2f, -0.35f, -0.35f, 0.2f, -0.35f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f);
        this.gunModel[1].func_78793_a(0.3f, -15.0f, 0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -0.65f, 6, 1, 4, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.gunModel[2].func_78793_a(-2.2f, -10.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.65f, 6, 1, 4, 0.0f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f);
        this.gunModel[3].func_78793_a(-2.2f, -11.75f, -1.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.65f, 6, 1, 4, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f, 0.0f, 0.0f, -1.25f);
        this.gunModel[4].func_78793_a(-2.2f, -8.25f, -1.0f);
    }
}
