// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelRPD extends ModelGun
{
    public ModelRPD() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[8];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 20, 0, textureX, textureY)).addShapeBox(7.0f, 3.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 28, 0, textureX, textureY)).addShapeBox(9.0f, 3.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(11.0f, 4.1f, -0.4f, 8.0f, 0.8f, 0.8f);
        (this.gunModel[4] = new ModelRendererTurbo(this, 18, 4, textureX, textureY)).addBox(11.0f, 3.1f, -0.4f, 3.0f, 0.8f, 0.8f);
        (this.gunModel[5] = new ModelRendererTurbo(this, 36, 0, textureX, textureY)).addBox(12.5f, 3.0f, -0.5f, 1, 2, 1);
        (this.gunModel[6] = new ModelRendererTurbo(this, 40, 0, textureX, textureY)).addBox(17.5f, 4.0f, -0.5f, 1, 2, 1);
        (this.gunModel[7] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(-1.0f, -4.0f, -0.75f, 2.0f, 5.0f, 1.5f);
        this.gunModel[7].setRotationPoint(1.0f, 3.0f, 0.0f);
        this.gunModel[7].rotateAngleZ = -0.5f;
        this.ammoModel = new ModelRendererTurbo[3];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 8, 6, textureX, textureY)).addBox(4.0f, -1.0f, -1.0f, 2, 5, 2);
        (this.ammoModel[1] = new ModelRendererTurbo(this, 24, 6, textureX, textureY)).addShapeBox(4.0f, -1.0f, -3.0f, 2, 5, 2, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.ammoModel[2] = new ModelRendererTurbo(this, 16, 6, textureX, textureY)).addShapeBox(4.0f, -1.0f, 1.0f, 2, 5, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.25f, 0.0f);
        this.defaultStockModel = new ModelRendererTurbo[3];
        (this.defaultStockModel[0] = new ModelRendererTurbo(this, 32, 4, textureX, textureY)).addShapeBox(-2.0f, 3.0f, -1.0f, 1, 2, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        (this.defaultStockModel[1] = new ModelRendererTurbo(this, 42, 12, textureX, textureY)).addShapeBox(-5.0f, 2.0f, -1.0f, 3, 2, 2, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.defaultStockModel[2] = new ModelRendererTurbo(this, 32, 8, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 3, 3, 2);
        this.barrelAttachPoint = new Vector3f(0.734375f, 0.21875f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.125f, 0.3125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.46875f, 0.125f, 0.0f);
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.tiltGunTime = 0.1f;
        this.unloadClipTime = 0.2f;
        this.loadClipTime = 0.2f;
        this.untiltGunTime = 0.5f;
    }
}
