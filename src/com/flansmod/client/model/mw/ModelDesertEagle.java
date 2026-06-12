// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDesertEagle extends ModelGun
{
    public ModelDesertEagle() {
        final int textureX = 32;
        final int textureY = 32;
        this.gunModel = new ModelRendererTurbo[6];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-3.0f, 1.0f, -1.0f, 7, 1, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 3, textureX, textureY)).addBox(-2.0f, -3.0f, -1.0f, 3, 4, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 13, textureX, textureY)).addBox(-1.0f, 2.1f, -0.5f, 11, 1, 1);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(2.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 10, 3, textureX, textureY)).addBox(10.0f, 2.0f, -1.0f, 2, 3, 2);
        (this.gunModel[5] = new ModelRendererTurbo(this, 0, 23, textureX, textureY)).addBox(10.5f, 4.2f, -0.5f, 1, 1, 1);
        this.slideModel = new ModelRendererTurbo[4];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 15, textureX, textureY)).addBox(-2.0f, 2.0f, -1.0f, 4, 3, 2);
        (this.slideModel[1] = new ModelRendererTurbo(this, 0, 20, textureX, textureY)).addBox(2.0f, 2.0f, -1.0f, 8, 1, 2);
        (this.slideModel[2] = new ModelRendererTurbo(this, 0, 23, textureX, textureY)).addBox(-3.0f, 3.0f, -0.5f, 1, 1, 1);
        (this.slideModel[3] = new ModelRendererTurbo(this, 0, 23, textureX, textureY)).addBox(-1.5f, 4.2f, -0.5f, 1, 1, 1);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 25, textureX, textureY)).addBox(-1.5f, -2.8f, -0.5f, 2, 4, 1);
        this.translateAll(0.0f, 1.0f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.75f, 0.28125f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.3125f, 0.375f, 0.0f);
        this.scopeIsOnSlide = false;
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
