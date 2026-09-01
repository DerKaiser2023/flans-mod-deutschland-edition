// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelBarrett extends ModelGun
{
    public ModelBarrett() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-4.0f, 2.0f, -1.0f, 16, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 26, 4, textureX, textureY)).addBox(12.0f, 2.5f, -0.5f, 8, 1, 1);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(-1.0f, -2.0f, -1.0f, 3, 4, 2);
        this.slideModel = new ModelRendererTurbo[2];
        (this.slideModel[0] = new ModelRendererTurbo(this, 34, 6, textureX, textureY)).addTrapezoid(3.0f, 2.5f, 0.5f, 1, 1, 2, 0.0f, -0.5f, 0);
        this.slideModel[0].doMirror(false, false, true);
        (this.slideModel[1] = new ModelRendererTurbo(this, 34, 6, textureX, textureY)).addTrapezoid(3.0f, 2.5f, 0.5f, 1, 1, 2, 0.0f, -0.5f, 0);
        this.defaultScopeModel = new ModelRendererTurbo[3];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addTrapezoid(-1.0f, 4.25f, -1.0f, 4, 2, 2, 0.0f, -0.5f, 2);
        (this.defaultScopeModel[1] = new ModelRendererTurbo(this, 12, 10, textureX, textureY)).addTrapezoid(3.0f, 4.25f, -1.0f, 4, 2, 2, 0.0f, -0.5f, 3);
        (this.defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 7, textureX, textureY)).addBox(1.5f, 3.5f, -0.5f, 3, 2, 1);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.defaultBarrelModel = new ModelRendererTurbo[1];
        (this.defaultBarrelModel[0] = new ModelRendererTurbo(this, 18, 4, textureX, textureY)).addBox(18.5f, 2.0f, -1.0f, 2, 2, 2);
        this.barrelAttachPoint = new Vector3f(1.25f, 0.25f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[1];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 36, 9, textureX, textureY)).addBox(-8.0f, 0.0f, -1.0f, 4, 3, 2);
        this.stockAttachPoint = new Vector3f(-0.25f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 24, 8, textureX, textureY)).addBox(2.5f, -3.0f, -1.0f, 4, 5, 2);
        this.translateAll(0.0f, 1.0f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
