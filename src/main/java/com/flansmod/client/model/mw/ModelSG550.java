// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSG550 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSG550() {
        this.textureX = 512;
        this.textureY = 16;
        (this.gunModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 209, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 297, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 2, 5, 1, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -4.0f, -0.5f);
        this.gunModel[0].field_78808_h = -0.2094395f;
        this.gunModel[1].func_78790_a(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[1].func_78793_a(1.0f, -2.0f, -0.5f);
        this.gunModel[2].func_78790_a(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[2].func_78793_a(14.0f, -3.8f, -0.5f);
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 13, 1, 2, 0.0f);
        this.gunModel[3].func_78793_a(-0.23f, -4.0f, -1.0f);
        this.gunModel[4].func_78790_a(0.0f, 0.0f, 0.0f, 8, 2, 2, 0.0f);
        this.gunModel[4].func_78793_a(11.0f, -4.5f, -1.0f);
        this.gunModel[5].func_78790_a(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f);
        this.gunModel[5].func_78793_a(1.0f, -4.5f, -0.5f);
        this.gunModel[6].func_78790_a(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        this.gunModel[6].func_78793_a(1.0f, -3.0f, -0.5f);
        this.gunModel[7].func_78790_a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[7].func_78793_a(23.0f, -5.5f, -0.5f);
        this.gunModel[8].func_78790_a(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f);
        this.gunModel[8].func_78793_a(1.0f, -5.0f, -0.5f);
        this.gunModel[9].func_78790_a(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f);
        this.gunModel[9].func_78793_a(-3.8f, -2.9f, -1.0f);
        this.gunModel[9].field_78808_h = 0.2792527f;
        this.gunModel[10].func_78790_a(0.0f, 0.0f, 0.0f, 11, 2, 1, 0.0f);
        this.gunModel[10].func_78793_a(-9.5f, -2.0f, -0.5f);
        this.gunModel[10].field_78808_h = 0.2443461f;
        this.gunModel[11].func_78790_a(0.0f, 0.0f, 0.0f, 4, 3, 1, 0.0f);
        this.gunModel[11].func_78793_a(-10.0f, -3.0f, -0.5f);
        this.gunModel[12].func_78790_a(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f);
        this.gunModel[12].func_78793_a(-7.0f, -2.0f, -1.0f);
        this.gunModel[12].field_78808_h = 0.2792527f;
        this.scopeAttachPoint = new Vector3f(0.25f, 0.375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.9375f, 0.21875f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.5208334f, 0.28125f, 0.0f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.ammoModel[0].func_78790_a(6.0f, -2.0f, -0.5f, 2, 2, 1, 0.0f);
        this.ammoModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.ammoModel[1].func_78790_a(6.2f, 0.0f, 0.0f, 2, 2, 1, 0.0f);
        this.ammoModel[1].func_78793_a(0.0f, 0.0f, -0.5f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.flipAll();
        this.translateAll(0.0f, 1.0f, 0.0f);
    }
}
