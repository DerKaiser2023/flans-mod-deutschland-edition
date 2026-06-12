// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelCBU87 extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] cbu87Model;
    
    public ModelCBU87() {
        this.textureX = 512;
        this.textureY = 512;
        (this.cbu87Model = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.cbu87Model[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.cbu87Model[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.cbu87Model[3] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.cbu87Model[4] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.cbu87Model[5] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        this.cbu87Model[6] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.cbu87Model[7] = new ModelRendererTurbo(this, 185, 1, this.textureX, this.textureY);
        this.cbu87Model[8] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
        this.cbu87Model[9] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.cbu87Model[10] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.cbu87Model[11] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
        this.cbu87Model[12] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.cbu87Model[0].addShapeBox(0.0f, 0.0f, 0.0f, 4, 35, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[0].func_78793_a(-2.0f, -17.0f, -4.0f);
        this.cbu87Model[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 35, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[1].func_78793_a(2.0f, -17.0f, -4.0f);
        this.cbu87Model[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 35, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.cbu87Model[2].func_78793_a(-4.0f, -17.0f, -4.0f);
        this.cbu87Model[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f);
        this.cbu87Model[3].func_78793_a(2.0f, 18.0f, -4.0f);
        this.cbu87Model[4].addShapeBox(0.0f, 0.0f, 0.0f, 4, 2, 8, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f);
        this.cbu87Model[4].func_78793_a(-2.0f, 18.0f, -4.0f);
        this.cbu87Model[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 2, 8, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f);
        this.cbu87Model[5].func_78793_a(-4.0f, 18.0f, -4.0f);
        this.cbu87Model[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 5, 8, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[6].func_78793_a(2.0f, -22.0f, -4.0f);
        this.cbu87Model[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 8, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[7].func_78793_a(-2.0f, -22.0f, -4.0f);
        this.cbu87Model[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 5, 8, 0.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.cbu87Model[8].func_78793_a(-4.0f, -22.0f, -4.0f);
        this.cbu87Model[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 3, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[9].func_78793_a(-0.5f, -22.0f, -4.0f);
        this.cbu87Model[10].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 1, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[10].func_78793_a(-4.0f, -22.0f, -0.5f);
        this.cbu87Model[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[11].func_78793_a(-0.5f, -22.0f, 1.0f);
        this.cbu87Model[12].addShapeBox(0.0f, 0.0f, 0.0f, 3, 5, 1, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cbu87Model[12].func_78793_a(1.0f, -22.0f, -0.5f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 13; ++i) {
            this.cbu87Model[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
