// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelZertsaloKrug extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelZertsaloKrug() {
        this.textureX = 128;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[27];
        this.leftArmModel = new ModelRendererTurbo[4];
        this.rightArmModel = new ModelRendererTurbo[4];
        this.leftLegModel = new ModelRendererTurbo[1];
        this.rightLegModel = new ModelRendererTurbo[1];
        this.skirtFrontModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
        this.initskirtFrontModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 113, 17, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 57, 33, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 9, 41, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 41, 73, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.5f, 4.8f, -2.5f, 9, 6, 5, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f, 0.0f, 1.0f, 0.15f);
        this.bodyModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 10.55f, -2.0f, 4, 1, 4, 0.0f, 0.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 4.6f, -0.2f, 0.8f, 0.6f, -0.2f, 0.8f);
        this.bodyModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.5f, -0.2f, -2.5f, 9, 5, 5, 0.0f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.bodyModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.5f, 6.0f, -3.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.5f, 2.5f, -3.7f, 9, 2, 1, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f);
        this.bodyModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.5f, 4.0f, -3.7f, 9, 2, 1, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.5f, 8.0f, -3.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f);
        this.bodyModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.5f, 9.5f, -3.7f, 9, 2, 1, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f);
        this.bodyModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-1.5f, 6.5f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-1.5f, 5.5f, -3.9f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-1.5f, 7.5f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.5f, 0.2f, -3.5f, 3, 3, 1, 0.0f, 0.7f, 0.0f, -0.4f, 0.7f, 0.0f, -0.4f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-4.5f, -0.8f, -3.5f, 5, 4, 7, 0.0f, 1.0f, -0.1f, -0.7f, -3.2f, 0.4f, -0.7f, -3.2f, 0.4f, -0.7f, 1.0f, -0.1f, -0.7f, -1.0f, 1.5f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 1.5f, 0.0f);
        this.bodyModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-4.5f, 9.5f, 2.7f, 9, 2, 1, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f);
        this.bodyModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.5f, 7.5f, 2.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-1.5f, -0.8f, 2.5f, 3, 4, 1, 0.0f, 1.2f, 0.4f, 1.0f, 1.2f, 0.4f, 1.0f, 1.2f, 0.4f, -0.7f, 1.2f, 0.4f, -0.7f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.bodyModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-2.5f, -1.2f, -1.5f, 5, 1, 3, 0.0f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.0f, 0.2f, 0.15f, 0.3f, -0.2f, 1.2f, 0.3f, -0.2f, 1.2f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f);
        this.bodyModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(-4.5f, 8.0f, 2.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f);
        this.bodyModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-4.5f, 6.0f, 2.7f, 9, 2, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(-4.5f, 4.0f, 2.7f, 9, 2, 1, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -1.2f, -0.2f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-4.5f, 2.5f, 2.7f, 9, 2, 1, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -3.5f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f, -1.2f, -0.3f, 0.0f);
        this.bodyModel[20].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-1.5f, 6.5f, 2.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[21].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-1.5f, 5.5f, 2.9f, 3, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[22].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(-0.5f, -0.8f, -3.5f, 5, 4, 7, 0.0f, -3.2f, 0.4f, -0.7f, 1.0f, -0.1f, -0.7f, 1.0f, -0.1f, -0.7f, -3.2f, 0.4f, -0.7f, -1.5f, 0.0f, 0.0f, -1.0f, 1.5f, 0.0f, -1.0f, 1.5f, 0.0f, -1.5f, 0.0f, 0.0f);
        this.bodyModel[23].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-5.5f, 5.2f, -3.0f, 15, 10, 6, 0.0f, 0.2f, 0.0f, 0.4f, -3.8f, 0.0f, 0.4f, -3.8f, 0.0f, 0.4f, 0.2f, 0.0f, 0.4f, -0.7f, -5.0f, 0.3f, -4.7f, -5.0f, 0.3f, -4.7f, -5.0f, 0.3f, -0.7f, -5.0f, 0.3f);
        this.bodyModel[24].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-5.0f, 2.2f, -3.0f, 14, 3, 6, 0.0f, -0.7f, 0.0f, 0.0f, -4.7f, 0.0f, 0.0f, -4.7f, 0.0f, 0.0f, -0.7f, 0.0f, 0.0f, 0.4f, 0.0f, 0.3f, -3.6f, 0.0f, 0.3f, -3.6f, 0.0f, 0.3f, 0.4f, 0.0f, 0.3f);
        this.bodyModel[25].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-5.0f, 10.2f, -3.0f, 14, 2, 6, 0.0f, -0.4f, 0.0f, 0.0f, -4.4f, 0.0f, 0.0f, -4.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, 0.3f, 0.0f, 0.4f, -3.7f, 0.0f, 0.4f, -3.7f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f);
        this.bodyModel[26].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-5.0f, 4.5f, -2.0f, 8, 4, 8, 0.0f, -3.4f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, -3.4f, -3.4f, 0.0f, -3.4f, -3.7f, 0.5f, 0.3f, 0.3f, 0.5f, 0.3f, 0.3f, 0.5f, -3.8f, -3.7f, 0.5f, -3.7f);
        this.leftArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.3f, 0.6f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.6f, 0.3f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f);
        this.leftArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(3.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f);
        this.leftArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(3.0f, 0.6f, -2.0f, 1, 3, 4, 0.0f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f);
        this.leftArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 4, 5, 4, 0.0f, 0.3f, 0.3f, 0.3f, 0.3f, 0.6f, 0.3f, 0.3f, 0.6f, 0.3f, 0.3f, 0.3f, 0.3f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f, 0.5f, 0.4f, 0.5f);
        this.rightArmModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f);
        this.rightArmModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.0f, 0.6f, -2.0f, 1, 3, 4, 0.0f, 0.4f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, -1.2f, 0.2f, -0.5f, 0.4f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.rightArmModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 4.5f, -2.0f, 8, 4, 8, 0.0f, 0.6f, 0.0f, 0.6f, -3.4f, 0.0f, 0.6f, -3.4f, 0.0f, -3.4f, 0.6f, 0.0f, -3.4f, 0.3f, 0.5f, 0.3f, -3.7f, 0.5f, 0.3f, -3.7f, 0.5f, -3.7f, 0.3f, 0.5f, -3.8f);
        this.rightArmModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY)).addShapeBox(-2.0f, 4.8f, -2.0f, 8, 5, 8, 0.0f, 0.7f, 0.2f, 0.7f, -3.3f, 0.2f, 0.7f, -3.3f, 0.2f, -3.3f, 0.7f, 0.2f, -3.3f, 0.4f, 1.0f, 0.4f, -3.6f, 1.0f, 0.4f, -3.6f, 1.0f, -3.6f, 0.4f, 1.0f, -3.6f);
        this.leftLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY)).addShapeBox(-2.0f, 4.8f, -2.0f, 8, 5, 8, 0.0f, 0.7f, 0.2f, 0.7f, -3.3f, 0.2f, 0.7f, -3.3f, 0.2f, -3.3f, 0.7f, 0.2f, -3.3f, 0.4f, 1.0f, 0.4f, -3.6f, 1.0f, 0.4f, -3.6f, 1.0f, -3.6f, 0.4f, 1.0f, -3.6f);
        this.rightLegModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    private void initskirtFrontModel_1() {
        (this.skirtFrontModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY)).addShapeBox(-4.0f, -1.5f, -2.0f, 8, 12, 2, 0.0f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.6f, 0.5f, 0.0f, 0.5f, 2.0f, -6.0f, 1.8f, 2.0f, -6.0f, 1.8f, 2.0f, -5.9f, 1.8f, 2.0f, -5.9f, 1.8f);
        this.skirtFrontModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
    }
}
