// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelL96 extends ModelGun
{
    public ModelL96() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-0.75f, 1.5f, -0.5f, 20, 1, 1);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY)).addBox(-1.0f, 0.0f, -1.0f, 13, 2, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(10.0f, -1.0f, -1.0f, 4, 1, 2);
        this.defaultScopeModel = new ModelRendererTurbo[4];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 31, 3, textureX, textureY)).addBox(-2.0f, 4.5f, -0.5f, 6, 1, 1);
        (this.defaultScopeModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addTrapezoid(4.0f, 4.0f, -1.0f, 4, 2, 2, 0.0f, -0.5f, 3);
        (this.defaultScopeModel[2] = new ModelRendererTurbo(this, 8, 13, textureX, textureY)).addBox(1.0f, 2.5f, -0.5f, 1, 2, 1);
        (this.defaultScopeModel[3] = new ModelRendererTurbo(this, 12, 13, textureX, textureY)).addBox(3.0f, 2.5f, -0.5f, 1, 2, 1);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.0625f, 0.28125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[5];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 27, 10, textureX, textureY)).addBox(-2.0f, -2.0f, -1.0f, 1, 4, 2);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 34, 13, textureX, textureY)).addBox(-5.0f, -2.0f, -1.0f, 3, 1, 2);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 34, 10, textureX, textureY)).addBox(-4.0f, 1.0f, -1.0f, 2, 1, 2);
        (this.defaultStockModel[3] = new ModelRendererTurbo(this, 30, 5, textureX, textureY)).addBox(-7.0f, -1.0f, -1.0f, 3, 3, 2);
        (this.defaultStockModel[4] = new ModelRendererTurbo(this, 18, 10, textureX, textureY)).addBox(-9.0f, -2.0f, -1.0f, 2, 4, 2);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 41, 7, textureX, textureY)).addShapeBox(3.0f, -2.0f, -1.0f, 3, 2, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.translateAll(0.0f, 2.5f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
    }
}
