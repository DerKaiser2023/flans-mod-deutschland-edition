// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM60E4 extends ModelGun
{
    public ModelM60E4() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[10];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-5.0f, 2.0f, -1.0f, 13, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addShapeBox(-8.0f, 1.0f, -1.0f, 3, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(-3.0f, 4.0f, -1.0f, 7, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(-1.0f, 1.0f, -1.0f, 3, 1, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 30, 0, textureX, textureY)).addBox(-0.75f, -3.0f, -0.75f, 1.5f, 4.0f, 1.5f);
        this.gunModel[4].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.gunModel[4].rotateAngleZ = -0.5f;
        (this.gunModel[5] = new ModelRendererTurbo(this, 10, 4, textureX, textureY)).addBox(5.0f, 1.5f, -1.25f, 5.0f, 1.5f, 2.5f);
        (this.gunModel[6] = new ModelRendererTurbo(this, 10, 14, textureX, textureY)).addBox(8.0f, 2.1f, -0.4f, 7.0f, 0.8f, 0.8f);
        (this.gunModel[7] = new ModelRendererTurbo(this, 8, 12, textureX, textureY)).addBox(8.0f, 3.2f, -0.3f, 8.0f, 0.6f, 0.6f);
        (this.gunModel[8] = new ModelRendererTurbo(this, 18, 10, textureX, textureY)).addBox(12.0f, 2.9f, -0.4f, 1.0f, 1.0f, 0.8f);
        (this.gunModel[9] = new ModelRendererTurbo(this, 22, 9, textureX, textureY)).addBox(14.0f, 3.1f, -0.4f, 1.0f, 2.0f, 0.8f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 26, 6, textureX, textureY)).addBox(1.0f, -1.0f, -7.0f, 3, 4, 6);
        this.stockAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.734375f, 0.21875f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.3125f, 0.0f);
        this.defaultScopeModel = new ModelRendererTurbo[1];
        (this.defaultScopeModel[0] = new ModelRendererTurbo(this, 26, 10, textureX, textureY)).addBox(3.8f, 5.0f, -0.2f, 0.2f, 1.0f, 0.4f);
        this.gripAttachPoint = new Vector3f(0.46875f, 0.125f, 0.0f);
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.tiltGunTime = 0.1f;
        this.unloadClipTime = 0.2f;
        this.loadClipTime = 0.2f;
        this.untiltGunTime = 0.5f;
    }
}
