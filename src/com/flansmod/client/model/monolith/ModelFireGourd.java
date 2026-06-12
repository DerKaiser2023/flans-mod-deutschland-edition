// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelFireGourd extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelFireGourd() {
        this.textureX = 32;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[2];
        this.ammoModel = new ModelRendererTurbo[8];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 25.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 25.0f, 0.0f, 0.0f, 25.0f, 0.0f, 0.0f, 6.0f, 0.3f, 0.3f, 6.0f, 0.3f, 0.3f, 25.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-12.0f, -2.8f, 0.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 6, 2, 2, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.4f, 0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.2f, 0.2f);
        this.gunModel[1].func_78793_a(6.0f, -3.3f, -0.5f);
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.ammoModel[5] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.ammoModel[6] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.ammoModel[7] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.2f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 0.4f, 0.4f);
        this.ammoModel[0].func_78793_a(12.0f, -3.3f, -0.5f);
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.0f, 0.0f, 0.0f);
        this.ammoModel[1].func_78793_a(13.0f, -4.8f, -2.0f);
        this.ammoModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 5, 0.0f, 0.5f, 0.3f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.3f, 0.3f);
        this.ammoModel[2].func_78793_a(15.0f, -4.8f, -2.0f);
        this.ammoModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 1.5f, 1.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 1.5f, 1.5f, 0.0f, 1.5f, 1.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 1.5f, 1.5f);
        this.ammoModel[3].func_78793_a(16.0f, -3.3f, -0.5f);
        this.ammoModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.5f, 0.5f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f, 1.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f, 1.0f, 0.0f, 0.5f, 0.5f);
        this.ammoModel[4].func_78793_a(17.0f, -3.3f, -0.5f);
        this.ammoModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.ammoModel[5].func_78793_a(18.5f, -3.3f, -0.5f);
        this.ammoModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f);
        this.ammoModel[6].func_78793_a(19.5f, -3.3f, -0.5f);
        this.ammoModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.ammoModel[7].func_78793_a(20.5f, -3.3f, -0.5f);
    }
}
