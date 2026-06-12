// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEnclosedHelm extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEnclosedHelm() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[38];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-2.0f, -9.0f, -4.0f, 4, 4, 8, 0.0f, 2.1f, 0.5f, 1.0f, 2.1f, 0.5f, 1.0f, 2.1f, 0.2f, 1.0f, 2.1f, 0.2f, 1.0f, 2.0f, -0.5f, 0.8f, 2.0f, -0.5f, 0.8f, 2.0f, -0.2f, 0.8f, 2.0f, -0.2f, 0.8f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-3.0f, -5.0f, -4.05f, 6, 1, 8, 0.0f, 1.0f, -0.4f, 1.0f, 1.0f, -0.4f, 1.0f, 1.0f, -0.8f, 1.0f, 1.0f, -0.8f, 1.0f, 1.0f, -0.4f, 1.0f, 1.0f, -0.4f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-2.0f, -5.5f, -4.05f, 4, 1, 8, 0.0f, 2.2f, 0.0f, 1.1f, 2.2f, 0.0f, 1.1f, 2.2f, -0.3f, 1.1f, 2.2f, -0.3f, 1.1f, 2.2f, 0.0f, 1.1f, 2.2f, 0.0f, 1.1f, 2.2f, 0.4f, 1.1f, 2.2f, 0.4f, 1.1f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-5.0f, -5.0f, -1.0f, 10, 5, 1, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.8f, 0.25f, 2.7f, -0.8f, 0.25f, 2.7f, -0.8f, 0.25f, -3.0f, -0.8f, 0.25f, -3.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-5.0f, -5.0f, -4.5f, 1, 2, 3, 0.0f, -1.16f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, -1.16f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.5f, -3.0f, -5.5f, 9, 1, 3, 0.0f, -1.0f, 0.0f, -0.4f, -1.0f, 0.0f, -0.4f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.5f, 0.2f, -1.0f, 0.5f, 0.2f, 0.5f, 0.5f, -0.4f, 0.5f, 0.5f, -0.4f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-0.5f, -5.0f, -5.3f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, -0.7f, 0.0f, -0.2f, -0.7f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.5f, -1.0f, -5.5f, 9, 2, 3, 0.0f, -1.0f, 0.5f, 0.2f, -1.0f, 0.5f, 0.2f, 0.5f, 0.5f, -0.4f, 0.5f, 0.5f, -0.4f, -1.2f, 0.0f, -0.2f, -1.2f, 0.0f, -0.2f, -0.5f, 0.0f, -1.4f, -0.5f, 0.0f, -1.4f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.5f, 1.0f, -5.5f, 9, 1, 3, 0.0f, -1.2f, 0.0f, -0.2f, -1.2f, 0.0f, -0.2f, -0.5f, 0.0f, -1.4f, -0.5f, 0.0f, -1.4f, -2.5f, -0.1f, -0.8f, -2.5f, -0.1f, -0.8f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(4.0f, -5.0f, -4.5f, 1, 2, 3, 0.0f, 0.7f, 0.0f, 0.0f, -1.16f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.7f, 0.0f, -0.8f, 0.7f, 0.0f, 0.0f, -1.16f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.7f, 0.0f, -1.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.5f, -3.5f, -5.35f, 9, 1, 1, 0.0f, -0.9f, -0.4f, -0.2f, -0.9f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.9f, -0.4f, -0.2f, -0.9f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f, -0.5f, -0.4f, -0.2f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-0.5f, -3.0f, -5.3f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-0.5f, -2.0f, -5.3f, 1, 2, 1, 0.0f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, 0.0f, 0.9f, 0.2f, 0.0f, 0.9f, 0.2f, 0.0f, 0.7f, -0.3f, 0.0f, 0.7f, -0.3f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-0.5f, -3.61f, -5.3f, 1, 1, 1, 0.0f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, 0.1f, 0.0f, -0.4f, -0.7f, 0.0f, -0.4f, -0.7f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-1.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-3.99f, -9.0f, -4.0f, 1, 4, 8, 0.0f, 1.3f, 0.5f, 0.0f, -1.1f, 0.5f, 1.0f, -1.1f, 0.2f, 1.0f, 1.3f, 0.2f, 0.0f, 1.0f, -0.5f, -0.2f, -1.0f, -0.5f, 0.8f, -1.0f, -0.2f, 0.8f, 1.0f, -0.2f, -0.2f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-5.3f, -5.5f, -3.05f, 1, 1, 6, 0.0f, 0.1f, 0.0f, 1.1f, 0.1f, 0.0f, 2.1f, 0.1f, -0.3f, 2.1f, 0.1f, -0.3f, 1.1f, 0.1f, 0.0f, 1.1f, 0.1f, 0.0f, 2.1f, 0.1f, 0.4f, 2.1f, 0.1f, 0.4f, 1.1f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-5.0f, -5.0f, -4.05f, 1, 1, 8, 0.0f, 0.3f, -0.4f, 0.0f, 0.0f, -0.4f, 1.0f, 0.0f, -0.8f, 1.0f, 0.3f, -0.8f, 0.0f, 0.3f, -0.4f, 0.0f, 0.0f, -0.4f, 1.0f, 0.0f, 0.0f, 1.0f, 0.3f, 0.0f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(4.0f, -5.0f, -4.05f, 1, 1, 8, 0.0f, 0.0f, -0.4f, 1.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.8f, 0.0f, 0.0f, -0.8f, 1.0f, 0.0f, -0.4f, 1.0f, 0.3f, -0.4f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(4.3f, -5.5f, -3.05f, 1, 1, 6, 0.0f, 0.1f, 0.0f, 2.1f, 0.1f, 0.0f, 1.1f, 0.1f, -0.3f, 1.1f, 0.1f, -0.3f, 2.1f, 0.1f, 0.0f, 2.1f, 0.1f, 0.0f, 1.1f, 0.1f, 0.4f, 1.1f, 0.1f, 0.4f, 2.1f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(3.01f, -9.0f, -4.0f, 1, 4, 8, 0.0f, -1.1f, 0.5f, 1.0f, 1.3f, 0.5f, 0.0f, 1.3f, 0.2f, 0.0f, -1.1f, 0.2f, 1.0f, -1.0f, -0.5f, 0.8f, 1.0f, -0.5f, -0.2f, 1.0f, -0.2f, -0.2f, -1.0f, -0.2f, 0.8f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-2.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-3.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-2.4f, -0.9f, -5.6f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-1.4f, -0.9f, -5.6f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-1.4f, -0.1f, -5.5f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(0.4f, -0.1f, -5.5f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(1.4f, -0.9f, -5.6f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(0.4f, -0.9f, -5.6f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(0.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(1.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(2.4f, -1.7f, -5.75f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, -0.05f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-1.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(-2.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[33].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(-3.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[34].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(0.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[35].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(1.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[36].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(2.4f, -2.45f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, -0.15f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[37].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
