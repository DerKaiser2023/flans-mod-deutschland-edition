// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModeliranHeadband extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModeliranHeadband() {
        this.textureX = 128;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[4];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -6.5f, -4.0f, 8, 2, 8, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -2.0f, 0.1f, 0.1f, -2.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 1.0f, 0.1f, 0.1f, 1.0f, 0.1f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-0.2f, -4.5f, 4.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, -1.5f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, -1.5f, -1.5f, 2.0f, -1.5f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-0.8f, -4.5f, 4.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 2.0f, -1.5f, 1.0f, 2.0f, -1.5f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-17.0f, -14.5f, -4.1f, 34, 18, 1, 0.0f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f, -13.5f, -8.1f, 0.1f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
