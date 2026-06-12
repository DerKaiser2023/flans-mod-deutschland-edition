// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.guns.EntityAAGun;
import net.minecraft.client.renderer.entity.Render;

public class RenderAAGun extends Render
{
    public RenderAAGun() {
        this.field_76989_e = 1.0f;
    }
    
    public void render(final EntityAAGun aa, final double d, final double d1, final double d2, final float f, final float f1) {
        if (aa.field_70154_o != null && aa.field_70154_o.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0) {
            return;
        }
        this.func_110777_b((Entity)aa);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        float dYaw;
        for (dYaw = aa.gunYaw - aa.prevGunYaw; dYaw > 180.0f; dYaw -= 360.0f) {}
        while (dYaw <= -180.0f) {
            dYaw += 360.0f;
        }
        final ModelAAGun modelAAGun = aa.type.model;
        if (modelAAGun != null) {
            modelAAGun.renderBase(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, aa);
            GL11.glRotatef(180.0f - (aa.prevGunYaw + dYaw * f1), 0.0f, 1.0f, 0.0f);
            modelAAGun.renderGun(0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f, aa);
        }
        GL11.glPopMatrix();
    }
    
    public void func_76986_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityAAGun)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
        return FlansModResourceHandler.getTexture(((EntityAAGun)entity).type);
    }
}
