// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.debug;

import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;

public class RenderDebugDot extends Render
{
    public void doRender(final Entity entity, final double d0, final double d1, final double d2, final float f, final float f1) {
        if (!FlansMod.DEBUG) {
            return;
        }
        final EntityDebugDot ent = (EntityDebugDot)entity;
        GL11.glDisable(3553);
        GL11.glDisable(2929);
        GL11.glColor3f(ent.red, ent.green, ent.blue);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d0, (float)d1, (float)d2);
        GL11.glPointSize(10.0f);
        GL11.glBegin(0);
        GL11.glVertex3f(0.0f, 0.0f, 0.0f);
        GL11.glEnd();
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glEnable(2929);
    }
    
    protected ResourceLocation getEntityTexture(final Entity p_110775_1_) {
        return null;
    }
}
