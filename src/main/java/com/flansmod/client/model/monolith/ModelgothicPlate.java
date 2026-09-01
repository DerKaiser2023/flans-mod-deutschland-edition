// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelgothicPlate extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelgothicPlate() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[3];
        this.bodyModel = new ModelRendererTurbo[19];
        this.leftArmModel = new ModelRendererTurbo[10];
        this.rightArmModel = new ModelRendererTurbo[10];
        this.leftLegModel = new ModelRendererTurbo[6];
        this.rightLegModel = new ModelRendererTurbo[5];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -1.0f, -4.0f, 8, 1, 8, 0.0f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.1f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -1.0f, -5.0f, 4, 1, 2, 0.0f, 0.2f, 0.2f, -0.7f, 0.0f, 0.2f, 0.1f, 0.0f, 0.2f, 1.2f, 0.2f, 0.2f, 1.2f, 0.2f, 0.2f, -0.9f, 0.0f, 0.5f, -0.2f, 0.0f, 1.8f, 2.2f, 0.2f, 0.2f, 1.2f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(0.0f, -1.0f, -5.0f, 4, 1, 2, 0.0f, 0.0f, 0.2f, 0.1f, 0.2f, 0.2f, -0.7f, 0.2f, 0.2f, 1.2f, 0.0f, 0.2f, 1.2f, 0.0f, 0.5f, -0.2f, 0.2f, 0.2f, -0.9f, 0.2f, 0.2f, 1.2f, 0.0f, 1.8f, 2.2f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 105, 57, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 73, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 0.4f, -2.0f, 8, 13, 4, 0.0f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, -0.6f, 0.1f, 0.1f, -0.6f, 0.1f, 0.1f, -0.6f, 0.1f, 0.1f, -0.6f, 0.1f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.5f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, -2.0f, -0.3f, 1.0f, 0.0f, 0.2f, 1.5f, 0.0f, -0.7f, 0.5f, -2.0f, -1.0f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, -2.2f, 4, 2, 4, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, 0.2f, 1.5f, -2.0f, -0.3f, 1.0f, -2.0f, -1.0f, 0.5f, 0.0f, -0.7f, 0.5f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.0f, 0.7f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.5f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.4f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 2.5f, -2.0f, 4, 1, 4, 0.0f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f, 0.4f, 0.0f, 0.7f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.5f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -0.3f, 0.3f, -1.5f, -0.3f, 1.2f, 0.0f, -0.3f, 0.8f, -0.8f, -0.3f, 0.5f, -0.2f, 0.5f, 0.5f, 0.0f, 0.5f, 0.8f, 0.0f, 0.5f, 1.0f, -0.2f, 0.5f, 0.7f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, -0.5f, -2.0f, 4, 2, 4, 0.0f, -1.5f, -0.3f, 1.2f, 0.2f, -0.3f, 0.3f, -0.8f, -0.3f, 0.5f, 0.0f, -0.3f, 0.8f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 2.5f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.5f, 0.8f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.7f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 1.2f, 0.4f, 0.0f, 0.7f, 0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 3.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 1.2f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.0f, 6.5f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 1.0f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.4f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-4.0f, 9.4f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.0f, 9.8f, -2.0f, 8, 1, 4, 0.0f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.25f, -0.2f, 0.25f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.0f, 10.8f, -2.0f, 4, 1, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 1.2f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.5f, 1.2f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-4.0f, 4.7f, -3.3f, 4, 1, 1, 0.0f, 0.3f, -1.3f, -0.6f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, -1.3f, 0.0f, 0.3f, 0.7f, -0.6f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, 0.7f, 0.0f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.0f, 3.7f, -3.3f, 4, 1, 1, 0.0f, 0.3f, -1.3f, -0.6f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, -1.3f, 0.0f, 0.3f, 0.7f, -0.6f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, 0.7f, 0.0f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(0.0f, 3.7f, -3.3f, 4, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, -1.3f, -0.6f, 0.3f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, 0.7f, -0.6f, 0.3f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.0f, 4.7f, -3.3f, 4, 1, 1, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, -1.3f, -0.6f, 0.3f, -1.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.3f, 0.7f, -0.6f, 0.3f, 0.7f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 73, 65, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 97, 65, this.textureX, this.textureY);
        this.leftArmModel[7] = new ModelRendererTurbo((ModelBase)this, 113, 65, this.textureX, this.textureY);
        this.leftArmModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.leftArmModel[9] = new ModelRendererTurbo((ModelBase)this, 73, 73, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.1f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 8.5f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, 6.0f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, 4.9f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(2.0f, 1.4f, -2.0f, 1, 3, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(-0.5f, 2.9f, -2.0f, 4, 2, 4, 0.0f, 0.2f, -0.8f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, -0.8f, 0.4f);
        this.leftArmModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(0.0f, -2.1f, -2.0f, 3, 2, 4, 0.0f, 1.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 1.3f, 0.3f, 0.3f, 1.3f, 1.3f, 1.3f, 0.5f, 0.0f, 0.3f, 0.5f, 0.0f, 0.3f, 1.3f, 1.3f, 1.3f);
        this.leftArmModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[7].addShapeBox(0.0f, -1.5f, -2.0f, 3, 2, 4, 0.0f, 0.0f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.leftArmModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[8].addShapeBox(0.0f, -0.5f, -2.0f, 3, 2, 4, 0.0f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f);
        this.leftArmModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[9].addShapeBox(0.0f, 0.5f, -2.0f, 3, 2, 4, 0.0f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f);
        this.leftArmModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.rightArmModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.rightArmModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.rightArmModel[9] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.1f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, -2.1f, -2.0f, 3, 2, 4, 0.0f, 0.3f, 0.3f, 0.3f, 1.3f, 0.3f, 0.3f, 1.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.5f, 0.0f, 0.3f, 1.3f, 1.3f, 1.3f, 1.3f, 1.3f, 1.3f, 0.5f, 0.0f, 0.3f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-3.0f, -1.5f, -2.0f, 3, 2, 4, 0.0f, 0.2f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.4f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, -0.5f, -2.0f, 3, 2, 4, 0.0f, 0.2f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.4f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f);
        this.rightArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.0f, 0.5f, -2.0f, 3, 2, 4, 0.0f, 0.2f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.4f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f, -0.2f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f);
        this.rightArmModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.0f, 8.5f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-3.0f, 6.0f, -2.0f, 4, 3, 4, 0.0f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f, 0.2f, -0.2f, 0.2f);
        this.rightArmModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[7].addShapeBox(-3.0f, 4.9f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[8].addShapeBox(-3.0f, 1.4f, -2.0f, 1, 3, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[9].addShapeBox(-3.5f, 2.9f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, 0.2f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, -0.8f, 0.4f, 0.2f, 0.2f, 0.4f);
        this.rightArmModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftLegModel[4] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.leftLegModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 9.1f, -2.3f, 4, 3, 5, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 0.1f, -2.3f, 4, 5, 3, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 1.6f, -2.0f, 0.0f, 1.6f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, 1.6f, -2.0f, -1.0f, 1.6f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 4.1f, -2.8f, 4, 2, 3, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 5.1f, -2.3f, 4, 4, 5, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -0.4f, 0.2f, -1.0f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[4].addShapeBox(-2.0f, 5.1f, -2.3f, 4, 4, 3, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -0.4f, 0.2f, -1.0f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.leftLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[5].addShapeBox(-2.0f, 0.9f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.leftLegModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.rightLegModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 9.1f, -2.3f, 4, 3, 5, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 0.1f, -2.3f, 4, 5, 3, 0.0f, 0.4f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, -2.0f, 0.0f, 1.6f, 0.4f, 0.5f, 1.6f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -2.0f, -1.0f, 1.6f, 0.2f, -1.0f, 1.6f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 4.1f, -2.8f, 4, 2, 3, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, -0.4f, 0.4f, 0.0f, -0.4f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 5.1f, -2.3f, 4, 4, 5, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, -1.0f, -0.4f, 0.2f, -1.0f, -0.4f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[4].addShapeBox(-2.0f, 0.9f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.rightLegModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
