// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelCookie extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] cookieModel;
    
    public ModelCookie() {
        this.textureX = 512;
        this.textureY = 512;
        (this.cookieModel = new ModelRendererTurbo[9])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.cookieModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.cookieModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.cookieModel[3] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.cookieModel[4] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        this.cookieModel[5] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.cookieModel[6] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.cookieModel[7] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.cookieModel[8] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
        this.cookieModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[0].func_78793_a(0.0f, -49.0f, 6.0f);
        this.cookieModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[1].func_78793_a(0.0f, -49.0f, -6.0f);
        this.cookieModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[2].func_78793_a(6.0f, -49.0f, 0.0f);
        this.cookieModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[3].func_78793_a(-6.0f, -49.0f, 0.0f);
        this.cookieModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[4].func_78793_a(-6.0f, -49.0f, -6.0f);
        this.cookieModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f);
        this.cookieModel[5].func_78793_a(-6.0f, -49.0f, 6.0f);
        this.cookieModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[6].func_78793_a(6.0f, -49.0f, 6.0f);
        this.cookieModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[7].func_78793_a(6.0f, -49.0f, -6.0f);
        this.cookieModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 6, 40, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.cookieModel[8].func_78793_a(0.0f, -49.0f, 0.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 9; ++i) {
            this.cookieModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
