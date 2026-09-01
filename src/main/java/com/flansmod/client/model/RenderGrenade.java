// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.guns.GrenadeType;
import net.minecraft.client.Minecraft;
import com.flansmod.common.guns.ItemGrenade;
import net.minecraft.item.ItemStack;
import com.flansmod.common.types.InfoType;
import com.flansmod.client.FlansModResourceHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.common.guns.EntityGrenade;
import net.minecraftforge.client.IItemRenderer;
import net.minecraft.client.renderer.entity.Render;

public class RenderGrenade extends Render implements IItemRenderer
{
    public RenderGrenade() {
        this.shadowSize = 0.1f;
    }
    
    public void render(final EntityGrenade grenade, final double d, final double d1, final double d2, final float f, final float f1) {
        this.bindEntityTexture((Entity)grenade);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        if (grenade.stuck) {
            GL11.glRotatef(180.0f - grenade.axes.getYaw(), 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(grenade.axes.getPitch(), 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(grenade.axes.getRoll(), 1.0f, 0.0f, 0.0f);
        }
        else {
            float dYaw;
            for (dYaw = grenade.axes.getYaw() - grenade.prevRotationYaw; dYaw > 180.0f; dYaw -= 360.0f) {}
            while (dYaw <= -180.0f) {
                dYaw += 360.0f;
            }
            float dPitch;
            for (dPitch = grenade.axes.getPitch() - grenade.prevRotationPitch; dPitch > 180.0f; dPitch -= 360.0f) {}
            while (dPitch <= -180.0f) {
                dPitch += 360.0f;
            }
            float dRoll;
            for (dRoll = grenade.axes.getRoll() - grenade.prevRotationRoll; dRoll > 180.0f; dRoll -= 360.0f) {}
            while (dRoll <= -180.0f) {
                dRoll += 360.0f;
            }
            GL11.glRotatef(180.0f - grenade.prevRotationYaw - dYaw * f1, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(grenade.prevRotationPitch + dPitch * f1, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(grenade.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
        }
        final ModelBase model = grenade.type.model;
        if (model != null) {
            model.render((Entity)grenade, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityGrenade)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation getEntityTexture(final Entity entity) {
        final ResourceLocation texture = FlansModResourceHandler.getTexture(((EntityGrenade)entity).type);
        if (texture == null) {
            return FlansModResourceHandler.getIcon(((EntityGrenade)entity).type);
        }
        return texture;
    }
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
            case EQUIPPED_FIRST_PERSON: {
                return item != null && item.getItem() instanceof ItemGrenade && ((ItemGrenade)item.getItem()).type.model != null;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return false;
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack item, final Object... data) {
        GL11.glPushMatrix();
        if (item != null && item.getItem() instanceof ItemGrenade) {
            final GrenadeType grenadeType = ((ItemGrenade)item.getItem()).type;
            if (grenadeType.model != null) {
                switch (type) {
                    case EQUIPPED: {
                        GL11.glRotatef(35.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.75f, -0.22f, -0.08f);
                        GL11.glTranslatef(0.0f, 0.25f, 0.0f);
                        break;
                    }
                    case EQUIPPED_FIRST_PERSON: {
                        GL11.glRotatef(25.0f, 0.0f, 0.0f, 1.0f);
                        GL11.glRotatef(-5.0f, 0.0f, 1.0f, 0.0f);
                        GL11.glTranslatef(0.15f, 0.2f, -0.6f);
                        GL11.glTranslatef(0.0f, 0.25f, 0.0f);
                        break;
                    }
                }
                Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(grenadeType));
                final ModelBase model = grenadeType.model;
                model.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
            }
        }
        GL11.glPopMatrix();
    }
}
