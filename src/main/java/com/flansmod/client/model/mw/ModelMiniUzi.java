// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelMiniUzi extends ModelGun
{
    public ModelMiniUzi() {
        final int textureX = 32;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[7];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 4, textureX, textureY)).addShapeBox(0.0f, 2.0f, -1.0f, 6, 1, 2, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 7, textureX, textureY)).addBox(1.0f, -1.0f, -1.0f, 2, 3, 2);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(0.0f, 5.0f, -0.5f, 1.0f, 0.5f, 1.0f);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 14, textureX, textureY)).addBox(6.0f, 5.0f, -0.5f, 1.0f, 0.5f, 1.0f);
        (this.gunModel[5] = new ModelRendererTurbo(this, 4, 12, textureX, textureY)).addBox(6.5f, 3.25f, -0.5f, 1, 1, 1);
        (this.gunModel[6] = new ModelRendererTurbo(this, 4, 14, textureX, textureY)).addBox(7.0f, 3.5f, -0.25f, 2.0f, 0.5f, 0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 10, 7, textureX, textureY)).addBox(1.25f, -4.0f, -0.75f, 1.5f, 6.0f, 1.5f);
        this.barrelAttachPoint = new Vector3f(0.46875f, 0.234375f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
