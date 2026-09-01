// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelManchuQuiver extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelManchuQuiver() {
        this.textureX = 32;
        this.textureY = 32;
        this.bodyModel = new ModelRendererTurbo[18];
        this.initbodyModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 10.0f, -2.5f, 8, 1, 5, 0.0f, 0.55f, -0.1f, 0.25f, 0.55f, -0.1f, 0.25f, 0.55f, -0.1f, 0.25f, 0.55f, -0.1f, 0.25f, 0.55f, -0.3f, 0.25f, 0.55f, -0.3f, 0.25f, 0.55f, -0.3f, 0.25f, 0.55f, -0.3f, 0.25f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-5.5f, 10.5f, -2.5f, 1, 5, 5, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -0.4f, -1.0f, 0.5f, 2.5f, -1.5f, 0.2f, 0.0f, 1.0f, 2.0f, 1.0f, 0.4f, 1.7f, 1.0f, 2.3f, -2.0f, 0.7f, 3.0f, -2.3f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-12.0f, -2.5f, -0.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-11.7f, -1.5f, 8.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-10.5f, -3.5f, -0.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-10.2f, -2.5f, 8.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-10.0f, -3.5f, -3.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-9.7f, -2.5f, 5.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-11.0f, -3.8f, -2.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-10.7f, -2.8f, 6.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-11.5f, -4.0f, -0.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-11.2f, -3.0f, 8.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-11.5f, -3.0f, -3.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-11.2f, -2.0f, 5.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-11.8f, -3.5f, -1.2f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-11.5f, -2.5f, 7.3f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-9.9f, -3.5f, -1.7f, 1, 17, 1, 0.0f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, -9.25f, -0.25f, 0.0f, 8.75f, -0.25f, 0.0f, 8.75f, -5.25f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, 4.75f, 0.0f, -0.25f, -5.25f, 0.0f, -0.25f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-9.6f, -2.5f, 6.8f, 1, 7, 1, 0.0f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, 0.5f, 0.0f, -0.3f, -2.5f, 0.0f, 3.4f, 1.6f, 0.0f, 3.4f, 1.6f, 0.0f, -4.1f, -2.5f, 0.0f, -4.1f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
