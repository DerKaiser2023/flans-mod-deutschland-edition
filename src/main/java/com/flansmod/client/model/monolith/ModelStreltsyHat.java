// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelStreltsyHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelStreltsyHat() {
        this.textureX = 128;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[11];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -1.0f, -4.0f, 8, 1, 5, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 5.0f, 2.2f, 0.2f, 5.0f, 2.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-3.0f, -2.5f, -4.0f, 3, 1, 1, 0.0f, 0.0f, -0.8f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.5f, 0.7f, 0.2f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(0.0f, -2.5f, -4.0f, 3, 1, 1, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, -0.8f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.5f, 0.7f, 0.2f, 0.5f, 0.7f, 0.2f, 0.0f, -0.3f, 0.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, 0.5f, -4.0f, 8, 1, 5, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, -2.0f, 0.5f, 0.2f, -2.0f, 0.5f, 0.2f, -2.0f, 0.5f, 0.2f, -2.0f, 0.5f, 0.2f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -12.0f, -4.0f, 8, 7, 8, 0.0f, -1.5f, 1.8f, -3.5f, -1.5f, 1.8f, -3.5f, -1.0f, 0.8f, 1.4f, -1.0f, 0.8f, 1.4f, 0.8f, -1.5f, 1.0f, 0.8f, -1.5f, 1.0f, 1.0f, 0.0f, 1.3f, 1.0f, 0.0f, 1.3f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.0f, -6.5f, -5.0f, 10, 2, 11, 0.0f, 0.9f, 0.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.9f, -1.2f, 0.3f, 0.9f, -1.2f, 0.3f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, 1.3f, -0.1f, 0.9f, 1.3f, -0.1f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -8.5f, -5.0f, 10, 1, 11, 0.0f, 0.6f, -0.9f, 0.6f, 0.6f, -0.9f, 0.6f, 0.6f, -2.7f, 0.0f, 0.6f, -2.7f, 0.0f, 0.9f, 0.5f, 0.9f, 0.9f, 0.5f, 0.9f, 0.9f, 2.2f, 0.3f, 0.9f, 2.2f, 0.3f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-5.0f, -3.7f, -5.0f, 10, 1, 11, 0.0f, 0.9f, 1.5f, 0.9f, 0.9f, 1.5f, 0.9f, 0.9f, -0.5f, -0.1f, 0.9f, -0.5f, -0.1f, 0.6f, -2.0f, 0.6f, 0.6f, -2.0f, 0.6f, 0.6f, 0.1f, -0.4f, 0.6f, 0.1f, -0.4f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-3.0f, -8.5f, -4.6f, 6, 1, 1, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-3.0f, -9.5f, -4.0f, 6, 1, 1, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-3.0f, -10.5f, -3.3f, 6, 1, 1, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
