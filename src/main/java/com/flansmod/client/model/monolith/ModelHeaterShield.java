// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelHeaterShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelHeaterShield() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[8];
        this.initgunModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(1.0f, -1.5f, -6.0f);
        this.gunModel[1].addShapeBox(0.0f, -5.0f, 0.0f, 1, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(1.0f, 0.49f, -6.0f);
        this.gunModel[2].addShapeBox(0.0f, -4.0f, 0.0f, 1, 5, 6, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(1.0f, 6.49f, -6.0f);
        this.gunModel[3].addShapeBox(0.0f, -4.0f, 0.0f, 1, 3, 6, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(1.0f, 11.5f, -6.0f);
        this.gunModel[4].addShapeBox(0.0f, -4.0f, 0.0f, 1, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, 0.0f, -5.5f);
        this.gunModel[4].setRotationPoint(0.99f, 11.49f, 0.0f);
        this.gunModel[5].addShapeBox(0.0f, -4.0f, 0.0f, 1, 5, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f);
        this.gunModel[5].setRotationPoint(0.99f, 6.5f, 0.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[6].setRotationPoint(0.99f, -1.51f, 0.0f);
        this.gunModel[7].addShapeBox(0.0f, -5.0f, 0.0f, 1, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].setRotationPoint(0.99f, 0.5f, 0.0f);
    }
}
