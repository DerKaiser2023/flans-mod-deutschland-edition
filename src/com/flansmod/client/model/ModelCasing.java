// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model;

import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelCasing extends ModelBase
{
    public ModelRendererTurbo[] casingModel;
    
    public ModelCasing() {
        this.casingModel = new ModelRendererTurbo[0];
    }
    
    public void renderCasing(final float f) {
        for (final ModelRendererTurbo model : this.casingModel) {
            if (model != null) {
                model.func_78785_a(f);
            }
        }
    }
    
    protected void flipAll() {
        for (final ModelRendererTurbo casing : this.casingModel) {
            casing.doMirror(false, true, true);
            casing.func_78793_a(casing.field_78800_c, -casing.field_78797_d, -casing.field_78798_e);
        }
    }
}
