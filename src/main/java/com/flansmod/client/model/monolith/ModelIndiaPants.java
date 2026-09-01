// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelIndiaPants extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelIndiaPants() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[4];
        this.leftLegModel = new ModelRendererTurbo[1];
        this.rightLegModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-12.0f, 8.0f, -10.0f, 24, 5, 20, 0.0f, -7.9f, -2.0f, -7.9f, -7.9f, -2.0f, -7.9f, -7.9f, -2.0f, -7.9f, -7.9f, -2.0f, -7.9f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-12.0f, 9.0f, -10.0f, 24, 5, 20, 0.0f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f, -7.4f, -2.0f, -7.4f, -7.5f, -1.0f, -7.5f, -7.5f, -1.0f, -7.5f, -7.5f, -1.0f, -7.5f, -7.5f, -1.0f, -7.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 1, 4, 0.0f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f, -0.2f, 0.1f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-5.0f, 9.5f, 0.0f, 1, 8, 1, 0.0f, 0.3f, -0.4f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, -0.4f, 0.3f, 1.3f, 0.2f, -0.2f, 0.3f, -0.2f, 0.3f, 0.3f, -0.2f, 0.3f, 1.5f, -0.2f, 1.3f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY)).addShapeBox(-10.0f, -20.0f, -10.0f, 20, 48, 20, 0.0f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY)).addShapeBox(-10.0f, -20.0f, -10.0f, 20, 48, 20, 0.0f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.4f, -20.0f, -7.4f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f, -7.0f, -20.0f, -7.0f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
