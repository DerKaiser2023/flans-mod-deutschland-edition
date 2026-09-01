// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.ww2;

import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelAttachment;

public class ModelZF4Scope extends ModelAttachment
{
    int textureX;
    int textureY;
    
    public ModelZF4Scope() {
        this.textureX = 32;
        this.textureY = 32;
        (this.attachmentModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.attachmentModel[1] = new ModelRendererTurbo(this, 9, 1, this.textureX, this.textureY);
        this.attachmentModel[2] = new ModelRendererTurbo(this, 17, 1, this.textureX, this.textureY);
        this.attachmentModel[3] = new ModelRendererTurbo(this, 1, 9, this.textureX, this.textureY);
        this.attachmentModel[4] = new ModelRendererTurbo(this, 9, 9, this.textureX, this.textureY);
        this.attachmentModel[5] = new ModelRendererTurbo(this, 17, 9, this.textureX, this.textureY);
        this.attachmentModel[6] = new ModelRendererTurbo(this, 25, 9, this.textureX, this.textureY);
        this.attachmentModel[7] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.attachmentModel[0].addShapeBox(-2.0f, -2.0f, -1.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.attachmentModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[1].addShapeBox(1.0f, -2.0f, -1.5f, 1, 2, 1, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.attachmentModel[1].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[2].addShapeBox(-3.0f, -3.0f, -0.5f, 6, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.attachmentModel[2].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[3].addShapeBox(1.0f, -3.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.attachmentModel[3].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[4].addShapeBox(-2.0f, -3.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f, 0.0f, 0.3f, 0.3f);
        this.attachmentModel[4].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[5].addShapeBox(-0.5f, -3.0f, -1.0f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.attachmentModel[5].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[6].addShapeBox(-0.5f, -3.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.attachmentModel[6].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.attachmentModel[7].addShapeBox(1.0f, -2.0f, -1.5f, 1, 2, 1, 0.0f, 3.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 3.0f, -1.5f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f);
        this.attachmentModel[7].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.renderOffset = 0.0f;
        this.flipAll();
    }
}
