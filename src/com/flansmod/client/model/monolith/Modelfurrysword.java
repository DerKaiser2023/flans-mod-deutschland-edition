// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class Modelfurrysword extends ModelGun
{
    int textureX;
    int textureY;
    
    public Modelfurrysword() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-1.0f, -13.0f, -0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[1].func_78793_a(-0.5f, -3.0f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.gunModel[2].func_78793_a(-1.0f, -4.0f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[3].func_78793_a(1.0f, -13.0f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[4].func_78793_a(1.0f, -11.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[5].func_78793_a(1.0f, -9.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[6].func_78793_a(1.0f, -7.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[7].func_78793_a(-2.0f, -7.0f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[8].func_78793_a(-2.0f, -9.0f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[9].func_78793_a(-2.0f, -11.0f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, -0.125f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f, 0.0f, 0.625f, -0.5f);
        this.gunModel[10].func_78793_a(-2.0f, -13.0f, -0.5f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
