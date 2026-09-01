// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelNappyAustriaGear extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelNappyAustriaGear() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[22];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-5.0f, -1.0f, 3.0f, 10, 2, 3, 0.0f, 0.1f, -0.8f, 0.3f, 0.1f, -0.8f, 0.3f, 0.1f, -0.8f, 0.4f, 0.1f, -0.8f, 0.4f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-5.0f, -2.0f, 3.0f, 10, 2, 3, 0.0f, 0.1f, -0.8f, 0.3f, 0.1f, -0.8f, 0.3f, 0.1f, -0.8f, 0.4f, 0.1f, -0.8f, 0.4f, 0.1f, -0.2f, 0.3f, 0.1f, -0.2f, 0.3f, 0.1f, -0.2f, 0.4f, 0.1f, -0.2f, 0.4f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-5.0f, -2.0f, 3.0f, 10, 2, 3, 0.0f, 0.1f, 0.3f, -0.5f, 0.1f, 0.3f, -0.5f, 0.1f, 0.3f, -0.5f, 0.1f, 0.3f, -0.5f, 0.1f, -1.2f, 0.3f, 0.1f, -1.2f, 0.3f, 0.1f, -1.2f, 0.4f, 0.1f, -1.2f, 0.4f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-5.0f, 1.0f, 2.5f, 10, 6, 3, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-5.0f, 9.5f, 3.0f, 5, 4, 2, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, -0.2f, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-5.0f, 9.5f, 4.2f, 5, 4, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.4f, -0.2f, -0.4f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.6f, -0.4f, 0.0f, -0.4f, -0.4f, -0.4f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(2.5f, 9.0f, 2.5f, 1, 12, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 0.5f, -0.2f, -1.8f, -4.3f, 0.2f, -1.5f, -4.3f, 0.2f, -2.0f, 4.0f, -0.2f, -2.3f, 4.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(3.5f, -1.3f, -2.5f, 1, 1, 5, 0.0f, 0.1f, -0.4f, -1.0f, 0.4f, -0.6f, -1.0f, 0.4f, -0.6f, 0.0f, 0.1f, -0.4f, 0.0f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(3.5f, -0.3f, -2.5f, 1, 4, 5, 0.0f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f, -0.1f, -0.4f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.0f, -0.1f, -0.4f, 0.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(3.5f, 2.7f, -2.5f, 1, 3, 5, 0.0f, -0.1f, -0.6f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.1f, -0.6f, 0.0f, -0.88f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.88f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-3.5f, 1.0f, 5.5f, 1, 6, 1, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-3.5f, -3.0f, 7.0f, 1, 2, 1, 0.0f, -0.4f, -0.7f, 1.5f, 0.0f, -0.7f, 1.5f, 0.0f, -0.7f, -2.4f, -0.4f, -0.7f, -2.4f, -0.4f, -0.2f, 0.6f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, -1.5f, -0.4f, -0.2f, -1.5f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-3.5f, -2.0f, 7.0f, 1, 2, 1, 0.0f, -0.4f, -0.8f, 0.6f, 0.0f, -0.8f, 0.6f, 0.0f, -0.8f, -1.5f, -0.4f, -0.8f, -1.5f, -0.4f, -0.2f, 0.6f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, -1.5f, -0.4f, -0.2f, -1.5f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.5f, 0.0f, 7.0f, 1, 1, 1, 0.0f, -0.4f, 0.2f, 0.6f, 0.0f, 0.2f, 0.6f, 0.0f, 0.2f, -1.5f, -0.4f, 0.2f, -1.5f, -0.4f, 0.1f, 1.5f, 0.0f, 0.1f, 1.5f, 0.0f, 0.0f, -2.3f, -0.4f, 0.0f, -2.3f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(2.0f, -3.0f, 7.0f, 1, 2, 1, 0.0f, -0.4f, -0.7f, 1.5f, 0.0f, -0.7f, 1.5f, 0.0f, -0.7f, -2.4f, -0.4f, -0.7f, -2.4f, -0.4f, -0.2f, 0.6f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, -1.5f, -0.4f, -0.2f, -1.5f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(2.0f, -2.0f, 7.0f, 1, 2, 1, 0.0f, -0.4f, -0.8f, 0.6f, 0.0f, -0.8f, 0.6f, 0.0f, -0.8f, -1.5f, -0.4f, -0.8f, -1.5f, -0.4f, -0.2f, 0.6f, 0.0f, -0.2f, 0.6f, 0.0f, -0.2f, -1.5f, -0.4f, -0.2f, -1.5f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(2.0f, 0.0f, 7.0f, 1, 1, 1, 0.0f, -0.4f, 0.2f, 0.6f, 0.0f, 0.2f, 0.6f, 0.0f, 0.2f, -1.5f, -0.4f, 0.2f, -1.5f, -0.4f, 0.1f, 1.5f, 0.0f, 0.1f, 1.5f, 0.0f, 0.0f, -2.3f, -0.4f, 0.0f, -2.3f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(2.0f, 1.0f, 5.5f, 1, 6, 1, 0.0f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.5f, -1.3f, -2.5f, 1, 1, 5, 0.0f, 0.4f, -0.6f, -1.0f, 0.1f, -0.4f, -1.0f, 0.1f, -0.4f, 0.0f, 0.4f, -0.6f, 0.0f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.5f, -0.3f, -2.5f, 1, 4, 5, 0.0f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.5f, 0.3f, 0.0f, 0.5f, 0.0f, -0.5f, 0.1f, -0.1f, -0.4f, 0.1f, -0.1f, -0.4f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.5f, 2.7f, -2.5f, 1, 3, 5, 0.0f, 0.0f, -0.5f, 0.1f, -0.1f, -0.6f, 0.1f, -0.1f, -0.6f, 0.0f, 0.0f, -0.5f, 0.0f, -0.1f, 0.0f, 0.0f, -0.88f, 0.0f, 0.0f, -0.88f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-4.5f, 2.3f, -2.65f, 9, 1, 5, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, -0.3f, -0.1f, -0.1f, -0.3f, -0.1f, -0.1f, -0.3f, -0.1f, -0.1f, -0.3f, -0.1f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
