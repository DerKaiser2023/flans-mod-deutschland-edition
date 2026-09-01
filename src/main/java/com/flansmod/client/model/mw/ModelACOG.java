// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelACOG extends ModelAttachment
{
    public ModelACOG() {
        final int textureX = 128;
        final int textureY = 128;
        this.attachmentModel = new ModelRendererTurbo[6];
        (this.attachmentModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY)).addBox(-16.0f, 0.0f, -6.0f, 32, 3, 12);
        (this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 111, textureX, textureY)).addBox(-16.0f, 3.0f, -8.0f, 32, 1, 16);
        (this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 77, textureX, textureY)).addBox(-16.0f, 20.0f, -8.0f, 32, 1, 16);
        (this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 94, textureX, textureY)).addBox(-16.0f, 4.0f, -9.0f, 32, 16, 1);
        (this.attachmentModel[4] = new ModelRendererTurbo(this, 0, 60, textureX, textureY)).addBox(-16.0f, 4.0f, 8.0f, 32, 16, 1);
        (this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 19, textureX, textureY)).addBox(-15.0f, 10.5f, -1.5f, 30, 3, 3);
        this.renderOffset = 0.0f;
    }
}
