// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelEarlyTurbanHelm extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelEarlyTurbanHelm() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[42];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 81, 17, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 9, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 97, 9, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 105, 17, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 57, 25, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 89, 49, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.headModel[38] = new ModelRendererTurbo((ModelBase)this, 121, 33, this.textureX, this.textureY);
        this.headModel[39] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[40] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[41] = new ModelRendererTurbo((ModelBase)this, 121, 33, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -11.3f, -4.0f, 8, 3, 8, 0.0f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, -1.5f, -1.0f, -1.5f, 0.6f, 0.3f, 0.6f, 0.6f, 0.3f, 0.6f, 0.6f, 0.3f, 0.6f, 0.6f, 0.3f, 0.6f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.9f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-1.0f, -4.7f, -4.5f, 2, 1, 1, 0.0f, 0.3f, -0.2f, 0.7f, 0.3f, -0.2f, 0.7f, 0.3f, -0.2f, -0.7f, 0.3f, -0.2f, -0.7f, -0.2f, 0.0f, 0.7f, -0.2f, 0.0f, 0.7f, -0.2f, 0.0f, -0.7f, -0.2f, 0.0f, -0.7f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.0f, -4.9f, -4.5f, 2, 1, 1, 0.0f, -0.3f, -0.2f, 0.7f, -0.3f, -0.2f, 0.7f, -0.3f, -0.2f, -0.7f, -0.3f, -0.2f, -0.7f, 0.5f, -0.2f, 0.7f, 0.5f, -0.2f, 0.7f, 0.5f, -0.2f, -0.7f, 0.5f, -0.2f, -0.7f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-5.0f, -4.7f, -4.5f, 2, 1, 2, 0.0f, 0.0f, -0.5f, 0.7f, 0.5f, -0.5f, 0.7f, 0.5f, -0.5f, -0.7f, 0.0f, -0.5f, -0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(3.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.0f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.0f, -0.5f, 0.9f, 0.0f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.0f, 0.0f, 0.9f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-3.0f, -6.0f, -4.0f, 6, 2, 8, 0.0f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.4f, 0.9f, 0.9f, -0.4f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(1.0f, -4.9f, -4.5f, 2, 1, 1, 0.0f, -0.3f, -0.2f, 0.7f, -0.3f, -0.2f, 0.7f, -0.3f, -0.2f, -0.7f, -0.3f, -0.2f, -0.7f, 0.5f, -0.2f, 0.7f, 0.5f, -0.2f, 0.7f, 0.5f, -0.2f, -0.7f, 0.5f, -0.2f, -0.7f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.0f, -4.7f, -4.5f, 2, 1, 2, 0.0f, 0.5f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, -0.7f, 0.5f, -0.45f, -0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, -0.7f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.35f, -4.0f, -5.0f, 1, 3, 10, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-1.0f, -3.7f, -5.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f, 0.2f, 0.0f, -0.4f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-5.0f, -4.0f, -5.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.3f, -0.4f, 0.2f, 0.3f, -0.4f, 0.2f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(3.0f, -4.0f, -5.5f, 2, 1, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.2f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.2f, 0.3f, -0.4f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-5.0f, -2.7f, -5.5f, 10, 4, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-5.0f, 1.3f, -5.5f, 10, 3, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-5.4f, -1.0f, -2.0f, 1, 1, 4, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-5.4f, -1.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-5.4f, -1.0f, 2.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-5.0f, -4.0f, 4.5f, 10, 5, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f, 0.0f, 0.3f, -0.4f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-5.0f, 1.3f, 4.5f, 10, 3, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f, -2.0f, 0.0f, -0.4f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-5.4f, 0.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-5.4f, 1.3f, -5.0f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, 0.6f, -1.0f, 0.0f, -1.4f, -1.0f, 0.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(4.35f, -4.0f, -5.0f, 1, 3, 10, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(4.4f, -1.0f, 2.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(4.4f, -1.0f, -2.0f, 1, 1, 4, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(4.4f, -1.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.headModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(4.4f, 0.0f, -5.0f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(4.4f, 1.3f, -5.0f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f, -1.4f, -1.0f, 0.0f, 0.6f, -1.0f, 0.0f);
        this.headModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(-5.4f, 0.0f, 1.9f, 1, 1, 3, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-5.4f, 1.3f, 1.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -1.4f, -1.0f, 0.0f, 0.6f, -1.0f, 0.0f, 1.6f, 0.0f, 0.0f, -2.4f, 0.0f, 0.0f);
        this.headModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(4.4f, 0.0f, 1.9f, 1, 1, 3, 0.0f, -0.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f, -0.4f, 0.3f, 0.0f);
        this.headModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(4.4f, 1.3f, 1.9f, 1, 3, 3, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.6f, -1.0f, 0.0f, -1.4f, -1.0f, 0.0f, -2.4f, 0.0f, 0.0f, 1.6f, 0.0f, 0.0f);
        this.headModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-0.5f, -11.0f, -0.5f, 1, 1, 1, 0.0f, -0.1f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, -0.1f, 0.3f, -0.1f, 2.0f, -0.3f, 2.0f, 2.0f, -0.3f, 2.0f, 2.0f, -0.3f, 2.0f, 2.0f, -0.3f, 2.0f);
        this.headModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(-5.0f, -4.7f, -3.0f, 10, 1, 9, 0.0f, 0.1f, -0.5f, 0.7f, 0.1f, -0.5f, 0.7f, 0.1f, -0.5f, -0.7f, 0.1f, -0.45f, -0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, -0.7f, 0.1f, 0.0f, -0.7f);
        this.headModel[33].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(-4.0f, -7.5f, -4.0f, 8, 1, 8, 0.0f, 0.6f, 0.5f, 0.6f, 0.6f, 0.5f, 0.6f, 0.6f, 0.5f, 0.6f, 0.6f, 0.5f, 0.6f, 1.0f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f);
        this.headModel[34].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(-5.0f, -6.5f, -5.0f, 10, 1, 10, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[35].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(-0.5f, -12.2f, -0.5f, 1, 1, 1, 0.0f, -0.3f, -0.5f, -0.3f, -0.3f, -0.5f, -0.3f, -0.3f, -0.5f, -0.3f, -0.3f, -0.5f, -0.3f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.headModel[36].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(-0.5f, -5.0f, -5.7f, 1, 1, 1, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f);
        this.headModel[37].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[38].addShapeBox(-0.5f, -8.0f, -5.7f, 1, 4, 1, 0.0f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, -0.3f, -0.3f, -0.1f, -0.3f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f);
        this.headModel[38].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[39].addShapeBox(-0.5f, -5.0f, -5.7f, 1, 4, 1, 0.0f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f, -0.3f, -0.5f, -0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, -0.6f, -0.3f, -0.1f, -0.6f);
        this.headModel[39].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[40].addShapeBox(-0.5f, -1.2f, -5.7f, 1, 1, 1, 0.0f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, 0.1f, -0.3f, -0.1f, -0.6f, -0.3f, -0.1f, -0.6f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, 0.3f, -0.3f, 0.0f, -0.8f, -0.3f, 0.0f, -0.8f);
        this.headModel[40].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[41].addShapeBox(-0.5f, -9.9f, -5.7f, 1, 2, 1, 0.0f, -0.3f, 0.5f, -1.4f, -0.3f, 0.5f, -1.4f, -0.3f, 0.5f, 1.0f, -0.3f, 0.5f, 1.0f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, 0.1f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.headModel[41].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
