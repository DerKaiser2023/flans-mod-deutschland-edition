// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelType100 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelType100() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 275, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 300, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 30, 250, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 80, 250, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 120, 250, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f);
        this.gunModel[0].setRotationPoint(-1.3f, -1.0f, -1.0f);
        this.gunModel[0].rotateAngleZ = 0.6632251f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 2, 2, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -3.0f, -0.5f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 12, 2, 2, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, -3.0f, -1.5f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[3].setRotationPoint(-3.0f, -2.5f, -1.0f);
        this.gunModel[3].rotateAngleZ = -0.3569146f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f);
        this.gunModel[4].setRotationPoint(-9.0f, -2.5f, -1.0f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 7, 2, 2, 0.0f);
        this.gunModel[5].setRotationPoint(-9.0f, -0.5f, -1.0f);
        this.gunModel[5].rotateAngleZ = 0.2094395f;
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 22, 2, 2, 0.0f);
        this.gunModel[6].setRotationPoint(1.2f, -4.0f, -1.0f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(23.0f, -3.5f, -0.5f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f);
        this.gunModel[8].setRotationPoint(15.5f, -2.0f, -0.8f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 7, 1, 2, 0.0f);
        this.gunModel[9].setRotationPoint(15.5f, -2.0f, -1.2f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(11.0f, -4.0f, -2.0f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(2.5f, -1.0f, -0.5f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 3, 2, 1, 0.0f);
        this.gunModel[12].setRotationPoint(9.0f, -3.7f, 0.3f);
        (this.ammoModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 0, 320, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 0, 330, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, 0.0f, 0.0f, 2, 1, 4, 0.0f);
        this.ammoModel[0].setRotationPoint(9.5f, -3.5f, 0.0f);
        this.ammoModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f);
        this.ammoModel[1].setRotationPoint(9.5f, -3.5f, 4.0f);
        this.ammoModel[1].rotateAngleY = -0.1745329f;
        this.ammoModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 1, 3, 0.0f);
        this.ammoModel[2].setRotationPoint(10.0f, -3.5f, 7.0f);
        this.ammoModel[2].rotateAngleY = -0.5235988f;
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.SIDE_CLIP;
        this.flipAll();
    }
}
