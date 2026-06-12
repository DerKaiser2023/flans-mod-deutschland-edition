// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelMusketMatchlock extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelMusketMatchlock() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[27];
        this.ammoModel = new ModelRendererTurbo[1];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 9, 41, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 17, 41, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 25, 41, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 9, 49, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 17, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(5.0f, -4.5f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, 1.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.2f);
        this.gunModel[1].func_78793_a(-11.5f, -4.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(-2.0f, -3.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 26, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.gunModel[3].func_78793_a(2.0f, -4.9f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(28.0f, -4.9f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(-4.0f, -4.0f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, -0.8f, -0.3f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -0.8f, -0.3f);
        this.gunModel[6].func_78793_a(22.0f, -4.5f, -1.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.gunModel[7].func_78793_a(22.0f, -3.8f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(-3.0f, -3.5f, -1.2f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(0.2f, -2.5f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[10].func_78793_a(-0.8f, -0.8f, -0.5f);
        this.gunModel[10].field_78808_h = 0.7853982f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.gunModel[11].func_78793_a(3.0f, -4.3f, -1.9f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.3f, -0.3f);
        this.gunModel[12].func_78793_a(3.5f, -5.6f, -1.9f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f, -0.2f, -0.3f, -0.3f);
        this.gunModel[13].func_78793_a(3.2f, -4.7f, -1.9f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.gunModel[14].func_78793_a(3.0f, -6.4f, -1.9f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f, -0.35f, -0.35f, 0.0f);
        this.gunModel[15].func_78793_a(2.7f, -6.4f, -1.4f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.4f);
        this.gunModel[16].func_78793_a(-2.0f, -4.9f, -0.5f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, -0.3f);
        this.gunModel[17].func_78793_a(-1.5f, -5.6f, -1.4f);
        this.gunModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.gunModel[18].func_78793_a(2.7f, -6.2f, -1.2f);
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f);
        this.gunModel[19].func_78793_a(4.5f, -6.2f, -1.2f);
        this.gunModel[19].field_78796_g = -0.54105204f;
        this.gunModel[19].field_78808_h = -0.7679449f;
        this.gunModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.gunModel[20].func_78793_a(5.0f, -5.0f, -1.7f);
        this.gunModel[20].field_78796_g = -0.27925268f;
        this.gunModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[21].func_78793_a(-5.0f, -4.0f, -1.0f);
        this.gunModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.gunModel[22].func_78793_a(-6.0f, -4.0f, -1.0f);
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, 0.3f, 0.0f, -0.5f, 2.5f, 0.0f, 0.0f, 1.5f, 0.2f, 0.0f, 1.5f, 0.2f, -0.5f, 2.5f, 0.0f);
        this.gunModel[23].func_78793_a(-13.5f, -4.0f, -1.0f);
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[24].func_78793_a(-0.8f, -0.8f, -0.5f);
        this.gunModel[24].field_78808_h = 0.7853982f;
        this.gunModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[25].func_78793_a(-1.5f, -2.0f, -0.5f);
        this.gunModel[25].field_78808_h = -0.5235988f;
        this.gunModel[26].addShapeBox(-4.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[26].func_78793_a(-1.3f, -2.0f, -0.5f);
        this.gunModel[26].field_78808_h = 0.17453294f;
    }
    
    private void initammoModel_1() {
        (this.ammoModel[0] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.ammoModel[0].func_78793_a(29.0f, -4.8f, -0.5f);
        this.animationType = EnumAnimationType.END_LOADED;
    }
}
