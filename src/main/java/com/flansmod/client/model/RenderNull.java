// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.util.AxisAlignedBB;
import org.lwjgl.opengl.GL11;
import com.flansmod.common.FlansMod;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.Render;

public class RenderNull extends Render
{
    private static final ResourceLocation texture;
    protected ModelBase model;
    
    public RenderNull() {
        this.field_76989_e = 0.0f;
    }
    
    public void func_157_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
    }
    
    public void func_76986_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        if (FlansMod.DEBUG) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)d, (float)d1, (float)d2);
            GL11.glRotatef(-entity.field_70177_z, 0.0f, 1.0f, 0.0f);
            GL11.glDisable(3553);
            GL11.glEnable(3042);
            GL11.glColor4f(0.0f, 0.0f, 1.0f, 0.3f);
            GL11.glScalef(-1.0f, 1.0f, -1.0f);
            func_76980_a(AxisAlignedBB.func_72330_a(-0.25, -0.25, -0.25, 0.25, 0.25, 0.25));
            GL11.glEnable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.glPopMatrix();
        }
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
        return RenderNull.texture;
    }
    
    static {
        texture = new ResourceLocation("Flan", "null.png");
    }
}
