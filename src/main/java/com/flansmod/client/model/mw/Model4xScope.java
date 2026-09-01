// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class Model4xScope extends ModelAttachment
{
    int textureX;
    int textureY;
    
    public Model4xScope() {
        this.textureX = 32;
        this.textureY = 32;
        (this.attachmentModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 0, 10, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 0, 15, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 9, 15, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 0, 20, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 0, 20, this.textureX, this.textureY);
        this.attachmentModel[0].addBox(0.0f, 0.0f, 0.0f, 9, 1, 1, 0.0f);
        this.attachmentModel[0].setRotationPoint(-4.0f, -2.0f, -0.5f);
        this.attachmentModel[1].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.attachmentModel[1].setRotationPoint(-2.0f, -1.0f, -0.5f);
        this.attachmentModel[2].addBox(0.0f, 0.0f, 0.0f, 1, 2, 1, 0.0f);
        this.attachmentModel[2].setRotationPoint(2.0f, -1.0f, -0.5f);
        this.attachmentModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.attachmentModel[3].setRotationPoint(-5.0f, -2.5f, -1.0f);
        this.attachmentModel[4].addBox(0.0f, 0.0f, 0.0f, 2, 2, 2, 0.0f);
        this.attachmentModel[4].setRotationPoint(4.0f, -2.5f, -1.0f);
        this.attachmentModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[5].setRotationPoint(-1.0f, -2.5f, -0.5f);
        this.attachmentModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 1, 1, 0.0f);
        this.attachmentModel[6].setRotationPoint(-1.0f, -2.0f, -1.0f);
        this.renderOffset = 0.0f;
        this.flipAll();
    }
}
