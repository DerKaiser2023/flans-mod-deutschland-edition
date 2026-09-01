// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelBullet extends ModelBase
{
    public ModelRenderer bulletModel;
    
    public ModelBullet() {
        (this.bulletModel = new ModelRenderer((ModelBase)this, 0, 0)).func_78789_a(-0.5f, -1.5f, -0.5f, 1, 3, 1);
    }
    
    public void func_78088_a(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        GL11.glTranslatef(-0.0f, 2.0f, 0.0f);
        this.bulletModel.func_78785_a(f5);
    }
}
