// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelNgob extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelNgob() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[10];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 0.9f, 0.1f, 0.0f, 0.9f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 3, 8, 0.0f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 1.9f, -0.7f, 1.9f, 1.9f, -0.7f, 1.9f, 1.9f, -0.3f, 1.9f, 1.9f, -0.3f, 1.9f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-5.0f, -5.5f, 4.8f, 10, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-8.9f, -5.9f, -4.8f, 4, 2, 10, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.3f, 0.0f, -1.9f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -0.9f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-8.01f, -5.9f, -7.8f, 3, 2, 3, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 1.0f, 0.0f, -0.8f, 0.0f, 1.0f, -0.3f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-8.01f, -5.5f, 4.91f, 3, 2, 3, 0.0f, 1.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 1.0f, 0.0f, -1.5f, 0.0f, 1.0f, -0.3f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 1.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -5.9f, -8.8f, 10, 2, 4, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(4.9f, -5.9f, -4.8f, 4, 2, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.9f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, -0.9f, -0.3f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(4.9f, -5.5f, 4.91f, 3, 2, 3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 1.0f, 0.0f, -0.8f, 0.0f, 1.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 1.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(4.9f, -5.9f, -7.8f, 3, 2, 3, 0.0f, 0.0f, -1.5f, 1.0f, 0.0f, -1.5f, 0.0f, 1.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 1.0f, 0.0f, -0.3f, 0.0f, 1.0f, -0.3f, 0.0f, 0.0f, -0.8f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
