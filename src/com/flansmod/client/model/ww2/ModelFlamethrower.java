// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelFlamethrower extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelFlamethrower() {
        this.textureX = 64;
        this.textureY = 16;
        (this.gunModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 14, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 28, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 36, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 22, 3, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 8, 6, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 30, 3, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, -4.0f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -0.25f, 0.0f, 0.5f, -0.25f, 0.0f, 0.5f, -0.25f, 0.0f, 0.5f, -0.25f);
        this.gunModel[1].func_78793_a(3.25f, -2.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f, -0.25f, 0.5f, -0.25f);
        this.gunModel[2].func_78793_a(0.0f, -2.0f, -1.0f);
        this.gunModel[3].func_78790_a(0.0f, 0.0f, 0.0f, 10, 1, 1, 0.0f);
        this.gunModel[3].func_78793_a(-10.0f, -3.5f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, -0.8f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.gunModel[4].func_78793_a(1.5f, -1.5f, -1.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, -0.5f, 0.5f, -0.25f, 0.0f, 0.5f, -0.25f);
        this.gunModel[5].func_78793_a(0.0f, -0.5f, -1.0f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
        this.gunModel[6].func_78793_a(1.5f, -2.0f, -1.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(5.0f, -4.5f, -1.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(8.0f, -4.0f, -1.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(6.0f, -4.5f, -1.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(-13.0f, -4.0f, -1.0f);
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.NONE;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
