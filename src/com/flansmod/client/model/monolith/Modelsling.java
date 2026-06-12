// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class Modelsling extends ModelGun
{
    int textureX;
    int textureY;
    
    public Modelsling() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 177, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 3, 42, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -2.0f, -2.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 42, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(3.0f, -2.0f, -2.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 42, 1, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(-2.0f, -2.0f, -2.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 42, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f);
        this.gunModel[3].func_78793_a(-2.0f, -2.0f, 14.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 3, 42, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(0.0f, -2.0f, 14.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 42, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(3.0f, -2.0f, 14.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 7, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.gunModel[6].func_78793_a(0.0f, 40.0f, 8.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(2.0f, 42.0f, 4.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 4, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.gunModel[8].func_78793_a(-2.0f, 42.0f, 4.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(1.0f, 42.0f, 4.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(-2.0f, 41.0f, 2.5f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[11].func_78793_a(3.0f, 41.0f, 2.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.gunModel[12].func_78793_a(-2.0f, 41.0f, 8.5f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[13].func_78793_a(3.0f, 41.0f, 8.5f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 7, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.gunModel[14].func_78793_a(0.0f, 41.0f, -2.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[0].func_78793_a(1.0f, 41.0f, 5.5f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
