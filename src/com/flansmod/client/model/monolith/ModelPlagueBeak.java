// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPlagueBeak extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPlagueBeak() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[25];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -6.0f, -4.0f, 8, 2, 8, 0.0f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.7f, 0.9f, 0.9f, -0.3f, 0.9f, 0.9f, -0.3f, 0.9f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-5.0f, -6.4f, -7.8f, 10, 2, 3, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-5.0f, -6.0f, 4.8f, 10, 2, 3, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(4.9f, -6.4f, -4.8f, 3, 2, 10, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.9f, -0.3f, 0.0f, -1.1f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-7.9f, -6.4f, -4.8f, 3, 2, 10, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.1f, -0.3f, 0.0f, -1.9f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-8.01f, -6.4f, -7.8f, 3, 2, 3, 0.0f, -1.0f, -1.5f, -1.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.5f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(5.01f, -6.4f, -7.8f, 3, 2, 3, 0.0f, 0.0f, -1.5f, 0.0f, -1.0f, -1.5f, -1.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(5.01f, -6.0f, 4.91f, 3, 2, 3, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.5f, 0.0f, -1.0f, -1.5f, -1.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-8.01f, -6.0f, 4.91f, 3, 2, 3, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -1.5f, 0.0f, -1.0f, -1.5f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, -1.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 2, 8, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -9.0f, -4.0f, 8, 2, 8, 0.0f, 1.5f, 0.2f, 1.4f, 1.5f, 0.2f, 1.4f, 1.5f, 0.0f, 1.6f, 1.5f, 0.0f, 1.6f, 0.9f, 0.1f, 0.9f, 0.9f, 0.1f, 0.9f, 0.9f, 0.1f, 0.9f, 0.9f, 0.1f, 0.9f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -6.0f, -3.0f, 8, 6, 7, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-3.5f, -4.0f, -4.5f, 3, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-3.5f, -4.6f, -4.5f, 3, 1, 1, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-3.5f, -3.4f, -4.5f, 3, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(0.5f, -4.6f, -4.5f, 3, 1, 1, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(0.5f, -4.0f, -4.5f, 3, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(0.5f, -3.4f, -4.5f, 3, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-4.0f, -6.0f, -4.0f, 8, 6, 2, 0.0f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-2.0f, -2.5f, -7.0f, 4, 1, 3, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f, 1.5f, 0.5f, 0.0f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-1.0f, -3.5f, -7.0f, 2, 1, 3, 0.0f, 0.0f, -0.99f, 0.0f, 0.0f, -0.99f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-2.5f, -1.0f, -7.0f, 5, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-2.0f, -2.5f, -9.0f, 4, 1, 2, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 2.0f, 0.0f, -0.5f, 2.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-2.5f, -1.01f, -9.01f, 5, 1, 2, 0.0f, -1.0f, -1.49f, 0.0f, -1.0f, -1.49f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-1.5f, -1.5f, -11.0f, 3, 2, 2, 0.0f, -1.499f, -2.99f, 0.0f, -1.499f, -2.99f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.499f, 1.0f, 0.0f, -1.499f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
