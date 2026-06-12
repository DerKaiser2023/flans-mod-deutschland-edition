// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import net.minecraft.client.model.ModelBiped;

public class ModelCustomArmour extends ModelBiped
{
    public ArmourType type;
    public ModelRendererTurbo[] headModel;
    public ModelRendererTurbo[] bodyModel;
    public ModelRendererTurbo[] leftArmModel;
    public ModelRendererTurbo[] rightArmModel;
    public ModelRendererTurbo[] leftLegModel;
    public ModelRendererTurbo[] rightLegModel;
    public ModelRendererTurbo[] skirtFrontModel;
    public ModelRendererTurbo[] skirtRearModel;
    
    public ModelCustomArmour() {
        this.headModel = new ModelRendererTurbo[0];
        this.bodyModel = new ModelRendererTurbo[0];
        this.leftArmModel = new ModelRendererTurbo[0];
        this.rightArmModel = new ModelRendererTurbo[0];
        this.leftLegModel = new ModelRendererTurbo[0];
        this.rightLegModel = new ModelRendererTurbo[0];
        this.skirtFrontModel = new ModelRendererTurbo[0];
        this.skirtRearModel = new ModelRendererTurbo[0];
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.type.modelScale, this.type.modelScale, this.type.modelScale);
        this.field_78117_n = entity.func_70093_af();
        final ItemStack itemstack = ((EntityLivingBase)entity).func_71124_b(0);
        this.field_78120_m = ((itemstack != null) ? 1 : 0);
        if (entity.func_82150_aj() && !this.type.playermodel) {
            GL11.glScalef(1.0E-4f, 1.0E-4f, 1.0E-4f);
        }
        if (Minecraft.func_71410_x().field_71460_t.func_147702_a()) {
            GL11.glColor4f(5.0f, 5.0f, 5.0f, 100.0f);
        }
        this.field_78118_o = false;
        if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).func_71052_bv() > 0) {
            final EnumAction enumaction = itemstack.func_77975_n();
            if (enumaction == EnumAction.block) {
                this.field_78120_m = 3;
            }
            else if (enumaction == EnumAction.bow) {
                this.field_78118_o = true;
            }
        }
        this.func_78087_a(f, f1, f2, f3, f4, f5, entity);
        this.render(this.headModel, this.field_78116_c, f5, this.type.modelScale);
        this.render(this.bodyModel, this.field_78115_e, f5, this.type.modelScale);
        this.render(this.leftArmModel, this.field_78113_g, f5, this.type.modelScale);
        this.render(this.rightArmModel, this.field_78112_f, f5, this.type.modelScale);
        this.render(this.leftLegModel, this.field_78124_i, f5, this.type.modelScale);
        this.render(this.rightLegModel, this.field_78123_h, f5, this.type.modelScale);
        for (final ModelRendererTurbo mod : this.skirtFrontModel) {
            mod.field_78800_c = (this.field_78124_i.field_78800_c + this.field_78123_h.field_78800_c) / 2.0f / this.type.modelScale;
            mod.field_78797_d = (this.field_78124_i.field_78797_d + this.field_78123_h.field_78797_d) / 2.0f / this.type.modelScale;
            mod.field_78798_e = (this.field_78124_i.field_78798_e + this.field_78123_h.field_78798_e) / 2.0f / this.type.modelScale;
            mod.field_78795_f = Math.min(this.field_78124_i.field_78795_f, this.field_78123_h.field_78795_f);
            mod.field_78796_g = this.field_78124_i.field_78796_g;
            mod.field_78808_h = this.field_78124_i.field_78808_h;
            mod.func_78785_a(f5);
        }
        for (final ModelRendererTurbo mod : this.skirtRearModel) {
            mod.field_78800_c = (this.field_78124_i.field_78800_c + this.field_78123_h.field_78800_c) / 2.0f / this.type.modelScale;
            mod.field_78797_d = (this.field_78124_i.field_78797_d + this.field_78123_h.field_78797_d) / 2.0f / this.type.modelScale;
            mod.field_78798_e = (this.field_78124_i.field_78798_e + this.field_78123_h.field_78798_e) / 2.0f / this.type.modelScale;
            mod.field_78795_f = Math.max(this.field_78124_i.field_78795_f, this.field_78123_h.field_78795_f);
            mod.field_78796_g = this.field_78124_i.field_78796_g;
            mod.field_78808_h = this.field_78124_i.field_78808_h;
            mod.func_78785_a(f5);
        }
        GL11.glPopMatrix();
    }
    
    public void render(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float f5, final float scale) {
        this.setBodyPart(models, bodyPart, scale);
        for (final ModelRendererTurbo mod : models) {
            mod.field_78795_f = bodyPart.field_78795_f;
            mod.field_78796_g = bodyPart.field_78796_g;
            mod.field_78808_h = bodyPart.field_78808_h;
            mod.func_78785_a(f5);
        }
    }
    
    public void setBodyPart(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float scale) {
        for (final ModelRendererTurbo mod : models) {
            mod.field_78800_c = bodyPart.field_78800_c / scale;
            mod.field_78797_d = bodyPart.field_78797_d / scale;
            mod.field_78798_e = bodyPart.field_78798_e / scale;
        }
    }
}
