// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAruval extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAruval() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[10];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -1.1f, 1, 14, 2, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f, -0.4f, 0.9f, -0.5f, -0.4f, 0.9f, -0.5f, -0.4f, 0.9f, -0.5f, -0.4f, 0.9f, -0.5f);
        this.gunModel[0].func_78793_a(0.2f, -17.0f, 0.5f);
        this.gunModel[0].field_78796_g = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -0.7f, 1, 4, 1, 0.0f, -0.2f, 0.2f, -0.3f, -0.2f, 0.2f, -0.3f, -0.2f, 0.2f, -0.1f, -0.2f, 0.2f, -0.1f, -0.05f, 0.2f, -0.1f, -0.05f, 0.2f, -0.1f, -0.05f, 0.2f, 0.1f, -0.05f, 0.2f, 0.1f);
        this.gunModel[1].func_78793_a(0.2f, -2.0f, 0.5f);
        this.gunModel[1].field_78796_g = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 1.0f, -0.6f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f);
        this.gunModel[2].func_78793_a(0.2f, 1.0f, 0.5f);
        this.gunModel[2].field_78796_g = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -1.1f, 1, 1, 2, 0.0f, -0.4f, 0.3f, -0.4f, -0.4f, 0.3f, -0.4f, -0.4f, 0.3f, -0.15f, -0.4f, 0.3f, -0.15f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.3f, -0.4f, 0.0f, -0.3f);
        this.gunModel[3].func_78793_a(0.2f, -18.0f, 0.5f);
        this.gunModel[3].field_78796_g = -1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -1.1f, 1, 1, 2, 0.0f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.15f, -0.4f, 0.0f, -0.15f);
        this.gunModel[4].func_78793_a(0.2f, -19.3f, 0.5f);
        this.gunModel[4].field_78796_g = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -1.1f, 1, 1, 2, 0.0f, -0.4f, -0.5f, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f, -0.7f, 1.5f, -0.4f, -0.7f, 1.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f);
        this.gunModel[5].func_78793_a(0.2f, -20.3f, 0.5f);
        this.gunModel[5].field_78796_g = -1.0471976f;
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -1.1f, 1, 1, 2, 0.0f, -0.4f, -0.2f, -1.1f, -0.4f, -0.2f, -1.1f, -0.4f, -0.2f, 2.5f, -0.4f, -0.2f, 2.5f, -0.4f, -0.5f, -0.7f, -0.4f, -0.5f, -0.7f, -0.4f, -0.2f, 0.7f, -0.4f, -0.2f, 0.7f);
        this.gunModel[6].func_78793_a(0.2f, -20.3f, 0.5f);
        this.gunModel[6].field_78796_g = -1.0471976f;
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -1.1f, 1, 1, 2, 0.0f, -0.4f, -0.2f, -2.5f, -0.4f, -0.2f, -2.5f, -0.4f, -0.2f, 1.7f, -0.4f, -0.2f, 1.7f, -0.4f, -0.2f, -1.1f, -0.4f, -0.2f, -1.1f, -0.4f, -0.2f, 3.0f, -0.4f, -0.2f, 3.0f);
        this.gunModel[7].func_78793_a(0.2f, -20.9f, 0.5f);
        this.gunModel[7].field_78796_g = -1.0471976f;
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 1.9f, 1, 1, 2, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.4f, 1.0f, -0.4f, -0.4f, 1.0f, -0.4f, 0.1f, 0.7f, -0.4f, 0.1f, 0.7f);
        this.gunModel[8].func_78793_a(0.2f, -20.3f, 0.5f);
        this.gunModel[8].field_78796_g = -1.0471976f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -1.2f, 1, 1, 1, 0.0f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.15f, -0.3f, -0.4f, -0.15f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.2f, -0.3f, -0.4f, -0.15f, -0.3f, -0.4f, -0.15f, -0.3f);
        this.gunModel[9].func_78793_a(0.2f, -8.0f, 0.5f);
        this.gunModel[9].field_78796_g = -1.0471976f;
    }
}
