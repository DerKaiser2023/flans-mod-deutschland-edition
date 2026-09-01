// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.debug;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.AxisAlignedBB;
import com.flansmod.common.FlansMod;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.Render;

public class RenderDebugAABB extends Render
{
    public void doRender(final Entity entity, final double d0, final double d1, final double d2, final float f, final float f1) {
        final EntityDebugAABB ent = (EntityDebugAABB)entity;
        GL11.glDisable(3553);
        GL11.glEnable(3042);
        if (FlansMod.DEBUG) {
            GL11.glColor4f(5.0f, 5.0f, 5.0f, 0.5f);
        }
        else {
            GL11.glColor4f(1.0f, 1.0f, 5.0f, 0.3f);
        }
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d0, (float)d1, (float)d2);
        GL11.glRotatef(-ent.rotationYaw, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(ent.rotationPitch, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(ent.rotationRoll, 0.0f, 0.0f, 1.0f);
        renderAABB(AxisAlignedBB.getBoundingBox((double)ent.offset.x, (double)ent.offset.y, (double)ent.offset.z, (double)(ent.offset.x + ent.vector.x), (double)(ent.offset.y + ent.vector.y), (double)(ent.offset.z + ent.vector.z)));
        GL11.glPopMatrix();
        GL11.glDisable(3042);
        GL11.glEnable(3553);
        GL11.glEnable(2929);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        return null;
    }
}
