// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelAUG extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelAUG() {
        this.textureX = 32;
        this.textureY = 32;
        (this.gunModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo(this, 0, 7, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 13, 2, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 21, 7, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 8, 12, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 24, 1, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 0, 18, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 27, 4, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 23, 13, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 22, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 5, 22, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(-6.0f, -3.25f, -3.25f, 8, 2, 2, 0.0f);
        this.gunModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[0].field_78795_f = -0.7853982f;
        this.gunModel[1].addShapeBox(-7.0f, -3.0f, -1.0f, 4, 4, 2, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[2].addShapeBox(-3.0f, -3.5f, -1.0f, 4, 2, 2, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[3].addShapeBox(-0.4f, -3.0f, -0.5f, 2, 4, 1, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.gunModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[3].field_78808_h = -0.13962634f;
        this.gunModel[4].addShapeBox(2.0f, -3.0f, -3.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f);
        this.gunModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[4].field_78795_f = -0.7853982f;
        this.gunModel[5].addShapeBox(7.0f, -3.4f, -0.5f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.gunModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78790_a(-1.5f, -5.0f, -0.5f, 8, 2, 1, 0.0f);
        this.gunModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[7].addShapeBox(6.5f, -5.0f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78790_a(4.5f, -2.6f, -0.5f, 3, 1, 1, 0.0f);
        this.gunModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[9].addShapeBox(-2.5f, -5.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[10].addShapeBox(-7.0f, -3.25f, -3.25f, 1, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.gunModel[10].field_78795_f = -0.7853982f;
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 1, 12, this.textureX, this.textureY)).func_78790_a(-4.0f, -2.7f, -0.5f, 2, 4, 1, 0.0f);
        this.ammoModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.ammoModel[0].field_78808_h = 0.15707964f;
        (this.slideModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 19, 17, this.textureX, this.textureY);
        this.slideModel[1] = new ModelRendererTurbo(this, 19, 17, this.textureX, this.textureY);
        this.slideModel[0].addShapeBox(3.0f, -4.1f, 0.4f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.slideModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.slideModel[1].addShapeBox(3.0f, -4.1f, -1.4f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.slideModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.barrelAttachPoint = new Vector3f(0.5625f, 0.171875f, 0.0f);
        this.stockAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.scopeAttachPoint = new Vector3f(0.25f, 0.3125f, 0.0f);
        this.gripAttachPoint = new Vector3f(0.0f, 0.0f, 0.0f);
        this.gunSlideDistance = 0.0f;
        this.animationType = EnumAnimationType.ALT_PISTOL_CLIP;
        this.hasArms = true;
        this.leftArmPos = new Vector3f(0.0f, -0.2f, 0.0f);
        this.leftArmRot = new Vector3f(90.0f, 45.0f, 0.0f);
        this.leftArmReloadPos = new Vector3f(-0.6f, -0.5f, 0.0f);
        this.leftArmReloadRot = new Vector3f(90.0f, 20.0f, 0.0f);
        this.rightArmPos = new Vector3f(0.4f, -0.5f, 0.0f);
        this.rightArmRot = new Vector3f(0.0f, 0.0f, -90.0f);
        this.rightArmReloadPos = new Vector3f(0.4f, -0.6f, 0.0f);
        this.rightArmReloadRot = new Vector3f(-40.0f, 0.0f, -90.0f);
        this.rightHandAmmo = false;
        this.leftHandAmmo = true;
        this.translateAll(1.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
