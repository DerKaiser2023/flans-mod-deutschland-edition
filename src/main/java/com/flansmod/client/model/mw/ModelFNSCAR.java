// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelFNSCAR extends ModelGun
{
    public ModelFNSCAR() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[8];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, 2.0f, -1.0f, 8, 3, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY)).addShapeBox(1.0f, -1.0f, -1.0f, 1, 3, 2, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 6, 5, textureX, textureY)).addBox(4.0f, 1.0f, -1.0f, 3, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 20, 0, textureX, textureY)).addBox(8.0f, 3.0f, -1.0f, 5, 2, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(7.5f, 2.5f, -0.5f, 5, 1, 1);
        (this.gunModel[5] = new ModelRendererTurbo(this, 6, 8, textureX, textureY)).addBox(13.0f, 4.5f, -0.5f, 1, 1, 1);
        (this.gunModel[6] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(13.0f, 3.25f, -0.5f, 4, 1, 1);
        (this.gunModel[7] = new ModelRendererTurbo(this, 10, 8, textureX, textureY)).addBox(0.5f, 4.5f, -0.5f, 1, 1, 1);
        this.scopeAttachPoint = new Vector3f(0.21875f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[2];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY)).addShapeBox(-6.0f, 0.0f, -1.0f, 2, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 24, 5, textureX, textureY)).addShapeBox(-4.0f, 2.0f, -1.0f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.0625f, 0.234375f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.625f, 0.1875f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 12, 11, textureX, textureY)).addShapeBox(4.5f, -2.0f, -0.5f, 2, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
