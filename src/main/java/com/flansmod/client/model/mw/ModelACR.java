// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelACR extends ModelGun
{
    public ModelACR() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[6];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addShapeBox(0.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY)).addBox(5.0f, 2.0f, -1.0f, 3, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(8.0f, 3.0f, -1.0f, 6, 2, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 13, textureX, textureY)).addBox(14.0f, 3.1f, -0.4f, 4.0f, 0.8f, 0.8f);
        (this.gunModel[5] = new ModelRendererTurbo(this, 10, 13, textureX, textureY)).addBox(14.0f, 4.1f, -0.4f, 1.0f, 0.8f, 0.8f);
        this.scopeAttachPoint = new Vector3f(0.21875f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[3];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 20, 0, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 1.0f, 3.5f, 2.0f);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 26, 0, textureX, textureY)).addShapeBox(-7.0f, 1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 18, 6, textureX, textureY)).addShapeBox(-7.0f, 3.0f, -1.0f, 7, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.21875f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.6875f, 0.1875f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 16, 10, textureX, textureY)).addShapeBox(5.5f, -2.0f, -1.0f, 2, 4, 2, 0.0f, -0.25f, 0.25f, -0.25f, 0.5f, 0.0f, -0.25f, 0.5f, 0.0f, -0.25f, -0.25f, 0.25f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
