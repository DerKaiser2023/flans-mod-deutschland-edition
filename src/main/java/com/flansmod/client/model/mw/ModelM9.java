// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM9 extends ModelGun
{
    public ModelM9() {
        final int textureX = 32;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[3];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-1.0f, -2.0f, -1.0f, 3, 4, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(-1.0f, 2.0f, -1.0f, 8, 1, 2);
        (this.gunModel[2] = new ModelRendererTurbo(this, 0, 9, textureX, textureY)).addBox(-0.5f, 3.5f, -0.5f, 8, 1, 1);
        this.slideModel = new ModelRendererTurbo[3];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(-1.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.slideModel[1] = new ModelRendererTurbo(this, 10, 2, textureX, textureY)).addBox(5.95f, 4.5f, -0.5f, 1, 1, 1);
        (this.slideModel[2] = new ModelRendererTurbo(this, 8, 0, textureX, textureY)).addBox(-0.8f, 4.5f, -0.5f, 1, 1, 1);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 14, 0, textureX, textureY)).addBox(-0.5f, -1.8f, -0.5f, 2, 4, 1);
        this.barrelAttachPoint = new Vector3f(0.46875f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.scopeIsOnSlide = true;
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
    }
}
