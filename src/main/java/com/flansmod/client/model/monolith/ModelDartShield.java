// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelDartShield extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelDartShield() {
        this.textureX = 128;
        this.textureY = 128;
        this.gunModel = new ModelRendererTurbo[34];
        this.ammoModel = new ModelRendererTurbo[6];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 25, 17, this.textureX, this.textureY);
        this.gunModel[12] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.gunModel[13] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
        this.gunModel[14] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.gunModel[15] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[16] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.gunModel[17] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.gunModel[18] = new ModelRendererTurbo(this, 57, 25, this.textureX, this.textureY);
        this.gunModel[19] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
        this.gunModel[20] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.gunModel[21] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.gunModel[22] = new ModelRendererTurbo(this, 33, 9, this.textureX, this.textureY);
        this.gunModel[23] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.gunModel[24] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
        this.gunModel[25] = new ModelRendererTurbo(this, 113, 25, this.textureX, this.textureY);
        this.gunModel[26] = new ModelRendererTurbo(this, 49, 9, this.textureX, this.textureY);
        this.gunModel[27] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.gunModel[28] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.gunModel[29] = new ModelRendererTurbo(this, 9, 33, this.textureX, this.textureY);
        this.gunModel[30] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.gunModel[31] = new ModelRendererTurbo(this, 113, 33, this.textureX, this.textureY);
        this.gunModel[32] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.gunModel[33] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.gunModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 1, 6, 14, 0.0f);
        this.gunModel[0].func_78793_a(3.0f, 0.0f, 2.0f);
        this.gunModel[1].addShapeBox(0.0f, 10.0f, 0.0f, 1, 4, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[1].func_78793_a(3.0f, -4.0f, 2.0f);
        this.gunModel[2].addShapeBox(0.0f, 10.0f, 0.0f, 1, 4, 14, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].func_78793_a(3.0f, -14.0f, 2.0f);
        this.gunModel[3].addShapeBox(0.0f, 14.0f, 0.0f, 1, 3, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[3].func_78793_a(3.0f, -4.0f, 3.0f);
        this.gunModel[4].addShapeBox(0.0f, 17.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.gunModel[4].func_78793_a(3.0f, -4.0f, 5.0f);
        this.gunModel[5].addShapeBox(0.0f, 14.0f, 0.0f, 1, 3, 12, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].func_78793_a(3.0f, -21.0f, 3.0f);
        this.gunModel[6].addShapeBox(0.0f, 17.0f, 0.0f, 1, 1, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[6].func_78793_a(3.0f, -25.0f, 5.0f);
        this.gunModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 4, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[7].func_78793_a(3.3f, 1.0f, 7.0f);
        this.gunModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.gunModel[8].func_78793_a(3.3f, 3.0f, 7.0f);
        this.gunModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[9].func_78793_a(4.3f, 2.5f, 7.5f);
        this.gunModel[10].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[10].func_78793_a(4.3f, 2.51f, 7.5f);
        this.gunModel[11].addShapeBox(0.0f, -1.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, -0.95f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.gunModel[11].func_78793_a(4.3f, 4.51f, 7.5f);
        this.gunModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 30, 24, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, 0.0f, -0.45f, 0.0f, -10.0f, -0.45f, 0.0f, -10.0f, -0.45f, -10.0f, 0.0f, -0.45f, -10.0f, 0.0f, -0.45f, -10.0f, -10.0f, -0.45f, -10.0f, -10.0f);
        this.gunModel[12].func_78793_a(3.5f, -7.5f, 2.0f);
        this.gunModel[13].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 13, 0.0f);
        this.gunModel[13].func_78793_a(2.5f, 3.0f, 2.5f);
        this.gunModel[14].addShapeBox(-0.5f, -6.5f, -0.5f, 1, 7, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.gunModel[14].func_78793_a(2.5f, 4.0f, 4.0f);
        this.gunModel[15].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 5, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[15].func_78793_a(2.5f, -1.0f, 4.0f);
        this.gunModel[16].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[16].func_78793_a(2.5f, 4.0f, 4.0f);
        this.gunModel[17].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.gunModel[17].func_78793_a(2.5f, 5.0f, 4.0f);
        this.gunModel[18].addShapeBox(-0.5f, -6.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f);
        this.gunModel[18].func_78793_a(2.5f, 4.0f, 4.0f);
        this.gunModel[19].addShapeBox(-1.5f, -6.0f, -0.5f, 3, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.gunModel[19].func_78793_a(2.5f, 4.0f, 4.0f);
        this.gunModel[20].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[20].func_78793_a(2.5f, 4.0f, 5.5f);
        this.gunModel[21].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 5, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[21].func_78793_a(2.5f, -1.0f, 5.5f);
        this.gunModel[22].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.gunModel[22].func_78793_a(2.5f, 5.0f, 5.5f);
        this.gunModel[23].addShapeBox(-0.5f, -6.5f, -0.5f, 1, 7, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.gunModel[23].func_78793_a(2.5f, 4.0f, 5.5f);
        this.gunModel[24].addShapeBox(-1.5f, -6.0f, -0.5f, 3, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.gunModel[24].func_78793_a(2.5f, 4.0f, 5.5f);
        this.gunModel[25].addShapeBox(-0.5f, -6.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f);
        this.gunModel[25].func_78793_a(2.5f, 4.0f, 5.5f);
        this.gunModel[26].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[26].func_78793_a(2.5f, 4.0f, 7.0f);
        this.gunModel[27].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 5, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.gunModel[27].func_78793_a(2.5f, -1.0f, 7.0f);
        this.gunModel[28].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.gunModel[28].func_78793_a(2.5f, 5.0f, 7.0f);
        this.gunModel[29].addShapeBox(-0.5f, -6.5f, -0.5f, 1, 7, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.gunModel[29].func_78793_a(2.5f, 4.0f, 7.0f);
        this.gunModel[30].addShapeBox(-1.5f, -7.0f, -0.5f, 3, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.gunModel[30].func_78793_a(2.5f, 5.0f, 7.0f);
        this.gunModel[31].addShapeBox(-0.5f, -6.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f);
        this.gunModel[31].func_78793_a(2.5f, 4.0f, 7.0f);
        this.gunModel[32].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 5, 0.0f);
        this.gunModel[32].func_78793_a(2.2f, 3.0f, 3.0f);
        this.gunModel[33].func_78790_a(0.0f, 0.0f, 0.0f, 1, 1, 4, 0.0f);
        this.gunModel[33].func_78793_a(2.2f, 9.5f, 3.5f);
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.ammoModel[5] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(-0.5f, -6.5f, -0.5f, 1, 7, 1, 0.0f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f);
        this.ammoModel[0].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[0].field_78808_h = 1.5707964f;
        this.ammoModel[1].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 5, 1, 0.0f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.ammoModel[1].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[1].field_78808_h = 1.5707964f;
        this.ammoModel[2].addShapeBox(-0.5f, 4.5f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f);
        this.ammoModel[2].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[2].field_78808_h = 1.5707964f;
        this.ammoModel[3].addShapeBox(-0.5f, 0.5f, -0.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.ammoModel[3].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[3].field_78808_h = 1.5707964f;
        this.ammoModel[4].addShapeBox(-0.5f, -6.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f);
        this.ammoModel[4].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[4].field_78808_h = 1.5707964f;
        this.ammoModel[5].addShapeBox(-1.5f, -6.0f, -0.5f, 3, 3, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.ammoModel[5].func_78793_a(1.0f, -2.0f, 0.0f);
        this.ammoModel[5].field_78808_h = 1.5707964f;
    }
}
