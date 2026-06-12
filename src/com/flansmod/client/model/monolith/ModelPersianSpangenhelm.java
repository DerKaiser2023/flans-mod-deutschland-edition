// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPersianSpangenhelm extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPersianSpangenhelm() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[23];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 1.3f, -0.2f, 0.0f, 1.3f, -0.2f, 0.0f, 0.8f, 0.7f, 0.0f, 0.8f, 0.7f, 0.8f, -0.5f, 0.7f, 0.8f, -0.5f, 0.7f, 0.8f, -0.5f, 1.2f, 0.8f, -0.5f, 1.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -10.8f, -4.0f, 8, 1, 8, 0.0f, -2.0f, 1.2f, -2.5f, -2.0f, 1.2f, -2.5f, -2.0f, 0.9f, -0.8f, -2.0f, 0.9f, -0.8f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 1.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.8f, 0.0f, -0.5f, 1.4f, 1.0f, -0.5f, 1.4f, 1.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 0.0f, 1.2f, 1.0f, 0.0f, 1.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(3.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.0f, 0.0f, 0.8f, 1.0f, 0.0f, 0.8f, 1.0f, -0.5f, 1.4f, 0.0f, -0.5f, 1.4f, 0.0f, -0.5f, 1.0f, 1.0f, -0.5f, 1.0f, 1.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.0f, -6.0f, -4.0f, 6, 2, 8, 0.0f, 1.0f, 0.0f, 0.8f, 1.0f, 0.0f, 0.8f, 1.0f, -0.5f, 1.4f, 1.0f, -0.5f, 1.4f, 1.0f, -0.5f, 1.0f, 1.0f, -0.5f, 1.0f, 1.0f, 0.0f, 1.2f, 1.0f, 0.0f, 1.2f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.4f, -4.0f, -5.0f, 1, 3, 10, 0.0f, -0.4f, 0.5f, -1.0f, -0.4f, 0.5f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.4f, -1.0f, -2.0f, 1, 1, 4, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-5.4f, -1.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -1.5f, -0.4f, 0.0f, -1.5f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-5.4f, -1.0f, 2.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.0f, -4.0f, 4.5f, 10, 5, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-5.0f, 1.3f, 4.5f, 10, 3, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(4.4f, -4.0f, -5.0f, 1, 3, 10, 0.0f, -0.4f, 0.5f, -1.0f, -0.4f, 0.5f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(4.4f, -1.0f, 2.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(4.4f, -1.0f, -2.0f, 1, 1, 4, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(4.4f, -1.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, -1.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, -1.5f, -0.4f, 0.0f, -1.5f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-5.4f, 0.0f, 1.9f, 1, 1, 3, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-5.4f, 1.3f, 1.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -1.4f, -1.0f, 0.0f, 0.6f, -1.0f, 0.0f, 1.6f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(4.4f, 0.0f, 1.9f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(4.4f, 1.3f, 1.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.6f, -1.0f, 0.0f, -1.4f, -1.0f, 0.0f, -2.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-1.5f, -10.8f, -4.0f, 3, 1, 8, 0.0f, 0.0f, 1.5f, -2.4f, 0.0f, 1.5f, -2.4f, 0.0f, 1.2f, -0.5f, 0.0f, 1.2f, -0.5f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-1.5f, -8.0f, -4.0f, 3, 3, 8, 0.0f, 0.0f, 1.3f, 0.1f, 0.0f, 1.3f, 0.1f, 0.0f, 0.8f, 1.0f, 0.0f, 0.8f, 1.0f, 0.8f, -1.0f, 0.8f, 0.8f, -1.0f, 0.8f, 0.8f, -0.5f, 1.5f, 0.8f, -0.5f, 1.5f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-4.0f, -10.8f, -0.6f, 8, 1, 3, 0.0f, -1.8f, 1.35f, 0.0f, -1.8f, 1.35f, 0.0f, -1.8f, 1.2f, 0.0f, -1.8f, 1.2f, 0.0f, 0.2f, 0.7f, 0.4f, 0.2f, 0.7f, 0.4f, 0.2f, 0.9f, -0.3f, 0.2f, 0.9f, -0.3f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-4.0f, -8.2f, -0.9f, 8, 1, 3, 0.0f, 0.2f, 0.9f, 0.1f, 0.2f, 0.9f, 0.1f, 0.2f, 0.7f, 0.0f, 0.2f, 0.7f, 0.0f, 0.9f, 1.4f, 1.6f, 0.9f, 1.4f, 1.6f, 0.9f, 1.6f, 1.0f, 0.9f, 1.6f, 1.0f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
