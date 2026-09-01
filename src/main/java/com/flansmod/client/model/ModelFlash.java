// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelFlash extends ModelBase
{
    public ModelRendererTurbo[][] flashModel;
    
    public ModelFlash() {
        this.flashModel = new ModelRendererTurbo[0][0];
    }
    
    public void renderFlash(final float f, final int i) {
        if (this.flashModel[i] != null) {
            this.render(this.flashModel[i], f);
        }
    }
    
    public void render(final ModelRendererTurbo[] flash, final float f) {
        for (final ModelRendererTurbo model : flash) {
            if (model != null) {
                model.func_78785_a(f);
            }
        }
    }
    
    protected void flipAll() {
        for (final ModelRendererTurbo[] array : this.flashModel) {
            final ModelRendererTurbo[] model = array;
            for (final ModelRendererTurbo flash : array) {
                flash.doMirror(false, true, true);
                flash.func_78793_a(flash.field_78800_c, -flash.field_78797_d, -flash.field_78798_e);
            }
        }
    }
}
