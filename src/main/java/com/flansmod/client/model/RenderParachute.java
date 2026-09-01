// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBase;
import com.flansmod.common.tools.EntityParachute;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;

public class RenderParachute extends Render
{
    public RenderParachute() {
        this.shadowSize = 2.0f;
    }
    
    public void doRender(final Entity entity, final double d0, final double d1, final double d2, final float f, final float f1) {
        this.bindEntityTexture(entity);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d0, (float)d1, (float)d2);
        GL11.glRotatef(-f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-entity.prevRotationPitch - (entity.rotationPitch - entity.prevRotationPitch) * f1, 1.0f, 0.0f, 0.0f);
        final ModelBase model = ((EntityParachute)entity).type.model;
        model.render(entity, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityParachute)entity).type);
    }
}
