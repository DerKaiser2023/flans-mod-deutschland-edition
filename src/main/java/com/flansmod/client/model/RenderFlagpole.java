// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import com.flansmod.common.teams.EntityFlagpole;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.Render;

public class RenderFlagpole extends Render
{
    private static final ResourceLocation texture;
    public ModelFlagpole modelFlagpole;
    
    public RenderFlagpole() {
        this.modelFlagpole = new ModelFlagpole();
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.bindEntityTexture(entity);
        final EntityFlagpole flagpole = (EntityFlagpole)entity;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glRotatef(f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(-1.0f, -1.0f, 1.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.modelFlagpole.renderPole(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, flagpole);
        GL11.glPopMatrix();
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return RenderFlagpole.texture;
    }
    
    static {
        texture = new ResourceLocation("flansmod", "teamsMod/Flagpole.png");
    }
}
