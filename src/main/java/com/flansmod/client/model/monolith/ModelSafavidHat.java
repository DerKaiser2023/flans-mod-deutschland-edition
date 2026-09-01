// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelSafavidHat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelSafavidHat() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[12];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 1.5f, 0.1f, 0.0f, 1.5f, 0.1f, 0.0f, 0.9f, 0.7f, 0.0f, 0.9f, 0.7f, 0.2f, -1.5f, 0.6f, 0.2f, -1.5f, 0.6f, 0.2f, -0.6f, 0.3f, 0.2f, -0.6f, 0.3f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -12.0f, -4.0f, 8, 3, 8, 0.0f, -2.0f, -0.7f, -3.0f, -2.0f, -0.7f, -3.0f, -2.0f, -1.0f, -0.5f, -2.0f, -1.0f, -0.5f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, 0.1f, 0.0f, 1.1f, 0.7f, 0.0f, 1.1f, 0.7f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-2.0f, -15.0f, -2.0f, 4, 4, 4, 0.0f, -1.0f, 0.0f, -2.5f, -1.0f, 0.0f, -2.5f, -1.0f, 0.0f, 1.5f, -1.0f, 0.0f, 1.5f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-6.0f, -2.0f, -4.5f, 6, 1, 1, 0.0f, 0.0f, -0.4f, -0.3f, -1.0f, 0.5f, -0.3f, -1.0f, 0.5f, -0.3f, 0.0f, -0.4f, -0.3f, -4.5f, -0.3f, -0.3f, 0.2f, -1.0f, -0.3f, 0.2f, -1.0f, -0.3f, -4.5f, -0.3f, -0.3f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-5.0f, -6.0f, -4.5f, 5, 1, 9, 0.0f, 1.0f, -0.5f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, -2.0f, 2.0f, 0.0f, -2.0f, 1.0f, -0.5f, 0.8f, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, 2.5f, 0.0f, -0.5f, 2.0f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-5.0f, -7.0f, -4.5f, 5, 1, 9, 0.0f, 0.2f, 2.0f, -0.8f, 0.0f, 3.0f, -0.3f, 0.0f, 1.3f, 1.5f, -0.5f, 1.0f, 1.0f, 1.0f, 0.5f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 2.0f, 2.0f, 0.0f, 2.0f, 1.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-2.0f, -17.0f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.3f, -2.0f, 0.0f, 0.3f, -2.0f, 0.0f, -0.2f, 2.5f, 0.0f, -0.2f, 2.5f, -1.0f, 0.0f, -2.2f, -1.0f, 0.0f, -2.2f, -0.8f, 0.2f, 2.0f, -0.8f, 0.2f, 2.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(0.0f, -7.0f, -4.5f, 5, 1, 9, 0.0f, 0.0f, 3.0f, -0.3f, 0.2f, 2.0f, -0.8f, -0.5f, 1.0f, 1.0f, 0.0f, 1.3f, 1.5f, 0.0f, -1.0f, 1.0f, 1.0f, 0.5f, 1.0f, 0.0f, 2.0f, 1.0f, 0.0f, 2.0f, 2.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -6.0f, -4.5f, 5, 1, 9, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, -0.5f, 1.0f, 0.0f, -2.0f, 1.0f, 0.0f, -2.0f, 2.0f, 0.0f, -0.3f, 0.2f, -0.5f, 0.8f, 0.0f, -0.5f, 2.0f, 0.0f, 0.0f, 2.5f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(0.0f, -2.0f, -4.5f, 6, 1, 1, 0.0f, -1.0f, 0.5f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, -1.0f, 0.5f, -0.3f, 0.2f, -1.0f, -0.3f, -4.5f, -0.3f, -0.3f, -4.5f, -0.3f, -0.3f, 0.2f, -1.0f, -0.3f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-3.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.2f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(1.0f, -5.0f, -4.0f, 2, 1, 1, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.4f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
