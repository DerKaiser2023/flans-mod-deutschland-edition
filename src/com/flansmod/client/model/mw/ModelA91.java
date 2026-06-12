// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelA91 extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelA91() {
        this.textureX = 64;
        this.textureY = 16;
        (this.gunModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 32, 5, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 0, 9, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 12, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 10, 3, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 10, 5, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 22, 3, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 14, 5, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 32, 0, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 36, 0, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 12, 13, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 6, 12, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 16, 7, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 0, 5, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 40, 0, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 2, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].func_78793_a(-7.0f, -3.0f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f, 0.0f, -0.5f, -0.25f);
        this.gunModel[1].func_78793_a(4.0f, -2.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f, -0.25f, -0.5f, -0.25f);
        this.gunModel[2].func_78793_a(0.0f, -2.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 2, 0.0f, 0.5f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.5f, 0.0f, -0.25f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f);
        this.gunModel[3].func_78793_a(-7.0f, -4.0f, -1.0f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(-2.0f, -4.0f, -1.0f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 5, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[5].func_78793_a(-1.0f, -5.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, -0.5f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.gunModel[6].func_78793_a(3.5f, -5.0f, -1.0f);
        this.gunModel[7].func_78790_a(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f);
        this.gunModel[7].func_78793_a(-1.0f, -3.5f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f);
        this.gunModel[8].func_78793_a(8.0f, -3.0f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.gunModel[9].func_78793_a(11.0f, -3.0f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(7.0f, -5.0f, -0.5f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.25f, -0.8f, -0.25f, 0.0f, -0.8f, -0.25f, 0.0f, -0.8f, -0.25f, 0.25f, -0.8f, -0.25f, 0.25f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.25f, 0.0f, -0.25f);
        this.gunModel[11].func_78793_a(2.0f, -1.5f, -1.0f);
        this.gunModel[12].addShapeBox(-8.0f, -4.0f, -1.0f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[13].addShapeBox(-6.0f, -2.0f, -1.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[14].addShapeBox(0.0f, -0.5f, -1.0f, 2, 2, 2, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.5f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, -0.25f, -0.5f, -0.25f);
        this.gunModel[15].addShapeBox(-8.0f, -2.0f, -1.0f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.ammoModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo(this, 24, 5, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 24, 8, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 24, 12, this.textureX, this.textureY);
        this.ammoModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f);
        this.ammoModel[0].func_78793_a(-4.0f, -2.0f, -1.0f);
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.ammoModel[1].func_78793_a(-4.0f, -1.0f, -1.0f);
        this.ammoModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.25f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.25f, 0.0f);
        this.ammoModel[2].func_78793_a(-3.75f, 1.0f, -1.0f);
        this.barrelAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.BULLPUP;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
