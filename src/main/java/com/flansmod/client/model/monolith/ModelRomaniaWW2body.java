// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelRomaniaWW2body extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelRomaniaWW2body() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[55];
        this.leftArmModel = new ModelRendererTurbo[1];
        this.rightArmModel = new ModelRendererTurbo[1];
        this.leftLegModel = new ModelRendererTurbo[4];
        this.rightLegModel = new ModelRendererTurbo[4];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 1, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 9, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 73, 33, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 113, 65, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase)this, 25, 73, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase)this, 17, 65, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase)this, 113, 33, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.3f, 8.05f, -2.55f, 9, 1, 5, 0.0f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.5f, 0.1f, -0.2f, -0.1f, 0.1f, -0.2f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(2.3f, 7.9f, -2.6f, 1, 1, 1, 0.0f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-3.3f, 7.9f, -2.6f, 1, 1, 1, 0.0f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-3.3f, 0.1f, -2.55f, 1, 7, 4, 0.0f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(2.3f, 0.1f, -2.55f, 1, 7, 4, 0.0f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.5f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-3.3f, 5.0f, -2.65f, 1, 1, 2, 0.0f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(2.3f, 5.0f, -2.65f, 1, 1, 2, 0.0f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f, -0.13f, -0.2f, -0.2f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(2.3f, 5.0f, -2.75f, 1, 1, 1, 0.0f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-3.3f, 5.0f, -2.75f, 1, 1, 1, 0.0f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f, -0.25f, -0.3f, -0.25f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-0.5f, 2.7f, 1.5f, 1, 5, 1, 0.0f, -0.15f, -0.9f, -0.2f, -0.15f, -0.9f, -0.2f, -0.15f, -0.9f, -0.2f, -0.15f, -0.9f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f, -0.15f, 0.3f, -0.2f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-0.5f, 3.4f, 1.55f, 1, 1, 1, 0.0f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f, -0.1f, -0.2f, -0.2f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-0.5f, 3.4f, 1.6f, 1, 1, 1, 0.0f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-0.5f, 8.1f, 1.5f, 1, 1, 1, 0.0f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f, -0.15f, 0.1f, -0.2f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-0.5f, 1.0f, -2.3f, 1, 1, 1, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, -2.4f, 2, 1, 1, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-2.0f, 0.0f, -2.4f, 2, 1, 1, 0.0f, 0.0f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, -0.75f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -1.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.5f, 0.0f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-0.5f, 2.5f, -2.3f, 1, 1, 1, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-0.5f, 4.25f, -2.3f, 1, 1, 1, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-0.5f, 6.0f, -2.3f, 1, 1, 1, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f, -0.27f, -0.27f, 0.0f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-0.5f, 8.0f, -2.2f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-3.15f, 0.1f, 0.45f, 3, 3, 2, 0.0f, 0.0f, 0.5f, -0.2f, -2.3f, 0.5f, -0.2f, -2.3f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, -2.75f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, -2.75f, 0.5f, -0.2f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(0.15f, 0.1f, 0.45f, 3, 3, 2, 0.0f, -2.3f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, -2.3f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f, -2.75f, 0.5f, -0.2f, -2.75f, 0.5f, -0.2f, 0.5f, 0.5f, -0.2f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-0.95f, 8.05f, -2.6f, 2, 1, 3, 0.0f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f, -0.25f, 0.11f, -0.2f);
        this.bodyModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-3.2f, 8.2f, 1.05f, 3, 2, 2, 0.0f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f, -0.25f, 0.35f, -0.2f);
        this.bodyModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-3.2f, 7.7f, 1.1f, 3, 1, 2, 0.0f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, 0.0f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f, -0.23f, -0.2f, -0.2f);
        this.bodyModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-2.2f, 8.4f, 2.15f, 1, 1, 1, 0.0f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f, -0.32f, 0.2f, -0.2f);
        this.bodyModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-2.2f, 8.6f, 2.2f, 1, 1, 1, 0.0f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f, -0.28f, -0.32f, -0.2f);
        this.bodyModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-2.2f, 10.4f, 2.0f, 1, 1, 1, 0.0f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.2f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f, -0.1f, 0.35f, -0.2f);
        this.bodyModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-2.2f, 12.55f, 2.0f, 1, 1, 1, 0.0f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.18f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f, -0.22f, 0.8f, -0.2f);
        this.bodyModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(-2.2f, 14.55f, 2.0f, 1, 1, 1, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f, -0.15f, -0.8f, -0.2f);
        this.bodyModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-2.2f, 14.95f, 2.0f, 1, 1, 1, 0.0f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.15f, 0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f);
        this.bodyModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(1.8f, 8.65f, 2.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.bodyModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(1.8f, 7.75f, 2.0f, 2, 1, 1, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, -0.3f, -0.45f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(1.8f, 7.5f, 2.0f, 2, 1, 1, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.bodyModel[33].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(1.8f, 9.1f, 2.0f, 2, 1, 1, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.bodyModel[34].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(1.8f, 9.8f, 2.0f, 2, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f);
        this.bodyModel[35].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(1.8f, 7.2f, 2.1f, 2, 1, 1, 0.0f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f, -0.75f, -0.35f, -0.3f);
        this.bodyModel[36].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(1.8f, 6.95f, 2.1f, 2, 1, 1, 0.0f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f, -0.7f, -0.3f, -0.25f);
        this.bodyModel[37].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-0.5f, 1.0f, -2.25f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.1f, 0.0f, 0.0f, -3.1f, 0.0f, 0.0f, -3.1f, 0.0f, 0.0f, -3.1f, 0.0f);
        this.bodyModel[38].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(-4.0f, -0.1f, -2.0f, 4, 1, 4, 0.0f, 0.1f, 0.0f, 0.1f, -1.5f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f);
        this.bodyModel[39].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(-4.0f, 0.9f, -2.0f, 8, 11, 4, 0.0f, 0.1f, -0.1f, 0.2f, 0.1f, -0.1f, 0.2f, 0.1f, -0.1f, 0.2f, 0.1f, -0.1f, 0.2f, 0.1f, -3.0f, 0.0f, 0.1f, -3.0f, 0.0f, 0.1f, -3.0f, 0.0f, 0.1f, -3.0f, 0.0f);
        this.bodyModel[40].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(0.0f, -0.1f, -2.0f, 4, 1, 4, 0.0f, -1.5f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f);
        this.bodyModel[41].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(-3.9f, 7.0f, -2.3f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[42].func_78793_a(0.0f, -5.0f, 0.0f);
        this.bodyModel[43].func_78790_a(-3.9f, 8.0f, -2.25f, 3, 2, 1, 0.0f);
        this.bodyModel[43].func_78793_a(0.0f, -5.0f, 0.0f);
        this.bodyModel[44].func_78790_a(0.9f, 7.0f, -2.3f, 3, 1, 1, 0.0f);
        this.bodyModel[44].func_78793_a(0.0f, -5.0f, 0.0f);
        this.bodyModel[45].func_78790_a(0.9f, 8.0f, -2.25f, 3, 2, 1, 0.0f);
        this.bodyModel[45].func_78793_a(0.0f, -5.0f, 0.0f);
        this.bodyModel[46].addShapeBox(-1.5f, -0.09f, -2.05f, 3, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.14f, 0.0f, 0.0f, 3.14f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[46].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[47].addShapeBox(2.37f, 8.3f, 2.27f, 12, 6, 1, 0.0f, 0.0f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, 0.0f, -0.2f, -0.22f, 0.0f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, 0.0f, -5.25f, -0.22f);
        this.bodyModel[47].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[48].addShapeBox(-2.13f, 9.5f, 2.12f, 12, 6, 1, 0.0f, 0.0f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, -11.15f, -0.2f, -0.22f, 0.0f, -0.2f, -0.22f, 0.0f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, -11.15f, -5.25f, -0.22f, 0.0f, -5.25f, -0.22f);
        this.bodyModel[48].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[49].addShapeBox(-4.0f, 8.0f, -3.25f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, -0.75f, -0.5f, 0.0f, -0.75f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f);
        this.bodyModel[49].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[50].addShapeBox(-4.0f, 8.1f, -3.45f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, 0.0f, -0.75f, -0.5f, 0.0f, -0.75f, -0.5f, -0.75f, 0.0f, -0.5f, -0.75f);
        this.bodyModel[50].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[51].addShapeBox(0.8f, 8.0f, -3.25f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, 0.0f, -0.75f, -0.5f, 0.0f, -0.75f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f);
        this.bodyModel[51].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[52].addShapeBox(0.8f, 8.1f, -3.45f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.0f, -0.5f, 0.0f, -0.75f, -0.5f, 0.0f, -0.75f, -0.5f, -0.75f, 0.0f, -0.5f, -0.75f);
        this.bodyModel[52].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[53].addShapeBox(-4.0f, 5.9f, -2.0f, 8, 11, 4, 0.0f, 0.1f, -3.0f, 0.1f, 0.1f, -3.0f, 0.1f, 0.1f, -3.0f, 0.1f, 0.1f, -3.0f, 0.1f, 0.3f, -3.1f, 0.5f, 0.3f, -3.1f, 0.5f, 0.3f, -3.1f, 0.5f, 0.3f, -3.1f, 0.5f);
        this.bodyModel[53].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[54].addShapeBox(-0.5f, 9.0f, -2.25f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.1f, 0.5f, 0.0f, -6.1f, 0.5f, 0.0f, -6.1f, 0.0f, 0.0f, -6.1f, 0.0f);
        this.bodyModel[54].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        (this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY)).addShapeBox(-1.0f, -2.1f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        (this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 89, 57, this.textureX, this.textureY)).addShapeBox(-3.0f, -2.1f, -2.0f, 4, 8, 4, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f, 0.1f, 2.0f, 0.1f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 49, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 73, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.0f, -0.1f, -2.0f, 4, 6, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 2.9f, -2.0f, 4, 6, 4, 0.0f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.leftLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 65, 73, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -0.1f, -2.0f, 4, 6, 4, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 10.0f, -3.0f, 4, 2, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 6.0f, -2.0f, 4, 4, 4, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 2.9f, -2.0f, 4, 6, 4, 0.0f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.2f, -2.5f, 0.2f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f);
        this.rightLegModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
