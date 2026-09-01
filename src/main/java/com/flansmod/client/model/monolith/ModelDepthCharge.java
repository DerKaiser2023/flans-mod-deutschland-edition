// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.monolith;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelDepthCharge extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] depthchargeModel;
    
    public ModelDepthCharge() {
        this.textureX = 128;
        this.textureY = 64;
        (this.depthchargeModel = new ModelRendererTurbo[20])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.depthchargeModel[1] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.depthchargeModel[2] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.depthchargeModel[3] = new ModelRendererTurbo(this, 1, 25, this.textureX, this.textureY);
        this.depthchargeModel[4] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.depthchargeModel[5] = new ModelRendererTurbo(this, 81, 25, this.textureX, this.textureY);
        this.depthchargeModel[6] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
        this.depthchargeModel[7] = new ModelRendererTurbo(this, 41, 25, this.textureX, this.textureY);
        this.depthchargeModel[8] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.depthchargeModel[9] = new ModelRendererTurbo(this, 1, 49, this.textureX, this.textureY);
        this.depthchargeModel[10] = new ModelRendererTurbo(this, 41, 49, this.textureX, this.textureY);
        this.depthchargeModel[11] = new ModelRendererTurbo(this, 81, 49, this.textureX, this.textureY);
        this.depthchargeModel[12] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.depthchargeModel[13] = new ModelRendererTurbo(this, 25, 1, this.textureX, this.textureY);
        this.depthchargeModel[14] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.depthchargeModel[15] = new ModelRendererTurbo(this, 41, 1, this.textureX, this.textureY);
        this.depthchargeModel[16] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.depthchargeModel[17] = new ModelRendererTurbo(this, 73, 1, this.textureX, this.textureY);
        this.depthchargeModel[18] = new ModelRendererTurbo(this, 81, 1, this.textureX, this.textureY);
        this.depthchargeModel[19] = new ModelRendererTurbo(this, 105, 1, this.textureX, this.textureY);
        this.depthchargeModel[0].addShapeBox(-2.0f, -2.0f, -6.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[0].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[1].addShapeBox(-6.01f, -2.0f, -6.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.depthchargeModel[1].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[2].addShapeBox(-2.0f, 2.01f, -6.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f);
        this.depthchargeModel[2].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[3].addShapeBox(-6.01f, 1.99f, -5.99f, 4, 4, 12, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, -3.95f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, -3.95f, -3.95f);
        this.depthchargeModel[3].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[4].addShapeBox(1.99f, 1.99f, -5.99f, 4, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, -3.95f, -3.95f, 0.0f, -3.95f, -3.95f, 0.0f, 0.0f, -3.95f);
        this.depthchargeModel[4].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[5].addShapeBox(1.99f, -2.0f, -6.0f, 4, 4, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[5].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[6].addShapeBox(1.99f, -11.01f, -5.99f, 4, 9, 12, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, -8.95f, -3.95f, 0.0f, -8.95f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[6].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[7].addShapeBox(-2.0f, -10.99f, -6.0f, 4, 9, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[7].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[8].addShapeBox(-6.01f, -11.01f, -5.99f, 4, 9, 12, 0.0f, 0.0f, -8.95f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, -8.95f, -3.95f, 0.0f, 0.0f, -3.95f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.95f);
        this.depthchargeModel[8].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[9].addShapeBox(-6.01f, -10.0f, -6.0f, 4, 1, 12, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f);
        this.depthchargeModel[9].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[10].addShapeBox(-2.0f, -10.0f, -6.0f, 4, 1, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[10].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[11].addShapeBox(1.99f, -10.0f, -6.0f, 4, 1, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[11].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[12].addShapeBox(4.5f, -11.0f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[12].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[13].addShapeBox(-5.5f, -11.0f, -0.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[13].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[14].addShapeBox(-0.5f, -11.0f, 4.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[14].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[15].addShapeBox(-0.5f, -11.0f, -5.5f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[15].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[16].addShapeBox(2.7f, -11.0f, 2.7f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[16].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[17].addShapeBox(-3.7f, -11.0f, -3.7f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[17].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[18].addShapeBox(-3.7f, -11.0f, 2.7f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[18].func_78793_a(0.0f, 0.0f, 0.0f);
        this.depthchargeModel[19].addShapeBox(2.7f, -11.0f, -3.7f, 1, 9, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.depthchargeModel[19].func_78793_a(0.0f, 0.0f, 0.0f);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 20; ++i) {
            this.depthchargeModel[i].func_78785_a(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
