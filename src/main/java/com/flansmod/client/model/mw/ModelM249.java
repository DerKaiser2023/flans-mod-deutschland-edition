// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelM249 extends ModelGun
{
    public ModelM249() {
        final int textureX = 64;
        final int textureY = 32;
        (this.gunModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 9, textureX, textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 14, textureX, textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 4, 27, textureX, textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 4, 25, textureX, textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 4, 23, textureX, textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 12, 24, textureX, textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 7, textureX, textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 6, 6, textureX, textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 12, 22, textureX, textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 22, 18, textureX, textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 10, 7, textureX, textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 20, 14, textureX, textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 20, 16, textureX, textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f);
        this.gunModel[0].setRotationPoint(6.0f, 3.8f, -0.5f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 8, 2, 2, 0.0f);
        this.gunModel[1].setRotationPoint(6.0f, 3.0f, -1.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(6.0f, 2.5f, -0.5f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(4.9f, 4.2f, -0.5f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(9.2f, 4.3f, -0.2f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(9.2f, 4.3f, -0.8f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(9.7f, 4.4f, -0.5f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 3, 3, 2, 0.0f);
        this.gunModel[11].setRotationPoint(3.0f, 2.5f, -1.0f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(3.5f, 2.2f, -0.5f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.gunModel[13].setRotationPoint(3.5f, 0.2f, -0.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(5.8f, 3.5f, -1.1f);
        this.gunModel[4].addBox(0.0f, 0.0f, -1.0f, 2, 2, 1, 0.0f);
        this.gunModel[4].setRotationPoint(6.8f, 2.9f, 1.2f);
        this.gunModel[5].addBox(0.0f, -0.6666667f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(5.0f, 5.0f, -0.9f);
        this.gunModel[6].addBox(0.0f, -0.6666667f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(5.0f, 5.0f, -0.1f);
        this.gunModel[7].addBox(0.0f, -0.6666667f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(5.1f, 5.1f, -0.5f);
        this.scopeAttachPoint = new Vector3f(0.125f, 0.2083125f, 0.0f);
        (this.defaultStockModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo(this, 20, 11, textureX, textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 24, 11, textureX, textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        this.defaultStockModel[3] = new ModelRendererTurbo(this, 20, 7, textureX, textureY);
        this.defaultStockModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.defaultStockModel[0].setRotationPoint(2.0f, 3.3f, -0.8f);
        this.defaultStockModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.defaultStockModel[1].setRotationPoint(2.0f, 3.3f, -0.2f);
        this.defaultStockModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.defaultStockModel[2].setRotationPoint(1.0f, 4.4f, -0.5f);
        this.defaultStockModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.defaultStockModel[3].setRotationPoint(0.0f, 2.4f, -0.5f);
        this.stockAttachPoint = new Vector3f(0.0625f, 0.25f, 0.0f);
        this.barrelAttachPoint = new Vector3f(1.125f, 0.25f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.5f, 0.03125f, 0.0f);
        (this.defaultGripModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
        this.defaultGripModel[1] = new ModelRendererTurbo(this, 0, 24, textureX, textureY);
        this.defaultGripModel[2] = new ModelRendererTurbo(this, 0, 29, textureX, textureY);
        this.defaultGripModel[3] = new ModelRendererTurbo(this, 4, 29, textureX, textureY);
        this.defaultGripModel[0].addBox(0.0f, -1.0f, 0.0f, 4, 1, 2, 0.0f);
        this.defaultGripModel[0].setRotationPoint(8.5f, 3.0f, -1.0f);
        this.defaultGripModel[1].addBox(0.0f, -3.0f, 0.0f, 1, 3, 1, 0.0f);
        this.defaultGripModel[1].setRotationPoint(10.5f, 2.5f, -0.5f);
        this.defaultGripModel[1].rotateAngleZ = -0.3141593f;
        this.defaultGripModel[2].addBox(0.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultGripModel[2].setRotationPoint(10.4f, 3.4f, 0.1f);
        this.defaultGripModel[3].addBox(0.0f, -1.0f, 0.0f, 1, 1, 1, 0.0f);
        this.defaultGripModel[3].setRotationPoint(10.4f, 3.4f, -1.1f);
        (this.slideModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 18, 20, textureX, textureY);
        this.slideModel[1] = new ModelRendererTurbo(this, 22, 21, textureX, textureY);
        this.slideModel[0].addBox(0.0f, 0.0f, -1.0f, 1, 1, 1, 0.0f);
        this.slideModel[0].setRotationPoint(10.8f, 3.5f, 1.2f);
        this.slideModel[1].addBox(0.0f, 0.0f, -1.0f, 4, 1, 1, 0.0f);
        this.slideModel[1].setRotationPoint(7.8f, 3.5f, 1.1f);
        (this.ammoModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 22, 23, textureX, textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 12, 19, textureX, textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f);
        this.ammoModel[0].setRotationPoint(5.8f, 0.0f, -2.4f);
        this.ammoModel[1].addBox(0.0f, 2.5f, -1.5f, 2, 2, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(6.266667f, 0.0f, -2.5f);
        this.ammoModel[1].rotateAngleX = 0.6806784f;
        this.ammoModel[1].rotateAngleY = 0.01745329f;
        this.translateAll(-3.0f, -2.2f, 0.0f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.tiltGunTime = 0.1f;
        this.unloadClipTime = 0.2f;
        this.loadClipTime = 0.2f;
        this.untiltGunTime = 0.5f;
    }
}
