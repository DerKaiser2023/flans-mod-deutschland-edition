// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelCivicCrown extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelCivicCrown() {
        this.textureX = 64;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[20];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-1.5f, -6.1f, -2.0f, 3, 1, 2, 0.0f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-1.5f, -5.7f, -1.0f, 3, 1, 2, 0.0f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.5f, -5.5f, 0.0f, 3, 1, 2, 0.0f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-1.5f, -5.3f, 1.0f, 3, 1, 2, 0.0f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(3.5f, -5.3f, 2.0f, 1, 1, 2, 0.0f, 0.6f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.6f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-1.5f, -6.5f, -3.0f, 3, 1, 2, 0.0f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f, 3.6f, 0.5f, 0.2f, 3.5f, 0.5f, 0.2f, 3.0f, 0.2f, 0.2f, 3.0f, 0.2f, 0.2f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -6.9f, -4.0f, 1, 1, 2, 0.0f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, -5.1f, 2.0f, 1, 1, 2, 0.0f, 0.6f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.6f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.5f, -7.0f, -4.0f, 1, 1, 2, 0.0f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(2.5f, -5.1f, 3.2f, 2, 1, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(1.5f, -5.0f, 3.3f, 2, 1, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(0.5f, -4.8f, 3.4f, 2, 1, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-0.5f, -4.6f, 3.5f, 2, 1, 1, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.6f, 0.2f, 0.2f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-1.5f, -4.6f, 3.5f, 2, 1, 1, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-2.5f, -4.8f, 3.4f, 2, 1, 1, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-3.5f, -5.0f, 3.3f, 2, 1, 1, 0.0f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f, 0.2f, 0.5f, 0.5f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.6f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-4.2f, -7.2f, -4.5f, 1, 1, 2, 0.0f, 0.2f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-3.6f, -7.6f, -5.0f, 1, 1, 2, 0.0f, 0.2f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.2f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(3.2f, -7.2f, -4.5f, 1, 1, 2, 0.0f, 0.5f, 0.7f, 0.2f, 0.2f, 0.7f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(2.8f, -7.6f, -5.0f, 1, 1, 2, 0.0f, 0.5f, 0.7f, 0.2f, 0.2f, 0.7f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
