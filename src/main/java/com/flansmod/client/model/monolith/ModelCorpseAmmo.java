// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelCorpseAmmo extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] corpseammoModel;
    
    public ModelCorpseAmmo() {
        this.textureX = 128;
        this.textureY = 64;
        (this.corpseammoModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.corpseammoModel[1] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.corpseammoModel[2] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.corpseammoModel[3] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
        this.corpseammoModel[4] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.corpseammoModel[5] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.corpseammoModel[0].addShapeBox(-4.0f, -2.0f, -6.0f, 8, 4, 12, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.corpseammoModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.corpseammoModel[1].addShapeBox(-4.0f, -4.0f, 6.0f, 8, 8, 8, 0.0f, 1.0f, -0.5f, 0.0f, -1.0f, 0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 1.0f, -0.5f, 0.0f, -1.0f, 0.5f, 0.0f, 1.0f, -0.5f, 0.0f, 1.0f, -0.5f, 0.0f, -1.0f, 0.5f, 0.0f);
        this.corpseammoModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.corpseammoModel[2].addShapeBox(4.0f, -2.0f, 2.0f, 12, 4, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -1.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f);
        this.corpseammoModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.corpseammoModel[3].addShapeBox(-16.0f, -2.0f, 2.0f, 12, 4, 4, 0.0f, -1.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -1.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.corpseammoModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.corpseammoModel[4].addShapeBox(-4.0f, -2.0f, -18.0f, 4, 4, 12, 0.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f);
        this.corpseammoModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.corpseammoModel[5].addShapeBox(1.0f, -2.0f, -18.0f, 4, 4, 12, 0.0f, -6.0f, 0.0f, -2.0f, 6.0f, 0.0f, -4.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, -6.0f, 0.0f, -2.0f, 6.0f, 0.0f, -4.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f);
        this.corpseammoModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 6; ++i) {
            this.corpseammoModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
