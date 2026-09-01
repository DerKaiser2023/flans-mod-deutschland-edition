// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelGlock extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelGlock() {
        this.textureX = 256;
        this.textureY = 16;
        (this.gunModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 5, 2, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -2.5f, -1.0f);
        this.gunModel[0].rotateAngleZ = -0.1396263f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 9, 1, 2, 0.0f);
        this.gunModel[1].setRotationPoint(-1.0f, -3.0f, -1.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -2.5f, -0.5f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[3].setRotationPoint(7.5f, -3.5f, -0.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(1.5f, -1.5f, -0.5f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.0f, -3.5f, -0.5f);
        (this.ammoModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, 2.0f, -0.5f);
        this.ammoModel[0].rotateAngleZ = -0.1396263f;
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f);
        this.ammoModel[1].setRotationPoint(-0.5f, 1.9f, -0.5f);
        this.ammoModel[1].rotateAngleZ = -0.1396263f;
        this.ammoModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.ammoModel[2].setRotationPoint(-0.9f, 6.3f, -0.5f);
        this.ammoModel[2].rotateAngleZ = -0.1396263f;
        (this.slideModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.slideModel[1] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.slideModel[0].addBox(0.0f, 0.0f, 0.0f, 9, 1, 2, 0.0f);
        this.slideModel[0].setRotationPoint(-1.0f, -4.0f, -1.0f);
        this.slideModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.slideModel[1].setRotationPoint(7.0f, -4.5f, -0.5f);
        this.barrelAttachPoint = new Vector3f(0.53125f, 0.25f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.1875f, 0.3125f, 0.0f);
        this.scopeIsOnSlide = true;
        this.gunSlideDistance = 0.2f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
        this.translateAll(0.0f, 1.0f, 0.0f);
    }
}
