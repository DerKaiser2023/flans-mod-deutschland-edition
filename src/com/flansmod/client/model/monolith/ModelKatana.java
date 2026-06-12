// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelKatana extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelKatana() {
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
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -1.45f, 1, 4, 2, 0.0f, -0.45f, 0.5f, -0.1f, -0.45f, 0.5f, -0.1f, -0.45f, 0.5f, -1.0f, -0.45f, 0.5f, -1.0f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f);
        this.gunModel[0].func_78793_a(0.2f, -18.5f, 0.5f);
        this.gunModel[0].field_78796_g = -1.0471976f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -1.85f, 1, 1, 2, 0.0f, -0.45f, -0.2f, -0.3f, -0.45f, -0.2f, -0.3f, -0.45f, -0.2f, -1.6f, -0.45f, -0.2f, -1.6f, -0.45f, 1.0f, -0.5f, -0.45f, 1.0f, -0.5f, -0.45f, 1.0f, -0.6f, -0.45f, 1.0f, -0.6f);
        this.gunModel[1].func_78793_a(0.2f, -21.0f, 0.5f);
        this.gunModel[1].field_78796_g = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, -0.65f, 1, 6, 1, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(0.2f, -2.5f, 0.5f);
        this.gunModel[2].field_78796_g = -1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -0.6f, 1, 1, 1, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.gunModel[3].func_78793_a(0.2f, -3.0f, 0.5f);
        this.gunModel[3].field_78796_g = -1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.4f, 1, 1, 1, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f);
        this.gunModel[4].func_78793_a(0.2f, -3.0f, 0.5f);
        this.gunModel[4].field_78796_g = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -1.6f, 1, 1, 1, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.gunModel[5].func_78793_a(0.2f, -3.0f, 0.5f);
        this.gunModel[5].field_78796_g = -1.0471976f;
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -1.25f, 1, 4, 2, 0.0f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.7f, -0.45f, 0.0f, -0.7f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f);
        this.gunModel[6].func_78793_a(0.2f, -14.5f, 0.5f);
        this.gunModel[6].field_78796_g = -1.0471976f;
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -1.15f, 1, 4, 2, 0.0f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.6f, -0.45f, 0.0f, -0.6f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f);
        this.gunModel[7].func_78793_a(0.2f, -10.5f, 0.5f);
        this.gunModel[7].field_78796_g = -1.0471976f;
        this.gunModel[8].addShapeBox(0.0f, 0.0f, -1.15f, 1, 4, 2, 0.0f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f, -0.45f, 0.0f, -0.5f);
        this.gunModel[8].func_78793_a(0.2f, -6.5f, 0.5f);
        this.gunModel[8].field_78796_g = -1.0471976f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -1.15f, 1, 1, 2, 0.0f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f, -0.4f, 0.0f, -0.45f);
        this.gunModel[9].func_78793_a(0.2f, -3.5f, 0.5f);
        this.gunModel[9].field_78796_g = -1.0471976f;
    }
}
