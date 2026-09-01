// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSten extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSten() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 0, 14, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 21, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 14, 14, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 14, 18, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 27, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 28, 26, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 5, 4, 2, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, 0.0f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(5.0f, 0.0f, -1.0f);
        this.gunModel[2].func_78790_a(0.0f, 0.0f, 0.0f, 17, 3, 3, 0.0f);
        this.gunModel[2].func_78793_a(0.0f, -3.0f, -1.5f);
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[3].func_78793_a(17.0f, -2.5f, -1.126667f);
        this.gunModel[4].func_78790_a(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f);
        this.gunModel[4].func_78793_a(8.0f, -3.1f, -1.4f);
        this.gunModel[5].func_78790_a(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f);
        this.gunModel[5].func_78793_a(8.0f, -2.6f, 1.6f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f);
        this.gunModel[6].func_78793_a(-2.0f, -3.0f, -1.5f);
        (this.defaultStockModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 14, 24, this.textureX, this.textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 20, 24, this.textureX, this.textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo(this, 20, 26, this.textureX, this.textureY);
        this.defaultStockModel[0].func_78790_a(0.0f, -1.0f, 0.0f, 1, 6, 2, 0.0f);
        this.defaultStockModel[0].func_78793_a(-9.0f, 1.0f, -1.0f);
        this.defaultStockModel[1].func_78790_a(-1.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f);
        this.defaultStockModel[1].func_78793_a(-8.0f, 2.0f, -0.5f);
        this.defaultStockModel[1].field_78808_h = 0.2268928f;
        this.defaultStockModel[2].addShapeBox(6.0f, 1.0f, 0.0f, 3, 1, 1, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.defaultStockModel[2].func_78793_a(-8.0f, 2.0f, -0.5f);
        this.defaultStockModel[2].field_78808_h = 0.2268928f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 26, 14, this.textureX, this.textureY)).func_78790_a(0.0f, 0.0f, 0.0f, 2, 1, 7, 0.0f);
        this.ammoModel[0].func_78793_a(8.5f, -2.1f, 3.6f);
        this.barrelAttachPoint = new Vector3f(1.3125f, 0.34375f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.375f, 0.4375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.75f, 0.25f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.SIDE_CLIP;
        this.flipAll();
        this.translateAll(0.0f, 4.0f, 0.0f);
        this.numBulletsInReloadAnimation = 8.0f;
        this.tiltGunTime = 0.25f;
        this.unloadClipTime = 0.25f;
        this.loadClipTime = 0.25f;
        this.untiltGunTime = 0.25f;
    }
}
