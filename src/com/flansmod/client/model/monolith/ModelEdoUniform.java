// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEdoUniform extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEdoUniform() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[7];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[5];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, -0.2f, -2.0f, 4, 9, 4, 0.0f, -1.5f, 0.15f, 0.45f, 0.7f, 0.1f, 0.4f, 0.7f, 0.1f, 0.5f, 0.0f, 0.15f, 0.5f, 4.5f, 0.2f, 0.45f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.5f, 0.0f, 0.2f, 0.5f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.5f, 8.8f, -2.5f, 9, 2, 5, 0.0f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, 0.0f, 0.3f, 0.1f, -0.3f, 0.3f, 0.1f, -0.3f, 0.3f, 0.1f, -0.3f, 0.3f, 0.1f, -0.3f, 0.3f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, -0.2f, -2.0f, 3, 9, 4, 0.0f, 0.7f, 0.1f, 0.5f, -0.5f, 0.25f, 0.5f, 1.0f, 0.2f, 0.5f, 0.7f, 0.1f, 0.5f, 0.3f, 0.0f, 0.5f, 4.5f, 0.2f, 0.5f, 1.0f, 0.2f, 0.5f, 0.3f, 0.0f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-2.5f, -1.2f, -2.0f, 5, 3, 4, 0.0f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f, 0.3f, 0.5f, 0.2f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(3.0f, -0.5f, -2.5f, 1, 10, 5, 0.0f, -0.3f, 0.1f, 0.2f, 0.3f, -0.1f, 0.2f, 0.3f, -0.1f, 0.2f, -0.3f, 0.1f, 0.2f, 6.5f, -0.2f, 0.2f, -6.5f, -0.2f, 0.2f, -6.5f, -0.2f, 0.2f, 6.5f, -0.2f, 0.2f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-0.5f, 9.5f, -3.5f, 1, 1, 1, 0.0f, 1.2f, -1.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, 1.2f, -1.2f, -0.2f, 0.7f, 0.8f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.7f, 0.8f, -0.2f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-0.5f, 9.5f, -3.5f, 1, 1, 1, 0.0f, -0.3f, -0.2f, -0.2f, 1.2f, -1.2f, -0.2f, 1.2f, -1.2f, -0.2f, -0.3f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.7f, 0.8f, -0.2f, 0.7f, 0.8f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.2f, 0.6f, 0.2f, 0.3f, 0.4f, 0.2f, 0.3f, 0.4f, 0.2f, 0.2f, 0.6f, 0.2f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.1f, 0.1f, 0.3f, 0.4f, 0.2f, 0.2f, 0.6f, 0.2f, 0.2f, 0.6f, 0.2f, 0.3f, 0.4f, 0.2f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -2.5f, -2.5f, 4, 2, 5, 0.0f, 0.4f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.6f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -0.5f, -2.5f, 4, 6, 5, 0.0f, 0.6f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f, 0.4f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 6.5f, -2.5f, 4, 1, 5, 0.0f, 0.4f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 10, 4, 0.0f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -2.5f, -2.5f, 4, 2, 5, 0.0f, 0.4f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 0.6f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -1.1f, 1.5f, 0.2f, -1.1f, 1.5f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 1.8f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, -0.5f, -2.5f, 4, 6, 5, 0.0f, 0.6f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f, 0.4f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 6.5f, -2.5f, 4, 1, 5, 0.0f, 0.4f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f, 0.0f, -0.2f, -0.4f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 10, 4, 0.0f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.2f, -5.0f, 0.2f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f, 0.1f, 0.3f, 0.1f);
        this.rightLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
