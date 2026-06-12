// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelEgyptShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelEgyptShield() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-0.5f, -2.0f, -0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(1.5f, -4.0f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(-0.5f, 1.0f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 16, 4, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -1.5f, -1.5f, 0.0f, 0.75f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f);
        this.gunModel[3].func_78793_a(1.5f, -8.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 16, 4, 0.0f, 0.75f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.75f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(1.5f, -8.0f, -4.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(-0.5f, -2.0f, -0.5f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
