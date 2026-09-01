// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelYuanHeavyLamellar extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelYuanHeavyLamellar() {
        this.textureX = 128;
        this.textureY = 64;
        this.bodyModel = new ModelRendererTurbo[21];
        this.leftArmModel = new ModelRendererTurbo[5];
        this.rightArmModel = new ModelRendererTurbo[6];
        this.leftLegModel = new ModelRendererTurbo[2];
        this.rightLegModel = new ModelRendererTurbo[2];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 113, 9, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 105, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 10.0f, -2.5f, 8, 1, 5, 0.0f, 0.7f, 0.0f, 0.3f, 0.7f, 0.0f, 0.3f, 0.7f, 0.0f, 0.3f, 0.7f, 0.0f, 0.3f, 0.7f, -0.3f, 0.3f, 0.7f, -0.3f, 0.3f, 0.7f, -0.3f, 0.3f, 0.7f, -0.3f, 0.3f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-0.5f, 1.5f, -2.6f, 1, 8, 1, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-6.0f, -0.7f, -3.0f, 6, 2, 1, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 5.5f, -1.0f, 0.0f, 5.0f, -1.0f, 0.0f, 0.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 5.5f, -1.0f, 0.0f, 5.5f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-0.5f, 1.0f, -3.5f, 1, 1, 1, 0.0f, 1.0f, -1.6f, -0.2f, -0.4f, -0.2f, -0.2f, -0.4f, -0.2f, -0.2f, 1.0f, -1.6f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 1.0f, -0.2f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-0.5f, 1.0f, -3.5f, 1, 1, 1, 0.0f, -0.4f, -0.2f, -0.2f, 1.0f, -1.6f, -0.2f, 1.0f, -1.6f, -0.2f, -0.4f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, 1.0f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 4.5f, -2.5f, 8, 10, 10, 0.0f, 0.8f, 0.0f, 0.2f, -4.2f, 0.0f, 0.2f, -4.0f, 0.0f, -4.8f, 0.8f, 0.0f, -4.8f, 0.6f, -4.5f, 0.2f, -4.2f, -4.5f, 0.2f, -4.0f, -4.5f, -4.8f, 0.6f, -4.5f, -4.8f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 1.5f, -2.7f, 8, 3, 1, 0.0f, 0.0f, 0.2f, 0.0f, -4.2f, 0.0f, 0.0f, -4.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.7f, 0.0f, 0.0f, -4.2f, 0.0f, 0.0f, -4.2f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-4.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-5.0f, 3.5f, -2.5f, 1, 3, 10, 0.0f, 0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, 0.0f, 0.0f, -4.8f, 0.2f, 0.0f, -4.8f, 0.0f, 0.5f, 0.2f, -0.2f, 0.4f, 0.2f, 0.0f, 0.4f, -4.8f, 0.0f, 0.5f, -4.8f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-5.0f, 3.5f, -3.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, -0.5f, -1.7f, 0.0f, -0.5f, -1.7f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.2f, 0.5f, -0.7f, -2.2f, 0.2f, -0.7f, -2.2f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-3.0f, 4.0f, -3.0f, 6, 1, 6, 0.0f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f, 0.0f, -0.2f, -0.1f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-5.0f, 3.5f, 2.7f, 4, 3, 1, 0.0f, 0.2f, 0.0f, 0.0f, -1.7f, 0.0f, 0.0f, -1.7f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.5f, 0.0f, -2.2f, 0.2f, 0.0f, -2.2f, 0.2f, -0.7f, -0.2f, 0.5f, -0.7f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-0.5f, 4.3f, -3.0f, 1, 2, 1, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.6f, -0.5f, 0.3f, -1.0f, -0.2f, 0.3f, -1.0f, -0.2f, 0.0f, 0.6f, -0.5f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-4.0f, 4.5f, -2.5f, 8, 10, 10, 0.0f, -4.2f, 0.0f, 0.2f, 0.8f, 0.0f, 0.2f, 0.8f, 0.0f, -4.8f, -4.0f, 0.0f, -4.8f, -4.2f, -4.5f, 0.2f, 0.6f, -4.5f, 0.2f, 0.6f, -4.5f, -4.8f, -4.0f, -4.5f, -4.8f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-4.0f, 1.5f, -2.7f, 8, 3, 1, 0.0f, -4.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -4.2f, 0.0f, 0.0f, -4.2f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, -4.2f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, -0.7f, -3.0f, 6, 2, 1, 0.0f, 0.0f, 0.3f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 5.0f, 0.0f, 0.3f, 5.5f, 0.0f, 0.5f, 0.0f, -1.0f, 0.0f, 0.5f, -1.0f, 0.0f, 5.5f, 0.0f, 0.5f, 5.5f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(4.0f, 3.5f, -2.5f, 1, 3, 10, 0.0f, -0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, -4.8f, 0.0f, 0.0f, -4.8f, -0.2f, 0.4f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, -4.8f, 0.0f, 0.4f, -4.8f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(1.0f, 3.5f, -3.7f, 4, 3, 1, 0.0f, -1.7f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, -1.7f, 0.0f, 0.0f, -2.2f, 0.2f, -0.7f, -0.2f, 0.5f, -0.7f, 0.0f, 0.5f, 0.0f, -2.2f, 0.2f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(1.0f, 3.5f, 2.7f, 4, 3, 1, 0.0f, -1.7f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -1.7f, 0.0f, -0.5f, -2.2f, 0.2f, 0.0f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, -0.7f, -2.2f, 0.2f, -0.7f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(0.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-0.5f, 4.3f, -3.0f, 1, 2, 1, 0.0f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -1.0f, -0.2f, 0.3f, 0.6f, -0.5f, 0.3f, 0.6f, -0.5f, 0.0f, -1.0f, -0.2f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-5.0f, -2.0f, -3.0f, 8, 5, 1, 0.0f, -4.0f, 0.0f, -0.25f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, -4.0f, 0.0f, -0.25f, -5.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.25f, -5.3f, 0.0f, -0.25f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(3.0f, -2.0f, -2.0f, 1, 10, 8, 0.0f, -0.2f, 0.0f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, -3.5f, -0.2f, 0.0f, -3.5f, -0.2f, -5.0f, 0.7f, 0.2f, -5.0f, 0.7f, 0.2f, -5.0f, -3.3f, -0.2f, -5.0f, -3.3f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(-1.7f, 3.0f, -2.0f, 6, 4, 8, 0.0f, -2.0f, 0.0f, 0.7f, -0.1f, 0.0f, 0.7f, -0.1f, 0.0f, -3.3f, -2.0f, 0.0f, -3.3f, -2.8f, -1.7f, 0.7f, 0.0f, -1.5f, 0.7f, 0.0f, -1.5f, -3.3f, -2.8f, -1.7f, -3.3f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-5.0f, -2.0f, 2.0f, 8, 5, 1, 0.0f, -4.0f, 0.0f, -0.25f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, -4.0f, 0.0f, -0.25f, -5.3f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f, 0.2f, 0.0f, -0.3f, -5.3f, 0.0f, -0.3f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(0.0f, -2.7f, -3.0f, 4, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -0.5f, -0.5f, -0.5f, -0.5f, 4.5f, 0.0f, 0.0f, 5.0f, 0.0f, 0.0f, 0.5f, -2.0f, -0.5f, 0.0f, -2.0f, -0.5f, 5.0f, 0.0f, 0.0f, 5.5f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 9, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.rightArmModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-4.0f, -2.7f, -3.0f, 4, 2, 1, 0.0f, -0.5f, -0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 5.0f, -0.5f, -0.5f, 4.5f, -2.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 5.5f, -2.0f, -0.5f, 5.0f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, -2.0f, -2.0f, 1, 10, 8, 0.0f, 0.0f, -0.5f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, -3.5f, 0.0f, -0.5f, -3.5f, 0.2f, -5.0f, 0.7f, -0.2f, -5.0f, 0.7f, -0.2f, -5.0f, -3.3f, 0.2f, -5.0f, -3.3f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.3f, 3.0f, -2.0f, 6, 4, 8, 0.0f, -0.1f, 0.0f, 0.7f, -2.0f, 0.0f, 0.7f, -2.0f, 0.0f, -3.3f, -0.1f, 0.0f, -3.3f, 0.0f, -1.5f, 0.7f, -2.8f, -1.7f, 0.7f, -2.8f, -1.7f, -3.3f, 0.0f, -1.5f, -3.3f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, -2.0f, -3.0f, 8, 5, 1, 0.0f, 0.2f, 0.0f, -0.5f, -4.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.3f, -5.3f, 0.0f, -0.3f, -5.3f, 0.0f, -0.25f, 0.2f, 0.0f, -0.25f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-1.0f, 2.0f, -2.0f, 3, 1, 4, 0.0f, 0.62f, 0.2f, 0.62f, 0.62f, -0.2f, 0.62f, 0.62f, -0.2f, 0.62f, 0.62f, 0.2f, 0.62f, 0.62f, -0.4f, 0.62f, 0.62f, 0.0f, 0.62f, 0.62f, 0.0f, 0.62f, 0.62f, -0.4f, 0.62f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[5].addShapeBox(-3.0f, -2.0f, 2.0f, 8, 5, 1, 0.0f, 0.2f, 0.0f, 0.0f, -4.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.25f, -5.3f, 0.0f, -0.25f, -5.3f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f);
        this.rightArmModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-6.0f, -0.8f, -2.0f, 8, 16, 8, 0.0f, -3.9f, 0.5f, 0.7f, 0.5f, 0.5f, 0.7f, 0.5f, 0.5f, -3.3f, -3.9f, 0.5f, -3.3f, -4.5f, -7.8f, 2.2f, 2.5f, -8.2f, 1.5f, 2.5f, -8.2f, -2.5f, -4.5f, -7.8f, -1.8f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, -0.8f, -2.0f, 4, 9, 4, 0.0f, 0.1f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, -0.7f, 0.4f, 2.2f, 2.5f, 0.0f, 1.5f, 2.5f, 0.0f, 1.5f, -0.7f, 0.4f, 2.2f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 25, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.0f, -0.8f, -2.0f, 8, 16, 8, 0.0f, 0.5f, 0.5f, 0.7f, -3.9f, 0.5f, 0.7f, -3.9f, 0.5f, -3.3f, 0.5f, 0.5f, -3.3f, 2.5f, -8.2f, 1.5f, -4.5f, -7.8f, 2.2f, -4.5f, -7.8f, -1.8f, 2.5f, -8.2f, -2.5f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, -0.8f, -2.0f, 4, 9, 4, 0.0f, 0.0f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.1f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f, 2.5f, 0.0f, 1.5f, -0.7f, 0.4f, 2.2f, -0.7f, 0.4f, 2.2f, 2.5f, 0.0f, 1.5f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
