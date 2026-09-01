// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelArabeArmor extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelArabeArmor() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[8];
        this.leftArmModel = new ModelRendererTurbo[3];
        this.rightArmModel = new ModelRendererTurbo[3];
        this.leftLegModel = new ModelRendererTurbo[2];
        this.rightLegModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 1, 4, 0.0f, 0.3f, 1.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 1.0f, 0.4f, 0.3f, -1.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, -1.0f, 0.4f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 4, 4, 0.0f, 0.2f, 0.1f, 0.3f, 0.2f, 0.1f, 0.3f, 0.2f, 0.1f, 0.3f, 0.2f, 0.1f, 0.3f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f, 0.5f, 0.1f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 10, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 8, 4, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(4.0f, 8.5f, -3.0f, 1, 10, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(0.5f, -0.4f, -2.0f, 4, 2, 4, 0.0f, -0.8f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, -0.8f, 0.0f, 0.5f, -0.4f, 5.2f, 0.8f, 0.2f, 5.7f, 0.5f, 0.2f, 5.7f, 0.5f, -0.5f, 5.2f, 0.7f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.8f, -0.4f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.0f, 0.5f, -0.8f, 0.0f, 0.5f, -0.8f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 5.7f, 0.5f, -0.4f, 5.2f, 0.8f, -0.5f, 5.2f, 0.7f, 0.2f, 5.7f, 0.5f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-2.0f, -0.4f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 9, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-0.1f, -2.4f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 5.7f, 0.5f, 0.0f, 7.2f, 0.5f, 0.0f, 7.2f, 0.5f, 0.2f, 5.7f, 0.5f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 9, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 10, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.1f, -2.4f, -2.0f, 4, 2, 4, 0.0f, -0.4f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, 0.0f, 7.2f, 0.5f, 0.2f, 5.7f, 0.5f, 0.2f, 5.7f, 0.5f, 0.0f, 7.2f, 0.5f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 7, 4, 0.0f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, -1.6f, 0.1f, 0.8f, 1.3f, -0.9f, 0.8f, 1.3f, -0.9f, 0.8f, -1.6f, 0.1f, 0.8f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 10.1f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 7, 4, 0.0f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 0.35f, 0.1f, 0.35f, 1.4f, -0.9f, 0.8f, -0.6f, 0.1f, 0.8f, -0.6f, 0.1f, 0.8f, 1.4f, -0.9f, 0.8f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
