// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.invalid;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Modeliraqushanka extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Modeliraqushanka() {
        this.textureX = 128;
        this.textureY = 256;
        (this.headModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 49, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.1f, -4.0f, 8, 4, 7, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -0.3f, 0.1f, 0.1f, -0.3f, 0.1f, 0.1f, -0.3f, 0.1f, 0.1f, -0.3f, 0.1f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.5f, -8.3f, -4.75f, 9, 4, 1, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.5f, -8.3f, 3.7f, 9, 4, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, -0.4f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.4f, -0.2f, 0.0f, -0.4f, -0.2f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.5f, -8.3f, -3.5f, 4, 4, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(0.5f, -8.3f, -3.5f, 4, 4, 7, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -8.3f, -4.75f, 9, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(0.5f, -9.3f, -3.5f, 4, 1, 7, 0.0f, -0.2f, -0.7f, -1.25f, -1.0f, -0.7f, -0.5f, -1.0f, -0.7f, -0.5f, -0.2f, -0.7f, -1.25f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, -9.3f, -3.5f, 4, 1, 7, 0.0f, -1.0f, -0.7f, -0.5f, -0.2f, -0.7f, -1.25f, -0.2f, -0.7f, -1.25f, -1.0f, -0.7f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.5f, -8.3f, 3.7f, 9, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-4.0f, -8.1f, 3.1f, 8, 4, 1, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
