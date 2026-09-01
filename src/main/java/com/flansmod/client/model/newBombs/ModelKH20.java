// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.newBombs;

import net.minecraft.entity.Entity;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;

public class ModelKH20 extends ModelBase
{
    int textureX;
    int textureY;
    public ModelRendererTurbo[] kh20Model;
    
    public ModelKH20() {
        this.textureX = 512;
        this.textureY = 512;
        (this.kh20Model = new ModelRendererTurbo[34])[0] = new ModelRendererTurbo(this, 1, 1, this.textureX, this.textureY);
        this.kh20Model[1] = new ModelRendererTurbo(this, 33, 1, this.textureX, this.textureY);
        this.kh20Model[2] = new ModelRendererTurbo(this, 65, 1, this.textureX, this.textureY);
        this.kh20Model[3] = new ModelRendererTurbo(this, 97, 1, this.textureX, this.textureY);
        this.kh20Model[4] = new ModelRendererTurbo(this, 129, 1, this.textureX, this.textureY);
        this.kh20Model[5] = new ModelRendererTurbo(this, 161, 1, this.textureX, this.textureY);
        this.kh20Model[6] = new ModelRendererTurbo(this, 193, 1, this.textureX, this.textureY);
        this.kh20Model[7] = new ModelRendererTurbo(this, 225, 1, this.textureX, this.textureY);
        this.kh20Model[8] = new ModelRendererTurbo(this, 257, 1, this.textureX, this.textureY);
        this.kh20Model[9] = new ModelRendererTurbo(this, 289, 1, this.textureX, this.textureY);
        this.kh20Model[10] = new ModelRendererTurbo(this, 321, 1, this.textureX, this.textureY);
        this.kh20Model[11] = new ModelRendererTurbo(this, 353, 1, this.textureX, this.textureY);
        this.kh20Model[12] = new ModelRendererTurbo(this, 385, 1, this.textureX, this.textureY);
        this.kh20Model[13] = new ModelRendererTurbo(this, 417, 1, this.textureX, this.textureY);
        this.kh20Model[14] = new ModelRendererTurbo(this, 449, 1, this.textureX, this.textureY);
        this.kh20Model[15] = new ModelRendererTurbo(this, 481, 1, this.textureX, this.textureY);
        this.kh20Model[16] = new ModelRendererTurbo(this, 257, 25, this.textureX, this.textureY);
        this.kh20Model[17] = new ModelRendererTurbo(this, 289, 25, this.textureX, this.textureY);
        this.kh20Model[18] = new ModelRendererTurbo(this, 321, 25, this.textureX, this.textureY);
        this.kh20Model[19] = new ModelRendererTurbo(this, 353, 25, this.textureX, this.textureY);
        this.kh20Model[20] = new ModelRendererTurbo(this, 385, 25, this.textureX, this.textureY);
        this.kh20Model[21] = new ModelRendererTurbo(this, 417, 25, this.textureX, this.textureY);
        this.kh20Model[22] = new ModelRendererTurbo(this, 449, 25, this.textureX, this.textureY);
        this.kh20Model[23] = new ModelRendererTurbo(this, 481, 25, this.textureX, this.textureY);
        this.kh20Model[24] = new ModelRendererTurbo(this, 257, 49, this.textureX, this.textureY);
        this.kh20Model[25] = new ModelRendererTurbo(this, 1, 57, this.textureX, this.textureY);
        this.kh20Model[26] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
        this.kh20Model[27] = new ModelRendererTurbo(this, 33, 57, this.textureX, this.textureY);
        this.kh20Model[28] = new ModelRendererTurbo(this, 153, 65, this.textureX, this.textureY);
        this.kh20Model[29] = new ModelRendererTurbo(this, 97, 33, this.textureX, this.textureY);
        this.kh20Model[30] = new ModelRendererTurbo(this, 65, 57, this.textureX, this.textureY);
        this.kh20Model[31] = new ModelRendererTurbo(this, 289, 73, this.textureX, this.textureY);
        this.kh20Model[32] = new ModelRendererTurbo(this, 161, 57, this.textureX, this.textureY);
        this.kh20Model[33] = new ModelRendererTurbo(this, 177, 57, this.textureX, this.textureY);
        this.kh20Model[0].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[0].setRotationPoint(0.0f, -45.0f, 6.0f);
        this.kh20Model[1].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[1].setRotationPoint(0.0f, -45.0f, -6.0f);
        this.kh20Model[2].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[2].setRotationPoint(6.0f, -45.0f, 0.0f);
        this.kh20Model[3].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[3].setRotationPoint(-6.0f, -45.0f, 0.0f);
        this.kh20Model[4].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[4].setRotationPoint(-6.0f, -45.0f, -6.0f);
        this.kh20Model[5].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f);
        this.kh20Model[5].setRotationPoint(-6.0f, -45.0f, 6.0f);
        this.kh20Model[6].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[6].setRotationPoint(6.0f, -45.0f, 6.0f);
        this.kh20Model[7].addShapeBox(0.0f, 0.0f, 0.0f, 6, 49, 6, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[7].setRotationPoint(6.0f, -45.0f, -6.0f);
        this.kh20Model[8].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f);
        this.kh20Model[8].setRotationPoint(0.0f, 4.0f, 6.0f);
        this.kh20Model[9].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -5.5f, 0.0f, -5.5f);
        this.kh20Model[9].setRotationPoint(-6.0f, 4.0f, 6.0f);
        this.kh20Model[10].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f, 0.0f, -5.0f);
        this.kh20Model[10].setRotationPoint(6.0f, 4.0f, 6.0f);
        this.kh20Model[11].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[11].setRotationPoint(0.0f, 4.0f, -6.0f);
        this.kh20Model[12].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[12].setRotationPoint(6.0f, 4.0f, 0.0f);
        this.kh20Model[13].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.kh20Model[13].setRotationPoint(-6.0f, 4.0f, 0.0f);
        this.kh20Model[14].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f);
        this.kh20Model[14].setRotationPoint(-6.0f, 4.0f, -6.0f);
        this.kh20Model[15].addShapeBox(0.0f, 0.0f, 0.0f, 6, 17, 6, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -5.5f, 0.0f, -5.5f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[15].setRotationPoint(6.0f, 4.0f, -6.0f);
        this.kh20Model[16].addShapeBox(0.0f, 0.0f, 0.0f, 6, 11, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f);
        this.kh20Model[16].setRotationPoint(0.0f, 15.0f, 0.0f);
        this.kh20Model[17].addShapeBox(0.0f, 0.0f, 0.0f, 6, 35, 6, 0.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[17].setRotationPoint(0.0f, -102.0f, 0.0f);
        this.kh20Model[18].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[18].setRotationPoint(6.0f, -107.0f, 6.0f);
        this.kh20Model[19].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[19].setRotationPoint(6.0f, -107.0f, 0.0f);
        this.kh20Model[20].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, 0.0f, 0.0f, -5.0f, -5.5f, 0.0f, -5.5f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[20].setRotationPoint(6.0f, -107.0f, -6.0f);
        this.kh20Model[21].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[21].setRotationPoint(0.0f, -107.0f, -6.0f);
        this.kh20Model[22].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, -5.5f, 0.0f, -5.5f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[22].setRotationPoint(-6.0f, -107.0f, -6.0f);
        this.kh20Model[23].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[23].setRotationPoint(-6.0f, -107.0f, 0.0f);
        this.kh20Model[24].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, -5.5f, 0.0f, -5.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, -2.0f);
        this.kh20Model[24].setRotationPoint(-6.0f, -107.0f, 6.0f);
        this.kh20Model[25].addShapeBox(0.0f, 0.0f, 0.0f, 6, 62, 6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, -5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[25].setRotationPoint(0.0f, -107.0f, 6.0f);
        this.kh20Model[26].addShapeBox(0.0f, 0.0f, 0.0f, 6, 8, 6, 0.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, -3.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[26].setRotationPoint(0.0f, -88.0f, 0.0f);
        this.kh20Model[27].addShapeBox(0.0f, 0.0f, 0.0f, 1, 35, 55, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -52.0f, 0.0f, 0.0f, -52.0f, 0.0f);
        this.kh20Model[27].setRotationPoint(2.0f, -31.0f, 12.0f);
        this.kh20Model[28].addShapeBox(0.0f, 0.0f, 0.0f, 1, 35, 55, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 28.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -52.0f, 0.0f, 0.0f, -52.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[28].setRotationPoint(2.0f, -31.0f, -61.0f);
        this.kh20Model[29].addShapeBox(0.0f, 0.0f, 0.0f, 1, 24, 28, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f);
        this.kh20Model[29].setRotationPoint(1.0f, -94.0f, 7.0f);
        this.kh20Model[30].addShapeBox(0.0f, 0.0f, 0.0f, 2, 18, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[30].setRotationPoint(0.5f, -105.0f, 34.0f);
        this.kh20Model[31].addShapeBox(0.0f, 0.0f, 0.0f, 1, 24, 28, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[31].setRotationPoint(1.0f, -94.0f, -29.0f);
        this.kh20Model[32].addShapeBox(0.0f, 0.0f, 0.0f, 2, 18, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.kh20Model[32].setRotationPoint(0.5f, -105.0f, -30.0f);
        this.kh20Model[33].addShapeBox(0.0f, 0.0f, 0.0f, 11, 24, 1, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 11.0f, 0.0f, 0.0f, -25.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -25.0f, 0.0f);
        this.kh20Model[33].setRotationPoint(-13.0f, -94.0f, 2.5f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < 34; ++i) {
            this.kh20Model[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
    }
}
