// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelARCrepeaterBullet extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] arcrepeaterbulletModel;
    
    public ModelARCrepeaterBullet() {
        this.textureX = 32;
        this.textureY = 32;
        (this.arcrepeaterbulletModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo(this, 7, 1, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[2] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[4] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[5] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[6] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[7] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[9] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[10] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[12] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[13] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[14] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[15] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[16] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[17] = new ModelRendererTurbo(this, 2, 5, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[18] = new ModelRendererTurbo(this, 0, 4, this.textureX, this.textureY);
        this.arcrepeaterbulletModel[0].addShapeBox(-1.0f, 0.0f, -1.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[1].addShapeBox(-1.0f, 7.0f, -1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[2].addShapeBox(-1.0f, 9.0f, -1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[3].addShapeBox(-2.0f, 25.0f, -3.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[4].addShapeBox(-2.0f, 27.0f, -3.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[5].addShapeBox(-3.0f, 2.0f, -3.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[6].addShapeBox(-4.0f, 20.0f, -5.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[7].addShapeBox(3.0f, 24.0f, -1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[8].addShapeBox(3.0f, 22.0f, -1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[8].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[9].addShapeBox(1.0f, 17.0f, -3.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[9].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[10].addShapeBox(-4.0f, 34.0f, 1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[10].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[11].addShapeBox(-4.0f, 32.0f, 1.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[11].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[12].addShapeBox(-6.0f, 27.0f, -1.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[12].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[13].addShapeBox(0.0f, 19.0f, 2.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[13].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[14].addShapeBox(0.0f, 17.0f, 2.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[14].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[15].addShapeBox(-2.0f, 12.0f, 0.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[15].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[16].addShapeBox(0.0f, 38.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[16].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[17].addShapeBox(-2.0f, 33.0f, -2.0f, 5, 5, 5, 0.0f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.2f, 0.0f, -2.2f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.arcrepeaterbulletModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterbulletModel[18].addShapeBox(0.0f, 40.0f, 0.0f, 1, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.arcrepeaterbulletModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 19; ++i) {
            this.arcrepeaterbulletModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
