// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelPilum extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelPilum() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[4];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 26, 8, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 30, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-28.0f, -3.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f);
        this.gunModel[1].func_78793_a(2.0f, -3.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.gunModel[2].func_78793_a(6.0f, -3.0f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.gunModel[3].func_78793_a(17.0f, -3.0f, 0.0f);
    }
}
