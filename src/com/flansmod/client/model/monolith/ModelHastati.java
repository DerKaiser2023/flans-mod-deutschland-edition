// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelHastati extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelHastati() {
        this.textureX = 64;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[16];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[3];
        this.rightLegModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 9, 57, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 9.5f, -2.0f, 8, 1, 4, 0.0f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 11.3f, -2.0f, 8, 4, 4, 0.0f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.3f, 0.1f, 0.3f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f, 0.8f, 0.7f, 0.8f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 9, 4, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 9.0f, -2.0f, 8, 1, 4, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 10.3f, -2.0f, 8, 1, 4, 0.0f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.1f, -0.1f, 0.1f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f, 0.3f, -0.1f, 0.3f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.5f, 1.0f, -2.5f, 7, 6, 1, 0.0f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f, 0.35f, 0.0f, 0.35f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-3.0f, 6.5f, -2.5f, 6, 1, 5, 0.0f, 1.4f, -0.2f, 0.1f, 1.4f, -0.2f, 0.1f, 1.4f, -2.2f, 0.1f, 1.4f, -2.2f, 0.1f, 1.4f, -0.2f, 0.1f, 1.4f, -0.2f, 0.1f, 1.4f, 1.8f, 0.1f, 1.4f, 1.8f, 0.1f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-3.5f, -0.5f, -2.5f, 1, 2, 5, 0.0f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, -0.5f, 0.35f, -0.2f, -0.5f, 0.35f, -0.2f, -1.5f, 0.35f, -0.2f, -1.5f, 0.35f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(2.5f, -0.5f, -2.5f, 1, 2, 5, 0.0f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, 0.0f, 0.35f, -0.2f, -0.5f, 0.35f, -0.2f, -0.5f, 0.35f, -0.2f, -1.5f, 0.35f, -0.2f, -1.5f, 0.35f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-3.5f, -0.7f, 1.8f, 7, 1, 1, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-2.9f, 1.0f, -3.5f, 3, 3, 1, 0.0f, 0.0f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f, 0.0f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.5f, -0.2f, -0.2f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-0.1f, 1.0f, -3.5f, 3, 3, 1, 0.0f, -0.5f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.5f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-0.1f, 3.5f, -3.5f, 3, 2, 1, 0.0f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-2.9f, 3.5f, -3.5f, 3, 2, 1, 0.0f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-0.1f, 5.0f, -3.5f, 3, 2, 1, 0.0f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-2.9f, 5.0f, -3.5f, 3, 2, 1, 0.0f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, -0.5f, -0.5f, -0.2f, -0.5f, -0.5f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.0f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f, 0.4f, 0.1f, 0.4f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 5.0f, -2.0f, 2, 2, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -2.8f, 0.1f, 0.0f, -2.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 7.0f, -2.0f, 2, 4, 4, 0.0f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -0.8f, 0.1f, 0.0f, -0.8f, 0.1f, 0.0f, 0.1f, 2.1f, 0.0f, 0.1f, 2.1f, 0.0f, -1.8f, 0.1f, 0.0f, -1.8f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY)).addShapeBox(-2.0f, 11.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.4f, 0.1f, -0.5f, 0.1f, 0.1f, -0.5f, 0.1f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.4f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
