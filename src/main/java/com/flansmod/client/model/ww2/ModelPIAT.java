// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelPIAT extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelPIAT() {
        this.textureX = 128;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo(this, 0, 11, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 18, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 22, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 28, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 32, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 37, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 44, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 0, 56, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 0, 60, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 64, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 93, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 93, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 0, 99, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 0, 3, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 103, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 0, 113, this.textureX, this.textureY);
        this.gunModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f);
        this.gunModel[0].setRotationPoint(0.0f, 0.0f, -1.0f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 6, 1, 2, 0.0f);
        this.gunModel[1].setRotationPoint(0.0f, 4.0f, -1.0f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f);
        this.gunModel[2].setRotationPoint(5.0f, 0.0f, -1.0f);
        this.gunModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[3].setRotationPoint(3.0f, 0.0f, -0.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 7, 2, 2, 0.0f);
        this.gunModel[4].setRotationPoint(0.0f, -2.0f, -1.0f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 22, 3, 3, 0.0f);
        this.gunModel[5].setRotationPoint(-12.0f, -5.0f, -1.5f);
        this.gunModel[6].addBox(0.0f, 0.0f, 0.0f, 2, 7, 4, 0.0f);
        this.gunModel[6].setRotationPoint(-14.0f, -7.0f, -2.0f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 2, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-8.0f, -7.0f, 0.5f);
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 3, 3, 1, 0.0f);
        this.gunModel[8].setRotationPoint(4.0f, -8.0f, 0.5f);
        this.gunModel[9].addBox(0.0f, 0.0f, 0.0f, 1, 5, 5, 0.0f);
        this.gunModel[9].setRotationPoint(10.0f, -6.0f, -2.5f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 7, 4, 1, 0.0f);
        this.gunModel[10].setRotationPoint(11.0f, -5.0f, -2.5f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 7, 4, 1, 0.0f);
        this.gunModel[11].setRotationPoint(11.0f, -5.0f, 1.5f);
        this.gunModel[12].addBox(0.0f, 0.0f, 0.0f, 7, 1, 3, 0.0f);
        this.gunModel[12].setRotationPoint(11.0f, -2.0f, -1.5f);
        this.gunModel[13].addBox(0.0f, 0.0f, 0.0f, 2, 1, 5, 0.0f);
        this.gunModel[13].setRotationPoint(16.0f, -6.0f, -2.5f);
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 8, 1, 0.0f);
        this.gunModel[14].setRotationPoint(9.0f, -2.0f, -0.5f);
        this.gunModel[15].addBox(0.0f, 0.0f, 0.0f, 3, 1, 5, 0.0f);
        this.gunModel[15].setRotationPoint(8.0f, 6.0f, -2.5f);
        (this.ammoModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo(this, 0, 75, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 0, 75, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 0, 75, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo(this, 0, 80, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        this.ammoModel[5] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        this.ammoModel[6] = new ModelRendererTurbo(this, 0, 83, this.textureX, this.textureY);
        this.ammoModel[7] = new ModelRendererTurbo(this, 0, 88, this.textureX, this.textureY);
        this.ammoModel[8] = new ModelRendererTurbo(this, 0, 88, this.textureX, this.textureY);
        this.ammoModel[9] = new ModelRendererTurbo(this, 0, 88, this.textureX, this.textureY);
        this.ammoModel[0].addBox(0.0f, -0.5f, -1.5f, 1, 1, 3, 0.0f);
        this.ammoModel[0].setRotationPoint(11.0f, -3.5f, 0.0f);
        this.ammoModel[1].addShapeBox(0.0f, -1.5f, -1.5f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[1].setRotationPoint(11.0f, -3.5f, 0.0f);
        this.ammoModel[2].addShapeBox(0.0f, 0.5f, -1.5f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.ammoModel[2].setRotationPoint(11.0f, -3.5f, 0.0f);
        this.ammoModel[3].addBox(1.0f, -0.5f, -0.5f, 9, 1, 1, 0.0f);
        this.ammoModel[3].setRotationPoint(11.0f, -3.5f, 0.0f);
        this.ammoModel[4].addShapeBox(0.0f, -1.5f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[4].setRotationPoint(14.0f, -3.5f, 0.0f);
        this.ammoModel[5].addBox(0.0f, -0.5f, -1.5f, 3, 1, 3, 0.0f);
        this.ammoModel[5].setRotationPoint(14.0f, -3.5f, 0.0f);
        this.ammoModel[6].addShapeBox(0.0f, 0.5f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.ammoModel[6].setRotationPoint(14.0f, -3.5f, 0.0f);
        this.ammoModel[7].addShapeBox(0.0f, -1.5f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[7].setRotationPoint(17.0f, -3.5f, 0.0f);
        this.ammoModel[8].addShapeBox(0.0f, -0.5f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[8].setRotationPoint(17.0f, -3.5f, 0.0f);
        this.ammoModel[9].addShapeBox(0.0f, 0.5f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.ammoModel[9].setRotationPoint(17.0f, -3.5f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.END_LOADED;
        this.flipAll();
        this.translateAll(0.0f, 1.0f, 0.0f);
    }
}
