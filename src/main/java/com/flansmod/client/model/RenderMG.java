// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.guns.EntityMG;
import net.minecraft.client.renderer.entity.Render;

public class RenderMG extends Render
{
    public RenderMG() {
        this.shadowSize = 0.5f;
    }
    
    public void render(final EntityMG mg, final double d, final double d1, final double d2, final float f, final float f1) {
        this.bindEntityTexture((Entity)mg);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(180.0f - mg.direction * 90.0f, 0.0f, 1.0f, 0.0f);
        final ModelMG model = mg.type.deployableModel;
        if (model != null) {
            model.renderBipod(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, mg);
            GL11.glRotatef(-(mg.prevRotationYaw + (mg.rotationYaw - mg.prevRotationYaw) * f1), 0.0f, 1.0f, 0.0f);
            model.renderGun(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, f1, mg);
        }
        GL11.glPopMatrix();
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityMG)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return FlansModResourceHandler.getDeployableTexture(((EntityMG)entity).type);
    }
}
