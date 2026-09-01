// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelTabar extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelTabar() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 26, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(1.0f, -12.0f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.gunModel[1].func_78793_a(1.0f, -11.5f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.3f, 0.0f, -0.1f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.3f, 0.0f, -0.1f);
        this.gunModel[2].func_78793_a(2.2f, -11.5f, 0.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, 0.4f, -0.3f, -0.1f, 2.2f, -0.3f, -0.1f, 2.2f, -0.3f, -0.1f, 0.4f, -0.3f, -0.1f, 0.4f, -0.3f, -0.1f, 2.2f, -0.3f, -0.1f, 2.2f, -0.3f, -0.1f, 0.4f, -0.3f);
        this.gunModel[3].func_78793_a(3.2f, -11.0f, 0.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.1f, 4.0f, -0.3f, 0.9f, 2.5f, -0.3f, 0.9f, 2.5f, -0.3f, 0.1f, 4.0f, -0.3f, 0.1f, 4.0f, -0.3f, 0.9f, 2.5f, -0.3f, 0.9f, 2.5f, -0.3f, 0.1f, 4.0f, -0.3f);
        this.gunModel[4].func_78793_a(4.2f, -11.5f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.9f, 2.5f, -0.3f, 1.5f, 0.5f, -0.5f, 1.5f, 0.5f, -0.5f, -0.9f, 2.5f, -0.3f, -0.9f, 0.0f, -0.3f, 1.7f, 0.0f, -0.5f, 1.7f, 0.0f, -0.5f, -0.9f, 0.0f, -0.3f);
        this.gunModel[5].func_78793_a(5.2f, -11.5f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.gunModel[6].func_78793_a(1.0f, -13.0f, 0.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(1.0f, -18.0f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.9f, 0.0f, -0.3f, 1.7f, 0.0f, -0.5f, 1.7f, 0.0f, -0.5f, -0.9f, 0.0f, -0.3f, -0.9f, 2.5f, -0.3f, 1.5f, 0.5f, -0.5f, 1.5f, 0.5f, -0.5f, -0.9f, 2.5f, -0.3f);
        this.gunModel[8].func_78793_a(5.2f, -10.51f, 0.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, 0.2f, 1.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.2f, 1.0f, -0.1f, 0.2f, 1.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.2f, 1.0f, -0.1f);
        this.gunModel[9].func_78793_a(-1.3f, -11.5f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
