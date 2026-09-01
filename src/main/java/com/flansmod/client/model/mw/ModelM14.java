// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM14 extends ModelGun
{
    public ModelM14() {
        final int textureX = 64;
        final int textureY = 32;
        (this.gunModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo(this, 12, 0, textureX, textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 16, textureX, textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 18, textureX, textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 6, 16, textureX, textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 20, 24, textureX, textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 22, 21, textureX, textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 3, 2, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -7.0f, -1.0f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 1, 2, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -4.0f, -1.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 14, 3, 2, 0.0f);
        this.gunModel[2].setRotationPoint(7.0f, -3.0f, -1.0f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(20.0f, -1.5f, -0.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(21.0f, -2.8f, -0.5f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 9, 2, 2, 0.0f);
        this.gunModel[5].setRotationPoint(-2.0f, -3.0f, -1.0f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f);
        this.gunModel[6].setRotationPoint(-2.0f, -1.0f, -1.0f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(18.5f, 0.0f, -0.5f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[9].setRotationPoint(9.0f, -3.2f, 0.2f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 6, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(9.0f, -3.2f, -1.2f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.390625f, 0.0f);
        this.defaultScopeModel = new ModelRendererTurbo[1];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 0, 30, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.defaultScopeModel[0].setRotationPoint(-1.5f, 0.0f, -0.5f);
        (this.defaultStockModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 8, 28, textureX, textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 20, 27, textureX, textureY);
        this.defaultStockModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.defaultStockModel[0].setRotationPoint(-6.0f, -3.0f, -1.0f);
        this.defaultStockModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.defaultStockModel[1].setRotationPoint(-11.0f, -5.0f, -1.0f);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.5625f, 0.328125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.625f, 0.1875f, 0.0f);
        this.slideModel = new ModelRendererTurbo[1];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 22, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.slideModel[0].setRotationPoint(2.0f, -1.1f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 24, textureX, textureY)).addBox(0.0f, 0.0f, 0.0f, 3, 5, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(5.0f, -7.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = 0.06981317f;
        this.gunSlideDistance = 0.2f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.translateAll(0.0f, 6.25f, 0.0f);
    }
}
