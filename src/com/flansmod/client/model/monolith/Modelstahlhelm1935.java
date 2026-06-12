// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class Modelstahlhelm1935 extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public Modelstahlhelm1935() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[30];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 57, 17, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 57, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 41, 45, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 25, 41, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 41, 49, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 57, 49, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(3.4f, -9.0f, -4.1f, 1, 2, 8, 0.0f, 0.6f, -0.1f, 0.0f, -0.3f, -0.3f, -0.5f, -0.1f, -1.0f, 0.0f, 0.6f, -1.5f, 1.0f, 0.4f, -1.0f, 0.6f, 0.2f, -0.5f, 0.3f, 0.6f, 0.5f, 0.5f, 0.4f, 1.0f, 1.4f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(3.4f, -10.0f, -4.1f, 1, 1, 8, 0.0f, 1.4f, -0.2f, -2.3f, -1.0f, -0.7f, -2.6f, -0.9f, -1.2f, -1.0f, 1.4f, -0.8f, -0.5f, 0.6f, 0.1f, 0.0f, -0.3f, 0.3f, -0.5f, -0.1f, 1.0f, 0.0f, 0.6f, 1.5f, 1.0f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-3.0f, -9.0f, -4.1f, 6, 2, 8, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -1.5f, 1.0f, -0.2f, -1.5f, 1.0f, 0.0f, -1.0f, 0.6f, 0.0f, -1.0f, 0.6f, 0.0f, 1.0f, 1.4f, 0.0f, 1.0f, 1.4f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-3.0f, -6.5f, -4.1f, 6, 2, 8, 0.0f, 0.0f, 1.5f, 0.6f, 0.0f, 1.5f, 0.6f, 0.0f, -0.5f, 1.4f, 0.0f, -0.5f, 1.4f, 0.0f, -0.7f, 1.2f, 0.0f, -0.7f, 1.2f, 0.0f, 1.4f, 1.0f, 0.0f, 1.4f, 1.0f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-2.0f, -5.4f, -5.1f, 4, 1, 3, 0.0f, 1.0f, -0.4f, 0.1f, 1.0f, -0.4f, 0.1f, 0.9f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 1.6f, 1.0f, -0.5f, 1.6f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-3.0f, -10.0f, -4.1f, 6, 1, 8, 0.0f, -1.0f, -0.2f, -2.3f, -1.0f, -0.2f, -2.3f, -1.0f, -0.8f, -0.5f, -1.0f, -0.8f, -0.5f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 1.5f, 1.0f, -0.2f, 1.5f, 1.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-5.0f, -0.7f, -3.6f, 10, 1, 1, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -0.8f, -0.4f, 0.0f, -1.0f, -0.2f, 0.3f, -1.0f, -0.2f, 0.3f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(4.9f, -5.0f, -0.6f, 1, 5, 1, 0.0f, 0.5f, -1.0f, -0.8f, -1.2f, -1.2f, -0.8f, -1.2f, -1.4f, 0.5f, 0.5f, -1.4f, 0.5f, 1.0f, -0.3f, 3.0f, -1.8f, -0.3f, 3.0f, -1.8f, -0.2f, -3.2f, 1.0f, -0.2f, -3.2f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(3.4f, -6.5f, -4.1f, 1, 2, 9, 0.0f, 0.4f, 1.5f, 0.6f, 0.2f, 1.0f, 0.3f, 0.6f, 0.0f, -0.5f, 0.4f, -0.5f, 0.4f, 0.4f, -0.7f, 1.2f, 0.5f, -0.2f, 0.5f, 0.9f, 1.2f, -1.0f, 0.4f, 1.4f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-2.0f, -4.8f, -5.3f, 4, 1, 3, 0.0f, 1.0f, 0.1f, 1.4f, 1.0f, 0.1f, 1.4f, 0.9f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, -0.95f, 1.45f, 1.0f, -0.95f, 1.45f, 1.0f, -0.3f, 0.0f, 1.0f, -0.3f, 0.0f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(3.4f, -5.4f, -5.1f, 1, 1, 2, 0.0f, 0.4f, 0.4f, -0.05f, 0.44f, 0.1f, -0.65f, 0.4f, -0.5f, 0.0f, 0.4f, -0.8f, 0.0f, 0.4f, -0.5f, 0.8f, 0.46f, -0.35f, 0.1f, 1.1f, 0.3f, -0.3f, 0.4f, -0.1f, 0.0f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(3.4f, -4.8f, -5.1f, 1, 1, 2, 0.0f, 0.4f, 0.1f, 1.6f, 0.5f, -0.2f, 0.4f, 1.1f, -0.7f, -0.3f, 0.4f, 0.0f, 0.0f, 0.4f, -0.95f, 1.65f, 0.5f, -0.7f, 0.45f, 1.1f, -0.2f, -0.2f, 0.4f, -0.5f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-2.0f, -5.4f, -5.1f, 4, 1, 3, 0.0f, 1.0f, 0.4f, -0.05f, 1.0f, 0.4f, -0.05f, 0.9f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.8f, 1.0f, -0.5f, 0.8f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(4.9f, -4.6f, -3.1f, 1, 1, 2, 0.0f, 0.1f, 0.3f, 0.0f, -0.4f, -0.5f, 0.3f, -1.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, -0.6f, 0.9f, -1.0f, 0.1f, 0.9f, -1.0f, 0.2f, 1.2f, 0.0f, -0.7f, 1.2f, 0.0f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(3.4f, -5.4f, -5.1f, 1, 1, 3, 0.0f, 0.4f, -0.4f, 0.1f, 0.44f, -0.4f, -0.15f, 0.4f, -0.5f, -1.0f, 0.4f, -0.5f, -1.0f, 0.4f, -0.5f, 1.6f, 0.5f, -0.2f, 0.4f, 1.1f, 0.3f, -1.3f, 0.4f, 0.0f, -1.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(4.9f, -4.6f, -1.1f, 1, 1, 5, 0.0f, 0.5f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.65f, -0.8f, 0.05f, 0.1f, -0.8f, 0.05f, -0.7f, 1.2f, 0.0f, 0.2f, 1.2f, 0.0f, 0.1f, 1.9f, 0.0f, -0.7f, 1.9f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(4.9f, -3.6f, 3.9f, 1, 1, 1, 0.0f, 0.1f, 0.2f, 0.95f, -0.65f, 0.2f, -0.05f, -2.9f, 0.0f, 0.0f, 1.9f, -0.5f, -0.2f, -0.5f, 0.9f, 0.0f, 0.1f, 0.9f, 0.0f, -2.4f, 1.2f, 0.8f, 1.4f, 1.2f, 0.6f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-3.0f, -3.6f, 4.9f, 6, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, -2.2f, -0.2f, 0.5f, -2.2f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 1.2f, -0.4f, 0.5f, 1.2f, -0.4f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-4.4f, -5.4f, -5.1f, 1, 1, 3, 0.0f, 0.44f, -0.4f, -0.1f, 0.4f, -0.4f, 0.1f, 0.4f, -0.5f, -1.0f, 0.4f, -0.5f, -1.0f, 0.5f, -0.2f, 0.4f, 0.4f, -0.5f, 1.6f, 0.4f, 0.0f, -1.0f, 1.1f, 0.3f, -1.3f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-4.4f, -4.8f, -5.1f, 1, 1, 2, 0.0f, 0.5f, -0.2f, 0.4f, 0.4f, 0.1f, 1.6f, 0.4f, 0.0f, 0.0f, 1.1f, -0.7f, -0.3f, 0.5f, -0.7f, 0.45f, 0.4f, -0.95f, 1.65f, 0.4f, -0.5f, 0.0f, 1.1f, -0.2f, -0.2f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-4.4f, -5.4f, -5.1f, 1, 1, 2, 0.0f, 0.44f, 0.1f, -0.65f, 0.4f, 0.4f, -0.05f, 0.4f, -0.8f, 0.0f, 0.49f, -0.5f, 0.0f, 0.45f, -0.4f, 0.1f, 0.4f, -0.5f, 0.8f, 0.4f, -0.1f, 0.0f, 1.1f, 0.3f, -0.3f);
        this.headModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-4.4f, -6.5f, -4.1f, 1, 2, 9, 0.0f, 0.2f, 1.0f, 0.3f, 0.4f, 1.5f, 0.6f, 0.4f, -0.5f, 0.4f, 0.6f, 0.0f, -0.5f, 0.45f, -0.2f, 0.5f, 0.4f, -0.7f, 1.2f, 0.4f, 1.4f, 0.0f, 0.9f, 1.2f, -1.0f);
        this.headModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-4.4f, -9.0f, -4.1f, 1, 2, 8, 0.0f, -0.3f, -0.3f, -0.5f, 0.6f, -0.1f, 0.0f, 0.6f, -1.5f, 1.0f, -0.1f, -1.0f, 0.0f, 0.2f, -0.5f, 0.3f, 0.4f, -1.0f, 0.6f, 0.4f, 1.0f, 1.4f, 0.6f, 0.5f, 0.5f);
        this.headModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-4.4f, -10.0f, -4.1f, 1, 1, 8, 0.0f, -1.0f, -0.7f, -2.6f, 1.4f, -0.2f, -2.3f, 1.4f, -0.8f, -0.5f, -0.9f, -1.2f, -1.0f, -0.3f, 0.3f, -0.5f, 0.6f, 0.1f, 0.0f, 0.6f, 1.5f, 1.0f, -0.1f, 1.0f, 0.0f);
        this.headModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-5.9f, -3.6f, 3.9f, 1, 1, 1, 0.0f, -0.65f, 0.2f, -0.05f, 0.1f, 0.2f, 0.95f, 1.9f, -0.5f, -0.6f, -2.9f, 0.0f, 0.0f, 0.1f, 0.9f, 0.0f, -0.7f, 0.9f, 0.0f, 1.4f, 1.2f, 0.6f, -2.4f, 1.2f, 0.8f);
        this.headModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-5.9f, -4.6f, -1.1f, 1, 1, 5, 0.0f, -1.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.0f, 0.1f, -0.8f, 0.05f, -0.65f, -0.8f, 0.05f, 0.2f, 1.2f, 0.0f, -0.7f, 1.2f, 0.0f, -0.7f, 1.9f, 0.0f, 0.1f, 1.9f, 0.0f);
        this.headModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-5.9f, -4.6f, -3.1f, 1, 1, 2, 0.0f, -0.4f, -0.5f, 0.3f, 0.01f, 0.3f, 0.0f, 0.5f, 0.5f, 0.0f, -1.0f, 0.0f, 0.0f, 0.1f, 0.9f, -1.0f, -0.6f, 0.9f, -1.0f, -0.7f, 1.2f, 0.0f, 0.2f, 1.2f, 0.0f);
        this.headModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-5.9f, -5.0f, -0.6f, 1, 5, 1, 0.0f, -1.2f, -1.2f, -0.8f, 0.5f, -1.0f, -0.8f, 0.5f, -1.4f, 0.5f, -1.2f, -1.4f, 0.5f, -1.8f, -0.3f, 3.0f, 1.0f, -0.3f, 3.0f, 1.0f, -0.2f, -3.2f, -1.8f, -0.2f, -3.2f);
        this.headModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(4.0f, -7.5f, -1.1f, 1, 1, 1, 0.0f, -0.5f, -0.2f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f);
        this.headModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(-5.0f, -7.5f, -1.1f, 1, 1, 1, 0.0f, 0.0f, -0.1f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.0f, -0.1f, -0.2f, 0.1f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, -0.5f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f);
        this.headModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
