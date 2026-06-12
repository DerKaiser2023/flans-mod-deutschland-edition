// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelbomb500kg extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] bomb500kgModel;
    
    public Modelbomb500kg() {
        this.textureX = 128;
        this.textureY = 128;
        (this.bomb500kgModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bomb500kgModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.bomb500kgModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.bomb500kgModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.bomb500kgModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bomb500kgModel[5] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
        this.bomb500kgModel[6] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
        this.bomb500kgModel[7] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.bomb500kgModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.bomb500kgModel[9] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
        this.bomb500kgModel[10] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.bomb500kgModel[11] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
        this.bomb500kgModel[12] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
        this.bomb500kgModel[13] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bomb500kgModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 5, 17, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb500kgModel[0].func_78793_a(0.0f, 0.0f, 0.5f);
        this.bomb500kgModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 17, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb500kgModel[1].func_78793_a(5.0f, 0.0f, 0.5f);
        this.bomb500kgModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 17, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb500kgModel[2].func_78793_a(-2.0f, 0.0f, 0.5f);
        this.bomb500kgModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 5, 9, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f);
        this.bomb500kgModel[3].func_78793_a(-2.0f, 17.0f, 0.5f);
        this.bomb500kgModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 5, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f);
        this.bomb500kgModel[4].func_78793_a(0.0f, 17.0f, 0.5f);
        this.bomb500kgModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 5, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f);
        this.bomb500kgModel[5].func_78793_a(5.0f, 17.0f, 0.5f);
        this.bomb500kgModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, 2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb500kgModel[6].func_78793_a(5.0f, -8.0f, 0.5f);
        this.bomb500kgModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 9, 0.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, -2.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb500kgModel[7].func_78793_a(0.0f, -8.0f, 0.5f);
        this.bomb500kgModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 9, 0.0f, -3.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, 2.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb500kgModel[8].func_78793_a(-2.0f, -8.0f, 0.5f);
        this.bomb500kgModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 6, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.bomb500kgModel[9].func_78793_a(2.0f, -14.0f, 5.0f);
        this.bomb500kgModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 12, 6, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f);
        this.bomb500kgModel[10].func_78793_a(2.0f, -14.0f, -1.0f);
        this.bomb500kgModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.bomb500kgModel[11].func_78793_a(-3.5f, -14.0f, 4.5f);
        this.bomb500kgModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 12, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 4.0f, -0.25f);
        this.bomb500kgModel[12].func_78793_a(2.5f, -14.0f, 4.5f);
        this.bomb500kgModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f);
        this.bomb500kgModel[13].func_78793_a(1.0f, 22.0f, 3.5f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 14; ++i) {
            this.bomb500kgModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
