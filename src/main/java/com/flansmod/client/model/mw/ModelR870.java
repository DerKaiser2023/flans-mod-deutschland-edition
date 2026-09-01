// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelR870 extends ModelGun
{
    public ModelR870() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(2.0f, 3.0f, -1.0f, 4, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 12, 0, textureX, textureY)).addBox(3.0f, 4.5f, -0.5f, 15, 1, 1);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addShapeBox(-2.0f, 3.0f, -1.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 8, textureX, textureY)).addShapeBox(-2.0f, 1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addShapeBox(1.0f, 2.0f, -1.0f, 3, 1, 2, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pumpModel = new ModelRendererTurbo[2];
        (this.pumpModel[0] = new ModelRendererTurbo(this, 12, 2, textureX, textureY)).addBox(2.0f, 3.25f, -0.5f, 10, 1, 1);
        (this.pumpModel[1] = new ModelRendererTurbo(this, 12, 4, textureX, textureY)).addBox(7.0f, 2.75f, -1.0f, 4, 2, 2);
        this.scopeAttachPoint = new Vector3f(0.3125f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[2];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 10, 8, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 1, 3, 2);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 16, 8, textureX, textureY)).addShapeBox(-7.0f, 1.0f, -1.0f, 5, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5625f, 0.140625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 14, 14, textureX, textureY)).addBox(4.0f, 3.5f, -0.5f, 2, 1, 1);
        this.translateAll(0.0f, -0.5f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.SHOTGUN;
        this.pumpDelayAfterReload = 115;
        this.pumpDelay = 6;
        this.pumpTime = 9;
        this.gripIsOnPump = true;
        this.pumpHandleDistance = -0.25f;
        this.numBulletsInReloadAnimation = 7.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.708f;
        this.untiltGunTime = 0.133f;
    }
}
