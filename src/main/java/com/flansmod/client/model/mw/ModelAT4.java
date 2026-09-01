// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAT4 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAT4() {
        this.textureX = 256;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[0].setRotationPoint(-1.0f, -3.0f, -0.5f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 18, 3, 3, 0.0f);
        this.gunModel[1].setRotationPoint(-15.0f, -6.0f, -1.5f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f);
        this.gunModel[2].setRotationPoint(2.5f, -6.5f, -2.0f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f);
        this.gunModel[3].setRotationPoint(1.0f, -5.0f, 1.0f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[4].setRotationPoint(1.0f, -6.0f, 4.0f);
        this.gunModel[4].rotateAngleY = -0.1745329f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f);
        this.gunModel[5].setRotationPoint(-16.1f, -6.0f, -1.5f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 4, 4, 0.0f);
        this.gunModel[6].setRotationPoint(-17.2f, -6.5f, -2.0f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[7].setRotationPoint(-18.0f, -5.5f, -1.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f);
        this.ammoModel[0].setRotationPoint(-3.0f, -5.5f, -1.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.NONE;
        this.flipAll();
        this.translateAll(0.0f, 0.0f, 3.0f);
        this.thirdPersonOffset = new Vector3f(0.0f, 0.0f, -0.2f);
        this.itemFrameOffset = new Vector3f(0.6875f, 0.0f, 0.0f);
    }
}
