// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMechaTool extends ModelBase
{
    public ModelRendererTurbo[] baseModel;
    public ModelRendererTurbo[] drillModel;
    public ModelRendererTurbo[] sawModel;
    
    public ModelMechaTool() {
        this.baseModel = new ModelRendererTurbo[0];
        this.drillModel = new ModelRendererTurbo[0];
        this.sawModel = new ModelRendererTurbo[0];
    }
    
    public void render(final EntityMecha mecha, final float f1) {
        final float f2 = 0.0625f;
        for (final ModelRendererTurbo model : this.baseModel) {
            model.render(f2);
        }
    }
    
    public void renderDrill(final EntityMecha mecha, final float f1) {
        final float f2 = 0.0625f;
        for (final ModelRendererTurbo model : this.drillModel) {
            model.render(f2);
        }
    }
    
    public void renderSaw(final EntityMecha mecha, final float f1, final boolean spin) {
        final float f2 = 0.0625f;
        for (final ModelRendererTurbo model : this.sawModel) {
            GL11.glPushMatrix();
            if (spin) {
                GL11.glTranslatef(model.rotationPointX / 16.0f, model.rotationPointY / 16.0f, model.rotationPointZ / 16.0f);
                GL11.glRotatef(25.0f * mecha.ticksExisted, 0.0f, 1.0f, 0.0f);
                GL11.glTranslatef(-model.rotationPointX / 16.0f, -model.rotationPointY / 16.0f, -model.rotationPointZ / 16.0f);
            }
            model.render(f2);
            GL11.glPopMatrix();
        }
    }
}
