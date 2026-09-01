// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelLittleboy extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] littleboyModel;
    
    public ModelLittleboy() {
        this.textureX = 128;
        this.textureY = 128;
        (this.littleboyModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.littleboyModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.littleboyModel[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.littleboyModel[3] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.littleboyModel[4] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
        this.littleboyModel[5] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
        this.littleboyModel[6] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
        this.littleboyModel[7] = new ModelRendererTurbo(this, 1, 41, this.textureX, this.textureY);
        this.littleboyModel[8] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
        this.littleboyModel[9] = new ModelRendererTurbo(this, 33, 41, this.textureX, this.textureY);
        this.littleboyModel[10] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.littleboyModel[11] = new ModelRendererTurbo(this, 41, 41, this.textureX, this.textureY);
        this.littleboyModel[12] = new ModelRendererTurbo(this, 97, 49, this.textureX, this.textureY);
        this.littleboyModel[13] = new ModelRendererTurbo(this, 57, 49, this.textureX, this.textureY);
        this.littleboyModel[14] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.littleboyModel[15] = new ModelRendererTurbo(this, 57, 41, this.textureX, this.textureY);
        this.littleboyModel[16] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.littleboyModel[17] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
        this.littleboyModel[18] = new ModelRendererTurbo(this, 81, 57, this.textureX, this.textureY);
        this.littleboyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 25, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[0].setRotationPoint(0.0f, -8.0f, 0.5f);
        this.littleboyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 25, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[1].setRotationPoint(5.0f, -8.0f, 0.5f);
        this.littleboyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 25, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.littleboyModel[2].setRotationPoint(-2.0f, -8.0f, 0.5f);
        this.littleboyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f);
        this.littleboyModel[3].setRotationPoint(-2.0f, 17.0f, 0.5f);
        this.littleboyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 2, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f);
        this.littleboyModel[4].setRotationPoint(0.0f, 17.0f, 0.5f);
        this.littleboyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f);
        this.littleboyModel[5].setRotationPoint(5.0f, 17.0f, 0.5f);
        this.littleboyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, 2.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[6].setRotationPoint(5.0f, -16.0f, 0.5f);
        this.littleboyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 9, 0.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[7].setRotationPoint(0.0f, -16.0f, 0.5f);
        this.littleboyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, -3.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.littleboyModel[8].setRotationPoint(-2.0f, -16.0f, 0.5f);
        this.littleboyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 3, 7, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[9].setRotationPoint(1.0f, -23.0f, 3.5f);
        this.littleboyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 12, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[10].setRotationPoint(-4.0f, -27.0f, 10.0f);
        this.littleboyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[11].setRotationPoint(-4.0f, -27.0f, -1.0f);
        this.littleboyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 12, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[12].setRotationPoint(-4.0f, -27.0f, -1.0f);
        this.littleboyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[13].setRotationPoint(7.0f, -27.0f, -1.0f);
        this.littleboyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 2, 7, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, 4.0f, 3.5f, 1.0f, 4.0f, -4.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.5f, -6.0f, 3.5f, 1.0f, -6.0f, -4.0f, -0.5f, 0.0f, 0.0f);
        this.littleboyModel[14].setRotationPoint(3.5f, -23.0f, 3.0f);
        this.littleboyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 7, 4, 0.0f, 3.5f, 4.0f, 0.5f, -4.0f, 4.0f, 1.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 3.5f, -6.0f, 0.5f, -4.0f, -6.0f, 1.0f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f);
        this.littleboyModel[15].setRotationPoint(0.5f, -23.0f, 0.0f);
        this.littleboyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 2, 7, 1, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 4.0f, -4.0f, 0.5f, 4.0f, 3.5f, 0.0f, 0.0f, -0.5f, -0.5f, 0.0f, 0.0f, 1.0f, -6.0f, -4.0f, 0.5f, -6.0f, 3.5f, 0.0f, 0.0f, -0.5f);
        this.littleboyModel[16].setRotationPoint(3.5f, -23.0f, 6.0f);
        this.littleboyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 1, 7, 4, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, 4.0f, 1.0f, 3.5f, 4.0f, 0.5f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -4.0f, -6.0f, 1.0f, 3.5f, -6.0f, 0.5f);
        this.littleboyModel[17].setRotationPoint(0.5f, -23.0f, 6.0f);
        this.littleboyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.littleboyModel[18].setRotationPoint(-3.0f, -27.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 19; ++i) {
            this.littleboyModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
