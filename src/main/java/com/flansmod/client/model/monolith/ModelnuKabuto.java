// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelnuKabuto extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelnuKabuto() {
        this.textureX = 128;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[30];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 41, 1, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 1, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 25, 17, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 49, 17, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 25, 25, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 49, 25, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 73, 25, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 17, 41, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 41, 41, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 65, 41, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 33, 1, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 81, 41, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 105, 1, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 121, 17, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(-4.0f, -8.0f, -4.0f, 8, 3, 8, 0.0f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.2f, 0.3f, 0.3f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f);
        this.headModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[1].addShapeBox(-4.0f, -9.8f, -4.0f, 8, 1, 8, 0.0f, -2.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, -2.0f, -0.5f, -1.0f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f, 0.2f, 0.5f, 0.3f);
        this.headModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[2].addShapeBox(-4.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.7f, -0.5f, 0.8f, 0.0f, -0.5f, 0.8f, 0.0f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f, 0.7f, -0.4f, 0.8f, 0.0f, -0.4f, 0.8f, 0.0f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f);
        this.headModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[3].addShapeBox(3.0f, -6.0f, -4.0f, 1, 2, 8, 0.0f, 0.0f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.0f, -0.5f, 0.7f, 0.0f, -0.4f, 0.8f, 0.7f, -0.4f, 0.8f, 0.7f, 0.0f, 0.7f, 0.0f, 0.0f, 0.7f);
        this.headModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[4].addShapeBox(-3.0f, -6.0f, -4.0f, 6, 2, 8, 0.0f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.8f, 0.7f, -0.5f, 0.7f, 0.7f, -0.5f, 0.7f, 0.7f, -0.4f, 0.8f, 0.7f, -0.4f, 0.8f, 0.7f, 0.0f, 0.7f, 0.7f, 0.0f, 0.7f);
        this.headModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[5].addShapeBox(-4.0f, -5.5f, 4.7f, 8, 2, 1, 0.0f, 0.9f, -0.2f, 0.0f, 0.9f, -0.2f, 0.0f, 0.9f, -0.2f, -0.6f, 0.9f, -0.2f, -0.6f, 0.9f, -0.2f, -0.3f, 0.9f, -0.2f, -0.3f, 0.9f, -0.2f, -0.3f, 0.9f, -0.2f, -0.3f);
        this.headModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[6].addShapeBox(-4.0f, -4.5f, 5.1f, 8, 2, 1, 0.0f, 1.3f, -0.2f, 0.0f, 1.3f, -0.2f, 0.0f, 1.3f, -0.2f, -0.6f, 1.3f, -0.2f, -0.6f, 1.3f, -0.2f, -0.3f, 1.3f, -0.2f, -0.3f, 1.3f, -0.2f, -0.3f, 1.3f, -0.2f, -0.3f);
        this.headModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[7].addShapeBox(-4.0f, -3.5f, 5.5f, 8, 2, 1, 0.0f, 1.7f, -0.2f, 0.0f, 1.7f, -0.2f, 0.0f, 1.7f, -0.2f, -0.6f, 1.7f, -0.2f, -0.6f, 1.7f, -0.2f, -0.3f, 1.7f, -0.2f, -0.3f, 1.7f, -0.2f, -0.3f, 1.7f, -0.2f, -0.3f);
        this.headModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[8].addShapeBox(-4.0f, -2.2f, 5.9f, 8, 2, 1, 0.0f, 2.1f, -0.2f, 0.0f, 2.1f, -0.2f, 0.0f, 2.1f, -0.2f, -0.6f, 2.1f, -0.2f, -0.6f, 2.1f, -0.2f, -0.3f, 2.1f, -0.2f, -0.3f, 2.1f, -0.2f, -0.3f, 2.1f, -0.2f, -0.3f);
        this.headModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[9].addShapeBox(-5.5f, -5.5f, -4.0f, 1, 2, 9, 0.0f, -0.6f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f);
        this.headModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[10].addShapeBox(-5.9f, -4.5f, -4.0f, 1, 2, 9, 0.0f, -0.6f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f, 0.0f, -0.2f, 0.4f, -0.6f, -0.2f, 0.4f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.4f, -0.3f, -0.2f, 0.4f);
        this.headModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[11].addShapeBox(-6.3f, -3.5f, -4.0f, 1, 2, 9, 0.0f, -0.6f, -0.2f, 0.3f, 0.0f, -0.2f, 0.3f, 0.0f, -0.2f, 0.8f, -0.6f, -0.2f, 0.8f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.8f, -0.3f, -0.2f, 0.8f);
        this.headModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[12].addShapeBox(-6.7f, -2.3f, -4.0f, 1, 2, 10, 0.0f, -0.6f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.0f, -0.6f, -0.2f, 0.0f, 0.0f, -0.2f, 0.1f, -0.6f, -0.2f, 0.1f, -0.6f, -0.2f, 0.5f, 0.0f, -0.2f, 0.5f);
        this.headModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[13].addShapeBox(4.5f, -5.5f, -4.0f, 1, 2, 9, 0.0f, 0.0f, -0.2f, 0.5f, -0.6f, -0.2f, 0.5f, -0.6f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.0f, -0.3f, -0.2f, 0.0f);
        this.headModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[14].addShapeBox(4.9f, -4.5f, -4.0f, 1, 2, 9, 0.0f, 0.0f, -0.2f, 0.5f, -0.6f, -0.2f, 0.5f, -0.6f, -0.2f, 0.4f, 0.0f, -0.2f, 0.4f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.5f, -0.3f, -0.2f, 0.4f, -0.3f, -0.2f, 0.4f);
        this.headModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[15].addShapeBox(5.3f, -3.5f, -4.0f, 1, 2, 9, 0.0f, 0.0f, -0.2f, 0.3f, -0.6f, -0.2f, 0.3f, -0.6f, -0.2f, 0.8f, 0.0f, -0.2f, 0.8f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.8f, -0.3f, -0.2f, 0.8f);
        this.headModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[16].addShapeBox(5.7f, -2.3f, -4.0f, 1, 2, 10, 0.0f, 0.0f, -0.2f, 0.1f, -0.6f, -0.2f, 0.1f, -0.6f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -0.6f, -0.2f, 0.1f, 0.0f, -0.2f, 0.1f, 0.0f, -0.2f, 0.5f, -0.6f, -0.2f, 0.5f);
        this.headModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[17].addShapeBox(-4.0f, -5.5f, -5.0f, 4, 1, 1, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 1.3f, 0.0f, 0.1f, 2.5f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f);
        this.headModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[18].addShapeBox(0.0f, -5.5f, -5.0f, 4, 1, 1, 0.0f, 0.0f, 0.2f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.1f, 2.5f, 0.5f, 0.0f, 1.3f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[19].addShapeBox(-4.0f, -4.5f, -3.0f, 8, 5, 1, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.1f, -0.3f, 0.5f, 0.1f, -0.3f, 0.5f, 0.1f, -0.3f, -1.0f, 0.1f, -0.3f, -1.0f);
        this.headModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[20].addShapeBox(-5.0f, -6.2f, -5.2f, 1, 2, 1, 0.0f, 0.3f, 0.0f, -0.3f, -0.2f, 0.3f, -0.3f, -0.2f, 0.3f, -0.3f, 0.3f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.headModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[21].addShapeBox(4.0f, -6.2f, -5.2f, 1, 2, 1, 0.0f, -0.2f, 0.3f, -0.3f, 0.3f, 0.0f, -0.3f, 0.3f, 0.0f, -0.3f, -0.2f, 0.3f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f);
        this.headModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[22].addShapeBox(-3.0f, -0.2f, -3.5f, 6, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.1f, 0.3f, -0.3f, 0.1f, 0.3f, -0.3f, 0.1f, 0.3f, -0.3f, 0.1f, 0.3f, -0.3f);
        this.headModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[23].addShapeBox(-3.0f, 0.8f, -3.7f, 6, 1, 1, 0.0f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.2f, 0.0f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f, 0.3f, 0.3f, -0.3f);
        this.headModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[24].addShapeBox(-3.0f, 1.8f, -3.9f, 3, 1, 1, 0.0f, 0.4f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.4f, 0.0f, -0.3f, 0.5f, 0.3f, -0.3f, 0.0f, 0.6f, -0.3f, 0.0f, 0.6f, -0.3f, 0.5f, 0.3f, -0.3f);
        this.headModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[25].addShapeBox(0.0f, 1.8f, -3.9f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.4f, 0.0f, -0.3f, 0.4f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.6f, -0.3f, 0.5f, 0.3f, -0.3f, 0.5f, 0.3f, -0.3f, 0.0f, 0.6f, -0.3f);
        this.headModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[26].addShapeBox(-2.0f, -6.5f, -6.0f, 2, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.3f, 0.0f, -0.8f, 0.0f, 0.0f);
        this.headModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[27].addShapeBox(-2.0f, -10.5f, -6.0f, 2, 4, 1, 0.0f, 0.5f, 0.0f, -1.0f, -2.0f, 0.0f, -1.0f, -2.0f, 0.0f, 1.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[28].addShapeBox(0.0f, -10.5f, -6.0f, 2, 4, 1, 0.0f, -2.0f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.headModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.headModel[29].addShapeBox(0.0f, -6.5f, -6.0f, 2, 1, 1, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.4f, 0.0f, -0.8f, 0.0f, 0.0f, -0.8f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f);
        this.headModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
