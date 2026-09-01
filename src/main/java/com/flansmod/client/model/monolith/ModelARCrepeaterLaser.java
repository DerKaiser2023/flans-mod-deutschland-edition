// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelARCrepeaterLaser extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] arcrepeaterlaserModel;
    
    public ModelARCrepeaterLaser() {
        this.textureX = 32;
        this.textureY = 32;
        (this.arcrepeaterlaserModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.arcrepeaterlaserModel[0].addShapeBox(-0.5f, 0.0f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[1].addShapeBox(-0.5f, 11.0f, -0.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f);
        this.arcrepeaterlaserModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[2].addShapeBox(-1.5f, 22.0f, -1.5f, 1, 6, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 2.0f, 0.0f, -2.0f, 2.0f, 0.0f, 2.0f, -2.0f, 0.0f, 2.0f);
        this.arcrepeaterlaserModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[3].addShapeBox(0.5f, 28.0f, 0.5f, 1, 7, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 3.0f, -2.0f, 0.0f, 3.0f, -2.0f, 0.0f, -3.0f, 2.0f, 0.0f, -3.0f);
        this.arcrepeaterlaserModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[4].addShapeBox(-1.5f, 35.0f, -2.5f, 1, 11, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 2.0f, 0.0f, -2.0f, 2.0f, 0.0f, 2.0f, -2.0f, 0.0f, 2.0f);
        this.arcrepeaterlaserModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[5].addShapeBox(-0.5f, 46.0f, -0.5f, 1, 11, 1, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.arcrepeaterlaserModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 6; ++i) {
            this.arcrepeaterlaserModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
