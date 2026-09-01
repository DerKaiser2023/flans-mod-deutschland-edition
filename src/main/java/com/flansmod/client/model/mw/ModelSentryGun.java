// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAAGun;

public class ModelSentryGun extends ModelAAGun
{
    public ModelSentryGun() {
        final int textureX = 64;
        final int textureY = 64;
        this.baseModel = new ModelRendererTurbo[5];
        (this.baseModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-4.0f, 16.0f, -4.0f, 8, 2, 8, 0.0f);
        (this.baseModel[1] = new ModelRendererTurbo(this, 32, 0, textureX, textureY)).addShapeBox(-4.0f, 0.0f, -4.0f, 2, 16, 2, 0.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f, -4.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.baseModel[2] = new ModelRendererTurbo(this, 40, 0, textureX, textureY)).addShapeBox(2.0f, 0.0f, -4.0f, 2, 16, 2, 0.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.baseModel[3] = new ModelRendererTurbo(this, 48, 0, textureX, textureY)).addShapeBox(2.0f, 0.0f, 2.0f, 2, 16, 2, 0.0f, -4.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        (this.baseModel[4] = new ModelRendererTurbo(this, 56, 0, textureX, textureY)).addShapeBox(-4.0f, 0.0f, 2.0f, 2, 16, 2, 0.0f, 4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.seatModel = new ModelRendererTurbo[5];
        (this.seatModel[0] = new ModelRendererTurbo(this, 0, 10, textureX, textureY)).addBox(-4.0f, 18.0f, -4.0f, 8, 1, 8, 0.0f);
        (this.seatModel[1] = new ModelRendererTurbo(this, 0, 19, textureX, textureY)).addBox(-2.0f, 19.0f, -4.0f, 4, 7, 1, 0.0f);
        (this.seatModel[2] = new ModelRendererTurbo(this, 16, 19, textureX, textureY)).addBox(-2.0f, 19.0f, 3.0f, 4, 7, 1, 0.0f);
        (this.seatModel[3] = new ModelRendererTurbo(this, 0, 27, textureX, textureY)).addBox(-3.0f, 18.0f, 4.0f, 6, 6, 2, 0.0f);
        (this.seatModel[4] = new ModelRendererTurbo(this, 17, 27, textureX, textureY)).addBox(-3.0f, 19.0f, -9.0f, 6, 5, 5, 0.0f);
        this.gunModel = new ModelRendererTurbo[4];
        (this.gunModel[0] = new ModelRendererTurbo(this, 0, 37, textureX, textureY)).addBox(-4.0f, -3.0f, -3.0f, 8, 6, 6, 0.0f);
        (this.gunModel[1] = new ModelRendererTurbo(this, 0, 49, textureX, textureY)).addBox(4.0f, -1.0f, -2.0f, 2, 4, 4, 0.0f);
        (this.gunModel[2] = new ModelRendererTurbo(this, 12, 49, textureX, textureY)).addBox(8.0f, -1.0f, -2.0f, 2, 4, 4, 0.0f);
        (this.gunModel[3] = new ModelRendererTurbo(this, 24, 49, textureX, textureY)).addBox(14.0f, -1.0f, -2.0f, 4, 4, 4, 0.0f);
        this.barrelModel = new ModelRendererTurbo[4][1];
        (this.barrelModel[0][0] = new ModelRendererTurbo(this, 34, 18, textureX, textureY)).addBox(6.0f, 1.5f, 0.5f, 14, 1, 1, 0.0f);
        (this.barrelModel[1][0] = new ModelRendererTurbo(this, 34, 20, textureX, textureY)).addBox(6.0f, 1.5f, -1.5f, 14, 1, 1, 0.0f);
        (this.barrelModel[2][0] = new ModelRendererTurbo(this, 34, 22, textureX, textureY)).addBox(6.0f, -0.5f, -1.5f, 14, 1, 1, 0.0f);
        (this.barrelModel[3][0] = new ModelRendererTurbo(this, 34, 24, textureX, textureY)).addBox(6.0f, -0.5f, 0.5f, 14, 1, 1, 0.0f);
        this.ammoModel = new ModelRendererTurbo[0][0];
        this.barrelX = 0;
        this.barrelY = 24;
        this.barrelZ = 0;
    }
}
