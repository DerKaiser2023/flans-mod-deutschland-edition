// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelHuochong extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelHuochong() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[11];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 4, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 17, 4, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 25.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 25.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-14.0f, -2.8f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.2f, 0.2f);
        this.gunModel[1].func_78793_a(4.0f, -3.3f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f);
        this.gunModel[2].func_78793_a(8.0f, -3.3f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[3].func_78793_a(3.0f, -3.3f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.2f, 0.2f, 0.2f, -0.5f, 0.55f, 0.5f, -0.5f, 0.5f, 0.5f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.2f, 0.2f, 0.2f);
        this.gunModel[4].func_78793_a(9.0f, -3.3f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.5f, 0.5f);
        this.gunModel[5].func_78793_a(9.5f, -3.3f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f);
        this.gunModel[6].func_78793_a(14.0f, -3.3f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 9, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[7].func_78793_a(14.5f, -3.3f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f);
        this.gunModel[8].func_78793_a(23.0f, -3.3f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.8f, 0.8f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.8f, 0.8f, 0.0f, 0.8f, 0.8f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.8f, 0.8f);
        this.gunModel[9].func_78793_a(11.5f, -3.3f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, -0.5f, 0.55f, 0.5f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.5f, 0.5f);
        this.gunModel[10].func_78793_a(13.0f, -3.3f, -0.5f);
    }
}
