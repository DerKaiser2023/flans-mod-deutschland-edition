// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelDzungarSteppeHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelDzungarSteppeHat() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[11];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.5f, -9.0f, -4.0f, 9, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, 1.0f, 0.5f, 0.4f, 1.0f, 0.5f, 0.4f, 1.0f, 1.5f, 0.2f, 1.0f, 1.5f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -12.0f, -4.0f, 8, 3, 8, 0.0f, -2.0f, 0.5f, -2.6f, -2.0f, 0.5f, -2.6f, -2.0f, -0.5f, 1.2f, -2.0f, -0.5f, 1.2f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.3f, 0.5f, 0.5f, 0.3f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -14.0f, -3.0f, 8, 1, 8, 0.0f, -3.8f, 0.0f, -7.0f, -3.8f, 0.0f, -7.0f, -3.8f, -0.5f, 2.0f, -3.8f, -0.5f, 2.0f, -2.0f, 0.5f, -1.6f, -2.0f, 0.5f, -1.6f, -2.0f, 1.5f, 0.2f, -2.0f, 1.5f, 0.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.0f, -10.5f, -7.0f, 3, 5, 3, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -10.5f, -7.0f, 1, 6, 3, 0.0f, 1.0f, -3.0f, -1.5f, 0.0f, -0.5f, -1.0f, 0.0f, -1.0f, 0.0f, 1.0f, -3.4f, 1.0f, 0.0f, 2.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.3f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-6.0f, -7.5f, -7.0f, 2, 6, 13, 0.0f, 2.5f, -2.0f, -4.0f, -1.0f, 0.0f, -1.5f, -1.0f, -2.0f, 0.0f, 2.5f, -3.0f, -3.0f, 1.0f, -1.0f, -3.0f, 0.0f, -0.5f, -0.5f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, -3.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-6.0f, -7.5f, 4.0f, 6, 7, 2, 0.0f, -1.0f, -1.6f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f, -2.5f, 1.0f, -1.0f, -2.0f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, -2.0f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(0.0f, -10.5f, -7.0f, 3, 5, 3, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -7.5f, 4.0f, 6, 7, 2, 0.0f, 0.0f, -1.8f, 0.0f, -1.0f, -1.6f, 0.0f, -1.0f, -2.0f, 0.0f, 0.0f, -2.5f, 1.0f, 0.0f, 0.0f, 0.0f, -2.0f, -0.3f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(3.0f, -10.5f, -7.0f, 1, 6, 3, 0.0f, 0.0f, -0.5f, -1.0f, 1.0f, -3.0f, -1.5f, 1.0f, -3.4f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 2.5f, -0.5f, 0.0f, 2.3f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(4.0f, -7.5f, -7.0f, 2, 6, 13, 0.0f, -1.0f, 0.0f, -1.5f, 2.5f, -2.0f, -4.0f, 2.5f, -3.0f, -3.0f, -1.0f, -2.0f, 0.0f, 0.0f, -0.5f, -0.5f, 1.0f, -1.0f, -3.0f, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
