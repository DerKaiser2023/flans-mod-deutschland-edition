// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelPASGTswat extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelPASGTswat() {
        this.textureX = 64;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[43];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 9, 49, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 33, 49, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 17, 65, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 33, 65, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.headModel[38] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[39] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.headModel[40] = new ModelRendererTurbo((ModelBase)this, 17, 73, this.textureX, this.textureY);
        this.headModel[41] = new ModelRendererTurbo((ModelBase)this, 17, 73, this.textureX, this.textureY);
        this.headModel[42] = new ModelRendererTurbo((ModelBase)this, 33, 73, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(2.0f, -9.0f, -4.0f, 2, 2, 8, 0.0f, 0.5f, -0.1f, -0.2f, 0.0f, -0.3f, -0.5f, 0.3f, -1.0f, 0.7f, 0.5f, -0.7f, 1.0f, 0.0f, -0.5f, 0.8f, 0.3f, -0.5f, 0.3f, 0.7f, 1.3f, 1.2f, 0.0f, 1.3f, 1.5f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(2.0f, -10.0f, -4.0f, 2, 1, 8, 0.0f, 0.5f, -0.1f, -2.5f, -0.8f, -0.5f, -2.7f, -0.7f, -0.8f, -1.5f, 0.5f, -0.4f, -1.0f, 0.5f, 0.1f, -0.2f, 0.0f, 0.3f, -0.5f, 0.3f, 1.0f, 0.7f, 0.5f, 0.7f, 1.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.0f, -9.0f, -4.0f, 2, 2, 8, 0.0f, 0.5f, -0.1f, -0.2f, 0.5f, -0.1f, -0.2f, 0.5f, -0.7f, 1.0f, 0.5f, -0.7f, 1.0f, 1.0f, -0.5f, 0.8f, 1.0f, -0.5f, 0.8f, 1.0f, 1.3f, 1.5f, 1.0f, 1.3f, 1.5f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-1.0f, -6.5f, -4.0f, 2, 2, 8, 0.0f, 1.0f, 1.0f, 0.8f, 1.0f, 1.0f, 0.8f, 1.0f, -0.8f, 1.5f, 1.0f, -0.8f, 1.5f, 1.0f, -1.0f, 1.2f, 1.0f, -1.0f, 1.2f, 0.5f, 2.0f, 1.5f, 0.5f, 2.0f, 1.5f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-1.0f, -5.4f, -5.0f, 2, 1, 3, 0.0f, 1.0f, 0.1f, 0.2f, 1.0f, 0.1f, 0.2f, 0.9f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.5f, 1.2f, 1.0f, -0.5f, 1.2f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-1.5f, -10.0f, -4.0f, 3, 1, 8, 0.0f, 0.0f, -0.1f, -2.5f, 0.0f, -0.1f, -2.5f, 0.0f, -0.4f, -1.0f, 0.0f, -0.4f, -1.0f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.7f, 1.0f, 0.0f, 0.7f, 1.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -0.8f, -4.1f, 10, 1, 1, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, -0.1f, 0.0f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(4.9f, -5.0f, -0.5f, 1, 5, 1, 0.0f, -0.2f, -1.8f, -0.8f, -0.5f, -2.0f, -0.8f, -0.5f, -2.0f, 0.5f, 0.0f, -2.1f, 0.5f, 1.2f, -0.4f, 3.5f, -1.8f, -0.4f, 3.5f, -1.8f, -0.2f, -3.7f, 1.2f, -0.2f, -3.7f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.0f, -6.5f, -4.0f, 1, 2, 3, 0.0f, 1.0f, 1.0f, 0.8f, 0.3f, 1.0f, 0.3f, 0.4f, 0.47f, -0.5f, 1.0f, 0.5f, -0.5f, 1.0f, -1.0f, 1.2f, 0.5f, -1.0f, 0.5f, 0.7f, 0.05f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(2.0f, -6.5f, -2.0f, 2, 2, 4, 0.0f, 0.0f, 0.0f, 0.5f, 0.4f, 0.47f, -0.5f, 0.55f, -0.2f, 0.0f, 1.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.4f, 0.7f, 0.0f, -0.5f, 1.7f, 2.7f, 1.5f, 0.5f, 1.5f, 1.5f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(3.0f, -6.5f, 2.0f, 1, 2, 2, 0.0f, 1.0f, -0.2f, 0.0f, 0.55f, -0.2f, 0.0f, 0.7f, -0.8f, 1.2f, 1.0f, -0.8f, 1.5f, 1.5f, 1.5f, -1.5f, 1.8f, 3.0f, -1.5f, 1.0f, 2.5f, 1.0f, 1.5f, 2.0f, 1.5f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-1.0f, -4.8f, -5.0f, 2, 1, 3, 0.0f, 1.0f, 0.1f, 1.2f, 1.0f, 0.1f, 1.2f, 0.9f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.7f, 1.4f, 1.0f, -0.7f, 1.4f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(3.0f, -5.4f, -5.0f, 1, 1, 3, 0.0f, 1.0f, 0.1f, 0.2f, 0.5f, 0.1f, -0.5f, 0.7f, -0.8f, 0.0f, 1.0f, -0.8f, 0.0f, 1.0f, -0.5f, 1.2f, 0.8f, -0.5f, 0.5f, 1.7f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(2.9f, -5.4f, -1.5f, 1, 1, 1, 0.0f, 1.0f, -0.8f, 0.5f, 0.7f, -0.8f, 0.5f, 0.7f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 1.0f, 0.5f, 0.5f, 1.8f, 0.5f, 0.5f, 1.6f, -0.5f, -0.5f, 1.0f, -0.5f, -0.5f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(2.9f, -5.4f, -1.5f, 1, 1, 3, 0.0f, 1.0f, 0.1f, -0.5f, 0.7f, 0.1f, -0.5f, 0.8f, -0.4f, 1.5f, 1.0f, -0.4f, 1.5f, 1.0f, -0.5f, -0.5f, 1.6f, -0.5f, -0.5f, 1.6f, -0.1f, 1.5f, 1.0f, -0.1f, 1.5f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(2.9f, -5.2f, 2.5f, 1, 1, 1, 0.0f, 1.0f, -0.2f, -0.5f, 0.8f, -0.2f, -0.5f, 0.7f, -0.8f, 0.0f, 1.0f, -0.8f, 0.5f, 1.0f, -0.5f, -0.5f, 1.6f, -0.3f, -0.5f, 1.9f, 2.7f, 0.0f, 0.0f, 1.5f, 0.5f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(3.9f, -5.4f, -1.5f, 1, 1, 3, 0.0f, -1.0f, -0.5f, -0.5f, 0.6f, -0.5f, -0.5f, 0.6f, -0.9f, 1.5f, -1.0f, -0.9f, 1.5f, -1.0f, 0.1f, -0.5f, 0.8f, 0.5f, 0.5f, 0.9f, 2.9f, 2.0f, -1.0f, 2.7f, 2.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(3.9f, -1.0f, -0.5f, 1, 1, 3, 0.0f, -1.5f, 2.9f, 1.5f, 0.8f, 2.92f, 1.5f, 0.9f, 0.5f, 1.0f, -1.0f, 0.7f, 1.0f, -1.7f, -2.0f, 1.2f, 1.0f, -2.0f, 1.2f, 1.0f, -1.2f, -0.5f, -1.2f, -1.4f, -0.5f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(3.0f, -4.8f, -5.0f, 1, 1, 3, 0.0f, 1.0f, 0.1f, 1.2f, 0.8f, 0.1f, 0.5f, 1.7f, -0.9f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.7f, 1.4f, 0.8f, -0.7f, 0.7f, 1.7f, 0.0f, 0.07f, 1.0f, -0.5f, 0.0f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-4.0f, -5.4f, -5.0f, 1, 1, 3, 0.0f, 0.5f, 0.1f, -0.5f, 1.0f, 0.1f, 0.2f, 1.0f, -0.8f, 0.0f, 0.7f, -0.8f, 0.0f, 0.8f, -0.5f, 0.5f, 1.0f, -0.5f, 1.2f, 1.0f, 0.5f, 0.0f, 1.7f, 0.5f, 0.0f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-4.0f, -4.8f, -5.0f, 1, 1, 3, 0.0f, 0.8f, 0.1f, 0.5f, 1.0f, 0.1f, 1.2f, 1.0f, 0.0f, 0.0f, 1.7f, -0.9f, 0.0f, 0.8f, -0.7f, 0.7f, 1.0f, -0.7f, 1.4f, 1.0f, -0.5f, 0.0f, 1.7f, 0.0f, 0.07f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-4.0f, -6.5f, -4.0f, 1, 2, 3, 0.0f, 0.3f, 1.0f, 0.3f, 1.0f, 1.0f, 0.8f, 1.0f, 0.5f, -0.5f, 0.4f, 0.47f, -0.5f, 0.5f, -1.0f, 0.5f, 1.0f, -1.0f, 1.2f, 0.0f, 0.0f, -0.5f, 0.7f, 0.1f, -0.5f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-4.0f, -9.0f, -4.0f, 2, 2, 8, 0.0f, 0.0f, -0.3f, -0.5f, 0.5f, -0.1f, -0.2f, 0.5f, -0.7f, 1.0f, 0.3f, -1.0f, 0.7f, 0.3f, -0.5f, 0.3f, 0.0f, -0.5f, 0.8f, 0.0f, 1.3f, 1.5f, 0.7f, 1.3f, 1.2f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-4.0f, -10.0f, -4.0f, 2, 1, 8, 0.0f, -0.8f, -0.5f, -2.7f, 0.5f, -0.1f, -2.5f, 0.5f, -0.4f, -1.0f, -0.7f, -0.8f, -1.5f, 0.0f, 0.3f, -0.5f, 0.5f, 0.1f, -0.2f, 0.5f, 0.7f, 1.0f, 0.3f, 1.0f, 0.7f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-4.0f, -6.5f, -2.0f, 2, 2, 4, 0.0f, 0.4f, 0.47f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.0f, 0.55f, -0.2f, 0.0f, 0.7f, 0.0f, -0.5f, 0.5f, 0.0f, 0.4f, 0.5f, 1.5f, 1.5f, 1.7f, 2.7f, 1.5f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-3.9f, -5.4f, -1.5f, 1, 1, 3, 0.0f, 0.7f, 0.1f, -0.5f, 1.0f, 0.1f, -0.5f, 1.0f, -0.4f, 1.5f, 0.8f, -0.4f, 1.5f, 1.6f, -0.5f, -0.5f, 1.0f, -0.5f, -0.5f, 1.0f, -0.1f, 1.5f, 1.6f, -0.1f, 1.5f);
        this.headModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-3.9f, -5.4f, -1.5f, 1, 1, 1, 0.0f, 0.7f, -0.8f, 0.5f, 1.0f, -0.8f, 0.5f, 1.0f, 0.1f, -0.5f, 0.7f, 0.1f, -0.5f, 1.8f, 0.5f, 0.5f, 1.0f, 0.5f, 0.5f, 1.0f, -0.5f, -0.5f, 1.6f, -0.5f, -0.5f);
        this.headModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-4.9f, -1.0f, -0.5f, 1, 1, 3, 0.0f, 0.8f, 2.9f, 1.5f, -1.5f, 2.9f, 1.5f, -1.0f, 0.7f, 1.0f, 0.9f, 0.5f, 1.0f, 1.0f, -2.0f, 1.2f, -1.7f, -2.0f, 1.2f, -1.2f, -1.4f, -0.5f, 1.0f, -1.2f, -0.5f);
        this.headModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(-3.9f, -5.2f, 2.5f, 1, 1, 1, 0.0f, 0.8f, -0.2f, -0.5f, 1.0f, -0.2f, -0.5f, 1.0f, -0.8f, 0.5f, 0.7f, -0.8f, 0.0f, 1.6f, -0.3f, -0.5f, 1.0f, -0.5f, -0.5f, 0.0f, 1.5f, 0.5f, 1.9f, 2.7f, 0.0f);
        this.headModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-4.9f, -5.4f, -1.5f, 1, 1, 3, 0.0f, 0.6f, -0.5f, -0.5f, -1.0f, -0.5f, -0.5f, -1.0f, -0.9f, 1.5f, 0.6f, -0.9f, 1.5f, 0.8f, 0.5f, 0.5f, -1.0f, 0.1f, -0.5f, -1.0f, 2.7f, 2.0f, 0.9f, 2.9f, 2.0f);
        this.headModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(-4.0f, -6.5f, 2.0f, 1, 2, 2, 0.0f, 0.55f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.8f, 1.5f, 0.7f, -0.8f, 1.2f, 1.8f, 3.0f, -1.5f, 1.5f, 1.5f, -1.5f, 1.5f, 2.0f, 1.5f, 1.0f, 2.5f, 1.0f);
        this.headModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(-5.9f, -5.0f, -0.5f, 1, 5, 1, 0.0f, -0.5f, -2.0f, -0.8f, -0.2f, -1.8f, -0.8f, 0.0f, -2.1f, 0.5f, -0.5f, -2.0f, 0.5f, -1.8f, -0.4f, 3.5f, 1.2f, -0.4f, 3.5f, 1.2f, -0.2f, -3.7f, -1.8f, -0.2f, -3.7f);
        this.headModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(5.55f, -4.3f, -0.1f, 1, 1, 1, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.headModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(5.4f, -4.2f, -0.4f, 1, 1, 1, 0.0f, -0.5f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.7f, 1.0f, 0.0f, -0.7f, 1.0f, 0.0f, 0.3f, -1.5f, -0.5f, 0.3f, -1.5f);
        this.headModel[33].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(5.4f, -3.9f, -1.4f, 1, 2, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 1.0f, 0.2f, 0.0f, 1.0f, 0.2f, 0.0f, 0.7f, -0.4f, -0.5f, 0.7f, -0.4f);
        this.headModel[34].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(5.6f, -3.9f, -6.1f, 1, 3, 5, 0.0f, 0.65f, 0.5f, -0.2f, -1.35f, 0.5f, -0.5f, -0.35f, 0.0f, -0.2f, -0.35f, 0.0f, -0.2f, 0.65f, 2.0f, -0.2f, -1.35f, 2.0f, -0.5f, -0.35f, 0.3f, -0.2f, -0.35f, 0.3f, -0.2f);
        this.headModel[35].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(2.0f, -3.9f, -6.25f, 3, 5, 1, 0.0f, 0.0f, 0.5f, 0.65f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -1.35f, 0.0f, 0.5f, 0.65f, 0.0f, 0.0f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.5f, -1.35f);
        this.headModel[36].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(-2.0f, -3.9f, -7.25f, 4, 5, 1, 0.0f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, -0.35f);
        this.headModel[37].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[38].addShapeBox(-6.55f, -4.3f, -0.1f, 1, 1, 1, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.headModel[38].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[39].addShapeBox(-6.4f, -4.2f, -0.4f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -0.2f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.7f, 1.0f, -0.5f, -0.7f, 1.0f, -0.5f, 0.3f, -1.5f, 0.0f, 0.3f, -1.5f);
        this.headModel[39].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[40].addShapeBox(-6.4f, -3.9f, -1.4f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.2f, -0.5f, 1.0f, 0.2f, -0.5f, 0.7f, -0.4f, 0.0f, 0.7f, -0.4f);
        this.headModel[40].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[41].addShapeBox(-6.4f, -3.9f, -6.1f, 1, 3, 5, 0.0f, -1.35f, 0.5f, -0.5f, 0.65f, 0.5f, -0.2f, -0.35f, 0.0f, -0.2f, -0.35f, 0.0f, -0.2f, -1.35f, 2.0f, -0.5f, 0.65f, 2.0f, -0.2f, -0.35f, 0.3f, -0.2f, -0.35f, 0.3f, -0.2f);
        this.headModel[41].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[42].addShapeBox(-5.0f, -3.9f, -6.25f, 3, 5, 1, 0.0f, 0.0f, 0.5f, -0.35f, 0.0f, 0.5f, 0.65f, 0.0f, 0.5f, -1.35f, 0.0f, 0.5f, -0.35f, 0.0f, 0.0f, -0.35f, 0.0f, 0.5f, 0.65f, 0.0f, 0.5f, -1.35f, 0.0f, 0.0f, -0.35f);
        this.headModel[42].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
