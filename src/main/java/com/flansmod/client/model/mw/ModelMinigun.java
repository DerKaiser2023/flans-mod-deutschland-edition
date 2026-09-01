// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelMinigun extends ModelGun
{
    public ModelMinigun() {
        final int textureX = 64;
        final int textureY = 64;
        this.gunModel = new ModelRendererTurbo[5];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, -4.0f, -3.0f, 8, 6, 6);
        (this.gunModel[1] = new ModelRendererTurbo(this, 22, 0, textureX, textureY)).addBox(1.0f, -4.0f, 3.0f, 6, 3, 3);
        (this.gunModel[2] = new ModelRendererTurbo(this, 28, 6, textureX, textureY)).addBox(7.0f, 2.0f, -3.0f, 1, 3, 1);
        (this.gunModel[3] = new ModelRendererTurbo(this, 32, 6, textureX, textureY)).addBox(7.0f, 2.0f, 2.0f, 1, 3, 1);
        (this.gunModel[4] = new ModelRendererTurbo(this, 36, 6, textureX, textureY)).addBox(7.0f, 5.0f, -2.0f, 1, 1, 4);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 46, textureX, textureY)).addBox(1.0f, -3.0f, -7.0f, 6, 4, 4);
        this.minigunBarrelModel = new ModelRendererTurbo[12];
        for (int i = 0; i < 6; ++i) {
            (this.minigunBarrelModel[i] = new ModelRendererTurbo(this, 0, 16 + 2 * i, textureX, textureY)).addBox(12.0f, 1.0f, -0.5f, 28, 1, 1);
            this.minigunBarrelModel[i].rotateAngleX = i * 3.1415927f / 3.0f;
            this.minigunBarrelModel[i].setRotationPoint(0.0f, -1.0f, 0.0f);
        }
        (this.minigunBarrelModel[6] = new ModelRendererTurbo(this, 0, 28, textureX, textureY)).addShapeBox(8.0f, 0.0f, -3.0f, 4, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f);
        this.minigunBarrelModel[6].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.minigunBarrelModel[7] = new ModelRendererTurbo(this, 20, 28, textureX, textureY)).addShapeBox(8.0f, -3.0f, -3.0f, 4, 3, 6, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.minigunBarrelModel[7].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.minigunBarrelModel[8] = new ModelRendererTurbo(this, 0, 37, textureX, textureY)).addShapeBox(28.0f, 0.0f, -3.0f, 2, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f);
        this.minigunBarrelModel[8].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.minigunBarrelModel[9] = new ModelRendererTurbo(this, 16, 37, textureX, textureY)).addShapeBox(28.0f, -3.0f, -3.0f, 2, 3, 6, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.minigunBarrelModel[9].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.minigunBarrelModel[10] = new ModelRendererTurbo(this, 32, 37, textureX, textureY)).addShapeBox(36.0f, 0.0f, -3.0f, 2, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f);
        this.minigunBarrelModel[10].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.minigunBarrelModel[11] = new ModelRendererTurbo(this, 48, 37, textureX, textureY)).addShapeBox(36.0f, -3.0f, -3.0f, 2, 3, 6, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.minigunBarrelModel[11].setRotationPoint(0.0f, -1.0f, 0.0f);
        this.minigunBarrelOrigin = new Vector3f(0.5f, -0.0625f, 0.0f);
        this.animationType = EnumAnimationType.SIDE_CLIP;
        this.thirdPersonOffset = new Vector3f(0.0f, -0.15f, 0.0f);
        this.itemFrameOffset = new Vector3f(-1.0f, 0.1875f, 0.0f);
    }
}
