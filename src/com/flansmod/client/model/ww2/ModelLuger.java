// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelLuger extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelLuger() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo(this, 100, 145, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 100, 155, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 100, 175, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 116, 150, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 115, 140, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -3.0f, -1.0f);
        this.gunModel[0].field_78808_h = -0.1919862f;
        this.gunModel[1].func_78790_a(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[1].func_78793_a(-0.4f, -4.0f, -1.0f);
        this.gunModel[2].func_78790_a(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[2].func_78793_a(3.0f, -3.8f, -0.5f);
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[3].func_78793_a(6.8f, -4.2f, -0.5f);
        this.gunModel[4].func_78790_a(0.0f, 0.0f, 0.0f, 0, 2, 1, 0.0f);
        this.gunModel[4].func_78793_a(3.0f, -2.4f, -0.5f);
        this.gunModel[4].field_78808_h = -0.8552113f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 126, 150, this.textureX, this.textureY)).func_78790_a(0.0f, -3.0f, -0.5f, 1, 4, 1, 0.0f);
        this.ammoModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.ammoModel[0].field_78808_h = -0.1919862f;
        this.slideModel = new ModelRendererTurbo[1];
        (this.slideModel[0] = new ModelRendererTurbo(this, 100, 165, this.textureX, this.textureY)).func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f);
        this.slideModel[0].func_78793_a(1.0f, -3.8f, -1.5f);
        this.gunSlideDistance = 0.1f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
        this.translateAll(0.0f, 2.0f, 0.0f);
        this.thirdPersonOffset = new Vector3f(0.0f, -0.1f, 0.0f);
    }
}
