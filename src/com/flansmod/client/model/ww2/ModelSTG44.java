// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSTG44 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSTG44() {
        this.textureX = 64;
        this.textureY = 64;
        (this.gunModel = new ModelRendererTurbo[20])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -4.0f, -0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(0.0f, -2.5f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(0.0f, -2.0f, -0.5f);
        this.gunModel[2].field_78808_h = -0.29670596f;
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[3].func_78793_a(7.0f, -2.8f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 1, 0.0f, 0.0f, -0.25f, 0.0f, -0.05f, 0.2f, 0.0f, -0.05f, 0.2f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(-2.9f, -3.45f, -0.5f);
        this.gunModel[4].field_78808_h = 0.17453294f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(0.0f, -2.0f, -0.5f);
        this.gunModel[6].func_78790_a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[6].func_78793_a(-1.0f, -4.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.gunModel[7].func_78793_a(14.5f, -4.7f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(4.5f, -5.0f, -0.5f);
        this.gunModel[9].func_78790_a(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[9].func_78793_a(0.0f, -3.5f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.gunModel[10].func_78793_a(11.0f, -3.5f, -0.5f);
        this.gunModel[11].func_78790_a(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[11].func_78793_a(7.0f, -3.8f, -0.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.gunModel[12].func_78793_a(0.4f, -1.0f, -0.5f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.6f, -0.5f, -0.2f, 0.6f, -0.5f, -0.2f, 0.0f, -0.3f, -0.2f);
        this.gunModel[13].func_78793_a(1.8f, -1.0f, -0.5f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f, 3.0f, 0.3f, 0.0f, -0.95f, -0.3f, 0.0f, -0.95f, -0.3f, 0.0f, 3.0f, 0.3f, 0.0f, 3.0f, 0.5f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, 3.0f, 0.5f, 0.0f);
        this.gunModel[14].func_78793_a(-4.9f, -3.1f, -0.5f);
        this.gunModel[14].field_78808_h = 0.17453294f;
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.gunModel[15].func_78793_a(-0.5f, -2.5f, -0.5f);
        this.gunModel[16].addShapeBox(0.0f, -2.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.gunModel[16].func_78793_a(14.5f, -3.75f, 1.5f);
        this.gunModel[16].field_78795_f = 1.5707964f;
        this.gunModel[17].addShapeBox(0.0f, -2.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f);
        this.gunModel[17].func_78793_a(14.5f, -3.1f, -0.77f);
        this.gunModel[18].addShapeBox(0.0f, -2.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.gunModel[18].func_78793_a(14.5f, -4.5f, 1.5f);
        this.gunModel[18].field_78795_f = 1.5707964f;
        this.gunModel[19].addShapeBox(0.0f, -2.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f, 0.0f, -0.1f, -0.4f);
        this.gunModel[19].func_78793_a(14.5f, -3.1f, -0.23f);
        (this.ammoModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(3.0f, 4.7f, -0.5f, 2, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[0].func_78793_a(-0.48f, -3.15f, 0.0f);
        this.ammoModel[0].field_78808_h = 0.20943952f;
        this.ammoModel[1].addShapeBox(3.0f, 2.0f, -0.5f, 2, 3, 1, 0.0f, 0.0f, -0.66f, 0.0f, 0.0f, -0.77f, 0.0f, 0.0f, -0.77f, 0.0f, 0.0f, -0.66f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[1].func_78793_a(0.18f, -4.0f, 0.0f);
        this.ammoModel[1].field_78808_h = 0.05235988f;
        this.ammoModel[2].addShapeBox(2.87f, 4.45f, -0.5f, 2, 2, 1, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.ammoModel[2].field_78808_h = 0.27925268f;
        this.slideModel = new ModelRendererTurbo[1];
        (this.slideModel[0] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.slideModel[0].func_78793_a(5.0f, -3.8f, -1.0f);
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0625f, 0.28125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.translateAll(-1.0f, -1.1f, 0.1f);
        this.thirdPersonOffset = new Vector3f(-0.02f, -0.08f, 0.01f);
        this.flipAll();
    }
}
