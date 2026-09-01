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
        this.field_76989_e = 0.0f;
    }
    
    public void render(final EntityBullet bullet, final double d, final double d1, final double d2, final float f, final float f1) {
        if (bullet.owner == Minecraft.func_71410_x().field_71439_g && bullet.field_70173_aa < 1) {
            return;
        }
        this.func_110777_b((Entity)bullet);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(90.0f - bullet.field_70127_C - (bullet.field_70125_A - bullet.field_70127_C) * f1, 1.0f, 0.0f, 0.0f);
        final ModelBase model = bullet.type.model;
        if (model != null) {
            model.func_78088_a((Entity)bullet, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void func_76986_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityBullet)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityBullet)entity).type);
    }
}
