// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelPanzerschreck extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelPanzerschreck() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 76, 0, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 86, 17, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 51, 34, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 35, 35, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 26, 3, 3, 0.0f);
        this.gunModel[0].func_78793_a(-18.0f, -4.5f, -1.5f);
        this.gunModel[1].func_78790_a(0.0f, 0.0f, 0.0f, 0, 9, 11, 0.0f);
        this.gunModel[1].func_78793_a(3.0f, -7.0f, -3.0f);
        this.gunModel[1].field_78796_g = 0.01745329f;
        this.gunModel[2].func_78790_a(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.gunModel[2].func_78793_a(0.8f, -2.2f, -0.5f);
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.gunModel[3].func_78793_a(-18.5f, -4.0f, -1.0f);
        this.gunModel[4].func_78790_a(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f);
        this.gunModel[4].func_78793_a(-19.0f, -5.0f, 1.0f);
        this.gunModel[5].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f);
        this.gunModel[5].func_78793_a(-19.0f, -5.0f, -2.0f);
        this.gunModel[6].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f);
        this.gunModel[6].func_78793_a(-19.0f, -2.0f, -2.0f);
        this.gunModel[7].func_78790_a(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[7].func_78793_a(-19.0f, -4.0f, -2.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY)).func_78790_a(-18.0f, -4.0f, -1.0f, 7, 2, 2, 0.0f);
        this.ammoModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
        this.translateAll(0.0f, 2.0f, 4.0f);
        this.thirdPersonOffset = new Vector3f(0.0f, -0.05f, -0.2f);
    }
}
