// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelGermanicLady extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelGermanicLady() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[12];
        this.bodyModel = new ModelRendererTurbo[45];
        this.leftArmModel = new ModelRendererTurbo[7];
        this.rightArmModel = new ModelRendererTurbo[7];
        this.leftLegModel = new ModelRendererTurbo[4];
        this.rightLegModel = new ModelRendererTurbo[4];
        this.initheadModel_1();
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 33, 81, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 89, 97, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 81, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 89, 97, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.1f, -4.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-2.5f, -8.5f, -4.5f, 5, 2, 8, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -8.5f, 2.5f, 8, 6, 2, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.5f, -8.5f, -4.5f, 1, 3, 8, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -2.0f, 2.5f, 8, 4, 2, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 4.5f, -2.0f, 0.5f, 4.5f, -2.0f, 0.5f, 4.0f, 1.0f, 0.5f, 4.0f, 1.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -4.5f, -4.5f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 2.0f, 2.5f, 0.0f, 2.0f, 2.5f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.5f, -8.5f, -4.5f, 1, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, -8.5f, -1.5f, 1, 12, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 3.0f, 1.0f, 0.0f, 3.0f, 1.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(2.5f, -8.5f, -4.5f, 1, 3, 8, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.5f, -0.5f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(3.5f, -8.5f, -1.5f, 1, 12, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 2.0f, -4.0f, 0.0f, 2.0f, -4.0f, 0.0f, 3.0f, 1.0f, 0.0f, 3.0f, 1.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(3.5f, -4.5f, -4.5f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 4.0f, -1.0f, 0.0f, 2.0f, 2.5f, 0.0f, 2.0f, 2.5f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(3.5f, -8.5f, -4.5f, 1, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 113, 41, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 89, 49, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 113, 57, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 121, 49, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 9, 65, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 17, 65, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 2.0f, -2.0f, 8, 3, 4, 0.0f, -0.7f, -0.1f, -0.1f, -0.7f, -0.1f, -0.1f, -0.5f, -1.0f, -0.5f, -0.5f, -1.0f, -0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 0.5f, -1.0f, 0.5f, -1.5f, -1.0f, 0.5f, -1.5f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.0f, -2.0f, 8, 2, 4, 0.0f, -1.2f, 0.0f, 0.7f, -1.2f, 0.0f, 0.7f, -0.8f, 0.0f, -0.5f, -0.8f, 0.0f, -0.5f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.5f, -0.5f, 0.5f, -1.5f, -0.5f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.5f, 5.0f, -3.0f, 7, 4, 4, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.7f, 0.0f, -0.2f, -0.7f, 0.0f, -0.2f, -0.7f, 0.0f, 0.5f, -0.7f, 0.0f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.0f, 11.0f, -2.0f, 6, 2, 4, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.5f, -0.5f, 0.5f, 0.5f, -2.5f, -0.5f, -1.0f, -2.5f, -0.5f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 0.0f, -2.0f, 8, 3, 4, 0.0f, -1.0f, 0.0f, -1.5f, -1.0f, 0.0f, -1.5f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, -0.5f, -0.7f, -0.8f, 0.2f, -0.7f, -0.8f, 0.2f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 10.8f, -2.0f, 4, 3, 4, 0.0f, 0.5f, -0.3f, 0.4f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 0.3f, 1.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, -1.0f, 2.0f, -1.0f, -1.0f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.8f, 1.0f, -0.8f, 0.5f, 0.3f, 0.4f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 1.0f, 0.5f, -0.3f, 1.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 8.8f, -2.0f, 4, 2, 4, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 2.0f, -1.0f, -0.8f, 1.0f, -0.8f, -0.3f, 0.0f, -0.5f, -0.5f, 0.3f, 0.0f, 0.5f, 0.3f, 0.4f, 0.5f, -0.3f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(0.0f, 10.8f, -2.0f, 4, 3, 4, 0.0f, -0.5f, -0.3f, 0.0f, 0.5f, -0.3f, 0.4f, 0.5f, 0.3f, 1.0f, 0.0f, 0.0f, 1.0f, -0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.0f, 2.2f, -2.21f, 4, 2, 2, 0.0f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.7f, -2.0f, 0.2f, 0.0f, -1.9f, 0.2f, -0.5f, -1.2f, -2.0f, -0.7f, -1.2f, -2.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 0.2f, -2.19f, 4, 2, 2, 0.0f, -0.2f, -0.7f, -0.9f, -0.3f, -1.5f, -0.3f, -1.5f, -0.5f, -0.8f, 0.5f, 0.0f, -0.5f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-3.5f, 2.5f, -3.4f, 3, 1, 1, 0.0f, -0.3f, 0.2f, -0.5f, 0.45f, 0.0f, -0.5f, 0.5f, 0.2f, 0.0f, -0.2f, 0.3f, 0.0f, -0.1f, -0.4f, -0.5f, 0.5f, -0.4f, -0.5f, 0.5f, -0.5f, 0.2f, -0.2f, -0.5f, 0.2f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-3.3f, 2.4f, -3.89f, 3, 1, 1, 0.0f, -0.2f, -0.1f, -0.5f, 0.0f, -0.3f, -0.5f, 0.25f, -0.1f, 0.0f, -0.1f, 0.1f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.3f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.3f, 4.09f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.3f, 1.0f, 0.0f, 0.1f, 1.0f, 0.0f, -0.2f, -0.2f, -0.2f, -0.1f, -0.3f, -0.2f, 0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-3.5f, 3.29f, -3.4f, 3, 2, 1, 0.0f, -0.1f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.5f, 0.3f, 0.2f, -0.2f, 0.3f, 0.2f, -0.2f, -0.2f, -0.5f, 0.4f, -0.5f, -0.5f, 0.5f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.3f, 1.7f, -4.4f, 3, 1, 1, 0.0f, -1.3f, -1.6f, 0.0f, -1.4f, -1.6f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -0.8f, 0.0f, -1.2f, 0.9f, 0.0f, -1.3f, 0.9f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-3.3f, 5.09f, -4.4f, 3, 1, 1, 0.0f, -1.2f, 1.5f, 0.0f, -1.3f, 1.5f, 0.0f, 0.0f, 1.9f, 0.0f, 0.0f, 1.9f, 0.0f, -1.3f, -2.2f, 0.0f, -1.5f, -2.2f, 0.0f, -0.1f, -1.3f, -0.3f, -0.2f, -1.2f, -0.3f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-3.5f, 3.29f, -2.0f, 3, 2, 1, 0.0f, -0.2f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.3f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, -0.2f, -0.3f, 0.2f, 0.5f, -0.3f, 0.2f, -0.1f, -1.6f, 0.0f, -0.2f, -1.6f, 0.0f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(0.01f, 0.21f, -2.21f, 4, 2, 2, 0.0f, -0.3f, -1.5f, -0.3f, -0.2f, -0.7f, -0.9f, 0.5f, 0.0f, -0.5f, -1.5f, -0.5f, -0.8f, 0.0f, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(0.0f, 2.2f, -2.21f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.9f, 0.2f, -0.7f, -2.0f, 0.2f, -0.7f, -1.2f, -2.0f, -0.5f, -1.2f, -2.0f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(0.5f, 2.5f, -3.4f, 3, 1, 1, 0.0f, 0.45f, 0.0f, -0.5f, -0.3f, 0.2f, -0.5f, -0.2f, 0.3f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, -0.4f, -0.5f, -0.1f, -0.4f, -0.5f, -0.2f, -0.5f, 0.2f, 0.5f, -0.5f, 0.2f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(0.3f, 2.4f, -3.89f, 3, 1, 1, 0.0f, 0.0f, -0.3f, -0.5f, -0.2f, -0.1f, -0.5f, -0.1f, 0.1f, 0.0f, 0.25f, -0.1f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, 0.1f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.3f, 1.7f, -4.4f, 3, 1, 1, 0.0f, -1.4f, -1.6f, 0.0f, -1.3f, -1.6f, 0.0f, -0.2f, -0.8f, 0.0f, 0.0f, -1.0f, 0.0f, -1.3f, 0.9f, 0.0f, -1.2f, 0.9f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.5f, 3.29f, -2.0f, 3, 2, 1, 0.0f, 0.5f, 0.3f, 0.2f, -0.2f, 0.3f, 0.2f, 0.0f, 1.0f, 0.5f, 0.3f, 1.0f, 0.5f, 0.5f, -0.3f, 0.2f, -0.2f, -0.3f, 0.2f, -0.2f, -1.6f, 0.0f, -0.1f, -1.6f, 0.0f);
        this.bodyModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.5f, 3.29f, -3.4f, 3, 2, 1, 0.0f, 0.4f, 0.2f, -0.5f, -0.1f, 0.2f, -0.5f, -0.2f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.4f, -0.5f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.3f, 0.2f, 0.5f, -0.3f, 0.2f);
        this.bodyModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(0.3f, 4.09f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.9f, -0.5f, 0.0f, 0.9f, -0.5f, 0.1f, 1.0f, 0.0f, 0.3f, 1.0f, 0.0f, -0.1f, -0.3f, -0.2f, -0.2f, -0.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f);
        this.bodyModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(0.3f, 5.09f, -4.4f, 3, 1, 1, 0.0f, -1.3f, 1.5f, 0.0f, -1.2f, 1.5f, 0.0f, 0.0f, 1.9f, 0.0f, 0.0f, 1.9f, 0.0f, -1.5f, -2.2f, 0.0f, -1.3f, -2.2f, 0.0f, -0.2f, -1.2f, -0.3f, -0.1f, -1.3f, -0.3f);
        this.bodyModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-3.5f, 5.0f, -3.0f, 7, 2, 4, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.5f, 1.0f, 0.0f, 1.5f, 1.0f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f);
        this.bodyModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-3.5f, 7.0f, -3.0f, 7, 4, 4, 0.0f, -0.5f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f, 1.2f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f, -0.5f, 2.2f, 1.2f, -0.5f, 2.2f);
        this.bodyModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-1.5f, 7.0f, -4.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-1.5f, 6.0f, -4.0f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-1.5f, 8.0f, -4.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-3.5f, 7.0f, -2.9f, 7, 1, 4, 0.0f, -0.1f, -0.2f, 0.2f, -0.1f, -0.2f, 0.2f, -0.1f, 0.2f, 0.4f, -0.1f, 0.2f, 0.4f, 0.1f, -0.2f, 0.2f, 0.1f, -0.2f, 0.2f, 0.1f, -0.6f, 0.5f, 0.1f, -0.6f, 0.5f);
        this.bodyModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(-2.0f, 3.0f, -4.0f, 4, 2, 1, 0.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[33].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(-3.0f, 3.0f, -4.0f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, 0.5f, -0.2f, 0.0f, 0.3f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f);
        this.bodyModel[34].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(2.0f, 3.0f, -4.0f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 0.5f, 0.5f, -0.2f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.0f, -0.1f, 0.3f, 0.0f, -0.1f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[35].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(-3.0f, 3.0f, -3.0f, 1, 2, 4, 0.0f, 0.5f, -0.2f, 0.0f, 0.0f, -0.5f, -1.0f, 0.0f, 0.5f, 1.0f, 0.7f, 0.5f, 1.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.1f, 0.7f, 0.3f, -1.1f, 0.7f);
        this.bodyModel[36].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(2.0f, 3.0f, -3.0f, 1, 2, 4, 0.0f, 0.0f, -0.5f, -1.0f, 0.5f, -0.2f, 0.0f, 0.7f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, -1.1f, 0.7f, 0.0f, -1.1f, 0.7f);
        this.bodyModel[37].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-2.0f, 3.0f, 0.0f, 4, 2, 1, 0.0f, 0.0f, 0.15f, 0.0f, 0.0f, 0.15f, -1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.1f, 0.7f, 0.0f, -1.1f, 0.7f);
        this.bodyModel[38].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-2.0f, 2.0f, -4.0f, 4, 2, 1, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f);
        this.bodyModel[39].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-3.0f, 2.0f, -4.0f, 1, 2, 1, 0.0f, 0.3f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.0f, -0.3f, -0.5f, 0.3f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, -1.0f, 0.5f, -0.8f, 0.0f);
        this.bodyModel[40].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(2.0f, 2.0f, -4.0f, 1, 2, 1, 0.0f, 0.0f, -0.5f, -0.1f, 0.3f, -0.5f, -0.1f, 0.3f, 0.0f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.5f, 1.0f, 0.0f, -0.5f, 0.5f, 0.5f, -0.8f, 0.0f, 0.0f, -0.5f, -1.0f);
        this.bodyModel[41].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(2.0f, 2.0f, -3.0f, 1, 2, 2, 0.0f, 1.0f, -0.5f, 0.8f, 0.3f, -0.1f, 0.1f, 1.7f, 2.0f, 0.5f, -1.0f, 2.2f, 0.5f, 1.0f, -0.5f, 1.0f, 0.5f, -0.8f, 0.0f, 0.55f, -1.1f, 0.5f, 0.0f, -0.5f, 1.0f);
        this.bodyModel[42].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addShapeBox(-3.0f, 2.0f, -3.0f, 1, 2, 2, 0.0f, 0.3f, -0.1f, 0.1f, 1.0f, -0.5f, 0.8f, -1.0f, 2.2f, 0.5f, 1.7f, 2.0f, 0.5f, 0.5f, -0.8f, 0.0f, 1.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.55f, -1.1f, 0.5f);
        this.bodyModel[43].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[44].addShapeBox(-3.5f, 0.0f, 0.0f, 7, 2, 1, 0.0f, 1.2f, 0.0f, 0.5f, 1.2f, 0.0f, 0.5f, 0.0f, 0.1f, 0.7f, 0.0f, 0.1f, 0.7f, 0.2f, 0.85f, 0.5f, 0.2f, 0.85f, 0.5f, 0.2f, 0.5f, 1.0f, 0.2f, 0.5f, 1.0f);
        this.bodyModel[44].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 73, this.textureX, this.textureY);
        this.leftArmModel[5] = new ModelRendererTurbo((ModelBase)this, 41, 73, this.textureX, this.textureY);
        this.leftArmModel[6] = new ModelRendererTurbo((ModelBase)this, 57, 73, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, 0.8f, 0.0f, -0.2f, -1.0f, -0.2f, -0.2f, -1.0f, -0.2f, -0.2f, 0.8f, 0.0f, -0.2f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 4.7f, -0.7f, 3, 6, 3, 0.0f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.6f, -0.5f, 0.8f, 0.0f, -0.5f, 0.8f, 0.0f, 0.0f, -1.8f, -0.6f, 0.0f, -1.8f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.0f, -1.99f, -1.0f, 3, 1, 3, 0.0f, 0.5f, 0.2f, 0.5f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.8f, 0.2f, -0.2f, 0.99f, 0.0f, 2.01f, -1.5f, -0.8f, 0.0f, -1.5f, -0.8f, -0.7f, 0.2f, 0.0f, -0.7f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, 1.0f, -1.0f, 2.0f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.8f, 0.2f, -0.2f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f);
        this.leftArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-1.0f, 6.0f, -1.0f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.leftArmModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[5].addShapeBox(-0.9f, 7.0f, -1.2f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.leftArmModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[6].addShapeBox(-0.8f, 8.0f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.leftArmModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 97, 65, this.textureX, this.textureY);
        this.rightArmModel[6] = new ModelRendererTurbo((ModelBase)this, 113, 65, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-2.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, -1.0f, -0.2f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, 0.0f, -0.2f, -1.0f, -0.2f, -0.2f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-2.0f, 4.7f, -0.7f, 3, 6, 3, 0.0f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, 0.0f, -0.5f, 0.8f, -0.6f, -0.5f, 0.8f, -0.6f, 0.0f, -1.8f, 0.0f, 0.0f, -1.8f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-2.0f, -2.0f, -1.0f, 3, 7, 3, 0.0f, -1.0f, 0.0f, -0.2f, 1.0f, -1.0f, 2.0f, 0.8f, 0.2f, -0.2f, -1.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-2.0f, -1.99f, -1.0f, 3, 1, 3, 0.0f, -1.0f, 0.0f, -0.2f, 0.5f, 0.2f, 0.5f, 0.8f, 0.2f, -0.2f, -1.0f, 0.0f, -0.2f, -1.5f, -0.8f, 0.0f, 0.99f, 0.0f, 2.01f, 0.2f, 0.0f, -0.7f, -1.5f, -0.8f, -0.7f);
        this.rightArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-2.2f, 8.0f, -1.5f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.rightArmModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-2.1f, 7.0f, -1.2f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.rightArmModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[6].addShapeBox(-2.0f, 6.0f, -1.0f, 3, 1, 3, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.rightArmModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 3, 4, 0.0f, -0.3f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.2f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 4.8f, -2.0f, 4, 7, 4, 0.0f, -0.2f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.5f, 0.0f, -1.5f, -1.0f, 0.0f, -1.5f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-3.5f, -1.0f, -3.0f, 7, 9, 4, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.5f, 2.2f, -0.8f, 0.5f, 2.2f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 9.8f, -2.0f, 4, 2, 4, 0.0f, -0.3f, -0.9f, -0.2f, -0.7f, -0.9f, -0.2f, -0.7f, 0.1f, 0.0f, -0.3f, 0.1f, 0.0f, -0.2f, 0.1f, -0.3f, -0.6f, 0.1f, -0.3f, -0.6f, 0.1f, 0.1f, -0.2f, 0.1f, 0.1f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, 1.8f, -2.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.2f, -0.3f, 0.0f, 0.2f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 4.8f, -2.0f, 4, 7, 4, 0.0f, -0.1f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -1.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 9.8f, -2.0f, 4, 2, 4, 0.0f, -0.7f, -0.9f, -0.2f, -0.3f, -0.9f, -0.2f, -0.3f, 0.1f, 0.0f, -0.7f, 0.1f, 0.0f, -0.6f, 0.1f, -0.3f, -0.2f, 0.1f, -0.3f, -0.2f, 0.1f, 0.1f, -0.6f, 0.1f, 0.1f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-3.5f, -1.0f, -3.0f, 7, 9, 4, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.5f, 2.2f, -0.8f, 0.5f, 2.2f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, 2.0f, -1.0f, 0.0f, 2.0f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
