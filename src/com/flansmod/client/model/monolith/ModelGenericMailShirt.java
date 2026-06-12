// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelGenericMailShirt extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGenericMailShirt() {
        this.textureX = 128;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[2];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.skirtFrontModel = new ModelRendererTurbo[1];
        this.skirtRearModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initskirtFrontModel_1();
        this.initskirtRearModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 8.5f, -2.0f, 8, 2, 4, 0.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 10, 5, 0.0f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.4f, 0.2f, 0.4f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 0.1f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.3f, 0.4f, 0.3f, 0.3f, 0.25f, 0.3f, 0.3f, 0.25f, 0.3f, 0.3f, 0.4f, 0.3f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 7, 4, 0.0f, 0.3f, 0.25f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.4f, 0.3f, 0.3f, 0.25f, 0.3f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f, 0.5f, 2.0f, 0.5f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.5f, -2.0f, 8, 6, 2, 0.0f, 0.4f, 2.0f, 0.4f, 0.4f, 2.0f, 0.4f, 0.4f, 2.0f, 0.4f, 0.4f, 2.0f, 0.4f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f);
        this.skirtFrontModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtRearModel_1() {
        (this.skirtRearModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.5f, 0.0f, 8, 6, 2, 0.0f, 0.4f, 1.0f, 0.4f, 0.4f, 1.0f, 0.4f, 0.4f, 1.0f, 0.4f, 0.4f, 1.0f, 0.4f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f, 0.9f, -3.5f, 0.9f);
        this.skirtRearModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
