// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelMakarov extends ModelGun
{
    public ModelMakarov() {
        final int textureX = 32;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, -1.0f, -1.0f, 2, 3, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY)).addShapeBox(-2.0f, 2.0f, -1.0f, 5, 1, 2, 0.0f, -1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 8, textureX, textureY)).addBox(0.5f, 3.0f, -0.5f, 6, 1, 1);
        this.slideModel = new ModelRendererTurbo[3];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addShapeBox(-2.0f, 3.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        (this.slideModel[1] = new ModelRendererTurbo(this, 2, 5, textureX, textureY)).addBox(-0.5f, 4.25f, -0.5f, 1, 1, 1);
        (this.slideModel[2] = new ModelRendererTurbo(this, 2, 5, textureX, textureY)).addBox(4.75f, 4.25f, -0.5f, 1, 1, 1);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 13, 0, textureX, textureY)).addBox(-0.9f, -0.75f, -0.5f, 1.8f, 4.0f, 1.0f);
        this.barrelAttachPoint = new Vector3f(0.40625f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.scopeIsOnSlide = true;
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
