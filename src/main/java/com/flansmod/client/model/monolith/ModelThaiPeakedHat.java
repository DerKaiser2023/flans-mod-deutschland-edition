// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelThaiPeakedHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelThaiPeakedHat() {
        this.textureX = 32;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[4];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 21, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 11, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -5.5f, -3.9f, 8, 2, 8, 0.0f, 0.4f, 1.7f, 0.4f, 0.4f, 1.7f, 0.4f, 0.4f, 0.7f, 0.5f, 0.4f, 0.7f, 0.5f, 0.5f, -1.5f, 0.3f, 0.5f, -1.5f, 0.3f, 0.5f, -0.7f, 0.1f, 0.5f, -0.7f, 0.1f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.5f, -3.9f, 8, 2, 8, 0.0f, 1.2f, -0.2f, 1.5f, 1.2f, -0.2f, 1.5f, 1.2f, -1.5f, 2.0f, 1.2f, -1.5f, 2.0f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 1.3f, 0.5f, 0.4f, 1.3f, 0.5f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -9.2f, -3.9f, 8, 1, 8, 0.0f, -0.3f, 1.1f, -0.7f, -0.3f, 1.1f, -0.7f, -0.3f, 0.5f, -0.2f, -0.3f, 0.5f, -0.2f, 1.2f, -1.1f, 1.5f, 1.2f, -1.1f, 1.5f, 1.2f, 0.2f, 2.0f, 1.2f, 0.2f, 2.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -6.0f, -7.0f, 8, 1, 3, 0.0f, -2.5f, -0.5f, -0.3f, -2.5f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.3f, -2.0f, 0.0f, 0.3f, 0.5f, 0.0f, -0.1f, 0.5f, 0.0f, -0.1f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
