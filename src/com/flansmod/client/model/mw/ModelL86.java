// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelL86 extends ModelGun
{
    public ModelL86() {
        final int textureX = 64;
        final int textureY = 16;
        this.gunModel = new ModelRendererTurbo[8];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-8.0f, 1.0f, -1.0f, 1, 4, 2);
        (this.gunModel[1] = new ModelRendererTurbo(this, 6, 0, textureX, textureY)).addShapeBox(-7.0f, 2.0f, -1.0f, 8, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 26, 0, textureX, textureY)).addShapeBox(-4.0f, 1.0f, -1.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.625f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, -0.375f, 0.0f, 0.0f, -0.625f, 0.0f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(1.0f, 3.0f, -1.0f, 8, 2, 2);
        (this.gunModel[4] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(9.0f, 3.5f, -0.5f, 8, 1, 1);
        (this.gunModel[5] = new ModelRendererTurbo(this, 0, 12, textureX, textureY)).addBox(9.0f, 3.0f, -1.0f, 6, 1, 2);
        (this.gunModel[6] = new ModelRendererTurbo(this, 18, 5, textureX, textureY)).addBox(7.5f, 4.5f, -0.5f, 1, 1, 1);
        (this.gunModel[7] = new ModelRendererTurbo(this, 17, 11, textureX, textureY)).addShapeBox(3.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[3];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 25, 9, textureX, textureY)).addBox(-4.0f, -4.0f, -1.0f, 2, 5, 2);
        (this.ammoModel[1] = new ModelRendererTurbo(this, 41, 9, textureX, textureY)).addShapeBox(-4.0f, -4.0f, -3.0f, 2, 5, 2, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.ammoModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY)).addShapeBox(-4.0f, -4.0f, 1.0f, 2, 5, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f);
        this.stockAttachPoint = new Vector3f(-0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.734375f, 0.21875f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.125f, 0.3125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.875f, 0.1875f, 0.0f);
        this.defaultGripModel = new ModelRendererTurbo[3];
        (this.defaultGripModel[0] = new ModelRendererTurbo(this, 34, 0, textureX, textureY)).addBox(15.0f, 2.0f, -1.0f, 1, 1, 2);
        (this.defaultGripModel[1] = new ModelRendererTurbo(this, 44, 0, textureX, textureY)).addShapeBox(15.0f, -3.0f, -1.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.defaultGripModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY)).addShapeBox(15.0f, -3.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.25f;
        this.animationType = EnumAnimationType.BULLPUP;
        this.tiltGunTime = 0.1f;
        this.unloadClipTime = 0.2f;
        this.loadClipTime = 0.2f;
        this.untiltGunTime = 0.5f;
    }
}
