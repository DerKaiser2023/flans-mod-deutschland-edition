// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelbomb250kg extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] bomb250kgModel;
    
    public Modelbomb250kg() {
        this.textureX = 128;
        this.textureY = 128;
        (this.bomb250kgModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bomb250kgModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.bomb250kgModel[2] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.bomb250kgModel[3] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.bomb250kgModel[4] = new ModelRendererTurbo(this, 97, 9, this.textureX, this.textureY);
        this.bomb250kgModel[5] = new ModelRendererTurbo(this, 81, 17, this.textureX, this.textureY);
        this.bomb250kgModel[6] = new ModelRendererTurbo(this, 97, 25, this.textureX, this.textureY);
        this.bomb250kgModel[7] = new ModelRendererTurbo(this, 1, 33, this.textureX, this.textureY);
        this.bomb250kgModel[8] = new ModelRendererTurbo(this, 33, 33, this.textureX, this.textureY);
        this.bomb250kgModel[9] = new ModelRendererTurbo(this, 57, 33, this.textureX, this.textureY);
        this.bomb250kgModel[10] = new ModelRendererTurbo(this, 73, 33, this.textureX, this.textureY);
        this.bomb250kgModel[11] = new ModelRendererTurbo(this, 89, 49, this.textureX, this.textureY);
        this.bomb250kgModel[12] = new ModelRendererTurbo(this, 105, 49, this.textureX, this.textureY);
        this.bomb250kgModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 17, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb250kgModel[0].func_78793_a(0.0f, 0.0f, 0.5f);
        this.bomb250kgModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 17, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb250kgModel[1].func_78793_a(5.0f, 0.0f, 0.5f);
        this.bomb250kgModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 17, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb250kgModel[2].func_78793_a(-2.0f, 0.0f, 0.5f);
        this.bomb250kgModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f);
        this.bomb250kgModel[3].func_78793_a(-2.0f, 17.0f, 0.5f);
        this.bomb250kgModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f);
        this.bomb250kgModel[4].func_78793_a(0.0f, 17.0f, 0.5f);
        this.bomb250kgModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f);
        this.bomb250kgModel[5].func_78793_a(5.0f, 17.0f, 0.5f);
        this.bomb250kgModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, 2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb250kgModel[6].func_78793_a(5.0f, -8.0f, 0.5f);
        this.bomb250kgModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 9, 0.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb250kgModel[7].func_78793_a(0.0f, -8.0f, 0.5f);
        this.bomb250kgModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, -4.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb250kgModel[8].func_78793_a(-2.0f, -8.0f, 0.5f);
        this.bomb250kgModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 6, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.bomb250kgModel[9].func_78793_a(2.0f, -14.0f, 5.0f);
        this.bomb250kgModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 6, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f);
        this.bomb250kgModel[10].func_78793_a(2.0f, -14.0f, -1.0f);
        this.bomb250kgModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.bomb250kgModel[11].func_78793_a(-3.5f, -14.0f, 4.5f);
        this.bomb250kgModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f);
        this.bomb250kgModel[12].func_78793_a(2.5f, -14.0f, 4.5f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 13; ++i) {
            this.bomb250kgModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
