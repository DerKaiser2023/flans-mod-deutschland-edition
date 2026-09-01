// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelKazakhNoble extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelKazakhNoble() {
        this.textureX = 64;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[51];
        this.leftArmModel = new ModelRendererTurbo[5];
        this.rightArmModel = new ModelRendererTurbo[5];
        this.initbodyModel_1();
        this.initleftArmModel_1();
        this.initrightArmModel_1();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 46, 54, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 46, 54, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 9, 9, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 25, 9, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 9, 17, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 25, 72, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 25, 1, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 49, 9, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase)this, 25, 72, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase)this, 25, 72, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase)this, 25, 72, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, 9.0f, -2.5f, 8, 1, 5, 0.0f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, 0.0f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f, 0.55f, -0.2f, 0.25f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 9.0f, -2.5f, 8, 1, 5, 0.0f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.1f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f, 0.6f, -0.3f, 0.3f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-4.0f, 5.0f, -2.5f, 4, 4, 5, 0.0f, 0.7f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.7f, 0.0f, 0.4f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-4.0f, 1.5f, -2.7f, 4, 3, 1, 0.0f, 0.3f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.7f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addShapeBox(-4.0f, 0.0f, -2.5f, 2, 1, 5, 0.0f, 0.5f, 0.7f, 0.0f, -0.5f, 0.8f, 0.0f, 2.0f, 0.8f, 0.0f, 0.5f, 0.7f, 0.0f, 0.3f, 1.5f, 0.2f, 2.0f, 0.5f, 0.2f, 2.0f, 0.5f, 0.2f, 0.3f, 1.5f, 0.2f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addShapeBox(-4.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.3f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.7f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.2f, 0.7f, 0.5f, 0.2f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addShapeBox(0.0f, 5.0f, -2.5f, 4, 4, 5, 0.0f, 0.0f, 0.0f, 0.4f, 0.7f, 0.0f, 0.4f, 0.7f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.5f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-1.5f, 10.0f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-1.5f, 7.4f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-1.5f, 1.8f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(0.5f, 1.8f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.5f, 7.4f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(0.5f, 10.0f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(-3.2f, 0.8f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-3.5f, 3.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[15].addShapeBox(-3.7f, 6.0f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-4.2f, 7.6f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[17].addShapeBox(3.2f, 7.6f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[18].addShapeBox(2.5f, 3.5f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[19].addShapeBox(2.2f, 0.8f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[20].addShapeBox(-2.0f, 4.6f, -3.5f, 4, 1, 1, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f);
        this.bodyModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[21].addShapeBox(-2.0f, 3.1f, -3.5f, 4, 1, 1, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f);
        this.bodyModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[22].addShapeBox(-2.0f, 6.1f, -3.5f, 4, 1, 1, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.bodyModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[23].addShapeBox(2.7f, 6.0f, -3.0f, 1, 1, 6, 0.0f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f, -0.2f, -0.2f, 0.1f);
        this.bodyModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[24].addShapeBox(-4.2f, 9.5f, -2.6f, 4, 3, 1, 0.0f, 0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.7f, 1.0f, 0.9f, 0.2f, 1.4f, 1.1f, 0.2f, 1.4f, -1.2f, 0.7f, 1.0f, -1.2f);
        this.bodyModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[25].addShapeBox(-4.5f, 9.0f, -2.5f, 1, 4, 5, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 1.3f, 0.5f, 0.5f, -1.4f, 0.5f, 0.5f, -1.4f, 0.5f, 0.5f, 1.3f, 0.5f, 0.5f);
        this.bodyModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[26].addShapeBox(-4.2f, 9.5f, 1.6f, 4, 3, 1, 0.0f, 0.3f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.7f, 1.0f, -1.2f, 0.2f, 1.2f, -1.2f, 0.2f, 1.2f, 0.9f, 0.7f, 1.0f, 0.9f);
        this.bodyModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[27].addShapeBox(-4.5f, 11.5f, -3.5f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[28].addShapeBox(-1.5f, 11.7f, -3.7f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[29].addShapeBox(0.5f, 11.7f, -3.7f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[30].addShapeBox(-4.5f, 11.5f, 2.4f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[31].addShapeBox(3.5f, 11.5f, 2.4f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[32].addShapeBox(-4.0f, 9.5f, -2.0f, 9, 12, 4, 0.0f, 0.2f, 0.0f, 0.5f, -5.0f, 0.0f, 0.6f, -5.0f, 0.0f, -1.4f, 0.2f, 0.0f, -1.5f, 1.4f, -6.5f, 1.1f, -5.7f, -6.2f, 1.1f, -5.7f, -6.2f, -1.2f, 1.7f, -6.5f, -1.3f);
        this.bodyModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[33].addShapeBox(3.5f, 11.5f, -3.5f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[34].addShapeBox(0.5f, 11.7f, 2.5f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[35].addShapeBox(-1.5f, 11.7f, 2.5f, 1, 1, 1, 0.0f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f, -0.2f);
        this.bodyModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[36].addShapeBox(-5.0f, -0.5f, -3.0f, 1, 3, 6, 0.0f, 0.1f, 0.2f, -0.2f, -0.2f, 0.3f, -0.2f, -0.2f, 0.3f, -0.2f, 0.1f, 0.2f, -0.2f, -0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[37].addShapeBox(-5.0f, 2.5f, -3.0f, 1, 2, 6, 0.0f, -0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.1f, 0.2f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, 0.1f, 0.2f, 0.0f);
        this.bodyModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[38].addShapeBox(-6.0f, 13.0f, -3.5f, 6, 1, 7, 0.0f, 0.0f, 0.2f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, 0.2f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, -0.3f, 0.3f);
        this.bodyModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[39].addShapeBox(0.0f, 1.5f, -2.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.2f, 0.7f, 0.5f, 0.2f, 0.7f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f);
        this.bodyModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[40].addShapeBox(2.0f, 0.0f, -2.5f, 2, 1, 5, 0.0f, -0.5f, 0.8f, 0.0f, 0.5f, 0.7f, 0.0f, 0.5f, 0.7f, 0.0f, 2.0f, 0.8f, 0.0f, 2.0f, 0.5f, 0.2f, 0.3f, 1.5f, 0.2f, 0.3f, 1.5f, 0.2f, 2.0f, 0.5f, 0.2f);
        this.bodyModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[41].addShapeBox(0.0f, 1.5f, 1.7f, 4, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.3f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.7f, 0.5f, 0.0f, 0.7f, 0.5f, 0.2f, 0.0f, 0.5f, 0.2f);
        this.bodyModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[42].addShapeBox(0.2f, 9.5f, -2.6f, 4, 3, 1, 0.0f, 0.2f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 1.4f, 1.1f, 0.7f, 1.0f, 0.9f, 0.7f, 1.0f, -1.2f, 0.2f, 1.4f, -1.2f);
        this.bodyModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[43].addShapeBox(0.2f, 9.5f, 1.6f, 4, 3, 1, 0.0f, 0.2f, 0.0f, -0.5f, 0.3f, 0.0f, -0.5f, 0.3f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 1.2f, -1.2f, 0.7f, 1.0f, -1.2f, 0.7f, 1.0f, 0.9f, 0.2f, 1.2f, 0.9f);
        this.bodyModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[44].addShapeBox(3.5f, 9.0f, -2.5f, 1, 4, 5, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.4f, 0.5f, 0.5f, 1.3f, 0.5f, 0.5f, 1.3f, 0.5f, 0.5f, -1.4f, 0.5f, 0.5f);
        this.bodyModel[44].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[45].addShapeBox(0.0f, 13.0f, -3.5f, 6, 1, 7, 0.0f, 0.0f, -0.3f, 0.3f, 0.0f, 0.2f, 0.3f, 0.0f, 0.2f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.bodyModel[45].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[46].addShapeBox(-5.0f, 9.5f, -2.0f, 9, 12, 4, 0.0f, -5.0f, 0.0f, 0.6f, 0.2f, 0.0f, 0.5f, 0.2f, 0.0f, -1.5f, -5.0f, 0.0f, -1.4f, -5.7f, -6.2f, 1.1f, 1.4f, -6.5f, 1.1f, 1.7f, -6.5f, -1.3f, -5.7f, -6.2f, -1.2f);
        this.bodyModel[46].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[47].addShapeBox(-4.0f, 9.5f, -2.0f, 9, 12, 4, 0.0f, 0.2f, 0.0f, -1.5f, -5.0f, 0.0f, -1.4f, -5.0f, 0.0f, 0.6f, 0.2f, 0.0f, 0.5f, 1.7f, -6.5f, -1.3f, -5.7f, -6.2f, -1.2f, -5.7f, -6.2f, 1.1f, 1.4f, -6.5f, 1.1f);
        this.bodyModel[47].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[48].addShapeBox(-5.0f, 9.5f, -2.0f, 9, 12, 4, 0.0f, -5.0f, 0.0f, -1.4f, 0.2f, 0.0f, -1.5f, 0.2f, 0.0f, 0.5f, -5.0f, 0.0f, 0.6f, -5.7f, -6.2f, -1.2f, 1.7f, -6.5f, -1.3f, 1.4f, -6.5f, 1.1f, -5.7f, -6.2f, 1.1f);
        this.bodyModel[48].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[49].addShapeBox(4.0f, 2.5f, -3.0f, 1, 2, 6, 0.0f, 0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, -0.2f, 0.3f, 0.0f, 0.1f, 0.2f, 0.0f, 0.1f, 0.2f, 0.0f, -0.2f, 0.3f, 0.0f);
        this.bodyModel[49].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[50].addShapeBox(4.0f, -0.5f, -3.0f, 1, 3, 6, 0.0f, -0.2f, 0.3f, -0.2f, 0.1f, 0.2f, -0.2f, 0.1f, 0.2f, -0.2f, -0.2f, 0.3f, -0.2f, 0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.bodyModel[50].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initleftArmModel_1() {
        this.leftArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 65, this.textureX, this.textureY);
        this.leftArmModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.leftArmModel[3] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.leftArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.0f, 8.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-1.0f, 6.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[2].addShapeBox(3.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, -0.9f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, -0.9f, 0.2f, 0.0f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f);
        this.leftArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[3].addShapeBox(3.3f, 0.6f, -2.0f, 1, 3, 4, 0.0f, -1.4f, 0.2f, -0.5f, 0.6f, 0.2f, -0.5f, 0.6f, 0.2f, -0.5f, -1.4f, 0.2f, -0.5f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f);
        this.leftArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[4].addShapeBox(-5.0f, -2.0f, -2.0f, 8, 15, 4, 0.0f, -3.7f, 0.35f, 0.3f, 0.3f, 0.25f, 0.3f, 0.3f, 0.25f, 0.3f, -3.7f, 0.35f, 0.3f, -4.0f, -8.4f, 0.7f, 0.6f, -8.6f, 0.3f, 0.6f, -8.6f, 0.3f, -4.0f, -8.4f, 0.7f);
        this.leftArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initrightArmModel_1() {
        this.rightArmModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.rightArmModel[2] = new ModelRendererTurbo((ModelBase)this, 17, 9, this.textureX, this.textureY);
        this.rightArmModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 65, this.textureX, this.textureY);
        this.rightArmModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.0f, -2.0f, -2.0f, 8, 15, 4, 0.0f, 0.3f, 0.25f, 0.3f, -3.7f, 0.35f, 0.3f, -3.7f, 0.35f, 0.3f, 0.3f, 0.25f, 0.3f, 0.6f, -8.6f, 0.3f, -4.0f, -8.4f, 0.7f, -4.0f, -8.4f, 0.7f, 0.6f, -8.6f, 0.3f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-4.0f, 4.0f, -2.0f, 1, 5, 4, 0.0f, 0.3f, 0.2f, 0.0f, -0.9f, 0.2f, 0.0f, -0.9f, 0.2f, 0.0f, 0.3f, 0.2f, 0.0f, -0.4f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, 0.0f, 0.2f, -0.2f, -0.4f, 0.2f, -0.2f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[2].addShapeBox(-4.3f, 0.6f, -2.0f, 1, 3, 4, 0.0f, 0.6f, 0.2f, -0.5f, -1.4f, 0.2f, -0.5f, -1.4f, 0.2f, -0.5f, 0.6f, 0.2f, -0.5f, 0.0f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, -0.5f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.rightArmModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[3].addShapeBox(-3.0f, 6.0f, -2.0f, 4, 2, 4, 0.0f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f);
        this.rightArmModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[4].addShapeBox(-3.0f, 8.0f, -2.0f, 4, 1, 4, 0.0f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f, 0.4f, -0.2f, 0.4f);
        this.rightArmModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
