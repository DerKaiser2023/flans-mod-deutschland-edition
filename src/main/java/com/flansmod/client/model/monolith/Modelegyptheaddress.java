// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Modelegyptheaddress extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Modelegyptheaddress() {
        this.textureX = 1024;
        this.textureY = 1024;
        (this.headModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 185, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 225, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 265, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 289, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 313, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -7.0f, -4.0f, 8, 2, 8, 0.0f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.125f, 0.125f, 0.0f, 0.0f, 0.125f, 0.0f, 0.0f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].func_78790_a(-4.0f, -8.0f, -4.0f, 8, 2, 9, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].func_78790_a(-4.0f, -8.0f, 4.0f, 8, 8, 1, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].func_78790_a(-5.0f, -7.5f, -3.0f, 1, 7, 7, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].func_78790_a(4.0f, -7.5f, -3.0f, 1, 7, 7, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
