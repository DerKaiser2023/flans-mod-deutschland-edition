// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelQingFakeArmor extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelQingFakeArmor() {
        this.textureX = 64;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[22];
        this.leftArmModel = new ModelRendererTurbo[5];
        this.rightArmModel = new ModelRendererTurbo[5];
        this.leftLegModel = new ModelRendererTurbo[1];
        this.rightLegModel = new ModelRendererTurbo[1];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
        this.initleftLegModel_1();
        this.initrightLegModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 46, 54, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 46, 54, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 49, 66, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 33, 53, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 53, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 49, 66, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 49, 66, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 25, 16, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 11.5f, -2.5f, 8, 1, 5, 0.0f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 11.0f, -2.5f, 8, 1, 5, 0.0f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-0.5f, 1.5f, -2.6f, 1, 8, 1, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, 0.0f, 1.5f, 0.0f, -0.2f, 1.5f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 5.0f, -2.5f, 4, 5, 5, 0.0f, 0.5f, 0.0f, 0.4f, -0.1f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 1.1f, 0.2f, -0.1f, 1.1f, 0.2f, 0.0f, 1.1f, 0.2f, 0.5f, 1.1f, 0.2f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 1.5f, -2.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.5f, 0.2f, -0.1f, 0.5f, 0.2f, -0.1f, 0.5f, 0.0f, 0.5f, 0.5f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 0.0f, -2.5f, 2, 1, 5, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.8f, 0.0f, 2.0f, 0.8f, 0.0f, -0.5f, 0.7f, 0.0f, 0.0f, 0.5f, 0.2f, -0.2f, 0.5f, 0.2f, 2.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(-4.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.2f, 0.7f, 0.5f, 0.2f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(0.0f, 5.0f, -2.5f, 4, 5, 5, 0.0f, -0.1f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.5f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, -0.1f, 1.1f, 0.2f, 0.5f, 1.1f, 0.2f, 0.5f, 1.1f, 0.2f, 0.0f, 1.1f, 0.2f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-2.5f, 4.6f, -3.0f, 5, 1, 6, 0.0f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f, -0.05f, -0.3f, -0.02f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-4.0f, 5.0f, -2.5f, 1, 5, 5, 0.0f, 1.0f, -0.3f, 0.45f, 0.9f, 0.0f, 0.7f, 1.0f, 0.0f, 0.7f, 1.0f, -0.3f, 0.45f, 0.6f, 0.0f, 0.3f, -0.1f, -1.5f, 0.45f, 0.0f, -1.5f, 0.45f, 0.6f, 0.0f, 0.3f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-4.5f, 4.6f, -3.0f, 2, 1, 6, 0.0f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.1f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.5f, -0.5f, -4.1f, 3, 5, 1, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, 0.5f, -2.8f, 0.0f, 0.5f, -2.8f, 0.0f, 0.5f, -3.0f, 0.5f, 0.5f, -3.0f, 0.5f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.0f, 1.5f, -2.7f, 4, 3, 1, 0.0f, -0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.5f, 0.2f, 0.5f, 0.5f, 0.2f, 0.5f, 0.5f, 0.0f, -0.1f, 0.5f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(2.5f, 4.6f, -3.0f, 2, 1, 6, 0.0f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.02f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.1f, 0.05f, -0.3f, -0.02f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(3.0f, 5.0f, -2.5f, 1, 5, 5, 0.0f, 0.9f, 0.0f, 0.7f, 1.0f, -0.3f, 0.45f, 1.0f, -0.3f, 0.45f, 1.0f, 0.0f, 0.7f, -0.1f, -1.5f, 0.45f, 0.6f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f, 0.0f, -1.5f, 0.45f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-3.8f, 5.0f, -2.5f, 1, 5, 5, 0.0f, 1.0f, -0.3f, 0.45f, 0.9f, 0.0f, 0.7f, 1.0f, 0.0f, 0.7f, 1.0f, -0.3f, 0.45f, 0.6f, 0.0f, 0.3f, -0.1f, -1.5f, 0.45f, 0.0f, -1.5f, 0.45f, 0.6f, 0.0f, 0.3f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(2.8f, 5.0f, -2.5f, 1, 5, 5, 0.0f, 0.9f, 0.0f, 0.7f, 1.0f, -0.3f, 0.45f, 1.0f, -0.3f, 0.45f, 1.0f, 0.0f, 0.7f, -0.1f, -1.5f, 0.45f, 0.6f, 0.0f, 0.3f, 0.6f, 0.0f, 0.3f, 0.0f, -1.5f, 0.45f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(-5.0f, -0.5f, -4.1f, 3, 5, 1, 0.0f, -1.0f, 0.5f, -1.5f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.5f, 1.5f, 0.0f, -3.8f, -0.7f, 0.0f, -2.8f, 0.0f, 0.0f, -3.0f, 0.5f, 0.0f, -4.0f, 0.5f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(2.0f, -0.5f, -4.1f, 3, 5, 1, 0.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.5f, -1.5f, -1.0f, 0.5f, 1.5f, 1.0f, 0.0f, 1.0f, 0.0f, -2.8f, 0.0f, 0.0f, -3.8f, -0.7f, 0.0f, -4.0f, 0.5f, 0.0f, -3.0f, 0.5f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(2.0f, 0.0f, -2.5f, 2, 1, 5, 0.0f, -0.5f, 0.8f, 0.0f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, 2.0f, 0.8f, 0.0f, -0.2f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 2.0f, 0.5f, 0.2f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-2.0f, 9.0f, -3.6f, 4, 4, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.2f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 58, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 2.0f, -2.0f, 3, 1, 4, 0.0f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.6f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(3.0f, -2.0f, -2.0f, 1, 5, 4, 0.0f, -0.2f, 0.2f, 0.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, 0.5f, -0.2f, 0.2f, 0.5f, -0.2f, -0.1f, 0.8f, 1.2f, 0.0f, 0.7f, 1.2f, 0.0f, 0.7f, -0.2f, -0.1f, 0.8f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(0.3f, 3.0f, -2.0f, 5, 2, 4, 0.0f, 1.0f, 0.5f, 1.1f, -0.1f, 0.0f, 0.7f, -0.1f, 0.0f, 0.7f, 1.0f, 0.5f, 1.1f, -3.0f, 0.0f, 1.0f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -3.0f, 0.0f, 1.0f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(-1.0f, -2.0f, -3.0f, 4, 5, 6, 0.0f, 0.5f, 0.7f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, 0.2f, -0.5f, 0.5f, 0.7f, -0.5f, -0.3f, -0.5f, 0.1f, 0.2f, -0.1f, -0.2f, 0.2f, -0.1f, -0.2f, -0.3f, -0.5f, 0.1f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(0.3f, 3.3f, -2.0f, 5, 2, 4, 0.0f, 1.0f, 0.5f, 1.0f, -0.1f, 0.0f, 0.6f, -0.1f, 0.0f, 0.6f, 1.0f, 0.5f, 1.0f, -3.0f, 0.0f, 0.9f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, -3.0f, 0.0f, 0.9f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 58, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 65, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-2.0f, 2.0f, -2.0f, 3, 1, 4, 0.0f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.5f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.6f, 0.6f, -0.2f, 0.5f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, -2.0f, -2.0f, 1, 5, 4, 0.0f, 0.0f, -0.5f, 0.5f, -0.2f, 0.2f, 0.5f, -0.2f, 0.2f, 0.5f, 0.0f, -0.5f, 0.5f, 1.2f, 0.0f, 0.7f, -0.2f, -0.1f, 0.8f, -0.2f, -0.1f, 0.8f, 1.2f, 0.0f, 0.7f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-5.3f, 3.0f, -2.0f, 5, 2, 4, 0.0f, -0.1f, 0.0f, 0.7f, 1.0f, 0.5f, 1.1f, 1.0f, 0.5f, 1.1f, -0.1f, 0.0f, 0.7f, 0.5f, 0.5f, 0.5f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, 0.5f, 0.5f, 0.5f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, -2.0f, -3.0f, 4, 5, 6, 0.0f, 0.2f, 0.2f, -0.5f, 0.5f, 0.7f, -0.5f, 0.5f, 0.7f, -0.5f, 0.2f, 0.2f, -0.5f, 0.2f, -0.1f, -0.2f, -0.3f, -0.5f, 0.1f, -0.3f, -0.5f, 0.1f, 0.2f, -0.1f, -0.2f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-5.3f, 3.3f, -2.0f, 5, 2, 4, 0.0f, -0.1f, 0.0f, 0.6f, 1.0f, 0.5f, 1.0f, 1.0f, 0.5f, 1.0f, -0.1f, 0.0f, 0.6f, 0.5f, 0.5f, 0.4f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 1.0f, 0.5f, 0.5f, 0.4f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftLegModel_1() {
        (this.leftLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY)).addShapeBox(-2.0f, -1.0f, -2.0f, 4, 11, 4, 0.0f, -0.1f, -0.5f, 0.7f, 0.5f, -0.5f, 0.7f, 0.5f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.3f, -1.0f, 2.2f, 2.5f, -2.0f, 1.5f, 2.5f, -2.0f, 1.5f, -0.3f, -1.0f, 2.2f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightLegModel_1() {
        (this.rightLegModel[0] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY)).addShapeBox(-2.0f, -1.0f, -2.0f, 4, 11, 4, 0.0f, 0.5f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, -0.1f, -0.5f, 0.7f, 0.5f, -0.5f, 0.7f, 2.5f, -2.0f, 1.5f, -0.3f, -1.0f, 2.2f, -0.3f, -1.0f, 2.2f, 2.5f, -2.0f, 1.5f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
