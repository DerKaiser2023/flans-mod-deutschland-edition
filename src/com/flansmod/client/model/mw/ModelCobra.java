// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelCobra extends ModelPlane
{
    public ModelCobra() {
        final int textureX = 512;
        final int textureY = 256;
        this.bodyModel = new ModelRendererTurbo[12];
        (this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-24.0f, 8.0f, -10.0f, 48, 32, 20);
        (this.bodyModel[1] = new ModelRendererTurbo(this, 0, 54, textureX, textureY)).addBox(-64.0f, 8.0f, -10.0f, 40, 16, 20);
        (this.bodyModel[2] = new ModelRendererTurbo(this, 0, 92, textureX, textureY)).addShapeBox(-40.0f, 24.0f, -10.0f, 16, 16, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        (this.bodyModel[3] = new ModelRendererTurbo(this, 74, 92, textureX, textureY)).addShapeBox(-64.0f, 24.0f, -10.0f, 24, 16, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -6.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -6.0f, -6.0f, -2.0f);
        this.bodyModel[4] = new ModelRendererTurbo(this, 0, 92, textureX, textureY);
        this.bodyModel[4].flip = true;
        this.bodyModel[4].addShapeBox(-40.0f, 24.0f, -10.0f, 16, 16, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[5] = new ModelRendererTurbo(this, 74, 92, textureX, textureY);
        this.bodyModel[5].flip = true;
        this.bodyModel[5].addShapeBox(-64.0f, 24.0f, -10.0f, 24, 16, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, -6.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -6.0f, -6.0f, -2.0f);
        (this.bodyModel[6] = new ModelRendererTurbo(this, 0, 130, textureX, textureY)).addTrapezoid(-24.0f, 40.0f, -10.0f, 48, 8, 20, 0.0f, -4.0f, 5);
        (this.bodyModel[7] = new ModelRendererTurbo(this, 0, 160, textureX, textureY)).addBox(24.0f, 26.0f, -6.0f, 8, 12, 12);
        (this.bodyModel[8] = new ModelRendererTurbo(this, 42, 160, textureX, textureY)).addBox(0.0f, 26.0f, 10.0f, 24, 12, 4);
        (this.bodyModel[9] = new ModelRendererTurbo(this, 42, 178, textureX, textureY)).addBox(0.0f, 26.0f, -14.0f, 24, 12, 4);
        this.bodyModel[10] = new ModelRendererTurbo(this, 162, 114, textureX, textureY);
        this.bodyModel[10].flip = true;
        this.bodyModel[10].addBox(-64.0f, 8.0f, -10.0f, 40, 16, 20);
        (this.bodyModel[11] = new ModelRendererTurbo(this, 162, 176, textureX, textureY)).addTrapezoid(-72.0f, 16.0f, -10.0f, 8, 8, 20, 0.0f, -3.0f, 3);
        this.rightWingModel = new ModelRendererTurbo[4];
        (this.rightWingModel[0] = new ModelRendererTurbo(this, 162, 52, textureX, textureY)).addShapeBox(-12.0f, 21.0f, -38.0f, 24, 2, 28, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.rightWingModel[1] = new ModelRendererTurbo(this, 162, 84, textureX, textureY)).addBox(-8.0f, 20.0f, -42.0f, 24, 4, 4);
        (this.rightWingModel[2] = new ModelRendererTurbo(this, 162, 94, textureX, textureY)).addBox(-4.0f, 19.0f, -30.0f, 16, 2, 2);
        (this.rightWingModel[3] = new ModelRendererTurbo(this, 162, 100, textureX, textureY)).addBox(-8.0f, 13.0f, -32.0f, 24, 6, 6);
        this.leftWingModel = new ModelRendererTurbo[4];
        (this.leftWingModel[0] = new ModelRendererTurbo(this, 268, 52, textureX, textureY)).addShapeBox(-12.0f, 21.0f, 10.0f, 24, 2, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f);
        (this.leftWingModel[1] = new ModelRendererTurbo(this, 268, 84, textureX, textureY)).addBox(-8.0f, 20.0f, 38.0f, 24, 4, 4);
        (this.leftWingModel[2] = new ModelRendererTurbo(this, 268, 94, textureX, textureY)).addBox(-4.0f, 19.0f, 28.0f, 16, 2, 2);
        (this.leftWingModel[3] = new ModelRendererTurbo(this, 268, 100, textureX, textureY)).addBox(-8.0f, 13.0f, 26.0f, 24, 6, 6);
        this.skidsModel = new ModelRendererTurbo[6];
        (this.skidsModel[0] = new ModelRendererTurbo(this, 0, 196, textureX, textureY)).addBox(-48.0f, -4.0f, -24.0f, 72, 2, 4);
        (this.skidsModel[1] = new ModelRendererTurbo(this, 0, 204, textureX, textureY)).addBox(-48.0f, -4.0f, 20.0f, 72, 2, 4);
        (this.skidsModel[2] = new ModelRendererTurbo(this, 100, 160, textureX, textureY)).addShapeBox(-24.0f, -2.0f, 8.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.skidsModel[3] = new ModelRendererTurbo(this, 110, 160, textureX, textureY)).addShapeBox(16.0f, -2.0f, 8.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.skidsModel[4] = new ModelRendererTurbo(this, 120, 160, textureX, textureY)).addShapeBox(-24.0f, -2.0f, -10.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.skidsModel[5] = new ModelRendererTurbo(this, 130, 160, textureX, textureY)).addShapeBox(16.0f, -2.0f, -10.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel = new ModelRendererTurbo[2];
        (this.tailModel[0] = new ModelRendererTurbo(this, 138, 0, textureX, textureY)).addShapeBox(24.0f, 8.0f, -10.0f, 80, 16, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f);
        (this.tailModel[1] = new ModelRendererTurbo(this, 340, 0, textureX, textureY)).addShapeBox(88.0f, 24.0f, -2.0f, 16, 24, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -20.0f, 0.0f, -1.0f, 16.0f, 0.0f, -1.0f, 16.0f, 0.0f, -1.0f, -20.0f, 0.0f, -1.0f);
        this.heliMainRotorModels = new ModelRendererTurbo[1][4];
        (this.heliMainRotorModels[0][0] = new ModelRendererTurbo(this, 100, 184, textureX, textureY)).addBox(-1.0f, 48.0f, -1.0f, 2, 8, 2);
        (this.heliMainRotorModels[0][1] = new ModelRendererTurbo(this, 110, 184, textureX, textureY)).addBox(-4.0f, 56.0f, -2.0f, 8, 1, 4);
        (this.heliMainRotorModels[0][2] = new ModelRendererTurbo(this, 0, 212, textureX, textureY)).addBox(4.0f, 56.0f, -2.0f, 72, 1, 8);
        (this.heliMainRotorModels[0][3] = new ModelRendererTurbo(this, 0, 223, textureX, textureY)).addBox(4.0f, 56.0f, -2.0f, 72, 1, 8);
        this.heliMainRotorModels[0][3].field_78796_g = 3.1415927f;
        this.heliMainRotorOrigins = new Vector3f[] { new Vector3f(0.0f, 3.0f, 0.0f) };
        this.heliTailRotorModels = new ModelRendererTurbo[1][4];
        (this.heliTailRotorModels[0][0] = new ModelRendererTurbo(this, 138, 38, textureX, textureY)).addBox(111.5f, 43.5f, 1.0f, 1, 1, 4);
        (this.heliTailRotorModels[0][1] = new ModelRendererTurbo(this, 150, 38, textureX, textureY)).addBox(110.0f, 43.5f, 5.0f, 4, 1, 1);
        (this.heliTailRotorModels[0][2] = new ModelRendererTurbo(this, 150, 42, textureX, textureY)).addBox(114.0f, 43.0f, 5.0f, 8, 2, 1);
        (this.heliTailRotorModels[0][3] = new ModelRendererTurbo(this, 150, 46, textureX, textureY)).addBox(102.0f, 43.0f, 5.0f, 8, 2, 1);
        this.heliTailRotorOrigins = new Vector3f[] { new Vector3f(7.0f, 2.75f, 0.0625f) };
        this.heliRotorSpeeds = new float[] { 1.0f };
        final ModelRendererTurbo[][] noseGun = { new ModelRendererTurbo[0], new ModelRendererTurbo[1], null, null };
        (noseGun[1][0] = new ModelRendererTurbo(this, 198, 206, textureX, textureY)).addBox(-4.0f, -3.0f, -3.0f, 8, 6, 6);
        noseGun[2] = new ModelRendererTurbo[0];
        noseGun[3] = new ModelRendererTurbo[6];
        (noseGun[3][0] = new ModelRendererTurbo(this, 162, 206, textureX, textureY)).addBox(4.0f, -3.0f, -3.0f, 2, 6, 6);
        (noseGun[3][1] = new ModelRendererTurbo(this, 162, 220, textureX, textureY)).addBox(6.0f, -2.0f, -2.0f, 16, 1, 1);
        (noseGun[3][2] = new ModelRendererTurbo(this, 162, 224, textureX, textureY)).addBox(6.0f, -2.0f, 1.0f, 16, 1, 1);
        (noseGun[3][3] = new ModelRendererTurbo(this, 162, 228, textureX, textureY)).addBox(6.0f, 1.0f, -2.0f, 16, 1, 1);
        (noseGun[3][4] = new ModelRendererTurbo(this, 162, 232, textureX, textureY)).addBox(6.0f, 1.0f, 1.0f, 16, 1, 1);
        (noseGun[3][5] = new ModelRendererTurbo(this, 180, 206, textureX, textureY)).addBox(18.0f, -3.0f, -3.0f, 2, 6, 6);
        for (final ModelRendererTurbo[] array2 : noseGun) {
            final ModelRendererTurbo[] dorsalGunParts = array2;
            for (final ModelRendererTurbo dorsalGunPart : array2) {
                dorsalGunPart.func_78793_a(-64.0f, 12.0f, 0.0f);
            }
        }
        this.registerGunModel("Nose", noseGun);
        this.translateAll(0.0f, -20.0f, 0.0f);
    }
}
