// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.NewArmor;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelCustomArmour;

public class ModelHamasBody extends ModelCustomArmour
{
    int textureX;
    int textureY;
    
    public ModelHamasBody() {
        this.textureX = 256;
        this.textureY = 128;
        (this.bodyModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 121, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 81, 25, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 129, 25, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 9, 33, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 193, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 249, 1, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 225, 9, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 97, 17, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-4.0f, -0.1f, -2.0f, 4, 2, 4, 0.0f, 0.0f, 0.0f, 0.1f, -1.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-4.0f, 1.9f, -2.0f, 8, 9, 4, 0.0f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.5f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f);
        this.bodyModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, -0.1f, -2.0f, 4, 2, 4, 0.0f, -1.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, 0.0f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f, 0.0f, -0.5f, 0.1f);
        this.bodyModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[3].addBox(0.65f, 2.5f, -2.3f, 3, 1, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[4].addBox(-3.65f, 2.5f, -2.3f, 3, 1, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[5].addBox(-3.65f, 3.5f, -2.25f, 3, 2, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[6].addBox(0.65f, 3.5f, -2.25f, 3, 2, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[7].addShapeBox(-0.5f, 1.0f, -2.15f, 1, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-0.5f, 5.0f, -2.15f, 1, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.1f, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-1.1f, 0.0f, -2.05f, 10, 14, 7, 0.0f, 0.0f, 0.1f, 0.0f, -7.8f, 0.1f, 0.0f, -7.8f, 0.1f, -4.0f, 0.0f, 0.1f, -4.0f, 0.0f, -12.0f, 0.0f, -7.8f, -12.0f, 0.0f, -7.8f, -12.0f, -4.0f, 0.0f, -12.0f, -4.0f);
        this.bodyModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-0.5f, -0.1f, -2.15f, 2, 2, 1, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[11].addShapeBox(-1.5f, -0.1f, -2.15f, 2, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -1.0f, -0.5f, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[12].addShapeBox(-3.0f, -0.3f, -2.0f, 1, 1, 4, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[13].addShapeBox(2.0f, -0.3f, -2.0f, 1, 1, 4, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftArmModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.leftArmModel[1] = new ModelRendererTurbo((ModelBase)this, 97, 1, this.textureX, this.textureY);
        this.leftArmModel[0].addShapeBox(-1.05f, -2.0f, -2.1f, 8, 22, 8, 0.0f, 0.0f, 0.1f, 0.0f, -3.8f, 0.1f, 0.0f, -3.8f, 0.1f, -3.8f, 0.0f, 0.1f, -3.8f, 0.0f, -12.0f, 0.0f, -3.8f, -12.0f, 0.0f, -3.8f, -12.0f, -3.8f, 0.0f, -12.0f, -3.8f);
        this.leftArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftArmModel[1].addShapeBox(-0.95f, 6.5f, -2.0f, 4, 2, 4, 0.0f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.leftArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightArmModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.rightArmModel[1] = new ModelRendererTurbo((ModelBase)this, 73, 1, this.textureX, this.textureY);
        this.rightArmModel[0].addShapeBox(-3.1f, -2.0f, -2.1f, 8, 22, 8, 0.0f, 0.0f, 0.1f, 0.0f, -3.8f, 0.1f, 0.0f, -3.8f, 0.1f, -3.8f, 0.0f, 0.1f, -3.8f, 0.0f, -12.0f, 0.0f, -3.8f, -12.0f, 0.0f, -3.8f, -12.0f, -3.8f, 0.0f, -12.0f, -3.8f);
        this.rightArmModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightArmModel[1].addShapeBox(-3.0f, 6.5f, -2.0f, 4, 2, 4, 0.0f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, 0.0f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f, 0.15f, -0.5f, 0.15f);
        this.rightArmModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.leftLegModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 49, 33, this.textureX, this.textureY);
        this.leftLegModel[1] = new ModelRendererTurbo((ModelBase)this, 153, 33, this.textureX, this.textureY);
        this.leftLegModel[2] = new ModelRendererTurbo((ModelBase)this, 81, 33, this.textureX, this.textureY);
        this.leftLegModel[3] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.leftLegModel[0].addShapeBox(-2.1f, -1.0f, -2.1f, 8, 20, 8, 0.0f, 0.0f, 0.1f, 0.0f, -3.8f, 0.1f, 0.0f, -3.8f, 0.1f, -3.8f, 0.0f, 0.1f, -3.8f, 0.0f, -12.0f, 0.0f, -3.8f, -12.0f, 0.0f, -3.8f, -12.0f, -3.8f, 0.0f, -12.0f, -3.8f);
        this.leftLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[1].addShapeBox(-2.0f, 6.0f, -2.3f, 4, 6, 5, 0.0f, 0.125f, -0.55f, 0.0f, 0.125f, -0.55f, 0.0f, 0.125f, -0.55f, -0.475f, 0.125f, -0.55f, -0.475f, 0.125f, 0.05f, 0.0f, 0.125f, 0.05f, 0.0f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.leftLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[2].addShapeBox(-2.0f, 9.0f, -3.82f, 4, 3, 2, 0.0f, -0.275f, -0.8f, -0.75f, -0.275f, -0.8f, -0.75f, 0.125f, -0.8f, -0.475f, 0.125f, -0.8f, -0.475f, -0.275f, 0.05f, -0.75f, -0.275f, 0.05f, -0.75f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.leftLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.leftLegModel[3].addShapeBox(-2.0f, 7.8f, -3.82f, 4, 2, 2, 0.0f, -0.775f, -1.6f, -1.15f, -0.775f, -1.6f, -1.15f, -0.175f, -1.6f, -0.225f, -0.175f, -1.6f, -0.225f, -0.275f, 0.05f, -0.75f, -0.275f, 0.05f, -0.75f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.leftLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        (this.rightLegModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.rightLegModel[1] = new ModelRendererTurbo((ModelBase)this, 129, 33, this.textureX, this.textureY);
        this.rightLegModel[2] = new ModelRendererTurbo((ModelBase)this, 41, 33, this.textureX, this.textureY);
        this.rightLegModel[3] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.rightLegModel[0].addShapeBox(-2.1f, -1.0f, -2.1f, 8, 20, 8, 0.0f, 0.0f, 0.1f, 0.0f, -3.8f, 0.1f, 0.0f, -3.8f, 0.1f, -3.8f, 0.0f, 0.1f, -3.8f, 0.0f, -12.0f, 0.0f, -3.8f, -12.0f, 0.0f, -3.8f, -12.0f, -3.8f, 0.0f, -12.0f, -3.8f);
        this.rightLegModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[1].addShapeBox(-2.0f, 6.0f, -2.3f, 4, 6, 5, 0.0f, 0.125f, -0.55f, 0.0f, 0.125f, -0.55f, 0.0f, 0.125f, -0.55f, -0.475f, 0.125f, -0.55f, -0.475f, 0.125f, 0.05f, 0.0f, 0.125f, 0.05f, 0.0f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.rightLegModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[2].addShapeBox(-2.0f, 9.0f, -3.82f, 4, 3, 2, 0.0f, -0.275f, -0.8f, -0.75f, -0.275f, -0.8f, -0.75f, 0.125f, -0.8f, -0.475f, 0.125f, -0.8f, -0.475f, -0.275f, 0.05f, -0.75f, -0.275f, 0.05f, -0.75f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.rightLegModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.rightLegModel[3].addShapeBox(-2.0f, 7.8f, -3.82f, 4, 2, 2, 0.0f, -0.775f, -1.6f, -1.15f, -0.775f, -1.6f, -1.15f, -0.175f, -1.6f, -0.225f, -0.175f, -1.6f, -0.225f, -0.275f, 0.05f, -0.75f, -0.275f, 0.05f, -0.75f, 0.125f, 0.05f, -0.475f, 0.125f, 0.05f, -0.475f);
        this.rightLegModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
}
