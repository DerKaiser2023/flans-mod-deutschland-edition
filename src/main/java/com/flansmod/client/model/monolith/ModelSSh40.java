// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSSh40 extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSSh40() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[24];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-1.0f, -8.2f, -4.0f, 2, 2, 8, 0.0f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.2f, 1.3f, 0.0f, 0.2f, 1.3f, 1.0f, -1.2f, 1.5f, 1.0f, -1.2f, 1.5f, 1.0f, 0.3f, 2.0f, 1.0f, 0.3f, 2.0f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-1.0f, -6.7f, -4.0f, 2, 2, 8, 0.0f, 1.0f, 0.7f, 1.5f, 1.0f, 0.7f, 1.5f, 1.0f, -0.8f, 2.0f, 1.0f, -0.8f, 2.0f, 1.0f, -0.2f, 2.4f, 1.0f, -0.2f, 2.4f, 1.0f, 2.5f, 2.15f, 1.0f, 2.5f, 2.15f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.0f, -5.7f, -5.0f, 2, 1, 5, 0.0f, 1.0f, -0.8f, 1.4f, 1.0f, -0.8f, 1.4f, 0.9f, -1.2f, 0.0f, 1.0f, -1.3f, 0.0f, 1.0f, 0.2f, 2.5f, 1.0f, 0.2f, 2.5f, 1.0f, 0.3f, 0.0f, 1.0f, 0.3f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-2.0f, -4.4f, 1.4f, 4, 1, 4, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, -2.2f, 0.7f, 0.0f, -2.2f, 0.7f, 0.0f, -0.8f, -1.0f, 0.0f, -0.8f, -1.0f, 0.0f, 1.5f, 1.0f, -0.05f, 1.5f, 1.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-1.0f, -10.1f, -4.0f, 2, 1, 8, 0.0f, 0.0f, 0.3f, -2.5f, 0.0f, 0.3f, -2.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.1f, 0.5f, 0.0f, 0.1f, 0.5f, 0.0f, 0.7f, 1.3f, 0.0f, 0.7f, 1.3f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.0f, -0.7f, -3.7f, 10, 1, 1, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-6.0f, -3.0f, -0.5f, 1, 3, 1, 0.0f, 0.0f, 0.5f, -0.5f, -0.7f, 0.8f, -0.5f, -0.5f, 0.2f, 0.5f, -0.1f, 0.2f, 0.5f, -1.8f, -0.3f, 3.0f, 1.2f, -0.3f, 3.0f, 1.2f, -0.2f, -3.3f, -1.8f, -0.2f, -3.3f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -6.7f, -4.0f, 1, 2, 2, 0.0f, 0.7f, 0.5f, 0.5f, 1.0f, 0.7f, 1.5f, 1.0f, -0.8f, 1.5f, 0.65f, 0.18f, 0.0f, 1.4f, 0.2f, 1.2f, 1.0f, -0.2f, 2.4f, 1.0f, 0.5f, 2.4f, 2.0f, 0.5f, 1.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, -8.2f, -4.0f, 2, 2, 8, 0.0f, -0.2f, 0.6f, -0.5f, 1.0f, 0.8f, 0.5f, 1.0f, 0.2f, 1.3f, 0.1f, -0.1f, 0.4f, 0.7f, -1.0f, 0.5f, 0.0f, -1.2f, 1.5f, 0.0f, 0.3f, 2.0f, 0.6f, 0.3f, 1.2f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -10.1f, -4.0f, 2, 1, 8, 0.0f, -1.7f, 0.0f, -2.7f, 1.0f, 0.3f, -2.5f, 1.0f, 0.0f, -0.7f, -1.7f, -0.3f, -1.2f, -0.2f, 0.3f, -0.5f, 1.0f, 0.1f, 0.5f, 1.0f, 0.7f, 1.3f, 0.1f, 1.0f, 0.4f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -6.7f, -2.0f, 1, 2, 4, 0.0f, 0.65f, 0.18f, 0.0f, 1.0f, -0.8f, 1.5f, 1.0f, 0.0f, 1.7f, 0.6f, -0.35f, 0.0f, 2.0f, 0.5f, -1.0f, 1.0f, 0.2f, 0.4f, 1.0f, 0.2f, 1.9f, 2.1f, 1.8f, -0.5f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -6.7f, 2.0f, 1, 2, 2, 0.0f, 0.6f, -0.35f, 0.0f, 1.0f, 0.0f, 1.7f, 1.0f, -0.8f, 2.0f, 0.6f, -0.8f, 1.2f, 2.1f, 1.8f, 0.5f, 1.0f, -0.8f, 1.9f, 1.05f, 2.5f, 2.15f, 1.2f, 1.8f, 1.2f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-6.0f, -4.6f, 1.4f, 4, 1, 4, 0.0f, 0.1f, -1.7f, -0.1f, 0.0f, 0.8f, 0.0f, 0.05f, -2.4f, 0.75f, -0.8f, -1.7f, -0.2f, 0.5f, 1.3f, -0.1f, 0.0f, -0.5f, -1.0f, 0.05f, 1.7f, 1.0f, -0.7f, 1.0f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-6.0f, -4.6f, -1.4f, 4, 1, 4, 0.0f, 0.0f, -0.4f, -0.4f, 0.0f, 2.0f, 0.25f, 0.0f, -0.2f, 0.0f, 0.1f, -1.7f, -1.1f, 0.4f, -0.3f, -0.4f, 0.0f, -1.6f, 0.85f, 0.0f, -0.5f, 0.0f, 0.5f, 1.3f, -1.1f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-4.0f, -5.1f, -5.0f, 1, 1, 3, 0.0f, 1.4f, -0.6f, 0.2f, 1.0f, -0.2f, 1.4f, 1.0f, -0.3f, 0.0f, 2.0f, -0.9f, 1.0f, 1.7f, -0.1f, 0.4f, 1.0f, -0.4f, 2.5f, 1.0f, -0.2f, 0.0f, 2.4f, 0.2f, 1.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(3.0f, -5.1f, -5.0f, 1, 1, 3, 0.0f, 1.0f, -0.2f, 1.4f, 1.4f, -0.6f, 0.2f, 2.0f, -0.9f, 1.0f, 1.0f, -0.3f, 0.0f, 1.0f, -0.4f, 2.5f, 1.7f, -0.1f, 0.4f, 2.4f, 0.2f, 1.0f, 1.0f, -0.2f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(3.0f, -6.7f, -4.0f, 1, 2, 2, 0.0f, 1.0f, 0.7f, 1.5f, 0.7f, 0.5f, 0.5f, 0.65f, 0.18f, 0.0f, 1.0f, -0.8f, 1.5f, 1.0f, -0.2f, 2.4f, 1.4f, 0.2f, 1.2f, 2.0f, 0.5f, 1.0f, 1.0f, 0.5f, 2.4f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(2.0f, -8.2f, -4.0f, 2, 2, 8, 0.0f, 1.0f, 0.8f, 0.5f, -0.2f, 0.6f, -0.5f, 0.1f, -0.1f, 0.4f, 1.0f, 0.2f, 1.3f, 0.0f, -1.2f, 1.5f, 0.7f, -1.0f, 0.5f, 0.6f, 0.3f, 1.2f, 0.0f, 0.3f, 2.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(2.0f, -10.1f, -4.0f, 2, 1, 8, 0.0f, 1.0f, 0.3f, -2.5f, -1.7f, 0.0f, -2.7f, -1.7f, -0.3f, -1.2f, 1.0f, 0.0f, -0.7f, 1.0f, 0.1f, 0.5f, -0.2f, 0.3f, -0.5f, 0.1f, 1.0f, 0.4f, 1.0f, 0.7f, 1.3f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(3.0f, -6.7f, -2.0f, 1, 2, 4, 0.0f, 1.0f, -0.8f, 1.5f, 0.65f, 0.18f, 0.0f, 0.6f, -0.35f, 0.0f, 1.0f, 0.0f, 1.7f, 1.0f, 0.2f, 0.4f, 2.0f, 0.5f, -1.0f, 2.1f, 1.8f, -0.5f, 1.0f, 0.2f, 1.9f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(3.0f, -6.7f, 2.0f, 1, 2, 2, 0.0f, 1.0f, 0.0f, 1.7f, 0.6f, -0.35f, 0.0f, 0.6f, -0.8f, 1.2f, 1.0f, -0.8f, 2.0f, 1.0f, -0.8f, 1.9f, 2.1f, 1.8f, 0.5f, 1.2f, 1.8f, 1.2f, 1.05f, 2.5f, 2.15f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(2.0f, -4.6f, 1.4f, 4, 1, 4, 0.0f, 0.0f, 0.8f, 0.0f, 0.1f, -1.7f, -0.1f, -0.8f, -1.7f, -0.2f, 0.05f, -2.4f, 0.75f, 0.0f, -0.5f, -1.0f, 0.5f, 1.3f, -0.1f, -0.7f, 1.0f, 0.0f, 0.05f, 1.7f, 1.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(2.0f, -4.6f, -1.4f, 4, 1, 4, 0.0f, 0.0f, 1.0f, 0.25f, 0.0f, -0.4f, -0.4f, 0.1f, -1.7f, -1.1f, 0.0f, -0.2f, 0.0f, 0.0f, -0.6f, 0.85f, 0.4f, -0.3f, -0.4f, 0.5f, 1.3f, -1.1f, 0.0f, -0.5f, 0.0f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(5.0f, -3.0f, -0.5f, 1, 3, 1, 0.0f, -0.7f, 0.8f, -0.5f, 0.0f, 0.5f, -0.5f, -0.1f, 0.2f, 0.5f, -0.5f, 0.2f, 0.5f, 1.2f, -0.3f, 3.0f, -1.8f, -0.3f, 3.0f, -1.8f, -0.2f, -3.3f, 1.2f, -0.2f, -3.3f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
