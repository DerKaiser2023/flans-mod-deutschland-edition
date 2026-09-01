// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelChapelFer extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelChapelFer() {
        this.textureX = 64;
        this.textureY = 64;
        this.headModel = new ModelRendererTurbo[30];
        this.initheadModel_1();
    }
    
    private void initheadModel_1() {
        this.headModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[26] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[28] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[29] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.headModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 8, 0.0f, 0.25f, 0.0f, 0.25f, 0.0f, 0.0f, 0.5f, 0.0f, 0.25f, 0.5f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.25f, 0.0f, 0.25f);
        this.headModel[0].setRotationPoint(-4.0f, -8.0f, -4.0f);
        this.headModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, 0.5f, 0.0f, -0.25f, 0.25f, 0.25f, 0.0f, 0.0f, 0.0f, -0.25f, 0.25f, 0.0f, -0.25f, 0.75f, 0.25f, 0.0f, 0.5f);
        this.headModel[1].setRotationPoint(-4.0f, -9.0f, -4.25f);
        this.headModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, -0.75f, -0.5f, -1.0f, 0.0f, 0.25f, -0.75f, 0.0f, 0.25f, -0.25f, -0.75f, -0.5f, -0.5f, 0.0f, 0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.5f, 0.0f, 0.25f, 0.25f);
        this.headModel[2].setRotationPoint(-4.0f, -10.0f, -4.25f);
        this.headModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, -1.25f, -1.0f, -2.25f, 0.0f, -0.25f, -2.0f, 0.0f, -0.25f, -1.5f, -1.25f, -1.0f, -1.5f, -0.75f, 0.5f, -1.0f, 0.0f, -0.25f, -0.75f, 0.0f, -0.25f, -0.25f, -0.75f, 0.5f, -0.5f);
        this.headModel[3].setRotationPoint(-4.0f, -11.0f, -4.25f);
        this.headModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, -0.25f, -0.25f, 0.0f, -0.25f, 0.25f, 0.0f, 0.25f, 0.5f, 0.0f, -0.25f, 0.25f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.5f, 0.0f, -0.25f, 0.75f);
        this.headModel[4].setRotationPoint(0.0f, -9.0f, -4.25f);
        this.headModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, 0.25f, -0.75f, -0.75f, -0.5f, -1.0f, -0.75f, -0.5f, -0.5f, 0.0f, 0.25f, -0.25f, 0.0f, -0.25f, 0.0f, 0.0f, 0.25f, -0.25f, 0.0f, 0.25f, 0.25f, 0.0f, -0.25f, 0.5f);
        this.headModel[5].setRotationPoint(0.0f, -10.0f, -4.25f);
        this.headModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, -0.25f, -2.0f, -1.25f, -1.0f, -2.25f, -1.25f, -1.0f, -1.5f, 0.0f, -0.25f, -1.5f, 0.0f, -0.25f, -0.75f, -0.75f, 0.5f, -1.0f, -0.75f, 0.5f, -0.5f, 0.0f, -0.25f, -0.25f);
        this.headModel[6].setRotationPoint(0.0f, -11.0f, -4.25f);
        this.headModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, 0.0f, -0.25f, -3.75f, -1.75f, -1.0f, -4.0f, -1.75f, -1.0f, -3.0f, 0.0f, -0.25f, -3.0f, 0.0f, -0.25f, -2.0f, -1.25f, 0.5f, -2.25f, -1.25f, 0.5f, -1.5f, 0.0f, -0.25f, -1.5f);
        this.headModel[7].setRotationPoint(0.0f, -11.5f, -4.25f);
        this.headModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 8, 0.0f, -1.75f, -1.0f, -4.0f, 0.0f, -0.25f, -3.75f, 0.0f, -0.25f, -3.0f, -1.75f, -1.0f, -3.0f, -1.25f, 0.5f, -2.25f, 0.0f, -0.25f, -2.0f, 0.0f, -0.25f, -1.5f, -1.25f, 0.5f, -1.5f);
        this.headModel[8].setRotationPoint(-4.0f, -11.5f, -4.25f);
        this.headModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.25f, -1.0f, 3.25f, 0.5f, -0.75f, 3.25f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, -0.25f, -0.5f, 3.25f, -1.0f, 0.0f, 3.25f, -0.75f, 0.25f, 0.0f, 0.0f, 0.0f);
        this.headModel[9].setRotationPoint(-4.25f, -7.75f, -5.25f);
        this.headModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.5f, -2.5f, -1.5f, 0.0f, -2.0f, -0.5f, 0.0f, -0.5f, -0.5f, 1.25f, -2.75f, 0.0f, 0.5f, 1.75f, -1.5f, 0.0f, 1.25f, -0.5f, 0.0f, 0.0f, 0.0f, 1.25f, 2.0f, 0.0f);
        this.headModel[10].setRotationPoint(-5.25f, -4.75f, -7.25f);
        this.headModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 1.0f, -3.25f, -1.0f, 0.25f, -2.25f, 0.0f, 0.25f, -0.75f, -0.25f, 1.0f, -1.75f, 0.0f, 1.0f, 2.5f, -1.0f, 0.25f, 1.5f, 0.0f, 0.25f, 0.25f, 0.0f, 1.0f, 1.25f, 0.0f);
        this.headModel[11].setRotationPoint(-3.25f, -6.0f, -7.75f);
        this.headModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 8, 0.0f, 0.0f, 0.0f, 0.5f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.0f, 0.25f, 0.5f, 0.0f, -0.5f, 0.0f, 0.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 0.0f, 0.0f, 1.0f);
        this.headModel[12].setRotationPoint(0.0f, -8.0f, -4.0f);
        this.headModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 3.25f, 0.5f, -0.75f, 0.0f, 0.25f, -1.0f, 0.0f, 0.25f, 0.0f, 3.25f, 0.25f, 0.0f, 3.25f, -1.0f, 0.0f, 0.0f, -0.25f, -0.5f, 0.0f, 0.0f, 0.0f, 3.25f, -0.75f, 0.25f);
        this.headModel[13].setRotationPoint(3.25f, -7.75f, -5.25f);
        this.headModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.25f, -2.25f, 0.0f, 1.0f, -3.25f, -1.0f, 1.0f, -1.75f, 0.0f, 0.25f, -0.75f, -0.25f, 0.25f, 1.5f, 0.0f, 1.0f, 2.5f, -1.0f, 1.0f, 1.25f, 0.0f, 0.25f, 0.25f, 0.0f);
        this.headModel[14].setRotationPoint(0.25f, -6.0f, -7.75f);
        this.headModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, -2.0f, -0.5f, 0.5f, -2.5f, -1.5f, 1.25f, -2.75f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 1.25f, -0.5f, 0.5f, 1.75f, -1.5f, 1.25f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[15].setRotationPoint(4.25f, -4.75f, -7.25f);
        this.headModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, -0.5f, 0.5f, 1.25f, -2.75f, 0.0f, 1.75f, -3.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.0f, 1.25f, 2.0f, 0.0f, 1.75f, 2.25f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[16].setRotationPoint(4.25f, -4.75f, -4.25f);
        this.headModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 0.0f, -0.75f, 0.5f, 1.75f, -3.0f, 0.5f, 1.75f, -3.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, 0.0f, 0.5f, 1.75f, 2.25f, 0.5f, 1.75f, 2.25f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[17].setRotationPoint(4.25f, -4.75f, -0.75f);
        this.headModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, -0.75f, 0.0f, 1.75f, -3.0f, 0.0f, 1.25f, -3.0f, 0.0f, 0.0f, -0.75f, 0.5f, 0.0f, 0.0f, 0.0f, 1.75f, 2.25f, 0.0f, 1.25f, 2.25f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.headModel[18].setRotationPoint(4.25f, -4.75f, 1.25f);
        this.headModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 0.0f, 0.25f, 0.0f, 3.25f, 0.25f, 0.0f, 3.25f, 0.5f, -0.75f, 0.0f, 0.25f, -1.0f, 0.0f, 0.0f, 0.0f, 3.25f, -0.75f, 0.25f, 3.25f, -1.0f, 0.0f, 0.0f, -0.25f, -0.5f);
        this.headModel[19].setRotationPoint(-4.25f, -7.75f, 4.25f);
        this.headModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 1, 0.0f, 3.25f, 0.25f, 0.0f, 0.0f, 0.25f, 0.0f, 0.0f, 0.25f, -1.0f, 3.25f, 0.5f, -0.75f, 3.25f, -0.75f, 0.25f, 0.0f, 0.0f, 0.0f, 0.0f, -0.25f, -0.5f, 3.25f, -1.0f, 0.0f);
        this.headModel[20].setRotationPoint(3.25f, -7.75f, 4.25f);
        this.headModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.25f, -0.75f, -0.25f, 1.0f, -1.75f, 0.0f, 1.0f, -4.0f, -0.5f, 0.25f, -4.0f, 0.5f, 0.25f, 0.25f, 0.0f, 1.0f, 1.25f, 0.0f, 1.0f, 3.25f, -0.5f, 0.25f, 3.25f, 0.5f);
        this.headModel[21].setRotationPoint(0.25f, -5.75f, 4.75f);
        this.headModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, -0.75f, -0.5f, 1.25f, -3.0f, 0.0f, 0.5f, -3.0f, -1.5f, -1.5f, -3.0f, -1.5f, 0.0f, 0.0f, 0.0f, 1.25f, 2.25f, 0.0f, 0.5f, 2.25f, -1.5f, -1.5f, 2.25f, -1.5f);
        this.headModel[22].setRotationPoint(4.25f, -4.75f, 4.25f);
        this.headModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, -0.75f, -0.5f, -1.5f, -3.0f, -1.5f, -1.5f, -3.0f, 0.5f, 0.0f, -3.0f, 2.0f, 0.0f, 0.0f, 0.0f, -1.5f, 2.25f, -1.5f, -1.5f, 2.25f, 0.5f, 0.0f, 2.25f, 2.0f);
        this.headModel[23].setRotationPoint(4.25f, -4.75f, 4.25f);
        this.headModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 1.25f, -2.75f, 0.0f, 0.0f, -0.5f, 0.5f, 0.0f, -0.75f, 0.0f, 1.75f, -3.0f, 0.0f, 1.25f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.75f, 2.25f, 0.0f);
        this.headModel[24].setRotationPoint(-5.25f, -4.75f, -4.25f);
        this.headModel[25].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 2, 0.0f, 1.75f, -3.0f, 0.5f, 0.0f, -0.75f, 0.5f, 0.0f, -0.75f, 0.0f, 1.75f, -3.0f, 0.0f, 1.75f, 2.25f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 1.75f, 2.25f, 0.0f);
        this.headModel[25].setRotationPoint(-5.25f, -4.75f, -0.75f);
        this.headModel[26].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 1.75f, -3.0f, 0.0f, 0.0f, -0.75f, 0.0f, 0.0f, -0.75f, 0.5f, 1.25f, -3.0f, 0.0f, 1.75f, 2.25f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.25f, 2.25f, 0.0f);
        this.headModel[26].setRotationPoint(-5.25f, -4.75f, 1.25f);
        this.headModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, -1.5f, -3.0f, -1.5f, 0.0f, -0.75f, -0.5f, 0.0f, -3.0f, 2.0f, -1.5f, -3.0f, 0.5f, -1.5f, 2.25f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 2.25f, 2.0f, -1.5f, 2.25f, 0.5f);
        this.headModel[27].setRotationPoint(-7.25f, -4.75f, 4.25f);
        this.headModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 1.25f, -3.0f, 0.0f, 0.0f, -0.75f, -0.5f, -1.5f, -3.0f, -1.5f, 0.5f, -3.0f, -1.5f, 1.25f, 2.25f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 2.25f, -1.5f, 0.5f, 2.25f, -1.5f);
        this.headModel[28].setRotationPoint(-5.25f, -4.75f, 4.25f);
        this.headModel[29].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 1.0f, -1.75f, 0.0f, 0.25f, -0.75f, -0.25f, 0.25f, -4.0f, 0.5f, 1.0f, -4.0f, -0.5f, 1.0f, 1.25f, 0.0f, 0.25f, 0.25f, 0.0f, 0.25f, 3.25f, 0.5f, 1.0f, 3.25f, -0.5f);
        this.headModel[29].setRotationPoint(-3.25f, -5.75f, 4.75f);
    }
}
