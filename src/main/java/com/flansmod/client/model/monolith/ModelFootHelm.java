// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelFootHelm extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelFootHelm() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[14];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -7.6f, -4.0f, 4, 2, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.9f, 0.8f, 1.5f, 0.0f, 0.4f, 1.5f, 0.0f, 0.3f, 1.1f, 0.9f, 0.3f, 1.1f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.4f, -4.0f, 8, 1, 8, 0.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.1f, -2.0f, -2.0f, 0.1f, -2.0f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -5.6f, 0.0f, 8, 5, 4, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 0.0f, 0.9f, -0.3f, 1.1f, 0.9f, -0.3f, 1.1f, 0.1f, 0.5f, 0.0f, 0.1f, 0.5f, 0.0f, 0.1f, 0.5f, 0.9f, 0.1f, 0.5f, 0.9f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -4.6f, -5.0f, 8, 4, 4, 0.0f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 0.5f, 0.8f, -0.5f, 1.0f, 0.8f, -0.5f, 1.0f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.5f, -0.3f, -4.0f, 7, 2, 8, 0.0f, 0.6f, -0.2f, 1.5f, 0.6f, -0.2f, 1.5f, 0.6f, -0.2f, 0.9f, 0.6f, -0.2f, 0.9f, -1.5f, 0.3f, -1.7f, -1.5f, 0.3f, -1.7f, -1.5f, 0.3f, -3.0f, -1.5f, 0.3f, -3.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -5.7f, -6.5f, 4, 3, 9, 0.0f, 0.7f, -1.5f, -0.5f, 0.5f, -1.0f, -0.5f, 0.5f, -0.5f, 1.0f, 0.7f, -0.5f, 1.0f, 0.5f, 1.0f, 0.5f, 0.5f, 1.5f, 0.5f, 0.5f, -1.5f, 1.0f, 0.5f, -1.5f, 1.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(0.5f, -4.7f, -6.5f, 4, 4, 9, 0.0f, 0.5f, -3.5f, 0.5f, 0.5f, -3.0f, 0.5f, 0.5f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, 0.5f, 2.5f, -1.5f, -0.7f, 2.0f, -1.5f, 0.1f, -0.5f, -1.0f, 0.5f, -0.5f, -1.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-3.5f, 0.3f, -2.0f, 7, 2, 6, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -1.0f, 0.3f, -0.5f, -1.0f, 0.3f, -0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, -5.6f, -5.0f, 8, 1, 5, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(0.5f, -5.7f, -6.5f, 4, 3, 9, 0.0f, 0.5f, -1.0f, -0.5f, 0.7f, -1.5f, -0.5f, 0.7f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, 0.5f, 1.5f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, -1.5f, 1.0f, 0.5f, -1.5f, 1.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(0.0f, -7.6f, -4.0f, 4, 2, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.0f, 0.4f, 1.5f, 0.9f, 0.8f, 1.5f, 0.9f, 0.3f, 1.1f, 0.0f, 0.3f, 1.1f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.5f, -4.7f, -6.5f, 4, 4, 9, 0.0f, 0.5f, -3.0f, 0.5f, 0.5f, -3.5f, 0.5f, 0.5f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, -0.7f, 2.0f, -1.5f, 0.5f, 2.5f, -1.5f, 0.5f, -0.5f, -1.0f, 0.1f, -0.5f, -1.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-0.5f, -10.4f, -4.0f, 1, 3, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.2f, -1.3f, 0.0f, 0.2f, -1.3f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 2.2f, 0.0f, -0.5f, 2.2f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-0.5f, -8.4f, -4.0f, 1, 6, 8, 0.0f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 2.2f, 0.0f, -0.5f, 2.2f, 0.0f, 2.0f, -9.0f, 0.0f, 2.0f, -9.0f, 0.0f, -1.5f, 3.0f, 0.0f, -1.5f, 3.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
