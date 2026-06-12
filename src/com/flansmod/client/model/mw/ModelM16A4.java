// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM16A4 extends ModelGun
{
    public ModelM16A4() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[6];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(1.0f, 2.0f, -1.0f, 5, 3, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 14, 0, textureX, textureY)).addBox(0.0f, -1.0f, -1.0f, 1, 3, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 20, 0, textureX, textureY)).addBox(1.0f, 1.0f, -1.0f, 1, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY)).addBox(6.5f, 3.0f, -1.0f, 7, 2, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 12, 0, textureX, textureY)).addBox(14.0f, 4.5f, -0.5f, 1, 1, 1);
        (this.gunModel[5] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(6.0f, 3.5f, -0.5f, 12, 1, 1);
        this.scopeAttachPoint = new Vector3f(0.21875f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[3];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 3, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 3, 4, 2);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 0, 11, textureX, textureY)).addBox(-5.0f, 2.0f, -1.0f, 3, 3, 2);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 10, 11, textureX, textureY)).addBox(-2.0f, 3.0f, -1.0f, 3, 2, 2);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.625f, 0.1875f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[2];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 20, 11, textureX, textureY)).addBox(3.0f, 0.0f, -1.0f, 3, 2, 2);
        (this.ammoModel[1] = new ModelRendererTurbo(this, 30, 11, textureX, textureY)).addBox(4.0f, -2.0f, -1.0f, 3, 2, 2);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
