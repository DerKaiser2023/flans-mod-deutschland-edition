// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelWoodFireLance extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelWoodFireLance() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[2];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 28.0f, 0.0f, 0.0f, 9.0f, 0.3f, 0.3f, 9.0f, 0.3f, 0.3f, 28.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 9.0f, 0.3f, 0.3f, 9.0f, 0.3f, 0.3f, 28.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-7.0f, -2.8f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 11, 5, 5, 0.0f, 0.5f, 0.2f, -1.8f, 0.5f, 0.4f, -1.6f, 0.5f, 0.4f, 0.4f, 0.5f, 0.2f, 0.2f, 0.5f, -1.8f, -1.8f, 0.5f, -1.6f, -1.8f, 0.5f, -1.6f, 0.4f, 0.5f, -1.8f, 0.2f);
        this.gunModel[1].func_78793_a(14.0f, -3.8f, -3.0f);
    }
}
