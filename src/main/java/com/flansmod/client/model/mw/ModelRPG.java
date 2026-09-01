// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelRPG extends ModelGun
{
    public ModelRPG() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-14.0f, 2.5f, -1.0f, 22, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addBox(-15.0f, 2.0f, -1.5f, 1, 3, 3);
        (this.gunModel[2] = new ModelRendererTurbo(this, 8, 4, textureX, textureY)).addBox(-5.0f, 2.0f, -1.5f, 8, 3, 3);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 13, textureX, textureY)).addBox(0.0f, 0.0f, -0.5f, 1, 2, 1);
        (this.gunModel[4] = new ModelRendererTurbo(this, 4, 11, textureX, textureY)).addBox(4.0f, -1.0f, -0.5f, 1, 4, 1);
        this.scopeAttachPoint = new Vector3f(0.09375f, 0.3125f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.0625f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[4];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY)).addBox(-1.5f, 0.0f, -1.5f, 3, 1, 3);
        (this.ammoModel[1] = new ModelRendererTurbo(this, 26, 9, textureX, textureY)).addTrapezoid(-2.0f, 1.0f, -2.0f, 4, 3, 4, 0.0f, -1.0f, 4);
        (this.ammoModel[2] = new ModelRendererTurbo(this, 38, 6, textureX, textureY)).addTrapezoid(-2.0f, 4.0f, -2.0f, 4, 3, 4, 0.0f, -1.0f, 5);
        (this.ammoModel[3] = new ModelRendererTurbo(this, 38, 5, textureX, textureY)).addBox(-0.5f, -4.0f, -0.5f, 1, 4, 1);
        for (int i = 0; i < 4; ++i) {
            this.ammoModel[i].setRotationPoint(8.0f, 3.5f, 0.0f);
            this.ammoModel[i].rotateAngleZ = -1.5707964f;
        }
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.END_LOADED;
        this.tiltGunTime = 0.4f;
        this.unloadClipTime = 0.1f;
        this.loadClipTime = 0.1f;
        this.untiltGunTime = 0.4f;
        this.itemFrameOffset = new Vector3f(0.25f, 0.0f, 0.0f);
    }
}
