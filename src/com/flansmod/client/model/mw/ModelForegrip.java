// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelForegrip extends ModelAttachment
{
    public ModelForegrip() {
        final int textureX = 16;
        final int textureY = 8;
        this.attachmentModel = new ModelRendererTurbo[2];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-2.0f, -1.0f, -1.0f, 4, 1, 2);
        (this.attachmentModel[1] = new ModelRendererTurbo(this, 10, 1, textureX, textureY)).addBox(-1.0f, -6.0f, -1.0f, 2, 5, 2);
    }
}
