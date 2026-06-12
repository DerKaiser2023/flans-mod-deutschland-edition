// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelbomb100kg extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] bomb100kgModel;
    
    public Modelbomb100kg() {
        this.textureX = 128;
        this.textureY = 128;
        (this.bomb100kgModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bomb100kgModel[1] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.bomb100kgModel[2] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.bomb100kgModel[3] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.bomb100kgModel[4] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.bomb100kgModel[5] = new ModelRendererTurbo(this, 65, 17, this.textureX, this.textureY);
        this.bomb100kgModel[6] = new ModelRendererTurbo(this, 89, 17, this.textureX, this.textureY);
        this.bomb100kgModel[7] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.bomb100kgModel[8] = new ModelRendererTurbo(this, 25, 25, this.textureX, this.textureY);
        this.bomb100kgModel[9] = new ModelRendererTurbo(this, 113, 17, this.textureX, this.textureY);
        this.bomb100kgModel[10] = new ModelRendererTurbo(this, 49, 25, this.textureX, this.textureY);
        this.bomb100kgModel[11] = new ModelRendererTurbo(this, 65, 33, this.textureX, this.textureY);
        this.bomb100kgModel[12] = new ModelRendererTurbo(this, 81, 33, this.textureX, this.textureY);
        this.bomb100kgModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb100kgModel[0].func_78793_a(0.0f, 0.0f, 0.5f);
        this.bomb100kgModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb100kgModel[1].func_78793_a(2.0f, 0.0f, 0.5f);
        this.bomb100kgModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 2, 11, 6, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb100kgModel[2].func_78793_a(-2.0f, 0.0f, 0.5f);
        this.bomb100kgModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 6, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f);
        this.bomb100kgModel[3].func_78793_a(-2.0f, 11.0f, 0.5f);
        this.bomb100kgModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bomb100kgModel[4].func_78793_a(0.0f, 11.0f, 0.5f);
        this.bomb100kgModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bomb100kgModel[5].func_78793_a(2.0f, 11.0f, 0.5f);
        this.bomb100kgModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 6, 0.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.bomb100kgModel[6].func_78793_a(2.0f, -8.0f, 0.5f);
        this.bomb100kgModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 6, 0.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, -1.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb100kgModel[7].func_78793_a(0.0f, -8.0f, 0.5f);
        this.bomb100kgModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 2, 8, 6, 0.0f, -3.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, 1.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f);
        this.bomb100kgModel[8].func_78793_a(-2.0f, -8.0f, 0.5f);
        this.bomb100kgModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 3, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 2.0f, 0.0f, -0.25f, 2.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.bomb100kgModel[9].func_78793_a(0.5f, -11.0f, 3.5f);
        this.bomb100kgModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 9, 3, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 2.0f, 0.0f, -0.25f, 2.0f, 0.0f);
        this.bomb100kgModel[10].func_78793_a(0.5f, -11.0f, 0.5f);
        this.bomb100kgModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 2.0f, -0.25f, 0.0f, 2.0f, -0.25f, 0.0f, 0.0f, -0.25f);
        this.bomb100kgModel[11].func_78793_a(-2.0f, -11.0f, 3.0f);
        this.bomb100kgModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 3, 9, 1, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 2.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 2.0f, -0.25f);
        this.bomb100kgModel[12].func_78793_a(1.0f, -11.0f, 3.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 13; ++i) {
            this.bomb100kgModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
