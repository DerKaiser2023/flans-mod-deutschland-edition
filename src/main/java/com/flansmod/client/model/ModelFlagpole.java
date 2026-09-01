// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelFlagpole extends ModelBase
{
    public ModelRenderer[] poleModel;
    public ModelRenderer[] flagModel;
    
    public ModelFlagpole() {
        (this.poleModel = new ModelRenderer[3])[0] = new ModelRenderer((ModelBase)this, 0, 16);
        this.poleModel[1] = new ModelRenderer((ModelBase)this, 0, 16);
        this.poleModel[2] = new ModelRenderer((ModelBase)this, 0, 20);
        this.poleModel[0].addBox(-48.0f, -1.0f, -1.0f, 24, 2, 2, 0.0f);
        this.poleModel[1].addBox(-24.0f, -1.0f, -1.0f, 24, 2, 2, 0.0f);
        this.poleModel[2].addBox(-2.0f, -2.0f, -2.0f, 4, 2, 4, 0.0f);
        this.poleModel[0].rotateAngleZ = 1.5707964f;
        this.poleModel[1].rotateAngleZ = 1.5707964f;
        this.flagModel = new ModelRenderer[1];
        (this.flagModel[0] = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-8.0f, -16.0f, 0.0f, 16, 16, 0, 0.0f);
        this.flagModel[0].setRotationPoint(8.0f, 0.0f, 0.0f);
    }
    
    public void renderPole(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityFlagpole entityflag) {
        for (final ModelRenderer model : this.poleModel) {
            model.render(f5);
        }
    }
    
    public void renderFlag(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final EntityFlag entityflag) {
        for (final ModelRenderer model : this.flagModel) {
            model.render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
