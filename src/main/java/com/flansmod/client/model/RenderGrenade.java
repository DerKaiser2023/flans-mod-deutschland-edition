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
        this.field_76989_e = 0.1f;
    }
    
    public void render(final EntityGrenade grenade, final double d, final double d1, final double d2, final float f, final float f1) {
        this.func_110777_b((Entity)grenade);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        if (grenade.stuck) {
            GL11.glRotatef(180.0f - grenade.axes.getYaw(), 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(grenade.axes.getPitch(), 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(grenade.axes.getRoll(), 1.0f, 0.0f, 0.0f);
        }
        else {
            float dYaw;
            for (dYaw = grenade.axes.getYaw() - grenade.field_70126_B; dYaw > 180.0f; dYaw -= 360.0f) {}
            while (dYaw <= -180.0f) {
                dYaw += 360.0f;
            }
            float dPitch;
            for (dPitch = grenade.axes.getPitch() - grenade.field_70127_C; dPitch > 180.0f; dPitch -= 360.0f) {}
            while (dPitch <= -180.0f) {
                dPitch += 360.0f;
            }
            float dRoll;
            for (dRoll = grenade.axes.getRoll() - grenade.prevRotationRoll; dRoll > 180.0f; dRoll -= 360.0f) {}
            while (dRoll <= -180.0f) {
                dRoll += 360.0f;
            }
            GL11.glRotatef(180.0f - grenade.field_70126_B - dYaw * f1, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(grenade.field_70127_C + dPitch * f1, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(grenade.prevRotationRoll + dRoll * f1, 1.0f, 0.0f, 0.0f);
        }
        final ModelBase model = grenade.type.model;
        if (model != null) {
            model.func_78088_a((Entity)grenade, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void func_76986_a(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.render((EntityGrenade)entity, d, d1, d2, f, f1);
    }
    
    protected ResourceLocation func_110775_a(final Entity entity) {
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
                return item != null && item.func_77973_b() instanceof ItemGrenade && ((ItemGrenade)item.func_77973_b()).type.model != null;
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
        if (item != null && item.func_77973_b() instanceof ItemGrenade) {
            final GrenadeType grenadeType = ((ItemGrenade)item.func_77973_b()).type;
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
                Minecraft.func_71410_x().field_71446_o.func_110577_a(FlansModResourceHandler.getTexture(grenadeType));
                final ModelBase model = grenadeType.model;
                model.func_78088_a((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
            }
        }
        GL11.glPopMatrix();
    }
}
