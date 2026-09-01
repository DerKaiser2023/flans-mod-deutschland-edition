// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelSilencer extends ModelAttachment
{
    public ModelSilencer() {
        final int textureX = 16;
        final int textureY = 4;
        this.attachmentModel = new ModelRendererTurbo[1];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(0.0f, -1.0f, -1.0f, 6, 2, 2);
    }
}
