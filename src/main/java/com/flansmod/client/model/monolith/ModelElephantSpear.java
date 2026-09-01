// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelElephantSpear extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelElephantSpear() {
        this.textureX = 64;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 24, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 30, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 3, 35, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 3, 30, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(56.0f, -3.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(56.0f, -2.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.gunModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[2].addShapeBox(86.0f, -3.0f, -1.0f, 2, 1, 1, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.gunModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(86.0f, -2.0f, -1.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f);
        this.gunModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[4].addShapeBox(88.0f, -2.5f, -1.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.1f, -0.1f);
        this.gunModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[5].addShapeBox(90.0f, -2.5f, -1.0f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[6].addShapeBox(90.0f, -2.5f, -0.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[7].addShapeBox(90.0f, -2.5f, -1.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[8].addShapeBox(26.0f, -2.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.gunModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[9].addShapeBox(26.0f, -3.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[10].addShapeBox(-4.0f, -3.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[11].addShapeBox(-4.0f, -2.0f, -1.0f, 30, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.gunModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
