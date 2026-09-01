// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelThompson extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelThompson() {
        this.textureX = 128;
        this.textureY = 128;
        (this.gunModel = new ModelRendererTurbo[17])[0] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 105, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 113, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 41, 33, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 105, 25, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 50, 15, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 10, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -7.0f, -2.0f);
        this.gunModel[1].addBox(0.0f, 0.0f, 0.0f, 20, 4, 5, 0.0f);
        this.gunModel[1].setRotationPoint(-8.0f, -13.0f, -2.5f);
        this.gunModel[2].addBox(0.0f, 0.0f, 0.0f, 5, 2, 4, 0.0f);
        this.gunModel[2].setRotationPoint(12.0f, -13.0f, -2.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 3, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(17.0f, -13.0f, -1.5f);
        this.gunModel[4].addBox(0.0f, 0.0f, 0.0f, 20, 2, 2, 0.0f);
        this.gunModel[4].setRotationPoint(21.0f, -13.0f, -1.0f);
        this.gunModel[5].addBox(0.0f, 0.0f, 0.0f, 16, 4, 3, 0.0f);
        this.gunModel[5].setRotationPoint(21.0f, -12.0f, -1.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 3, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.gunModel[6].setRotationPoint(41.0f, -13.5f, -1.5f);
        this.gunModel[7].addBox(0.0f, 0.0f, 0.0f, 4, 3, 1, 0.0f);
        this.gunModel[7].setRotationPoint(-5.0f, -14.7f, 1.0f);
        this.gunModel[7].rotateAngleZ = -0.7853982f;
        this.gunModel[8].addBox(0.0f, 0.0f, 0.0f, 4, 3, 1, 0.0f);
        this.gunModel[8].setRotationPoint(-5.0f, -14.7f, -2.0f);
        this.gunModel[8].rotateAngleZ = -0.7853982f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[9].setRotationPoint(42.0f, -15.0f, -1.0f);
        this.gunModel[10].addBox(0.0f, 0.0f, 0.0f, 16, 1, 4, 0.0f);
        this.gunModel[10].setRotationPoint(-4.0f, -9.0f, -2.0f);
        this.gunModel[11].addBox(0.0f, 0.0f, 0.0f, 10, 1, 4, 0.0f);
        this.gunModel[11].setRotationPoint(-4.0f, -8.0f, -2.0f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 5, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.gunModel[12].setRotationPoint(4.5f, -4.0f, -2.5f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 5, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.gunModel[13].setRotationPoint(10.5f, -3.0f, -2.5f);
        this.gunModel[13].rotateAngleZ = 1.5707964f;
        this.gunModel[14].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.gunModel[14].setRotationPoint(7.0f, -8.0f, -0.5f);
        this.gunModel[14].rotateAngleZ = 0.08726646f;
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 5, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f);
        this.gunModel[15].setRotationPoint(4.5f, -11.5f, -4.1f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 3, 0.0f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f, -0.45f, 0.0f, -0.75f);
        this.gunModel[16].setRotationPoint(-5.5f, -14.4f, -1.5f);
        (this.defaultStockModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.defaultStockModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.defaultStockModel[2] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
        this.defaultStockModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 17, 8, 5, 0.0f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.defaultStockModel[0].setRotationPoint(-27.0f, -7.0f, -2.5f);
        this.defaultStockModel[0].rotateAngleZ = 0.06981317f;
        this.defaultStockModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 11, 3, 5, 0.0f, -6.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f);
        this.defaultStockModel[1].setRotationPoint(-18.0f, -4.0f, -2.5f);
        this.defaultStockModel[1].rotateAngleZ = 0.43633232f;
        this.defaultStockModel[2].addBox(0.0f, 0.0f, 0.0f, 3, 3, 5, 0.0f);
        this.defaultStockModel[2].setRotationPoint(-7.5f, -9.0f, -2.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY)).addBox(12.0f, -11.0f, -2.0f, 4, 16, 4, 0.0f);
        this.ammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.slideModel = new ModelRendererTurbo[1];
        (this.slideModel[0] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f);
        this.slideModel[0].setRotationPoint(9.5f, -11.5f, -4.0f);
        this.gunSlideDistance = 0.6f;
        this.animationType = EnumAnimationType.BOTTOM_CLIP;
        this.translateAll(0.0f, -6.2f, 0.3f);
        this.thirdPersonOffset = new Vector3f(-0.2f, -0.1f, 0.02f);
        this.flipAll();
    }
}
