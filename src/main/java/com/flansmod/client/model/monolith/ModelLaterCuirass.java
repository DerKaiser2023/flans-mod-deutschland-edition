// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelLaterCuirass extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelLaterCuirass() {
        this.textureX = 128;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[33];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 65, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 89, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 17, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 65, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 4.0f, -4.0f, 4, 2, 4, 0.0f, -0.1f, -0.5f, 0.7f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -0.1f, 0.0f, 0.7f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(0.0f, 6.0f, -4.0f, 4, 2, 4, 0.0f, -0.1f, 0.0f, 0.7f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.1f, 0.0f, 0.2f, 0.7f, 0.0f, -0.8f, 0.7f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 8.0f, -4.0f, 4, 1, 4, 0.0f, -0.1f, 0.0f, 0.2f, 0.7f, 0.0f, -0.8f, 0.7f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.1f, 0.8f, -1.0f, 0.6f, 0.5f, -1.7f, 0.6f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(3.0f, 1.0f, -4.0f, 1, 4, 4, 0.0f, 1.0f, 1.5f, -1.0f, 0.5f, 1.0f, -1.5f, 0.4f, 0.0f, -1.5f, 0.5f, 0.5f, -1.5f, 2.9f, -0.5f, 0.7f, 0.0f, -0.5f, 0.2f, 0.0f, -1.0f, -2.0f, 3.0f, -1.0f, -2.0f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 0.5f, -3.0f, 2, 1, 3, 0.0f, 0.5f, 0.5f, -0.5f, 0.0f, 1.0f, 0.0f, -0.3f, 2.0f, 0.5f, 0.8f, 1.5f, 0.5f, 0.2f, 0.0f, -1.5f, 0.5f, -0.5f, 0.0f, 0.0f, -1.5f, 0.5f, 0.4f, -1.0f, 0.5f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 4.0f, 1.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 0.7f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.8f, 1.0f, 0.0f, 0.3f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 1.0f, 1.0f, 3, 3, 2, 0.0f, 0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 1.0f, 0.5f, 0.5f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.2f, 0.0f, 0.0f, 0.7f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 0.5f, 1.0f, 2, 1, 2, 0.0f, 0.8f, 1.5f, 0.5f, -0.3f, 2.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.4f, -1.0f, 0.5f, 0.0f, -1.5f, 0.5f, 0.5f, -0.5f, -1.0f, 0.5f, -0.5f, -1.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-4.0f, 6.0f, 1.0f, 4, 3, 2, 0.0f, 1.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.8f, 1.0f, 0.0f, 0.3f, 0.6f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.6f, 0.5f, -0.5f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(0.0f, 10.0f, -4.0f, 4, 1, 4, 0.0f, 0.0f, 0.2f, -1.0f, 0.6f, 0.5f, -1.7f, 0.6f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, 0.0f, 0.8f, -0.3f, -0.8f, 1.1f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.0f, 10.0f, 1.0f, 4, 1, 3, 0.0f, 0.6f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.5f, -1.0f, 0.6f, 0.5f, -1.5f, 1.1f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, 0.0f, 0.8f, -0.2f, -1.0f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 9.0f, -4.0f, 5, 1, 4, 0.0f, 0.0f, -0.6f, -0.3f, -0.3f, -0.2f, -1.0f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.4f, -0.1f, -0.3f, -0.2f, -1.0f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-5.0f, 9.0f, 0.0f, 5, 1, 4, 0.0f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.8f, -0.2f, -0.2f, -1.3f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -0.6f, -0.2f, -0.2f, -1.3f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-0.5f, 4.0f, -4.0f, 1, 2, 1, 0.0f, -0.4f, -0.5f, 0.7f, -0.4f, -0.5f, 0.7f, -0.4f, -0.5f, 0.0f, -0.4f, -0.5f, 0.0f, -0.4f, 0.0f, 0.7f, -0.4f, 0.0f, 0.7f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-0.5f, 6.0f, -4.0f, 1, 2, 4, 0.0f, -0.4f, 0.0f, 0.7f, -0.4f, 0.0f, 0.7f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-0.5f, 8.0f, -4.0f, 1, 1, 4, 0.0f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.2f, -0.4f, 0.0f, 0.5f, -0.4f, 0.0f, 0.5f, -0.4f, 0.8f, -1.0f, -0.4f, 0.5f, -1.0f, -0.4f, 0.5f, 0.5f, -0.4f, 0.5f, 0.5f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-0.5f, 1.5f, -5.2f, 2, 3, 1, 0.0f, -0.5f, 0.2f, -1.3f, 0.05f, 0.7f, -1.65f, 0.6f, 0.7f, 3.0f, -0.5f, 0.2f, 3.0f, -0.5f, 0.0f, -0.5f, -1.4f, 0.0f, -0.5f, -1.4f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.0f, 1.0f, -4.0f, 1, 4, 4, 0.0f, 0.5f, 1.0f, -1.5f, 1.0f, 1.5f, -1.0f, 0.5f, 0.5f, -1.5f, 0.4f, 0.0f, -1.5f, 0.0f, -0.5f, 0.2f, 2.9f, -0.5f, 0.7f, 3.0f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.0f, 4.0f, -4.0f, 4, 2, 4, 0.0f, 0.0f, -0.5f, 0.2f, -0.1f, -0.5f, 0.7f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 1.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.7f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.0f, 6.0f, -4.0f, 4, 2, 4, 0.0f, 1.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.7f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 0.7f, 0.0f, -0.8f, -0.1f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.7f, 0.0f, 0.5f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.0f, 8.0f, -4.0f, 4, 1, 4, 0.0f, 0.7f, 0.0f, -0.8f, -0.1f, 0.0f, 0.2f, 0.0f, 0.0f, 0.5f, 0.7f, 0.0f, 0.5f, 0.6f, 0.5f, -1.7f, -0.1f, 0.8f, -1.0f, 0.0f, 0.5f, 0.5f, 0.6f, 0.5f, 0.5f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-4.0f, 10.0f, -4.0f, 4, 1, 4, 0.0f, 0.6f, 0.5f, -1.7f, 0.0f, 0.2f, -1.0f, 0.0f, 0.5f, 0.5f, 0.6f, 0.5f, 0.5f, 0.8f, -0.3f, -0.8f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.5f, 1.1f, -0.5f, 0.5f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-5.0f, 9.0f, -4.0f, 5, 1, 4, 0.0f, -0.3f, -0.2f, -1.0f, 0.0f, -0.6f, -0.3f, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.3f, -0.2f, -1.0f, 0.0f, 0.4f, -0.1f, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f);
        this.bodyModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(0.0f, 9.0f, 0.0f, 5, 1, 4, 0.0f, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.2f, -1.3f, 0.0f, -0.2f, -0.8f, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.2f, -0.2f, -1.3f, 0.0f, -0.2f, -0.6f);
        this.bodyModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.0f, 6.0f, 1.0f, 4, 3, 2, 0.0f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.8f, 0.0f, 0.5f, 0.5f, 0.6f, 0.5f, 0.5f, 0.6f, 0.5f, -0.5f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(0.0f, 4.0f, 1.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 1.2f, 0.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, 1.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.8f);
        this.bodyModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(1.0f, 1.0f, 1.0f, 3, 3, 2, 0.0f, -0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.5f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.7f, 1.0f, 0.0f, 1.2f);
        this.bodyModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(2.0f, 0.5f, 1.0f, 2, 1, 2, 0.0f, -0.3f, 2.0f, 0.5f, 0.8f, 1.5f, 0.5f, 0.5f, 0.5f, 0.0f, 0.5f, 0.5f, 0.5f, 0.0f, -1.5f, 0.5f, 0.4f, -1.0f, 0.5f, 0.5f, -0.5f, -1.0f, 0.5f, -0.5f, -1.0f);
        this.bodyModel[27].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(0.0f, 10.0f, 1.0f, 4, 1, 3, 0.0f, 0.0f, 0.5f, 0.5f, 0.6f, 0.5f, 0.5f, 0.6f, 0.5f, -1.5f, 0.0f, 0.5f, -1.0f, 0.0f, -0.5f, 0.5f, 1.1f, -0.5f, 0.5f, 0.8f, -0.2f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[28].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(2.0f, 0.5f, -3.0f, 2, 1, 3, 0.0f, 0.0f, 1.0f, 0.0f, 0.5f, 0.5f, -0.5f, 0.8f, 1.5f, 0.5f, -0.3f, 2.0f, 0.5f, 0.5f, -0.5f, 0.0f, 0.2f, 0.0f, -1.5f, 0.4f, -1.0f, 0.5f, 0.0f, -1.5f, 0.5f);
        this.bodyModel[29].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-1.5f, 1.5f, -5.2f, 2, 3, 1, 0.0f, 0.05f, 0.7f, -1.65f, -0.5f, 0.2f, -1.3f, -0.5f, 0.2f, 3.0f, 0.6f, 0.7f, 3.0f, -1.4f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f);
        this.bodyModel[30].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(-0.5f, 1.0f, 3.2f, 2, 3, 1, 0.0f, -0.5f, 0.2f, 3.0f, 0.6f, 0.7f, 3.0f, -0.1f, 0.7f, -0.65f, -0.5f, 0.2f, -0.5f, -0.5f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[31].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-1.5f, 1.0f, 3.2f, 2, 3, 1, 0.0f, 0.6f, 0.7f, 3.0f, -0.5f, 0.2f, 3.0f, -0.5f, 0.2f, -0.5f, -0.1f, 0.7f, -0.65f, -1.4f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.4f, 0.0f, 0.0f);
        this.bodyModel[32].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
