// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelIndiaHair extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelIndiaHair() {
        this.textureX = 32;
        this.textureY = 32;
        (this.headModel = new ModelRendererTurbo[11])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 9, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-2.7f, -4.8f, -3.9f, 2, 1, 1, 0.0f, -0.2f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, -0.5f, -0.3f, 0.2f, -0.3f, -0.3f, 0.2f, 0.1f, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-2.0f, -2.5f, -4.05f, 2, 1, 1, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-3.2f, -4.8f, -3.9f, 1, 1, 1, 0.0f, 0.2f, -0.6f, 0.2f, -0.3f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.6f, 0.2f, 0.3f, -0.1f, 0.2f, 0.4f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-0.5f, -5.3f, -4.02f, 1, 1, 1, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f, -0.1f, -0.3f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-2.5f, -2.2f, -4.05f, 1, 1, 1, 0.0f, -0.2f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-2.5f, -2.2f, -4.05f, 1, 1, 1, 0.0f, 0.2f, -0.4f, 0.0f, -0.5f, -0.4f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -0.4f, 0.0f, -0.6f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(2.2f, -4.8f, -3.9f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.2f, 0.2f, -0.6f, 0.2f, 0.0f, -0.6f, 0.2f, 0.0f, -0.3f, 0.2f, 0.4f, -0.4f, 0.2f, 0.3f, -0.1f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(0.7f, -4.8f, -3.9f, 2, 1, 1, 0.0f, 0.0f, -0.5f, 0.2f, -0.2f, -0.3f, 0.2f, -0.5f, -0.3f, 0.2f, 0.0f, -0.5f, 0.2f, 0.1f, 0.0f, 0.2f, -0.3f, -0.3f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.2f, 0.2f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(0.0f, -2.5f, -4.05f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(1.5f, -2.2f, -4.05f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, 0.0f, -0.4f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(1.5f, -2.2f, -4.05f, 1, 1, 1, 0.0f, -0.5f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.6f, -0.2f, 0.0f, 0.3f, -0.4f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
