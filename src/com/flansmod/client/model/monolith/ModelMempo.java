// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelMempo extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelMempo() {
        this.textureX = 32;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[13];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 2, 25, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -3.0f, -4.7f, 3, 1, 2, 0.0f, 0.4f, 0.1f, 0.0f, 0.0f, -0.2f, -0.1f, 0.0f, 0.3f, 0.8f, 0.8f, 0.6f, 0.8f, 0.2f, 0.0f, 0.6f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.6f, 0.0f, 0.6f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-0.5f, -3.7f, -4.9f, 1, 2, 1, 0.0f, -0.1f, 0.0f, -0.6f, -0.1f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -0.5f, 0.7f, 0.2f, -0.5f, 0.7f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.5f, -3.4f, -4.9f, 1, 1, 1, 0.0f, -0.5f, -0.2f, -0.3f, 0.2f, -0.1f, -0.3f, 0.2f, -0.1f, 0.0f, -0.5f, -0.2f, 0.0f, 0.0f, 0.0f, 0.3f, -0.1f, 0.0f, 0.5f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-1.0f, -2.4f, -4.9f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.0f, -2.4f, -4.9f, 2, 1, 1, 0.0f, -0.3f, 0.0f, 0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.5f, 0.0f, 0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -2.0f, -4.5f, 3, 2, 2, 0.0f, 0.1f, 0.1f, 0.0f, -0.8f, 0.0f, 0.1f, -0.8f, 0.0f, 0.0f, 0.6f, 0.2f, 0.3f, 0.0f, 0.1f, 0.0f, -0.2f, 0.3f, 0.2f, -0.2f, 0.3f, 0.0f, 0.4f, 0.1f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-1.0f, -1.5f, -4.7f, 1, 2, 2, 0.0f, 0.8f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.8f, -0.4f, 0.0f, 0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -3.0f, -2.0f, 8, 1, 6, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.1f, -1.0f, 0.1f, 0.1f, -1.0f, 0.1f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(1.0f, -2.4f, -4.9f, 2, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, 0.0f, 0.3f, -0.3f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, 0.0f, 0.3f, -0.5f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(1.0f, -3.0f, -4.7f, 3, 1, 2, 0.0f, 0.0f, -0.2f, -0.1f, 0.4f, 0.1f, 0.0f, 0.8f, 0.6f, 0.8f, 0.0f, 0.3f, 0.8f, 0.0f, 0.2f, 0.0f, 0.2f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(1.0f, -2.0f, -4.5f, 3, 2, 2, 0.0f, -0.8f, 0.0f, 0.1f, 0.1f, 0.1f, 0.0f, 0.6f, 0.2f, 0.3f, -0.8f, 0.0f, 0.0f, -0.2f, 0.3f, 0.2f, 0.0f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, -0.2f, 0.3f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(0.0f, -1.5f, -4.7f, 1, 2, 2, 0.0f, 0.0f, -0.2f, 0.0f, 0.8f, -0.4f, 0.0f, 0.8f, -0.4f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.3f, 0.0f, 0.2f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(0.5f, -3.4f, -4.9f, 1, 1, 1, 0.0f, 0.2f, -0.1f, -0.3f, -0.5f, -0.2f, -0.3f, -0.5f, -0.2f, 0.0f, 0.2f, -0.1f, 0.0f, -0.1f, 0.0f, 0.5f, 0.0f, 0.0f, 0.3f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
