// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelChinaCrossbow extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelChinaCrossbow() {
        this.textureX = 64;
        this.textureY = 64;
        this.gunModel = new ModelRendererTurbo[21];
        this.ammoModel = new ModelRendererTurbo[3];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 9, 17, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 9, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.gunModel[0].func_78793_a(2.0f, -3.0f, -1.0f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].func_78793_a(-3.0f, -3.0f, -1.0f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(11.0f, -3.0f, -1.0f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.gunModel[3].func_78793_a(-2.8f, -1.0f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.gunModel[4].func_78793_a(0.2f, -1.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f, -0.2f, -0.3f, 0.0f);
        this.gunModel[5].func_78793_a(-2.8f, -0.3f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f);
        this.gunModel[6].func_78793_a(-1.8f, -1.2f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.gunModel[7].func_78793_a(-1.8f, -3.5f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[8].func_78793_a(15.5f, -2.5f, 0.0f);
        this.gunModel[8].field_78796_g = -0.2268928f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -3.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(15.5f, -2.5f, 0.0f);
        this.gunModel[9].field_78796_g = 0.2268928f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(16.2f, -2.5f, 2.7f);
        this.gunModel[10].field_78796_g = -0.05235988f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, -4.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[11].func_78793_a(16.2f, -2.5f, -2.7f);
        this.gunModel[11].field_78796_g = 0.05235988f;
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[12].func_78793_a(16.4f, -2.5f, 6.3f);
        this.gunModel[12].field_78796_g = 0.34906584f;
        this.gunModel[13].addShapeBox(0.0f, 0.0f, -8.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[13].func_78793_a(16.4f, -2.5f, -6.3f);
        this.gunModel[13].field_78796_g = -0.34906584f;
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.gunModel[14].func_78793_a(11.5f, -2.5f, -2.5f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.2f, -0.1f, -0.2f, 0.7f, 0.2f, -0.2f, 0.7f, 0.2f, -0.2f, 0.2f, -0.1f, -0.2f, 0.2f, -0.1f, -0.2f, 0.7f, 0.2f, -0.2f, 0.7f, 0.2f, -0.2f, 0.2f, -0.1f, -0.2f);
        this.gunModel[15].func_78793_a(11.5f, -2.5f, -2.4f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f);
        this.gunModel[16].func_78793_a(16.7f, -2.5f, -2.4f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 1, 0.0f, 0.2f, -0.1f, -0.2f, 0.7f, 0.2f, -0.2f, 0.7f, 0.2f, -0.2f, 0.2f, -0.1f, -0.2f, 0.2f, -0.1f, -0.2f, 0.7f, 0.2f, -0.2f, 0.7f, 0.2f, -0.2f, 0.2f, -0.1f, -0.2f);
        this.gunModel[17].func_78793_a(11.5f, -2.5f, 1.4f);
        this.gunModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 0, 1, 1, 0.0f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, -0.2f);
        this.gunModel[18].func_78793_a(16.7f, -2.5f, 1.4f);
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.gunModel[19].func_78793_a(-2.0f, -3.8f, -0.5f);
        this.gunModel[19].field_78796_g = 0.6806784f;
        this.gunModel[19].field_78808_h = -0.05235988f;
        this.gunModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 22, 1, 1, 0.0f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f, -0.3f);
        this.gunModel[20].func_78793_a(-2.6f, -3.8f, -0.1f);
        this.gunModel[20].field_78796_g = -0.6806784f;
        this.gunModel[20].field_78808_h = -0.05235988f;
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 25, 33, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 15, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.ammoModel[0].func_78793_a(-1.0f, -3.8f, -0.5f);
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.2f);
        this.ammoModel[1].func_78793_a(14.0f, -3.8f, -0.5f);
        this.ammoModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 1, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, -0.45f, 0.0f, -0.4f, 0.0f);
        this.ammoModel[2].func_78793_a(15.0f, -3.8f, -0.5f);
        this.gunSlideDistance = 0.5f;
        this.animationType = EnumAnimationType.CROSSBOW;
        this.hasFlash = true;
        this.hasArms = true;
        this.leftArmPos = new Vector3f(-0.1f, -0.4f, -0.05f);
        this.leftArmRot = new Vector3f(70.0f, 40.0f, 0.0f);
        this.leftArmReloadPos = new Vector3f(-0.3f, -0.65f, 0.0f);
        this.leftArmReloadRot = new Vector3f(70.0f, 30.0f, 10.0f);
        this.rightArmChargePos = new Vector3f(-0.18f, 0.5f, -0.1f);
        this.rightArmChargeRot = new Vector3f(0.0f, 0.0f, -90.0f);
        this.rightArmPos = new Vector3f(0.3f, -0.9f, 0.0f);
        this.rightArmRot = new Vector3f(0.0f, 0.0f, -90.0f);
        this.rightArmReloadPos = new Vector3f(0.3f, -0.8f, 0.0f);
        this.rightArmReloadRot = new Vector3f(0.0f, 0.0f, -90.0f);
        this.rightHandAmmo = false;
        this.leftHandAmmo = true;
        this.chargeHandleDistance = 1.6f;
        this.chargeDelay = 0;
        this.chargeDelayAfterReload = 80;
        this.chargeTime = 10;
        this.rightHandCharge = true;
        this.chargeModifier = new Vector3f(8.0f, 8.0f, 20.0f);
        this.translateAll(0.0f, -2.5f, 0.0f);
    }
}
