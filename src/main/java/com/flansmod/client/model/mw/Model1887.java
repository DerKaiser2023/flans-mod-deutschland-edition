// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class Model1887 extends ModelGun
{
    public Model1887() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addShapeBox(0.0f, 3.0f, -1.0f, 3, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        (this.gunModel[1] = new ModelRendererTurbo(this, 10, 0, textureX, textureY)).addShapeBox(0.0f, 2.0f, -1.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(3.0f, 3.05f, -0.45f, 7.0f, 0.9f, 0.9f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(3.0f, 4.05f, -0.45f, 10.0f, 0.9f, 0.9f);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 8, textureX, textureY)).addBox(3.0f, 3.25f, -0.75f, 5.0f, 1.5f, 1.5f);
        this.scopeAttachPoint = new Vector3f(0.3125f, 0.3125f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[2];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 18, 0, textureX, textureY)).addShapeBox(-2.0f, 1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 28, 0, textureX, textureY)).addShapeBox(-8.0f, 0.0f, -1.0f, 6, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.1875f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5625f, 0.140625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY)).addBox(1.0f, 3.0f, -0.5f, 2, 1, 1);
        this.translateAll(0.0f, -0.5f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.RIFLE_TOP;
        this.pumpDelayAfterReload = 86;
        this.pumpDelay = 7;
        this.pumpTime = 12;
        this.gripIsOnPump = true;
        this.pumpHandleDistance = -0.25f;
        this.spinningCocking = true;
        this.spinPoint = new Vector3f(0.0625f, 0.125f, 0.0f);
        this.numBulletsInReloadAnimation = 5.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.708f;
        this.untiltGunTime = 0.133f;
    }
}
