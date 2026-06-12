// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class Modelbomb50kg extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] bomb50kgModel;
    
    public Modelbomb50kg() {
        this.textureX = 64;
        this.textureY = 64;
        (this.bomb50kgModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.bomb50kgModel[1] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.bomb50kgModel[2] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.bomb50kgModel[3] = new ModelRendererTurbo(this, 49, 1, this.textureX, this.textureY);
        this.bomb50kgModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.bomb50kgModel[5] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.bomb50kgModel[6] = new ModelRendererTurbo(this, 41, 9, this.textureX, this.textureY);
        this.bomb50kgModel[7] = new ModelRendererTurbo(this, 1, 17, this.textureX, this.textureY);
        this.bomb50kgModel[8] = new ModelRendererTurbo(this, 17, 17, this.textureX, this.textureY);
        this.bomb50kgModel[9] = new ModelRendererTurbo(this, 57, 9, this.textureX, this.textureY);
        this.bomb50kgModel[10] = new ModelRendererTurbo(this, 33, 17, this.textureX, this.textureY);
        this.bomb50kgModel[11] = new ModelRendererTurbo(this, 41, 17, this.textureX, this.textureY);
        this.bomb50kgModel[12] = new ModelRendererTurbo(this, 49, 17, this.textureX, this.textureY);
        this.bomb50kgModel[0].func_78790_a(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f);
        this.bomb50kgModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.bomb50kgModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bomb50kgModel[1].func_78793_a(1.0f, 0.0f, 0.0f);
        this.bomb50kgModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bomb50kgModel[2].func_78793_a(-1.0f, 0.0f, 0.0f);
        this.bomb50kgModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 3, 0.0f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, -0.5f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bomb50kgModel[3].func_78793_a(0.0f, -5.0f, 0.0f);
        this.bomb50kgModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 3, 0.0f, 0.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, 0.5f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f);
        this.bomb50kgModel[4].func_78793_a(1.0f, -5.0f, 0.0f);
        this.bomb50kgModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 5, 3, 0.0f, -1.5f, 0.0f, -1.5f, 0.5f, 0.0f, -1.5f, 0.5f, 0.0f, -1.5f, -1.5f, 0.0f, -1.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f);
        this.bomb50kgModel[5].func_78793_a(-1.0f, -5.0f, 0.0f);
        this.bomb50kgModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bomb50kgModel[6].func_78793_a(1.0f, 6.0f, 0.0f);
        this.bomb50kgModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.bomb50kgModel[7].func_78793_a(0.0f, 6.0f, 0.0f);
        this.bomb50kgModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.bomb50kgModel[8].func_78793_a(-1.0f, 6.0f, 0.0f);
        this.bomb50kgModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 2, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 2.0f, 0.0f, -0.4f, 2.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f);
        this.bomb50kgModel[9].func_78793_a(0.0f, -7.0f, 1.5f);
        this.bomb50kgModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 6, 2, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 2.0f, 0.0f, -0.4f, 2.0f, 0.0f);
        this.bomb50kgModel[10].func_78793_a(0.0f, -7.0f, -0.5f);
        this.bomb50kgModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 2.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 2.0f, -0.4f);
        this.bomb50kgModel[11].func_78793_a(0.5f, -7.0f, 1.0f);
        this.bomb50kgModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 0.0f, -0.4f, 0.0f, 2.0f, -0.4f, 0.0f, 2.0f, -0.4f, 0.0f, 0.0f, -0.4f);
        this.bomb50kgModel[12].func_78793_a(-1.5f, -7.0f, 1.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 13; ++i) {
            this.bomb50kgModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
