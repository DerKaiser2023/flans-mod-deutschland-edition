// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelKamikaze extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] kamikazeModel;
    
    public ModelKamikaze() {
        this.textureX = 512;
        this.textureY = 512;
        (this.kamikazeModel = new ModelRendererTurbo[22])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.kamikazeModel[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.kamikazeModel[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.kamikazeModel[3] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.kamikazeModel[4] = new ModelRendererTurbo(this, 121, 1, this.textureX, this.textureY);
        this.kamikazeModel[5] = new ModelRendererTurbo(this, 145, 1, this.textureX, this.textureY);
        this.kamikazeModel[6] = new ModelRendererTurbo(this, 137, 1, this.textureX, this.textureY);
        this.kamikazeModel[7] = new ModelRendererTurbo(this, 169, 1, this.textureX, this.textureY);
        this.kamikazeModel[8] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.kamikazeModel[9] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.kamikazeModel[10] = new ModelRendererTurbo(this, 217, 1, this.textureX, this.textureY);
        this.kamikazeModel[11] = new ModelRendererTurbo(this, 241, 1, this.textureX, this.textureY);
        this.kamikazeModel[12] = new ModelRendererTurbo(this, 265, 1, this.textureX, this.textureY);
        this.kamikazeModel[13] = new ModelRendererTurbo(this, 57, 1, this.textureX, this.textureY);
        this.kamikazeModel[14] = new ModelRendererTurbo(this, 89, 1, this.textureX, this.textureY);
        this.kamikazeModel[15] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
        this.kamikazeModel[16] = new ModelRendererTurbo(this, 369, 1, this.textureX, this.textureY);
        this.kamikazeModel[17] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
        this.kamikazeModel[18] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
        this.kamikazeModel[19] = new ModelRendererTurbo(this, 201, 1, this.textureX, this.textureY);
        this.kamikazeModel[20] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.kamikazeModel[21] = new ModelRendererTurbo(this, 249, 1, this.textureX, this.textureY);
        this.kamikazeModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 7, 6, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f);
        this.kamikazeModel[0].func_78793_a(-3.5f, 19.0f, -3.0f);
        this.kamikazeModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 7, 11, 7, 0.0f, -1.2f, 0.0f, -0.5f, -1.2f, 0.0f, -0.5f, -1.2f, 0.0f, -1.0f, -1.2f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[1].func_78793_a(-3.5f, -13.0f, -3.0f);
        this.kamikazeModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 7, 21, 7, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[2].func_78793_a(-3.5f, -2.0f, -3.0f);
        this.kamikazeModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 5, 16, 6, 0.0f, -2.2f, 0.0f, -3.0f, -2.2f, 0.0f, -3.0f, -2.2f, 0.0f, -2.8f, -2.2f, 0.0f, -2.8f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, -0.5f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.kamikazeModel[3].func_78793_a(-2.5f, -29.0f, -3.0f);
        this.kamikazeModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 1, 7, 10, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f);
        this.kamikazeModel[4].func_78793_a(-0.5f, -29.0f, -10.0f);
        this.kamikazeModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 1, 4, 10, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, -4.0f, 0.0f, -0.25f, 4.0f, 0.0f, -0.25f, 4.0f, 0.0f);
        this.kamikazeModel[5].func_78793_a(-0.5f, -22.0f, -10.0f);
        this.kamikazeModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 5, 3, 0.0f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[6].func_78793_a(-2.5f, 6.5f, -6.0f);
        this.kamikazeModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 5, 8, 3, 0.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, -3.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -1.0f, 0.0f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[7].func_78793_a(-2.5f, -1.5f, -6.0f);
        this.kamikazeModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 5, 4, 3, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -0.2f, -3.0f, -2.0f, -0.2f, -3.0f, -2.0f, -0.2f, 0.0f, -2.0f, -0.2f, 0.0f);
        this.kamikazeModel[8].func_78793_a(-2.5f, 11.5f, -6.0f);
        this.kamikazeModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 2, 4, 2, 0.0f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[9].func_78793_a(-1.0f, 24.5f, -0.5f);
        this.kamikazeModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 5, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[10].func_78793_a(-2.0f, 9.0f, 5.0f);
        this.kamikazeModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f, -1.0f, 0.0f, -1.0f);
        this.kamikazeModel[11].func_78793_a(-2.0f, 14.0f, 5.0f);
        this.kamikazeModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 3, 4, 0.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[12].func_78793_a(-2.0f, 6.0f, 5.0f);
        this.kamikazeModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 3, 3, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[13].func_78793_a(-1.5f, 4.0f, 5.5f);
        this.kamikazeModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[14].func_78793_a(-1.0f, 11.0f, 4.0f);
        this.kamikazeModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 34, 17, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -7.0f, 0.5f, 0.0f, -7.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -4.0f, 0.5f, 0.0f, -4.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[15].func_78793_a(3.5f, 2.0f, 1.0f);
        this.kamikazeModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 34, 17, 3, 0.0f, 0.0f, -7.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.0f, -2.0f, 0.0f, -4.0f, 0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2.0f);
        this.kamikazeModel[16].func_78793_a(-37.5f, 2.0f, 1.0f);
        this.kamikazeModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 14, 10, 1, 0.0f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -6.0f, -0.2f, 0.0f, -6.0f, -0.2f, 0.0f, 0.0f, -0.2f);
        this.kamikazeModel[17].func_78793_a(0.0f, -23.0f, -1.0f);
        this.kamikazeModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 14, 10, 1, 0.0f, 0.0f, -1.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -1.0f, -0.2f, 0.0f, -6.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, -6.0f, -0.2f);
        this.kamikazeModel[18].func_78793_a(-15.0f, -23.0f, -1.0f);
        this.kamikazeModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kamikazeModel[19].func_78793_a(-0.5f, 26.0f, -8.5f);
        this.kamikazeModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, -5.0f, -7.3f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 7.0f, 0.0f, -5.0f, -7.3f, 0.0f, -4.0f);
        this.kamikazeModel[20].func_78793_a(-0.5f, 26.0f, 1.0f);
        this.kamikazeModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 1, 1, 10, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.3f, 0.0f, -4.0f, 7.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -7.3f, 0.0f, -4.0f, 7.0f, 0.0f, -5.0f);
        this.kamikazeModel[21].func_78793_a(-0.5f, 26.0f, 1.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 22; ++i) {
            this.kamikazeModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
