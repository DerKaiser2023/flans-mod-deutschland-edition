// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelRPGRocket extends ModelBase
{
    public ModelRendererTurbo[] bulletModel;
    
    public ModelRPGRocket() {
        final int textureX = 64;
        final int textureY = 32;
        this.bulletModel = new ModelRendererTurbo[3];
        (this.bulletModel[0] = new ModelRendererTurbo(this, 14, 12, textureX, textureY)).addBox(-1.5f, 0.0f, -1.5f, 3, 1, 3);
        (this.bulletModel[1] = new ModelRendererTurbo(this, 26, 9, textureX, textureY)).addTrapezoid(-2.0f, 1.0f, -2.0f, 4, 3, 4, 0.0f, -1.0f, 4);
        (this.bulletModel[2] = new ModelRendererTurbo(this, 38, 6, textureX, textureY)).addTrapezoid(-2.0f, 4.0f, -2.0f, 4, 3, 4, 0.0f, -1.0f, 5);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        for (final ModelRendererTurbo mrt : this.bulletModel) {
            mrt.render(f5);
        }
    }
}
