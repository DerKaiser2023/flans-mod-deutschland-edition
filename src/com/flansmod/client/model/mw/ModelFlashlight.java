// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelFlashlight extends ModelAttachment
{
    public ModelFlashlight() {
        final int textureX = 16;
        final int textureY = 16;
        this.attachmentModel = new ModelRendererTurbo[3];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-2.0f, -1.0f, -0.5f, 4, 1, 1);
        (this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 2, textureX, textureY)).addBox(-2.5f, -3.0f, -1.0f, 5, 2, 2);
        (this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 6, textureX, textureY)).addBox(2.5f, -3.5f, -1.5f, 1, 3, 3);
    }
}
