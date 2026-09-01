// 
// Decompiled by Procyon v0.6.0
// 

package com.flansmod.client.model.mw;

import com.flansmod.client.tmt.Shape2D;
import com.flansmod.client.tmt.Coord2D;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelPlane;

public class ModelYF23 extends ModelPlane
{
    int textureX;
    int textureY;
    
    public ModelYF23() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[33])[0] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo(this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 6, 7, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 1.8f, 0.0f, 0.0f, -6.8f, 0.0f, -5.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -5.85f, -6.85f);
        this.bodyModel[0].setRotationPoint(-207.0f, -21.5f, 0.0f);
        this.bodyModel[1].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 6, 7, 0.0f, 0.0f, -5.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -2.0f, 0.0f, -5.85f, -6.85f, 0.1f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, 0.6f, 0.0f, 0.0f, -6.8f);
        this.bodyModel[1].setRotationPoint(-207.0f, -27.5f, 0.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 13, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -4.2f, 0.0f, -2.0f, 0.0f, 0.0f, -0.5f, -6.0f, 0.0f, -2.0f, -4.5f, 0.0f, -4.0f, -6.0f);
        this.bodyModel[2].setRotationPoint(-190.0f, -21.5f, 0.0f);
        this.bodyModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(12.0, 0.0, 12, 0), new Coord2D(6.0, 18.0, 6, 18) }), 1.0f, 18, 18, 50, 1, 0, new float[] { 19.0f, 19.0f, 12.0f });
        this.bodyModel[3].setRotationPoint(-172.0f, -15.0f, -6.0f);
        this.bodyModel[3].rotateAngleX = 1.4876488f;
        this.bodyModel[3].rotateAngleY = -1.5707964f;
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 13, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 1.5f, -8.0f, 0.0f, -3.0f, -8.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.5f, 0.0f, 0.0f, -2.5f, -2.5f, 0.0f, -2.0f, -5.4f);
        this.bodyModel[4].setRotationPoint(-190.0f, -29.5f, 0.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 43, 2, 12, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 3.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(-172.0f, -15.0f, -6.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 43, 8, 13, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, -3.0f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, -7.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, -3.0f, 0.0f, -1.0f, -6.0f, 0.0f, -2.0f, -10.5f);
        this.bodyModel[6].setRotationPoint(-172.0f, -21.5f, 6.0f);
        this.bodyModel[7].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 1.5f, 0.6f, 0.0f, -0.35f, -6.85f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 2.5f, 0.0f, -0.5f, -6.8f);
        this.bodyModel[7].setRotationPoint(-207.0f, -22.0f, 0.0f);
        this.bodyModel[8].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.5f, 0.0f, -0.5f, -6.8f, 0.0f, -0.3f, 0.0f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, 1.75f, 0.0f, -0.35f, -6.85f);
        this.bodyModel[8].setRotationPoint(-207.0f, -22.0f, 0.0f);
        this.bodyModel[9].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 2.0f, 3.5f, 0.0f, 1.5f, 0.6f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 6.0f, 0.0f, -1.0f, 2.5f);
        this.bodyModel[9].setRotationPoint(-189.0f, -22.0f, 0.0f);
        this.bodyModel[10].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 6.0f, 0.0f, -1.0f, 2.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 4.5f, 0.0f, 1.0f, 1.8f);
        this.bodyModel[10].setRotationPoint(-189.0f, -23.0f, 0.0f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 43, 8, 13, 0.0f, 0.0f, -0.5f, -7.5f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, -3.0f, 0.0f, -0.5f, 0.0f, 0.0f, -2.0f, -10.5f, 0.0f, -1.0f, -6.0f, 0.0f, 0.5f, -3.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[11].setRotationPoint(-172.0f, -21.5f, -19.0f);
        this.bodyModel[12].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -0.5f, -6.8f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.35f, -6.85f, 0.0f, 0.0f, -0.25f, 0.0f, 0.0f, -0.25f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[12].setRotationPoint(-207.0f, -22.0f, -7.0f);
        this.bodyModel[13].addShapeBox(-1.0f, 0.0f, 0.0f, 43, 1, 7, 0.0f, 0.0f, -1.0f, -6.0f, 0.0f, -0.5f, -9.0f, 0.0f, -0.5f, 12.5f, 0.0f, -1.0f, 6.0f, 0.0f, 1.0f, -6.0f, 0.0f, 1.0f, -9.0f, 0.0f, 1.0f, 10.5f, 0.0f, 1.0f, 4.5f);
        this.bodyModel[13].setRotationPoint(-171.0f, -23.0f, 0.0f);
        this.bodyModel[14].addShapeBox(-1.0f, 0.0f, 0.0f, 43, 1, 7, 0.0f, 0.0f, 2.0f, -6.0f, 0.0f, 2.5f, -9.0f, 0.0f, 2.5f, 10.5f, 0.0f, 2.0f, 3.5f, 0.0f, -1.0f, -6.0f, 0.0f, -1.5f, -9.0f, 0.0f, -1.5f, 12.5f, 0.0f, -1.0f, 6.0f);
        this.bodyModel[14].setRotationPoint(-171.0f, -22.0f, 0.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 43, 7, 17, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, -9.0f, 0.0f, 4.0f, -5.5f, 0.0f, 0.0f, -12.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, -9.0f, 0.0f, -0.5f, 0.5f, 0.0f, 0.0f, -6.5f);
        this.bodyModel[15].setRotationPoint(-172.0f, -31.0f, 0.0f);
        this.bodyModel[16].addShapeBox(-1.0f, 0.0f, 0.0f, 43, 1, 7, 0.0f, 0.0f, -1.0f, 6.0f, 0.0f, -0.5f, 12.5f, 0.0f, -0.5f, -9.0f, 0.0f, -1.0f, -6.0f, 0.0f, 1.0f, 4.5f, 0.0f, 1.0f, 10.5f, 0.0f, 1.0f, -9.0f, 0.0f, 1.0f, -6.0f);
        this.bodyModel[16].setRotationPoint(-171.0f, -23.0f, -7.0f);
        this.bodyModel[17].addShapeBox(-1.0f, 0.0f, 0.0f, 43, 1, 7, 0.0f, 0.0f, 2.0f, 3.5f, 0.0f, 2.5f, 10.5f, 0.0f, 2.5f, -9.0f, 0.0f, 2.0f, -6.0f, 0.0f, -1.0f, 6.0f, 0.0f, -1.5f, 12.5f, 0.0f, -1.5f, -9.0f, 0.0f, -1.0f, -6.0f);
        this.bodyModel[17].setRotationPoint(-171.0f, -22.0f, -7.0f);
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 19, 8, 5, 0.0f, 0.0f, -6.5f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.767f, 0.0f, 4.0f, -2.1395f, 3.4767f, -1.0f, -0.093f, 0.155116f);
        this.bodyModel[18].setRotationPoint(-172.0f, -39.0f, 0.0f);
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 43, 7, 17, 0.0f, 0.0f, 0.0f, -12.0f, 0.0f, 4.0f, -5.5f, 0.0f, 4.0f, -9.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.5f, 0.0f, -0.5f, 0.5f, 0.0f, -0.5f, -9.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-172.0f, -31.0f, -17.0f);
        this.bodyModel[20].addShapeBox(0.0f, 0.0f, 0.0f, 19, 8, 5, 0.0f, 0.0f, -8.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.5f, 0.0f, -1.0f, -0.093f, 0.155116f, 4.0f, -2.1395f, 3.4767f, 0.0f, -1.767f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[20].setRotationPoint(-172.0f, -39.0f, -5.0f);
        this.bodyModel[21].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 2.0f, -4.0f, 0.0f, 0.0f, 0.0f, -1.767f, 0.0f, 0.0f, -2.6976f, -6.069f, 0.0f, -2.6976f, 4.3837f, -4.0f, -2.1395f, 3.4767f);
        this.bodyModel[21].setRotationPoint(-153.0f, -39.0f, 0.0f);
        this.bodyModel[22].addShapeBox(0.0f, 0.0f, 0.0f, 10, 8, 5, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, -6.0f, 0.0f, 0.0f, 0.0f, -4.0f, -2.1395f, 3.4767f, 0.0f, -2.6976f, 4.3837f, 0.0f, -2.6976f, -6.069f, 0.0f, -1.767f, 0.0f);
        this.bodyModel[22].setRotationPoint(-153.0f, -39.0f, -5.0f);
        this.bodyModel[23].addShapeBox(0.0f, 0.0f, 0.0f, 14, 8, 5, 0.0f, 0.0f, 0.0f, -6.0f, 0.0f, -1.0f, -9.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 2.0f, 0.0f, -2.6976f, -6.069f, 0.0f, -4.0f, -9.0f, 0.0f, -4.0f, 6.5f, 0.0f, -2.6976f, 4.3837f);
        this.bodyModel[23].setRotationPoint(-143.0f, -39.0f, 0.0f);
        this.bodyModel[24].addShapeBox(0.0f, 0.0f, 0.0f, 14, 8, 5, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, -1.0f, 5.0f, 0.0f, -1.0f, -9.0f, 0.0f, 0.0f, -6.0f, 0.0f, -2.6976f, 4.3837f, 0.0f, -4.0f, 6.5f, 0.0f, -4.0f, -9.0f, 0.0f, -2.6976f, -6.069f);
        this.bodyModel[24].setRotationPoint(-143.0f, -39.0f, -5.0f);
        this.bodyModel[25].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 6, 7, 0.0f, 0.0f, 0.0f, -6.8f, 0.0f, -0.5f, 1.8f, 0.0f, 0.5f, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, -5.85f, -6.85f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.8f, 0.0f);
        this.bodyModel[25].setRotationPoint(-207.0f, -21.5f, -7.0f);
        this.bodyModel[26].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 6, 7, 0.0f, 0.0f, -5.85f, -6.85f, 0.0f, -1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -5.8f, 0.0f, 0.0f, 0.0f, -6.8f, 0.0f, -2.0f, 0.6f, 0.0f, -0.5f, 0.0f, 0.1f, 0.0f, 0.0f);
        this.bodyModel[26].setRotationPoint(-207.0f, -27.5f, -7.0f);
        this.bodyModel[27].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 13, 0.0f, 0.0f, -0.5f, -4.2f, 0.0f, -0.5f, -1.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -4.0f, -6.0f, 0.0f, -2.0f, -4.5f, 0.0f, -0.5f, -6.0f, 0.0f, -2.0f, 0.0f);
        this.bodyModel[27].setRotationPoint(-190.0f, -21.5f, -13.0f);
        this.bodyModel[28].addShapeBox(0.0f, 0.0f, 0.0f, 18, 8, 13, 0.0f, 0.0f, -3.0f, -8.0f, 0.0f, 1.5f, -8.0f, 0.0f, 3.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, -5.4f, 0.0f, -2.5f, -2.5f, 0.0f, -2.5f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[28].setRotationPoint(-190.0f, -29.5f, -13.0f);
        this.bodyModel[29].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -0.35f, -6.85f, 0.0f, 1.5f, 0.6f, 0.0f, 0.5f, 0.0f, 0.0f, -0.3f, 0.0f, 0.0f, -0.5f, -6.8f, 0.0f, -1.0f, 2.5f, 0.0f, -1.0f, 0.0f, 0.0f, -0.5f, 0.0f);
        this.bodyModel[29].setRotationPoint(-207.0f, -22.0f, -7.0f);
        this.bodyModel[30].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -0.5f, -6.8f, 0.0f, 0.0f, 2.5f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.35f, -6.85f, 0.0f, 0.0f, 1.75f, 0.0f, 0.0f, -0.25f, 0.0f, -0.3f, 0.0f);
        this.bodyModel[30].setRotationPoint(-207.0f, -22.0f, -7.0f);
        this.bodyModel[31].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, 1.5f, 0.6f, 0.0f, 2.0f, 3.5f, 0.0f, 2.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, -1.0f, 2.5f, 0.0f, -1.0f, 6.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f);
        this.bodyModel[31].setRotationPoint(-189.0f, -22.0f, -7.0f);
        this.bodyModel[32].addShapeBox(-1.0f, 0.0f, 0.0f, 18, 1, 7, 0.0f, 0.0f, -1.0f, 2.5f, 0.0f, -1.0f, 6.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.8f, 0.0f, 1.0f, 4.5f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.bodyModel[32].setRotationPoint(-189.0f, -23.0f, -7.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
