// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelArabNasal extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelArabNasal() {
        this.textureX = 128;
        this.textureY = 128;
        this.headModel = new ModelRendererTurbo[46];
        this.bodyModel = new ModelRendererTurbo[2];
        this.initheadModel_1();
        this.initbodyModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 33, 41, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 57, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 33, 57, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 49, 1, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 113, 1, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 121, 9, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 41, 17, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 121, 25, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 73, 41, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 89, 41, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 121, 41, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.headModel[30] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.headModel[31] = new ModelRendererTurbo((ModelBase)this, 25, 49, this.textureX, this.textureY);
        this.headModel[32] = new ModelRendererTurbo((ModelBase)this, 57, 57, this.textureX, this.textureY);
        this.headModel[33] = new ModelRendererTurbo((ModelBase)this, 65, 57, this.textureX, this.textureY);
        this.headModel[34] = new ModelRendererTurbo((ModelBase)this, 73, 57, this.textureX, this.textureY);
        this.headModel[35] = new ModelRendererTurbo((ModelBase)this, 81, 57, this.textureX, this.textureY);
        this.headModel[36] = new ModelRendererTurbo((ModelBase)this, 89, 57, this.textureX, this.textureY);
        this.headModel[37] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.headModel[38] = new ModelRendererTurbo((ModelBase)this, 105, 57, this.textureX, this.textureY);
        this.headModel[39] = new ModelRendererTurbo((ModelBase)this, 1, 65, this.textureX, this.textureY);
        this.headModel[40] = new ModelRendererTurbo((ModelBase)this, 41, 65, this.textureX, this.textureY);
        this.headModel[41] = new ModelRendererTurbo((ModelBase)this, 9, 65, this.textureX, this.textureY);
        this.headModel[42] = new ModelRendererTurbo((ModelBase)this, 49, 65, this.textureX, this.textureY);
        this.headModel[43] = new ModelRendererTurbo((ModelBase)this, 81, 65, this.textureX, this.textureY);
        this.headModel[44] = new ModelRendererTurbo((ModelBase)this, 1, 73, this.textureX, this.textureY);
        this.headModel[45] = new ModelRendererTurbo((ModelBase)this, 25, 81, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -1.0f, -4.0f, 16, 5, 4, 0.0f, 0.1f, -0.2f, 0.1f, -7.9f, -0.2f, 0.1f, -7.9f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -3.9f, 0.1f, -7.9f, -3.9f, 0.1f, -7.9f, -1.9f, 0.1f, 0.1f, -1.9f, 0.1f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -5.0f, -3.0f, 16, 10, 7, 0.0f, 0.1f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -5.7f, 1.1f, -7.9f, -5.7f, 1.1f, -7.9f, -5.9f, 0.1f, 0.1f, -5.9f, 0.1f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -1.0f, 0.0f, 16, 5, 4, 0.0f, 0.1f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, -7.9f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, -1.9f, 0.1f, -7.9f, -1.9f, 0.1f, -7.9f, -3.9f, 0.1f, 0.1f, -3.9f, 0.1f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.0f, 1.3f, -0.2f, 0.0f, 1.3f, -0.2f, 0.0f, 0.8f, 0.7f, 0.0f, 0.8f, 0.7f, 0.8f, -0.5f, 0.7f, 0.8f, -0.5f, 0.7f, 0.8f, -0.5f, 1.2f, 0.8f, -0.5f, 1.2f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-4.0f, -10.8f, -4.0f, 8, 1, 8, 0.0f, -2.0f, 0.0f, -2.5f, -2.0f, 0.0f, -2.5f, -2.0f, -0.3f, -0.8f, -2.0f, -0.3f, -0.8f, 0.0f, 0.5f, -0.2f, 0.0f, 0.5f, -0.2f, 0.0f, 1.0f, 0.7f, 0.0f, 1.0f, 0.7f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 1.0f, 0.2f, 0.8f, 0.0f, 0.2f, 0.8f, 0.0f, -0.3f, 1.4f, 1.0f, -0.3f, 1.4f, 1.0f, -0.5f, 1.0f, 0.0f, -0.5f, 1.0f, 0.0f, 0.0f, 1.2f, 1.0f, 0.0f, 1.2f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(3.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.0f, 0.2f, 0.8f, 1.0f, 0.2f, 0.8f, 1.0f, -0.3f, 1.4f, 0.0f, -0.3f, 1.4f, 0.0f, -0.5f, 1.0f, 1.0f, -0.5f, 1.0f, 1.0f, 0.0f, 1.2f, 0.0f, 0.0f, 1.2f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-3.0f, -6.0f, -4.0f, 6, 2, 8, 0.0f, 1.0f, 0.2f, 0.8f, 1.0f, 0.2f, 0.8f, 1.0f, -0.3f, 1.4f, 1.0f, -0.3f, 1.4f, 1.0f, -0.5f, 1.0f, 1.0f, -0.5f, 1.0f, 1.0f, 0.0f, 1.2f, 1.0f, 0.0f, 1.2f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-1.5f, -10.8f, -4.0f, 3, 1, 8, 0.0f, -0.3f, 0.3f, -2.4f, -0.3f, 0.3f, -2.4f, -0.3f, 0.0f, -0.6f, -0.3f, 0.0f, -0.6f, -0.3f, 0.5f, 0.1f, -0.3f, 0.5f, 0.1f, -0.3f, 1.0f, 1.0f, -0.3f, 1.0f, 1.0f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-1.5f, -8.0f, -4.0f, 3, 3, 8, 0.0f, -0.3f, 1.3f, 0.1f, -0.3f, 1.3f, 0.1f, -0.3f, 0.8f, 1.0f, -0.3f, 0.8f, 1.0f, -0.3f, -1.0f, 0.8f, -0.3f, -1.0f, 0.8f, -0.3f, -0.5f, 1.5f, -0.3f, -0.5f, 1.5f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-4.0f, -10.8f, -0.6f, 8, 1, 3, 0.0f, -1.8f, 0.15f, 0.0f, -1.8f, 0.15f, -0.2f, -1.8f, 0.0f, -0.2f, -1.8f, 0.0f, 0.0f, 0.2f, 0.7f, 0.4f, 0.2f, 0.7f, 0.1f, 0.2f, 0.9f, -0.5f, 0.2f, 0.9f, -0.3f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-4.0f, -8.2f, -0.9f, 8, 1, 3, 0.0f, 0.2f, 0.9f, 0.1f, 0.2f, 0.9f, -0.1f, 0.2f, 0.7f, -0.2f, 0.2f, 0.7f, 0.0f, 0.9f, 1.4f, 0.2f, 0.9f, 1.4f, 0.2f, 0.9f, 1.6f, -0.1f, 0.9f, 1.6f, -0.1f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-0.5f, -6.0f, -4.5f, 1, 4, 1, 0.0f, 0.4f, 0.0f, 0.4f, -0.5f, 0.0f, 0.6f, -0.5f, 0.0f, -0.7f, 0.4f, 0.0f, -0.7f, 0.7f, 0.5f, 0.2f, -0.5f, 0.7f, 1.0f, -0.5f, 0.7f, -1.1f, 0.7f, 0.5f, -1.1f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(0.3f, -7.5f, -4.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(-1.3f, -7.5f, -4.7f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(0.3f, -9.5f, -4.4f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(-1.3f, -9.5f, -4.4f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(0.3f, -11.2f, -2.6f, 1, 1, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(-1.3f, -11.2f, -2.6f, 1, 1, 1, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-1.3f, -9.0f, 4.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(0.3f, -9.0f, 4.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(-1.3f, -7.0f, 4.55f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(0.3f, -7.0f, 4.55f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-1.3f, -10.7f, 3.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(0.3f, -10.7f, 3.3f, 1, 1, 1, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(-1.0f, -6.0f, -4.5f, 2, 1, 1, 0.0f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, 0.4f, 0.3f, 0.0f, -0.7f, 0.3f, 0.0f, -0.7f, 0.3f, 0.4f, 0.6f, 0.3f, 0.4f, 0.6f, 0.3f, 0.4f, -0.9f, 0.3f, 0.4f, -0.9f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(3.9f, -7.1f, -1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(3.9f, -6.9f, 1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(3.4f, -9.1f, -1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(3.4f, -8.9f, 1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[30].addShapeBox(2.0f, -11.0f, -0.6f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[31].addShapeBox(2.0f, -10.9f, 1.2f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, -0.3f, -0.4f, -0.3f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[32].addShapeBox(-3.0f, -11.0f, -0.6f, 1, 1, 1, 0.0f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[32].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[33].addShapeBox(-3.0f, -10.9f, 1.2f, 1, 1, 1, 0.0f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, -0.3f, -0.4f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[34].addShapeBox(-4.4f, -9.1f, -1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[35].addShapeBox(-4.4f, -8.9f, 1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[36].addShapeBox(-4.9f, -7.1f, -1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[37].addShapeBox(-4.9f, -6.9f, 1.0f, 1, 1, 1, 0.0f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f);
        this.headModel[37].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[38].addShapeBox(-5.0f, -5.0f, -1.0f, 10, 5, 1, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 2.0f, -0.7f, 0.4f, 2.7f, -0.7f, 0.4f, 2.7f, -0.7f, 0.8f, -3.0f, -0.7f, 0.8f, -3.0f);
        this.headModel[38].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[39].addShapeBox(-0.5f, -6.0f, -4.5f, 1, 4, 1, 0.0f, -0.5f, 0.0f, 0.6f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, -0.7f, -0.5f, 0.0f, -0.7f, -0.5f, 0.7f, 1.0f, 0.7f, 0.5f, 0.2f, 0.7f, 0.5f, -1.1f, -0.5f, 0.7f, -1.1f);
        this.headModel[39].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[40].addShapeBox(-1.5f, -11.2f, -0.65f, 3, 1, 3, 0.0f, -0.5f, 0.2f, -0.5f, -0.5f, 0.2f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.headModel[40].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[41].addShapeBox(-0.5f, -11.6f, 0.35f, 1, 1, 1, 0.0f, -0.1f, 0.05f, -0.1f, -0.1f, 0.05f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f);
        this.headModel[41].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[42].addShapeBox(-5.0f, -5.0f, -4.5f, 4, 1, 9, 0.0f, 0.95f, 0.5f, 1.0f, 0.95f, 0.5f, 1.0f, 0.95f, -0.3f, 1.5f, 0.95f, -0.3f, 1.5f, 0.4f, -0.3f, 0.6f, 0.95f, -0.7f, 0.8f, 0.95f, 0.0f, 0.8f, -0.05f, 1.0f, 0.3f);
        this.headModel[42].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[43].addShapeBox(0.8f, -5.0f, -4.5f, 4, 1, 9, 0.0f, 0.95f, 0.5f, 1.0f, 0.95f, 0.5f, 1.0f, 0.95f, -0.3f, 1.4f, 0.95f, -0.3f, 1.4f, 0.95f, -0.7f, 0.8f, 0.4f, -0.3f, 0.6f, -0.05f, 1.0f, 0.3f, 0.95f, 0.0f, 0.8f);
        this.headModel[43].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[44].addShapeBox(-5.0f, -6.0f, -4.5f, 4, 1, 9, 0.0f, -0.05f, 1.0f, 0.5f, 0.7f, 0.8f, 0.5f, 1.2f, 0.7f, 1.2f, -0.05f, 0.5f, 1.2f, 0.95f, -0.5f, 0.9f, 2.95f, -0.5f, 0.9f, 2.95f, 0.3f, 1.5f, 0.95f, 0.3f, 1.5f);
        this.headModel[44].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[45].addShapeBox(1.0f, -6.0f, -4.5f, 4, 1, 9, 0.0f, 0.7f, 0.8f, 0.5f, -0.05f, 1.0f, 0.5f, -0.05f, 0.5f, 1.2f, 1.2f, 0.7f, 1.2f, 2.95f, -0.5f, 1.0f, 0.75f, -0.5f, 1.0f, 0.75f, 0.3f, 1.4f, 2.95f, 0.3f, 1.4f);
        this.headModel[45].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-0.5f, -0.4f, -2.0f, 15, 6, 4, 0.0f, -0.3f, 0.0f, 0.5f, -9.7f, -0.2f, 0.5f, -9.7f, -0.2f, 0.5f, -0.3f, 0.0f, 0.5f, -0.4f, -2.0f, 0.7f, -10.4f, -4.0f, 0.5f, -10.4f, -4.0f, 0.5f, -0.4f, -2.0f, 0.7f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.8f, -0.4f, -2.0f, 15, 6, 4, 0.0f, 0.0f, -0.2f, 0.5f, -10.3f, 0.0f, 0.5f, -10.3f, 0.0f, 0.5f, 0.0f, -0.2f, 0.5f, -0.8f, -4.0f, 0.5f, -10.3f, -2.0f, 0.7f, -10.3f, -2.0f, 0.7f, -0.8f, -4.0f, 0.5f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
