// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelType38sniper extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelType38sniper() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[20])[0] = new ModelRendererTurbo(this, 0, 220, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 240, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 250, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 260, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 80, 250, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 230, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 112, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 112, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 120, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 120, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 100, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 130, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 112, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 0, 50, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[0].setRotationPoint(-2.5f, -1.7f, -1.0f);
        this.gunModel[0].rotateAngleZ = 0.3490658f;
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 1, 2, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, -3.0f, -1.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f);
        this.gunModel[2].setRotationPoint(-3.5f, -2.0f, -1.0f);
        this.gunModel[2].rotateAngleZ = -0.1745329f;
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 2, 2, 0.0f);
        this.gunModel[3].setRotationPoint(-11.0f, -2.0f, -1.0f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 8, 2, 2, 0.0f);
        this.gunModel[4].setRotationPoint(-11.0f, -0.2f, -1.0f);
        this.gunModel[4].rotateAngleZ = 0.2094395f;
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f);
        this.gunModel[5].setRotationPoint(2.5f, -1.0f, -0.5f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 4, 1, 2, 0.0f);
        this.gunModel[6].setRotationPoint(1.0f, -2.0f, -1.0f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 8, 1, 2, 0.0f);
        this.gunModel[7].setRotationPoint(4.7f, -2.0f, -1.0f);
        this.gunModel[7].rotateAngleZ = 0.122173f;
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.gunModel[8].setRotationPoint(13.0f, -4.0f, -1.0f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f);
        this.gunModel[9].setRotationPoint(0.5f, -3.8f, -0.3f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f);
        this.gunModel[10].setRotationPoint(0.5f, -3.8f, -0.7f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[11].setRotationPoint(13.5f, -3.1f, -0.2f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.gunModel[12].setRotationPoint(13.5f, -3.1f, -0.8f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f);
        this.gunModel[13].setRotationPoint(22.0f, -4.0f, -1.0f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 7, 1, 1, 0.0f);
        this.gunModel[14].setRotationPoint(22.0f, -3.7f, -0.5f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[15].setRotationPoint(4.0f, -4.5f, -0.5f);
        this.gunModel[16].addBox(0.0f, 0.0f, 0.0f, 8, 1, 1, 0.0f);
        this.gunModel[16].setRotationPoint(3.0f, -5.3f, -0.3f);
        this.gunModel[17].addBox(0.0f, 0.0f, -0.7f, 8, 1, 1, 0.0f);
        this.gunModel[17].setRotationPoint(3.0f, -5.3f, 0.0f);
        this.gunModel[18].addBox(0.0f, 0.0f, -0.3f, 8, 1, 1, 0.0f);
        this.gunModel[18].setRotationPoint(3.0f, -5.6f, 0.0f);
        this.gunModel[19].addBox(0.0f, 0.0f, -0.7f, 8, 1, 1, 0.0f);
        this.gunModel[19].setRotationPoint(3.0f, -5.6f, 0.0f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY)).addBox(3.0f, -3.5f, -0.5f, 3, 2, 1, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pumpModel = new ModelRendererTurbo[1];
        (this.pumpModel[0] = new ModelRendererTurbo(this, 30, 130, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.pumpModel[0].setRotationPoint(3.0f, -3.7f, -1.5f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.RIFLE;
        this.flipAll();
        this.translateAll(0.0f, 2.0f, 0.0f);
    }
}
