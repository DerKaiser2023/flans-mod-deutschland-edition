// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import com.flansmod.client.model.EnumAnimationType;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelEarlyMingGun extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelEarlyMingGun() {
        this.textureX = 512;
        this.textureY = 512;
        (this.gunModel = new ModelRendererTurbo[27])[0] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 0, 8, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 0, 6, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 28, 2, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 28, 0, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 28, 4, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 24, 0, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 24, 2, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 24, 4, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 0, 2, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 20, 4, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 20, 2, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 20, 0, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 16, 4, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 16, 2, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 16, 0, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 12, 4, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 12, 2, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 12, 0, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 8, 4, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 8, 2, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 8, 0, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 4, 4, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 4, 2, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 4, 0, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 28, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f);
        this.gunModel[0].func_78793_a(-12.0f, -3.0f, -0.5f);
        this.gunModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 28, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f);
        this.gunModel[1].func_78793_a(-12.0f, -3.0f, -0.5f);
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 28, 1, 1, 0.0f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f);
        this.gunModel[2].func_78793_a(-12.0f, -3.0f, -0.5f);
        this.gunModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.0f);
        this.gunModel[3].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.125f, -0.2f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.0f);
        this.gunModel[4].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.0f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f, 0.0f, 0.125f, -0.2f);
        this.gunModel[5].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[6].func_78793_a(22.0f, -3.0f, -0.5f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[7].func_78793_a(22.0f, -3.0f, -0.5f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[8].func_78793_a(22.0f, -3.0f, -0.5f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[9].func_78793_a(-12.25f, -3.0f, -0.5f);
        this.gunModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[10].func_78793_a(-12.25f, -3.0f, -0.5f);
        this.gunModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[11].func_78793_a(-12.25f, -3.0f, -0.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[12].func_78793_a(20.0f, -3.0f, -0.5f);
        this.gunModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[13].func_78793_a(20.0f, -3.0f, -0.5f);
        this.gunModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[14].func_78793_a(20.0f, -3.0f, -0.5f);
        this.gunModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[15].func_78793_a(18.0f, -3.0f, -0.5f);
        this.gunModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[16].func_78793_a(18.0f, -3.0f, -0.5f);
        this.gunModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[17].func_78793_a(18.0f, -3.0f, -0.5f);
        this.gunModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[18].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[19].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[20].func_78793_a(16.0f, -3.0f, -0.5f);
        this.gunModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.125f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, -0.75f, 0.25f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[21].func_78793_a(14.0f, -3.0f, -0.5f);
        this.gunModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.125f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.125f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[22].func_78793_a(14.0f, -3.0f, -0.5f);
        this.gunModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, -0.75f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.125f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[23].func_78793_a(14.0f, -3.0f, -0.5f);
        this.gunModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.7916666f, 0.125f, -0.75f, -0.7916666f, 0.0f, -0.75f, -0.7916666f, 0.0f, 0.0f, -0.7916666f, 0.125f, 0.0f, 0.25f, -0.2f, -0.75f, 0.125f, -0.2f, -0.75f, 0.125f, -0.2f, 0.0f, 0.25f, -0.2f);
        this.gunModel[24].func_78793_a(11.0f, -3.0f, -0.5f);
        this.gunModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, -0.4583333f, 0.125f, -0.75f, -0.4583333f, 0.0f, -0.75f, -0.4583333f, 0.0f, 0.0f, -0.4583333f, 0.125f, 0.0f, -0.2083333f, 0.125f, -0.75f, -0.2083333f, 0.0f, -0.75f, -0.2083333f, 0.0f, 0.0f, -0.2083333f, 0.125f);
        this.gunModel[25].func_78793_a(11.0f, -3.0f, -0.5f);
        this.gunModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.75f, -0.125f, -0.2f, -0.75f, -0.125f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5416666f, 0.125f, -0.75f, -0.5416666f, 0.0f, -0.75f, -0.5416666f, 0.0f, 0.0f, -0.5416666f, 0.125f);
        this.gunModel[26].func_78793_a(11.0f, -3.0f, -0.5f);
        this.ammoModel = new ModelRendererTurbo[1];
        (this.ammoModel[0] = new ModelRendererTurbo(this, 54, 0, this.textureX, this.textureY)).addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f, -0.375f);
        this.ammoModel[0].func_78793_a(21.7f, -2.88f, -0.5f);
        this.animationType = EnumAnimationType.END_LOADED;
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
