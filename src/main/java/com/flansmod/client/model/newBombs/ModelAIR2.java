// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelAIR2 extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] air2Model;
    
    public ModelAIR2() {
        this.textureX = 512;
        this.textureY = 512;
        (this.air2Model = new ModelRendererTurbo[25])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.air2Model[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.air2Model[2] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.air2Model[3] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.air2Model[4] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.air2Model[5] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
        this.air2Model[6] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.air2Model[7] = new ModelRendererTurbo(this, 281, 1, this.textureX, this.textureY);
        this.air2Model[8] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        this.air2Model[9] = new ModelRendererTurbo(this, 361, 1, this.textureX, this.textureY);
        this.air2Model[10] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.air2Model[11] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.air2Model[12] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.air2Model[13] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.air2Model[14] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
        this.air2Model[15] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.air2Model[16] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.air2Model[17] = new ModelRendererTurbo(this, 409, 1, this.textureX, this.textureY);
        this.air2Model[18] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.air2Model[19] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.air2Model[20] = new ModelRendererTurbo(this, 113, 1, this.textureX, this.textureY);
        this.air2Model[21] = new ModelRendererTurbo(this, 433, 1, this.textureX, this.textureY);
        this.air2Model[22] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.air2Model[23] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.air2Model[24] = new ModelRendererTurbo(this, 153, 1, this.textureX, this.textureY);
        this.air2Model[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 37, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[0].setRotationPoint(-2.0f, -27.0f, -6.0f);
        this.air2Model[1].addShapeBox(0.0f, 0.0f, 0.0f, 4, 37, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[1].setRotationPoint(2.0f, -27.0f, -6.0f);
        this.air2Model[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 37, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.air2Model[2].setRotationPoint(-6.0f, -27.0f, -6.0f);
        this.air2Model[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 12, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -5.0f, 0.0f, -5.0f, 1.0f, 0.0f, -5.0f, 1.0f, 0.0f, -5.0f, -5.0f, 0.0f, -5.0f);
        this.air2Model[3].setRotationPoint(-6.0f, 10.0f, -6.0f);
        this.air2Model[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 12, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -5.0f, -1.0f, 0.0f, -5.0f, -1.0f, 0.0f, -5.0f, -1.0f, 0.0f, -5.0f);
        this.air2Model[4].setRotationPoint(-2.0f, 10.0f, -6.0f);
        this.air2Model[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 12, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -5.0f, -5.0f, 0.0f, -5.0f, -5.0f, 0.0f, -5.0f, 1.0f, 0.0f, -5.0f);
        this.air2Model[5].setRotationPoint(2.0f, 10.0f, -6.0f);
        this.air2Model[6].addShapeBox(0.0f, 0.0f, 0.0f, 4, 16, 12, 0.0f, -3.0f, 0.0f, -5.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -5.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.air2Model[6].setRotationPoint(-6.0f, -43.0f, -6.0f);
        this.air2Model[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 16, 12, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[7].setRotationPoint(-2.0f, -43.0f, -6.0f);
        this.air2Model[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 16, 12, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -5.0f, -3.0f, 0.0f, -5.0f, 1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[8].setRotationPoint(2.0f, -43.0f, -6.0f);
        this.air2Model[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 24, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[9].setRotationPoint(-0.5f, -44.0f, -10.0f);
        this.air2Model[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[10].setRotationPoint(-0.5f, -50.0f, -10.0f);
        this.air2Model[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[11].setRotationPoint(-0.5f, -48.0f, -7.0f);
        this.air2Model[12].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[12].setRotationPoint(-0.5f, -46.0f, -4.0f);
        this.air2Model[13].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[13].setRotationPoint(-0.5f, -46.0f, 3.0f);
        this.air2Model[14].addShapeBox(0.0f, 0.0f, 0.0f, 1, 24, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -19.0f, 0.0f);
        this.air2Model[14].setRotationPoint(-0.5f, -44.0f, 3.0f);
        this.air2Model[15].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[15].setRotationPoint(-0.5f, -48.0f, 5.0f);
        this.air2Model[16].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[16].setRotationPoint(-0.5f, -50.0f, 8.0f);
        this.air2Model[17].addShapeBox(0.0f, 0.0f, 0.0f, 7, 24, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[17].setRotationPoint(3.0f, -44.0f, -0.5f);
        this.air2Model[18].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[18].setRotationPoint(8.0f, -50.0f, -0.5f);
        this.air2Model[19].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[19].setRotationPoint(5.0f, -48.0f, -0.5f);
        this.air2Model[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[20].setRotationPoint(3.0f, -46.0f, -0.5f);
        this.air2Model[21].addShapeBox(0.0f, 0.0f, 0.0f, 7, 24, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -19.0f, 0.0f);
        this.air2Model[21].setRotationPoint(-10.0f, -44.0f, -0.5f);
        this.air2Model[22].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[22].setRotationPoint(-10.0f, -50.0f, -0.5f);
        this.air2Model[23].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[23].setRotationPoint(-7.0f, -48.0f, -0.5f);
        this.air2Model[24].addShapeBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.air2Model[24].setRotationPoint(-4.0f, -46.0f, -0.5f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 25; ++i) {
            this.air2Model[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
