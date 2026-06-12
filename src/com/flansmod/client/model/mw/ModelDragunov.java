// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDragunov extends ModelGun
{
    public ModelDragunov() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(13.0f, 3.5f, -0.5f, 5, 1, 1);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY)).addBox(-1.0f, 3.0f, -1.0f, 13, 2, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(12.0f, 3.0f, -0.5f, 1, 2, 1);
        (this.gunModel[3] = new ModelRendererTurbo(this, 4, 6, textureX, textureY)).addBox(16.0f, 4.5f, -0.5f, 1, 1, 1);
        (this.gunModel[4] = new ModelRendererTurbo(this, 6, 6, textureX, textureY)).addBox(-1.0f, 0.0f, -1.0f, 1, 3, 2);
        this.defaultScopeModel = new ModelRendererTurbo[4];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(-2.0f, 5.5f, -1.0f, 3, 2, 2);
        (this.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(1.0f, 6.0f, -0.5f, 1, 1, 1);
        (this.defaultScopeModel[2] = new ModelRendererTurbo(this, 10, 12, textureX, textureY)).addBox(2.0f, 5.5f, -1.0f, 4, 2, 2);
        (this.defaultScopeModel[3] = new ModelRendererTurbo(this, 11, 10, textureX, textureY)).addBox(1.0f, 4.5f, -0.5f, 5, 1, 1);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[3];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 12, 6, textureX, textureY)).addBox(-5.0f, 3.0f, -1.0f, 4, 1, 2);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 24, 6, textureX, textureY)).addBox(-5.0f, 0.0f, -1.0f, 4, 1, 2);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 23, 9, textureX, textureY)).addBox(-8.0f, 0.0f, -1.0f, 3, 4, 2);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 33, 9, textureX, textureY)).addBox(2.0f, -1.0f, -1.0f, 3, 4, 2);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
