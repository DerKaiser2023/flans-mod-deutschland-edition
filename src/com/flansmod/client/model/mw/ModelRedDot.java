// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelRedDot extends ModelAttachment
{
    public ModelRedDot() {
        final int textureX = 128;
        final int textureY = 32;
        this.attachmentModel = new ModelRendererTurbo[5];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-16.0f, 0.0f, -8.0f, 32, 3, 16);
        (this.attachmentModel[1] = new ModelRendererTurbo(this, 96, 0, textureX, textureY)).addBox(15.0f, 3.0f, 7.0f, 1, 14, 1);
        (this.attachmentModel[2] = new ModelRendererTurbo(this, 100, 0, textureX, textureY)).addBox(15.0f, 3.0f, -8.0f, 1, 14, 1);
        (this.attachmentModel[3] = new ModelRendererTurbo(this, 88, 3, textureX, textureY)).addBox(15.0f, 17.0f, -8.0f, 1, 1, 16);
        (this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(15.0f, 9.5f, -0.5f, 1, 1, 1);
    }
}
