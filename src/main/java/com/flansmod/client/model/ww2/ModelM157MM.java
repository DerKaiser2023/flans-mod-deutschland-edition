// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelM157MM extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelM157MM() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.bodyModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 137, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 4, 40, 0.0f);
        this.bodyModel[0].setRotationPoint(9.0f, 2.0f, -20.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 6, 8, 6, 0.0f);
        this.bodyModel[1].setRotationPoint(3.0f, -5.0f, -3.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 58, 2, 5, 0.0f);
        this.bodyModel[2].setRotationPoint(-45.0f, 7.0f, 21.0f);
        this.bodyModel[2].rotateAngleX = -0.05235988f;
        this.bodyModel[2].rotateAngleY = -0.2617994f;
        this.bodyModel[2].rotateAngleZ = 0.08726646f;
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 58, 2, 5, 0.0f);
        this.bodyModel[3].setRotationPoint(-45.0f, 7.0f, -25.0f);
        this.bodyModel[3].rotateAngleX = 0.05235988f;
        this.bodyModel[3].rotateAngleY = 0.2617994f;
        this.bodyModel[3].rotateAngleZ = 0.08726646f;
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 12, 8, 0.0f);
        this.bodyModel[4].setRotationPoint(16.0f, -14.5f, 8.0f);
        this.bodyModel[4].rotateAngleZ = 0.1745329f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 12, 8, 0.0f);
        this.bodyModel[5].setRotationPoint(16.0f, -14.5f, -16.0f);
        this.bodyModel[5].rotateAngleZ = 0.1745329f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 10, 32, 0.0f);
        this.bodyModel[6].setRotationPoint(18.0f, -3.0f, -16.0f);
        (this.turretModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo(this, 497, 1, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo(this, 529, 1, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo(this, 569, 1, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo(this, 785, 1, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo(this, 873, 1, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo(this, 905, 1, this.textureX, this.textureY);
        this.turretModel[0].addBox(0.0f, 0.0f, 0.0f, 10, 3, 13, 0.0f);
        this.turretModel[0].setRotationPoint(-2.0f, -8.0f, -6.0f);
        this.turretModel[1].addBox(11.5f, -18.5f, -11.0f, 1, 21, 22, 0.0f);
        this.turretModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[1].rotateAngleZ = 0.296706f;
        this.turretModel[2].addBox(-14.0f, -18.4f, 14.0f, 15, 11, 1, 0.0f);
        this.turretModel[2].setRotationPoint(1.5f, -0.5f, 1.0f);
        this.turretModel[2].rotateAngleX = 0.2094395f;
        this.turretModel[2].rotateAngleY = -0.7853982f;
        this.turretModel[2].rotateAngleZ = 0.2094395f;
        this.turretModel[3].addBox(-14.0f, -18.4f, -15.0f, 15, 11, 1, 0.0f);
        this.turretModel[3].setRotationPoint(1.5f, -0.5f, -1.0f);
        this.turretModel[3].rotateAngleX = -0.2094395f;
        this.turretModel[3].rotateAngleY = 0.7853982f;
        this.turretModel[3].rotateAngleZ = 0.2094395f;
        this.turretModel[4].addBox(-23.0f, -1.0f, 3.0f, 15, 2, 15, 0.0f);
        this.turretModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[5].addBox(-12.0f, -4.0f, 0.0f, 12, 3, 3, 0.0f);
        this.turretModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[5].rotateAngleZ = 0.1745329f;
        this.turretModel[6].addBox(-23.0f, -1.9f, 0.0f, 11, 3, 3, 0.0f);
        this.turretModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.barrelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo(this, 609, 1, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo(this, 673, 1, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo(this, 697, 1, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-16.0f, -17.0f, -2.0f, 76, 4, 4, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.barrelModel[1].addBox(-4.0f, -12.0f, -2.0f, 24, 4, 4, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.barrelModel[2].addBox(-12.0f, -13.0f, -3.0f, 8, 6, 6, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.barrelModel[3].addBox(-30.0f, -13.0f, -1.5f, 19, 1, 3, 0.0f);
        this.barrelModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.barrelModel[3].rotateAngleZ = 0.01745329f;
        this.leftTrackModel = new ModelRendererTurbo[1];
        (this.leftTrackModel[0] = new ModelRendererTurbo(this, 937, 1, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 14, 14, 5, 0.0f);
        this.leftTrackModel[0].setRotationPoint(4.0f, -3.0f, -22.0f);
        this.rightTrackModel = new ModelRendererTurbo[1];
        (this.rightTrackModel[0] = new ModelRendererTurbo(this, 977, 1, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 14, 14, 5, 0.0f);
        this.rightTrackModel[0].setRotationPoint(4.0f, -3.0f, 17.0f);
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
}
