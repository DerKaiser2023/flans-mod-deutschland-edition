// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelTigerSkin extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelTigerSkin() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[22];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -12.5f, -5.5f, 16, 16, 6, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, -8.0f, -8.0f, 0.0f, 0.0f, -8.0f, 0.0f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-2.0f, -8.5f, -8.5f, 8, 8, 7, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-3.5f, -12.0f, -0.5f, 7, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -14.5f, -2.0f, 6, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.5f, -10.0f, 1.5f, 7, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -8.0f, -3.0f, 8, 8, 7, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 1.1f, 0.0f, 0.5f, 1.1f, 0.0f, 0.5f, 1.1f, 0.0f, 1.1f, 1.1f, 0.0f, 1.1f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-3.5f, -8.0f, -2.5f, 7, 4, 2, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(2.75f, -1.0f, -4.1f, 2, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -1.0f, 0.0f, -5.5f, -0.5f, 0.0f, -5.5f, -0.5f, 0.0f, 5.0f, -1.0f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-5.25f, -1.0f, -4.0f, 2, 6, 2, 0.0f, -0.3f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -5.5f, -0.5f, 0.0f, 5.0f, -1.0f, 0.0f, 5.0f, -1.0f, 0.0f, -5.5f, -0.5f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.0f, 0.0f, 2.0f, 10, 9, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-5.0f, 9.0f, 2.0f, 10, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-1.0f, 11.0f, 3.0f, 2, 8, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.0f, -15.0f, -2.0f, 3, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-1.0f, -13.5f, -2.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-1.0f, -14.0f, -2.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(0.5f, -14.0f, -2.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(1.0f, -15.0f, -2.0f, 3, 1, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-5.0f, 8.5f, -1.5f, 10, 3, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-1.8f, -4.5f, -6.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(0.8f, -4.5f, -6.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f, -0.49f, 0.0f, -0.49f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(1.0f, -14.5f, -2.0f, 6, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-5.0f, 8.5f, -3.5f, 10, 3, 2, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
