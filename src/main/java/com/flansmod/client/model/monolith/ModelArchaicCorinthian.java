// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelArchaicCorinthian extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelArchaicCorinthian() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[20];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 41, 9, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 33, 25, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 2, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f, 0.9f, -0.5f, 0.9f);
        this.headModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.8f, -4.0f, 8, 1, 8, 0.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f);
        this.headModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.5f, -4.0f, 8, 1, 8, 0.0f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.0f, 0.9f, 0.9f, 0.4f, 0.9f, 0.9f, 0.4f, 0.9f);
        this.headModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(3.75f, -5.5f, -4.8f, 1, 2, 4, 0.0f, 0.25f, 0.0f, 0.05f, 0.0f, 0.0f, 0.0f, 0.1f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 2.8f, 3.5f, 0.5f, -0.4f, 3.6f, 0.0f, 0.2f, 3.0f, 0.5f, 0.2f, 3.0f, 0.5f);
        this.headModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(0.75f, -3.0f, -4.8f, 2, 4, 1, 0.0f, 0.0f, -0.2f, 0.5f, -0.1f, 0.0f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -0.2f, -1.0f, 0.5f, -1.0f, -2.0f, 0.4f, -1.0f, -1.0f, 0.0f, 0.0f, -1.0f, -0.5f);
        this.headModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-2.75f, -3.0f, -4.8f, 2, 4, 1, 0.0f, -0.1f, 0.0f, 0.25f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.3f, -0.2f, -1.0f, 0.5f, 0.0f, -1.0f, -0.5f, -1.0f, -1.0f, 0.0f);
        this.headModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.75f, -5.5f, -4.8f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.05f, 0.2f, 0.0f, 0.5f, 0.1f, 0.0f, 0.5f, -0.4f, 3.6f, 0.0f, 2.8f, 3.5f, 0.5f, 0.2f, 3.0f, 0.5f, 0.2f, 3.0f, 0.5f);
        this.headModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-3.5f, -6.0f, -4.8f, 2, 2, 1, 0.0f, 0.2f, 0.0f, -0.05f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.55f, 0.2f, 0.25f, 0.5f, -0.2f, 0.2f, 0.5f, -0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.headModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(1.5f, -6.0f, -4.8f, 2, 2, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.2f, 0.0f, -0.05f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.2f, 0.2f, -0.55f, 0.2f, 0.25f, 0.0f, 0.2f, 0.0f, 0.5f, -0.2f, 0.0f);
        this.headModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-1.5f, -6.0f, -4.8f, 1, 2, 1, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.2f, 0.2f, 0.5f, 0.8f, 0.2f, 0.5f, 0.8f, 0.2f, -0.5f, -0.2f, 0.2f);
        this.headModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(0.5f, -6.0f, -4.8f, 1, 2, 1, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.8f, 0.2f, -0.5f, -0.2f, 0.2f, -0.5f, -0.2f, 0.2f, 0.5f, 0.8f, 0.2f);
        this.headModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-5.0f, -5.5f, -0.2f, 10, 2, 5, 0.0f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, -0.4f, 0.1f, -0.1f, -0.4f, 0.1f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, 1.0f, 0.0f, -0.1f, 1.0f, 0.0f);
        this.headModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-5.0f, -3.5f, -0.2f, 10, 3, 5, 0.0f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, -1.0f, 0.1f, -0.1f, -1.0f, 0.1f, -0.1f, 0.0f, 0.2f, -0.1f, 0.0f, 0.2f, -0.1f, -1.0f, 0.0f, -0.1f, -1.0f, 0.0f);
        this.headModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(-0.5f, -13.3f, -3.0f, 1, 1, 4, 0.0f, 0.2f, 0.0f, -1.2f, 0.2f, 0.0f, -1.2f, 0.2f, 0.0f, -1.2f, 0.2f, 0.0f, -1.2f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, -0.2f, 0.2f, 0.0f, -0.2f);
        this.headModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-0.5f, -17.3f, -1.5f, 1, 4, 1, 0.0f, 0.15f, -0.5f, 1.0f, 0.15f, -0.5f, 1.0f, 0.15f, -0.5f, 1.0f, 0.15f, -0.5f, 1.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f);
        this.headModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(-0.5f, -17.3f, -3.5f, 1, 4, 2, 0.0f, 0.15f, -2.5f, 3.5f, 0.15f, -2.5f, 3.5f, 0.15f, -0.5f, -1.0f, 0.15f, -0.5f, -1.0f, -0.15f, 1.0f, 0.0f, -0.15f, 1.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f);
        this.headModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-0.5f, -17.3f, -0.5f, 1, 4, 4, 0.0f, 0.15f, -0.5f, -1.0f, 0.15f, -0.5f, -1.0f, 0.15f, -3.5f, 1.0f, 0.15f, -3.5f, 1.0f, -0.15f, 0.0f, 0.0f, -0.15f, 0.0f, 0.0f, -0.15f, 1.3f, -2.0f, -0.15f, 1.3f, -2.0f);
        this.headModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-0.5f, -12.0f, 1.5f, 1, 3, 3, 0.0f, -0.15f, 0.0f, 1.0f, -0.15f, 0.0f, 1.0f, 0.15f, 1.85f, 0.0f, 0.15f, 1.85f, 0.0f, -0.15f, 0.0f, 0.8f, -0.15f, 0.0f, 0.8f, 0.15f, 3.0f, 1.0f, 0.15f, 3.0f, 1.0f);
        this.headModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-0.5f, -11.8f, 7.5f, 1, 3, 3, 0.0f, 0.15f, 2.0f, 3.0f, 0.15f, 2.0f, 3.0f, -0.15f, -4.0f, -4.5f, -0.15f, -4.0f, -4.5f, 0.15f, 3.0f, 2.0f, 0.15f, 3.0f, 2.0f, -0.15f, 10.0f, -2.2f, -0.15f, 10.0f, -2.2f);
        this.headModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-0.5f, -12.3f, -0.4f, 1, 3, 1, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.5f, 0.2f, 0.2f, 0.5f, 0.2f);
        this.headModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
