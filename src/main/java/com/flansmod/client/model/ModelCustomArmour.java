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
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        GL11.glPushMatrix();
        GL11.glScalef(this.type.modelScale, this.type.modelScale, this.type.modelScale);
        this.isSneak = entity.isSneaking();
        final ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        this.heldItemRight = ((itemstack != null) ? 1 : 0);
        if (entity.isInvisible() && !this.type.playermodel) {
            GL11.glScalef(1.0E-4f, 1.0E-4f, 1.0E-4f);
        }
        if (Minecraft.getMinecraft().entityRenderer.isShaderActive()) {
            GL11.glColor4f(5.0f, 5.0f, 5.0f, 100.0f);
        }
        this.aimedBow = false;
        if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0) {
            final EnumAction enumaction = itemstack.getItemUseAction();
            if (enumaction == EnumAction.block) {
                this.heldItemRight = 3;
            }
            else if (enumaction == EnumAction.bow) {
                this.aimedBow = true;
            }
        }
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.render(this.headModel, this.bipedHead, f5, this.type.modelScale);
        this.render(this.bodyModel, this.bipedBody, f5, this.type.modelScale);
        this.render(this.leftArmModel, this.bipedLeftArm, f5, this.type.modelScale);
        this.render(this.rightArmModel, this.bipedRightArm, f5, this.type.modelScale);
        this.render(this.leftLegModel, this.bipedLeftLeg, f5, this.type.modelScale);
        this.render(this.rightLegModel, this.bipedRightLeg, f5, this.type.modelScale);
        for (final ModelRendererTurbo mod : this.skirtFrontModel) {
            mod.rotationPointX = (this.bipedLeftLeg.rotationPointX + this.bipedRightLeg.rotationPointX) / 2.0f / this.type.modelScale;
            mod.rotationPointY = (this.bipedLeftLeg.rotationPointY + this.bipedRightLeg.rotationPointY) / 2.0f / this.type.modelScale;
            mod.rotationPointZ = (this.bipedLeftLeg.rotationPointZ + this.bipedRightLeg.rotationPointZ) / 2.0f / this.type.modelScale;
            mod.rotateAngleX = Math.min(this.bipedLeftLeg.rotateAngleX, this.bipedRightLeg.rotateAngleX);
            mod.rotateAngleY = this.bipedLeftLeg.rotateAngleY;
            mod.rotateAngleZ = this.bipedLeftLeg.rotateAngleZ;
            mod.render(f5);
        }
        for (final ModelRendererTurbo mod : this.skirtRearModel) {
            mod.rotationPointX = (this.bipedLeftLeg.rotationPointX + this.bipedRightLeg.rotationPointX) / 2.0f / this.type.modelScale;
            mod.rotationPointY = (this.bipedLeftLeg.rotationPointY + this.bipedRightLeg.rotationPointY) / 2.0f / this.type.modelScale;
            mod.rotationPointZ = (this.bipedLeftLeg.rotationPointZ + this.bipedRightLeg.rotationPointZ) / 2.0f / this.type.modelScale;
            mod.rotateAngleX = Math.max(this.bipedLeftLeg.rotateAngleX, this.bipedRightLeg.rotateAngleX);
            mod.rotateAngleY = this.bipedLeftLeg.rotateAngleY;
            mod.rotateAngleZ = this.bipedLeftLeg.rotateAngleZ;
            mod.render(f5);
        }
        GL11.glPopMatrix();
    }
    
    public void render(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float f5, final float scale) {
        this.setBodyPart(models, bodyPart, scale);
        for (final ModelRendererTurbo mod : models) {
            mod.rotateAngleX = bodyPart.rotateAngleX;
            mod.rotateAngleY = bodyPart.rotateAngleY;
            mod.rotateAngleZ = bodyPart.rotateAngleZ;
            mod.render(f5);
        }
    }
    
    public void setBodyPart(final ModelRendererTurbo[] models, final ModelRenderer bodyPart, final float scale) {
        for (final ModelRendererTurbo mod : models) {
            mod.rotationPointX = bodyPart.rotationPointX / scale;
            mod.rotationPointY = bodyPart.rotationPointY / scale;
            mod.rotationPointZ = bodyPart.rotationPointZ / scale;
        }
    }
}
