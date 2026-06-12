// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelArquebus extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelArquebus() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[12];
        this.ammoModel = new ModelRendererTurbo[2];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 57, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 9, 25, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 18, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -1.5f, 1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 11, 2, 2, 0.0f, 0.3f, -5.3f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -5.3f, -0.3f, 0.0f, 4.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.5f, -0.3f);
        this.gunModel[1].func_78793_a(-14.0f, -2.0f, 1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(-3.0f, -2.0f, 1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 24, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.gunModel[3].func_78793_a(0.0f, -2.5f, 1.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.2f, 0.2f);
        this.gunModel[4].func_78793_a(24.0f, -2.5f, 1.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.gunModel[5].func_78793_a(4.0f, -2.6f, 1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.gunModel[6].func_78793_a(16.0f, -2.6f, 1.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.gunModel[7].func_78793_a(16.0f, -1.6f, 0.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.gunModel[8].func_78793_a(16.0f, -1.6f, 3.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.gunModel[9].func_78793_a(16.0f, 1.2f, 3.0f);
        this.gunModel[9].field_78795_f = -0.5235988f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f, -0.3f);
        this.gunModel[10].func_78793_a(16.0f, 1.6f, 0.2f);
        this.gunModel[10].field_78795_f = 0.5235988f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 19, 1, 0.0f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f);
        this.gunModel[11].func_78793_a(16.0f, 3.6f, 1.5f);
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 33, 25, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 11, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.ammoModel[0].func_78793_a(0.5f, -3.0f, 0.0f);
        this.ammoModel[0].field_78796_g = -1.5707964f;
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.ammoModel[1].func_78793_a(23.5f, -2.5f, 1.5f);
        this.animationType = EnumAnimationType.END_LOADED;
        this.translateAll(0.0f, -1.0f, -2.0f);
    }
}
