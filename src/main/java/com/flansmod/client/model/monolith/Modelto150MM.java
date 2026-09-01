// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelto150MM extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] to150mmModel;
    
    public Modelto150MM() {
        this.textureX = 32;
        this.textureY = 32;
        (this.to150mmModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.to150mmModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.to150mmModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.to150mmModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.to150mmModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.to150mmModel[5] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.to150mmModel[6] = new ModelRendererTurbo(this, 17, 25, this.textureX, this.textureY);
        this.to150mmModel[7] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.to150mmModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, -0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.95f, -0.95f, 0.0f, -0.95f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -0.1f, 0.0f, -0.1f);
        this.to150mmModel[0].setRotationPoint(-1.05f, -14.05f, 0.05f);
        this.to150mmModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f);
        this.to150mmModel[1].setRotationPoint(0.05f, 4.0f, 0.05f);
        this.to150mmModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, -0.95f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f);
        this.to150mmModel[2].setRotationPoint(-1.05f, -14.05f, -1.05f);
        this.to150mmModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, -0.95f, -0.95f, 0.0f, -0.95f, -0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -0.1f, 0.0f, -0.1f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.to150mmModel[3].setRotationPoint(0.05f, -14.05f, -1.05f);
        this.to150mmModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 18, 1, 0.0f, 0.0f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.1f, 0.0f, -0.1f, 0.0f, 0.0f, 0.2f);
        this.to150mmModel[4].setRotationPoint(0.05f, -14.05f, 0.05f);
        this.to150mmModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.2f, -0.1f, 0.0f, -0.1f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.95f, -0.95f, 0.0f, -0.95f, -0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.to150mmModel[5].setRotationPoint(0.05f, 4.0f, -1.05f);
        this.to150mmModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, -0.1f, 0.0f, -0.1f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, -0.95f, 0.0f, -0.95f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f, 0.0f, -0.95f, 0.0f, 0.0f);
        this.to150mmModel[6].setRotationPoint(-1.05f, 4.0f, -1.05f);
        this.to150mmModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, -0.1f, 0.0f, -0.1f, -0.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.95f, -0.95f, 0.0f, -0.95f);
        this.to150mmModel[7].setRotationPoint(-1.05f, 4.0f, 0.05f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 8; ++i) {
            this.to150mmModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
