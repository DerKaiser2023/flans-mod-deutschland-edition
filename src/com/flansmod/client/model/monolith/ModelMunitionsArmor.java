// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelMunitionsArmor extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelMunitionsArmor() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[24];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 105, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 73, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.6f, 0.0f, 0.4f, 0.0f, -0.5f, 1.5f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.5f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -2.0f, -0.3f, 1.0f, 0.0f, 0.2f, 1.5f, 0.0f, -0.7f, 0.5f, -2.0f, -1.0f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, 0.0f, 0.8f, 0.5f, -1.0f, 0.4f, 0.5f, -1.0f, 0.4f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.2f, 1.5f, -2.0f, -0.3f, 1.0f, -2.0f, -1.0f, 0.5f, 0.0f, -0.7f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.0f, 0.4f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.5f, 0.6f, 0.0f, 0.4f, 0.0f, 0.49f, 1.49f, 0.0f, 0.0f, 1.0f, 0.6f, 0.0f, 0.4f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 2.5f, -2.0f, 4, 1, 4, 0.0f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.5f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, -0.3f, -0.3f, 0.3f, -1.5f, -0.3f, 0.2f, 0.0f, -0.3f, 0.8f, -0.3f, -0.3f, 0.5f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, -1.5f, -0.3f, 0.2f, -0.3f, -0.3f, 0.3f, -0.3f, -0.3f, 0.5f, 0.0f, -0.3f, 0.8f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 2.5f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 1.2f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 1.2f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.51f, 1.51f, 0.6f, 0.0f, 0.4f, 0.6f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, -0.5f, 1.5f, 0.6f, 0.0f, 0.4f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 9.4f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-5.0f, 12.2f, -2.0f, 4, 1, 4, 0.0f, -0.2f, 0.5f, 1.0f, 1.0f, 0.0f, 0.8f, 1.0f, 0.0f, 0.8f, -0.2f, 0.5f, 1.0f, 0.3f, -0.3f, 1.0f, 0.5f, 0.0f, 1.2f, 0.5f, 0.0f, 1.2f, 0.3f, -0.3f, 1.0f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-5.1f, 13.2f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.3f, 0.9f, 0.4f, 0.0f, 0.9f, 0.4f, 0.0f, 0.9f, 0.0f, 0.3f, 0.9f, 0.3f, 0.0f, 1.1f, 0.2f, 0.2f, 1.1f, 0.2f, 0.2f, 1.1f, 0.3f, 0.0f, 1.1f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-5.1f, 14.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.4f, 0.0f, 1.1f, 0.2f, 0.2f, 1.1f, 0.2f, 0.2f, 1.1f, 0.4f, 0.0f, 1.1f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-5.1f, 15.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.4f, 0.0f, 1.1f, 0.2f, 0.2f, 1.1f, 0.2f, 0.2f, 1.1f, 0.4f, 0.0f, 1.1f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-5.1f, 16.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.4f, 0.0f, 0.9f, -0.2f, 0.2f, 0.9f, -0.2f, 0.2f, 0.9f, 0.4f, 0.0f, 0.9f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(1.0f, 12.2f, -2.0f, 4, 1, 4, 0.0f, 1.0f, 0.0f, 0.8f, -0.2f, 0.5f, 1.0f, -0.2f, 0.5f, 1.0f, 1.0f, 0.0f, 0.8f, 0.5f, 0.0f, 1.2f, 0.3f, -0.3f, 1.0f, 0.3f, -0.3f, 1.0f, 0.5f, 0.0f, 1.2f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(0.9f, 13.2f, -2.0f, 4, 1, 4, 0.0f, 0.4f, 0.0f, 0.9f, 0.0f, 0.3f, 0.9f, 0.0f, 0.3f, 0.9f, 0.4f, 0.0f, 0.9f, 0.2f, 0.2f, 1.1f, 0.3f, 0.0f, 1.1f, 0.3f, 0.0f, 1.1f, 0.2f, 0.2f, 1.1f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(0.9f, 14.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 1.1f, 0.4f, 0.0f, 1.1f, 0.4f, 0.0f, 1.1f, 0.2f, 0.0f, 1.1f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.9f, 15.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 1.1f, 0.4f, 0.0f, 1.1f, 0.4f, 0.0f, 1.1f, 0.2f, 0.0f, 1.1f);
        this.bodyModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.9f, 16.2f, -2.0f, 4, 1, 4, 0.0f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, -0.2f, 0.0f, 0.9f, 0.4f, 0.0f, 0.9f, 0.4f, 0.0f, 0.9f, -0.2f, 0.0f, 0.9f);
        this.bodyModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
