// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelAlmainRivet extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAlmainRivet() {
        this.textureX = 64;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[15];
        this.leftArmModel = new ModelRendererTurbo[3];
        this.rightArmModel = new ModelRendererTurbo[3];
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
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 1.5f, -2.5f, 4, 3, 5, 0.0f, -0.2f, 0.0f, 0.6f, 0.0f, -0.5f, 1.5f, 0.0f, 0.0f, 1.0f, -0.2f, 0.0f, 0.7f, -0.3f, -1.0f, 0.8f, 0.0f, 0.0f, 2.3f, 0.0f, 0.0f, 1.5f, -0.3f, -1.0f, 0.8f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 4.5f, -2.5f, 4, 2, 5, 0.0f, -0.3f, 1.0f, 0.8f, 0.0f, 0.0f, 2.3f, 0.0f, 0.0f, 1.5f, -0.3f, 1.0f, 0.8f, 0.8f, -1.0f, 1.0f, 0.0f, 0.51f, 2.5f, 0.0f, 0.0f, 1.6f, 0.8f, -1.0f, 0.9f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 6.5f, -2.5f, 4, 3, 5, 0.0f, 0.8f, 1.0f, 1.0f, 0.0f, -0.5f, 2.5f, 0.0f, 0.0f, 1.6f, 0.8f, 1.0f, 0.9f, 0.6f, -1.0f, 0.8f, 0.0f, 0.2f, 2.2f, 0.0f, 0.0f, 1.7f, 0.6f, -1.0f, 0.7f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 10.0f, -2.5f, 4, 1, 5, 0.0f, 0.3f, 1.5f, 0.8f, 0.0f, 0.3f, 2.2f, 0.0f, 0.5f, 1.7f, 0.3f, 1.5f, 0.4f, 0.9f, -1.6f, 1.0f, 0.0f, -0.5f, 2.8f, 0.0f, -0.8f, 2.3f, 0.9f, -1.6f, 0.6f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, -1.0f, -2.0f, 1, 1, 4, 0.0f, 0.0f, 0.0f, 0.6f, -0.2f, 0.0f, 0.6f, -0.2f, 0.0f, 0.6f, 0.0f, 0.0f, 0.6f, -0.5f, 1.1f, 1.3f, 0.3f, 1.0f, 1.3f, 0.3f, 1.0f, 1.3f, -0.5f, 1.2f, 1.3f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, -0.5f, -2.5f, 4, 3, 5, 0.0f, 0.5f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.0f, 0.2f, -0.5f, 0.0f, 0.3f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 0.3f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 0.5f, -2.5f, 2, 1, 5, 0.0f, 0.0f, 0.3f, 0.3f, -0.5f, 0.6f, 0.4f, -0.5f, 0.6f, 0.4f, 0.0f, 0.3f, 0.3f, -0.2f, 0.0f, 0.6f, 0.0f, 0.25f, 1.0f, 0.0f, 0.0f, 0.85f, -0.2f, 0.0f, 0.7f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-6.0f, -0.7f, -2.5f, 2, 2, 5, 0.0f, 0.0f, 0.2f, 0.2f, -0.3f, 0.1f, 0.2f, -0.3f, 0.1f, 0.2f, 0.0f, 0.2f, 0.2f, -0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.5f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, -0.5f, -2.5f, 4, 3, 5, 0.0f, 0.0f, 0.2f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.0f, 1.0f, -0.5f, 0.0f, 0.3f, -0.5f, 0.0f, 0.3f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 1.5f, -2.5f, 4, 3, 5, 0.0f, 0.0f, -0.5f, 1.5f, -0.2f, 0.0f, 0.6f, -0.2f, 0.0f, 0.7f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 2.3f, -0.3f, -1.0f, 0.8f, -0.3f, -1.0f, 0.8f, 0.0f, 0.0f, 1.5f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 4.5f, -2.5f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 2.3f, -0.3f, 1.0f, 0.8f, -0.3f, 1.0f, 0.8f, 0.0f, 0.0f, 1.5f, 0.0f, 0.51f, 2.5f, 0.8f, -1.0f, 1.0f, 0.8f, -1.0f, 0.9f, 0.0f, 0.0f, 1.6f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 6.5f, -2.5f, 4, 3, 5, 0.0f, 0.0f, -0.5f, 2.5f, 0.8f, 1.0f, 1.0f, 0.8f, 1.0f, 0.9f, 0.0f, 0.0f, 1.6f, 0.0f, 0.2f, 2.2f, 0.6f, -1.0f, 0.8f, 0.6f, -1.0f, 0.7f, 0.0f, 0.0f, 1.7f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.0f, 10.0f, -2.5f, 4, 1, 5, 0.0f, 0.0f, 0.3f, 2.2f, 0.3f, 1.5f, 0.8f, 0.3f, 1.5f, 0.4f, 0.0f, 0.5f, 1.7f, 0.0f, -0.5f, 2.8f, 0.9f, -1.6f, 1.0f, 0.9f, -1.6f, 0.6f, 0.0f, -0.8f, 2.3f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(2.0f, 0.5f, -2.5f, 2, 1, 5, 0.0f, -0.5f, 0.6f, 0.4f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, -0.5f, 0.6f, 0.4f, 0.0f, 0.25f, 1.0f, -0.2f, 0.0f, 0.6f, -0.2f, 0.0f, 0.7f, 0.0f, 0.0f, 0.85f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(4.0f, -0.7f, -2.5f, 2, 2, 5, 0.0f, -0.3f, 0.1f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -0.3f, 0.1f, 0.2f, 0.2f, 0.0f, 0.3f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.3f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(0.5f, -2.5f, -2.5f, 2, 2, 5, 0.0f, -0.3f, 0.1f, 0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -0.3f, 0.1f, 0.1f, 0.2f, -0.1f, 0.3f, -0.4f, 0.7f, 0.5f, -0.4f, 0.7f, 0.5f, 0.2f, -0.1f, 0.3f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(2.0f, -2.2f, -2.5f, 2, 2, 5, 0.0f, -0.3f, 0.1f, 0.1f, 0.3f, -0.3f, 0.2f, 0.3f, -0.3f, 0.2f, -0.3f, 0.1f, 0.1f, 0.2f, -0.1f, 0.3f, -1.5f, 1.0f, 0.5f, -1.5f, 1.0f, 0.5f, 0.2f, -0.1f, 0.3f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(2.0f, -1.0f, -2.5f, 2, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.3f, 0.1f, -0.2f, 0.3f, 0.1f, 0.0f, 0.0f, 0.0f, -0.5f, 0.8f, 0.1f, 0.6f, -0.2f, 0.2f, 0.6f, -0.2f, 0.2f, -0.5f, 0.8f, 0.1f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-2.5f, -2.5f, -2.5f, 2, 2, 5, 0.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.1f, 0.1f, -0.3f, 0.1f, 0.1f, 0.0f, 0.0f, 0.2f, -0.4f, 0.7f, 0.5f, 0.2f, -0.1f, 0.3f, 0.2f, -0.1f, 0.3f, -0.4f, 0.7f, 0.5f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, -2.2f, -2.5f, 2, 2, 5, 0.0f, 0.3f, -0.3f, 0.2f, -0.3f, 0.1f, 0.1f, -0.3f, 0.1f, 0.1f, 0.3f, -0.3f, 0.2f, -1.5f, 1.0f, 0.5f, 0.2f, -0.1f, 0.3f, 0.2f, -0.1f, 0.3f, -1.5f, 1.0f, 0.5f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.0f, -1.0f, -2.5f, 2, 2, 5, 0.0f, -0.2f, 0.3f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.3f, 0.1f, 0.6f, -0.2f, 0.2f, -0.5f, 0.8f, 0.1f, -0.5f, 0.8f, 0.1f, 0.6f, -0.2f, 0.2f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -2.5f, -3.5f, 4, 1, 1, 0.0f, 0.0f, -0.7f, 1.0f, 0.2f, 0.0f, 0.1f, 0.3f, 0.0f, 0.1f, 0.0f, -0.7f, 0.6f, 0.0f, 0.4f, 1.2f, 0.8f, 0.0f, 0.3f, 1.0f, 0.0f, 0.3f, 0.0f, 0.4f, 0.6f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -1.0f, -3.5f, 4, 1, 1, 0.0f, 0.0f, 0.0f, 1.4f, 0.6f, 0.5f, 0.5f, 0.8f, 0.5f, -0.1f, 0.0f, 0.0f, -0.6f, -0.9f, 0.4f, 1.2f, 1.5f, 0.0f, 0.3f, 1.5f, 0.0f, -0.2f, -0.9f, 0.4f, -0.8f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-1.5f, 0.5f, -3.5f, 4, 3, 1, 0.0f, -0.3f, 0.0f, 1.4f, 0.8f, 0.5f, 0.5f, 1.0f, 0.5f, -0.1f, -0.3f, 0.0f, -0.6f, -0.6f, 0.4f, 0.9f, 1.3f, 0.0f, 0.0f, 1.3f, 0.0f, 0.1f, -0.6f, 0.4f, -0.5f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-1.5f, 1.7f, -3.5f, 4, 3, 1, 0.0f, -0.3f, 0.0f, 1.4f, 1.2f, 0.5f, 0.5f, 1.2f, 0.5f, -0.1f, -0.3f, 0.0f, -0.6f, -0.6f, 0.4f, 0.9f, 1.6f, 0.0f, 0.0f, 1.6f, 0.0f, 0.1f, -0.6f, 0.4f, -0.5f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-1.5f, 3.0f, -3.5f, 4, 3, 1, 0.0f, -0.3f, 0.0f, 1.4f, 1.4f, 0.5f, 0.5f, 1.4f, 0.5f, -0.1f, -0.3f, 0.0f, -0.6f, -0.6f, -0.1f, 0.9f, 1.8f, -0.8f, 0.0f, 1.8f, -0.8f, 0.1f, -0.6f, -0.1f, -0.5f);
        this.leftLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -2.5f, -3.5f, 4, 1, 1, 0.0f, 0.2f, 0.0f, 0.1f, 0.0f, -0.7f, 1.0f, 0.0f, -0.7f, 0.6f, 0.3f, 0.0f, 0.1f, 0.8f, 0.0f, 0.3f, 0.0f, 0.4f, 1.2f, 0.0f, 0.4f, 0.6f, 1.0f, 0.0f, 0.3f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -1.0f, -3.5f, 4, 1, 1, 0.0f, 0.6f, 0.5f, 0.5f, 0.0f, 0.0f, 1.4f, 0.0f, 0.0f, -0.6f, 0.8f, 0.5f, -0.1f, 1.5f, 0.0f, 0.3f, -0.9f, 0.4f, 1.2f, -0.9f, 0.4f, -0.8f, 1.5f, 0.0f, -0.2f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.5f, 0.5f, -3.5f, 4, 3, 1, 0.0f, 0.8f, 0.5f, 0.5f, -0.3f, 0.0f, 1.4f, -0.3f, 0.0f, -0.6f, 1.0f, 0.5f, -0.1f, 1.3f, 0.0f, 0.0f, -0.6f, 0.4f, 0.9f, -0.6f, 0.4f, -0.5f, 1.3f, 0.0f, 0.1f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.5f, 1.7f, -3.5f, 4, 3, 1, 0.0f, 1.2f, 0.5f, 0.5f, -0.3f, 0.0f, 1.4f, -0.3f, 0.0f, -0.6f, 1.2f, 0.5f, -0.1f, 1.6f, 0.0f, 0.0f, -0.6f, 0.4f, 0.9f, -0.6f, 0.4f, -0.5f, 1.6f, 0.0f, 0.1f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.5f, 3.0f, -3.5f, 4, 3, 1, 0.0f, 1.4f, 0.5f, 0.5f, -0.3f, 0.0f, 1.4f, -0.3f, 0.0f, -0.6f, 1.4f, 0.5f, -0.1f, 1.8f, -0.8f, 0.0f, -0.6f, -0.1f, 0.9f, -0.6f, -0.1f, -0.5f, 1.8f, -0.8f, 0.1f);
        this.rightLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
