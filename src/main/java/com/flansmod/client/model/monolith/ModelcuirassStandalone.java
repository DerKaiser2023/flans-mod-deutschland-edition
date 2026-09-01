// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelcuirassStandalone extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelcuirassStandalone() {
        this.textureX = 128;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[12];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 65, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 22, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, -0.5f, -0.2f, 0.5f, 0.0f, -0.3f, 0.15f, 0.0f, -0.3f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, 0.0f, 1.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(2.5f, -0.5f, -2.0f, 1, 3, 4, 0.0f, -0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, 0.6f, 0.0f, 0.3f, 1.5f, -0.2f, 0.0f, 1.2f, -0.2f, 0.0f, 1.2f, 0.0f, 0.3f, 1.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, 0.0f, -0.3f, 0.15f, -0.5f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.3f, 0.5f, -0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.0f, -0.2f, 0.0f, 0.7f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.5f, -0.5f, -2.0f, 1, 3, 4, 0.0f, 0.0f, 0.0f, 0.3f, -0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.6f, 0.0f, 0.0f, 0.5f, -0.2f, 0.0f, 1.2f, 0.0f, 0.3f, 1.5f, 0.0f, 0.3f, 1.5f, -0.2f, 0.0f, 1.2f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 1.5f, -2.0f, 8, 6, 4, 0.0f, -0.2f, 0.0f, 0.5f, -4.0f, 0.0f, 1.5f, -4.0f, 0.0f, 1.0f, -0.2f, 0.0f, 0.7f, -0.1f, -4.0f, 0.7f, -3.9f, -3.0f, 2.3f, -4.0f, -3.0f, 1.5f, -0.1f, -4.0f, 1.0f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 4.5f, -2.0f, 8, 6, 4, 0.0f, -0.1f, 1.0f, 0.7f, -3.9f, 0.0f, 2.3f, -4.0f, 0.0f, 1.5f, -0.1f, 1.0f, 1.0f, 0.9f, -4.0f, 0.8f, -3.8f, -2.49f, 2.1f, -4.0f, -3.0f, 1.2f, 0.9f, -4.0f, 0.8f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 7.5f, -2.0f, 8, 6, 4, 0.0f, 0.9f, 1.0f, 0.8f, -3.8f, -0.5f, 2.1f, -4.0f, 0.0f, 1.2f, 0.9f, 1.0f, 0.8f, 0.5f, -3.5f, 0.5f, -3.9f, -2.8f, 1.5f, -4.0f, -3.0f, 0.8f, 0.5f, -3.5f, 0.4f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 11.0f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 1.0f, 0.5f, 0.0f, 0.3f, 1.5f, 0.0f, 0.5f, 0.8f, 0.5f, 1.0f, 0.4f, 0.6f, -1.8f, 0.7f, 0.0f, -0.8f, 2.0f, 0.0f, -0.8f, 1.2f, 0.6f, -1.8f, 0.6f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 11.0f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.3f, 1.5f, 0.5f, 1.0f, 0.5f, 0.5f, 1.0f, 0.4f, 0.0f, 0.5f, 0.8f, 0.0f, -0.8f, 2.0f, 0.6f, -1.8f, 0.7f, 0.6f, -1.8f, 0.6f, 0.0f, -0.8f, 1.2f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 7.5f, -2.0f, 8, 6, 4, 0.0f, -0.2f, -0.5f, 2.1f, -3.1f, 1.0f, 0.8f, -3.1f, 1.0f, 0.8f, 0.0f, 0.0f, 1.2f, -0.1f, -2.8f, 1.5f, -3.5f, -3.5f, 0.5f, -3.5f, -3.5f, 0.4f, 0.0f, -3.0f, 0.8f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 4.5f, -2.0f, 8, 6, 4, 0.0f, -0.1f, 0.0f, 2.3f, -4.1f, 1.0f, 0.7f, -4.1f, 1.0f, 1.0f, 0.0f, 0.0f, 1.5f, -0.2f, -2.49f, 2.1f, -3.1f, -4.0f, 0.8f, -3.1f, -4.0f, 0.8f, 0.0f, -3.0f, 1.2f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 1.5f, -2.0f, 8, 6, 4, 0.0f, 0.0f, 0.0f, 1.5f, -4.2f, 0.0f, 0.5f, -4.2f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f, -0.1f, -3.0f, 2.3f, -4.1f, -4.0f, 0.7f, -4.1f, -4.0f, 1.0f, 0.0f, -3.0f, 1.5f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
