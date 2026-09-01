// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.client.renderer.entity.Render;

public class RenderBullet extends Render
{
    public RenderBullet() {
        this.shadowSize = 0.0f;
    }
    
    public void render(final EntityBullet bullet, final double d, final double d1, final double d2, final float f, final float f1) {
        if (bullet.owner == Minecraft.getMinecraft().thePlayer && bullet.ticksExisted < 1) {
            return;
        }
        this.bindEntityTexture((Entity)bullet);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(90.0f - bullet.prevRotationPitch - (bullet.rotationPitch - bullet.prevRotationPitch) * f1, 1.0f, 0.0f, 0.0f);
        final ModelBase model = bullet.type.model;
        if (model != null) {
            model.render((Entity)bullet, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityBullet)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityBullet)entity).type);
    }
}
