// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelBirb extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] birbModel;
    
    public ModelBirb() {
        this.textureX = 128;
        this.textureY = 128;
        (this.birbModel = new ModelRendererTurbo[35])[0] = new ModelRendererTurbo(this, 15, 16, this.textureX, this.textureY);
        this.birbModel[1] = new ModelRendererTurbo(this, 1, 16, this.textureX, this.textureY);
        this.birbModel[2] = new ModelRendererTurbo(this, 1, 11, this.textureX, this.textureY);
        this.birbModel[3] = new ModelRendererTurbo(this, 15, 11, this.textureX, this.textureY);
        this.birbModel[4] = new ModelRendererTurbo(this, 1, 21, this.textureX, this.textureY);
        this.birbModel[5] = new ModelRendererTurbo(this, 15, 21, this.textureX, this.textureY);
        this.birbModel[6] = new ModelRendererTurbo(this, 1, 35, this.textureX, this.textureY);
        this.birbModel[7] = new ModelRendererTurbo(this, 15, 26, this.textureX, this.textureY);
        this.birbModel[8] = new ModelRendererTurbo(this, 1, 26, this.textureX, this.textureY);
        this.birbModel[9] = new ModelRendererTurbo(this, 1, 30, this.textureX, this.textureY);
        this.birbModel[10] = new ModelRendererTurbo(this, 15, 30, this.textureX, this.textureY);
        this.birbModel[11] = new ModelRendererTurbo(this, 23, 35, this.textureX, this.textureY);
        this.birbModel[12] = new ModelRendererTurbo(this, 23, 35, this.textureX, this.textureY);
        this.birbModel[13] = new ModelRendererTurbo(this, 23, 40, this.textureX, this.textureY);
        this.birbModel[14] = new ModelRendererTurbo(this, 23, 40, this.textureX, this.textureY);
        this.birbModel[15] = new ModelRendererTurbo(this, 15, 40, this.textureX, this.textureY);
        this.birbModel[16] = new ModelRendererTurbo(this, 9, 42, this.textureX, this.textureY);
        this.birbModel[17] = new ModelRendererTurbo(this, 15, 40, this.textureX, this.textureY);
        this.birbModel[18] = new ModelRendererTurbo(this, 9, 42, this.textureX, this.textureY);
        this.birbModel[19] = new ModelRendererTurbo(this, 32, 13, this.textureX, this.textureY);
        this.birbModel[20] = new ModelRendererTurbo(this, 32, 18, this.textureX, this.textureY);
        this.birbModel[21] = new ModelRendererTurbo(this, 32, 25, this.textureX, this.textureY);
        this.birbModel[22] = new ModelRendererTurbo(this, 32, 13, this.textureX, this.textureY);
        this.birbModel[23] = new ModelRendererTurbo(this, 32, 18, this.textureX, this.textureY);
        this.birbModel[24] = new ModelRendererTurbo(this, 32, 25, this.textureX, this.textureY);
        this.birbModel[25] = new ModelRendererTurbo(this, 11, 35, this.textureX, this.textureY);
        this.birbModel[26] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.birbModel[27] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.birbModel[28] = new ModelRendererTurbo(this, 11, 35, this.textureX, this.textureY);
        this.birbModel[29] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.birbModel[30] = new ModelRendererTurbo(this, 22, 32, this.textureX, this.textureY);
        this.birbModel[31] = new ModelRendererTurbo(this, 22, 32, this.textureX, this.textureY);
        this.birbModel[32] = new ModelRendererTurbo(this, 17, 33, this.textureX, this.textureY);
        this.birbModel[33] = new ModelRendererTurbo(this, 22, 32, this.textureX, this.textureY);
        this.birbModel[34] = new ModelRendererTurbo(this, 22, 32, this.textureX, this.textureY);
        this.birbModel[0].addShapeBox(-2.0f, 1.0f, 0.0f, 4, 2, 2, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.3f);
        this.birbModel[0].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[1].addShapeBox(-2.0f, 1.0f, -2.0f, 4, 2, 2, 0.0f, -1.2f, 0.0f, -0.5f, -1.2f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.birbModel[1].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[2].addShapeBox(-2.0f, -1.0f, -2.0f, 4, 2, 2, 0.0f, -1.5f, 0.0f, -2.0f, -1.5f, 0.0f, -2.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.2f, 0.0f, -0.5f, -1.2f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.birbModel[2].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[3].addShapeBox(-2.0f, -1.0f, 0.0f, 4, 2, 2, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.birbModel[3].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[4].addShapeBox(-2.0f, 3.0f, -2.0f, 4, 2, 2, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.birbModel[4].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[5].addShapeBox(-2.0f, 3.0f, 0.0f, 4, 2, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.birbModel[5].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[6].addShapeBox(-1.0f, -6.0f, 0.0f, 2, 5, 2, 0.0f, 0.0f, 0.5f, -1.5f, 0.0f, 0.5f, -1.5f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.birbModel[6].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[7].addShapeBox(-2.0f, 5.0f, 0.0f, 4, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.3f, 0.0f, -1.0f, -1.3f, 0.0f, -1.0f);
        this.birbModel[7].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[8].addShapeBox(-2.0f, 5.0f, -2.0f, 4, 1, 2, 0.0f, -1.2f, 0.0f, 0.0f, -1.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -0.1f, -1.5f, 0.0f, -0.1f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f);
        this.birbModel[8].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[9].addShapeBox(-1.0f, 6.0f, -2.0f, 2, 1, 2, 0.0f, -0.5f, 0.0f, -0.1f, -0.5f, 0.0f, -0.1f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f);
        this.birbModel[9].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[10].addShapeBox(-1.0f, 6.0f, 0.0f, 2, 1, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -1.0f, 0.0f, -0.5f, -1.0f, 0.0f, -0.5f);
        this.birbModel[10].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[11].addShapeBox(-1.0f, 7.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.birbModel[11].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[12].addShapeBox(0.0f, 7.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.birbModel[12].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[13].addShapeBox(0.0f, 8.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.6f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f);
        this.birbModel[13].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[14].addShapeBox(-1.0f, 8.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -1.0f);
        this.birbModel[14].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[15].addShapeBox(0.0f, 9.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.6f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.8f, -0.7f, 0.0f, -1.2f, -0.7f, 0.0f, -0.8f, 0.0f, 0.0f, -0.5f);
        this.birbModel[15].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[16].addShapeBox(0.0f, 10.0f, -1.5f, 1, 1, 2, 0.0f, 0.0f, 0.0f, -0.8f, -0.7f, 0.0f, -1.2f, -0.7f, 0.0f, -0.8f, 0.0f, 0.0f, -0.5f, 0.0f, -0.6f, -0.9f, -0.8f, -0.6f, -1.3f, -0.8f, -0.6f, -0.7f, 0.0f, 0.0f, -0.3f);
        this.birbModel[16].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[17].addShapeBox(-1.0f, 9.0f, -1.5f, 1, 1, 2, 0.0f, -0.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.6f, 0.0f, 0.0f, -0.2f, -0.5f, 0.0f, -1.0f, -0.7f, 0.0f, -1.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.5f, -0.7f, 0.0f, -0.8f);
        this.birbModel[17].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[18].addShapeBox(-1.0f, 10.0f, -1.5f, 1, 1, 2, 0.0f, -0.7f, 0.0f, -1.2f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, -0.5f, -0.7f, 0.0f, -0.8f, -0.8f, -0.6f, -1.3f, 0.0f, -0.6f, -0.9f, 0.0f, 0.0f, -0.3f, -0.8f, -0.6f, -0.7f);
        this.birbModel[18].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[19].addShapeBox(1.0f, 2.0f, -2.0f, 4, 3, 1, 0.0f, 1.0f, -0.5f, -0.5f, 0.0f, 0.5f, 1.0f, 0.0f, 0.5f, -1.5f, 0.0f, -0.5f, 0.0f, 1.0f, 0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, -1.5f, 0.0f, 0.0f, 0.0f);
        this.birbModel[19].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[20].addShapeBox(5.0f, 2.0f, -3.0f, 5, 4, 1, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.birbModel[20].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[21].addShapeBox(10.0f, 3.0f, -2.5f, 4, 3, 1, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.2f, -1.0f, 0.0f, -1.2f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, -1.5f, -0.5f, -0.5f, -1.5f, -0.5f, 0.0f, 0.0f, 0.0f, -0.5f);
        this.birbModel[21].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[22].addShapeBox(-5.0f, 2.0f, -2.0f, 4, 3, 1, 0.0f, 0.0f, 0.5f, 1.0f, 1.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, -1.5f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.5f);
        this.birbModel[22].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[23].addShapeBox(-10.0f, 2.0f, -3.0f, 5, 4, 1, 0.0f, 0.0f, -1.5f, -0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -0.5f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.birbModel[23].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[24].addShapeBox(-14.0f, 3.0f, -2.5f, 4, 3, 1, 0.0f, 0.0f, -1.2f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, -1.2f, 0.0f, -1.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.5f, -0.5f, 0.0f);
        this.birbModel[24].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[25].addShapeBox(1.0f, 2.0f, 0.0f, 1, 1, 3, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 1.0f, -0.5f, 0.2f, 1.0f, -0.5f);
        this.birbModel[25].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[26].addShapeBox(1.0f, 2.5f, 2.0f, 1, 1, 2, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -2.0f, 0.0f, -0.2f, -2.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 2.0f, 0.0f, -0.2f, 2.0f, 0.0f);
        this.birbModel[26].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[27].addShapeBox(-2.0f, 2.5f, 2.0f, 1, 1, 2, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, -2.0f, 0.0f, -0.2f, -2.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 2.0f, 0.0f, -0.2f, 2.0f, 0.0f);
        this.birbModel[27].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[28].addShapeBox(-2.0f, 2.0f, 0.0f, 1, 1, 3, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 1.0f, -0.5f, 0.2f, 1.0f, -0.5f);
        this.birbModel[28].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[29].addShapeBox(1.0f, 4.5f, 3.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.birbModel[29].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[30].addShapeBox(1.0f, 5.5f, 3.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f);
        this.birbModel[30].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[31].addShapeBox(1.0f, 5.5f, 4.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f);
        this.birbModel[31].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[32].addShapeBox(-2.0f, 4.5f, 3.5f, 1, 1, 1, 0.0f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.birbModel[32].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[33].addShapeBox(-2.0f, 5.5f, 3.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.2f, -0.2f, -0.8f, -0.2f, -0.2f, -0.8f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f);
        this.birbModel[33].func_78793_a(0.0f, 17.0f, 0.0f);
        this.birbModel[34].addShapeBox(-2.0f, 5.5f, 4.0f, 1, 1, 1, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, -0.2f, -0.2f, -0.3f, -0.2f, -0.2f, -0.3f, -0.5f, -0.5f, -0.3f, -0.5f, -0.5f);
        this.birbModel[34].func_78793_a(0.0f, 17.0f, 0.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 35; ++i) {
            this.birbModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
