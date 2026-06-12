// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelF22 extends ModelPlane
{
    public ModelF22() {
        final int textureX = 512;
        final int textureY = 512;
        this.bodyModel = new ModelRendererTurbo[3];
        (this.bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-48.0f, 8.0f, -32.0f, 128, 16, 64);
        (this.bodyModel[1] = new ModelRendererTurbo(this, 0, 80, textureX, textureY)).addBox(80.0f, 10.0f, -24.0f, 8, 12, 16);
        (this.bodyModel[2] = new ModelRendererTurbo(this, 48, 80, textureX, textureY)).addBox(80.0f, 10.0f, 8.0f, 8, 12, 16);
        this.noseModel = new ModelRendererTurbo[6];
        (this.noseModel[0] = new ModelRendererTurbo(this, 0, 108, textureX, textureY)).addShapeBox(-80.0f, 8.0f, -32.0f, 32, 16, 64, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f);
        (this.noseModel[1] = new ModelRendererTurbo(this, 0, 188, textureX, textureY)).addShapeBox(-80.0f, 24.0f, -12.0f, 64, 16, 24, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.noseModel[2] = new ModelRendererTurbo(this, 0, 228, textureX, textureY)).addShapeBox(-112.0f, 8.0f, -12.0f, 32, 32, 24, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, -16.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, -4.0f);
        (this.noseModel[3] = new ModelRendererTurbo(this, 0, 284, textureX, textureY)).addShapeBox(-144.0f, 8.0f, -8.0f, 32, 16, 16, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -8.0f, 0.0f, -12.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12.0f, -8.0f);
        this.noseModel[4] = new ModelRendererTurbo(this, 0, 356, textureX, textureY);
        this.noseModel[4].flip = true;
        this.noseModel[4].addShapeBox(-112.0f, 8.0f, -12.0f, 32, 32, 24, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, -16.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, -4.0f);
        this.noseModel[5] = new ModelRendererTurbo(this, 0, 316, textureX, textureY);
        this.noseModel[5].flip = true;
        this.noseModel[5].addShapeBox(-80.0f, 24.0f, -12.0f, 24, 16, 24, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftWingModel = new ModelRendererTurbo[1];
        (this.leftWingModel[0] = new ModelRendererTurbo(this, 192, 80, textureX, textureY)).addShapeBox(-16.0f, 12.0f, 32.0f, 64, 4, 64, 0.0f, 0.0f, 0.0f, 0.0f, 32.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -48.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 32.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -48.0f, 0.0f, 0.0f);
        this.rightWingModel = new ModelRendererTurbo[1];
        (this.rightWingModel[0] = new ModelRendererTurbo(this, 192, 150, textureX, textureY)).addShapeBox(-16.0f, 12.0f, -96.0f, 64, 4, 64, 0.0f, -48.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -48.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 32.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel = new ModelRendererTurbo[4];
        (this.tailModel[0] = new ModelRendererTurbo(this, 192, 220, textureX, textureY)).addShapeBox(64.0f, 15.99f, -64.0f, 40, 4, 32, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.tailModel[1] = new ModelRendererTurbo(this, 192, 256, textureX, textureY)).addShapeBox(64.0f, 15.99f, 32.0f, 40, 4, 32, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f);
        (this.tailModel[2] = new ModelRendererTurbo(this, 192, 300, textureX, textureY)).addShapeBox(48.0f, 16.0f, -36.0f, 48, 48, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, 16.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, -16.0f, -16.0f, 0.0f, -16.0f);
        (this.tailModel[3] = new ModelRendererTurbo(this, 296, 300, textureX, textureY)).addShapeBox(48.0f, 16.0f, 32.0f, 48, 48, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -16.0f, 0.0f, -16.0f, 0.0f, 0.0f, -16.0f, 0.0f, 0.0f, 16.0f, -16.0f, 0.0f, 16.0f);
        this.bodyWheelModel = new ModelRendererTurbo[2];
        (this.bodyWheelModel[0] = new ModelRendererTurbo(this, 416, 0, textureX, textureY)).addBox(-58.0f, 0.0f, -3.0f, 4, 8, 6);
        (this.bodyWheelModel[1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY)).addBox(-62.0f, -10.0f, -2.0f, 12, 12, 4);
        this.tailWheelModel = new ModelRendererTurbo[4];
        for (int i = 0; i < 2; ++i) {
            (this.tailWheelModel[2 * i] = new ModelRendererTurbo(this, 416, 0, textureX, textureY)).addBox(58.0f, 0.0f, -27.0f + i * 48.0f, 4, 8, 6);
            (this.tailWheelModel[2 * i + 1] = new ModelRendererTurbo(this, 384, 0, textureX, textureY)).addBox(54.0f, -10.0f, -26.0f + i * 48.0f, 12, 12, 4);
        }
        this.translateAll(0.0f, 0.0f, 0.0f);
    }
}
