// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMortarWarhead extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] MortarWarheadModel;
    
    public ModelMortarWarhead() {
        this.textureX = 32;
        this.textureY = 32;
        (this.MortarWarheadModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.MortarWarheadModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.MortarWarheadModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.MortarWarheadModel[3] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.MortarWarheadModel[4] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.MortarWarheadModel[5] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.MortarWarheadModel[6] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.MortarWarheadModel[7] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.MortarWarheadModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.MortarWarheadModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f, -0.15f, 0.0f, -0.15f);
        this.MortarWarheadModel[0].func_78793_a(-0.5f, 26.0f, -0.5f);
        this.MortarWarheadModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.MortarWarheadModel[1].func_78793_a(-0.5f, 25.5f, -0.5f);
        this.MortarWarheadModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f, 0.7f, 0.5f, 0.7f);
        this.MortarWarheadModel[2].func_78793_a(-0.5f, 23.5f, -0.5f);
        this.MortarWarheadModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.1f, 0.0f, 0.1f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f, 0.6f, 0.0f, 0.6f);
        this.MortarWarheadModel[3].func_78793_a(-0.5f, 20.5f, -0.5f);
        this.MortarWarheadModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.MortarWarheadModel[4].func_78793_a(-0.5f, 16.0f, -0.5f);
        this.MortarWarheadModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f, -0.3f, -0.5f, 0.0f);
        this.MortarWarheadModel[5].func_78793_a(-0.5f, 16.5f, -1.5f);
        this.MortarWarheadModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f, -0.3f, 0.0f, -1.0f);
        this.MortarWarheadModel[6].func_78793_a(-0.5f, 19.0f, -1.5f);
        this.MortarWarheadModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f, -1.0f, 0.0f, -0.3f);
        this.MortarWarheadModel[7].func_78793_a(-1.5f, 19.0f, -0.5f);
        this.MortarWarheadModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 1, 0.0f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f);
        this.MortarWarheadModel[8].func_78793_a(-1.5f, 16.5f, -0.5f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 8; ++i) {
            this.MortarWarheadModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
