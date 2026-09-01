// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM21 extends ModelGun
{
    public ModelM21() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(2.0f, 3.5f, -0.5f, 16, 1, 1);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY)).addBox(-1.0f, 2.0f, -1.0f, 8, 3, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY)).addBox(7.0f, 3.0f, -1.0f, 6, 2, 2);
        this.defaultScopeModel = new ModelRendererTurbo[6];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 11, textureX, textureY)).addBox(-1.0f, 6.0f, -1.0f, 2, 2, 2);
        (this.defaultScopeModel[1] = new ModelRendererTurbo(this, 34, 0, textureX, textureY)).addBox(1.0f, 6.5f, -0.5f, 4, 1, 1);
        (this.defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 11, textureX, textureY)).addBox(5.0f, 6.0f, -1.0f, 2, 2, 2);
        (this.defaultScopeModel[3] = new ModelRendererTurbo(this, 6, 11, textureX, textureY)).addBox(1.5f, 5.5f, -0.5f, 1, 1, 1);
        (this.defaultScopeModel[4] = new ModelRendererTurbo(this, 6, 11, textureX, textureY)).addBox(3.5f, 5.5f, -0.5f, 1, 1, 1);
        (this.defaultScopeModel[5] = new ModelRendererTurbo(this, 14, 11, textureX, textureY)).addBox(0.0f, 4.5f, -0.5f, 6, 1, 1);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[2];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 2, textureX, textureY)).addBox(-2.0f, 2.0f, -1.0f, 1, 2, 2);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 19, 6, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 6, 3, 2);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.1875f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 35, 8, textureX, textureY)).addBox(3.0f, -4.0f, -1.0f, 3, 6, 2);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
