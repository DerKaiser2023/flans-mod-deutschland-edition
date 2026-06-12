// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelGladius extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelGladius() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[5];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.gunModel[0].func_78793_a(0.2f, -3.0f, 0.5f);
        this.gunModel[0].field_78796_g = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -1.15f, 1, 8, 2, 0.0f, -0.45f, -0.3f, -0.35f, -0.45f, -0.3f, -0.35f, -0.45f, -0.3f, -0.35f, -0.45f, -0.3f, -0.35f, -0.45f, 0.5f, -0.35f, -0.45f, 0.5f, -0.35f, -0.45f, 0.5f, -0.35f, -0.45f, 0.5f, -0.35f);
        this.gunModel[1].func_78793_a(0.2f, -11.0f, 0.5f);
        this.gunModel[1].field_78796_g = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -1.15f, 1, 1, 2, 0.0f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.0f, -0.95f, -0.45f, 0.8f, -0.35f, -0.45f, 0.8f, -0.35f, -0.45f, 0.8f, -0.35f, -0.45f, 0.8f, -0.35f);
        this.gunModel[2].func_78793_a(0.2f, -12.5f, 0.5f);
        this.gunModel[2].field_78796_g = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.65f, 1, 3, 1, 0.0f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f, -0.15f, 0.2f, -0.15f);
        this.gunModel[3].func_78793_a(0.2f, -2.0f, 0.5f);
        this.gunModel[3].field_78796_g = -1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, -0.65f, 1, 1, 1, 0.0f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f);
        this.gunModel[4].func_78793_a(0.2f, 1.0f, 0.5f);
        this.gunModel[4].field_78796_g = -1.0471976f;
    }
}
