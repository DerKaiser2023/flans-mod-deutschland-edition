// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelBullet;

public class ModelDrakon extends ModelBullet
{
    public ModelRendererTurbo[] tailModel;
    
    public ModelDrakon() {
        final int textureX = 64;
        final int textureY = 32;
        (this.tailModel = new ModelRendererTurbo[17])[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.tailModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.tailModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        this.tailModel[3] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        this.tailModel[4] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        this.tailModel[5] = new ModelRendererTurbo(this, 0, 5, textureX, textureY);
        this.tailModel[6] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
        this.tailModel[7] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
        this.tailModel[8] = new ModelRendererTurbo(this, 0, 11, textureX, textureY);
        this.tailModel[9] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        this.tailModel[10] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        this.tailModel[11] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        this.tailModel[12] = new ModelRendererTurbo(this, 0, 17, textureX, textureY);
        this.tailModel[13] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
        this.tailModel[14] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
        this.tailModel[15] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
        this.tailModel[16] = new ModelRendererTurbo(this, 0, 25, textureX, textureY);
        this.tailModel[0].addShapeBox(-9.5f, 1.0f, -1.5f, 17, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f);
        this.tailModel[0].rotateAngleZ = -1.5707964f;
        this.tailModel[1].addShapeBox(-9.5f, 0.0f, -1.5f, 17, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[1].rotateAngleZ = -1.5707964f;
        this.tailModel[2].addShapeBox(-9.5f, -1.0f, -1.5f, 17, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.tailModel[2].rotateAngleZ = -1.5707964f;
        this.tailModel[3].addShapeBox(7.5f, -1.0f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -1.1f, 0.0f, -0.2f, -1.1f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.0f, 0.0f);
        this.tailModel[3].rotateAngleZ = -1.5707964f;
        this.tailModel[4].addShapeBox(7.5f, 0.0f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, 0.0f, 0.0f, 0.0f);
        this.tailModel[4].rotateAngleZ = -1.5707964f;
        this.tailModel[5].addShapeBox(7.5f, 1.0f, -1.5f, 2, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.1f, -0.2f, 0.0f, 0.1f, -0.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, -0.2f, -1.1f, 0.0f, -0.2f, -1.1f, 0.0f, 0.0f, -1.0f);
        this.tailModel[5].rotateAngleZ = -1.5707964f;
        this.tailModel[6].addShapeBox(9.5f, 0.0f, -1.5f, 1, 1, 3, 0.0f, 0.0f, -0.1f, -0.2f, -0.5f, -0.33f, -1.0f, -0.5f, -0.33f, -1.0f, 0.0f, -0.1f, -0.2f, 0.0f, -0.1f, -0.2f, -0.5f, -0.33f, -1.0f, -0.5f, -0.33f, -1.0f, 0.0f, -0.1f, -0.2f);
        this.tailModel[6].rotateAngleZ = -1.5707964f;
        this.tailModel[7].addShapeBox(9.5f, -1.0f, -1.5f, 1, 1, 3, 0.0f, 0.0f, -0.2f, -1.1f, -0.5f, -1.0f, -1.33f, -0.5f, -1.0f, -1.33f, 0.0f, -0.2f, -1.1f, 0.0f, 0.1f, -0.2f, -0.5f, 0.33f, -1.0f, -0.5f, 0.33f, -1.0f, 0.0f, 0.1f, -0.2f);
        this.tailModel[7].rotateAngleZ = -1.5707964f;
        this.tailModel[8].addShapeBox(9.5f, 1.0f, -1.5f, 1, 1, 3, 0.0f, 0.0f, 0.1f, -0.2f, -0.5f, 0.33f, -1.0f, -0.5f, 0.33f, -1.0f, 0.0f, 0.1f, -0.2f, 0.0f, -0.2f, -1.1f, -0.5f, -1.0f, -1.33f, -0.5f, -1.0f, -1.33f, 0.0f, -0.2f, -1.1f);
        this.tailModel[8].rotateAngleZ = -1.5707964f;
        this.tailModel[9].addShapeBox(-8.0f, 0.0f, -6.5f, 3, 1, 5, 0.0f, 2.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[9].rotateAngleX = 0.7853982f;
        this.tailModel[9].rotateAngleZ = -1.5707964f;
        this.tailModel[10].addShapeBox(-8.0f, 0.0f, 0.5f, 3, 1, 5, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f);
        this.tailModel[10].rotateAngleX = 0.7853982f;
        this.tailModel[10].rotateAngleZ = -1.5707964f;
        this.tailModel[11].addShapeBox(-8.0f, 0.0f, 1.5f, 3, 1, 5, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f);
        this.tailModel[11].rotateAngleX = -0.7853982f;
        this.tailModel[11].rotateAngleZ = -1.5707964f;
        this.tailModel[12].addShapeBox(-8.0f, 0.0f, -5.5f, 3, 1, 5, 0.0f, 2.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 2.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[12].rotateAngleX = -0.7853982f;
        this.tailModel[12].rotateAngleZ = -1.5707964f;
        this.tailModel[13].addShapeBox(2.0f, 0.0f, -4.5f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[13].rotateAngleX = 0.7853982f;
        this.tailModel[13].rotateAngleZ = -1.5707964f;
        this.tailModel[14].addShapeBox(2.0f, 0.0f, 1.5f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[14].rotateAngleX = 0.7853982f;
        this.tailModel[14].rotateAngleZ = -1.5707964f;
        this.tailModel[15].addShapeBox(2.0f, 0.0f, 1.5f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[15].rotateAngleX = -0.7853982f;
        this.tailModel[15].rotateAngleZ = -1.5707964f;
        this.tailModel[16].addShapeBox(2.0f, 0.0f, -3.5f, 3, 1, 3, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, -2.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.3f, 0.0f);
        this.tailModel[16].rotateAngleX = -0.7853982f;
        this.tailModel[16].rotateAngleZ = -1.5707964f;
        for (int i = 0; i < 17; ++i) {
            this.tailModel[i].rotateAngleZ = 1.5707964f;
        }
    }
    
    @Override
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 1.0f, 0.0f);
        for (final ModelRendererTurbo mrt : this.tailModel) {
            mrt.render(f5);
        }
        GL11.glPopMatrix();
    }
}
