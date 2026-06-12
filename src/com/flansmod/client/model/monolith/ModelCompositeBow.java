// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelCompositeBow extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelCompositeBow() {
        this.textureX = 32;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[10];
        this.ammoModel = new ModelRendererTurbo[3];
        this.slideModel = new ModelRendererTurbo[2];
        this.initgunModel_1();
        this.initammoModel_1();
        this.initslideModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].func_78793_a(2.0f, -5.0f, 0.0f);
        this.gunModel[0].field_78808_h = -0.4537856f;
        this.gunModel[1].func_78790_a(-1.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[1].func_78793_a(3.0f, -4.5f, 0.0f);
        this.gunModel[1].field_78808_h = -0.20943952f;
        this.gunModel[2].addShapeBox(-3.0f, -12.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(5.5f, -3.7f, 0.0f);
        this.gunModel[2].field_78808_h = 0.29670596f;
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[3].func_78793_a(1.0f, -2.0f, 0.0f);
        this.gunModel[3].field_78808_h = 0.4537856f;
        this.gunModel[4].func_78790_a(-1.0f, -4.0f, 0.0f, 1, 4, 1, 0.0f);
        this.gunModel[4].func_78793_a(3.7f, -7.5f, 0.0f);
        this.gunModel[4].field_78808_h = 0.13962634f;
        this.gunModel[5].addShapeBox(-3.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(0.5f, -18.0f, 0.0f);
        this.gunModel[5].field_78808_h = -0.03490659f;
        this.gunModel[6].func_78790_a(-1.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[6].func_78793_a(3.2f, 0.2f, 0.0f);
        this.gunModel[6].field_78808_h = 0.20943952f;
        this.gunModel[7].func_78790_a(-1.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.gunModel[7].func_78793_a(3.8f, 3.0f, 0.0f);
        this.gunModel[7].field_78808_h = -0.13962634f;
        this.gunModel[8].addShapeBox(-3.0f, 11.8f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(8.5f, -3.7f, 0.0f);
        this.gunModel[8].field_78808_h = -0.29670596f;
        this.gunModel[9].addShapeBox(-3.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(2.1f, 10.0f, 0.0f);
        this.gunModel[9].field_78808_h = 0.03490659f;
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.ammoModel[0].func_78793_a(-4.0f, -2.8f, 0.5f);
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.2f);
        this.ammoModel[1].func_78793_a(4.0f, -2.8f, 0.5f);
        this.ammoModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, 0.0f);
        this.ammoModel[2].func_78793_a(5.0f, -2.8f, 0.5f);
    }
    
    private void initslideModel_1() {
        this.slideModel[0] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.slideModel[1] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.slideModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 16, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -2.3f, 0.0f, -0.3f, 1.7f, 0.0f, -0.3f, 1.7f, 0.0f, -0.3f, -2.3f, 0.0f, -0.3f);
        this.slideModel[0].func_78793_a(-1.5f, -18.0f, 1.0f);
        this.slideModel[0].field_78796_g = 3.1415927f;
        this.slideModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 16, 1, 0.0f, -2.3f, 0.0f, -0.3f, 1.7f, 0.0f, -0.3f, 1.7f, 0.0f, -0.3f, -2.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.slideModel[1].func_78793_a(-1.5f, -2.0f, 1.0f);
        this.slideModel[1].field_78796_g = 3.1415927f;
        this.animationType = EnumAnimationType.END_LOADED;
    }
}
