// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelGun;

public class ModelBeeNest extends ModelGun
{
    int textureX;
    int textureY;
    
    public ModelBeeNest() {
        this.textureX = 128;
        this.textureY = 32;
        this.gunModel = new ModelRendererTurbo[12];
        this.ammoModel = new ModelRendererTurbo[28];
        this.initgunModel_1();
        this.initammoModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initgunModel_1() {
        this.gunModel[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.gunModel[1] = new ModelRendererTurbo(this, 1, 6, this.textureX, this.textureY);
        this.gunModel[2] = new ModelRendererTurbo(this, 1, 12, this.textureX, this.textureY);
        this.gunModel[3] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.gunModel[4] = new ModelRendererTurbo(this, 0, 22, this.textureX, this.textureY);
        this.gunModel[5] = new ModelRendererTurbo(this, 0, 27, this.textureX, this.textureY);
        this.gunModel[6] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[7] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.gunModel[8] = new ModelRendererTurbo(this, 73, 9, this.textureX, this.textureY);
        this.gunModel[9] = new ModelRendererTurbo(this, 89, 9, this.textureX, this.textureY);
        this.gunModel[10] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.gunModel[11] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.gunModel[0].addShapeBox(0.0f, 0.0f, -1.5f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[0].setRotationPoint(-15.0f, -3.1f, 0.0f);
        this.gunModel[0].rotateAngleZ = -0.03490659f;
        this.gunModel[1].addShapeBox(0.0f, 0.0f, -3.0f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[1].setRotationPoint(-15.0f, -2.6f, -0.8f);
        this.gunModel[1].rotateAngleX = -1.0471976f;
        this.gunModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.0f);
        this.gunModel[2].setRotationPoint(-15.0f, -2.6f, 0.8f);
        this.gunModel[2].rotateAngleX = 1.0471976f;
        this.gunModel[3].addShapeBox(0.0f, 0.0f, -3.0f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[3].setRotationPoint(-15.0f, -7.6f, -1.5f);
        this.gunModel[3].rotateAngleX = 1.0471976f;
        this.gunModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[4].setRotationPoint(-15.0f, -7.6f, 1.5f);
        this.gunModel[4].rotateAngleX = -1.0471976f;
        this.gunModel[5].addShapeBox(0.0f, 0.0f, -1.5f, 31, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.gunModel[5].setRotationPoint(-15.0f, -7.5f, 0.0f);
        this.gunModel[5].rotateAngleZ = 0.03490659f;
        this.gunModel[6].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f);
        this.gunModel[6].setRotationPoint(7.0f, -7.4f, 0.0f);
        this.gunModel[6].rotateAngleZ = 0.03490659f;
        this.gunModel[7].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.gunModel[7].setRotationPoint(7.0f, -5.0f, 0.0f);
        this.gunModel[7].rotateAngleZ = 0.03490659f;
        this.gunModel[8].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f);
        this.gunModel[8].setRotationPoint(15.5f, -1.3f, 0.0f);
        this.gunModel[8].rotateAngleZ = 0.03490659f;
        this.gunModel[9].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f);
        this.gunModel[9].setRotationPoint(15.5f, 1.7f, 0.0f);
        this.gunModel[9].rotateAngleZ = 0.03490659f;
        this.gunModel[10].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f);
        this.gunModel[10].setRotationPoint(-5.0f, -7.4f, 0.0f);
        this.gunModel[10].rotateAngleZ = 0.03490659f;
        this.gunModel[11].addShapeBox(0.0f, 0.0f, -1.5f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 1.5f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f);
        this.gunModel[11].setRotationPoint(-5.0f, -5.0f, 0.0f);
        this.gunModel[11].rotateAngleZ = 0.03490659f;
    }
    
    private void initammoModel_1() {
        this.ammoModel[0] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[1] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[2] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[3] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[5] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[6] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[7] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[8] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[9] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[10] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[11] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[12] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[13] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[14] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[15] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[16] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[17] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[18] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[19] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[20] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[21] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[22] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[23] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[24] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[25] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[26] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.ammoModel[27] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.ammoModel[0].addShapeBox(0.0f, 0.0f, -1.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[0].setRotationPoint(-5.0f, -6.5f, 0.0f);
        this.ammoModel[1].addShapeBox(0.0f, 0.0f, -1.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[1].setRotationPoint(12.0f, -6.5f, 0.0f);
        this.ammoModel[2].addShapeBox(0.0f, 0.0f, -0.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[2].setRotationPoint(-5.0f, -6.5f, 0.0f);
        this.ammoModel[3].addShapeBox(0.0f, 0.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[3].setRotationPoint(12.0f, -6.5f, 0.0f);
        this.ammoModel[4].addShapeBox(0.0f, 0.0f, 0.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[4].setRotationPoint(-5.0f, -6.5f, 0.0f);
        this.ammoModel[5].addShapeBox(0.0f, 0.0f, 0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[5].setRotationPoint(12.0f, -6.5f, 0.0f);
        this.ammoModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[6].setRotationPoint(-5.0f, -5.5f, 0.0f);
        this.ammoModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[7].setRotationPoint(12.0f, -5.5f, 0.0f);
        this.ammoModel[8].addShapeBox(0.0f, 0.0f, -1.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[8].setRotationPoint(-5.0f, -5.5f, 0.0f);
        this.ammoModel[9].addShapeBox(0.0f, 0.0f, -1.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[9].setRotationPoint(12.0f, -5.5f, 0.0f);
        this.ammoModel[10].addShapeBox(0.0f, 0.0f, -2.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[10].setRotationPoint(-5.0f, -5.5f, 0.0f);
        this.ammoModel[11].addShapeBox(0.0f, 0.0f, -2.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[11].setRotationPoint(12.0f, -5.5f, 0.0f);
        this.ammoModel[12].addShapeBox(0.0f, 0.0f, 1.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[12].setRotationPoint(-5.0f, -5.5f, 0.0f);
        this.ammoModel[13].addShapeBox(0.0f, 0.0f, 1.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[13].setRotationPoint(12.0f, -5.5f, 0.0f);
        this.ammoModel[14].addShapeBox(0.0f, 0.0f, -1.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[14].setRotationPoint(-5.0f, -4.5f, 0.0f);
        this.ammoModel[15].addShapeBox(0.0f, 0.0f, -1.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[15].setRotationPoint(12.0f, -4.5f, 0.0f);
        this.ammoModel[16].addShapeBox(0.0f, 0.0f, -0.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[16].setRotationPoint(-5.0f, -4.5f, 0.0f);
        this.ammoModel[17].addShapeBox(0.0f, 0.0f, -0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[17].setRotationPoint(12.0f, -4.5f, 0.0f);
        this.ammoModel[18].addShapeBox(0.0f, 0.0f, 0.5f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[18].setRotationPoint(-5.0f, -4.5f, 0.0f);
        this.ammoModel[19].addShapeBox(0.0f, 0.0f, 0.5f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[19].setRotationPoint(12.0f, -4.5f, 0.0f);
        this.ammoModel[20].addShapeBox(0.0f, 0.0f, -1.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[20].setRotationPoint(12.0f, -3.5f, 0.0f);
        this.ammoModel[21].addShapeBox(0.0f, 0.0f, -1.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[21].setRotationPoint(-5.0f, -3.5f, 0.0f);
        this.ammoModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[22].setRotationPoint(-5.0f, -3.5f, 0.0f);
        this.ammoModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[23].setRotationPoint(12.0f, -3.5f, 0.0f);
        this.ammoModel[24].addShapeBox(0.0f, 0.0f, -1.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[24].setRotationPoint(12.0f, -7.5f, 0.0f);
        this.ammoModel[25].addShapeBox(0.0f, 0.0f, -1.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[25].setRotationPoint(-5.0f, -7.5f, 0.0f);
        this.ammoModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 12, 1, 1, 0.0f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f, 5.0f, -0.3f, -0.3f);
        this.ammoModel[26].setRotationPoint(-5.0f, -7.5f, 0.0f);
        this.ammoModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.45f, -0.45f, 0.0f, -0.45f, -0.45f, 0.0f, -0.2f, -0.2f);
        this.ammoModel[27].setRotationPoint(12.0f, -7.5f, 0.0f);
    }
}
