// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelFrogMouth extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelFrogMouth() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[16];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-5.0f, -9.5f, -5.5f, 5, 4, 7, 0.0f, -1.0f, -1.5f, -1.5f, 0.0f, -1.2f, 0.0f, 0.0f, 0.2f, -1.0f, -0.2f, -0.8f, 0.0f, 0.8f, 1.4f, 0.0f, 0.0f, 2.4f, 1.8f, 0.0f, 0.2f, 0.0f, 2.2f, 1.1f, 0.0f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-5.0f, -1.8f, -5.5f, 5, 4, 7, 0.0f, 0.5f, 0.5f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, 0.2f, 0.9f, 1.9f, 1.5f, 0.0f, -1.0f, -0.5f, -2.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-5.0f, -4.6f, 1.5f, 5, 6, 4, 0.0f, 2.5f, 0.2f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f, -1.5f, 1.5f, 0.8f, 0.2f, -0.5f, 0.0f, 0.3f, 0.0f, 0.0f, 1.3f, 0.0f, 0.0f, -1.2f, -0.5f, -0.8f, -1.0f, -1.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-6.0f, -2.8f, -5.5f, 6, 1, 7, 0.0f, 0.0f, 0.8f, 0.7f, 0.0f, -0.5f, 2.2f, 0.0f, 0.2f, 0.9f, 1.5f, 2.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, -1.5f, 0.0f, 0.9f, -1.5f, 0.0f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-5.0f, -9.5f, 1.5f, 5, 5, 4, 0.0f, -0.2f, -0.8f, 0.0f, 0.0f, 0.2f, 1.0f, 0.0f, -1.0f, -0.5f, -0.8f, -1.5f, -1.5f, 2.2f, 0.1f, 0.0f, 0.0f, -1.8f, 0.0f, 0.0f, 1.5f, 1.0f, 0.0f, 0.2f, -0.5f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 0.4f, 2.5f, 4, 4, 1, 0.0f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.5f, 1.4f, 0.0f, -0.2f, 0.5f, 2.0f, 0.5f, 0.0f, 3.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.5f, 1.0f, -0.5f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 0.4f, -3.5f, 4, 3, 1, 0.0f, 1.4f, 0.0f, -0.2f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 1.5f, 0.0f, 0.5f, 0.5f, 1.0f, -0.2f, 0.0f, 2.0f, 0.8f, 0.0f, 2.5f, 0.5f, 0.5f, 1.5f, 0.5f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-5.0f, -0.6f, -3.5f, 4, 1, 6, 0.0f, 0.0f, -0.5f, -0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, -0.2f, 1.0f, 0.0f, 0.5f, 1.0f, -1.0f, 1.5f, 0.5f, 0.0f, 0.7f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, -9.5f, -5.5f, 5, 4, 7, 0.0f, 0.0f, -1.2f, 0.0f, -1.0f, -1.5f, -1.5f, -0.2f, -0.8f, 0.0f, 0.0f, 0.2f, -1.0f, 0.0f, 2.4f, 1.8f, 0.8f, 1.4f, 0.0f, 2.2f, 1.1f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, -1.8f, -5.5f, 5, 4, 7, 0.0f, 0.0f, -0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 1.9f, 1.5f, 0.0f, 0.0f, 0.2f, 0.9f, 0.0f, 0.0f, -1.5f, -1.0f, -0.5f, -2.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, -4.6f, 1.5f, 5, 6, 4, 0.0f, 0.0f, -1.8f, 0.0f, 2.5f, 0.2f, 0.0f, 0.8f, 0.2f, -0.5f, 0.0f, -1.5f, 1.5f, 0.0f, 1.3f, 0.0f, 0.0f, 0.3f, 0.0f, -0.8f, -1.0f, -1.5f, 0.0f, -1.2f, -0.5f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, -2.8f, -5.5f, 6, 1, 7, 0.0f, 0.0f, -0.5f, 2.2f, 0.0f, 0.8f, 0.7f, 1.5f, 2.0f, 0.0f, 0.0f, 0.2f, 0.9f, 0.0f, 0.5f, 0.5f, -0.5f, -0.5f, 0.0f, 0.9f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.0f, -9.5f, 1.5f, 5, 5, 4, 0.0f, 0.0f, 0.2f, 1.0f, -0.2f, -0.8f, 0.0f, -0.8f, -1.5f, -1.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.8f, 0.0f, 2.2f, 0.1f, 0.0f, 0.0f, 0.2f, -0.5f, 0.0f, 1.5f, 1.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.4f, 2.5f, 4, 4, 1, 0.0f, 0.0f, 0.0f, 0.5f, 1.5f, 0.0f, 0.5f, 1.4f, 0.0f, -0.2f, 0.0f, 1.0f, 0.5f, 0.0f, 3.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 1.0f, -0.5f, 0.0f, 1.0f, 0.5f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(1.0f, -0.6f, -3.5f, 4, 1, 6, 0.0f, 1.0f, 0.0f, 0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.5f, 1.0f, 0.0f, 0.5f, 0.4f, 0.0f, -0.2f, 0.5f, 0.0f, 0.7f, 1.0f, -1.0f, 1.5f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.4f, -3.5f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.5f, 1.4f, 0.0f, -0.2f, 1.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 2.0f, 0.8f, 0.5f, 1.0f, -0.2f, 0.5f, 1.5f, 0.5f, 0.0f, 2.5f, 0.5f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
