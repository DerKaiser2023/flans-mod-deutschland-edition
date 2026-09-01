// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelStinger extends ModelGun
{
    public ModelStinger() {
        final int textureX = 64;
        final int textureY = 32;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-15.0f, 2.5f, -1.0f, 25, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(-16.0f, 2.0f, -1.5f, 1, 3, 3);
        (this.gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY)).addBox(10.0f, 2.0f, -1.5f, 2, 3, 3);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(0.0f, -0.5f, -0.5f, 1, 3, 1);
        (this.gunModel[4] = new ModelRendererTurbo(this, 4, 10, textureX, textureY)).addBox(3.0f, -0.5f, -1.0f, 6, 3, 2);
        for (int i = 0; i < 5; ++i) {
            this.gunModel[i].func_78793_a(0.0f, 0.0f, 2.0f);
        }
        this.scopeAttachPoint = new Vector3f(0.09375f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[3];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 60, 0, textureX, textureY)).addBox(-0.5f, -10.0f, -0.5f, 1, 20, 1);
        (this.ammoModel[1] = new ModelRendererTurbo(this, 55, 0, textureX, textureY)).addBox(-1.0f, -10.0f, 0.0f, 2, 1, 0);
        (this.ammoModel[2] = new ModelRendererTurbo(this, 55, 2, textureX, textureY)).addBox(0.0f, -10.0f, -1.0f, 0, 1, 2);
        for (int i = 0; i < 3; ++i) {
            this.ammoModel[i].func_78793_a(0.0f, 3.5f, 2.0f);
            this.ammoModel[i].field_78808_h = -1.5707964f;
        }
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.END_LOADED;
        this.endLoadedAmmoDistance = 3.0f;
        this.tiltGunTime = 0.25f;
        this.unloadClipTime = 0.25f;
        this.loadClipTime = 0.25f;
        this.untiltGunTime = 0.25f;
        this.thirdPersonOffset = new Vector3f(0.0f, 0.0f, -0.1f);
        this.itemFrameOffset = new Vector3f(0.25f, 0.0f, 0.0f);
    }
}
