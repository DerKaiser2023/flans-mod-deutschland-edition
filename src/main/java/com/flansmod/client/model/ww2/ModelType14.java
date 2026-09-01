// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelType14 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelType14() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 58, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 285, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 305, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 73, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, -0.3f, 1, 5, 1, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[0].rotateAngleZ = -0.2617994f;
        this.gunModel[1].addBox(0.0f, 0.0f, -0.7f, 1, 5, 1, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[1].rotateAngleZ = -0.2617994f;
        this.gunModel[2].addBox(0.3f, 0.0f, -0.3f, 1, 5, 1, 0.0f);
        this.gunModel[2].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[2].rotateAngleZ = -0.2617994f;
        this.gunModel[3].addBox(0.3f, 0.0f, -0.7f, 1, 5, 1, 0.0f);
        this.gunModel[3].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.gunModel[3].rotateAngleZ = -0.2617994f;
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[4].setRotationPoint(-1.2f, -3.0f, -0.6f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(0.3f, -2.0f, -0.5f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f);
        this.gunModel[6].setRotationPoint(0.5f, -3.3f, -0.5f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-1.2f, -3.5f, -0.4f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.gunModel[8].setRotationPoint(-1.0f, -2.5f, -0.5f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 1, 0, 0.0f);
        this.gunModel[9].setRotationPoint(4.2f, -3.6f, 0.0f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(-1.2f, -3.5f, -0.6f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(-1.2f, -3.0f, -0.4f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 306, this.textureX, this.textureY)).addBox(0.2f, 0.5f, -0.5f, 1, 4, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.ammoModel[0].rotateAngleZ = -0.2617994f;
        this.slideModel = new ModelRendererTurbo[1];
        (this.slideModel[0] = new ModelRendererTurbo(this, 0, 295, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.slideModel[0].setRotationPoint(-1.5f, -3.3f, -0.5f);
        this.gunSlideDistance = 0.1f;
        this.animationType = EnumAnimationType.PISTOL_CLIP;
        this.flipAll();
    }
}
