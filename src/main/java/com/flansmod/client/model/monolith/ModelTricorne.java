// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelTricorne extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelTricorne() {
        this.textureX = 128;
        this.textureY = 32;
        this.headModel = new ModelRendererTurbo[18];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 1.5f, 0.3f, 0.2f, 1.5f, 0.3f, 0.2f, 1.0f, 0.9f, 0.2f, 1.0f, 0.9f, 0.9f, -1.5f, 1.2f, 0.9f, -1.5f, 1.2f, 0.9f, -0.6f, 1.0f, 0.9f, -0.6f, 1.0f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -13.0f, -4.0f, 8, 3, 8, 0.0f, -3.1f, -2.7f, -3.5f, -3.1f, -2.7f, -3.5f, -3.1f, -3.0f, -2.5f, -3.1f, -3.0f, -2.5f, 0.2f, 1.5f, 0.3f, 0.2f, 1.5f, 0.3f, 0.2f, 2.0f, 0.9f, 0.2f, 2.0f, 0.9f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-5.0f, -8.0f, -5.5f, 5, 3, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, -6.0f, 1.0f, 0.0f, -1.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-5.0f, -11.0f, -5.5f, 5, 3, 2, 0.0f, -1.0f, 0.0f, -2.0f, -1.0f, -0.5f, 1.0f, -1.0f, -0.5f, -1.5f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-7.0f, -11.0f, -4.5f, 2, 6, 1, 0.0f, -1.0f, -2.0f, -4.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.5f, -2.0f, 4.0f, 0.0f, 0.5f, -3.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.8f, 3.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-9.0f, -8.0f, -2.5f, 2, 5, 1, 0.0f, 0.5f, -0.5f, -5.0f, 1.0f, 1.0f, -2.0f, 1.5f, 1.0f, 2.0f, 0.5f, -0.5f, 5.0f, 1.5f, -1.2f, -5.0f, 0.0f, -1.5f, -1.0f, 1.0f, -1.2f, 1.0f, 1.5f, -1.2f, 5.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-9.0f, -8.0f, 7.5f, 4, 5, 1, 0.0f, 0.5f, -0.5f, 4.0f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, -2.0f, 0.5f, -0.5f, -4.0f, 1.5f, -1.2f, 4.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 1.5f, -1.2f, -4.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-5.0f, -8.0f, 7.5f, 5, 5, 1, 0.0f, 0.0f, 0.5f, 2.0f, 0.0f, 1.5f, 2.5f, 0.0f, 1.5f, -2.5f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.2f, 1.5f, 0.0f, -0.2f, -1.5f, 0.0f, 0.0f, -1.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-5.0f, -5.5f, -10.5f, 5, 1, 17, 0.0f, 0.5f, 0.5f, -6.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.5f, -5.5f, 0.0f, -0.5f, 0.0f, 0.0f, 1.5f, 0.0f, 1.0f, 1.5f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-10.5f, -5.5f, -0.5f, 5, 1, 7, 0.0f, -1.0f, -1.0f, -3.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, -2.5f, -0.2f, 0.2f, -3.5f, 0.0f, 0.2f, 1.0f, -0.5f, 1.5f, 0.0f, -0.2f, 0.2f, -2.5f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(0.0f, -8.0f, 7.5f, 5, 5, 1, 0.0f, 0.0f, 1.5f, 2.5f, 0.0f, 0.5f, 2.0f, 0.0f, 0.5f, -2.0f, 0.0f, 1.5f, -2.5f, 0.0f, -0.2f, 1.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -1.5f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(5.0f, -8.0f, 7.5f, 4, 5, 1, 0.0f, 0.0f, 0.5f, 2.0f, 0.5f, -0.5f, 4.0f, 0.5f, -0.5f, -4.0f, 0.0f, 0.5f, -2.0f, 0.0f, 0.0f, 1.0f, 1.5f, -1.2f, 4.0f, 1.5f, -1.2f, -4.0f, 0.0f, 0.0f, -1.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(7.0f, -8.0f, -2.5f, 2, 5, 1, 0.0f, 1.0f, 1.0f, -2.0f, 0.5f, -0.5f, -5.0f, 0.5f, -0.5f, 5.0f, 1.5f, 1.0f, 2.0f, 0.0f, -1.5f, -1.0f, 1.5f, -1.2f, -5.0f, 1.5f, -1.2f, 5.0f, 1.0f, -1.2f, 1.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(5.0f, -11.0f, -4.5f, 2, 6, 1, 0.0f, 1.0f, 0.0f, -1.0f, -1.0f, -2.0f, -4.0f, -1.5f, -2.0f, 4.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.5f, -3.0f, -1.0f, 0.8f, 3.0f, -1.0f, 0.0f, -1.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(0.0f, -11.0f, -5.5f, 5, 3, 2, 0.0f, -1.0f, -0.5f, 1.0f, -1.0f, 0.0f, -2.0f, -1.0f, 0.0f, 1.0f, -1.0f, -0.5f, -1.5f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(0.0f, -8.0f, -5.5f, 5, 3, 2, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 5.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -6.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(0.0f, -5.5f, -10.5f, 5, 1, 17, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.5f, -6.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 1.0f, -0.5f, -5.5f, 1.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(5.5f, -5.5f, -0.5f, 5, 1, 7, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, -1.0f, -3.5f, -1.0f, -1.0f, -2.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 1.0f, -0.2f, 0.2f, -3.5f, -0.2f, 0.2f, -2.5f, -0.5f, 1.5f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
