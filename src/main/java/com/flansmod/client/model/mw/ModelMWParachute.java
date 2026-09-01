// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelMWParachute extends ModelBase
{
    public ModelRendererTurbo backpackModel;
    public ModelRendererTurbo[] parachuteModel;
    
    public ModelMWParachute() {
        this.parachuteModel = new ModelRendererTurbo[6];
        (this.backpackModel = new ModelRendererTurbo(this, 0, 0, 128, 128)).addBox(-4.0f, 26.0f, -6.0f, 8, 12, 2);
        (this.parachuteModel[0] = new ModelRendererTurbo(this, 0, 16, 128, 128)).addTrapezoid(-12.0f, 38.0f, -12.0f, 24, 24, 24, 0.0f, -8.0f, 4);
        (this.parachuteModel[1] = new ModelRendererTurbo(this, 72, 0, 128, 128)).addTrapezoid(-8.0f, 62.0f, -8.0f, 16, 8, 16, 0.0f, 4.0f, 4);
        (this.parachuteModel[2] = new ModelRendererTurbo(this, 0, 64, 128, 128)).addTrapezoid(-8.0f, 70.0f, -8.0f, 16, 4, 16, 0.0f, -4.0f, 5);
        this.parachuteModel[3] = new ModelRendererTurbo(this, 0, 16, 128, 128);
        this.parachuteModel[3].flip = true;
        this.parachuteModel[3].addTrapezoid(-12.0f, 38.0f, -12.0f, 24, 24, 24, 0.0f, -8.0f, 4);
        this.parachuteModel[4] = new ModelRendererTurbo(this, 72, 0, 128, 128);
        this.parachuteModel[4].flip = true;
        this.parachuteModel[4].addTrapezoid(-8.0f, 62.0f, -8.0f, 16, 8, 16, 0.0f, 4.0f, 4);
        this.parachuteModel[5] = new ModelRendererTurbo(this, 0, 64, 128, 128);
        this.parachuteModel[5].flip = true;
        this.parachuteModel[5].addTrapezoid(-8.0f, 70.0f, -8.0f, 16, 4, 16, 0.0f, -4.0f, 5);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        this.backpackModel.render(f5);
        for (final ModelRendererTurbo part : this.parachuteModel) {
            part.render(f5);
        }
    }
}
