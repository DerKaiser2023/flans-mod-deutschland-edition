// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelSPAS extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelSPAS() {
        this.textureX = 64;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo(this, 0, 7, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 8, 7, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 8, 11, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 8, 16, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 19, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 15, 2, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 16, 19, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 1, 22, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, -2.3f, -1.0f, 2, 3, 2, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, -0.5f, -0.2f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 1.0f, -0.5f, -0.2f);
        this.gunModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[1].addShapeBox(-0.5f, -4.3f, -1.0f, 5, 2, 2, 0.0f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f);
        this.gunModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[2].addBox(4.0f, -5.0f, -1.0f, 2, 3, 2, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(6.0f, -5.0f, -1.0f, 6, 3, 2, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[4].addBox(6.0f, -3.2f, -0.5f, 8, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[5].addBox(7.0f, -4.4f, -0.5f, 8, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[6].addBox(12.0f, -5.4f, -0.5f, 1, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[7].addShapeBox(-2.0f, -3.1f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[7].rotateAngleZ = 0.29670596f;
        this.gunModel[8].addShapeBox(-4.0f, -3.1f, -1.5f, 2, 1, 3, 0.0f, -0.5f, 0.4f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.4f, -0.5f, -0.2f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.2f, -0.5f, -0.5f);
        this.gunModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[8].rotateAngleZ = 0.29670596f;
        this.gunModel[9].addBox(-5.3f, -2.5f, -1.0f, 1, 3, 2, 0.0f);
        this.gunModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.gunModel[9].rotateAngleZ = -0.05235988f;
        this.gunModel[10].addBox(6.0f, -4.4f, -0.5f, 1, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY)).addBox(2.0f, -3.5f, -0.5f, 2, 1, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pumpModel = new ModelRendererTurbo[1];
        (this.pumpModel[0] = new ModelRendererTurbo(this, 23, 6, this.textureX, this.textureY)).addShapeBox(6.75f, -4.25f, -1.5f, 4, 3, 3, 0.0f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.pumpModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.3125f, 0.3125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.546875f, 0.125f, 0.0f);
        this.pumpDelayAfterReload = 115;
        this.pumpDelay = 6;
        this.pumpTime = 9;
        this.gripIsOnPump = true;
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.SHOTGUN;
        this.numBulletsInReloadAnimation = 7.0f;
        this.tiltGunTime = 0.159f;
        this.unloadClipTime = 0.0f;
        this.loadClipTime = 0.708f;
        this.untiltGunTime = 0.133f;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
