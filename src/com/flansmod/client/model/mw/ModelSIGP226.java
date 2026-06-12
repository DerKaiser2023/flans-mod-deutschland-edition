// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSIGP226 extends ModelGun
{
    public ModelSIGP226() {
        final int textureX = 32;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, 3.0f, -1.0f, 7, 1, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY)).addShapeBox(-1.0f, -1.0f, -1.0f, 2, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 8, 3, textureX, textureY)).addBox(0.5f, 3.5f, -0.5f, 6, 1, 1);
        this.slideModel = new ModelRendererTurbo[2];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addShapeBox(-1.0f, 4.0f, -1.0f, 7, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        (this.slideModel[1] = new ModelRendererTurbo(this, 8, 5, textureX, textureY)).addBox(0.0f, 4.5f, -0.5f, 1, 1, 1);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 16, 5, textureX, textureY)).addShapeBox(0.0f, -0.9f, -0.5f, 2, 4, 1, 0.0f, 0.9f, 0.0f, 0.0f, -1.1f, 0.0f, 0.0f, -1.1f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.40625f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.scopeIsOnSlide = true;
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
