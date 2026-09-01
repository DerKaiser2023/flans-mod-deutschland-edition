// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelAkodaNari extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelAkodaNari() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[33];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.8f, -4.0f, 8, 1, 8, 0.0f, -2.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, -2.0f, 0.0f, -1.5f, -2.0f, 0.0f, -1.5f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.7f, -0.5f, 0.8f, 0.0f, -0.5f, 0.8f, 0.0f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f, 0.7f, -0.4f, 0.8f, 0.0f, -0.4f, 0.8f, 0.0f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(3.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.0f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, -0.4f, 0.8f, 0.7f, -0.4f, 0.8f, 0.7f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.0f, -6.0f, -4.0f, 6, 2, 8, 0.0f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f, 0.7f, -0.4f, 0.8f, 0.7f, -0.4f, 0.8f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -5.5f, -5.0f, 4, 1, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 1.3f, 0.0f, 0.4f, 2.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(0.0f, -5.5f, -5.0f, 4, 1, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.4f, 2.5f, 0.5f, 0.0f, 1.3f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -4.5f, -2.5f, 8, 5, 1, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, 0.8f, 0.5f, 0.0f, 0.8f, 0.3f, -0.2f, 0.8f, 0.3f, -0.2f, 0.8f, 0.3f, -0.2f, -0.7f, 0.3f, -0.3f, -0.7f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(4.5f, -5.5f, -4.3f, 1, 5, 1, 0.0f, -0.5f, 0.2f, 0.0f, -0.1f, 0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -2.1f, -0.6f, 0.0f, 1.5f, -0.8f, 0.0f, 1.1f, 0.0f, 0.35f, -1.7f, 0.0f, 0.35f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(6.5f, -5.9f, -5.0f, 2, 5, 1, 0.0f, 0.9f, 0.0f, -0.6f, -1.9f, 0.6f, -1.0f, -1.6f, 0.7f, 0.7f, 1.5f, -0.2f, -0.3f, -0.7f, -0.6f, -0.6f, -0.3f, -1.2f, -1.0f, 0.0f, -1.4f, 0.7f, -0.1f, -0.2f, -0.3f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(8.5f, -7.0f, -3.3f, 1, 5, 2, 0.0f, 2.0f, -0.6f, 0.3f, -2.6f, -0.4f, 0.0f, -1.8f, 0.2f, 0.0f, 1.2f, 0.2f, 0.0f, 0.8f, -0.2f, 0.8f, -1.0f, -0.2f, 0.0f, -0.2f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(4.5f, -5.5f, -2.3f, 1, 5, 7, 0.0f, 0.2f, -0.2f, 1.0f, -0.6f, -0.2f, 1.0f, -0.6f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -1.7f, 0.0f, 0.6f, 1.2f, 0.0f, 0.6f, 1.5f, 0.5f, 2.5f, -2.0f, 0.5f, 2.5f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-4.5f, -5.5f, 4.2f, 9, 6, 1, 0.0f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 2.5f, -0.5f, -3.1f, 2.5f, -0.5f, -3.1f, 2.5f, -0.5f, 2.6f, 2.5f, -0.5f, 2.6f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-5.0f, -5.5f, 4.8f, 10, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-5.5f, -4.25f, 5.5f, 11, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-6.0f, -3.0f, 6.1f, 12, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-6.5f, -1.75f, 6.8f, 13, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-3.5f, 0.2f, -3.2f, 7, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, -1.4f, 0.5f, 0.0f, -1.4f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-5.0f, 0.2f, -3.7f, 10, 1, 1, 0.0f, -1.6f, 0.0f, -0.2f, -1.6f, 0.0f, -0.2f, -1.6f, 0.0f, 0.0f, -1.6f, 0.0f, 0.0f, -1.4f, 0.0f, 0.2f, -1.4f, 0.0f, 0.2f, -1.4f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-5.0f, 1.45f, -4.3f, 10, 1, 1, 0.0f, -1.3f, 0.0f, -0.2f, -1.3f, 0.0f, -0.2f, -1.3f, 0.0f, 0.0f, -1.3f, 0.0f, 0.0f, -1.1f, 0.0f, 0.2f, -1.1f, 0.0f, 0.2f, -1.1f, 0.0f, 0.0f, -1.1f, 0.0f, 0.0f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-4.0f, -1.3f, -4.3f, 8, 1, 2, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.5f, -0.1f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.2f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(4.8f, -5.5f, -3.2f, 1, 1, 8, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.3f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 1.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(5.3f, -4.25f, -2.2f, 1, 1, 8, 0.0f, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 2.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, 0.4f, 0.0f, 0.1f, 2.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(5.8f, -3.0f, -2.5f, 1, 1, 9, 0.0f, 0.0f, -0.1f, 0.0f, -0.5f, -0.1f, 1.7f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(6.3f, -1.75f, -3.0f, 1, 1, 10, 0.0f, 0.0f, -0.1f, 0.0f, -0.5f, -0.1f, 1.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.4f, -0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-5.5f, -5.5f, -2.3f, 1, 5, 7, 0.0f, -0.6f, -0.2f, 1.0f, 0.2f, -0.2f, 1.0f, 0.2f, 0.2f, 0.0f, -0.6f, 0.2f, 0.0f, 1.2f, 0.0f, 0.6f, -1.7f, 0.0f, 0.6f, -2.0f, 0.5f, 2.5f, 1.5f, 0.5f, 2.5f);
        this.headModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-5.8f, -5.5f, -3.2f, 1, 1, 8, 0.0f, -0.5f, -0.3f, 1.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 1.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-6.3f, -4.25f, -2.2f, 1, 1, 8, 0.0f, -0.5f, -0.2f, 2.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.1f, 2.0f, 0.0f, 0.1f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(-6.8f, -3.0f, -2.5f, 1, 1, 9, 0.0f, -0.5f, -0.1f, 1.7f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.8f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-7.3f, -1.75f, -3.0f, 1, 1, 10, 0.0f, -0.5f, -0.1f, 1.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.2f, -0.1f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f);
        this.headModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(-5.5f, -5.5f, -4.3f, 1, 5, 1, 0.0f, -0.1f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 1.5f, -0.8f, 0.0f, -2.1f, -0.6f, 0.0f, -1.7f, 0.0f, 0.35f, 1.1f, 0.0f, 0.35f);
        this.headModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(-8.5f, -5.9f, -5.0f, 2, 5, 1, 0.0f, -1.9f, 0.6f, -1.0f, 0.9f, 0.0f, -0.6f, 1.5f, -0.2f, -0.3f, -1.6f, 0.7f, 0.7f, -0.3f, -1.2f, -1.0f, -0.7f, -0.6f, -0.6f, -0.1f, -0.2f, -0.3f, 0.0f, -1.4f, 0.7f);
        this.headModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-9.5f, -7.0f, -3.3f, 1, 5, 2, 0.0f, -2.6f, -0.4f, 0.0f, 2.0f, -0.6f, 0.3f, 1.2f, 0.2f, 0.0f, -1.8f, 0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.8f, -0.2f, 0.8f, 0.0f, -1.5f, 0.0f, -0.2f, -1.5f, 0.0f);
        this.headModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
