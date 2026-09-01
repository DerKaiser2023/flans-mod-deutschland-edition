// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelChinaBuckler extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelChinaBuckler() {
        this.textureX = 64;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[11];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(1.0f, -4.0f, -3.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(1.0f, -4.0f, 0.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(1.0f, -1.0f, -3.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].func_78793_a(1.0f, 1.0f, -3.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.5f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(1.0f, -1.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.gunModel[5].func_78793_a(1.0f, -11.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.gunModel[6].func_78793_a(1.0f, 5.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.5f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.gunModel[7].func_78793_a(3.0f, -14.0f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.5f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.gunModel[8].func_78793_a(3.0f, 14.0f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -2.0f, 0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, -2.0f, 0.2f, -0.2f);
        this.gunModel[9].func_78793_a(1.0f, 13.0f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -2.0f, 0.2f, -0.2f, 1.0f, -0.2f, -0.2f, 1.0f, -0.2f, -0.2f, -2.0f, 0.2f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.gunModel[10].func_78793_a(1.0f, -13.0f, -0.5f);
    }
}
