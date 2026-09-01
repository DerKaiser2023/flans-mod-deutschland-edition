// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.common.vector.Vector3f;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelChinook extends ModelPlane
{
    public ModelChinook() {
        final int textureX = 1024;
        final int textureY = 512;
        this.bodyModel = new ModelRendererTurbo[9];
        (this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-96.0f, 8.0f, -32.0f, 192, 2, 64);
        (this.bodyModel[1] = new ModelRendererTurbo(this, 0, 132, textureX, textureY)).addBox(-96.0f, 10.0f, -32.0f, 192, 64, 2);
        (this.bodyModel[2] = new ModelRendererTurbo(this, 0, 198, textureX, textureY)).addBox(-96.0f, 10.0f, 30.0f, 192, 64, 2);
        (this.bodyModel[3] = new ModelRendererTurbo(this, 0, 66, textureX, textureY)).addBox(-96.0f, 74.0f, -32.0f, 192, 2, 64);
        (this.bodyModel[4] = new ModelRendererTurbo(this, 0, 264, textureX, textureY)).addShapeBox(-96.0f, 10.0f, -48.0f, 192, 32, 16, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.bodyModel[5] = new ModelRendererTurbo(this, 0, 312, textureX, textureY)).addShapeBox(-96.0f, 10.0f, 32.0f, 192, 32, 16, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f);
        (this.bodyModel[6] = new ModelRendererTurbo(this, 512, 314, textureX, textureY)).addBox(-92.0f, 32.0f, -30.0f, 184, 2, 16);
        (this.bodyModel[7] = new ModelRendererTurbo(this, 512, 332, textureX, textureY)).addBox(-92.0f, 32.0f, 14.0f, 184, 2, 16);
        (this.bodyModel[8] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-96.0f, 24.0f, -32.0f, 192, 2, 64);
        this.bodyWheelModel = new ModelRendererTurbo[12];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                (this.bodyWheelModel[3 * i + 6 * j] = new ModelRendererTurbo(this, 624, 32, textureX, textureY)).addBox(0.0f, -8.0f, -2.0f, 4, 16, 4);
                this.bodyWheelModel[3 * i + 6 * j].func_78793_a(-80.0f * ((i == 0) ? 1 : -1), 0.0f, -24.0f * ((j == 0) ? 1 : -1));
                (this.bodyWheelModel[1 + 3 * i + 6 * j] = new ModelRendererTurbo(this, 640, 12, textureX, textureY)).addBox(-6.0f, -14.0f, -4.0f, 16, 16, 3);
                this.bodyWheelModel[1 + 3 * i + 6 * j].func_78793_a(-80.0f * ((i == 0) ? 1 : -1), 0.0f, -24.0f * ((j == 0) ? 1 : -1));
                (this.bodyWheelModel[2 + 3 * i + 6 * j] = new ModelRendererTurbo(this, 640, 12, textureX, textureY)).addBox(-6.0f, -14.0f, 1.0f, 16, 16, 3);
                this.bodyWheelModel[2 + 3 * i + 6 * j].func_78793_a(-80.0f * ((i == 0) ? 1 : -1), 0.0f, -24.0f * ((j == 0) ? 1 : -1));
            }
        }
        this.noseModel = new ModelRendererTurbo[17];
        (this.noseModel[0] = new ModelRendererTurbo(this, 0, 360, textureX, textureY)).addShapeBox(-128.0f, 8.0f, -32.0f, 32, 2, 64, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -8.0f);
        (this.noseModel[1] = new ModelRendererTurbo(this, 0, 426, textureX, textureY)).addShapeBox(-128.0f, 10.0f, -32.0f, 32, 64, 2, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 8.0f, -8.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -4.0f, 8.0f);
        (this.noseModel[2] = new ModelRendererTurbo(this, 68, 426, textureX, textureY)).addShapeBox(-128.0f, 10.0f, 30.0f, 32, 64, 2, 0.0f, 0.0f, -4.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, -8.0f, -4.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -4.0f, -8.0f);
        (this.noseModel[3] = new ModelRendererTurbo(this, 192, 360, textureX, textureY)).addShapeBox(-128.0f, 74.0f, -32.0f, 32, 2, 64, 0.0f, -8.0f, 4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 4.0f, -8.0f, -8.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, -4.0f, -8.0f);
        (this.noseModel[4] = new ModelRendererTurbo(this, 136, 426, textureX, textureY)).addShapeBox(-125.75f, 44.0f, -24.0f, 2, 28, 48, 0.0f, 0.0f, 0.25f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, -1.0f, -4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f);
        (this.noseModel[5] = new ModelRendererTurbo(this, 236, 426, textureX, textureY)).addShapeBox(-152.0f, 12.0f, -24.0f, 24, 2, 48, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -8.0f);
        (this.noseModel[6] = new ModelRendererTurbo(this, 128, 360, textureX, textureY)).addShapeBox(-152.0f, 14.0f, -24.0f, 24, 28, 2, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 8.0f, 0.0f, -4.0f, -8.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, -4.0f, 8.0f);
        (this.noseModel[7] = new ModelRendererTurbo(this, 128, 390, textureX, textureY)).addShapeBox(-152.0f, 14.0f, 22.0f, 24, 28, 2, 0.0f, 0.0f, -4.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, -4.0f, 8.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f);
        (this.noseModel[8] = new ModelRendererTurbo(this, 320, 360, textureX, textureY)).addShapeBox(-152.0f, 42.0f, -24.0f, 24, 2, 48, 0.0f, 0.0f, 4.0f, -8.0f, 4.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 4.0f, -8.0f, 0.0f, -4.0f, -8.0f, 4.25f, 0.0f, 0.0f, 4.25f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f);
        (this.noseModel[9] = new ModelRendererTurbo(this, 448, 0, textureX, textureY)).addShapeBox(-152.0f, 18.0f, -14.0f, 2, 20, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.noseModel[10] = new ModelRendererTurbo(this, 512, 0, textureX, textureY)).addShapeBox(-96.0f, 76.0f, -4.0f, 48, 24, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.noseModel[11] = new ModelRendererTurbo(this, 512, 32, textureX, textureY)).addShapeBox(-120.0f, 76.0f, -4.0f, 24, 24, 8, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f);
        (this.noseModel[12] = new ModelRendererTurbo(this, 512, 252, textureX, textureY)).addShapeBox(-124.0f, 24.0f, -30.0f, 28, 2, 60, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f);
        (this.noseModel[13] = new ModelRendererTurbo(this, 688, 196, textureX, textureY)).addBox(-112.0f, 26.0f, 8.0f, 16, 2, 16);
        (this.noseModel[14] = new ModelRendererTurbo(this, 688, 196, textureX, textureY)).addBox(-112.0f, 26.0f, -24.0f, 16, 2, 16);
        (this.noseModel[15] = new ModelRendererTurbo(this, 688, 214, textureX, textureY)).addBox(-96.0f, 26.0f, 8.0f, 2, 24, 16);
        (this.noseModel[16] = new ModelRendererTurbo(this, 688, 214, textureX, textureY)).addBox(-96.0f, 26.0f, -24.0f, 2, 24, 16);
        this.tailModel = new ModelRendererTurbo[2];
        (this.tailModel[0] = new ModelRendererTurbo(this, 512, 64, textureX, textureY)).addShapeBox(96.0f, 8.0f, -32.0f, 64, 68, 64, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -48.0f, -24.0f, 0.0f, -48.0f, -24.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -24.0f, 0.0f, 0.0f, -24.0f, 0.0f, 0.0f, 0.0f);
        (this.tailModel[1] = new ModelRendererTurbo(this, 512, 196, textureX, textureY)).addShapeBox(80.0f, 76.0f, -4.0f, 80, 48, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f);
        this.heliMainRotorModels = new ModelRendererTurbo[2][7];
        for (int k = 0; k < 2; ++k) {
            (this.heliMainRotorModels[k][0] = new ModelRendererTurbo(this, 624, 0, textureX, textureY)).addBox(-2.0f, 124.0f, -2.0f, 4, 8, 4);
            for (int l = 0; l < 3; ++l) {
                (this.heliMainRotorModels[k][l * 2 + 1] = new ModelRendererTurbo(this, 640, 0, textureX, textureY)).addBox(0.0f, 132.0f, -2.0f, 8, 1, 4);
                this.heliMainRotorModels[k][l * 2 + 1].field_78796_g = 1.0471976f * l * 2.0f;
                (this.heliMainRotorModels[k][l * 2 + 2] = new ModelRendererTurbo(this, 664, 0, textureX, textureY)).addBox(8.0f, 132.0f, -2.0f, 128, 1, 8);
                this.heliMainRotorModels[k][l * 2 + 2].field_78796_g = 1.0471976f * l * 2.0f;
            }
        }
        for (int i = 0; i < 7; ++i) {
            this.heliMainRotorModels[0][i].func_78793_a(-84.0f, -24.0f, 0.0f);
        }
        for (int i = 0; i < 7; ++i) {
            this.heliMainRotorModels[1][i].func_78793_a(128.0f, 0.0f, 0.0f);
        }
        this.heliMainRotorOrigins = new Vector3f[] { new Vector3f(-5.25f, 3.0f, 0.0f), new Vector3f(8.0f, 3.0f, 0.0f) };
        this.heliRotorSpeeds = new float[] { 1.0f, 1.0f };
        this.translateAll(0.0f, -15.0f, 0.0f);
    }
}
