// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelARCbullet extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] arcbulletModel;
    
    public ModelARCbullet() {
        this.textureX = 32;
        this.textureY = 32;
        (this.arcbulletModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcbulletModel[0].addShapeBox(-1.0f, -4.0f, -1.0f, 2, 11, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.arcbulletModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[1].addShapeBox(-1.0f, 39.0f, -1.0f, 2, 14, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcbulletModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[2].addShapeBox(-1.0f, -17.0f, -1.0f, 2, 13, 2, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcbulletModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[3].addShapeBox(-1.0f, 7.0f, -1.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.arcbulletModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[4].addShapeBox(0.0f, 17.0f, -2.0f, 2, 12, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, -1.0f, 2.0f, 0.0f, -1.0f);
        this.arcbulletModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[5].addShapeBox(-2.0f, 29.0f, -1.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.arcbulletModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[6].addShapeBox(-1.0f, 53.0f, -2.0f, 2, 10, 2, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.arcbulletModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcbulletModel[7].addShapeBox(-2.0f, 63.0f, -2.0f, 2, 13, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f, -0.3f, 0.0f, -0.3f);
        this.arcbulletModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 8; ++i) {
            this.arcbulletModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
