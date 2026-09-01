// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelPigBullet extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] pigbulletModel;
    
    public ModelPigBullet() {
        this.textureX = 64;
        this.textureY = 64;
        (this.pigbulletModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 1, 18, this.textureX, this.textureY);
        this.pigbulletModel[1] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.pigbulletModel[2] = new ModelRendererTurbo(this, 26, 1, this.textureX, this.textureY);
        this.pigbulletModel[3] = new ModelRendererTurbo(this, 34, 6, this.textureX, this.textureY);
        this.pigbulletModel[4] = new ModelRendererTurbo(this, 34, 6, this.textureX, this.textureY);
        this.pigbulletModel[5] = new ModelRendererTurbo(this, 34, 6, this.textureX, this.textureY);
        this.pigbulletModel[6] = new ModelRendererTurbo(this, 34, 6, this.textureX, this.textureY);
        this.pigbulletModel[0].addShapeBox(-9.0f, 7.0f, -5.0f, 16, 8, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[1].addShapeBox(5.0f, 5.0f, -4.0f, 8, 8, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[2].addShapeBox(12.5f, 9.0f, -2.0f, 1, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[3].addShapeBox(2.0f, 15.0f, -5.0f, 4, 6, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[4].addShapeBox(2.0f, 15.0f, 1.0f, 4, 6, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[5].addShapeBox(-10.0f, 15.0f, -5.0f, 4, 6, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.pigbulletModel[6].addShapeBox(-10.0f, 15.0f, 1.0f, 4, 6, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.pigbulletModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 7; ++i) {
            this.pigbulletModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
