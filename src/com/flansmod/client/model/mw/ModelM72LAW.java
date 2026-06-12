// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM72LAW extends ModelGun
{
    public ModelM72LAW() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[4];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(-12.0f, 1.0f, -1.5f, 26, 3, 3);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 7, textureX, textureY)).addBox(-12.0f, 4.0f, -1.0f, 3, 1, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, 4.0f, -1.0f, 14, 1, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 3, textureX, textureY)).addBox(0.0f, 5.0f, -0.5f, 1, 2, 1);
        this.scopeAttachPoint = new Vector3f(0.09375f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0];
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.END_LOADED;
        this.tiltGunTime = 0.4f;
        this.unloadClipTime = 0.1f;
        this.loadClipTime = 0.1f;
        this.untiltGunTime = 0.4f;
    }
}
